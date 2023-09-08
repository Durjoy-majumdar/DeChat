package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import ke3.C88144b;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p196ln.C76706g;
import p196ln.C76708i;
import p910lj.C76701a;
import q22.C12037c;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.t */
public class C4796t extends C4770c {

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.t$a */
    public class C4797a implements Runnable {
        public C4797a(C4796t tVar) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.t$b */
    public class C4798b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f19831d;

        /* renamed from: e */
        public final /* synthetic */ Intent f19832e;

        /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.t$b$a */
        public class C4799a implements DialogInterface.OnCancelListener {
            public C4799a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C31519v2.m39436a().mo55989f(C4798b.this.f19831d);
                C4796t.this.f19815f.mo5689a("cancel");
            }
        }

        /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.t$b$b */
        public class C4800b implements C75597w2.C31525a {

            /* renamed from: a */
            public final /* synthetic */ ProgressDialog f19835a;

            public C4800b(ProgressDialog progressDialog) {
                this.f19835a = progressDialog;
            }

            /* renamed from: a */
            public void mo1109a(String str, boolean z) {
                Class cls = C75700k0.class;
                ProgressDialog progressDialog = this.f19835a;
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
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
                    C4796t.this.f19815f.mo5689a("fail");
                    return;
                }
                ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
                ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
                C4798b.this.f19832e.addFlags(268435456);
                C4798b.this.f19832e.putExtra("Contact_User", str);
                if (z1Var.mo62916m3()) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.kvStat(10298, z1Var.getUsername() + "," + 42);
                    C4798b.this.f19832e.putExtra("Contact_Scene", 42);
                }
                C88144b.m109791i(MMApplicationContext.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", C4798b.this.f19832e, (Bundle) null);
                C4796t.this.f19815f.mo5690b();
            }
        }

        public C4798b(String str, Intent intent) {
            this.f19831d = str;
            this.f19832e = intent;
        }

        public void run() {
            C31519v2.m39436a().mo55988e(this.f19831d, "", new C4800b(C76879j.m92723Q(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.a3h), MMApplicationContext.getContext().getString(C0966R.string.a4d), true, true, new C4799a())));
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Class cls = C75700k0.class;
        Log.m105918d("LiteAppJsApiProfile", "Invoke profile");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString = jSONObject.optString("username");
        Intent intent = new Intent();
        try {
            intent.putExtra("nextAnimIn", C12037c.m11739a(jSONObject));
            intent.putExtra("currentAnimOut", C12037c.m11740b(jSONObject));
            if (optString == null || optString.length() == 0) {
                Log.m105920e("LiteAppJsApiProfile", "profile fail, username is null");
                this.f19815f.mo5689a("username is null");
            } else if (Util.isNullOrNil(optString)) {
                C40319a0.m43495c(true, new C4797a(this));
                this.f19815f.mo5689a("fail");
            } else if (!C86709a0.m107523b().mo121115m()) {
                Log.m105920e("LiteAppJsApiProfile", "have to login");
            } else {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(optString);
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                    z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(optString);
                }
                String optString2 = jSONObject.optString("profileReportInfo");
                if (!Util.isNullOrNil(optString2)) {
                    intent.putExtra("key_add_contact_report_info", optString2);
                }
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                    C40319a0.m43495c(true, new C4798b(optString, intent));
                    return;
                }
                intent.addFlags(268435456);
                intent.putExtra("Contact_User", z1Var.getUsername());
                if (z1Var.mo62916m3()) {
                    intent.putExtra("Contact_Scene", 42);
                }
                C88144b.m109791i(MMApplicationContext.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                this.f19815f.mo5690b();
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("LiteAppJsApiProfile", e, "parse json", new Object[0]);
            this.f19815f.mo5689a("exception");
        }
    }
}
