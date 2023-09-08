package com.tencent.p014mm.live.p016ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import f60.C7984b;
import f60.C7985c;
import f60.C7986d;
import f60.C7987e;
import f60.C7988f;
import f60.C7989g;
import f60.C7990h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ob0.C11385n;
import te3.C49317ep2;
import y50.C66519j0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/LiveUID;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.ui.LiveUID */
public final class LiveUID extends MMActivity implements C11385n {

    /* renamed from: E */
    public static final /* synthetic */ int f10334E = 0;

    /* renamed from: A */
    public LiveConfig f10335A;

    /* renamed from: B */
    public int f10336B = 0;

    /* renamed from: C */
    public int f10337C;

    /* renamed from: D */
    public boolean f10338D;

    /* renamed from: d */
    public final String f10339d = "MicroMsg.LiveUID";

    /* renamed from: e */
    public ImageView f10340e;

    /* renamed from: f */
    public TextView f10341f;

    /* renamed from: g */
    public TextView f10342g;

    /* renamed from: h */
    public View f10343h;

    /* renamed from: i */
    public TextView f10344i;

    /* renamed from: j */
    public TextView f10345j;

    /* renamed from: n */
    public TextView f10346n;

    /* renamed from: o */
    public Button f10347o;

    /* renamed from: p */
    public View f10348p;

    /* renamed from: q */
    public ImageView f10349q;

    /* renamed from: r */
    public View f10350r;

    /* renamed from: s */
    public View f10351s;

    /* renamed from: t */
    public ImageView f10352t;

    /* renamed from: u */
    public View f10353u;

    /* renamed from: v */
    public ImageView f10354v;

    /* renamed from: w */
    public View f10355w;

    /* renamed from: x */
    public ImageView f10356x;

    /* renamed from: y */
    public Button f10357y;

    /* renamed from: z */
    public final int f10358z = 1;

    /* renamed from: com.tencent.mm.live.ui.LiveUID$a */
    public static final class C1274a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ LiveUID f10359d;

