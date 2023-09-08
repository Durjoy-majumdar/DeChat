package pu3;

import androidx.exifinterface.media.ExifInterface;
import ru3.C26116a;

/* renamed from: pu3.n */
public final class C25492n {

    /* renamed from: a */
    public final C26116a f72140a;

    /* renamed from: b */
    public int f72141b;

    /* renamed from: c */
    public int f72142c;

    /* renamed from: d */
    public int f72143d;

    public C25492n(C26116a aVar, int i) {
        this.f72140a = aVar;
        this.f72141b = i;
    }

    /* renamed from: a */
    public final void mo52750a(int i) {
        if (mo52751b() != i) {
            throw new IllegalStateException(String.format("Expected %x but was %x", new Object[]{Integer.valueOf(i), Integer.valueOf(mo52751b())}));
        }
    }

    /* renamed from: b */
    public int mo52751b() {
        if (this.f72141b == -1) {
            byte readByte = this.f72140a.readByte() & ExifInterface.MARKER;
            this.f72141b = readByte & 31;
            this.f72143d = (readByte & 224) >> 5;
        }
        return this.f72141b;
    }

    /* renamed from: c */
    public int mo52752c() {
        mo52750a(28);
        this.f72141b = -1;
        return C25494p.m32917b(this.f72140a);
    }

    /* renamed from: d */
    public double mo52753d() {
        mo52750a(17);
        this.f72141b = -1;
        C26116a aVar = this.f72140a;
        long j = 0;
        for (int i = this.f72143d; i >= 0; i--) {
            j = (j >>> 8) | ((((long) aVar.readByte()) & 255) << 56);
        }
        return Double.longBitsToDouble(j);
    }

    /* renamed from: e */
    public long mo52754e() {
        mo52750a(6);
        this.f72141b = -1;
        C26116a aVar = this.f72140a;
        int i = this.f72143d;
        long j = 0;
        for (int i2 = i; i2 >= 0; i2--) {
            j = (j >>> 8) | ((((long) aVar.readByte()) & 255) << 56);
        }
        return j >> ((7 - i) * 8);
    }

    /* renamed from: f */
    public void mo52755f() {
        int b = mo52751b();
        int i = 0;
        if (b == 0) {
            mo52750a(0);
            this.f72141b = -1;
            C25491m.m32904a(this.f72140a, this.f72143d);
        } else if (b == 6) {
            mo52754e();
        } else if (b == 2) {
            mo52750a(2);
            this.f72141b = -1;
            C25491m.m32904a(this.f72140a, this.f72143d);
        } else if (b == 3) {
            mo52750a(3);
            this.f72141b = -1;
            C25491m.m32905b(this.f72140a, this.f72143d, false);
        } else if (b == 4) {
            mo52750a(4);
            this.f72141b = -1;
            C25491m.m32904a(this.f72140a, this.f72143d);
        } else if (b == 16) {
            mo52750a(16);
            this.f72141b = -1;
            Float.intBitsToFloat(C25491m.m32905b(this.f72140a, this.f72143d, true));
        } else if (b != 17) {
            switch (b) {
                case 23:
                    mo52750a(23);
                    this.f72141b = -1;
                    C25491m.m32905b(this.f72140a, this.f72143d, false);
                    return;
                case 24:
                    mo52750a(24);
                    this.f72141b = -1;
                    C25491m.m32905b(this.f72140a, this.f72143d, false);
                    return;
                case 25:
                    mo52750a(25);
                    this.f72141b = -1;
                    C25491m.m32905b(this.f72140a, this.f72143d, false);
                    return;
                case 26:
                    mo52750a(26);
                    this.f72141b = -1;
                    C25491m.m32905b(this.f72140a, this.f72143d, false);
                    return;
                case 27:
                    mo52750a(27);
                    this.f72141b = -1;
                    C25491m.m32905b(this.f72140a, this.f72143d, false);
                    return;
                case 28:
                    mo52750a(28);
                    this.f72141b = -1;
                    int b2 = C25494p.m32917b(this.f72140a);
                    while (i < b2) {
                        mo52755f();
                        i++;
                    }
                    return;
                case 29:
                    mo52750a(29);
                    this.f72141b = -1;
                    this.f72142c = C25494p.m32917b(this.f72140a);
                    int b3 = C25494p.m32917b(this.f72140a);
                    while (i < b3) {
                        C25494p.m32917b(this.f72140a);
                        mo52755f();
                        i++;
                    }
                    return;
                case 30:
                    mo52750a(30);
                    this.f72141b = -1;
                    return;
                case 31:
                    mo52750a(31);
                    this.f72141b = -1;
                    return;
                default:
                    throw new C25488j("Unexpected type: " + Integer.toHexString(this.f72141b));
            }
        } else {
            mo52753d();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C25492n(C25490l lVar, int i) {
        this((C26116a) new C25489k(lVar), i);
        lVar.getClass();
    }
}
