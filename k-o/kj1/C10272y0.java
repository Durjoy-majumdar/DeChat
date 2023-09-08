package kj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import java.util.List;
import java.util.Map;
import kj1.C10125e1;
import lj1.C10538e;
import ok1.C62042e;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: kj1.y0 */
public final class C10272y0 extends C10538e {

    /* renamed from: h */
    public final String f31328h = "anchorlive.more.sharefriend";

    /* renamed from: kj1.y0$a */
    public static final class C10273a extends C87413o implements C32226l<List<? extends String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f31329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10273a(C10125e1 e1Var) {
            super(1);
            this.f31329d = e1Var;
        }

        public Object invoke(Object obj) {
            this.f31329d.mo10535c((List) obj);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10272y0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31328h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return C62042e.f176370a.mo87082h(((C54991o) this.f31809a.mo10534b(C54991o.class)).f154388y0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10523o(kj1.C10125e1 r18, nj3.C76874e0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            ak1.f0$n r2 = ak1.C54067f0.C0066n.SEND_TO_FRIEND
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            java.lang.String r5 = "<this>"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "menu"
            r6 = r19
            gy3.C87412m.m108594g(r6, r5)
            int r5 = r0.f31810b
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0022
            r9 = 3
            if (r5 != r9) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            r9 = 0
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131828151(0x7f111db7, float:1.9289235E38)
            java.lang.String r10 = r10.getString(r11)
            java.lang.String r11 = "getContext().resources.g…ve_more_action_to_friend)"
            gy3.C87412m.m108593f(r10, r11)
            r11 = 2131755655(0x7f100287, float:1.9142195E38)
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r12 = r12.getColor(r13)
            androidx.lifecycle.i0 r13 = r1.mo10534b(r3)
            cl1.o r13 = (cl1.C54991o) r13
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.f154341n
            if (r13 == 0) goto L_0x006e
            androidx.lifecycle.i0 r1 = r1.mo10534b(r3)
            cl1.o r1 = (cl1.C54991o) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
            if (r1 == 0) goto L_0x0068
            long r13 = r1.f164794id
            r15 = 0
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 != 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            if (r1 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r1 = 0
            goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            r6 = r19
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r1
            android.view.MenuItem r1 = r6.mo107150j(r7, r8, r9, r10, r11)
            r0.mo10811u(r1)
            if (r5 == 0) goto L_0x0095
            di3.d r1 = di3.C86312j.m106911c(r4)
            ak1.o r1 = (ak1.C54108o) r1
            di3.d r3 = di3.C86312j.m106911c(r4)
            ak1.o r3 = (ak1.C54108o) r3
            ak1.f0$l r4 = ak1.C54067f0.C0062l.LIVING
            java.util.Map r3 = r3.Ex0(r4)
            r1.mo9602Jz(r2, r3)
            goto L_0x00a5
        L_0x0095:
            di3.d r1 = di3.C86312j.m106911c(r4)
            java.lang.String r3 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            ht1.j5 r1 = (ht1.C8777j5) r1
            r3 = 2
            r4 = 0
            ht1.C8777j5.C8778a.m8608i(r1, r2, r4, r3, r4)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10272y0.mo10523o(kj1.e1, nj3.e0):void");
    }

    /* renamed from: q */
    public int mo10524q() {
        return 0;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10222s0 s0Var;
        C10222s0 s0Var2;
        C77407n nVar;
        C10125e1.C10126a aVar;
        C54067f0.C0064m mVar = C54067f0.C0064m.SEND_TO_FRIEND;
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        String str = e1Var.f30980a;
        Log.m105924i(str, "share2Friend isLandscape:" + e1Var.f30987f);
        if (!e1Var.f30987f || (C85875k4.m106210y() && !C85875k4.m106157N())) {
            mo10576v(e1Var);
            e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_MORE_ACTION_HIDE, (Bundle) null);
            C10125e1.C10127b bVar = e1Var.f30988g;
            if (!(bVar == null || (nVar = bVar.f31012e) == null)) {
                nVar.mo107572p();
            }
            C10125e1.C10127b bVar2 = e1Var.f30988g;
            if (!(bVar2 == null || (s0Var2 = bVar2.f31013f) == null)) {
                s0Var2.mo10568b();
            }
            C10125e1.C10127b bVar3 = e1Var.f30988g;
            if (!(bVar3 == null || (s0Var = bVar3.f31014g) == null)) {
                s0Var.mo10568b();
            }
        } else {
            e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_MORE_ACTION_HIDE, (Bundle) null);
            C10125e1.C10127b bVar4 = e1Var.f30988g;
            if (!(bVar4 == null || (aVar = bVar4.f31008a) == null)) {
                aVar.mo10541a(new C10263x0(this, e1Var));
            }
        }
        if (C62042e.f176370a.mo87027N0()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, mVar, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
        } else {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c2, mVar, (Map) null, (String) null, 6, (Object) null);
        }
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8608i((C8777j5) c3, C54067f0.C0066n.SELECT_CHAT_BAR, (Map) null, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0044, code lost:
        r0 = r0.f31019l;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10576v(kj1.C10125e1 r12) {
        /*
            r11 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r12, r1)
            java.lang.String r1 = r12.f30980a
            java.lang.String r2 = "share2FriendImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.ui.MMActivity r4 = r12.f30985d
            androidx.lifecycle.i0 r1 = r12.mo10534b(r0)
            cl1.o r1 = (cl1.C54991o) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
            if (r1 == 0) goto L_0x0070
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r12.mo10534b(r2)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            r12.mo10540h(r1, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem$a r2 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            r3 = 16384(0x4000, float:2.2959E-41)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo79056a(r1, r3)
            androidx.lifecycle.i0 r0 = r12.mo10534b(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154199F1
            r5.setEcSource(r0)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            kj1.e1$b r0 = r12.f30988g
            if (r0 == 0) goto L_0x004d
            wc3.e0 r0 = r0.f31019l
            if (r0 == 0) goto L_0x004d
            int r0 = r0.getItemCount()
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            java.lang.String r1 = "quick_share_item_count"
            r6.putInt(r1, r0)
            java.lang.Class<tf0.o1> r0 = tf0.C13883o1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IActivityRouter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r3 = r0
            tf0.o1 r3 = (tf0.C13883o1) r3
            r7 = 0
            kj1.y0$a r8 = new kj1.y0$a
            r8.<init>(r12)
            r9 = 8
            r10 = 0
            tf0.C13883o1.C13884a.m13254f(r3, r4, r5, r6, r7, r8, r9, r10)
            r12.mo10538f()
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10272y0.mo10576v(kj1.e1):void");
    }
}
