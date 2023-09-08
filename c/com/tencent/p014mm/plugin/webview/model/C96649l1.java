package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C7628p0;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ob0.C11385n;
import ob0.C117747y;
import p1081gi.C98124g;
import p261wl.C38166b;
import p492dn.C75415t;
import p663qo.C101213l;
import te3.C49891is2;
import te3.C50174ks2;
import te3.C50725os2;

/* renamed from: com.tencent.mm.plugin.webview.model.l1 */
public final class C96649l1 implements C11385n {

    /* renamed from: d */
    public CopyOnWriteArraySet<C96651n> f283039d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    public CopyOnWriteArraySet<C96650m> f283040e = new CopyOnWriteArraySet<>();

    /* renamed from: f */
    public C98124g.C98125a f283041f = new l1$$b(this);

    /* renamed from: a */
    public boolean mo134801a(String str, String str2, C96651n nVar) {
        C6048m1 Ax0 = C6080m.Ax0();
        Ax0.getClass();
        WebViewJSSDKFileItem webViewJSSDKFileItem = null;
        if (!Util.isNullOrNil(str2)) {
            Iterator<WebViewJSSDKFileItem> it = Ax0.f22343a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WebViewJSSDKFileItem next = it.next();
                if (Util.nullAsNil(next.f283025h).equals(str2)) {
                    webViewJSSDKFileItem = next;
                    break;
                }
            }
        } else {
            Log.m105920e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByServerId error, media id is null or nil");
        }
        if (webViewJSSDKFileItem != null) {
            webViewJSSDKFileItem.f283021d = str;
            Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "the file item has alreay in local : appid : %s, serverId : %s, localId : %s", str, str2, webViewJSSDKFileItem.f283022e);
            nVar.mo6964a(true, 0, webViewJSSDKFileItem.f283022e, webViewJSSDKFileItem.f283025h, (String) null, (String) null);
            return true;
        }
        C86709a0.m107524d().mo123455a(1035, this);
        C86709a0.m107524d().mo123460f(new C43730w(str, str2));
        if (nVar != null) {
            this.f283039d.add(nVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo134802b(C96650m mVar) {
        CopyOnWriteArraySet<C96650m> copyOnWriteArraySet = this.f283040e;
        if (copyOnWriteArraySet != null && mVar != null && !copyOnWriteArraySet.contains(mVar)) {
            this.f283040e.add(mVar);
        }
    }

    /* renamed from: c */
    public boolean mo134803c(String str, String str2, int i, int i2, int i3, C96651n nVar) {
        WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(str2);
        if (b == null) {
            Log.m105921e("MicroMsg.WebviewFileChooserCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", str2);
            return false;
        }
        b.f283021d = str;
        if (nVar != null) {
            this.f283039d.add(nVar);
        }
        if (i2 == 202 || i2 == 214 || i2 == 215) {
            b.f283035u = false;
        }
        b.f283033s = true;
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_WebViewJSSDKCdnService_2";
        gVar.f287662f = this.f283041f;
        gVar.f287661e = true;
        gVar.field_mediaId = b.f283026i;
        gVar.field_fullpath = b.f283024g;
        gVar.field_fileType = i;
        gVar.field_talker = "weixin";
        gVar.field_priority = 2;
        if (i == 10011 || i2 == 214) {
            gVar.field_needStorage = true;
        } else {
            gVar.field_needStorage = false;
        }
        gVar.field_isStreamMedia = false;
        gVar.field_appType = i2;
        gVar.field_bzScene = i3;
        gVar.field_force_aeskeycdn = true;
        gVar.field_trysafecdn = false;
        gVar.field_thumbpath = b.f283023f;
        boolean if02 = ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", Boolean.valueOf(if02), Boolean.valueOf(gVar.field_force_aeskeycdn), Boolean.valueOf(gVar.field_trysafecdn), str2);
        return if02;
    }

    /* renamed from: d */
    public boolean mo134804d(String str) {
        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "cancelDownloadTask get webview file chooser item  by local id : %s", str);
        return ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(str);
    }

    /* renamed from: e */
    public boolean mo134805e(String str) {
        WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(str);
        if (b != null) {
            return ((C101213l) C86312j.m106911c(C101213l.class)).gn0(b.f283026i);
        }
        Log.m105921e("MicroMsg.WebviewFileChooserCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", str);
        return false;
    }

    /* renamed from: f */
    public final synchronized void mo134806f(boolean z, int i, int i2, String str, String str2) {
        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str, str2);
        CopyOnWriteArraySet<C96650m> copyOnWriteArraySet = this.f283040e;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.size() > 0) {
            Iterator<C96650m> it = this.f283040e.iterator();
            while (it.hasNext()) {
                it.next().mo68082R(z, i, i2, str, str2);
            }
        }
        C38166b.m41755b(C6050o.class, new l1$$a(z, i, i2, str, str2));
    }

    /* renamed from: g */
    public final synchronized void mo134807g(boolean z, int i, String str, String str2, String str3, String str4) {
        Log.m105919d("MicroMsg.WebviewFileChooserCdnService", "notifyRequstCallback, localId : %s", str);
        CopyOnWriteArraySet<C96651n> copyOnWriteArraySet = this.f283039d;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.size() > 0) {
            Iterator<C96651n> it = this.f283039d.iterator();
            while (it.hasNext()) {
                it.next().mo6964a(z, i, str, str2, str3, str4);
            }
        }
    }

    /* renamed from: h */
    public void mo134808h(C96651n nVar) {
        CopyOnWriteArraySet<C96651n> copyOnWriteArraySet = this.f283039d;
        if (copyOnWriteArraySet != null && nVar != null) {
            copyOnWriteArraySet.remove(nVar);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        WebViewJSSDKFileItem webViewJSSDKFileItem;
        boolean z = false;
        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "onSceneEnd, errType = %d, errCode = %d, funcType = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.getType()));
        int type = yVar.getType();
        if (type == 1034) {
            C86709a0.m107524d().mo123470p(1034, this);
            C43722n0 n0Var = (C43722n0) yVar;
            String str2 = ((C50725os2) n0Var.f118172d.f127056b.f127083a).f139353d;
            String str3 = n0Var.f118174f;
            String str4 = n0Var.f118175g;
            WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(str4);
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = str3;
            objArr[2] = str4;
            if (b == null) {
                z = true;
            }
            objArr[3] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "get server server id : %s from server for appid : %s, localId = %s, item == null ? %b", objArr);
            if (i != 0 || i2 != 0) {
                Log.m105920e("MicroMsg.WebviewFileChooserCdnService", "upload cdn info failed");
                if (b != null) {
                    mo134807g(false, 0, b.f283022e, b.f283026i, (String) null, (String) null);
                }
            } else if (!Util.isNullOrNil(str3) && !Util.isNullOrNil(str2) && b != null) {
                b.f283025h = str2;
                mo134806f(true, b.f283028n, 100, b.f283022e, str2);
                mo134807g(true, 0, b.f283022e, b.f283025h, b.f283032r.field_fileUrl, (String) null);
            }
        } else if (type == 1035) {
            C86709a0.m107524d().mo123470p(1035, this);
            C43730w wVar = (C43730w) yVar;
            String str5 = wVar.f118191g;
            if (i == 0 && i2 == 0) {
                String str6 = wVar.f118190f;
                C49891is2 is22 = ((C50174ks2) wVar.f118188d.f127056b.f127083a).f137025d;
                Object[] objArr2 = new Object[3];
                objArr2[0] = str6;
                objArr2[1] = str5;
                objArr2[2] = Boolean.valueOf(is22 == null);
                Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "appid = %s, serverId = %s, cdninfo == null ? %b", objArr2);
                if (!Util.isNullOrNil(str6) && !Util.isNullOrNil(str5) && is22 != null) {
                    String str7 = is22.f135640f;
                    Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "cdn info type = %s", str7);
                    if (!Util.isNullOrNil(str7)) {
                        if (str7.toLowerCase().equals("voice")) {
                            HashMap<String, List<String>> hashMap = C43702g2.f118107a;
                            webViewJSSDKFileItem = new WebViewJSSDKVoiceItem();
                            webViewJSSDKFileItem.f283027j = "_USER_FOR_WEBVIEW_JSAPI" + C7628p0.m7761a(str6, Util.nowMilliSecond());
                            String mf = ((C75415t) C86312j.m106911c(C75415t.class)).mo91610mf(webViewJSSDKFileItem.f283027j);
                            webViewJSSDKFileItem.f283024g = mf;
                            webViewJSSDKFileItem.f283022e = C6032f2.m5914a(mf);
                            long nowMilliSecond = Util.nowMilliSecond();
                            String str8 = webViewJSSDKFileItem.f283022e;
                            webViewJSSDKFileItem.f283026i = C1297x.m1387b("jsupvoice", nowMilliSecond, str8, str8);
                        } else if (str7.toLowerCase().equals("video")) {
                            webViewJSSDKFileItem = C6049n1.m5932a(C43702g2.m47530c(Util.nowMilliSecond() + ""));
                        } else {
                            webViewJSSDKFileItem = C6049n1.m5933b(C43702g2.m47530c(Util.nowMilliSecond() + ""));
                        }
                        webViewJSSDKFileItem.f283033s = false;
                        webViewJSSDKFileItem.f283021d = str6;
                        webViewJSSDKFileItem.f283025h = str5;
                        if (webViewJSSDKFileItem.f283032r == null) {
                            webViewJSSDKFileItem.f283032r = new WebViewJSSDKFileItem.C96646a();
                        }
                        WebViewJSSDKFileItem.C96646a aVar = webViewJSSDKFileItem.f283032r;
                        aVar.field_aesKey = is22.f135639e;
                        aVar.field_fileId = is22.f135638d;
                        aVar.field_fileLength = is22.f135641g;
                        C6080m.Ax0().mo7009a(webViewJSSDKFileItem);
                        C98124g gVar = new C98124g();
                        gVar.f287660d = "task_WebViewJSSDKCdnService_1";
                        gVar.f287662f = this.f283041f;
                        gVar.f287661e = false;
                        gVar.field_mediaId = webViewJSSDKFileItem.f283026i;
                        gVar.field_fullpath = webViewJSSDKFileItem.f283024g;
                        WebViewJSSDKFileItem.C96646a aVar2 = webViewJSSDKFileItem.f283032r;
                        gVar.field_totalLen = aVar2.field_fileLength;
                        gVar.field_fileType = 5;
                        gVar.field_fileId = aVar2.field_fileId;
                        gVar.field_aesKey = aVar2.field_aesKey;
                        gVar.field_priority = 2;
                        gVar.field_needStorage = false;
                        gVar.field_isStreamMedia = false;
                        boolean xf02 = ((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar);
                        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "add download cdn task : %b, localid : %s", Boolean.valueOf(xf02), webViewJSSDKFileItem.f283025h);
                        if (!xf02) {
                            mo134807g(false, 0, (String) null, (String) null, (String) null, (String) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.WebviewFileChooserCdnService", "download cdn info failed");
            mo134807g(false, 0, (String) null, str5, (String) null, (String) null);
        }
    }
}
