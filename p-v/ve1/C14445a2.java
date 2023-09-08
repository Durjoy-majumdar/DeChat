package ve1;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0790x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.C4189u7;
import com.tencent.p014mm.plugin.finder.view.C4190v;
import com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner;
import com.tencent.p014mm.plugin.finder.view.FinderImageBanner;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.view.MediaBannerIndicator;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import o40.C61926c;
import rs1.C48086u6;
import rs1.C63672y9;
import rx3.C13598b0;
import vq1.C65866w;

/* renamed from: ve1.a2 */
public class C14445a2 extends FinderFeedFullConvert<C0790x> {

    /* renamed from: ve1.a2$a */
    public static final class C14446a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderBaseMediaBanner<View> f40062d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40063e;

        /* renamed from: f */
        public final /* synthetic */ View f40064f;

        /* renamed from: g */
        public final /* synthetic */ ViewGroup f40065g;

        /* renamed from: h */
        public final /* synthetic */ View f40066h;

        public C14446a(C60905o oVar, FinderBaseMediaBanner<View> finderBaseMediaBanner, View view, ViewGroup viewGroup, View view2) {
            this.f40063e = oVar;
            this.f40062d = finderBaseMediaBanner;
            this.f40064f = view;
            this.f40065g = viewGroup;
            this.f40066h = view2;
        }

