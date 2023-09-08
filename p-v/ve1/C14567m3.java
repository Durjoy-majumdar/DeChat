package ve1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderFeedUiActionEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60171g1;
import jq3.C60905o;
import rx3.C13601g;
import rx3.C36568h;
import up1.C37521f;

/* renamed from: ve1.m3 */
public final class C14567m3 extends UIComponent {

    /* renamed from: d */
    public final C13601g f40362d = C36568h.m40985a(new C14569b(this));

    /* renamed from: e */
    public final C13601g f40363e = C36568h.m40985a(C14568a.f40364d);

    /* renamed from: ve1.m3$a */
    public static final class C14568a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14568a f40364d = new C14568a();

        public C14568a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return Integer.valueOf(C37521f.f99228M.mo60266n().intValue() * 1000);
        }
    }

    /* renamed from: ve1.m3$b */
    public static final class C14569b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C14567m3 f40365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14569b(C14567m3 m3Var) {
            super(0);
            this.f40365d = m3Var;
        }

        public Object invoke() {
            Intent intent = this.f40365d.getActivity().getIntent();
            boolean z = true;
            if (intent == null || !intent.getBooleanExtra("is_from_ad", false)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14567m3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: f3 */
    public static void m13874f3(C14567m3 m3Var, int i, long j, int i2, C60905o oVar, int i3, int i4, int i5, Object obj) {
        int i6 = 0;
        if ((i5 & 16) != 0) {
            i3 = 0;
        }
        if ((i5 & 32) != 0) {
            i4 = 0;
        }
        m3Var.getClass();
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
        int i7 = i != 1 ? i != 2 ? i != 3 ? 0 : 30000 : 30001 : 30002;
        FinderFeedUiActionEvent finderFeedUiActionEvent = new FinderFeedUiActionEvent();
        FinderFeedUiActionEvent.C1047a aVar = finderFeedUiActionEvent.f9202d;
        aVar.f9203a = j;
        aVar.f9204b = i2;
        aVar.f9205c = i7;
        if (finderVideoLayout != null) {
            i6 = finderVideoLayout.getVideoDurationSec();
        }
        aVar.f9206d = i6;
        finderFeedUiActionEvent.f9202d.f9207e = (int) ((finderVideoLayout != null ? finderVideoLayout.getCurrentPosMs() : 0) / ((long) 1000));
        FinderFeedUiActionEvent.C1047a aVar2 = finderFeedUiActionEvent.f9202d;
        aVar2.f9208f = i3;
        aVar2.f9209g = i4;
        finderFeedUiActionEvent.publish();
    }

    /* renamed from: c3 */
    public final boolean mo13812c3(C60905o oVar) {
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
        FinderThumbPlayerProxy finderThumbPlayerProxy = null;
        C60171g1 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
        if (videoView instanceof FinderThumbPlayerProxy) {
            finderThumbPlayerProxy = (FinderThumbPlayerProxy) videoView;
        }
        return finderThumbPlayerProxy != null && finderThumbPlayerProxy.getCurrentPlayMs() > ((long) ((Number) this.f40363e.getValue()).intValue());
    }

    /* renamed from: d3 */
    public final boolean mo13813d3() {
        return ((Boolean) this.f40362d.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: com.tencent.mm.plugin.finder.ui.ShareRelPresenter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.tencent.mm.ui.widget.imageview.WeImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: android.widget.TextView} */
    /* JADX WARNING: type inference failed for: r1v14, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r13v8, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r13v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13814e3(jq3.C60905o r26, int r27, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r28, int r29, kf1.C10008v1 r30, fy3.C32224a<rx3.C13598b0> r31) {
        /*
            r25 = this;
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "contract"
            gy3.C87412m.m108594g(r11, r0)
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r1 = r7.f173499A
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            bl3.r$a r0 = r0.mo62444c(r1)
            java.lang.Class<ht1.y2> r1 = ht1.C8817y2.class
            bl3.c r0 = r0.mo62447c(r1)
            ht1.y2 r0 = (ht1.C8817y2) r0
            ht1.z2 r0 = r0.mo9643v2()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r28.mo3513o()
            long r1 = r1.getId()
            r12 = 2
            com.tencent.mm.plugin.finder.feed.model.u0 r1 = r0.mo9654t1(r1, r12)
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.model.C2778b
            if (r2 == 0) goto L_0x004b
            com.tencent.mm.plugin.finder.feed.model.b r1 = (com.tencent.p014mm.plugin.finder.feed.model.C2778b) r1
            r14 = r1
            goto L_0x004c
        L_0x004b:
            r14 = 0
        L_0x004c:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r28.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r1 = r1.adFlag
            r1 = r1 & r12
            r15 = 1
            if (r1 != r12) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            if (r1 != 0) goto L_0x006c
            if (r14 == 0) goto L_0x006c
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r28.mo3513o()
            long r1 = r1.getId()
            r0.mo9644N(r1, r12)
        L_0x006c:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r28.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            int r0 = r0.adFlag
            r0 = r0 & r12
            if (r0 != r12) goto L_0x007b
            r0 = 1
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            if (r14 == 0) goto L_0x0081
            int r1 = r14.f13957f
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "refreshAdFollow position:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = " adapterPos: "
            r2.append(r3)
            int r3 = r26.mo17363j()
            r2.append(r3)
            java.lang.String r3 = " payloadType:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " adType:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderFeedSnsAdUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r4 = 2131302665(0x7f091909, float:1.8223423E38)
            android.view.View r2 = r7.mo85812D(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r4 = r7.f44854d
            r13 = 2131302830(0x7f0919ae, float:1.8223757E38)
            android.view.View r4 = r4.findViewById(r13)
            r13 = 0
            if (r4 == 0) goto L_0x00ea
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r5 = "finder_feed_full_footer_layout  translationY :"
            r12.append(r5)
            float r5 = r4.getTranslationY()
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            boolean r5 = r25.mo13813d3()
            if (r5 == 0) goto L_0x00ea
            r4.setTranslationY(r13)
        L_0x00ea:
            android.view.View r4 = r7.f44854d
            r5 = 2131304750(0x7f09212e, float:1.8227651E38)
            android.view.View r4 = r4.findViewById(r5)
            if (r4 == 0) goto L_0x0116
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "finder_seek_bar_footer_layout  translationY :"
            r5.append(r12)
            float r12 = r4.getTranslationY()
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            boolean r5 = r25.mo13813d3()
            if (r5 == 0) goto L_0x0116
            r4.setTranslationY(r13)
        L_0x0116:
            if (r2 == 0) goto L_0x0139
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "adTipContainer translationY :"
            r4.append(r5)
            float r5 = r2.getTranslationY()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            boolean r3 = r25.mo13813d3()
            if (r3 == 0) goto L_0x0139
            r2.setTranslationY(r13)
        L_0x0139:
            boolean r3 = r25.mo13813d3()
            r13 = 2131302664(0x7f091908, float:1.822342E38)
            r12 = 9
            r4 = 8
            if (r3 == 0) goto L_0x014c
            if (r8 != 0) goto L_0x014c
            if (r0 == 0) goto L_0x014c
            if (r1 == r4) goto L_0x017a
        L_0x014c:
            boolean r0 = r11 instanceof com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter
            if (r0 == 0) goto L_0x0154
            r0 = r11
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r0 = (com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter) r0
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            if (r0 == 0) goto L_0x015d
            boolean r0 = r0.f17215U
            if (r0 != r15) goto L_0x015d
            r0 = 1
            goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            if (r0 != 0) goto L_0x017a
            if (r14 == 0) goto L_0x0168
            int r0 = r14.f13957f
            if (r0 != r12) goto L_0x0168
            r0 = 1
            goto L_0x0169
        L_0x0168:
            r0 = 0
        L_0x0169:
            if (r0 != 0) goto L_0x0171
            if (r2 != 0) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            r2.setVisibility(r4)
        L_0x0171:
            r0 = 0
            r1 = 2131232395(0x7f08068b, float:1.8080898E38)
            r2 = 8
            r15 = 0
            goto L_0x0352
        L_0x017a:
            boolean r0 = r11 instanceof com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter
            if (r0 == 0) goto L_0x0182
            r0 = r11
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r0 = (com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter) r0
            goto L_0x0183
        L_0x0182:
            r0 = 0
        L_0x0183:
            if (r0 == 0) goto L_0x01c8
            boolean r1 = r0.f17215U
            if (r1 != 0) goto L_0x01c6
            kf1.f r1 = r0.f29964g
            if (r1 == 0) goto L_0x019e
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            if (r1 == 0) goto L_0x019e
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x019e
            int r1 = r1.getItemCount()
            goto L_0x019f
        L_0x019e:
            r1 = 0
        L_0x019f:
            if (r1 <= 0) goto L_0x01c6
            kf1.f r3 = r0.f29964g
            if (r3 == 0) goto L_0x01c6
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            if (r3 == 0) goto L_0x01c6
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            if (r3 == 0) goto L_0x01c6
            rx3.l r5 = new rx3.l
            r16 = 25
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
            r16 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r5.<init>(r12, r4)
            r4 = 0
            r3.notifyItemRangeChanged(r4, r1, r5)
        L_0x01c6:
            r0.f17215U = r15
        L_0x01c8:
            if (r2 == 0) goto L_0x01d1
            android.view.View r0 = r2.findViewById(r13)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            if (r2 == 0) goto L_0x01de
            r4 = 2131302663(0x7f091907, float:1.8223418E38)
            android.view.View r1 = r2.findViewById(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            goto L_0x01e2
        L_0x01de:
            r4 = 2131302663(0x7f091907, float:1.8223418E38)
            r1 = 0
        L_0x01e2:
            fe1.d$b r18 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r28.mo3513o()
            java.lang.String r3 = r3.field_username
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r28.mo3513o()
            te3.cg r5 = r5.getBizInfo()
            if (r5 == 0) goto L_0x01f9
            java.lang.String r5 = r5.f182468d
            r20 = r5
            goto L_0x01fb
        L_0x01f9:
            r20 = 0
        L_0x01fb:
            r21 = 0
            r22 = 0
            r23 = 12
            r24 = 0
            r19 = r3
            boolean r3 = fe1.C58961d.C58963b.m68836h(r18, r19, r20, r21, r22, r23, r24)
            if (r3 != 0) goto L_0x02e9
            if (r2 != 0) goto L_0x020f
            r5 = 0
            goto L_0x0213
        L_0x020f:
            r5 = 0
            r2.setVisibility(r5)
        L_0x0213:
            vq1.w r3 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r28.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r12.getFeedObject()
            rx3.l r3 = r3.mo89908g(r12)
            A r12 = r3.f38555d
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            B r3 = r3.f38556e
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            if (r12 != 0) goto L_0x0244
            r3 = 3
            if (r10 == r3) goto L_0x0244
            r3 = 10
            if (r10 != r3) goto L_0x0240
            boolean r3 = r25.mo13812c3(r26)
            if (r3 == 0) goto L_0x0240
            goto L_0x0244
        L_0x0240:
            r3 = 2131232395(0x7f08068b, float:1.8080898E38)
            goto L_0x0247
        L_0x0244:
            r3 = 2131232310(0x7f080636, float:1.8080726E38)
        L_0x0247:
            if (r2 != 0) goto L_0x024a
            goto L_0x0253
        L_0x024a:
            android.content.Context r12 = r7.f173499A
            android.graphics.drawable.Drawable r3 = r12.getDrawable(r3)
            r2.setBackground(r3)
        L_0x0253:
            if (r1 != 0) goto L_0x0258
            r12 = 8
            goto L_0x025d
        L_0x0258:
            r12 = 8
            r1.setVisibility(r12)
        L_0x025d:
            if (r0 == 0) goto L_0x0265
            r1 = 2131826668(0x7f1117ec, float:1.9286227E38)
            r0.setText(r1)
        L_0x0265:
            if (r0 == 0) goto L_0x0277
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131100935(0x7f060507, float:1.7814265E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L_0x0277:
            if (r2 == 0) goto L_0x0290
            ve1.o3 r3 = new ve1.o3
            r0 = r3
            r1 = r26
            r12 = r2
            r2 = r28
            r13 = r3
            r3 = r25
            r4 = r27
            r15 = 0
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r12.setOnClickListener(r13)
            goto L_0x0291
        L_0x0290:
            r15 = 0
        L_0x0291:
            android.view.View r0 = r7.f44854d
            r1 = 2131305072(0x7f092270, float:1.8228305E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 != 0) goto L_0x029d
            goto L_0x02df
        L_0x029d:
            r1 = 4
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC"
            java.lang.String r20 = "refreshAdFollow"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ILcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ILcom/tencent/mm/plugin/finder/feed/model/AdSnsCache;Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r2.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC"
            java.lang.String r19 = "refreshAdFollow"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ILcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ILcom/tencent/mm/plugin/finder/feed/model/AdSnsCache;Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lkotlin/jvm/functions/Function0;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x02df:
            android.view.View r0 = r7.f44854d
            r0.requestLayout()
            r0 = 0
            r1 = 2131232395(0x7f08068b, float:1.8080898E38)
            goto L_0x032e
        L_0x02e9:
            r12 = r2
            r1 = 1
            r15 = 0
            if (r10 == r1) goto L_0x033e
            r1 = 6
            if (r10 != r1) goto L_0x02f2
            goto L_0x033e
        L_0x02f2:
            r1 = 2
            if (r10 != r1) goto L_0x0331
            if (r8 != 0) goto L_0x0331
            if (r12 == 0) goto L_0x0301
            int r1 = r12.getVisibility()
            if (r1 != 0) goto L_0x0301
            r5 = 1
            goto L_0x0302
        L_0x0301:
            r5 = 0
        L_0x0302:
            if (r5 == 0) goto L_0x0331
            if (r0 == 0) goto L_0x030c
            r1 = 2131831218(0x7f1129b2, float:1.9295455E38)
            r0.setText(r1)
        L_0x030c:
            if (r0 == 0) goto L_0x031e
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100930(0x7f060502, float:1.7814255E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x031e:
            android.content.Context r0 = r7.f173499A
            r1 = 2131232395(0x7f08068b, float:1.8080898E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r12.setBackground(r0)
            r0 = 0
            r12.setOnClickListener(r0)
        L_0x032e:
            r2 = 8
            goto L_0x034a
        L_0x0331:
            r0 = 0
            r1 = 2131232395(0x7f08068b, float:1.8080898E38)
            if (r12 != 0) goto L_0x0338
            goto L_0x032e
        L_0x0338:
            r2 = 8
            r12.setVisibility(r2)
            goto L_0x034a
        L_0x033e:
            r0 = 0
            r1 = 2131232395(0x7f08068b, float:1.8080898E38)
            r2 = 8
            if (r12 != 0) goto L_0x0347
            goto L_0x034a
        L_0x0347:
            r12.setVisibility(r2)
        L_0x034a:
            r6.mo13815g3(r9, r8, r10)
            if (r31 == 0) goto L_0x0352
            r31.invoke()
        L_0x0352:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r28.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            int r3 = r3.adFlag
            r4 = 2
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0362
            r5 = 1
            goto L_0x0363
        L_0x0362:
            r5 = 0
        L_0x0363:
            if (r14 == 0) goto L_0x0368
            int r3 = r14.f13957f
            goto L_0x0369
        L_0x0368:
            r3 = 0
        L_0x0369:
            r4 = 2131302665(0x7f091909, float:1.8223423E38)
            android.view.View r4 = r7.mo85812D(r4)
            r12 = r4
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            boolean r4 = r25.mo13813d3()
            if (r4 == 0) goto L_0x0436
            if (r8 != 0) goto L_0x0436
            if (r5 == 0) goto L_0x0436
            r4 = 9
            if (r3 == r4) goto L_0x0383
            goto L_0x0436
        L_0x0383:
            vq1.w r2 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r28.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            rx3.l r2 = r2.mo89908g(r3)
            A r3 = r2.f38555d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            B r2 = r2.f38556e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            if (r10 == 0) goto L_0x03b3
            r2 = 10
            if (r10 != r2) goto L_0x03af
            boolean r2 = r25.mo13812c3(r26)
            if (r2 != 0) goto L_0x03af
            if (r3 != 0) goto L_0x03af
            goto L_0x03b3
        L_0x03af:
            r13 = 2131232310(0x7f080636, float:1.8080726E38)
            goto L_0x03b6
        L_0x03b3:
            r13 = 2131232395(0x7f08068b, float:1.8080898E38)
        L_0x03b6:
            if (r12 != 0) goto L_0x03b9
            goto L_0x03c6
        L_0x03b9:
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r13)
            r12.setBackground(r1)
        L_0x03c6:
            if (r10 == 0) goto L_0x03ce
            r1 = 10
            if (r10 == r1) goto L_0x03ce
            goto L_0x042d
        L_0x03ce:
            if (r12 == 0) goto L_0x03da
            r1 = 2131302664(0x7f091908, float:1.822342E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x03db
        L_0x03da:
            r1 = r0
        L_0x03db:
            if (r12 == 0) goto L_0x03e7
            r2 = 2131302663(0x7f091907, float:1.8223418E38)
            android.view.View r2 = r12.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            goto L_0x03e8
        L_0x03e7:
            r2 = r0
        L_0x03e8:
            if (r12 != 0) goto L_0x03eb
            goto L_0x03ee
        L_0x03eb:
            r12.setVisibility(r15)
        L_0x03ee:
            if (r1 != 0) goto L_0x03f1
            goto L_0x0413
        L_0x03f1:
            if (r14 == 0) goto L_0x03f6
            java.lang.String r3 = r14.f13961j
            goto L_0x03f7
        L_0x03f6:
            r3 = r0
        L_0x03f7:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0407
            if (r14 == 0) goto L_0x0402
            java.lang.String r13 = r14.f13961j
            goto L_0x0403
        L_0x0402:
            r13 = r0
        L_0x0403:
            gy3.C87412m.m108591d(r13)
            goto L_0x0410
        L_0x0407:
            android.content.Context r0 = r7.f173499A
            r3 = 2131826123(0x7f1115cb, float:1.9285121E38)
            java.lang.String r13 = r0.getString(r3)
        L_0x0410:
            r1.setText(r13)
        L_0x0413:
            if (r2 != 0) goto L_0x0416
            goto L_0x0419
        L_0x0416:
            r2.setVisibility(r15)
        L_0x0419:
            if (r12 == 0) goto L_0x042d
            ve1.n3 r11 = new ve1.n3
            r0 = r11
            r1 = r26
            r2 = r14
            r3 = r25
            r4 = r28
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r12.setOnClickListener(r11)
        L_0x042d:
            r6.mo13815g3(r9, r8, r10)
            if (r31 == 0) goto L_0x0451
            r31.invoke()
            goto L_0x0451
        L_0x0436:
            if (r3 == r2) goto L_0x0451
            boolean r1 = r11 instanceof com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter
            if (r1 == 0) goto L_0x0440
            r13 = r11
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r13 = (com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter) r13
            goto L_0x0441
        L_0x0440:
            r13 = r0
        L_0x0441:
            if (r13 == 0) goto L_0x0449
            boolean r0 = r13.f17215U
            r1 = 1
            if (r0 != r1) goto L_0x0449
            r15 = 1
        L_0x0449:
            if (r15 != 0) goto L_0x0451
            if (r12 != 0) goto L_0x044e
            goto L_0x0451
        L_0x044e:
            r12.setVisibility(r2)
        L_0x0451:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14567m3.mo13814e3(jq3.o, int, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, kf1.v1, fy3.a):void");
    }

    /* renamed from: g3 */
    public final void mo13815g3(BaseFinderFeed baseFinderFeed, int i, int i2) {
        if (i2 == 10) {
            FinderFeedUiActionEvent finderFeedUiActionEvent = new FinderFeedUiActionEvent();
            finderFeedUiActionEvent.f9202d.f9203a = baseFinderFeed.mo3513o().getId();
            FinderFeedUiActionEvent.C1047a aVar = finderFeedUiActionEvent.f9202d;
            aVar.f9204b = i;
            aVar.f9205c = 40001;
            finderFeedUiActionEvent.publish();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14567m3(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
