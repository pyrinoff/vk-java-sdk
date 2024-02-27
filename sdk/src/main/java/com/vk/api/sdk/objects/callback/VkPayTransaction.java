package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Objects;

public class VkPayTransaction implements Validable {

    @SerializedName("from_id")
    private Integer fromId;

    @SerializedName("amount")
    @Required
    private Integer amount;

    @SerializedName("description")
    private String description;

    @SerializedName("date")
    @Required
    private Integer date;

    @Override
    public String toString() {
        return "VkPayTransaction{" +
                "fromId=" + fromId +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    public Integer getFromId() {
        return fromId;
    }

    public VkPayTransaction setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public VkPayTransaction setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VkPayTransaction setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public VkPayTransaction setDate(Integer date) {
        this.date = date;
        return this;
    }

}
