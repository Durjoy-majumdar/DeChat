package p571j6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: j6.b */
public class C87885b extends C87895h implements Iterable<C87895h> {

    /* renamed from: d */
    public final List<C87895h> f254394d = new ArrayList();

    /* renamed from: j6.b$a */
    public class C87886a implements Iterator<C87895h> {

        /* renamed from: d */
        public final /* synthetic */ Iterator f254395d;

        public C87886a(C87885b bVar, Iterator it) {
            this.f254395d = it;
        }

        public boolean hasNext() {
            return this.f254395d.hasNext();
        }

        public Object next() {
            return (C87895h) this.f254395d.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C87885b.class == obj.getClass()) {
            return this.f254394d.equals(((C87885b) obj).f254394d);
        }
        return false;
    }

    public int hashCode() {
        return this.f254394d.hashCode();
    }

    /* renamed from: i */
    public void mo122334i(C87896i iVar) {
        iVar.mo122364b();
        Iterator<C87895h> it = iterator();
        boolean z = true;
        while (true) {
            C87886a aVar = (C87886a) it;
            if (aVar.hasNext()) {
                if (!z) {
                    iVar.mo122365c();
                }
                ((C87895h) aVar.next()).mo122334i(iVar);
                z = false;
            } else {
                iVar.mo122363a();
                return;
            }
        }
    }

    public Iterator<C87895h> iterator() {
        return new C87886a(this, ((ArrayList) this.f254394d).iterator());
    }

    /* renamed from: k */
    public C87885b mo122336k(C87895h hVar) {
        if (hVar != null) {
            ((ArrayList) this.f254394d).add(hVar);
            return this;
        }
        throw new NullPointerException("value is null");
    }
}
