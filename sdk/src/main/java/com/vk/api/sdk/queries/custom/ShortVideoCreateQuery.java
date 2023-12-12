package com.vk.api.sdk.queries.custom;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.custom.ShortVideoCreateResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for shortVideo.save method
 */
public class ShortVideoCreateQuery extends AbstractQueryBuilder<ShortVideoCreateQuery, ShortVideoCreateResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public ShortVideoCreateQuery(VkApiClient client, UserActor actor) {
        super(client, "shortVideo.create", ShortVideoCreateResponse.class);
        accessToken(actor.getAccessToken());

    }

    /**
     * Name of the video.
     *
     * @param value value of "file_size" parameter (KB).
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public ShortVideoCreateQuery fileSize(Integer value) {
        return unsafeParam("file_size", value);
    }

    public ShortVideoCreateQuery wallpost(boolean wallpost) {
        return unsafeParam("wallpost", wallpost);
    }

    @Override
    protected ShortVideoCreateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
