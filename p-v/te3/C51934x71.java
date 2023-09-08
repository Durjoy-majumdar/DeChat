package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x71 */
public class C51934x71 extends C47465a {

    /* renamed from: d */
    public String f144501d;

    /* renamed from: e */
    public int f144502e;

    /* renamed from: f */
    public C49765hx0 f144503f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51934x71)) {
            return false;
        }
        C51934x71 x712 = (C51934x71) aVar;
        return C46238a.m51546a(this.f144501d, x712.f144501d) && C46238a.m51546a(Integer.valueOf(this.f144502e), Integer.valueOf(x712.f144502e)) && C46238a.m51546a(this.f144503f, x712.f144503f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144501d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f144502e);
            C49765hx0 hx02 = this.f144503f;
            if (hx02 != null) {
                aVar.mo74322i(3, hx02.computeSize());
                this.f144503f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f144501d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f144502e);
            C49765hx0 hx03 = this.f144503f;
            return hx03 != null ? e + C52418a.m58682i(3, hx03.computeSize()) : e;
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
            C51934x71 x712 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x712.f144501d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                x712.f144502e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49765hx0 hx04 = new C49765hx0();
                    if (bArr != null && bArr.length > 0) {
                        hx04.parseFrom(bArr);
                    }
                    x712.f144503f = hx04;
                }
                return 0;
            }
        }
    }
}
