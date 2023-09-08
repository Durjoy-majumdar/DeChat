package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gv */
public class C49614gv extends C49335eu3 {

    /* renamed from: d */
    public int f134293d;

    /* renamed from: e */
    public String f134294e;

    /* renamed from: f */
    public String f134295f;

    /* renamed from: g */
    public int f134296g;

    /* renamed from: h */
    public LinkedList<zg4> f134297h = new LinkedList<>();

    /* renamed from: i */
    public int f134298i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49614gv)) {
            return false;
        }
        C49614gv gvVar = (C49614gv) aVar;
        return C46238a.m51546a(this.BaseResponse, gvVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134293d), Integer.valueOf(gvVar.f134293d)) && C46238a.m51546a(this.f134294e, gvVar.f134294e) && C46238a.m51546a(this.f134295f, gvVar.f134295f) && C46238a.m51546a(Integer.valueOf(this.f134296g), Integer.valueOf(gvVar.f134296g)) && C46238a.m51546a(this.f134297h, gvVar.f134297h) && C46238a.m51546a(Integer.valueOf(this.f134298i), Integer.valueOf(gvVar.f134298i));
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
                aVar.mo74318e(2, this.f134293d);
                String str = this.f134294e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f134295f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74318e(5, this.f134296g);
                aVar.mo74320g(6, 8, this.f134297h);
                aVar.mo74318e(7, this.f134298i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134293d);
            String str3 = this.f134294e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f134295f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f134296g) + C52418a.m58680g(6, 8, this.f134297h) + C52418a.m58678e(7, this.f134298i);
        } else if (i == 2) {
            this.f134297h.clear();
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
            C49614gv gvVar = objArr[1];
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
                        gvVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    gvVar.f134293d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gvVar.f134294e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gvVar.f134295f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gvVar.f134296g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        zg4 zg4 = new zg4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zg4.parseFrom(bArr2);
                        }
                        gvVar.f134297h.add(zg4);
                    }
                    return 0;
                case 7:
                    gvVar.f134298i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
