package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m33 */
public class C50349m33 extends C49335eu3 {

    /* renamed from: d */
    public int f137818d;

    /* renamed from: e */
    public LinkedList<C50776p33> f137819e = new LinkedList<>();

    /* renamed from: f */
    public int f137820f;

    /* renamed from: g */
    public LinkedList<C51283sq1> f137821g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50349m33)) {
            return false;
        }
        C50349m33 m332 = (C50349m33) aVar;
        return C46238a.m51546a(this.BaseResponse, m332.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137818d), Integer.valueOf(m332.f137818d)) && C46238a.m51546a(this.f137819e, m332.f137819e) && C46238a.m51546a(Integer.valueOf(this.f137820f), Integer.valueOf(m332.f137820f)) && C46238a.m51546a(this.f137821g, m332.f137821g);
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
                aVar.mo74318e(2, this.f137818d);
                aVar.mo74320g(3, 8, this.f137819e);
                aVar.mo74318e(4, this.f137820f);
                aVar.mo74320g(5, 8, this.f137821g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f137818d) + C52418a.m58680g(3, 8, this.f137819e) + C52418a.m58678e(4, this.f137820f) + C52418a.m58680g(5, 8, this.f137821g);
        } else if (i == 2) {
            this.f137819e.clear();
            this.f137821g.clear();
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
            C50349m33 m332 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    m332.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                m332.f137818d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50776p33 p332 = new C50776p33();
                    if (bArr2 != null && bArr2.length > 0) {
                        p332.parseFrom(bArr2);
                    }
                    m332.f137819e.add(p332);
                }
                return 0;
            } else if (intValue == 4) {
                m332.f137820f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51283sq1 sq12 = new C51283sq1();
                    if (bArr3 != null && bArr3.length > 0) {
                        sq12.parseFrom(bArr3);
                    }
                    m332.f137821g.add(sq12);
                }
                return 0;
            }
        }
    }
}
