package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45698f;
import ex0.C45699g;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import te3.C52109yf2;
import te3.C52278zk2;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b */
public abstract class C43605b<T extends C53095a> extends C43620m2<T> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b$a */
    public static final class C43606a implements C45699g {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f117858a;

        /* renamed from: b */
        public final /* synthetic */ C43605b<T> f117859b;

        public C43606a(C43620m2.C5947b bVar, C43605b<T> bVar2) {
            this.f117858a = bVar;
            this.f117859b = bVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r4 = r4.f109025e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo66580a(com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x000b
                java.lang.String r4 = r4.f109025e
                if (r4 == 0) goto L_0x000b
                boolean r4 = ea3.C45590f.m50648h(r4)
                goto L_0x000c
            L_0x000b:
                r4 = 0
            L_0x000c:
                if (r4 != 0) goto L_0x0016
                com.tencent.mm.plugin.webview.luggage.jsapi.m2$b r0 = r3.f117858a
                r1 = 0
                java.lang.String r2 = "interceptRequest url is not GameCenterUrl "
                r0.mo6945a(r2, r1)
            L_0x0016:
                r4 = r4 ^ 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.jsapi.C43605b.C43606a.mo66580a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo):boolean");
        }

        /* renamed from: b */
        public void mo66581b(int i, String str, C52278zk2 zk22) {
            C87412m.m108594g(str, "errMsg");
            boolean z = false;
            if (zk22 != null) {
                JSONObject jSONObject = new JSONObject();
                String str2 = zk22.f146052e;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                jSONObject.put("err_desc", str2);
                String str4 = zk22.f146053f;
                if (str4 != null) {
                    str3 = str4;
                }
                jSONObject.put("respJson", str3);
                LinkedList<C52109yf2> linkedList = zk22.f146054g;
                C87412m.m108593f(linkedList, "response.header");
                if (!linkedList.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    LinkedList<C52109yf2> linkedList2 = zk22.f146054g;
                    C87412m.m108593f(linkedList2, "response.header");
                    for (C52109yf2 yf22 : linkedList2) {
                        String str5 = yf22.f145258d;
                        if (!(str5 == null || str5.length() == 0)) {
                            jSONObject2.put(yf22.f145258d, yf22.f145259e);
                        }
                    }
                    jSONObject.put("header", jSONObject2);
                }
                if (zk22.f146051d == 0) {
                    this.f117858a.mo6945a((String) null, jSONObject);
                    return;
                }
                this.f117858a.mo6945a("failed " + zk22.f146051d, jSONObject);
                return;
            }
            C43620m2.C5947b bVar = this.f117858a;
            if (str.length() > 0) {
                z = true;
            }
            if (!z) {
                str = this.f117859b.mo67898f() + " failed";
            }
            bVar.mo6945a(str, (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return mo67898f();
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject e = C6013c.m5893e(str);
        if (e != null && context != null && bVar != null) {
            Log.m105924i("MicroMsg.GamePrefetchJsApiTransferRequestBase", "[game-web-prefetch] " + mo67898f() + " invokeInOwn, data: " + e);
            e.put("type", mo67899g());
            ((C45698f) C86709a0.m107533q(C45698f.class)).mo71196YC(e, new C43606a(bVar, this));
        } else if (bVar != null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<T>.a aVar) {
    }

    /* renamed from: f */
    public abstract String mo67898f();

    /* renamed from: g */
    public abstract int mo67899g();
}
