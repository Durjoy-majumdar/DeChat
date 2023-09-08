package p595ll;

import com.tencent.p014mm.autogen.events.RefreshSmileyPanelEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30769q2;
import com.tencent.p014mm.storage.C30790w2;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C89132b;
import p490dl.C45410f;
import rx3.C13598b0;
import sf0.C48374j0;
import te3.C101824o80;
import te3.C49103d62;
import te3.C51018qv3;
import u60.C65220d;
import u60.C65234n;
import wh3.C38128a;
import wh3.C38129b;

/* renamed from: ll.c */
public final class C34294c extends C65220d {

    /* renamed from: f */
    public final int f92423f;

    /* renamed from: g */
    public final String f92424g = "MicroMsg.EmojiDesignerTask";

    /* renamed from: h */
    public final C34295a f92425h;

    /* renamed from: ll.c$a */
    public static final class C34295a {

        /* renamed from: a */
        public final int f92426a;

        /* renamed from: b */
        public final C32226l<Boolean, C13598b0> f92427b;

        /* renamed from: c */
        public byte[] f92428c;

        /* renamed from: d */
        public final LinkedList<String> f92429d = new LinkedList<>();

        /* renamed from: e */
        public final C30769q2 f92430e;

        /* renamed from: ll.c$a$a */
        public static final class C34296a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C34295a f92431a;

            public C34296a(C34295a aVar) {
                this.f92431a = aVar;
            }

            public Object call(Object obj) {
                LinkedList<C101824o80> linkedList;
                LinkedList<C101824o80> linkedList2;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                int i = cVar.f256793a;
                int i2 = cVar.f256794b;
                this.f92431a.getClass();
                Log.m105924i("MicroMsg.EmojiDesignerTask", "getNext: " + i + ", " + i2);
                C49103d62 d622 = (C49103d62) cVar.f256796d;
                C51018qv3 qv32 = null;
                if (i == 0 && i2 == 0) {
                    if (!(d622 == null || (linkedList2 = d622.f132149i) == null)) {
                        C34295a aVar = this.f92431a;
                        for (C101824o80 o802 : linkedList2) {
                            aVar.f92429d.add(o802.f298994d);
                        }
                    }
                    C34295a.m40316a(this.f92431a);
                    return C13598b0.f38549a;
                } else if (i == 4 && i2 == 2) {
                    if (!(d622 == null || (linkedList = d622.f132149i) == null)) {
                        C34295a aVar2 = this.f92431a;
                        for (C101824o80 o803 : linkedList) {
                            aVar2.f92429d.add(o803.f298994d);
                        }
                    }
                    C34295a aVar3 = this.f92431a;
                    if (d622 != null) {
                        qv32 = d622.f132150j;
                    }
                    aVar3.f92428c = C48374j0.m53715d(qv32);
                    C34295a aVar4 = this.f92431a;
                    if (aVar4.f92428c == null) {
                        C34295a.m40316a(aVar4);
                    } else {
                        aVar4.mo59552b();
                    }
                    return C13598b0.f38549a;
                } else {
                    C32226l<Boolean, C13598b0> lVar = this.f92431a.f92427b;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(Boolean.FALSE);
                    return C13598b0.f38549a;
                }
            }
        }

        public C34295a(int i, C32226l<? super Boolean, C13598b0> lVar) {
            this.f92426a = i;
            this.f92427b = lVar;
            this.f92430e = C30769q2.C30770a.f82743a.mo57693a(i);
        }

        /* renamed from: a */
        public static final void m40316a(C34295a aVar) {
            C38129b bVar;
            T t;
            aVar.getClass();
            C30769q2 q2Var = new C30769q2();
            int nowSecond = (int) Util.nowSecond();
            q2Var.f82741b = aVar.f92426a;
            Log.m105924i("MicroMsg.EmojiDesignerTask", "finish: " + aVar.f92426a + ", " + aVar.f92429d.size() + ", oldSize " + aVar.f92430e.f82742c.size());
            boolean z = false;
            for (String str : aVar.f92429d) {
                C38128a aVar2 = new C38128a();
                aVar2.field_designerUin = aVar.f92426a;
                aVar2.field_productId = str;
                aVar2.field_syncTime = 0;
                if (!aVar.f92430e.f82742c.isEmpty()) {
                    Iterator<T> it = aVar.f92430e.f82742c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C87412m.m108589b(((C38128a) t).field_productId, str)) {
                            break;
                        }
                    }
                    C38128a aVar3 = (C38128a) t;
                    if (aVar3 == null) {
                        aVar2.field_syncTime = nowSecond;
                    } else {
                        aVar2.field_syncTime = aVar3.field_syncTime;
                        q2Var.f82742c.add(aVar2);
                    }
                }
                z = true;
                q2Var.f82742c.add(aVar2);
            }
            if (z) {
                C30790w2 h = C30790w2.m39221h();
                synchronized (h.f82769a) {
                    bVar = h.f82784p;
                }
                bVar.mo61528jo(q2Var);
                C30769q2.C30770a aVar4 = C30769q2.C30770a.f82743a;
                C30769q2.C30770a.f82744b.put(Integer.valueOf(aVar.f92426a), q2Var);
                new RefreshSmileyPanelEvent().publish();
            }
            C32226l<Boolean, C13598b0> lVar = aVar.f92427b;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }

        /* renamed from: b */
        public final void mo59552b() {
            new C45410f(this.f92426a, this.f92428c).mo9225i().mo123420E(new C34296a(this));
        }
    }

    /* renamed from: ll.c$b */
    public static final class C34297b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C34294c f92432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34297b(C34294c cVar) {
            super(1);
            this.f92432d = cVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f92432d.mo11853b(C65234n.OK);
            } else {
                this.f92432d.mo11853b(C65234n.Fail);
            }
            return C13598b0.f38549a;
        }
    }

    public C34294c(int i) {
        this.f92423f = i;
        this.f92425h = new C34295a(i, new C34297b(this));
    }

    /* renamed from: a */
    public void mo11852a() {
        String str = this.f92424g;
        Log.m105924i(str, "call: " + this.f92423f);
        this.f92425h.mo59552b();
    }

    /* renamed from: d */
    public String mo11854d() {
        return String.valueOf(this.f92423f);
    }
}
