package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ym1 */
public class C52137ym1 extends C47465a {

    /* renamed from: d */
    public C64370fp1 f145400d;

    /* renamed from: e */
    public String f145401e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52137ym1)) {
            return false;
        }
        C52137ym1 ym12 = (C52137ym1) aVar;
        return C46238a.m51546a(this.f145400d, ym12.f145400d) && C46238a.m51546a(this.f145401e, ym12.f145401e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64370fp1 fp12 = this.f145400d;
            if (fp12 != null) {
                aVar.mo74322i(1, fp12.computeSize());
                this.f145400d.writeFields(aVar);
            }
            String str = this.f145401e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C64370fp1 fp13 = this.f145400d;
            if (fp13 != null) {
                i2 = 0 + C52418a.m58682i(1, fp13.computeSize());
            }
            String str2 = this.f145401e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C52137ym1 ym12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64370fp1 fp14 = new C64370fp1();
                    if (bArr != null && bArr.length > 0) {
                        fp14.parseFrom(bArr);
                    }
                    ym12.f145400d = fp14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ym12.f145401e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
