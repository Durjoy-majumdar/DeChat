package com.tencent.p014mm.plugin.appbrand.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84108d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gt0.C45952a0;
import gt0.C45953b0;
import gt0.C45958w;
import gt0.C45959x;
import gt0.C45960z;
import gt0.C59702m;
import gt0.C59703n;
import gt0.C87383y;
import java.util.LinkedList;
import kr0.C88267e;
import mj0.C88733c;
import ob0.C47350c;
import p923xj.C78853a;
import pe3.C47465a;
import te3.C64280c93;
import te3.c85;
import te3.ed4;
import te3.im4;
import te3.jm4;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.a */
public class C84926a {

    /* renamed from: a */
    public String f247530a;

    /* renamed from: b */
    public boolean f247531b = false;

    /* renamed from: c */
    public int f247532c = 0;

    /* renamed from: d */
    public int f247533d = -1;

    /* renamed from: e */
    public int f247534e;

    /* renamed from: f */
    public String f247535f;

    /* renamed from: g */
    public String f247536g;

    /* renamed from: h */
    public String f247537h;

    /* renamed from: i */
    public Dialog f247538i;

    /* renamed from: j */
    public TextView f247539j;

    /* renamed from: k */
    public RatingBar f247540k;

    /* renamed from: l */
    public TextView f247541l;

    /* renamed from: m */
    public LinearLayout f247542m;

    /* renamed from: n */
    public LinearLayout f247543n;

    /* renamed from: o */
    public C84108d f247544o;

    /* renamed from: p */
    public boolean f247545p = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.a$a */
    public class C40574a implements C40324j.C40326a {
        public C40574a() {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C47465a aVar;
            Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateEvaluateCgi, errType:%s, errCode:%s, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof jm4)) {
                Log.m105920e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateEvaluateCgi, request fail");
                C84926a aVar2 = C84926a.this;
                if (aVar2.f247531b) {
                    aVar2.mo117756c(3, 2);
                } else {
                    aVar2.mo117756c(2, 2);
                }
            } else {
                Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateEvaluateCgi, request success");
                C84926a aVar3 = C84926a.this;
                if (aVar3.f247531b) {
                    aVar3.mo117756c(3, 1);
                } else {
                    aVar3.mo117756c(2, 1);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.a$b */
    public class C40575b implements DialogInterface.OnCancelListener {
        public C40575b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "user cancel evaluate dialog");
            C84926a.this.f247531b = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.a$d */
    public class C40576d implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f108977d;

        public C40576d(Runnable runnable) {
            this.f108977d = runnable;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "user dismiss evaluate dialog");
            C84926a aVar = C84926a.this;
            if (!aVar.f247531b) {
                aVar.getClass();
                im4 im4 = new im4();
                String str = aVar.f247530a;
                im4.f135506d = str;
                im4.f135507e = 4;
                Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "reportSkipEvaluate, userName:%s", str);
                aVar.mo117761h(im4);
            }
            C84926a aVar2 = C84926a.this;
            Runnable runnable = this.f108977d;
            aVar2.getClass();
            if (runnable != null) {
                MMHandlerThread.postToMainThreadDelayed(runnable, 100);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.a$c */
    public class C55567c implements C40324j.C40326a {
        public C55567c(C84926a aVar) {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C47465a aVar;
            Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateGameEvaluateCgi, errType:%s, errCode:%s, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof ed4)) {
                C115669n.INSTANCE.idkeyStat(1237, 5, 1, false);
                Log.m105920e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateGameEvaluateCgi, request fail");
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateGameEvaluateCgi, request success");
        }
    }

    public C84926a(C88267e eVar) {
        C88733c cVar = (C88733c) eVar.mo125517G0(C88733c.class);
        if (cVar != null) {
            this.f247544o = cVar.mo123163B();
        }
    }

    /* renamed from: a */
    public void mo117754a() {
        Dialog dialog = this.f247538i;
        if (dialog != null) {
            dialog.dismiss();
            this.f247538i = null;
        }
    }

    /* renamed from: b */
    public final Dialog mo117755b(Context context, boolean z) {
        C78853a aVar = new C78853a(context, C0966R.style.f8221r);
        aVar.setCancelable(true);
        aVar.setCanceledOnTouchOutside(z);
        Window window = aVar.getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            attributes.height = -2;
            attributes.width = -1;
            window.setAttributes(attributes);
            window.setWindowAnimations(C0966R.style.f8220q);
        }
        return aVar;
    }

