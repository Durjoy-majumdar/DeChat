package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import hc0.C20937c;
import ic0.C98661k;
import org.json.JSONObject;
import p008bq.C0363p0;
import p008bq.C0364r0;
import p008bq.C0365s0;
import p008bq.C39833l0;
import p008bq.C67305d1;
import p823sg.C90193h;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.f */
public class C5909f extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.f$a */
    public class C5910a implements C98661k {

        /* renamed from: a */
        public final /* synthetic */ String f22138a;

        /* renamed from: b */
        public final /* synthetic */ Context f22139b;

        /* renamed from: c */
        public final /* synthetic */ String f22140c;

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f22141d;

        public C5910a(String str, Context context, String str2, C43620m2.C5947b bVar) {
            this.f22138a = str;
            this.f22139b = context;
            this.f22140c = str2;
            this.f22141d = bVar;
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            Object obj;
            Log.m105925i("MicroMsg.JsApiAddToEmotion", "imageLoaderListener onImageLoadComplete %s", str);
            if (bitmap != null && objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && str.equals(this.f22138a)) {
                C86009m1 m1Var = new C86009m1(objArr[0].toString());
                if (m1Var.mo119967g()) {
                    String q = C86013q1.m106456q(m1Var.mo119976n());
                    C86013q1.m106442c(m1Var.mo119971i(), ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", q));
                    C5909f.this.mo6934f(this.f22139b, q, this.f22140c, this.f22141d);
                    return;
                }
            }
            this.f22141d.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "addToEmoticon";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Context context2 = context;
        C43620m2.C5947b bVar2 = bVar;
        Class cls = C67305d1.class;
        Class cls2 = C0364r0.class;
        Log.m105924i("MicroMsg.JsApiAddToEmotion", "invoke");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            Log.m105920e("MicroMsg.JsApiAddToEmotion", "bundle is null");
            bVar2.mo6945a("null_data", (JSONObject) null);
            return;
        }
        String optString = e.optString("base64DataString");
        String optString2 = e.optString("thumbUrl");
        String optString3 = e.optString("url");
        if (!Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon use base64DataString");
            int indexOf = optString.indexOf(";base64,");
            try {
                byte[] decode = Base64.decode(indexOf != -1 ? optString.substring(indexOf + 8, optString.length()) : "", 0);
                if (Util.isNullOrNil(decode)) {
                    bVar2.mo6945a("fail", (JSONObject) null);
                    return;
                }
                String f = C90193h.m112878f(decode);
                String BX = ((C0364r0) C86312j.m106911c(cls2)).mo405BX(((C67305d1) C86312j.m106911c(cls)).rx0(), "", f);
                if (!C86013q1.m106450k(BX) || !C86013q1.m106456q(BX).equalsIgnoreCase(f)) {
                    C86013q1.m106438T(BX, decode, 0, decode.length);
                }
                mo6934f(context, f, optString2, bVar2);
            } catch (Exception e2) {
                Exception exc = e2;
                Log.m105920e("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon error:" + exc.getMessage());
                bVar2.mo6945a("fail", (JSONObject) null);
            }
        } else if (!Util.isNullOrNil(optString3)) {
            Log.m105925i("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon use url:%s", optString3);
            C86009m1 m1Var = new C86009m1(context.getCacheDir(), C90193h.m112878f(optString3.getBytes()));
            if (m1Var.mo119967g()) {
                String q = C86013q1.m106456q(m1Var.mo119976n());
                String BX2 = ((C0364r0) C86312j.m106911c(cls2)).mo405BX(((C67305d1) C86312j.m106911c(cls)).rx0(), "", q);
                if (!C86013q1.m106450k(BX2)) {
                    C86013q1.m106442c(m1Var.mo119971i(), BX2);
                }
                mo6934f(context, q, optString2, bVar2);
                return;
            }
            C20937c.C20939b bVar3 = new C20937c.C20939b();
            bVar3.f59346b = true;
            bVar3.f59350f = m1Var.mo119971i();
            bVar3.f59368x = new Object[]{m1Var.mo119971i()};
            ((C39833l0) C86312j.m106911c(C39833l0.class)).mo62466Nr().mo32521j(optString3, (ImageView) null, bVar3.mo32666a(), new C5910a(optString3, context, optString2, bVar));
        } else {
            Log.m105920e("MicroMsg.JsApiAddToEmotion", "doAddToEmoticon base64DataString is null and url is null");
            bVar2.mo6945a("base64DataString_and_url_is_null", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }

    /* renamed from: f */
    public final void mo6934f(Context context, String str, String str2, C43620m2.C5947b bVar) {
        Class cls = C0363p0.class;
        String BX = ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", str);
        IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(cls)).mo403r2(str);
        if (r2 == null && C86013q1.m106450k(BX)) {
            int i = ImgUtil.isGif(BX) ? 2 : 1;
            IEmojiInfo zE = ((C0363p0) C86312j.m106911c(cls)).mo404zE();
            zE.setMd5(str);
            zE.mo62656c2(65);
            zE.setType(i);
            zE.mo62682l1((int) C86013q1.m106451l(BX));
            zE.mo62692s0(1);
            zE.mo62636I(str2);
            ((C0363p0) C86312j.m106911c(cls)).lu0(zE);
            r2 = zE;
        }
        if (r2 != null) {
            boolean RI = ((C0365s0) C86312j.m106911c(C0365s0.class)).mo407RI(context, r2, 18, C75592q0.m90789s());
            Log.m105925i("MicroMsg.JsApiAddToEmotion", "doAddAction %b", Boolean.valueOf(RI));
            if (RI) {
                bVar.mo6945a((String) null, (JSONObject) null);
            } else {
                bVar.mo6945a("fail", (JSONObject) null);
            }
        } else {
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }
}
