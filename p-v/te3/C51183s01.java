package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s01 */
public class C51183s01 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51398th3> f141245d = new LinkedList<>();

    /* renamed from: e */
    public String f141246e;

    /* renamed from: f */
    public int f141247f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51183s01)) {
            return false;
        }
        C51183s01 s012 = (C51183s01) aVar;
        return C46238a.m51546a(this.BaseResponse, s012.BaseResponse) && C46238a.m51546a(this.f141245d, s012.f141245d) && C46238a.m51546a(this.f141246e, s012.f141246e) && C46238a.m51546a(Integer.valueOf(this.f141247f), Integer.valueOf(s012.f141247f));
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
            aVar.mo74320g(2, 8, this.f141245d);
            String str = this.f141246e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f141247f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f141245d);
            String str2 = this.f141246e;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            return g + C52418a.m58678e(4, this.f141247f);
        } else if (i == 2) {
            this.f141245d.clear();
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
            C51183s01 s012 = objArr[1];
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
                    s012.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51398th3 th32 = new C51398th3();
                    if (bArr2 != null && bArr2.length > 0) {
                        th32.parseFrom(bArr2);
                    }
                    s012.f141245d.add(th32);
                }
                return 0;
            } else if (intValue == 3) {
                s012.f141246e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                s012.f141247f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
