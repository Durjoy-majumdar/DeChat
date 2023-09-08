package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r83 */
public class C51073r83 extends C49335eu3 {

    /* renamed from: d */
    public int f140761d;

    /* renamed from: e */
    public String f140762e;

    /* renamed from: f */
    public LinkedList<uk4> f140763f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51073r83)) {
            return false;
        }
        C51073r83 r832 = (C51073r83) aVar;
        return C46238a.m51546a(this.BaseResponse, r832.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140761d), Integer.valueOf(r832.f140761d)) && C46238a.m51546a(this.f140762e, r832.f140762e) && C46238a.m51546a(this.f140763f, r832.f140763f);
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
            aVar.mo74318e(2, this.f140761d);
            String str = this.f140762e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 8, this.f140763f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140761d);
            String str2 = this.f140762e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58680g(4, 8, this.f140763f);
        } else if (i == 2) {
            this.f140763f.clear();
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
            C51073r83 r832 = objArr[1];
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
                    r832.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                r832.f140761d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                r832.f140762e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    uk4 uk4 = new uk4();
                    if (bArr2 != null && bArr2.length > 0) {
                        uk4.parseFrom(bArr2);
                    }
                    r832.f140763f.add(uk4);
                }
                return 0;
            }
        }
    }
}
