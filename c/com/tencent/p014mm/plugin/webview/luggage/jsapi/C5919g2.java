package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45628s0;
import hc0.C20937c;
import ic0.C98661k;
import ke3.C88144b;
import nj3.C76879j;
import org.json.JSONObject;
import p008bq.C0363p0;
import p008bq.C0364r0;
import p008bq.C0365s0;
import p008bq.C39833l0;
import p008bq.C67305d1;
import p823sg.C90193h;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g2 */
public class C5919g2 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g2$a */
    public class C5920a implements C98661k {

        /* renamed from: a */
        public final /* synthetic */ String f22151a;

        /* renamed from: b */
        public final /* synthetic */ Context f22152b;

        /* renamed from: c */
        public final /* synthetic */ C43620m2.C5947b f22153c;

        public C5920a(String str, Context context, C43620m2.C5947b bVar) {
            this.f22151a = str;
            this.f22152b = context;
            this.f22153c = bVar;
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            Object obj;
            Log.m105925i("MicroMsg.JsApiShareEmotion", "imageLoaderListener onImageLoadComplete %s", str);
            if (bitmap != null && objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && str.equals(this.f22151a)) {
                C86009m1 m1Var = new C86009m1(objArr[0].toString());
                if (m1Var.mo119967g()) {
                    String q = C86013q1.m106456q(m1Var.mo119976n());
                    C86013q1.m106442c(m1Var.mo119971i(), ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", q));
                    C5919g2.this.mo6937f(this.f22152b, q, this.f22153c);
                    return;
                }
            }
            this.f22153c.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g2$b */
    public class C5921b implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ Context f22155d;

        /* renamed from: e */
        public final /* synthetic */ C43620m2.C5947b f22156e;

        public C5921b(Context context, C43620m2.C5947b bVar) {
            this.f22155d = context;
            this.f22156e = bVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            int i3 = i2;
            Intent intent2 = intent;
            Class cls = C0363p0.class;
            Log.m105925i("MicroMsg.JsApiShareEmotion", "mmOnActivityResult, %d", Integer.valueOf(i));
            if (i == (C5919g2.this.hashCode() & 65535)) {
                Log.m105925i("MicroMsg.JsApiShareEmotion", "share emmotion resultCode: %d", Integer.valueOf(i2));
                if (i3 == -1) {
                    String nullAs = Util.nullAs(intent2.getStringExtra("Select_Conv_User"), "");
                    String nullAs2 = Util.nullAs(intent2.getStringExtra("emoji_thumb_path"), "");
                    IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(cls)).mo403r2(nullAs2);
                    if (r2 == null) {
                        String BX = ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", nullAs2);
                        if (C86013q1.m106450k(BX)) {
                            r2 = ((C0363p0) C86312j.m106911c(cls)).mo401cC(nullAs2, "", 65, ImgUtil.isGif(BX) ? 2 : 1, (int) C86013q1.m106451l(BX), "", 1);
                        }
                    }
                    for (String next : Util.stringsToList(Util.nullAs(nullAs, "").split(","))) {
                        if (r2 != null) {
                            ((C0365s0) C86312j.m106911c(C0365s0.class)).O60(next, r2, (C72963f4) null);
                        }
                    }
                    String stringExtra = intent2.getStringExtra("custom_send_text");
                    if (!Util.isNullOrNil(stringExtra)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                        aVar.f9497a = nullAs;
                        aVar.f9498b = stringExtra;
                        aVar.f9499c = C45628s0.m50810y(nullAs);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                    Context context = this.f22155d;
                    C76879j.m92726T(context, context.getResources().getString(C0966R.string.f360099a34));
                    this.f22156e.mo6945a((String) null, (JSONObject) null);
                } else if (i3 != 0) {
                    this.f22156e.mo6945a((String) null, (JSONObject) null);
                } else {
                    this.f22156e.mo6945a((String) null, (JSONObject) null);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "shareEmoticon";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Class cls = C67305d1.class;
        Class cls2 = C0364r0.class;
        Log.m105924i("MicroMsg.JsApiShareEmotion", "invoke");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            Log.m105920e("MicroMsg.JsApiShareEmotion", "data is null");
            bVar.mo6945a("null_data", (JSONObject) null);
            return;
        }
        String optString = e.optString("base64DataString");
        String optString2 = e.optString("url");
        if (!Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.JsApiShareEmotion", "use base64DataString");
            int indexOf = optString.indexOf(";base64,");
            try {
                byte[] decode = Base64.decode(indexOf != -1 ? optString.substring(indexOf + 8, optString.length()) : "", 0);
                if (Util.isNullOrNil(decode)) {
                    bVar.mo6945a("fail", (JSONObject) null);
                    return;
                }
                String f = C90193h.m112878f(decode);
                String BX = ((C0364r0) C86312j.m106911c(cls2)).mo405BX(((C67305d1) C86312j.m106911c(cls)).rx0(), "", f);
                if (!C86013q1.m106450k(BX) || !C86013q1.m106456q(BX).equalsIgnoreCase(f)) {
                    C86013q1.m106438T(BX, decode, 0, decode.length);
                }
                mo6937f(context, f, bVar);
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.JsApiShareEmotion", "doShareEmoticon error:" + e2.getMessage());
                bVar.mo6945a("base64_decode_fail", (JSONObject) null);
            }
        } else {
            Log.m105925i("MicroMsg.JsApiShareEmotion", "doShareEmoticon use url:%s", optString2);
            C86009m1 m1Var = new C86009m1(context.getCacheDir(), C90193h.m112878f(optString2.getBytes()));
            if (m1Var.mo119967g()) {
                String q = C86013q1.m106456q(m1Var.mo119976n());
                String BX2 = ((C0364r0) C86312j.m106911c(cls2)).mo405BX(((C67305d1) C86312j.m106911c(cls)).rx0(), "", q);
                if (!C86013q1.m106450k(BX2)) {
                    C86013q1.m106442c(m1Var.mo119971i(), BX2);
                }
                mo6937f(context, q, bVar);
                return;
            }
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59346b = true;
            bVar2.f59350f = m1Var.mo119971i();
            bVar2.f59368x = new Object[]{m1Var.mo119971i()};
            ((C39833l0) C86312j.m106911c(C39833l0.class)).mo62466Nr().mo32521j(optString2, (ImageView) null, bVar2.mo32666a(), new C5920a(optString2, context, bVar));
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }

    /* renamed from: f */
    public final void mo6937f(Context context, String str, C43620m2.C5947b bVar) {
        Intent intent = new Intent();
        intent.putExtra("scene_from", 4);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("Retr_Msg_Type", 5);
        intent.putExtra("Retr_Msg_thumb_path", str);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
        if (context instanceof MMActivity) {
            ((MMActivity) context).mmSetOnActivityResultCallback(new C5921b(context, bVar));
            C88144b.m109802t(context, ".ui.transmit.SelectConversationUI", intent, hashCode() & 65535);
        }
    }
}
