package com.example.journaldev.tb2arsy.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}