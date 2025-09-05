package com.vk.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.api.sdk.actions.*;
import com.vk.api.sdk.actions.Utils;
import org.apache.commons.lang3.StringUtils;

public class VkApiClient {
    private static final String API_ADDRESS = "https://api.vk.ru/method/";

    private static final String OAUTH_ENDPOINT = "https://oauth.vk.ru/";

    private static final int DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT = 3;

    private String apiVersion = "5.131";

    private TransportClient transportClient;

    private Gson gson;

    private String apiEndpoint;

    private String oauthEndpoint;

    private int retryAttemptsInternalServerErrorCount;

    public VkApiClient(TransportClient transportClient) {
        this(transportClient, new GsonBuilder().disableHtmlEscaping().create(), DEFAULT_RETRY_ATTEMPTS_INTERNAL_SERVER_ERROR_COUNT);
    }

    public VkApiClient(TransportClient transportClient, Gson gson,
            int retryAttemptsInternalServerErrorCount) {
        this.transportClient = transportClient;
        this.gson = gson;
        this.retryAttemptsInternalServerErrorCount = retryAttemptsInternalServerErrorCount;

        if (StringUtils.isNoneEmpty(System.getProperty("api.host"))) {
           apiEndpoint = "https://" + System.getProperty("api.host") + "/method/";
        } else {
           apiEndpoint = API_ADDRESS;
        }

        if (StringUtils.isNoneEmpty(System.getProperty("oauth.host"))) {
           oauthEndpoint = "https://" + System.getProperty("oauth.host") + "/";
        } else {
           oauthEndpoint = OAUTH_ENDPOINT;
        }
    }

    public TransportClient getTransportClient() {
        return transportClient;
    }

    public Gson getGson() {
        return gson;
    }

    public int getRetryAttemptsInternalServerErrorCount() {
        return retryAttemptsInternalServerErrorCount;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public String getOAuthEndpoint() {
        return oauthEndpoint;
    }

    public String getVersion() {
        return apiVersion;
    }

    public void setVersion(String version) {
        this.apiVersion = version;
    }

    public Account account() {
        return new Account(this);
    }

    public Orders orders() {
        return new Orders(this);
    }

    public Wall wall() {
        return new Wall(this);
    }

    public LeadForms leadForms() {
        return new LeadForms(this);
    }

    public Execute execute() {
        return new Execute(this);
    }

    public Friends friends() {
        return new Friends(this);
    }

    public LongPoll longPoll() {
        return new LongPoll(this);
    }

    public Store store() {
        return new Store(this);
    }

    public Upload upload() {
        return new Upload(this);
    }

    public Users users() {
        return new Users(this);
    }

    public Apps apps() {
        return new Apps(this);
    }

    public Videos videos() {
        return new Videos(this);
    }

    public Photos photos() {
        return new Photos(this);
    }

    public Ads ads() {
        return new Ads(this);
    }

    public Board board() {
        return new Board(this);
    }

    public Widgets widgets() {
        return new Widgets(this);
    }

    public GroupsLongPoll groupsLongPoll() {
        return new GroupsLongPoll(this);
    }

    public Groups groups() {
        return new Groups(this);
    }

    public Auth auth() {
        return new Auth(this);
    }

    public Newsfeed newsfeed() {
        return new Newsfeed(this);
    }

    public Search search() {
        return new Search(this);
    }

    public AppWidgets appWidgets() {
        return new AppWidgets(this);
    }

    public Database database() {
        return new Database(this);
    }

    public Stories stories() {
        return new Stories(this);
    }

    public Notes notes() {
        return new Notes(this);
    }

    public Status status() {
        return new Status(this);
    }

    public Streaming streaming() {
        return new Streaming(this);
    }

    public Messages messages() {
        return new Messages(this);
    }

    public Fave fave() {
        return new Fave(this);
    }

    public Market market() {
        return new Market(this);
    }

    public OAuth oAuth() {
        return new OAuth(this);
    }

    public Polls polls() {
        return new Polls(this);
    }

    public Pages pages() {
        return new Pages(this);
    }

    public Storage storage() {
        return new Storage(this);
    }

    public Utils utils() {
        return new Utils(this);
    }

    public Secure secure() {
        return new Secure(this);
    }

    public Stats stats() {
        return new Stats(this);
    }

    public Gifts gifts() {
        return new Gifts(this);
    }

    public Docs docs() {
        return new Docs(this);
    }

    public Likes likes() {
        return new Likes(this);
    }

    public Notifications notifications() {
        return new Notifications(this);
    }


    public Custom custom() {
        return new Custom(this);
    }
}
