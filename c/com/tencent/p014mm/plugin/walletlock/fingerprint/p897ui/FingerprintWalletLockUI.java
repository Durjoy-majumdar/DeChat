package com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui;

import al3.C0086a;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import b73.C28273c;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.plugin.walletlock.model.C106556c;
import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import com.tencent.p014mm.plugin.walletlock.model.C106560i;
import com.tencent.p014mm.plugin.walletlock.model.C106561j;
import com.tencent.p014mm.plugin.walletlock.p951ui.C85509a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import e73.C107243a;
import e73.C107245c;
import e73.C107247d;
import e73.C107248e;
import e73.C107250i;
import e73.C107251j;
import e73.C107252k;
import e73.C45551f;
import e73.C45552g;
import f40.C86709a0;
import f73.C107482b;
import f73.C107484d;
import f73.C107485e;
import f73.C75728a;
import f73.C75729f;
import g73.C107761f;
import g73.C107762g;
import g73.C8242a;
import h81.C32735h;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import lt3.C21460a;
import nj3.C76879j;
import ot3.C21889m;
import p602ly.C109440d;
import p602ly.C76737c;
import p623nr.C76956i;
import p910lj.C76701a;
import pv2.C110259i;
import pv2.C110260j;
import pv2.C77292s;
import qo3.C77389a;
import qo3.C77398g;
import yt3.C23319f;

/* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI */
public class FingerprintWalletLockUI extends MMActivity implements C85509a {

    /* renamed from: C */
    public static final /* synthetic */ int f318266C = 0;

    /* renamed from: A */
    public int f318267A = -1;

    /* renamed from: B */
    public int f318268B = -1;

    /* renamed from: d */
    public TextView f318269d;

    /* renamed from: e */
    public TextView f318270e;

    /* renamed from: f */
    public TextView f318271f;

    /* renamed from: g */
    public TextView f318272g;

    /* renamed from: h */
    public Animation f318273h;

    /* renamed from: i */
    public String f318274i;

    /* renamed from: j */
    public String f318275j;

    /* renamed from: n */
    public String f318276n;

    /* renamed from: o */
    public String f318277o;

    /* renamed from: p */
    public C107248e f318278p;

    /* renamed from: q */
    public C107252k f318279q;

    /* renamed from: r */
    public C106556c f318280r;

    /* renamed from: s */
    public String f318281s = "-1";

    /* renamed from: t */
    public int f318282t = 0;

    /* renamed from: u */
    public ProgressDialog f318283u = null;

    /* renamed from: v */
    public C77398g f318284v = null;

    /* renamed from: w */
    public String f318285w = null;

    /* renamed from: x */
    public boolean f318286x = false;

    /* renamed from: y */
    public boolean f318287y = false;