    /* renamed from: c */
    public final void mo117756c(int i, int i2) {
        if (Util.isNullOrNil(this.f247535f)) {
            Log.m105920e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "operateReport, no app id");
            return;
        }
        Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "operateReport, appId:%s, eventId:%s, session:%s, score:%s, scene:%s, result:%s, path:%s", this.f247535f, Integer.valueOf(i), this.f247536g, Integer.valueOf(this.f247532c), Integer.valueOf(this.f247534e), Integer.valueOf(i2), this.f247537h);
        C115669n.INSTANCE.mo160131h(16176, this.f247535f, Integer.valueOf(i), Long.valueOf(Util.nowSecond()), Integer.valueOf(this.f247532c), this.f247536g, this.f247537h, Integer.valueOf(this.f247534e), Integer.valueOf(i2));
    }

    /* renamed from: d */
    public final boolean mo117757d(AppBrandRuntimeWC appBrandRuntimeWC) {
        LinkedList<C64280c93> linkedList;
        C84108d dVar = this.f247544o;
        if (dVar == null) {
            return false;
        }
        c85 c85 = dVar.f245574f;
        if (c85 == null || (linkedList = c85.f182433f) == null || linkedList.size() < 3) {
            Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: no config");
            return false;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(1237, 0, 1, false);
        int currentTimeMillis = (int) (System.currentTimeMillis() - C84072q1.m103587b(appBrandRuntimeWC.f238147j).f245470n);
        this.f247533d = currentTimeMillis;
        if (currentTimeMillis >= c85.f182435h * 1000) {
            return true;
        }
        Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: time limit");
        nVar.idkeyStat(1237, 1, 1, false);
        return false;
    }

    /* renamed from: e */
    public final void mo117758e(AppBrandRuntimeWC appBrandRuntimeWC, Runnable runnable) {
        AppBrandRuntimeWC appBrandRuntimeWC2 = appBrandRuntimeWC;
        Runnable runnable2 = runnable;
        C84108d dVar = this.f247544o;
        c85 c85 = dVar.f245574f;
        dVar.f245574f = null;
        Dialog b = mo117755b(appBrandRuntimeWC.mo113026R(), false);
        this.f247538i = b;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(b.getContext()).inflate(C0966R.C0971layout.f6406dz, (ViewGroup) null, false);
        this.f247538i.setContentView(linearLayout);
        Point h = C85875k4.m106184h(this.f247538i.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.min(h.x, h.y), linearLayout.getLayoutParams().height);
        layoutParams.gravity = 1;
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.knx);
        textView.setText(c85.f182436i);
        TextView textView2 = (TextView) linearLayout.findViewById(C0966R.C0970id.clf);
        textView2.setText(c85.f182432e);
        ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.clc);
        C55568b bVar = r0;
        C55568b bVar2 = new C55568b(this, textView, textView2, imageView, linearLayout, appBrandRuntimeWC, runnable, c85);
        ((AppBrandGameEvaluateOptionView) linearLayout.findViewById(C0966R.C0970id.hn_)).mo77089a(0, c85, bVar);
        ((AppBrandGameEvaluateOptionView) linearLayout.findViewById(C0966R.C0970id.hna)).mo77089a(1, c85, bVar);
        ((AppBrandGameEvaluateOptionView) linearLayout.findViewById(C0966R.C0970id.hnb)).mo77089a(2, c85, bVar);
        this.f247538i.setOnCancelListener(new C59702m(this, appBrandRuntimeWC2, c85, runnable2));
        imageView.setOnClickListener(new C59703n(this, appBrandRuntimeWC2, c85, runnable2));
        this.f247538i = this.f247538i;
        C115669n.INSTANCE.idkeyStat(1237, 4, 1, false);
        Dialog dialog = this.f247538i;
        if (dialog != null) {
            dialog.show();
        }
    }

    /* renamed from: f */
    public final boolean mo117759f(AppBrandRuntimeWC appBrandRuntimeWC, Runnable runnable) {
        AppBrandStatObject appBrandStatObject;
        if (appBrandRuntimeWC == null || appBrandRuntimeWC.mo113213o1() == null || appBrandRuntimeWC.mo113026R() == null) {
            Log.m105928w("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "invalid close state");
            return false;
        }
        AppBrandSysConfigWC S1 = appBrandRuntimeWC.mo113213o1();
        if (!S1.f239409X0) {
            Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "can not show evaluate dialog");
            return false;
        }
        long j = C84072q1.m103587b(appBrandRuntimeWC.f238147j).f245470n;
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "app time lastResumeTime:%s, closeTime:%s, leastTime:%s", Long.valueOf(j), Long.valueOf(currentTimeMillis), Integer.valueOf(S1.f239411Z0));
        if ((currentTimeMillis - j) / 1000 < ((long) S1.f239411Z0)) {
            Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "time not enough to show evaluate dialog");
            return false;
        }
        AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
        String str = M1.f234839s;
        this.f247530a = str;
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "username is null, can not show evaluate dialog");
            return false;
        }
        Activity R = appBrandRuntimeWC.mo113026R();
        String str2 = M1.f239362d;
        String str3 = M1.f239363e;
        boolean z = S1.f239410Y0;
        Dialog b = mo117755b(R, true);
        this.f247538i = b;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(b.getContext()).inflate(C0966R.C0971layout.f6401du, (ViewGroup) null, false);
        this.f247538i.setContentView(linearLayout);
        Point h = C85875k4.m106184h(this.f247538i.getContext());
        int min = Math.min(h.x, h.y);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min, -2);
        layoutParams.gravity = 1;
        linearLayout.setLayoutParams(layoutParams);
        Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "createEvaluateDialog, dialog width:%d", Integer.valueOf(min));
        this.f247541l = (TextView) this.f247538i.findViewById(C0966R.C0970id.clg);
        this.f247542m = (LinearLayout) this.f247538i.findViewById(C0966R.C0970id.clh);
        this.f247543n = (LinearLayout) this.f247538i.findViewById(C0966R.C0970id.cle);
        TextView textView = (TextView) this.f247538i.findViewById(C0966R.C0970id.cld);
        if (z) {
            textView.setVisibility(0);
            textView.setOnClickListener(new C45958w(this, R, str2, str3));
        } else {
            textView.setVisibility(8);
            textView.setOnClickListener((View.OnClickListener) null);
        }
        ((TextView) this.f247538i.findViewById(C0966R.C0970id.clk)).setOnClickListener(new C45959x(this, R));
        RatingBar ratingBar = (RatingBar) this.f247538i.findViewById(C0966R.C0970id.cli);
        this.f247540k = ratingBar;
        ratingBar.setOnRatingBarChangeListener(new C87383y(this));
        this.f247539j = (TextView) this.f247538i.findViewById(C0966R.C0970id.clf);
        if (!Util.isNullOrNil(str3)) {
            this.f247539j.setVisibility(0);
            this.f247539j.setText(R.getString(C0966R.string.f7677np, new Object[]{str3}));
        } else {
            this.f247539j.setVisibility(8);
        }
        ((ImageView) this.f247538i.findViewById(C0966R.C0970id.clc)).setOnClickListener(new C45960z(this));
        ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new C45952a0(this));
            linearLayout.setOnClickListener(new C45953b0(this));
        }
        Dialog dialog = this.f247538i;
        this.f247538i = dialog;
        dialog.setOnCancelListener(new C40575b());
        this.f247538i.setOnDismissListener(new C40576d(runnable));
        this.f247531b = false;
        S1.f239409X0 = false;
        String str4 = appBrandRuntimeWC.f238147j;
        this.f247535f = str4;
        if (Util.isNullOrNil(str4)) {
            Log.m105920e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "saveEvaluateReport, no app id");
        } else {
            AppBrandInitConfigWC M12 = appBrandRuntimeWC.mo113210l1();
            this.f247536g = "";
            if (M12 != null) {
                this.f247536g = M12.f234837q;
            }
            this.f247534e = 1000;
            if (!(M12 == null || (appBrandStatObject = M12.f234834c1) == null)) {
                this.f247534e = appBrandStatObject.f245533f;
            }
            this.f247537h = "";
            if (!(((C88267e) appBrandRuntimeWC.f238150p) == null || ((C88267e) appBrandRuntimeWC.f238150p).mo114341l0() == null)) {
                this.f247537h = ((C88267e) appBrandRuntimeWC.f238150p).mo114341l0().mo116162Q0();
            }
        }
        mo117756c(1, 1);
        Dialog dialog2 = this.f247538i;
        if (dialog2 != null) {
            dialog2.show();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117760g(com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC r20, boolean r21, te3.C64280c93 r22, te3.c85 r23) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            r0 = r22
            r4 = r23
            boolean r5 = r1.f247545p
            if (r5 == 0) goto L_0x000f
            return
        L_0x000f:
            r5 = 1
            r1.f247545p = r5
            r6 = 0
            if (r0 != 0) goto L_0x0017
            r7 = 0
            goto L_0x001a
        L_0x0017:
            int r0 = r0.f182452d
            r7 = r0
        L_0x001a:
            android.content.Context r0 = r2.f238141d
            java.lang.String r8 = "audio"
            java.lang.Object r0 = r0.getSystemService(r8)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            java.lang.String r8 = "MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper"
            r9 = 3
            if (r0 == 0) goto L_0x004a
            int r0 = r0.getStreamVolume(r9)     // Catch:{ Exception -> 0x002e }
            goto L_0x004b
        L_0x002e:
            r0 = move-exception
            r10 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r10 = r10.toString()
            r0[r6] = r10
            java.lang.String r10 = "currentVolume get error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r10, r0)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1237(0x4d5, double:6.11E-321)
            r14 = 6
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
        L_0x004a:
            r0 = 0
        L_0x004b:
            te3.z55 r10 = new te3.z55
            r10.<init>()
            if (r0 != 0) goto L_0x0054
            r11 = 1
            goto L_0x0055
        L_0x0054:
            r11 = 0
        L_0x0055:
            r10.f186627d = r11
            ea2.h r11 = ea2.C20561h.m22332s()
            java.lang.String r12 = r2.f238147j
            java.util.LinkedList<java.lang.String> r11 = r11.f57873f
            boolean r11 = r11.contains(r12)
            r10.f186628e = r11
            int r11 = r1.f247533d
            int r11 = r11 / 1000
            r10.f186629f = r11
            r11 = 6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = "true"
            java.lang.String r13 = "false"
            if (r3 == 0) goto L_0x0077
            r14 = r12
            goto L_0x0078
        L_0x0077:
            r14 = r13
        L_0x0078:
            r11[r6] = r14
            java.lang.String r6 = r4.f182431d
            r11[r5] = r6
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r11[r5] = r6
            if (r0 != 0) goto L_0x0089
            r0 = r12
            goto L_0x008a
        L_0x0089:
            r0 = r13
        L_0x008a:
            r11[r9] = r0
            r0 = 4
            boolean r5 = r10.f186628e
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r12 = r13
        L_0x0093:
            r11[r0] = r12
            r0 = 5
            int r5 = r10.f186629f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11[r0] = r5
            java.lang.String r0 = "submitGameEvaluateResult reject[%s] questionId[%s] optionId[%d] isMute[%s] isPlayMusic[%s] playSeconds[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r11)
            te3.d85 r0 = new te3.d85
            r0.<init>()
            r0.f132187e = r3
            r0.f132188f = r7
            java.lang.String r3 = r4.f182431d
            r0.f132186d = r3
            te3.dd4 r3 = new te3.dd4
            r3.<init>()
            java.lang.String r2 = r2.f238147j
            r3.f182698d = r2
            com.tencent.mm.plugin.appbrand.report.d r2 = r1.f247544o
            te3.y55 r4 = r2.f245569a
            r3.f182700f = r4
            te3.x55 r2 = r2.f245570b
            r3.f182699e = r2
            r3.f182701g = r10
            r3.f182702h = r0
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r2 = 2772(0xad4, float:3.884E-42)
            r0.f127069d = r2
            java.lang.String r2 = "/cgi-bin/mmgame-bin/submitoriginalreview"
            r0.f127068c = r2
            r0.f127066a = r3
            te3.ed4 r2 = new te3.ed4
            r2.<init>()
            r0.f127067b = r2
            ob0.c r0 = r0.mo72403a()
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r2 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.ipcinvoker.wx_extension.j r2 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r2
            com.tencent.mm.plugin.appbrand.widget.dialog.a$c r3 = new com.tencent.mm.plugin.appbrand.widget.dialog.a$c
            r3.<init>(r1)
            r2.mo63014eH(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a.mo117760g(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC, boolean, te3.c93, te3.c85):void");
    }

    /* renamed from: h */
    public final void mo117761h(im4 im4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2521;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/updateevaluate";
        bVar.f127066a = im4;
        bVar.f127067b = new jm4();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C40574a());
    }

    /* renamed from: i */
    public final void mo117762i(int i) {
        int i2 = C0966R.string.f7683nv;
        if (i != 1) {
            if (i == 2) {
                i2 = C0966R.string.f7685nx;
            } else if (i == 3) {
                i2 = C0966R.string.f7684nw;
            } else if (i == 4) {
                i2 = C0966R.string.f7682nu;
            } else if (i == 5) {
                i2 = C0966R.string.f7681nt;
            }
        }
        this.f247541l.setText(i2);
    }
}
