package com.tencent.p014mm.plugin.finder.live.widget;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C8961e;
import il1.C9058l5;
import il1.C9064m5;
import il1.C9075n5;
import il1.C9082o5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C11471u;
import ok1.C62042e;
import qj1.C62660c;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C64284cg;
import tf0.C13883o1;
import tf0.C64916p1;
import up1.C37521f;
import zc1.C66785b;
import zh0.C16196b;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget */
public final class FinderLiveMemebrProfileWidget extends C8961e implements View.OnClickListener, C11385n {

    /* renamed from: A */
    public LinearLayout f15382A;

    /* renamed from: B */
    public WeImageView f15383B;

    /* renamed from: C */
    public TextView f15384C;

    /* renamed from: D */
    public TextView f15385D;

    /* renamed from: E */
    public ImageView f15386E;

    /* renamed from: F */
    public View f15387F;

    /* renamed from: G */
    public RelativeLayout f15388G;

    /* renamed from: H */
    public FrameLayout f15389H;

    /* renamed from: I */
    public WeImageView f15390I;

    /* renamed from: J */
    public TextView f15391J;

    /* renamed from: K */
    public View f15392K;

    /* renamed from: L */
    public TextView f15393L;

    /* renamed from: M */
    public View f15394M;

    /* renamed from: N */
    public Button f15395N;

    /* renamed from: P */
    public Button f15396P;

    /* renamed from: Q */
    public Button f15397Q;

    /* renamed from: R */
    public ProgressBar f15398R;

    /* renamed from: S */
    public View f15399S;

    /* renamed from: T */
    public WeImageView f15400T;

    /* renamed from: U */
    public TextView f15401U;

    /* renamed from: V */
    public IListener<FollowUserEvent> f15402V;

    /* renamed from: W */
    public boolean f15403W;

    /* renamed from: X */
    public C77407n f15404X;

    /* renamed from: Y */
    public String f15405Y;

    /* renamed from: h */
    public final C62660c f15406h;

    /* renamed from: i */
    public final String f15407i;

    /* renamed from: j */
    public C32224a<C13598b0> f15408j;

    /* renamed from: n */
    public C32224a<C13598b0> f15409n;

    /* renamed from: o */
    public C32226l<? super String, C13598b0> f15410o;

    /* renamed from: p */
    public C32224a<C13598b0> f15411p;

    /* renamed from: q */
    public C32226l<? super String, C13598b0> f15412q;

    /* renamed from: r */
    public C49765hx0 f15413r;

    /* renamed from: s */
    public int f15414s;

    /* renamed from: t */
    public C49712hj1 f15415t;

    /* renamed from: u */
    public boolean f15416u;

    /* renamed from: v */
    public boolean f15417v;

    /* renamed from: w */
    public RelativeLayout f15418w;

    /* renamed from: x */
    public TextView f15419x;

    /* renamed from: y */
    public ImageView f15420y;

    /* renamed from: z */
    public TextView f15421z;

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget$a */
    public static final class C3241a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMemebrProfileWidget f15422d;

        public C3241a(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
            this.f15422d = finderLiveMemebrProfileWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
            r0 = r0.f134919d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
                r8 = this;
                java.lang.Class<ak1.o> r0 = ak1.C54108o.class
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r9)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$1"
                java.lang.String r3 = "android/view/View$OnClickListener"
                java.lang.String r4 = "onClick"
                java.lang.String r5 = "(Landroid/view/View;)V"
                r6 = r8
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                ok1.e r9 = ok1.C62042e.f176370a
                boolean r1 = r9.mo87027N0()
                r2 = 0
                r3 = 2
                if (r1 == 0) goto L_0x003f
                di3.d r1 = di3.C86312j.m106911c(r0)
                ak1.o r1 = (ak1.C54108o) r1
                com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r4 = r8.f15422d
                int r5 = r4.f15414s
                te3.hx0 r6 = r4.f15413r
                if (r6 == 0) goto L_0x0037
                int r2 = r6.f134926n
            L_0x0037:
                java.lang.String r4 = r4.mo3435t()
                r1.Wx0(r3, r5, r2, r4)
                goto L_0x0058
            L_0x003f:
                java.lang.Class<ak1.w> r1 = ak1.C54116w.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ak1.w r1 = (ak1.C54116w) r1
                com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r4 = r8.f15422d
                int r5 = r4.f15414s
                te3.hx0 r6 = r4.f15413r
                if (r6 == 0) goto L_0x0051
                int r2 = r6.f134926n
            L_0x0051:
                java.lang.String r4 = r4.mo3435t()
                r1.Fy0(r3, r5, r2, r4)
            L_0x0058:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r1 = r8.f15422d
                r1.getClass()
                boolean r9 = r9.mo87027N0()
                if (r9 == 0) goto L_0x006e
                di3.d r9 = di3.C86312j.m106911c(r0)
                ak1.o r9 = (ak1.C54108o) r9
                ak1.f0$h0 r0 = ak1.C54067f0.C0059h0.CLICK_ENTER_USER_PROFILE
                r9.Zx0(r0)
            L_0x006e:
                r1.mo9763a()
                fy3.l<? super java.lang.String, rx3.b0> r9 = r1.f15410o
                if (r9 == 0) goto L_0x0084
                te3.hx0 r0 = r1.f15413r
                if (r0 == 0) goto L_0x0080
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
                if (r0 == 0) goto L_0x0080
                java.lang.String r0 = r0.username
                goto L_0x0081
            L_0x0080:
                r0 = 0
            L_0x0081:
                r9.invoke(r0)
            L_0x0084:
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r8, r9, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget.C3241a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget$b */
    public static final class C3242b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMemebrProfileWidget f15423d;

        public C3242b(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
            this.f15423d = finderLiveMemebrProfileWidget;
        }