    /* renamed from: z */
    public boolean f318288z = true;

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$g */
    public class C72592g implements DialogInterface.OnClickListener {
        public C72592g(FingerprintWalletLockUI fingerprintWalletLockUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo click negative button");
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$h */
    public class C72593h implements DialogInterface.OnClickListener {
        public C72593h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FingerprintWalletLockUI fingerprintWalletLockUI = FingerprintWalletLockUI.this;
            int i2 = FingerprintWalletLockUI.f318266C;
            fingerprintWalletLockUI.getClass();
            Intent intent = new Intent();
            intent.putExtra("key_wallet_lock_setting_scene", 1);
            ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91347a(fingerprintWalletLockUI, intent, 3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$a */
    public class C106528a implements Runnable {
        public C106528a() {
        }

        public void run() {
            FingerprintWalletLockUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$b */
    public class C106529b implements DialogInterface.OnClickListener {
        public C106529b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FingerprintWalletLockUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$c */
    public class C106530c implements Runnable {
        public C106530c() {
        }

        public void run() {
            FingerprintWalletLockUI.this.f318269d.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$d */
    public class C106531d implements View.OnClickListener {
        public C106531d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FingerprintWalletLockUI fingerprintWalletLockUI = FingerprintWalletLockUI.this;
            int i = FingerprintWalletLockUI.f318266C;
            fingerprintWalletLockUI.mo153195T7(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$e */
    public class C106532e implements View.OnClickListener {
        public C106532e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FingerprintWalletLockUI fingerprintWalletLockUI = FingerprintWalletLockUI.this;
            int i = FingerprintWalletLockUI.f318266C;
            fingerprintWalletLockUI.mo153187L7();
            FingerprintWalletLockUI.this.mo153188M7(0, 4, "user cancel setting fingerprint lock");
            C117292a.m165361g(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$f */
    public class C106533f implements View.OnClickListener {
        public C106533f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FingerprintWalletLockUI fingerprintWalletLockUI = FingerprintWalletLockUI.this;
            int i = FingerprintWalletLockUI.f318266C;
            fingerprintWalletLockUI.mo153195T7(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$i */
    public class C106534i implements DialogInterface.OnClickListener {
        public C106534i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FingerprintWalletLockUI fingerprintWalletLockUI = FingerprintWalletLockUI.this;
            int i2 = FingerprintWalletLockUI.f318266C;
            fingerprintWalletLockUI.mo153187L7();
            FingerprintWalletLockUI.this.mo153188M7(-1, 4, "need set finger print in system");
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI$j */
    public class C106535j implements C106556c {

        /* renamed from: a */
        public WeakReference<FingerprintWalletLockUI> f318296a = null;

        public C106535j(FingerprintWalletLockUI fingerprintWalletLockUI) {
            this.f318296a = new WeakReference<>(fingerprintWalletLockUI);
        }

        /* renamed from: a */
        public final FingerprintWalletLockUI mo153204a() {
            WeakReference<FingerprintWalletLockUI> weakReference = this.f318296a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:67:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01ac  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo153205b(int r17, java.lang.String r18) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = 3
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
                r5 = 0
                r3[r5] = r4
                r4 = 1
                r3[r4] = r18
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r6 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                boolean r6 = r6.f318287y
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r7 = 2
                r3[r7] = r6
                java.lang.String r6 = "MicroMsg.FingerprintWalletLockUI"
                java.lang.String r8 = "alvinluo onResult result: %d, errMsg: %s, isCancelled: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r3)
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r3 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                java.lang.String r3 = r3.f318274i
                r8 = 3
                r10 = 1
                java.lang.String r12 = "action.switch_on_pattern"
                if (r3 == 0) goto L_0x0041
                boolean r3 = r3.equals(r12)
                if (r3 == 0) goto L_0x0041
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct
                r3.<init>()
                r3.f194681d = r8
                r3.f194682e = r10
                r3.mo86054n()
            L_0x0041:
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r3 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                java.lang.String r3 = r3.f318274i
                r13 = 9
                r8 = 7
                java.lang.String r15 = "action.verify_pattern"
                if (r3 == 0) goto L_0x0074
                boolean r3 = r3.equals(r15)
                if (r3 == 0) goto L_0x0074
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r3 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                int r3 = r3.f318268B
                if (r3 != r4) goto L_0x0066
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct
                r3.<init>()
                r3.f194681d = r8
                r3.f194682e = r10
                r3.mo86054n()
                goto L_0x0074
            L_0x0066:
                if (r3 != r7) goto L_0x0074
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct
                r3.<init>()
                r3.f194681d = r13
                r3.f194682e = r10
                r3.mo86054n()
            L_0x0074:
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r3 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                boolean r3 = r3.f318287y
                if (r3 == 0) goto L_0x007b
                return
            L_0x007b:
                if (r0 == 0) goto L_0x0122
                r3 = 2131839184(0x7f1148d0, float:1.9311612E38)
                if (r0 == r4) goto L_0x0108
                if (r0 == r7) goto L_0x00f0
                if (r0 == r2) goto L_0x00cb
                r2 = 4
                if (r0 == r2) goto L_0x00c4
                r2 = 5
                if (r0 == r2) goto L_0x00aa
                r2 = 8
                if (r0 == r2) goto L_0x0092
                goto L_0x01f8
            L_0x0092:
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                if (r2 == 0) goto L_0x01f8
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r3 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                r4 = 2131839193(0x7f1148d9, float:1.931163E38)
                java.lang.String r3 = r3.getString(r4)
                com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.m143824I7(r2, r0, r3)
                goto L_0x01f8
            L_0x00aa:
                java.lang.String r2 = "alvinluo identify TIMEOUT"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                if (r2 == 0) goto L_0x01f8
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r4 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                java.lang.String r3 = r4.getString(r3)
                com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.m143823H7(r2, r0, r3)
                goto L_0x01f8
            L_0x00c4:
                java.lang.String r0 = "alvinluo user cancel"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x01f8
            L_0x00cb:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
                r2[r5] = r3
                java.lang.String r3 = "alvinluo on error: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r2)
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                if (r2 == 0) goto L_0x01f8
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r3 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                r4 = 2131839183(0x7f1148cf, float:1.931161E38)
                java.lang.String r3 = r3.getString(r4)
                com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.m143824I7(r2, r0, r3)
                goto L_0x01f8
            L_0x00f0:
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                if (r2 == 0) goto L_0x01f8
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r3 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                r4 = 2131839176(0x7f1148c8, float:1.9311596E38)
                java.lang.String r3 = r3.getString(r4)
                com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.m143824I7(r2, r0, r3)
                goto L_0x01f8
            L_0x0108:
                java.lang.String r2 = "alvinluo identify ERR_NO_MATCH"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                if (r2 == 0) goto L_0x01f8
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r4 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                java.lang.String r3 = r4.getString(r3)
                com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.m143823H7(r2, r0, r3)
                goto L_0x01f8
            L_0x0122:
                java.lang.String r0 = "identify success"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r0 = r16.mo153204a()
                if (r0 == 0) goto L_0x01af
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r2 = r16.mo153204a()
                int r0 = r2.f318268B
                com.tencent.p014mm.plugin.walletlock.model.C106560i.m143897c(r0, r7, r5)
                com.tencent.mm.plugin.walletlock.model.h r0 = com.tencent.p014mm.plugin.walletlock.model.C106559h.instance
                ot3.m r0 = r0.f318382e
                if (r0 == 0) goto L_0x01af
                java.lang.String r0 = r0.f61891b
                r2.f318281s = r0
                java.lang.Object[] r3 = new java.lang.Object[r4]
                r3[r5] = r0
                java.lang.String r0 = "alvinluo authSuccess and mFid: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r0, r3)
                java.lang.String r0 = r2.f318276n
                boolean r0 = r0.equals(r12)
                if (r0 == 0) goto L_0x0159
                java.lang.String r0 = r2.f318275j
                r2.f318276n = r0
                r2.mo153190O7()
                goto L_0x01af
            L_0x0159:
                java.lang.String r0 = r2.f318276n
                boolean r0 = r0.equals(r15)
                if (r0 == 0) goto L_0x01af
                java.lang.String r3 = r2.f318281s
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLETLOCK_FINGERPRINT_FID_LIST_STRING_SYNC
                r10 = 0
                java.lang.Object r0 = r0.mo119685f(r6, r10)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object[] r6 = new java.lang.Object[r7]
                r6[r5] = r3
                r6[r4] = r0
                java.lang.String r11 = "MicroMsg.FingerprintInfoStorage"
                java.lang.String r10 = "alvinluo fid: %s, fidInfoList: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r6)
                if (r0 != 0) goto L_0x0185
            L_0x0183:
                r10 = 0
                goto L_0x0195
            L_0x0185:
                org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x018c }
                r6.<init>(r0)     // Catch:{ Exception -> 0x018c }
                r10 = r6
                goto L_0x0195
            L_0x018c:
                r0 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r10 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r10, r6)
                goto L_0x0183
            L_0x0195:
                java.util.HashSet r0 = e73.C107243a.m145334c(r10)
                if (r0 == 0) goto L_0x01a2
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L_0x01a2
                r5 = 1
            L_0x01a2:
                if (r5 == 0) goto L_0x01ac
                java.lang.String r0 = r2.f318275j
                r2.f318276n = r0
                r2.mo153190O7()
                goto L_0x01af
            L_0x01ac:
                r2.mo153195T7(r7)
            L_0x01af:
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r0 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                java.lang.String r0 = r0.f318274i
                r2 = 2
                if (r0 == 0) goto L_0x01cb
                boolean r0 = r0.equals(r12)
                if (r0 == 0) goto L_0x01cb
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct
                r0.<init>()
                r5 = 3
                r0.f194681d = r5
                r0.f194682e = r2
                r0.mo86054n()
            L_0x01cb:
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r0 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                java.lang.String r0 = r0.f318274i
                if (r0 == 0) goto L_0x01f8
                boolean r0 = r0.equals(r15)
                if (r0 == 0) goto L_0x01f8
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI r0 = com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.this
                int r0 = r0.f318268B
                if (r0 != r4) goto L_0x01ea
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct
                r0.<init>()
                r0.f194681d = r8
                r0.f194682e = r2
                r0.mo86054n()
                goto L_0x01f8
            L_0x01ea:
                if (r0 != r7) goto L_0x01f8
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct
                r0.<init>()
                r0.f194681d = r13
                r0.f194682e = r2
                r0.mo86054n()
            L_0x01f8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI.C106535j.mo153205b(int, java.lang.String):void");
        }
    }

    /* renamed from: H7 */
    public static void m143823H7(FingerprintWalletLockUI fingerprintWalletLockUI, int i, String str) {
        fingerprintWalletLockUI.getClass();
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo onAuthenFailed errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        C106560i.m143897c(fingerprintWalletLockUI.f318268B, 2, 1);
        fingerprintWalletLockUI.mo153192Q7(str);
    }

    /* renamed from: I7 */
    public static void m143824I7(FingerprintWalletLockUI fingerprintWalletLockUI, int i, String str) {
        fingerprintWalletLockUI.getClass();
        Log.m105921e("MicroMsg.FingerprintWalletLockUI", "alvinluo onAuthenError errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        C107243a.f320886a = -1;
        fingerprintWalletLockUI.mo153185J7();
        if (i == 3) {
            C106560i.m143897c(fingerprintWalletLockUI.f318268B, 2, 2);
            C107243a.m145336e(System.currentTimeMillis(), 0);
            fingerprintWalletLockUI.f318269d.setText(C0966R.string.kvf);
            fingerprintWalletLockUI.f318269d.setTextColor(fingerprintWalletLockUI.getResources().getColor(C0966R.color.a_0));
        } else if (i == 8) {
            fingerprintWalletLockUI.mo153194S7();
        } else {
            fingerprintWalletLockUI.mo153192Q7(str);
        }
    }

    /* renamed from: J7 */
    public final void mo153185J7() {
        mo153186K7();
        C77398g gVar = this.f318284v;
        if (gVar != null && gVar.isShowing()) {
            this.f318284v.dismiss();
        }
    }

    /* renamed from: K7 */
    public final void mo153186K7() {
        ProgressDialog progressDialog = this.f318283u;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f318283u.dismiss();
        }
    }

    /* renamed from: L7 */
    public final void mo153187L7() {
        C106561j.INSTANCE.mo153260b();
    }

    /* renamed from: M7 */
    public final void mo153188M7(int i, int i2, String str) {
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo finish with result, resultCode: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        release();
        Intent intent = new Intent();
        intent.putExtra("key_err_code", i2);
        intent.putExtra("key_err_msg", str);
        setResult(i, intent);
        finish();
        if (i2 == 4 || i2 == 0) {
            WalletLockProtectEvent walletLockProtectEvent = new WalletLockProtectEvent();
            WalletLockProtectEvent.C104598a aVar = walletLockProtectEvent.f310017d;
            aVar.f310019a = i2 == 4 ? 5 : 6;
            aVar.f310020b = this;
            walletLockProtectEvent.publish();
        }
    }

    /* renamed from: N7 */
    public final void mo153189N7() {
        this.f318288z = false;
        MMHandlerThread.postToMainThreadDelayed(new C106528a(), 200);
        Intent intent = (Intent) getIntent().getParcelableExtra("page_intent");
        if (intent != null) {
            Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo go to protected page");
            C106561j jVar = C106561j.INSTANCE;
            jVar.mo153263f(true);
            jVar.mo153264g(true);
            intent.addFlags(131072);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "goToProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "goToProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
            return;
        }
        Log.m105924i("MicroMsg.FingerprintWalletLockUI", "Protected page's intent not found, finish myself only.");
    }

    /* renamed from: O7 */
    public final void mo153190O7() {
        C106559h hVar = C106559h.instance;
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "currentAction: %s", this.f318276n);
        if (Util.isNullOrNil(this.f318276n)) {
            finish();
            return;
        }
        String str = this.f318276n;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1423990800:
                if (str.equals("next_action.goto_protected_page")) {
                    c = 0;
                    break;
                }
                break;
            case -1305462654:
                if (str.equals("action.verify_pattern")) {
                    c = 1;
                    break;
                }
                break;
            case -639789777:
                if (str.equals("next_action.switch_on_pattern")) {
                    c = 2;
                    break;
                }
                break;
            case 1420518755:
                if (str.equals("action.switch_on_pattern")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C107243a.f320886a = SystemClock.elapsedRealtime();
                mo153189N7();
                return;
            case 1:
            case 3:
                Class cls = C109440d.class;
                this.f318280r = new C106535j(this);
                this.f318281s = "-1";
                if (this.f318279q == null) {
                    this.f318279q = new C107252k();
                }
                boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
                Log.m105925i("MicroMsg.FingerprintWalletLockUI", "use biometric prompt: %s", Boolean.valueOf(z));
                if (z) {
                    C76956i.C76957a aVar = new C76956i.C76957a();
                    if (this.f318267A == 1) {
                        aVar.f224885a = getString(C0966R.string.m9s);
                        aVar.f224886b = getString(C0966R.string.m9r);
                        aVar.f224887c = getString(C0966R.string.f7926wf);
                    } else {
                        aVar.f224885a = getString(C0966R.string.m9s);
                        aVar.f224887c = getString(C0966R.string.f7926wf);
                    }
                    C107252k kVar = this.f318279q;
                    C106556c cVar = this.f318280r;
                    if (kVar.f320896a == null) {
                        kVar.f320896a = ((C109440d) C86312j.m106911c(cls)).mo160182Uq();
                    }
                    hVar.f318382e = null;
                    kVar.f320896a.mo107278c(new C107251j(kVar, cVar), MMApplicationContext.getContext(), 3, 1, hVar.f318381d, aVar);
                    return;
                }
                C107252k kVar2 = this.f318279q;
                C106556c cVar2 = this.f318280r;
                if (kVar2.f320896a == null) {
                    kVar2.f320896a = ((C109440d) C86312j.m106911c(cls)).mo160182Uq();
                }
                hVar.f318382e = null;
                kVar2.f320896a.mo107276a(new C107250i(kVar2, cVar2), MMApplicationContext.getContext(), 3, 1, hVar.f318381d);
                return;
            case 2:
                C21889m mVar = hVar.f318382e;
                if (mVar == null) {
                    mo153192Q7(getString(C0966R.string.kvd));
                    return;
                }
                String str2 = mVar.f61899j;
                String str3 = mVar.f61900k;
                if (this.f318278p != null) {
                    this.f318283u = C76879j.m92723Q(this, "", getString(C0966R.string.kvk), false, false, (DialogInterface.OnCancelListener) null);
                    C107248e eVar = this.f318278p;
                    C107482b bVar = new C107482b(this);
                    String str4 = this.f318277o;
                    C107245c cVar3 = (C107245c) eVar;
                    cVar3.getClass();
                    Log.m105924i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo do open fingerprint lock");
                    cVar3.f320888e = bVar;
                    C86709a0.m107524d().mo123460f(new C45552g(str2, str3, str4));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: P7 */
    public final void mo153191P7(String str) {
        if (Util.isNullOrNil(str)) {
            str = getString(C0966R.string.kvh);
        }
        mo153185J7();
        C77398g G = C76879j.m92713G(this, str, "", true, new C106529b());
        this.f318284v = G;
        G.setCanceledOnTouchOutside(false);
    }

    /* renamed from: Q7 */
    public final void mo153192Q7(String str) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (currentTimeMillis - this.f318282t > 1) {
            this.f318282t = currentTimeMillis;
            mo153185J7();
            TextView textView = this.f318269d;
            if (textView != null) {
                textView.setText(str);
                this.f318269d.setTextColor(getResources().getColor(C0966R.color.a_0));
                this.f318269d.setVisibility(4);
                if (this.f318273h == null) {
                    this.f318273h = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2402c6);
                }
                this.f318269d.startAnimation(this.f318273h);
                MMHandlerThread.postToMainThreadDelayed(new C106530c(), this.f318273h.getDuration());
            }
        }
    }

    /* renamed from: R7 */
    public final void mo153193R7() {
        if (this.f318274i.equals("action.verify_pattern")) {
            this.f318269d.setText(C0966R.string.kvi);
            this.f318269d.setTextColor(getResources().getColor(C0966R.color.a7f));
            this.f318272g.setVisibility(0);
            return;
        }
        this.f318269d.setText(C0966R.string.kvb);
        this.f318269d.setTextColor(getResources().getColor(C0966R.color.a7f));
        this.f318272g.setVisibility(8);
    }

    /* renamed from: S7 */
    public final void mo153194S7() {
        mo153186K7();
        C77398g.C77402i iVar = new C77398g.C77402i(this);
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAuthType: %d", Integer.valueOf(this.f318267A));
        if (this.f318267A == 2) {
            iVar.mo107550c(C0966R.string.kvp);
            iVar.mo107552e(C0966R.string.kvu);
            iVar.f225714b.f225620C = new C72593h();
            iVar.mo107551d(C0966R.string.f7926wf);
            iVar.f225714b.f225621D = new C72592g(this);
        } else {
            iVar.mo107550c(C0966R.string.kvo);
            String string = getString(C0966R.string.a18);
            C77389a aVar = iVar.f225714b;
            aVar.f225663t = string;
            aVar.f225620C = new C106534i();
        }
        C77398g a = iVar.mo107548a();
        this.f318284v = a;
        a.setCanceledOnTouchOutside(false);
        this.f318284v.show();
    }

    /* renamed from: T7 */
    public final void mo153195T7(int i) {
        Intent intent = new Intent();
        if (i == 1) {
            intent.putExtra("action", "action.touchlock_verify_by_paypwd");
        } else if (i == 2) {
            intent.putExtra("action", "action.touchlock_need_verify_paypwd");
            intent.putExtra("key_wallet_lock_input_new_fp_tips", getString(C0966R.string.kvn));
        }
        intent.putExtra("key_wallet_lock_type", 2);
        C88144b.m109795m(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i);
    }

    public void finish() {
        super.finish();
        release();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.arm;
    }

    public void initView() {
        super.initView();
        this.f318269d = (TextView) findViewById(C0966R.C0970id.e9m);
        this.f318270e = (TextView) findViewById(C0966R.C0970id.hs8);
        this.f318271f = (TextView) findViewById(C0966R.C0970id.e9h);
        this.f318272g = (TextView) findViewById(C0966R.C0970id.e9j);
        this.f318270e.setOnClickListener(new C106531d());
        this.f318271f.setOnClickListener(new C106532e());
        this.f318272g.setOnClickListener(new C106533f());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105927v("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (intent == null) {
            Log.m105920e("MicroMsg.FingerprintWalletLockUI", "alvinluo data is null");
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", -1);
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult errCode: %d", Integer.valueOf(intExtra));
        if (i == 1) {
            if (intExtra == 0) {
                mo153189N7();
                Log.m105924i("MicroMsg.WalletLockReportManager", "alvinluo idkey report fingerprintlock verify by passwd success");
                C115669n.INSTANCE.idkeyStat(713, 2, 1, false);
            } else if (intExtra == -1) {
                this.f318288z = false;
                mo153191P7(getString(C0966R.string.f361567kw0));
            }
        } else if (i == 2) {
            if (intExtra == 0) {
                C107243a.m145332a(this.f318281s);
                C107243a.f320886a = SystemClock.elapsedRealtime();
                mo153189N7();
            } else if (intExtra == -1) {
                this.f318288z = false;
                mo153191P7(getString(C0966R.string.f361567kw0));
            }
        } else if (i == 3) {
            if (intExtra == 0) {
                mo153189N7();
                return;
            }
            mo153187L7();
            mo153188M7(-1, intExtra, "user cancel when set wallet lock");
        } else if (i == 4) {
            if (intExtra == 0) {
                mo153189N7();
            } else if (intExtra == -1) {
                this.f318288z = false;
                mo153191P7(getString(C0966R.string.kvl));
            } else {
                mo153187L7();
                mo153188M7(-1, intExtra, "user cancel when open gesture");
            }
        } else if (i != 5) {
        } else {
            if (intExtra == 0) {
                ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91359l(0);
                C107761f.f322498a = -1;
                C107243a.f320886a = -1;
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.kv4), 0).show();
                mo153189N7();
            } else if (intExtra == -1) {
                this.f318288z = false;
                mo153191P7(getString(C0966R.string.kv5));
            } else if (intExtra == 4) {
                mo153187L7();
                mo153188M7(-1, intExtra, "user cancel when close wallet lock");
            }
        }
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo onBackPressed");
        mo153187L7();
        mo153188M7(0, 4, "user click back button");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo onCreate %d", Long.valueOf(System.currentTimeMillis()));
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        initView();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("action");
        this.f318274i = stringExtra;
        this.f318276n = stringExtra;
        this.f318275j = intent.getStringExtra("next_action");
        this.f318277o = intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        this.f318285w = intent.getStringExtra("key_pay_passwd");
        this.f318268B = intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAction: %s, mNextAction: %s", this.f318274i, this.f318275j);
        if (this.f318274i.equals("action.verify_pattern")) {
            this.f318267A = 2;
            long currentTimeMillis = System.currentTimeMillis();
            C106560i.f318384a = currentTimeMillis;
            Log.m105925i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock report create session: %d", Long.valueOf(currentTimeMillis));
        } else if (this.f318274i.equals("action.switch_on_pattern")) {
            this.f318267A = 1;
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo FingerprintWalletLockUI onPause");
        mo153185J7();
        release();
        this.f318288z = true;
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo needResume: %b", Boolean.valueOf(this.f318288z));
        if (this.f318288z) {
            this.f318278p = new C107245c();
            this.f318279q = new C107252k();
            this.f318287y = false;
            C23319f.m27817c().mo36811b();
            this.f318283u = C76879j.m92723Q(this, "", getString(C0966R.string.a4d), false, false, (DialogInterface.OnCancelListener) null);
            mo153193R7();
            if (this.f318274i.equals("action.switch_on_pattern")) {
                this.f318286x = false;
            } else {
                this.f318286x = true;
            }
            Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo start prepare, time: %d, isOffline: %b", Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(this.f318286x));
            C106559h hVar = C106559h.instance;
            boolean z = (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("TouchLockFunction", 0) != 1) && C77292s.m93116c() && C21460a.m24280n(MMApplicationContext.getContext());
            if (hVar.mo153255c() && !z) {
                Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opend fingerprint lock but device not support soter, isSupportFingerprintLock: %b", Boolean.valueOf(z));
                if (C107762g.m145997e()) {
                    Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opened gesture, then switch to gesture");
                    ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91359l(1);
                    hVar.mo153257f(true);
                    finish();
                    Intent intent = new Intent(this, GestureGuardLogicUI.class);
                    intent.addFlags(131072);
                    intent.putExtra("action", "action.verify_pattern");
                    intent.putExtra("next_action", "next_action.goto_protected_page");
                    intent.putExtra("page_intent", (Intent) getIntent().getParcelableExtra("page_intent"));
                    intent.setPackage(MMApplicationContext.getPackageName());
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLETLOCK_IS_AUTO_JUMP_TO_GESTURE_WHEN_NOT_SUPPORT_FINGERPRINT_BOOLEAN_SYNC;
                    boolean g = i.mo119686g(aVar, false);
                    if (!g) {
                        intent.putExtra("verify_title", getString(C0966R.string.kvy));
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                        C86709a0.m107535s().mo121142i().mo119681a(true);
                    }
                    Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo start gesture protect ui, isShowed: %b", Boolean.valueOf(g));
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "startGestureProtect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI", "startGestureProtect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C115669n.INSTANCE.mo160131h(12097, 8, 0, Long.valueOf(System.currentTimeMillis()));
                } else {
                    Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo show not support fingerprint dialog");
                    mo153186K7();
                    C77389a aVar3 = new C77389a();
                    aVar3.f225660q = C0086a.m38a(this).getString(C0966R.string.kvq);
                    aVar3.f225663t = C0086a.m38a(this).getString(C0966R.string.kvv);
                    aVar3.f225620C = new C75729f(this);
                    aVar3.f225622E = new C107485e(this);
                    C77398g gVar = new C77398g(this, C0966R.style.a66);
                    gVar.mo107525e(aVar3);
                    this.f318284v = gVar;
                    gVar.setCanceledOnTouchOutside(false);
                    this.f318284v.mo107539t(getString(C0966R.string.f361566kv3), false, new C75728a(this));
                    this.f318284v.show();
                }
            } else if (!C21460a.m24281o(this)) {
                mo153194S7();
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("key_pay_passwd", this.f318285w);
                bundle.putBoolean("key_fp_lock_offline_mode", this.f318286x);
                C107248e eVar = this.f318278p;
                C107484d dVar = new C107484d(this);
                C107245c cVar = (C107245c) eVar;
                cVar.getClass();
                cVar.f320889f = bundle.getString("key_pay_passwd");
                boolean z2 = bundle.getBoolean("key_fp_lock_offline_mode");
                cVar.f320890g = z2;
                Log.m105925i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepare pwd: %s, isOfflineMode: %b", cVar.f320889f, Boolean.valueOf(z2));
                cVar.f320887d = dVar;
                cVar.f320891h = false;
                hVar.f318381d = null;
                hVar.f318382e = null;
                C86709a0.m107524d().mo123455a(1967, cVar);
                C86709a0.m107524d().mo123455a(1548, cVar);
                if (cVar.f320890g) {
                    hVar.f318381d = String.valueOf(System.currentTimeMillis());
                    cVar.mo157719a(false);
                } else if (MMApplicationContext.getDefaultPreference() == null) {
                    C107248e.C107249a aVar4 = cVar.f320887d;
                    if (aVar4 != null) {
                        aVar4.mo157720n(2, "system error");
                    }
                } else {
                    C110260j a = C110259i.m149874a();
                    String str = a.f329808a;
                    String str2 = a.f329809b;
                    Log.m105925i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo cpuId: %s, uid: %s", str, str2);
                    if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
                        ((C76737c) C86312j.m106911c(C76737c.class)).mo59454n6(true, true, new C107247d(cVar));
                    } else {
                        C86709a0.m107524d().mo123460f(new C45551f(str, str2));
                    }
                }
            }
            Log.m105925i("MicroMsg.FingerprintWalletLockUI", "onResume end: %d", Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void release() {
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo fingerprint lock ui release isCancelled: %b", Boolean.valueOf(this.f318287y));
        if (!this.f318287y) {
            this.f318287y = true;
            C107252k kVar = this.f318279q;
            if (kVar != null) {
                kVar.getClass();
                Log.m105924i("MicroMsg.SoterFingerprintAuthManager", "alvinluo release fingerprint auth");
                C76956i iVar = kVar.f320896a;
                if (iVar != null) {
                    iVar.cancel();
                }
            }
            C107248e eVar = this.f318278p;
            if (eVar != null) {
                C107245c cVar = (C107245c) eVar;
                cVar.getClass();
                Log.m105918d("MicroMsg.FingerprintLockOpenDelegate", "alvinluo release open delegate");
                cVar.f320887d = null;
                cVar.f320888e = null;
                cVar.f320891h = true;
                C86709a0.m107524d().mo123470p(1967, cVar);
                C86709a0.m107524d().mo123470p(1548, cVar);
            }
            C23319f.m27817c().mo36811b();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C8242a.class);
    }
}
