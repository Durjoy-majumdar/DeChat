package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i32 */
public class C49793i32 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f135077d;

    /* renamed from: e */
    public String f135078e;

    /* renamed from: f */
    public int f135079f;

    /* renamed from: g */
    public C51018qv3 f135080g;

    /* renamed from: h */
    public int f135081h;

    /* renamed from: i */
    public String f135082i;

    /* renamed from: j */
    public C51018qv3 f135083j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49793i32)) {
            return false;
        }
        C49793i32 i322 = (C49793i32) aVar;
        return C46238a.m51546a(this.BaseResponse, i322.BaseResponse) && C46238a.m51546a(this.f135077d, i322.f135077d) && C46238a.m51546a(this.f135078e, i322.f135078e) && C46238a.m51546a(Integer.valueOf(this.f135079f), Integer.valueOf(i322.f135079f)) && C46238a.m51546a(this.f135080g, i322.f135080g) && C46238a.m51546a(Integer.valueOf(this.f135081h), Integer.valueOf(i322.f135081h)) && C46238a.m51546a(this.f135082i, i322.f135082i) && C46238a.m51546a(this.f135083j, i322.f135083j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f135077d == null) {
                throw new C52419b("Not all required fields were included: QRCode");
            } else if (this.f135080g != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f135077d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f135077d.writeFields(aVar);
                }
                String str = this.f135078e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f135079f);
                C51018qv3 qv33 = this.f135080g;
                if (qv33 != null) {
                    aVar.mo74322i(5, qv33.computeSize());
                    this.f135080g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f135081h);
                String str2 = this.f135082i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                C51018qv3 qv34 = this.f135083j;
                if (qv34 != null) {
                    aVar.mo74322i(8, qv34.computeSize());
                    this.f135083j.writeFields(aVar);
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
            C51018qv3 qv35 = this.f135077d;
            if (qv35 != null) {
                i2 += C52418a.m58682i(2, qv35.computeSize());
            }
            String str3 = this.f135078e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f135079f);
            C51018qv3 qv36 = this.f135080g;
            if (qv36 != null) {
                e += C52418a.m58682i(5, qv36.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f135081h);
            String str4 = this.f135082i;
            if (str4 != null) {
                e2 += C52418a.m58683j(7, str4);
            }
            C51018qv3 qv37 = this.f135083j;
            return qv37 != null ? e2 + C52418a.m58682i(8, qv37.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f135077d == null) {
                throw new C52419b("Not all required fields were included: QRCode");
            } else if (this.f135080g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NotifyKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49793i32 i322 = objArr[1];
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
                        i322.BaseResponse = jaVar3;
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
                        i322.f135077d = qv38;
                    }
                    return 0;
                case 3:
                    i322.f135078e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i322.f135079f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv39 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv39.mo73348f(bArr3);
                        }
                        i322.f135080g = qv39;
                    }
                    return 0;
                case 6:
                    i322.f135081h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    i322.f135082i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv310.mo73348f(bArr4);
                        }
                        i322.f135083j = qv310;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
