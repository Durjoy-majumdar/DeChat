package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import j83.C9286a;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p196ln.C76706g;
import p196ln.C76708i;
import p828wa.C53096b;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i1 */
public class C5929i1 extends C5954n2 {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i1$a */
    public class C5930a implements Runnable {
        public C5930a(C5929i1 i1Var) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i1$b */
    public class C5931b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ String f22163d;

        /* renamed from: e */
        public final /* synthetic */ C43620m2.C5947b f22164e;

        public C5931b(C5929i1 i1Var, String str, C43620m2.C5947b bVar) {
            this.f22163d = str;
            this.f22164e = bVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C31519v2.m39436a().mo55989f(this.f22163d);
            this.f22164e.mo6945a("cancel", (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i1$c */
    public class C5932c implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ Context f22165a;

        /* renamed from: b */
        public final /* synthetic */ C43620m2.C5947b f22166b;

        /* renamed from: c */
        public final /* synthetic */ ProgressDialog f22167c;

        /* renamed from: d */
        public final /* synthetic */ Intent f22168d;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i1$c$a */
        public class C5933a implements Runnable {
            public C5933a() {
            }

            public void run() {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) C5932c.this.f22165a.getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
            }
        }

        public C5932c(C5929i1 i1Var, Context context, C43620m2.C5947b bVar, ProgressDialog progressDialog, Intent intent) {
            this.f22165a = context;
            this.f22166b = bVar;
            this.f22167c = progressDialog;
            this.f22168d = intent;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Class cls = C75700k0.class;
            if (this.f22165a == null) {
                Log.m105928w("MicroMsg.JsApiProfile", "getNow callback, msghandler has already been detached!");
                this.f22166b.mo6945a("fail", (JSONObject) null);
                return;
            }
            ProgressDialog progressDialog = this.f22167c;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(str);
            }
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                z = false;
            } else {
                str = z1Var.getUsername();
            }
            if (!z) {
                C40319a0.m43495c(true, new C5933a());
                this.f22166b.mo6945a("fail", (JSONObject) null);
                return;
            }
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
            ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
            this.f22168d.addFlags(268435456);
            this.f22168d.putExtra("Contact_User", str);
            if (z1Var.mo62916m3()) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(10298, z1Var.getUsername() + "," + 42);
                this.f22168d.putExtra("Contact_Scene", 42);
            }
            ((C67654r1) C9286a.f29044a).mo93174g(this.f22168d, this.f22165a);
            this.f22166b.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return Scopes.PROFILE;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Class cls = C75700k0.class;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("username");
            if (optString == null || optString.length() == 0) {
                Log.m105920e("MicroMsg.JsApiProfile", "doProfile fail, username is null");
                bVar.mo6945a("fail", (JSONObject) null);
            } else if (Util.isNullOrNil(optString)) {
                C40319a0.m43495c(true, new C5930a(this));
                bVar.mo6945a("fail", (JSONObject) null);
            } else if (!C86709a0.m107523b().mo121115m()) {
                Log.m105920e("MicroMsg.JsApiProfile", "doProfile, MMCore.hasCfgDefaultUin() is false");
                bVar.mo6945a("fail", (JSONObject) null);
            } else {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(optString);
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                    z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(optString);
                }
                Intent intent = new Intent();
                String optString2 = jSONObject.optString("profileReportInfo");
                if (!Util.isNullOrNil(optString2)) {
                    intent.putExtra("key_add_contact_report_info", optString2);
                }
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                    C31519v2.m39436a().mo55988e(optString, "", new C5932c(this, context, bVar, C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a4d), true, true, new C5931b(this, optString, bVar)), intent));
                    return;
                }
                intent.addFlags(268435456);
                intent.putExtra("Contact_User", z1Var.getUsername());
                if (z1Var.mo62916m3()) {
                    intent.putExtra("Contact_Scene", 42);
                }
                if (z1Var.mo62927s3()) {
                    SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                    SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                    aVar.f9503a = intent;
                    aVar.f9504b = z1Var.getUsername();
                    setLocalQQMobileEvent.publish();
                }
                ((C67654r1) C9286a.f29044a).mo93174g(intent, context);
                bVar.mo6945a((String) null, (JSONObject) null);
            }
        } catch (JSONException unused) {
            Log.m105920e("MicroMsg.JsApiProfile", "parase json fail");
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
