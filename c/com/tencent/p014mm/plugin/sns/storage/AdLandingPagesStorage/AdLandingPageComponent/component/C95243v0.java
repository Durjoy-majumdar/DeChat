package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.autogen.events.SnsAdShowFloatCompEvent;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ps2.C100880k;
import ps2.C100894u;
import qs2.C101255a0;
import so2.C101676k;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 */
public final class C95243v0 extends C95295z {

    /* renamed from: A */
    public final List<C95098h0> f276403A = new ArrayList();

    /* renamed from: B */
    public IListener<SnsAdShowFloatCompEvent> f276404B;

    /* renamed from: C */
    public boolean f276405C;

    /* renamed from: D */
    public boolean f276406D;

    /* renamed from: E */
    public ObjectAnimator f276407E;

    /* renamed from: F */
    public RoundedCornerFrameLayout f276408F;

    /* renamed from: s */
    public Context f276409s;

    /* renamed from: t */
    public final C101676k f276410t;

    /* renamed from: u */
    public ViewGroup f276411u;

    /* renamed from: v */
    public final int f276412v;

    /* renamed from: w */
    public final int f276413w;

    /* renamed from: x */
    public final int f276414x;

    /* renamed from: y */
    public final LiveData<Integer> f276415y;

    /* renamed from: z */
    public boolean f276416z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$a */
    public static final class C5439a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f21164d;

