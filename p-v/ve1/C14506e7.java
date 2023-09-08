package ve1;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C7878t0;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import p565ir.C60606n;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64273c21;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: ve1.e7 */
public final class C14506e7 extends C60896i<BaseFinderFeed> {

    /* renamed from: A */
    public Boolean f40203A;

    /* renamed from: B */
    public final C13601g f40204B = C36568h.m40985a(C14507a.f40224d);

    /* renamed from: e */
    public View f40205e;

    /* renamed from: f */
    public ImageView f40206f;

    /* renamed from: g */
    public WeImageView f40207g;

    /* renamed from: h */
    public ImageIndicatorView f40208h;

    /* renamed from: i */
    public FinderLiveOnliveWidget f40209i;

    /* renamed from: j */
    public FinderLiveOnliveWidget f40210j;

    /* renamed from: n */
    public ImageView f40211n;

    /* renamed from: o */
    public TextView f40212o;

    /* renamed from: p */
    public View f40213p;

    /* renamed from: q */
    public FinderPostProgressView f40214q;

    /* renamed from: r */
    public View f40215r;

    /* renamed from: s */
    public View f40216s;

    /* renamed from: t */
    public View f40217t;

    /* renamed from: u */
    public TextView f40218u;

    /* renamed from: v */
    public View f40219v;

    /* renamed from: w */
    public ValueAnimator f40220w;

    /* renamed from: x */
    public TextView f40221x;

    /* renamed from: y */
    public View f40222y;

    /* renamed from: z */
    public ImageView f40223z;

    /* renamed from: ve1.e7$a */
    public static final class C14507a extends C87413o implements C32224a<Point> {

        /* renamed from: d */
        public static final C14507a f40224d = new C14507a();

        public C14507a() {
            super(0);
        }

        public Object invoke() {
            return C75044y4.m89990b(MMApplicationContext.getContext());
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359777ao0;
    }

