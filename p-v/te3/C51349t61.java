package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t61 */
public class C51349t61 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f141981d;

    /* renamed from: e */
    public LinkedList<C51228sd2> f141982e = new LinkedList<>();

    /* renamed from: f */
    public int f141983f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51349t61)) {
            return false;
        }
        C51349t61 t612 = (C51349t61) aVar;
        return C46238a.m51546a(this.f141981d, t612.f141981d) && C46238a.m51546a(this.f141982e, t612.f141982e) && C46238a.m51546a(Integer.valueOf(this.f141983f), Integer.valueOf(t612.f141983f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f141981d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f141981d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f141982e);
            aVar.mo74318e(3, this.f141983f);
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f141981d;
            if (hx03 != null) {
                i2 = 0 + C52418a.m58682i(1, hx03.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f141982e) + C52418a.m58678e(3, this.f141983f);
        } else if (i == 2) {
            this.f141982e.clear();
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
            C51349t61 t612 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49765hx0 hx04 = new C49765hx0();
                    if (bArr != null && bArr.length > 0) {
                        hx04.parseFrom(bArr);
                    }
                    t612.f141981d = hx04;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51228sd2 sd22 = new C51228sd2();
                    if (bArr2 != null && bArr2.length > 0) {
                        sd22.parseFrom(bArr2);
                    }
                    t612.f141982e.add(sd22);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                t612.f141983f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
