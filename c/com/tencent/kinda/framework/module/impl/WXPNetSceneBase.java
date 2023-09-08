package com.tencent.kinda.framework.module.impl;

import ae2.C39550b;
import android.os.Handler;
import android.os.Looper;
import com.tencent.kinda.framework.module.impl.WXPCommReqResp;
import com.tencent.kinda.gen.KCgi;
import com.tencent.kinda.gen.KNetworkMockManager;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;

public class WXPNetSceneBase extends C117747y implements C1311n {
    private static final String TAG = "MicroMsg.KindaLibWXPNetSceneBase";
    /* access modifiers changed from: private */
    public KCgi cgi;
    private int cgiId;
    private String cgiUri;
    private C11385n onSceneEndCallback;
    private int respCmdId = 0;
    private WXPCommReqResp wxpCommReqResp;

    public WXPNetSceneBase(int i, int i2, String str, int i3, int i4, int i5, byte[] bArr, KCgi kCgi, KNetworkMockManager kNetworkMockManager) {
        String str2 = str;
        this.cgiId = i2;
        this.cgiUri = str2;
        this.cgi = kCgi;
        this.wxpCommReqResp = new WXPCommReqResp(bArr, str, i2, i, 0, true, i5, i4, kCgi.getRouteInfo(), kNetworkMockManager);
        setIsKinda(true);
        Log.m105925i(TAG, "init scene: cgiId:%d, cgiUri:%s ", Integer.valueOf(i2), str2);
    }

    /* access modifiers changed from: private */
    public void clearField() {
        this.cgi = null;
        if (this.wxpCommReqResp != null) {
            this.wxpCommReqResp = null;
        }
    }

    public void cancel() {
        Log.m105921e(TAG, "cancel: thread when doScene: %s, thread id: %d, cgiUri: %s", Thread.currentThread(), Long.valueOf(Thread.currentThread().getId()), this.cgiUri);
        super.cancel();
        KCgi kCgi = this.cgi;
        if (kCgi != null) {
            kCgi.onResp(1, (byte[]) null, (HashMap<String, String>) null);
            clearField();
        }
    }

    public int dispatch(C114770g gVar, C114799u uVar, C1311n nVar) {
        return super.dispatch(gVar, uVar, nVar);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.onSceneEndCallback = nVar;
        C39550b.m42181a().mo62165pk(this.wxpCommReqResp, true);
        return dispatch(gVar, this.wxpCommReqResp, this);
    }

    public void finalize() {
        super.finalize();
    }

    public int getType() {
        return this.cgiId;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(TAG, "onGYNetEnd: %s, , uri: %s errType %d errCode %d errMsg %s", Integer.valueOf(this.cgiId), this.cgiUri, Integer.valueOf(i2), Integer.valueOf(i3), str);
        final WXPCommReqResp.Resp resp = (WXPCommReqResp.Resp) uVar.getRespObj();
        if (this.cgi != null) {
            final C114799u uVar2 = uVar;
            final int i4 = i3;
            final int i5 = i2;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (WXPNetSceneBase.this.cgi != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("reqHost", uVar2.getReqHost());
                        hashMap.put("encryptAlgo", Integer.toString(uVar2.getEncryptAlgo()));
                        hashMap.put("stn_errCode", Integer.toString(i4));
                        hashMap.put("stn_errType", Integer.toString(i5));
                        int i = i5;
                        if (i == 0) {
                            WXPNetSceneBase.this.cgi.onResp(0, resp.getResponseWrapper().getData(), hashMap);
                        } else if (i == 4 && i4 == -102) {
                            WXPNetSceneBase.this.cgi.onResp(351, (byte[]) null, hashMap);
                        } else {
                            WXPNetSceneBase.this.cgi.onResp(1, (byte[]) null, hashMap);
                        }
                        WXPNetSceneBase.this.clearField();
                    }
                }
            });
            this.onSceneEndCallback.onSceneEnd(i2, i3, str, this);
        }
    }
}
