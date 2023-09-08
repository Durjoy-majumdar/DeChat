package com.tencent.p014mm.plugin.product.p087ui;

import af2.C67036o;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.product.p087ui.MallProductHelper;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.product.ui.h */
public class C70110h implements MMHandlerThread.IWaitWorkThread {

    /* renamed from: a */
    public volatile int f202386a;

    /* renamed from: b */
    public final /* synthetic */ Intent f202387b;

    /* renamed from: c */
    public final /* synthetic */ C67036o f202388c;

    /* renamed from: d */
    public final /* synthetic */ MallProductHelper f202389d;

    public C70110h(MallProductHelper mallProductHelper, Intent intent, C67036o oVar) {
        this.f202389d = mallProductHelper;
        this.f202387b = intent;
        this.f202388c = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        if (r6 != 4) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean doInBackground() {
        /*
            r12 = this;
            com.tencent.mm.plugin.product.ui.MallProductHelper r0 = r12.f202389d
            android.content.Intent r1 = r12.f202387b
            af2.o r2 = r12.f202388c
            r0.getClass()
            r3 = 3
            java.lang.String r4 = "key_product_scene"
            int r4 = r1.getIntExtra(r4, r3)
            com.tencent.p014mm.plugin.product.p087ui.MallProductHelper.f202269j = r4
            java.lang.String r4 = "key_product_info"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r5 = "key_product_id"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r6 = "key_source_url"
            java.lang.String r1 = r1.getStringExtra(r6)
            af2.e r6 = r0.f202273g
            r6.getClass()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r7 != 0) goto L_0x0031
            r6.f192536e = r1
        L_0x0031:
            r1 = -2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Scene : "
            r6.append(r7)
            int r7 = com.tencent.p014mm.plugin.product.p087ui.MallProductHelper.f202269j
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.MallProductUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            int r6 = com.tencent.p014mm.plugin.product.p087ui.MallProductHelper.f202269j
            r7 = 0
            r8 = -1
            r9 = 0
            r10 = 1
            if (r6 == r10) goto L_0x006f
            r11 = 2
            if (r6 == r11) goto L_0x006f
            if (r6 == r3) goto L_0x005b
            r3 = 4
            if (r6 == r3) goto L_0x006f
            goto L_0x0086
        L_0x005b:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r3 != 0) goto L_0x0086
            af2.o r1 = af2.C67036o.m79217b(r2, r4)
            af2.e r0 = r0.f202273g
            r0.mo91017u(r1, r7)
            java.lang.String r0 = r1.f192554a
            r5 = r0
            r2 = r1
            goto L_0x0083
        L_0x006f:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r3 != 0) goto L_0x0086
            af2.o r2 = af2.C67036o.m79218c(r2, r4)
            if (r2 == 0) goto L_0x0085
            af2.e r0 = r0.f202273g
            r0.mo91017u(r2, r7)
            java.lang.String r0 = r2.f192554a
            r5 = r0
        L_0x0083:
            r1 = 0
            goto L_0x0086
        L_0x0085:
            r1 = -1
        L_0x0086:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 != 0) goto L_0x009e
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            af2.j r3 = new af2.j
            r3.<init>(r2, r5, r9)
            r0.mo123460f(r3)
            r8 = r1
        L_0x009e:
            r12.f202386a = r8
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.product.p087ui.C70110h.doInBackground():boolean");
    }

    public boolean onPostExecute() {
        MallProductHelper.C70078a aVar;
        int i = this.f202386a;
        if (i == -1) {
            MallProductHelper mallProductHelper = this.f202389d;
            MallProductHelper.C70078a aVar2 = mallProductHelper.f202274h;
            if (aVar2 == null) {
                return true;
            }
            aVar2.mo96460a(0, -1, mallProductHelper.f202270d.getString(C0966R.string.gnv));
            return true;
        } else if (i != 0 || (aVar = this.f202389d.f202274h) == null) {
            return true;
        } else {
            aVar.mo96460a(0, 0, "");
            return true;
        }
    }

    public String toString() {
        return super.toString() + "|initData";
    }
}
