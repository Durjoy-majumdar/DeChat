package fh1;

import a14.C53934p0;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gh1.C59440c;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jh1.C60820a;
import jh1.C60821b;
import jh1.C60826c;
import jh1.C60829e;
import k20.C60958c;
import k20.C9556a;
import nk1.C11207i;
import o40.C61937h;
import org.libpag.PAGView;
import rx3.C13598b0;
import te3.C64622p31;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: fh1.c1 */
public final class C58999c1 extends C8313a implements View.OnClickListener, C59440c {

    /* renamed from: j */
    public final String f168796j = "Finder.LiveMileStoneLotteryResultController";

    /* renamed from: n */
    public View f168797n;

    /* renamed from: o */
    public C60826c f168798o;

    /* renamed from: p */
    public C60820a f168799p;

    /* renamed from: q */
    public C60821b f168800q;

    /* renamed from: r */
    public View f168801r;

    /* renamed from: s */
    public FrameLayout f168802s;

    /* renamed from: t */
    public PAGView f168803t;

    /* renamed from: u */
    public C64622p31 f168804u;

    /* renamed from: v */
    public boolean f168805v;

    /* renamed from: w */
    public C32226l<? super Boolean, C13598b0> f168806w;

    /* renamed from: x */
    public C59000a f168807x = C59000a.CUSTOM_OPEN;

    /* renamed from: fh1.c1$a */
    public enum C59000a {
        LOTTERY_DONE,
        CUSTOM_OPEN
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveMileStoneLotteryResultController", mo125469f = "LiveMileStoneLotteryResultController.kt", mo125470l = {198}, mo125471m = "showLotteryResult")
    /* renamed from: fh1.c1$b */
    public static final class C59001b extends C66704d {

        /* renamed from: d */
        public Object f168811d;

        /* renamed from: e */
        public Object f168812e;

        /* renamed from: f */
        public Object f168813f;

        /* renamed from: g */
        public /* synthetic */ Object f168814g;

        /* renamed from: h */
        public final /* synthetic */ C58999c1 f168815h;

        /* renamed from: i */
        public int f168816i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59001b(C58999c1 c1Var, C15601d<? super C59001b> dVar) {
            super(dVar);
            this.f168815h = c1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f168814g = obj;
            this.f168816i |= Integer.MIN_VALUE;
            return this.f168815h.mo84228F3((C59000a) null, (C64622p31) null, false, false, (C32226l<? super Boolean, C13598b0>) null, this);
        }
    }

    /* renamed from: fh1.c1$c */
    public static final class C59002c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58999c1 f168817d;

        /* renamed from: e */
        public final /* synthetic */ View f168818e;

