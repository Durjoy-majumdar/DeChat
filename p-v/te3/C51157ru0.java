package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ru0 */
public class C51157ru0 extends C47465a {

    /* renamed from: d */
    public long f141149d;

    /* renamed from: e */
    public C64370fp1 f141150e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51157ru0)) {
            return false;
        }
        C51157ru0 ru02 = (C51157ru0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f141149d), Long.valueOf(ru02.f141149d)) && C46238a.m51546a(this.f141150e, ru02.f141150e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f141149d);
            C64370fp1 fp12 = this.f141150e;
            if (fp12 != null) {
                aVar.mo74322i(2, fp12.computeSize());
                this.f141150e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f141149d) + 0;
            C64370fp1 fp13 = this.f141150e;
            return fp13 != null ? h + C52418a.m58682i(2, fp13.computeSize()) : h;
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
            C51157ru0 ru02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ru02.f141149d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64370fp1 fp14 = new C64370fp1();
                    if (bArr != null && bArr.length > 0) {
                        fp14.parseFrom(bArr);
                    }
                    ru02.f141150e = fp14;
                }
                return 0;
            }
        }
    }
}
