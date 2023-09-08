package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.r0 */
public class C23932r0 extends C24018s0 {

    /* renamed from: e */
    public final C23845j1 f68561e;

    /* renamed from: com.google.protobuf.r0$b */
    public static class C23934b<K> implements Map.Entry<K, Object> {

        /* renamed from: d */
        public Map.Entry<K, C23932r0> f68562d;

        public C23934b(Map.Entry entry, C23933a aVar) {
            this.f68562d = entry;
        }

        public K getKey() {
            return this.f68562d.getKey();
        }

        public Object getValue() {
            C23932r0 value = this.f68562d.getValue();
            if (value == null) {
                return null;
            }
            return value.mo38016c();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C23845j1) {
                C23932r0 value = this.f68562d.getValue();
                C23845j1 j1Var = value.f69052c;
                value.f69050a = null;
                value.f69053d = null;
                value.f69052c = (C23845j1) obj;
                return j1Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.protobuf.r0$c */
    public static class C23935c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: d */
        public Iterator<Map.Entry<K, Object>> f68563d;

        public C23935c(Iterator<Map.Entry<K, Object>> it) {
            this.f68563d = it;
        }

        public boolean hasNext() {
            return this.f68563d.hasNext();
        }

        public Object next() {
            Map.Entry next = this.f68563d.next();
            return next.getValue() instanceof C23932r0 ? new C23934b(next, (C23933a) null) : next;
        }

        public void remove() {
            this.f68563d.remove();
        }
    }

    public C23932r0(C23845j1 j1Var, C23806a0 a0Var, C16994k kVar) {
        super(a0Var, kVar);
        this.f68561e = j1Var;
    }

    /* renamed from: c */
    public C23845j1 mo38016c() {
        return mo38289a(this.f68561e);
    }

    public boolean equals(Object obj) {
        return mo38016c().equals(obj);
    }

    public int hashCode() {
        return mo38016c().hashCode();
    }

    public String toString() {
        return mo38016c().toString();
    }
}
