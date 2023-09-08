package com.tencent.mapsdk.internal;

import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.gd */
public final class C113748gd {

    /* renamed from: a */
    private ArrayList<C113747gc> f340327a = new ArrayList<>();

    /* renamed from: a */
    private C113747gc m156920a(int i) {
        return this.f340327a.get(i);
    }

    /* renamed from: b */
    private int m156922b() {
        return this.f340327a.size();
    }

    /* renamed from: a */
    public final void mo172123a(C113747gc gcVar) {
        this.f340327a.add(gcVar);
    }

    /* renamed from: a */
    private void m156921a(C113748gd gdVar) {
        this.f340327a.addAll(gdVar.f340327a);
    }

    /* renamed from: a */
    public final float[] mo172124a() {
        float[] fArr = new float[(this.f340327a.size() * 3)];
        for (int i = 0; i < this.f340327a.size(); i++) {
            int i2 = i * 3;
            fArr[i2 + 0] = this.f340327a.get(i).f340323a;
            fArr[i2 + 1] = this.f340327a.get(i).f340324b;
            fArr[i2 + 2] = this.f340327a.get(i).f340325c;
        }
        return fArr;
    }
}
