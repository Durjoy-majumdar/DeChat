package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t40 */
public class C51342t40 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51492u40> f141942d = new LinkedList<>();

    /* renamed from: e */
    public String f141943e;

    /* renamed from: f */
    public String f141944f;

    /* renamed from: g */
    public String f141945g;

    /* renamed from: h */
    public String f141946h;

    /* renamed from: i */
    public int f141947i;

    /* renamed from: j */
    public int f141948j;

    /* renamed from: n */
    public C51781w40 f141949n;

    /* renamed from: o */
    public C51643v40 f141950o;

    /* renamed from: p */
    public C51975xh2 f141951p;

    /* renamed from: q */
    public C51921x40 f141952q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51342t40)) {
            return false;
        }
        C51342t40 t402 = (C51342t40) aVar;
        return C46238a.m51546a(this.f141942d, t402.f141942d) && C46238a.m51546a(this.f141943e, t402.f141943e) && C46238a.m51546a(this.f141944f, t402.f141944f) && C46238a.m51546a(this.f141945g, t402.f141945g) && C46238a.m51546a(this.f141946h, t402.f141946h) && C46238a.m51546a(Integer.valueOf(this.f141947i), Integer.valueOf(t402.f141947i)) && C46238a.m51546a(Integer.valueOf(this.f141948j), Integer.valueOf(t402.f141948j)) && C46238a.m51546a(this.f141949n, t402.f141949n) && C46238a.m51546a(this.f141950o, t402.f141950o) && C46238a.m51546a(this.f141951p, t402.f141951p) && C46238a.m51546a(this.f141952q, t402.f141952q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f141942d);
            String str = this.f141943e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141944f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141945g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f141946h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f141947i);
            aVar.mo74318e(7, this.f141948j);
            C51781w40 w402 = this.f141949n;
            if (w402 != null) {
                aVar.mo74322i(8, w402.computeSize());
                this.f141949n.writeFields(aVar);
            }
            C51643v40 v402 = this.f141950o;
            if (v402 != null) {
                aVar.mo74322i(9, v402.computeSize());
                this.f141950o.writeFields(aVar);
            }
            C51975xh2 xh22 = this.f141951p;
            if (xh22 != null) {
                aVar.mo74322i(10, xh22.computeSize());
                this.f141951p.writeFields(aVar);
            }
            C51921x40 x402 = this.f141952q;
            if (x402 != null) {
                aVar.mo74322i(11, x402.computeSize());
                this.f141952q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f141942d) + 0;
            String str5 = this.f141943e;
            if (str5 != null) {
                g += C52418a.m58683j(2, str5);
            }
            String str6 = this.f141944f;
            if (str6 != null) {
                g += C52418a.m58683j(3, str6);
            }
            String str7 = this.f141945g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f141946h;
            if (str8 != null) {
                g += C52418a.m58683j(5, str8);
            }
            int e = g + C52418a.m58678e(6, this.f141947i) + C52418a.m58678e(7, this.f141948j);
            C51781w40 w403 = this.f141949n;
            if (w403 != null) {
                e += C52418a.m58682i(8, w403.computeSize());
            }
            C51643v40 v403 = this.f141950o;
            if (v403 != null) {
                e += C52418a.m58682i(9, v403.computeSize());
            }
            C51975xh2 xh23 = this.f141951p;
            if (xh23 != null) {
                e += C52418a.m58682i(10, xh23.computeSize());
            }
            C51921x40 x403 = this.f141952q;
            return x403 != null ? e + C52418a.m58682i(11, x403.computeSize()) : e;
        } else if (i == 2) {
            this.f141942d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51342t40 t402 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51492u40 u402 = new C51492u40();
                        if (bArr != null && bArr.length > 0) {
                            u402.parseFrom(bArr);
                        }
                        t402.f141942d.add(u402);
                    }
                    return 0;
                case 2:
                    t402.f141943e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t402.f141944f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t402.f141945g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t402.f141946h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t402.f141947i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    t402.f141948j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51781w40 w404 = new C51781w40();
                        if (bArr2 != null && bArr2.length > 0) {
                            w404.parseFrom(bArr2);
                        }
                        t402.f141949n = w404;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C51643v40 v404 = new C51643v40();
                        if (bArr3 != null && bArr3.length > 0) {
                            v404.parseFrom(bArr3);
                        }
                        t402.f141950o = v404;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51975xh2 xh24 = new C51975xh2();
                        if (bArr4 != null && bArr4.length > 0) {
                            xh24.parseFrom(bArr4);
                        }
                        t402.f141951p = xh24;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C51921x40 x404 = new C51921x40();
                        if (bArr5 != null && bArr5.length > 0) {
                            x404.parseFrom(bArr5);
                        }
                        t402.f141952q = x404;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
