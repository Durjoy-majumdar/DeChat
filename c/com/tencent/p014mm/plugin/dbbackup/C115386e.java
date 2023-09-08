package com.tencent.p014mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.dbbackup.e */
public class C115386e implements C93095a {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f345858a;

    /* renamed from: b */
    public final /* synthetic */ long f345859b;

    /* renamed from: c */
    public final /* synthetic */ Context f345860c;

    /* renamed from: com.tencent.mm.plugin.dbbackup.e$a */
    public class C115387a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f345861d;

        public C115387a(int i) {
            this.f345861d = i;
        }

        public void run() {
            ProgressDialog progressDialog = C115386e.this.f345858a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            int i = this.f345861d;
            C76701a.makeText(C115386e.this.f345860c, (CharSequence) i == 0 ? String.format("Database recovery succeeded, elapsed %.2f seconds.", new Object[]{Float.valueOf(((float) (System.nanoTime() - C115386e.this.f345859b)) / 1.0E9f)}) : i == 1 ? "Database recovery canceled." : "Database recovery failed.", 0).show();
        }
    }

    public C115386e(C115381b bVar, ProgressDialog progressDialog, long j, Context context) {
        this.f345858a = progressDialog;
        this.f345859b = j;
        this.f345860c = context;
    }

    /* renamed from: a */
    public void mo127599a(int i) {
        MMHandlerThread.postToMainThread(new C115387a(i));
    }
}
