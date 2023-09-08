package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import sw1.C48478n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.a2 */
public final class C4455a2 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.a2$a */
    public static final class C4456a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f19222d;

        /* renamed from: e */
        public final /* synthetic */ C43620m2.C5947b f19223e;

        /* renamed from: f */
        public final /* synthetic */ C4455a2 f19224f;

        /* renamed from: g */
        public final /* synthetic */ Context f19225g;

        /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.a2$a$a */
        public static final class C4457a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f19226d;

            /* renamed from: e */
            public final /* synthetic */ C48478n.C13793h f19227e;

            /* renamed from: f */
            public final /* synthetic */ C4455a2 f19228f;

            /* renamed from: g */
            public final /* synthetic */ String f19229g;

            /* renamed from: h */
            public final /* synthetic */ C43620m2.C5947b f19230h;

            /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.a2$a$a$a */
            public static final class C4458a implements C48478n.C48482g {

                /* renamed from: a */
                public final /* synthetic */ C4455a2 f19231a;

                /* renamed from: b */
                public final /* synthetic */ String f19232b;

                /* renamed from: c */
                public final /* synthetic */ C43620m2.C5947b f19233c;

                public C4458a(C4455a2 a2Var, String str, C43620m2.C5947b bVar) {
                    this.f19231a = a2Var;
                    this.f19232b = str;
                    this.f19233c = bVar;
                }

                /* renamed from: a */
                public void mo5395a(String str) {
                    this.f19231a.getClass();
                    Log.m105920e("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + this.f19232b + ", errorMsg = " + str);
                    this.f19233c.mo6945a(str, (JSONObject) null);
                }

                public void onCancel() {
                    this.f19231a.getClass();
                    Log.m105924i("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, user cancel");
                    this.f19233c.mo6945a("user cancel", (JSONObject) null);
                }

                /* renamed from: v */
                public void mo5397v(String str, String str2) {
                    this.f19231a.getClass();
                    Log.m105924i("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + this.f19232b + ", videoUrl = " + str + ", thumbUrl = " + str2);
                    C43620m2.C5947b bVar = this.f19233c;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("videoUrl", str);
                    jSONObject.put("thumbUrl", str2);
                    bVar.mo6945a((String) null, jSONObject);
                }
            }

            public C4457a(Context context, C48478n.C13793h hVar, C4455a2 a2Var, String str, C43620m2.C5947b bVar) {
                this.f19226d = context;
                this.f19227e = hVar;
                this.f19228f = a2Var;
                this.f19229g = str;
                this.f19230h = bVar;
            }

            public final void run() {
                ((C48478n) C86312j.m106911c(C48478n.class)).mo65693rp(this.f19226d, this.f19227e, new C4458a(this.f19228f, this.f19229g, this.f19230h));
            }
        }

        public C4456a(String str, C43620m2.C5947b bVar, C4455a2 a2Var, Context context) {
            this.f19222d = str;
            this.f19223e = bVar;
            this.f19224f = a2Var;
            this.f19225g = context;
        }

        public final void run() {
            C48478n.C13792e rR = ((C48478n) C86312j.m106911c(C48478n.class)).mo65692rR(this.f19222d);
            if (rR == null) {
                this.f19223e.mo6945a("videoId not exist in client", (JSONObject) null);
            }
            if (C86013q1.m106450k(rR.f38910d)) {
                C48478n.C13793h hVar = new C48478n.C13793h();
                hVar.f38917a = rR.f38908b;
                hVar.f38920d = rR.f38916j;
                hVar.f38918b = rR.f38909c;
                hVar.f38919c = rR.f38910d;
                hVar.f38921e = rR.f38914h;
                hVar.f38922f = rR.f38915i;
                C2039g2.m1988b(new C4457a(this.f19225g, hVar, this.f19224f, this.f19222d, this.f19223e));
                return;
            }
            this.f19224f.getClass();
            Log.m105920e("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + this.f19222d + ", local file not exist");
            this.f19223e.mo6945a("local file not exist", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "uploadMiniGameVideoToShare";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (bVar != null && context != null) {
            JSONObject e = C6013c.m5893e(str);
            if (e == null) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            String optString = e.optString("videoId");
            if (Util.isNullOrNil(optString)) {
                bVar.mo6945a("videoId is null", (JSONObject) null);
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C4456a(optString, bVar, this, context));
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
