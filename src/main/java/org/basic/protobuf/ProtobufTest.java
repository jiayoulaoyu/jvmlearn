package org.basic.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @author: yqg
 * @date: 2022.03.14
 */
public class ProtobufTest {
    public static void main(String[] args) throws IOException {
        Search.SearchRequest.Builder builder = Search.SearchRequest.newBuilder();
        builder.setPageNumber(1);
        builder.setQuery("setQuery");
        builder.setResultPerPage(2);
        Search.SearchRequest build = builder.build();
        String path = "E://data//" + System.currentTimeMillis();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        build.writeTo(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();

        Search.SearchRequest searchRequest = Search.SearchRequest.parseFrom(new FileInputStream(path));
        System.err.println(searchRequest);
    }
}
