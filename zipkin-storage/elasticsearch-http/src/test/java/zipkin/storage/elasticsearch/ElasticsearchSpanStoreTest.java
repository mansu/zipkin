/**
 * Copyright 2015-2016 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package zipkin.storage.elasticsearch;

import java.io.IOException;
import zipkin.storage.SpanStoreTest;
import zipkin.storage.StorageComponent;
import zipkin.storage.elasticsearch.http.HttpElasticsearchTestGraph;

public class ElasticsearchSpanStoreTest extends SpanStoreTest {

  private final ElasticsearchStorage storage;

  public ElasticsearchSpanStoreTest() {
    this.storage = HttpElasticsearchTestGraph.INSTANCE.storage.get();
  }

  @Override protected StorageComponent storage() {
    return storage;
  }

  @Override public void clear() throws IOException {
    storage.clear();
  }
}
