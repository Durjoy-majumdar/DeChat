package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ma4 extends C47465a {

    /* renamed from: d */
    public vt4 f137927d;

    /* renamed from: e */
    public int f137928e;

    /* renamed from: f */
    public int f137929f;

    /* renamed from: g */
    public int f137930g;

    /* renamed from: h */
    public int f137931h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ma4)) {
            return false;
        }
        ma4 ma4 = (ma4) aVar;
        return C46238a.m51546a(this.f137927d, ma4.f137927d) && C46238a.m51546a(Integer.valueOf(this.f137928e), Integer.valueOf(ma4.f137928e)) && C46238a.m51546a(Integer.valueOf(this.f137929f), Integer.valueOf(ma4.f137929f)) && C46238a.m51546a(Integer.valueOf(this.f137930g), Integer.valueOf(ma4.f137930g)) && C46238a.m51546a(Integer.valueOf(this.f137931h), Integer.valueOf(ma4.f137931h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            vt4 vt4 = this.f137927d;
            if (vt4 != null) {
                if (vt4 != null) {
                    aVar.mo74322i(1, vt4.computeSize());
                    this.f137927d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f137928e);
                aVar.mo74318e(3, this.f137929f);
                aVar.mo74318e(4, this.f137930g);
                aVar.mo74318e(5, this.f137931h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Addr");
        } else if (i == 1) {
            vt4 vt42 = this.f137927d;
            if (vt42 != null) {
                i2 = 0 + C52418a.m58682i(1, vt42.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f137928e) + C52418a.m58678e(3, this.f137929f) + C52418a.m58678e(4, this.f137930g) + C52418a.m58678e(5, this.f137931h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137927d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Addr");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ma4 ma4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    vt4 vt43 = new vt4();
                    if (bArr != null && bArr.length > 0) {
                        vt43.parseFrom(bArr);
                    }
                    ma4.f137927d = vt43;
                }
                return 0;
            } else if (intValue == 2) {
                ma4.f137928e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ma4.f137929f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ma4.f137930g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ma4.f137931h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
