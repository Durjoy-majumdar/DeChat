package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tq1 */
public class C51431tq1 extends C47465a {

    /* renamed from: d */
    public long f142357d;

    /* renamed from: e */
    public String f142358e;

    /* renamed from: f */
    public int f142359f;

    /* renamed from: g */
    public C49712hj1 f142360g;

    /* renamed from: h */
    public String f142361h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51431tq1)) {
            return false;
        }
        C51431tq1 tq12 = (C51431tq1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142357d), Long.valueOf(tq12.f142357d)) && C46238a.m51546a(this.f142358e, tq12.f142358e) && C46238a.m51546a(Integer.valueOf(this.f142359f), Integer.valueOf(tq12.f142359f)) && C46238a.m51546a(this.f142360g, tq12.f142360g) && C46238a.m51546a(this.f142361h, tq12.f142361h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142357d);
            String str = this.f142358e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f142359f);
            C49712hj1 hj12 = this.f142360g;
            if (hj12 != null) {
                aVar.mo74322i(4, hj12.computeSize());
                this.f142360g.writeFields(aVar);
            }
            String str2 = this.f142361h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f142357d) + 0;
            String str3 = this.f142358e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            int e = h + C52418a.m58678e(3, this.f142359f);
            C49712hj1 hj13 = this.f142360g;
            if (hj13 != null) {
                e += C52418a.m58682i(4, hj13.computeSize());
            }
            String str4 = this.f142361h;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C51431tq1 tq12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tq12.f142357d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                tq12.f142358e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                tq12.f142359f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49712hj1 hj14 = new C49712hj1();
                    if (bArr != null && bArr.length > 0) {
                        hj14.parseFrom(bArr);
                    }
                    tq12.f142360g = hj14;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                tq12.f142361h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
