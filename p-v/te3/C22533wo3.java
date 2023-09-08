package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wo3 */
public class C22533wo3 extends C47465a {

    /* renamed from: d */
    public C64708sd f64689d;

    /* renamed from: e */
    public C22491bj2 f64690e;

    /* renamed from: f */
    public String f64691f;

    /* renamed from: g */
    public String f64692g;

    /* renamed from: h */
    public String f64693h;

    /* renamed from: i */
    public String f64694i;

    /* renamed from: j */
    public int f64695j;

    /* renamed from: n */
    public C22539zo3 f64696n;

    /* renamed from: o */
    public int f64697o;

    /* renamed from: p */
    public String f64698p;

    /* renamed from: q */
    public C64627pd1 f64699q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22533wo3)) {
            return false;
        }
        C22533wo3 wo32 = (C22533wo3) aVar;
        return C46238a.m51546a(this.f64689d, wo32.f64689d) && C46238a.m51546a(this.f64690e, wo32.f64690e) && C46238a.m51546a(this.f64691f, wo32.f64691f) && C46238a.m51546a(this.f64692g, wo32.f64692g) && C46238a.m51546a(this.f64693h, wo32.f64693h) && C46238a.m51546a(this.f64694i, wo32.f64694i) && C46238a.m51546a(Integer.valueOf(this.f64695j), Integer.valueOf(wo32.f64695j)) && C46238a.m51546a(this.f64696n, wo32.f64696n) && C46238a.m51546a(Integer.valueOf(this.f64697o), Integer.valueOf(wo32.f64697o)) && C46238a.m51546a(this.f64698p, wo32.f64698p) && C46238a.m51546a(this.f64699q, wo32.f64699q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64708sd sdVar = this.f64689d;
            if (sdVar != null) {
                aVar.mo74322i(1, sdVar.computeSize());
                this.f64689d.writeFields(aVar);
            }
            C22491bj2 bj22 = this.f64690e;
            if (bj22 != null) {
                aVar.mo74322i(2, bj22.computeSize());
                this.f64690e.writeFields(aVar);
            }
            String str = this.f64691f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f64692g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f64693h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f64694i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f64695j);
            C22539zo3 zo32 = this.f64696n;
            if (zo32 != null) {
                aVar.mo74322i(8, zo32.computeSize());
                this.f64696n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f64697o);
            String str5 = this.f64698p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            C64627pd1 pd12 = this.f64699q;
            if (pd12 != null) {
                aVar.mo74322i(14, pd12.computeSize());
                this.f64699q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64708sd sdVar2 = this.f64689d;
            if (sdVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, sdVar2.computeSize());
            }
            C22491bj2 bj23 = this.f64690e;
            if (bj23 != null) {
                i2 += C52418a.m58682i(2, bj23.computeSize());
            }
            String str6 = this.f64691f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f64692g;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f64693h;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f64694i;
            if (str9 != null) {
                i2 += C52418a.m58683j(6, str9);
            }
            int e = i2 + C52418a.m58678e(7, this.f64695j);
            C22539zo3 zo33 = this.f64696n;
            if (zo33 != null) {
                e += C52418a.m58682i(8, zo33.computeSize());
            }
            int e2 = e + C52418a.m58678e(9, this.f64697o);
            String str10 = this.f64698p;
            if (str10 != null) {
                e2 += C52418a.m58683j(10, str10);
            }
            C64627pd1 pd13 = this.f64699q;
            return pd13 != null ? e2 + C52418a.m58682i(14, pd13.computeSize()) : e2;
        } else if (i == 2) {
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
            C22533wo3 wo32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 14) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            C64708sd sdVar3 = new C64708sd();
                            if (bArr != null && bArr.length > 0) {
                                sdVar3.parseFrom(bArr);
                            }
                            wo32.f64689d = sdVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C22491bj2 bj24 = new C22491bj2();
                            if (bArr2 != null && bArr2.length > 0) {
                                bj24.parseFrom(bArr2);
                            }
                            wo32.f64690e = bj24;
                        }
                        return 0;
                    case 3:
                        wo32.f64691f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        wo32.f64692g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        wo32.f64693h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        wo32.f64694i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        wo32.f64695j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            C22539zo3 zo34 = new C22539zo3();
                            if (bArr3 != null && bArr3.length > 0) {
                                zo34.parseFrom(bArr3);
                            }
                            wo32.f64696n = zo34;
                        }
                        return 0;
                    case 9:
                        wo32.f64697o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        wo32.f64698p = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C64627pd1 pd14 = new C64627pd1();
                    if (bArr4 != null && bArr4.length > 0) {
                        pd14.parseFrom(bArr4);
                    }
                    wo32.f64699q = pd14;
                }
                return 0;
            }
        }
    }
}
