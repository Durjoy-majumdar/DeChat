package ve1;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7865r3;
import er1.C7919x;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import jq3.C60896i;
import jq3.C60905o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ve1.q6 */
public final class C14612q6 extends C60896i<C55018j0> {

    /* renamed from: e */
    public final C2829n f40450e;

    /* renamed from: f */
    public final C13601g f40451f = C36568h.m40985a(C14613a.f40452d);

    /* renamed from: ve1.q6$a */
    public static final class C14613a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14613a f40452d = new C14613a();

        public C14613a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C7865r3.f26468a.mo8970c());
        }
    }

    public C14612q6(C2829n nVar) {
        C87412m.m108594g(nVar, "contract");
        this.f40450e = nVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d2a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r24, jq3.C9493c r25, int r26, int r27, boolean r28, java.util.List r29) {
        /*
            r23 = this;
            r0 = r24
            r1 = r26
            r2 = r25
            cm1.j0 r2 = (cm1.C55018j0) r2
            pl1.e0$a r3 = pl1.C11978e0.C11979a.COMMON
            up1.y r10 = up1.C27696y.RAW_IMAGE
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            fe1.q r4 = r2.mo3507l()
            r5 = 0
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = r4.getAvatarUrl()
            goto L_0x0023
        L_0x0022:
            r4 = r5
        L_0x0023:
            r12 = 0
            if (r4 == 0) goto L_0x002f
            int r6 = r4.length()
            if (r6 != 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r6 = 0
            goto L_0x0030
        L_0x002f:
            r6 = 1
        L_0x0030:
            if (r6 == 0) goto L_0x0042
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.contact
            if (r4 == 0) goto L_0x0041
            java.lang.String r4 = r4.headUrl
            goto L_0x0042
        L_0x0041:
            r4 = r5
        L_0x0042:
            pl1.e0 r13 = pl1.C11978e0.f34938a
            k60.d r6 = r13.mo11849a()
            pl1.f r7 = new pl1.f
            r8 = 2
            r7.<init>(r4, r5, r8, r5)
            r4 = 2131297750(0x7f0905d6, float:1.8213454E38)
            android.view.View r4 = r0.mo85812D(r4)
            java.lang.String r5 = "holder.getView(R.id.big_card_avatar_iv)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            pl1.e0$a r5 = pl1.C11978e0.C11979a.AVATAR
            n60.f r5 = r13.mo11851c(r5)
            r6.mo85957c(r7, r4, r5)
            r4 = 2131297758(0x7f0905de, float:1.821347E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getNickNameSpan()
            r4.setText(r5)
            fe1.q r4 = r2.mo3507l()
            if (r4 == 0) goto L_0x00a1
            er1.w3 r14 = er1.C58784w3.f168295a
            r5 = 2131297749(0x7f0905d5, float:1.8213452E38)
            android.view.View r5 = r0.mo85812D(r5)
            java.lang.String r6 = "holder.getView(R.id.big_card_auth_icon)"
            gy3.C87412m.m108593f(r5, r6)
            r15 = r5
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r5 = r4.field_authInfo
            r17 = 0
            te3.cg r18 = fe1.C58960c.m68830b(r4, r12)
            r19 = 4
            r20 = 0
            r16 = r5
            er1.C58784w3.m68429F1(r14, r15, r16, r17, r18, r19, r20)
        L_0x00a1:
            r4 = 2131297756(0x7f0905dc, float:1.8213466E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            int r5 = r5.getLikeCount()
            if (r5 <= 0) goto L_0x00c1
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            int r5 = r5.getLikeCount()
            java.lang.String r5 = er1.C7878t0.m8034c(r8, r5)
            goto L_0x00c3
        L_0x00c1:
            java.lang.String r5 = "0"
        L_0x00c3:
            r4.setText(r5)
            r4 = 2131297752(0x7f0905d8, float:1.8213458E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = "descTv"
            gy3.C87412m.m108593f(r4, r5)
            er1.C7919x.m8091a(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getFlowCardDescSpan()
            if (r5 == 0) goto L_0x00ea
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r5 = 0
            goto L_0x00eb
        L_0x00ea:
            r5 = 1
        L_0x00eb:
            java.lang.String r14 = ""
            r15 = 8
            if (r5 != 0) goto L_0x0100
            r4.setVisibility(r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getFlowCardDescSpan()
            r4.setText(r5)
            goto L_0x0123
        L_0x0100:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            java.lang.String r5 = r5.getDescription()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x011d
            r4.setVisibility(r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            android.text.SpannableString r5 = r5.getDescriptionSpan()
            r4.setText(r5)
            goto L_0x0123
        L_0x011d:
            r4.setVisibility(r15)
            r4.setText(r14)
        L_0x0123:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            java.util.LinkedList r4 = r4.getMediaList()
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            r5 = r4
            te3.rq2 r5 = (te3.C64689rq2) r5
            r4 = 2131297751(0x7f0905d7, float:1.8213456E38)
            android.view.View r4 = r0.mo85812D(r4)
            r9 = r4
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x020c
            java.lang.String r4 = r5.f185261W
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r6 = ", feedId="
            java.lang.String r7 = "FinderNewStyleBigCardConvert"
            if (r4 != 0) goto L_0x018b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "onBindViewHolder: use full cover url, position="
            r4.append(r8)
            r4.append(r1)
            r4.append(r6)
            long r16 = r2.getItemId()
            java.lang.String r6 = o40.C61926c.m72691p(r16)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            pl1.q0 r8 = new pl1.q0
            r7 = 0
            r16 = 4
            r17 = 0
            r4 = r8
            r6 = r10
            r11 = r8
            r8 = r16
            r15 = r9
            r9 = r17
            r4.<init>(r5, r6, r7, r8, r9)
            k60.d r4 = r13.mo11850b()
            n60.f r3 = r13.mo11851c(r3)
            r4.mo85957c(r11, r15, r3)
            goto L_0x020c
        L_0x018b:
            r15 = r9
            java.lang.String r4 = r5.f185283w
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "onBindViewHolder: use cover url, position="
            r4.append(r8)
            r4.append(r1)
            r4.append(r6)
            long r8 = r2.getItemId()
            java.lang.String r6 = o40.C61926c.m72691p(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            pl1.o0 r11 = new pl1.o0
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            k60.d r4 = r13.mo11850b()
            n60.f r3 = r13.mo11851c(r3)
            r4.mo85957c(r11, r15, r3)
            goto L_0x020c
        L_0x01cc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "onBindViewHolder: use thumb url, position="
            r4.append(r8)
            r4.append(r1)
            r4.append(r6)
            long r8 = r2.getItemId()
            java.lang.String r6 = o40.C61926c.m72691p(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            pl1.b0 r4 = new pl1.b0
            up1.y r18 = up1.C27696y.THUMB_IMAGE
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r16 = r4
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            k60.d r5 = r13.mo11850b()
            n60.f r3 = r13.mo11851c(r3)
            r5.mo85957c(r4, r15, r3)
        L_0x020c:
            r3 = 2131297759(0x7f0905df, float:1.8213472E38)
            android.view.View r3 = r0.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            te3.ek1 r4 = r4.flow_card_recommand_reason
            if (r4 == 0) goto L_0x0227
            java.lang.String r4 = r4.f132981d
            if (r4 != 0) goto L_0x0226
            goto L_0x0227
        L_0x0226:
            r14 = r4
        L_0x0227:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r4 != 0) goto L_0x0236
            r3.setText(r14)
            r3.setVisibility(r12)
            r4 = 8
            goto L_0x023b
        L_0x0236:
            r4 = 8
            r3.setVisibility(r4)
        L_0x023b:
            r3 = 2131297755(0x7f0905db, float:1.8213464E38)
            android.view.View r3 = r0.mo85812D(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.setVisibility(r12)
            wp1.j r5 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            int r6 = r6.objectType
            te3.if1 r5 = r5.mo14351c(r6)
            r6 = 2131099940(0x7f060124, float:1.7812247E38)
            if (r5 == 0) goto L_0x028d
            java.lang.String r7 = r5.f135279y
            if (r7 == 0) goto L_0x0269
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0267
            goto L_0x0269
        L_0x0267:
            r7 = 0
            goto L_0x026a
        L_0x0269:
            r7 = 1
        L_0x026a:
            if (r7 == 0) goto L_0x026d
            goto L_0x028d
        L_0x026d:
            k60.d r7 = r13.mo11850b()
            pl1.n0 r8 = new pl1.n0
            java.lang.String r5 = r5.f135279y
            r8.<init>(r5, r10)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.TIMELINE
            n60.f r5 = r13.mo11851c(r5)
            r7.mo85957c(r8, r3, r5)
            android.content.Context r5 = r0.f173499A
            int r5 = kg3.C76577a.m92153d(r5, r6)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.setColorFilter(r5, r6)
            goto L_0x02b2
        L_0x028d:
            er1.w3 r5 = er1.C58784w3.f168295a
            r7 = 1
            java.lang.Integer r5 = r5.mo83917b0(r7, r7)
            if (r5 == 0) goto L_0x029b
            int r5 = r5.intValue()
            goto L_0x029e
        L_0x029b:
            r5 = 2131756066(0x7f100422, float:1.914303E38)
        L_0x029e:
            android.content.Context r7 = r0.f173499A
            android.content.res.Resources r8 = r7.getResources()
            int r6 = r8.getColor(r6)
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r7, r5, r6)
            r3.setImageDrawable(r5)
            r3.setEnabled(r12)
        L_0x02b2:
            com.tencent.mm.plugin.finder.storage.FeedData$a r3 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r3.mo78883a(r2)
            r3 = 2131297753(0x7f0905d9, float:1.821346E38)
            android.view.View r3 = r0.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.util.LinkedList r2 = r2.getMediaList()
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            te3.rq2 r2 = (te3.C64689rq2) r2
            if (r2 == 0) goto L_0x02d0
            int r2 = r2.f185269g
            goto L_0x02d1
        L_0x02d0:
            r2 = 0
        L_0x02d1:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r2)
            r3.setText(r2)
            r2 = 2131297754(0x7f0905da, float:1.8213462E38)
            android.view.View r5 = r0.mo85812D(r2)
            r0 = r23
            if (r5 == 0) goto L_0x032d
            com.tencent.mm.plugin.finder.feed.n r2 = r0.f40450e
            int r2 = r2.f14123s
            if (r1 != r2) goto L_0x02eb
            r15 = 0
            goto L_0x02ed
        L_0x02eb:
            r15 = 8
        L_0x02ed:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1.mo10233c(r2)
            java.lang.Object[] r14 = r1.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderNewStyleBigCardConvert"
            java.lang.String r16 = "onBindViewHolder"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r1 = r1.mo10231a(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderNewStyleBigCardConvert"
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x032d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14612q6.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        ViewGroup.LayoutParams layoutParams = oVar.mo85812D(C0966R.C0970id.nid).getLayoutParams();
        layoutParams.height = C60641c.m70921b((((float) ((Number) ((C36570n) this.f40451f).getValue()).intValue()) / 16.0f) * 9.0f);
        Log.m105924i("FinderNewStyleBigCardConvert", "onCreateViewHolder: screenWidth=" + ((Number) ((C36570n) this.f40451f).getValue()).intValue() + ", height=" + layoutParams.height);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.nig);
        if (textView != null) {
            C7919x.m8091a(textView);
        }
    }
}