        /* renamed from: f */
        public final /* synthetic */ View f168819f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59002c(C58999c1 c1Var, View view, View view2) {
            super(0);
            this.f168817d = c1Var;
            this.f168818e = view;
            this.f168819f = view2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r2 = r2.f173258g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                fh1.c1 r0 = r4.f168817d
                java.lang.String r0 = r0.f168796j
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "showVoteDescPage on beforePageAnimEnd!winnerContainner:"
                r1.append(r2)
                fh1.c1 r2 = r4.f168817d
                jh1.c r2 = r2.f168798o
                r3 = 0
                if (r2 == 0) goto L_0x0023
                android.view.ViewGroup r2 = r2.f173258g
                if (r2 == 0) goto L_0x0023
                int r2 = r2.getVisibility()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0024
            L_0x0023:
                r2 = r3
            L_0x0024:
                r1.append(r2)
                java.lang.String r2 = ",participantContainner:"
                r1.append(r2)
                fh1.c1 r2 = r4.f168817d
                jh1.a r2 = r2.f168799p
                if (r2 == 0) goto L_0x003f
                android.view.ViewGroup r2 = r2.f173224g
                if (r2 == 0) goto L_0x003f
                int r2 = r2.getVisibility()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0040
            L_0x003f:
                r2 = r3
            L_0x0040:
                r1.append(r2)
                java.lang.String r2 = ",voteDescContainer:"
                r1.append(r2)
                fh1.c1 r2 = r4.f168817d
                jh1.b r2 = r2.f168800q
                if (r2 == 0) goto L_0x005a
                android.view.View r2 = r2.f173235h
                if (r2 == 0) goto L_0x005a
                int r2 = r2.getVisibility()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            L_0x005a:
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                fh1.c1 r0 = r4.f168817d
                jh1.c r0 = r0.f168798o
                r1 = 8
                if (r0 == 0) goto L_0x006f
                r0.mo85745e(r1)
            L_0x006f:
                fh1.c1 r0 = r4.f168817d
                jh1.a r0 = r0.f168799p
                if (r0 == 0) goto L_0x0078
                r0.mo85737c(r1)
            L_0x0078:
                android.view.View r0 = r4.f168818e
                r1 = 0
                r0.setTranslationX(r1)
                android.view.View r0 = r4.f168819f
                r0.setTranslationX(r1)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C58999c1.C59002c.invoke():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58999c1(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04da, code lost:
        if ((r5 == null || r5.length() == 0) != false) goto L_0x04e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0892  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x08a7  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x08c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84228F3(fh1.C58999c1.C59000a r35, te3.C64622p31 r36, boolean r37, boolean r38, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r39, wx3.C15601d<? super rx3.C13598b0> r40) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r39
            r5 = r40
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            boolean r8 = r5 instanceof fh1.C58999c1.C59001b
            if (r8 == 0) goto L_0x0023
            r8 = r5
            fh1.c1$b r8 = (fh1.C58999c1.C59001b) r8
            int r9 = r8.f168816i
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r9 & r10
            if (r11 == 0) goto L_0x0023
            int r9 = r9 - r10
            r8.f168816i = r9
            goto L_0x0028
        L_0x0023:
            fh1.c1$b r8 = new fh1.c1$b
            r8.<init>(r0, r5)
        L_0x0028:
            java.lang.Object r5 = r8.f168814g
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r10 = r8.f168816i
            r11 = 8
            r12 = 0
            r13 = 1
            r14 = 0
            if (r10 == 0) goto L_0x0055
            if (r10 != r13) goto L_0x004d
            java.lang.Object r1 = r8.f168813f
            te3.p31 r1 = (te3.C64622p31) r1
            java.lang.Object r2 = r8.f168812e
            fh1.c1$a r2 = (fh1.C58999c1.C59000a) r2
            java.lang.Object r3 = r8.f168811d
            fh1.c1 r3 = (fh1.C58999c1) r3
            kotlin.ResultKt.throwOnFailure(r5)
            r33 = r2
            r2 = r1
            r1 = r33
            goto L_0x027e
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.String r5 = r0.f168796j
            java.lang.String r10 = "showLotteryResult"
            cl1.C55009y0.m62070a(r2, r5, r10)
            java.lang.String r5 = r0.f168796j
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = "showLotteryResult source:"
            r10.append(r15)
            r10.append(r1)
            java.lang.String r15 = ",withAnim:"
            r10.append(r15)
            r10.append(r3)
            java.lang.String r15 = ",back is null?:"
            r10.append(r15)
            if (r4 != 0) goto L_0x0081
            r15 = 1
            goto L_0x0082
        L_0x0081:
            r15 = 0
        L_0x0082:
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            r5 = 2131303954(0x7f091e12, float:1.8226037E38)
            r10 = 2131303953(0x7f091e11, float:1.8226035E38)
            android.view.View r5 = r0.mo9309f3(r5, r10)
            if (r5 == 0) goto L_0x009b
            r5.setOnClickListener(r0)
        L_0x009b:
            r0.f168797n = r5
            if (r5 == 0) goto L_0x00a9
            r10 = 2131298750(0x7f0909be, float:1.8215482E38)
            android.view.View r5 = r5.findViewById(r10)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x00aa
        L_0x00a9:
            r5 = r12
        L_0x00aa:
            r0.f168801r = r5
            android.view.View r5 = r0.f168797n
            if (r5 == 0) goto L_0x00ba
            r10 = 2131303952(0x7f091e10, float:1.8226033E38)
            android.view.View r5 = r5.findViewById(r10)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            goto L_0x00bb
        L_0x00ba:
            r5 = r12
        L_0x00bb:
            r0.f168802s = r5
            r34.mo84232o3(r35)
            r0.mo84231n3(r4)
            r4 = r38
            r0.f168805v = r4
            r0.f168804u = r2
            android.view.View r4 = r0.f168797n
            if (r4 == 0) goto L_0x00d9
            r5 = 2131299699(0x7f090d73, float:1.8217407E38)
            android.view.View r4 = r4.findViewById(r5)
            if (r4 == 0) goto L_0x00d9
            r4.setOnClickListener(r0)
        L_0x00d9:
            android.view.View r4 = r0.f168797n
            if (r4 == 0) goto L_0x00e3
            jh1.c r5 = new jh1.c
            r5.<init>(r4, r0)
            goto L_0x00e4
        L_0x00e3:
            r5 = r12
        L_0x00e4:
            r0.f168798o = r5
            android.view.View r4 = r0.f168797n
            if (r4 == 0) goto L_0x00f0
            jh1.a r5 = new jh1.a
            r5.<init>(r4, r0)
            goto L_0x00f1
        L_0x00f0:
            r5 = r12
        L_0x00f1:
            r0.f168799p = r5
            android.view.View r4 = r0.f168797n
            if (r4 == 0) goto L_0x00fd
            jh1.b r5 = new jh1.b
            r5.<init>(r4, r0)
            goto L_0x00fe
        L_0x00fd:
            r5 = r12
        L_0x00fe:
            r0.f168800q = r5
            jh1.c r4 = r0.f168798o
            if (r4 == 0) goto L_0x0107
            r4.mo85743c()
        L_0x0107:
            jh1.c r4 = r0.f168798o
            if (r4 == 0) goto L_0x010e
            android.view.ViewGroup r4 = r4.f173258g
            goto L_0x010f
        L_0x010e:
            r4 = r12
        L_0x010f:
            r5 = 0
            if (r4 != 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            r4.setTranslationX(r5)
        L_0x0116:
            jh1.a r4 = r0.f168799p
            if (r4 == 0) goto L_0x011d
            r4.mo85735a()
        L_0x011d:
            jh1.a r4 = r0.f168799p
            if (r4 == 0) goto L_0x0124
            android.view.ViewGroup r4 = r4.f173224g
            goto L_0x0125
        L_0x0124:
            r4 = r12
        L_0x0125:
            if (r4 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r4.setTranslationX(r5)
        L_0x012b:
            jh1.c r4 = r0.f168798o
            if (r4 == 0) goto L_0x0132
            r4.mo85745e(r11)
        L_0x0132:
            jh1.a r4 = r0.f168799p
            if (r4 == 0) goto L_0x0139
            r4.mo85737c(r11)
        L_0x0139:
            jh1.b r4 = r0.f168800q
            if (r4 == 0) goto L_0x0140
            r4.mo85740b()
        L_0x0140:
            jh1.b r4 = r0.f168800q
            if (r4 == 0) goto L_0x0147
            r4.mo85741c(r11)
        L_0x0147:
            jh1.b r4 = r0.f168800q
            if (r4 != 0) goto L_0x014c
            goto L_0x0156
        L_0x014c:
            java.lang.String r5 = r4.f173233f
            java.lang.String r10 = "set sourcePage:null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            r4.f173234g = r12
        L_0x0156:
            android.view.View r4 = r0.f168801r
            if (r4 != 0) goto L_0x015b
            goto L_0x019d
        L_0x015b:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r5.mo10233c(r10)
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r18 = "showLotteryResult"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r17 = "showLotteryResult"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x019d:
            android.view.View r4 = r0.f168797n
            if (r4 != 0) goto L_0x01a2
            goto L_0x01e5
        L_0x01a2:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r5.mo10233c(r10)
            java.lang.Object[] r23 = r5.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r25 = "showLotteryResult"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r4
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r24 = "showLotteryResult"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x01e5:
            if (r3 == 0) goto L_0x02c7
            r8.f168811d = r0
            r8.f168812e = r1
            r8.f168813f = r2
            r8.f168816i = r13
            wx3.h r3 = new wx3.h
            wx3.d r4 = xx3.C66447b.m78392b(r8)
            r3.<init>(r4)
            gy3.a0 r4 = new gy3.a0
            r4.<init>()
            org.libpag.PAGView r5 = r0.f168803t
            if (r5 != 0) goto L_0x020a
            org.libpag.PAGView r5 = new org.libpag.PAGView
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5.<init>(r8)
        L_0x020a:
            r0.f168803t = r5
            fh1.d1 r8 = new fh1.d1
            r8.<init>(r0, r4, r3)
            r5.addListener(r8)
            android.widget.FrameLayout r4 = r0.f168802s
            r5 = -1
            if (r4 == 0) goto L_0x0223
            org.libpag.PAGView r8 = r0.f168803t
            int r4 = r4.indexOfChild(r8)
            if (r4 != r5) goto L_0x0223
            r4 = 1
            goto L_0x0224
        L_0x0223:
            r4 = 0
        L_0x0224:
            if (r4 == 0) goto L_0x025e
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r5, r5)
            org.libpag.PAGView r5 = r0.f168803t
            if (r5 != 0) goto L_0x0230
            goto L_0x0233
        L_0x0230:
            r5.setLayoutParams(r4)
        L_0x0233:
            org.libpag.PAGView r4 = r0.f168803t
            if (r4 != 0) goto L_0x0238
            goto L_0x024d
        L_0x0238:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.AssetManager r5 = r5.getAssets()
            java.lang.String r8 = "big_mile_stone_lottery_amin.pag"
            org.libpag.PAGFile r5 = org.libpag.PAGFile.Load(r5, r8)
            r4.setComposition(r5)
        L_0x024d:
            android.widget.FrameLayout r4 = r0.f168802s
            if (r4 == 0) goto L_0x0256
            org.libpag.PAGView r5 = r0.f168803t
            r4.addView(r5)
        L_0x0256:
            android.widget.FrameLayout r4 = r0.f168802s
            if (r4 != 0) goto L_0x025b
            goto L_0x025e
        L_0x025b:
            r4.setClickable(r13)
        L_0x025e:
            org.libpag.PAGView r4 = r0.f168803t
            if (r4 != 0) goto L_0x0263
            goto L_0x0268
        L_0x0263:
            r11 = 0
            r4.setProgress(r11)
        L_0x0268:
            org.libpag.PAGView r4 = r0.f168803t
            if (r4 == 0) goto L_0x026f
            r4.flush()
        L_0x026f:
            org.libpag.PAGView r4 = r0.f168803t
            if (r4 == 0) goto L_0x0276
            r4.play()
        L_0x0276:
            java.lang.Object r3 = r3.mo90314b()
            if (r3 != r9) goto L_0x027d
            return r9
        L_0x027d:
            r3 = r0
        L_0x027e:
            android.view.View r4 = r3.f168801r
            if (r4 != 0) goto L_0x0284
            goto L_0x0326
        L_0x0284:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r8.mo10233c(r9)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r18 = "showLotteryResult"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r8 = r8.mo10231a(r14)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r17 = "showLotteryResult"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0326
        L_0x02c7:
            android.view.View r3 = r0.f168801r
            if (r3 != 0) goto L_0x02cc
            goto L_0x030f
        L_0x02cc:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r4.mo10233c(r8)
            java.lang.Object[] r23 = r4.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r25 = "showLotteryResult"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r3
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r4 = r4.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController"
            java.lang.String r24 = "showLotteryResult"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x030f:
            org.libpag.PAGView r3 = r0.f168803t
            if (r3 == 0) goto L_0x031b
            boolean r3 = r3.isPlaying()
            if (r3 != r13) goto L_0x031b
            r3 = 1
            goto L_0x031c
        L_0x031b:
            r3 = 0
        L_0x031c:
            if (r3 == 0) goto L_0x0325
            org.libpag.PAGView r3 = r0.f168803t
            if (r3 == 0) goto L_0x0325
            r3.stop()
        L_0x0325:
            r3 = r0
        L_0x0326:
            int r4 = r2.f184749g
            r8 = 2
            boolean r4 = o40.C61926c.m72696u(r4, r8)
            java.lang.String r9 = r3.f168796j
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "showLotteryResult winnerContainner:"
            r10.append(r11)
            jh1.c r11 = r3.f168798o
            if (r11 == 0) goto L_0x034c
            android.view.ViewGroup r11 = r11.f173258g
            if (r11 == 0) goto L_0x034c
            int r11 = r11.getVisibility()
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            goto L_0x034d
        L_0x034c:
            r12 = 0
        L_0x034d:
            r10.append(r12)
            java.lang.String r11 = ",translationX:"
            r10.append(r11)
            jh1.c r12 = r3.f168798o
            if (r12 == 0) goto L_0x0367
            android.view.ViewGroup r12 = r12.f173258g
            if (r12 == 0) goto L_0x0367
            float r12 = r12.getTranslationX()
            java.lang.Float r15 = new java.lang.Float
            r15.<init>(r12)
            goto L_0x0368
        L_0x0367:
            r15 = 0
        L_0x0368:
            r10.append(r15)
            java.lang.String r12 = ",participantContainner:"
            r10.append(r12)
            jh1.a r12 = r3.f168799p
            if (r12 == 0) goto L_0x0382
            android.view.ViewGroup r12 = r12.f173224g
            if (r12 == 0) goto L_0x0382
            int r12 = r12.getVisibility()
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r12)
            goto L_0x0383
        L_0x0382:
            r15 = 0
        L_0x0383:
            r10.append(r15)
            r10.append(r11)
            jh1.a r12 = r3.f168799p
            if (r12 == 0) goto L_0x039b
            android.view.ViewGroup r12 = r12.f173224g
            if (r12 == 0) goto L_0x039b
            float r12 = r12.getTranslationX()
            java.lang.Float r15 = new java.lang.Float
            r15.<init>(r12)
            goto L_0x039c
        L_0x039b:
            r15 = 0
        L_0x039c:
            r10.append(r15)
            java.lang.String r12 = ",voteDescContainer:"
            r10.append(r12)
            jh1.b r12 = r3.f168800q
            if (r12 == 0) goto L_0x03b6
            android.view.View r12 = r12.f173235h
            if (r12 == 0) goto L_0x03b6
            int r12 = r12.getVisibility()
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r12)
            goto L_0x03b7
        L_0x03b6:
            r15 = 0
        L_0x03b7:
            r10.append(r15)
            r10.append(r11)
            jh1.b r11 = r3.f168800q
            if (r11 == 0) goto L_0x03cf
            android.view.View r11 = r11.f173235h
            if (r11 == 0) goto L_0x03cf
            float r11 = r11.getTranslationX()
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            goto L_0x03d0
        L_0x03cf:
            r12 = 0
        L_0x03d0:
            r10.append(r12)
            java.lang.String r11 = ",isLotteryWinner:"
            r10.append(r11)
            r10.append(r4)
            r11 = 33
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r9 = 3
            java.lang.String r10 = ""
            if (r4 == 0) goto L_0x06ee
            jh1.c r4 = r3.f168798o
            if (r4 == 0) goto L_0x03f3
            r4.mo85745e(r14)
        L_0x03f3:
            jh1.a r4 = r3.f168799p
            r11 = 8
            if (r4 == 0) goto L_0x03fc
            r4.mo85737c(r11)
        L_0x03fc:
            jh1.b r4 = r3.f168800q
            if (r4 == 0) goto L_0x0403
            r4.mo85741c(r11)
        L_0x0403:
            jh1.c r3 = r3.f168798o
            if (r3 == 0) goto L_0x09e5
            java.lang.String r4 = "source"
            gy3.C87412m.m108594g(r1, r4)
            jh1.c$a r4 = jh1.C60826c.C60827a.NONE
            r3.f173269u = r4
            r3.mo85743c()
            java.lang.Class<cl1.x0> r4 = cl1.C55006x0.class
            java.lang.Class<cl1.o> r11 = cl1.C54991o.class
            fh1.c1 r12 = r3.f173256e
            fy3.l<? super java.lang.Boolean, rx3.b0> r15 = r12.f168806w
            if (r15 == 0) goto L_0x046a
            boolean r12 = r12.f168805v
            if (r12 != 0) goto L_0x046a
            android.view.View r12 = r3.f173259h
            if (r12 != 0) goto L_0x0428
            goto L_0x04b2
        L_0x0428:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r15.mo10233c(r5)
            java.lang.Object[] r16 = r15.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage"
            java.lang.String r18 = "bindWinnerPage"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r5 = r15
            r15 = r12
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r12.setVisibility(r5)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage"
            java.lang.String r17 = "bindWinnerPage"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x04b2
        L_0x046a:
            android.view.View r5 = r3.f173259h
            if (r5 != 0) goto L_0x046f
            goto L_0x04b2
        L_0x046f:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            r15 = 8
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.mo10233c(r15)
            java.lang.Object[] r23 = r12.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage"
            java.lang.String r25 = "bindWinnerPage"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r5
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r12 = r12.mo10231a(r14)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r5.setVisibility(r12)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage"
            java.lang.String r24 = "bindWinnerPage"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$Source;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x04b2:
            te3.mx2 r5 = r2.f184752j
            if (r5 == 0) goto L_0x04b9
            java.lang.String r12 = r5.f138272e
            goto L_0x04ba
        L_0x04b9:
            r12 = 0
        L_0x04ba:
            if (r5 == 0) goto L_0x04bf
            java.lang.String r5 = r5.f138271d
            goto L_0x04c0
        L_0x04bf:
            r5 = 0
        L_0x04c0:
            if (r12 == 0) goto L_0x04cb
            int r15 = r12.length()
            if (r15 != 0) goto L_0x04c9
            goto L_0x04cb
        L_0x04c9:
            r15 = 0
            goto L_0x04cc
        L_0x04cb:
            r15 = 1
        L_0x04cc:
            if (r15 != 0) goto L_0x04e0
            if (r5 == 0) goto L_0x04d9
            int r15 = r5.length()
            if (r15 != 0) goto L_0x04d7
            goto L_0x04d9
        L_0x04d7:
            r15 = 0
            goto L_0x04da
        L_0x04d9:
            r15 = 1
        L_0x04da:
            if (r15 == 0) goto L_0x04dd
            goto L_0x04e0
        L_0x04dd:
            r9 = r5
            goto L_0x05a7
        L_0x04e0:
            ok1.e r15 = ok1.C62042e.f176370a
            te3.mx2 r14 = r2.f184752j
            if (r14 == 0) goto L_0x04e9
            int r14 = r14.f138273f
            goto L_0x04ea
        L_0x04e9:
            r14 = 0
        L_0x04ea:
            fh1.c1 r13 = r3.f173256e
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r13 = r13.getStore()
            fj1.b r13 = r13.getLiveRoomData()
            androidx.lifecycle.i0 r13 = r13.mo71262a(r11)
            cl1.o r13 = (cl1.C54991o) r13
            te3.fs0 r13 = r13.mo75986U3()
            r15.getClass()
            java.lang.String r15 = "curVisitorRole"
            gy3.C87412m.m108594g(r13, r15)
            com.tencent.mm.protocal.protobuf.FinderContact r15 = new com.tencent.mm.protocal.protobuf.FinderContact
            r15.<init>()
            if (r14 == r8) goto L_0x0551
            if (r14 == r9) goto L_0x0530
            java.lang.String r9 = eb0.C75592q0.m90789s()
            r15.username = r9
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r9 = r9.mo77630e(r11)
            cl1.o r9 = (cl1.C54991o) r9
            if (r9 == 0) goto L_0x0525
            java.lang.String r9 = r9.mo75977P3()
            if (r9 != 0) goto L_0x0529
        L_0x0525:
            java.lang.String r9 = eb0.C75592q0.m90783m()
        L_0x0529:
            r15.nickname = r9
            java.lang.String r9 = r13.f183214e
            r15.headUrl = r9
            goto L_0x056f
        L_0x0530:
            zc1.b r9 = zc1.C66785b.f191882e
            java.lang.String r9 = r9.mo90662O5()
            r15.username = r9
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r9 = r9.mo77630e(r11)
            cl1.o r9 = (cl1.C54991o) r9
            if (r9 == 0) goto L_0x0548
            java.lang.String r9 = r9.mo75977P3()
            if (r9 != 0) goto L_0x054a
        L_0x0548:
            java.lang.String r9 = r13.f183213d
        L_0x054a:
            r15.nickname = r9
            java.lang.String r9 = r13.f183214e
            r15.headUrl = r9
            goto L_0x056f
        L_0x0551:
            java.lang.String r9 = eb0.C75592q0.m90782l()
            r15.username = r9
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r9 = r9.mo77630e(r11)
            cl1.o r9 = (cl1.C54991o) r9
            if (r9 == 0) goto L_0x0567
            java.lang.String r9 = r9.mo75977P3()
            if (r9 != 0) goto L_0x0569
        L_0x0567:
            java.lang.String r9 = r13.f183213d
        L_0x0569:
            r15.nickname = r9
            java.lang.String r9 = r13.f183214e
            r15.headUrl = r9
        L_0x056f:
            java.lang.String r9 = r3.f173257f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "bindWinnerPage ori headImgUrl:"
            r11.append(r13)
            r11.append(r12)
            java.lang.String r12 = ",ori nickname:"
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = ",localFinderContact url:"
            r11.append(r5)
            java.lang.String r5 = r15.headUrl
            r11.append(r5)
            java.lang.String r5 = ",nickname:"
            r11.append(r5)
            java.lang.String r5 = r15.nickname
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            java.lang.String r12 = r15.headUrl
            java.lang.String r5 = r15.nickname
            goto L_0x04dd
        L_0x05a7:
            android.widget.ImageView r11 = r3.f173260i
            if (r11 == 0) goto L_0x05d8
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r5 = r13.mo62446e(r6)
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r14 = r5.mo11865K1()
            pl1.f r15 = new pl1.f
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            r12 = 0
            r15.<init>(r5, r12, r8, r12)
            pl1.e0$a r12 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r6 = r13.mo62446e(r6)
            bl3.c r6 = r6.mo62447c(r7)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r6 = r6.mo11867O2(r12)
            r14.mo85957c(r15, r11, r6)
        L_0x05d8:
            android.widget.TextView r6 = r3.f173261j
            if (r6 == 0) goto L_0x05ef
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            android.content.Context r11 = r6.getContext()
            android.text.SpannableString r7 = r7.mo107057T1(r11, r9)
            r6.setText(r7)
        L_0x05ef:
            android.widget.TextView r6 = r3.f173263o
            if (r6 != 0) goto L_0x05f4
            goto L_0x05ff
        L_0x05f4:
            te3.nx2 r7 = r2.f184748f
            if (r7 == 0) goto L_0x05fb
            java.lang.String r7 = r7.f184576e
            goto L_0x05fc
        L_0x05fb:
            r7 = 0
        L_0x05fc:
            r6.setText(r7)
        L_0x05ff:
            int r6 = r2.f184749g
            r7 = 1
            boolean r6 = o40.C61926c.m72696u(r6, r7)
            if (r6 == 0) goto L_0x0617
            te3.cx2 r6 = r2.f184747e
            if (r6 == 0) goto L_0x0612
            int r6 = r6.f182600h
            if (r6 != r8) goto L_0x0612
            r6 = 1
            goto L_0x0613
        L_0x0612:
            r6 = 0
        L_0x0613:
            if (r6 == 0) goto L_0x0617
            r6 = 1
            goto L_0x0618
        L_0x0617:
            r6 = 0
        L_0x0618:
            if (r6 == 0) goto L_0x0698
            r6 = 1
            te3.qx2 r7 = r2.f184751i
            if (r7 == 0) goto L_0x0627
            int r7 = r7.f185087g
            r8 = 1
            if (r7 != r8) goto L_0x0627
            r16 = 1
            goto L_0x0629
        L_0x0627:
            r16 = 0
        L_0x0629:
            r7 = 0
            r8 = 4
            r9 = 0
            r35 = r3
            r36 = r6
            r37 = r16
            r38 = r7
            r39 = r8
            r40 = r9
            jh1.C60826c.m71226f(r35, r36, r37, r38, r39, r40)
            jh1.j r6 = jh1.C9406j.f29357a
            java.lang.String r7 = r2.f184746d
            if (r7 != 0) goto L_0x0642
            r7 = r10
        L_0x0642:
            r8 = 20
            te3.qx2 r9 = r2.f184751i
            if (r9 == 0) goto L_0x0650
            te3.dx2 r9 = r9.f185091n
            if (r9 == 0) goto L_0x0650
            java.lang.String r9 = r9.f182900d
            if (r9 != 0) goto L_0x0651
        L_0x0650:
            r9 = r10
        L_0x0651:
            r11 = 0
            fh1.c1 r12 = r3.f173256e
            androidx.lifecycle.i0 r12 = r12.business(r4)
            cl1.x0 r12 = (cl1.C55006x0) r12
            java.lang.String r13 = r2.f184746d
            if (r13 != 0) goto L_0x065f
            r13 = r10
        L_0x065f:
            java.lang.Object r12 = r12.mo76052d3(r13)
            boolean r13 = r12 instanceof te3.C64695s31
            if (r13 == 0) goto L_0x066a
            te3.s31 r12 = (te3.C64695s31) r12
            goto L_0x066b
        L_0x066a:
            r12 = 0
        L_0x066b:
            fh1.c1 r13 = r3.f173256e
            androidx.lifecycle.i0 r4 = r13.business(r4)
            cl1.x0 r4 = (cl1.C55006x0) r4
            java.lang.String r13 = r2.f184746d
            if (r13 != 0) goto L_0x0678
            r13 = r10
        L_0x0678:
            java.lang.Object r4 = r4.mo76052d3(r13)
            boolean r13 = r4 instanceof te3.C64224a61
            if (r13 == 0) goto L_0x0683
            te3.a61 r4 = (te3.C64224a61) r4
            goto L_0x0684
        L_0x0683:
            r4 = 0
        L_0x0684:
            java.lang.Integer r4 = r6.mo10126a(r2, r12, r4)
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r39 = r11
            r40 = r4
            r35.mo10128e(r36, r37, r38, r39, r40)
            goto L_0x06b9
        L_0x0698:
            r4 = 0
            te3.qx2 r6 = r2.f184751i
            if (r6 == 0) goto L_0x06a5
            int r6 = r6.f185087g
            r7 = 1
            if (r6 != r7) goto L_0x06a5
            r16 = 1
            goto L_0x06a7
        L_0x06a5:
            r16 = 0
        L_0x06a7:
            r6 = 0
            r7 = 4
            r8 = 0
            r35 = r3
            r36 = r4
            r37 = r16
            r38 = r6
            r39 = r7
            r40 = r8
            jh1.C60826c.m71226f(r35, r36, r37, r38, r39, r40)
        L_0x06b9:
            android.widget.TextView r4 = r3.f173268t
            if (r4 != 0) goto L_0x06be
            goto L_0x06d1
        L_0x06be:
            jh1.j r6 = jh1.C9406j.f29357a
            te3.qx2 r7 = r2.f184751i
            if (r7 == 0) goto L_0x06ca
            java.lang.String r7 = r7.f185090j
            if (r7 != 0) goto L_0x06c9
            goto L_0x06ca
        L_0x06c9:
            r10 = r7
        L_0x06ca:
            de3.u r6 = r6.mo10127c(r10)
            r4.setText(r6)
        L_0x06d1:
            fh1.c1 r4 = r3.f173256e
            r6 = 0
            r7 = 0
            jh1.d r8 = new jh1.d
            r5 = 0
            r8.<init>(r2, r3, r1, r5)
            r1 = 3
            r2 = 0
            r35 = r4
            r36 = r6
            r37 = r7
            r38 = r8
            r39 = r1
            r40 = r2
            nk1.C11207i.m11066b(r35, r36, r37, r38, r39, r40)
            goto L_0x09e5
        L_0x06ee:
            int r1 = r2.f184749g
            r4 = 1
            boolean r1 = o40.C61926c.m72696u(r1, r4)
            r4 = 13
            if (r1 == 0) goto L_0x08d3
            jh1.c r1 = r3.f168798o
            r11 = 8
            if (r1 == 0) goto L_0x0702
            r1.mo85745e(r11)
        L_0x0702:
            jh1.a r1 = r3.f168799p
            if (r1 == 0) goto L_0x070a
            r12 = 0
            r1.mo85737c(r12)
        L_0x070a:
            jh1.b r1 = r3.f168800q
            if (r1 == 0) goto L_0x0711
            r1.mo85741c(r11)
        L_0x0711:
            jh1.a r1 = r3.f168799p
            if (r1 == 0) goto L_0x09e5
            r1.mo85735a()
            fh1.c1 r3 = r1.f173222e
            fy3.l<? super java.lang.Boolean, rx3.b0> r11 = r3.f168806w
            if (r11 == 0) goto L_0x076c
            boolean r3 = r3.f168805v
            if (r3 != 0) goto L_0x076c
            android.view.View r3 = r1.f173225h
            if (r3 != 0) goto L_0x0728
            goto L_0x07b5
        L_0x0728:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r11.mo10233c(r13)
            java.lang.Object[] r19 = r11.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r21 = "bindParticipationPage"
            java.lang.String r22 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3.setVisibility(r11)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r20 = "bindParticipationPage"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x07b5
        L_0x076c:
            android.view.View r3 = r1.f173225h
            if (r3 != 0) goto L_0x0771
            goto L_0x07b5
        L_0x0771:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r11.mo10233c(r13)
            java.lang.Object[] r26 = r11.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r28 = "bindParticipationPage"
            java.lang.String r29 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r3
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3.setVisibility(r11)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r27 = "bindParticipationPage"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x07b5:
            jh1.j r3 = jh1.C9406j.f29357a
            fh1.c1 r11 = r1.f173222e
            te3.p31 r11 = r11.f168804u
            if (r11 == 0) goto L_0x07c5
            java.lang.String r11 = r11.f184746d
            if (r11 != 0) goto L_0x07c2
            goto L_0x07c5
        L_0x07c2:
            r19 = r11
            goto L_0x07c7
        L_0x07c5:
            r19 = r10
        L_0x07c7:
            r20 = 19
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 28
            r25 = 0
            r18 = r3
            jh1.C9406j.m9112f(r18, r19, r20, r21, r22, r23, r24, r25)
            android.widget.TextView r11 = r1.f173226i
            if (r11 != 0) goto L_0x07dd
            goto L_0x07ef
        L_0x07dd:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131828070(0x7f111d66, float:1.928907E38)
            java.lang.String r12 = r12.getString(r13)
            r11.setText(r12)
        L_0x07ef:
            te3.qx2 r11 = r2.f184751i
            if (r11 == 0) goto L_0x07f6
            java.lang.String r11 = r11.f185085e
            goto L_0x07f7
        L_0x07f6:
            r11 = 0
        L_0x07f7:
            if (r11 == 0) goto L_0x0802
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0800
            goto L_0x0802
        L_0x0800:
            r11 = 0
            goto L_0x0803
        L_0x0802:
            r11 = 1
        L_0x0803:
            if (r11 == 0) goto L_0x082a
            android.widget.TextView r6 = r1.f173226i
            if (r6 == 0) goto L_0x080e
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x080f
        L_0x080e:
            r6 = 0
        L_0x080f:
            boolean r7 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x0816
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            goto L_0x0817
        L_0x0816:
            r6 = 0
        L_0x0817:
            if (r6 == 0) goto L_0x081f
            r6.removeRule(r8)
            r6.addRule(r4)
        L_0x081f:
            android.widget.ImageView r4 = r1.f173227j
            if (r4 != 0) goto L_0x0824
            goto L_0x0877
        L_0x0824:
            r6 = 8
            r4.setVisibility(r6)
            goto L_0x0877
        L_0x082a:
            android.widget.TextView r11 = r1.f173226i
            if (r11 == 0) goto L_0x0833
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            goto L_0x0834
        L_0x0833:
            r11 = 0
        L_0x0834:
            boolean r12 = r11 instanceof android.widget.RelativeLayout.LayoutParams
            if (r12 == 0) goto L_0x083b
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            goto L_0x083c
        L_0x083b:
            r11 = 0
        L_0x083c:
            if (r11 == 0) goto L_0x0847
            r11.removeRule(r4)
            r4 = 2131311194(0x7f093a5a, float:1.8240721E38)
            r11.addRule(r8, r4)
        L_0x0847:
            android.widget.ImageView r4 = r1.f173227j
            if (r4 == 0) goto L_0x0877
            r11 = 0
            r4.setVisibility(r11)
            bl3.r r11 = bl3.C39818r.f106831a
            bl3.r$a r6 = r11.mo62446e(r6)
            bl3.c r6 = r6.mo62447c(r7)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            pl1.n0 r7 = new pl1.n0
            te3.qx2 r11 = r2.f184751i
            if (r11 == 0) goto L_0x0868
            java.lang.String r11 = r11.f185085e
            goto L_0x0869
        L_0x0868:
            r11 = 0
        L_0x0869:
            up1.y r12 = up1.C27696y.RAW_IMAGE
            r7.<init>(r11, r12)
            l60.b r6 = r6.mo85955a(r7)
            l60.a r6 = (l60.C99342a) r6
            r6.mo85954d(r4)
        L_0x0877:
            int r4 = r2.f184749g
            r6 = 1
            boolean r4 = o40.C61926c.m72696u(r4, r6)
            if (r4 == 0) goto L_0x088f
            te3.cx2 r4 = r2.f184747e
            if (r4 == 0) goto L_0x088a
            int r4 = r4.f182600h
            if (r4 != r8) goto L_0x088a
            r4 = 1
            goto L_0x088b
        L_0x088a:
            r4 = 0
        L_0x088b:
            if (r4 == 0) goto L_0x088f
            r4 = 1
            goto L_0x0890
        L_0x088f:
            r4 = 0
        L_0x0890:
            if (r4 == 0) goto L_0x08a7
            te3.qx2 r4 = r2.f184751i
            if (r4 == 0) goto L_0x089d
            int r4 = r4.f185087g
            r6 = 1
            if (r4 != r6) goto L_0x089e
            r14 = 1
            goto L_0x089f
        L_0x089d:
            r6 = 1
        L_0x089e:
            r14 = 0
        L_0x089f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r1.mo85736b(r6, r14, r4)
            goto L_0x08ba
        L_0x08a7:
            r6 = 1
            te3.qx2 r4 = r2.f184751i
            if (r4 == 0) goto L_0x08b4
            int r4 = r4.f185087g
            if (r4 != r6) goto L_0x08b4
            r4 = 0
            r5 = 0
            r13 = 1
            goto L_0x08b7
        L_0x08b4:
            r4 = 0
            r5 = 0
            r13 = 0
        L_0x08b7:
            r1.mo85736b(r5, r13, r4)
        L_0x08ba:
            android.widget.TextView r1 = r1.f173230p
            if (r1 != 0) goto L_0x08c0
            goto L_0x09e5
        L_0x08c0:
            te3.qx2 r2 = r2.f184751i
            if (r2 == 0) goto L_0x08ca
            java.lang.String r2 = r2.f185090j
            if (r2 != 0) goto L_0x08c9
            goto L_0x08ca
        L_0x08c9:
            r10 = r2
        L_0x08ca:
            de3.u r2 = r3.mo10127c(r10)
            r1.setText(r2)
            goto L_0x09e5
        L_0x08d3:
            jh1.c r1 = r3.f168798o
            r6 = 8
            if (r1 == 0) goto L_0x08dc
            r1.mo85745e(r6)
        L_0x08dc:
            jh1.a r1 = r3.f168799p
            if (r1 == 0) goto L_0x08e4
            r7 = 0
            r1.mo85737c(r7)
        L_0x08e4:
            jh1.b r1 = r3.f168800q
            if (r1 == 0) goto L_0x08eb
            r1.mo85741c(r6)
        L_0x08eb:
            jh1.a r1 = r3.f168799p
            if (r1 == 0) goto L_0x09e5
            r1.mo85735a()
            fh1.c1 r3 = r1.f173222e
            fy3.l<? super java.lang.Boolean, rx3.b0> r3 = r3.f168806w
            if (r3 == 0) goto L_0x0944
            android.view.View r3 = r1.f173225h
            if (r3 != 0) goto L_0x08fe
            goto L_0x098f
        L_0x08fe:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r7 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r9)
            java.lang.Object[] r19 = r6.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r21 = "showNoAttendPage"
            java.lang.String r22 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = 0
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r20 = "showNoAttendPage"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x098f
        L_0x0944:
            android.view.View r3 = r1.f173225h
            if (r3 != 0) goto L_0x0949
            goto L_0x098f
        L_0x0949:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r7 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r9)
            java.lang.Object[] r26 = r6.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r28 = "showNoAttendPage"
            java.lang.String r29 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r3
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r7 = 0
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage"
            java.lang.String r27 = "showNoAttendPage"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x098f:
            android.widget.TextView r3 = r1.f173226i
            if (r3 != 0) goto L_0x0994
            goto L_0x09a6
        L_0x0994:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131828071(0x7f111d67, float:1.9289073E38)
            java.lang.String r6 = r6.getString(r7)
            r3.setText(r6)
        L_0x09a6:
            android.widget.TextView r3 = r1.f173226i
            if (r3 == 0) goto L_0x09af
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            goto L_0x09b0
        L_0x09af:
            r3 = 0
        L_0x09b0:
            boolean r6 = r3 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x09b7
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            goto L_0x09b8
        L_0x09b7:
            r3 = 0
        L_0x09b8:
            if (r3 == 0) goto L_0x09c0
            r3.removeRule(r8)
            r3.addRule(r4)
        L_0x09c0:
            android.widget.ImageView r3 = r1.f173227j
            if (r3 != 0) goto L_0x09c5
            goto L_0x09ca
        L_0x09c5:
            r4 = 8
            r3.setVisibility(r4)
        L_0x09ca:
            te3.qx2 r2 = r2.f184751i
            if (r2 == 0) goto L_0x09d7
            int r2 = r2.f185087g
            r3 = 1
            if (r2 != r3) goto L_0x09d7
            r2 = 0
            r3 = 0
            r13 = 1
            goto L_0x09da
        L_0x09d7:
            r2 = 0
            r3 = 0
            r13 = 0
        L_0x09da:
            r1.mo85736b(r3, r13, r2)
            android.widget.TextView r1 = r1.f173230p
            if (r1 != 0) goto L_0x09e2
            goto L_0x09e5
        L_0x09e2:
            r1.setText(r10)
        L_0x09e5:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C58999c1.mo84228F3(fh1.c1$a, te3.p31, boolean, boolean, fy3.l, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c2  */
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84229G3(android.view.View r30) {
        /*
            r29 = this;
            r0 = r29
            r10 = r30
            jh1.b r1 = r0.f168800q
            r11 = 0
            if (r1 != 0) goto L_0x0015
            android.view.View r1 = r0.f168797n
            if (r1 == 0) goto L_0x0014
            jh1.b r2 = new jh1.b
            r2.<init>(r1, r0)
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = r11
        L_0x0015:
            r0.f168800q = r1
            te3.p31 r2 = r0.f168804u
            if (r2 == 0) goto L_0x03d8
            if (r1 == 0) goto L_0x0020
            r1.mo85740b()
        L_0x0020:
            jh1.b r1 = r0.f168800q
            r12 = 8
            r13 = 0
            if (r1 == 0) goto L_0x030d
            java.lang.String r3 = r1.f173233f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "set sourcePage:"
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r1.f173234g = r10
            r1.mo85740b()
            java.util.ArrayList r3 = r1.mo85739a()
            r3.clear()
            te3.bx2 r3 = r2.f184750h
            r4 = 1
            if (r3 == 0) goto L_0x00b9
            java.util.LinkedList<te3.yv> r3 = r3.f131371f
            if (r3 == 0) goto L_0x00b9
            java.util.ArrayList r5 = r1.mo85739a()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x0066:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r3.next()
            te3.yv r7 = (te3.C52172yv) r7
            jh1.z r8 = new jh1.z
            java.lang.String r9 = "it"
            gy3.C87412m.m108593f(r7, r9)
            r8.<init>(r7)
            r6.add(r8)
            goto L_0x0066
        L_0x0080:
            r5.addAll(r6)
            r5 = 0
            java.util.ArrayList r3 = r1.mo85739a()
            java.util.Iterator r3 = r3.iterator()
        L_0x008d:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r7 = r3.next()
            jh1.z r7 = (jh1.C9433z) r7
            r7.f29456f = r4
            te3.yv r7 = r7.f29454d
            int r7 = r7.f145530g
            long r7 = (long) r7
            long r5 = r5 + r7
            goto L_0x008d
        L_0x00a2:
            java.util.ArrayList r3 = r1.mo85739a()
            java.util.Iterator r3 = r3.iterator()
        L_0x00aa:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r3.next()
            jh1.z r7 = (jh1.C9433z) r7
            r7.f29457g = r5
            goto L_0x00aa
        L_0x00b9:
            android.widget.TextView r3 = r1.f173238n
            if (r3 != 0) goto L_0x00be
            goto L_0x00c9
        L_0x00be:
            te3.bx2 r5 = r2.f184750h
            if (r5 == 0) goto L_0x00c5
            java.lang.String r5 = r5.f131372g
            goto L_0x00c6
        L_0x00c5:
            r5 = r11
        L_0x00c6:
            r3.setText(r5)
        L_0x00c9:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r1.f173239o
            if (r3 == 0) goto L_0x00ea
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r6 = r3.getContext()
            r5.<init>(r6)
            r3.setLayoutManager(r5)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.live.controller.milestonelottery.LiveMileStoneLotteryResultVoteDescPage$show$2$1 r6 = new com.tencent.mm.plugin.finder.live.controller.milestonelottery.LiveMileStoneLotteryResultVoteDescPage$show$2$1
            r6.<init>()
            java.util.ArrayList r7 = r1.mo85739a()
            r5.<init>(r6, r7, r13)
            r3.setAdapter(r5)
        L_0x00ea:
            te3.qx2 r3 = r2.f184751i
            if (r3 == 0) goto L_0x00f4
            int r3 = r3.f185087g
            if (r3 != r4) goto L_0x00f4
            r3 = 1
            goto L_0x00f5
        L_0x00f4:
            r3 = 0
        L_0x00f5:
            if (r3 == 0) goto L_0x010f
            android.widget.TextView r3 = r1.f173241q
            if (r3 != 0) goto L_0x00fc
            goto L_0x0126
        L_0x00fc:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131827904(0x7f111cc0, float:1.9288734E38)
            java.lang.String r5 = r5.getString(r6)
            r3.setText(r5)
            goto L_0x0126
        L_0x010f:
            android.widget.TextView r3 = r1.f173241q
            if (r3 != 0) goto L_0x0114
            goto L_0x0126
        L_0x0114:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131827908(0x7f111cc4, float:1.9288742E38)
            java.lang.String r5 = r5.getString(r6)
            r3.setText(r5)
        L_0x0126:
            android.widget.TextView r3 = r1.f173242r
            if (r3 != 0) goto L_0x012b
            goto L_0x0149
        L_0x012b:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131827903(0x7f111cbf, float:1.9288732E38)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            te3.qx2 r8 = r2.f184751i
            if (r8 == 0) goto L_0x013f
            java.lang.String r8 = r8.f185088h
            goto L_0x0140
        L_0x013f:
            r8 = r11
        L_0x0140:
            r7[r13] = r8
            java.lang.String r5 = r5.getString(r6, r7)
            r3.setText(r5)
        L_0x0149:
            te3.bx2 r3 = r2.f184750h
            if (r3 == 0) goto L_0x0174
            java.util.LinkedList<te3.yv> r3 = r3.f131371f
            if (r3 == 0) goto L_0x0174
            java.util.Iterator r3 = r3.iterator()
        L_0x0155:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x016c
            java.lang.Object r5 = r3.next()
            r6 = r5
            te3.yv r6 = (te3.C52172yv) r6
            int r6 = r6.f145529f
            if (r6 <= 0) goto L_0x0168
            r6 = 1
            goto L_0x0169
        L_0x0168:
            r6 = 0
        L_0x0169:
            if (r6 == 0) goto L_0x0155
            goto L_0x016d
        L_0x016c:
            r5 = r11
        L_0x016d:
            te3.yv r5 = (te3.C52172yv) r5
            if (r5 == 0) goto L_0x0174
            java.lang.String r3 = r5.f145531h
            goto L_0x0175
        L_0x0174:
            r3 = r11
        L_0x0175:
            android.widget.TextView r5 = r1.f173244t
            if (r5 != 0) goto L_0x017a
            goto L_0x0190
        L_0x017a:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131827913(0x7f111cc9, float:1.9288752E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r13] = r3
            java.lang.String r3 = r6.getString(r7, r8)
            r5.setText(r3)
        L_0x0190:
            te3.qx2 r3 = r2.f184751i
            if (r3 == 0) goto L_0x019a
            int r3 = r3.f185086f
            if (r3 != r4) goto L_0x019a
            r3 = 1
            goto L_0x019b
        L_0x019a:
            r3 = 0
        L_0x019b:
            if (r3 == 0) goto L_0x022f
            android.view.View r3 = r1.f173240p
            if (r3 != 0) goto L_0x01a2
            goto L_0x01e4
        L_0x01a2:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r6)
            java.lang.Object[] r15 = r5.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r17 = "show"
            java.lang.String r18 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r5 = r5.mo10231a(r13)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r16 = "show"
            java.lang.String r17 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x01e4:
            android.view.View r3 = r1.f173243s
            if (r3 != 0) goto L_0x01ea
            goto L_0x02be
        L_0x01ea:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r6)
            java.lang.Object[] r22 = r5.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r24 = "show"
            java.lang.String r25 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r3
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r5 = r5.mo10231a(r13)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r23 = "show"
            java.lang.String r24 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x02be
        L_0x022f:
            android.view.View r3 = r1.f173240p
            if (r3 != 0) goto L_0x0234
            goto L_0x0276
        L_0x0234:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r5.mo10233c(r6)
            java.lang.Object[] r15 = r5.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r17 = "show"
            java.lang.String r18 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r5 = r5.mo10231a(r13)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r16 = "show"
            java.lang.String r17 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0276:
            android.view.View r3 = r1.f173243s
            if (r3 != 0) goto L_0x027b
            goto L_0x02be
        L_0x027b:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r5.mo10233c(r6)
            java.lang.Object[] r22 = r5.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r24 = "show"
            java.lang.String r25 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r3
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r5 = r5.mo10231a(r13)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage"
            java.lang.String r23 = "show"
            java.lang.String r24 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryInfo;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x02be:
            te3.qx2 r3 = r2.f184751i
            if (r3 == 0) goto L_0x02c5
            java.lang.String r3 = r3.f185089i
            goto L_0x02c6
        L_0x02c5:
            r3 = r11
        L_0x02c6:
            if (r3 == 0) goto L_0x02d0
            int r3 = r3.length()
            if (r3 != 0) goto L_0x02cf
            goto L_0x02d0
        L_0x02cf:
            r4 = 0
        L_0x02d0:
            if (r4 == 0) goto L_0x02ed
            android.widget.TextView r2 = r1.f173246v
            if (r2 != 0) goto L_0x02d7
            goto L_0x02dc
        L_0x02d7:
            java.lang.String r3 = ""
            r2.setText(r3)
        L_0x02dc:
            android.widget.TextView r2 = r1.f173246v
            if (r2 != 0) goto L_0x02e1
            goto L_0x02e4
        L_0x02e1:
            r2.setVisibility(r12)
        L_0x02e4:
            android.widget.TextView r1 = r1.f173245u
            if (r1 != 0) goto L_0x02e9
            goto L_0x030d
        L_0x02e9:
            r1.setVisibility(r12)
            goto L_0x030d
        L_0x02ed:
            android.widget.TextView r3 = r1.f173246v
            if (r3 != 0) goto L_0x02f2
            goto L_0x02fd
        L_0x02f2:
            te3.qx2 r2 = r2.f184751i
            if (r2 == 0) goto L_0x02f9
            java.lang.String r2 = r2.f185089i
            goto L_0x02fa
        L_0x02f9:
            r2 = r11
        L_0x02fa:
            r3.setText(r2)
        L_0x02fd:
            android.widget.TextView r2 = r1.f173246v
            if (r2 != 0) goto L_0x0302
            goto L_0x0305
        L_0x0302:
            r2.setVisibility(r13)
        L_0x0305:
            android.widget.TextView r1 = r1.f173245u
            if (r1 != 0) goto L_0x030a
            goto L_0x030d
        L_0x030a:
            r1.setVisibility(r13)
        L_0x030d:
            jh1.b r1 = r0.f168800q
            if (r1 == 0) goto L_0x0315
            android.view.View r1 = r1.f173235h
            r4 = r1
            goto L_0x0316
        L_0x0315:
            r4 = r11
        L_0x0316:
            if (r10 == 0) goto L_0x0395
            if (r4 == 0) goto L_0x0395
            java.lang.String r1 = r0.f168796j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "showVoteDescPage before animation sourcePage:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ",winnerContainner:"
            r2.append(r3)
            jh1.c r3 = r0.f168798o
            if (r3 == 0) goto L_0x0340
            android.view.ViewGroup r3 = r3.f173258g
            if (r3 == 0) goto L_0x0340
            int r3 = r3.getVisibility()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0341
        L_0x0340:
            r3 = r11
        L_0x0341:
            r2.append(r3)
            java.lang.String r3 = ",participantContainner:"
            r2.append(r3)
            jh1.a r3 = r0.f168799p
            if (r3 == 0) goto L_0x035a
            android.view.ViewGroup r3 = r3.f173224g
            if (r3 == 0) goto L_0x035a
            int r3 = r3.getVisibility()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x035b
        L_0x035a:
            r3 = r11
        L_0x035b:
            r2.append(r3)
            java.lang.String r3 = ",voteDescContainer:"
            r2.append(r3)
            jh1.b r3 = r0.f168800q
            if (r3 == 0) goto L_0x0374
            android.view.View r3 = r3.f173235h
            if (r3 == 0) goto L_0x0374
            int r3 = r3.getVisibility()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0375
        L_0x0374:
            r3 = r11
        L_0x0375:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            jh1.j r1 = jh1.C9406j.f29357a
            java.lang.String r2 = r0.f168796j
            r5 = 1
            fh1.c1$c r6 = new fh1.c1$c
            r6.<init>(r0, r10, r4)
            r7 = 0
            r8 = 32
            r9 = 0
            r3 = r30
            jh1.C9406j.m9110b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0396
        L_0x0395:
            r1 = r11
        L_0x0396:
            if (r1 != 0) goto L_0x03d8
            java.lang.String r1 = r0.f168796j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "showVoteDescPage sourcePage:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ", without animation!"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            jh1.c r1 = r0.f168798o
            if (r1 == 0) goto L_0x03bb
            r1.mo85745e(r12)
        L_0x03bb:
            jh1.a r1 = r0.f168799p
            if (r1 == 0) goto L_0x03c2
            r1.mo85737c(r12)
        L_0x03c2:
            jh1.b r1 = r0.f168800q
            if (r1 == 0) goto L_0x03c8
            android.view.View r11 = r1.f173235h
        L_0x03c8:
            if (r11 != 0) goto L_0x03cb
            goto L_0x03cf
        L_0x03cb:
            r1 = 0
            r11.setTranslationX(r1)
        L_0x03cf:
            jh1.b r1 = r0.f168800q
            if (r1 == 0) goto L_0x03d8
            r1.mo85741c(r13)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x03d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C58999c1.mo84229G3(android.view.View):void");
    }

    /* renamed from: e */
    public boolean mo9121e() {
        return false;
    }

    /* renamed from: m3 */
    public final void mo84230m3() {
        PAGView pAGView;
        View view = this.f168797n;
        boolean z = false;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "hideLotteryResule", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "hideLotteryResule", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f168804u = null;
        mo84232o3(C59000a.CUSTOM_OPEN);
        PAGView pAGView2 = this.f168803t;
        if (pAGView2 != null && pAGView2.isPlaying()) {
            z = true;
        }
        if (z && (pAGView = this.f168803t) != null) {
            pAGView.stop();
        }
    }

    /* renamed from: n3 */
    public final void mo84231n3(C32226l<? super Boolean, C13598b0> lVar) {
        String str = this.f168796j;
        StringBuilder sb = new StringBuilder();
        sb.append("set Back:");
        sb.append(lVar != null);
        Log.m105924i(str, sb.toString());
        this.f168806w = lVar;
    }

    /* renamed from: o3 */
    public final void mo84232o3(C59000a aVar) {
        C87412m.m108594g(aVar, "value");
        String str = this.f168796j;
        Log.m105924i(str, "set source:" + aVar);
        this.f168807x = aVar;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z = true;
        if ((valueOf == null || valueOf.intValue() != C0966R.C0970id.odb) && (valueOf == null || valueOf.intValue() != C0966R.C0970id.be4)) {
            z = false;
        }
        if (z) {
            C32226l<? super Boolean, C13598b0> lVar = this.f168806w;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            mo84230m3();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onLiveActivate() {
        Log.m105924i(this.f168796j, "onLiveActivate");
    }

    public void onNewIntent(Intent intent) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C59440c.C8315a.m8366a(this, i, strArr, iArr);
    }

    public boolean onSwipeBack() {
        return false;
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f168797n = null;
        this.f168798o = null;
        this.f168799p = null;
        this.f168800q = null;
        this.f168803t = null;
        this.f168804u = null;
        mo84231n3((C32226l<? super Boolean, C13598b0>) null);
        mo84232o3(C59000a.CUSTOM_OPEN);
    }

    public void resume() {
        C60826c cVar;
        String str = this.f168796j;
        StringBuilder sb = new StringBuilder();
        sb.append("onResume cacheMilestoneLotteryInfo:");
        Object obj = this.f168804u;
        if (obj == null) {
            obj = "";
        }
        sb.append(C61937h.m72709h(obj));
        Log.m105924i(str, sb.toString());
        C64622p31 p312 = this.f168804u;
        if (p312 != null && (cVar = this.f168798o) != null) {
            C11207i.m11066b(cVar.f173256e, (C66212f) null, (C53934p0) null, new C60829e(p312, cVar, (C15601d<? super C60829e>) null), 3, (Object) null);
        }
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
    }
}
