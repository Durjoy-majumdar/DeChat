package ve1;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: ve1.j1 */
public final class C14546j1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f40310d;

    /* renamed from: e */
    public final /* synthetic */ List<View> f40311e;

    /* renamed from: f */
    public final /* synthetic */ FinderFeedFullConvert<BaseFinderFeed> f40312f;

    /* renamed from: g */
    public final /* synthetic */ List<ImageView> f40313g;

    /* renamed from: h */
    public final /* synthetic */ float f40314h;

    /* renamed from: i */
    public final /* synthetic */ C60905o f40315i;

    /* renamed from: j */
    public final /* synthetic */ boolean f40316j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14546j1(BaseFinderFeed baseFinderFeed, List<View> list, FinderFeedFullConvert<BaseFinderFeed> finderFeedFullConvert, List<? extends ImageView> list2, float f, C60905o oVar, boolean z) {
        super(0);
        this.f40310d = baseFinderFeed;
        this.f40311e = list;
        this.f40312f = finderFeedFullConvert;
        this.f40313g = list2;
        this.f40314h = f;
        this.f40315i = oVar;
        this.f40316j = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0107, code lost:
        r8 = (r8 = r8.getContext()).getResources();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r36 = this;
            r0 = r36
            vq1.w r1 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f40310d
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            java.util.LinkedList r1 = r1.mo89906e(r2)
            java.util.List<android.view.View> r2 = r0.f40311e
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 0
        L_0x001a:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x00c3
            java.lang.Object r5 = r2.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x00bf
            android.view.View r5 = (android.view.View) r5
            int r6 = r1.size()
            if (r4 >= r6) goto L_0x0077
            if (r5 != 0) goto L_0x0035
            goto L_0x00bc
        L_0x0035:
            r4 = 4
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r4)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$runnable$1"
            java.lang.String r11 = "invoke"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r6.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$runnable$1"
            java.lang.String r10 = "invoke"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00bc
        L_0x0077:
            if (r5 != 0) goto L_0x007a
            goto L_0x00bc
        L_0x007a:
            r4 = 8
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r4)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$runnable$1"
            java.lang.String r11 = "invoke"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r6.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$runnable$1"
            java.lang.String r10 = "invoke"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x00bc:
            r4 = r7
            goto L_0x001a
        L_0x00bf:
            sx3.C64197v.m75542k()
            throw r6
        L_0x00c3:
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x04f4
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r2 = r0.f40312f
            java.util.List<android.widget.ImageView> r4 = r0.f40313g
            java.util.List<android.view.View> r5 = r0.f40311e
            float r7 = r0.f40314h
            r2.mo2290b0(r1, r4, r5, r7)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r2 = r0.f40312f
            jq3.o r4 = r0.f40315i
            java.util.List<android.view.View> r5 = r0.f40311e
            android.view.View r7 = r4.f44854d
            java.lang.String r8 = "holder.itemView"
            gy3.C87412m.m108593f(r7, r8)
            boolean r8 = r0.f40316j
            r2.getClass()
            tr1.b r2 = tr1.C14063b.f39453a
            java.lang.String r9 = "avatarLayoutList"
            gy3.C87412m.m108594g(r5, r9)
            int r15 = r1.size()
            if (r15 != 0) goto L_0x00f5
            goto L_0x04f4
        L_0x00f5:
            r16 = 0
            if (r8 == 0) goto L_0x0117
            java.lang.Object r8 = r5.get(r3)
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L_0x0115
            android.content.Context r8 = r8.getContext()
            if (r8 == 0) goto L_0x0115
            android.content.res.Resources r8 = r8.getResources()
            if (r8 == 0) goto L_0x0115
            r9 = 2131165339(0x7f07009b, float:1.7944892E38)
            float r8 = r8.getDimension(r9)
            goto L_0x012c
        L_0x0115:
            r8 = 0
            goto L_0x012c
        L_0x0117:
            java.lang.Object r8 = r5.get(r3)
            android.view.View r8 = (android.view.View) r8
            if (r8 == 0) goto L_0x0124
            android.content.Context r8 = r8.getContext()
            goto L_0x0125
        L_0x0124:
            r8 = r6
        L_0x0125:
            r9 = 14
            int r8 = kg3.C76577a.m92151b(r8, r9)
            float r8 = (float) r8
        L_0x012c:
            r14 = 1
            if (r15 != r14) goto L_0x0195
            r9 = 2131311819(0x7f093ccb, float:1.824199E38)
            android.view.View r10 = r4.mo85812D(r9)
            if (r10 == 0) goto L_0x0147
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            java.lang.String r11 = "alpha"
            r9 = r2
            r6 = 1
            r14 = r17
            r9.mo13460a(r10, r11, r12, r13, r14)
            goto L_0x0148
        L_0x0147:
            r6 = 1
        L_0x0148:
            java.lang.Object r9 = r5.get(r3)
            android.view.View r9 = (android.view.View) r9
            if (r9 != 0) goto L_0x0151
            goto L_0x0196
        L_0x0151:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r10.mo10233c(r11)
            java.lang.Object[] r19 = r10.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r21 = "startAvatarAnimator"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r9
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r10 = r10.mo10231a(r3)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r20 = "startAvatarAnimator"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0196
        L_0x0195:
            r6 = 1
        L_0x0196:
            java.lang.String r9 = "translationX"
            r10 = 2
            r13 = 3
            if (r15 == r10) goto L_0x01a4
            if (r15 == r13) goto L_0x01a4
            r19 = r4
        L_0x01a1:
            r3 = 3
            goto L_0x02eb
        L_0x01a4:
            int r14 = r5.size()
            if (r15 <= r14) goto L_0x01ac
            goto L_0x04f4
        L_0x01ac:
            int r14 = r15 + -2
            if (r14 < 0) goto L_0x0205
            r13 = 0
        L_0x01b1:
            java.lang.Object r18 = r5.get(r13)
            r11 = r18
            android.view.View r11 = (android.view.View) r11
            if (r11 != 0) goto L_0x01bc
            goto L_0x01ff
        L_0x01bc:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r18 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r12.mo10233c(r6)
            java.lang.Object[] r20 = r12.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r22 = "startAvatarAnimator"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r6 = r12.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r11.setVisibility(r6)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r21 = "startAvatarAnimator"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x01ff:
            if (r13 == r14) goto L_0x0205
            int r13 = r13 + 1
            r6 = 1
            goto L_0x01b1
        L_0x0205:
            int r6 = r15 + -1
            java.lang.Object r6 = r5.get(r6)
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x0210
            goto L_0x0253
        L_0x0210:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r11.mo10233c(r12)
            java.lang.Object[] r20 = r11.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r22 = "startAvatarAnimator"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r6
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r11 = r11.mo10231a(r3)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r6.setVisibility(r11)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r21 = "startAvatarAnimator"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0253:
            if (r6 != 0) goto L_0x0256
            goto L_0x0299
        L_0x0256:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Float r12 = java.lang.Float.valueOf(r16)
            r11.mo10233c(r12)
            java.lang.Object[] r20 = r11.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r22 = "startAvatarAnimator"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setAlpha"
            java.lang.String r26 = "(F)V"
            r19 = r6
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r11 = r11.mo10231a(r3)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r6.setAlpha(r11)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r21 = "startAvatarAnimator"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setAlpha"
            java.lang.String r25 = "(F)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0299:
            r11 = 2131311820(0x7f093ccc, float:1.8241991E38)
            android.view.View r11 = r7.findViewById(r11)
            r12 = 2131311817(0x7f093cc9, float:1.8241985E38)
            android.view.View r12 = r7.findViewById(r12)
            if (r11 == 0) goto L_0x02c8
            float r13 = -r8
            float[] r14 = new float[r10]
            r14[r3] = r13
            r13 = 1
            r14[r13] = r16
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r11, r9, r14)
            r19 = r4
            r3 = 250(0xfa, double:1.235E-321)
            r13.setDuration(r3)
            tr1.b$a r3 = new tr1.b$a
            r3.<init>(r11)
            r13.addListener(r3)
            r13.start()
            goto L_0x02ca
        L_0x02c8:
            r19 = r4
        L_0x02ca:
            if (r12 == 0) goto L_0x01a1
            float r3 = -r8
            tr1.e r4 = new tr1.e
            r4.<init>(r6)
            float[] r6 = new float[r10]
            r11 = 0
            r6[r11] = r3
            r3 = 1
            r6[r3] = r16
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r12, r9, r6)
            r11 = 250(0xfa, double:1.235E-321)
            r3.setDuration(r11)
            r3.addListener(r4)
            r3.start()
            goto L_0x01a1
        L_0x02eb:
            if (r15 <= r3) goto L_0x04f4
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            r4 = 2131305200(0x7f0922f0, float:1.8228564E38)
            android.view.View r4 = r7.findViewById(r4)
            r3.f27484d = r4
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r7 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r11)
            java.lang.Object[] r29 = r6.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r31 = "startAvatarAnimator"
            java.lang.String r32 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r4
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r7 = 0
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r22 = "startAvatarAnimator"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r20 = r4
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            r4 = 0
            java.lang.Object r6 = sx3.C110818d0.m150917O(r1, r4)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r6
            if (r6 == 0) goto L_0x0362
            tr1.b r4 = tr1.C14063b.f39453a
            T r7 = r3.f27484d
            android.view.View r7 = (android.view.View) r7
            r11 = 2131305196(0x7f0922ec, float:1.8228556E38)
            android.view.View r7 = r7.findViewById(r11)
            java.lang.String r11 = "avatarExtra.findViewById(R.id.friend_avatar_extra)"
            gy3.C87412m.m108593f(r7, r11)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r4.mo13461b(r6, r7)
        L_0x0362:
            r4 = 1
            java.lang.Object r6 = sx3.C110818d0.m150917O(r1, r4)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r6
            if (r6 == 0) goto L_0x0387
            tr1.b r4 = tr1.C14063b.f39453a
            java.lang.Object r7 = r5.get(r10)
            gy3.C87412m.m108591d(r7)
            android.view.View r7 = (android.view.View) r7
            r11 = 2131305193(0x7f0922e9, float:1.822855E38)
            android.view.View r7 = r7.findViewById(r11)
            java.lang.String r11 = "avatarLayoutList[2]!!.fi…yId(R.id.friend_avatar_3)"
            gy3.C87412m.m108593f(r7, r11)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r4.mo13461b(r6, r7)
        L_0x0387:
            java.lang.Object r4 = sx3.C110818d0.m150917O(r1, r10)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r4
            if (r4 == 0) goto L_0x03ac
            tr1.b r6 = tr1.C14063b.f39453a
            r7 = 1
            java.lang.Object r11 = r5.get(r7)
            gy3.C87412m.m108591d(r11)
            android.view.View r11 = (android.view.View) r11
            r7 = 2131305191(0x7f0922e7, float:1.8228546E38)
            android.view.View r7 = r11.findViewById(r7)
            java.lang.String r11 = "avatarLayoutList[1]!!.fi…yId(R.id.friend_avatar_2)"
            gy3.C87412m.m108593f(r7, r11)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.mo13461b(r4, r7)
        L_0x03ac:
            r4 = 3
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r4)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r1
            if (r1 == 0) goto L_0x03d2
            tr1.b r4 = tr1.C14063b.f39453a
            r6 = 0
            java.lang.Object r7 = r5.get(r6)
            gy3.C87412m.m108591d(r7)
            android.view.View r7 = (android.view.View) r7
            r6 = 2131305189(0x7f0922e5, float:1.8228542E38)
            android.view.View r6 = r7.findViewById(r6)
            java.lang.String r7 = "avatarLayoutList[0]!!.fi…yId(R.id.friend_avatar_1)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r4.mo13461b(r1, r6)
        L_0x03d2:
            java.util.Iterator r1 = r5.iterator()
        L_0x03d6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x042b
            java.lang.Object r4 = r1.next()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x03e5
            goto L_0x03d6
        L_0x03e5:
            k20.a r6 = new k20.a
            r6.<init>()
            r7 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r11)
            java.lang.Object[] r29 = r6.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r31 = "startAvatarAnimator"
            java.lang.String r32 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r4
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r7 = 0
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r22 = "startAvatarAnimator"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r20 = r4
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x03d6
        L_0x042b:
            r1 = 1
            r4 = 3
        L_0x042d:
            if (r1 >= r4) goto L_0x045a
            java.lang.Object r6 = r5.get(r1)
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x0455
            float r7 = -r8
            float[] r11 = new float[r10]
            r12 = 0
            r11[r12] = r16
            r12 = 1
            r11[r12] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r9, r11)
            r12 = 250(0xfa, double:1.235E-321)
            r7.setDuration(r12)
            tr1.b$a r11 = new tr1.b$a
            r11.<init>(r6)
            r7.addListener(r11)
            r7.start()
            goto L_0x0457
        L_0x0455:
            r12 = 250(0xfa, double:1.235E-321)
        L_0x0457:
            int r1 = r1 + 1
            goto L_0x042d
        L_0x045a:
            T r1 = r3.f27484d
            android.view.View r1 = (android.view.View) r1
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Float r6 = java.lang.Float.valueOf(r16)
            r4.mo10233c(r6)
            java.lang.Object[] r21 = r4.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r23 = "startAvatarAnimator"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setAlpha"
            java.lang.String r27 = "(F)V"
            r20 = r1
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r1.setAlpha(r4)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r22 = "startAvatarAnimator"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/LinkedList;Ljava/util/List;Landroid/view/View;Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setAlpha"
            java.lang.String r26 = "(F)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            T r1 = r3.f27484d
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            boolean r6 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x04af
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x04b0
        L_0x04af:
            r4 = 0
        L_0x04b0:
            if (r4 == 0) goto L_0x04d5
            java.lang.Object r6 = sx3.C110818d0.m150917O(r5, r10)
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x04bf
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x04c0
        L_0x04bf:
            r6 = 0
        L_0x04c0:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x04c7
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x04c8
        L_0x04c7:
            r6 = 0
        L_0x04c8:
            if (r6 == 0) goto L_0x04cf
            int r11 = r6.getMarginStart()
            goto L_0x04d0
        L_0x04cf:
            r11 = 0
        L_0x04d0:
            r4.setMarginStart(r11)
            r6 = r4
            goto L_0x04d6
        L_0x04d5:
            r6 = 0
        L_0x04d6:
            r1.setLayoutParams(r6)
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            gy3.C87412m.m108591d(r1)
            r10 = r1
            android.view.View r10 = (android.view.View) r10
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            tr1.d r14 = new tr1.d
            r1 = r19
            r14.<init>(r1, r5, r3)
            java.lang.String r11 = "alpha"
            r9 = r2
            r9.mo13460a(r10, r11, r12, r13, r14)
        L_0x04f4:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14546j1.invoke():java.lang.Object");
    }
}
