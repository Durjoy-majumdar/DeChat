package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u12 */
public class C51479u12 extends C49335eu3 {

    /* renamed from: d */
    public int f142545d;

    /* renamed from: e */
    public String f142546e;

    /* renamed from: f */
    public C51823we2 f142547f;

    /* renamed from: g */
    public C52131yl f142548g;

    /* renamed from: h */
    public C50452mu2 f142549h;

    /* renamed from: i */
    public C51534ue2 f142550i;

    /* renamed from: j */
    public C51105rg2 f142551j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51479u12)) {
            return false;
        }
        C51479u12 u122 = (C51479u12) aVar;
        return C46238a.m51546a(this.BaseResponse, u122.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142545d), Integer.valueOf(u122.f142545d)) && C46238a.m51546a(this.f142546e, u122.f142546e) && C46238a.m51546a(this.f142547f, u122.f142547f) && C46238a.m51546a(this.f142548g, u122.f142548g) && C46238a.m51546a(this.f142549h, u122.f142549h) && C46238a.m51546a(this.f142550i, u122.f142550i) && C46238a.m51546a(this.f142551j, u122.f142551j);
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
                aVar.mo74318e(2, this.f142545d);
                String str = this.f142546e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51823we2 we22 = this.f142547f;
                if (we22 != null) {
                    aVar.mo74322i(4, we22.computeSize());
                    this.f142547f.writeFields(aVar);
                }
                C52131yl ylVar = this.f142548g;
                if (ylVar != null) {
                    aVar.mo74322i(8, ylVar.computeSize());
                    this.f142548g.writeFields(aVar);
                }
                C50452mu2 mu22 = this.f142549h;
                if (mu22 != null) {
                    aVar.mo74322i(9, mu22.computeSize());
                    this.f142549h.writeFields(aVar);
                }
                C51534ue2 ue22 = this.f142550i;
                if (ue22 != null) {
                    aVar.mo74322i(10, ue22.computeSize());
                    this.f142550i.writeFields(aVar);
                }
                C51105rg2 rg22 = this.f142551j;
                if (rg22 != null) {
                    aVar.mo74322i(11, rg22.computeSize());
                    this.f142551j.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142545d);
            String str2 = this.f142546e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C51823we2 we23 = this.f142547f;
            if (we23 != null) {
                e += C52418a.m58682i(4, we23.computeSize());
            }
            C52131yl ylVar2 = this.f142548g;
            if (ylVar2 != null) {
                e += C52418a.m58682i(8, ylVar2.computeSize());
            }
            C50452mu2 mu23 = this.f142549h;
            if (mu23 != null) {
                e += C52418a.m58682i(9, mu23.computeSize());
            }
            C51534ue2 ue23 = this.f142550i;
            if (ue23 != null) {
                e += C52418a.m58682i(10, ue23.computeSize());
            }
            C51105rg2 rg23 = this.f142551j;
            return rg23 != null ? e + C52418a.m58682i(11, rg23.computeSize()) : e;
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
            C51479u12 u122 = objArr[1];
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
                    u122.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                u122.f142545d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                u122.f142546e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                switch (intValue) {
                    case 8:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C52131yl ylVar3 = new C52131yl();
                            if (bArr2 != null && bArr2.length > 0) {
                                ylVar3.parseFrom(bArr2);
                            }
                            u122.f142548g = ylVar3;
                        }
                        return 0;
                    case 9:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            C50452mu2 mu24 = new C50452mu2();
                            if (bArr3 != null && bArr3.length > 0) {
                                mu24.parseFrom(bArr3);
                            }
                            u122.f142549h = mu24;
                        }
                        return 0;
                    case 10:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            byte[] bArr4 = j4.get(i6);
                            C51534ue2 ue24 = new C51534ue2();
                            if (bArr4 != null && bArr4.length > 0) {
                                ue24.parseFrom(bArr4);
                            }
                            u122.f142550i = ue24;
                        }
                        return 0;
                    case 11:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            byte[] bArr5 = j5.get(i7);
                            C51105rg2 rg24 = new C51105rg2();
                            if (bArr5 != null && bArr5.length > 0) {
                                rg24.parseFrom(bArr5);
                            }
                            u122.f142551j = rg24;
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                int size6 = j6.size();
                for (int i8 = 0; i8 < size6; i8++) {
                    byte[] bArr6 = j6.get(i8);
                    C51823we2 we24 = new C51823we2();
                    if (bArr6 != null && bArr6.length > 0) {
                        we24.parseFrom(bArr6);
                    }
                    u122.f142547f = we24;
                }
                return 0;
            }
        }
    }
}
