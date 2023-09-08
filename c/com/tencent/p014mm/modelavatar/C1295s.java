package com.tencent.p014mm.modelavatar;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C10582o;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.modelavatar.s */
public class C1295s implements C11385n, C10582o {

    /* renamed from: d */
    public Context f10398d;

    /* renamed from: e */
    public String f10399e;

    /* renamed from: f */
    public boolean f10400f;

    /* renamed from: g */
    public ProgressDialog f10401g;

    /* renamed from: h */
    public Runnable f10402h = null;

    /* renamed from: i */
    public Runnable f10403i = null;

    public C1295s(Context context, String str, boolean z) {
        this.f10398d = context;
        this.f10399e = str;
        this.f10401g = null;
        this.f10400f = z;
        C86709a0.m107524d().mo123455a(157, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r4.f10399e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1219a(int r5, java.lang.Runnable r6, java.lang.Runnable r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f10398d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r4.f10399e
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            junit.framework.Assert.assertTrue(r0)
            r4.f10402h = r6
            r4.f10403i = r7
            com.tencent.mm.modelavatar.r r7 = new com.tencent.mm.modelavatar.r
            java.lang.String r0 = r4.f10399e
            r3 = 0
            r7.<init>((int) r5, (java.lang.String) r0, (java.lang.String) r3)
            ob0.b0 r5 = f40.C86709a0.m107524d()
            r5.mo123460f(r7)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            if (r6 != 0) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r1] = r6
            java.lang.String r6 = "MicroMsg.ProcessUploadHDHeadImg"
            java.lang.String r7 = "post is null ? %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C1295s.mo1219a(int, java.lang.Runnable, java.lang.Runnable):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r9.f10399e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1220b(int r10, java.lang.Runnable r11, boolean r12) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f10398d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r9.f10399e
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            junit.framework.Assert.assertTrue(r0)
            r9.f10402h = r11
            android.content.Context r3 = r9.f10398d
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r4 = r3.getString(r0)
            android.content.Context r0 = r9.f10398d
            r5 = 2131836441(0x7f113e19, float:1.9306049E38)
            java.lang.String r5 = r0.getString(r5)
            r6 = 1
            r7 = 1
            r8 = 0
            qo3.i0 r0 = nj3.C76879j.m92723Q(r3, r4, r5, r6, r7, r8)
            r9.f10401g = r0
            com.tencent.mm.modelavatar.r r0 = new com.tencent.mm.modelavatar.r
            java.lang.String r3 = r9.f10399e
            r0.<init>((int) r10, (java.lang.String) r3, (boolean) r12)
            ob0.b0 r10 = f40.C86709a0.m107524d()
            r10.mo123460f(r0)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            if (r11 != 0) goto L_0x0047
            r11 = 1
            goto L_0x0048
        L_0x0047:
            r11 = 0
        L_0x0048:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10[r1] = r11
            java.lang.String r11 = "MicroMsg.ProcessUploadHDHeadImg"
            java.lang.String r12 = "post is null ? %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C1295s.mo1220b(int, java.lang.Runnable, boolean):boolean");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C7660a a;
        Log.m105924i("MicroMsg.ProcessUploadHDHeadImg", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C86709a0.m107524d().mo123470p(157, this);
        ProgressDialog progressDialog = this.f10401g;
        if (progressDialog != null && progressDialog.isShowing()) {
            Context context = this.f10398d;
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                try {
                    this.f10401g.dismiss();
                } catch (IllegalArgumentException e) {
                    Log.m105920e("MicroMsg.ProcessUploadHDHeadImg", "dismiss dialog err" + e.getMessage());
                }
            }
        }
        int i3 = 4;
        if (i == 0 && i2 == 0) {
            C76701a.makeText(this.f10398d, (int) C0966R.string.j1m, 0).show();
            if (this.f10402h != null) {
                new MMHandler(Looper.getMainLooper()).post(this.f10402h);
            }
            if (this.f10400f) {
                i3 = 1;
            }
            C5139t.m5183e(i3, 2);
            return;
        }
        if (this.f10403i != null) {
            new MMHandler(Looper.getMainLooper()).post(this.f10403i);
        }
        if (i != 4 || (i2 != -100 && i2 != -2023)) {
            if (str != null && str.length() > 0 && (a = C7660a.m7782a(str)) != null) {
                a.mo8792b(this.f10398d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (i == 4 && i2 == -4) {
                C76701a.makeText(this.f10398d, (int) C0966R.string.bop, 0).show();
            } else {
                C76701a.makeText(this.f10398d, (int) C0966R.string.j1l, 0).show();
            }
        }
    }
}
