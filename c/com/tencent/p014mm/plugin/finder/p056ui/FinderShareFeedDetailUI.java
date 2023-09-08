package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderBaseFeedUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import ef1.C58553c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C8808v4;
import ht1.C8817y2;
import ht1.C8819z2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46547x1;
import k20.C60958c;
import k20.C9556a;
import kf1.C9640c;
import kf1.C9707f;
import kf1.C9713f2;
import kj2.C117407d;
import kotlin.Metadata;
import pe3.C89349b;
import rs1.C13133c1;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49946j51;
import up1.C37521f;
import up1.C65426w0;
import vp1.C65834e;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lkf1/f2;", "Lcom/tencent/mm/plugin/finder/ui/Presenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI */
public final class FinderShareFeedDetailUI extends FinderBaseFeedUI<C9713f2, Presenter> {

    /* renamed from: G */
    public static final /* synthetic */ int f17102G = 0;

    /* renamed from: A */
    public boolean f17103A = true;

    /* renamed from: B */
    public C89349b f17104B;

    /* renamed from: C */
    public boolean f17105C = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();

    /* renamed from: D */
    public View f17106D;

    /* renamed from: E */
    public View f17107E;

    /* renamed from: F */
    public boolean f17108F;

    /* renamed from: p */
    public final String f17109p = "Finder.FinderShareFeedDetailUI";

    /* renamed from: q */
    public Presenter f17110q;

    /* renamed from: r */
    public C9713f2 f17111r;

    /* renamed from: s */
    public long f17112s;

    /* renamed from: t */
    public String f17113t = "";

    /* renamed from: u */
    public String f17114u = "";

    /* renamed from: v */
    public int f17115v;

    /* renamed from: w */
    public int f17116w = 2;

    /* renamed from: x */
    public String f17117x = "";

    /* renamed from: y */
    public final C13601g f17118y = C36568h.m40985a(new C3734a(this));

