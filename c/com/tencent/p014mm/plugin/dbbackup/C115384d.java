package com.tencent.p014mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.dbbackup.d */
public class C115384d implements C93095a {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f345852a;

    /* renamed from: b */
    public final /* synthetic */ boolean f345853b;

    /* renamed from: c */
    public final /* synthetic */ long f345854c;

    /* renamed from: d */
    public final /* synthetic */ Context f345855d;

    /* renamed from: com.tencent.mm.plugin.dbbackup.d$a */
    public class C115385a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f345856d;

        public C115385a(int i) {
            this.f345856d = i;
        }

        public void run() {
            String str;
            ProgressDialog progressDialog = C115384d.this.f345852a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            int i = this.f345856d;
            if (i == 0) {
                Object[] objArr = new Object[2];
                objArr[0] = C115384d.this.f345853b ? "incremental" : "new";
                objArr[1] = Float.valueOf(((float) (System.nanoTime() - C115384d.this.f345854c)) / 1.0E9f);
                str = String.format("Database (%s) backup succeeded, elapsed %.2f seconds.", objArr);
            } else {
                str = i == 1 ? "Database backup canceled." : "Database backup failed.";
            }
            C76701a.makeText(C115384d.this.f345855d, (CharSequence) str, 0).show();
        }
    }

    public C115384d(C115381b bVar, ProgressDialog progressDialog, boolean z, long j, Context context) {
        this.f345852a = progressDialog;
        this.f345853b = z;
        this.f345854c = j;
        this.f345855d = context;
    }

    /* renamed from: a */
    public void mo127599a(int i) {
        MMHandlerThread.postToMainThread(new C115385a(i));
    }
}
