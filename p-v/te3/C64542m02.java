package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m02 */
public class C64542m02 extends C49335eu3 {

    /* renamed from: d */
    public int f184190d;

    /* renamed from: e */
    public String f184191e;

    /* renamed from: f */
    public String f184192f;

    /* renamed from: g */
    public int f184193g;

    /* renamed from: h */
    public String f184194h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64542m02)) {
            return false;
        }
        C64542m02 m022 = (C64542m02) aVar;
        return C46238a.m51546a(this.BaseResponse, m022.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f184190d), Integer.valueOf(m022.f184190d)) && C46238a.m51546a(this.f184191e, m022.f184191e) && C46238a.m51546a(this.f184192f, m022.f184192f) && C46238a.m51546a(Integer.valueOf(this.f184193g), Integer.valueOf(m022.f184193g)) && C46238a.m51546a(this.f184194h, m022.f184194h);
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
                aVar.mo74318e(2, this.f184190d);
                String str = this.f184191e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f184192f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74318e(5, this.f184193g);
                String str3 = this.f184194h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184190d);
            String str4 = this.f184191e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f184192f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int e2 = e + C52418a.m58678e(5, this.f184193g);
            String str6 = this.f184194h;
            return str6 != null ? e2 + C52418a.m58683j(6, str6) : e2;
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
            C64542m02 m022 = objArr[1];
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
                        m022.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    m022.f184190d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    m022.f184191e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m022.f184192f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m022.f184193g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    m022.f184194h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
