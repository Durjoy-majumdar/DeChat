package oi1;

import al1.C54130j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ni1.C61753b;
import o40.C61926c;
import ok1.C62042e;
import qj1.C62660c;
import rx3.C13598b0;
import si1.C63902g;
import wk1.C15484y;

/* renamed from: oi1.c */
public abstract class C62031c extends C63902g implements View.OnClickListener {

    /* renamed from: q */
    public FrameLayout f176341q;

    /* renamed from: r */
    public WeImageView f176342r;

    /* renamed from: s */
    public ViewGroup f176343s;

    /* renamed from: t */
    public ViewGroup f176344t;

    /* renamed from: u */
    public ImageView f176345u;

    /* renamed from: v */
    public TextView f176346v;

    /* renamed from: w */
    public TextView f176347w;

    /* renamed from: x */
    public TextView f176348x;

    /* renamed from: y */
    public ViewGroup f176349y;

    /* renamed from: oi1.c$a */
    public static final class C62032a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62031c f176350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62032a(C62031c cVar) {
            super(0);
            this.f176350d = cVar;
        }

        public Object invoke() {
            String tag = this.f176350d.getTAG();
            Log.m105924i(tag, "showContent bindMicUser:" + this.f176350d.getBindLinkMicUser() + " isAnchor:" + C62042e.f176370a.mo87027N0() + " bindMicUserIsSelf:" + this.f176350d.mo88679k());
            C54130j bindLinkMicUser = this.f176350d.getBindLinkMicUser();
            if (bindLinkMicUser != null) {
                C62031c cVar = this.f176350d;
                cVar.mo86639e(cVar.getFinderLiveVideoLinkBottomBarAvatar());
                cVar.mo86641g(cVar.getFinderLiveVideoLinkBottomBarName());
                if (!bindLinkMicUser.f152004h) {
                    cVar.mo86640f(cVar.getFinderLiveVideoLinkBottomBarUserLevel(), C15484y.SIZE_NORMAL);
                }
                cVar.mo86941l(bindLinkMicUser.f152010n, bindLinkMicUser.f152018v, false);
                C87412m.m108594g(cVar.getFinderLiveMicHeartText(), "heatText");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62031c(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar, 2);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
        mo86977t();
        addView(getRoot());
        getFinderLiveVideoLinkBottomBarAvatar().setOnClickListener(this);
        getFinderLiveVideoLinkBottomBarName().setOnClickListener(this);
        getRoot().setOnClickListener(this);
        getFinderLiveMicMuteIcon().setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo86901a() {
        Log.m105924i(getTAG(), "onGiftAnimationStart");
    }

    /* renamed from: b */
    public void mo86902b() {
        Log.m105924i(getTAG(), "onGiftAnimationEnd");
    }

    public final ViewGroup getFinderLiveLuckyMoneyBubbleUiRoot() {
        ViewGroup viewGroup = this.f176349y;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final TextView getFinderLiveMicHeartText() {
        TextView textView = this.f176347w;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveMicHeartText");
        throw null;
    }

    public final FrameLayout getFinderLiveMicMuteIcon() {
        FrameLayout frameLayout = this.f176341q;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("finderLiveMicMuteIcon");
        throw null;
    }

    public final WeImageView getFinderLiveMicMuteIconWe() {
        WeImageView weImageView = this.f176342r;
        if (weImageView != null) {
            return weImageView;
        }
        C87412m.m108603p("finderLiveMicMuteIconWe");
        throw null;
    }

    public final ViewGroup getFinderLiveMicNewNormalMicGiftItemLayout() {
        ViewGroup viewGroup = this.f176344t;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    public final ImageView getFinderLiveVideoLinkBottomBarAvatar() {
        ImageView imageView = this.f176345u;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("finderLiveVideoLinkBottomBarAvatar");
        throw null;
    }

    public final TextView getFinderLiveVideoLinkBottomBarName() {
        TextView textView = this.f176346v;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveVideoLinkBottomBarName");
        throw null;
    }

    public final TextView getFinderLiveVideoLinkBottomBarUserLevel() {
        TextView textView = this.f176348x;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveVideoLinkBottomBarUserLevel");
        throw null;
    }

    public ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    public ViewGroup getLuckyMoneyRootView() {
        Log.m105924i(getTAG(), "getLuckyMoneyRootView");
        return getFinderLiveLuckyMoneyBubbleUiRoot();
    }

    public final ViewGroup getRoot() {
        ViewGroup viewGroup = this.f176343s;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: j */
    public boolean mo86966j() {
        return true;
    }

    /* renamed from: l */
    public void mo86941l(boolean z, int i, boolean z2) {
        super.mo86941l(z, i, z2);
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (!(bindLinkMicUser != null && !bindLinkMicUser.f152004h) || (!mo88678i() && (!mo88679k() || !((C54991o) getBasePlugin().mo87696x0(C54991o.class)).f154274W2))) {
            getFinderLiveMicMuteIcon().setVisibility(8);
            getFinderLiveVideoLinkBottomBarUserLevel().setVisibility(0);
            return;
        }
        getFinderLiveMicMuteIcon().setVisibility(0);
        getFinderLiveVideoLinkBottomBarUserLevel().setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r26) {
        /*
            r25 = this;
            r6 = r25
            r7 = r26
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverVideoWidget"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r25
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r7 == 0) goto L_0x002c
            int r1 = r26.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x002d
        L_0x002c:
            r1 = r0
        L_0x002d:
            android.widget.ImageView r2 = r25.getFinderLiveVideoLinkBottomBarAvatar()
            int r2 = r2.getId()
            r3 = 1
            if (r1 != 0) goto L_0x0039
            goto L_0x0040
        L_0x0039:
            int r4 = r1.intValue()
            if (r4 != r2) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            android.widget.TextView r2 = r25.getFinderLiveVideoLinkBottomBarName()
            int r2 = r2.getId()
            if (r1 != 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            int r4 = r1.intValue()
            if (r4 != r2) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            if (r3 == 0) goto L_0x01f9
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.Class<dk1.g> r2 = dk1.C58312g.class
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            qj1.c r4 = r25.getBasePlugin()
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r3)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.f154287Z0
            r5 = 2
            if (r4 != r5) goto L_0x0075
            java.lang.String r0 = r25.getTAG()
            java.lang.String r1 = "onAvatarClick cur mode couldn't click!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0222
        L_0x0075:
            al1.j r4 = r25.getBindLinkMicUser()
            if (r4 == 0) goto L_0x0222
            boolean r5 = r4.f152004h
            if (r5 == 0) goto L_0x01f5
            ok1.e r5 = ok1.C62042e.f176370a
            boolean r5 = r5.mo87027N0()
            if (r5 == 0) goto L_0x008c
            r25.mo88684s()
            goto L_0x0222
        L_0x008c:
            bl3.r r5 = bl3.C39818r.f106831a
            android.content.Context r7 = r25.getContext()
            java.lang.String r8 = "context"
            gy3.C87412m.m108593f(r7, r8)
            bl3.r$a r7 = r5.mo62443b(r7)
            androidx.lifecycle.i0 r7 = r7.mo75002a(r2)
            dk1.g r7 = (dk1.C58312g) r7
            boolean r7 = r7.f166967e
            if (r7 == 0) goto L_0x00d5
            android.content.Context r0 = r25.getContext()
            gy3.C87412m.m108593f(r0, r8)
            bl3.r$a r0 = r5.mo62443b(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            dk1.g r0 = (dk1.C58312g) r0
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r0 = r0.f166968f
            if (r0 == 0) goto L_0x00bd
            r0.mo77737d()
        L_0x00bd:
            android.content.Context r0 = r25.getContext()
            gy3.C87412m.m108593f(r0, r8)
            bl3.r$a r0 = r5.mo62443b(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            dk1.g r0 = (dk1.C58312g) r0
            dk1.g$a r0 = r0.f166971i
            r1 = 3
            r0.f166979h = r1
            goto L_0x0222
        L_0x00d5:
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r5 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r2, r5)
            r9 = r2
            ht1.j5 r9 = (ht1.C8777j5) r9
            qj1.c r2 = r25.getBasePlugin()
            te3.hj1 r2 = r2.f177937h
            r10 = -1
            if (r2 == 0) goto L_0x00f0
            long r12 = r2.f134676j
            goto L_0x00f1
        L_0x00f0:
            r12 = r10
        L_0x00f1:
            qj1.c r2 = r25.getBasePlugin()
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x0102
            long r14 = r2.f182392d
            goto L_0x0103
        L_0x0102:
            r14 = r10
        L_0x0103:
            qj1.c r2 = r25.getBasePlugin()
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r3)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154345o
            r16 = -1
            qj1.c r5 = r25.getBasePlugin()
            androidx.lifecycle.i0 r1 = r5.mo87696x0(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0122
            int r1 = r1.f182393e
            long r10 = (long) r1
        L_0x0122:
            r18 = r10
            ak1.f0$q r1 = ak1.C54067f0.C54078q.CLICK_ENTER_LINKMIC_ANCHOR_PROFILE
            java.lang.Class<kq.g> r5 = p185kq.C61130g.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kq.g r5 = (p185kq.C61130g) r5
            java.lang.String r5 = r5.mo33244gK()
            java.lang.String r7 = "getService(IHellHoundCon…ava).getCurCommentscene()"
            gy3.C87412m.m108593f(r5, r7)
            r21 = 0
            r22 = 0
            r23 = 384(0x180, float:5.38E-43)
            r24 = 0
            r10 = r12
            r12 = r14
            r14 = r2
            r15 = r16
            r17 = r18
            r19 = r1
            r20 = r5
            ht1.C8777j5.C8778a.m8603d(r9, r10, r12, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r9 = r1
            ak1.w r9 = (ak1.C54116w) r9
            r9.getClass()
            ak1.f0$o0 r10 = ak1.C54067f0.C54076o0.CLICK_LINKMIC_ANCHOR_AVATAR_TO_LIVING_ROOM
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 252(0xfc, float:3.53E-43)
            r20 = 0
            java.lang.String r11 = ""
            ak1.C54116w.Ex0(r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r4.f151999c
            java.lang.String r2 = r25.getTAG()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "goToFinderLive from:"
            r4.append(r5)
            qj1.c r5 = r6.f181128h
            androidx.lifecycle.i0 r3 = r5.mo87696x0(r3)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            r4.append(r3)
            java.lang.String r3 = " to:"
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r2 == 0) goto L_0x0222
            cj1.b1 r14 = r2.f151991f
            if (r14 == 0) goto L_0x0222
            te3.eq2 r2 = r14.f153411A
            if (r2 != 0) goto L_0x01b2
            te3.eq2 r2 = new te3.eq2
            r2.<init>()
            r14.f153411A = r2
        L_0x01b2:
            te3.eq2 r2 = r14.f153411A
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x01b9
            goto L_0x01ce
        L_0x01b9:
            qj1.c r4 = r6.f181128h
            java.lang.Class<cl1.d0> r5 = cl1.C54963d0.class
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r5)
            cl1.d0 r4 = (cl1.C54963d0) r4
            al1.j r4 = r4.f154073p
            if (r4 == 0) goto L_0x01cb
            java.lang.String r4 = r4.f151999c
            if (r4 != 0) goto L_0x01cc
        L_0x01cb:
            r4 = r3
        L_0x01cc:
            r2.f183025p = r4
        L_0x01ce:
            java.lang.Class<ls3.f> r2 = ls3.C10649f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r9 = r2
            ls3.f r9 = (ls3.C10649f) r9
            android.content.Context r10 = r25.getContext()
            gy3.C87412m.m108593f(r10, r8)
            r11 = 0
            if (r1 != 0) goto L_0x01e3
            r12 = r3
            goto L_0x01e4
        L_0x01e3:
            r12 = r1
        L_0x01e4:
            android.content.Context r1 = r25.getContext()
            boolean r2 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x01ef
            r0 = r1
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
        L_0x01ef:
            r13 = r0
            r15 = 0
            r9.mo10917ze(r10, r11, r12, r13, r14, r15)
            goto L_0x0222
        L_0x01f5:
            r25.mo88680m()
            goto L_0x0222
        L_0x01f9:
            android.view.ViewGroup r0 = r25.getRoot()
            int r0 = r0.getId()
            if (r1 != 0) goto L_0x0204
            goto L_0x020e
        L_0x0204:
            int r2 = r1.intValue()
            if (r2 != r0) goto L_0x020e
            r25.mo88680m()
            goto L_0x0222
        L_0x020e:
            android.widget.FrameLayout r0 = r25.getFinderLiveMicMuteIcon()
            int r0 = r0.getId()
            if (r1 != 0) goto L_0x0219
            goto L_0x0222
        L_0x0219:
            int r1 = r1.intValue()
            if (r1 != r0) goto L_0x0222
            r25.mo88681o()
        L_0x0222:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverVideoWidget"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oi1.C62031c.onClick(android.view.View):void");
    }

    /* renamed from: q */
    public void mo86914q() {
        C61926c.m72668M(new C62032a(this));
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176349y = viewGroup;
    }

    public final void setFinderLiveMicHeartText(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f176347w = textView;
    }

    public final void setFinderLiveMicMuteIcon(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f176341q = frameLayout;
    }

    public final void setFinderLiveMicMuteIconWe(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "<set-?>");
        this.f176342r = weImageView;
    }

    public final void setFinderLiveMicNewNormalMicGiftItemLayout(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176344t = viewGroup;
    }

    public final void setFinderLiveVideoLinkBottomBarAvatar(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f176345u = imageView;
    }

    public final void setFinderLiveVideoLinkBottomBarName(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f176346v = textView;
    }

    public final void setFinderLiveVideoLinkBottomBarUserLevel(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f176348x = textView;
    }

    public final void setRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176343s = viewGroup;
    }

    /* renamed from: t */
    public abstract void mo86977t();
}