        public final void run() {
            ViewGroup viewGroup = this.f40065g;
            View view = this.f40066h;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    if (!(childAt.getAlpha() == 0.0f)) {
                        view = childAt;
                        break;
                    }
                }
                i++;
            }
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f40063e.f44854d.getLocationInWindow(iArr);
            this.f40062d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - iArr[0];
            iArr2[1] = iArr2[1] - iArr[1];
            view.getLocationInWindow(iArr3);
            iArr3[0] = iArr3[0] - iArr[0];
            iArr3[1] = iArr3[1] - iArr[1];
            ViewGroup.LayoutParams layoutParams = this.f40064f.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i2 = layoutParams2.topMargin;
            int height = iArr2[1] + this.f40062d.getHeight() + this.f40064f.getHeight();
            int i3 = iArr3[1];
            if (height >= i3) {
                layoutParams2.topMargin = i3 - this.f40064f.getHeight();
            } else {
                layoutParams2.topMargin = iArr2[1] + this.f40062d.getHeight();
            }
            if (layoutParams2.topMargin != i2) {
                this.f40064f.requestLayout();
            }
        }
    }

    /* renamed from: ve1.a2$c */
    public static final class C14447c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14445a2 f40067d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40068e;

        public C14447c(C14445a2 a2Var, C60905o oVar) {
            this.f40067d = a2Var;
            this.f40068e = oVar;
        }

        public final void run() {
            this.f40067d.mo2303l(this.f40068e);
        }
    }

    /* renamed from: ve1.a2$d */
    public static final class C14448d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40069d;

        /* renamed from: e */
        public final /* synthetic */ View f40070e;

        /* renamed from: f */
        public final /* synthetic */ View f40071f;

        /* renamed from: g */
        public final /* synthetic */ View f40072g;

        public C14448d(C60905o oVar, View view, View view2, View view3) {
            this.f40069d = oVar;
            this.f40070e = view;
            this.f40071f = view2;
            this.f40072g = view3;
        }

        public final void run() {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f40069d.f44854d.getLocationInWindow(iArr);
            this.f40070e.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - iArr[0];
            iArr2[1] = iArr2[1] - iArr[1];
            ViewGroup.LayoutParams layoutParams = this.f40070e.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.LayoutParams layoutParams2 = this.f40071f.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = ((FrameLayout.LayoutParams) layoutParams).topMargin + ((this.f40070e.getHeight() - this.f40072g.getHeight()) / 2);
            this.f40071f.requestLayout();
        }
    }

    /* renamed from: ve1.a2$e */
    public static final class C14449e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14449e(C60905o oVar) {
            super(0);
            this.f40073d = oVar;
        }

        public Object invoke() {
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) this.f40073d.mo85812D(C0966R.C0970id.eh4);
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.f17530y0 = true;
            }
            FinderFullSeekBarLayout finderFullSeekBarLayout2 = (FinderFullSeekBarLayout) this.f40073d.mo85812D(C0966R.C0970id.eh4);
            if (finderFullSeekBarLayout2 != null) {
                FinderFullSeekBarLayout.m4082G(finderFullSeekBarLayout2, (String) null, false, 3, (Object) null);
            }
            FinderFullSeekBarLayout finderFullSeekBarLayout3 = (FinderFullSeekBarLayout) this.f40073d.mo85812D(C0966R.C0970id.eh4);
            if (finderFullSeekBarLayout3 != null) {
                finderFullSeekBarLayout3.f17530y0 = false;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.a2$g */
    public static final class C14450g extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderImageBanner f40074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14450g(FinderImageBanner finderImageBanner) {
            super(0);
            this.f40074d = finderImageBanner;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f40074d.f17814w);
        }
    }

    /* renamed from: ve1.a2$h */
    public static final class C14451h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderImgFeedMusicTag f40075d;

        /* renamed from: e */
        public final /* synthetic */ FinderImageBanner f40076e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14451h(FinderImgFeedMusicTag finderImgFeedMusicTag, FinderImageBanner finderImageBanner) {
            super(0);
            this.f40075d = finderImgFeedMusicTag;
            this.f40076e = finderImageBanner;
        }

        public Object invoke() {
            this.f40075d.setTag(C0966R.C0970id.e3s, Boolean.TRUE);
            this.f40075d.mo78357e();
            this.f40076e.setAutoPlay(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.a2$i */
    public static final class C14452i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderImageBanner f40077d;

        /* renamed from: e */
        public final /* synthetic */ FinderFullSeekBarLayout f40078e;

        /* renamed from: f */
        public final /* synthetic */ FinderImgFeedMusicTag f40079f;

        /* renamed from: g */
        public final /* synthetic */ FinderFullSeekBarLayout f40080g;

        /* renamed from: h */
        public final /* synthetic */ C0790x f40081h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14452i(FinderImageBanner finderImageBanner, FinderFullSeekBarLayout finderFullSeekBarLayout, FinderImgFeedMusicTag finderImgFeedMusicTag, FinderFullSeekBarLayout finderFullSeekBarLayout2, C0790x xVar) {
            super(0);
            this.f40077d = finderImageBanner;
            this.f40078e = finderFullSeekBarLayout;
            this.f40079f = finderImgFeedMusicTag;
            this.f40080g = finderFullSeekBarLayout2;
            this.f40081h = xVar;
        }

        public Object invoke() {
            boolean z = this.f40077d.f17814w || this.f40078e.f17530y0;
            if (z) {
                this.f40079f.mo78356d();
                this.f40077d.setAutoPlay(false);
                this.f40079f.setTag(C0966R.C0970id.e3s, Boolean.FALSE);
                boolean z2 = this.f40078e.f17530y0;
            } else {
                this.f40079f.setTag(C0966R.C0970id.e3s, Boolean.TRUE);
                this.f40079f.mo78357e();
                this.f40077d.setAutoPlay(true);
            }
            this.f40080g.setPlayingStatus(!z);
            this.f40081h.f1846d = z;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ve1.a2$j */
    public static final class C14453j extends C87413o implements C32227p<Boolean, FinderVideoLayout.C56521b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14453j(C60905o oVar) {
            super(2);
            this.f40082d = oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            FinderVideoLayout.C56521b bVar = (FinderVideoLayout.C56521b) obj2;
            if (!((Boolean) obj).booleanValue()) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f40082d.f173499A;
                C87412m.m108593f(context, "holder.context");
                ((C48086u6) rVar.mo62443b(context).mo75002a(C48086u6.class)).mo72830c3("ImageConvert");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.a2$f */
    public static final class C14454f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40083d;

        /* renamed from: e */
        public final /* synthetic */ C0790x f40084e;

        /* renamed from: f */
        public final /* synthetic */ FinderFullSeekBarLayout f40085f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14454f(C60905o oVar, C0790x xVar, FinderFullSeekBarLayout finderFullSeekBarLayout) {
            super(1);
            this.f40083d = oVar;
            this.f40084e = xVar;
            this.f40085f = finderFullSeekBarLayout;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C39818r rVar = C39818r.f106831a;
            Context context = this.f40083d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C63672y9 y9Var = (C63672y9) rVar.mo62443b(context).mo75002a(C63672y9.class);
            long j = this.f40084e.mo3513o().field_id;
            boolean z = !booleanValue;
            FinderFullSeekBarLayout finderFullSeekBarLayout = this.f40085f;
            C87412m.m108593f(finderFullSeekBarLayout, "fullSeekBarLayout");
            y9Var.getClass();
            y9Var.mo88482e3("playImage." + z + " feedId=" + C61926c.m72691p(j));
            if (y9Var.f180506i > 0) {
                if (!z) {
                    y9Var.f180510p = j;
                    y9Var.f180501d = 1;
                    y9Var.f180513s.startTimer(1000);
                    y9Var.f180514t = finderFullSeekBarLayout;
                    y9Var.f180511q = false;
                    if (y9Var.f180512r) {
                        y9Var.mo88481d3(y9Var.f180509o == j ? 1 : 0, true, j, 0, 0, false);
                    }
                } else {
                    if (!y9Var.f180511q) {
                        y9Var.mo88481d3(0, true, j, 0, 0, true);
                        y9Var.f180509o = -1;
                        y9Var.f180514t = null;
                        y9Var.f180513s.stopTimer();
                    }
                    y9Var.f180512r = true;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14445a2(kf1.C10008v1 r2, boolean r3, int r4, boolean r5, int r6, gy3.C8480h r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L_0x0006
            r3 = 0
        L_0x0006:
            r7 = r6 & 4
            if (r7 == 0) goto L_0x000b
            r4 = 0
        L_0x000b:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0010
            r5 = 0
        L_0x0010:
            java.lang.String r6 = "contract"
            gy3.C87412m.m108594g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14445a2.<init>(kf1.v1, boolean, int, boolean, int, gy3.h):void");
    }

    /* renamed from: O */
    public void mo2276O(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        super.mo2276O(oVar);
        RecyclerView recyclerView = this.f12554A;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.C16631z P0 = recyclerView.mo17031P0(childAt);
                    C60905o oVar2 = P0 instanceof C60905o ? (C60905o) P0 : null;
                    if (oVar2 != null && oVar2.f44859i == 2) {
                        mo13719Q0(oVar2);
                    }
                }
            }
        }
    }

    /* renamed from: Q0 */
    public final void mo13719Q0(C60905o oVar) {
        ViewGroup viewGroup;
        View D = oVar.mo85812D(C0966R.C0970id.edb);
        if (D != null && (viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.d97)) != null) {
            FinderBaseMediaBanner finderBaseMediaBanner = (FinderBaseMediaBanner) oVar.mo85812D(C0966R.C0970id.ol9);
            View D2 = oVar.mo85812D(C0966R.C0970id.f3j);
            if (D2 != null) {
                D2.post(new C14446a(oVar, finderBaseMediaBanner, D2, viewGroup, D));
            }
        }
    }

    /* renamed from: R */
    public void mo2281R(C60905o oVar, View view, MotionEvent motionEvent, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(motionEvent, "e");
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        Rect rect = new Rect();
        oVar.mo85812D(C0966R.C0970id.f3j).getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && baseFinderFeed.mo3513o().isPostFinish() && !baseFinderFeed.mo3479M()) {
            C65866w.C14968a aVar = C65866w.f189406g;
            if (!((Boolean) C65866w.f189407h.mo89908g(baseFinderFeed.mo3513o().getFeedObject()).f38555d).booleanValue()) {
                C76912y0.makeText(view.getContext(), (CharSequence) view.getContext().getString(C0966R.string.d9e), 0).show();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0129, code lost:
        if ((r1.length() == 0) == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012d, code lost:
        if (r3 == false) goto L_0x012f;
     */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2324w(jq3.C60905o r21, cm1.C0790x r22, int r23, int r24) {
        /*
            r20 = this;
            r0 = r21
            r6 = r22
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "item"
            gy3.C87412m.m108594g(r6, r1)
            r1 = 2131304485(0x7f092025, float:1.8227114E38)
            android.view.View r1 = r0.mo85812D(r1)
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r1 = (com.tencent.p014mm.plugin.finder.view.FinderMediaLayout) r1
            com.tencent.mm.plugin.finder.view.m r2 = new com.tencent.mm.plugin.finder.view.m
            r2.<init>()
            r3 = 1
            r2.f18243b = r3
            r4 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r5 = r0.mo85812D(r4)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r5 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r5
            r2.f18245d = r5
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r1.mo4635a(r6, r2)
            com.tencent.mm.plugin.finder.view.FinderImageBanner r2 = r1.getImageBanner()
            sr1.e r7 = r2.getImageAdapter()
            android.view.View r1 = r0.mo85812D(r4)
            r5 = r1
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r5 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r5
            boolean r1 = r6.f1846d
            r8 = 0
            r9 = 0
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = "fullVideoSeekBar"
            gy3.C87412m.m108593f(r5, r1)
            r1 = 3
            gr1.C59667n2.C8415a.m8377a(r5, r9, r8, r1, r9)
            goto L_0x0053
        L_0x004e:
            java.lang.String r1 = "Finder.FeedFullImageConvert"
            r5.mo4259i(r1)
        L_0x0053:
            r1 = 2131297745(0x7f0905d1, float:1.8213444E38)
            android.view.View r1 = r0.mo85812D(r1)
            r10 = r1
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r10 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r10
            te3.td1 r1 = r22.mo3524x()
            r11 = 2131304529(0x7f092051, float:1.8227203E38)
            if (r1 == 0) goto L_0x0080
            r10.mo78354a(r1)
            java.lang.Class<ht1.v4> r1 = ht1.C8808v4.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.v4 r1 = (ht1.C8808v4) r1
            boolean r1 = r1.mo9635e()
            r1 = r1 ^ r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10.setTag(r11, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0081
        L_0x0080:
            r1 = r9
        L_0x0081:
            if (r1 != 0) goto L_0x008b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10.setTag(r11, r1)
            r10.mo78358f()
        L_0x008b:
            ve1.a2$e r1 = new ve1.a2$e
            r1.<init>(r0)
            r10.setOnHeadsetStateChangePauseMusicTag(r1)
            android.view.View r1 = r0.mo85812D(r4)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
            ve1.a2$f r11 = new ve1.a2$f
            r11.<init>(r0, r6, r1)
            r10.setOnPlayCallback(r11)
            r1 = 2131304750(0x7f09212e, float:1.8227651E38)
            android.view.View r1 = r0.mo85812D(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x00b4
            r11 = 2131310759(0x7f0938a7, float:1.823984E38)
            android.view.View r1 = r1.findViewById(r11)
            goto L_0x00b5
        L_0x00b4:
            r1 = r9
        L_0x00b5:
            if (r1 != 0) goto L_0x00b8
            goto L_0x0102
        L_0x00b8:
            r11 = 4
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert"
            java.lang.String r14 = "convertMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;II)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r1
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r9 = r9.mo10231a(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r1.setVisibility(r9)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert"
            java.lang.String r13 = "convertMedia"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;II)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0102:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r22.mo3513o()
            java.util.LinkedList r1 = r1.getMediaList()
            int r1 = r1.size()
            if (r1 > r3) goto L_0x013c
            te3.td1 r1 = r22.mo3524x()
            if (r1 == 0) goto L_0x012f
            te3.td1 r1 = r22.mo3524x()
            if (r1 == 0) goto L_0x012c
            java.lang.String r1 = r1.f185539i
            if (r1 == 0) goto L_0x012c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0128
            r1 = 1
            goto L_0x0129
        L_0x0128:
            r1 = 0
        L_0x0129:
            if (r1 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r3 = 0
        L_0x012d:
            if (r3 != 0) goto L_0x013c
        L_0x012f:
            android.view.View r1 = r0.mo85812D(r4)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
            if (r1 == 0) goto L_0x0150
            r3 = 0
            r1.setFloatPlayIcon(r3)
            goto L_0x0150
        L_0x013c:
            android.view.View r1 = r0.mo85812D(r4)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
            if (r1 == 0) goto L_0x0150
            r3 = 2131304997(0x7f092225, float:1.8228152E38)
            android.view.View r3 = r0.mo85812D(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r1.setFloatPlayIcon(r3)
        L_0x0150:
            android.view.View r1 = r0.mo85812D(r4)
            r8 = r1
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r8 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r8
            ve1.a2$g r1 = new ve1.a2$g
            r1.<init>(r2)
            r8.setPlayingCallback(r1)
            ve1.a2$h r1 = new ve1.a2$h
            r1.<init>(r10, r2)
            r8.setOnResumePlayListener(r1)
            ve1.a2$i r9 = new ve1.a2$i
            r1 = r9
            r3 = r8
            r4 = r10
            r6 = r22
            r1.<init>(r2, r3, r4, r5, r6)
            r8.setOnPauseClickListener(r9)
            r20.mo13719Q0(r21)
            r20.mo2303l(r21)
            ve1.a2$j r1 = new ve1.a2$j
            r1.<init>(r0)
            r7.f38894h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14445a2.mo2324w(jq3.o, cm1.x, int, int):void");
    }

    /* renamed from: S0 */
    public void mo2304l0(C60905o oVar, C0790x xVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(xVar, "item");
        super.mo2304l0(oVar, xVar);
        mo13719Q0(oVar);
    }

    /* renamed from: T */
    public void mo2283T(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        C0790x xVar = (C0790x) baseFinderFeed;
        C87412m.m108594g(xVar, "item");
        C87412m.m108594g(oVar, "holder");
        super.mo2283T(xVar, oVar);
        mo13719Q0(oVar);
    }

    /* renamed from: T0 */
    public void mo2255D0(C0790x xVar, C60905o oVar, boolean z, int i) {
        C87412m.m108594g(xVar, "item");
        C87412m.m108594g(oVar, "holder");
        super.mo2255D0(xVar, oVar, z, i);
        mo13719Q0(oVar);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6249o;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        C4189u7 u7Var = C4189u7.IMAGE;
        C4190v vVar = new C4190v();
        vVar.f18455c = this.f12564e.mo2571D1();
        View D = oVar.mo85812D(C0966R.C0970id.f3j);
        C87412m.m108593f(D, "holder.getView(R.id.image_banner_indicator)");
        vVar.f18454b = (MediaBannerIndicator) D;
        vVar.f18453a = recyclerView;
        C13598b0 b0Var = C13598b0.f38549a;
        ((FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_)).mo4636b(u7Var, vVar);
    }

    /* renamed from: k0 */
    public void mo2302k0(C60905o oVar, BaseFinderFeed baseFinderFeed, Boolean bool) {
        C0790x xVar = (C0790x) baseFinderFeed;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(xVar, "item");
        super.mo2302k0(oVar, xVar, bool);
        mo13719Q0(oVar);
    }

    /* renamed from: l */
    public void mo2303l(C60905o oVar) {
        View findViewById;
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.e6u);
        if (D != null) {
            Rect rect = new Rect();
            D.getGlobalVisibleRect(rect);
            View D2 = oVar.mo85812D(C0966R.C0970id.f3j);
            if (D2 != null && (findViewById = D.findViewById(C0966R.C0970id.a2r)) != null) {
                if (D.getWidth() <= rect.width() || rect.width() <= 0) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = D2;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D2.post(new C14448d(oVar, D2, D, findViewById));
                    return;
                }
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view2 = D2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.post(new C14447c(this, oVar));
            }
        }
    }
}
