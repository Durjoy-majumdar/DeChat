package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gn3 */
public class C49584gn3 extends C49335eu3 {

    /* renamed from: d */
    public int f134142d;

    /* renamed from: e */
    public String f134143e;

    /* renamed from: f */
    public int f134144f;

    /* renamed from: g */
    public C50456mv3 f134145g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49584gn3)) {
            return false;
        }
        C49584gn3 gn32 = (C49584gn3) aVar;
        return C46238a.m51546a(this.BaseResponse, gn32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134142d), Integer.valueOf(gn32.f134142d)) && C46238a.m51546a(this.f134143e, gn32.f134143e) && C46238a.m51546a(Integer.valueOf(this.f134144f), Integer.valueOf(gn32.f134144f)) && C46238a.m51546a(this.f134145g, gn32.f134145g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f134142d);
            String str = this.f134143e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f134144f);
            C50456mv3 mv32 = this.f134145g;
            if (mv32 != null) {
                aVar.mo74322i(5, mv32.computeSize());
                this.f134145g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134142d);
            String str2 = this.f134143e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int e2 = e + C52418a.m58678e(4, this.f134144f);
            C50456mv3 mv33 = this.f134145g;
            return mv33 != null ? e2 + C52418a.m58682i(5, mv33.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49584gn3 gn32 = objArr[1];
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
                    gn32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                gn32.f134142d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                gn32.f134143e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                gn32.f134144f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        mv34.parseFrom(bArr2);
                    }
                    gn32.f134145g = mv34;
                }
                return 0;
            }
        }
    }
}