    /* JADX WARNING: type inference failed for: r5v25, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x052b, code lost:
        if (r2 == null) goto L_0x052d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0b09  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0b4e  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0b96  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0cc3  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0d7a  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0d91  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0d93  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0da3  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0e09  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0e10  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0e23  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0e2a  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0e49  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0637  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r34, jq3.C9493c r35, int r36, int r37, boolean r38, java.util.List r39) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r36
            r3 = r35
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            up1.y r10 = up1.C27696y.RAW_IMAGE
            up1.y r13 = up1.C27696y.THUMB_IMAGE
            pl1.e0$a r9 = pl1.C11978e0.C11979a.COMMON
            java.lang.Class<pl1.s0> r8 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r3, r4)
            android.view.View r4 = r1.f44854d
            java.lang.String r5 = "holder.itemView"
            gy3.C87412m.m108593f(r4, r5)
            r5 = 2131311416(0x7f093b38, float:1.8241172E38)
            android.view.View r5 = r4.findViewById(r5)
            r0.f40205e = r5
            r5 = 2131304667(0x7f0920db, float:1.8227483E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.…inder_profile_item_image)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f40206f = r5
            r5 = 2131306302(0x7f09273e, float:1.82308E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.id.image_indicator)"
            gy3.C87412m.m108593f(r5, r6)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r5 = (com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView) r5
            r0.f40208h = r5
            r5 = 2131304082(0x7f091e92, float:1.8226297E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById(R.…inder_live_onlive_widget)"
            gy3.C87412m.m108593f(r5, r6)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r5 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r5
            r0.f40209i = r5
            r5 = 2131303847(0x7f091da7, float:1.822582E38)
            android.view.View r5 = r4.findViewById(r5)
            java.lang.String r6 = "itemView.findViewById<Fi…id.finder_live_mask_view)"
            gy3.C87412m.m108593f(r5, r6)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r5 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r5
            r0.f40210j = r5
            r5 = 2131311405(0x7f093b2d, float:1.824115E38)
            android.view.View r6 = r4.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            r0.f40207g = r6
            r6 = 2131311402(0x7f093b2a, float:1.8241143E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.id.profile_item_desc_tv)"
            gy3.C87412m.m108593f(r6, r11)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.f40212o = r6
            r6 = 2131311488(0x7f093b80, float:1.8241318E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.….profile_upload_progress)"
            gy3.C87412m.m108593f(r6, r11)
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r6 = (com.tencent.p014mm.plugin.finder.view.FinderPostProgressView) r6
            r0.f40214q = r6
            r6 = 2131311487(0x7f093b7f, float:1.8241316E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.id.profile_upload_area)"
            gy3.C87412m.m108593f(r6, r11)
            r0.f40215r = r6
            r6 = 2131311403(0x7f093b2b, float:1.8241145E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.…profile_item_failed_area)"
            gy3.C87412m.m108593f(r6, r11)
            r0.f40216s = r6
            r6 = 2131311407(0x7f093b2f, float:1.8241153E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.id.profile_like_area)"
            gy3.C87412m.m108593f(r6, r11)
            r0.f40217t = r6
            r6 = 2131311409(0x7f093b31, float:1.8241157E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.id.profile_like_count_tv)"
            gy3.C87412m.m108593f(r6, r11)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.f40218u = r6
            r6 = 2131304673(0x7f0920e1, float:1.8227495E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.…_profile_item_reprint_iv)"
            gy3.C87412m.m108593f(r6, r11)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.f40211n = r6
            r6 = 2131312041(0x7f093da9, float:1.824244E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.id.ref_deleted_tips)"
            gy3.C87412m.m108593f(r6, r11)
            r0.f40213p = r6
            r6 = 2131310717(0x7f09387d, float:1.8239754E38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r11 = "itemView.findViewById(R.id.padding_view)"
            gy3.C87412m.m108593f(r6, r11)
            r0.f40219v = r6
            android.view.View r5 = r4.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f40207g = r5
            r5 = 2131311307(0x7f093acb, float:1.824095E38)
            android.view.View r5 = r4.findViewById(r5)
            r0.f40222y = r5
            r5 = 2131311398(0x7f093b26, float:1.8241135E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f40223z = r5
            r5 = 2131304668(0x7f0920dc, float:1.8227485E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f40221x = r4
            r6 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4 = 8
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            if (r39 == 0) goto L_0x0165
            java.util.Iterator r11 = r39.iterator()
        L_0x0137:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0163
            java.lang.Object r12 = r11.next()
            boolean r14 = r12 instanceof java.lang.Integer
            if (r14 == 0) goto L_0x0137
            r14 = 2001(0x7d1, float:2.804E-42)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            boolean r12 = gy3.C87412m.m108589b(r12, r14)
            if (r12 == 0) goto L_0x0137
            android.widget.TextView r1 = r0.f40221x
            if (r1 == 0) goto L_0x0e37
            boolean r2 = r3.mo3519t()
            if (r2 == 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            r6 = 8
        L_0x015e:
            r1.setVisibility(r6)
            goto L_0x0e37
        L_0x0163:
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x0165:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r3.mo3513o()
            java.lang.String r11 = r11.getDescription()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r18 = ""
            if (r11 == 0) goto L_0x0178
            r14 = r18
            goto L_0x0181
        L_0x0178:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r3.mo3513o()
            android.text.SpannableString r11 = r11.getDescriptionSpan()
            r14 = r11
        L_0x0181:
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = r0.f40207g
            if (r11 != 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            r11.setVisibility(r6)
        L_0x0189:
            android.widget.TextView r11 = r33.mo13767o()
            r11.setVisibility(r6)
            android.widget.TextView r11 = r33.mo13763k()
            r12 = 2
            r11.setMaxLines(r12)
            android.widget.TextView r11 = r0.f40221x
            if (r11 == 0) goto L_0x01a9
            boolean r16 = r3.mo3519t()
            if (r16 == 0) goto L_0x01a4
            r12 = 0
            goto L_0x01a6
        L_0x01a4:
            r12 = 8
        L_0x01a6:
            r11.setVisibility(r12)
        L_0x01a9:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r3.mo3513o()
            java.util.LinkedList r11 = r11.getMediaList()
            boolean r11 = r11.isEmpty()
            java.lang.String r12 = "Finder.Loader"
            if (r11 == 0) goto L_0x0293
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid item id "
            r1.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            long r7 = r2.getId()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
            java.lang.String r1 = r1.getDescription()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01f2
            android.widget.TextView r1 = r33.mo13763k()
            r1.setVisibility(r6)
            android.widget.TextView r1 = r33.mo13763k()
            r1.setText(r14)
            goto L_0x01f9
        L_0x01f2:
            android.widget.TextView r1 = r33.mo13763k()
            r1.setVisibility(r4)
        L_0x01f9:
            android.view.View r1 = r33.mo13764l()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r2.mo10233c(r5)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r10 = "onBindViewHolder"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r9 = "onBindViewHolder"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r1 = r33.mo13769q()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r15)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r1 = r33.mo13767o()
            vq1.w r2 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            int r2 = r2.mo89909h(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.setText(r2)
            goto L_0x0e37
        L_0x0293:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r3.mo3513o()
            boolean r11 = r11.isLiveFeed()
            if (r11 == 0) goto L_0x02ac
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r3.mo3513o()
            java.util.LinkedList r11 = r11.getLiveMediaList()
            java.lang.Object r11 = sx3.C110818d0.m150914L(r11)
            te3.rq2 r11 = (te3.C64689rq2) r11
            goto L_0x02ba
        L_0x02ac:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r3.mo3513o()
            java.util.LinkedList r11 = r11.getMediaList()
            java.lang.Object r11 = sx3.C110818d0.m150914L(r11)
            te3.rq2 r11 = (te3.C64689rq2) r11
        L_0x02ba:
            android.widget.ImageView r16 = r33.mo13765m()
            android.view.ViewGroup$LayoutParams r4 = r16.getLayoutParams()
            rx3.g r6 = r0.f40204B
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.graphics.Point r6 = (android.graphics.Point) r6
            int r6 = r6.x
            r16 = r14
            rx3.g r14 = r0.f40204B
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            android.graphics.Point r14 = (android.graphics.Point) r14
            int r14 = r14.y
            if (r14 < r6) goto L_0x02df
            goto L_0x02f4
        L_0x02df:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            gy3.C87412m.m108591d(r6)
            r1 = 2131165346(0x7f0700a2, float:1.7944907E38)
            float r1 = r6.getDimension(r1)
            int r1 = (int) r1
            int r6 = r14 - r1
        L_0x02f4:
            r1 = 2
            int r6 = r6 / r1
            er1.w3 r14 = er1.C58784w3.f168295a
            int r1 = r14.mo83921d(r3, r11, r6)
            r39 = r14
            java.lang.String r14 = "onBindViewHolder "
            if (r1 <= 0) goto L_0x0358
            r4.height = r1
            r20 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            r10.append(r2)
            java.lang.String r2 = " lpWidth:"
            r10.append(r2)
            int r2 = r4.width
            r10.append(r2)
            java.lang.String r2 = ", lpHeight:"
            r10.append(r2)
            int r2 = r4.height
            r10.append(r2)
            java.lang.String r2 = ", width:"
            r10.append(r2)
            r10.append(r6)
            java.lang.String r2 = ", height:"
            r10.append(r2)
            r10.append(r1)
            java.lang.String r1 = ", mediaWidth:"
            r10.append(r1)
            float r1 = r11.f185270h
            r10.append(r1)
            java.lang.String r1 = ", mediaHeight:"
            r10.append(r1)
            float r1 = r11.f185271i
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            android.widget.ImageView r1 = r33.mo13765m()
            r1.setLayoutParams(r4)
            goto L_0x0396
        L_0x0358:
            r20 = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r2)
            java.lang.String r2 = " width invalid:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", "
            r1.append(r2)
            android.widget.ImageView r4 = r33.mo13765m()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.width
            r1.append(r4)
            r1.append(r2)
            android.widget.ImageView r2 = r33.mo13765m()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r2 = r2.height
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
        L_0x0396:
            android.view.View r1 = r0.f40213p
            java.lang.String r2 = "deletedTip"
            r10 = 0
            if (r1 == 0) goto L_0x0e50
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r4.mo10233c(r15)
            java.lang.Object[] r22 = r4.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r1
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            r1 = 4
            r6 = 1
            if (r38 != 0) goto L_0x05f0
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
            long r21 = r4.getRefObjectFlag()
            r23 = 2
            int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x043d
            android.widget.ImageView r4 = r33.mo13765m()
            r13 = 2131099659(0x7f06000b, float:1.7811677E38)
            r4.setImageResource(r13)
            android.view.View r4 = r0.f40213p
            if (r4 == 0) goto L_0x0439
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r5)
            java.lang.Object[] r22 = r2.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r4
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r14 = 0
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4.setVisibility(r2)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05f0
        L_0x0439:
            gy3.C87412m.m108603p(r2)
            throw r10
        L_0x043d:
            r14 = 0
            int r2 = r11.f185268f
            if (r2 != r1) goto L_0x04e9
            java.lang.String r2 = r11.f185283w
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0499
            pl1.b0 r2 = new pl1.b0
            r4 = 0
            r17 = 0
            r19 = 12
            r21 = 0
            r36 = r11
            r11 = r2
            r29 = r12
            r10 = 2
            r12 = r36
            r30 = r39
            r1 = r16
            r23 = 0
            r14 = r4
            r4 = r15
            r15 = r17
            r16 = r19
            r17 = r21
            r11.<init>(r12, r13, r14, r15, r16, r17)
            bl3.r r11 = bl3.C39818r.f106831a
            bl3.r$a r12 = r11.mo62446e(r7)
            bl3.c r12 = r12.mo62447c(r8)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11871f2()
            android.widget.ImageView r13 = r33.mo13765m()
            bl3.r$a r11 = r11.mo62446e(r7)
            bl3.c r11 = r11.mo62447c(r8)
            pl1.s0 r11 = (pl1.C11990s0) r11
            n60.f r11 = r11.mo11867O2(r9)
            r12.mo85957c(r2, r13, r11)
            r32 = r4
            r31 = r5
            r4 = r7
            r10 = r9
            goto L_0x05fe
        L_0x0499:
            r30 = r39
            r36 = r11
            r29 = r12
            r4 = r15
            r1 = r16
            r10 = 2
            r23 = 0
            pl1.o0 r2 = new pl1.o0
            r11 = 0
            r12 = 4
            r13 = 0
            r14 = r4
            r15 = 8
            r4 = r2
            r31 = r5
            r5 = r36
            r15 = 1
            r6 = r20
            r38 = r14
            r14 = r7
            r7 = r11
            r11 = r8
            r8 = r12
            r12 = r9
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r14)
            bl3.c r5 = r5.mo62447c(r11)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            android.widget.ImageView r6 = r33.mo13765m()
            bl3.r$a r4 = r4.mo62446e(r14)
            bl3.c r4 = r4.mo62447c(r11)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r12)
            r5.mo85957c(r2, r6, r4)
            r4 = r36
            goto L_0x05a8
        L_0x04e9:
            r30 = r39
            r31 = r5
            r14 = r7
            r36 = r11
            r29 = r12
            r38 = r15
            r1 = r16
            r10 = 2
            r15 = 1
            r11 = r8
            r12 = r9
            r4 = 9
            if (r2 != r4) goto L_0x05b2
            er1.j4 r2 = er1.C58739j4.f168176a
            r4 = r36
            java.lang.String r2 = r2.mo83674B(r4, r10)
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x050e
            r6 = 1
            goto L_0x050f
        L_0x050e:
            r6 = 0
        L_0x050f:
            if (r6 == 0) goto L_0x0512
            goto L_0x052f
        L_0x0512:
            java.lang.String r2 = r4.f185283w
            if (r2 == 0) goto L_0x052d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = r4.f185234A
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            if (r2 != 0) goto L_0x052f
        L_0x052d:
            r2 = r18
        L_0x052f:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x054c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r4.f185267e
            r2.append(r5)
            java.lang.String r5 = r4.f185288z
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x054c:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r3.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x055c
            int r5 = r5.f182394f
            if (r5 != r15) goto L_0x055c
            r6 = 1
            goto L_0x055d
        L_0x055c:
            r6 = 0
        L_0x055d:
            if (r6 == 0) goto L_0x058a
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r6 = r5.mo62446e(r14)
            bl3.c r6 = r6.mo62447c(r11)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            pl1.n0 r7 = new pl1.n0
            r7.<init>(r2, r13)
            android.widget.ImageView r2 = r33.mo13765m()
            bl3.r$a r5 = r5.mo62446e(r14)
            bl3.c r5 = r5.mo62447c(r11)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r12)
            r6.mo85957c(r7, r2, r5)
            goto L_0x05a8
        L_0x058a:
            java.lang.Class<tf0.q1> r5 = tf0.C13887q1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r6 = "getService(IFinderCommonLiveService::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            r23 = r5
            tf0.q1 r23 = (tf0.C13887q1) r23
            android.widget.ImageView r24 = r33.mo13765m()
            r26 = 0
            r27 = 4
            r28 = 0
            r25 = r2
            tf0.C13887q1.C13888a.m13309e(r23, r24, r25, r26, r27, r28)
        L_0x05a8:
            r32 = r38
            r36 = r4
            r9 = r11
            r10 = r12
            r4 = r14
            r7 = 8
            goto L_0x0601
        L_0x05b2:
            r4 = r36
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r5 = r2.mo62446e(r14)
            bl3.c r5 = r5.mo62447c(r11)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            pl1.b0 r6 = new pl1.b0
            r7 = 0
            r8 = 0
            r16 = 12
            r17 = 0
            r9 = r11
            r11 = r6
            r10 = r12
            r12 = r4
            r32 = r38
            r4 = r14
            r14 = r7
            r7 = 8
            r15 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            android.widget.ImageView r8 = r33.mo13765m()
            bl3.r$a r2 = r2.mo62446e(r4)
            bl3.c r2 = r2.mo62447c(r9)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r10)
            r5.mo85957c(r6, r8, r2)
            goto L_0x0601
        L_0x05f0:
            r30 = r39
            r31 = r5
            r4 = r7
            r10 = r9
            r36 = r11
            r29 = r12
            r32 = r15
            r1 = r16
        L_0x05fe:
            r7 = 8
            r9 = r8
        L_0x0601:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            java.lang.String r2 = r2.getDescription()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x061f
            android.widget.TextView r2 = r33.mo13763k()
            r5 = 0
            r2.setVisibility(r5)
            android.widget.TextView r2 = r33.mo13763k()
            r2.setText(r1)
            goto L_0x0627
        L_0x061f:
            r5 = 0
            android.widget.TextView r1 = r33.mo13763k()
            r1.setVisibility(r7)
        L_0x0627:
            vq1.w r1 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            int r1 = r1.mo89909h(r2)
            if (r1 <= 0) goto L_0x063d
            r2 = 2
            java.lang.String r1 = er1.C7878t0.m8034c(r2, r1)
            goto L_0x063f
        L_0x063d:
            java.lang.String r1 = "0"
        L_0x063f:
            android.widget.TextView r2 = r33.mo13767o()
            r2.setText(r1)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r1 = r0.f40209i
            if (r1 == 0) goto L_0x0e49
            r1.setVisibility(r7)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r1 = r0.f40210j
            if (r1 == 0) goto L_0x0e42
            r1.setVisibility(r7)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r1 = r33.mo13770r()
            r1.setVisibility(r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
            int r1 = r1.getMediaType()
            r2 = 2
            if (r1 == r2) goto L_0x067f
            r2 = 4
            if (r1 == r2) goto L_0x0673
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r2 = r33.mo13770r()
            r2.setVisibility(r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x067c
        L_0x0673:
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r2 = r33.mo13770r()
            r2.setVisibility(r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x067c:
            r2 = r34
            goto L_0x06eb
        L_0x067f:
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r2 = r33.mo13770r()
            r2.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r2 = r33.mo13770r()
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r3.mo3513o()
            java.util.LinkedList r6 = r6.getMediaList()
            int r6 = r6.size()
            r2.f21258e = r6
            r2 = r34
            android.content.Context r6 = r2.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r6 = r6.getDimension(r8)
            int r6 = (int) r6
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r8 = r33.mo13770r()
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            android.widget.TextView r11 = r33.mo13763k()
            int r11 = r11.getVisibility()
            if (r11 != r7) goto L_0x06d2
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r11 = r33.mo13770r()
            r11.setPadding(r5, r6, r5, r6)
            android.content.Context r6 = r2.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2131165329(0x7f070091, float:1.7944872E38)
            float r6 = r6.getDimension(r11)
            int r6 = (int) r6
            r8.height = r6
            goto L_0x06e9
        L_0x06d2:
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r11 = r33.mo13770r()
            r11.setPadding(r5, r6, r5, r5)
            android.content.Context r6 = r2.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2131165307(0x7f07007b, float:1.7944827E38)
            float r6 = r6.getDimension(r11)
            int r6 = (int) r6
            r8.height = r6
        L_0x06e9:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x06eb:
            boolean r6 = r0.mo13771s(r3)
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
            r11 = 2131100166(0x7f060206, float:1.7812706E38)
            if (r6 == 0) goto L_0x0753
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r0.f40207g
            if (r4 == 0) goto L_0x0701
            r6 = 2131756028(0x7f1003fc, float:1.9142952E38)
            r4.setImageResource(r6)
        L_0x0701:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r0.f40207g
            if (r4 == 0) goto L_0x0712
            android.content.Context r6 = r2.f173499A
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r11)
            r4.setIconColor(r6)
        L_0x0712:
            vp1.e r4 = vp1.C65834e.f189316a
            long r9 = r3.getItemId()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo89871e(r9)
            if (r4 == 0) goto L_0x0723
            int r6 = r4.getReadCount()
            goto L_0x0724
        L_0x0723:
            r6 = 0
        L_0x0724:
            android.widget.TextView r4 = r33.mo13767o()
            long r9 = (long) r6
            java.lang.String r6 = er1.C7878t0.m8036e(r9)
            r4.setText(r6)
            android.widget.TextView r4 = r33.mo13767o()
            android.content.Context r6 = r2.f173499A
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r11)
            r4.setTextColor(r6)
            android.view.View r4 = r33.mo13766n()
            android.content.Context r2 = r2.f173499A
            r6 = 2131233065(0x7f080929, float:1.8082257E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r6)
            r4.setBackground(r2)
            goto L_0x07fe
        L_0x0753:
            wp1.j r6 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r12.getFeedObject()
            int r12 = r12.objectType
            te3.if1 r6 = r6.mo14351c(r12)
            if (r6 == 0) goto L_0x07b4
            java.lang.String r12 = r6.f135269o
            if (r12 == 0) goto L_0x0772
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0770
            goto L_0x0772
        L_0x0770:
            r12 = 0
            goto L_0x0773
        L_0x0772:
            r12 = 1
        L_0x0773:
            if (r12 == 0) goto L_0x0776
            goto L_0x07b4
        L_0x0776:
            com.tencent.mm.ui.widget.imageview.WeImageView r12 = r0.f40207g
            if (r12 == 0) goto L_0x07a4
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r14 = r13.mo62446e(r4)
            bl3.c r14 = r14.mo62447c(r9)
            pl1.s0 r14 = (pl1.C11990s0) r14
            k60.d r14 = r14.mo11871f2()
            pl1.n0 r15 = new pl1.n0
            java.lang.String r6 = r6.f135269o
            r11 = r20
            r15.<init>(r6, r11)
            bl3.r$a r4 = r13.mo62446e(r4)
            bl3.c r4 = r4.mo62447c(r9)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r10)
            r14.mo85957c(r15, r12, r4)
        L_0x07a4:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r0.f40207g
            if (r4 == 0) goto L_0x07fe
            android.content.Context r2 = r2.f173499A
            int r2 = kg3.C76577a.m92153d(r2, r8)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r4.setColorFilter(r2, r6)
            goto L_0x07fe
        L_0x07b4:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r0.f40207g
            if (r4 == 0) goto L_0x07cc
            r6 = r30
            r9 = 2
            java.lang.Integer r6 = r6.mo83917b0(r9, r5)
            if (r6 == 0) goto L_0x07c6
            int r6 = r6.intValue()
            goto L_0x07c9
        L_0x07c6:
            r6 = 2131755879(0x7f100367, float:1.914265E38)
        L_0x07c9:
            r4.setImageResource(r6)
        L_0x07cc:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r0.f40207g
            if (r4 == 0) goto L_0x07dd
            android.content.Context r6 = r2.f173499A
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r8)
            r4.setIconColor(r6)
        L_0x07dd:
            android.view.View r4 = r33.mo13766n()
            android.content.Context r6 = r2.f173499A
            r9 = 2131233061(0x7f080925, float:1.8082249E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r9)
            r4.setBackground(r6)
            android.widget.TextView r4 = r33.mo13767o()
            android.content.Context r2 = r2.f173499A
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r8)
            r4.setTextColor(r2)
        L_0x07fe:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            long r9 = r2.getRefObjectFlag()
            r11 = 0
            java.lang.String r2 = "reprintIv"
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x081b
            android.widget.ImageView r4 = r0.f40211n
            if (r4 == 0) goto L_0x0816
            r4.setVisibility(r5)
            goto L_0x0822
        L_0x0816:
            gy3.C87412m.m108603p(r2)
            r1 = 0
            throw r1
        L_0x081b:
            android.widget.ImageView r4 = r0.f40211n
            if (r4 == 0) goto L_0x0e3d
            r4.setVisibility(r7)
        L_0x0822:
            android.view.View r2 = r33.mo13766n()
            k20.a r4 = new k20.a
            r4.<init>()
            r6 = r31
            r4.mo10233c(r6)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.animation.ValueAnimator r2 = r0.f40220w
            if (r2 == 0) goto L_0x0869
            r2.cancel()
        L_0x0869:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            boolean r2 = r2.isPostFailed()
            if (r2 == 0) goto L_0x0932
            android.view.View r2 = r33.mo13764l()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r6)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r2 = r33.mo13769q()
            k20.a r4 = new k20.a
            r4.<init>()
            r9 = r32
            r4.mo10233c(r9)
            java.lang.Object[] r20 = r4.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r2
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            android.view.View r2 = r33.mo13766n()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r9)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0aa4
        L_0x0932:
            r9 = r32
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            boolean r2 = r2.isPostFinish()
            if (r2 == 0) goto L_0x09bd
            android.view.View r2 = r33.mo13764l()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r9)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r2 = r33.mo13769q()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r9)
            java.lang.Object[] r20 = r4.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r2
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0aa4
        L_0x09bd:
            android.view.View r2 = r33.mo13764l()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r9)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r2 = r33.mo13766n()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r9)
            java.lang.Object[] r21 = r4.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r2
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            android.view.View r2 = r33.mo13769q()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r6)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r2 = r33.mo13768p()
            int r2 = r2.getProgress()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
            te3.tq2 r4 = r4.getPostInfo()
            int r4 = r4.f185649h
            if (r2 <= r4) goto L_0x0aa6
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r2 = r33.mo13768p()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
            te3.tq2 r4 = r4.getPostInfo()
            int r4 = r4.f185649h
            r2.setProgress(r4)
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r2 = r33.mo13768p()
            r2.invalidate()
        L_0x0aa4:
            r10 = 1
            goto L_0x0ae1
        L_0x0aa6:
            r2 = 2
            int[] r2 = new int[r2]
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r4 = r33.mo13768p()
            int r4 = r4.getProgress()
            r2[r5] = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
            te3.tq2 r4 = r4.getPostInfo()
            int r4 = r4.f185649h
            r10 = 1
            r2[r10] = r4
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            r0.f40220w = r2
            gy3.C87412m.m108591d(r2)
            ve1.d7 r4 = new ve1.d7
            r4.<init>(r0)
            r2.addUpdateListener(r4)
            android.animation.ValueAnimator r2 = r0.f40220w
            gy3.C87412m.m108591d(r2)
            r11 = 400(0x190, double:1.976E-321)
            android.animation.ValueAnimator r2 = r2.setDuration(r11)
            if (r2 == 0) goto L_0x0ae1
            r2.start()
        L_0x0ae1:
            android.view.View r2 = r33.mo13764l()
            int r2 = r2.getVisibility()
            java.lang.String r4 = "paddingArea"
            if (r2 != r7) goto L_0x0b01
            android.view.View r2 = r33.mo13769q()
            int r2 = r2.getVisibility()
            if (r2 != r7) goto L_0x0b01
            android.widget.TextView r2 = r33.mo13763k()
            int r2 = r2.getVisibility()
            if (r2 == r7) goto L_0x0b09
        L_0x0b01:
            er1.j4 r2 = er1.C58739j4.f168176a
            boolean r2 = r2.mo83686O(r3)
            if (r2 == 0) goto L_0x0b4e
        L_0x0b09:
            android.view.View r11 = r0.f40219v
            if (r11 == 0) goto L_0x0b49
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r9)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0b8d
        L_0x0b49:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        L_0x0b4e:
            android.view.View r11 = r0.f40219v
            if (r11 == 0) goto L_0x0e38
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r6)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0b8d:
            boolean r2 = r0.mo13771s(r3)
            r4 = 2131756180(0x7f100494, float:1.914326E38)
            if (r2 == 0) goto L_0x0cc3
            android.view.View r11 = r0.f40222y
            if (r11 != 0) goto L_0x0b9b
            goto L_0x0bd6
        L_0x0b9b:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r9)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0bd6:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            boolean r2 = r2.isPrivate()
            if (r2 == 0) goto L_0x0c4e
            android.widget.ImageView r2 = r0.f40223z
            if (r2 == 0) goto L_0x0c0b
            android.content.Context r4 = r2.getContext()
            r7 = 2131755651(0x7f100283, float:1.9142187E38)
            android.widget.ImageView r8 = r0.f40223z
            if (r8 == 0) goto L_0x0c03
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L_0x0c03
            android.content.res.Resources r8 = r8.getResources()
            if (r8 == 0) goto L_0x0c03
            r9 = 2131100166(0x7f060206, float:1.7812706E38)
            int r8 = r8.getColor(r9)
            goto L_0x0c04
        L_0x0c03:
            r8 = 0
        L_0x0c04:
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r7, r8)
            r2.setImageDrawable(r4)
        L_0x0c0b:
            android.view.View r11 = r0.f40222y
            if (r11 != 0) goto L_0x0c11
            goto L_0x0d72
        L_0x0c11:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r6)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0d72
        L_0x0c4e:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            int r2 = r2.getStickyTime()
            if (r2 <= 0) goto L_0x0d72
            android.widget.ImageView r2 = r0.f40223z
            if (r2 == 0) goto L_0x0c80
            android.content.Context r7 = r2.getContext()
            android.widget.ImageView r8 = r0.f40223z
            if (r8 == 0) goto L_0x0c78
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L_0x0c78
            android.content.res.Resources r8 = r8.getResources()
            if (r8 == 0) goto L_0x0c78
            r9 = 2131100166(0x7f060206, float:1.7812706E38)
            int r8 = r8.getColor(r9)
            goto L_0x0c79
        L_0x0c78:
            r8 = 0
        L_0x0c79:
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r7, r4, r8)
            r2.setImageDrawable(r4)
        L_0x0c80:
            android.view.View r11 = r0.f40222y
            if (r11 != 0) goto L_0x0c86
            goto L_0x0d72
        L_0x0c86:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r6)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0d72
        L_0x0cc3:
            android.view.View r2 = r0.f40222y
            if (r2 != 0) goto L_0x0cc8
            goto L_0x0d03
        L_0x0cc8:
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r9)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r2
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0d03:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            int r2 = r2.getStickyTime()
            if (r2 <= 0) goto L_0x0d72
            android.widget.ImageView r2 = r0.f40223z
            if (r2 == 0) goto L_0x0d32
            android.content.Context r7 = r2.getContext()
            android.widget.ImageView r9 = r0.f40223z
            if (r9 == 0) goto L_0x0d2a
            android.content.Context r9 = r9.getContext()
            if (r9 == 0) goto L_0x0d2a
            android.content.res.Resources r9 = r9.getResources()
            if (r9 == 0) goto L_0x0d2a
            int r8 = r9.getColor(r8)
            goto L_0x0d2b
        L_0x0d2a:
            r8 = 0
        L_0x0d2b:
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r7, r4, r8)
            r2.setImageDrawable(r4)
        L_0x0d32:
            android.view.View r11 = r0.f40222y
            if (r11 != 0) goto L_0x0d37
            goto L_0x0d72
        L_0x0d37:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r6)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0d72:
            er1.j4 r2 = er1.C58739j4.f168176a
            boolean r2 = r2.mo83686O(r3)
            if (r2 == 0) goto L_0x0d7d
            r0.mo13762j(r3)
        L_0x0d7d:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            boolean r2 = r2.isPrivate()
            if (r2 != 0) goto L_0x0d93
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            int r2 = r2.getStickyTime()
            if (r2 <= 0) goto L_0x0d93
            r6 = 1
            goto L_0x0d94
        L_0x0d93:
            r6 = 0
        L_0x0d94:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            java.util.LinkedList r2 = r2.getMediaList()
            r2.isEmpty()
            android.view.View r2 = r0.f40205e
            if (r2 == 0) goto L_0x0de9
            r4 = 2131302530(0x7f091882, float:1.8223149E38)
            android.widget.TextView r5 = r33.mo13767o()
            java.lang.CharSequence r5 = r5.getText()
            if (r5 != 0) goto L_0x0db2
            r5 = r18
        L_0x0db2:
            r2.setTag(r4, r5)
            r4 = 2131302517(0x7f091875, float:1.8223122E38)
            android.widget.TextView r5 = r33.mo13763k()
            java.lang.CharSequence r5 = r5.getText()
            if (r5 != 0) goto L_0x0dc4
            r5 = r18
        L_0x0dc4:
            r2.setTag(r4, r5)
            r4 = 2131302529(0x7f091881, float:1.8223147E38)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r2.setTag(r4, r5)
            r4 = 2131302569(0x7f0918a9, float:1.8223228E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setTag(r4, r1)
            r1 = 2131302528(0x7f091880, float:1.8223145E38)
            boolean r4 = r0.mo13771s(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.setTag(r1, r4)
        L_0x0de9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mediaType:"
            r1.append(r2)
            r11 = r36
            int r2 = r11.f185268f
            r1.append(r2)
            java.lang.String r2 = ",liveStatus:"
            r1.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            te3.c21 r2 = r2.getLiveInfo()
            if (r2 == 0) goto L_0x0e10
            int r2 = r2.f182394f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0e11
        L_0x0e10:
            r2 = 0
        L_0x0e11:
            r1.append(r2)
            java.lang.String r2 = ",contact liveStatus:"
            r1.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.getRefObjectContact()
            if (r2 == 0) goto L_0x0e2a
            int r2 = r2.liveStatus
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            goto L_0x0e2b
        L_0x0e2a:
            r10 = 0
        L_0x0e2b:
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r2 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x0e37:
            return
        L_0x0e38:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        L_0x0e3d:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e42:
            r1 = 0
            java.lang.String r2 = "liveFinishView"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e49:
            r1 = 0
            java.lang.String r2 = "feedOnliveLayout"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0e50:
            r1 = r10
            gy3.C87412m.m108603p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14506e7.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final void mo13762j(BaseFinderFeed baseFinderFeed) {
        Class cls = C60606n.class;
        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
        if (liveInfo != null && liveInfo.f182394f == 1) {
            FinderLiveOnliveWidget finderLiveOnliveWidget = this.f40209i;
            if (finderLiveOnliveWidget != null) {
                finderLiveOnliveWidget.setVisibility(0);
                C60606n nVar = (C60606n) C86312j.m106911c(cls);
                FinderLiveOnliveWidget finderLiveOnliveWidget2 = this.f40209i;
                if (finderLiveOnliveWidget2 != null) {
                    nVar.Ej0(finderLiveOnliveWidget2, false, ((C60606n) C86312j.m106911c(cls)).mo85008I1(baseFinderFeed.mo3513o().getLiveInfo()) ? 2 : 0);
                    FinderLiveOnliveWidget finderLiveOnliveWidget3 = this.f40210j;
                    if (finderLiveOnliveWidget3 != null) {
                        finderLiveOnliveWidget3.setVisibility(8);
                        WeImageView weImageView = this.f40207g;
                        if (weImageView != null) {
                            weImageView.setVisibility(8);
                        }
                        C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
                        int i = liveInfo2 != null ? liveInfo2.f182403q : 0;
                        if (i > 0) {
                            mo13767o().setText(MMApplicationContext.getContext().getString(C0966R.string.dvm, new Object[]{C7878t0.m8034c(2, i)}));
                        } else {
                            mo13767o().setVisibility(8);
                            View n = mo13766n();
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view = n;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert", "bindLive", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            n.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderProfileFeedConvert", "bindLive", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        C87412m.m108603p("liveFinishView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("feedOnliveLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("feedOnliveLayout");
                throw null;
            }
        } else {
            FinderLiveOnliveWidget finderLiveOnliveWidget4 = this.f40209i;
            if (finderLiveOnliveWidget4 != null) {
                finderLiveOnliveWidget4.setVisibility(8);
                FinderLiveOnliveWidget finderLiveOnliveWidget5 = this.f40210j;
                if (finderLiveOnliveWidget5 != null) {
                    finderLiveOnliveWidget5.setVisibility(0);
                } else {
                    C87412m.m108603p("liveFinishView");
                    throw null;
                }
            } else {
                C87412m.m108603p("feedOnliveLayout");
                throw null;
            }
        }
        mo13763k().setVisibility(8);
    }

    /* renamed from: k */
    public final TextView mo13763k() {
        TextView textView = this.f40212o;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("descTv");
        throw null;
    }

