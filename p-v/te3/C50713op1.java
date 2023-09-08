package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.op1 */
public class C50713op1 extends C47465a {

    /* renamed from: d */
    public C51174ry0 f139306d;

    /* renamed from: e */
    public C50303ls0 f139307e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50713op1)) {
            return false;
        }
        C50713op1 op12 = (C50713op1) aVar;
        return C46238a.m51546a(this.f139306d, op12.f139306d) && C46238a.m51546a(this.f139307e, op12.f139307e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51174ry0 ry02 = this.f139306d;
            if (ry02 != null) {
                aVar.mo74322i(1, ry02.computeSize());
                this.f139306d.writeFields(aVar);
            }
            C50303ls0 ls02 = this.f139307e;
            if (ls02 != null) {
                aVar.mo74322i(2, ls02.computeSize());
                this.f139307e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51174ry0 ry03 = this.f139306d;
            if (ry03 != null) {
                i2 = 0 + C52418a.m58682i(1, ry03.computeSize());
            }
            C50303ls0 ls03 = this.f139307e;
            return ls03 != null ? i2 + C52418a.m58682i(2, ls03.computeSize()) : i2;
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
            C50713op1 op12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51174ry0 ry04 = new C51174ry0();
                    if (bArr != null && bArr.length > 0) {
                        ry04.parseFrom(bArr);
                    }
                    op12.f139306d = ry04;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50303ls0 ls04 = new C50303ls0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ls04.parseFrom(bArr2);
                    }
                    op12.f139307e = ls04;
                }
                return 0;
            }
        }
    }
}
