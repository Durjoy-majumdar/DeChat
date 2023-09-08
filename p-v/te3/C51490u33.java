package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u33 */
public class C51490u33 extends C47465a {

    /* renamed from: d */
    public int f142576d;

    /* renamed from: e */
    public int f142577e;

    /* renamed from: f */
    public int f142578f;

    /* renamed from: g */
    public C51051r23 f142579g;

    /* renamed from: h */
    public C50691oj1 f142580h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51490u33)) {
            return false;
        }
        C51490u33 u332 = (C51490u33) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142576d), Integer.valueOf(u332.f142576d)) && C46238a.m51546a(Integer.valueOf(this.f142577e), Integer.valueOf(u332.f142577e)) && C46238a.m51546a(Integer.valueOf(this.f142578f), Integer.valueOf(u332.f142578f)) && C46238a.m51546a(this.f142579g, u332.f142579g) && C46238a.m51546a(this.f142580h, u332.f142580h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142576d);
            aVar.mo74318e(2, this.f142577e);
            aVar.mo74318e(3, this.f142578f);
            C51051r23 r232 = this.f142579g;
            if (r232 != null) {
                aVar.mo74322i(4, r232.computeSize());
                this.f142579g.writeFields(aVar);
            }
            C50691oj1 oj12 = this.f142580h;
            if (oj12 != null) {
                aVar.mo74322i(5, oj12.computeSize());
                this.f142580h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142576d) + 0 + C52418a.m58678e(2, this.f142577e) + C52418a.m58678e(3, this.f142578f);
            C51051r23 r233 = this.f142579g;
            if (r233 != null) {
                e += C52418a.m58682i(4, r233.computeSize());
            }
            C50691oj1 oj13 = this.f142580h;
            return oj13 != null ? e + C52418a.m58682i(5, oj13.computeSize()) : e;
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
            C51490u33 u332 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u332.f142576d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                u332.f142577e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                u332.f142578f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51051r23 r234 = new C51051r23();
                    if (bArr != null && bArr.length > 0) {
                        r234.parseFrom(bArr);
                    }
                    u332.f142579g = r234;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50691oj1 oj14 = new C50691oj1();
                    if (bArr2 != null && bArr2.length > 0) {
                        oj14.parseFrom(bArr2);
                    }
                    u332.f142580h = oj14;
                }
                return 0;
            }
        }
    }
}
