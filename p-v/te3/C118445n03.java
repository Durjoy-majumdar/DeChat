package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n03 */
public class C118445n03 extends C47465a {

    /* renamed from: d */
    public fh4 f354143d;

    /* renamed from: e */
    public boolean f354144e;

    /* renamed from: f */
    public long f354145f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118445n03)) {
            return false;
        }
        C118445n03 n032 = (C118445n03) aVar;
        return C46238a.m51546a(this.f354143d, n032.f354143d) && C46238a.m51546a(Boolean.valueOf(this.f354144e), Boolean.valueOf(n032.f354144e)) && C46238a.m51546a(Long.valueOf(this.f354145f), Long.valueOf(n032.f354145f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            fh4 fh4 = this.f354143d;
            if (fh4 != null) {
                aVar.mo74322i(1, fh4.computeSize());
                this.f354143d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f354144e);
            aVar.mo74321h(3, this.f354145f);
            return 0;
        } else if (i == 1) {
            fh4 fh42 = this.f354143d;
            if (fh42 != null) {
                i2 = 0 + C52418a.m58682i(1, fh42.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f354144e) + C52418a.m58681h(3, this.f354145f);
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
            C118445n03 n032 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    fh4 fh43 = new fh4();
                    if (bArr != null && bArr.length > 0) {
                        fh43.parseFrom(bArr);
                    }
                    n032.f354143d = fh43;
                }
                return 0;
            } else if (intValue == 2) {
                n032.f354144e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                n032.f354145f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}