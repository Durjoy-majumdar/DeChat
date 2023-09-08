package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p50 */
public class C50783p50 extends C49335eu3 {

    /* renamed from: d */
    public String f139584d;

    /* renamed from: e */
    public String f139585e;

    /* renamed from: f */
    public String f139586f;

    /* renamed from: g */
    public int f139587g;

    /* renamed from: h */
    public int f139588h;

    /* renamed from: i */
    public int f139589i;

    /* renamed from: j */
    public C51018qv3 f139590j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50783p50)) {
            return false;
        }
        C50783p50 p502 = (C50783p50) aVar;
        return C46238a.m51546a(this.BaseResponse, p502.BaseResponse) && C46238a.m51546a(this.f139584d, p502.f139584d) && C46238a.m51546a(this.f139585e, p502.f139585e) && C46238a.m51546a(this.f139586f, p502.f139586f) && C46238a.m51546a(Integer.valueOf(this.f139587g), Integer.valueOf(p502.f139587g)) && C46238a.m51546a(Integer.valueOf(this.f139588h), Integer.valueOf(p502.f139588h)) && C46238a.m51546a(Integer.valueOf(this.f139589i), Integer.valueOf(p502.f139589i)) && C46238a.m51546a(this.f139590j, p502.f139590j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139590j != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f139584d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f139585e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f139586f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f139587g);
                aVar.mo74318e(6, this.f139588h);
                aVar.mo74318e(7, this.f139589i);
                C51018qv3 qv32 = this.f139590j;
                if (qv32 != null) {
                    aVar.mo74322i(8, qv32.computeSize());
                    this.f139590j.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f139584d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f139585e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f139586f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            int e = i2 + C52418a.m58678e(5, this.f139587g) + C52418a.m58678e(6, this.f139588h) + C52418a.m58678e(7, this.f139589i);
            C51018qv3 qv33 = this.f139590j;
            return qv33 != null ? e + C52418a.m58682i(8, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139590j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50783p50 p502 = objArr[1];
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
                        p502.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    p502.f139584d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p502.f139585e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p502.f139586f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    p502.f139587g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    p502.f139588h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    p502.f139589i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        p502.f139590j = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
