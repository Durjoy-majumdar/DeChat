package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ry1 */
public class C51175ry1 extends C49335eu3 {

    /* renamed from: d */
    public int f141216d;

    /* renamed from: e */
    public String f141217e;

    /* renamed from: f */
    public eh4 f141218f;

    /* renamed from: g */
    public C50452mu2 f141219g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51175ry1)) {
            return false;
        }
        C51175ry1 ry12 = (C51175ry1) aVar;
        return C46238a.m51546a(this.BaseResponse, ry12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141216d), Integer.valueOf(ry12.f141216d)) && C46238a.m51546a(this.f141217e, ry12.f141217e) && C46238a.m51546a(this.f141218f, ry12.f141218f) && C46238a.m51546a(this.f141219g, ry12.f141219g);
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
                aVar.mo74318e(2, this.f141216d);
                String str = this.f141217e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                eh4 eh4 = this.f141218f;
                if (eh4 != null) {
                    aVar.mo74322i(4, eh4.computeSize());
                    this.f141218f.writeFields(aVar);
                }
                C50452mu2 mu22 = this.f141219g;
                if (mu22 != null) {
                    aVar.mo74322i(5, mu22.computeSize());
                    this.f141219g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141216d);
            String str2 = this.f141217e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            eh4 eh42 = this.f141218f;
            if (eh42 != null) {
                e += C52418a.m58682i(4, eh42.computeSize());
            }
            C50452mu2 mu23 = this.f141219g;
            return mu23 != null ? e + C52418a.m58682i(5, mu23.computeSize()) : e;
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
            C51175ry1 ry12 = objArr[1];
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
                    ry12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ry12.f141216d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ry12.f141217e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    eh4 eh43 = new eh4();
                    if (bArr2 != null && bArr2.length > 0) {
                        eh43.parseFrom(bArr2);
                    }
                    ry12.f141218f = eh43;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50452mu2 mu24 = new C50452mu2();
                    if (bArr3 != null && bArr3.length > 0) {
                        mu24.parseFrom(bArr3);
                    }
                    ry12.f141219g = mu24;
                }
                return 0;
            }
        }
    }
}
