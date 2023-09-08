package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tr */
public class C64737tr extends C49335eu3 {

    /* renamed from: d */
    public int f185663d;

    /* renamed from: e */
    public String f185664e;

    /* renamed from: f */
    public C49995ji2 f185665f;

    /* renamed from: g */
    public String f185666g;

    /* renamed from: h */
    public String f185667h;

    /* renamed from: i */
    public String f185668i;

    /* renamed from: j */
    public String f185669j;

    /* renamed from: n */
    public int f185670n;

    /* renamed from: o */
    public yk4 f185671o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64737tr)) {
            return false;
        }
        C64737tr trVar = (C64737tr) aVar;
        return C46238a.m51546a(this.BaseResponse, trVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f185663d), Integer.valueOf(trVar.f185663d)) && C46238a.m51546a(this.f185664e, trVar.f185664e) && C46238a.m51546a(this.f185665f, trVar.f185665f) && C46238a.m51546a(this.f185666g, trVar.f185666g) && C46238a.m51546a(this.f185667h, trVar.f185667h) && C46238a.m51546a(this.f185668i, trVar.f185668i) && C46238a.m51546a(this.f185669j, trVar.f185669j) && C46238a.m51546a(Integer.valueOf(this.f185670n), Integer.valueOf(trVar.f185670n)) && C46238a.m51546a(this.f185671o, trVar.f185671o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f185663d);
                String str = this.f185664e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C49995ji2 ji22 = this.f185665f;
                if (ji22 != null) {
                    aVar.mo74322i(4, ji22.computeSize());
                    this.f185665f.writeFields(aVar);
                }
                String str2 = this.f185666g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f185667h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f185668i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f185669j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                aVar.mo74318e(9, this.f185670n);
                yk4 yk4 = this.f185671o;
                if (yk4 != null) {
                    aVar.mo74322i(10, yk4.computeSize());
                    this.f185671o.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185663d);
            String str6 = this.f185664e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            C49995ji2 ji23 = this.f185665f;
            if (ji23 != null) {
                e += C52418a.m58682i(4, ji23.computeSize());
            }
            String str7 = this.f185666g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f185667h;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            String str9 = this.f185668i;
            if (str9 != null) {
                e += C52418a.m58683j(7, str9);
            }
            String str10 = this.f185669j;
            if (str10 != null) {
                e += C52418a.m58683j(8, str10);
            }
            int e2 = e + C52418a.m58678e(9, this.f185670n);
            yk4 yk42 = this.f185671o;
            return yk42 != null ? e2 + C52418a.m58682i(10, yk42.computeSize()) : e2;
        } else if (i == 2) {
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64737tr trVar = objArr[1];
            int intValue = objArr[2].intValue();
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
                        trVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    trVar.f185663d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    trVar.f185664e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49995ji2 ji24 = new C49995ji2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ji24.parseFrom(bArr2);
                        }
                        trVar.f185665f = ji24;
                    }
                    return 0;
                case 5:
                    trVar.f185666g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    trVar.f185667h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    trVar.f185668i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    trVar.f185669j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    trVar.f185670n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        yk4 yk43 = new yk4();
                        if (bArr3 != null && bArr3.length > 0) {
                            yk43.parseFrom(bArr3);
                        }
                        trVar.f185671o = yk43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
