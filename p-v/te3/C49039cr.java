package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cr */
public class C49039cr extends C49335eu3 {

    /* renamed from: d */
    public int f131911d;

    /* renamed from: e */
    public String f131912e;

    /* renamed from: f */
    public String f131913f;

    /* renamed from: g */
    public String f131914g;

    /* renamed from: h */
    public boolean f131915h;

    /* renamed from: i */
    public String f131916i;

    /* renamed from: j */
    public int f131917j;

    /* renamed from: n */
    public dz4 f131918n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49039cr)) {
            return false;
        }
        C49039cr crVar = (C49039cr) aVar;
        return C46238a.m51546a(this.BaseResponse, crVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131911d), Integer.valueOf(crVar.f131911d)) && C46238a.m51546a(this.f131912e, crVar.f131912e) && C46238a.m51546a(this.f131913f, crVar.f131913f) && C46238a.m51546a(this.f131914g, crVar.f131914g) && C46238a.m51546a(Boolean.valueOf(this.f131915h), Boolean.valueOf(crVar.f131915h)) && C46238a.m51546a(this.f131916i, crVar.f131916i) && C46238a.m51546a(Integer.valueOf(this.f131917j), Integer.valueOf(crVar.f131917j)) && C46238a.m51546a(this.f131918n, crVar.f131918n);
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
                aVar.mo74318e(2, this.f131911d);
                String str = this.f131912e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f131913f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f131914g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74314a(6, this.f131915h);
                String str4 = this.f131916i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74318e(8, this.f131917j);
                dz4 dz4 = this.f131918n;
                if (dz4 != null) {
                    aVar.mo74322i(9, dz4.computeSize());
                    this.f131918n.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131911d);
            String str5 = this.f131912e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f131913f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f131914g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int a = e + C52418a.m58674a(6, this.f131915h);
            String str8 = this.f131916i;
            if (str8 != null) {
                a += C52418a.m58683j(7, str8);
            }
            int e2 = a + C52418a.m58678e(8, this.f131917j);
            dz4 dz42 = this.f131918n;
            return dz42 != null ? e2 + C52418a.m58682i(9, dz42.computeSize()) : e2;
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
            C49039cr crVar = objArr[1];
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
                        crVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    crVar.f131911d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    crVar.f131912e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    crVar.f131913f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    crVar.f131914g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    crVar.f131915h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    crVar.f131916i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    crVar.f131917j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        dz4 dz43 = new dz4();
                        if (bArr2 != null && bArr2.length > 0) {
                            dz43.parseFrom(bArr2);
                        }
                        crVar.f131918n = dz43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
