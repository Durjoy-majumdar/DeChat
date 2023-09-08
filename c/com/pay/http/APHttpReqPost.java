package com.pay.http;

public abstract class APHttpReqPost extends APBaseHttpReq {
    public APHttpReqPost() {
        this.httpParam.setReqWithHttps();
        this.httpParam.setSendWithPost();
    }

    private void setPostMothod() {
        try {
            this.httpURLConnection.setRequestMethod("POST");
            this.httpURLConnection.setRequestProperty("Charset", "UTF-8");
            this.httpURLConnection.setDoInput(true);
            this.httpURLConnection.setDoOutput(true);
            this.httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.httpParam.urlParams.getBytes().length));
            this.httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        } catch (Exception unused) {
        }
    }

    public void setBody() {
        super.setBody();
    }

    public void setHeader() {
        setPostMothod();
    }
}
