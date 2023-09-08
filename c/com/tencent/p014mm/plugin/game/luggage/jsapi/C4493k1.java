package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;
import p159gw.C98250h;
import p828wa.C53095a;
import p828wa.C53096b;
import p910lj.C76701a;
import sw1.C48478n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.k1 */
public final class C4493k1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.k1$a */
    public static final class C4494a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f19261d;

        /* renamed from: e */
        public final /* synthetic */ C43620m2.C5947b f19262e;

        /* renamed from: f */
        public final /* synthetic */ Context f19263f;

        /* renamed from: g */
        public final /* synthetic */ C4493k1 f19264g;

        /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.k1$a$a */
        public static final class C4495a implements C98250h.C98251a {

            /* renamed from: a */
            public final /* synthetic */ C4493k1 f19265a;

            /* renamed from: b */
            public final /* synthetic */ Context f19266b;

            /* renamed from: c */
            public final /* synthetic */ C43620m2.C5947b f19267c;

            /* renamed from: d */
            public final /* synthetic */ String f19268d;

            public C4495a(C4493k1 k1Var, Context context, C43620m2.C5947b bVar, String str) {
                this.f19265a = k1Var;
                this.f19266b = context;
                this.f19267c = bVar;
                this.f19268d = str;
            }

            /* renamed from: a */
            public void mo2055a(String str, String str2) {
                C87412m.m108594g(str, "srcPath");
                C87412m.m108594g(str2, "destPath");
                this.f19265a.getClass();
                Log.m105924i("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, success, destPath = " + str2);
                Context context = this.f19266b;
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
                AndroidMediaUtil.refreshMediaScanner(str2, this.f19266b);
                this.f19267c.mo6945a((String) null, (JSONObject) null);
            }

            /* renamed from: b */
            public void mo2056b(String str, String str2) {
                C87412m.m108594g(str, "srcPath");
                C87412m.m108594g(str2, "destPath");
                this.f19265a.getClass();
                Log.m105920e("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, error videoId = " + this.f19268d + ", srcPath = " + str);
                this.f19267c.mo6945a("onExportFail", (JSONObject) null);
            }
        }

        public C4494a(String str, C43620m2.C5947b bVar, Context context, C4493k1 k1Var) {
            this.f19261d = str;
            this.f19262e = bVar;
            this.f19263f = context;
            this.f19264g = k1Var;
        }

        public final void run() {
            C48478n.C13792e rR = ((C48478n) C86312j.m106911c(C48478n.class)).mo65692rR(this.f19261d);
            if (rR == null) {
                this.f19262e.mo6945a("videoId not exist in client", (JSONObject) null);
            }
            if (C86013q1.m106450k(rR.f38910d)) {
                Context context = this.f19263f;
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(context, rR.f38910d, new C4495a(this.f19264g, context, this.f19262e, this.f19261d));
                return;
            }
            this.f19264g.getClass();
            Log.m105920e("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, error videoId = " + this.f19261d + ", local file not exist");
            this.f19262e.mo6945a("local file not exist", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "saveMiniGameVideoToAlbum";
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
            ((C119157j) C119157j.f356862d).mo183875f(new C4494a(optString, bVar, context, this));
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
