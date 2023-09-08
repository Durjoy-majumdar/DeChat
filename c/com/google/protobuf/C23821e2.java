package com.google.protobuf;

import com.google.protobuf.C23803a;
import com.google.protobuf.C23803a.C23804a;
import com.google.protobuf.C23896m1;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.protobuf.e2 */
public class C23821e2<MType extends C23803a, BType extends C23803a.C23804a, IType extends C23896m1> implements C23803a.C23805b {

    /* renamed from: a */
    public C23803a.C23805b f68224a;

    /* renamed from: b */
    public List<MType> f68225b;

    /* renamed from: c */
    public boolean f68226c;

    /* renamed from: d */
    public List<C23844i2<MType, BType, IType>> f68227d;

    /* renamed from: e */
    public boolean f68228e;

    /* renamed from: f */
    public C23823b<MType, BType, IType> f68229f;

    /* renamed from: g */
    public C23822a<MType, BType, IType> f68230g;

    /* renamed from: h */
    public C23824c<MType, BType, IType> f68231h;

    /* renamed from: com.google.protobuf.e2$a */
    public static class C23822a<MType extends C23803a, BType extends C23803a.C23804a, IType extends C23896m1> extends AbstractList<BType> {

        /* renamed from: d */
        public C23821e2<MType, BType, IType> f68232d;

        public C23822a(C23821e2<MType, BType, IType> e2Var) {
            this.f68232d = e2Var;
        }

        /* renamed from: f */
        public void mo37599f() {
            this.modCount++;
        }

        public Object get(int i) {
            return this.f68232d.mo37587k(i);
        }

        public int size() {
            return this.f68232d.mo37589m();
        }
    }

    /* renamed from: com.google.protobuf.e2$b */
    public static class C23823b<MType extends C23803a, BType extends C23803a.C23804a, IType extends C23896m1> extends AbstractList<MType> {

        /* renamed from: d */
        public C23821e2<MType, BType, IType> f68233d;

        public C23823b(C23821e2<MType, BType, IType> e2Var) {
            this.f68233d = e2Var;
        }

        /* renamed from: f */
        public void mo37602f() {
            this.modCount++;
        }

        public Object get(int i) {
            return this.f68233d.mo37590n(i, false);
        }

        public int size() {
            return this.f68233d.mo37589m();
        }
    }

    /* renamed from: com.google.protobuf.e2$c */
    public static class C23824c<MType extends C23803a, BType extends C23803a.C23804a, IType extends C23896m1> extends AbstractList<IType> {

        /* renamed from: d */
        public C23821e2<MType, BType, IType> f68234d;

        public C23824c(C23821e2<MType, BType, IType> e2Var) {
            this.f68234d = e2Var;
        }

        /* renamed from: f */
        public void mo37605f() {
            this.modCount++;
        }

        public Object get(int i) {
            return this.f68234d.mo37592p(i);
        }

        public int size() {
            return this.f68234d.mo37589m();
        }
    }

    public C23821e2(List<MType> list, boolean z, C23803a.C23805b bVar, boolean z2) {
        this.f68225b = list;
        this.f68226c = z;
        this.f68224a = bVar;
        this.f68228e = z2;
    }

    /* renamed from: a */
    public void mo37464a() {
        mo37596t();
    }

