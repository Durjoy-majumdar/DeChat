package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vs */
public class C51731vs extends C49335eu3 {

    /* renamed from: d */
    public int f143662d;

    /* renamed from: e */
    public String f143663e;

    /* renamed from: f */
    public String f143664f;

    /* renamed from: g */
    public String f143665g;

    /* renamed from: h */
    public String f143666h;

    /* renamed from: i */
    public String f143667i;

    /* renamed from: j */
    public dz4 f143668j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51731vs)) {
            return false;
        }
        C51731vs vsVar = (C51731vs) aVar;
        return C46238a.m51546a(this.BaseResponse, vsVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f143662d), Integer.valueOf(vsVar.f143662d)) && C46238a.m51546a(this.f143663e, vsVar.f143663e) && C46238a.m51546a(this.f143664f, vsVar.f143664f) && C46238a.m51546a(this.f143665g, vsVar.f143665g) && C46238a.m51546a(this.f143666h, vsVar.f143666h) && C46238a.m51546a(this.f143667i, vsVar.f143667i) && C46238a.m51546a(this.f143668j, vsVar.f143668j);
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
                aVar.mo74318e(2, this.f143662d);
                String str = this.f143663e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f143664f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f143665g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f143666h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f143667i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                dz4 dz4 = this.f143668j;
                if (dz4 != null) {
                    aVar.mo74322i(8, dz4.computeSize());
                    this.f143668j.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143662d);
            String str6 = this.f143663e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f143664f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f143665g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f143666h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f143667i;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            dz4 dz42 = this.f143668j;
            return dz42 != null ? e + C52418a.m58682i(8, dz42.computeSize()) : e;
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
            C51731vs vsVar = objArr[1];
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
                        vsVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    vsVar.f143662d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vsVar.f143663e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vsVar.f143664f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vsVar.f143665g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vsVar.f143666h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vsVar.f143667i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        dz4 dz43 = new dz4();
                        if (bArr2 != null && bArr2.length > 0) {
                            dz43.parseFrom(bArr2);
                        }
                        vsVar.f143668j = dz43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
