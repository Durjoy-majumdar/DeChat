package ve1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import mo1.C11025q;
import n60.C100075f;
import rx3.C36568h;
import up1.C37521f;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: ve1.c7 */
public final class C14483c7 extends C60896i<BaseFinderFeed> {

    /* renamed from: A */
    public View f40137A;

    /* renamed from: B */
    public ImageView f40138B;

    /* renamed from: C */
    public Boolean f40139C;

    /* renamed from: e */
    public final boolean f40140e;

    /* renamed from: f */
    public View f40141f;

    /* renamed from: g */
    public ImageView f40142g;

    /* renamed from: h */
    public TextView f40143h;

    /* renamed from: i */
    public WeImageView f40144i;

    /* renamed from: j */
    public FinderLiveOnliveWidget f40145j;

    /* renamed from: n */
    public FinderLiveOnliveWidget f40146n;

    /* renamed from: o */
    public ImageView f40147o;

    /* renamed from: p */
    public View f40148p;

    /* renamed from: q */
    public View f40149q;

    /* renamed from: r */
    public View f40150r;

    /* renamed from: s */
    public TextView f40151s;

    /* renamed from: t */
    public View f40152t;

    /* renamed from: u */
    public ValueAnimator f40153u;

    /* renamed from: v */
    public View f40154v;

    /* renamed from: w */
    public View f40155w;

    /* renamed from: x */
    public FinderPostProgressView f40156x;

    /* renamed from: y */
    public WeImageView f40157y;

    /* renamed from: z */
    public TextView f40158z;

    /* renamed from: ve1.c7$a */
    public static final class C14484a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostProgressView f40159d;

