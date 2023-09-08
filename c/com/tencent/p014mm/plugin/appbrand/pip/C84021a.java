package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87554b;
import hm0.C87556c;
import hm0.C87560g;
import hm0.C87562h;
import hm0.C87564i;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1066yc.C91402e;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.a */
public final class C84021a {

    /* renamed from: a */
    public final String f245291a;

    /* renamed from: b */
    public final C83780d1 f245292b;

    /* renamed from: c */
    public boolean f245293c;

    /* renamed from: d */
    public C87564i.C87565a f245294d = null;

    /* renamed from: e */
    public final boolean[] f245295e = new boolean[0];

    /* renamed from: f */
    public final LinkedList<String> f245296f = new LinkedList<>();

    /* renamed from: g */
    public final LinkedList<String> f245297g = new LinkedList<>();

    /* renamed from: h */
    public final LinkedList<String> f245298h = new LinkedList<>();

    /* renamed from: i */
    public final Map<String, C84024c> f245299i = new ConcurrentHashMap();

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.a$a */
    public class C84022a implements C82531i.C82535d {
        public C84022a() {
        }

        /* renamed from: c */
        public void mo22090c() {
            C84021a aVar = C84021a.this;
            Log.m105924i(aVar.f245291a, "markCurPageForeground");
            aVar.f245293c = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.a$b */
    public class C84023b implements C82531i.C82533b {
        public C84023b() {
        }

        /* renamed from: b */
        public void mo22089b() {
            C84021a aVar = C84021a.this;
            Log.m105924i(aVar.f245291a, "markCurPageBackground");
            aVar.f245293c = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.a$c */
    public static class C84024c {

        /* renamed from: a */
        public final int f245302a;

        /* renamed from: b */
        public C87554b.C87555a f245303b = C87554b.C87555a.NONE;

        /* renamed from: c */
        public boolean f245304c = false;

        /* renamed from: d */
        public final C87562h.C87563a f245305d;

        /* renamed from: e */
        public final C87556c f245306e;

        /* renamed from: f */
        public final C87560g f245307f;

        /* renamed from: g */
        public final C87564i f245308g;

        /* renamed from: h */
        public C84034d f245309h;

        public C84024c(int i, C87554b bVar, C87560g gVar, C87562h.C87563a aVar, C87556c cVar, C84034d dVar, C87564i.C87565a aVar2) {
            this.f245302a = i;
            this.f245307f = gVar;
            this.f245305d = aVar;
            this.f245306e = cVar;
            this.f245309h = dVar;
            C91402e eVar = (C91402e) bVar;
            C87554b.C87555a aVar3 = eVar.f262109a;
            if (aVar3 != null) {
                this.f245303b = aVar3;
            }
            Boolean bool = eVar.f262110b;
            if (bool != null) {
                this.f245304c = bool.booleanValue();
            }
            C87564i h = gVar.mo110195h();
            this.f245308g = h;
            h.mo110187d(aVar2);
        }
    }

    public C84021a(C83780d1 d1Var) {
        String str = "MicroMsg.AppBrand.AppBrandPageScopedPipInfo#" + hashCode();
        this.f245291a = str;
        this.f245292b = d1Var;
        this.f245293c = d1Var.f244563P;
        Log.m105924i(str, "mIsCurPageForeground: " + this.f245293c);
        d1Var.mo114868y(new C84022a());
        d1Var.mo114864j(new C84023b());
    }

    /* renamed from: a */
    public void mo116676a(C87564i.C87566b bVar, String str) {
        Log.m105925i(this.f245291a, "addPipRelatedKey, type: %s, key: %s", bVar, str);
        synchronized (this.f245295e) {
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                this.f245296f.remove(str);
                this.f245296f.addFirst(str);
            } else if (ordinal == 1) {
                this.f245297g.remove(str);
                this.f245297g.addFirst(str);
            } else if (ordinal == 2) {
                this.f245298h.remove(str);
                this.f245298h.addFirst(str);
            }
        }
    }

    /* renamed from: b */
    public String mo116677b() {
        synchronized (this.f245295e) {
            if (!this.f245297g.isEmpty()) {
                String first = this.f245297g.getFirst();
                return first;
            } else if (!this.f245298h.isEmpty()) {
                String first2 = this.f245298h.getFirst();
                return first2;
            } else if (this.f245296f.isEmpty()) {
                return null;
            } else {
                String first3 = this.f245296f.getFirst();
                return first3;
            }
        }
    }

    /* renamed from: c */
    public void mo116678c(C87564i.C87566b bVar, String str) {
        Log.m105925i(this.f245291a, "removePipRelatedKey, type: %s, key: %s", bVar, str);
        synchronized (this.f245295e) {
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                this.f245296f.remove(str);
            } else if (ordinal == 1) {
                this.f245297g.remove(str);
            } else if (ordinal == 2) {
                this.f245298h.remove(str);
            }
        }
    }
}
