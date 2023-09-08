package qq0;

import android.graphics.drawable.Drawable;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import java.util.LinkedList;
import qq0.C89790a;
import qq0.C89816t;
import qq0.C89820w;

/* renamed from: qq0.b */
public class C89794b extends C89820w implements C89790a {

    /* renamed from: e */
    public final AppBrandRuntime f258176e;

    /* renamed from: f */
    public final C89816t.C89818b f258177f;

    /* renamed from: g */
    public Drawable f258178g;

    /* renamed from: h */
    public int f258179h;

    public C89794b(AppBrandRuntime appBrandRuntime, C89816t.C89818b bVar) {
        this.f258176e = appBrandRuntime;
        this.f258177f = bVar;
    }

    /* renamed from: b */
    public C89816t.C89818b mo124073b(C89790a.C89793b bVar, boolean z, String str) {
        int i = bVar.f258174d;
        int i2 = bVar.f258175e;
        C89820w.C89822b bVar2 = new C89820w.C89822b(z);
        LinkedList linkedList = new LinkedList();
        if (z) {
            this.f258222d.addFirst(bVar2);
        } else {
            while (this.f258222d.peekFirst() != null && this.f258222d.peekFirst().f258226f) {
                linkedList.addFirst(this.f258222d.pollFirst());
            }
            this.f258222d.addFirst(bVar2);
            while (linkedList.peekFirst() != null) {
                this.f258222d.addFirst((C89820w.C89822b) linkedList.pollFirst());
            }
        }
        bVar2.f258227g = str;
        C89820w.this.mo124077h(new C89827x(bVar2, i2));
        C89820w.this.mo124077h(new C89828y(bVar2, i));
        bVar2.mo124100d(bVar.ordinal());
        return bVar2;
    }

    /* renamed from: c */
    public int mo124074c() {
        return this.f258179h;
    }

    /* renamed from: e */
    public void mo124075e(String str) {
        LinkedList linkedList = new LinkedList();
        while (this.f258222d.peekFirst() != null) {
            if (this.f258222d.peekFirst().f258227g.equals(str)) {
                LinkedList<C89820w.C89822b> linkedList2 = this.f258222d;
                linkedList2.remove(linkedList2.peekFirst());
            } else {
                linkedList.addLast(this.f258222d.pollFirst());
            }
        }
        this.f258222d.addAll(linkedList);
    }

    /* renamed from: f */
    public C89816t.C89818b mo124076f(C89790a.C89793b bVar) {
        return mo124073b(bVar, false, "");
    }

    /* renamed from: h */
    public void mo124077h(Runnable runnable) {
        this.f258176e.mo113024P0(runnable);
    }

    /* renamed from: i */
    public final boolean mo124078i() {
        AppBrandRuntime appBrandRuntime = this.f258176e;
        return appBrandRuntime == null || appBrandRuntime.mo113064k0() || this.f258176e.f238117P || this.f258176e.f238159x == null;
    }
}
