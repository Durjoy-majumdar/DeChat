package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import te3.C49891is2;

/* renamed from: com.tencent.mm.plugin.webview.model.l1$$b */
public class l1$$b implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C96649l1 f283042d;

    public l1$$b(C96649l1 l1Var) {
        this.f283042d = l1Var;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        String str2 = str;
        int i2 = i;
        C98120c cVar2 = cVar;
        C98121d dVar2 = dVar;
        Object[] objArr = new Object[4];
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        String str3 = "null";
        objArr[2] = cVar2 == null ? str3 : cVar.toString();
        if (dVar2 != null) {
            str3 = dVar.toString();
        }
        objArr[3] = str3;
        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        C6048m1 Ax0 = C6080m.Ax0();
        Ax0.getClass();
        WebViewJSSDKFileItem webViewJSSDKFileItem = null;
        if (!Util.isNullOrNil(str)) {
            Iterator<WebViewJSSDKFileItem> it = Ax0.f22343a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WebViewJSSDKFileItem next = it.next();
                if (Util.nullAsNil(next.f283026i).equals(str2)) {
                    webViewJSSDKFileItem = next;
                    break;
                }
            }
        } else {
            Log.m105920e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByMediaID error, media id is null or nil");
        }
        if (webViewJSSDKFileItem == null) {
            Log.m105921e("MicroMsg.WebviewFileChooserCdnService", "get item by media id failed, media is : %s", str2);
            return 0;
        } else if (i2 == -21005) {
            Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "duplicate request, ignore this request, media id is %s", str2);
            return 0;
        } else if (i2 != 0) {
            Log.m105921e("MicroMsg.WebviewFileChooserCdnService", "start failed : %d, media id is :%s", Integer.valueOf(i), str2);
            this.f283042d.mo134807g(false, i, webViewJSSDKFileItem.f283022e, webViewJSSDKFileItem.f283026i, (String) null, (String) null);
            return 0;
        } else if (cVar2 != null) {
            Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "progressInfo : %s", cVar.toString());
            long j = cVar2.field_toltalLength;
            long j2 = 100;
            long j3 = j > 0 ? (long) ((int) ((cVar2.field_finishedLength * 100) / j)) : 0;
            if (j3 < 0) {
                j2 = 0;
            } else if (j3 <= 100) {
                j2 = j3;
            }
            Log.m105919d("MicroMsg.WebviewFileChooserCdnService", "progressInfo, percent = %d, finishLen = %d, totalLen = %d", Long.valueOf(j2), Long.valueOf(cVar2.field_finishedLength), Long.valueOf(cVar2.field_toltalLength));
            this.f283042d.mo134806f(webViewJSSDKFileItem.f283033s, webViewJSSDKFileItem.f283028n, (int) j2, webViewJSSDKFileItem.f283022e, webViewJSSDKFileItem.f283026i);
            return 0;
        } else {
            if (dVar2 != null) {
                int i3 = dVar2.field_retCode;
                if (i3 != 0) {
                    Log.m105921e("MicroMsg.WebviewFileChooserCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str2, Integer.valueOf(i3), dVar2);
                    this.f283042d.mo134807g(false, dVar2.field_retCode, webViewJSSDKFileItem.f283022e, webViewJSSDKFileItem.f283026i, (String) null, (String) null);
                } else {
                    Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "cdn trans suceess, media id : %s, item.mediaId : %s, item.localId: %s", str2, webViewJSSDKFileItem.f283026i, webViewJSSDKFileItem.f283022e);
                    webViewJSSDKFileItem.mo134796e(dVar2);
                    if (!webViewJSSDKFileItem.f283033s || !webViewJSSDKFileItem.f283035u) {
                        this.f283042d.mo134807g(true, 0, webViewJSSDKFileItem.f283022e, webViewJSSDKFileItem.f283025h, webViewJSSDKFileItem.f283032r.field_fileUrl, dVar2.field_thumbUrl);
                    } else {
                        C96649l1 l1Var = this.f283042d;
                        l1Var.getClass();
                        C49891is2 is22 = new C49891is2();
                        WebViewJSSDKFileItem.C96646a aVar = webViewJSSDKFileItem.f283032r;
                        is22.f135639e = aVar.field_aesKey;
                        is22.f135641g = aVar.field_fileLength;
                        is22.f135638d = aVar.field_fileId;
                        is22.f135640f = webViewJSSDKFileItem.mo6981c();
                        Log.m105919d("MicroMsg.WebviewFileChooserCdnService", "appId:%s, localId:%s, aes_key:%s， file_size:%d, fileId:%s", webViewJSSDKFileItem.f283021d, webViewJSSDKFileItem.f283022e, is22.f135639e, Integer.valueOf(is22.f135641g), is22.f135638d);
                        is22.f135642h = webViewJSSDKFileItem.mo6980b();
                        C86709a0.m107524d().mo123455a(1034, l1Var);
                        C86709a0.m107524d().mo123460f(new C43722n0(webViewJSSDKFileItem.f283021d, webViewJSSDKFileItem.f283022e, is22));
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "getCdnAuthInfo, mediaId = %s", str);
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        Log.m105925i("MicroMsg.WebviewFileChooserCdnService", "decodePrepareResponse, mediaId = %s", str);
        return null;
    }
}
