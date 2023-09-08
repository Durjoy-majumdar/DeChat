package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ov4 extends C49335eu3 {

    /* renamed from: d */
    public int f299075d;

    /* renamed from: e */
    public int f299076e;

    /* renamed from: f */
    public LinkedList<vt4> f299077f = new LinkedList<>();

    /* renamed from: g */
    public int f299078g;

    /* renamed from: h */
    public LinkedList<vt4> f299079h = new LinkedList<>();

    /* renamed from: i */
    public long f299080i;

    /* renamed from: j */
    public int f299081j;

    /* renamed from: n */
    public int f299082n;

    /* renamed from: o */
    public LinkedList<vt4> f299083o = new LinkedList<>();

    /* renamed from: p */
    public int f299084p;

    /* renamed from: q */
    public int f299085q;

    /* renamed from: r */
    public iv4 f299086r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ov4)) {
            return false;
        }
        ov4 ov4 = (ov4) aVar;
        return C46238a.m51546a(this.BaseResponse, ov4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f299075d), Integer.valueOf(ov4.f299075d)) && C46238a.m51546a(Integer.valueOf(this.f299076e), Integer.valueOf(ov4.f299076e)) && C46238a.m51546a(this.f299077f, ov4.f299077f) && C46238a.m51546a(Integer.valueOf(this.f299078g), Integer.valueOf(ov4.f299078g)) && C46238a.m51546a(this.f299079h, ov4.f299079h) && C46238a.m51546a(Long.valueOf(this.f299080i), Long.valueOf(ov4.f299080i)) && C46238a.m51546a(Integer.valueOf(this.f299081j), Integer.valueOf(ov4.f299081j)) && C46238a.m51546a(Integer.valueOf(this.f299082n), Integer.valueOf(ov4.f299082n)) && C46238a.m51546a(this.f299083o, ov4.f299083o) && C46238a.m51546a(Integer.valueOf(this.f299084p), Integer.valueOf(ov4.f299084p)) && C46238a.m51546a(Integer.valueOf(this.f299085q), Integer.valueOf(ov4.f299085q)) && C46238a.m51546a(this.f299086r, ov4.f299086r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f299075d);
                aVar.mo74318e(3, this.f299076e);
                aVar.mo74320g(4, 8, this.f299077f);
                aVar.mo74318e(5, this.f299078g);
                aVar.mo74320g(6, 8, this.f299079h);
                aVar.mo74321h(7, this.f299080i);
                aVar.mo74318e(8, this.f299081j);
                aVar.mo74318e(9, this.f299082n);
                aVar.mo74320g(10, 8, this.f299083o);
                aVar.mo74318e(11, this.f299084p);
                aVar.mo74318e(12, this.f299085q);
                iv4 iv4 = this.f299086r;
                if (iv4 != null) {
                    aVar.mo74322i(13, iv4.computeSize());
                    this.f299086r.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f299075d) + C52418a.m58678e(3, this.f299076e) + C52418a.m58680g(4, 8, this.f299077f) + C52418a.m58678e(5, this.f299078g) + C52418a.m58680g(6, 8, this.f299079h) + C52418a.m58681h(7, this.f299080i) + C52418a.m58678e(8, this.f299081j) + C52418a.m58678e(9, this.f299082n) + C52418a.m58680g(10, 8, this.f299083o) + C52418a.m58678e(11, this.f299084p) + C52418a.m58678e(12, this.f299085q);
            iv4 iv42 = this.f299086r;
            return iv42 != null ? e + C52418a.m58682i(13, iv42.computeSize()) : e;
        } else if (i2 == 2) {
            this.f299077f.clear();
            this.f299079h.clear();
            this.f299083o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ov4 ov4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ov4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ov4.f299075d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ov4.f299076e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        vt4 vt4 = new vt4();
                        if (bArr2 != null && bArr2.length > 0) {
                            vt4.parseFrom(bArr2);
                        }
                        ov4.f299077f.add(vt4);
                    }
                    return 0;
                case 5:
                    ov4.f299078g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        vt4 vt42 = new vt4();
                        if (bArr3 != null && bArr3.length > 0) {
                            vt42.parseFrom(bArr3);
                        }
                        ov4.f299079h.add(vt42);
                    }
                    return 0;
                case 7:
                    ov4.f299080i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    ov4.f299081j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ov4.f299082n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        vt4 vt43 = new vt4();
                        if (bArr4 != null && bArr4.length > 0) {
                            vt43.parseFrom(bArr4);
                        }
                        ov4.f299083o.add(vt43);
                    }
                    return 0;
                case 11:
                    ov4.f299084p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ov4.f299085q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        iv4 iv43 = new iv4();
                        if (bArr5 != null && bArr5.length > 0) {
                            iv43.parseFrom(bArr5);
                        }
                        ov4.f299086r = iv43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
