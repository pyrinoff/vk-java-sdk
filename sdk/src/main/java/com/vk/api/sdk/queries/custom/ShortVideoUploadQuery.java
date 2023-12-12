package com.vk.api.sdk.queries.custom;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.custom.ShortVideoUploadResponse;
import com.vk.api.sdk.objects.responses.VideoUploadResponse;
import com.vk.api.sdk.queries.upload.UploadQueryBuilder;

import java.io.File;
import java.util.logging.LogManager;


public class ShortVideoUploadQuery extends UploadQueryBuilder<ShortVideoUploadQuery, ShortVideoUploadResponse> {

    public ShortVideoUploadQuery(VkApiClient client, String uploadUrl, File file) {
        super(client, uploadUrl, "video_file", ShortVideoUploadResponse.class);
        file(file);
    }

    @Override
    protected ShortVideoUploadQuery getThis() {
        return this;
    }

    @Override
    public ShortVideoUploadResponse execute() throws ApiException, ClientException {
        //String executeAsString =
        executeAsString();
        //if(!executeAsString.equals("<retval>1</retval>")) throw new ApiException("shortVideo.create return not 1!");
        return new ShortVideoUploadResponse();

    }
}
