package ob0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;

public class b0$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f256833d;

    /* renamed from: e */
    public final /* synthetic */ int f256834e;

    /* renamed from: f */
    public final /* synthetic */ int f256835f;

    /* renamed from: g */
    public final /* synthetic */ String f256836g;

    /* renamed from: h */
    public final /* synthetic */ C89137b0 f256837h;

    /* renamed from: ob0.b0$$g$a */
    public class C89138a implements C38172g<C35142u> {
        public C89138a() {
        }

        public boolean invoke(C15510f fVar) {
            C35142u uVar = (C35142u) fVar;
            if (uVar != null) {
                b0$$g b0__g = b0$$g.this;
                uVar.onSceneEnd(b0__g.f256834e, b0__g.f256835f, b0__g.f256836g, b0__g.f256833d);
            } else {
                Log.m105921e("MicroMsg.NetSceneQueue", "%s returns null, skip notifying.", uVar);
            }
            return false;
        }
    }

    /* renamed from: ob0.b0$$g$b */
    public class C89139b implements C38172g<C35142u> {
        public C89139b() {
        }

        public boolean invoke(C15510f fVar) {
            C35142u uVar = (C35142u) fVar;
            if (uVar != null) {
                b0$$g b0__g = b0$$g.this;
                uVar.onSceneEnd(b0__g.f256834e, b0__g.f256835f, b0__g.f256836g, b0__g.f256833d);
            } else {
                Log.m105921e("MicroMsg.NetSceneQueue", "%s returns null, skip notifying.", uVar);
            }
            return false;
        }
    }

    public b0$$g(C89137b0 b0Var, C117747y yVar, int i, int i2, String str) {
        this.f256837h = b0Var;
        this.f256833d = yVar;
        this.f256834e = i;
        this.f256835f = i2;
        this.f256836g = str;
    }

    public void run() {
        Class<C35142u> cls = C35142u.class;
        C38166b.m41756c(cls, Integer.valueOf(this.f256833d.getType()), new C89138a());
        C38166b.m41756c(cls, -1, new C89139b());
        Set set = (Set) ((HashMap) this.f256837h.f256813h).get(Integer.valueOf(this.f256833d.getType()));
        if (set != null && set.size() > 0) {
            HashSet hashSet = new HashSet();
            synchronized (set) {
                hashSet.addAll(set);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C11385n nVar = (C11385n) it.next();
                if (nVar != null && set.contains(nVar)) {
                    nVar.onSceneEnd(this.f256834e, this.f256835f, this.f256836g, this.f256833d);
                }
            }
        }
        Set set2 = (Set) ((HashMap) this.f256837h.f256813h).get(-1);
        if (set2 != null && set2.size() > 0) {
            HashSet hashSet2 = new HashSet();
            synchronized (set2) {
                hashSet2.addAll(set2);
            }
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                C11385n nVar2 = (C11385n) it4.next();
                if (nVar2 != null && set2.contains(nVar2)) {
                    nVar2.onSceneEnd(this.f256834e, this.f256835f, this.f256836g, this.f256833d);
                }
            }
        }
    }
}