    /* renamed from: z */
    public final C13601g f17119z = C36568h.m40985a(new C3735b(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI$a */
    public static final class C3734a extends C87413o implements C32224a<C55776r> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedDetailUI f17120d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3734a(FinderShareFeedDetailUI finderShareFeedDetailUI) {
            super(0);
            this.f17120d = finderShareFeedDetailUI;
        }

        public Object invoke() {
            return ((C13133c1) C39818r.f106831a.mo62444c(this.f17120d).mo75002a(C13133c1.class)).f37371d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI$b */
    public static final class C3735b extends C87413o implements C32224a<C8819z2> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedDetailUI f17121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3735b(FinderShareFeedDetailUI finderShareFeedDetailUI) {
            super(0);
            this.f17121d = finderShareFeedDetailUI;
        }

        public Object invoke() {
            return ((C8817y2) C39818r.f106831a.mo62444c(this.f17121d).mo62447c(C8817y2.class)).mo9643v2();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI$c */
    public static final class C3736c extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedDetailUI f17122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3736c(FinderShareFeedDetailUI finderShareFeedDetailUI) {
            super(1);
            this.f17122d = finderShareFeedDetailUI;
        }

        public Object invoke(Object obj) {
            if (((Number) obj).intValue() != 0) {
                return null;
            }
            Presenter presenter = this.f17122d.f17110q;
            if (presenter != null) {
                C0740i2 a1 = presenter.mo2489a1();
                if (a1 instanceof BaseFinderFeed) {
                    return (BaseFinderFeed) a1;
                }
                return null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI$d */
    public static final class C3737d extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ FinderShareFeedDetailUI f17123d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3737d(FinderShareFeedDetailUI finderShareFeedDetailUI) {
            super(2);
            this.f17123d = finderShareFeedDetailUI;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            ((Number) obj2).intValue();
            Presenter presenter = this.f17123d.f17110q;
            if (presenter != null) {
                C0740i2 a1 = presenter.mo2489a1();
                if (a1 == null) {
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                linkedList.add(a1);
                return linkedList;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI$e */
    public static final class C3738e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderShareFeedDetailUI f17124a;

        public C3738e(FinderShareFeedDetailUI finderShareFeedDetailUI) {
            this.f17124a = finderShareFeedDetailUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0210  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0213  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0219  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x021c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r36) {
            /*
                r35 = this;
                r0 = r35
                r1 = r36
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                int r2 = r1.f256793a
                r3 = 0
                if (r2 != 0) goto L_0x000f
                int r4 = r1.f256794b
                if (r4 == 0) goto L_0x0019
            L_0x000f:
                er1.j4 r4 = er1.C58739j4.f168176a
                int r5 = r1.f256794b
                boolean r2 = r4.mo83681J(r2, r5)
                if (r2 == 0) goto L_0x024b
            L_0x0019:
                T r1 = r1.f256796d
                te3.jm0 r1 = (te3.C50008jm0) r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f136184e
                if (r1 == 0) goto L_0x0249
                com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI r2 = r0.f17124a
                java.lang.String r4 = r2.f17109p
                java.lang.String r5 = "get feed detail success"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                com.tencent.mm.protocal.protobuf.FinderContact r4 = new com.tencent.mm.protocal.protobuf.FinderContact
                r4.<init>()
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r1.contact
                if (r5 == 0) goto L_0x0036
                java.lang.String r6 = r5.username
                goto L_0x0037
            L_0x0036:
                r6 = r3
            L_0x0037:
                r4.username = r6
                if (r5 == 0) goto L_0x003e
                java.lang.String r6 = r5.nickname
                goto L_0x003f
            L_0x003e:
                r6 = r3
            L_0x003f:
                r4.nickname = r6
                if (r5 == 0) goto L_0x0046
                java.lang.String r6 = r5.headUrl
                goto L_0x0047
            L_0x0046:
                r6 = r3
            L_0x0047:
                r4.headUrl = r6
                if (r5 == 0) goto L_0x004e
                com.tencent.mm.protocal.protobuf.FinderAuthInfo r6 = r5.authInfo
                goto L_0x004f
            L_0x004e:
                r6 = r3
            L_0x004f:
                r4.authInfo = r6
                if (r5 == 0) goto L_0x0056
                te3.ii0 r5 = r5.extInfo
                goto L_0x0057
            L_0x0056:
                r5 = r3
            L_0x0057:
                r4.extInfo = r5
                fe1.d$b r5 = fe1.C58961d.f168673a
                r6 = 2
                r7 = 0
                fe1.C58961d.C58963b.m68837m(r5, r4, r7, r6, r3)
                wp1.f$a r4 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.storage.FinderItem$a r5 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r6 = 1
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo79056a(r1, r6)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r4.mo14348k(r5)
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r4.mo3513o()
                vp1.e r8 = vp1.C65834e.f189316a
                vp1.e$b r9 = vp1.C65834e.C65836b.f189330j
                r8.mo89878l(r5, r9)
                com.tencent.mm.plugin.finder.ui.Presenter r5 = r2.f17110q
                if (r5 == 0) goto L_0x0242
                java.util.ArrayList<cm1.i2> r8 = r5.f13027t
                int r8 = r8.size()
                if (r8 <= 0) goto L_0x008a
                java.util.ArrayList<cm1.i2> r8 = r5.f13027t
                r8.set(r7, r4)
                goto L_0x008f
            L_0x008a:
                java.util.ArrayList<cm1.i2> r8 = r5.f13027t
                r8.add(r4)
            L_0x008f:
                kf1.f r8 = r5.f29964g
                if (r8 == 0) goto L_0x00a6
                androidx.recyclerview.widget.RecyclerView r8 = r8.getRecyclerView()
                if (r8 == 0) goto L_0x00a6
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.getAdapter()
                if (r8 == 0) goto L_0x00a6
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                r8.notifyItemChanged(r7, r9)
            L_0x00a6:
                kf1.f r8 = r5.f29964g
                if (r8 == 0) goto L_0x00b8
                androidx.recyclerview.widget.RecyclerView r8 = r8.getRecyclerView()
                if (r8 == 0) goto L_0x00b8
                kf1.e2 r9 = new kf1.e2
                r9.<init>(r5)
                r8.post(r9)
            L_0x00b8:
                int r5 = r2.f17115v
                java.lang.String r8 = ""
                if (r5 == 0) goto L_0x00f9
                boolean r5 = r2.f17108F
                if (r5 != 0) goto L_0x00f9
                java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                r9 = r5
                dp1.y0 r9 = (dp1.C58417y0) r9
                long r10 = r2.f17112s
                int r12 = r2.f17115v
                java.lang.String r5 = r2.f17117x
                if (r5 != 0) goto L_0x00d5
                r13 = r8
                goto L_0x00d6
            L_0x00d5:
                r13 = r5
            L_0x00d6:
                r14 = 1
                r15 = 0
                rs1.s8$a r5 = rs1.C13442s8.f38060Q0
                androidx.appcompat.app.AppCompatActivity r3 = r2.getContext()
                java.lang.String r7 = "context"
                gy3.C87412m.m108593f(r3, r7)
                rs1.s8 r3 = r5.mo12873f(r3)
                if (r3 == 0) goto L_0x00f2
                te3.hj1 r3 = r3.mo12861q3()
                java.lang.String r3 = r3.f134671e
                r16 = r3
                goto L_0x00f4
            L_0x00f2:
                r16 = 0
            L_0x00f4:
                r9.jy0(r10, r12, r13, r14, r15, r16)
                r2.f17108F = r6
            L_0x00f9:
                boolean r3 = r2.f17105C
                if (r3 == 0) goto L_0x01b8
                up1.f r3 = up1.C37521f.f99374d
                r3.getClass()
                java.lang.Class<h81.h> r3 = h81.C32735h.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                h81.h r3 = (h81.C32735h) r3
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_ultron_share_detail_entrance_switch_android
                int r3 = r3.mo58779Qe(r5, r6)
                if (r3 != r6) goto L_0x0114
                r3 = 1
                goto L_0x0115
            L_0x0114:
                r3 = 0
            L_0x0115:
                if (r3 == 0) goto L_0x01b8
                boolean r3 = r2.f17103A
                if (r3 == 0) goto L_0x01b8
                android.view.View r3 = r2.f17106D
                if (r3 != 0) goto L_0x0170
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
                r5 = 2131494569(0x7f0c06a9, float:1.861265E38)
                kf1.f2 r7 = r2.f17111r
                java.lang.String r9 = "viewCallback"
                if (r7 == 0) goto L_0x016b
                androidx.recyclerview.widget.RecyclerView r7 = r7.getRecyclerView()
                r10 = 0
                android.view.View r3 = r3.inflate(r5, r7, r10)
                r2.f17106D = r3
                kf1.f2 r3 = r2.f17111r
                if (r3 == 0) goto L_0x0166
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = r3.mo10312p()
                android.view.View r5 = r2.f17106D
                gy3.C87412m.m108591d(r5)
                r3.mo85792R5(r5, r10, r10)
                kf1.f2 r3 = r2.f17111r
                if (r3 == 0) goto L_0x0161
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = r3.mo10312p()
                r5 = 0
                r3.f173488o = r5
                android.view.View r3 = r2.f17106D
                gy3.C87412m.m108591d(r3)
                com.tencent.mm.plugin.finder.ui.v3 r5 = new com.tencent.mm.plugin.finder.ui.v3
                r5.<init>(r2)
                r3.setOnClickListener(r5)
                goto L_0x0170
            L_0x0161:
                r5 = 0
                gy3.C87412m.m108603p(r9)
                throw r5
            L_0x0166:
                r5 = 0
                gy3.C87412m.m108603p(r9)
                throw r5
            L_0x016b:
                r5 = 0
                gy3.C87412m.m108603p(r9)
                throw r5
            L_0x0170:
                android.view.View r3 = r2.f17106D
                if (r3 != 0) goto L_0x0175
                goto L_0x01bc
            L_0x0175:
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                r7 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r5.mo10233c(r9)
                java.lang.Object[] r10 = r5.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1"
                java.lang.String r12 = "call"
                java.lang.String r13 = "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r9 = r3
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                r7 = 0
                java.lang.Object r5 = r5.mo10231a(r7)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r3.setVisibility(r5)
                java.lang.String r10 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1"
                java.lang.String r11 = "call"
                java.lang.String r12 = "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x01bc
            L_0x01b8:
                android.view.View r3 = r2.f17106D
                if (r3 != 0) goto L_0x01be
            L_0x01bc:
                r5 = 0
                goto L_0x0202
            L_0x01be:
                r5 = 8
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r7.mo10233c(r5)
                java.lang.Object[] r18 = r7.mo10232b()
                java.lang.String r19 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1"
                java.lang.String r20 = "call"
                java.lang.String r21 = "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r3
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                r5 = 0
                java.lang.Object r7 = r7.mo10231a(r5)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r3.setVisibility(r7)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1"
                java.lang.String r19 = "call"
                java.lang.String r20 = "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            L_0x0202:
                com.tencent.mm.plugin.finder.feed.model.r r24 = r2.mo4123R7()
                long r9 = r1.f164794id
                java.lang.String r3 = r1.objectNonceId
                r28 = 25
                int r7 = r1.secondaryShowFlag
                if (r7 == r6) goto L_0x0213
                r29 = 1
                goto L_0x0215
            L_0x0213:
                r29 = 0
            L_0x0215:
                java.lang.String r1 = r1.username
                if (r1 != 0) goto L_0x021c
                r30 = r8
                goto L_0x021e
            L_0x021c:
                r30 = r1
            L_0x021e:
                r31 = 0
                r32 = 0
                r33 = 96
                r34 = 0
                r25 = r9
                r27 = r3
                com.tencent.p014mm.plugin.finder.feed.model.C55776r.m63515J1(r24, r25, r27, r28, r29, r30, r31, r32, r33, r34)
                long r5 = r2.f17112s
                r7 = 0
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 != 0) goto L_0x023f
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r4.mo3513o()
                long r3 = r1.getId()
                r2.f17112s = r3
            L_0x023f:
                rx3.b0 r3 = rx3.C13598b0.f38549a
                goto L_0x0268
            L_0x0242:
                java.lang.String r1 = "presenter"
                gy3.C87412m.m108603p(r1)
                r1 = 0
                throw r1
            L_0x0249:
                r1 = r3
                goto L_0x0268
            L_0x024b:
                int r2 = r1.f256794b
                r3 = -4011(0xfffffffffffff055, float:NaN)
                if (r2 == r3) goto L_0x0259
                r3 = -4033(0xfffffffffffff03f, float:NaN)
                if (r2 == r3) goto L_0x0259
                r3 = -4036(0xfffffffffffff03c, float:NaN)
                if (r2 != r3) goto L_0x0266
            L_0x0259:
                com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI r3 = r0.f17124a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r1 = r1.f256795c
                int r4 = com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedDetailUI.f17102G
                r3.mo4124S7(r2, r1)
            L_0x0266:
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x0268:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedDetailUI.C3738e.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 25;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: N7 */
    public C9640c mo2955N7() {
        Presenter presenter = this.f17110q;
        if (presenter != null) {
            return presenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: O7 */
    public C9707f mo2956O7() {
        C9713f2 f2Var = this.f17111r;
        if (f2Var != null) {
            return f2Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: P7 */
    public void mo2957P7() {
        setMMTitle((int) C0966R.string.esc);
        View findViewById = findViewById(C0966R.C0970id.f359187ji0);
        C87412m.m108593f(findViewById, "findViewById(R.id.share_feed_detail_tips_layout)");
        this.f17107E = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: Q7 */
    public void mo2958Q7() {
        C58553c a;
        C58553c a2;
        FinderItem e;
        this.f17112s = getIntent().getLongExtra("feed_object_id", 0);
        String stringExtra = getIntent().getStringExtra("feed_encrypted_object_id");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f17113t = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("feed_object_nonceId");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f17114u = str;
        this.f17115v = getIntent().getIntExtra("report_scene", 0);
        this.f17117x = getIntent().getStringExtra("from_user");
        this.f17103A = getIntent().getBooleanExtra("key_show_jump_entry", true);
        String stringExtra3 = getIntent().getStringExtra("key_like_buffer");
        if (stringExtra3 != null && !Util.isNullOrNil(stringExtra3)) {
            this.f17104B = C89349b.m111674a(Util.decodeHexString(stringExtra3));
        }
        if (this.f17112s == 0 && Util.isNullOrNil(this.f17113t)) {
            String str2 = this.f17109p;
            Log.m105928w(str2, "objectId " + this.f17112s + ", encryptedObjectId " + this.f17113t + ", finish");
            finish();
        }
        Presenter presenter = new Presenter(this.f17116w, this, !this.f17105C);
        this.f17110q = presenter;
        this.f17111r = new C9713f2(this, presenter, this.f17116w, 25, !this.f17105C);
        long j = this.f17112s;
        if (!(j == 0 || (e = C65834e.f189316a.mo89871e(j)) == null)) {
            BaseFinderFeed k = C15585f.f42211a.mo14348k(e);
            Presenter presenter2 = this.f17110q;
            if (presenter2 != null) {
                ArrayList<C0740i2> arrayList = presenter2.f13027t;
                if (arrayList != null) {
                    arrayList.add(k);
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        if (this.f17115v != 0) {
            C117407d.INSTANCE.idkeyStat(1278, 14, 1, false);
        }
        mo4123R7().mo77389H1(this.f17116w, 25, new C3736c(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C13442s8 f = aVar.mo12873f(context);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a(mo4123R7());
        }
        C8819z2 z2Var = (C8819z2) ((C36570n) this.f17119z).getValue();
        C3737d dVar = new C3737d(this);
        C9713f2 f2Var = this.f17111r;
        if (f2Var != null) {
            z2Var.mo9646T0(dVar, f2Var.getRecyclerView());
            AppCompatActivity context2 = getContext();
            C87412m.m108593f(context2, "context");
            C13442s8 f2 = aVar.mo12873f(context2);
            if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
                a.mo83450a(((C8819z2) ((C36570n) this.f17119z).getValue()).mo9650n());
                return;
            }
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: R7 */
    public final C55776r mo4123R7() {
        return (C55776r) ((C36570n) this.f17118y).getValue();
    }

    /* renamed from: S7 */
    public final void mo4124S7(Integer num, String str) {
        C9713f2 f2Var = this.f17111r;
        if (f2Var != null) {
            f2Var.getRecyclerView().setVisibility(8);
            View view = this.f17107E;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                boolean z = false;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "showErrorUi", "(Ljava/lang/Integer;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "showErrorUi", "(Ljava/lang/Integer;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f17107E;
                if (view2 != null) {
                    TextView textView = (TextView) view2.findViewById(C0966R.C0970id.c1m);
                    if (num != null && num.intValue() == -4011) {
                        if (str != null) {
                            if (str.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                textView.setText(str);
                                return;
                            }
                        }
                        textView.setText(C0966R.string.f360503d90);
                    } else if (num != null && num.intValue() == -4033) {
                        if (str != null) {
                            if (str.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                textView.setText(str);
                                return;
                            }
                        }
                        textView.setText(C0966R.string.d_8);
                    } else if (num != null && num.intValue() == -4036) {
                        if (str != null) {
                            if (str.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                textView.setText(str);
                                return;
                            }
                        }
                        textView.setText(C0966R.string.eoh);
                    } else {
                        textView.setText(C0966R.string.f360503d90);
                    }
                } else {
                    C87412m.m108603p("tipsLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("tipsLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.apk;
    }

    public void onDestroy() {
        C58553c a;
        C58553c a2;
        if (this.f17115v != 0 && !this.f17108F) {
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            long j = this.f17112s;
            int i = this.f17115v;
            String str = this.f17117x;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            y0Var.jy0(j, i, str2, 0, 0, f != null ? f.mo12861q3().f134671e : null);
            this.f17108F = true;
        }
        mo4123R7().onDetach();
        C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
        AppCompatActivity context2 = getContext();
        C87412m.m108593f(context2, "context");
        C13442s8 f2 = aVar2.mo12873f(context2);
        if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(mo4123R7());
        }
        ((C8819z2) ((C36570n) this.f17119z).getValue()).onDetach();
        AppCompatActivity context3 = getContext();
        C87412m.m108593f(context3, "context");
        C13442s8 f3 = aVar2.mo12873f(context3);
        if (!(f3 == null || (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
            a.mo83453d(((C8819z2) ((C36570n) this.f17119z).getValue()).mo9650n());
        }
        Presenter presenter = this.f17110q;
        if (presenter != null) {
            presenter.onDetach();
            super.onDestroy();
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onResume() {
        super.onResume();
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).Sn0()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99180G6.mo60266n().intValue() == 1) {
                mo4124S7(-4036, getContext().getResources().getString(C0966R.string.erm));
                return;
            }
        }
        long j = this.f17112s;
        String str = this.f17114u;
        String str2 = this.f17113t;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this);
        new C46547x1(j, str, 25, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 118720, (C8480h) null).mo9225i().mo123062e(new C3738e(this));
    }
}
