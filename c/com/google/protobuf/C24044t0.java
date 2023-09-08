package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.t0 */
public class C24044t0 extends C23817d<String> implements C24048u0, RandomAccess {

    /* renamed from: f */
    public static final C24048u0 f69157f;

    /* renamed from: e */
    public final List<Object> f69158e;

    static {
        C24044t0 t0Var = new C24044t0();
        t0Var.f68221d = false;
        f69157f = t0Var;
    }

    public C24044t0() {
        this(10);
    }

    /* renamed from: E0 */
    public C23908o0.C23919j mo37467E0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f69158e);
            return new C24044t0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C24048u0 mo38349a() {
        return this.f68221d ? new C104491w2(this) : this;
    }

    public void add(int i, Object obj) {
        mo37528f();
        this.f69158e.add(i, (String) obj);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public List<?> mo38351c() {
        return Collections.unmodifiableList(this.f69158e);
    }

    public void clear() {
        mo37528f();
        this.f69158e.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public C16994k mo38352e(int i) {
        C16994k kVar;
        Object obj = this.f69158e.get(i);
        if (obj instanceof C16994k) {
            kVar = (C16994k) obj;
        } else if (obj instanceof String) {
            kVar = C16994k.m16791k((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            C16994k kVar2 = C16994k.f46000e;
            kVar = C16994k.m16790i(bArr, 0, bArr.length);
        }
        if (kVar != obj) {
            this.f69158e.set(i, kVar);
        }
        return kVar;
    }

    /* renamed from: g */
    public void mo38353g(C16994k kVar) {
        mo37528f();
        this.f69158e.add(kVar);
        this.modCount++;
    }

    public Object get(int i) {
        String str;
        Object obj = this.f69158e.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C16994k) {
            C16994k kVar = (C16994k) obj;
            str = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.f69158e.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C23908o0.f68505a);
            boolean z = false;
            if (C24079y2.f69220a.mo38435e(0, bArr, 0, bArr.length) == 0) {
                z = true;
            }
            if (z) {
                this.f69158e.set(i, str);
            }
        }
        return str;
    }

    public Object getRaw(int i) {
        return this.f69158e.get(i);
    }

    public Object remove(int i) {
        mo37528f();
        Object remove = this.f69158e.remove(i);
        this.modCount++;
        return remove instanceof String ? (String) remove : remove instanceof C16994k ? ((C16994k) remove).mo18752u() : new String((byte[]) remove, C23908o0.f68505a);
    }

    public Object set(int i, Object obj) {
        mo37528f();
        Object obj2 = this.f69158e.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof C16994k ? ((C16994k) obj2).mo18752u() : new String((byte[]) obj2, C23908o0.f68505a);
    }

    public int size() {
        return this.f69158e.size();
    }

    public C24044t0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo37528f();
        if (collection instanceof C24048u0) {
            collection = ((C24048u0) collection).mo38351c();
        }
        boolean addAll = this.f69158e.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public C24044t0(C24048u0 u0Var) {
        this.f69158e = new ArrayList(u0Var.size());
        addAll(u0Var);
    }

    public C24044t0(ArrayList<Object> arrayList) {
        this.f69158e = arrayList;
    }
}
