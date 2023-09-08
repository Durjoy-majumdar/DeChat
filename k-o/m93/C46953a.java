package m93;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserSettingDialogView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import n93.C47210a;
import n93.C47212c;
import o93.C47345a;
import p93.C11874a;
import p93.C47437b;
import p93.C47440e;
import rx3.C13598b0;
import sx3.C110818d0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: m93.a */
public final class C46953a {

    /* renamed from: a */
    public final C47345a f126251a;

    /* renamed from: b */
    public long f126252b;

    /* renamed from: c */
    public final List<C46973j> f126253c = new ArrayList();

    /* renamed from: d */
    public int f126254d;

    /* renamed from: e */
    public int f126255e = -1;

    /* renamed from: f */
    public C47440e f126256f;

    /* renamed from: g */
    public final C46954a f126257g = new C46954a(this);

    /* renamed from: h */
    public final C46958b f126258h = new C46958b(this);

    /* renamed from: m93.a$a */
    public static final class C46954a implements C47210a {

        /* renamed from: a */
        public final /* synthetic */ C46953a f126259a;

        /* renamed from: m93.a$a$a */
        public static final class C46955a implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C46953a f126260d;

            public C46955a(C46953a aVar) {
                this.f126260d = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                this.f126260d.mo72134b(-1, (Intent) null);
            }
        }

        /* renamed from: m93.a$a$b */
        public static final class C46956b implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C46953a f126261d;

