/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zzw.distribution.lock.core.source;

import io.etcd.jetcd.Client;

/**
 * etcd source
 *
 * @author zhaozhiwei
 * @since 2020/5/3
 */
public class EtcdSource {

    /**
     * 池化管理器
     */
    private final Client client;

    public EtcdSource() {
        super();
        this.client = Client.builder().endpoints("http://127.0.0.1:2379").build();
    }

    public EtcdSource(String... urls) {
        super();
        this.client = Client.builder().endpoints(urls).build();
    }

    public Client getClient() {
        return client;
    }
}
