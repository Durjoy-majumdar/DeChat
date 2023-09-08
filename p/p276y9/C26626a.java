package p276y9;

import p1224z9.C119086a;
import p1224z9.C119087b;

/* renamed from: y9.a */
public class C26626a extends C26632h {

    /* renamed from: h */
    public final C23282o f74066h;

    /* renamed from: i */
    public final int f74067i;

    /* renamed from: j */
    public final long f74068j;

    public C26626a(long j, C26636m mVar, C23282o oVar, int i, long j2) {
        super(j, mVar);
        this.f74066h = oVar;
        this.f74067i = i;
        this.f74068j = j2;
    }

    /* renamed from: b */
    public C26628c mo53605b() {
        String str;
        C23282o oVar = this.f74066h;
        if (oVar == C23282o.OBJECT) {
            return super.mo53605b();
        }
        C26635k kVar = this.f74095f.f74087i;
        switch (oVar.ordinal()) {
            case 1:
                str = "boolean[]";
                break;
            case 2:
                str = "char[]";
                break;
            case 3:
                str = "float[]";
                break;
            case 4:
                str = "double[]";
                break;
            case 5:
                str = "byte[]";
                break;
            case 6:
                str = "short[]";
                break;
            case 7:
                str = "int[]";
                break;
            case 8:
                str = "long[]";
                break;
            default:
                throw new IllegalArgumentException("OBJECT type is not a primitive type");
        }
        return kVar.mo53636c(str);
    }

    /* renamed from: c */
    public final int mo53606c() {
        return this.f74067i * this.f74095f.f74087i.f74120e[this.f74066h.f66919d];
    }

    /* renamed from: g */
    public final byte[] mo53607g(int i, int i2) {
        ((C119087b) mo53630a()).f356638f = this.f74068j;
        int i3 = this.f74066h.f66920e * i2;
        byte[] bArr = new byte[i3];
        C119086a a = mo53630a();
        int i4 = this.f74066h.f66920e;
        int i5 = i2 * i4;
        C119087b bVar = (C119087b) a;
        bVar.f356638f += (long) (i * i4);
        int a2 = bVar.mo183755a();
        bVar.f356636d[a2].position(bVar.mo183756b());
        if (i3 <= bVar.f356636d[a2].remaining()) {
            bVar.f356636d[a2].get(bArr, 0, i3);
        } else {
            int position = bVar.f356634b - bVar.f356636d[a2].position();
            bVar.f356636d[a2].get(bArr, 0, position);
            int min = Math.min(i5 - position, i3 - position);
            int i6 = bVar.f356634b;
            int i7 = ((min + i6) - 1) / i6;
            for (int i8 = 0; i8 < i7; i8++) {
                int min2 = Math.min(min, bVar.f356634b);
                int i9 = a2 + 1 + i8;
                bVar.f356636d[i9].position(0);
                bVar.f356636d[i9].get(bArr, position, min2);
                position += min2;
                min -= min2;
            }
        }
        bVar.f356638f += (long) Math.min(i3, i5);
        return bArr;
    }

    /* renamed from: h */
    public Object[] mo53608h() {
        Object[] objArr = new Object[this.f74067i];
        ((C119087b) mo53630a()).f356638f = this.f74068j;
        for (int i = 0; i < this.f74067i; i++) {
            objArr[i] = mo53632f(this.f74066h);
        }
        return objArr;
    }

    public final String toString() {
        String str = mo53605b().f74070h;
        if (str.endsWith("[]")) {
            str = str.substring(0, str.length() - 2);
        }
        return String.format("%s[%d]@%d (0x%x)", new Object[]{str, Integer.valueOf(this.f74067i), Long.valueOf(this.f74093d & this.f74095f.f74087i.f74121f), Long.valueOf(this.f74093d & this.f74095f.f74087i.f74121f)});
    }
}
