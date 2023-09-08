package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ov */
public class C50736ov extends C49335eu3 {

    /* renamed from: d */
    public int f139379d;

    /* renamed from: e */
    public rt4 f139380e;

    /* renamed from: f */
    public yn4 f139381f;

    /* renamed from: g */
    public C50147kl3 f139382g;

    /* renamed from: h */
    public int f139383h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50736ov)) {
            return false;
        }
        C50736ov ovVar = (C50736ov) aVar;
        return C46238a.m51546a(this.BaseResponse, ovVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139379d), Integer.valueOf(ovVar.f139379d)) && C46238a.m51546a(this.f139380e, ovVar.f139380e) && C46238a.m51546a(this.f139381f, ovVar.f139381f) && C46238a.m51546a(this.f139382g, ovVar.f139382g) && C46238a.m51546a(Integer.valueOf(this.f139383h), Integer.valueOf(ovVar.f139383h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139380e == null) {
                throw new C52419b("Not all required fields were included: TransRes");
            } else if (this.f139381f == null) {
                throw new C52419b("Not all required fields were included: UploadCtx");
            } else if (this.f139382g != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139379d);
                rt4 rt4 = this.f139380e;
                if (rt4 != null) {
                    aVar.mo74322i(3, rt4.computeSize());
                    this.f139380e.writeFields(aVar);
                }
                yn4 yn4 = this.f139381f;
                if (yn4 != null) {
                    aVar.mo74322i(4, yn4.computeSize());
                    this.f139381f.writeFields(aVar);
                }
                C50147kl3 kl32 = this.f139382g;
                if (kl32 != null) {
                    aVar.mo74322i(5, kl32.computeSize());
                    this.f139382g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f139383h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: QueryCtx");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139379d);
            rt4 rt42 = this.f139380e;
            if (rt42 != null) {
                e += C52418a.m58682i(3, rt42.computeSize());
            }
            yn4 yn42 = this.f139381f;
            if (yn42 != null) {
                e += C52418a.m58682i(4, yn42.computeSize());
            }
            C50147kl3 kl33 = this.f139382g;
            if (kl33 != null) {
                e += C52418a.m58682i(5, kl33.computeSize());
            }
            return e + C52418a.m58678e(6, this.f139383h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139380e == null) {
                throw new C52419b("Not all required fields were included: TransRes");
            } else if (this.f139381f == null) {
                throw new C52419b("Not all required fields were included: UploadCtx");
            } else if (this.f139382g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: QueryCtx");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50736ov ovVar = objArr[1];
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
                        ovVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ovVar.f139379d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        rt4 rt43 = new rt4();
                        if (bArr2 != null && bArr2.length > 0) {
                            rt43.parseFrom(bArr2);
                        }
                        ovVar.f139380e = rt43;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        yn4 yn43 = new yn4();
                        if (bArr3 != null && bArr3.length > 0) {
                            yn43.parseFrom(bArr3);
                        }
                        ovVar.f139381f = yn43;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50147kl3 kl34 = new C50147kl3();
                        if (bArr4 != null && bArr4.length > 0) {
                            kl34.parseFrom(bArr4);
                        }
                        ovVar.f139382g = kl34;
                    }
                    return 0;
                case 6:
                    ovVar.f139383h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
