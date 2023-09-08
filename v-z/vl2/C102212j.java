package vl2;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.qrcode.model.C94313a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C5176w;
import com.tencent.p014mm.plugin.scanner.model.C85412x;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.qbar.ScanIdentifyReportInfo;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import ht1.C60200t1;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;
import lu3.C34379c;
import ml2.C10931f;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p248ug.C78157d;
import p567iu.C98798b;
import p728vs.C52991e;
import p773yy.C66708h;
import p910lj.C76701a;
import qy2.C77444c0;
import sj0.C90210f;
import te3.C77917dy3;
import xk0.C91263b;
import zt3.C119157j;

/* renamed from: vl2.j */
public class C102212j implements C11385n, C94313a.C94323j, C90832f {

    /* renamed from: G */
    public static final String f300925G = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fm9) + "/qr/");

    /* renamed from: H */
    public static final String f300926H = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fm9) + "/sjt/qr");

    /* renamed from: A */
    public String f300927A;

    /* renamed from: B */
    public int f300928B;

    /* renamed from: C */
    public String f300929C;

    /* renamed from: D */
    public C34379c<?> f300930D = null;

    /* renamed from: E */
    public TimerTask f300931E = null;

    /* renamed from: F */
    public boolean f300932F = false;

    /* renamed from: I */
    public Application.ActivityLifecycleCallbacks f300933I;

    /* renamed from: d */
    public WeakReference<Activity> f300934d;

    /* renamed from: e */
    public int f300935e;

    /* renamed from: f */
    public String f300936f;

    /* renamed from: g */
    public String f300937g;

    /* renamed from: h */
    public int f300938h;

    /* renamed from: i */
    public int f300939i;

    /* renamed from: j */
    public String f300940j;

    /* renamed from: n */
    public boolean f300941n;

    /* renamed from: o */
    public boolean f300942o = false;

    /* renamed from: p */
    public int f300943p = -1;

    /* renamed from: q */
    public boolean f300944q = false;

    /* renamed from: r */
    public Bundle f300945r;

    /* renamed from: s */
    public ProgressDialog f300946s = null;

    /* renamed from: t */
    public C10931f.C10933a f300947t = null;

    /* renamed from: u */
    public C94528d f300948u = null;

    /* renamed from: v */
    public Map<C117747y, Integer> f300949v = new HashMap();

    /* renamed from: w */
    public int f300950w;

    /* renamed from: x */
    public String f300951x;

    /* renamed from: y */
    public String f300952y;

    /* renamed from: z */
    public String f300953z;

    /* renamed from: vl2.j$a */
    public class C27698a implements C94528d.C94529a {

        /* renamed from: a */
        public final /* synthetic */ C52991e f76717a;

        public C27698a(C52991e eVar) {
            this.f76717a = eVar;
        }

        /* renamed from: a */
        public void mo55548a(C94528d dVar) {
            C86709a0.m107524d().mo123458d((C117747y) this.f76717a);
            C10931f.C10933a aVar = C102212j.this.f300947t;
            if (aVar != null) {
                aVar.mo361b(1, (Bundle) null);
            }
        }
    }

    public C102212j() {
        Log.m105924i("MicroMsg.QBarStringHandler", "onResume");
        C86709a0.m107524d().mo123455a(106, this);
        C86709a0.m107524d().mo123455a(233, this);
        C86709a0.m107524d().mo123455a(C90210f.CTRL_INDEX, this);
        C86709a0.m107524d().mo123455a(C91263b.CTRL_INDEX, this);
        C86709a0.m107524d().mo123455a(3512, this);
        C86709a0.m107524d().mo123455a(7424, this);
        C86709a0.m107524d().mo123455a(5900, this);
    }

    /* renamed from: b */
    public static void m134665b(C102212j jVar, C117747y yVar) {
        jVar.getClass();
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (yVar.getType() == 233 || yVar.getType() == 106 || yVar.getType() == 1061) {
            Log.m105925i("MicroMsg.QBarStringHandler", "alvinluo OfflineScan onCancelScene processOfflineScan: %b, offlineScanNetworkType: %d", Boolean.valueOf(jVar.f300941n), Integer.valueOf(jVar.f300943p));
            C85412x xVar = C85412x.f248924a;
            String str = jVar.f300936f;
            String str2 = jVar.f300940j;
            int i = jVar.f300942o ? 2 : 1;
            boolean z = jVar.f300941n;
            xVar.mo118759a(str, str2, i, z ? jVar.f300943p : 3, z ? 1 : 0);
        }
    }

    /* renamed from: h */
    public static int m134666h(int i) {
        if (i == 30 || i == 37 || i == 38 || i == 40) {
            return 13;
        }
        if (i == 4 || i == 47) {
            return 12;
        }
        return i == 34 ? 24 : 0;
    }

    /* renamed from: a */
    public final void mo141739a(Activity activity, int i, String str, boolean z) {
        Log.m105925i("MicroMsg.QBarStringHandler", "start search contact %s", str);
        C98798b bVar = (C98798b) C86312j.m106911c(C98798b.class);
        int i2 = 2;
        if (i != 2) {
            i2 = 1;
        }
        C117747y n602 = bVar.n60(str, i2, 5, z);
        ((HashMap) this.f300949v).put(n602, 1);
        C86709a0.m107524d().mo123460f(n602);
        C102213k kVar = new C102213k(this, n602);
        if (activity == null) {
            return;
        }
        if (!z || !this.f300932F) {
            mo141758u(activity.getString(C0966R.string.f361235id1), kVar);
        } else {
            mo141744g(activity.getString(C0966R.string.f361235id1), kVar);
        }
    }

    /* renamed from: c */
    public void mo141740c() {
        Log.m105924i("MicroMsg.QBarStringHandler", "cancel Deal");
        this.f300936f = null;
        WeakReference<Activity> weakReference = this.f300934d;
        if (weakReference != null) {
            weakReference.clear();
            this.f300934d = null;
        }
        Log.m105924i("MicroMsg.QBarStringHandler", "onPause");
        C86709a0.m107524d().mo123470p(106, this);
        C86709a0.m107524d().mo123470p(233, this);
        C86709a0.m107524d().mo123470p(C90210f.CTRL_INDEX, this);
        C86709a0.m107524d().mo123470p(C91263b.CTRL_INDEX, this);
        C86709a0.m107524d().mo123470p(3512, this);
        C86709a0.m107524d().mo123470p(7424, this);
        C86709a0.m107524d().mo123470p(5900, this);
    }

    /* renamed from: d */
    public final void mo141741d() {
        Log.m105924i("MicroMsg.QBarStringHandler", "alvinluo cancelLoading");
        C94528d dVar = this.f300948u;
        if (dVar != null) {
            ((BaseScanUI) dVar).mo24310k8(false, false, (C94528d.C94529a) null);
        }
        ProgressDialog progressDialog = this.f300946s;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f300946s.dismiss();
        }
        C34379c<?> cVar = this.f300930D;
        if (cVar != null) {
            cVar.cancel(false);
        }
        TimerTask timerTask = this.f300931E;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0315  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141742e(android.app.Activity r34, java.lang.String r35, int r36, int r37, java.lang.String r38, int r39, int r40, ml2.C10931f.C10933a r41, com.tencent.p014mm.plugin.scanner.view.C94528d r42, android.os.Bundle r43, int r44, boolean r45, int r46, boolean r47, com.tencent.qbar.ScanIdentifyReportInfo r48) {
        /*
            r33 = this;
            r0 = r33
            r2 = r34
            r11 = r35
            r5 = r36
            r1 = r37
            r3 = r38
            r9 = r39
            r10 = r40
            r12 = r43
            r4 = r45
            r6 = r47
            r13 = r48
            java.lang.Class<ie3.c> r14 = ie3.C76324c.class
            java.lang.Class<xz.f> r15 = p275xz.C15919f.class
            r7 = 9
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r11
            java.lang.Integer r16 = java.lang.Integer.valueOf(r36)
            r8 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r7[r8] = r16
            r8 = 2
            r7[r8] = r3
            java.lang.Integer r18 = java.lang.Integer.valueOf(r40)
            r8 = 3
            r7[r8] = r18
            java.lang.Integer r18 = java.lang.Integer.valueOf(r37)
            r8 = 4
            r7[r8] = r18
            java.lang.Integer r18 = java.lang.Integer.valueOf(r44)
            r8 = 5
            r7[r8] = r18
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r45)
            r8 = 6
            r7[r8] = r18
            ob0.b0 r18 = f40.C86709a0.m107524d()
            int r18 = r18.mo123467m()
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r22 = 7
            r7[r22] = r18
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r47)
            r23 = 8
            r7[r23] = r18
            java.lang.String r8 = "MicroMsg.QBarStringHandler"
            r23 = r13
            java.lang.String r13 = "dealQBarString %s, source:%d, codeType: %s, codeVersion: %s, getA8KeyScene: %d, scanEntryScene: %d, processOfflineScan: %b, networkStatus: %d, isFromScanUI: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r7)
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r2)
            r0.f300934d = r7
            r0.f300935e = r5
            r0.f300936f = r11
            r0.f300938h = r9
            r0.f300939i = r10
            r0.f300940j = r3
            r3 = r41
            r0.f300947t = r3
            r0.f300945r = r12
            r0.f300941n = r4
            r0.f300944q = r6
            r3 = 1
            if (r5 != r3) goto L_0x008e
            r3 = 1
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            r0.f300942o = r3
            r3 = r46
            r0.f300943p = r3
            r3 = r42
            r0.f300948u = r3
            java.lang.String r13 = "stat_url"
            java.lang.String r7 = ""
            if (r12 == 0) goto L_0x00a7
            java.lang.String r3 = r12.getString(r13, r7)
            r24 = r3
            goto L_0x00a9
        L_0x00a7:
            r24 = r7
        L_0x00a9:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r35)
            if (r3 == 0) goto L_0x00b6
            java.lang.String r1 = "qbarstring is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            return
        L_0x00b6:
            java.lang.ref.WeakReference<android.app.Activity> r3 = r0.f300934d
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            android.content.Context r25 = r3.getApplicationContext()
            r38 = r13
            r13 = r25
            android.app.Application r13 = (android.app.Application) r13
            vl2.j$$q r1 = new vl2.j$$q
            r1.<init>(r0, r2)
            r0.f300933I = r1
            r13.registerActivityLifecycleCallbacks(r1)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            int r1 = r1.mo123467m()
            if (r1 != 0) goto L_0x01bd
            boolean r14 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r3)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x0104
            boolean r1 = r0.mo141748l(r11)
            if (r1 == 0) goto L_0x00f7
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r4 = "key_offline_scan_show_tips"
            r15 = 0
            r1.putBoolean(r4, r15)
            goto L_0x00f9
        L_0x00f7:
            r15 = 0
            r1 = 0
        L_0x00f9:
            ml2.f$a r4 = r0.f300947t
            r4.mo361b(r15, r1)
            ml2.f$a r4 = r0.f300947t
            r15 = 6
            r4.mo361b(r15, r1)
        L_0x0104:
            if (r14 == 0) goto L_0x0108
            r15 = 2
            goto L_0x0109
        L_0x0108:
            r15 = 1
        L_0x0109:
            boolean r1 = r0.f300941n
            r4 = 2131835272(0x7f113988, float:1.9303678E38)
            if (r1 != 0) goto L_0x0180
            vl2.i r13 = vl2.C37755i.f100002a
            if (r6 == 0) goto L_0x0180
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)
            r16 = 0
            r1[r16] = r6
            java.lang.String r6 = "alvinluo dealQBarString network unavailable and deal with offline, isConnected: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r6, r1)
            boolean r1 = r0.mo141748l(r11)
            if (r1 != 0) goto L_0x0162
            com.tencent.mm.plugin.scanner.model.OfflineScanContext r8 = new com.tencent.mm.plugin.scanner.model.OfflineScanContext
            java.lang.String r7 = r0.f300940j
            boolean r6 = r0.f300942o
            r1 = r8
            r2 = r34
            r12 = r3
            r3 = r15
            r11 = 2131835272(0x7f113988, float:1.9303678E38)
            r4 = r35
            r5 = r36
            r17 = r6
            r6 = r39
            r9 = r7
            r7 = r40
            r26 = r8
            r10 = 0
            r8 = r9
            r9 = r17
            r10 = r43
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 == 0) goto L_0x0155
            java.lang.String r1 = r12.getString(r11)
            goto L_0x015c
        L_0x0155:
            r1 = 2131835275(0x7f11398b, float:1.9303684E38)
            java.lang.String r1 = r12.getString(r1)
        L_0x015c:
            r2 = r26
            r10 = 0
            r13.mo61325b(r2, r1, r10)
        L_0x0162:
            com.tencent.mm.plugin.scanner.model.x r1 = com.tencent.p014mm.plugin.scanner.model.C85412x.f248924a
            java.lang.String r2 = r0.f300940j
            boolean r3 = r0.f300942o
            if (r3 == 0) goto L_0x016d
            r27 = 2
            goto L_0x016f
        L_0x016d:
            r27 = 1
        L_0x016f:
            r3 = 0
            r36 = r1
            r37 = r35
            r38 = r2
            r39 = r27
            r40 = r15
            r41 = r3
            r36.mo118759a(r37, r38, r39, r40, r41)
            goto L_0x01bc
        L_0x0180:
            r12 = r3
            r10 = 0
            r11 = 2131835272(0x7f113988, float:1.9303678E38)
            if (r1 == 0) goto L_0x01ae
            if (r6 == 0) goto L_0x01ae
            if (r14 == 0) goto L_0x0190
            java.lang.String r1 = r12.getString(r11)
            goto L_0x0197
        L_0x0190:
            r1 = 2131835275(0x7f11398b, float:1.9303684E38)
            java.lang.String r1 = r12.getString(r1)
        L_0x0197:
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.String r3 = "showMsg"
            gy3.C87412m.m108594g(r1, r3)
            r3 = 2131821557(0x7f1103f5, float:1.927586E38)
            java.lang.String r3 = r2.getString(r3)
            r4 = 0
            nj3.C76879j.m92754y(r2, r1, r7, r3, r4)
            goto L_0x01bc
        L_0x01ae:
            r1 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r1 = r2.getString(r1)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r1, (int) r10)
            r1.show()
        L_0x01bc:
            return
        L_0x01bd:
            r12 = r3
            r1 = 6
            r10 = 0
            java.lang.String r3 = "weixin://qr/"
            r11 = r35
            boolean r3 = r11.startsWith(r3)
            if (r3 == 0) goto L_0x01e3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r13 = 12
            java.lang.String r13 = r11.substring(r13)
            r3.append(r13)
            java.lang.String r13 = "@qr"
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            goto L_0x01e4
        L_0x01e3:
            r3 = r7
        L_0x01e4:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r13 != 0) goto L_0x01ee
            r0.mo141739a(r2, r5, r3, r10)
            return
        L_0x01ee:
            boolean r3 = r0.mo141748l(r11)
            if (r3 == 0) goto L_0x021a
            java.lang.String r3 = "alvinluo dealQBarString isPayCode and report"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            if (r4 != 0) goto L_0x021a
            if (r6 == 0) goto L_0x021a
            com.tencent.mm.plugin.scanner.model.x r3 = com.tencent.p014mm.plugin.scanner.model.C85412x.f248924a
            java.lang.String r5 = r0.f300940j
            boolean r4 = r0.f300942o
            if (r4 == 0) goto L_0x0207
            r6 = 2
            goto L_0x0208
        L_0x0207:
            r6 = 1
        L_0x0208:
            r13 = 4
            r16 = 0
            r4 = r35
            r1 = r7
            r7 = r13
            r28 = r8
            r13 = 3
            r21 = 4
            r8 = r16
            r3.mo118759a(r4, r5, r6, r7, r8)
            goto L_0x0220
        L_0x021a:
            r1 = r7
            r28 = r8
            r13 = 3
            r21 = 4
        L_0x0220:
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r3[r10] = r11
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r8 = 1
            r3[r8] = r4
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = "qbarString: %s, auth native: %s, remittance: %s"
            r6 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r4, r3)
            java.lang.String r3 = "weixin://wxpay/bizpayurl"
            boolean r3 = r11.startsWith(r3)
            java.lang.String r4 = "pay_qrcode_timeline_objid"
            java.lang.String r5 = "pay_qrcode_session_name"
            java.lang.String r8 = "pay_qrcode_session_type"
            java.lang.String r7 = "stat_send_msg_user"
            java.lang.String r13 = "stat_chat_talker_username"
            r10 = 11
            if (r3 == 0) goto L_0x0315
            java.lang.String r1 = "do native pay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x025c
            r2 = 0
            r3 = 5
            r1.mo361b(r3, r2)
        L_0x025c:
            int r1 = r0.f300935e
            int r1 = r0.mo141753p(r1)
            int r2 = m134666h(r1)
            com.tencent.mm.autogen.events.PayAuthNativeEvent r3 = new com.tencent.mm.autogen.events.PayAuthNativeEvent
            r3.<init>()
            com.tencent.mm.autogen.events.PayAuthNativeEvent$a r9 = r3.f193807d
            r9.f193809a = r11
            r9.f193811c = r2
            r9.f193810b = r1
            r9.f193812d = r12
            r1 = r12
            r12 = r43
            if (r12 == 0) goto L_0x02b9
            java.lang.String r9 = r12.getString(r13)
            java.lang.String r7 = r12.getString(r7)
            int r13 = r0.f300928B
            rx3.l r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.m84831b(r13, r9, r7)
            com.tencent.mm.autogen.events.PayAuthNativeEvent$a r9 = r3.f193807d
            A r13 = r7.f38555d
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r9.f193815g = r13
            com.tencent.mm.autogen.events.PayAuthNativeEvent$a r9 = r3.f193807d
            B r7 = r7.f38556e
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9.f193816h = r7
            com.tencent.mm.autogen.events.PayAuthNativeEvent$a r7 = r3.f193807d
            r9 = 0
            int r8 = r12.getInt(r8, r9)
            r7.f193817i = r8
            com.tencent.mm.autogen.events.PayAuthNativeEvent$a r7 = r3.f193807d
            java.lang.String r5 = r12.getString(r5)
            r7.f193818j = r5
            com.tencent.mm.autogen.events.PayAuthNativeEvent$a r5 = r3.f193807d
            java.lang.String r4 = r12.getString(r4)
            r5.f193819k = r4
        L_0x02b9:
            r4 = 13
            if (r2 != r4) goto L_0x02cc
            java.lang.String r2 = "add source and sourceType"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            com.tencent.mm.autogen.events.PayAuthNativeEvent$a r2 = r3.f193807d
            java.lang.String r4 = r0.f300953z
            r2.f193814f = r4
            int r4 = r0.f300950w
            r2.f193813e = r4
        L_0x02cc:
            vl2.j$$r r2 = new vl2.j$$r
            r2.<init>(r0, r1, r3)
            r3.callback = r2
            android.os.Looper r1 = android.os.Looper.myLooper()
            r3.asyncPublish((android.os.Looper) r1)
            di3.d r1 = di3.C86312j.m106911c(r14)
            ie3.c r1 = (ie3.C76324c) r1
            boolean r1 = r1.TenPaySDKABTestKindaEnable()
            if (r1 != 0) goto L_0x02f9
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>((android.os.Looper) r2)
            vl2.j$$s r2 = new vl2.j$$s
            r2.<init>(r0, r3)
            r3 = 10000(0x2710, double:4.9407E-320)
            r1.postDelayed(r2, r3)
        L_0x02f9:
            r0.mo141754q(r10)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r4
            r4 = 1
            r2[r4] = r11
            r2[r3] = r24
            r3 = 16472(0x4058, float:2.3082E-41)
            r1.mo160131h(r3, r2)
            goto L_0x08f2
        L_0x0315:
            r41 = r12
            r3 = 5
            r12 = r43
            java.lang.String r10 = "https://wx.tenpay.com/f2f"
            boolean r10 = r11.startsWith(r10)
            java.lang.String r3 = "qrcode_sender_username"
            r36 = r3
            java.lang.String r3 = "pay_qrcode_sender_username"
            r42 = r3
            java.lang.String r3 = "send_type"
            r47 = r4
            java.lang.String r4 = "chat_type"
            if (r10 != 0) goto L_0x084b
            java.lang.String r10 = "wxp://f2f"
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x033e
            goto L_0x084b
        L_0x033e:
            java.lang.String r10 = "wxp://wbf2f"
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x0393
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x0350
            r2 = 5
            r3 = 0
            r1.mo361b(r2, r3)
        L_0x0350:
            int r1 = r0.f300935e
            int r1 = r0.mo141753p(r1)
            int r1 = m134666h(r1)
            di3.d r2 = di3.C86312j.m106911c(r15)
            xz.f r2 = (p275xz.C15919f) r2
            r3 = 6
            r4 = 0
            r36 = r2
            r37 = r41
            r38 = r3
            r39 = r35
            r40 = r1
            r41 = r4
            r36.mo14568d9(r37, r38, r39, r40, r41)
            r1 = 0
            r2 = 1
            r0.mo141750n(r2, r1)
            r1 = 11
            r0.mo141754q(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            r4[r2] = r11
            r2 = 2
            r4[r2] = r24
            r2 = 16472(0x4058, float:2.3082E-41)
            r1.mo160131h(r2, r4)
            goto L_0x08f2
        L_0x0393:
            r10 = 22
            if (r9 != r10) goto L_0x044a
            java.lang.String r10 = "m"
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x044a
            java.lang.String r1 = "go to reward"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x03ae
            r2 = 5
            r3 = 0
            r1.mo361b(r2, r3)
        L_0x03ae:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryScanPayReward
            vl2.j$$u r2 = new vl2.j$$u
            r2.<init>(r0)
            r10 = r41
            boolean r1 = r1.checkAvailable(r10, r2)
            if (r1 != 0) goto L_0x03be
            return
        L_0x03be:
            int r1 = r0.f300935e
            int r1 = r0.mo141753p(r1)
            int r1 = m134666h(r1)
            int r2 = r0.f300928B
            r3 = 37
            if (r2 != r3) goto L_0x03d1
            r21 = 2
            goto L_0x03df
        L_0x03d1:
            r3 = 38
            if (r2 != r3) goto L_0x03d8
            r21 = 3
            goto L_0x03df
        L_0x03d8:
            r3 = 40
            if (r2 != r3) goto L_0x03dd
            goto L_0x03df
        L_0x03dd:
            r21 = 1
        L_0x03df:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            if (r12 == 0) goto L_0x0410
            java.lang.String r3 = r12.getString(r13)
            java.lang.String r4 = r12.getString(r7)
            int r5 = r0.f300928B
            rx3.l r3 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.m84831b(r5, r3, r4)
            A r4 = r3.f38555d
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r5 = "key_chat_type"
            r2.putInt(r5, r4)
            B r3 = r3.f38556e
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r4 = "key_send_type"
            r2.putInt(r4, r3)
        L_0x0410:
            di3.d r3 = di3.C86312j.m106911c(r15)
            xz.f r3 = (p275xz.C15919f) r3
            r36 = r3
            r37 = r10
            r38 = r35
            r39 = r1
            r40 = r24
            r41 = r21
            r42 = r2
            r36.lm0(r37, r38, r39, r40, r41, r42)
            r1 = 0
            r2 = 1
            r0.mo141750n(r2, r1)
            r1 = 11
            r0.mo141754q(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            r3[r2] = r11
            r2 = 2
            r3[r2] = r24
            r2 = 16472(0x4058, float:2.3082E-41)
            r1.mo160131h(r2, r3)
            goto L_0x08f2
        L_0x044a:
            r10 = r41
            r18 = r15
            java.lang.String r15 = f300925G
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x07ea
            java.lang.String r15 = "https://payapp.wechatpay.cn/qr/"
            boolean r15 = r11.startsWith(r15)
            if (r15 == 0) goto L_0x0460
            goto L_0x07ea
        L_0x0460:
            java.lang.String r15 = f300926H
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x0762
            java.lang.String r15 = "https://payapp.wechatpay.cn/sjt/qr/"
            boolean r15 = r11.startsWith(r15)
            if (r15 == 0) goto L_0x0472
            goto L_0x0762
        L_0x0472:
            r15 = 22
            if (r9 != r15) goto L_0x04fc
            java.lang.String r3 = "n"
            boolean r3 = r11.startsWith(r3)
            if (r3 == 0) goto L_0x04fc
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryScanPayReward
            vl2.j$$v r2 = new vl2.j$$v
            r2.<init>(r0)
            boolean r1 = r1.checkAvailable(r10, r2)
            if (r1 != 0) goto L_0x0496
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x0495
            r2 = 5
            r3 = 0
            r1.mo361b(r2, r3)
        L_0x0495:
            return
        L_0x0496:
            r2 = 5
            r3 = 0
            java.lang.String r1 = "qr reward pay material"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x04a5
            r1.mo361b(r2, r3)
        L_0x04a5:
            int r1 = r0.f300935e
            int r1 = r0.mo141753p(r1)
            int r2 = m134666h(r1)
            com.tencent.mm.autogen.events.ScanMaterialCodeEvent r3 = new com.tencent.mm.autogen.events.ScanMaterialCodeEvent
            r3.<init>()
            com.tencent.mm.autogen.events.ScanMaterialCodeEvent$a r4 = r3.f265075d
            r4.f265077a = r11
            r4.f265078b = r1
            r5 = 1
            r4.f265079c = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r10)
            r4.f265080d = r5
            com.tencent.mm.autogen.events.ScanMaterialCodeEvent$a r4 = r3.f265075d
            vl2.j$$w r5 = new vl2.j$$w
            r36 = r5
            r37 = r33
            r38 = r3
            r39 = r10
            r40 = r2
            r41 = r24
            r42 = r1
            r36.<init>(r37, r38, r39, r40, r41, r42)
            r4.f265081e = r5
            r3.publish()
            r1 = 11
            r0.mo141754q(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r11
            r3 = 2
            r2[r3] = r24
            r3 = 16472(0x4058, float:2.3082E-41)
            r1.mo160131h(r3, r2)
            goto L_0x08f2
        L_0x04fc:
            java.lang.String r3 = "weixin://wxpay/bindurl"
            boolean r3 = r11.startsWith(r3)
            if (r3 == 0) goto L_0x052d
            java.lang.String r1 = "fast bind card qrcode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x0513
            r2 = 5
            r3 = 0
            r1.mo361b(r2, r3)
        L_0x0513:
            int r1 = r0.f300935e
            int r1 = r0.mo141753p(r1)
            int r1 = m134666h(r1)
            di3.d r2 = di3.C86312j.m106911c(r14)
            ie3.c r2 = (ie3.C76324c) r2
            vl2.j$$c r3 = new vl2.j$$c
            r3.<init>(r0)
            r2.startFastBindUseCase(r11, r1, r3)
            goto L_0x08f2
        L_0x052d:
            java.lang.String r3 = "weixin://rtos_authcode"
            boolean r3 = r11.startsWith(r3)
            if (r3 == 0) goto L_0x05b8
            java.lang.String r1 = "rtos watch prefix"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x0545
            r2 = 5
            r3 = 0
            r1.mo361b(r2, r3)
        L_0x0545:
            java.lang.Class<ln.g> r1 = p196ln.C76706g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.g r1 = (p196ln.C76706g) r1
            ln.k r1 = r1.mo106826RE()
            f40.e r2 = f40.C86709a0.m107523b()
            java.lang.String r2 = r2.mo121112j()
            com.tencent.mm.modelavatar.AvatarStorage r1 = (com.tencent.p014mm.modelavatar.AvatarStorage) r1
            r3 = 0
            java.lang.String r1 = r1.mo93559h(r2, r3)
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r1, r3)
            java.lang.String r2 = r0.f300936f
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "mac"
            java.lang.String r4 = r2.getQueryParameter(r3)
            java.lang.String r5 = "nat"
            java.lang.String r5 = r2.getQueryParameter(r5)
            java.lang.String r6 = "js"
            java.lang.String r6 = r2.getQueryParameter(r6)
            java.lang.String r7 = "type"
            java.lang.String r2 = r2.getQueryParameter(r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "avatar"
            r7.putExtra(r8, r1)
            r7.putExtra(r3, r4)
            if (r5 == 0) goto L_0x059b
            java.lang.String r1 = "native_ver"
            r7.putExtra(r1, r5)
        L_0x059b:
            if (r6 == 0) goto L_0x05a3
            java.lang.String r1 = "jsapp_ver"
            r7.putExtra(r1, r6)
        L_0x05a3:
            if (r2 == 0) goto L_0x05aa
            java.lang.String r1 = "channel_type"
            r7.putExtra(r1, r2)
        L_0x05aa:
            java.lang.String r1 = "exdevice"
            java.lang.String r2 = "com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI"
            r3 = 0
            ke3.C88144b.m109791i(r10, r1, r2, r7, r3)
            r1 = 0
            r0.mo141756s(r1)
            goto L_0x08f2
        L_0x05b8:
            java.lang.String r3 = "wxhb://f2f"
            boolean r3 = r11.startsWith(r3)
            if (r3 == 0) goto L_0x061f
            java.lang.String r1 = "scan f2f hb url"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r1 = 19
            if (r9 == r1) goto L_0x05cc
            return
        L_0x05cc:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryScanFace2Face
            vl2.j$$d r2 = new vl2.j$$d
            r2.<init>(r0)
            boolean r1 = r1.checkAvailable(r10, r2)
            if (r1 != 0) goto L_0x05e3
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x05e2
            r3 = 5
            r14 = 0
            r1.mo361b(r3, r14)
        L_0x05e2:
            return
        L_0x05e3:
            r3 = 5
            r14 = 0
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x05ec
            r1.mo361b(r3, r14)
        L_0x05ec:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "key_share_url"
            r1.putExtra(r2, r11)
            r2 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r3 = "luckymoney"
            java.lang.String r4 = ".f2f.ui.LuckyMoneyF2FReceiveUI"
            ke3.C88144b.m109795m(r10, r3, r4, r1, r2)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r11
            r3 = 2
            r2[r3] = r24
            r3 = 16472(0x4058, float:2.3082E-41)
            r1.mo160131h(r3, r2)
            r1 = 11
            r0.mo141754q(r1)
            goto L_0x08f2
        L_0x061f:
            r3 = 5
            r14 = 0
            com.tencent.mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key r4 = new com.tencent.mm.plugin.scanner.EventScanCodeTryPreloadWxaAttrsBeforeA8Key
            r4.<init>()
            r4.f248892d = r2
            r4.f248893e = r11
            r4.f248894f = r9
            r10 = r40
            r4.f248895g = r10
            r4.publish()
            java.lang.String r4 = r0.f300927A
            r15 = r37
            if (r15 <= 0) goto L_0x063a
            goto L_0x0646
        L_0x063a:
            int r5 = r0.f300928B
            if (r5 <= 0) goto L_0x063f
            goto L_0x0645
        L_0x063f:
            int r5 = r0.f300935e
            int r5 = r0.mo141753p(r5)
        L_0x0645:
            r15 = r5
        L_0x0646:
            r12 = 3
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r8 = 0
            r5[r8] = r11
            int r8 = r0.f300935e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r16 = 1
            r5[r16] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r18 = 2
            r5[r18] = r8
            java.lang.String r8 = "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r5)
            android.os.Bundle r5 = r0.f300945r
            if (r5 == 0) goto L_0x06b3
            java.lang.String r5 = r5.getString(r7)
            android.os.Bundle r7 = r0.f300945r
            java.lang.String r8 = "stat_msg_id"
            java.lang.String r7 = r7.getString(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x0689
            java.lang.String r8 = "msg_"
            java.lang.String r7 = r7.replace(r8, r1)
            java.lang.String r8 = "sns_"
            java.lang.String r7 = r7.replace(r8, r1)
            goto L_0x068a
        L_0x0689:
            r7 = r1
        L_0x068a:
            android.os.Bundle r1 = r0.f300945r
            java.lang.String r1 = r1.getString(r13)
            android.os.Bundle r8 = r0.f300945r
            java.lang.String r13 = "wxappPathWithQuery"
            java.lang.String r8 = r8.getString(r13)
            android.os.Bundle r13 = r0.f300945r
            r3 = r38
            java.lang.String r3 = r13.getString(r3)
            if (r4 != 0) goto L_0x06ac
            android.os.Bundle r4 = r0.f300945r
            java.lang.String r13 = "stat_app_id"
            java.lang.String r4 = r4.getString(r13)
        L_0x06ac:
            r13 = r3
            r19 = r5
            r20 = r7
            r5 = r1
            goto L_0x06ba
        L_0x06b3:
            r5 = r1
            r8 = r5
            r13 = r8
            r19 = r13
            r20 = r19
        L_0x06ba:
            r1 = r4
            java.lang.Class<vs.d> r3 = p728vs.C52990d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            vs.d r3 = (p728vs.C52990d) r3
            r7 = 0
            int r22 = qe3.C12212g.m11775a()
            r4 = 0
            byte[] r12 = new byte[r4]
            r24 = 0
            r4 = r35
            r11 = r6
            r6 = r15
            r15 = 2
            r29 = r8
            r15 = 1
            r8 = r39
            r9 = r40
            r10 = r1
            r30 = r11
            r11 = r22
            r16 = 3
            r31 = r13
            r14 = r23
            r13 = r19
            r32 = r14
            r14 = r20
            vs.e r3 = r3.mo73573Kx(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r4 = r0.f300935e
            if (r4 == 0) goto L_0x06fd
            if (r4 == r15) goto L_0x06fb
            r5 = 2
            if (r4 == r5) goto L_0x06f9
            r8 = 0
            goto L_0x06fe
        L_0x06f9:
            r8 = 3
            goto L_0x06fe
        L_0x06fb:
            r8 = 2
            goto L_0x06fe
        L_0x06fd:
            r8 = 1
        L_0x06fe:
            r3.mo63056J(r8)
            r4 = r31
            if (r4 == 0) goto L_0x0710
            java.lang.String r5 = "http"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0710
            r3.mo63081q(r4)
        L_0x0710:
            r5 = r29
            r3.mo63067b0(r5)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r9 = 0
            r6[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r6[r15] = r4
            r4 = 2
            r6[r4] = r5
            r5 = 3
            r6[r5] = r1
            java.lang.String r1 = "getA8Key currentUrl:%s, qBarScene: %d, wxaPathWithQuery: %s, appId=%s"
            r14 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r6)
            java.util.Map<ob0.y, java.lang.Integer> r1 = r0.f300949v
            r4 = r3
            ob0.y r4 = (ob0.C117747y) r4
            java.util.HashMap r1 = (java.util.HashMap) r1
            r6 = r32
            r1.put(r4, r6)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r4)
            android.app.ProgressDialog r1 = r0.f300946s
            if (r1 == 0) goto L_0x0748
            r1.dismiss()
        L_0x0748:
            r1 = 2131834310(0x7f1135c6, float:1.9301727E38)
            java.lang.String r1 = r2.getString(r1)
            vl2.j$$i r2 = new vl2.j$$i
            r2.<init>(r0, r3)
            r0.mo141758u(r1, r2)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x08f2
            r2 = 5
            r6 = 0
            r1.mo361b(r2, r6)
            goto L_0x08f2
        L_0x0762:
            r1 = r37
            r14 = r6
            r2 = 5
            r6 = 0
            r9 = 0
            java.lang.String r15 = "merchant pay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            ml2.f$a r14 = r0.f300947t
            if (r14 == 0) goto L_0x0775
            r14.mo361b(r2, r6)
        L_0x0775:
            int r2 = r0.f300935e
            int r2 = r0.mo141753p(r2)
            int r2 = m134666h(r2)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            java.lang.String r15 = "qrcodeUrl"
            r14.putString(r15, r11)
            if (r12 == 0) goto L_0x07db
            java.lang.String r11 = r12.getString(r13)
            java.lang.String r7 = r12.getString(r7)
            int r13 = r0.f300928B
            rx3.l r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.m84831b(r13, r11, r7)
            A r11 = r7.f38555d
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r14.putInt(r4, r11)
            B r4 = r7.f38556e
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r14.putInt(r3, r4)
            int r3 = r12.getInt(r8, r9)
            java.lang.String r4 = "qrcodeSessionType"
            r14.putInt(r4, r3)
            java.lang.String r3 = r12.getString(r5)
            java.lang.String r4 = "qrcodeSessionName"
            r14.putString(r4, r3)
            r3 = r47
            java.lang.String r3 = r12.getString(r3)
            java.lang.String r4 = "qrcodeTimelineObjId"
            r14.putString(r4, r3)
            r8 = r42
            java.lang.String r3 = r12.getString(r8)
            r15 = r36
            r14.putString(r15, r3)
        L_0x07db:
            di3.d r3 = di3.C86312j.m106911c(r18)
            xz.f r3 = (p275xz.C15919f) r3
            r4 = 1
            r3.fu0(r10, r2, r1, r14)
            r0.mo141750n(r4, r6)
            goto L_0x08f2
        L_0x07ea:
            r14 = r6
            r2 = 5
            r4 = 1
            r5 = 3
            r6 = 0
            r9 = 0
            java.lang.String r1 = "f2f pay material"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
            ml2.f$a r1 = r0.f300947t
            if (r1 == 0) goto L_0x07fc
            r1.mo361b(r2, r6)
        L_0x07fc:
            int r1 = r0.f300935e
            int r1 = r0.mo141753p(r1)
            int r1 = m134666h(r1)
            di3.d r3 = di3.C86312j.m106911c(r18)
            xz.f r3 = (p275xz.C15919f) r3
            r7 = 1
            r8 = 0
            r36 = r3
            r37 = r10
            r38 = r7
            r39 = r35
            r40 = r1
            r41 = r8
            r36.mo14568d9(r37, r38, r39, r40, r41)
            r0.mo141750n(r4, r6)
            r1 = 11
            r0.mo141754q(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r9] = r2
            r3[r4] = r11
            r2 = 2
            r3[r2] = r24
            r2 = 16472(0x4058, float:2.3082E-41)
            r1.mo160131h(r2, r3)
            r1 = r48
            if (r1 == 0) goto L_0x08f2
            zt3.t r2 = zt3.C119157j.f356862d
            qs3.c r3 = new qs3.c
            r3.<init>(r1, r11)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r3)
            goto L_0x08f2
        L_0x084b:
            r10 = r41
            r8 = r42
            r1 = r48
            r14 = r6
            r18 = r15
            r6 = r23
            r2 = 5
            r9 = 0
            r15 = r36
            java.lang.String r5 = "go to payment code"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r5)
            ml2.f$a r5 = r0.f300947t
            if (r5 == 0) goto L_0x0866
            r5.mo361b(r2, r9)
        L_0x0866:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryScanPayCode
            vl2.j$$t r5 = new vl2.j$$t
            r5.<init>(r0)
            boolean r2 = r2.checkAvailable(r10, r5)
            if (r2 != 0) goto L_0x0874
            return
        L_0x0874:
            int r2 = r0.f300935e
            int r2 = r0.mo141753p(r2)
            int r2 = m134666h(r2)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r12 == 0) goto L_0x08b0
            java.lang.String r13 = r12.getString(r13)
            java.lang.String r7 = r12.getString(r7)
            int r14 = r0.f300928B
            rx3.l r7 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.m84831b(r14, r13, r7)
            A r13 = r7.f38555d
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r5.putInt(r4, r13)
            B r4 = r7.f38556e
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.putInt(r3, r4)
            java.lang.String r3 = r12.getString(r8)
            r5.putString(r15, r3)
        L_0x08b0:
            di3.d r3 = di3.C86312j.m106911c(r18)
            xz.f r3 = (p275xz.C15919f) r3
            r4 = 1
            r7 = 0
            r36 = r3
            r37 = r10
            r38 = r4
            r39 = r35
            r40 = r2
            r41 = r7
            r42 = r5
            r36.mo14578zh(r37, r38, r39, r40, r41, r42)
            r2 = 1
            r0.mo141750n(r2, r9)
            r3 = 11
            r0.mo141754q(r3)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r6
            r4[r2] = r11
            r2 = 2
            r4[r2] = r24
            r2 = 16472(0x4058, float:2.3082E-41)
            r3.mo160131h(r2, r4)
            if (r1 == 0) goto L_0x08f2
            zt3.t r2 = zt3.C119157j.f356862d
            qs3.c r3 = new qs3.c
            r3.<init>(r1, r11)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r3)
        L_0x08f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C102212j.mo141742e(android.app.Activity, java.lang.String, int, int, java.lang.String, int, int, ml2.f$a, com.tencent.mm.plugin.scanner.view.d, android.os.Bundle, int, boolean, int, boolean, com.tencent.qbar.ScanIdentifyReportInfo):void");
    }

    /* renamed from: f */
    public void mo141743f(Activity activity, String str, int i, String str2, int i2, int i3, C10931f.C10933a aVar, C94528d dVar, Bundle bundle, int i4, boolean z, int i5, boolean z2) {
        int i6 = i;
        mo141742e(activity, str, i6, mo141753p(i6), str2, i2, i3, aVar, dVar, bundle, i4, z, i5, z2, (ScanIdentifyReportInfo) null);
    }

    /* renamed from: g */
    public final void mo141744g(String str, C94528d.C94529a aVar) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(this.f300944q);
        objArr[1] = Boolean.valueOf(this.f300948u == null);
        Log.m105919d("MicroMsg.QBarStringHandler", "alvinluo directShowLoading isFromScanUI: %b, loadingViewModel == null: %b", objArr);
        C94528d dVar = this.f300948u;
        if (dVar == null || !this.f300944q) {
            mo141759v(str, aVar);
            return;
        }
        this.f300932F = true;
        ((BaseScanUI) dVar).mo24310k8(true, false, aVar);
    }

    /* renamed from: i */
    public Context mo141745i() {
        WeakReference<Activity> weakReference = this.f300934d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ad  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141746j(te3.C77967mx3 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.ref.WeakReference<android.app.Activity> r2 = r0.f300934d
            r3 = 0
            if (r2 == 0) goto L_0x0010
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0011
        L_0x0010:
            r2 = r3
        L_0x0011:
            te3.rv3 r4 = r1.f227857d
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "handle search contact result, username:"
            r5.append(r6)
            te3.rv3 r6 = r1.f227857d
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.QBarStringHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            java.lang.Class<ln.g> r5 = p196ln.C76706g.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ln.g r5 = (p196ln.C76706g) r5
            ln.k r5 = r5.mo106826RE()
            te3.qv3 r7 = r1.f227862i
            byte[] r7 = sf0.C48374j0.m53715d(r7)
            com.tencent.mm.modelavatar.AvatarStorage r5 = (com.tencent.p014mm.modelavatar.AvatarStorage) r5
            r5.mo93572u(r4, r7)
            android.app.ProgressDialog r5 = r0.f300946s
            if (r5 == 0) goto L_0x005b
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L_0x005b
            java.lang.String r5 = "tip dialog dismiss"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            android.app.ProgressDialog r5 = r0.f300946s
            r5.dismiss()
        L_0x005b:
            r17.mo141741d()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            int r5 = r5.length()
            r6 = 0
            if (r5 <= 0) goto L_0x01ee
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            com.tencent.mm.storage.z1 r5 = r5.get(r4)
            r7 = 1
            if (r5 == 0) goto L_0x00bd
            boolean r8 = r5.mo62927s3()
            if (r8 == 0) goto L_0x00bd
            boolean r8 = r5.mo62916m3()
            if (r8 == 0) goto L_0x00bd
            if (r2 == 0) goto L_0x00bd
            java.lang.Class<rn.w> r8 = p227rn.C48054w.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            rn.w r8 = (p227rn.C48054w) r8
            rn.u r8 = r8.get(r4)
            if (r8 == 0) goto L_0x00bd
            boolean r9 = r8.mo72813n1()
            if (r9 == 0) goto L_0x00bd
            boolean r8 = r8.mo72811g1()
            if (r8 != 0) goto L_0x00bd
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "Chat_User"
            r1.putExtra(r3, r4)
            java.lang.String r3 = "finish_direct"
            r1.putExtra(r3, r7)
            wc3.z r3 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            com.tencent.mm.app.r1 r3 = (com.tencent.p014mm.app.C67654r1) r3
            r3.mo93173f(r1, r2)
            return r7
        L_0x00bd:
            int r8 = r0.f300935e
            if (r8 == r7) goto L_0x00c4
            r8 = 30
            goto L_0x00c6
        L_0x00c4:
            r8 = 45
        L_0x00c6:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.Class<ug.z> r10 = p248ug.C52574z.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ug.z r10 = (p248ug.C52574z) r10
            r10.mo73528B0(r9, r1, r8)
            if (r5 == 0) goto L_0x00e3
            boolean r5 = r5.mo62927s3()
            if (r5 != 0) goto L_0x00e3
            java.lang.String r5 = "Contact_IsLBSFriend"
            r9.putExtra(r5, r7)
        L_0x00e3:
            int r5 = r1.f227867q
            r5 = r5 & 8
            if (r5 <= 0) goto L_0x0104
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 10298(0x283a, float:1.443E-41)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            java.lang.String r4 = ","
            r11.append(r4)
            r11.append(r8)
            java.lang.String r4 = r11.toString()
            r5.kvStat(r10, r4)
        L_0x0104:
            if (r2 == 0) goto L_0x01ec
            int r4 = r1.f227867q
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85810M4(r4)
            java.lang.String r5 = "Contact_Sub_Scene"
            if (r4 == 0) goto L_0x0179
            int r4 = r0.f300935e
            java.lang.String r8 = "qbarScene"
            r9.putExtra(r8, r4)
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r8 = "img_gallery_session_id"
            java.lang.String r4 = r4.getStringExtra(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r8 == 0) goto L_0x0129
            goto L_0x0179
        L_0x0129:
            eb0.v0 r8 = eb0.C86493v0.m107224d()
            eb0.v0$c r4 = r8.mo120946b(r4)
            if (r4 == 0) goto L_0x0179
            java.lang.String r8 = "preUsername"
            java.lang.String r10 = r4.mo120959f(r8, r3)
            java.lang.String r11 = "preChatName"
            java.lang.String r12 = r4.mo120959f(r11, r3)
            java.lang.String r13 = "url"
            java.lang.String r14 = r4.mo120959f(r13, r3)
            java.lang.String r15 = "rawUrl"
            java.lang.String r7 = r4.mo120959f(r15, r3)
            int r3 = r4.mo120958e(r5, r6)
            int r6 = eb0.C45629t0.m50815b(r10, r12)
            java.lang.String r1 = "Contact_Scene_Note"
            r16 = r2
            r2 = 0
            java.lang.String r2 = r4.mo120959f(r1, r2)
            r9.putExtra(r8, r10)
            r9.putExtra(r11, r12)
            r9.putExtra(r13, r14)
            r9.putExtra(r15, r7)
            java.lang.String r4 = "preChatTYPE"
            r9.putExtra(r4, r6)
            r9.putExtra(r5, r3)
            r9.putExtra(r1, r2)
            goto L_0x017b
        L_0x0179:
            r16 = r2
        L_0x017b:
            int r1 = r0.f300935e
            r2 = 5
            r3 = 2
            r4 = 4
            r6 = 3
            r7 = 7
            if (r1 != 0) goto L_0x0188
            r9.putExtra(r5, r7)
            goto L_0x0197
        L_0x0188:
            int r1 = r0.f300950w
            if (r1 != r7) goto L_0x0190
            r9.putExtra(r5, r4)
            goto L_0x0197
        L_0x0190:
            if (r1 == r6) goto L_0x0194
            if (r1 != r2) goto L_0x0197
        L_0x0194:
            r9.putExtra(r5, r3)
        L_0x0197:
            wc3.z r1 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r5 = r16
            r1.mo93174g(r9, r5)
            java.lang.String r1 = r0.f300929C
            boolean r1 = eb0.C45628s0.m50738C(r1)
            if (r1 == 0) goto L_0x01ad
            java.lang.String r1 = r0.f300929C
            goto L_0x01af
        L_0x01ad:
            java.lang.String r1 = ""
        L_0x01af:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 14268(0x37bc, float:1.9994E-41)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r9 = r18
            int r9 = r9.f227867q
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85810M4(r9)
            r10 = 1
            r9 = r9 ^ r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11 = 0
            r7[r11] = r9
            int r9 = r0.f300950w
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r10] = r9
            int r9 = r0.f300935e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r3] = r9
            java.lang.String r3 = r0.f300951x
            r7[r6] = r3
            java.lang.String r3 = r0.f300936f
            r7[r4] = r3
            java.lang.String r3 = r0.f300952y
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            r7[r2] = r3
            r2 = 6
            r7[r2] = r1
            r5.mo160131h(r8, r7)
        L_0x01ec:
            r1 = 1
            return r1
        L_0x01ee:
            r5 = r2
            if (r5 == 0) goto L_0x01fd
            r1 = 2131835307(0x7f1139ab, float:1.9303749E38)
            r2 = 0
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r5, (int) r1, (int) r2)
            r1.show()
            goto L_0x01fe
        L_0x01fd:
            r2 = 0
        L_0x01fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C102212j.mo141746j(te3.mx3):boolean");
    }

    /* renamed from: k */
    public final boolean mo141747k(C77917dy3 dy32) {
        String str = dy32.f227190d;
        Log.m105918d("MicroMsg.QBarStringHandler", "handle search openim contact result, username:" + str);
        mo141741d();
        WeakReference<Activity> weakReference = this.f300934d;
        Context context = weakReference != null ? weakReference.get() : null;
        if (Util.nullAsNil(str).length() > 0) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            int i = this.f300935e != 1 ? 30 : 45;
            Intent intent = new Intent();
            C78157d.m94368a(intent, dy32, i);
            if (z1Var != null && !z1Var.mo62927s3()) {
                intent.putExtra("Contact_IsLBSFriend", true);
            }
            if (context != null) {
                ((C67654r1) C5176w.m5203a()).mo93174g(intent, context);
                C115669n.INSTANCE.mo160131h(14268, 2, Integer.valueOf(this.f300950w), Integer.valueOf(this.f300935e), this.f300951x, this.f300936f, Util.nullAsNil(this.f300952y));
            }
            return true;
        }
        if (context != null) {
            C76701a.makeText(context, (int) C0966R.string.ieg, 0).show();
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo141748l(String str) {
        return str.startsWith("weixin://wxpay/bizpayurl") || str.startsWith("https://wx.tenpay.com/f2f") || str.startsWith("wxp://f2f") || str.startsWith("https://payapp.wechatpay.cn/qr/") || str.startsWith("wxhb://f2f") || str.startsWith("wxp://wbf2f") || str.startsWith("m") || str.startsWith(f300925G) || str.startsWith("n") || str.startsWith(f300926H) || str.startsWith("https://payapp.wechatpay.cn/sjt/qr/");
    }

    /* renamed from: m */
    public final void mo141749m(Activity activity, String str) {
        C77444c0 c0Var = new C77444c0((C77444c0.C77445a) null);
        c0Var.f229421f = str;
        c0Var.f229422g = true;
        c0Var.f229423h = (long) 11;
        int i = this.f300928B;
        if (i <= 0) {
            i = mo141753p(this.f300935e);
        }
        c0Var.f229424i = i;
        Activity activity2 = activity;
        this.f300946s = C76879j.m92724R(activity2, activity.getString(C0966R.string.a3h), activity.getString(C0966R.string.f361235id1), true, true, new C102214l(this, ((C66708h) C86312j.m106911c(C66708h.class)).mo90745uq(activity, c0Var, new j$$h(this, activity))));
    }

    /* renamed from: n */
    public final void mo141750n(boolean z, Bundle bundle) {
        if (this.f300947t != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("key_scan_qr_code_result", z);
            this.f300947t.mo361b(3, bundle);
        }
    }

    /* renamed from: o */
    public final void mo141752o(Activity activity, String str) {
        C117747y sQ = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76874sQ(str);
        ((HashMap) this.f300949v).put(sQ, 1);
        C86709a0.m107524d().mo123460f(sQ);
        this.f300946s = C76879j.m92724R(activity, activity.getString(C0966R.string.a3h), activity.getString(C0966R.string.f361235id1), true, true, new j$$g(this, sQ));
    }

    /* JADX WARNING: Removed duplicated region for block: B:252:0x05f2  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r44, int r45, java.lang.String r46, ob0.C117747y r47) {
        /*
            r43 = this;
            r9 = r43
            r0 = r44
            r1 = r45
            r2 = r47
            java.lang.Class<aw.d> r3 = p447aw.C103918d.class
            java.lang.Class<ir.n> r10 = p565ir.C60606n.class
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r44)
            r12 = 0
            r5[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r45)
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r5[r13] = r6
            r15 = 2
            r5[r15] = r46
            java.lang.String r8 = "MicroMsg.QBarStringHandler"
            java.lang.String r6 = "onSceneEnd: errType = [%s] errCode = [%s] errMsg = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r5)
            r7 = 0
            if (r2 != 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r13]
            if (r2 != 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r13 = 0
        L_0x0037:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0[r12] = r1
            java.lang.String r1 = "onSceneEnd() scene is null [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r0)
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x004a
            r0.mo361b(r15, r7)
        L_0x004a:
            return
        L_0x004b:
            java.util.Map<ob0.y, java.lang.Integer> r5 = r9.f300949v
            java.util.HashMap r5 = (java.util.HashMap) r5
            boolean r5 = r5.containsKey(r2)
            if (r5 != 0) goto L_0x0066
            boolean r5 = r2 instanceof p008bq.C39832j1
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = "emotion scan scene"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r5)
            goto L_0x0066
        L_0x005f:
            java.lang.String r0 = "not my scene, don't care it"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return
        L_0x0066:
            java.util.Map<ob0.y, java.lang.Integer> r5 = r9.f300949v
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.remove(r2)
            r43.mo141741d()
            int r5 = r47.getType()
            r6 = 372(0x174, float:5.21E-43)
            r4 = 4
            if (r5 != r6) goto L_0x00b0
            if (r0 != r4) goto L_0x00b0
            r5 = -2034(0xfffffffffffff80e, float:NaN)
            if (r1 != r5) goto L_0x00b0
            r0 = r2
            sv.j r0 = (p239sv.C13784j) r0
            java.lang.String r2 = r0.mo13145y0()
            java.lang.Class<vs.d> r0 = p728vs.C52990d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            vs.d r1 = (p728vs.C52990d) r1
            r3 = 0
            r4 = 50
            r5 = 0
            r6 = 0
            byte[] r7 = new byte[r12]
            vs.e r0 = r1.mo73579xD(r2, r3, r4, r5, r6, r7)
            f40.C86709a0.m107528h()
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            ob0.y r0 = (ob0.C117747y) r0
            r1.mo123460f(r0)
            java.util.Map<ob0.y, java.lang.Integer> r1 = r9.f300949v
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r0, r14)
            return
        L_0x00b0:
            java.lang.ref.WeakReference<android.app.Activity> r5 = r9.f300934d
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            goto L_0x00bc
        L_0x00bb:
            r5 = r7
        L_0x00bc:
            r6 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r0 != r4) goto L_0x00d2
            r15 = -4
            if (r1 != r15) goto L_0x00d2
            if (r5 == 0) goto L_0x00d1
            r0 = 2131834302(0x7f1135be, float:1.930171E38)
            vl2.j$$j r1 = new vl2.j$$j
            r1.<init>(r9)
            nj3.C76879j.m92744o(r5, r0, r6, r12, r1)
        L_0x00d1:
            return
        L_0x00d2:
            if (r0 != r4) goto L_0x00ff
            r15 = -200223(0xfffffffffffcf1e1, float:NaN)
            if (r1 != r15) goto L_0x00ff
            if (r5 == 0) goto L_0x00fe
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131834303(0x7f1135bf, float:1.9301713E38)
            java.lang.String r0 = r0.getString(r1)
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r1 = r1.getString(r6)
            boolean r2 = r46.isEmpty()
            if (r2 != 0) goto L_0x00f6
            r0 = r46
        L_0x00f6:
            vl2.j$$k r2 = new vl2.j$$k
            r2.<init>(r9)
            nj3.C76879j.m92713G(r5, r0, r1, r12, r2)
        L_0x00fe:
            return
        L_0x00ff:
            if (r0 != r4) goto L_0x0114
            r15 = -200224(0xfffffffffffcf1e0, float:NaN)
            if (r1 != r15) goto L_0x0114
            if (r5 == 0) goto L_0x0113
            r0 = 2131834301(0x7f1135bd, float:1.9301708E38)
            vl2.j$$l r1 = new vl2.j$$l
            r1.<init>(r9)
            nj3.C76879j.m92744o(r5, r0, r6, r12, r1)
        L_0x0113:
            return
        L_0x0114:
            if (r0 != r4) goto L_0x0150
            r15 = -200227(0xfffffffffffcf1dd, float:NaN)
            if (r1 == r15) goto L_0x012a
            r15 = -200228(0xfffffffffffcf1dc, float:NaN)
            if (r1 == r15) goto L_0x012a
            r15 = -200229(0xfffffffffffcf1db, float:NaN)
            if (r1 == r15) goto L_0x012a
            r15 = -200230(0xfffffffffffcf1da, float:NaN)
            if (r1 != r15) goto L_0x0150
        L_0x012a:
            if (r5 == 0) goto L_0x014f
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131834292(0x7f1135b4, float:1.930169E38)
            java.lang.String r0 = r0.getString(r1)
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r1 = r1.getString(r6)
            boolean r2 = r46.isEmpty()
            if (r2 != 0) goto L_0x0147
            r0 = r46
        L_0x0147:
            vl2.j$$m r2 = new vl2.j$$m
            r2.<init>(r9)
            nj3.C76879j.m92713G(r5, r0, r1, r12, r2)
        L_0x014f:
            return
        L_0x0150:
            vl2.i r15 = vl2.C37755i.f100002a
            boolean r6 = r9.f300944q
            java.lang.String r4 = ""
            if (r6 == 0) goto L_0x01cf
            boolean r6 = r15.mo61324a(r0, r1, r2)
            if (r6 == 0) goto L_0x01cf
            boolean r0 = r9.f300941n
            if (r0 != 0) goto L_0x01b5
            java.lang.String r0 = "alvinluo dealQBarString onSceneEnd overtime and deal with offline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x016f
            r1 = 7
            r0.mo361b(r1, r7)
        L_0x016f:
            if (r5 == 0) goto L_0x01ce
            com.tencent.mm.plugin.scanner.model.OfflineScanContext r0 = new com.tencent.mm.plugin.scanner.model.OfflineScanContext
            r18 = 2
            java.lang.String r1 = r9.f300936f
            int r2 = r9.f300935e
            int r3 = r9.f300938h
            int r4 = r9.f300939i
            java.lang.String r6 = r9.f300940j
            boolean r7 = r9.f300942o
            android.os.Bundle r8 = r9.f300945r
            r16 = r0
            r17 = r5
            r19 = r1
            r20 = r2
            r21 = r3
            r22 = r4
            r23 = r6
            r24 = r7
            r25 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 2131835272(0x7f113988, float:1.9303678E38)
            java.lang.String r1 = r5.getString(r1)
            r15.mo61325b(r0, r1, r13)
            com.tencent.mm.plugin.scanner.model.x r2 = com.tencent.p014mm.plugin.scanner.model.C85412x.f248924a
            java.lang.String r3 = r9.f300936f
            java.lang.String r4 = r9.f300940j
            boolean r0 = r9.f300942o
            if (r0 == 0) goto L_0x01ae
            r5 = 2
            goto L_0x01af
        L_0x01ae:
            r5 = 1
        L_0x01af:
            r6 = 2
            r7 = 0
            r2.mo118759a(r3, r4, r5, r6, r7)
            goto L_0x01ce
        L_0x01b5:
            if (r5 == 0) goto L_0x01ce
            r0 = 2131835270(0x7f113986, float:1.9303674E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "showMsg"
            gy3.C87412m.m108594g(r0, r1)
            r1 = 2131821557(0x7f1103f5, float:1.927586E38)
            java.lang.String r1 = r5.getString(r1)
            nj3.C76879j.m92754y(r5, r0, r4, r1, r7)
        L_0x01ce:
            return
        L_0x01cf:
            java.lang.ref.WeakReference<android.app.Activity> r6 = r9.f300934d
            if (r6 == 0) goto L_0x01da
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            goto L_0x01db
        L_0x01da:
            r6 = r7
        L_0x01db:
            if (r0 == r13) goto L_0x01f3
            r15 = 2
            if (r0 == r15) goto L_0x01e2
            r6 = 0
            goto L_0x022b
        L_0x01e2:
            if (r6 == 0) goto L_0x022a
            r15 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r15 = r6.getString(r15)
            android.widget.Toast r6 = p910lj.C76701a.makeText((android.content.Context) r6, (java.lang.CharSequence) r15, (int) r13)
            r6.show()
            goto L_0x022a
        L_0x01f3:
            if (r6 == 0) goto L_0x022a
            ob0.b0 r15 = f40.C86709a0.m107524d()
            boolean r15 = r15.mo123466l()
            if (r15 == 0) goto L_0x0207
            ob0.b0 r6 = f40.C86709a0.m107524d()
            r6.mo123465k()
            goto L_0x022a
        L_0x0207:
            boolean r15 = com.tencent.p014mm.network.C114786m0.m161568a(r6)
            if (r15 == 0) goto L_0x0211
            com.tencent.p014mm.pluginsdk.p133ui.tools.C6692y0.m7002a(r6)
            goto L_0x022a
        L_0x0211:
            r7 = 2
            java.lang.Object[] r15 = new java.lang.Object[r7]
            r15[r12] = r14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r45)
            r15[r13] = r7
            r7 = 2131830324(0x7f112634, float:1.9293642E38)
            java.lang.String r7 = r6.getString(r7, r15)
            android.widget.Toast r6 = p910lj.C76701a.makeText((android.content.Context) r6, (java.lang.CharSequence) r7, (int) r13)
            r6.show()
        L_0x022a:
            r6 = 1
        L_0x022b:
            if (r6 == 0) goto L_0x0236
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x0235
            r1 = 0
            r0.mo361b(r12, r1)
        L_0x0235:
            return
        L_0x0236:
            r6 = 4
            if (r0 != r6) goto L_0x0251
            r6 = -2004(0xfffffffffffff82c, float:NaN)
            if (r1 != r6) goto L_0x0251
            if (r5 == 0) goto L_0x0248
            r0 = 2131834284(0x7f1135ac, float:1.9301674E38)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r5, r0, r1)
        L_0x0248:
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x0250
            r1 = 0
            r0.mo361b(r13, r1)
        L_0x0250:
            return
        L_0x0251:
            if (r0 != 0) goto L_0x0ace
            if (r1 == 0) goto L_0x0257
            goto L_0x0ace
        L_0x0257:
            int r6 = r47.getType()
            r7 = 106(0x6a, float:1.49E-43)
            r15 = 233(0xe9, float:3.27E-43)
            if (r6 == r15) goto L_0x0272
            int r6 = r47.getType()
            if (r6 == r7) goto L_0x0272
            int r6 = r47.getType()
            r15 = 1061(0x425, float:1.487E-42)
            if (r6 != r15) goto L_0x0270
            goto L_0x0272
        L_0x0270:
            r6 = 0
            goto L_0x0273
        L_0x0272:
            r6 = 1
        L_0x0273:
            if (r6 == 0) goto L_0x0293
            boolean r6 = r9.f300941n
            if (r6 != 0) goto L_0x0293
            com.tencent.mm.plugin.scanner.model.x r20 = com.tencent.p014mm.plugin.scanner.model.C85412x.f248924a
            java.lang.String r6 = r9.f300936f
            java.lang.String r15 = r9.f300940j
            boolean r12 = r9.f300942o
            if (r12 == 0) goto L_0x0286
            r23 = 2
            goto L_0x0288
        L_0x0286:
            r23 = 1
        L_0x0288:
            r24 = 4
            r25 = 0
            r21 = r6
            r22 = r15
            r20.mo118759a(r21, r22, r23, r24, r25)
        L_0x0293:
            int r6 = r47.getType()
            java.lang.String r12 = "geta8key_action_code"
            java.lang.String r15 = "geta8key_fullurl"
            if (r6 != r7) goto L_0x02dd
            r0 = r2
            iu.c r0 = (p567iu.C46287c) r0
            boolean r1 = r9.mo141757t(r0)
            if (r1 == 0) goto L_0x02a7
            return
        L_0x02a7:
            te3.mx3 r1 = r0.mo70811l0()
            boolean r1 = r9.mo141746j(r1)
            if (r1 == 0) goto L_0x02d4
            ml2.f$a r1 = r9.f300947t
            if (r1 == 0) goto L_0x02cf
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            te3.mx3 r0 = r0.mo70811l0()
            te3.rv3 r0 = r0.f227857d
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            r1.putString(r15, r0)
            r2 = 4
            r1.putInt(r12, r2)
            r9.mo141750n(r13, r1)
            goto L_0x02d0
        L_0x02cf:
            r2 = 4
        L_0x02d0:
            r9.mo141754q(r2)
            goto L_0x02dc
        L_0x02d4:
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x02dc
            r1 = 0
            r0.mo361b(r13, r1)
        L_0x02dc:
            return
        L_0x02dd:
            int r6 = r47.getType()
            r7 = 372(0x174, float:5.21E-43)
            if (r6 != r7) goto L_0x0316
            r0 = r2
            sv.j r0 = (p239sv.C13784j) r0
            te3.dy3 r0 = r0.mo13144t()
            boolean r1 = r9.mo141747k(r0)
            if (r1 == 0) goto L_0x030d
            ml2.f$a r1 = r9.f300947t
            if (r1 == 0) goto L_0x0308
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = r0.f227190d
            r1.putString(r15, r0)
            r2 = 4
            r1.putInt(r12, r2)
            r9.mo141750n(r13, r1)
            goto L_0x0309
        L_0x0308:
            r2 = 4
        L_0x0309:
            r9.mo141754q(r2)
            goto L_0x0315
        L_0x030d:
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x0315
            r1 = 0
            r0.mo361b(r13, r1)
        L_0x0315:
            return
        L_0x0316:
            int r6 = r47.getType()
            r7 = 5900(0x170c, float:8.268E-42)
            if (r6 != r7) goto L_0x03cb
            com.tencent.mm.network.u r0 = r47.getReqResp()
            ob0.c r0 = (ob0.C47350c) r0
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.tf r0 = (te3.C51387tf) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#MMFunc_BizFinderLiveQrCode err_code="
            r1.append(r2)
            int r2 = r0.f142192e
            r1.append(r2)
            java.lang.String r2 = " verify_ok="
            r1.append(r2)
            boolean r2 = r0.f142191d
            r1.append(r2)
            java.lang.String r2 = " url="
            r1.append(r2)
            java.lang.String r2 = r0.f142194g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            int r1 = r0.f142192e
            if (r1 != 0) goto L_0x0385
            boolean r1 = r0.f142191d
            if (r1 == 0) goto L_0x0385
            if (r5 == 0) goto L_0x03ca
            di3.d r0 = di3.C86312j.m106911c(r3)
            r16 = r0
            aw.d r16 = (p447aw.C103918d) r16
            r19 = 26
            r20 = 0
            r21 = 0
            java.lang.String r18 = "android.permission.RECORD_AUDIO"
            r17 = r5
            boolean r0 = r16.mo125788z1(r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x03ca
            di3.d r0 = di3.C86312j.m106911c(r10)
            ir.n r0 = (p565ir.C60606n) r0
            vl2.j$$a r1 = new vl2.j$$a
            r1.<init>(r9)
            r0.mo85027Qo(r5, r1, r13)
            goto L_0x03ca
        L_0x0385:
            java.lang.String r1 = r0.f142194g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03b6
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r0 = r0.f142194g
            java.lang.String r2 = "rawUrl"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "showShare"
            r2 = 0
            r1.putExtra(r0, r2)
            java.lang.String r0 = "hide_option_menu"
            r1.putExtra(r0, r13)
            java.lang.String r0 = "isWebwx"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            r3 = 0
            ke3.C88144b.m109791i(r5, r0, r2, r1, r3)
            goto L_0x03c7
        L_0x03b6:
            r3 = 0
            if (r5 == 0) goto L_0x03c7
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131835294(0x7f11399e, float:1.9303722E38)
            java.lang.String r0 = r0.getString(r1)
            nj3.C76912y0.m92773l(r5, r0)
        L_0x03c7:
            r9.mo141750n(r13, r3)
        L_0x03ca:
            return
        L_0x03cb:
            int r6 = r47.getType()
            java.lang.String r13 = "key_finder_teen_mode_check"
            java.lang.String r7 = "key_enter_profile_type"
            java.lang.String r1 = "key_from_comment_scene"
            java.lang.String r0 = "finder_username"
            r20 = 22
            r21 = 33
            r23 = 32
            r24 = r14
            java.lang.String r14 = "[FinderGetUserResponse]  promotionToken"
            r25 = r12
            java.lang.String r12 = "key_promotion_token"
            r27 = r15
            java.lang.String r15 = "key_finder_teen_mode_user_id"
            r28 = r3
            java.lang.String r3 = "key_finder_teen_mode_user_name"
            r29 = r4
            java.lang.String r4 = "key_finder_teen_mode_scene"
            r30 = r10
            r10 = 3512(0xdb8, float:4.921E-42)
            if (r6 != r10) goto L_0x0591
            com.tencent.mm.network.u r6 = r47.getReqResp()
            ob0.c r6 = (ob0.C47350c) r6
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            te3.bq0 r6 = (te3.C48893bq0) r6
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r10 = r6.f131256d
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0590
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            r33 = r5
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r5 = r6.f131256d
            r9 = 0
            java.lang.Object r5 = r5.get(r9)
            com.tencent.mm.protocal.protobuf.FinderContact r5 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r5
            java.lang.String r5 = r5.username
            r10.putExtra(r0, r5)
            r0 = 10
            r10.putExtra(r1, r0)
            r1 = 3
            r10.putExtra(r7, r1)
            r1 = 1
            r10.putExtra(r13, r1)
            r0 = 6
            r10.putExtra(r4, r0)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r0 = r6.f131256d
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r0
            java.lang.String r0 = r0.nickname
            r10.putExtra(r3, r0)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r0 = r6.f131256d
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r0
            java.lang.String r0 = r0.username
            r10.putExtra(r15, r0)
            di3.d r0 = di3.C86312j.m106911c(r11)
            ht1.t1 r0 = (ht1.C60200t1) r0
            java.lang.String r0 = r0.mo76789Nn(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0477
            r10.putExtra(r12, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
        L_0x0477:
            te3.zj3 r1 = r6.f131257e
            if (r1 == 0) goto L_0x04b9
            c30.g r1 = new c30.g
            r1.<init>()
            java.lang.String r2 = "qrcodeType"
            te3.zj3 r3 = r6.f131257e     // Catch:{ Exception -> 0x04a0 }
            int r3 = r3.f146039d     // Catch:{ Exception -> 0x04a0 }
            r1.mo145953n(r2, r3)     // Catch:{ Exception -> 0x04a0 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x04a0 }
            if (r2 != 0) goto L_0x0495
            java.lang.String r2 = "distribution"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x04a0 }
        L_0x0495:
            java.lang.String r0 = "key_udf_kv"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04a0 }
            r10.putExtra(r0, r1)     // Catch:{ Exception -> 0x04a0 }
            goto L_0x04b9
        L_0x04a0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[FinderGetUserResponse] err.msg = "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x04b9:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r0 = r6.f131256d
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = (com.tencent.p014mm.protocal.protobuf.FinderContact) r0
            java.lang.String r0 = r0.username
            java.lang.String r1 = eb0.C75592q0.m90778h()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04d1
            r0 = 33
            goto L_0x04d3
        L_0x04d1:
            r0 = 32
        L_0x04d3:
            r9 = r43
            int r1 = r9.f300950w
            if (r1 == 0) goto L_0x04f6
            java.lang.String r2 = "report_scene"
            r3 = 1
            if (r1 == r3) goto L_0x04f1
            r4 = 2
            if (r1 == r4) goto L_0x04ec
            r5 = 3
            if (r1 == r5) goto L_0x04e7
            r4 = 0
            goto L_0x04f8
        L_0x04e7:
            r10.putExtra(r2, r5)
            r4 = 4
            goto L_0x04f8
        L_0x04ec:
            r10.putExtra(r2, r4)
            r4 = 3
            goto L_0x04f8
        L_0x04f1:
            r10.putExtra(r2, r3)
            r4 = 2
            goto L_0x04f8
        L_0x04f6:
            r4 = 22
        L_0x04f8:
            di3.d r1 = di3.C86312j.m106911c(r11)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r2 = 16
            r1.mo76842e7(r4, r2, r0, r10)
            if (r33 == 0) goto L_0x058b
            java.lang.String r0 = r9.f300936f     // Catch:{ Exception -> 0x0519 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0519 }
            java.lang.String r1 = "notice"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ Exception -> 0x0519 }
            if (r0 != 0) goto L_0x0517
            r4 = r29
            goto L_0x0522
        L_0x0517:
            r4 = r0
            goto L_0x0522
        L_0x0519:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r4 = 0
        L_0x0522:
            java.lang.String r0 = "KEY_FINDER_PROFILE_UI_AFTER_SHOW_NOTICE_LIST"
            r1 = 1
            r10.putExtra(r0, r1)
            java.lang.String r0 = "KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION"
            r10.putExtra(r0, r4)
            r5 = r33
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "from_user"
            java.lang.String r2 = "key_from_user_name"
            if (r0 == 0) goto L_0x0550
            java.lang.String r3 = "stat_send_msg_user"
            java.lang.String r3 = r0.getStringExtra(r3)
            r10.putExtra(r2, r3)
            java.lang.String r3 = "stat_chat_talker_username"
            java.lang.String r0 = r0.getStringExtra(r3)
            r10.putExtra(r1, r0)
        L_0x0550:
            java.lang.String r0 = r10.getStringExtra(r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0568
            android.os.Bundle r0 = r9.f300945r
            if (r0 == 0) goto L_0x0568
            java.lang.String r3 = "stat_send_msg_user"
            java.lang.String r0 = r0.getString(r3)
            r10.putExtra(r2, r0)
        L_0x0568:
            java.lang.String r0 = r10.getStringExtra(r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0580
            android.os.Bundle r0 = r9.f300945r
            if (r0 == 0) goto L_0x0580
            java.lang.String r2 = "stat_chat_talker_username"
            java.lang.String r0 = r0.getString(r2)
            r10.putExtra(r1, r0)
        L_0x0580:
            di3.d r0 = di3.C86312j.m106911c(r11)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r5 = r33
            r0.mo76819V1(r5, r10)
        L_0x058b:
            r1 = 0
            r2 = 1
            r9.mo141750n(r2, r1)
        L_0x0590:
            return
        L_0x0591:
            int r6 = r47.getType()
            r10 = 7424(0x1d00, float:1.0403E-41)
            if (r6 != r10) goto L_0x0821
            com.tencent.mm.network.u r6 = r47.getReqResp()
            ob0.c r6 = (ob0.C47350c) r6
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            te3.h81 r6 = (te3.C49671h81) r6
            int r10 = r6.f134493d
            r33 = r5
            r5 = 1
            if (r10 != r5) goto L_0x068b
            int r10 = r6.f134496g
            if (r10 != r5) goto L_0x05cf
            pe3.b r5 = r6.f134498i
            if (r5 == 0) goto L_0x05cf
            te3.jz3 r5 = new te3.jz3     // Catch:{ Exception -> 0x05ce }
            r5.<init>()     // Catch:{ Exception -> 0x05ce }
            pe3.b r10 = r6.f134498i     // Catch:{ Exception -> 0x05ce }
            byte[] r10 = r10.mo123703f()     // Catch:{ Exception -> 0x05ce }
            pe3.a r5 = r5.parseFrom(r10)     // Catch:{ Exception -> 0x05ce }
            te3.jz3 r5 = (te3.C50057jz3) r5     // Catch:{ Exception -> 0x05ce }
            java.lang.String r10 = r5.f136478e     // Catch:{ Exception -> 0x05ce }
            java.lang.String r5 = r5.f136479f     // Catch:{ Exception -> 0x05cc }
            r29 = r5
            goto L_0x05d1
        L_0x05cc:
            goto L_0x05d1
        L_0x05ce:
        L_0x05cf:
            r10 = r29
        L_0x05d1:
            if (r29 == 0) goto L_0x05d9
            boolean r5 = r29.isEmpty()
            if (r5 == 0) goto L_0x05e3
        L_0x05d9:
            di3.d r5 = di3.C86312j.m106911c(r11)
            ht1.t1 r5 = (ht1.C60200t1) r5
            java.lang.String r29 = r5.mo76849gS(r2)
        L_0x05e3:
            r2 = r29
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            if (r10 == 0) goto L_0x0600
            boolean r16 = r10.isEmpty()
            if (r16 != 0) goto L_0x0600
            r16 = r11
            java.lang.String r11 = "KEY_FINDER_PROFILE_UI_AFTER_SHOW_NOTICE_LIST"
            r9 = 1
            r5.putExtra(r11, r9)
            java.lang.String r11 = "KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION"
            r5.putExtra(r11, r10)
            goto L_0x0603
        L_0x0600:
            r16 = r11
            r9 = 1
        L_0x0603:
            java.lang.String r10 = r6.f134494e
            r5.putExtra(r0, r10)
            r0 = 10
            r5.putExtra(r1, r0)
            r1 = 3
            r5.putExtra(r7, r1)
            r5.putExtra(r13, r9)
            r0 = 6
            r5.putExtra(r4, r0)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.f134495f
            if (r0 == 0) goto L_0x0623
            java.lang.String r0 = r0.nickname
            if (r0 == 0) goto L_0x0623
            r5.putExtra(r3, r0)
        L_0x0623:
            java.lang.String r0 = r6.f134494e
            r5.putExtra(r15, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0643
            r5.putExtra(r12, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x0643:
            java.lang.String r0 = r6.f134494e
            java.lang.String r1 = eb0.C75592q0.m90778h()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0652
            r0 = 33
            goto L_0x0654
        L_0x0652:
            r0 = 32
        L_0x0654:
            r9 = r43
            int r1 = r9.f300950w
            if (r1 == 0) goto L_0x066b
            r2 = 1
            if (r1 == r2) goto L_0x0669
            r2 = 2
            if (r1 == r2) goto L_0x0667
            r2 = 3
            if (r1 == r2) goto L_0x0665
            r4 = 0
            goto L_0x066d
        L_0x0665:
            r4 = 4
            goto L_0x066d
        L_0x0667:
            r4 = 3
            goto L_0x066d
        L_0x0669:
            r4 = 2
            goto L_0x066d
        L_0x066b:
            r4 = 22
        L_0x066d:
            di3.d r1 = di3.C86312j.m106911c(r16)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r2 = 16
            r1.mo76842e7(r4, r2, r0, r5)
            if (r33 == 0) goto L_0x0685
            di3.d r0 = di3.C86312j.m106911c(r16)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r7 = r33
            r0.mo76819V1(r7, r5)
        L_0x0685:
            r1 = 0
            r2 = 1
            r9.mo141750n(r2, r1)
            goto L_0x06ca
        L_0x068b:
            r16 = r11
            r7 = r33
            r1 = 2
            if (r10 == r1) goto L_0x06cb
            r1 = 3
            if (r10 != r1) goto L_0x0696
            goto L_0x06cb
        L_0x0696:
            r4 = 4
            if (r10 != r4) goto L_0x06b0
            if (r7 == 0) goto L_0x06ca
            java.lang.String r0 = r9.f300937g
            if (r0 == 0) goto L_0x06ca
            di3.d r0 = di3.C86312j.m106911c(r30)
            ir.n r0 = (p565ir.C60606n) r0
            java.lang.String r1 = r9.f300937g
            r0.mo85041WK(r7, r1)
            r1 = 0
            r2 = 1
            r9.mo141750n(r2, r1)
            goto L_0x06ca
        L_0x06b0:
            r0 = 5
            if (r10 != r0) goto L_0x06ca
            if (r7 == 0) goto L_0x06ca
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r6.f134497h
            if (r0 == 0) goto L_0x06ca
            di3.d r0 = di3.C86312j.m106911c(r16)
            ht1.t1 r0 = (ht1.C60200t1) r0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r6.f134497h
            r2 = 0
            r0.mo76780ML(r7, r1, r2)
            r1 = 1
            r10 = 0
            r9.mo141750n(r1, r10)
        L_0x06ca:
            return
        L_0x06cb:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.f134495f
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            if (r0 == 0) goto L_0x07e7
            te3.c21 r2 = r0.liveInfo
            if (r2 == 0) goto L_0x07e7
            int r2 = r6.f134493d
            r3 = 3
            if (r2 != r3) goto L_0x06e4
            int r2 = r6.f134496g
            java.lang.String r3 = "FunctionGuideAction"
            r1.putExtra(r3, r2)
        L_0x06e4:
            int r2 = r6.f134499j
            java.lang.String r3 = "ScanScene"
            r1.putExtra(r3, r2)
            long r2 = r0.f164794id
            java.lang.String r4 = r0.objectNonceId
            if (r4 == 0) goto L_0x06f4
            r39 = r4
            goto L_0x06f6
        L_0x06f4:
            r39 = r29
        L_0x06f6:
            te3.c21 r4 = r0.liveInfo
            java.lang.String r4 = r4.f182395g
            di3.d r4 = di3.C86312j.m106911c(r16)
            ht1.t1 r4 = (ht1.C60200t1) r4
            r5 = 40
            r6 = 65
            r8 = 2
            java.lang.String r4 = r4.mo76802R1(r5, r8, r6)
            di3.d r5 = di3.C86312j.m106911c(r16)
            ht1.t1 r5 = (ht1.C60200t1) r5
            java.lang.String r6 = "FinderLiveSelectGoFlag"
            r5.mo76907zu(r0, r6)
            java.lang.String r5 = r0.username
            java.lang.String r6 = eb0.C75592q0.m90778h()
            if (r5 != r6) goto L_0x0743
            di3.d r5 = di3.C86312j.m106911c(r30)
            r16 = r5
            ir.n r16 = (p565ir.C60606n) r16
            te3.c21 r5 = r0.liveInfo
            long r5 = r5.f182392d
            java.lang.Long r21 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = r0.sessionBuffer
            java.lang.String r23 = ""
            java.lang.String r26 = ""
            r17 = r1
            r18 = r7
            r19 = r2
            r22 = r39
            r24 = r4
            r25 = r0
            r16.o90(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            goto L_0x0820
        L_0x0743:
            java.lang.Class<ls3.f> r5 = ls3.C10649f.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ls3.f r5 = (ls3.C10649f) r5
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 1
            boolean r5 = r5.mo10914oa(r6, r7)
            if (r5 == 0) goto L_0x0820
            java.lang.Class<kq.h> r5 = p185kq.C10383h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kq.h r5 = (p185kq.C10383h) r5
            r5.mo10697OK(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r0)
            r35 = 0
            te3.c90 r6 = new te3.c90
            r6.<init>()
            r6.f182444d = r4
            r11 = r29
            r6.f182445e = r11
            r7 = 0
            r6.f182446f = r7
            r7 = -1
            r6.f182447g = r7
            r6.f182448h = r7
            r7 = 1
            r6.f182449i = r7
            te3.ro2 r8 = new te3.ro2
            r8.<init>()
            r6.f182450j = r8
            r10 = 194(0xc2, float:2.72E-43)
            r8.f185214e = r10
            r8.f185218i = r0
            te3.eq2 r8 = new te3.eq2
            r8.<init>()
            r6.f182451n = r8
            r8.f183023n = r7
            java.lang.Class<ls3.g> r7 = ls3.C61397g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ls3.g r7 = (ls3.C61397g) r7
            te3.c21 r8 = r0.liveInfo
            boolean r7 = r7.Da0(r8)
            if (r7 == 0) goto L_0x07cd
            java.lang.Class<ls3.g> r5 = ls3.C61397g.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            r31 = r5
            ls3.g r31 = (ls3.C61397g) r31
            android.content.Context r33 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            te3.c21 r5 = r0.liveInfo
            long r5 = r5.f182392d
            java.lang.String r0 = r0.username
            r42 = 0
            java.lang.String r40 = ""
            r32 = r1
            r34 = r2
            r36 = r5
            r38 = r0
            r41 = r4
            r31.mo83482aR(r32, r33, r34, r36, r38, r39, r40, r41, r42)
            goto L_0x0820
        L_0x07cd:
            java.lang.Class<ls3.f> r0 = ls3.C10649f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r31 = r0
            ls3.f r31 = (ls3.C10649f) r31
            android.content.Context r32 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r37 = 0
            r33 = r1
            r34 = r5
            r36 = r6
            r31.mo10913cP(r32, r33, r34, r35, r36, r37)
            goto L_0x0820
        L_0x07e7:
            if (r7 == 0) goto L_0x0820
            int r0 = r6.f134493d
            r1 = 3
            if (r0 != r1) goto L_0x07f9
            android.content.Intent r0 = r7.getIntent()
            int r1 = r6.f134496g
            java.lang.String r2 = "FunctionGuideAction"
            r0.putExtra(r2, r1)
        L_0x07f9:
            di3.d r0 = di3.C86312j.m106911c(r28)
            r16 = r0
            aw.d r16 = (p447aw.C103918d) r16
            r19 = 26
            r20 = 0
            r21 = 0
            java.lang.String r18 = "android.permission.RECORD_AUDIO"
            r17 = r7
            boolean r0 = r16.mo125788z1(r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x0820
            di3.d r0 = di3.C86312j.m106911c(r30)
            ir.n r0 = (p565ir.C60606n) r0
            vl2.j$$b r1 = new vl2.j$$b
            r1.<init>(r9)
            r2 = 1
            r0.mo85027Qo(r7, r1, r2)
        L_0x0820:
            return
        L_0x0821:
            r7 = r5
            r16 = r11
            r11 = r29
            r4 = 4
            r10 = 0
            int r0 = r47.getType()
            r1 = 233(0xe9, float:3.27E-43)
            if (r0 != r1) goto L_0x0a76
            r0 = r2
            vs.e r0 = (p728vs.C52991e) r0
            java.lang.String r12 = r0.mo63062R()
            r9.f300937g = r12
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = r27
            r1.putString(r2, r12)
            int r2 = r0.mo63058K()
            r3 = r25
            r1.putInt(r3, r2)
            int r1 = r0.mo63058K()
            r9.mo141754q(r1)
            int r1 = r9.f300928B
            if (r1 <= 0) goto L_0x0858
            goto L_0x085e
        L_0x0858:
            int r1 = r9.f300935e
            int r1 = r9.mo141753p(r1)
        L_0x085e:
            r5 = r1
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "handleGetA8KeyRedirect, sceneValue: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r2)
            vl2.j$$n r3 = new vl2.j$$n
            r3.<init>(r9)
            java.lang.String r6 = r9.f300936f
            int r13 = r9.f300935e
            vl2.j$$o r14 = new vl2.j$$o
            r14.<init>(r9)
            android.os.Bundle r15 = r9.f300945r
            r1 = r43
            r2 = r0
            r10 = 4
            r4 = r6
            r6 = r13
            r13 = r7
            r7 = r14
            r14 = r8
            r8 = r15
            boolean r1 = com.tencent.p014mm.plugin.qrcode.model.C94313a.m119262b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto L_0x089d
            int r2 = r0.mo63058K()
            if (r2 != r10) goto L_0x089d
            if (r13 == 0) goto L_0x089c
            int r0 = r9.f300935e
            r1 = 1
            r9.mo141739a(r13, r0, r12, r1)
        L_0x089c:
            return
        L_0x089d:
            if (r1 != 0) goto L_0x08bd
            int r2 = r0.mo63058K()
            r3 = 48
            if (r2 != r3) goto L_0x08bd
            com.tencent.mm.plugin.scanner.model.p r0 = new com.tencent.mm.plugin.scanner.model.p
            r0.<init>(r12)
            java.util.Map<ob0.y, java.lang.Integer> r1 = r9.f300949v
            java.util.HashMap r1 = (java.util.HashMap) r1
            r2 = r24
            r1.put(r0, r2)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r0)
            return
        L_0x08bd:
            r2 = r24
            if (r1 != 0) goto L_0x0910
            int r3 = r0.mo63058K()
            r4 = 29
            if (r3 != r4) goto L_0x0910
            if (r13 == 0) goto L_0x090f
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r12
            java.lang.String r3 = "start search contact %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r0)
            java.lang.Class<sv.p> r0 = p239sv.C77792p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sv.p r0 = (p239sv.C77792p) r0
            sv.j r0 = r0.mo107728Gg(r12, r1)
            java.util.Map<ob0.y, java.lang.Integer> r1 = r9.f300949v
            r3 = r0
            ob0.y r3 = (ob0.C117747y) r3
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r3, r2)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r3)
            vl2.j$$e r1 = new vl2.j$$e
            r1.<init>(r9, r0)
            boolean r0 = r9.f300932F
            r2 = 2131835249(0x7f113971, float:1.9303631E38)
            if (r0 == 0) goto L_0x0908
            java.lang.String r0 = r13.getString(r2)
            r9.mo141744g(r0, r1)
            goto L_0x090f
        L_0x0908:
            java.lang.String r0 = r13.getString(r2)
            r9.mo141758u(r0, r1)
        L_0x090f:
            return
        L_0x0910:
            if (r1 != 0) goto L_0x0920
            int r2 = r0.mo63058K()
            r3 = 37
            if (r2 != r3) goto L_0x0920
            if (r13 == 0) goto L_0x091f
            r9.mo141755r(r13, r12)
        L_0x091f:
            return
        L_0x0920:
            if (r1 != 0) goto L_0x0930
            int r2 = r0.mo63058K()
            r3 = 53
            if (r2 != r3) goto L_0x0930
            if (r13 == 0) goto L_0x092f
            r9.mo141752o(r13, r12)
        L_0x092f:
            return
        L_0x0930:
            if (r1 != 0) goto L_0x0980
            int r2 = r0.mo63058K()
            r3 = 45
            if (r2 != r3) goto L_0x0980
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GameLive, qbar:"
            r0.append(r1)
            java.lang.String r1 = r9.f300936f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            java.lang.String r0 = r9.f300936f     // Catch:{ all -> 0x095e }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x095e }
            java.lang.String r1 = "ticket_s"
            java.lang.String r4 = r0.getQueryParameter(r1)     // Catch:{ all -> 0x095e }
            goto L_0x0960
        L_0x095e:
            r4 = r11
        L_0x0960:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x097f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "KEY_TICKET"
            r0.putExtra(r1, r4)
            java.lang.String r1 = "KEY_FROM_SCAN"
            r2 = 1
            r0.putExtra(r1, r2)
            di3.d r1 = di3.C86312j.m106911c(r30)
            ir.n r1 = (p565ir.C60606n) r1
            r1.mo85046Z3(r13, r0)
        L_0x097f:
            return
        L_0x0980:
            if (r1 != 0) goto L_0x09e1
            int r2 = r0.mo63058K()
            r3 = 46
            if (r2 != r3) goto L_0x09e1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "jumpLiveUIAndDoAction, qbar:"
            r0.append(r1)
            java.lang.String r1 = r9.f300936f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            java.lang.String r0 = r9.f300936f     // Catch:{ all -> 0x09b0 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x09b0 }
            java.lang.String r1 = "id"
            java.lang.String r4 = r0.getQueryParameter(r1)     // Catch:{ all -> 0x09b0 }
            r19 = r4
            goto L_0x09b3
        L_0x09b0:
            r19 = r11
        L_0x09b3:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 != 0) goto L_0x09e0
            di3.d r0 = di3.C86312j.m106911c(r16)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r1 = 11
            r2 = 8
            r3 = 65
            java.lang.String r23 = r0.mo76802R1(r1, r2, r3)
            r20 = 0
            java.lang.String r22 = eb0.C75592q0.m90778h()
            di3.d r0 = di3.C86312j.m106911c(r16)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r17 = r0.mo76861l7()
            r18 = 1
            java.lang.String r24 = ""
            r17.mo83790h6(r18, r19, r20, r22, r23, r24)
        L_0x09e0:
            return
        L_0x09e1:
            if (r1 != 0) goto L_0x0a0d
            int r2 = r0.mo63058K()
            r3 = 47
            if (r2 != r3) goto L_0x0a0d
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            if (r13 == 0) goto L_0x09f2
            r1 = 1
            goto L_0x09f3
        L_0x09f2:
            r1 = 0
        L_0x09f3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r9.f300936f
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "jumpSetStatus, cnotnull:%s qbar:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            if (r13 == 0) goto L_0x0a0c
            java.lang.String r0 = r9.f300936f
            r9.mo141749m(r13, r0)
        L_0x0a0c:
            return
        L_0x0a0d:
            if (r1 != 0) goto L_0x0a3d
            int r2 = r0.mo63058K()
            r3 = 49
            if (r2 != r3) goto L_0x0a3d
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            if (r13 == 0) goto L_0x0a1e
            r1 = 1
            goto L_0x0a1f
        L_0x0a1e:
            r1 = 0
        L_0x0a1f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r9.f300936f
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "jump to quick set ringtone, cnotnull:%s qbar:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            java.lang.Class<dx.w> r0 = p145dx.C58457w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dx.w r0 = (p145dx.C58457w) r0
            r0.mo82791Pu(r13, r10)
            return
        L_0x0a3d:
            if (r1 != 0) goto L_0x0a5b
            int r0 = r0.mo63058K()
            r2 = 41
            if (r0 != r2) goto L_0x0a5b
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "key_qrcode_string"
            r0.putExtra(r1, r12)
            java.lang.String r1 = "account"
            java.lang.String r2 = ".friend.ui.RecoverAccountUI1"
            r3 = 0
            ke3.C88144b.m109791i(r13, r1, r2, r0, r3)
            return
        L_0x0a5b:
            r3 = 0
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = "scene geta8key, redirect result = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r0)
            if (r1 != 0) goto L_0x0a75
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x0a75
            r0.mo361b(r2, r3)
        L_0x0a75:
            return
        L_0x0a76:
            r13 = r7
            r14 = r8
            r3 = r10
            int r0 = r47.getType()
            r1 = 666(0x29a, float:9.33E-43)
            if (r0 != r1) goto L_0x0acd
            if (r44 != 0) goto L_0x0ac7
            if (r45 != 0) goto L_0x0ac7
            boolean r0 = r2 instanceof p008bq.C39832j1
            if (r0 == 0) goto L_0x0acd
            r0 = r2
            bq.j1 r0 = (p008bq.C39832j1) r0
            te3.el2 r0 = r0.mo62461B()
            java.lang.String r0 = r0.f132996d
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r1 = "[oneliang]NetSceneScanEmoji productId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r1, r2)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "extra_id"
            r1.putExtra(r2, r0)
            r0 = 11
            java.lang.String r2 = "preceding_scence"
            r1.putExtra(r2, r0)
            r0 = 14
            java.lang.String r2 = "download_entrance_scene"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "emoji"
            java.lang.String r2 = ".ui.EmojiStoreDetailUI"
            ke3.C88144b.m109791i(r13, r0, r2, r1, r3)
            java.lang.String r0 = "[oneliang]NetSceneScanEmoji onSceneEnd."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            r1 = 1
            r9.mo141750n(r1, r3)
            goto L_0x0acd
        L_0x0ac7:
            java.lang.String r0 = "jump emotion detail failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x0acd:
            return
        L_0x0ace:
            r13 = r5
            r3 = 0
            if (r13 == 0) goto L_0x0aff
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getErrMsgContent(r46)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0af5
            r0 = 2131830378(0x7f11266a, float:1.9293752E38)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r44)
            r4 = 0
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r45)
            r5 = 1
            r1[r5] = r2
            java.lang.String r0 = r13.getString(r0, r1)
            goto L_0x0af7
        L_0x0af5:
            r4 = 0
            r5 = 1
        L_0x0af7:
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r13, (java.lang.CharSequence) r0, (int) r4)
            r0.show()
            goto L_0x0b00
        L_0x0aff:
            r5 = 1
        L_0x0b00:
            ml2.f$a r0 = r9.f300947t
            if (r0 == 0) goto L_0x0b07
            r0.mo361b(r5, r3)
        L_0x0b07:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C102212j.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: p */
    public final int mo141753p(int i) {
        if (i == 1) {
            return 34;
        }
        if (i == 0) {
            return 4;
        }
        return i == 3 ? 42 : 30;
    }

    /* renamed from: q */
    public final void mo141754q(int i) {
        String str;
        String str2 = "";
        Bundle bundle = this.f300945r;
        if (bundle != null) {
            String string = bundle.getString("stat_url");
            int i2 = this.f300950w;
            if ((i2 == 6 || i2 == 0) && !Util.isNullOrNil(string)) {
                try {
                    str = URLEncoder.encode(Util.nullAsNil(string), "UTF-8");
                    try {
                        str2 = URLEncoder.encode(Util.nullAsNil(this.f300936f), "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e = e;
                        Log.printErrStackTrace("MicroMsg.QBarStringHandler", e, str2, new Object[0]);
                        C115669n.INSTANCE.mo160131h(13329, str, str2, Integer.valueOf(i));
                    }
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    str = str2;
                    Log.printErrStackTrace("MicroMsg.QBarStringHandler", e, str2, new Object[0]);
                    C115669n.INSTANCE.mo160131h(13329, str, str2, Integer.valueOf(i));
                }
                C115669n.INSTANCE.mo160131h(13329, str, str2, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: r */
    public final void mo141755r(Activity activity, String str) {
        Log.m105925i("MicroMsg.QBarStringHandler", "search finder contact %s", str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C117747y HO = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76759HO(arrayList);
        ((HashMap) this.f300949v).put(HO, 1);
        C86709a0.m107524d().mo123460f(HO);
        this.f300946s = C76879j.m92724R(activity, activity.getString(C0966R.string.a3h), activity.getString(C0966R.string.f361235id1), true, true, new j$$f(this, HO));
    }

    /* renamed from: s */
    public void mo141756s(boolean z) {
        if (z) {
            C10931f.C10933a aVar = this.f300947t;
            if (aVar != null) {
                aVar.mo361b(1, (Bundle) null);
                return;
            }
            return;
        }
        mo141750n(true, (Bundle) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141757t(p567iu.C46287c r12) {
        /*
            r11 = this;
            boolean r0 = r12.mo70812u0()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r11.f300934d
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0017
            return r1
        L_0x0017:
            te3.mx3 r12 = r12.mo70811l0()
            int r2 = r12.f227867q
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85810M4(r2)
            if (r2 == 0) goto L_0x00c0
            te3.r10 r2 = r12.f227844C
            if (r2 == 0) goto L_0x00c0
            java.lang.String r2 = r2.f140657e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x00c0
            te3.r10 r12 = r12.f227844C
            java.lang.String r12 = r12.f140657e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            r3 = 1
            if (r2 == 0) goto L_0x003b
            goto L_0x0053
        L_0x003b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0053 }
            r2.<init>(r12)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r12 = "BindWxaInfo"
            org.json.JSONObject r12 = r2.optJSONObject(r12)     // Catch:{ JSONException -> 0x0053 }
            if (r12 == 0) goto L_0x0053
            java.lang.String r2 = "openWxaByBizQRCode"
            int r12 = r12.optInt(r2, r1)     // Catch:{ JSONException -> 0x0053 }
            if (r12 <= 0) goto L_0x0053
            r12 = 1
            goto L_0x0054
        L_0x0053:
            r12 = 0
        L_0x0054:
            if (r12 == 0) goto L_0x00c0
            int r12 = r11.f300928B
            if (r12 <= 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            int r12 = r11.f300935e
            int r12 = r11.mo141753p(r12)
        L_0x0061:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r11.f300936f
            r2[r1] = r4
            int r4 = r11.f300935e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r4 = 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2[r4] = r12
            java.lang.String r12 = "MicroMsg.QBarStringHandler"
            java.lang.String r4 = "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r2)
            java.lang.Class<vs.d> r12 = p728vs.C52990d.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            r4 = r12
            vs.d r4 = (p728vs.C52990d) r4
            java.lang.String r5 = r11.f300936f
            r6 = 0
            r7 = 43
            r8 = 0
            r9 = 0
            byte[] r10 = new byte[r1]
            vs.e r12 = r4.mo73579xD(r5, r6, r7, r8, r9, r10)
            java.util.Map<ob0.y, java.lang.Integer> r1 = r11.f300949v
            r2 = r12
            ob0.y r2 = (ob0.C117747y) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r2, r4)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r2)
            android.app.ProgressDialog r1 = r11.f300946s
            if (r1 == 0) goto L_0x00b0
            r1.dismiss()
        L_0x00b0:
            r1 = 2131834310(0x7f1135c6, float:1.9301727E38)
            java.lang.String r0 = r0.getString(r1)
            vl2.j$a r1 = new vl2.j$a
            r1.<init>(r12)
            r11.mo141758u(r0, r1)
            return r3
        L_0x00c0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.C102212j.mo141757t(iu.c):boolean");
    }

    /* renamed from: u */
    public final void mo141758u(String str, C94528d.C94529a aVar) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.f300944q);
        if (this.f300948u == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.QBarStringHandler", "alvinluo showLoading isFromScanUI: %b, loadingViewModel == null: %b", objArr);
        if (this.f300948u == null || !this.f300944q) {
            mo141759v(str, aVar);
            return;
        }
        mo141741d();
        C22769s sVar = new C22769s(this.f300948u, new C102215m(this), aVar);
        this.f300931E = sVar;
        this.f300930D = ((C119157j) C119157j.f356862d).mo183878i(sVar, 500);
    }

    /* renamed from: v */
    public final void mo141759v(String str, C94528d.C94529a aVar) {
        ProgressDialog progressDialog = this.f300946s;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        WeakReference<Activity> weakReference = this.f300934d;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            this.f300946s = C76879j.m92723Q(context, "", str, true, true, new j$$p(this, aVar));
        }
    }

    /* renamed from: o */
    public void mo141751o() {
        if (!(this.f300933I == null || mo141745i() == null)) {
            ((Application) mo141745i().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f300933I);
            this.f300933I = null;
        }
        WeakReference<Activity> weakReference = this.f300934d;
        if (weakReference != null) {
            weakReference.clear();
            this.f300934d = null;
        }
        ProgressDialog progressDialog = this.f300946s;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f300946s = null;
    }
}
