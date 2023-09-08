package iu3;

import ju3.C117365a;

/* renamed from: iu3.b */
public abstract class C117272b extends C117365a {

    /* renamed from: b */
    public final int f351128b;

    /* renamed from: c */
    public final int f351129c;

    public C117272b(int i, int i2) {
        this.f351128b = i;
        this.f351129c = i2;
    }

    /* renamed from: a */
    public synchronized boolean mo181963a(C117277g gVar) {
        boolean z;
        int i = gVar.f351131b.f351134c.get();
        int i2 = this.f351128b;
        Object obj = gVar.f351131b.f351132a.get("LIMIT");
        if (obj != null) {
            i2 = ((Integer) obj).intValue();
        }
        z = i2 > i;
        if (!z && i2 >= this.f351128b) {
            gVar.f351131b.f351132a.put("LIMIT", Integer.valueOf(this.f351129c));
        }
        return z;
    }

    /* renamed from: c */
    public synchronized void mo181962c(C117277g gVar) {
        super.mo181962c(gVar);
        int i = 0;
        Object obj = gVar.f351131b.f351132a.get("LIMIT");
        if (obj != null) {
            i = ((Integer) obj).intValue();
        }
        if (i <= this.f351129c) {
            gVar.f351131b.f351132a.put("LIMIT", Integer.valueOf(this.f351128b));
        }
    }
}
