package com.tencent.thumbplayer.api.proxy;

public interface ITPPlayerProxy {
    void pushEvent(int i);

    void setIsActive(boolean z);

    void setProxyServiceType(int i);

    void setTPPlayerProxyListener(ITPPlayerProxyListener iTPPlayerProxyListener);
}
