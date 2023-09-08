package xz3;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: xz3.m */
public class C23162m extends AbstractList<String> implements RandomAccess, C112188n {

    /* renamed from: e */
    public static final C112188n f66538e = new C112189w(new C23162m());

    /* renamed from: d */
    public final List<Object> f66539d;

    public C23162m() {
        this.f66539d = new ArrayList();
    }

    /* renamed from: B */
    public void mo36565B(C23156c cVar) {
        this.f66539d.add(cVar);
        this.modCount++;
    }

    /* renamed from: a */
    public C112188n mo36566a() {
        return new C112189w(this);
    }

    public void add(int i, Object obj) {
        this.f66539d.add(i, (String) obj);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public List<?> mo36570c() {
        return Collections.unmodifiableList(this.f66539d);
    }

    public void clear() {
        this.f66539d.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public C23156c mo36572e(int i) {
        C23156c cVar;
        Object obj = ((ArrayList) this.f66539d).get(i);
        if (obj instanceof C23156c) {
            cVar = (C23156c) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            C23156c cVar2 = C23156c.f66530d;
            try {
                cVar = new C23163o(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            C23156c cVar3 = C23156c.f66530d;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            cVar = new C23163o(bArr2);
        }
        if (cVar != obj) {
            ((ArrayList) this.f66539d).set(i, cVar);
        }
        return cVar;
    }

    public Object get(int i) {
        String str;
        Object obj = ((ArrayList) this.f66539d).get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C23156c) {
            C23156c cVar = (C23156c) obj;
            cVar.getClass();
            try {
                str = cVar.mo36554u("UTF-8");
                if (cVar.mo36547n()) {
                    ((ArrayList) this.f66539d).set(i, str);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = C23159i.f66537a;
            try {
                str = new String(bArr, "UTF-8");
                boolean z = false;
                if (C23179x.m27555b(bArr, 0, bArr.length) == 0) {
                    z = true;
                }
                if (z) {
                    ((ArrayList) this.f66539d).set(i, str);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
        return str;
    }

    public Object remove(int i) {
        Object remove = ((ArrayList) this.f66539d).remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof C23156c) {
            C23156c cVar = (C23156c) remove;
            cVar.getClass();
            try {
                return cVar.mo36554u("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) remove;
            byte[] bArr2 = C23159i.f66537a;
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
    }

    public Object set(int i, Object obj) {
        Object obj2 = ((ArrayList) this.f66539d).set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof C23156c) {
            C23156c cVar = (C23156c) obj2;
            cVar.getClass();
            try {
                return cVar.mo36554u("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj2;
            byte[] bArr2 = C23159i.f66537a;
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
    }

    public int size() {
        return this.f66539d.size();
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof C112188n) {
            collection = ((C112188n) collection).mo36570c();
        }
        boolean addAll = this.f66539d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public C23162m(C112188n nVar) {
        this.f66539d = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
