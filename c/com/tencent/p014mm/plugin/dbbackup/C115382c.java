package com.tencent.p014mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C116758u5;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.dbbackup.c */
public class C115382c implements C93095a {

    /* renamed from: a */
    public final /* synthetic */ C116758u5 f345847a;

    /* renamed from: b */
    public final /* synthetic */ ProgressDialog f345848b;

    /* renamed from: c */
    public final /* synthetic */ Context f345849c;

    /* renamed from: com.tencent.mm.plugin.dbbackup.c$a */
    public class C115383a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f345850d;

        public C115383a(int i) {
            this.f345850d = i;
        }

        public void run() {
            ProgressDialog progressDialog = C115382c.this.f345848b;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            int i = this.f345850d;
            C76879j.m92738i(C115382c.this.f345849c, i != -3 ? i != -2 ? i != 0 ? C0966R.string.hv6 : C0966R.string.hv_ : C0966R.string.hv9 : C0966R.string.hv8, C0966R.string.a3h);
        }
    }

    public C115382c(C115381b bVar, C116758u5 u5Var, ProgressDialog progressDialog, Context context) {
        this.f345847a = u5Var;
        this.f345848b = progressDialog;
        this.f345849c = context;
    }

    /* renamed from: a */
    public void mo127599a(int i) {
        this.f345847a.mo180730a();
        MMHandlerThread.postToMainThread(new C115383a(i));
    }
}
