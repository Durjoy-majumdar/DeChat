package y43;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.k */
public class C66500k extends C47465a {

    /* renamed from: d */
    public C66502u f191299d;

    /* renamed from: e */
    public String f191300e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C66500k)) {
            return false;
        }
        C66500k kVar = (C66500k) aVar;
        return C46238a.m51546a(this.f191299d, kVar.f191299d) && C46238a.m51546a(this.f191300e, kVar.f191300e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C66502u uVar = this.f191299d;
            if (uVar != null) {
                aVar.mo74322i(1, uVar.computeSize());
                this.f191299d.writeFields(aVar);
            }
            String str = this.f191300e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C66502u uVar2 = this.f191299d;
            if (uVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, uVar2.computeSize());
            }
            String str2 = this.f191300e;
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
            C66500k kVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C66502u uVar3 = new C66502u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.parseFrom(bArr);
                    }
                    kVar.f191299d = uVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                kVar.f191300e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