            public C46956b(C46953a aVar) {
                this.f126261d = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C46953a.m52267a(this.f126261d, 4);
            }
        }

        /* renamed from: m93.a$a$c */
        public static final class C46957c implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C46953a f126262d;

            public C46957c(C46953a aVar) {
                this.f126262d = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C46953a aVar = this.f126262d;
                aVar.getClass();
                Log.m105924i("MicroMsg.BrowserChooseController", "alvinluo showSettingDialog");
                C47440e eVar = new C47440e(aVar.f126251a.getUIContext());
                eVar.setOnKeyListener(new C46964b(eVar, aVar));
                eVar.setOnCancelListener(new C46966c(aVar));
                C46958b bVar = aVar.f126258h;
                C46973j jVar = (C46973j) C110818d0.m150917O(aVar.f126253c, aVar.f126255e);
                if (jVar == null) {
                    jVar = new C46973j(2);
                }
                bVar.f126263a = jVar;
                C46958b bVar2 = aVar.f126258h;
                eVar.f127261g = bVar2;
                BrowserSettingDialogView browserSettingDialogView = eVar.f127260f;
                if (browserSettingDialogView != null) {
                    browserSettingDialogView.setBrowserSettingDialogClickListener(bVar2);
                }
                eVar.f127263i = aVar.f126255e;
                List<C46973j> list = aVar.f126253c;
                C87412m.m108594g(list, "list");
                eVar.f127262h = list;
                aVar.f126256f = eVar;
                C119179t tVar = C119157j.f356862d;
                C46967d dVar = new C46967d(aVar);
                C119157j jVar2 = (C119157j) tVar;
                jVar2.getClass();
                jVar2.mo183892w(dVar, 100, false);
            }
        }

        public C46954a(C46953a aVar) {
            this.f126259a = aVar;
        }

        /* renamed from: a */
        public void mo72136a(C11874a aVar, View view) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(aVar != null ? aVar.hashCode() : 0);
            Log.m105925i("MicroMsg.BrowserChooseController", "alvinluo BrowserDialog onMoreClick dialog: %s", objArr);
            if (aVar != null) {
                aVar.setOnDismissListener(new C46957c(this.f126259a));
            }
            if (aVar != null) {
                aVar.dismiss();
            }
            C46953a aVar2 = this.f126259a;
            C34483g.m40370a(aVar2.f126252b, 3, aVar2.f126254d);
        }

        /* renamed from: c */
        public void mo72137c(C11874a aVar, View view, int i, C46973j jVar) {
            ResolveInfo resolveInfo;
            ActivityInfo activityInfo;
            ResolveInfo resolveInfo2;
            ActivityInfo activityInfo2;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(aVar != null ? aVar.hashCode() : 0);
            String str = null;
            objArr[1] = (jVar == null || (resolveInfo2 = jVar.f126286b) == null || (activityInfo2 = resolveInfo2.activityInfo) == null) ? null : activityInfo2.packageName;
            objArr[2] = (jVar == null || (resolveInfo = jVar.f126286b) == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.name;
            Log.m105925i("MicroMsg.BrowserChooseController", "alvinluo BrowserDialog onBrowserItemClick dialog: %s, packageName: %s, targetActivity: %s", objArr);
            if (aVar != null) {
                aVar.setOnDismissListener(new C46955a(this.f126259a));
            }
            if (aVar != null) {
                aVar.dismiss();
            }
            C46969f.m52280e(this.f126259a.f126251a.getUIContext(), this.f126259a.f126251a.mo68392E0(), jVar != null ? jVar.f126286b : null);
            C46953a aVar2 = this.f126259a;
            long j = aVar2.f126252b;
            int i2 = aVar2.f126254d;
            ResolveInfo resolveInfo3 = jVar != null ? jVar.f126286b : null;
            if (resolveInfo3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("alvinluo reportBrowserChooseDialogClickBrowser clickPosition: ");
                sb.append(i);
                sb.append(", browserCount: ");
                sb.append(i2);
                sb.append(", packageName: ");
                ActivityInfo activityInfo3 = resolveInfo3.activityInfo;
                sb.append(activityInfo3 != null ? activityInfo3.packageName : null);
                Log.m105926v("MicroMsg.BrowserChooseReporter", sb.toString());
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr2 = new Object[6];
                objArr2[0] = 2;
                objArr2[1] = Integer.valueOf(i);
                objArr2[2] = 0;
                ActivityInfo activityInfo4 = resolveInfo3.activityInfo;
                if (activityInfo4 != null) {
                    str = activityInfo4.packageName;
                }
                if (str == null) {
                    str = "";
                }
                objArr2[3] = str;
                objArr2[4] = Integer.valueOf(i2);
                objArr2[5] = Long.valueOf(j);
                nVar.mo160131h(21454, objArr2);
            }
        }

        /* renamed from: e */
        public void mo72138e(C11874a aVar, View view) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(aVar != null ? aVar.hashCode() : 0);
            Log.m105925i("MicroMsg.BrowserChooseController", "alvinluo BrowserDialog onCloseClick dialog: %s", objArr);
            if (aVar != null) {
                aVar.setOnDismissListener(new C46956b(this.f126259a));
            }
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: m93.a$b */
    public static final class C46958b implements C47212c {

        /* renamed from: a */
        public C46973j f126263a;

        /* renamed from: b */
        public int f126264b = -1;

        /* renamed from: c */
        public final /* synthetic */ C46953a f126265c;

        /* renamed from: m93.a$b$a */
        public static final class C46959a implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C46953a f126266d;

            public C46959a(C46953a aVar) {
                this.f126266d = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C46953a aVar = this.f126266d;
                aVar.getClass();
                C119179t tVar = C119157j.f356862d;
                C46968e eVar = new C46968e(aVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(eVar, 100, false);
                C46953a aVar2 = this.f126266d;
                C34483g.m40371b(aVar2.f126252b, 3, aVar2.f126254d);
            }
        }

        /* renamed from: m93.a$b$b */
        public static final class C46960b implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C46953a f126267d;

            /* renamed from: e */
            public final /* synthetic */ C46958b f126268e;

            public C46960b(C46953a aVar, C46958b bVar) {
                this.f126267d = aVar;
                this.f126268e = bVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C46953a aVar = this.f126267d;
                Intent intent = new Intent();
                C46958b bVar = this.f126268e;
                C46973j jVar = bVar.f126263a;
                boolean z = false;
                if (jVar != null && jVar.f126285a == 2) {
                    intent.putExtra("browser_setting_result", 2);
                } else {
                    if (jVar != null && jVar.f126285a == 1) {
                        z = true;
                    }
                    if (z) {
                        intent.putExtra("browser_setting_result", 1);
                        C46973j jVar2 = bVar.f126263a;
                        intent.putExtra("show_browser_resolve_info", jVar2 != null ? jVar2.f126286b : null);
                        intent.putExtra("show_browser_with_animation", true);
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
                aVar.mo72134b(-1, intent);
            }
        }

        public C46958b(C46953a aVar) {
            this.f126265c = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
            r3 = (r3 = r1.f126286b).activityInfo;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo72142b(p93.C11874a r12, android.view.View r13) {
            /*
                r11 = this;
                r13 = 2
                java.lang.Object[] r0 = new java.lang.Object[r13]
                m93.j r1 = r11.f126263a
                r2 = 0
                if (r1 == 0) goto L_0x0013
                android.content.pm.ResolveInfo r3 = r1.f126286b
                if (r3 == 0) goto L_0x0013
                android.content.pm.ActivityInfo r3 = r3.activityInfo
                if (r3 == 0) goto L_0x0013
                java.lang.String r3 = r3.packageName
                goto L_0x0014
            L_0x0013:
                r3 = r2
            L_0x0014:
                r4 = 0
                r0[r4] = r3
                if (r1 == 0) goto L_0x0020
                int r1 = r1.f126285a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0021
            L_0x0020:
                r1 = r2
            L_0x0021:
                r3 = 1
                r0[r3] = r1
                java.lang.String r1 = "MicroMsg.BrowserChooseController"
                java.lang.String r5 = "alvinluo BrowserSettingDialog onConfirmClick selected: %s, itemType: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r0)
                m93.j r0 = r11.f126263a
                if (r0 != 0) goto L_0x0035
                java.lang.String r12 = "alvinluo BrowserSettingDialog selectedInfo is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
                return
            L_0x0035:
                gy3.C87412m.m108591d(r0)
                int r1 = r0.f126285a
                r5 = 274576(0x43090, float:3.84763E-40)
                r6 = 274528(0x43060, float:3.84696E-40)
                java.lang.String r7 = "alvinluo saveDefaultBrowser packageName: %s"
                java.lang.String r8 = "MicroMsg.BrowserSettingStorageManager"
                java.lang.String r9 = ""
                if (r1 != r3) goto L_0x0077
                android.content.pm.ResolveInfo r0 = r0.f126286b
                if (r0 == 0) goto L_0x0053
                android.content.pm.ActivityInfo r0 = r0.activityInfo
                if (r0 == 0) goto L_0x0053
                java.lang.String r0 = r0.packageName
                goto L_0x0054
            L_0x0053:
                r0 = r2
            L_0x0054:
                if (r0 != 0) goto L_0x0057
                r0 = r9
            L_0x0057:
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0098 }
                r1[r4] = r0     // Catch:{ Exception -> 0x0098 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r1)     // Catch:{ Exception -> 0x0098 }
                f40.o r1 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0098 }
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()     // Catch:{ Exception -> 0x0098 }
                r1.mo119676J(r6, r0)     // Catch:{ Exception -> 0x0098 }
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0098 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0098 }
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0098 }
                r0.mo119676J(r5, r1)     // Catch:{ Exception -> 0x0098 }
                goto L_0x0098
            L_0x0077:
                if (r1 != r13) goto L_0x0098
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0098 }
                r0[r4] = r9     // Catch:{ Exception -> 0x0098 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r0)     // Catch:{ Exception -> 0x0098 }
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0098 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0098 }
                r0.mo119676J(r6, r9)     // Catch:{ Exception -> 0x0098 }
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0098 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0098 }
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0098 }
                r0.mo119676J(r5, r1)     // Catch:{ Exception -> 0x0098 }
            L_0x0098:
                if (r12 == 0) goto L_0x00a4
                m93.a$b$b r0 = new m93.a$b$b
                m93.a r1 = r11.f126265c
                r0.<init>(r1, r11)
                r12.setOnDismissListener(r0)
            L_0x00a4:
                if (r12 == 0) goto L_0x00a9
                r12.dismiss()
            L_0x00a9:
                m93.a r12 = r11.f126265c
                long r0 = r12.f126252b
                m93.j r5 = r11.f126263a
                int r12 = r12.f126254d
                int r6 = r11.f126264b
                if (r5 != 0) goto L_0x00b6
                goto L_0x0122
            L_0x00b6:
                int r7 = r5.f126285a
                if (r7 != r3) goto L_0x00bc
                r7 = 1
                goto L_0x00c1
            L_0x00bc:
                if (r7 != r13) goto L_0x00c0
                r7 = 2
                goto L_0x00c1
            L_0x00c0:
                r7 = 0
            L_0x00c1:
                android.content.pm.ResolveInfo r5 = r5.f126286b
                if (r5 == 0) goto L_0x00cb
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                if (r5 == 0) goto L_0x00cb
                java.lang.String r2 = r5.packageName
            L_0x00cb:
                if (r2 != 0) goto L_0x00ce
                goto L_0x00cf
            L_0x00ce:
                r9 = r2
            L_0x00cf:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "alvinluo reportBrowserSettingDialogResult settingResult: "
                r2.append(r5)
                r2.append(r7)
                java.lang.String r5 = ", selectedPosition: "
                r2.append(r5)
                r2.append(r6)
                java.lang.String r5 = ", packageName: "
                r2.append(r5)
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                java.lang.String r5 = "MicroMsg.BrowserChooseReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r2)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r5 = 21458(0x53d2, float:3.0069E-41)
                r8 = 6
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
                r8[r4] = r10
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                r8[r3] = r4
                r8[r13] = r9
                r13 = 3
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r8[r13] = r12
                r12 = 4
                java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
                r8[r12] = r13
                r12 = 5
                java.lang.Long r13 = java.lang.Long.valueOf(r0)
                r8[r12] = r13
                r2.mo160131h(r5, r8)
            L_0x0122:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m93.C46953a.C46958b.mo72142b(p93.a, android.view.View):void");
        }

        /* renamed from: c */
        public void mo72137c(C11874a aVar, View view, int i, C46973j jVar) {
            ResolveInfo resolveInfo;
            ActivityInfo activityInfo;
            ResolveInfo resolveInfo2;
            ActivityInfo activityInfo2;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(aVar != null ? aVar.hashCode() : 0);
            String str = null;
            objArr[1] = jVar != null ? Integer.valueOf(jVar.f126285a) : null;
            objArr[2] = (jVar == null || (resolveInfo2 = jVar.f126286b) == null || (activityInfo2 = resolveInfo2.activityInfo) == null) ? null : activityInfo2.packageName;
            if (!(jVar == null || (resolveInfo = jVar.f126286b) == null || (activityInfo = resolveInfo.activityInfo) == null)) {
                str = activityInfo.name;
            }
            objArr[3] = str;
            Log.m105925i("MicroMsg.BrowserChooseController", "alvinluo BrowserSettingDialog onBrowserItemClick dialog: %s, itemType: %s, packageName: %s, targetActivity: %s", objArr);
            this.f126263a = jVar;
            this.f126264b = i;
        }

        /* renamed from: d */
        public void mo72143d(C11874a aVar, View view) {
            Log.m105924i("MicroMsg.BrowserChooseController", "alvinluo BrowserSettingDialog onCancelClick");
            if (aVar != null) {
                aVar.setOnDismissListener(new C46959a(this.f126265c));
            }
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: m93.a$c */
    public static final class C46961c implements DialogInterface.OnKeyListener {

        /* renamed from: d */
        public final /* synthetic */ C47437b f126269d;

        /* renamed from: e */
        public final /* synthetic */ C46953a f126270e;

        /* renamed from: m93.a$c$a */
        public static final class C46962a implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C46953a f126271d;

            public C46962a(C46953a aVar) {
                this.f126271d = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C46953a.m52267a(this.f126271d, 6);
            }
        }

        public C46961c(C47437b bVar, C46953a aVar) {
            this.f126269d = bVar;
            this.f126270e = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            StringBuilder sb = new StringBuilder();
            sb.append("alvinluo browserChooseDialog keyCode: ");
            sb.append(i);
            sb.append(", event: ");
            sb.append(keyEvent != null ? Integer.valueOf(keyEvent.getAction()) : null);
            Log.m105924i("MicroMsg.BrowserChooseController", sb.toString());
            if (i != 4) {
                return false;
            }
            this.f126269d.setOnDismissListener(new C46962a(this.f126270e));
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            return true;
        }
    }

    /* renamed from: m93.a$d */
    public static final class C46963d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C46953a f126272d;

        public C46963d(C46953a aVar) {
            this.f126272d = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C46953a.m52267a(this.f126272d, 5);
        }
    }

    public C46953a(C47345a aVar) {
        C87412m.m108594g(aVar, "uiModel");
        this.f126251a = aVar;
    }

    /* renamed from: a */
    public static final void m52267a(C46953a aVar, int i) {
        aVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("show_webview_menu", i != 5);
        C13598b0 b0Var = C13598b0.f38549a;
        aVar.mo72134b(0, intent);
        C34483g.m40370a(aVar.f126252b, i, aVar.f126254d);
    }

    /* renamed from: b */
    public final void mo72134b(int i, Intent intent) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        if (intent == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.BrowserChooseController", "alvinluo finishUI resultCode: %d, data == null: %b", objArr);
        this.f126251a.mo68393b4(i, intent);
    }

    /* renamed from: c */
    public final void mo72135c() {
        Log.m105924i("MicroMsg.BrowserChooseController", "alvinluo showBrowserChooseDialog");
        C47437b bVar = new C47437b(this.f126251a.getUIContext());
        bVar.setOnKeyListener(new C46961c(bVar, this));
        bVar.setOnCancelListener(new C46963d(this));
        bVar.f127254h = this.f126257g;
        List<C46973j> list = this.f126253c;
        C87412m.m108594g(list, "list");
        bVar.f127252f = list;
        Intent E0 = this.f126251a.mo68392E0();
        boolean z = false;
        if (E0 != null) {
            z = E0.getBooleanExtra("show_browser_setting_entry", false);
        }
        bVar.f127255i = z;
        this.f126251a.mo68395o4(bVar, true);
    }
}