        public final void onClick(View view) {
            C13598b0 b0Var;
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62042e eVar = C62042e.f176370a;
            if (eVar.mo87027N0()) {
                C54108o oVar = (C54108o) C86312j.m106911c(cls);
                FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f15423d;
                int i = finderLiveMemebrProfileWidget.f15414s;
                C49765hx0 hx02 = finderLiveMemebrProfileWidget.f15413r;
                oVar.Wx0(3, i, hx02 != null ? hx02.f134926n : 0, finderLiveMemebrProfileWidget.mo3435t());
            }
            FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget2 = this.f15423d;
            finderLiveMemebrProfileWidget2.getClass();
            Class cls2 = C13883o1.class;
            C37521f.f99374d.getClass();
            if (C37521f.f99376d2.mo60266n().intValue() <= 0) {
                Context context = finderLiveMemebrProfileWidget2.f28306d;
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.d2x), 0).show();
            } else {
                C49765hx0 hx03 = finderLiveMemebrProfileWidget2.f15413r;
                if (hx03 != null) {
                    if (eVar.mo87027N0()) {
                        ((C54108o) C86312j.m106911c(cls)).Zx0(C54067f0.C0059h0.CLICK_PRIVATE_MSG_USER);
                    }
                    String str = finderLiveMemebrProfileWidget2.f15405Y;
                    if (str != null) {
                        ((C13883o1) C86312j.m106911c(cls2)).Or0(finderLiveMemebrProfileWidget2.f28306d, str, hx03, 1, new C9082o5(finderLiveMemebrProfileWidget2));
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        finderLiveMemebrProfileWidget2.mo9763a();
                        C7335d c = C86312j.m106911c(cls2);
                        C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
                        ((C13883o1) c).Or0(finderLiveMemebrProfileWidget2.f28306d, C66785b.f191882e.mo90662O5(), hx03, 1, (C32224a<C13598b0>) null);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget$c */
    public static final class C3243c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMemebrProfileWidget f15424d;

        public C3243c(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
            this.f15424d = finderLiveMemebrProfileWidget;
        }

        public final void onClick(View view) {
            String str;
            C58124b bVar;
            FinderContact finderContact;
            FinderContact finderContact2;
            String str2;
            FinderContact finderContact3;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C62042e.f176370a.mo87027N0()) {
                C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f15424d;
                int i = finderLiveMemebrProfileWidget.f15414s;
                C49765hx0 hx02 = finderLiveMemebrProfileWidget.f15413r;
                wVar.Fy0(3, i, hx02 != null ? hx02.f134926n : 0, finderLiveMemebrProfileWidget.mo3435t());
            }
            FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget2 = this.f15424d;
            finderLiveMemebrProfileWidget2.mo9763a();
            Bundle bundle = new Bundle();
            C49765hx0 hx03 = finderLiveMemebrProfileWidget2.f15413r;
            String str3 = "";
            if (hx03 == null || (finderContact3 = hx03.f134919d) == null || (str = finderContact3.username) == null) {
                str = str3;
            }
            bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", str);
            C49765hx0 hx04 = finderLiveMemebrProfileWidget2.f15413r;
            if (!(hx04 == null || (finderContact2 = hx04.f134919d) == null || (str2 = finderContact2.nickname) == null)) {
                str3 = str2;
            }
            bundle.putString("PARAM_FINDER_LIVE_LINK_NICKNAME", str3);
            C49765hx0 hx05 = finderLiveMemebrProfileWidget2.f15413r;
            bundle.putString("PARAM_FINDER_LIVE_LINK_AVATAR", (hx05 == null || (finderContact = hx05.f134919d) == null) ? null : finderContact.headUrl);
            C62660c cVar = finderLiveMemebrProfileWidget2.f15406h;
            if (!(cVar == null || (bVar = cVar.f177936g) == null)) {
                bVar.statusChange(C58124b.C58125b.LIVE_EVENT_SHOW_GIFT_PANEL, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget$d */
    public static final class C3244d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveMemebrProfileWidget f15425d;

        public C3244d(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
            this.f15425d = finderLiveMemebrProfileWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
            r8 = r8.f134919d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$4"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r8 = r7.f15425d
                r8.mo9763a()
                fy3.l<? super java.lang.String, rx3.b0> r0 = r8.f15412q
                if (r0 == 0) goto L_0x0033
                te3.hx0 r8 = r8.f15413r
                if (r8 == 0) goto L_0x002f
                com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
                if (r8 == 0) goto L_0x002f
                java.lang.String r8 = r8.username
                goto L_0x0030
            L_0x002f:
                r8 = 0
            L_0x0030:
                r0.invoke(r8)
            L_0x0033:
                java.lang.String r8 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$4"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget.C3244d.onClick(android.view.View):void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FinderLiveMemebrProfileWidget(android.content.Context r7, qj1.C62660c r8, ok1.C11471u.C11473b r9, int r10, gy3.C8480h r11) {
        /*
            r6 = this;
            r11 = r10 & 2
            if (r11 == 0) goto L_0x0005
            r8 = 0
        L_0x0005:
            r10 = r10 & 4
            if (r10 == 0) goto L_0x000b
            ok1.u$b r9 = ok1.C11471u.C11473b.AUTO
        L_0x000b:
            r3 = r9
            java.lang.String r9 = "context"
            gy3.C87412m.m108594g(r7, r9)
            java.lang.String r9 = "uiMode"
            gy3.C87412m.m108594g(r3, r9)
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f15406h = r8
            java.lang.String r7 = "FinderLiveMemebrProfileWidget"
            r6.f15407i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget.<init>(android.content.Context, qj1.c, ok1.u$b, int, gy3.h):void");
    }

    /* renamed from: B */
    public static /* synthetic */ void m3151B(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget, C49765hx0 hx02, int i, C49712hj1 hj12, boolean z, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            hj12 = null;
        }
        C49712hj1 hj13 = hj12;
        if ((i2 & 16) != 0) {
            str = "";
        }
        finderLiveMemebrProfileWidget.mo3423A(hx02, i, hj13, z, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02a2, code lost:
        if (r2 != null) goto L_0x02a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0696  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3423A(te3.C49765hx0 r27, int r28, te3.C49712hj1 r29, boolean r30, java.lang.String r31) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "liveContact"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "curUserSdkId"
            r5 = r31
            gy3.C87412m.m108594g(r5, r4)
            int r4 = r0.f134926n
            java.lang.String r5 = r1.f15407i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "showProfile contentIsShow:"
            r6.append(r7)
            boolean r7 = r1.f15403W
            r6.append(r7)
            java.lang.String r7 = ",roleType:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ",sourceType:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r1.f15413r = r0
            r1.f15414s = r2
            r0 = r29
            r1.f15415t = r0
            r0 = r30
            r1.f15417v = r0
            java.lang.String r0 = r1.f15407i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "updateProfile contentIsShow:"
            r2.append(r5)
            boolean r5 = r1.f15403W
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            te3.hx0 r0 = r1.f15413r
            if (r0 == 0) goto L_0x0699
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r0.f134919d
            r6 = 0
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = r5.username
            goto L_0x0071
        L_0x0070:
            r5 = r6
        L_0x0071:
            fe1.d$b r7 = fe1.C58961d.f168673a
            fe1.q r8 = r7.mo84155b(r5)
            if (r8 != 0) goto L_0x009c
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r0.f134919d
            if (r8 == 0) goto L_0x0080
            r7.mo84162j(r8)
        L_0x0080:
            java.lang.String r7 = r1.f15407i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "updateProfile :"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = " localContact is empty,replace it!"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
        L_0x009c:
            android.widget.ProgressBar r5 = r1.f15398R
            r7 = 4
            if (r5 != 0) goto L_0x00a2
            goto L_0x00a5
        L_0x00a2:
            r5.setVisibility(r7)
        L_0x00a5:
            android.view.View r5 = r1.f15387F
            r15 = 0
            if (r5 != 0) goto L_0x00ac
            r2 = 0
            goto L_0x00f4
        L_0x00ac:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r8)
            java.lang.Object[] r9 = r14.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget"
            java.lang.String r11 = "updateProfile"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r8 = r5
            r7 = r14
            r14 = r16
            r2 = 0
            r15 = r17
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r7 = r7.mo10231a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget"
            java.lang.String r10 = "updateProfile"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x00f4:
            android.widget.RelativeLayout r5 = r1.f15418w
            if (r5 != 0) goto L_0x00f9
            goto L_0x00fc
        L_0x00f9:
            r5.setVisibility(r2)
        L_0x00fc:
            android.view.View r5 = r1.f15394M
            if (r5 != 0) goto L_0x0101
            goto L_0x0144
        L_0x0101:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r15.mo10233c(r7)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget"
            java.lang.String r10 = "updateProfile"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r5
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget"
            java.lang.String r9 = "updateProfile"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r5
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x0144:
            int r5 = r1.f15414s
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r0.f134919d
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r15 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            if (r7 == 0) goto L_0x01c6
            java.lang.String r7 = r7.headUrl
            if (r7 == 0) goto L_0x01c6
            android.widget.ImageView r11 = r1.f15386E
            if (r11 == 0) goto L_0x01c6
            ok1.e r12 = ok1.C62042e.f176370a
            int r13 = r0.f134926n
            r12.getClass()
            pl1.e0$a r12 = pl1.C11978e0.C11979a.WX_AVATAR
            java.lang.Class<pl1.s0> r14 = pl1.C11990s0.class
            if (r13 == r15) goto L_0x01a0
            if (r13 == r8) goto L_0x01a0
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r2 = r13.mo62446e(r3)
            bl3.c r2 = r2.mo62447c(r14)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11865K1()
            pl1.f r15 = new pl1.f
            r15.<init>(r7, r6, r8, r6)
            bl3.r$a r7 = r13.mo62446e(r3)
            bl3.c r7 = r7.mo62447c(r14)
            pl1.s0 r7 = (pl1.C11990s0) r7
            n60.f r7 = r7.mo11867O2(r12)
            l60.b r2 = r2.mo85956b(r15, r7)
            ok1.p r7 = new ok1.p
            r7.<init>(r11)
            r2.getClass()
            r2.f291320d = r7
            r2.mo85951a()
            goto L_0x01c6
        L_0x01a0:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r13 = r2.mo62446e(r3)
            bl3.c r13 = r13.mo62447c(r14)
            pl1.s0 r13 = (pl1.C11990s0) r13
            k60.d r13 = r13.mo11865K1()
            pl1.f r15 = new pl1.f
            r15.<init>(r7, r6, r8, r6)
            bl3.r$a r2 = r2.mo62446e(r3)
            bl3.c r2 = r2.mo62447c(r14)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r12)
            r13.mo85957c(r15, r11, r2)
        L_0x01c6:
            android.widget.TextView r2 = r1.f15419x
            r7 = 8
            if (r2 == 0) goto L_0x0251
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r0.f134919d
            if (r11 == 0) goto L_0x01d3
            java.lang.String r11 = r11.nickname
            goto L_0x01d4
        L_0x01d3:
            r11 = r6
        L_0x01d4:
            if (r11 == 0) goto L_0x01df
            int r11 = r11.length()
            if (r11 != 0) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            r15 = 0
            goto L_0x01e0
        L_0x01df:
            r15 = 1
        L_0x01e0:
            if (r15 == 0) goto L_0x01e5
            java.lang.String r11 = ""
            goto L_0x0205
        L_0x01e5:
            ok1.e r17 = ok1.C62042e.f176370a
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r0.f134919d
            if (r11 == 0) goto L_0x01f0
            java.lang.String r12 = r11.username
            r18 = r12
            goto L_0x01f2
        L_0x01f0:
            r18 = r6
        L_0x01f2:
            if (r11 == 0) goto L_0x01f9
            java.lang.String r11 = r11.nickname
            r19 = r11
            goto L_0x01fb
        L_0x01f9:
            r19 = r6
        L_0x01fb:
            r20 = 0
            r21 = 4
            r22 = 0
            java.lang.String r11 = ok1.C62042e.m72808l0(r17, r18, r19, r20, r21, r22)
        L_0x0205:
            java.lang.Class<ny.h> r12 = p629ny.C76979h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ny.h r12 = (p629ny.C76979h) r12
            android.content.Context r13 = r1.f28306d
            float r2 = r2.getTextSize()
            android.text.SpannableString r2 = r12.yp0(r13, r11, r2)
            java.lang.String r11 = "getService(ISpannableSer…displayName, it.textSize)"
            gy3.C87412m.m108593f(r2, r11)
            android.widget.TextView r11 = r1.f15419x
            if (r11 != 0) goto L_0x0221
            goto L_0x0224
        L_0x0221:
            r11.setText(r2)
        L_0x0224:
            int r2 = r0.f134921f
            r11 = 1
            boolean r2 = o40.C61926c.m72696u(r2, r11)
            int r11 = r0.f134921f
            boolean r11 = o40.C61926c.m72696u(r11, r8)
            if (r2 == 0) goto L_0x023d
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f15390I
            if (r2 != 0) goto L_0x0238
            goto L_0x0251
        L_0x0238:
            r12 = 0
            r2.setVisibility(r12)
            goto L_0x0251
        L_0x023d:
            r12 = 0
            if (r11 == 0) goto L_0x0249
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f15390I
            if (r2 != 0) goto L_0x0245
            goto L_0x0251
        L_0x0245:
            r2.setVisibility(r12)
            goto L_0x0251
        L_0x0249:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f15390I
            if (r2 != 0) goto L_0x024e
            goto L_0x0251
        L_0x024e:
            r2.setVisibility(r7)
        L_0x0251:
            r1.mo3438w(r0)
            int r2 = r0.f134926n
            r11 = 3
            if (r2 != r11) goto L_0x0263
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f15383B
            if (r2 != 0) goto L_0x025e
            goto L_0x026b
        L_0x025e:
            r11 = 0
            r2.setVisibility(r11)
            goto L_0x026b
        L_0x0263:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f15383B
            if (r2 != 0) goto L_0x0268
            goto L_0x026b
        L_0x0268:
            r2.setVisibility(r7)
        L_0x026b:
            wk1.n r17 = wk1.C15440n.f41895a
            android.widget.TextView r2 = r1.f15391J
            java.util.LinkedList<te3.aw0> r11 = r0.f134930r
            r20 = 0
            wk1.x r21 = wk1.C15483x.MODE_DARK
            wk1.y r22 = wk1.C15484y.SIZE_NORMAL
            if (r11 == 0) goto L_0x027e
            int r15 = r11.size()
            goto L_0x027f
        L_0x027e:
            r15 = 0
        L_0x027f:
            if (r15 <= 0) goto L_0x02a4
            r23 = 0
            r24 = 32
            r25 = 0
            r18 = r2
            r19 = r11
            java.util.List r2 = wk1.C15440n.m14442r(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r11 = r2.isEmpty()
            r12 = 1
            r11 = r11 ^ r12
            if (r11 == 0) goto L_0x0298
            goto L_0x0299
        L_0x0298:
            r2 = r6
        L_0x0299:
            if (r2 == 0) goto L_0x02a4
            r11 = 0
            java.lang.Object r2 = r2.get(r11)
            android.text.style.ImageSpan r2 = (android.text.style.ImageSpan) r2
            if (r2 != 0) goto L_0x02a5
        L_0x02a4:
            r2 = r6
        L_0x02a5:
            if (r2 == 0) goto L_0x02c8
            de3.u r11 = new de3.u
            java.lang.String r12 = "  "
            r11.<init>((java.lang.String) r12)
            r12 = 33
            r13 = 1
            r14 = 0
            r11.mo105705b(r2, r14, r13, r12)
            android.widget.TextView r2 = r1.f15391J
            if (r2 != 0) goto L_0x02ba
            goto L_0x02bd
        L_0x02ba:
            r2.setText(r11)
        L_0x02bd:
            android.widget.TextView r2 = r1.f15391J
            if (r2 != 0) goto L_0x02c2
            goto L_0x02c5
        L_0x02c2:
            r2.setVisibility(r14)
        L_0x02c5:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x02c9
        L_0x02c8:
            r2 = r6
        L_0x02c9:
            if (r2 != 0) goto L_0x02dd
            android.widget.TextView r2 = r1.f15391J
            if (r2 != 0) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            java.lang.String r11 = ""
            r2.setText(r11)
        L_0x02d5:
            android.widget.TextView r2 = r1.f15391J
            if (r2 != 0) goto L_0x02da
            goto L_0x02dd
        L_0x02da:
            r2.setVisibility(r7)
        L_0x02dd:
            int r2 = r0.f134926n
            r11 = 3
            if (r2 == r11) goto L_0x02fb
            ok1.e r11 = ok1.C62042e.f176370a
            boolean r11 = r11.mo87027N0()
            if (r11 != 0) goto L_0x02fb
            boolean r11 = r26.mo3437v()
            if (r11 != 0) goto L_0x02fb
            android.widget.TextView r2 = r1.f15384C
            if (r2 != 0) goto L_0x02f6
            goto L_0x03cd
        L_0x02f6:
            r2.setVisibility(r7)
            goto L_0x03cd
        L_0x02fb:
            java.lang.StringBuffer r11 = new java.lang.StringBuffer
            r11.<init>()
            if (r2 == r8) goto L_0x03a9
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r0.f134919d
            if (r2 == 0) goto L_0x0311
            te3.ii0 r12 = r2.extInfo
            if (r12 == 0) goto L_0x0311
            int r12 = r12.f135356g
            r13 = 1
            if (r12 != r13) goto L_0x0311
            r15 = 1
            goto L_0x0312
        L_0x0311:
            r15 = 0
        L_0x0312:
            java.lang.String r12 = "  "
            if (r15 == 0) goto L_0x032a
            android.content.Context r2 = r1.f28306d
            android.content.res.Resources r2 = r2.getResources()
            r13 = 2131836499(0x7f113e53, float:1.9306167E38)
            java.lang.String r2 = r2.getString(r13)
            r11.append(r2)
            r11.append(r12)
            goto L_0x034c
        L_0x032a:
            if (r2 == 0) goto L_0x0336
            te3.ii0 r2 = r2.extInfo
            if (r2 == 0) goto L_0x0336
            int r2 = r2.f135356g
            if (r2 != r8) goto L_0x0336
            r15 = 1
            goto L_0x0337
        L_0x0336:
            r15 = 0
        L_0x0337:
            if (r15 == 0) goto L_0x034c
            android.content.Context r2 = r1.f28306d
            android.content.res.Resources r2 = r2.getResources()
            r13 = 2131836498(0x7f113e52, float:1.9306164E38)
            java.lang.String r2 = r2.getString(r13)
            r11.append(r2)
            r11.append(r12)
        L_0x034c:
            com.tencent.mm.storage.RegionCodeDecoder r2 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r0.f134919d
            if (r12 == 0) goto L_0x035b
            te3.ii0 r13 = r12.extInfo
            if (r13 == 0) goto L_0x035b
            java.lang.String r13 = r13.f135353d
            goto L_0x035c
        L_0x035b:
            r13 = r6
        L_0x035c:
            if (r12 == 0) goto L_0x0365
            te3.ii0 r12 = r12.extInfo
            if (r12 == 0) goto L_0x0365
            java.lang.String r12 = r12.f135354e
            goto L_0x0366
        L_0x0365:
            r12 = r6
        L_0x0366:
            java.lang.String r2 = r2.mo135577m(r13, r12)
            com.tencent.mm.storage.RegionCodeDecoder r12 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r0.f134919d
            if (r13 == 0) goto L_0x0379
            te3.ii0 r14 = r13.extInfo
            if (r14 == 0) goto L_0x0379
            java.lang.String r14 = r14.f135353d
            goto L_0x037a
        L_0x0379:
            r14 = r6
        L_0x037a:
            if (r13 == 0) goto L_0x0383
            te3.ii0 r15 = r13.extInfo
            if (r15 == 0) goto L_0x0383
            java.lang.String r15 = r15.f135354e
            goto L_0x0384
        L_0x0383:
            r15 = r6
        L_0x0384:
            if (r13 == 0) goto L_0x038d
            te3.ii0 r13 = r13.extInfo
            if (r13 == 0) goto L_0x038d
            java.lang.String r13 = r13.f135355f
            goto L_0x038e
        L_0x038d:
            r13 = r6
        L_0x038e:
            java.lang.String r12 = r12.mo135571f(r14, r15, r13)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r13 != 0) goto L_0x03a0
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L_0x03a0:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r2 != 0) goto L_0x03a9
            r11.append(r12)
        L_0x03a9:
            java.lang.CharSequence r2 = z04.C112550d0.m153799i0(r11)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r2)
            if (r2 == 0) goto L_0x03bc
            android.widget.TextView r2 = r1.f15384C
            if (r2 != 0) goto L_0x03b8
            goto L_0x03cd
        L_0x03b8:
            r2.setVisibility(r7)
            goto L_0x03cd
        L_0x03bc:
            android.widget.TextView r2 = r1.f15384C
            if (r2 != 0) goto L_0x03c1
            goto L_0x03c5
        L_0x03c1:
            r7 = 0
            r2.setVisibility(r7)
        L_0x03c5:
            android.widget.TextView r2 = r1.f15384C
            if (r2 != 0) goto L_0x03ca
            goto L_0x03cd
        L_0x03ca:
            r2.setText(r11)
        L_0x03cd:
            r1.mo3441z(r0)
            r1.mo3439x(r0)
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            int r11 = r0.f134926n
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r0.f134919d
            if (r12 == 0) goto L_0x03e0
            int r15 = r12.extFlag
            goto L_0x03e1
        L_0x03e0:
            r15 = 0
        L_0x03e1:
            r12 = 1024(0x400, float:1.435E-42)
            boolean r12 = o40.C61926c.m72696u(r15, r12)
            r1.f15416u = r12
            qj1.c r12 = r1.f15406h
            if (r12 == 0) goto L_0x03fc
            androidx.lifecycle.i0 r12 = r12.mo87696x0(r7)
            cl1.o r12 = (cl1.C54991o) r12
            boolean r12 = r12.mo75963I3()
            r13 = 1
            if (r12 != r13) goto L_0x03fc
            r15 = 1
            goto L_0x03fd
        L_0x03fc:
            r15 = 0
        L_0x03fd:
            if (r15 == 0) goto L_0x040f
            int r12 = r0.f134923h
            r13 = 16
            boolean r12 = o40.C61926c.m72696u(r12, r13)
            if (r12 != 0) goto L_0x040f
            boolean r12 = r1.f15417v
            if (r12 != 0) goto L_0x040f
            r15 = 1
            goto L_0x0410
        L_0x040f:
            r15 = 0
        L_0x0410:
            ok1.e r12 = ok1.C62042e.f176370a
            boolean r12 = r12.mo87027N0()
            if (r12 != 0) goto L_0x047c
            qj1.c r12 = r1.f15406h
            if (r12 == 0) goto L_0x0429
            androidx.lifecycle.i0 r12 = r12.mo87696x0(r2)
            cl1.d0 r12 = (cl1.C54963d0) r12
            al1.j r12 = r12.f154073p
            if (r12 == 0) goto L_0x0429
            java.lang.String r12 = r12.f151999c
            goto L_0x042a
        L_0x0429:
            r12 = r6
        L_0x042a:
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r0.f134919d
            if (r13 == 0) goto L_0x0431
            java.lang.String r13 = r13.username
            goto L_0x0432
        L_0x0431:
            r13 = r6
        L_0x0432:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r12, (java.lang.String) r13)
            if (r12 == 0) goto L_0x047c
            qj1.c r12 = r1.f15406h
            if (r12 == 0) goto L_0x0477
            androidx.lifecycle.i0 r2 = r12.mo87696x0(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            if (r2 == 0) goto L_0x0477
            monitor-enter(r2)
            java.util.Iterator r12 = r2.iterator()     // Catch:{ all -> 0x0474 }
        L_0x044b:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0474 }
            if (r13 == 0) goto L_0x046f
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0474 }
            r14 = r13
            al1.j r14 = (al1.C54130j) r14     // Catch:{ all -> 0x0474 }
            java.lang.String r14 = r14.f151997a     // Catch:{ all -> 0x0474 }
            qj1.c r6 = r1.f15406h     // Catch:{ all -> 0x0474 }
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r7)     // Catch:{ all -> 0x0474 }
            cl1.o r6 = (cl1.C54991o) r6     // Catch:{ all -> 0x0474 }
            java.lang.String r6 = r6.mo76015n4()     // Catch:{ all -> 0x0474 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r6)     // Catch:{ all -> 0x0474 }
            if (r6 == 0) goto L_0x046d
            goto L_0x0470
        L_0x046d:
            r6 = 0
            goto L_0x044b
        L_0x046f:
            r13 = 0
        L_0x0470:
            monitor-exit(r2)
            al1.j r13 = (al1.C54130j) r13
            goto L_0x0478
        L_0x0474:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0477:
            r13 = 0
        L_0x0478:
            if (r13 != 0) goto L_0x047c
            r2 = 1
            goto L_0x047d
        L_0x047c:
            r2 = 0
        L_0x047d:
            r6 = 1
            if (r11 == r6) goto L_0x052f
            if (r11 == r8) goto L_0x052f
            r6 = 3
            if (r11 == r6) goto L_0x04ad
            android.widget.Button r2 = r1.f15395N
            r6 = 0
            if (r2 != 0) goto L_0x048b
            goto L_0x0492
        L_0x048b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
        L_0x0492:
            android.widget.Button r2 = r1.f15396P
            if (r2 != 0) goto L_0x0497
            goto L_0x049e
        L_0x0497:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
        L_0x049e:
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x04a4
            goto L_0x0597
        L_0x04a4:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
            goto L_0x0597
        L_0x04ad:
            ok1.e r6 = ok1.C62042e.f176370a
            boolean r7 = r6.mo87027N0()
            if (r7 != 0) goto L_0x04e2
            boolean r7 = r26.mo3437v()
            if (r7 != 0) goto L_0x04e2
            if (r15 == 0) goto L_0x04e2
            android.widget.Button r2 = r1.f15395N
            if (r2 != 0) goto L_0x04c2
            goto L_0x04c5
        L_0x04c2:
            r2.setTag(r10)
        L_0x04c5:
            android.widget.Button r2 = r1.f15396P
            if (r2 != 0) goto L_0x04ca
            goto L_0x04d2
        L_0x04ca:
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
        L_0x04d2:
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x04d8
            goto L_0x0597
        L_0x04d8:
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
            goto L_0x0597
        L_0x04e2:
            boolean r6 = r6.mo87027N0()
            if (r6 != 0) goto L_0x050f
            if (r2 == 0) goto L_0x050f
            android.widget.Button r2 = r1.f15395N
            if (r2 != 0) goto L_0x04ef
            goto L_0x04f2
        L_0x04ef:
            r2.setTag(r10)
        L_0x04f2:
            android.widget.Button r2 = r1.f15396P
            if (r2 != 0) goto L_0x04f7
            goto L_0x04ff
        L_0x04f7:
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
        L_0x04ff:
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x0505
            goto L_0x0597
        L_0x0505:
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
            goto L_0x0597
        L_0x050f:
            android.widget.Button r2 = r1.f15395N
            if (r2 != 0) goto L_0x0514
            goto L_0x0517
        L_0x0514:
            r2.setTag(r10)
        L_0x0517:
            android.widget.Button r2 = r1.f15396P
            if (r2 != 0) goto L_0x051c
            goto L_0x051f
        L_0x051c:
            r2.setTag(r9)
        L_0x051f:
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x0525
            goto L_0x0597
        L_0x0525:
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
            goto L_0x0597
        L_0x052f:
            r6 = 0
            android.widget.Button r7 = r1.f15395N
            if (r7 != 0) goto L_0x0535
            goto L_0x053c
        L_0x0535:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r7.setTag(r8)
        L_0x053c:
            android.widget.Button r7 = r1.f15396P
            if (r7 != 0) goto L_0x0541
            goto L_0x0548
        L_0x0541:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r7.setTag(r8)
        L_0x0548:
            boolean r7 = r26.mo3437v()
            if (r7 == 0) goto L_0x055b
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x0553
            goto L_0x0597
        L_0x0553:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
            goto L_0x0597
        L_0x055b:
            ok1.e r6 = ok1.C62042e.f176370a
            boolean r6 = r6.mo87027N0()
            if (r6 == 0) goto L_0x056c
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x0568
            goto L_0x0597
        L_0x0568:
            r2.setTag(r9)
            goto L_0x0597
        L_0x056c:
            if (r15 == 0) goto L_0x057c
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x0573
            goto L_0x0597
        L_0x0573:
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
            goto L_0x0597
        L_0x057c:
            if (r2 == 0) goto L_0x05a2
            android.widget.Button r2 = r1.f15395N
            if (r2 != 0) goto L_0x0583
            goto L_0x0586
        L_0x0583:
            r2.setTag(r10)
        L_0x0586:
            android.widget.Button r2 = r1.f15396P
            if (r2 != 0) goto L_0x058b
            goto L_0x0593
        L_0x058b:
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
        L_0x0593:
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x0599
        L_0x0597:
            r6 = 0
            goto L_0x05af
        L_0x0599:
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
            goto L_0x05af
        L_0x05a2:
            r6 = 0
            android.widget.Button r2 = r1.f15397Q
            if (r2 != 0) goto L_0x05a8
            goto L_0x05af
        L_0x05a8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.setTag(r7)
        L_0x05af:
            android.widget.Button r2 = r1.f15395N
            if (r2 == 0) goto L_0x05b6
            r1.mo3424C(r2, r6)
        L_0x05b6:
            android.widget.Button r2 = r1.f15396P
            if (r2 == 0) goto L_0x05bd
            r1.mo3424C(r2, r6)
        L_0x05bd:
            android.widget.Button r2 = r1.f15397Q
            r7 = 1
            if (r2 == 0) goto L_0x05c5
            r1.mo3424C(r2, r7)
        L_0x05c5:
            r2 = 3
            if (r5 == r2) goto L_0x05d2
            r2 = 4
            if (r5 == r2) goto L_0x05d3
            r8 = 5
            if (r5 == r8) goto L_0x05d3
            r26.mo3440y()
            goto L_0x05db
        L_0x05d2:
            r2 = 4
        L_0x05d3:
            android.widget.FrameLayout r8 = r1.f15389H
            if (r8 != 0) goto L_0x05d8
            goto L_0x05db
        L_0x05d8:
            r8.setVisibility(r2)
        L_0x05db:
            r1.mo3436u(r0)
            java.lang.String r2 = r1.f15407i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "updateProfileInfo,"
            r8.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "headUrl is empty:"
            r9.append(r10)
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r0.f134919d
            if (r10 == 0) goto L_0x05fc
            java.lang.String r10 = r10.headUrl
            goto L_0x05fd
        L_0x05fc:
            r10 = 0
        L_0x05fd:
            if (r10 == 0) goto L_0x0608
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0606
            goto L_0x0608
        L_0x0606:
            r15 = 0
            goto L_0x0609
        L_0x0608:
            r15 = 1
        L_0x0609:
            r9.append(r15)
            java.lang.String r10 = ", nickName:"
            r9.append(r10)
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r0.f134919d
            if (r10 == 0) goto L_0x0618
            java.lang.String r10 = r10.nickname
            goto L_0x0619
        L_0x0618:
            r10 = 0
        L_0x0619:
            r9.append(r10)
            java.lang.String r10 = ",authIconType:"
            r9.append(r10)
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r0.f134919d
            if (r10 == 0) goto L_0x0630
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r10 = r10.authInfo
            if (r10 == 0) goto L_0x0630
            int r10 = r10.authIconType
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x0631
        L_0x0630:
            r10 = 0
        L_0x0631:
            r9.append(r10)
            java.lang.String r10 = ",roleType:"
            r9.append(r10)
            int r10 = r0.f134926n
            r9.append(r10)
            java.lang.String r10 = ",disableComment:"
            r9.append(r10)
            int r10 = r0.f134921f
            r9.append(r10)
            java.lang.String r10 = ", extInfo is empty:"
            r9.append(r10)
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r0.f134919d
            if (r10 == 0) goto L_0x0654
            te3.ii0 r10 = r10.extInfo
            goto L_0x0655
        L_0x0654:
            r10 = 0
        L_0x0655:
            if (r10 != 0) goto L_0x0659
            r15 = 1
            goto L_0x065a
        L_0x0659:
            r15 = 0
        L_0x065a:
            r9.append(r15)
            java.lang.String r10 = ",signature is empty:"
            r9.append(r10)
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r0.f134919d
            if (r10 == 0) goto L_0x0669
            java.lang.String r10 = r10.signature
            goto L_0x066a
        L_0x0669:
            r10 = 0
        L_0x066a:
            if (r10 != 0) goto L_0x066e
            r15 = 1
            goto L_0x066f
        L_0x066e:
            r15 = 0
        L_0x066f:
            r9.append(r15)
            java.lang.String r6 = ",reward:"
            r9.append(r6)
            int r0 = r0.f134922g
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r8.append(r0)
            java.lang.String r0 = ",sourceType:"
            r8.append(r0)
            r8.append(r5)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            boolean r0 = r1.f15403W
            if (r0 != 0) goto L_0x0699
            r26.mo3431p()
        L_0x0699:
            r0 = 3
            if (r4 != r0) goto L_0x06d4
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r2 = 3736(0xe98, float:5.235E-42)
            r0.mo123455a(r2, r1)
            di3.d r0 = di3.C86312j.m106911c(r3)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r3 = r0
            ht1.t1 r3 = (ht1.C60200t1) r3
            te3.hx0 r0 = r1.f15413r
            if (r0 == 0) goto L_0x06bf
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x06bf
            java.lang.String r0 = r0.username
            if (r0 != 0) goto L_0x06c1
        L_0x06bf:
            java.lang.String r0 = ""
        L_0x06c1:
            r4 = r0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 872(0x368, float:1.222E-42)
            r17 = 0
            ht1.C60200t1.C60201a.m70363a(r3, r4, r5, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17)
        L_0x06d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget.mo3423A(te3.hx0, int, te3.hj1, boolean, java.lang.String):void");
    }

    /* renamed from: C */
    public final void mo3424C(Button button, boolean z) {
        button.setVisibility(0);
        Object tag = button.getTag();
        if (C87412m.m108589b(tag, 1)) {
            button.setText(this.f28306d.getString(C0966R.string.drf));
            if (z) {
                button.setBackground(this.f28306d.getDrawable(C0966R.C0969drawable.a0l));
                button.setTextColor(this.f28306d.getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            }
            button.setOnClickListener(new C3241a(this));
        } else if (C87412m.m108589b(tag, 2)) {
            button.setText(this.f28306d.getString(C0966R.string.d4s));
            if (z) {
                button.setBackground(this.f28306d.getDrawable(C0966R.C0969drawable.b8u));
                button.setTextColor(this.f28306d.getResources().getColor(C0966R.color.f2975b6));
            }
            button.setOnClickListener(new C3242b(this));
        } else if (C87412m.m108589b(tag, 3)) {
            button.setText(this.f28306d.getString(C0966R.string.drg));
            if (z) {
                button.setBackground(this.f28306d.getDrawable(C0966R.C0969drawable.b8u));
                button.setTextColor(this.f28306d.getResources().getColor(C0966R.color.f2975b6));
            }
            button.setOnClickListener(new C3243c(this));
        } else if (C87412m.m108589b(tag, 4)) {
            button.setText(this.f28306d.getString(C0966R.string.drp));
            if (z) {
                button.setBackground(this.f28306d.getDrawable(C0966R.C0969drawable.b8u));
                button.setTextColor(this.f28306d.getResources().getColor(C0966R.color.f2975b6));
            }
            button.setOnClickListener(new C3244d(this));
        } else if (C87412m.m108589b(tag, 0)) {
            button.setVisibility(8);
        } else {
            button.setVisibility(8);
        }
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.ai6;
    }

    /* renamed from: h */
    public int mo3426h() {
        return 8;
    }

    /* renamed from: i */
    public View mo3427i(ViewGroup viewGroup, C11471u.C11473b bVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "uiMode");
        Context context = viewGroup.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return null;
        }
        C11471u uVar = C11471u.f33728a;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        C87412m.m108593f(layoutInflater, "it.layoutInflater");
        return uVar.mo11443b(C0966R.C0971layout.ai6, viewGroup, false, bVar, activity, layoutInflater);
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        RelativeLayout relativeLayout;
        C87412m.m108594g(view, "rootView");
        this.f15418w = (RelativeLayout) view.findViewById(C0966R.C0970id.ds6);
        this.f15419x = (TextView) view.findViewById(C0966R.C0970id.gro);
        this.f15420y = (ImageView) view.findViewById(C0966R.C0970id.a0j);
        this.f15421z = (TextView) view.findViewById(C0966R.C0970id.drv);
        this.f15382A = (LinearLayout) view.findViewById(C0966R.C0970id.drw);
        this.f15383B = (WeImageView) view.findViewById(C0966R.C0970id.e8l);
        this.f15384C = (TextView) view.findViewById(C0966R.C0970id.l1y);
        this.f15385D = (TextView) view.findViewById(C0966R.C0970id.l2d);
        this.f15386E = (ImageView) view.findViewById(C0966R.C0970id.ds7);
        this.f15387F = view.findViewById(C0966R.C0970id.drx);
        this.f15388G = (RelativeLayout) view.findViewById(C0966R.C0970id.dry);
        this.f15389H = (FrameLayout) view.findViewById(C0966R.C0970id.ds_);
        this.f15390I = (WeImageView) view.findViewById(C0966R.C0970id.a5l);
        this.f15391J = (TextView) view.findViewById(C0966R.C0970id.ds4);
        this.f15392K = view.findViewById(C0966R.C0970id.f358184ds2);
        this.f15393L = (TextView) view.findViewById(C0966R.C0970id.f358185ds3);
        WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.n95);
        this.f15394M = view.findViewById(C0966R.C0970id.dru);
        this.f15395N = (Button) view.findViewById(C0966R.C0970id.ds8);
        this.f15396P = (Button) view.findViewById(C0966R.C0970id.dsa);
        this.f15397Q = (Button) view.findViewById(C0966R.C0970id.dsb);
        this.f15398R = (ProgressBar) view.findViewById(C0966R.C0970id.g3j);
        this.f15399S = view.findViewById(C0966R.C0970id.f358182ds0);
        this.f15400T = (WeImageView) view.findViewById(C0966R.C0970id.drz);
        this.f15401U = (TextView) view.findViewById(C0966R.C0970id.f358183ds1);
        View view2 = this.f15387F;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        FrameLayout frameLayout = this.f15389H;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        View view3 = this.f15399S;
        if (view3 != null) {
            view3.setOnClickListener(this);
        }
        Context context = this.f28306d;
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f = (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        Button button = this.f15395N;
        boolean z = true;
        if (button != null) {
            button.setTextSize(1, f);
        }
        Button button2 = this.f15396P;
        if (button2 != null) {
            button2.setTextSize(1, f);
        }
        Button button3 = this.f15397Q;
        if (button3 != null) {
            button3.setTextSize(1, f);
        }
        Button button4 = this.f15395N;
        TextPaint textPaint = null;
        C85875k4.m106189j0(button4 != null ? button4.getPaint() : null, 0.8f);
        Button button5 = this.f15396P;
        C85875k4.m106189j0(button5 != null ? button5.getPaint() : null, 0.8f);
        Button button6 = this.f15397Q;
        C85875k4.m106189j0(button6 != null ? button6.getPaint() : null, 0.8f);
        TextView textView = this.f15401U;
        if (textView != null) {
            textPaint = textView.getPaint();
        }
        C85875k4.m106189j0(textPaint, 0.8f);
        RelativeLayout relativeLayout2 = this.f15388G;
        if (relativeLayout2 != null && (relativeLayout2.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int i = 0;
            if (this.f28306d.getResources().getConfiguration().orientation != 2) {
                z = false;
            }
            if (!z && (relativeLayout = this.f15388G) != null) {
                int paddingLeft = relativeLayout != null ? relativeLayout.getPaddingLeft() : 0;
                RelativeLayout relativeLayout3 = this.f15388G;
                int paddingTop = relativeLayout3 != null ? relativeLayout3.getPaddingTop() : 0;
                RelativeLayout relativeLayout4 = this.f15388G;
                if (relativeLayout4 != null) {
                    i = relativeLayout4.getPaddingRight();
                }
                relativeLayout.setPadding(paddingLeft, paddingTop, i, C75044y4.m89991c(relativeLayout2.getContext()));
            }
        }
        C75044y4.m89991c(this.f28306d);
        this.f15402V = new FinderLiveMemebrProfileWidget$initContentView$2(this, C40008f.f107254d);
    }

    /* renamed from: m */
    public void mo3429m() {
        this.f15403W = false;
        C32224a<C13598b0> aVar = this.f15409n;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onClick(View view) {
        Class cls = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CharSequence charSequence = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.drx) {
            mo9763a();
            if (C62042e.f176370a.mo87027N0()) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SEE_GIFT_LIST, String.valueOf(3), (String) null, 4, (Object) null);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ds_) {
            mo9763a();
            C32224a<C13598b0> aVar = this.f15411p;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358182ds0) {
            TextView textView = this.f15401U;
            if (textView != null) {
                charSequence = textView.getText();
            }
            int i = 0;
            if (C87412m.m108589b(charSequence, MMApplicationContext.getContext().getResources().getString(C0966R.string.e3s)) || C87412m.m108589b(charSequence, MMApplicationContext.getContext().getResources().getString(C0966R.string.e4_))) {
                if (C62042e.f176370a.mo87027N0()) {
                    ((C54108o) C86312j.m106911c(cls)).Zx0(C54067f0.C0059h0.CLICK_FOLLOW_USER);
                    C54108o oVar = (C54108o) C86312j.m106911c(cls);
                    int i2 = this.f15414s;
                    C49765hx0 hx02 = this.f15413r;
                    if (hx02 != null) {
                        i = hx02.f134926n;
                    }
                    oVar.Wx0(4, i2, i, mo3435t());
                }
                mo3434s(1);
            } else if (C87412m.m108589b(charSequence, MMApplicationContext.getContext().getResources().getString(C0966R.string.e3u))) {
                if (this.f15404X == null) {
                    C77407n nVar = new C77407n(this.f28306d, 1, true);
                    this.f15404X = nVar;
                    nVar.f225775k1 = true;
                }
                C77407n nVar2 = this.f15404X;
                if (nVar2 != null) {
                    nVar2.mo107570o(true);
                }
                C77407n nVar3 = this.f15404X;
                if (nVar3 != null) {
                    nVar3.f225792t1 = false;
                }
                if (nVar3 != null) {
                    nVar3.f225771i = new C9058l5(this);
                }
                if (nVar3 != null) {
                    nVar3.f225782p = new C9064m5(this);
                }
                if (nVar3 != null) {
                    nVar3.f225761d = new C9075n5(this);
                }
                if (nVar3 != null) {
                    nVar3.mo107573q();
                }
            } else if (C87412m.m108589b(charSequence, MMApplicationContext.getContext().getResources().getString(C0966R.string.e3v))) {
                mo3434s(3);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49765hx0 hx02;
        FinderContact finderContact;
        String str2 = this.f15407i;
        Log.m105924i(str2, "onSceneEnd errType:" + i + ", errCode:" + i2 + ", scene:" + yVar);
        if (yVar instanceof C16196b) {
            C16196b bVar = (C16196b) yVar;
            FinderContact P0 = bVar.mo10101P0();
            Context context = this.f28306d;
            FinderContact finderContact2 = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            boolean z = true;
            boolean z2 = activity != null && activity.isFinishing();
            C49765hx0 hx03 = this.f15413r;
            String str3 = (hx03 == null || (finderContact = hx03.f134919d) == null) ? null : finderContact.username;
            String str4 = this.f15407i;
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd,isOnlyFetchUserInfo:");
            sb.append(bVar.mo10103X0());
            sb.append(", cur liveContact username:");
            sb.append(str3);
            sb.append(", req username:");
            sb.append(bVar.mo10105c1());
            sb.append("，contact username:");
            sb.append(P0 != null ? P0.username : null);
            sb.append(",visibility:");
            sb.append(this.f15403W);
            sb.append(",isFinish:");
            sb.append(z2);
            Log.m105924i(str4, sb.toString());
            if (!(str3 == null || str3.length() == 0)) {
                z = false;
            }
            if (!z && bVar.mo10103X0() && C87412m.m108589b(bVar.mo10105c1(), str3)) {
                C86709a0.m107529k().f251779b.mo123470p(3736, this);
                if (z2 || !this.f15403W || (hx02 = this.f15413r) == null) {
                    mo9763a();
                    return;
                }
                if (hx02 != null) {
                    hx02.f134919d = P0;
                }
                if (hx02 != null) {
                    finderContact2 = hx02.f134919d;
                }
                if (finderContact2 != null) {
                    finderContact2.friend_follow_count = bVar.mo10104Y0();
                }
                C49765hx0 hx04 = this.f15413r;
                if (hx04 != null) {
                    mo3439x(hx04);
                    mo3438w(hx04);
                    mo3441z(hx04);
                }
            }
        }
    }

    /* renamed from: p */
    public void mo3431p() {
        super.mo3431p();
        this.f15403W = true;
        C32224a<C13598b0> aVar = this.f15408j;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: q */
    public final void mo3432q() {
        Log.m105924i(this.f15407i, "activate");
        IListener<FollowUserEvent> iListener = this.f15402V;
        if (iListener != null) {
            iListener.alive();
        }
    }

    /* renamed from: r */
    public final void mo3433r() {
        Log.m105924i(this.f15407i, "deActivate");
        IListener<FollowUserEvent> iListener = this.f15402V;
        if (iListener != null) {
            iListener.dead();
        }
        C86709a0.m107529k().f251779b.mo123470p(3736, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.f134919d;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3434s(int r17) {
        /*
            r16 = this;
            r0 = r16
            te3.hx0 r1 = r0.f15413r
            r2 = 0
            if (r1 == 0) goto L_0x000f
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f134919d
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r1.username
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r2
        L_0x0010:
            if (r5 == 0) goto L_0x0064
            te3.hj1 r1 = r0.f15415t
            if (r1 != 0) goto L_0x002a
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r3 = r0.f28306d
            bl3.r$a r1 = r1.mo62443b(r3)
            java.lang.Class<ht1.g4> r3 = ht1.C60172g4.class
            bl3.c r1 = r1.mo62447c(r3)
            ht1.g4 r1 = (ht1.C60172g4) r1
            te3.hj1 r1 = r1.mo12861q3()
        L_0x002a:
            r4 = r1
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            r3 = r1
            tf0.p1 r3 = (tf0.C64916p1) r3
            r7 = 0
            r9 = 0
            r10 = 0
            qj1.c r1 = r0.f15406h
            if (r1 == 0) goto L_0x0059
            cj1.n5 r1 = r1.mo14476D0()
            if (r1 == 0) goto L_0x0059
            qj1.c r2 = r0.f15406h
            java.lang.Class<cl1.u> r6 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r6)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r11 = r2.f182392d
            te3.h71 r2 = r1.mo75732e0(r11)
        L_0x0059:
            r11 = r2
            r12 = 0
            r13 = 0
            r14 = 424(0x1a8, float:5.94E-43)
            r15 = 0
            r6 = r17
            tf0.C64916p1.C64917a.m76440g(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget.mo3434s(int):void");
    }

    /* renamed from: t */
    public final String mo3435t() {
        String str = this.f15405Y;
        return str == null ? "" : str;
    }

    /* renamed from: u */
    public final void mo3436u(C49765hx0 hx02) {
        C49765hx0 hx03 = hx02;
        Class cls = C64916p1.class;
        if (C62042e.f176370a.mo87027N0() || mo3437v()) {
            String str = null;
            Integer valueOf = hx03 != null ? Integer.valueOf(hx03.f134926n) : null;
            if (valueOf != null && valueOf.intValue() == 3) {
                FinderContact finderContact = hx03.f134919d;
                if (finderContact != null) {
                    str = finderContact.username;
                }
                if (str == null || str.length() == 0) {
                    Log.m105924i(this.f15407i, "handleFollowBtn: finderUsername is null or empty");
                    View view = this.f15399S;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                View view3 = this.f15399S;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (((C64916p1) C86312j.m106911c(cls)).mo76650AV(str)) {
                    String str2 = this.f15407i;
                    Log.m105924i(str2, "handleFollowBtn have follow user:" + str);
                    WeImageView weImageView = this.f15400T;
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    TextView textView = this.f15401U;
                    if (textView != null) {
                        textView.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.e3u));
                    }
                } else if (((C64916p1) C86312j.m106911c(cls)).mo76689aP(str)) {
                    String str3 = this.f15407i;
                    Log.m105924i(str3, "handleFollowBtn waiting user:" + str + " to allow");
                    WeImageView weImageView2 = this.f15400T;
                    if (weImageView2 != null) {
                        weImageView2.setVisibility(8);
                    }
                    TextView textView2 = this.f15401U;
                    if (textView2 != null) {
                        textView2.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.e3v));
                    }
                } else {
                    WeImageView weImageView3 = this.f15400T;
                    if (weImageView3 != null) {
                        weImageView3.setVisibility(0);
                    }
                    String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e3s);
                    C87412m.m108593f(string, "getContext().resources.g…nder_live_profile_follow)");
                    if (this.f15416u) {
                        string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e4_);
                        C87412m.m108593f(string, "getContext().resources.g…ofile_req_follow_privacy)");
                        WeImageView weImageView4 = this.f15400T;
                        if (weImageView4 != null) {
                            weImageView4.setVisibility(8);
                        }
                    }
                    TextView textView3 = this.f15401U;
                    if (textView3 != null) {
                        textView3.setText(string);
                    }
                }
            } else {
                String str4 = this.f15407i;
                Log.m105924i(str4, "handleFollowBtn: roleType not finder:" + valueOf);
                View view5 = this.f15399S;
                if (view5 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            Log.m105924i(this.f15407i, "handleFollowBtn: not anchor");
            View view7 = this.f15399S;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "handleFollowBtn", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: v */
    public final boolean mo3437v() {
        C62660c cVar = this.f15406h;
        if (cVar != null) {
            return ((C54991o) cVar.mo87696x0(C54991o.class)).f154190D;
        }
        return false;
    }

    /* renamed from: w */
    public final void mo3438w(C49765hx0 hx02) {
        TextView textView;
        String str;
        if (hx02.f134926n == 2) {
            LinearLayout linearLayout = this.f15382A;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ImageView imageView = this.f15420y;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView2 = this.f15421z;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        FinderContact finderContact = hx02.f134919d;
        C13598b0 b0Var = null;
        FinderAuthInfo finderAuthInfo = finderContact != null ? finderContact.authInfo : null;
        int i = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
        if (i > 0) {
            LinearLayout linearLayout2 = this.f15382A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            ImageView imageView2 = this.f15420y;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.f15420y;
            if (imageView3 != null) {
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C64916p1 p1Var = (C64916p1) c;
                FinderContact finderContact2 = hx02.f134919d;
                C64916p1.C64917a.m76444k(p1Var, imageView3, finderContact2 != null ? finderContact2.authInfo : null, 0, (C64284cg) null, 8, (Object) null);
            }
            if (i == 1 || i == 2) {
                if (!(finderAuthInfo == null || (str = finderAuthInfo.authProfession) == null)) {
                    TextView textView3 = this.f15421z;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    TextView textView4 = this.f15421z;
                    if (textView4 != null) {
                        textView4.setText(this.f28306d.getResources().getString(C0966R.string.d47, new Object[]{str}));
                    }
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null && (textView = this.f15421z) != null) {
                    textView.setVisibility(8);
                }
            } else if (i != 100) {
                TextView textView5 = this.f15421z;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
            } else {
                TextView textView6 = this.f15421z;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                TextView textView7 = this.f15421z;
                if (textView7 != null) {
                    textView7.setText(C0966R.string.dco);
                }
            }
        } else {
            LinearLayout linearLayout3 = this.f15382A;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            ImageView imageView4 = this.f15420y;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            TextView textView8 = this.f15421z;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
        }
    }

    /* renamed from: x */
    public final void mo3439x(C49765hx0 hx02) {
        C49765hx0 hx03 = hx02;
        int i = hx03.f134926n;
        if (i == 0 || i == 1 || i == 2) {
            View view = this.f15392K;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "setFollows", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "setFollows", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        FinderContact finderContact = hx03.f134919d;
        int i2 = finderContact != null ? finderContact.friend_follow_count : 0;
        if (i2 > 0) {
            View view3 = this.f15392K;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "setFollows", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "setFollows", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e3t, new Object[]{Integer.valueOf(i2)});
            C87412m.m108593f(string, "getContext().resources.g…wed_fans_desc, followCnt)");
            TextView textView = this.f15393L;
            if (textView != null) {
                textView.setText(string);
                return;
            }
            return;
        }
        View view4 = this.f15392K;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(4);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "setFollows", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget", "setFollows", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        if ((r2 != null ? ((cl1.C54991o) r2.mo87696x0(r0)).mo76001f4() : false) != false) goto L_0x007b;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3440y() {
        /*
            r7 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r2 = r1.mo87027N0()
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L_0x0010
            boolean r2 = r7.f15417v
            if (r2 == 0) goto L_0x0031
        L_0x0010:
            boolean r2 = r7.mo3437v()
            if (r2 != 0) goto L_0x0031
            qj1.c r2 = r7.f15406h
            if (r2 == 0) goto L_0x0025
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r0)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo76001f4()
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 != 0) goto L_0x0031
            android.widget.FrameLayout r0 = r7.f15389H
            if (r0 != 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r0.setVisibility(r4)
        L_0x0030:
            return
        L_0x0031:
            java.lang.String r2 = r7.f15405Y
            if (r2 != 0) goto L_0x003b
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
        L_0x003b:
            te3.hx0 r5 = r7.f15413r
            r6 = 0
            if (r5 == 0) goto L_0x0047
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f134919d
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = r5.username
            goto L_0x0048
        L_0x0047:
            r5 = r6
        L_0x0048:
            boolean r2 = gy3.C87412m.m108589b(r5, r2)
            if (r2 != 0) goto L_0x00aa
            te3.hx0 r2 = r7.f15413r
            if (r2 == 0) goto L_0x0058
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
            if (r2 == 0) goto L_0x0058
            java.lang.String r6 = r2.username
        L_0x0058:
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x0063
            goto L_0x00aa
        L_0x0063:
            boolean r2 = r7.mo3437v()
            if (r2 != 0) goto L_0x007b
            qj1.c r2 = r7.f15406h
            if (r2 == 0) goto L_0x0078
            androidx.lifecycle.i0 r0 = r2.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo76001f4()
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            if (r0 == 0) goto L_0x008c
        L_0x007b:
            te3.hx0 r0 = r7.f15413r
            boolean r0 = r1.mo87037R0(r0)
            if (r0 == 0) goto L_0x008c
            android.widget.FrameLayout r0 = r7.f15389H
            if (r0 != 0) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            r0.setVisibility(r4)
        L_0x008b:
            return
        L_0x008c:
            int r0 = r7.f15414s
            r1 = 1
            if (r0 == r1) goto L_0x00a1
            r1 = 2
            if (r0 == r1) goto L_0x00a1
            r1 = 3
            if (r0 != r1) goto L_0x0098
            goto L_0x00a1
        L_0x0098:
            android.widget.FrameLayout r0 = r7.f15389H
            if (r0 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            r0.setVisibility(r4)
            goto L_0x00a9
        L_0x00a1:
            android.widget.FrameLayout r0 = r7.f15389H
            if (r0 != 0) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            r0.setVisibility(r3)
        L_0x00a9:
            return
        L_0x00aa:
            android.widget.FrameLayout r0 = r7.f15389H
            if (r0 != 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            r0.setVisibility(r4)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget.mo3440y():void");
    }

    /* renamed from: z */
    public final void mo3441z(C49765hx0 hx02) {
        int i = hx02.f134926n;
        if (i != 3 && !C62042e.f176370a.mo87027N0() && !mo3437v()) {
            TextView textView = this.f15385D;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (i == 2) {
            TextView textView2 = this.f15385D;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            FinderContact finderContact = hx02.f134919d;
            String str = finderContact != null ? finderContact.signature : null;
            if (Util.isNullOrNil(str)) {
                TextView textView3 = this.f15385D;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    return;
                }
                return;
            }
            if (i == 3) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e3r, new Object[]{str});
            }
            TextView textView4 = this.f15385D;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            TextView textView5 = this.f15385D;
            if (textView5 != null) {
                textView5.setText(str);
            }
        }
    }
}
