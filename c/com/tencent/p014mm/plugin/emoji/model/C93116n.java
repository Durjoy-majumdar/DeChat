package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C96984r2;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import p441aq.C92054g;
import p61.C100639a;
import p61.C100651h0;
import p61.C100659j0;
import p61.C100681v;
import p61.C100682w;
import p61.C100683x;
import p61.C100684y;
import sf0.C48374j0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C101800k70;
import te3.C101824o80;
import te3.C49817i92;
import te3.C50363m70;
import te3.C50507n80;
import u61.C101963g;
import x51.C102562g;

/* renamed from: com.tencent.mm.plugin.emoji.model.n */
public final class C93116n implements C93104c0 {

    /* renamed from: c */
    public static final C93117a f268258c = new C93117a((C8480h) null);

    /* renamed from: d */
    public static HashMap<String, C96984r2> f268259d = new HashMap<>();

    /* renamed from: e */
    public static Boolean f268260e;

    /* renamed from: a */
    public List<C100684y> f268261a = new ArrayList();

    /* renamed from: b */
    public final HashMap<String, C96984r2> f268262b = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.emoji.model.n$a */
    public static final class C93117a {
        public C93117a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo127626a() {
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C93116n.f268259d = C30790w2.m39221h().mo57715b().mo142022SE();
        }
    }

    public C93116n(C49817i92 i922) {
        Class cls = C92054g.class;
        if (i922 != null) {
            ((ArrayList) this.f268261a).clear();
            f268258c.mo127626a();
            LinkedList<C50507n80> linkedList = i922.f135182e;
            C87412m.m108593f(linkedList, "response.EmotionStoreRecList");
            for (C50507n80 n802 : linkedList) {
                int i = n802.f138466e;
                if (i == 1) {
                    int i2 = n802.f138465d;
                    if (i2 != 1) {
                        m117523c(this, n802.f138467f, this.f268261a, i2, 0, 8, (Object) null);
                    }
                    C100639a aVar = new C100639a();
                    aVar.f294833a = new ArrayList();
                    aVar.f294834b = n802.f138470i;
                    aVar.f294835c = n802.f138465d;
                    ((ArrayList) this.f268261a).add(aVar);
                } else if (i == 2) {
                    m117523c(this, n802.f138467f, this.f268261a, n802.f138465d, 0, 8, (Object) null);
                    LinkedList<C101824o80> linkedList2 = n802.f138472n;
                    C87412m.m108593f(linkedList2, "listEntry.EmotionList");
                    int i3 = 0;
                    for (T next : linkedList2) {
                        int i4 = i3 + 1;
                        C96984r2 r2Var = null;
                        if (i3 >= 0) {
                            C101824o80 o802 = (C101824o80) next;
                            C100683x xVar = new C100683x();
                            xVar.f294997b = i3 == 0;
                            C102562g gVar = new C102562g(o802);
                            if (C101963g.m134218c(o802)) {
                                if (C101963g.m134216a()) {
                                    gVar.mo142189b(7);
                                } else {
                                    gVar.mo142189b(3);
                                }
                            }
                            if (f268260e == null) {
                                f268260e = Boolean.valueOf(C75592q0.m90796z());
                            }
                            boolean b = C87412m.m108589b(f268260e, Boolean.TRUE);
                            String str = o802.f298994d;
                            gVar.mo142188a(b, str != null ? this.f268262b.get(str) : r2Var, f268259d.containsKey(o802.f298994d));
                            Map<String, Integer> map = ((C92054g) C86312j.m106911c(cls)).zx0().f268264b;
                            if (map != null && (!((HashMap) map).isEmpty())) {
                                int b2 = ((C92054g) C86312j.m106911c(cls)).zx0().mo127628b(o802.f298994d);
                                if (b2 >= 0) {
                                    gVar.mo142189b(6);
                                    gVar.f301986e = b2;
                                }
                                if (b2 < 0 && gVar.f301987f == 6) {
                                    gVar.mo142189b(3);
                                }
                            }
                            xVar.f294996a = gVar;
                            ((ArrayList) this.f268261a).add(xVar);
                            i3 = i4;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    C100681v vVar = new C100681v();
                    vVar.f294991b = C48374j0.m53715d(n802.f138468g);
                    String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.c8i);
                    C87412m.m108593f(q, "getString(MMApplicationC…ng.emoji_store_find_more)");
                    vVar.f294990a = q;
                    String str2 = n802.f138467f;
                    C87412m.m108593f(str2, "listEntry.ListName");
                    vVar.f294992c = str2;
                    vVar.f294993d = n802.f138465d;
                    ((ArrayList) this.f268261a).add(vVar);
                } else if (i == 3) {
                    LinkedList<C50363m70> linkedList3 = n802.f138474p;
                    C87412m.m108593f(linkedList3, "listEntry.EmojiRecommendList");
                    for (C50363m70 m702 : linkedList3) {
                        C100651h0 h0Var = new C100651h0();
                        h0Var.f294867d = n802.f138465d;
                        LinkedList<C101800k70> linkedList4 = m702.f137889f;
                        C87412m.m108593f(linkedList4, "recommandInfo.Emojis");
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList4, 10));
                        for (C101800k70 k702 : linkedList4) {
                            C100659j0 j0Var = new C100659j0();
                            j0Var.f294877a = k702;
                            j0Var.f294878b = n802.f138465d;
                            arrayList.add(j0Var);
                        }
                        h0Var.f294864a = arrayList;
                        h0Var.f294865b = m702.f137887d;
                        ((ArrayList) this.f268261a).add(h0Var);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m117523c(C93116n nVar, String str, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        nVar.getClass();
        C87412m.m108594g(list, "list");
        if (str == null || C87412m.m108589b(str, "")) {
            return false;
        }
        C100682w wVar = new C100682w();
        wVar.f294994a = str;
        wVar.f294995b = i;
        if (i2 == -1) {
            list.add(wVar);
        } else {
            list.add(i2, wVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo127609a(String str, int i) {
        C96984r2 r2Var = this.f268262b.get(str);
        if (r2Var != null) {
            r2Var.mo135631a(i);
        }
    }

    /* renamed from: b */
    public C96984r2 mo127610b(String str) {
        C96984r2 r2Var = str == null ? null : this.f268262b.get(str);
        if (r2Var == null) {
            r2Var = new C96984r2(str);
            if (str != null) {
                this.f268262b.put(str, r2Var);
            }
        }
        return r2Var;
    }
}
