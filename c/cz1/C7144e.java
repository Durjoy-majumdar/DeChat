package cz1;

import bz1.C0394d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p629ny.C76979h;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64186f0;
import sx3.C64197v;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: cz1.e */
public final class C7144e {

    /* renamed from: a */
    public static final C7145a f25118a = new C7145a((C8480h) null);

    /* renamed from: cz1.e$a */
    public static final class C7145a {

        /* renamed from: cz1.e$a$a */
        public static final class C7146a extends C87413o implements C32227p<Boolean, List<? extends C7143c>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32227p<Boolean, C7143c, C13598b0> f25119d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7146a(C32227p<? super Boolean, ? super C7143c, C13598b0> pVar) {
                super(2);
                this.f25119d = pVar;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                List list = (List) obj2;
                C87412m.m108594g(list, "result");
                this.f25119d.invoke(Boolean.valueOf(booleanValue), list.get(0));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: cz1.e$a$b */
        public static final class C7147b implements C15913g.C15916c {

            /* renamed from: a */
            public final /* synthetic */ C32227p<Boolean, List<C7143c>, C13598b0> f25120a;

            /* renamed from: b */
            public final /* synthetic */ List<C7143c> f25121b;

            /* renamed from: c */
            public final /* synthetic */ HashMap<String, List<C7143c>> f25122c;

            public C7147b(C32227p<? super Boolean, ? super List<C7143c>, C13598b0> pVar, List<C7143c> list, HashMap<String, List<C7143c>> hashMap) {
                this.f25120a = pVar;
                this.f25121b = list;
                this.f25122c = hashMap;
            }

            /* renamed from: a */
            public final void mo445a(Map<String, C15912f> map) {
                C87412m.m108593f(map, "map");
                C32227p<Boolean, List<C7143c>, C13598b0> pVar = this.f25120a;
                List<C7143c> list = this.f25121b;
                HashMap<String, List<C7143c>> hashMap = this.f25122c;
                for (Map.Entry next : map.entrySet()) {
                    if (!((C15912f) next.getValue()).isValid()) {
                        Log.m105920e("GameLife.ConversationLogic", "invalid contact, bind conversation failed!");
                        pVar.invoke(Boolean.FALSE, list);
                        return;
                    }
                    List<C7143c> list2 = hashMap.get(next.getKey());
                    if (list2 != null) {
                        for (C7143c cVar : list2) {
                            Object value = next.getValue();
                            C87412m.m108592e(value, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.contact.GameLifeContact");
                            C0394d dVar = (C0394d) value;
                            cVar.getClass();
                            cVar.f25115F = dVar;
                            C72996z1 V = dVar.mo423V();
                            cVar.f25117H = V.mo62898f();
                            CharSequence charSequence = V.f214114V1;
                            if (charSequence == null) {
                                charSequence = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), cVar.f25117H);
                            }
                            cVar.f25116G = charSequence;
                        }
                    }
                }
                this.f25120a.invoke(Boolean.TRUE, this.f25121b);
            }
        }

        public C7145a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo8336a(C7143c cVar, C32227p<? super Boolean, ? super C7143c, C13598b0> pVar) {
            C87412m.m108594g(cVar, "conversation");
            C87412m.m108594g(pVar, "callback");
            mo8337b(C26236u.m33719b(cVar), new C7146a(pVar));
        }

        /* renamed from: b */
        public final void mo8337b(List<C7143c> list, C32227p<? super Boolean, ? super List<C7143c>, C13598b0> pVar) {
            C87412m.m108594g(list, "conversations");
            C87412m.m108594g(pVar, "callback");
            if (list.isEmpty()) {
                pVar.invoke(Boolean.TRUE, C64186f0.f181907d);
                return;
            }
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            for (C7143c cVar : list) {
                List list2 = (List) hashMap.get(cVar.field_talker);
                if (list2 != null) {
                    list2.add(cVar);
                } else {
                    String str = cVar.field_talker;
                    C87412m.m108593f(str, "it.field_talker");
                    hashMap.put(str, C64197v.m75539h(cVar));
                }
                hashSet.add(cVar.field_talker);
                hashSet.add(cVar.field_selfUserName);
            }
            ((C15913g) C86312j.m106911c(C15913g.class)).C40(C110818d0.m150953y0(hashSet), new C7147b(pVar, list, hashMap));
        }
    }
}
