package p436a1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112545k;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: a1.f0 */
public final class C103233f0 extends C103261r0 {

    /* renamed from: d */
    public final List<C103272w> f304434d;

    /* renamed from: e */
    public final List<Float> f304435e;

    /* renamed from: f */
    public final long f304436f;

    /* renamed from: g */
    public final long f304437g;

    /* renamed from: h */
    public final int f304438h;

    public C103233f0(List list, List list2, long j, long j2, int i, C8480h hVar) {
        this.f304434d = list;
        this.f304435e = list2;
        this.f304436f = j;
        this.f304437g = j2;
        this.f304438h = i;
    }

    /* renamed from: b */
    public Shader mo142983b(long j) {
        int i;
        int[] iArr;
        float[] fArr;
        Shader.TileMode b;
        char c;
        float f;
        int i2;
        float d = (C112539e.m153738c(this.f304436f) > Float.POSITIVE_INFINITY ? 1 : (C112539e.m153738c(this.f304436f) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? C112545k.m153758d(j) : C112539e.m153738c(this.f304436f);
        float b2 = (C112539e.m153739d(this.f304436f) > Float.POSITIVE_INFINITY ? 1 : (C112539e.m153739d(this.f304436f) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? C112545k.m153756b(j) : C112539e.m153739d(this.f304436f);
        float d2 = (C112539e.m153738c(this.f304437g) > Float.POSITIVE_INFINITY ? 1 : (C112539e.m153738c(this.f304437g) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? C112545k.m153758d(j) : C112539e.m153738c(this.f304437g);
        float b3 = (C112539e.m153739d(this.f304437g) > Float.POSITIVE_INFINITY ? 1 : (C112539e.m153739d(this.f304437g) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? C112545k.m153756b(j) : C112539e.m153739d(this.f304437g);
        List<C103272w> list = this.f304434d;
        List<Float> list2 = this.f304435e;
        long a = C112540f.m153745a(d, b2);
        long a2 = C112540f.m153745a(d2, b3);
        int i3 = this.f304438h;
        C87412m.m108594g(list, "colors");
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int e = C64197v.m75536e(list);
            i = 0;
            for (int i4 = 1; i4 < e; i4++) {
                if (C103272w.m136782d(list.get(i4).f304517a) == 0.0f) {
                    i++;
                }
            }
        }
        float c2 = C112539e.m153738c(a);
        float d3 = C112539e.m153739d(a);
        float c3 = C112539e.m153738c(a2);
        float d4 = C112539e.m153739d(a2);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr2 = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr2[i5] = C103276y.m136796g(list.get(i5).f304517a);
            }
            iArr = iArr2;
        } else {
            int[] iArr3 = new int[(list.size() + i)];
            int e2 = C64197v.m75536e(list);
            int size2 = list.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                long j2 = list.get(i7).f304517a;
                if (!(C103272w.m136782d(j2) == 0.0f)) {
                    iArr3[i6] = C103276y.m136796g(j2);
                    i2 = i6 + 1;
                } else if (i7 == 0) {
                    i2 = i6 + 1;
                    iArr3[i6] = C103276y.m136796g(C103272w.m136780b(list.get(1).f304517a, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else if (i7 == e2) {
                    i2 = i6 + 1;
                    iArr3[i6] = C103276y.m136796g(C103272w.m136780b(list.get(i7 - 1).f304517a, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else {
                    int i8 = i6 + 1;
                    iArr3[i6] = C103276y.m136796g(C103272w.m136780b(list.get(i7 - 1).f304517a, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                    iArr3[i8] = C103276y.m136796g(C103272w.m136780b(list.get(i7 + 1).f304517a, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                    i6 = i8 + 1;
                }
                i6 = i2;
            }
            iArr = iArr3;
        }
        if (i == 0) {
            fArr = list2 != null ? C110818d0.m150950v0(list2) : null;
        } else {
            float[] fArr2 = new float[(list.size() + i)];
            if (list2 != null) {
                c = 0;
                f = list2.get(0).floatValue();
            } else {
                c = 0;
                f = 0.0f;
            }
            fArr2[c] = f;
            int e3 = C64197v.m75536e(list);
            int i9 = 1;
            for (int i15 = 1; i15 < e3; i15++) {
                long j3 = list.get(i15).f304517a;
                float floatValue = list2 != null ? list2.get(i15).floatValue() : ((float) i15) / ((float) C64197v.m75536e(list));
                int i16 = i9 + 1;
                fArr2[i9] = floatValue;
                if (C103272w.m136782d(j3) == 0.0f) {
                    i9 = i16 + 1;
                    fArr2[i16] = floatValue;
                } else {
                    i9 = i16;
                }
            }
            fArr2[i9] = list2 != null ? list2.get(C64197v.m75536e(list)).floatValue() : 1.0f;
            fArr = fArr2;
        }
        if (i3 == 0) {
            b = Shader.TileMode.CLAMP;
        } else {
            boolean z = true;
            if (i3 == 1) {
                b = Shader.TileMode.REPEAT;
            } else {
                if (i3 == 2) {
                    b = Shader.TileMode.MIRROR;
                } else {
                    if (i3 != 3) {
                        z = false;
                    }
                    b = z ? Build.VERSION.SDK_INT >= 31 ? C103280z0.f304524a.mo143063b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
                }
            }
        }
        return new LinearGradient(c2, d3, c3, d4, iArr, fArr, b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103233f0)) {
            return false;
        }
        C103233f0 f0Var = (C103233f0) obj;
        if (!C87412m.m108589b(this.f304434d, f0Var.f304434d) || !C87412m.m108589b(this.f304435e, f0Var.f304435e) || !C112539e.m153736a(this.f304436f, f0Var.f304436f) || !C112539e.m153736a(this.f304437g, f0Var.f304437g)) {
            return false;
        }
        return this.f304438h == f0Var.f304438h;
    }

    public int hashCode() {
        int hashCode = this.f304434d.hashCode() * 31;
        List<Float> list = this.f304435e;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + C112539e.m153740e(this.f304436f)) * 31) + C112539e.m153740e(this.f304437g)) * 31) + this.f304438h;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = "";
        if (C112540f.m153746b(this.f304436f)) {
            str = "start=" + C112539e.m153744i(this.f304436f) + ", ";
        } else {
            str = str3;
        }
        if (C112540f.m153746b(this.f304437g)) {
            str3 = "end=" + C112539e.m153744i(this.f304437g) + ", ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LinearGradient(colors=");
        sb.append(this.f304434d);
        sb.append(", stops=");
        sb.append(this.f304435e);
        sb.append(", ");
        sb.append(str);
        sb.append(str3);
        sb.append("tileMode=");
        int i = this.f304438h;
        boolean z = false;
        if (i == 0) {
            str2 = "Clamp";
        } else {
            if (i == 1) {
                str2 = "Repeated";
            } else {
                if (i == 2) {
                    str2 = "Mirror";
                } else {
                    if (i == 3) {
                        z = true;
                    }
                    str2 = z ? "Decal" : "Unknown";
                }
            }
        }
        sb.append(str2);
        sb.append(')');
        return sb.toString();
    }
}
