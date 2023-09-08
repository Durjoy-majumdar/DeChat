package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.game.luggage.C4449c;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76912y0;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import qo3.C89779i0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.v1 */
public final class C4541v1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.v1$a */
    public static final class C4542a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f19293d;

        /* renamed from: e */
        public final /* synthetic */ C43620m2.C5947b f19294e;

        public C4542a(C89779i0 i0Var, C43620m2.C5947b bVar) {
            this.f19293d = i0Var;
            this.f19294e = bVar;
        }

        public final void run() {
            this.f19293d.dismiss();
            this.f19294e.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.v1$b */
    public static final class C4543b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f19295d;

        public C4543b(C43620m2.C5947b bVar) {
            this.f19295d = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f19295d.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "showToast";
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
            String optString = e.optString("status");
            String optString2 = e.optString("word");
            if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            boolean optBoolean = e.optBoolean("needBlock", false);
            int optInt = e.optInt("timeout", 10);
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -1867169789:
                        if (optString.equals("success")) {
                            C76912y0.m92768g(context, optString2);
                            bVar.mo6945a((String) null, (JSONObject) null);
                            return;
                        }
                        return;
                    case 3135262:
                        if (optString.equals("fail")) {
                            C76912y0.m92767f(context, optString2);
                            bVar.mo6945a((String) null, (JSONObject) null);
                            return;
                        }
                        return;
                    case 336650556:
                        if (optString.equals("loading")) {
                            C89779i0 e2 = C89779i0.m112248e(context, optString2, !optBoolean, 3, new C4543b(bVar));
                            Dialog dialog = C4449c.f19209a;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            C4449c.f19209a = e2;
                            C119157j jVar = (C119157j) C119157j.f356862d;
                            jVar.getClass();
                            jVar.mo183892w(new C4542a(e2, bVar), ((long) optInt) * 1000, false);
                            return;
                        }
                        return;
                    case 1940070258:
                        if (optString.equals("dismissloading")) {
                            Dialog dialog2 = C4449c.f19209a;
                            if (dialog2 != null) {
                                dialog2.dismiss();
                            }
                            C4449c.f19209a = null;
                            bVar.mo6945a((String) null, (JSONObject) null);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
