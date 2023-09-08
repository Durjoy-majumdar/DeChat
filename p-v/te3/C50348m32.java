package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m32 */
public class C50348m32 extends C49335eu3 {

    /* renamed from: d */
    public eh4 f137813d;

    /* renamed from: e */
    public int f137814e;

    /* renamed from: f */
    public String f137815f;

    /* renamed from: g */
    public String f137816g;

    /* renamed from: h */
    public C50452mu2 f137817h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50348m32)) {
            return false;
        }
        C50348m32 m322 = (C50348m32) aVar;
        return C46238a.m51546a(this.BaseResponse, m322.BaseResponse) && C46238a.m51546a(this.f137813d, m322.f137813d) && C46238a.m51546a(Integer.valueOf(this.f137814e), Integer.valueOf(m322.f137814e)) && C46238a.m51546a(this.f137815f, m322.f137815f) && C46238a.m51546a(this.f137816g, m322.f137816g) && C46238a.m51546a(this.f137817h, m322.f137817h);
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
                eh4 eh4 = this.f137813d;
                if (eh4 != null) {
                    aVar.mo74322i(2, eh4.computeSize());
                    this.f137813d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f137814e);
                String str = this.f137815f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f137816g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                C50452mu2 mu22 = this.f137817h;
                if (mu22 != null) {
                    aVar.mo74322i(6, mu22.computeSize());
                    this.f137817h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            eh4 eh42 = this.f137813d;
            if (eh42 != null) {
                i2 += C52418a.m58682i(2, eh42.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f137814e);
            String str3 = this.f137815f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f137816g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            C50452mu2 mu23 = this.f137817h;
            return mu23 != null ? e + C52418a.m58682i(6, mu23.computeSize()) : e;
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
            C50348m32 m322 = objArr[1];
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
                        m322.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        eh4 eh43 = new eh4();
                        if (bArr2 != null && bArr2.length > 0) {
                            eh43.parseFrom(bArr2);
                        }
                        m322.f137813d = eh43;
                    }
                    return 0;
                case 3:
                    m322.f137814e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    m322.f137815f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m322.f137816g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50452mu2 mu24 = new C50452mu2();
                        if (bArr3 != null && bArr3.length > 0) {
                            mu24.parseFrom(bArr3);
                        }
                        m322.f137817h = mu24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
