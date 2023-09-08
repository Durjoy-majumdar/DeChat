package com.tencent.p014mm.plugin.appbrand.jsapi.websocket;

import com.tencent.mars.cdn.AndroidCertVerifyResult;
import com.tencent.mars.cdn.X509Util;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83094a;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83098c;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83103f;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.WcWss;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import hr0.C87583a;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import p224ra.C89909e;
import sl0.C90220f;
import ys0.C91578a;
import ys0.C91582e;
import ys0.C91584g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.b */
public class C83097b implements WcWss.C83093a {

    /* renamed from: a */
    public final /* synthetic */ C83098c f242888a;

    public C83097b(C83098c cVar) {
        this.f242888a = cVar;
    }

    /* renamed from: a */
    public void mo115334a(String str, int i, boolean z, String[] strArr, String[] strArr2, int i2, String str2, String[] strArr3, String[] strArr4) {
        Log.m105925i("MicroMsg.AppBrandWcWssSocket", "onOpen group:%s,isSuc:%s, msg:%s, code:%s, wssId:%s", str, Boolean.valueOf(z), str2, Integer.valueOf(i2), Integer.valueOf(i));
        if (z) {
            C83098c cVar = this.f242888a;
            cVar.f242902t = C83098c.C83099a.OPEN;
            C91582e e = C83098c.m101919e(cVar, 2, strArr, strArr2);
            this.f242888a.getClass();
            HashMap hashMap = new HashMap();
            if (strArr3 == null || strArr4 == null) {
                Log.m105928w("MicroMsg.AppBrandWcWssSocket", "buildProfileMap profileKey args is null");
            } else if (strArr3.length == strArr4.length) {
                for (int i3 = 0; i3 < strArr3.length; i3++) {
                    hashMap.put(strArr3[i3], strArr4[i3]);
                }
            } else {
                Log.m105929w("MicroMsg.AppBrandWcWssSocket", "buildProfileMap profileKey != profileValue profileKey.length:%d,profileValue.length:%d", Integer.valueOf(strArr3.length), Integer.valueOf(strArr4.length));
            }
            C83094a.C83095a aVar = (C83094a.C83095a) this.f242888a.f242900r;
            Log.m105925i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketOpen taskId=%s", aVar.f242879a);
            C83094a.this.mo115347i(aVar.f242880b);
            ((C90220f.C90221a) aVar.f242881c).mo124459f((C91584g) e, hashMap);
            return;
        }
        C83103f.C83104a aVar2 = this.f242888a.f242900r;
        ((C83094a.C83095a) aVar2).mo115349a("onOpen fail code:" + i2 + ", msg:" + str2);
    }

