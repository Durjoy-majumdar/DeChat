package com.tencent.p014mm.plugin.webview.p128ui.tools.browser;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import m93.C34483g;
import m93.C46953a;
import nj3.C88989a;
import o93.C47345a;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/BrowserChooseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lo93/a;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI */
public final class BrowserChooseUI extends MMActivity implements C47345a {

    /* renamed from: d */
    public final C46953a f118710d = new C46953a(this);

    /* renamed from: e */
    public boolean f118711e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI$a */
    public static final class C43836a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BrowserChooseUI f118712d;

        public C43836a(BrowserChooseUI browserChooseUI) {
            this.f118712d = browserChooseUI;
        }

        public final void run() {
            C46953a aVar = this.f118712d.f118710d;
            aVar.mo72135c();
            C34483g.m40370a(aVar.f126252b, 1, aVar.f126254d);
        }
    }

    /* renamed from: E0 */
    public Intent mo68392E0() {
        return (Intent) getIntent().getParcelableExtra("targetintent");
    }

    /* renamed from: b4 */
    public void mo68393b4(int i, Intent intent) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        if (intent == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.BrowserChooseUI", "alvinluo BrowserDialog finishUI resultCode: %d, data == null: %b", objArr);
        setResult(i, intent);
        finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public Context getUIContext() {
        return getContext();
    }

    /* renamed from: o4 */
    public void mo68395o4(Dialog dialog, boolean z) {
        Log.m105919d("MicroMsg.BrowserChooseUI", "alvinluo showDialog dialog: %s, withAnimation: %b", dialog, Boolean.valueOf(z));
        if (dialog != null) {
            dialog.show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            super.onCreate(r19)
            r0 = r18
            m93.a r1 = r0.f118710d
            r1.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r1.f126252b = r2
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            o93.a r6 = r1.f126251a
            r7 = 0
            r5[r7] = r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r5[r3] = r2
            java.lang.String r2 = "MicroMsg.BrowserChooseController"
            java.lang.String r6 = "alvinluo onCreate uiModel: %s, sessionId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            java.util.List<m93.j> r5 = r1.f126253c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.clear()
            java.lang.String r5 = ""
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0045 }
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()     // Catch:{ Exception -> 0x0045 }
            r8 = 274528(0x43060, float:3.84696E-40)
            java.lang.Object r6 = r6.mo119684e(r8, r5)     // Catch:{ Exception -> 0x0045 }
            boolean r8 = r6 instanceof java.lang.String     // Catch:{ Exception -> 0x0045 }
            if (r8 == 0) goto L_0x0045
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0045 }
            r5 = r6
        L_0x0045:
            o93.a r6 = r1.f126251a
            android.content.Context r6 = r6.getUIContext()
            gy3.C87412m.m108591d(r6)
            o93.a r8 = r1.f126251a
            android.content.Intent r8 = r8.mo68392E0()
            m93.f r9 = m93.C46969f.f126279a
            r11 = 0
            if (r8 != 0) goto L_0x0060
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L_0x0211
        L_0x0060:
            java.lang.String r12 = "android.intent.category.BROWSABLE"
            r8.addCategory(r12)
            m93.f r12 = m93.C46969f.f126279a
            r12.getClass()
            android.net.Uri r12 = r8.getData()
            if (r12 == 0) goto L_0x0075
            java.lang.String r12 = r12.toString()
            goto L_0x0076
        L_0x0075:
            r12 = r11
        L_0x0076:
            if (r12 == 0) goto L_0x0081
            int r13 = r12.length()
            if (r13 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r13 = 0
            goto L_0x0082
        L_0x0081:
            r13 = 1
        L_0x0082:
            if (r13 != 0) goto L_0x00a3
            java.lang.String r13 = "https://view.inews.qq.com"
            boolean r13 = z04.C112551y.m153820t(r12, r13, r7, r4, r11)
            if (r13 != 0) goto L_0x0094
            java.lang.String r13 = "http://view.inews.qq.com"
            boolean r12 = z04.C112551y.m153819s(r12, r13, r7)
            if (r12 == 0) goto L_0x00a3
        L_0x0094:
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r8)
            java.lang.String r8 = "https://mp.weixin.qq.com"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r12.setData(r8)
            r8 = r12
        L_0x00a3:
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r12 < r13) goto L_0x00b6
            if (r6 == 0) goto L_0x00bf
            r12 = 131072(0x20000, float:1.83671E-40)
            java.util.List r6 = r6.queryIntentActivities(r8, r12)
            goto L_0x00c0
        L_0x00b6:
            if (r6 == 0) goto L_0x00bf
            r12 = 65536(0x10000, float:9.18355E-41)
            java.util.List r6 = r6.queryIntentActivities(r8, r12)
            goto L_0x00c0
        L_0x00bf:
            r6 = r11
        L_0x00c0:
            if (r6 != 0) goto L_0x00c7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x00c7:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r15 = "MicroMsg.BrowserChooseDialogHelper"
            java.util.Iterator r16 = r6.iterator()
        L_0x00e1:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x01bc
            java.lang.Object r17 = r16.next()
            r10 = r17
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10
            java.lang.Object[] r9 = new java.lang.Object[r3]
            if (r10 == 0) goto L_0x00fa
            android.content.pm.ActivityInfo r4 = r10.activityInfo
            if (r4 == 0) goto L_0x00fa
            java.lang.String r4 = r4.packageName
            goto L_0x00fb
        L_0x00fa:
            r4 = r11
        L_0x00fb:
            r9[r7] = r4
            java.lang.String r4 = "alvinluo filterBrowserList packageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r15, r4, r9)
            if (r10 != 0) goto L_0x0106
            goto L_0x01b8
        L_0x0106:
            android.content.pm.ActivityInfo r4 = r10.activityInfo
            if (r4 == 0) goto L_0x0111
            android.content.pm.ApplicationInfo r9 = r4.applicationInfo
            if (r9 == 0) goto L_0x0111
            int r9 = r9.flags
            goto L_0x0112
        L_0x0111:
            r9 = 0
        L_0x0112:
            r9 = r9 & r3
            if (r9 <= 0) goto L_0x0117
            r9 = 1
            goto L_0x0118
        L_0x0117:
            r9 = 0
        L_0x0118:
            if (r9 == 0) goto L_0x012e
            java.lang.Object[] r9 = new java.lang.Object[r3]
            if (r4 == 0) goto L_0x0121
            java.lang.String r4 = r4.packageName
            goto L_0x0122
        L_0x0121:
            r4 = r11
        L_0x0122:
            r9[r7] = r4
            java.lang.String r4 = "alvinluo filterBrowserList package: %s is system application"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r9)
            r13.add(r10)
            goto L_0x01b8
        L_0x012e:
            java.util.HashSet<java.lang.String> r9 = m93.C34484h.f92807a
            if (r4 == 0) goto L_0x0135
            java.lang.String r4 = r4.packageName
            goto L_0x0136
        L_0x0135:
            r4 = r11
        L_0x0136:
            java.util.HashSet<java.lang.String> r9 = m93.C34484h.f92807a
            java.lang.String r3 = "this as java.lang.String).toLowerCase()"
            if (r4 == 0) goto L_0x0144
            java.lang.String r4 = r4.toLowerCase()
            gy3.C87412m.m108593f(r4, r3)
            goto L_0x0145
        L_0x0144:
            r4 = r11
        L_0x0145:
            boolean r4 = sx3.C110818d0.m150903D(r9, r4)
            if (r4 == 0) goto L_0x0183
            android.content.pm.ActivityInfo r4 = r10.activityInfo
            if (r4 == 0) goto L_0x0152
            java.lang.String r4 = r4.packageName
            goto L_0x0153
        L_0x0152:
            r4 = r11
        L_0x0153:
            com.tencent.mm.pluginsdk.model.g1 r9 = m93.C46969f.f126280b
            if (r9 != 0) goto L_0x0165
            java.lang.Class<wm.c> r9 = p262wm.C22921c.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            wm.c r9 = (p262wm.C22921c) r9
            com.tencent.mm.pluginsdk.model.g1 r9 = r9.mo35881Q6(r7, r11)
            m93.C46969f.f126280b = r9
        L_0x0165:
            com.tencent.mm.pluginsdk.model.g1 r9 = m93.C46969f.f126280b
            gy3.C87412m.m108591d(r9)
            if (r4 == 0) goto L_0x0174
            java.lang.String r4 = r4.toLowerCase()
            gy3.C87412m.m108593f(r4, r3)
            goto L_0x0175
        L_0x0174:
            r4 = r11
        L_0x0175:
            boolean r3 = r9.mo25203i(r4)
            if (r3 == 0) goto L_0x017f
            r14.add(r10)
            goto L_0x01b8
        L_0x017f:
            r12.add(r10)
            goto L_0x01b8
        L_0x0183:
            boolean r4 = m93.C34484h.f92808b
            if (r4 == 0) goto L_0x01b5
            android.content.pm.ActivityInfo r4 = r10.activityInfo
            if (r4 == 0) goto L_0x018e
            java.lang.String r4 = r4.packageName
            goto L_0x018f
        L_0x018e:
            r4 = r11
        L_0x018f:
            java.util.HashSet<java.lang.String> r9 = m93.C34484h.f92809c
            if (r4 == 0) goto L_0x019b
            java.lang.String r4 = r4.toLowerCase()
            gy3.C87412m.m108593f(r4, r3)
            goto L_0x019c
        L_0x019b:
            r4 = r11
        L_0x019c:
            boolean r3 = sx3.C110818d0.m150903D(r9, r4)
            if (r3 == 0) goto L_0x01b5
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            android.content.pm.ActivityInfo r3 = r10.activityInfo
            if (r3 == 0) goto L_0x01ac
            java.lang.String r3 = r3.packageName
            goto L_0x01ad
        L_0x01ac:
            r3 = r11
        L_0x01ad:
            r4[r7] = r3
            java.lang.String r3 = "alvinluo filterBrowserList package: %s is in block list"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r4)
            goto L_0x01b8
        L_0x01b5:
            r8.add(r10)
        L_0x01b8:
            r3 = 1
            r4 = 2
            goto L_0x00e1
        L_0x01bc:
            r8.addAll(r7, r13)
            int r3 = r13.size()
            r8.addAll(r3, r14)
            int r3 = r13.size()
            int r4 = r14.size()
            int r3 = r3 + r4
            r8.addAll(r3, r12)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r6.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r7] = r4
            int r4 = r8.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            int r4 = r13.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 2
            r3[r6] = r4
            int r4 = r14.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 3
            r3[r6] = r4
            int r4 = r12.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 4
            r3[r6] = r4
            java.lang.String r4 = "alvinluo filterBrowserList resolveList: %s, finalList: %s, systemBrowserCount: %d, qqBrowserList: %s, filteredAllowList: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r3)
            r6 = r8
        L_0x0211:
            java.util.Iterator r3 = r6.iterator()
            r4 = 0
        L_0x0216:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0261
            java.lang.Object r8 = r3.next()
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            if (r8 != 0) goto L_0x0225
            goto L_0x0216
        L_0x0225:
            m93.j r9 = new m93.j
            r10 = 1
            r9.<init>(r10)
            r9.f126286b = r8
            o93.a r8 = r1.f126251a
            android.content.Context r8 = r8.getUIContext()
            gy3.C87412m.m108591d(r8)
            android.content.pm.ResolveInfo r10 = r9.f126286b
            java.lang.String r8 = m93.C46969f.m52277b(r8, r10)
            java.lang.String r10 = "<set-?>"
            gy3.C87412m.m108594g(r8, r10)
            r9.f126288d = r8
            android.content.pm.ResolveInfo r8 = r9.f126286b
            if (r8 == 0) goto L_0x024e
            android.content.pm.ActivityInfo r8 = r8.activityInfo
            if (r8 == 0) goto L_0x024e
            java.lang.String r8 = r8.packageName
            goto L_0x024f
        L_0x024e:
            r8 = r11
        L_0x024f:
            boolean r8 = z04.C112551y.m153809i(r5, r8, r7)
            if (r8 == 0) goto L_0x0257
            r1.f126255e = r4
        L_0x0257:
            java.util.List<m93.j> r8 = r1.f126253c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r9)
            int r4 = r4 + 1
            goto L_0x0216
        L_0x0261:
            java.util.List<m93.j> r3 = r1.f126253c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r1.f126254d = r3
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r5
            int r4 = r1.f126255e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            int r4 = r6.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r3[r5] = r4
            java.util.List<m93.j> r4 = r1.f126253c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "alvinluo initBrowserList defaultBrowser: %s, defaultBrowserIndex: %s, %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r3)
            java.util.List<m93.j> r2 = r1.f126253c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02ca
            o93.a r2 = r1.f126251a
            android.content.Context r2 = r2.getUIContext()
            o93.a r3 = r1.f126251a
            android.content.Context r3 = r3.getUIContext()
            if (r3 == 0) goto L_0x02be
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x02be
            r4 = 2131839968(0x7f114be0, float:1.9313202E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x02bf
        L_0x02be:
            r3 = r11
        L_0x02bf:
            android.widget.Toast r2 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r3, (int) r7)
            r2.show()
            r2 = 1
            r1.mo72134b(r2, r11)
        L_0x02ca:
            com.tencent.mm.ui.MMActivityController r1 = r18.getController()
            android.content.res.Resources r2 = r18.getResources()
            r3 = 2131101833(0x7f060889, float:1.7816087E38)
            int r2 = r2.getColor(r3)
            int r2 = com.tencent.p014mm.p136ui.C74933u4.m89764a(r2, r7)
            r1.mo177105z0(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.browser.BrowserChooseUI.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        if (!this.f118711e) {
            this.f118711e = true;
            C119179t tVar = C119157j.f356862d;
            C43836a aVar = new C43836a(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 50, false);
        }
    }
}
