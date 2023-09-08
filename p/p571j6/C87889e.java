package p571j6;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: j6.e */
public class C87889e extends C87895h implements Iterable<C87892c> {

    /* renamed from: d */
    public final List<String> f254398d = new ArrayList();

    /* renamed from: e */
    public final List<C87895h> f254399e = new ArrayList();

    /* renamed from: f */
    public transient C87891b f254400f = new C87891b();

    /* renamed from: j6.e$a */
    public class C87890a implements Iterator<C87892c> {

        /* renamed from: d */
        public final /* synthetic */ Iterator f254401d;

        /* renamed from: e */
        public final /* synthetic */ Iterator f254402e;

        public C87890a(C87889e eVar, Iterator it, Iterator it4) {
            this.f254401d = it;
            this.f254402e = it4;
        }

        public boolean hasNext() {
            return this.f254401d.hasNext();
        }

        public Object next() {
            return new C87892c((String) this.f254401d.next(), (C87895h) this.f254402e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j6.e$b */
    public static class C87891b {

        /* renamed from: a */
        public final byte[] f254403a = new byte[32];
    }

    /* renamed from: j6.e$c */
    public static class C87892c {

        /* renamed from: a */
        public final String f254404a;

        /* renamed from: b */
        public final C87895h f254405b;

        public C87892c(String str, C87895h hVar) {
            this.f254404a = str;
            this.f254405b = hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C87892c.class != obj.getClass()) {
                return false;
            }
            C87892c cVar = (C87892c) obj;
            return this.f254404a.equals(cVar.f254404a) && this.f254405b.equals(cVar.f254405b);
        }

        public int hashCode() {
            return ((this.f254404a.hashCode() + 31) * 31) + this.f254405b.hashCode();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C87889e.class != obj.getClass()) {
            return false;
        }
        C87889e eVar = (C87889e) obj;
        return this.f254398d.equals(eVar.f254398d) && this.f254399e.equals(eVar.f254399e);
    }

    /* renamed from: f */
    public C87889e mo122341f() {
        return this;
    }

    public int hashCode() {
        return ((this.f254398d.hashCode() + 31) * 31) + this.f254399e.hashCode();
    }

    /* renamed from: i */
    public void mo122334i(C87896i iVar) {
        iVar.mo122369g();
        Iterator it = ((ArrayList) this.f254398d).iterator();
        Iterator it4 = ((ArrayList) this.f254399e).iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                iVar.mo122370h();
            }
            iVar.f254425a.write(34);
            iVar.mo122366d((String) it.next());
            iVar.f254425a.write(34);
            iVar.mo122367e();
            ((C87895h) it4.next()).mo122334i(iVar);
            z = false;
        }
        iVar.mo122368f();
    }

    public Iterator<C87892c> iterator() {
        return new C87890a(this, ((ArrayList) this.f254398d).iterator(), ((ArrayList) this.f254399e).iterator());
    }

    /* renamed from: k */
    public C87889e mo122343k(String str, C87895h hVar) {
        if (str == null) {
            throw new NullPointerException("name is null");
        } else if (hVar != null) {
            C87891b bVar = this.f254400f;
            int size = ((ArrayList) this.f254398d).size();
            bVar.getClass();
            int hashCode = str.hashCode();
            byte[] bArr = bVar.f254403a;
            int length = hashCode & (bArr.length - 1);
            if (size < 255) {
                bArr[length] = (byte) (size + 1);
            } else {
                bArr[length] = 0;
            }
            ((ArrayList) this.f254398d).add(str);
            ((ArrayList) this.f254399e).add(hVar);
            return this;
        } else {
            throw new NullPointerException("value is null");
        }
    }

    /* renamed from: l */
    public C87895h mo122344l(String str) {
        if (str != null) {
            int m = mo122345m(str);
            if (m != -1) {
                return (C87895h) ((ArrayList) this.f254399e).get(m);
            }
            return null;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: m */
    public int mo122345m(String str) {
        C87891b bVar = this.f254400f;
        bVar.getClass();
        int hashCode = str.hashCode();
        byte[] bArr = bVar.f254403a;
        int i = (bArr[hashCode & (bArr.length - 1)] & ExifInterface.MARKER) - 1;
        return (i == -1 || !str.equals(((ArrayList) this.f254398d).get(i))) ? ((ArrayList) this.f254398d).lastIndexOf(str) : i;
    }
}
