package com.tencent.p014mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.dbbackup.f */
public class C115388f implements C93095a {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f345863a;

    /* renamed from: b */
    public final /* synthetic */ long f345864b;

    /* renamed from: c */
    public final /* synthetic */ Context f345865c;

    /* renamed from: com.tencent.mm.plugin.dbbackup.f$a */
    public class C115389a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f345866d;

        public C115389a(int i) {
            this.f345866d = i;
        }

        public void run() {
            ProgressDialog progressDialog = C115388f.this.f345863a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            int i = this.f345866d;
            C76701a.makeText(C115388f.this.f345865c, (CharSequence) i == 0 ? String.format("Database recovery succeeded, elapsed %.2f seconds.", new Object[]{Float.valueOf(((float) (System.nanoTime() - C115388f.this.f345864b)) / 1.0E9f)}) : i == 1 ? "Database recovery canceled." : "Database recovery failed.", 0).show();
        }
    }

    public C115388f(C115381b bVar, ProgressDialog progressDialog, long j, Context context) {
        this.f345863a = progressDialog;
        this.f345864b = j;
        this.f345865c = context;
    }

    /* renamed from: a */
    public void mo127599a(int i) {
        MMHandlerThread.postToMainThread(new C115389a(i));
    }
}
