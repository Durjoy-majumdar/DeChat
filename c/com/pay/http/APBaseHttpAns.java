package com.pay.http;

import android.os.Message;
import java.util.HashMap;

public class APBaseHttpAns implements IAPHttpAns {
    private final int REQUESTMAX = 1;
    public String errorMsg = "";
    /* access modifiers changed from: private */
    public APBaseHttpReq httpClient;
    private APHttpHandle httpHandler;
    public String httpReqKey;
    private HashMap<String, APBaseHttpReq> httpReqMap;
    private IAPHttpAnsObserver observer;
    private int requestAgainCount = 0;
    public int resultCode = -1;
    public String resultMsg = "";

    public APBaseHttpAns(APHttpHandle aPHttpHandle, IAPHttpAnsObserver iAPHttpAnsObserver, HashMap<String, APBaseHttpReq> hashMap, String str) {
        this.httpHandler = aPHttpHandle;
        this.httpReqMap = hashMap;
        this.httpReqKey = str;
        this.observer = iAPHttpAnsObserver;
        aPHttpHandle.register(str, iAPHttpAnsObserver);
    }

    private void register(APBaseHttpReq aPBaseHttpReq) {
        this.httpReqMap.put(this.httpReqKey, aPBaseHttpReq);
    }

    private void sendErrorMessage() {
        Message message = new Message();
        message.what = 4;
        message.obj = this;
        this.httpHandler.sendMessage(message);
    }

    private void sendFinishMessage(byte[] bArr) {
        Message message = new Message();
        message.what = 3;
        message.obj = this;
        this.httpHandler.sendMessage(message);
    }

    private void sendStopMessage() {
        Message message = new Message();
        message.what = 5;
        message.obj = this;
        this.httpHandler.sendMessage(message);
    }

    private void unRegister() {
        this.httpReqMap.remove(this.httpReqKey);
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public String getHttpReqKey() {
        return this.httpReqKey;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultMessage() {
        return this.resultMsg;
    }

    public void onError(APBaseHttpReq aPBaseHttpReq, int i, String str) {
        this.errorMsg = str;
        this.resultMsg = str;
        this.resultCode = i;
        unRegister();
        onErrorAns(aPBaseHttpReq);
        sendErrorMessage();
    }

    public void onErrorAns(APBaseHttpReq aPBaseHttpReq) {
    }

    public void onFinish(APBaseHttpReq aPBaseHttpReq) {
        unRegister();
        if (aPBaseHttpReq.getContent() == null) {
            this.resultCode = -1;
            this.resultMsg = "";
            sendErrorMessage();
            return;
        }
        this.httpClient = aPBaseHttpReq;
        onFinishAns(aPBaseHttpReq.getContent(), aPBaseHttpReq);
        sendFinishMessage(aPBaseHttpReq.getContent());
    }

    public void onFinishAns(byte[] bArr, APBaseHttpReq aPBaseHttpReq) {
    }

    public void onReceive(byte[] bArr, int i, long j, APBaseHttpReq aPBaseHttpReq) {
        onReceiveAns(bArr, i, j, aPBaseHttpReq);
    }

    public void onReceiveAns(byte[] bArr, int i, long j, APBaseHttpReq aPBaseHttpReq) {
    }

    public void onStart(APBaseHttpReq aPBaseHttpReq) {
        register(aPBaseHttpReq);
        onStartAns(aPBaseHttpReq);
    }

    public void onStartAns(APBaseHttpReq aPBaseHttpReq) {
    }

    public void onStop(APBaseHttpReq aPBaseHttpReq) {
        unRegister();
        onStopAns(aPBaseHttpReq);
        sendStopMessage();
    }

    public void onStopAns(APBaseHttpReq aPBaseHttpReq) {
    }

    public void reRegister() {
        this.httpHandler.register(this.httpReqKey, this.observer);
    }

    public void requestAgain() {
        int i;
        if (this.httpClient == null || (i = this.requestAgainCount) > 1) {
            reRegister();
            onError(this.httpClient, -1, "");
            return;
        }
        this.requestAgainCount = i + 1;
        reRegister();
        new Thread(new Runnable() {
            public void run() {
                APBaseHttpAns.this.httpClient.requestAgain();
            }
        }).start();
    }
}