        public C1274a(LiveUID liveUID) {
            this.f10359d = liveUID;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f10359d.f10350r;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/live/ui/LiveUID$hideRangePanel$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/live/ui/LiveUID$hideRangePanel$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r0.animate()).translationY((float) com.tencent.p014mm.p136ui.C75044y4.m89990b(getContext()).y);
     */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1187H7() {
        /*
            r3 = this;
            android.view.View r0 = r3.f10351s
            if (r0 == 0) goto L_0x0022
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.app.AppCompatActivity r1 = r3.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            if (r0 == 0) goto L_0x0022
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x002d
            com.tencent.mm.live.ui.LiveUID$a r1 = new com.tencent.mm.live.ui.LiveUID$a
            r1.<init>(r3)
            r0.setListener(r1)
        L_0x002d:
            if (r0 == 0) goto L_0x0032
            r0.start()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.p016ui.LiveUID.mo1187H7():void");
    }

    /* renamed from: I7 */
    public final void mo1188I7() {
        Button button = this.f10347o;
        if (button != null) {
            button.setVisibility(8);
        }
        TextView textView = this.f10346n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        ImageView imageView = this.f10340e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView2 = this.f10341f;
        ViewGroup.LayoutParams layoutParams = textView2 != null ? textView2.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C74942w4.m89784a(getContext(), 72);
        TextView textView3 = this.f10341f;
        if (textView3 != null) {
            textView3.requestLayout();
        }
    }

    /* renamed from: J7 */
    public final void mo1189J7() {
        TextView textView;
        int i = this.f10336B;
        if (i == 0) {
            TextView textView2 = this.f10344i;
            if (textView2 != null) {
                textView2.setText(getContext().getResources().getString(C0966R.string.g9m));
            }
        } else if (i == this.f10358z && (textView = this.f10344i) != null) {
            textView.setText(getContext().getResources().getString(C0966R.string.g9n));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b78;
    }

    public void onBackPressed() {
        View view = this.f10350r;
        boolean z = true;
        if (view == null || !view.isShown()) {
            z = false;
        }
        if (z) {
            mo1187H7();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f8236a4);
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("FROM_SENCE", 2);
        this.f10337C = intExtra;
        if (intExtra == 1) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            if (C87412m.m108589b(RoomLiveService.f157199j, C75592q0.m90789s())) {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorEnterReplayFromAppMsg");
                C115669n.INSTANCE.mo175913w(1385, 7, 1);
            } else {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markVisitorEnterReplayFromSysMsg");
                C115669n.INSTANCE.mo175913w(1385, 9, 1);
            }
        } else if (intExtra == 2) {
            RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
            if (C87412m.m108589b(RoomLiveService.f157199j, C75592q0.m90789s())) {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorEnterReplayFromTipBar");
                C115669n.INSTANCE.mo175913w(1385, 8, 1);
            } else {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markVisitorEnterReplayFromTipBar");
                C115669n.INSTANCE.mo175913w(1385, 10, 1);
            }
        }
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(3);
        LiveConfig liveConfig = (LiveConfig) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        this.f10335A = liveConfig;
        if (liveConfig != null) {
            RoomLiveService roomLiveService3 = RoomLiveService.f157190a;
            C49317ep2 ep22 = new C49317ep2();
            RoomLiveService.f157197h = ep22;
            LiveConfig liveConfig2 = this.f10335A;
            ep22.f133050d = liveConfig2 != null ? liveConfig2.f157064e : 0;
            String str = liveConfig2 != null ? liveConfig2.f157065f : null;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            RoomLiveService.f157192c = str;
            String str3 = liveConfig2 != null ? liveConfig2.f157069j : null;
            if (str3 != null) {
                str2 = str3;
            }
            RoomLiveService.f157199j = str2;
        }
        String str4 = this.f10339d;
        Log.m105924i(str4, "initConfig liveId:" + RoomLiveService.f157197h.f133050d + " wechatRoomId:" + RoomLiveService.f157192c);
        this.f10340e = (ImageView) findViewById(C0966R.C0970id.fxp);
        this.f10341f = (TextView) findViewById(C0966R.C0970id.fxq);
        this.f10342g = (TextView) findViewById(C0966R.C0970id.fxa);
        this.f10343h = findViewById(C0966R.C0970id.fxg);
        this.f10344i = (TextView) findViewById(C0966R.C0970id.fxo);
        this.f10345j = (TextView) findViewById(C0966R.C0970id.fx9);
        this.f10346n = (TextView) findViewById(C0966R.C0970id.fxb);
        this.f10347o = (Button) findViewById(C0966R.C0970id.fx7);
        this.f10348p = findViewById(C0966R.C0970id.fx_);
        this.f10349q = (ImageView) findViewById(C0966R.C0970id.fx6);
        View view = this.f10348p;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C75044y4.m89989a(getContext()) + C75044y4.m89994f(getContext());
        ImageView imageView = this.f10340e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.f10341f;
        ViewGroup.LayoutParams layoutParams2 = textView != null ? textView.getLayoutParams() : null;
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C74942w4.m89784a(getContext(), 72);
        TextView textView2 = this.f10341f;
        if (textView2 != null) {
            textView2.requestLayout();
        }
        View view2 = this.f10343h;
        if (view2 != null) {
            view2.setOnClickListener(new C7989g(this));
        }
        ImageView imageView2 = this.f10349q;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C7990h(this));
        }
        if (Util.isEqual((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), RoomLiveService.f157199j)) {
            View view3 = this.f10343h;
            if (view3 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/live/ui/LiveUID", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/live/ui/LiveUID", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view4 = this.f10343h;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/live/ui/LiveUID", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/live/ui/LiveUID", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        mo1189J7();
        this.f10350r = findViewById(C0966R.C0970id.fxi);
        this.f10351s = findViewById(C0966R.C0970id.fxf);
        this.f10352t = (ImageView) findViewById(C0966R.C0970id.fxe);
        this.f10353u = findViewById(C0966R.C0970id.fxn);
        this.f10354v = (ImageView) findViewById(C0966R.C0970id.fxm);
        this.f10355w = findViewById(C0966R.C0970id.fxl);
        this.f10356x = (ImageView) findViewById(C0966R.C0970id.fxk);
        this.f10357y = (Button) findViewById(C0966R.C0970id.fxd);
        View view6 = this.f10350r;
        if (view6 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/live/ui/LiveUID", "initRangePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/live/ui/LiveUID", "initRangePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view8 = this.f10351s;
        if (view8 != null) {
            view8.setTranslationY((float) C75044y4.m89990b(getContext()).y);
        }
        View view9 = this.f10353u;
        if (view9 != null) {
            view9.setOnClickListener(new C7984b(this));
        }
        View view10 = this.f10355w;
        if (view10 != null) {
            view10.setOnClickListener(new C7985c(this));
        }
        View view11 = this.f10350r;
        if (view11 != null) {
            view11.setOnClickListener(new C7986d(this));
        }
        Button button = this.f10357y;
        if (button != null) {
            button.setOnClickListener(new C7987e(this));
        }
        ImageView imageView3 = this.f10352t;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C7988f(this));
        }
        C66519j0.f191358d.mo90599c();
        C86709a0.m107529k().f251779b.mo123455a(3806, this);
        C86709a0.m107529k().f251779b.mo123455a(3712, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(3806, this);
        C86709a0.m107529k().f251779b.mo123470p(3712, this);
        if (this.f10335A != null) {
            RoomLiveService.f157190a.mo76447e();
        }
    }

    public void onResume() {
        super.onResume();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if ((r8 == null || r8.length() == 0) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if ((r8 == null || r8.length() == 0) == false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r8, int r9, java.lang.String r10, ob0.C117747y r11) {
        /*
            r7 = this;
            java.lang.String r10 = r7.f10339d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "errType:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", errCode:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r10 = r11 instanceof z50.C16103b
            if (r10 == 0) goto L_0x0241
            com.tencent.mm.live.model.RoomLiveService r10 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            te3.ep2 r10 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            boolean r10 = r10.f133062s
            r11 = 0
            if (r10 == 0) goto L_0x002e
            int r10 = r7.f10358z
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            r7.f10336B = r10
            r7.mo1189J7()
            if (r8 != 0) goto L_0x023d
            if (r9 != 0) goto L_0x023d
            te3.ep2 r8 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r9 = r8.f133063t
            java.lang.String r10 = r8.f133064u
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            r10 = 1
            if (r9 == 0) goto L_0x0056
            java.lang.String r8 = r8.f133058o
            if (r8 == 0) goto L_0x0052
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r8 = 0
            goto L_0x0053
        L_0x0052:
            r8 = 1
        L_0x0053:
            if (r8 != 0) goto L_0x006c
            goto L_0x006a
        L_0x0056:
            boolean r9 = r8.f133062s
            if (r9 == 0) goto L_0x006c
            java.lang.String r8 = r8.f133058o
            if (r8 == 0) goto L_0x0067
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r8 = 0
            goto L_0x0068
        L_0x0067:
            r8 = 1
        L_0x0068:
            if (r8 != 0) goto L_0x006c
        L_0x006a:
            r8 = 1
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0 = 0
            r1 = 8
            if (r8 == 0) goto L_0x00d9
            android.widget.TextView r8 = r7.f10346n
            if (r8 != 0) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r8.setVisibility(r1)
        L_0x007c:
            android.widget.TextView r8 = r7.f10345j
            if (r8 != 0) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r8.setVisibility(r1)
        L_0x0084:
            android.widget.Button r8 = r7.f10347o
            if (r8 != 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r8.setVisibility(r11)
        L_0x008c:
            android.widget.Button r8 = r7.f10347o
            if (r8 != 0) goto L_0x0091
            goto L_0x00a3
        L_0x0091:
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131831982(0x7f112cae, float:1.9297005E38)
            java.lang.String r10 = r10.getString(r11)
            r8.setText(r10)
        L_0x00a3:
            android.widget.Button r8 = r7.f10347o
            if (r8 == 0) goto L_0x00af
            f60.k r10 = new f60.k
            r10.<init>(r7)
            r8.setOnClickListener(r10)
        L_0x00af:
            android.widget.ImageView r8 = r7.f10340e
            if (r8 != 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r8.setVisibility(r1)
        L_0x00b7:
            android.widget.TextView r8 = r7.f10341f
            if (r8 == 0) goto L_0x00bf
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
        L_0x00bf:
            gy3.C87412m.m108592e(r0, r9)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            androidx.appcompat.app.AppCompatActivity r8 = r7.getContext()
            r9 = 72
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r9)
            r0.topMargin = r8
            android.widget.TextView r8 = r7.f10341f
            if (r8 == 0) goto L_0x0243
            r8.requestLayout()
            goto L_0x0243
        L_0x00d9:
            te3.ep2 r8 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r2 = r8.f133054h
            r3 = 5
            if (r2 != r3) goto L_0x00e2
            r3 = 1
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            r4 = 40
            r5 = 2131755936(0x7f1003a0, float:1.9142765E38)
            r6 = 2131821556(0x7f1103f4, float:1.9275859E38)
            if (r3 == 0) goto L_0x018e
            android.widget.TextView r8 = r7.f10341f
            if (r8 != 0) goto L_0x00f2
            goto L_0x0104
        L_0x00f2:
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r2 = 2131832113(0x7f112d31, float:1.929727E38)
            java.lang.String r10 = r10.getString(r2)
            r8.setText(r10)
        L_0x0104:
            android.widget.TextView r8 = r7.f10342g
            if (r8 != 0) goto L_0x0109
            goto L_0x011b
        L_0x0109:
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r2 = 2131832108(0x7f112d2c, float:1.929726E38)
            java.lang.String r10 = r10.getString(r2)
            r8.setText(r10)
        L_0x011b:
            android.widget.TextView r8 = r7.f10346n
            if (r8 != 0) goto L_0x0120
            goto L_0x0123
        L_0x0120:
            r8.setVisibility(r1)
        L_0x0123:
            android.widget.TextView r8 = r7.f10345j
            if (r8 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r8.setVisibility(r1)
        L_0x012b:
            android.widget.Button r8 = r7.f10347o
            if (r8 != 0) goto L_0x0130
            goto L_0x0133
        L_0x0130:
            r8.setVisibility(r11)
        L_0x0133:
            android.widget.Button r8 = r7.f10347o
            if (r8 != 0) goto L_0x0138
            goto L_0x0147
        L_0x0138:
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getString(r6)
            r8.setText(r10)
        L_0x0147:
            android.widget.Button r8 = r7.f10347o
            if (r8 == 0) goto L_0x0153
            f60.j r10 = new f60.j
            r10.<init>(r7)
            r8.setOnClickListener(r10)
        L_0x0153:
            android.widget.ImageView r8 = r7.f10340e
            if (r8 != 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            r8.setVisibility(r11)
        L_0x015b:
            android.widget.ImageView r8 = r7.f10340e
            if (r8 == 0) goto L_0x016e
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r5)
            r8.setImageDrawable(r10)
        L_0x016e:
            android.widget.TextView r8 = r7.f10341f
            if (r8 == 0) goto L_0x0176
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
        L_0x0176:
            gy3.C87412m.m108592e(r0, r9)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            androidx.appcompat.app.AppCompatActivity r8 = r7.getContext()
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r4)
            r0.topMargin = r8
            android.widget.TextView r8 = r7.f10341f
            if (r8 == 0) goto L_0x0243
            r8.requestLayout()
            goto L_0x0243
        L_0x018e:
            r3 = 4
            if (r2 != r3) goto L_0x0196
            boolean r8 = r8.f133062s
            if (r8 != 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r10 = 0
        L_0x0197:
            if (r10 == 0) goto L_0x0239
            android.widget.TextView r8 = r7.f10341f
            if (r8 != 0) goto L_0x019e
            goto L_0x01b0
        L_0x019e:
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r2 = 2131832111(0x7f112d2f, float:1.9297267E38)
            java.lang.String r10 = r10.getString(r2)
            r8.setText(r10)
        L_0x01b0:
            android.widget.TextView r8 = r7.f10342g
            if (r8 != 0) goto L_0x01b5
            goto L_0x01c7
        L_0x01b5:
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r2 = 2131832107(0x7f112d2b, float:1.9297258E38)
            java.lang.String r10 = r10.getString(r2)
            r8.setText(r10)
        L_0x01c7:
            android.widget.TextView r8 = r7.f10346n
            if (r8 != 0) goto L_0x01cc
            goto L_0x01cf
        L_0x01cc:
            r8.setVisibility(r1)
        L_0x01cf:
            android.widget.TextView r8 = r7.f10345j
            if (r8 != 0) goto L_0x01d4
            goto L_0x01d7
        L_0x01d4:
            r8.setVisibility(r1)
        L_0x01d7:
            android.widget.Button r8 = r7.f10347o
            if (r8 != 0) goto L_0x01dc
            goto L_0x01df
        L_0x01dc:
            r8.setVisibility(r11)
        L_0x01df:
            android.widget.Button r8 = r7.f10347o
            if (r8 != 0) goto L_0x01e4
            goto L_0x01f3
        L_0x01e4:
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getString(r6)
            r8.setText(r10)
        L_0x01f3:
            android.widget.Button r8 = r7.f10347o
            if (r8 == 0) goto L_0x01ff
            f60.i r10 = new f60.i
            r10.<init>(r7)
            r8.setOnClickListener(r10)
        L_0x01ff:
            android.widget.ImageView r8 = r7.f10340e
            if (r8 != 0) goto L_0x0204
            goto L_0x0207
        L_0x0204:
            r8.setVisibility(r11)
        L_0x0207:
            android.widget.ImageView r8 = r7.f10340e
            if (r8 == 0) goto L_0x021a
            androidx.appcompat.app.AppCompatActivity r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r5)
            r8.setImageDrawable(r10)
        L_0x021a:
            android.widget.TextView r8 = r7.f10341f
            if (r8 == 0) goto L_0x0222
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
        L_0x0222:
            gy3.C87412m.m108592e(r0, r9)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            androidx.appcompat.app.AppCompatActivity r8 = r7.getContext()
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r4)
            r0.topMargin = r8
            android.widget.TextView r8 = r7.f10341f
            if (r8 == 0) goto L_0x0243
            r8.requestLayout()
            goto L_0x0243
        L_0x0239:
            r7.mo1188I7()
            goto L_0x0243
        L_0x023d:
            r7.mo1188I7()
            goto L_0x0243
        L_0x0241:
            boolean r8 = r11 instanceof z50.C16111r
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.p016ui.LiveUID.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
