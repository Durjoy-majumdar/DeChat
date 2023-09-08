package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kf2 */
public class C50125kf2 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f136760d;

    /* renamed from: e */
    public C51018qv3 f136761e;

    /* renamed from: f */
    public C51018qv3 f136762f;

    /* renamed from: g */
    public int f136763g;

    /* renamed from: h */
    public int f136764h;

    /* renamed from: i */
    public int f136765i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50125kf2)) {
            return false;
        }
        C50125kf2 kf22 = (C50125kf2) aVar;
        return C46238a.m51546a(this.BaseResponse, kf22.BaseResponse) && C46238a.m51546a(this.f136760d, kf22.f136760d) && C46238a.m51546a(this.f136761e, kf22.f136761e) && C46238a.m51546a(this.f136762f, kf22.f136762f) && C46238a.m51546a(Integer.valueOf(this.f136763g), Integer.valueOf(kf22.f136763g)) && C46238a.m51546a(Integer.valueOf(this.f136764h), Integer.valueOf(kf22.f136764h)) && C46238a.m51546a(Integer.valueOf(this.f136765i), Integer.valueOf(kf22.f136765i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f136760d == null) {
                throw new C52419b("Not all required fields were included: SessionKey");
            } else if (this.f136761e == null) {
                throw new C52419b("Not all required fields were included: SessionBuffer");
            } else if (this.f136762f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f136760d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f136760d.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f136761e;
                if (qv33 != null) {
                    aVar.mo74322i(3, qv33.computeSize());
                    this.f136761e.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f136762f;
                if (qv34 != null) {
                    aVar.mo74322i(4, qv34.computeSize());
                    this.f136762f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f136763g);
                aVar.mo74318e(6, this.f136764h);
                aVar.mo74318e(7, this.f136765i);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuffer");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv35 = this.f136760d;
            if (qv35 != null) {
                i2 += C52418a.m58682i(2, qv35.computeSize());
            }
            C51018qv3 qv36 = this.f136761e;
            if (qv36 != null) {
                i2 += C52418a.m58682i(3, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f136762f;
            if (qv37 != null) {
                i2 += C52418a.m58682i(4, qv37.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f136763g) + C52418a.m58678e(6, this.f136764h) + C52418a.m58678e(7, this.f136765i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f136760d == null) {
                throw new C52419b("Not all required fields were included: SessionKey");
            } else if (this.f136761e == null) {
                throw new C52419b("Not all required fields were included: SessionBuffer");
            } else if (this.f136762f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuffer");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50125kf2 kf22 = objArr[1];
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
                        kf22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv38 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv38.mo73348f(bArr2);
                        }
                        kf22.f136760d = qv38;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv39 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv39.mo73348f(bArr3);
                        }
                        kf22.f136761e = qv39;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv310.mo73348f(bArr4);
                        }
                        kf22.f136762f = qv310;
                    }
                    return 0;
                case 5:
                    kf22.f136763g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kf22.f136764h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    kf22.f136765i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
