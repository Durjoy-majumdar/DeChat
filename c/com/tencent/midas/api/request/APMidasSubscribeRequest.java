package com.tencent.midas.api.request;

public class APMidasSubscribeRequest extends APMidasMonthRequest {
    private static final long serialVersionUID = 6111439524338439638L;
    public int gameLogo = 0;
    public String productId = "";

    public int getGameLogo() {
        return this.gameLogo;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setGameLogo(int i) {
        this.gameLogo = i;
    }

    public void setProductId(String str) {
        this.productId = str;
    }
}
