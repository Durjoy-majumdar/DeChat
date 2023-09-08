package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oq2 */
public class C50717oq2 extends C47465a {

    /* renamed from: d */
    public int f139314d;

    /* renamed from: e */
    public int f139315e;

    /* renamed from: f */
    public C51833wh0 f139316f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50717oq2)) {
            return false;
        }
        C50717oq2 oq22 = (C50717oq2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139314d), Integer.valueOf(oq22.f139314d)) && C46238a.m51546a(Integer.valueOf(this.f139315e), Integer.valueOf(oq22.f139315e)) && C46238a.m51546a(this.f139316f, oq22.f139316f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139314d);
            aVar.mo74318e(2, this.f139315e);
            C51833wh0 wh02 = this.f139316f;
            if (wh02 != null) {
                aVar.mo74322i(3, wh02.computeSize());
                this.f139316f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139314d) + 0 + C52418a.m58678e(2, this.f139315e);
            C51833wh0 wh03 = this.f139316f;
            return wh03 != null ? e + C52418a.m58682i(3, wh03.computeSize()) : e;
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
            C50717oq2 oq22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                oq22.f139314d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                oq22.f139315e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51833wh0 wh04 = new C51833wh0();
                    if (bArr != null && bArr.length > 0) {
                        wh04.parseFrom(bArr);
                    }
                    oq22.f139316f = wh04;
                }
                return 0;
            }
        }
    }
}
