package oq1;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C57839g4;
import com.tencent.p014mm.p136ui.C57840h4;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lq1.C61364h;
import rx3.C13598b0;
import sq1.C64151e;

/* renamed from: oq1.n */
public final class C62137n extends C60896i<C64151e> {

    /* renamed from: e */
    public final C61364h f176682e;

    /* renamed from: oq1.n$a */
    public static final class C62138a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f176683d;

        /* renamed from: e */
        public final /* synthetic */ View f176684e;

        /* renamed from: f */
        public final /* synthetic */ C62137n f176685f;

        /* renamed from: g */
        public final /* synthetic */ C64151e f176686g;

        /* renamed from: h */
        public final /* synthetic */ boolean f176687h;

        public C62138a(View view, View view2, C62137n nVar, C64151e eVar, boolean z) {
            this.f176683d = view;
            this.f176684e = view2;
            this.f176685f = nVar;
            this.f176686g = eVar;
            this.f176687h = z;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f176683d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f176684e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f176685f.f176682e.mo79238i0(this.f176686g, this.f176687h);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oq1.n$b */
    public static final class C62139b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f176688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62139b(C60905o oVar) {
            super(1);
            this.f176688d = oVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.f176688d.f173503E;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.UniFeedComment");
            ((C64151e) obj2).f181870f = booleanValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oq1.n$c */
    public static final class C62140c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f176689d;

        /* renamed from: e */
        public final /* synthetic */ int f176690e;

        /* renamed from: f */
        public final /* synthetic */ C57839g4 f176691f;

        public C62140c(View view, int i, C57839g4 g4Var) {
            this.f176689d = view;
            this.f176690e = i;
            this.f176691f = g4Var;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f176689d.getHitRect(rect);
            int i = this.f176690e;
            rect.inset(-i, -i);
            this.f176691f.mo82266a(new C57840h4(rect, this.f176689d));
        }
    }

    public C62137n(C61364h hVar) {
        C87412m.m108594g(hVar, "presenter");
        this.f176682e = hVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6257ve;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x049a, code lost:
        if (((r4.f181868d.mo88877o2() & 16) != 0) != false) goto L_0x049c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x075c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0761  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x09d5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x058e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r40, jq3.C9493c r41, int r42, int r43, boolean r44, java.util.List r45) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r42
            pl1.e0$a r3 = pl1.C11978e0.C11979a.AVATAR
            r4 = r41
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
            sq1.b r14 = r4.f181868d
            r14.getClass()
            er1.j4 r15 = er1.C58739j4.f168176a
            int r14 = r14.mo88877o2()
            r15.getClass()
            r11 = 2
            r14 = r14 & r11
            if (r14 == 0) goto L_0x005b
            r14 = 1
            goto L_0x005c
        L_0x005b:
            r14 = 0
        L_0x005c:
            if (r14 != 0) goto L_0x0095
            sq1.b r14 = r4.f181868d
            boolean r14 = r14.mo88885v2()
            if (r14 != 0) goto L_0x0095
            up1.f r14 = up1.C37521f.f99374d
            r14.getClass()
            pe1.c<java.lang.Integer> r14 = up1.C37521f.f99376d2
            java.lang.Object r14 = r14.mo60266n()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            if (r14 <= 0) goto L_0x0095
            lq1.h r14 = r0.f176682e
            qq1.a r14 = r14.mo79245u()
            java.lang.String r14 = r14.f179673e
            android.view.View r9 = r1.mo85812D(r13)
            oq1.r r12 = new oq1.r
            r12.<init>(r1, r14, r4)
            r9.setOnClickListener(r12)
            oq1.s r9 = new oq1.s
            r9.<init>(r1, r14, r4)
            r10.setOnClickListener(r9)
        L_0x0095:
            r9 = 2131305224(0x7f092308, float:1.8228613E38)
            r12 = 8
            r1.mo85817I(r9, r12)
            lq1.h r14 = r0.f176682e
            r14.mo79244s()
            lq1.h r14 = r0.f176682e
            r14.mo79242p()
            lq1.h r14 = r0.f176682e
            int r14 = r14.mo79235g()
            if (r14 != r11) goto L_0x00b1
            r14 = 1
            goto L_0x00b2
        L_0x00b1:
            r14 = 0
        L_0x00b2:
            r9 = 2131101015(0x7f060557, float:1.7814428E38)
            if (r14 == 0) goto L_0x014d
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            di3.d r17 = di3.C86312j.m106911c(r6)
            r12 = r17
            ny.h r12 = (p629ny.C76979h) r12
            android.content.Context r11 = r1.f173499A
            er1.w3 r18 = er1.C58784w3.f168295a
            sq1.b r13 = r4.f181868d
            java.lang.String r19 = r13.getUsername()
            sq1.b r13 = r4.f181868d
            java.lang.String r20 = r13.getNickname()
            r21 = 0
            r22 = 4
            r23 = 0
            java.lang.String r13 = er1.C58784w3.m68433S(r18, r19, r20, r21, r22, r23)
            android.text.SpannableString r11 = r12.mo107057T1(r11, r13)
            r14.<init>(r11)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            android.text.SpannableStringBuilder r11 = r11.append(r14)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r12 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            com.tencent.mm.plugin.FinderCommonFeatureService r12 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r12
            sq1.b r13 = r4.f181868d
            java.lang.String r13 = r13.getUsername()
            boolean r12 = r12.mo76747EE(r13)
            java.lang.String r13 = "textBuilder"
            if (r12 != 0) goto L_0x0118
            sq1.b r12 = r4.f181868d
            java.lang.String r12 = r12.getUsername()
            boolean r12 = r15.mo83694W(r12)
            if (r12 == 0) goto L_0x010f
            goto L_0x0118
        L_0x010f:
            ve1.i r12 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r11, r13)
            r12.mo89687m(r10, r11)
            goto L_0x0169
        L_0x0118:
            ve1.i r12 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r11, r13)
            r12.mo89687m(r10, r11)
            up1.f r11 = up1.C37521f.f99374d
            boolean r11 = r11.mo61182h()
            if (r11 == 0) goto L_0x0169
            android.content.Context r11 = r1.f173499A
            android.content.res.Resources r11 = r11.getResources()
            int r11 = r11.getColor(r9)
            r10.setTextColor(r11)
            oq1.t r11 = new oq1.t
            r11.<init>(r4, r1)
            r10.setOnClickListener(r11)
            r11 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r12 = r1.mo85812D(r11)
            oq1.u r11 = new oq1.u
            r11.<init>(r4, r1)
            r12.setOnClickListener(r11)
            goto L_0x0169
        L_0x014d:
            di3.d r11 = di3.C86312j.m106911c(r6)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r12 = r1.f173499A
            sq1.b r13 = r4.f181868d
            java.lang.String r13 = r13.getNickname()
            android.text.SpannableString r14 = r11.mo107057T1(r12, r13)
            java.lang.String r11 = "getService(ISpannableSer…ommentObj.nickname ?: \"\")"
            gy3.C87412m.m108593f(r14, r11)
            ve1.i r11 = ve1.C65604i.f188772a
            r11.mo89687m(r10, r14)
        L_0x0169:
            android.content.Context r11 = r1.f173499A
            sq1.b r12 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r12.mo88876n2()
            long r12 = r12.createtime
            r18 = r10
            r9 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r9
            java.lang.String r11 = er1.C7878t0.m8037f(r11, r12)
            r12 = 2131300029(0x7f090ebd, float:1.8218076E38)
            r1.mo85815G(r12, r11)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r9 = "username="
            r13.append(r9)
            sq1.b r9 = r4.f181868d
            java.lang.String r9 = r9.getUsername()
            r13.append(r9)
            java.lang.String r9 = ", nickName="
            r13.append(r9)
            sq1.b r9 = r4.f181868d
            java.lang.String r9 = r9.getNickname()
            r13.append(r9)
            java.lang.String r9 = " content="
            r13.append(r9)
            sq1.b r9 = r4.f181868d
            java.lang.String r9 = r9.getContent()
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            java.lang.String r10 = "Finder.FinderFeedCommentLevel2Convert"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r9)
            r9 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r13 = r1.mo85812D(r9)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            sq1.b r9 = r4.f181868d
            r9.getClass()
            int r9 = r9.mo88877o2()
            r15.getClass()
            r15 = 2
            r9 = r9 & r15
            if (r9 == 0) goto L_0x01d7
            r9 = 1
            goto L_0x01d8
        L_0x01d7:
            r9 = 0
        L_0x01d8:
            java.lang.String r15 = "avatarIv"
            if (r9 == 0) goto L_0x0215
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r12 = r9.mo62446e(r8)
            bl3.c r12 = r12.mo62447c(r7)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11872i2()
            pl1.f r2 = new pl1.f
            r36 = r14
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.mo88880r2()
            r2.<init>(r14, r5)
            gy3.C87412m.m108593f(r13, r15)
            bl3.r$a r5 = r9.mo62446e(r8)
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r3 = r5.mo11867O2(r3)
            r12.mo85957c(r2, r13, r3)
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            r3 = 0
            r1.mo85817I(r2, r3)
            goto L_0x0256
        L_0x0215:
            r36 = r14
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            sq1.b r9 = r4.f181868d
            boolean r9 = r9.mo88885v2()
            if (r9 == 0) goto L_0x0258
            r9 = 8
            r1.mo85817I(r2, r9)
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r9 = r2.mo62446e(r8)
            bl3.c r9 = r9.mo62447c(r7)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11872i2()
            pl1.f r12 = new pl1.f
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.mo88880r2()
            r12.<init>(r14, r5)
            gy3.C87412m.m108593f(r13, r15)
            bl3.r$a r2 = r2.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r3)
            r9.mo85957c(r12, r13, r2)
        L_0x0256:
            r2 = 1
            goto L_0x02a2
        L_0x0258:
            r3 = 8
            r1.mo85817I(r2, r3)
            sq1.b r2 = r4.f181868d
            java.lang.String r2 = r2.mo88880r2()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x029b
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r3 = r2.mo62446e(r8)
            bl3.c r3 = r3.mo62447c(r7)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11865K1()
            pl1.f r9 = new pl1.f
            sq1.b r12 = r4.f181868d
            java.lang.String r12 = r12.mo88880r2()
            r9.<init>(r12, r5)
            gy3.C87412m.m108593f(r13, r15)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r2 = r2.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r5)
            r3.mo85957c(r9, r13, r2)
            goto L_0x02a1
        L_0x029b:
            r2 = 2131231871(0x7f08047f, float:1.8079835E38)
            r13.setImageResource(r2)
        L_0x02a1:
            r2 = 0
        L_0x02a2:
            r3 = 2131302939(0x7f091a1b, float:1.8223978E38)
            android.view.View r5 = r1.mo85812D(r3)
            if (r5 == 0) goto L_0x033d
            sq1.b r7 = r4.f181868d
            boolean r7 = r7.mo88885v2()
            if (r7 == 0) goto L_0x02f7
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r9)
            java.lang.Object[] r26 = r7.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r5
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x033b
        L_0x02f7:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r8 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r9)
            java.lang.Object[] r26 = r7.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r5
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x033b:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x033d:
            android.content.Context r5 = r1.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131101015(0x7f060557, float:1.7814428E38)
            int r5 = r5.getColor(r7)
            r7 = r18
            r7.setTextColor(r5)
            if (r2 == 0) goto L_0x0378
            oq1.v r2 = new oq1.v
            r2.<init>(r4, r0, r1)
            r7.setOnClickListener(r2)
            r2 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r2 = r1.mo85812D(r2)
            oq1.w r5 = new oq1.w
            r5.<init>(r4, r0, r1)
            r2.setOnClickListener(r5)
            android.view.View r2 = r1.mo85812D(r3)
            if (r2 == 0) goto L_0x0378
            oq1.x r3 = new oq1.x
            r3.<init>(r4, r0, r1)
            r2.setOnClickListener(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0378:
            java.lang.String r2 = "holder.context"
            r3 = 2131299973(0x7f090e85, float:1.8217963E38)
            java.lang.String r8 = ""
            if (r44 != 0) goto L_0x0564
            android.view.View r9 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r9
            java.lang.Object r12 = r1.f173503E
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.UniFeedComment"
            gy3.C87412m.m108592e(r12, r13)
            sq1.e r12 = (sq1.C64151e) r12
            boolean r12 = r12.f181870f
            r9.setCollapse(r12)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            sq1.b r12 = r4.f181868d
            long r12 = r12.mo88882t2()
            r14 = 0
            int r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r18 == 0) goto L_0x050f
            sq1.b r12 = r4.f181868d
            long r12 = r12.mo88882t2()
            sq1.b r14 = r4.f181868d
            te3.ye0 r14 = r14.field_actionInfo
            long r14 = r14.f186500h
            int r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r18 == 0) goto L_0x050f
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            android.content.Context r13 = r1.f173499A
            r14 = 2131829764(0x7f112404, float:1.9292506E38)
            java.lang.String r13 = r13.getString(r14)
            r12.append(r13)
            int r13 = r12.length()
            sq1.b r14 = r4.f181868d
            java.lang.String r14 = r14.mo88884u2()
            ve1.i r15 = ve1.C65604i.f188772a
            com.tencent.neattextview.textview.view.NeatTextView r18 = r9.getContentTextView()
            android.text.TextPaint r3 = r18.getPaint()
            java.lang.String r5 = "commentTextView.contentTextView.paint"
            gy3.C87412m.m108593f(r3, r5)
            android.content.Context r5 = r1.f173499A
            gy3.C87412m.m108593f(r5, r2)
            up1.f r25 = up1.C37521f.f99374d
            r37 = r7
            int r7 = r25.mo61150D()
            int r5 = r15.mo89677c(r5, r7)
            android.content.Context r7 = r1.f173499A
            gy3.C87412m.m108593f(r7, r2)
            int r25 = r25.mo61150D()
            r38 = r11
            r16 = 1
            int r11 = r25 + 1
            int r7 = r15.mo89677c(r7, r11)
            java.lang.String r3 = r15.mo89678d(r3, r14, r5, r7)
            di3.d r5 = di3.C86312j.m106911c(r6)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r7 = r1.f173499A
            android.text.SpannableString r3 = r5.mo107057T1(r7, r3)
            r12.append(r3)
            int r3 = r12.length()
            sq1.b r5 = r4.f181868d
            int r5 = r5.mo88877o2()
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0424
            r5 = 1
            goto L_0x0425
        L_0x0424:
            r5 = 0
        L_0x0425:
            if (r5 == 0) goto L_0x0438
            android.content.Context r5 = r1.f173499A
            r7 = 2131826324(0x7f111694, float:1.928553E38)
            java.lang.String r5 = r5.getString(r7)
            r12.append(r5)
            int r5 = r12.length()
            goto L_0x0439
        L_0x0438:
            r5 = r3
        L_0x0439:
            android.content.Context r7 = r1.f173499A
            r11 = 2131826303(0x7f11167f, float:1.9285487E38)
            java.lang.String r7 = r7.getString(r11)
            android.text.SpannableStringBuilder r7 = r12.append(r7)
            sq1.b r11 = r4.f181868d
            java.lang.String r11 = r11.getContent()
            r7.append(r11)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r12 = r12.toString()
            android.text.SpannableString r6 = r6.mo107057T1(r11, r12)
            r7.<init>(r6)
            android.text.SpannableString r6 = android.text.SpannableString.valueOf(r7)
            sq1.b r7 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r7 = r7.mo88876n2()
            java.lang.String r7 = r7.reply_username
            if (r7 != 0) goto L_0x0475
            r7 = r8
        L_0x0475:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r11 = 17
            if (r7 != 0) goto L_0x04e2
            sq1.b r7 = r4.f181868d
            int r7 = r7.mo88877o2()
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0489
            r7 = 1
            goto L_0x048a
        L_0x0489:
            r7 = 0
        L_0x048a:
            if (r7 != 0) goto L_0x049c
            sq1.b r7 = r4.f181868d
            int r7 = r7.mo88877o2()
            r12 = 16
            r7 = r7 & r12
            if (r7 == 0) goto L_0x0499
            r7 = 1
            goto L_0x049a
        L_0x0499:
            r7 = 0
        L_0x049a:
            if (r7 == 0) goto L_0x04e2
        L_0x049c:
            com.tencent.mm.plugin.finder.view.g5 r7 = new com.tencent.mm.plugin.finder.view.g5
            sq1.b r12 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r12.mo88876n2()
            java.lang.String r12 = r12.reply_username
            if (r12 != 0) goto L_0x04ab
            r26 = r8
            goto L_0x04ad
        L_0x04ab:
            r26 = r12
        L_0x04ad:
            android.content.Context r12 = r1.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131101015(0x7f060557, float:1.7814428E38)
            int r27 = r12.getColor(r14)
            android.content.Context r12 = r1.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131099665(0x7f060011, float:1.781169E38)
            int r28 = r12.getColor(r14)
            r29 = 0
            r30 = 0
            oq1.o r12 = new oq1.o
            r12.<init>(r4, r0)
            r32 = 16
            r33 = 0
            r25 = r7
            r31 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r6.setSpan(r7, r13, r3, r11)
            r14 = 2131099804(0x7f06009c, float:1.7811972E38)
            goto L_0x04f7
        L_0x04e2:
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            android.content.Context r12 = r1.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r12 = r12.getColor(r14)
            r7.<init>(r12)
            r6.setSpan(r7, r13, r3, r11)
        L_0x04f7:
            if (r3 == r5) goto L_0x050b
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            android.content.Context r12 = r1.f173499A
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getColor(r14)
            r7.<init>(r12)
            r6.setSpan(r7, r3, r5, r11)
        L_0x050b:
            r9.setText(r6)
            goto L_0x0528
        L_0x050f:
            r37 = r7
            r38 = r11
            di3.d r3 = di3.C86312j.m106911c(r6)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r5 = r1.f173499A
            sq1.b r6 = r4.f181868d
            java.lang.String r6 = r6.getContent()
            android.text.SpannableString r3 = r3.mo107057T1(r5, r6)
            r9.setText(r3)
        L_0x0528:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "onBindViewHolder replyCommentId:"
            r3.append(r5)
            sq1.b r5 = r4.f181868d
            long r5 = r5.mo88882t2()
            r3.append(r5)
            java.lang.String r5 = ", content:"
            r3.append(r5)
            sq1.b r5 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r5 = r5.mo88876n2()
            java.lang.String r5 = r5.reply_content
            if (r5 != 0) goto L_0x054b
            r5 = r8
        L_0x054b:
            r3.append(r5)
            java.lang.String r5 = ", nickname:"
            r3.append(r5)
            sq1.b r5 = r4.f181868d
            java.lang.String r5 = r5.mo88884u2()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            goto L_0x0568
        L_0x0564:
            r37 = r7
            r38 = r11
        L_0x0568:
            mq1.e r3 = mq1.C61557e.f174962f
            lq1.h r5 = r0.f176682e
            qq1.a r5 = r5.mo79245u()
            long r5 = r5.mo88217a()
            sq1.b r7 = r4.f181868d
            lq1.h r9 = r0.f176682e
            int r9 = r9.mo79235g()
            boolean r5 = r3.mo86493b(r5, r7, r9)
            r6 = 2131297504(0x7f0904e0, float:1.8212955E38)
            android.view.View r7 = r1.mo85812D(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            r9 = 2131099718(0x7f060046, float:1.7811797E38)
            if (r5 == 0) goto L_0x05cc
            lq1.h r11 = r0.f176682e
            boolean r11 = r11.mo79237h()
            r12 = 2131755879(0x7f100367, float:1.914265E38)
            if (r11 == 0) goto L_0x05b1
            rx3.l r11 = new rx3.l
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.content.Context r13 = r1.f173499A
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r9)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11.<init>(r12, r13)
            goto L_0x0609
        L_0x05b1:
            rx3.l r11 = new rx3.l
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.content.Context r13 = r1.f173499A
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131099905(0x7f060101, float:1.7812176E38)
            int r13 = r13.getColor(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11.<init>(r12, r13)
            goto L_0x0609
        L_0x05cc:
            lq1.h r11 = r0.f176682e
            boolean r11 = r11.mo79237h()
            r12 = 2131755901(0x7f10037d, float:1.9142694E38)
            if (r11 == 0) goto L_0x05ef
            rx3.l r11 = new rx3.l
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.content.Context r13 = r1.f173499A
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r9)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11.<init>(r12, r13)
            goto L_0x0609
        L_0x05ef:
            rx3.l r11 = new rx3.l
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.content.Context r13 = r1.f173499A
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r13 = r13.getColor(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11.<init>(r12, r13)
        L_0x0609:
            A r12 = r11.f38555d
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            B r11 = r11.f38556e
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r7.setImageResource(r12)
            r7.setIconColor(r11)
            oq1.y r11 = new oq1.y
            r11.<init>(r0, r1)
            r7.setOnClickListener(r11)
            lq1.h r7 = r0.f176682e
            qq1.a r7 = r7.mo79245u()
            long r11 = r7.mo88217a()
            sq1.b r7 = r4.f181868d
            lq1.h r13 = r0.f176682e
            int r13 = r13.mo79235g()
            int r3 = r3.mo86492a(r11, r7, r13)
            r7 = 2131297505(0x7f0904e1, float:1.8212957E38)
            android.view.View r11 = r1.mo85812D(r7)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setContentDescription(r8)
            if (r3 <= 0) goto L_0x0672
            r12 = 0
            r1.mo85817I(r7, r12)
            java.lang.String r12 = java.lang.String.valueOf(r3)
            r1.mo85815G(r7, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            android.content.Context r13 = r1.f173499A
            r14 = 2131826870(0x7f1118b6, float:1.9286637E38)
            java.lang.String r13 = r13.getString(r14)
            r12.append(r13)
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            r11.setContentDescription(r3)
            goto L_0x067a
        L_0x0672:
            r3 = 8
            r1.mo85817I(r7, r3)
            r1.mo85815G(r7, r8)
        L_0x067a:
            lq1.h r3 = r0.f176682e
            boolean r3 = r3.mo79237h()
            if (r3 == 0) goto L_0x0696
            android.view.View r3 = r1.mo85812D(r7)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r5 = r1.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r9)
            r3.setTextColor(r5)
            goto L_0x06c5
        L_0x0696:
            if (r5 == 0) goto L_0x06af
            android.view.View r3 = r1.mo85812D(r7)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r5 = r1.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r9 = 2131099898(0x7f0600fa, float:1.7812162E38)
            int r5 = r5.getColor(r9)
            r3.setTextColor(r5)
            goto L_0x06c5
        L_0x06af:
            android.view.View r3 = r1.mo85812D(r7)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r5 = r1.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r9 = 2131099669(0x7f060015, float:1.7811698E38)
            int r5 = r5.getColor(r9)
            r3.setTextColor(r5)
        L_0x06c5:
            sq1.b r3 = r4.f181868d
            int r3 = r3.field_state
            r5 = -1
            r9 = 1
            if (r3 == r9) goto L_0x06d1
            if (r3 == r5) goto L_0x06d1
            r3 = 1
            goto L_0x06d2
        L_0x06d1:
            r3 = 0
        L_0x06d2:
            if (r3 != 0) goto L_0x06da
            r3 = 8
            r1.mo85817I(r6, r3)
            goto L_0x06de
        L_0x06da:
            r3 = 0
            r1.mo85817I(r6, r3)
        L_0x06de:
            ve1.i r25 = ve1.C65604i.f188772a
            android.content.Context r3 = r1.f173499A
            gy3.C87412m.m108593f(r3, r2)
            r2 = 2131307247(0x7f092aef, float:1.8232716E38)
            android.view.View r9 = r1.mo85812D(r2)
            java.lang.String r11 = "holder.getView<View>(R.id.level2_main_area)"
            gy3.C87412m.m108593f(r9, r11)
            r11 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r11 = r1.mo85812D(r11)
            java.lang.String r12 = "holder.getView(R.id.nickname)"
            gy3.C87412m.m108593f(r11, r12)
            r28 = r11
            android.widget.TextView r28 = (android.widget.TextView) r28
            r11 = 2131300029(0x7f090ebd, float:1.8218076E38)
            android.view.View r11 = r1.mo85812D(r11)
            java.lang.String r12 = "holder.getView(R.id.comment_time)"
            gy3.C87412m.m108593f(r11, r12)
            r29 = r11
            android.widget.TextView r29 = (android.widget.TextView) r29
            android.view.View r30 = r1.mo85812D(r6)
            android.view.View r6 = r1.mo85812D(r7)
            r31 = r6
            android.widget.TextView r31 = (android.widget.TextView) r31
            r6 = 2131311195(0x7f093a5b, float:1.8240723E38)
            android.view.View r6 = r1.mo85812D(r6)
            java.lang.String r7 = "holder.getView(R.id.poster_tag)"
            gy3.C87412m.m108593f(r6, r7)
            r32 = r6
            android.widget.TextView r32 = (android.widget.TextView) r32
            r6 = 2131305224(0x7f092308, float:1.8228613E38)
            android.view.View r6 = r1.mo85812D(r6)
            java.lang.String r7 = "holder.getView(R.id.friend_tag)"
            gy3.C87412m.m108593f(r6, r7)
            r33 = r6
            android.widget.TextView r33 = (android.widget.TextView) r33
            java.lang.String r6 = "commentTimeText"
            r7 = r38
            gy3.C87412m.m108593f(r7, r6)
            r26 = r3
            r27 = r9
            r34 = r36
            r35 = r7
            r25.mo89688n(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            sq1.b r3 = r4.f181868d
            int r3 = r3.mo88877o2()
            r6 = 1
            r3 = r3 & r6
            r6 = 2131307272(0x7f092b08, float:1.8232767E38)
            if (r3 == 0) goto L_0x0761
            r3 = 0
            r1.mo85817I(r6, r3)
            goto L_0x0767
        L_0x0761:
            r3 = 0
            r9 = 8
            r1.mo85817I(r6, r9)
        L_0x0767:
            sq1.b r6 = r4.f181868d
            int r6 = r6.field_state
            r9 = 2131299995(0x7f090e9b, float:1.8218007E38)
            r11 = 2131299994(0x7f090e9a, float:1.8218005E38)
            if (r6 != r5) goto L_0x07ad
            r1.mo85817I(r11, r3)
            r1.mo85817I(r9, r3)
            android.view.View r3 = r1.mo85812D(r9)
            android.widget.TextView r3 = (android.widget.TextView) r3
            sq1.b r5 = r4.f181868d
            int r5 = r5.field_failedFlag
            r6 = 2131299996(0x7f090e9c, float:1.821801E38)
            r11 = 1
            if (r5 != r11) goto L_0x0798
            r3 = 2131826307(0x7f111683, float:1.9285495E38)
            r1.mo85814F(r9, r3)
            android.view.View r3 = r1.mo85812D(r6)
            r5 = 0
            r3.setOnClickListener(r5)
            goto L_0x07aa
        L_0x0798:
            r5 = 2131826553(0x7f111779, float:1.9285994E38)
            r1.mo85814F(r9, r5)
            android.view.View r5 = r1.mo85812D(r6)
            oq1.p r6 = new oq1.p
            r6.<init>(r0, r3, r1)
            r5.setOnClickListener(r6)
        L_0x07aa:
            r3 = 8
            goto L_0x07b5
        L_0x07ad:
            r3 = 8
            r1.mo85817I(r11, r3)
            r1.mo85817I(r9, r3)
        L_0x07b5:
            r5 = 2131302298(0x7f09179a, float:1.8222678E38)
            r1.mo85817I(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "maskView gone "
            r3.append(r6)
            r6 = r42
            r3.append(r6)
            java.lang.String r9 = ", blink "
            r3.append(r9)
            boolean r9 = r4.f181872h
            r3.append(r9)
            java.lang.String r9 = ", hasBlink "
            r3.append(r9)
            boolean r9 = r4.f181873i
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            boolean r3 = r4.f181872h
            if (r3 == 0) goto L_0x08a8
            boolean r3 = r4.f181873i
            if (r3 != 0) goto L_0x08a8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "begin blink animation "
            r3.append(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            r3 = 1
            r4.f181873i = r3
            android.view.View r3 = r1.mo85812D(r5)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r5.mo10233c(r10)
            java.lang.Object[] r26 = r5.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r3
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r9 = 0
            java.lang.Object r5 = r5.mo10231a(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r9 = r3
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r5 = 1065353216(0x3f800000, float:1.0)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r9.mo10233c(r5)
            java.lang.Object[] r26 = r9.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setAlpha"
            java.lang.String r32 = "(F)V"
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r5 = 0
            java.lang.Object r9 = r9.mo10231a(r5)
            java.lang.Float r9 = (java.lang.Float) r9
            float r5 = r9.floatValue()
            r3.setAlpha(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setAlpha"
            java.lang.String r15 = "(F)V"
            r9 = r3
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.ViewPropertyAnimator r5 = r3.animate()
            r9 = 0
            android.view.ViewPropertyAnimator r5 = r5.alpha(r9)
            r9 = 1000(0x3e8, double:4.94E-321)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r9)
            oq1.q r9 = new oq1.q
            r9.<init>(r3, r6)
            android.view.ViewPropertyAnimator r3 = r5.setListener(r9)
            r3.start()
        L_0x08a8:
            android.view.View r2 = r1.mo85812D(r2)
            int r3 = r2.getPaddingLeft()
            int r5 = r2.getPaddingTop()
            int r6 = r2.getPaddingRight()
            android.content.Context r9 = r1.f173499A
            r10 = 6
            int r9 = kg3.C76577a.m92151b(r9, r10)
            r2.setPadding(r3, r5, r6, r9)
            lq1.h r3 = r0.f176682e
            sq1.b r5 = r4.f181868d
            te3.ye0 r5 = r5.field_actionInfo
            long r5 = r5.f186500h
            sq1.e r3 = r3.mo79248v(r5)
            r5 = 2131307249(0x7f092af1, float:1.823272E38)
            android.view.View r9 = r1.mo85812D(r5)
            r5 = 2131307248(0x7f092af0, float:1.8232718E38)
            android.view.View r5 = r1.mo85812D(r5)
            lq1.h r6 = r0.f176682e
            r10 = 1
            boolean r6 = r6.mo79226C(r4, r10)
            r10 = 2131314262(0x7f094656, float:1.8246944E38)
            if (r3 != 0) goto L_0x09d5
            if (r6 == 0) goto L_0x0949
            int r3 = r2.getPaddingLeft()
            int r4 = r2.getPaddingTop()
            int r5 = r2.getPaddingRight()
            android.content.Context r6 = r1.f173499A
            r7 = 16
            int r6 = kg3.C76577a.m92151b(r6, r7)
            r2.setPadding(r3, r4, r5, r6)
            android.view.View r1 = r1.mo85812D(r10)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0991
        L_0x0949:
            android.view.View r2 = r1.mo85812D(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r4)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r4 = "onBindViewHolder"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0991:
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r9
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0c4b
        L_0x09d5:
            sq1.b r11 = r3.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r11 = r11.mo88876n2()
            int r11 = r11.upContinueFlag
            r12 = 1
            if (r11 != r12) goto L_0x09e2
            r11 = 1
            goto L_0x09e3
        L_0x09e2:
            r11 = 0
        L_0x09e3:
            sq1.b r13 = r3.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r13 = r13.mo88876n2()
            int r13 = r13.continueFlag
            if (r13 != r12) goto L_0x09ef
            r12 = 1
            goto L_0x09f0
        L_0x09ef:
            r12 = 0
        L_0x09f0:
            android.content.Context r13 = r1.f173499A
            r14 = 2131838039(0x7f114457, float:1.930929E38)
            java.lang.String r13 = r13.getString(r14)
            java.lang.String r14 = "holder.context.getString…ng.to_show_more_comment3)"
            gy3.C87412m.m108593f(r13, r14)
            boolean r14 = r4.f181875n
            if (r14 == 0) goto L_0x0a1d
            int r14 = r3.f181874j
            if (r14 <= 0) goto L_0x0a1d
            android.content.Context r15 = r1.f173499A
            r43 = r8
            r10 = 1
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r10 = 2
            java.lang.String r14 = er1.C7878t0.m8034c(r10, r14)
            r10 = 0
            r8[r10] = r14
            r10 = 2131838037(0x7f114455, float:1.9309286E38)
            java.lang.String r8 = r15.getString(r10, r8)
            goto L_0x0a28
        L_0x0a1d:
            r43 = r8
            android.content.Context r8 = r1.f173499A
            r10 = 2131838038(0x7f114456, float:1.9309288E38)
            java.lang.String r8 = r8.getString(r10)
        L_0x0a28:
            java.lang.String r10 = "if (item.isAutoExpand &&…_more_comment2)\n        }"
            gy3.C87412m.m108593f(r8, r10)
            if (r12 == 0) goto L_0x0a86
            if (r6 == 0) goto L_0x0a86
            java.lang.String r2 = "downTipsLayout"
            gy3.C87412m.m108593f(r5, r2)
            r15 = 1
            r0.mo87194j(r5, r8, r3, r15)
            r2 = 2131314262(0x7f094656, float:1.8246944E38)
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r26 = r5.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0b76
        L_0x0a86:
            r15 = 1
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r8.mo10233c(r12)
            java.lang.Object[] r26 = r8.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r5
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r10 = 0
            java.lang.Object r8 = r8.mo10231a(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r5.setVisibility(r8)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            if (r6 == 0) goto L_0x0b2d
            int r5 = r2.getPaddingLeft()
            int r6 = r2.getPaddingTop()
            int r8 = r2.getPaddingRight()
            android.content.Context r10 = r1.f173499A
            r12 = 16
            int r10 = kg3.C76577a.m92151b(r10, r12)
            r2.setPadding(r5, r6, r8, r10)
            r2 = 2131314262(0x7f094656, float:1.8246944E38)
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r26 = r5.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0b76
        L_0x0b2d:
            r2 = 2131314262(0x7f094656, float:1.8246944E38)
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r26 = r5.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x0b76:
            if (r11 == 0) goto L_0x0b8d
            lq1.h r2 = r0.f176682e
            r5 = 0
            boolean r2 = r2.mo79226C(r4, r5)
            if (r2 == 0) goto L_0x0b8d
            java.lang.String r2 = "upTipsLayout"
            gy3.C87412m.m108593f(r9, r2)
            r0.mo87194j(r9, r13, r3, r5)
            r3 = 0
            r5 = 1
            goto L_0x0bd1
        L_0x0b8d:
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r26 = r2.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r9
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r9.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r2 = "(I)V"
            r5 = 1
            r15 = r2
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0bd1:
            sq1.b r2 = r4.f181868d
            java.lang.String r2 = r2.getNickname()
            r10 = r37
            r10.setContentDescription(r2)
            lq1.h r2 = r0.f176682e
            int r2 = r2.mo79235g()
            r6 = 2
            if (r2 != r6) goto L_0x0be7
            r9 = 1
            goto L_0x0be8
        L_0x0be7:
            r9 = 0
        L_0x0be8:
            if (r9 == 0) goto L_0x0c08
            er1.w3 r10 = er1.C58784w3.f168295a
            sq1.b r2 = r4.f181868d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r2.mo88876n2()
            java.lang.String r2 = r2.reply_username
            if (r2 != 0) goto L_0x0bf9
            r11 = r43
            goto L_0x0bfa
        L_0x0bf9:
            r11 = r2
        L_0x0bfa:
            sq1.b r2 = r4.f181868d
            java.lang.String r12 = r2.mo88884u2()
            r13 = 0
            r14 = 4
            r15 = 0
            java.lang.String r2 = er1.C58784w3.m68433S(r10, r11, r12, r13, r14, r15)
            goto L_0x0c0e
        L_0x0c08:
            sq1.b r2 = r4.f181868d
            java.lang.String r2 = r2.mo88884u2()
        L_0x0c0e:
            r3 = 2131302300(0x7f09179c, float:1.8222682E38)
            android.view.View r3 = r1.mo85812D(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x0c4b
            r4 = 2131302575(0x7f0918af, float:1.822324E38)
            r14 = r36
            r3.setTag(r4, r14)
            r4 = 2131302516(0x7f091874, float:1.822312E38)
            r3.setTag(r4, r7)
            r4 = 2131302582(0x7f0918b6, float:1.8223254E38)
            r3.setTag(r4, r2)
            r2 = 2131302514(0x7f091872, float:1.8223116E38)
            r4 = 2131299973(0x7f090e85, float:1.8217963E38)
            android.view.View r1 = r1.mo85812D(r4)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r1 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r1
            if (r1 == 0) goto L_0x0c44
            java.lang.CharSequence r1 = r1.getText()
            if (r1 != 0) goto L_0x0c42
            goto L_0x0c44
        L_0x0c42:
            r8 = r1
            goto L_0x0c46
        L_0x0c44:
            r8 = r43
        L_0x0c46:
            r3.setTag(r2, r8)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0c4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oq1.C62137n.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        FinderCollapsibleTextView finderCollapsibleTextView = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.bj4);
        finderCollapsibleTextView.setLimitLine(4);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.mo23655d(false);
        finderCollapsibleTextView.setOnCollapse(new C62139b(oVar));
        View D = oVar.mo85812D(C0966R.C0970id.f358538fn1);
        C57839g4 g4Var = new C57839g4(D);
        D.setTouchDelegate(g4Var);
        int f = C76577a.m92155f(oVar.f173499A, C0966R.dimen.f3736cp);
        View D2 = oVar.mo85812D(C0966R.C0970id.a2u);
        if (D2 != null) {
            D2.post(new C62140c(D2, f, g4Var));
        }
    }

    /* renamed from: j */
    public final void mo87194j(View view, String str, C64151e eVar, boolean z) {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) view.findViewById(C0966R.C0970id.jk5)).setText(str);
        View findViewById = view.findViewById(C0966R.C0970id.f359203jk2);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.jk4);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new C62138a(findViewById, findViewById2, this, eVar, z));
    }
}
