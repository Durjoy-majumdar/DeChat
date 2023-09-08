package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6327w3;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.r0 */
public class C6303r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f23147d;

    /* renamed from: e */
    public final /* synthetic */ double f23148e;

    /* renamed from: f */
    public final /* synthetic */ double f23149f;

    /* renamed from: g */
    public final /* synthetic */ String f23150g;

    /* renamed from: h */
    public final /* synthetic */ int f23151h;

    /* renamed from: i */
    public final /* synthetic */ MsgHandler f23152i;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.r0$a */
    public class C6304a implements C6327w3.C6332e {
        public C6304a() {
        }

        /* renamed from: a */
        public final void mo7324a(int i, String str) {
            MsgHandler msgHandler = C6303r0.this.f23152i;
            char[] cArr = MsgHandler.f22653Q0;
            MsgHandler$$q0 Y6 = msgHandler.mo7189Y6(i);
            if (Y6 != null && Y6.f22846a != null && Y6.f22847b != null) {
                MsgHandler msgHandler2 = C6303r0.this.f23152i;
                C6107m mVar = msgHandler2.f22715x;
                C13851h1 h1Var = msgHandler2.f22698e;
                MsgHandler.m6158Q3(msgHandler2, mVar, h1Var, "openMapNavigateMenu:" + Util.nullAs(str, "fail"), (Map) null, true, true);
            }
        }
    }

    public C6303r0(MsgHandler msgHandler, int i, double d, double d2, String str, int i2) {
        this.f23152i = msgHandler;
        this.f23147d = i;
        this.f23148e = d;
        this.f23149f = d2;
        this.f23150g = str;
        this.f23151h = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0104, code lost:
        r0 = r13.f23152i.mo7189Y6(r13.f23151h);
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r13.f23152i
            android.content.Context r0 = r0.f22697d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0101
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0101
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0101
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r13.f23152i
            com.tencent.mm.plugin.webview.ui.tools.jsapi.w3 r3 = r0.f22674C
            android.content.Context r0 = r0.f22697d
            int r4 = r13.f23147d
            double r6 = r13.f23148e
            double r8 = r13.f23149f
            java.lang.String r11 = r13.f23150g
            int r5 = r13.f23151h
            com.tencent.mm.plugin.webview.ui.tools.jsapi.r0$a r12 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.r0$a
            r12.<init>()
            r3.getClass()
            if (r0 == 0) goto L_0x0101
            boolean r10 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r10 == 0) goto L_0x0101
            r10 = r0
            com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10
            boolean r10 = r10.isFinishing()
            if (r10 != 0) goto L_0x0101
            r3.f23216d = r5
            r3.f23217e = r1
            r3.f23218f = r4
            com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$f r4 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$f
            r10 = 0
            r5 = r4
            r5.<init>(r6, r8, r10)
            r3.f23219g = r4
            r3.f23220h = r11
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r0)
            r3.f23221i = r4
            r3.f23222j = r12
            java.lang.Object r0 = r4.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L_0x005f
            goto L_0x0102
        L_0x005f:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "com.tencent.mm.pluginsdk.ui.tools.AppChooserUI"
            r4.setClassName(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 5
            r5.<init>(r6)
            wm.d r6 = p262wm.C15521d.TencentMap
            java.lang.String r6 = r6.mo14299a()
            r5.add(r6)
            wm.d r6 = p262wm.C15521d.GoogleMap
            java.lang.String r6 = r6.mo14299a()
            r5.add(r6)
            wm.d r6 = p262wm.C15521d.SogouMap
            java.lang.String r6 = r6.mo14299a()
            r5.add(r6)
            wm.d r6 = p262wm.C15521d.BaiduMap
            java.lang.String r6 = r6.mo14299a()
            r5.add(r6)
            wm.d r6 = p262wm.C15521d.AutonaviMap
            java.lang.String r6 = r6.mo14299a()
            r5.add(r6)
            java.lang.String r6 = "targetwhitelist"
            r4.putStringArrayListExtra(r6, r5)
            android.content.Intent r5 = new android.content.Intent
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$f r8 = r3.f23219g
            double r8 = r8.f23223a
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7[r2] = r8
            com.tencent.mm.plugin.webview.ui.tools.jsapi.w3$f r2 = r3.f23219g
            double r8 = r2.f23224b
            java.lang.Double r2 = java.lang.Double.valueOf(r8)
            r7[r1] = r2
            java.lang.String r2 = "geo:%f,%f"
            java.lang.String r2 = java.lang.String.format(r2, r7)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r7 = "android.intent.action.VIEW"
            r5.<init>(r7, r2)
            java.lang.String r2 = "targetintent"
            r4.putExtra(r2, r5)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r6)
            int r7 = r3.f23218f
            java.lang.String r8 = "key_map_app"
            r2.putInt(r8, r7)
            java.lang.String r7 = "key_target_intent"
            r2.putParcelable(r7, r5)
            java.lang.String r5 = "key_recommend_params"
            r4.putExtra(r5, r2)
            java.lang.String r2 = "type"
            r4.putExtra(r2, r6)
            r2 = 2131840275(0x7f114d13, float:1.9313825E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r5 = "title"
            r4.putExtra(r5, r2)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r2 = 33
            r0.mmStartActivityForResult(r3, r4, r2)
            goto L_0x0102
        L_0x0101:
            r1 = 0
        L_0x0102:
            if (r1 != 0) goto L_0x011e
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r13.f23152i
            int r1 = r13.f23151h
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$q0 r0 = r0.mo7189Y6(r1)
            com.tencent.mm.plugin.webview.stub.m r2 = r0.f22847b
            if (r2 == 0) goto L_0x011e
            t83.h1 r3 = r0.f22846a
            if (r3 == 0) goto L_0x011e
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r1 = r13.f23152i
            r5 = 0
            r6 = 1
            r7 = 1
            java.lang.String r4 = "openMapNavigateMenu:fail"
            com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler.m6158Q3(r1, r2, r3, r4, r5, r6, r7)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6303r0.run():void");
    }
}
