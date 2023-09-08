package oq1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C57839g4;
import com.tencent.p014mm.p136ui.C57840h4;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C60905o;
import kg3.C76577a;
import l31.C61212e;
import lq1.C61364h;
import rx3.C13598b0;
import sq1.C64151e;

/* renamed from: oq1.l */
public final class C62131l extends C60896i<C64151e> {

    /* renamed from: e */
    public final C61364h f176670e;

    /* renamed from: f */
    public final boolean f176671f;

    /* renamed from: oq1.l$a */
    public static final class C62132a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f176672d;

        /* renamed from: e */
        public final /* synthetic */ int f176673e;

        /* renamed from: f */
        public final /* synthetic */ C57839g4 f176674f;

        public C62132a(View view, int i, C57839g4 g4Var) {
            this.f176672d = view;
            this.f176673e = i;
            this.f176674f = g4Var;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f176672d.getHitRect(rect);
            int i = this.f176673e;
            rect.inset(-i, -i);
            this.f176674f.mo82266a(new C57840h4(rect, this.f176672d));
        }
    }

    /* renamed from: oq1.l$b */
    public static final class C62133b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f176675d;

        /* renamed from: e */
        public final /* synthetic */ int f176676e;

        /* renamed from: f */
        public final /* synthetic */ C57839g4 f176677f;

        public C62133b(View view, int i, C57839g4 g4Var) {
            this.f176675d = view;
            this.f176676e = i;
            this.f176677f = g4Var;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f176675d.getHitRect(rect);
            int i = this.f176676e;
            rect.inset(-i, -i);
            this.f176677f.mo82266a(new C57840h4(rect, this.f176675d));
        }
    }

    /* renamed from: oq1.l$c */
    public static final class C62134c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f176678d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62134c(C60905o oVar) {
            super(1);
            this.f176678d = oVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.f176678d.f173503E;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.UniFeedComment");
            ((C64151e) obj2).f181871g = booleanValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oq1.l$d */
    public static final class C62135d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f176679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62135d(C60905o oVar) {
            super(1);
            this.f176679d = oVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.f176679d.f173503E;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.UniFeedComment");
            ((C64151e) obj2).f181870f = booleanValue;
            return C13598b0.f38549a;
        }
    }

    public C62131l(C61364h hVar, boolean z) {
        C87412m.m108594g(hVar, "presenter");
        this.f176670e = hVar;
        this.f176671f = z;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6256bs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0831  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x087d  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0906  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x067f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r41, jq3.C9493c r42, int r43, int r44, boolean r45, java.util.List r46) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r43
            pl1.e0$a r3 = pl1.C11978e0.C11979a.AVATAR
            r4 = r42
            sq1.e r4 = (sq1.C64151e) r4
            up1.y r5 = up1.C27696y.SMALL_AVATAR_IMAGE
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            java.lang.String r9 = "holder"
            gy3.C87412m.m108594g(r1, r9)
            java.lang.String r9 = "item"
            gy3.C87412m.m108594g(r4, r9)
            r1.f173503E = r4
            r9 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r10 = r1.mo85812D(r9)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.content.Context r11 = r1.f173499A
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r11 = r11.getColor(r12)
            r10.setTextColor(r11)
            r11 = 0
            r10.setOnClickListener(r11)
            r13 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r14 = r1.mo85812D(r13)
            r14.setOnClickListener(r11)
            r14 = 2131305224(0x7f092308, float:1.8228613E38)
            r15 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r1.mo85817I(r14, r15)
            lq1.h r14 = r0.f176670e
            int r14 = r14.mo79235g()
            r9 = 2
            if (r14 != r9) goto L_0x005e
            r14 = 1
            goto L_0x005f
        L_0x005e:
            r14 = 0
        L_0x005f:
            r15 = 2131101015(0x7f060557, float:1.7814428E38)
            if (r14 == 0) goto L_0x00e7
            lq1.h r14 = r0.f176670e
            r14.mo79244s()
            lq1.h r14 = r0.f176670e
            r14.mo79242p()
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            di3.d r19 = di3.C86312j.m106911c(r6)
            r12 = r19
            ny.h r12 = (p629ny.C76979h) r12
            android.content.Context r9 = r1.f173499A
            er1.w3 r20 = er1.C58784w3.f168295a
            sq1.b r13 = r4.f181868d
            java.lang.String r21 = r13.getUsername()
            sq1.b r13 = r4.f181868d
            java.lang.String r22 = r13.getNickname()
            r23 = 0
            r24 = 4
            r25 = 0
            java.lang.String r13 = er1.C58784w3.m68433S(r20, r21, r22, r23, r24, r25)
            android.text.SpannableString r9 = r12.mo107057T1(r9, r13)
            r14.<init>(r9)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            android.text.SpannableStringBuilder r9 = r9.append(r14)
            boolean r12 = r4.f181869e
            java.lang.String r13 = "textBuilder"
            if (r12 == 0) goto L_0x00de
            ve1.i r12 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r9, r13)
            r12.mo89687m(r10, r9)
            up1.f r9 = up1.C37521f.f99374d
            boolean r9 = r9.mo61182h()
            if (r9 == 0) goto L_0x0103
            android.content.Context r9 = r1.f173499A
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getColor(r15)
            r10.setTextColor(r9)
            oq1.e r9 = new oq1.e
            r9.<init>(r4, r1)
            r10.setOnClickListener(r9)
            r9 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r12 = r1.mo85812D(r9)
            oq1.f r9 = new oq1.f
            r9.<init>(r4, r1)
            r12.setOnClickListener(r9)
            goto L_0x0103
        L_0x00de:
            ve1.i r12 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r9, r13)
            r12.mo89687m(r10, r9)
            goto L_0x0103
        L_0x00e7:
            di3.d r9 = di3.C86312j.m106911c(r6)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r12 = r1.f173499A
            sq1.b r13 = r4.f181868d
            java.lang.String r13 = r13.getNickname()
            android.text.SpannableString r14 = r9.mo107057T1(r12, r13)
            java.lang.String r9 = "getService(ISpannableSer…ommentObj.nickname ?: \"\")"
            gy3.C87412m.m108593f(r14, r9)
            ve1.i r9 = ve1.C65604i.f188772a
            r9.mo89687m(r10, r14)
        L_0x0103:
            android.content.Context r9 = r1.f173499A
            sq1.b r12 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r12.mo88876n2()
            long r12 = r12.createtime
            r21 = r14
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            java.lang.String r9 = er1.C7878t0.m8037f(r9, r12)
            r12 = 2131300029(0x7f090ebd, float:1.8218076E38)
            r1.mo85815G(r12, r9)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "username="
            r13.append(r14)
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.getUsername()
            r13.append(r14)
            java.lang.String r14 = ", nickName="
            r13.append(r14)
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.getNickname()
            r13.append(r14)
            java.lang.String r14 = " content="
            r13.append(r14)
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.getContent()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "Finder.FinderFeedCommentConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r13)
            r13 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r15 = r1.mo85812D(r13)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            sq1.b r13 = r4.f181868d
            r13.getClass()
            er1.j4 r24 = er1.C58739j4.f168176a
            int r13 = r13.mo88877o2()
            r24.getClass()
            r19 = 2
            r13 = r13 & 2
            if (r13 == 0) goto L_0x0175
            r13 = 1
            goto L_0x0176
        L_0x0175:
            r13 = 0
        L_0x0176:
            java.lang.String r12 = "avatarIv"
            if (r13 == 0) goto L_0x01b5
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r2 = r13.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11872i2()
            r38 = r9
            pl1.f r9 = new pl1.f
            r39 = r14
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.mo88880r2()
            r9.<init>(r14, r5)
            gy3.C87412m.m108593f(r15, r12)
            bl3.r$a r5 = r13.mo62446e(r8)
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r3 = r5.mo11867O2(r3)
            r2.mo85957c(r9, r15, r3)
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            r3 = 0
            r1.mo85817I(r2, r3)
            goto L_0x01f8
        L_0x01b5:
            r38 = r9
            r39 = r14
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            sq1.b r9 = r4.f181868d
            boolean r9 = r9.mo88885v2()
            if (r9 == 0) goto L_0x01fa
            r9 = 8
            r1.mo85817I(r2, r9)
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r9 = r2.mo62446e(r8)
            bl3.c r9 = r9.mo62447c(r7)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11872i2()
            pl1.f r13 = new pl1.f
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.mo88880r2()
            r13.<init>(r14, r5)
            gy3.C87412m.m108593f(r15, r12)
            bl3.r$a r2 = r2.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r3)
            r9.mo85957c(r13, r15, r2)
        L_0x01f8:
            r2 = 1
            goto L_0x025c
        L_0x01fa:
            r3 = 8
            r1.mo85817I(r2, r3)
            sq1.b r2 = r4.f181868d
            java.lang.String r2 = r2.mo88880r2()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x023d
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r3 = r2.mo62446e(r8)
            bl3.c r3 = r3.mo62447c(r7)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11865K1()
            pl1.f r9 = new pl1.f
            sq1.b r13 = r4.f181868d
            java.lang.String r13 = r13.mo88880r2()
            r9.<init>(r13, r5)
            gy3.C87412m.m108593f(r15, r12)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r2 = r2.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r5)
            r3.mo85957c(r9, r15, r2)
            goto L_0x0243
        L_0x023d:
            r2 = 2131231871(0x7f08047f, float:1.8079835E38)
            r15.setImageResource(r2)
        L_0x0243:
            lq1.h r2 = r0.f176670e
            qq1.a r2 = r2.mo79245u()
            java.lang.String r2 = r2.f179673e
            oq1.g r3 = new oq1.g
            r3.<init>(r1, r2, r4)
            r15.setOnClickListener(r3)
            oq1.h r3 = new oq1.h
            r3.<init>(r1, r2, r4)
            r10.setOnClickListener(r3)
            r2 = 0
        L_0x025c:
            r3 = 2131302939(0x7f091a1b, float:1.8223978E38)
            android.view.View r5 = r1.mo85812D(r3)
            if (r5 == 0) goto L_0x02f1
            sq1.b r7 = r4.f181868d
            boolean r7 = r7.mo88885v2()
            if (r7 == 0) goto L_0x02b1
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r9)
            java.lang.Object[] r28 = r7.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r5
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x02ef
        L_0x02b1:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r7.mo10233c(r11)
            java.lang.Object[] r28 = r7.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r5
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x02ef:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x02f1:
            android.content.Context r5 = r1.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131101015(0x7f060557, float:1.7814428E38)
            int r5 = r5.getColor(r7)
            r10.setTextColor(r5)
            if (r2 == 0) goto L_0x032a
            oq1.i r2 = new oq1.i
            r2.<init>(r4, r0, r1)
            r10.setOnClickListener(r2)
            r2 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r2 = r1.mo85812D(r2)
            oq1.j r5 = new oq1.j
            r5.<init>(r4, r0, r1)
            r2.setOnClickListener(r5)
            android.view.View r2 = r1.mo85812D(r3)
            if (r2 == 0) goto L_0x032a
            oq1.k r3 = new oq1.k
            r3.<init>(r4, r0, r1)
            r2.setOnClickListener(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x032a:
            java.lang.String r2 = "holder.context"
            r3 = 2131299973(0x7f090e85, float:1.8217963E38)
            java.lang.String r5 = ""
            if (r45 != 0) goto L_0x0487
            r7 = 2131312336(0x7f093ed0, float:1.8243038E38)
            android.view.View r8 = r1.mo85812D(r7)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r8 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r8
            java.lang.Object r9 = r1.f173503E
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.UniFeedComment"
            gy3.C87412m.m108592e(r9, r12)
            sq1.e r9 = (sq1.C64151e) r9
            boolean r9 = r9.f181871g
            r8.setCollapse(r9)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            android.view.View r8 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r8 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r8
            java.lang.Object r9 = r1.f173503E
            gy3.C87412m.m108592e(r9, r12)
            sq1.e r9 = (sq1.C64151e) r9
            boolean r9 = r9.f181870f
            r8.setCollapse(r9)
            android.view.View r8 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r8 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r8
            di3.d r9 = di3.C86312j.m106911c(r6)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r12 = r1.f173499A
            sq1.b r13 = r4.f181868d
            java.lang.String r13 = r13.getContent()
            android.text.SpannableString r9 = r9.mo107057T1(r12, r13)
            r8.setText(r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onBindViewHolder replyCommentId:"
            r8.append(r9)
            sq1.b r9 = r4.f181868d
            long r12 = r9.mo88882t2()
            r8.append(r12)
            java.lang.String r9 = ", content:"
            r8.append(r9)
            sq1.b r9 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r9 = r9.mo88876n2()
            java.lang.String r9 = r9.reply_content
            if (r9 != 0) goto L_0x039c
            r9 = r5
        L_0x039c:
            r8.append(r9)
            java.lang.String r9 = ", nickname:"
            r8.append(r9)
            sq1.b r9 = r4.f181868d
            java.lang.String r9 = r9.mo88884u2()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = r39
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            android.view.View r7 = r1.mo85812D(r7)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r7 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r7
            sq1.b r8 = r4.f181868d
            long r12 = r8.mo88882t2()
            r14 = 0
            r8 = 2131312337(0x7f093ed1, float:1.824304E38)
            int r20 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r20 == 0) goto L_0x047c
            boolean r12 = r0.f176671f
            if (r12 == 0) goto L_0x047c
            r12 = 0
            r1.mo85817I(r8, r12)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            lq1.h r12 = r0.f176670e
            int r12 = r12.mo79235g()
            r13 = 2
            if (r12 != r13) goto L_0x03e3
            r12 = 1
            goto L_0x03e4
        L_0x03e3:
            r12 = 0
        L_0x03e4:
            if (r12 == 0) goto L_0x0408
            er1.w3 r26 = er1.C58784w3.f168295a
            sq1.b r12 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r12.mo88876n2()
            java.lang.String r12 = r12.reply_username
            if (r12 != 0) goto L_0x03f5
            r27 = r5
            goto L_0x03f7
        L_0x03f5:
            r27 = r12
        L_0x03f7:
            sq1.b r12 = r4.f181868d
            java.lang.String r28 = r12.mo88884u2()
            r29 = 0
            r30 = 4
            r31 = 0
            java.lang.String r12 = er1.C58784w3.m68433S(r26, r27, r28, r29, r30, r31)
            goto L_0x040e
        L_0x0408:
            sq1.b r12 = r4.f181868d
            java.lang.String r12 = r12.mo88884u2()
        L_0x040e:
            ve1.i r13 = ve1.C65604i.f188772a
            com.tencent.neattextview.textview.view.NeatTextView r14 = r7.getContentTextView()
            android.text.TextPaint r14 = r14.getPaint()
            java.lang.String r15 = "replyContentTv.contentTextView.paint"
            gy3.C87412m.m108593f(r14, r15)
            android.content.Context r15 = r1.f173499A
            gy3.C87412m.m108593f(r15, r2)
            up1.f r20 = up1.C37521f.f99374d
            int r3 = r20.mo61150D()
            int r3 = r13.mo89677c(r15, r3)
            android.content.Context r15 = r1.f173499A
            gy3.C87412m.m108593f(r15, r2)
            int r20 = r20.mo61150D()
            r39 = r10
            r17 = 1
            int r10 = r20 + 1
            int r10 = r13.mo89677c(r15, r10)
            java.lang.String r3 = r13.mo89678d(r14, r12, r3, r10)
            di3.d r10 = di3.C86312j.m106911c(r6)
            ny.h r10 = (p629ny.C76979h) r10
            android.content.Context r12 = r1.f173499A
            android.text.SpannableString r3 = r10.mo107057T1(r12, r3)
            r8.append(r3)
            android.content.Context r3 = r1.f173499A
            r10 = 2131826303(0x7f11167f, float:1.9285487E38)
            java.lang.String r3 = r3.getString(r10)
            r8.append(r3)
            di3.d r3 = di3.C86312j.m106911c(r6)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r6 = r1.f173499A
            sq1.b r10 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r10 = r10.mo88876n2()
            java.lang.String r10 = r10.reply_content
            if (r10 != 0) goto L_0x0471
            r10 = r5
        L_0x0471:
            android.text.SpannableString r3 = r3.mo107057T1(r6, r10)
            r8.append(r3)
            r7.setText(r8)
            goto L_0x048b
        L_0x047c:
            r39 = r10
            r3 = 8
            r1.mo85817I(r8, r3)
            r7.setText(r5)
            goto L_0x048b
        L_0x0487:
            r9 = r39
            r39 = r10
        L_0x048b:
            mq1.e r3 = mq1.C61557e.f174962f
            lq1.h r6 = r0.f176670e
            qq1.a r6 = r6.mo79245u()
            long r6 = r6.mo88217a()
            sq1.b r8 = r4.f181868d
            lq1.h r10 = r0.f176670e
            int r10 = r10.mo79235g()
            boolean r6 = r3.mo86493b(r6, r8, r10)
            r7 = 2131297504(0x7f0904e0, float:1.8212955E38)
            android.view.View r8 = r1.mo85812D(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
            r10 = 2131099718(0x7f060046, float:1.7811797E38)
            if (r6 == 0) goto L_0x04ef
            lq1.h r12 = r0.f176670e
            boolean r12 = r12.mo79237h()
            r13 = 2131755879(0x7f100367, float:1.914265E38)
            if (r12 == 0) goto L_0x04d4
            rx3.l r12 = new rx3.l
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            int r14 = r14.getColor(r10)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.<init>(r13, r14)
            goto L_0x052c
        L_0x04d4:
            rx3.l r12 = new rx3.l
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131099905(0x7f060101, float:1.7812176E38)
            int r14 = r14.getColor(r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.<init>(r13, r14)
            goto L_0x052c
        L_0x04ef:
            lq1.h r12 = r0.f176670e
            boolean r12 = r12.mo79237h()
            r13 = 2131755901(0x7f10037d, float:1.9142694E38)
            if (r12 == 0) goto L_0x0512
            rx3.l r12 = new rx3.l
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            int r14 = r14.getColor(r10)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.<init>(r13, r14)
            goto L_0x052c
        L_0x0512:
            rx3.l r12 = new rx3.l
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r14 = r14.getColor(r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.<init>(r13, r14)
        L_0x052c:
            A r13 = r12.f38555d
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            B r12 = r12.f38556e
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r8.setImageResource(r13)
            r8.setIconColor(r12)
            oq1.m r12 = new oq1.m
            r12.<init>(r0, r1)
            r8.setOnClickListener(r12)
            sq1.b r8 = r4.f181868d
            int r8 = r8.field_state
            r12 = -1
            r13 = 1
            if (r8 == r13) goto L_0x0556
            if (r8 == r12) goto L_0x0556
            r8 = 1
            goto L_0x0557
        L_0x0556:
            r8 = 0
        L_0x0557:
            if (r8 != 0) goto L_0x055f
            r8 = 8
            r1.mo85817I(r7, r8)
            goto L_0x0563
        L_0x055f:
            r8 = 0
            r1.mo85817I(r7, r8)
        L_0x0563:
            lq1.h r8 = r0.f176670e
            qq1.a r8 = r8.mo79245u()
            long r13 = r8.mo88217a()
            sq1.b r8 = r4.f181868d
            lq1.h r15 = r0.f176670e
            int r15 = r15.mo79235g()
            int r3 = r3.mo86492a(r13, r8, r15)
            r8 = 2131297505(0x7f0904e1, float:1.8212957E38)
            android.view.View r13 = r1.mo85812D(r8)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setContentDescription(r5)
            if (r3 <= 0) goto L_0x05ae
            r14 = 0
            r1.mo85817I(r8, r14)
            java.lang.String r14 = java.lang.String.valueOf(r3)
            r1.mo85815G(r8, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            android.content.Context r15 = r1.f173499A
            r12 = 2131826870(0x7f1118b6, float:1.9286637E38)
            java.lang.String r12 = r15.getString(r12)
            r14.append(r12)
            r14.append(r3)
            java.lang.String r12 = r14.toString()
            r13.setContentDescription(r12)
            goto L_0x05b6
        L_0x05ae:
            r12 = 8
            r1.mo85817I(r8, r12)
            r1.mo85815G(r8, r5)
        L_0x05b6:
            lq1.h r12 = r0.f176670e
            boolean r12 = r12.mo79237h()
            if (r12 == 0) goto L_0x05d2
            android.view.View r12 = r1.mo85812D(r8)
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.content.Context r13 = r1.f173499A
            android.content.res.Resources r13 = r13.getResources()
            int r10 = r13.getColor(r10)
            r12.setTextColor(r10)
            goto L_0x0601
        L_0x05d2:
            if (r6 == 0) goto L_0x05eb
            android.view.View r10 = r1.mo85812D(r8)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.content.Context r12 = r1.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131099898(0x7f0600fa, float:1.7812162E38)
            int r12 = r12.getColor(r13)
            r10.setTextColor(r12)
            goto L_0x0601
        L_0x05eb:
            android.view.View r10 = r1.mo85812D(r8)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.content.Context r12 = r1.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131099669(0x7f060015, float:1.7811698E38)
            int r12 = r12.getColor(r13)
            r10.setTextColor(r12)
        L_0x0601:
            ve1.i r27 = ve1.C65604i.f188772a
            android.content.Context r10 = r1.f173499A
            gy3.C87412m.m108593f(r10, r2)
            r12 = 2131302299(0x7f09179b, float:1.822268E38)
            android.view.View r13 = r1.mo85812D(r12)
            java.lang.String r14 = "holder.getView<View>(R.id.feed_comment_layout)"
            gy3.C87412m.m108593f(r13, r14)
            r14 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r14 = r1.mo85812D(r14)
            java.lang.String r15 = "holder.getView(R.id.nickname)"
            gy3.C87412m.m108593f(r14, r15)
            r30 = r14
            android.widget.TextView r30 = (android.widget.TextView) r30
            r14 = 2131300029(0x7f090ebd, float:1.8218076E38)
            android.view.View r14 = r1.mo85812D(r14)
            java.lang.String r15 = "holder.getView(R.id.comment_time)"
            gy3.C87412m.m108593f(r14, r15)
            r31 = r14
            android.widget.TextView r31 = (android.widget.TextView) r31
            android.view.View r32 = r1.mo85812D(r7)
            android.view.View r7 = r1.mo85812D(r8)
            r33 = r7
            android.widget.TextView r33 = (android.widget.TextView) r33
            r7 = 2131311195(0x7f093a5b, float:1.8240723E38)
            android.view.View r7 = r1.mo85812D(r7)
            java.lang.String r8 = "holder.getView(R.id.poster_tag)"
            gy3.C87412m.m108593f(r7, r8)
            r34 = r7
            android.widget.TextView r34 = (android.widget.TextView) r34
            r7 = 2131305224(0x7f092308, float:1.8228613E38)
            android.view.View r7 = r1.mo85812D(r7)
            java.lang.String r8 = "holder.getView(R.id.friend_tag)"
            gy3.C87412m.m108593f(r7, r8)
            r35 = r7
            android.widget.TextView r35 = (android.widget.TextView) r35
            java.lang.String r7 = "commentTimeText"
            r8 = r38
            gy3.C87412m.m108593f(r8, r7)
            r28 = r10
            r29 = r13
            r36 = r21
            r37 = r8
            r27.mo89688n(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            sq1.b r7 = r4.f181868d
            int r7 = r7.field_state
            r10 = 2131299995(0x7f090e9b, float:1.8218007E38)
            r13 = 2131299994(0x7f090e9a, float:1.8218005E38)
            r14 = -1
            if (r7 != r14) goto L_0x06bb
            r7 = 0
            r1.mo85817I(r13, r7)
            r1.mo85817I(r10, r7)
            android.view.View r7 = r1.mo85812D(r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            sq1.b r13 = r4.f181868d
            int r13 = r13.field_failedFlag
            r14 = 2131299996(0x7f090e9c, float:1.821801E38)
            r15 = 1
            if (r13 != r15) goto L_0x06a5
            r7 = 2131826307(0x7f111683, float:1.9285495E38)
            r1.mo85814F(r10, r7)
            android.view.View r7 = r1.mo85812D(r14)
            r15 = 0
            r7.setOnClickListener(r15)
            goto L_0x06b8
        L_0x06a5:
            r15 = 0
            r13 = 2131826553(0x7f111779, float:1.9285994E38)
            r1.mo85814F(r10, r13)
            android.view.View r10 = r1.mo85812D(r14)
            oq1.a r13 = new oq1.a
            r13.<init>(r0, r7, r1)
            r10.setOnClickListener(r13)
        L_0x06b8:
            r7 = 8
            goto L_0x06c4
        L_0x06bb:
            r7 = 8
            r15 = 0
            r1.mo85817I(r13, r7)
            r1.mo85817I(r10, r7)
        L_0x06c4:
            sq1.b r10 = r4.f181868d
            int r10 = r10.mo88877o2()
            r13 = 1
            r10 = r10 & r13
            r13 = 2131307272(0x7f092b08, float:1.8232767E38)
            if (r10 == 0) goto L_0x06d6
            r10 = 0
            r1.mo85817I(r13, r10)
            goto L_0x06d9
        L_0x06d6:
            r1.mo85817I(r13, r7)
        L_0x06d9:
            r10 = 2131302297(0x7f091799, float:1.8222676E38)
            r1.mo85817I(r10, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "maskView gone "
            r7.append(r13)
            r13 = r43
            r7.append(r13)
            java.lang.String r14 = ", blink "
            r7.append(r14)
            boolean r14 = r4.f181872h
            r7.append(r14)
            java.lang.String r14 = ", hasBlink "
            r7.append(r14)
            boolean r14 = r4.f181873i
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            boolean r7 = r4.f181872h
            if (r7 == 0) goto L_0x07cc
            boolean r7 = r4.f181873i
            if (r7 != 0) goto L_0x07cc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "begin blink animation "
            r7.append(r14)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            r7 = 1
            r4.f181873i = r7
            android.view.View r7 = r1.mo85812D(r10)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r14)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r7
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r10 = 0
            java.lang.Object r9 = r9.mo10231a(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            r9 = 1065353216(0x3f800000, float:1.0)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r10.mo10233c(r9)
            java.lang.Object[] r28 = r10.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setAlpha"
            java.lang.String r34 = "(F)V"
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r10 = r10.mo10231a(r9)
            java.lang.Float r10 = (java.lang.Float) r10
            float r9 = r10.floatValue()
            r7.setAlpha(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setAlpha"
            java.lang.String r33 = "(F)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            android.view.ViewPropertyAnimator r9 = r7.animate()
            r10 = 0
            android.view.ViewPropertyAnimator r9 = r9.alpha(r10)
            r12 = 1000(0x3e8, double:4.94E-321)
            android.view.ViewPropertyAnimator r9 = r9.setDuration(r12)
            oq1.b r10 = new oq1.b
            r12 = r43
            r10.<init>(r7, r12)
            android.view.ViewPropertyAnimator r7 = r9.setListener(r10)
            r7.start()
        L_0x07cc:
            er1.w3 r7 = er1.C58784w3.f168295a
            lq1.h r9 = r0.f176670e
            qq1.a r9 = r9.mo79245u()
            java.lang.String r9 = r9.f179673e
            boolean r7 = r7.mo83899R0(r9)
            if (r7 == 0) goto L_0x0831
            r7 = 2131300018(0x7f090eb2, float:1.8218054E38)
            android.view.View r7 = r1.mo85812D(r7)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r12)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r7
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r10 = 0
            java.lang.Object r9 = r9.mo10231a(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            oq1.c r9 = new oq1.c
            r9.<init>(r0, r1, r4)
            r7.setOnClickListener(r9)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x0876
        L_0x0831:
            r7 = 2131300018(0x7f090eb2, float:1.8218054E38)
            android.view.View r7 = r1.mo85812D(r7)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r9.mo10233c(r11)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r7
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r10 = 0
            java.lang.Object r9 = r9.mo10231a(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0876:
            boolean r7 = r0.f176671f
            r9 = 2131314258(0x7f094652, float:1.8246936E38)
            if (r7 == 0) goto L_0x0906
            r2 = 2131313529(0x7f094379, float:1.8245457E38)
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r11)
            java.lang.Object[] r13 = r3.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r15 = "onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r2
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r1 = r1.mo85812D(r9)
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r21 = r2.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r1
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r22 = "onBindViewHolder"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0c58
        L_0x0906:
            sq1.b r7 = r4.f181868d
            int r7 = r7.mo88879q2()
            r10 = 2131313529(0x7f094379, float:1.8245457E38)
            android.view.View r10 = r1.mo85812D(r10)
            android.content.Context r12 = r1.f173499A
            r13 = 2131838037(0x7f114455, float:1.9309286E38)
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r9 = 2
            java.lang.String r17 = er1.C7878t0.m8034c(r9, r7)
            r9 = 0
            r15[r9] = r17
            java.lang.String r12 = r12.getString(r13, r15)
            java.lang.String r13 = "holder.context.getString…NE_WX, totalLevel2Count))"
            gy3.C87412m.m108593f(r12, r13)
            lq1.h r13 = r0.f176670e
            boolean r13 = r13.mo79226C(r4, r14)
            if (r7 <= 0) goto L_0x0a5f
            if (r13 == 0) goto L_0x0a5f
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r7.mo10233c(r13)
            java.lang.Object[] r28 = r7.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r10
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r7 = r7.mo10231a(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10.setVisibility(r7)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            r7 = 2131313531(0x7f09437b, float:1.8245461E38)
            android.view.View r7 = r10.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setText(r12)
            r7 = 2131313528(0x7f094378, float:1.8245455E38)
            android.view.View r7 = r10.findViewById(r7)
            k20.a r9 = new k20.a
            r9.<init>()
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r9.mo10233c(r13)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r7
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r12 = 0
            java.lang.Object r9 = r9.mo10231a(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            r9 = 2131313530(0x7f09437a, float:1.824546E38)
            android.view.View r9 = r10.findViewById(r9)
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r11)
            java.lang.Object[] r28 = r12.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r9
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r11 = 0
            java.lang.Object r12 = r12.mo10231a(r11)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r9.setVisibility(r11)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            oq1.d r11 = new oq1.d
            r11.<init>(r7, r9, r0, r4)
            r10.setOnClickListener(r11)
            r7 = 2131314258(0x7f094652, float:1.8246936E38)
            android.view.View r9 = r1.mo85812D(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo10233c(r11)
            java.lang.Object[] r28 = r7.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r9
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r10 = 0
            java.lang.Object r7 = r7.mo10231a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0b29
        L_0x0a5f:
            if (r13 != 0) goto L_0x0aa5
            r7 = 2131314258(0x7f094652, float:1.8246936E38)
            android.view.View r7 = r1.mo85812D(r7)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r11)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r7
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r12 = 0
            java.lang.Object r9 = r9.mo10231a(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0aed
        L_0x0aa5:
            r7 = 2131314258(0x7f094652, float:1.8246936E38)
            android.view.View r7 = r1.mo85812D(r7)
            k20.a r9 = new k20.a
            r9.<init>()
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r9.mo10233c(r13)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r7
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r12 = 0
            java.lang.Object r9 = r9.mo10231a(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0aed:
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r11)
            java.lang.Object[] r28 = r7.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r10
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            java.lang.Object r7 = r7.mo10231a(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10.setVisibility(r7)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0b29:
            sq1.b r7 = r4.f181868d
            java.lang.String r7 = r7.getNickname()
            r10 = r39
            r10.setContentDescription(r7)
            r7 = 2131302299(0x7f09179b, float:1.822268E38)
            android.view.View r7 = r1.mo85812D(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L_0x0b7b
            r9 = 2131302575(0x7f0918af, float:1.822324E38)
            r14 = r21
            r7.setTag(r9, r14)
            r9 = 2131302516(0x7f091874, float:1.822312E38)
            r7.setTag(r9, r8)
            r8 = 2131302514(0x7f091872, float:1.8223116E38)
            r9 = 2131299973(0x7f090e85, float:1.8217963E38)
            android.view.View r9 = r1.mo85812D(r9)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r9
            if (r9 == 0) goto L_0x0b61
            java.lang.CharSequence r9 = r9.getText()
            if (r9 != 0) goto L_0x0b62
        L_0x0b61:
            r9 = r5
        L_0x0b62:
            r7.setTag(r8, r9)
            r8 = 2131302525(0x7f09187d, float:1.8223139E38)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.setTag(r8, r6)
            r6 = 2131302530(0x7f091882, float:1.8223149E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.setTag(r6, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0b7b:
            java.lang.Class<l31.e> r3 = l31.C61212e.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            l31.e r3 = (l31.C61212e) r3
            android.view.View r6 = r1.f44854d
            java.lang.String r7 = "finder_comment_item_view"
            r3.o30(r6, r7)
            java.lang.Class<l31.e> r3 = l31.C61212e.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            l31.e r3 = (l31.C61212e) r3
            android.view.View r6 = r1.f44854d
            r7 = 8
            rx3.l[] r7 = new rx3.C13604l[r7]
            sq1.b r4 = r4.f181868d
            long r8 = r4.field_feedId
            java.lang.String r4 = o40.C61926c.m72691p(r8)
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "feed_id"
            r8.<init>(r9, r4)
            r4 = 0
            r7[r4] = r8
            rx3.l r4 = new rx3.l
            java.lang.String r8 = "session_buffer"
            r4.<init>(r8, r5)
            r5 = 1
            r7[r5] = r4
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            android.content.Context r5 = r1.f173499A
            gy3.C87412m.m108593f(r5, r2)
            rs1.s8 r5 = r4.mo12873f(r5)
            if (r5 == 0) goto L_0x0bc5
            java.lang.String r5 = r5.f38099o
            goto L_0x0bc6
        L_0x0bc5:
            r5 = 0
        L_0x0bc6:
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "behaviour_session_id"
            r8.<init>(r9, r5)
            r5 = 2
            r7[r5] = r8
            r5 = 3
            android.content.Context r8 = r1.f173499A
            gy3.C87412m.m108593f(r8, r2)
            rs1.s8 r8 = r4.mo12873f(r8)
            if (r8 == 0) goto L_0x0bdf
            java.lang.String r8 = r8.f38098n
            goto L_0x0be0
        L_0x0bdf:
            r8 = 0
        L_0x0be0:
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "finder_context_id"
            r9.<init>(r10, r8)
            r7[r5] = r9
            r5 = 4
            android.content.Context r8 = r1.f173499A
            gy3.C87412m.m108593f(r8, r2)
            rs1.s8 r8 = r4.mo12873f(r8)
            if (r8 == 0) goto L_0x0bf8
            java.lang.String r8 = r8.f38100p
            goto L_0x0bf9
        L_0x0bf8:
            r8 = 0
        L_0x0bf9:
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "finder_tab_context_id"
            r9.<init>(r10, r8)
            r7[r5] = r9
            r5 = 5
            android.content.Context r8 = r1.f173499A
            gy3.C87412m.m108593f(r8, r2)
            rs1.s8 r8 = r4.mo12873f(r8)
            if (r8 == 0) goto L_0x0c11
            java.lang.String r8 = r8.f38107v
            goto L_0x0c12
        L_0x0c11:
            r8 = 0
        L_0x0c12:
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "extra_info"
            r9.<init>(r10, r8)
            r7[r5] = r9
            r5 = 6
            android.content.Context r8 = r1.f173499A
            gy3.C87412m.m108593f(r8, r2)
            rs1.s8 r8 = r4.mo12873f(r8)
            if (r8 == 0) goto L_0x0c2a
            java.lang.String r8 = r8.f38109x
            goto L_0x0c2b
        L_0x0c2a:
            r8 = 0
        L_0x0c2b:
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "enter_source_info"
            r9.<init>(r10, r8)
            r7[r5] = r9
            r5 = 7
            android.content.Context r1 = r1.f173499A
            gy3.C87412m.m108593f(r1, r2)
            rs1.s8 r1 = r4.mo12873f(r1)
            if (r1 == 0) goto L_0x0c47
            int r1 = r1.f38096i
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            goto L_0x0c48
        L_0x0c47:
            r11 = 0
        L_0x0c48:
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "comment_scene"
            r1.<init>(r2, r11)
            r7[r5] = r1
            java.util.Map r1 = sx3.C90364q0.m113147f(r7)
            r3.mo86149PM(r6, r1)
        L_0x0c58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oq1.C62131l.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.cyd);
        C57839g4 g4Var = new C57839g4(D);
        D.setTouchDelegate(g4Var);
        int f = C76577a.m92155f(oVar.f173499A, C0966R.dimen.f3736cp);
        View D2 = oVar.mo85812D(C0966R.C0970id.bjx);
        if (D2 != null) {
            D2.post(new C62132a(D2, f, g4Var));
        }
        View D3 = oVar.mo85812D(C0966R.C0970id.a2u);
        if (D3 != null) {
            D3.post(new C62133b(D3, f, g4Var));
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(oVar.mo85812D(C0966R.C0970id.a2u), "finder_feed_first_comment_awesome_iv");
        FinderCollapsibleTextView finderCollapsibleTextView = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.ipj);
        finderCollapsibleTextView.setLimitLine(2);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.mo23655d(false);
        finderCollapsibleTextView.setOnCollapse(new C62134c(oVar));
        finderCollapsibleTextView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        FinderCollapsibleTextView finderCollapsibleTextView2 = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.bj4);
        finderCollapsibleTextView2.setLimitLine(4);
        finderCollapsibleTextView2.setCollapse(true);
        finderCollapsibleTextView2.mo23655d(false);
        finderCollapsibleTextView2.setOnCollapse(new C62135d(oVar));
    }
}