        public C5439a(View view) {
            this.f21164d = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$1");
            View view2 = this.f21164d;
            if (view2 != null) {
                view2.performClick();
            }
            Log.m105918d("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "onClick() called with: v = [" + view + ']');
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$b */
    public static final class C95244b implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f276417a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f276418b;

        /* renamed from: c */
        public final /* synthetic */ C95243v0 f276419c;

        public C95244b(String str, ImageView imageView, C95243v0 v0Var) {
            this.f276417a = str;
            this.f276418b = imageView;
            this.f276419c = v0Var;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$2");
            Log.m105920e("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "refreshView icon onDownloadError, url=" + this.f276417a);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$2");
            C87412m.m108594g(str, "path");
            Log.m105924i("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "refreshView icon onDownloaded, path=" + str);
            try {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f276418b.getResources(), BitmapUtil.decodeFile(str, (BitmapFactory.Options) null));
                C95243v0 v0Var = this.f276419c;
                v0Var.getClass();
                SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                C101676k kVar = v0Var.f276410t;
                SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                String str2 = kVar.f297629A;
                if (str2 == null) {
                    str2 = "#000000";
                }
                bitmapDrawable.setTint(Color.parseColor(str2));
                this.f276418b.setImageDrawable(bitmapDrawable);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "refreshView icon download exp=" + th);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initView$2");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95243v0(Context context, C101676k kVar, ViewGroup viewGroup, int i, int i2, int i3, LiveData<Integer> liveData) {
        super(context, kVar, viewGroup);
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(kVar, "info");
        C87412m.m108594g(viewGroup, "mParentContainer");
        C87412m.m108594g(liveData, "enterAnimStatusData");
        this.f276409s = context;
        this.f276410t = kVar;
        this.f276411u = viewGroup;
        this.f276412v = i;
        this.f276413w = i2;
        this.f276414x = i3;
        this.f276415y = liveData;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        if (!this.f276406D || this.f276405C) {
            SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            View view = this.f276586n;
            boolean z = false;
            if (view != null && view.getVisibility() == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                return;
            }
            mo131767I();
            SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        super.mo67235C();
        for (C95098h0 C : this.f276403A) {
            C.mo67235C();
        }
        IListener<SnsAdShowFloatCompEvent> iListener = this.f276404B;
        if (iListener != null) {
            iListener.dead();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        if (!this.f276406D || this.f276405C) {
            mo131768J();
            SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    /* renamed from: E */
    public final int mo131764E(int i) {
        SnsMethodCalculate.markStartTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        int n = (int) C100894u.m132234n((double) i, this.f276412v, this.f276413w, this.f276414x);
        SnsMethodCalculate.markEndTimeMs("convertXmlPx", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        return n;
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo131765G() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "initView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.content.Context r0 = r1.f276409s
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r1.f276411u
            r5 = 2131497576(0x7f0c1268, float:1.861875E38)
            r6 = 0
            android.view.View r0 = r0.inflate(r5, r4, r6)
            r1.f276586n = r0
            r4 = 2131304992(0x7f092220, float:1.8228142E38)
            android.view.View r4 = r0.findViewById(r4)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r4 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r4
            r1.f276408F = r4
            so2.k r5 = r1.f276410t
            qs2.s0 r5 = r5.f297631z
            if (r5 == 0) goto L_0x002f
            float r7 = r5.f296733e
            goto L_0x0031
        L_0x002f:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0031:
            qs2.C101291s0.m132869a(r4, r5, r7)
            r4 = 2131304991(0x7f09221f, float:1.822814E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.ViewGroup r5 = r1.f276411u
            r5.addView(r0)
            r5 = 1
            r17.mo118814y()     // Catch:{ Exception -> 0x0053 }
            r17.mo124363d()     // Catch:{ Exception -> 0x0053 }
            android.view.View r0 = r1.f276586n     // Catch:{ Exception -> 0x0053 }
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ Exception -> 0x0053 }
            r7 = -2
            r0.height = r7     // Catch:{ Exception -> 0x0053 }
            goto L_0x005f
        L_0x0053:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r6] = r0
            java.lang.String r0 = "MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout"
            java.lang.String r8 = "createView called error"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r8, r7)
        L_0x005f:
            so2.k r0 = r1.f276410t
            java.util.List<so2.i> r7 = r0.f297630B
            if (r7 != 0) goto L_0x0069
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0069:
            int r0 = r0.f296504j
            if (r0 != r5) goto L_0x006f
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r1.f276406D = r0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r0 = r7.size()
            r7 = 0
        L_0x0079:
            r8 = 8
            if (r7 >= r0) goto L_0x01be
            so2.k r9 = r1.f276410t
            java.util.List<so2.i> r9 = r9.f297630B
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r7)
            so2.i r9 = (so2.C101674i) r9
            java.lang.String r10 = r9.f297622A
            if (r10 == 0) goto L_0x0096
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r10 = 0
            goto L_0x0097
        L_0x0096:
            r10 = 1
        L_0x0097:
            if (r10 != 0) goto L_0x01ba
            java.lang.String r10 = r9.f297623B
            if (r10 == 0) goto L_0x00a6
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r10 = 0
            goto L_0x00a7
        L_0x00a6:
            r10 = 1
        L_0x00a7:
            if (r10 == 0) goto L_0x00ab
            goto L_0x01ba
        L_0x00ab:
            android.content.Context r10 = r1.f276409s
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r11 = 2131497573(0x7f0c1265, float:1.8618743E38)
            r12 = 0
            android.view.View r10 = r10.inflate(r11, r12, r6)
            android.content.Context r11 = r1.f276579d
            qs2.a0 r13 = r9.f297624z
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r11 = com.tencent.p014mm.plugin.sns.p106ui.C96328z2.m123559a(r11, r13, r4, r6)
            boolean r13 = r11 instanceof com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95098h0
            if (r13 == 0) goto L_0x00ea
            java.util.List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0> r13 = r1.f276403A
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.add(r11)
            r13 = r11
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0 r13 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95098h0) r13
            r13.mo131855p()
            boolean r13 = r11 instanceof com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0
            if (r13 == 0) goto L_0x00d9
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0 r11 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0) r11
            goto L_0x00da
        L_0x00d9:
            r11 = r12
        L_0x00da:
            if (r11 == 0) goto L_0x00e1
            android.widget.Button r11 = r11.mo131625N()
            goto L_0x00e2
        L_0x00e1:
            r11 = r12
        L_0x00e2:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$a r13 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$a
            r13.<init>(r11)
            r10.setOnClickListener(r13)
        L_0x00ea:
            r11 = 2131304988(0x7f09221c, float:1.8228134E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r13 = 2131304990(0x7f09221e, float:1.8228138E38)
            android.view.View r13 = r10.findViewById(r13)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r13 = (com.tencent.p014mm.plugin.sns.p104ad.widget.appcompat.AdAppCompatTextView) r13
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            boolean r15 = r14 instanceof android.widget.LinearLayout.LayoutParams
            if (r15 == 0) goto L_0x0107
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            goto L_0x0108
        L_0x0107:
            r14 = r12
        L_0x0108:
            r15 = 56
            int r15 = r1.mo131764E(r15)
            if (r14 != 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r14.width = r15
        L_0x0113:
            if (r14 != 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r14.height = r15
        L_0x0118:
            if (r14 != 0) goto L_0x011b
            goto L_0x0123
        L_0x011b:
            r15 = 16
            int r15 = r1.mo131764E(r15)
            r14.topMargin = r15
        L_0x0123:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            boolean r15 = r14 instanceof android.widget.LinearLayout.LayoutParams
            if (r15 == 0) goto L_0x012e
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            goto L_0x012f
        L_0x012e:
            r14 = r12
        L_0x012f:
            if (r14 != 0) goto L_0x0132
            goto L_0x0138
        L_0x0132:
            int r8 = r1.mo131764E(r8)
            r14.topMargin = r8
        L_0x0138:
            if (r14 != 0) goto L_0x013b
            goto L_0x0143
        L_0x013b:
            r8 = 112(0x70, float:1.57E-43)
            int r8 = r1.mo131764E(r8)
            r14.width = r8
        L_0x0143:
            java.lang.String r8 = r9.f297622A
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$b r14 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0$b
            r14.<init>(r8, r11, r1)
            ps2.C100891r.m132208c(r8, r6, r6, r6, r14)
            java.lang.String r8 = r9.f297623B
            r13.setText(r8)
            so2.k r8 = r1.f276410t     // Catch:{ Exception -> 0x0162 }
            java.lang.String r8 = r8.f297629A     // Catch:{ Exception -> 0x0162 }
            if (r8 != 0) goto L_0x015a
            java.lang.String r8 = ""
        L_0x015a:
            int r8 = android.graphics.Color.parseColor(r8)     // Catch:{ Exception -> 0x0162 }
            r13.setTextColor(r8)     // Catch:{ Exception -> 0x0162 }
            goto L_0x0167
        L_0x0162:
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setTextColor(r8)
        L_0x0167:
            r13.setMaxLines(r5)
            r8 = 24
            int r8 = r1.mo131764E(r8)
            androidx.core.widget.C103733h.m138105b(r13, r5, r8, r5, r6)
            r4.addView(r10)
            android.view.ViewGroup$LayoutParams r8 = r10.getLayoutParams()
            boolean r9 = r8 instanceof android.widget.LinearLayout.LayoutParams
            if (r9 == 0) goto L_0x0181
            r12 = r8
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
        L_0x0181:
            r8 = 128(0x80, float:1.794E-43)
            if (r12 != 0) goto L_0x0186
            goto L_0x018c
        L_0x0186:
            int r9 = r1.mo131764E(r8)
            r12.width = r9
        L_0x018c:
            if (r12 != 0) goto L_0x018f
            goto L_0x0195
        L_0x018f:
            int r8 = r1.mo131764E(r8)
            r12.height = r8
        L_0x0195:
            android.view.View r8 = new android.view.View
            android.content.Context r9 = r1.f276409s
            r8.<init>(r9)
            r9 = 419430400(0x19000000, float:6.617445E-24)
            r8.setBackgroundColor(r9)
            r4.addView(r8)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            r10 = 96
            int r10 = r1.mo131764E(r10)
            r9.width = r10
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            int r9 = r1.mo131764E(r5)
            r8.height = r9
        L_0x01ba:
            int r7 = r7 + 1
            goto L_0x0079
        L_0x01be:
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L_0x01cc
            int r0 = r4.getChildCount()
            int r0 = r0 - r5
            r4.removeViewAt(r0)
        L_0x01cc:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r1.f276408F
            if (r0 != 0) goto L_0x01d1
            goto L_0x01d5
        L_0x01d1:
            r4 = 0
            r0.setAlpha(r4)
        L_0x01d5:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r1.f276408F
            if (r0 != 0) goto L_0x01dd
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x01dd:
            java.lang.String r4 = "initAnimListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            androidx.lifecycle.LiveData<java.lang.Integer> r7 = r1.f276415y
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r0 r9 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r0
            r9.<init>(r1)
            r7.observeForever(r9)
            so2.k r7 = r1.f276410t
            int r7 = r7.f296504j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            if (r7 != r5) goto L_0x0253
            android.content.Context r5 = r1.f276409s
            boolean r9 = r5 instanceof androidx.lifecycle.C0125s
            if (r9 == 0) goto L_0x0253
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner"
            gy3.C87412m.m108592e(r5, r0)
            androidx.lifecycle.s r5 = (androidx.lifecycle.C0125s) r5
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2 r0 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2
            r0.<init>(r5, r1)
            r1.f276404B = r0
            r0.alive()
            android.view.View r0 = r1.f276586n
            if (r0 != 0) goto L_0x0213
            goto L_0x024f
        L_0x0213:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r5.mo10233c(r8)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout"
            java.lang.String r12 = "initAnimListener"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout"
            java.lang.String r11 = "initAnimListener"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x024f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x02bf
        L_0x0253:
            r5 = 2
            if (r7 != r5) goto L_0x029b
            android.view.View r0 = r1.f276586n
            if (r0 != 0) goto L_0x025b
            goto L_0x0297
        L_0x025b:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r5.mo10233c(r8)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout"
            java.lang.String r12 = "initAnimListener"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout"
            java.lang.String r11 = "initAnimListener"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0297:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x02bf
        L_0x029b:
            androidx.lifecycle.x r5 = new androidx.lifecycle.x
            r5.<init>()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u0 r6 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u0
            r6.<init>(r1, r0, r5)
            androidx.lifecycle.LiveData<java.lang.Integer> r0 = r1.f276415y
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s0 r7 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s0
            r7.<init>(r5)
            r5.addSource(r0, r7)
            r5.observeForever(r6)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t0 r0 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t0
            r0.<init>(r5)
            r5 = 1000(0x3e8, double:4.94E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
        L_0x02bf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95243v0.mo131765G():void");
    }

    /* renamed from: H */
    public final void mo131766H() {
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        ObjectAnimator objectAnimator = this.f276407E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.f276586n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.f276408F;
        if (roundedCornerFrameLayout == null) {
            SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            return;
        }
        this.f276407E = C5441x0.m5359a(new WeakReference(roundedCornerFrameLayout));
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    /* renamed from: I */
    public final void mo131767I() {
        SnsMethodCalculate.markStartTimeMs("willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        super.mo124360B();
        for (C95098h0 B : this.f276403A) {
            B.mo124360B();
        }
        SnsMethodCalculate.markEndTimeMs("willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    /* renamed from: J */
    public final void mo131768J() {
        SnsMethodCalculate.markStartTimeMs("willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        super.mo124361D();
        for (C95098h0 D : this.f276403A) {
            D.mo124361D();
        }
        SnsMethodCalculate.markEndTimeMs("willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
    }
}