        public C14484a(FinderPostProgressView finderPostProgressView) {
            this.f40159d = finderPostProgressView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderPostProgressView finderPostProgressView = this.f40159d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            finderPostProgressView.setProgress(((Integer) animatedValue).intValue());
            this.f40159d.invalidate();
        }
    }

    /* renamed from: ve1.c7$b */
    public static final class C14485b extends C87413o implements C32224a<Point> {

        /* renamed from: d */
        public static final C14485b f40160d = new C14485b();

        public C14485b() {
            super(0);
        }

        public Object invoke() {
            return C75044y4.m89990b(MMApplicationContext.getContext());
        }
    }

    public C14483c7(boolean z) {
        this.f40140e = z;
        C36568h.m40985a(C14485b.f40160d);
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        C37521f fVar = C37521f.f99374d;
        aVar.f293181g = fVar.mo61198x();
        aVar.f293180f = fVar.mo61199y();
        aVar.mo139398a();
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cox;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03aa, code lost:
        if (r4 == null) goto L_0x03ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x07a8  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0871  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0888  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x099b  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x09b5  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x09cb  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x09cd  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x09dc  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x09df  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x09f6  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0a3e  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0a45  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0a58  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0a5f  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0a72  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0a79  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0a90  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03f8  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r43, jq3.C9493c r44, int r45, int r46, boolean r47, java.util.List r48) {
        /*
            r42 = this;
            r0 = r42
            r1 = r43
            r2 = r44
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            up1.y r9 = up1.C27696y.RAW_IMAGE
            up1.y r12 = up1.C27696y.THUMB_IMAGE
            pl1.e0$a r15 = pl1.C11978e0.C11979a.COMMON
            java.lang.Class<pl1.s0> r14 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r13 = ht1.C60200t1.class
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r4 = 2131304667(0x7f0920db, float:1.8227483E38)
            if (r3 != 0) goto L_0x0047
            android.view.View r3 = r1.f44854d
            android.view.View r3 = r3.findViewById(r4)
            if (r3 != 0) goto L_0x0047
            ft1.a r16 = ft1.C59319a.f169618b
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            ve1.b7 r2 = new ve1.b7
            r2.<init>(r1)
            r23 = 28
            r24 = 0
            java.lang.String r17 = "finder_profile_item_image"
            r22 = r2
            o40.C11348f.C11349a.m11178b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0a86
        L_0x0047:
            android.view.View r3 = r1.f44854d
            java.lang.String r5 = "holder.itemView"
            gy3.C87412m.m108593f(r3, r5)
            r5 = 2131311416(0x7f093b38, float:1.8241172E38)
            android.view.View r5 = r3.findViewById(r5)
            r0.f40141f = r5
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r5 = "itemView.findViewById(R.…inder_profile_item_image)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f40142g = r4
            r4 = 2131302686(0x7f09191e, float:1.8223465E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f40143h = r4
            r4 = 2131304082(0x7f091e92, float:1.8226297E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r5 = "itemView.findViewById(R.…inder_live_onlive_widget)"
            gy3.C87412m.m108593f(r4, r5)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r4 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r4
            r0.f40145j = r4
            r4 = 2131303847(0x7f091da7, float:1.822582E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r5 = "itemView.findViewById<Fi…id.finder_live_mask_view)"
            gy3.C87412m.m108593f(r4, r5)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r4 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r4
            r0.f40146n = r4
            r4 = 2131311405(0x7f093b2d, float:1.824115E38)
            android.view.View r5 = r3.findViewById(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f40144i = r5
            r5 = 2131311407(0x7f093b2f, float:1.8241153E38)
            android.view.View r5 = r3.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.id.profile_like_area)"
            gy3.C87412m.m108593f(r5, r6)
            r0.f40149q = r5
            r5 = 2131311408(0x7f093b30, float:1.8241155E38)
            android.view.View r5 = r3.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.id.profile_like_area_mask)"
            gy3.C87412m.m108593f(r5, r6)
            r0.f40150r = r5
            r5 = 2131311409(0x7f093b31, float:1.8241157E38)
            android.view.View r5 = r3.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.id.profile_like_count_tv)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f40151s = r5
            r5 = 2131304673(0x7f0920e1, float:1.8227495E38)
            android.view.View r5 = r3.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.…_profile_item_reprint_iv)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f40147o = r5
            r5 = 2131312041(0x7f093da9, float:1.824244E38)
            android.view.View r5 = r3.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.id.ref_deleted_tips)"
            gy3.C87412m.m108593f(r5, r6)
            r0.f40148p = r5
            android.view.View r4 = r3.findViewById(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            r0.f40144i = r4
            r4 = 2131311307(0x7f093acb, float:1.824095E38)
            android.view.View r4 = r3.findViewById(r4)
            r0.f40137A = r4
            r4 = 2131311398(0x7f093b26, float:1.8241135E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f40138B = r4
            r4 = 2131304668(0x7f0920dc, float:1.8227485E38)
            android.view.View r4 = r3.findViewById(r4)
            r0.f40154v = r4
            r4 = 2131304669(0x7f0920dd, float:1.8227487E38)
            android.view.View r4 = r3.findViewById(r4)
            r0.f40155w = r4
            r4 = 2131304671(0x7f0920df, float:1.8227491E38)
            android.view.View r4 = r3.findViewById(r4)
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r4 = (com.tencent.p014mm.plugin.finder.view.FinderPostProgressView) r4
            r0.f40156x = r4
            r4 = 2131304670(0x7f0920de, float:1.822749E38)
            android.view.View r4 = r3.findViewById(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            r0.f40157y = r4
            r4 = 2131304672(0x7f0920e0, float:1.8227493E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f40158z = r4
            r4 = 2131311441(0x7f093b51, float:1.8241222E38)
            android.view.View r3 = r3.findViewById(r4)
            java.lang.String r4 = "itemView.findViewById(R.…ile_private_icon_divider)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f40152t = r3
            android.content.Context r4 = r1.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
            int r4 = r4.getColor(r11)
            r3.setBackgroundColor(r4)
            if (r48 == 0) goto L_0x0178
            java.util.Iterator r3 = r48.iterator()
        L_0x0157:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0176
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x0157
            r5 = 2001(0x7d1, float:2.804E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x0157
            r0.mo13741n(r1, r2)
            goto L_0x0a86
        L_0x0176:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0178:
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f40144i
            r10 = 0
            if (r3 != 0) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            r3.setVisibility(r10)
        L_0x0181:
            android.widget.TextView r3 = r42.mo13739l()
            r3.setVisibility(r10)
            r0.mo13741n(r1, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            java.util.LinkedList r3 = r3.getMediaList()
            boolean r3 = r3.isEmpty()
            java.lang.String r8 = "Finder.Loader"
            r7 = 8
            if (r3 == 0) goto L_0x01dd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "invalid item id "
            r3.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r4 = r2.getId()
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f40157y
            if (r2 != 0) goto L_0x01be
            goto L_0x01c1
        L_0x01be:
            r2.setVisibility(r10)
        L_0x01c1:
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r2 = r0.f40156x
            if (r2 != 0) goto L_0x01c6
            goto L_0x01c9
        L_0x01c6:
            r2.setVisibility(r7)
        L_0x01c9:
            android.widget.TextView r2 = r0.f40158z
            if (r2 != 0) goto L_0x01cf
            goto L_0x0a86
        L_0x01cf:
            android.content.Context r1 = r1.f173499A
            r3 = 2131826822(0x7f111886, float:1.928654E38)
            java.lang.String r1 = r1.getString(r3)
            r2.setText(r1)
            goto L_0x0a86
        L_0x01dd:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            boolean r3 = r3.isLiveFeed()
            if (r3 == 0) goto L_0x01f6
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            java.util.LinkedList r3 = r3.getLiveMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.rq2 r3 = (te3.C64689rq2) r3
            goto L_0x0204
        L_0x01f6:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            java.util.LinkedList r3 = r3.getMediaList()
            java.lang.Object r3 = sx3.C110818d0.m150914L(r3)
            te3.rq2 r3 = (te3.C64689rq2) r3
        L_0x0204:
            r6 = r3
            android.widget.TextView r3 = r0.f40143h
            if (r3 != 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            r3.setVisibility(r7)
        L_0x020d:
            android.view.View r3 = r0.f40148p
            java.lang.String r4 = "deletedTip"
            if (r3 == 0) goto L_0x0a95
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r11.mo10233c(r5)
            java.lang.Object[] r17 = r11.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r11.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r17 = ""
            r11 = 2
            if (r47 != 0) goto L_0x04e4
            android.widget.ImageView r3 = r42.mo13737j()
            r3.setVisibility(r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            long r18 = r3.getRefObjectFlag()
            r20 = 2
            int r3 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x02c3
            android.widget.ImageView r3 = r42.mo13737j()
            r12 = 2131099659(0x7f06000b, float:1.7811677E38)
            r3.setImageResource(r12)
            android.view.View r3 = r0.f40148p
            if (r3 == 0) goto L_0x02bd
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r4.mo10233c(r12)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r4 = r4.mo10231a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x04e4
        L_0x02bd:
            gy3.C87412m.m108603p(r4)
            r16 = 0
            throw r16
        L_0x02c3:
            r16 = 0
            if (r6 == 0) goto L_0x02ce
            int r3 = r6.f185268f
            r4 = 4
            if (r3 != r4) goto L_0x02ce
            r3 = 1
            goto L_0x02cf
        L_0x02ce:
            r3 = 0
        L_0x02cf:
            if (r3 == 0) goto L_0x036f
            android.widget.ImageView r3 = r42.mo13737j()
            r4 = 2131304568(0x7f092078, float:1.8227282E38)
            int r5 = r6.f185256T0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.setTag(r4, r5)
            android.widget.ImageView r3 = r42.mo13737j()
            r4 = 2131304569(0x7f092079, float:1.8227284E38)
            long r18 = r2.getItemId()
            java.lang.String r5 = o40.C61926c.m72691p(r18)
            r3.setTag(r4, r5)
            java.lang.String r3 = r6.f185283w
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0339
            pl1.n r5 = new pl1.n
            r18 = 0
            r19 = 4
            r20 = 0
            r3 = r5
            r4 = r6
            r10 = r5
            r5 = r12
            r12 = r6
            r6 = r18
            r7 = r19
            r26 = r8
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r13)
            bl3.c r4 = r4.mo62447c(r14)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11866N0()
            android.widget.ImageView r5 = r42.mo13737j()
            bl3.r$a r3 = r3.mo62446e(r13)
            bl3.c r3 = r3.mo62447c(r14)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r15)
            r4.mo85957c(r10, r5, r3)
            goto L_0x036c
        L_0x0339:
            r12 = r6
            r26 = r8
            pl1.p r10 = new pl1.p
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r10
            r4 = r12
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r13)
            bl3.c r4 = r4.mo62447c(r14)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11866N0()
            android.widget.ImageView r5 = r42.mo13737j()
            bl3.r$a r3 = r3.mo62446e(r13)
            bl3.c r3 = r3.mo62447c(r14)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r15)
            r4.mo85957c(r10, r5, r3)
        L_0x036c:
            r3 = r12
            goto L_0x04e7
        L_0x036f:
            r3 = r6
            r26 = r8
            if (r3 == 0) goto L_0x037c
            int r4 = r3.f185268f
            r5 = 9
            if (r4 != r5) goto L_0x037c
            r5 = 1
            goto L_0x037d
        L_0x037c:
            r5 = 0
        L_0x037d:
            if (r5 == 0) goto L_0x0499
            er1.j4 r4 = er1.C58739j4.f168176a
            java.lang.String r4 = r4.mo83674B(r3, r11)
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x038d
            r5 = 1
            goto L_0x038e
        L_0x038d:
            r5 = 0
        L_0x038e:
            if (r5 == 0) goto L_0x0391
            goto L_0x03ae
        L_0x0391:
            java.lang.String r4 = r3.f185283w
            if (r4 == 0) goto L_0x03ac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = r3.f185234A
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            if (r4 != 0) goto L_0x03ae
        L_0x03ac:
            r4 = r17
        L_0x03ae:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x03cb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.f185267e
            r4.append(r5)
            java.lang.String r5 = r3.f185288z
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x03cb:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x03dc
            int r5 = r5.f182394f
            r6 = 1
            if (r5 != r6) goto L_0x03dc
            r5 = 1
            goto L_0x03dd
        L_0x03dc:
            r5 = 0
        L_0x03dd:
            if (r5 == 0) goto L_0x0476
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x03f4
            te3.ix0 r5 = r5.f182386Y
            if (r5 == 0) goto L_0x03f4
            int r5 = r5.f183745d
            r6 = 1
            if (r5 != r6) goto L_0x03f5
            r5 = 1
            goto L_0x03f6
        L_0x03f4:
            r6 = 1
        L_0x03f5:
            r5 = 0
        L_0x03f6:
            if (r5 != 0) goto L_0x042f
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r7 = r5.mo62446e(r13)
            bl3.c r7 = r7.mo62447c(r14)
            pl1.s0 r7 = (pl1.C11990s0) r7
            k60.d r7 = r7.mo11866N0()
            pl1.n0 r8 = new pl1.n0
            r8.<init>(r4, r12)
            android.widget.ImageView r4 = r42.mo13737j()
            bl3.r$a r5 = r5.mo62446e(r13)
            bl3.c r5 = r5.mo62447c(r14)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r15)
            r7.mo85957c(r8, r4, r5)
            android.widget.TextView r4 = r0.f40143h
            if (r4 != 0) goto L_0x0428
            goto L_0x04e7
        L_0x0428:
            r5 = 8
            r4.setVisibility(r5)
            goto L_0x04e7
        L_0x042f:
            r5 = 8
            di3.d r7 = di3.C86312j.m106911c(r13)
            java.lang.String r8 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r7, r8)
            r18 = r7
            ht1.t1 r18 = (ht1.C60200t1) r18
            android.widget.ImageView r20 = r42.mo13737j()
            r21 = 0
            r22 = 4
            r23 = 0
            r19 = r4
            ht1.C60200t1.C60201a.m70367e(r18, r19, r20, r21, r22, r23)
            android.widget.TextView r4 = r0.f40143h
            if (r4 != 0) goto L_0x0452
            goto L_0x046a
        L_0x0452:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            te3.c21 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L_0x0465
            te3.ix0 r7 = r7.f182386Y
            if (r7 == 0) goto L_0x0465
            java.lang.String r7 = r7.f183746e
            if (r7 == 0) goto L_0x0465
            goto L_0x0467
        L_0x0465:
            r7 = r17
        L_0x0467:
            r4.setText(r7)
        L_0x046a:
            android.widget.TextView r4 = r0.f40143h
            if (r4 != 0) goto L_0x0470
            goto L_0x04e7
        L_0x0470:
            r7 = 0
            r4.setVisibility(r7)
            goto L_0x04e7
        L_0x0476:
            r5 = 8
            r6 = 1
            r7 = 0
            java.lang.Class<tf0.q1> r8 = tf0.C13887q1.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            java.lang.String r10 = "getService(IFinderCommonLiveService::class.java)"
            gy3.C87412m.m108593f(r8, r10)
            r18 = r8
            tf0.q1 r18 = (tf0.C13887q1) r18
            android.widget.ImageView r19 = r42.mo13737j()
            r21 = 0
            r22 = 4
            r23 = 0
            r20 = r4
            tf0.C13887q1.C13888a.m13309e(r18, r19, r20, r21, r22, r23)
            goto L_0x04e7
        L_0x0499:
            r5 = 8
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x04e7
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r8 = r4.mo62446e(r13)
            bl3.c r8 = r8.mo62447c(r14)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11866N0()
            pl1.b0 r10 = new pl1.b0
            r16 = 0
            r18 = 0
            r19 = 12
            r20 = 0
            r7 = r10
            r6 = 0
            r6 = 2
            r11 = r3
            r5 = r13
            r13 = r16
            r6 = r14
            r14 = r18
            r28 = r15
            r15 = r19
            r16 = r20
            r10.<init>(r11, r12, r13, r14, r15, r16)
            android.widget.ImageView r10 = r42.mo13737j()
            bl3.r$a r4 = r4.mo62446e(r5)
            bl3.c r4 = r4.mo62447c(r6)
            pl1.s0 r4 = (pl1.C11990s0) r4
            r11 = r28
            n60.f r4 = r4.mo11867O2(r11)
            r8.mo85957c(r7, r10, r4)
            goto L_0x04ea
        L_0x04e4:
            r3 = r6
            r26 = r8
        L_0x04e7:
            r5 = r13
            r6 = r14
            r11 = r15
        L_0x04ea:
            vq1.w r4 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            int r4 = r4.mo89909h(r7)
            if (r4 <= 0) goto L_0x0500
            r7 = 2
            java.lang.String r4 = er1.C7878t0.m8034c(r7, r4)
            goto L_0x0502
        L_0x0500:
            java.lang.String r4 = "0"
        L_0x0502:
            android.widget.TextView r7 = r42.mo13739l()
            r7.setText(r4)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r4 = r0.f40145j
            java.lang.String r7 = "feedOnliveLayout"
            if (r4 == 0) goto L_0x0a90
            r8 = 8
            r4.setVisibility(r8)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r4 = r0.f40146n
            java.lang.String r10 = "liveFinishView"
            if (r4 == 0) goto L_0x0a8b
            r4.setVisibility(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            int r4 = r4.getMediaType()
            boolean r8 = r0.mo13740m(r2)
            if (r8 == 0) goto L_0x0583
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f40144i
            if (r5 == 0) goto L_0x0537
            r6 = 2131756028(0x7f1003fc, float:1.9142952E38)
            r5.setImageResource(r6)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0537:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f40144i
            if (r5 == 0) goto L_0x054e
            android.content.Context r6 = r1.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
            int r6 = r6.getColor(r8)
            r5.setIconColor(r6)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0551
        L_0x054e:
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
        L_0x0551:
            vp1.e r5 = vp1.C65834e.f189316a
            long r11 = r2.getItemId()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo89871e(r11)
            if (r5 == 0) goto L_0x0562
            int r5 = r5.getReadCount()
            goto L_0x0563
        L_0x0562:
            r5 = 0
        L_0x0563:
            android.widget.TextView r6 = r42.mo13739l()
            long r11 = (long) r5
            java.lang.String r5 = er1.C7878t0.m8036e(r11)
            r6.setText(r5)
            android.widget.TextView r5 = r42.mo13739l()
            android.content.Context r1 = r1.f173499A
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r8)
            r5.setTextColor(r1)
        L_0x0580:
            r9 = 0
            goto L_0x0635
        L_0x0583:
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
            wp1.j r12 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            int r13 = r13.objectType
            te3.if1 r12 = r12.mo14351c(r13)
            if (r12 == 0) goto L_0x05ec
            java.lang.String r13 = r12.f135269o
            if (r13 == 0) goto L_0x05a5
            int r13 = r13.length()
            if (r13 != 0) goto L_0x05a3
            goto L_0x05a5
        L_0x05a3:
            r13 = 0
            goto L_0x05a6
        L_0x05a5:
            r13 = 1
        L_0x05a6:
            if (r13 == 0) goto L_0x05a9
            goto L_0x05ec
        L_0x05a9:
            com.tencent.mm.ui.widget.imageview.WeImageView r13 = r0.f40144i
            if (r13 == 0) goto L_0x05d7
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r15 = r14.mo62446e(r5)
            bl3.c r15 = r15.mo62447c(r6)
            pl1.s0 r15 = (pl1.C11990s0) r15
            k60.d r15 = r15.mo11871f2()
            pl1.n0 r8 = new pl1.n0
            java.lang.String r12 = r12.f135269o
            r8.<init>(r12, r9)
            bl3.r$a r5 = r14.mo62446e(r5)
            bl3.c r5 = r5.mo62447c(r6)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r11)
            r15.mo85957c(r8, r13, r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x05d7:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f40144i
            if (r5 == 0) goto L_0x0580
            android.content.Context r1 = r1.f173499A
            r6 = 2131099940(0x7f060124, float:1.7812247E38)
            int r1 = kg3.C76577a.m92153d(r1, r6)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r5.setColorFilter(r1, r6)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0580
        L_0x05ec:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f40144i
            if (r5 == 0) goto L_0x0609
            er1.w3 r6 = er1.C58784w3.f168295a
            r8 = 2
            r9 = 0
            r11 = 0
            java.lang.Integer r6 = er1.C58784w3.m68436c0(r6, r8, r11, r8, r9)
            if (r6 == 0) goto L_0x0600
            int r6 = r6.intValue()
            goto L_0x0603
        L_0x0600:
            r6 = 2131755982(0x7f1003ce, float:1.9142859E38)
        L_0x0603:
            r5.setImageResource(r6)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x060a
        L_0x0609:
            r9 = 0
        L_0x060a:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f40144i
            if (r5 == 0) goto L_0x0621
            android.content.Context r6 = r1.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
            int r6 = r6.getColor(r8)
            r5.setIconColor(r6)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0624
        L_0x0621:
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
        L_0x0624:
            android.widget.TextView r5 = r42.mo13739l()
            android.content.Context r1 = r1.f173499A
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r8)
            r5.setTextColor(r1)
        L_0x0635:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            long r5 = r1.getRefObjectFlag()
            r11 = 0
            java.lang.String r1 = "reprintIv"
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x0654
            android.widget.ImageView r5 = r0.f40147o
            if (r5 == 0) goto L_0x0650
            r1 = 0
            r5.setVisibility(r1)
            r1 = 8
            goto L_0x065d
        L_0x0650:
            gy3.C87412m.m108603p(r1)
            throw r9
        L_0x0654:
            android.widget.ImageView r5 = r0.f40147o
            if (r5 == 0) goto L_0x0a87
            r1 = 8
            r5.setVisibility(r1)
        L_0x065d:
            boolean r5 = r0.mo13740m(r2)
            r6 = 2131756468(0x7f1005b4, float:1.9143844E38)
            if (r5 == 0) goto L_0x07a8
            android.view.View r5 = r0.f40137A
            if (r5 != 0) goto L_0x066b
            goto L_0x06ab
        L_0x066b:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r8.mo10233c(r11)
            java.lang.Object[] r29 = r8.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r31 = "onBindViewHolder"
            java.lang.String r32 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r5
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r1 = 0
            java.lang.Object r8 = r8.mo10231a(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r1 = r8.intValue()
            r5.setVisibility(r1)
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
        L_0x06ab:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            boolean r1 = r1.isPrivate()
            if (r1 == 0) goto L_0x072b
            android.widget.ImageView r1 = r0.f40138B
            if (r1 == 0) goto L_0x06e2
            android.content.Context r5 = r1.getContext()
            r6 = 2131755651(0x7f100283, float:1.9142187E38)
            android.widget.ImageView r8 = r0.f40138B
            if (r8 == 0) goto L_0x06d8
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L_0x06d8
            android.content.res.Resources r8 = r8.getResources()
            if (r8 == 0) goto L_0x06d8
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
            int r8 = r8.getColor(r11)
            goto L_0x06d9
        L_0x06d8:
            r8 = 0
        L_0x06d9:
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r5, r6, r8)
            r1.setImageDrawable(r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x06e2:
            android.view.View r1 = r0.f40137A
            if (r1 != 0) goto L_0x06e8
            goto L_0x0869
        L_0x06e8:
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r28 = r5.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r1
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0869
        L_0x072b:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            int r1 = r1.getStickyTime()
            if (r1 <= 0) goto L_0x0869
            android.widget.ImageView r1 = r0.f40138B
            if (r1 == 0) goto L_0x075f
            android.content.Context r5 = r1.getContext()
            android.widget.ImageView r8 = r0.f40138B
            if (r8 == 0) goto L_0x0755
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L_0x0755
            android.content.res.Resources r8 = r8.getResources()
            if (r8 == 0) goto L_0x0755
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
            int r8 = r8.getColor(r11)
            goto L_0x0756
        L_0x0755:
            r8 = 0
        L_0x0756:
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r5, r6, r8)
            r1.setImageDrawable(r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x075f:
            android.view.View r1 = r0.f40137A
            if (r1 != 0) goto L_0x0765
            goto L_0x0869
        L_0x0765:
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r28 = r5.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r1
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0869
        L_0x07a8:
            android.view.View r1 = r0.f40137A
            if (r1 != 0) goto L_0x07ad
            goto L_0x07ef
        L_0x07ad:
            k20.a r5 = new k20.a
            r5.<init>()
            r8 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r11)
            java.lang.Object[] r35 = r5.mo10232b()
            java.lang.String r36 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r37 = "onBindViewHolder"
            java.lang.String r38 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r39 = "android/view/View_EXEC_"
            java.lang.String r40 = "setVisibility"
            java.lang.String r41 = "(I)V"
            r34 = r1
            j20.C117292a.m165358d(r34, r35, r36, r37, r38, r39, r40, r41)
            r8 = 0
            java.lang.Object r5 = r5.mo10231a(r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r35 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r36 = "onBindViewHolder"
            java.lang.String r37 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r38 = "android/view/View_EXEC_"
            java.lang.String r39 = "setVisibility"
            java.lang.String r40 = "(I)V"
            j20.C117292a.m165359e(r34, r35, r36, r37, r38, r39, r40)
        L_0x07ef:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            int r1 = r1.getStickyTime()
            if (r1 <= 0) goto L_0x0869
            android.widget.ImageView r1 = r0.f40138B
            if (r1 == 0) goto L_0x0823
            android.content.Context r5 = r1.getContext()
            android.widget.ImageView r8 = r0.f40138B
            if (r8 == 0) goto L_0x0819
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L_0x0819
            android.content.res.Resources r8 = r8.getResources()
            if (r8 == 0) goto L_0x0819
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
            int r8 = r8.getColor(r11)
            goto L_0x081a
        L_0x0819:
            r8 = 0
        L_0x081a:
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r5, r6, r8)
            r1.setImageDrawable(r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0823:
            android.view.View r1 = r0.f40137A
            if (r1 != 0) goto L_0x0828
            goto L_0x0869
        L_0x0828:
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r28 = r5.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r1
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0869:
            er1.j4 r1 = er1.C58739j4.f168176a
            boolean r1 = r1.mo83686O(r2)
            if (r1 == 0) goto L_0x09b5
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x0884
            int r5 = r5.f182394f
            r6 = 1
            if (r5 != r6) goto L_0x0885
            r5 = 1
            goto L_0x0886
        L_0x0884:
            r6 = 1
        L_0x0885:
            r5 = 0
        L_0x0886:
            if (r5 == 0) goto L_0x099b
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r5 = r0.f40145j
            if (r5 == 0) goto L_0x0997
            r8 = 0
            r5.setVisibility(r8)
            di3.d r5 = di3.C86312j.m106911c(r1)
            ir.n r5 = (p565ir.C60606n) r5
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r8 = r0.f40145j
            if (r8 == 0) goto L_0x0993
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.n r1 = (p565ir.C60606n) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            te3.c21 r7 = r7.getLiveInfo()
            boolean r1 = r1.mo85008I1(r7)
            if (r1 == 0) goto L_0x08b0
            r1 = 2
            goto L_0x08b1
        L_0x08b0:
            r1 = 0
        L_0x08b1:
            r7 = 0
            r5.Ej0(r8, r7, r1)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r1 = r0.f40146n
            if (r1 == 0) goto L_0x098f
            r5 = 8
            r1.setVisibility(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f40144i
            if (r1 != 0) goto L_0x08c3
            goto L_0x08c6
        L_0x08c3:
            r1.setVisibility(r5)
        L_0x08c6:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x08d3
            int r10 = r1.f182403q
            goto L_0x08d4
        L_0x08d3:
            r10 = 0
        L_0x08d4:
            if (r10 <= 0) goto L_0x08f4
            android.widget.TextView r1 = r42.mo13739l()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131827984(0x7f111d10, float:1.9288896E38)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r11 = 2
            java.lang.String r10 = er1.C7878t0.m8034c(r11, r10)
            r11 = 0
            r8[r11] = r10
            java.lang.String r5 = r5.getString(r7, r8)
            r1.setText(r5)
            goto L_0x0987
        L_0x08f4:
            android.widget.TextView r1 = r42.mo13739l()
            r5 = 8
            r1.setVisibility(r5)
            android.view.View r10 = r42.mo13738k()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r1.mo10233c(r7)
            java.lang.Object[] r19 = r1.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r21 = "bindLive"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r10
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.setVisibility(r1)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r12 = "bindLive"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r1 = r0.f40150r
            if (r1 == 0) goto L_0x0989
            k20.a r5 = new k20.a
            r5.<init>()
            r7 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r7)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r21 = "bindLive"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = 0
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert"
            java.lang.String r20 = "bindLive"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0987:
            r5 = 0
            goto L_0x09b7
        L_0x0989:
            java.lang.String r1 = "likeAreaMask"
            gy3.C87412m.m108603p(r1)
            throw r9
        L_0x098f:
            gy3.C87412m.m108603p(r10)
            throw r9
        L_0x0993:
            gy3.C87412m.m108603p(r7)
            throw r9
        L_0x0997:
            gy3.C87412m.m108603p(r7)
            throw r9
        L_0x099b:
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r1 = r0.f40145j
            if (r1 == 0) goto L_0x09b1
            r5 = 8
            r1.setVisibility(r5)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r1 = r0.f40146n
            if (r1 == 0) goto L_0x09ad
            r5 = 0
            r1.setVisibility(r5)
            goto L_0x09b7
        L_0x09ad:
            gy3.C87412m.m108603p(r10)
            throw r9
        L_0x09b1:
            gy3.C87412m.m108603p(r7)
            throw r9
        L_0x09b5:
            r5 = 0
            r6 = 1
        L_0x09b7:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            boolean r1 = r1.isPrivate()
            if (r1 != 0) goto L_0x09cd
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            int r1 = r1.getStickyTime()
            if (r1 <= 0) goto L_0x09cd
            r10 = 1
            goto L_0x09ce
        L_0x09cd:
            r10 = 0
        L_0x09ce:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            java.lang.String r1 = r1.getDescription()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x09df
            r1 = r17
            goto L_0x09e7
        L_0x09df:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            java.lang.String r1 = r1.getDescription()
        L_0x09e7:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            java.util.LinkedList r5 = r5.getMediaList()
            r5.isEmpty()
            android.view.View r5 = r0.f40141f
            if (r5 == 0) goto L_0x0a32
            r6 = 2131302530(0x7f091882, float:1.8223149E38)
            android.widget.TextView r7 = r42.mo13739l()
            java.lang.CharSequence r7 = r7.getText()
            if (r7 != 0) goto L_0x0a05
            r7 = r17
        L_0x0a05:
            r5.setTag(r6, r7)
            r6 = 2131302517(0x7f091875, float:1.8223122E38)
            r5.setTag(r6, r1)
            r1 = 2131302529(0x7f091881, float:1.8223147E38)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            r5.setTag(r1, r6)
            r1 = 2131302569(0x7f0918a9, float:1.8223228E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.setTag(r1, r4)
            r1 = 2131302528(0x7f091880, float:1.8223145E38)
            boolean r4 = r0.mo13740m(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5.setTag(r1, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0a32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "FinderProfileDrawerFeedConvert mediaType:"
            r1.append(r4)
            if (r3 == 0) goto L_0x0a45
            int r3 = r3.f185268f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x0a46
        L_0x0a45:
            r5 = r9
        L_0x0a46:
            r1.append(r5)
            java.lang.String r3 = ",liveStatus:"
            r1.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x0a5f
            int r3 = r3.f182394f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x0a60
        L_0x0a5f:
            r5 = r9
        L_0x0a60:
            r1.append(r5)
            java.lang.String r3 = ",contact liveStatus:"
            r1.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.getRefObjectContact()
            if (r2 == 0) goto L_0x0a79
            int r2 = r2.liveStatus
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            goto L_0x0a7a
        L_0x0a79:
            r5 = r9
        L_0x0a7a:
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x0a86:
            return
        L_0x0a87:
            gy3.C87412m.m108603p(r1)
            throw r9
        L_0x0a8b:
            r9 = 0
            gy3.C87412m.m108603p(r10)
            throw r9
        L_0x0a90:
            r9 = 0
            gy3.C87412m.m108603p(r7)
            throw r9
        L_0x0a95:
            r9 = 0
            gy3.C87412m.m108603p(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14483c7.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final ImageView mo13737j() {
        ImageView imageView = this.f40142g;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("imageView");
        throw null;
    }

    /* renamed from: k */
    public final View mo13738k() {
        View view = this.f40149q;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("likeArea");
        throw null;
    }

    /* renamed from: l */
    public final TextView mo13739l() {
        TextView textView = this.f40151s;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("likeCountTv");
        throw null;
    }

    /* renamed from: m */
    public final boolean mo13740m(BaseFinderFeed baseFinderFeed) {
        C58969q l = baseFinderFeed.mo3507l();
        return C112551y.m153810j(l != null ? l.field_username : null, C66785b.f191882e.mo90662O5(), false, 2, (Object) null) && C87412m.m108589b(this.f40139C, Boolean.TRUE);
    }

    /* renamed from: n */
    public final void mo13741n(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C60905o oVar2 = oVar;
        View k = mo13738k();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(k, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(k, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view = this.f40150r;
        if (view != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ValueAnimator valueAnimator = this.f40153u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z = true;
            int i = 8;
            if (baseFinderFeed.mo3513o().isPostFailed()) {
                WeImageView weImageView = this.f40157y;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
                FinderPostProgressView finderPostProgressView = this.f40156x;
                if (finderPostProgressView != null) {
                    finderPostProgressView.setVisibility(8);
                }
                View k2 = mo13738k();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view3 = k2;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View k3 = mo13738k();
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view4 = k3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f40158z;
                if (textView != null) {
                    textView.setText(oVar2.f173499A.getString(C0966R.string.dcy));
                }
            } else if (baseFinderFeed.mo3513o().isPostFinish()) {
                WeImageView weImageView2 = this.f40157y;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                }
                FinderPostProgressView finderPostProgressView2 = this.f40156x;
                if (finderPostProgressView2 != null) {
                    finderPostProgressView2.setVisibility(8);
                }
                TextView textView2 = this.f40158z;
                if (textView2 != null) {
                    textView2.setText(this.f40140e ? oVar2.f173499A.getString(C0966R.string.m4i) : oVar2.f173499A.getString(C0966R.string.eka));
                }
                View k4 = mo13738k();
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view5 = k4;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view6 = this.f40150r;
                if (view6 != null) {
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(0);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    boolean t = baseFinderFeed.mo3519t();
                    if (this.f40140e && baseFinderFeed.mo3519t()) {
                        C39818r rVar = C39818r.f106831a;
                        Context context = oVar2.f173499A;
                        C87412m.m108593f(context, "holder.context");
                        C11025q qVar = (C11025q) rVar.mo62443b(context).mo62449e(C11025q.class);
                        if (qVar != null) {
                            qVar.f32764r = true;
                        }
                    }
                    z = t;
                } else {
                    C87412m.m108603p("likeAreaMask");
                    throw null;
                }
            } else {
                WeImageView weImageView3 = this.f40157y;
                if (weImageView3 != null) {
                    weImageView3.setVisibility(8);
                }
                FinderPostProgressView finderPostProgressView3 = this.f40156x;
                if (finderPostProgressView3 != null) {
                    finderPostProgressView3.setVisibility(0);
                }
                TextView textView3 = this.f40158z;
                if (textView3 != null) {
                    textView3.setText(oVar2.f173499A.getString(C0966R.string.m7e));
                }
                View k5 = mo13738k();
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view8 = k5;
                C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k5.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = this.f40150r;
                if (view9 != null) {
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(8);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    FinderPostProgressView finderPostProgressView4 = this.f40156x;
                    if (finderPostProgressView4 != null) {
                        if (finderPostProgressView4.getProgress() > baseFinderFeed.mo3513o().getPostInfo().f185649h) {
                            finderPostProgressView4.setProgress(baseFinderFeed.mo3513o().getPostInfo().f185649h);
                            finderPostProgressView4.invalidate();
                        } else {
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{finderPostProgressView4.getProgress(), baseFinderFeed.mo3513o().getPostInfo().f185649h});
                            this.f40153u = ofInt;
                            C87412m.m108591d(ofInt);
                            ofInt.addUpdateListener(new C14484a(finderPostProgressView4));
                            ValueAnimator valueAnimator2 = this.f40153u;
                            C87412m.m108591d(valueAnimator2);
                            ValueAnimator duration = valueAnimator2.setDuration(400);
                            if (duration != null) {
                                duration.start();
                            }
                        }
                    }
                } else {
                    C87412m.m108603p("likeAreaMask");
                    throw null;
                }
            }
            View view11 = this.f40154v;
            if (view11 != null) {
                int i2 = z ? 0 : 8;
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(Integer.valueOf(i2));
                View view12 = view11;
                C117292a.m165358d(view12, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view13 = this.f40155w;
            if (view13 != null) {
                if (z) {
                    i = 0;
                }
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(Integer.valueOf(i));
                View view14 = view13;
                C117292a.m165358d(view14, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/convert/FinderProfileDrawerFeedConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        C87412m.m108603p("likeAreaMask");
        throw null;
    }
}
