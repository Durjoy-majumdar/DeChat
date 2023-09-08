package uo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: uo0.j */
public final class C78250j {

    /* renamed from: a */
    public final C78248f f229219a;

    /* renamed from: b */
    public List<C78250j> f229220b;

    /* renamed from: c */
    public final String f229221c;

    /* renamed from: uo0.j$a */
    public static final class C78251a extends C78249i {
        public C78251a() {
            super(2, 0, 0, (String) null);
        }
    }

    /* renamed from: uo0.j$b */
    public interface C78252b {
        /* renamed from: a */
        void mo94303a(C78250j jVar);
    }

    public C78250j(C78248f fVar, String str) {
        this.f229219a = fVar;
        this.f229221c = str;
    }

    /* renamed from: c */
    public static C78250j m94537c(List<C78248f> list, String str) {
        C78250j jVar;
        C78250j jVar2 = new C78250j(new C78251a(), "");
        jVar2.mo108264a(new C78250j(list.get(0), ""));
        HashMap hashMap = new HashMap();
        for (int i = 1; i < list.size() - 1; i++) {
            C78248f fVar = list.get(i);
            int e = fVar.mo108260e();
            if (e <= 0) {
                int f = fVar.mo108261f();
                C78250j jVar3 = new C78250j(fVar, "");
                jVar2.mo108264a(jVar3);
                hashMap.put(Integer.valueOf(f), jVar3);
            } else {
                C78250j jVar4 = (C78250j) hashMap.get(Integer.valueOf(e));
                if (jVar4 != null && (Util.isNullOrNil(fVar.mo108262g()) || Util.isNullOrNil(str) || str.equals(fVar.mo108262g()))) {
                    if (!m94538d(jVar4.f229219a)) {
                        Log.m105920e("StepNode", "addChild but not a node group");
                        jVar = null;
                    } else {
                        if (jVar4.f229220b == null) {
                            jVar4.f229220b = new ArrayList();
                        }
                        C78250j jVar5 = new C78250j(fVar, !Util.isNullOrNil(jVar4.f229221c) ? String.format("%s%s%d", new Object[]{jVar4.f229221c, jVar4.f229219a.getType() == 3 ? "-" : ".", Integer.valueOf(((ArrayList) jVar4.f229220b).size() + 1)}) : String.format("%d", new Object[]{Integer.valueOf(((ArrayList) jVar4.f229220b).size() + 1)}));
                        ((ArrayList) jVar4.f229220b).add(jVar5);
                        jVar = jVar5;
                    }
                    if (m94538d(fVar)) {
                        hashMap.put(Integer.valueOf(fVar.mo108261f()), jVar);
                    }
                }
            }
        }
        jVar2.mo108264a(new C78250j(list.get(list.size() - 1), ""));
        return jVar2;
    }

    /* renamed from: d */
    public static boolean m94538d(C78248f fVar) {
        return fVar.getType() == 3 || fVar.getType() == 2;
    }

    /* renamed from: e */
    public static void m94539e(C78250j jVar, C78252b bVar) {
        if (jVar != null && bVar != null) {
            bVar.mo94303a(jVar);
            List<C78250j> list = jVar.f229220b;
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    m94539e(list.get(i), bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo108264a(C78250j jVar) {
        if (!m94538d(this.f229219a)) {
            Log.m105920e("StepNode", "addChild but not a node group");
            return;
        }
        if (this.f229220b == null) {
            this.f229220b = new ArrayList();
        }
        this.f229220b.add(jVar);
    }

    /* renamed from: b */
    public C90709a mo108265b() {
        C78248f fVar = this.f229219a;
        if (fVar instanceof C90709a) {
            return (C90709a) fVar;
        }
        return null;
    }
}
