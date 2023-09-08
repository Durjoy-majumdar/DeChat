package com.tencent.p014mm.p136ui.contact;

import android.os.Looper;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import fy3.C32224a;
import gl3.C75922b;
import gl3.C75929e;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C99664b;
import lv1.C99671h;
import lv1.C99672i;
import lv1.C99681n;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.ui.contact.o1 */
public final class C74536o1 extends C74498h1 implements C61173o {

    /* renamed from: j */
    public final String f219105j;

    /* renamed from: n */
    public final HashSet<String> f219106n;

    /* renamed from: o */
    public C99664b f219107o;

    /* renamed from: p */
    public List<? extends C99671h> f219108p;

    /* renamed from: q */
    public C99672i f219109q;

    /* renamed from: r */
    public final C13601g f219110r = C36568h.m40985a(C44881a.f121745d);

    /* renamed from: com.tencent.mm.ui.contact.o1$a */
    public static final class C44881a extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C44881a f121745d = new C44881a();

        public C44881a() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74536o1(C74493g1 g1Var, String str, int i, boolean z, HashSet<String> hashSet) {
        super(g1Var, z, i);
        C87412m.m108594g(g1Var, "ui");
        C87412m.m108594g(str, "chatroom");
        C87412m.m108594g(hashSet, "blockSet");
        this.f219105j = str;
        this.f219106n = hashSet;
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        if (lVar != null) {
            C99672i iVar = null;
            if ((C87412m.m108589b(lVar.f32073b, this.f219107o) ? lVar : null) != null) {
                int i = lVar.f32074c;
                if (i == -3 || i == -2 || i == -1) {
                    this.f219108p = null;
                    this.f219109q = null;
                    mo103564g();
                    C74498h1.C44878a aVar = this.f219051i;
                    if (aVar != null) {
                        aVar.mo62789t6(lVar.f32075d.f292120a, getCount(), true);
                    }
                    notifyDataSetChanged();
                } else if (i == 0) {
                    List<C99681n> list = lVar.f32076e;
                    C87412m.m108593f(list, "result.resultList");
                    C99681n nVar = (C99681n) C110818d0.m150917O(list, 0);
                    if (nVar != null) {
                        nVar.f292168v = lVar.f32075d;
                    } else {
                        nVar = null;
                    }
                    this.f219108p = nVar != null ? nVar.f292160n : null;
                    if (nVar != null) {
                        iVar = nVar.f292168v;
                    }
                    this.f219109q = iVar;
                    mo103564g();
                    C74498h1.C44878a aVar2 = this.f219051i;
                    if (aVar2 != null) {
                        aVar2.mo62789t6(lVar.f32075d.f292120a, getCount(), true);
                    }
                    notifyDataSetChanged();
                }
            }
        }
    }

    public int getCount() {
        List<? extends C99671h> list = this.f219108p;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        C99671h hVar;
        C75929e eVar = new C75929e(i, this.f219057f);
        List<? extends C99671h> list = this.f219108p;
        if (!(list == null || (hVar = (C99671h) C110818d0.m150917O(list, i)) == null)) {
            eVar.f222646E = hVar;
            eVar.f222620q = this.f219105j;
            eVar.f222603z = this.f219109q;
        }
        return eVar;
    }

    /* renamed from: i */
    public void mo7851i() {
        C99664b bVar = this.f219107o;
        if (bVar != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(bVar);
            this.f219107o = null;
        }
        this.f219108p = null;
        this.f219109q = null;
        mo103564g();
    }

    /* renamed from: q */
    public void mo96748q() {
    }

    /* renamed from: r */
    public void mo63130r(String str, int[] iArr, boolean z) {
        mo103590v(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103590v(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Class<kv1.q> r0 = kv1.C99260q.class
            r1 = 1
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L_0x0052
            java.lang.CharSequence r4 = z04.C112550d0.m153799i0(r7)
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0017
            r4 = 1
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            if (r4 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r7 = r3
        L_0x001c:
            if (r7 == 0) goto L_0x0052
            lv1.k r4 = new lv1.k
            r4.<init>()
            java.lang.String r5 = r6.f219105j
            r4.f224469d = r5
            r4.f224468c = r7
            r7 = 12
            r4.f224467b = r7
            rx3.g r7 = r6.f219110r
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            com.tencent.mm.sdk.platformtools.MMHandler r7 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r7
            r4.f224479n = r7
            r4.f224478m = r6
            java.util.HashSet<java.lang.String> r7 = r4.f224475j
            java.util.HashSet<java.lang.String> r5 = r6.f219106n
            r7.addAll(r5)
            di3.d r7 = di3.C86312j.m106911c(r0)
            kv1.q r7 = (kv1.C99260q) r7
            r5 = 2
            lv1.b r7 = r7.Xn0(r5, r4)
            r6.f219107o = r7
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x0053
        L_0x0052:
            r7 = r3
        L_0x0053:
            if (r7 != 0) goto L_0x0075
            lv1.b r7 = r6.f219107o
            if (r7 == 0) goto L_0x0064
            di3.d r0 = di3.C86312j.m106911c(r0)
            kv1.q r0 = (kv1.C99260q) r0
            r0.mo128757ki(r7)
            r6.f219107o = r3
        L_0x0064:
            com.tencent.mm.ui.contact.h1$a r7 = r6.f219051i
            if (r7 == 0) goto L_0x006d
            java.lang.String r0 = ""
            r7.mo62789t6(r0, r2, r1)
        L_0x006d:
            com.tencent.mm.ui.contact.p1 r7 = new com.tencent.mm.ui.contact.p1
            r7.<init>(r6)
            o40.C61926c.m72668M(r7)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74536o1.mo103590v(java.lang.String):void");
    }
}
