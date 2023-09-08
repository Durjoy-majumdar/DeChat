package p926a2;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;

/* renamed from: a2.c */
public final class C79460c<K, V> {

    /* renamed from: a */
    public int[] f233002a;

    /* renamed from: b */
    public Object[] f233003b;

    /* renamed from: c */
    public int f233004c;

    public C79460c() {
        this(0, 1, (C8480h) null);
    }

    public C79460c(int i, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? 0 : i;
        if (i == 0) {
            this.f233002a = C79459a.f233000a;
            this.f233003b = C79459a.f233001b;
        } else {
            this.f233002a = new int[i];
            this.f233003b = new Object[(i << 1)];
        }
        this.f233004c = 0;
    }

    /* renamed from: a */
    public final int mo109450a(Object obj, int i) {
        C87412m.m108594g(obj, "key");
        int i2 = this.f233004c;
        if (i2 == 0) {
            return -1;
        }
        int a = C79459a.m96416a(this.f233002a, i2, i);
        if (a < 0 || C87412m.m108589b(obj, this.f233003b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f233002a[i3] == i) {
            if (C87412m.m108589b(obj, this.f233003b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f233002a[i4] == i) {
            if (C87412m.m108589b(obj, this.f233003b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: b */
    public final int mo109451b() {
        int i = this.f233004c;
        if (i == 0) {
            return -1;
        }
        int a = C79459a.m96416a(this.f233002a, i, 0);
        if (a < 0 || this.f233003b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f233002a[i2] == 0) {
            if (this.f233003b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f233002a[i3] == 0) {
            if (this.f233003b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C79460c) {
                C79460c cVar = (C79460c) obj;
                int i = this.f233004c;
                if (i != cVar.f233004c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = this.f233003b;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    int b = obj2 == null ? cVar.mo109451b() : cVar.mo109450a(obj2, obj2.hashCode());
                    Object obj4 = b >= 0 ? cVar.f233003b[(b << 1) + 1] : null;
                    if (obj3 == null) {
                        if (obj4 == null) {
                            if (!((obj2 == null ? cVar.mo109451b() : cVar.mo109450a(obj2, obj2.hashCode())) >= 0)) {
                            }
                        }
                        return false;
                    } else if (!C87412m.m108589b(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f233004c != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.f233004c;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object[] objArr2 = this.f233003b;
                    int i6 = i5 << 1;
                    Object obj5 = objArr2[i6];
                    Object obj6 = objArr2[i6 + 1];
                    Object obj7 = ((Map) obj).get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !((Map) obj).containsKey(obj5)) {
                            return false;
                        }
                    } else if (!C87412m.m108589b(obj6, obj7)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f233002a;
        Object[] objArr = this.f233003b;
        int i = this.f233004c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        int i = this.f233004c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f233004c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = i3 << 1;
            Object obj = this.f233003b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f233003b[i4 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "buffer.toString()");
        return sb4;
    }
}