    /* renamed from: b */
    public void mo115335b(String str, int i, int i2, String str2) {
        Log.m105925i("MicroMsg.AppBrandWcWssSocket", "onClose group:%s,id:%s, reason:%s, code:%s", str, Integer.valueOf(i), str2, Integer.valueOf(i2));
        C83098c cVar = this.f242888a;
        cVar.f242902t = C83098c.C83099a.CLOSED;
        C83094a.C83095a aVar = (C83094a.C83095a) cVar.f242900r;
        Log.m105925i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketClose url is %s ,state: closed ,reason: %s, errCode = %d,taskId=%s", aVar.f242882d, str2, Integer.valueOf(i2), aVar.f242879a);
        C83094a.this.mo115347i(aVar.f242880b);
        C83094a.this.mo115346h(aVar.f242880b);
        if (i2 == -1) {
            if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                ((C90220f.C90221a) aVar.f242881c).mo124456c("network is down");
            } else {
                ((C90220f.C90221a) aVar.f242881c).mo124456c(Util.isNullOrNil(str2) ? "abnormal closure" : str2);
            }
            ((C90220f.C90221a) aVar.f242881c).mo124454a(1006, str2);
            return;
        }
        ((C90220f.C90221a) aVar.f242881c).mo124454a(i2, str2);
    }

    /* renamed from: c */
    public void mo115336c(String str, int i, byte[] bArr, boolean z) {
        Log.m105919d("MicroMsg.AppBrandWcWssSocket", "onMessage group:%s,wssId:%s,isText:%s", str, Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            try {
                String str2 = new String(bArr, "utf-8");
                C83094a.C83095a aVar = (C83094a.C83095a) this.f242888a.f242900r;
                Log.m105919d("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketMessage url is %s ,socket onmessage length :%d,taskId=%s", aVar.f242882d, Integer.valueOf(str2.length()), aVar.f242879a);
                ((C90220f.C90221a) aVar.f242881c).mo124457d(str2);
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", e, "onmessage unsupport encoding UnsupportedEncodingException", new Object[0]);
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            C83094a.C83095a aVar2 = (C83094a.C83095a) this.f242888a.f242900r;
            Object[] objArr = new Object[3];
            objArr[0] = aVar2.f242882d;
            objArr[1] = Integer.valueOf(wrap != null ? wrap.capacity() : -1);
            objArr[2] = aVar2.f242879a;
            Log.m105919d("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketMessage url is %s , socket onMessage buffer length : %d,taskId=%s", objArr);
            ((C90220f.C90221a) aVar2.f242881c).mo124458e(wrap);
        }
    }

    /* renamed from: d */
    public void mo115337d(String str, int i, String[] strArr, String[] strArr2) {
        Log.m105925i("MicroMsg.AppBrandWcWssSocket", "onHandShake group:%s, wssId:%s", str, Integer.valueOf(i));
        C91582e e = C83098c.m101919e(this.f242888a, 1, strArr, strArr2);
        C83094a.C83095a aVar = (C83094a.C83095a) this.f242888a.f242900r;
        aVar.getClass();
        Log.m105924i("MicroMsg.AppBrandNetworkWcWssSocket", "onWebsocketHandshakeSentAsClient");
        ((C90220f.C90221a) aVar.f242881c).mo124460g((C91578a) e);
    }

    /* renamed from: e */
    public int mo115338e(String str, byte[][] bArr) {
        String str2 = str;
        byte[][] bArr2 = bArr;
        Class cls = C87583a.class;
        Log.m105924i("MicroMsg.AppBrandWcWssSocket", "certifivate verify for " + str2);
        try {
            AndroidCertVerifyResult verifyServerCertificates = X509Util.verifyServerCertificates(bArr2, "RSA", str2, 1, this.f242888a.f242903u);
            Log.m105925i("MicroMsg.AppBrandWcWssSocket", "host %s rsa verify result %d, isknownroots %b, ishostmatched %b", str2, Integer.valueOf(verifyServerCertificates.getStatus()), Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
            if (verifyServerCertificates.getStatus() != 0) {
                verifyServerCertificates = X509Util.verifyServerCertificates(bArr2, "ECDSA", str2, 1, this.f242888a.f242903u);
                Log.m105925i("MicroMsg.AppBrandWcWssSocket", "host %s ecdsa verify result %d, isknownroots %b, ishostmatched %b", str2, Integer.valueOf(verifyServerCertificates.getStatus()), Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
            }
            if (verifyServerCertificates.getStatus() != 0) {
                ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 7, 1, false);
            }
            if (verifyServerCertificates.getStatus() == 0 && !verifyServerCertificates.isIssuedByHostMatched()) {
                ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 8, 1, false);
            }
            if (verifyServerCertificates.getStatus() == 0 && !verifyServerCertificates.isIssuedByKnownRoot()) {
                ((C87583a) C89909e.m112439d(cls, true)).idkeyStat(972, 9, 1, false);
            }
            return (verifyServerCertificates.getStatus() != 0 || !verifyServerCertificates.isIssuedByKnownRoot()) ? -1 : 0;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", e, "doCertificateVerify Exception", new Object[0]);
            return -1;
        }
    }
}
