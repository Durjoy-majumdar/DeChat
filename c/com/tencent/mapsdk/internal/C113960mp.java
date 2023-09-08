package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.JNI;
import com.tencent.mapsdk.internal.C113961mq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.mp */
public final class C113960mp {

    /* renamed from: a */
    public C113536be f340862a;

    /* renamed from: b */
    public C114216sq f340863b;

    /* renamed from: c */
    public HashMap<Integer, C114021ot> f340864c = new HashMap<>();

    /* renamed from: d */
    public HashMap<Integer, C114021ot> f340865d = new HashMap<>();

    public C113960mp(C113536be beVar, C114216sq sqVar) {
        this.f340862a = beVar;
        this.f340863b = sqVar;
    }

    /* renamed from: a */
    private void m157986a(C114021ot otVar) {
        int i = otVar.f341002f;
        if (i <= 0 || !this.f340864c.containsKey(Integer.valueOf(i))) {
            C114216sq sqVar = this.f340863b;
            int intValue = ((Integer) sqVar.mo172900a(new CallbackRunnable<Integer>(otVar) {
                /* renamed from: a */
                private Integer m159981a() {
                    if (0 == C114216sq.this.f342024e) {
                        return 0;
                    }
                    JNI c = C114216sq.this.f342023d;
                    long b = C114216sq.this.f342024e;
                    C114021ot otVar = r2;
                    String str = otVar.f341003g;
                    double d = otVar.f341005i;
                    double d2 = otVar.f341006j;
                    float f = otVar.f341009m;
                    float f2 = otVar.f341010n;
                    float f3 = otVar.f341017u;
                    float f4 = otVar.f341018v;
                    float f5 = otVar.f341016t;
                    float a = otVar.mo172582a();
                    C114021ot otVar2 = r2;
                    return Integer.valueOf(c.nativeAddMarker(b, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C));
                }

                public final /* synthetic */ Object run() {
                    if (0 == C114216sq.this.f342024e) {
                        return 0;
                    }
                    JNI c = C114216sq.this.f342023d;
                    long b = C114216sq.this.f342024e;
                    C114021ot otVar = r2;
                    String str = otVar.f341003g;
                    double d = otVar.f341005i;
                    double d2 = otVar.f341006j;
                    float f = otVar.f341009m;
                    float f2 = otVar.f341010n;
                    float f3 = otVar.f341017u;
                    float f4 = otVar.f341018v;
                    float f5 = otVar.f341016t;
                    float a = otVar.mo172582a();
                    C114021ot otVar2 = r2;
                    return Integer.valueOf(c.nativeAddMarker(b, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C));
                }
            }, 0)).intValue();
            otVar.f341002f = intValue;
            if (intValue > 0) {
                C104548ha.f309920b.mo147863a(otVar.f341003g, otVar.mo147886d());
                otVar.mo172588a(false);
                otVar.f341011o = false;
                this.f340865d.put(Integer.valueOf(otVar.f341002f), otVar);
                return;
            }
            return;
        }
        if (otVar.f341011o) {
            C114216sq sqVar2 = this.f340863b;
            if (0 != sqVar2.f342024e) {
                sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(otVar) {
                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            JNI c = C114216sq.this.f342023d;
                            long b = C114216sq.this.f342024e;
                            C114021ot otVar = r6;
                            int i = otVar.f341002f;
                            String str = otVar.f341003g;
                            double d = otVar.f341005i;
                            double d2 = otVar.f341006j;
                            float f = otVar.f341009m;
                            float f2 = otVar.f341010n;
                            float f3 = otVar.f341017u;
                            float f4 = otVar.f341018v;
                            float f5 = otVar.f341016t;
                            float a = otVar.mo172582a();
                            C114021ot otVar2 = r6;
                            c.nativeUpdateMarkerInfo(b, i, str, d, d2, f, f2, f3, f4, f5, a, otVar2.f341020x, otVar2.f341019w, otVar2.f341022z, otVar2.f340991A, otVar2.f340992B, otVar2.f340994D, otVar2.f340993C);
                        }
                    }
                });
            }
            if (otVar.f341021y) {
                C104548ha.f309920b.mo147863a(otVar.f341003g, otVar.mo147886d());
                otVar.mo172588a(false);
            }
        }
        otVar.f341011o = false;
        this.f340865d.put(Integer.valueOf(otVar.f341002f), otVar);
    }

    /* renamed from: b */
    private void m157987b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f340864c.entrySet()) {
            Object key = next.getKey();
            next.getValue();
            if (!this.f340865d.containsKey(key)) {
                arrayList.add(Integer.valueOf(((Integer) key).intValue()));
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
            }
            this.f340863b.mo172922a(iArr, size);
        }
    }

    /* renamed from: c */
    private void m157988c() {
        this.f340864c.clear();
        this.f340864c.putAll(this.f340865d);
        this.f340865d.clear();
    }

    /* renamed from: d */
    private C113536be m157989d() {
        return this.f340862a;
    }

    /* renamed from: e */
    private float m157990e() {
        return this.f340862a.mo171633a().f339663A.f342783b.f342820p;
    }

    /* renamed from: a */
    private static Bitmap m157985a(String str) {
        return C104548ha.f309920b.mo147862a(str);
    }

    /* renamed from: a */
    public final void mo172409a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f340864c.entrySet()) {
            Object key = next.getKey();
            next.getValue();
            if (!this.f340865d.containsKey(key)) {
                arrayList.add(Integer.valueOf(((Integer) key).intValue()));
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
            }
            this.f340863b.mo172922a(iArr, size);
        }
        this.f340864c.clear();
        this.f340864c.putAll(this.f340865d);
        this.f340865d.clear();
    }
}
