package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.co0 */
public class C49030co0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50996qq1> f131861d = new LinkedList<>();

    /* renamed from: e */
    public C50347m31 f131862e;

    /* renamed from: f */
    public C89349b f131863f;

    /* renamed from: g */
    public int f131864g;

    /* renamed from: h */
    public int f131865h;

    /* renamed from: i */
    public int f131866i;

    /* renamed from: j */
    public String f131867j;

    /* renamed from: n */
    public C64756up2 f131868n;

    /* renamed from: o */
    public String f131869o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49030co0)) {
            return false;
        }
        C49030co0 co02 = (C49030co0) aVar;
        return C46238a.m51546a(this.BaseResponse, co02.BaseResponse) && C46238a.m51546a(this.f131861d, co02.f131861d) && C46238a.m51546a(this.f131862e, co02.f131862e) && C46238a.m51546a(this.f131863f, co02.f131863f) && C46238a.m51546a(Integer.valueOf(this.f131864g), Integer.valueOf(co02.f131864g)) && C46238a.m51546a(Integer.valueOf(this.f131865h), Integer.valueOf(co02.f131865h)) && C46238a.m51546a(Integer.valueOf(this.f131866i), Integer.valueOf(co02.f131866i)) && C46238a.m51546a(this.f131867j, co02.f131867j) && C46238a.m51546a(this.f131868n, co02.f131868n) && C46238a.m51546a(this.f131869o, co02.f131869o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f131861d);
            C50347m31 m312 = this.f131862e;
            if (m312 != null) {
                aVar.mo74322i(3, m312.computeSize());
                this.f131862e.writeFields(aVar);
            }
            C89349b bVar = this.f131863f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f131864g);
            aVar.mo74318e(6, this.f131865h);
            aVar.mo74318e(7, this.f131866i);
            String str = this.f131867j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            C64756up2 up22 = this.f131868n;
            if (up22 != null) {
                aVar.mo74322i(9, up22.computeSize());
                this.f131868n.writeFields(aVar);
            }
            String str2 = this.f131869o;
            if (str2 != null) {
                aVar.mo74323j(1000, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f131861d);
            C50347m31 m313 = this.f131862e;
            if (m313 != null) {
                g += C52418a.m58682i(3, m313.computeSize());
            }
            C89349b bVar2 = this.f131863f;
            if (bVar2 != null) {
                g += C52418a.m58675b(4, bVar2);
            }
            int e = g + C52418a.m58678e(5, this.f131864g) + C52418a.m58678e(6, this.f131865h) + C52418a.m58678e(7, this.f131866i);
            String str3 = this.f131867j;
            if (str3 != null) {
                e += C52418a.m58683j(8, str3);
            }
            C64756up2 up23 = this.f131868n;
            if (up23 != null) {
                e += C52418a.m58682i(9, up23.computeSize());
            }
            String str4 = this.f131869o;
            return str4 != null ? e + C52418a.m58683j(1000, str4) : e;
        } else if (i == 2) {
            this.f131861d.clear();
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
            C49030co0 co02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1000) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            C49966ja jaVar3 = new C49966ja();
                            if (bArr != null && bArr.length > 0) {
                                jaVar3.parseFrom(bArr);
                            }
                            co02.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C50996qq1 qq12 = new C50996qq1();
                            if (bArr2 != null && bArr2.length > 0) {
                                qq12.parseFrom(bArr2);
                            }
                            co02.f131861d.add(qq12);
                        }
                        return 0;
                    case 3:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            C50347m31 m314 = new C50347m31();
                            if (bArr3 != null && bArr3.length > 0) {
                                m314.parseFrom(bArr3);
                            }
                            co02.f131862e = m314;
                        }
                        return 0;
                    case 4:
                        co02.f131863f = aVar3.mo141626d(intValue);
                        return 0;
                    case 5:
                        co02.f131864g = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        co02.f131865h = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        co02.f131866i = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        co02.f131867j = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            byte[] bArr4 = j4.get(i6);
                            C64756up2 up24 = new C64756up2();
                            if (bArr4 != null && bArr4.length > 0) {
                                up24.parseFrom(bArr4);
                            }
                            co02.f131868n = up24;
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                co02.f131869o = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
