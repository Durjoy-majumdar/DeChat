package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.t1 */
public final class C4528t1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.t1$a */
    public static final class C4529a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19285a;

        public C4529a(C43620m2.C5947b bVar) {
            this.f19285a = bVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f19285a.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.t1$b */
    public static final class C4530b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19286a;

        public C4530b(C43620m2.C5947b bVar) {
            this.f19286a = bVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f19286a.mo6945a("cancel", (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.t1$c */
    public static final class C4531c implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f19287d;

        public C4531c(C43620m2.C5947b bVar) {
            this.f19287d = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f19287d.mo6945a("cancel", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "showDialog";
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
            String optString = e.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            String optString2 = e.optString("desc");
            if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2)) {
                String optString3 = e.optString("confirmText");
                String optString4 = e.optString("cancelText");
                if (!Util.isNullOrNil(optString3) || !Util.isNullOrNil(optString4)) {
                    boolean optBoolean = e.optBoolean("dark", false);
                    boolean optBoolean2 = e.optBoolean("outSideCancel", false);
                    C77426q qVar = new C77426q(context);
                    qVar.mo107606r(optString);
                    qVar.mo107604p(optBoolean);
                    qVar.mo107595g(optString2);
                    qVar.mo107589a(optBoolean2);
                    if (!Util.isNullOrNil(optString3)) {
                        qVar.mo107602n(optString3);
                        qVar.mo107600l(new C4529a(bVar));
                    }
                    if (!Util.isNullOrNil(optString4)) {
                        qVar.mo107598j(optString4);
                        qVar.mo107597i(new C4530b(bVar));
                    }
                    if (optBoolean2) {
                        qVar.mo107593e(new C4531c(bVar));
                    }
                    qVar.mo107603o();
                    return;
                }
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            bVar.mo6945a("invalid_params", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