    /* renamed from: b */
    public C23821e2<MType, BType, IType> mo37578b(Iterable<? extends MType> iterable) {
        Iterator<? extends MType> it = iterable.iterator();
        while (it.hasNext()) {
            Charset charset = C23908o0.f68505a;
            ((C23803a) it.next()).getClass();
        }
        int i = -1;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            i = collection.size();
        }
        mo37586j();
        if (i >= 0) {
            List<MType> list = this.f68225b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + i);
            }
        }
        Iterator<? extends MType> it4 = iterable.iterator();
        while (it4.hasNext()) {
            mo37582f((C23803a) it4.next());
        }
        mo37596t();
        mo37594r();
        return this;
    }

    /* renamed from: c */
    public BType mo37579c(int i, MType mtype) {
        mo37586j();
        mo37585i();
        C23844i2 i2Var = new C23844i2(mtype, this, this.f68228e);
        this.f68225b.add(i, (Object) null);
        ((ArrayList) this.f68227d).add(i, i2Var);
        mo37596t();
        mo37594r();
        return i2Var.mo37705d();
    }

    /* renamed from: d */
    public BType mo37580d(MType mtype) {
        mo37586j();
        mo37585i();
        C23844i2 i2Var = new C23844i2(mtype, this, this.f68228e);
        this.f68225b.add((Object) null);
        ((ArrayList) this.f68227d).add(i2Var);
        mo37596t();
        mo37594r();
        return i2Var.mo37705d();
    }

    /* renamed from: e */
    public C23821e2<MType, BType, IType> mo37581e(int i, MType mtype) {
        Charset charset = C23908o0.f68505a;
        mtype.getClass();
        mo37586j();
        this.f68225b.add(i, mtype);
        List<C23844i2<MType, BType, IType>> list = this.f68227d;
        if (list != null) {
            ((ArrayList) list).add(i, (Object) null);
        }
        mo37596t();
        mo37594r();
        return this;
    }

    /* renamed from: f */
    public C23821e2<MType, BType, IType> mo37582f(MType mtype) {
        Charset charset = C23908o0.f68505a;
        mtype.getClass();
        mo37586j();
        this.f68225b.add(mtype);
        List<C23844i2<MType, BType, IType>> list = this.f68227d;
        if (list != null) {
            ((ArrayList) list).add((Object) null);
        }
        mo37596t();
        mo37594r();
        return this;
    }

    /* renamed from: g */
    public List<MType> mo37583g() {
        boolean z;
        this.f68228e = true;
        boolean z2 = this.f68226c;
        if (!z2 && this.f68227d == null) {
            return this.f68225b;
        }
        if (!z2) {
            int i = 0;
            while (true) {
                if (i >= this.f68225b.size()) {
                    z = true;
                    break;
                }
                C23836g1 g1Var = (C23836g1) this.f68225b.get(i);
                C23844i2 i2Var = this.f68227d.get(i);
                if (i2Var != null && i2Var.mo37703b() != g1Var) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return this.f68225b;
            }
        }
        mo37586j();
        for (int i2 = 0; i2 < this.f68225b.size(); i2++) {
            this.f68225b.set(i2, mo37590n(i2, true));
        }
        List<MType> unmodifiableList = Collections.unmodifiableList(this.f68225b);
        this.f68225b = unmodifiableList;
        this.f68226c = false;
        return unmodifiableList;
    }

    /* renamed from: h */
    public void mo37584h() {
        this.f68225b = Collections.emptyList();
        this.f68226c = false;
        List<C23844i2<MType, BType, IType>> list = this.f68227d;
        if (list != null) {
            for (C23844i2 next : list) {
                if (next != null) {
                    next.f68338a = null;
                }
            }
            this.f68227d = null;
        }
        mo37596t();
        mo37594r();
    }

    /* renamed from: i */
    public final void mo37585i() {
        if (this.f68227d == null) {
            this.f68227d = new ArrayList(this.f68225b.size());
            for (int i = 0; i < this.f68225b.size(); i++) {
                this.f68227d.add((Object) null);
            }
        }
    }

    /* renamed from: j */
    public final void mo37586j() {
        if (!this.f68226c) {
            this.f68225b = new ArrayList(this.f68225b);
            this.f68226c = true;
        }
    }

    /* renamed from: k */
    public BType mo37587k(int i) {
        mo37585i();
        C23844i2 i2Var = (C23844i2) ((ArrayList) this.f68227d).get(i);
        if (i2Var == null) {
            C23844i2 i2Var2 = new C23844i2((C23803a) this.f68225b.get(i), this, this.f68228e);
            ((ArrayList) this.f68227d).set(i, i2Var2);
            i2Var = i2Var2;
        }
        return i2Var.mo37705d();
    }

    /* renamed from: l */
    public List<BType> mo37588l() {
        if (this.f68230g == null) {
            this.f68230g = new C23822a<>(this);
        }
        return this.f68230g;
    }

    /* renamed from: m */
    public int mo37589m() {
        return this.f68225b.size();
    }

    /* renamed from: n */
    public final MType mo37590n(int i, boolean z) {
        List<C23844i2<MType, BType, IType>> list = this.f68227d;
        if (list == null) {
            return (C23803a) this.f68225b.get(i);
        }
        C23844i2 i2Var = list.get(i);
        return i2Var == null ? (C23803a) this.f68225b.get(i) : z ? i2Var.mo37703b() : i2Var.mo37706e();
    }

    /* renamed from: o */
    public List<MType> mo37591o() {
        if (this.f68229f == null) {
            this.f68229f = new C23823b<>(this);
        }
        return this.f68229f;
    }

    /* renamed from: p */
    public IType mo37592p(int i) {
        List<C23844i2<MType, BType, IType>> list = this.f68227d;
        if (list == null) {
            return (C23896m1) this.f68225b.get(i);
        }
        C23844i2 i2Var = list.get(i);
        return i2Var == null ? (C23896m1) this.f68225b.get(i) : i2Var.mo37707f();
    }

    /* renamed from: q */
    public List<IType> mo37593q() {
        if (this.f68231h == null) {
            this.f68231h = new C23824c<>(this);
        }
        return this.f68231h;
    }

    /* renamed from: r */
    public final void mo37594r() {
        C23823b<MType, BType, IType> bVar = this.f68229f;
        if (bVar != null) {
            bVar.mo37602f();
        }
        C23822a<MType, BType, IType> aVar = this.f68230g;
        if (aVar != null) {
            aVar.mo37599f();
        }
        C23824c<MType, BType, IType> cVar = this.f68231h;
        if (cVar != null) {
            cVar.mo37605f();
        }
    }

    /* renamed from: s */
    public boolean mo37595s() {
        return this.f68225b.isEmpty();
    }

    /* renamed from: t */
    public final void mo37596t() {
        C23803a.C23805b bVar;
        if (this.f68228e && (bVar = this.f68224a) != null) {
            bVar.mo37464a();
            this.f68228e = false;
        }
    }

    /* renamed from: u */
    public void mo37597u(int i) {
        C23844i2 remove;
        mo37586j();
        this.f68225b.remove(i);
        List<C23844i2<MType, BType, IType>> list = this.f68227d;
        if (!(list == null || (remove = list.remove(i)) == null)) {
            remove.f68338a = null;
        }
        mo37596t();
        mo37594r();
    }

    /* renamed from: v */
    public C23821e2<MType, BType, IType> mo37598v(int i, MType mtype) {
        C23844i2 i2Var;
        Charset charset = C23908o0.f68505a;
        mtype.getClass();
        mo37586j();
        this.f68225b.set(i, mtype);
        List<C23844i2<MType, BType, IType>> list = this.f68227d;
        if (!(list == null || (i2Var = (C23844i2) ((ArrayList) list).set(i, (Object) null)) == null)) {
            i2Var.f68338a = null;
        }
        mo37596t();
        mo37594r();
        return this;
    }
}
