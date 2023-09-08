package p1042u;

import java.util.Map;

/* renamed from: u.a */
public class C111054a extends C118556h<Object, Object> {

    /* renamed from: d */
    public final /* synthetic */ C111055b f332568d;

    public C111054a(C111055b bVar) {
        this.f332568d = bVar;
    }

    /* renamed from: a */
    public void mo124722a() {
        this.f332568d.clear();
    }

    /* renamed from: b */
    public Object mo124723b(int i, int i2) {
        return this.f332568d.f332582e[(i << 1) + i2];
    }

    /* renamed from: c */
    public Map<Object, Object> mo124724c() {
        return this.f332568d;
    }

    /* renamed from: d */
    public int mo124725d() {
        return this.f332568d.f332583f;
    }

    /* renamed from: e */
    public int mo124726e(Object obj) {
        return this.f332568d.mo162782f(obj);
    }

    /* renamed from: f */
    public int mo124727f(Object obj) {
        return this.f332568d.mo162787i(obj);
    }

    /* renamed from: g */
    public void mo124728g(Object obj, Object obj2) {
        this.f332568d.put(obj, obj2);
    }

    /* renamed from: h */
    public void mo124729h(int i) {
        this.f332568d.mo162790k(i);
    }

    /* renamed from: i */
    public Object mo124730i(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f332568d.f332582e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
