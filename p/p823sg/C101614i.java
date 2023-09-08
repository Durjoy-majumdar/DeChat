package p823sg;

import com.tencent.p014mm.sdk.platformtools.LruCache;
import p823sg.C101611g;

/* renamed from: sg.i */
public class C101614i<K, O> extends LruCache<K, O> implements C101611g<K, O> {

    /* renamed from: a */
    public C101611g.C101612b<K, O> f297461a;

    /* renamed from: b */
    public C101611g.C101613c<K, O> f297462b;

    public C101614i(int i) {
        super(i);
        this.f297461a = null;
        this.f297462b = null;
    }

    /* renamed from: a */
    public void mo122812a(C101611g.C48378a<K, O> aVar) {
        clear();
    }

    /* renamed from: b */
    public O mo139556b(K k) {
        return get(k);
    }

    /* renamed from: c */
    public void mo139557c(K k, O o) {
        if (o != null && k != null) {
            put(k, o);
        }
    }

    public void clear() {
        super.trimToSize(-1);
    }

    public O create(K k) {
        return super.create(k);
    }

    public void entryRemoved(boolean z, K k, O o, O o2) {
        super.entryRemoved(z, k, o, o2);
        C101611g.C101612b<K, O> bVar = this.f297461a;
        if (bVar != null) {
            bVar.preRemoveCallback(k, o, o2);
        }
    }

    public int sizeOf(K k, O o) {
        C101611g.C101613c<K, O> cVar = this.f297462b;
        return cVar != null ? cVar.mo139576a(k, o) : super.sizeOf(k, o);
    }

    public void trimToSize(int i) {
        super.trimToSize(i);
    }

    public C101614i(int i, C101611g.C101612b<K, O> bVar) {
        super(i);
        this.f297462b = null;
        this.f297461a = bVar;
    }

    public C101614i(int i, C101611g.C101612b<K, O> bVar, C101611g.C101613c<K, O> cVar) {
        super(i);
        this.f297461a = bVar;
        this.f297462b = cVar;
    }
}
