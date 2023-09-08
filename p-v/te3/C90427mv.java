package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mv */
public class C90427mv extends C49335eu3 {

    /* renamed from: d */
    public int f259700d;

    /* renamed from: e */
    public String f259701e;

    /* renamed from: f */
    public String f259702f;

    /* renamed from: g */
    public String f259703g;

    /* renamed from: h */
    public String f259704h;

    /* renamed from: i */
    public String f259705i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90427mv)) {
            return false;
        }
        C90427mv mvVar = (C90427mv) aVar;
        return C46238a.m51546a(this.BaseResponse, mvVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f259700d), Integer.valueOf(mvVar.f259700d)) && C46238a.m51546a(this.f259701e, mvVar.f259701e) && C46238a.m51546a(this.f259702f, mvVar.f259702f) && C46238a.m51546a(this.f259703g, mvVar.f259703g) && C46238a.m51546a(this.f259704h, mvVar.f259704h) && C46238a.m51546a(this.f259705i, mvVar.f259705i);
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
                aVar.mo74318e(2, this.f259700d);
                String str = this.f259701e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f259702f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f259703g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f259704h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f259705i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f259700d);
            String str6 = this.f259701e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f259702f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f259703g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f259704h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f259705i;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C90427mv mvVar = objArr[1];
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
                        mvVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    mvVar.f259700d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mvVar.f259701e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mvVar.f259702f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mvVar.f259703g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mvVar.f259704h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mvVar.f259705i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
