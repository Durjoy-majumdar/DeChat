package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yi4 extends C49335eu3 {

    /* renamed from: d */
    public int f145317d;

    /* renamed from: e */
    public String f145318e;

    /* renamed from: f */
    public C64320dn3 f145319f;

    /* renamed from: g */
    public C48754ar3 f145320g;

    /* renamed from: h */
    public int f145321h;

    /* renamed from: i */
    public String f145322i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yi4)) {
            return false;
        }
        yi4 yi4 = (yi4) aVar;
        return C46238a.m51546a(this.BaseResponse, yi4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f145317d), Integer.valueOf(yi4.f145317d)) && C46238a.m51546a(this.f145318e, yi4.f145318e) && C46238a.m51546a(this.f145319f, yi4.f145319f) && C46238a.m51546a(this.f145320g, yi4.f145320g) && C46238a.m51546a(Integer.valueOf(this.f145321h), Integer.valueOf(yi4.f145321h)) && C46238a.m51546a(this.f145322i, yi4.f145322i);
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
            aVar.mo74318e(2, this.f145317d);
            String str = this.f145318e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C64320dn3 dn32 = this.f145319f;
            if (dn32 != null) {
                aVar.mo74322i(4, dn32.computeSize());
                this.f145319f.writeFields(aVar);
            }
            C48754ar3 ar32 = this.f145320g;
            if (ar32 != null) {
                aVar.mo74322i(5, ar32.computeSize());
                this.f145320g.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f145321h);
            String str2 = this.f145322i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145317d);
            String str3 = this.f145318e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C64320dn3 dn33 = this.f145319f;
            if (dn33 != null) {
                e += C52418a.m58682i(4, dn33.computeSize());
            }
            C48754ar3 ar33 = this.f145320g;
            if (ar33 != null) {
                e += C52418a.m58682i(5, ar33.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f145321h);
            String str4 = this.f145322i;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
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
            yi4 yi4 = objArr[1];
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
                        yi4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    yi4.f145317d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yi4.f145318e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64320dn3 dn34 = new C64320dn3();
                        if (bArr2 != null && bArr2.length > 0) {
                            dn34.parseFrom(bArr2);
                        }
                        yi4.f145319f = dn34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48754ar3 ar34 = new C48754ar3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ar34.parseFrom(bArr3);
                        }
                        yi4.f145320g = ar34;
                    }
                    return 0;
                case 6:
                    yi4.f145321h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    yi4.f145322i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