    /* renamed from: l */
    public final View mo13764l() {
        View view = this.f40216s;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("failedArea");
        throw null;
    }

    /* renamed from: m */
    public final ImageView mo13765m() {
        ImageView imageView = this.f40206f;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("imageView");
        throw null;
    }

    /* renamed from: n */
    public final View mo13766n() {
        View view = this.f40217t;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("likeArea");
        throw null;
    }

    /* renamed from: o */
    public final TextView mo13767o() {
        TextView textView = this.f40218u;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("likeCountTv");
        throw null;
    }

    /* renamed from: p */
    public final FinderPostProgressView mo13768p() {
        FinderPostProgressView finderPostProgressView = this.f40214q;
        if (finderPostProgressView != null) {
            return finderPostProgressView;
        }
        C87412m.m108603p("progress");
        throw null;
    }

    /* renamed from: q */
    public final View mo13769q() {
        View view = this.f40215r;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("progressArea");
        throw null;
    }

    /* renamed from: r */
    public final ImageIndicatorView mo13770r() {
        ImageIndicatorView imageIndicatorView = this.f40208h;
        if (imageIndicatorView != null) {
            return imageIndicatorView;
        }
        C87412m.m108603p("tagImageView");
        throw null;
    }

    /* renamed from: s */
    public final boolean mo13771s(BaseFinderFeed baseFinderFeed) {
        C58969q l = baseFinderFeed.mo3507l();
        return C112551y.m153810j(l != null ? l.field_username : null, C66785b.f191882e.mo90662O5(), false, 2, (Object) null) && C87412m.m108589b(this.f40203A, Boolean.TRUE);
    }
}
