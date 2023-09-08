package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p21 */
public class C50770p21 extends C47465a {

    /* renamed from: d */
    public C50626o21 f139534d;

    /* renamed from: e */
    public C50483n21 f139535e;

    /* renamed from: f */
    public boolean f139536f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50770p21)) {
            return false;
        }
        C50770p21 p212 = (C50770p21) aVar;
        return C46238a.m51546a(this.f139534d, p212.f139534d) && C46238a.m51546a(this.f139535e, p212.f139535e) && C46238a.m51546a(Boolean.valueOf(this.f139536f), Boolean.valueOf(p212.f139536f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50626o21 o212 = this.f139534d;
            if (o212 != null) {
                aVar.mo74322i(1, o212.computeSize());
                this.f139534d.writeFields(aVar);
            }
            C50483n21 n212 = this.f139535e;
            if (n212 != null) {
                aVar.mo74322i(2, n212.computeSize());
                this.f139535e.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f139536f);
            return 0;
        } else if (i == 1) {
            C50626o21 o213 = this.f139534d;
            if (o213 != null) {
                i2 = 0 + C52418a.m58682i(1, o213.computeSize());
            }
            C50483n21 n213 = this.f139535e;
            if (n213 != null) {
                i2 += C52418a.m58682i(2, n213.computeSize());
            }
            return i2 + C52418a.m58674a(3, this.f139536f);
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
            C50770p21 p212 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50626o21 o214 = new C50626o21();
                    if (bArr != null && bArr.length > 0) {
                        o214.parseFrom(bArr);
                    }
                    p212.f139534d = o214;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50483n21 n214 = new C50483n21();
                    if (bArr2 != null && bArr2.length > 0) {
                        n214.parseFrom(bArr2);
                    }
                    p212.f139535e = n214;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                p212.f139536f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
