package com.tencent.p014mm.plugin.base.stub;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import nj3.C76879j;
import p763ym.C79138l;
import sw1.C48477m;

/* renamed from: com.tencent.mm.plugin.base.stub.c */
public class C68748c {

    /* renamed from: a */
    public Context f197493a;

    /* renamed from: b */
    public String f197494b;

    /* renamed from: c */
    public String f197495c;

    /* renamed from: d */
    public C68750b f197496d;

    /* renamed from: com.tencent.mm.plugin.base.stub.c$a */
    public class C68749a implements DialogInterface.OnClickListener {
        public C68749a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C48477m a = C48477m.C13789a.m13091a();
            if (a != null) {
                a.P60(C68748c.this.f197495c, C75592q0.m90772b(), 2, C68748c.this.f197494b);
            }
            C68748c.this.f197496d.mo94586a(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.c$b */
    public interface C68750b {
        /* renamed from: a */
        void mo94586a(boolean z);
    }

    public C68748c(Context context, String str, String str2, C68750b bVar) {
        this.f197493a = context;
        this.f197494b = str;
        this.f197495c = str2;
        this.f197496d = bVar;
    }

    /* renamed from: a */
    public void mo94584a() {
        String str = this.f197495c;
        if (str == null || str.length() == 0) {
            Log.m105928w("MicroMsg.OpenIdChecker", "doCheck, openId is null");
            this.f197496d.mo94586a(true);
            return;
        }
        C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(this.f197494b, false);
        if (GW == null) {
            Log.m105920e("MicroMsg.OpenIdChecker", "doCheck fail, local app is null, appId = " + this.f197494b);
            this.f197496d.mo94586a(true);
        } else if (Util.isNullOrNil(GW.field_openId)) {
            Log.m105928w("MicroMsg.OpenIdChecker", "doCheck fail, local openId is null, appId = " + this.f197494b);
            Log.m105918d("MicroMsg.OpenIdChecker", "doCheck, trigger getappsetting, appId = " + this.f197494b);
            C72709y1.Bx0().mo69340a(this.f197494b);
            this.f197496d.mo94586a(true);
        } else if (this.f197495c.equalsIgnoreCase(GW.field_openId)) {
            Log.m105918d("MicroMsg.OpenIdChecker", "doCheck succ, appId = " + this.f197494b);
            this.f197496d.mo94586a(true);
        } else {
            Log.m105928w("MicroMsg.OpenIdChecker", "doCheck fail, appId = " + this.f197494b + ", openId = " + this.f197495c + ", localOpenId = " + GW.field_openId);
            mo94582b();
        }
    }

    /* renamed from: b */
    public void mo94582b() {
        C76879j.m92744o(this.f197493a, C0966R.string.hfs, C0966R.string.a3h, false, new C68749a());
    }
}
