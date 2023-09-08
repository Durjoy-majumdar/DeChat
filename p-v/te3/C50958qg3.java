package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qg3 */
public class C50958qg3 extends C49335eu3 {

    /* renamed from: d */
    public int f140309d;

    /* renamed from: e */
    public String f140310e;

    /* renamed from: f */
    public String f140311f;

    /* renamed from: g */
    public C52159yr2 f140312g;

    /* renamed from: h */
    public String f140313h;

    /* renamed from: i */
    public C51643v40 f140314i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50958qg3)) {
            return false;
        }
        C50958qg3 qg32 = (C50958qg3) aVar;
        return C46238a.m51546a(this.BaseResponse, qg32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140309d), Integer.valueOf(qg32.f140309d)) && C46238a.m51546a(this.f140310e, qg32.f140310e) && C46238a.m51546a(this.f140311f, qg32.f140311f) && C46238a.m51546a(this.f140312g, qg32.f140312g) && C46238a.m51546a(this.f140313h, qg32.f140313h) && C46238a.m51546a(this.f140314i, qg32.f140314i);
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
                aVar.mo74318e(2, this.f140309d);
                String str = this.f140310e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f140311f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C52159yr2 yr22 = this.f140312g;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f140312g.writeFields(aVar);
                }
                String str3 = this.f140313h;
                if (str3 != null) {
                    aVar.mo74323j(100, str3);
                }
                C51643v40 v402 = this.f140314i;
                if (v402 != null) {
                    aVar.mo74322i(101, v402.computeSize());
                    this.f140314i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140309d);
            String str4 = this.f140310e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f140311f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            C52159yr2 yr23 = this.f140312g;
            if (yr23 != null) {
                e += C52418a.m58682i(99, yr23.computeSize());
            }
            String str6 = this.f140313h;
            if (str6 != null) {
                e += C52418a.m58683j(100, str6);
            }
            C51643v40 v403 = this.f140314i;
            return v403 != null ? e + C52418a.m58682i(101, v403.computeSize()) : e;
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
            C50958qg3 qg32 = objArr[1];
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
                    qg32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                qg32.f140309d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                qg32.f140310e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                switch (intValue) {
                    case 99:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C52159yr2 yr24 = new C52159yr2();
                            if (bArr2 != null && bArr2.length > 0) {
                                yr24.parseFrom(bArr2);
                            }
                            qg32.f140312g = yr24;
                        }
                        return 0;
                    case 100:
                        qg32.f140313h = aVar3.mo141633k(intValue);
                        return 0;
                    case 101:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            C51643v40 v404 = new C51643v40();
                            if (bArr3 != null && bArr3.length > 0) {
                                v404.parseFrom(bArr3);
                            }
                            qg32.f140314i = v404;
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                qg32.f140311f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
