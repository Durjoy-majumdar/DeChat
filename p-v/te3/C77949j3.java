package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j3 */
public class C77949j3 extends C47465a {

    /* renamed from: d */
    public int f227627d;

    /* renamed from: e */
    public C51163rv3 f227628e;

    /* renamed from: f */
    public C51163rv3 f227629f;

    /* renamed from: g */
    public int f227630g;

    /* renamed from: h */
    public C51163rv3 f227631h;

    /* renamed from: i */
    public int f227632i;

    /* renamed from: j */
    public int f227633j;

    /* renamed from: n */
    public C51018qv3 f227634n;

    /* renamed from: o */
    public int f227635o;

    /* renamed from: p */
    public String f227636p;

    /* renamed from: q */
    public String f227637q;

    /* renamed from: r */
    public long f227638r;

    /* renamed from: s */
    public int f227639s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77949j3)) {
            return false;
        }
        C77949j3 j3Var = (C77949j3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227627d), Integer.valueOf(j3Var.f227627d)) && C46238a.m51546a(this.f227628e, j3Var.f227628e) && C46238a.m51546a(this.f227629f, j3Var.f227629f) && C46238a.m51546a(Integer.valueOf(this.f227630g), Integer.valueOf(j3Var.f227630g)) && C46238a.m51546a(this.f227631h, j3Var.f227631h) && C46238a.m51546a(Integer.valueOf(this.f227632i), Integer.valueOf(j3Var.f227632i)) && C46238a.m51546a(Integer.valueOf(this.f227633j), Integer.valueOf(j3Var.f227633j)) && C46238a.m51546a(this.f227634n, j3Var.f227634n) && C46238a.m51546a(Integer.valueOf(this.f227635o), Integer.valueOf(j3Var.f227635o)) && C46238a.m51546a(this.f227636p, j3Var.f227636p) && C46238a.m51546a(this.f227637q, j3Var.f227637q) && C46238a.m51546a(Long.valueOf(this.f227638r), Long.valueOf(j3Var.f227638r)) && C46238a.m51546a(Integer.valueOf(this.f227639s), Integer.valueOf(j3Var.f227639s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f227628e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f227629f == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f227631h != null) {
                aVar.mo74318e(1, this.f227627d);
                C51163rv3 rv32 = this.f227628e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f227628e.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f227629f;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f227629f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f227630g);
                C51163rv3 rv34 = this.f227631h;
                if (rv34 != null) {
                    aVar.mo74322i(5, rv34.computeSize());
                    this.f227631h.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f227632i);
                aVar.mo74318e(7, this.f227633j);
                C51018qv3 qv32 = this.f227634n;
                if (qv32 != null) {
                    aVar.mo74322i(8, qv32.computeSize());
                    this.f227634n.writeFields(aVar);
                }
                aVar.mo74318e(9, this.f227635o);
                String str = this.f227636p;
                if (str != null) {
                    aVar.mo74323j(10, str);
                }
                String str2 = this.f227637q;
                if (str2 != null) {
                    aVar.mo74323j(11, str2);
                }
                aVar.mo74321h(12, this.f227638r);
                aVar.mo74318e(13, this.f227639s);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f227627d) + 0;
            C51163rv3 rv35 = this.f227628e;
            if (rv35 != null) {
                e += C52418a.m58682i(2, rv35.computeSize());
            }
            C51163rv3 rv36 = this.f227629f;
            if (rv36 != null) {
                e += C52418a.m58682i(3, rv36.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f227630g);
            C51163rv3 rv37 = this.f227631h;
            if (rv37 != null) {
                e2 += C52418a.m58682i(5, rv37.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(6, this.f227632i) + C52418a.m58678e(7, this.f227633j);
            C51018qv3 qv33 = this.f227634n;
            if (qv33 != null) {
                e3 += C52418a.m58682i(8, qv33.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(9, this.f227635o);
            String str3 = this.f227636p;
            if (str3 != null) {
                e4 += C52418a.m58683j(10, str3);
            }
            String str4 = this.f227637q;
            if (str4 != null) {
                e4 += C52418a.m58683j(11, str4);
            }
            return e4 + C52418a.m58681h(12, this.f227638r) + C52418a.m58678e(13, this.f227639s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f227628e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f227629f == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f227631h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77949j3 j3Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j3Var.f227627d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51163rv3 rv38 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv38.mo73356d(bArr);
                        }
                        j3Var.f227628e = rv38;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv39 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv39.mo73356d(bArr2);
                        }
                        j3Var.f227629f = rv39;
                    }
                    return 0;
                case 4:
                    j3Var.f227630g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv310.mo73356d(bArr3);
                        }
                        j3Var.f227631h = rv310;
                    }
                    return 0;
                case 6:
                    j3Var.f227632i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    j3Var.f227633j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv34.mo73348f(bArr4);
                        }
                        j3Var.f227634n = qv34;
                    }
                    return 0;
                case 9:
                    j3Var.f227635o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    j3Var.f227636p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    j3Var.f227637q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    j3Var.f227638r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    j3Var.f227639s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
