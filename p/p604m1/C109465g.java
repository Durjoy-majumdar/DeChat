package p604m1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p190l1.C109090e;
import p190l1.C109111s;
import sx3.C64186f0;

/* renamed from: m1.g */
public final class C109465g {
    /* renamed from: a */
    public static final void m148683a(C109464f fVar, C109111s sVar) {
        C87412m.m108594g(fVar, "<this>");
        C87412m.m108594g(sVar, "event");
        List list = sVar.f326726j;
        if (list == null) {
            list = C64186f0.f181907d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C109090e eVar = (C109090e) list.get(i);
            long j = eVar.f326656a;
            long j2 = eVar.f326657b;
            int i2 = (fVar.f327635b + 1) % 20;
            fVar.f327635b = i2;
            fVar.f327634a[i2] = new C109461b(j2, j, (C8480h) null);
        }
        long j3 = sVar.f326718b;
        long j4 = sVar.f326719c;
        int i3 = (fVar.f327635b + 1) % 20;
        fVar.f327635b = i3;
        fVar.f327634a[i3] = new C109461b(j4, j3, (C8480h) null);
    }

    /* renamed from: b */
    public static final C34458c m148684b(List<Float> list, List<Float> list2, int i) {
        float f;
        float f2;
        List<Float> list3 = list;
        List<Float> list4 = list2;
        int i2 = i;
        C87412m.m108594g(list3, "x");
        C87412m.m108594g(list4, "y");
        if (i2 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!list.isEmpty()) {
            int size = i2 >= list.size() ? list.size() - 1 : i2;
            int i3 = i2 + 1;
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (true) {
                f = 0.0f;
                if (i4 >= i3) {
                    break;
                }
                arrayList.add(Float.valueOf(0.0f));
                i4++;
            }
            int size2 = list.size();
            int i5 = size + 1;
            C109460a aVar = new C109460a(i5, size2);
            int i6 = 0;
            while (true) {
                f2 = 1.0f;
                if (i6 >= size2) {
                    break;
                }
                aVar.mo160693b(0, i6, 1.0f);
                for (int i7 = 1; i7 < i5; i7++) {
                    aVar.mo160693b(i7, i6, aVar.mo160692a(i7 - 1, i6) * list3.get(i6).floatValue());
                }
                i6++;
            }
            C109460a aVar2 = new C109460a(i5, size2);
            C109460a aVar3 = new C109460a(i5, i5);
            int i8 = 0;
            while (i8 < i5) {
                for (int i9 = 0; i9 < size2; i9++) {
                    aVar2.mo160693b(i8, i9, aVar.mo160692a(i8, i9));
                }
                for (int i15 = 0; i15 < i8; i15++) {
                    C109462d[] dVarArr = aVar2.f327624a;
                    float a = dVarArr[i8].mo160697a(dVarArr[i15]);
                    for (int i16 = 0; i16 < size2; i16++) {
                        aVar2.mo160693b(i8, i16, aVar2.mo160692a(i8, i16) - (aVar2.mo160692a(i15, i16) * a));
                    }
                }
                C109462d dVar = aVar2.f327624a[i8];
                float sqrt = (float) Math.sqrt((double) dVar.mo160697a(dVar));
                if (((double) sqrt) >= 1.0E-6d) {
                    float f3 = 1.0f / sqrt;
                    for (int i17 = 0; i17 < size2; i17++) {
                        aVar2.mo160693b(i8, i17, aVar2.mo160692a(i8, i17) * f3);
                    }
                    int i18 = 0;
                    while (i18 < i5) {
                        aVar3.mo160693b(i8, i18, i18 < i8 ? 0.0f : aVar2.f327624a[i8].mo160697a(aVar.f327624a[i18]));
                        i18++;
                    }
                    i8++;
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            C109462d dVar2 = new C109462d(size2);
            for (int i19 = 0; i19 < size2; i19++) {
                dVar2.f327628b[i19] = Float.valueOf(list4.get(i19).floatValue() * 1.0f);
            }
            int i25 = i5 - 1;
            for (int i26 = i25; -1 < i26; i26--) {
                arrayList.set(i26, Float.valueOf(aVar2.f327624a[i26].mo160697a(dVar2)));
                int i27 = i26 + 1;
                if (i27 <= i25) {
                    int i28 = i25;
                    while (true) {
                        arrayList.set(i26, Float.valueOf(((Number) arrayList.get(i26)).floatValue() - (aVar3.mo160692a(i26, i28) * ((Number) arrayList.get(i28)).floatValue())));
                        if (i28 == i27) {
                            break;
                        }
                        i28--;
                    }
                }
                arrayList.set(i26, Float.valueOf(((Number) arrayList.get(i26)).floatValue() / aVar3.mo160692a(i26, i26)));
            }
            float f4 = 0.0f;
            for (int i29 = 0; i29 < size2; i29++) {
                f4 += list4.get(i29).floatValue();
            }
            float f5 = f4 / ((float) size2);
            float f6 = 0.0f;
            for (int i35 = 0; i35 < size2; i35++) {
                float floatValue = list4.get(i35).floatValue() - ((Number) arrayList.get(0)).floatValue();
                float f7 = 1.0f;
                for (int i36 = 1; i36 < i5; i36++) {
                    f7 *= list3.get(i35).floatValue();
                    floatValue -= ((Number) arrayList.get(i36)).floatValue() * f7;
                }
                f6 += floatValue * 1.0f * floatValue;
                float floatValue2 = list4.get(i35).floatValue() - f5;
                f += floatValue2 * 1.0f * floatValue2;
            }
            if (f > 1.0E-6f) {
                f2 = 1.0f - (f6 / f);
            }
            return new C34458c(arrayList, f2);
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }
}
