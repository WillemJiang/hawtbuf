/**
 *  Copyright (C) 20010, Progress Software Corporation and/or its
 * subsidiaries or affiliates.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.hawtbuf.proto;

import org.fusesource.hawtbuf.codec.VariableCodec;

import java.io.*;

/**
 * <p>
 * Implements the Codec interface for PBMessages type which
 * encode/decodes framed messages.
 * </p>
 *
 * @author <a href="http://hiramchirino.com">Hiram Chirino</a>
 */
public class PBMessageFramedCodec<T extends MessageBuffer> extends VariableCodec<T> {

    final private PBMessageFactory<?, ? extends T> factory;

    public PBMessageFramedCodec(PBMessageFactory<?, ? extends T> factory) {
        this.factory = factory;
    }

    public T decode(DataInput dataIn) throws IOException {
        return (T)factory.parseFramed((InputStream) dataIn);
    }

    public void encode(T value, DataOutput dataOut) throws IOException {
        value.writeFramed((OutputStream) dataOut);
    }

    @Override
    public boolean isEstimatedSizeSupported() {
        return true;
    }

    public int estimatedSize(T value) {
        return value.serializedSizeFramed();
    }

    @Override
    public boolean isDeepCopySupported() {
        return true;
    }

    @Override
    public T deepCopy(T value) {
        return (T) value;
    }
}