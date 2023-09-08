package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fi2 */
public class C49427fi2 extends C49335eu3 {

    /* renamed from: d */
    public C48738am3 f133516d;

    /* renamed from: e */
    public String f133517e;

    /* renamed from: f */
    public int f133518f;

    /* renamed from: g */
    public C51725vq1 f133519g;

    /* renamed from: h */
    public C49275ef f133520h;

    /* renamed from: i */
    public String f133521i;

    /* renamed from: j */
    public String f133522j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49427fi2)) {
            return false;
        }
        C49427fi2 fi22 = (C49427fi2) aVar;
        return C46238a.m51546a(this.BaseResponse, fi22.BaseResponse) && C46238a.m51546a(this.f133516d, fi22.f133516d) && C46238a.m51546a(this.f133517e, fi22.f133517e) && C46238a.m51546a(Integer.valueOf(this.f133518f), Integer.valueOf(fi22.f133518f)) && C46238a.m51546a(this.f133519g, fi22.f133519g) && C46238a.m51546a(this.f133520h, fi22.f133520h) && C46238a.m51546a(this.f133521i, fi22.f133521i) && C46238a.m51546a(this.f133522j, fi22.f133522j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f133516d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C48738am3 am32 = this.f133516d;
                if (am32 != null) {
                    aVar.mo74322i(2, am32.computeSize());
                    this.f133516d.writeFields(aVar);
                }
                String str = this.f133517e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f133518f);
                C51725vq1 vq12 = this.f133519g;
                if (vq12 != null) {
                    aVar.mo74322i(5, vq12.computeSize());
                    this.f133519g.writeFields(aVar);
                }
                C49275ef efVar = this.f133520h;
                if (efVar != null) {
                    aVar.mo74322i(6, efVar.computeSize());
                    this.f133520h.writeFields(aVar);
                }
                String str2 = this.f133521i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f133522j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: qy_base_resp");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C48738am3 am33 = this.f133516d;
            if (am33 != null) {
                i2 += C52418a.m58682i(2, am33.computeSize());
            }
            String str4 = this.f133517e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f133518f);
            C51725vq1 vq13 = this.f133519g;
            if (vq13 != null) {
                e += C52418a.m58682i(5, vq13.computeSize());
            }
            C49275ef efVar2 = this.f133520h;
            if (efVar2 != null) {
                e += C52418a.m58682i(6, efVar2.computeSize());
            }
            String str5 = this.f133521i;
            if (str5 != null) {
                e += C52418a.m58683j(7, str5);
            }
            String str6 = this.f133522j;
            return str6 != null ? e + C52418a.m58683j(8, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f133516d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: qy_base_resp");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49427fi2 fi22 = objArr[1];
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
                        fi22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48738am3 am34 = new C48738am3();
                        if (bArr2 != null && bArr2.length > 0) {
                            am34.parseFrom(bArr2);
                        }
                        fi22.f133516d = am34;
                    }
                    return 0;
                case 3:
                    fi22.f133517e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fi22.f133518f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51725vq1 vq14 = new C51725vq1();
                        if (bArr3 != null && bArr3.length > 0) {
                            vq14.parseFrom(bArr3);
                        }
                        fi22.f133519g = vq14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49275ef efVar3 = new C49275ef();
                        if (bArr4 != null && bArr4.length > 0) {
                            efVar3.parseFrom(bArr4);
                        }
                        fi22.f133520h = efVar3;
                    }
                    return 0;
                case 7:
                    fi22.f133521i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fi22.f133522j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
