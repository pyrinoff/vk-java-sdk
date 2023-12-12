package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.custom.ShortVideoCreateQuery;
import com.vk.api.sdk.queries.custom.ShortVideoUploadQuery;

import java.io.File;

/**
 * List of Gifts methods
 */
public class Custom extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Custom(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of user gifts.
     *
     * @param actor vk actor
     * @return query
     */
    public ShortVideoCreateQuery shortVideoCreate(UserActor actor) {
        return new ShortVideoCreateQuery(getClient(), actor);
    }

    public ShortVideoUploadQuery shortVideoUpload(String uploadUrl, File file) {
        return new ShortVideoUploadQuery(getClient(), uploadUrl, file);
    }
}
