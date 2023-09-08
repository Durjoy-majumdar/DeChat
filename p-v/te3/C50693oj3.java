package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oj3 */
public class C50693oj3 extends C49335eu3 {

    /* renamed from: d */
    public String f139220d;

    /* renamed from: e */
    public C51018qv3 f139221e;

    /* renamed from: f */
    public int f139222f;

    /* renamed from: g */
    public int f139223g;

    /* renamed from: h */
    public String f139224h;

    /* renamed from: i */
    public C51018qv3 f139225i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50693oj3)) {
            return false;
        }
        C50693oj3 oj32 = (C50693oj3) aVar;
        return C46238a.m51546a(this.BaseResponse, oj32.BaseResponse) && C46238a.m51546a(this.f139220d, oj32.f139220d) && C46238a.m51546a(this.f139221e, oj32.f139221e) && C46238a.m51546a(Integer.valueOf(this.f139222f), Integer.valueOf(oj32.f139222f)) && C46238a.m51546a(Integer.valueOf(this.f139223g), Integer.valueOf(oj32.f139223g)) && C46238a.m51546a(this.f139224h, oj32.f139224h) && C46238a.m51546a(this.f139225i, oj32.f139225i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139221e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f139220d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51018qv3 qv32 = this.f139221e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f139221e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f139222f);
                aVar.mo74318e(5, this.f139223g);
                String str2 = this.f139224h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                C51018qv3 qv33 = this.f139225i;
                if (qv33 != null) {
                    aVar.mo74322i(7, qv33.computeSize());
                    this.f139225i.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NotifyKey");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f139220d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            C51018qv3 qv34 = this.f139221e;
            if (qv34 != null) {
                i2 += C52418a.m58682i(3, qv34.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f139222f) + C52418a.m58678e(5, this.f139223g);
            String str4 = this.f139224h;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            C51018qv3 qv35 = this.f139225i;
            return qv35 != null ? e + C52418a.m58682i(7, qv35.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139221e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NotifyKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50693oj3 oj32 = objArr[1];
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
                        oj32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    oj32.f139220d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        oj32.f139221e = qv36;
                    }
                    return 0;
                case 4:
                    oj32.f139222f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    oj32.f139223g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    oj32.f139224h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        oj32.f139225i = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
