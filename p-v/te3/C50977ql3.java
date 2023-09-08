package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ql3 */
public class C50977ql3 extends C49335eu3 {

    /* renamed from: d */
    public int f140382d;

    /* renamed from: e */
    public String f140383e;

    /* renamed from: f */
    public int f140384f;

    /* renamed from: g */
    public ny4 f140385g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50977ql3)) {
            return false;
        }
        C50977ql3 ql32 = (C50977ql3) aVar;
        return C46238a.m51546a(this.BaseResponse, ql32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140382d), Integer.valueOf(ql32.f140382d)) && C46238a.m51546a(this.f140383e, ql32.f140383e) && C46238a.m51546a(Integer.valueOf(this.f140384f), Integer.valueOf(ql32.f140384f)) && C46238a.m51546a(this.f140385g, ql32.f140385g);
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
            aVar.mo74318e(2, this.f140382d);
            String str = this.f140383e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f140384f);
            ny4 ny4 = this.f140385g;
            if (ny4 != null) {
                aVar.mo74322i(5, ny4.computeSize());
                this.f140385g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140382d);
            String str2 = this.f140383e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int e2 = e + C52418a.m58678e(4, this.f140384f);
            ny4 ny42 = this.f140385g;
            return ny42 != null ? e2 + C52418a.m58682i(5, ny42.computeSize()) : e2;
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
            C50977ql3 ql32 = objArr[1];
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
                    ql32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ql32.f140382d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ql32.f140383e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ql32.f140384f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ny4 ny43 = new ny4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ny43.parseFrom(bArr2);
                    }
                    ql32.f140385g = ny43;
                }
                return 0;
            }
        }
    }
}
