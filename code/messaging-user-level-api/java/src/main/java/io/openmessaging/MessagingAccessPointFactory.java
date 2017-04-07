/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging;

import io.openmessaging.internal.DefaultKeyValue;

/**
 * A factory that provides some static methods to create a {@code MessagingAccessPoint}
 * from the specified OMS driver url.
 *
 * @author vintagewang@apache.org
 *
 * @version OMS 1.0
 * @since OMS 1.0
 */
public class MessagingAccessPointFactory {
    public static MessagingAccessPoint getMessagingAccessPoint(String url) {
        return getMessagingAccessPoint(url, null);
    }

    public static MessagingAccessPoint getMessagingAccessPoint(String url, KeyValue properties) {
        return null;
    }

    public static KeyValue newKeyValue() {
        return new DefaultKeyValue();
    }
}