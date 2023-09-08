package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class cr4 extends C47465a {

    /* renamed from: d */
    public int f131922d;

    /* renamed from: e */
    public gr4 f131923e;

    /* renamed from: f */
    public er4 f131924f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cr4)) {
            return false;
        }
        cr4 cr4 = (cr4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131922d), Integer.valueOf(cr4.f131922d)) && C46238a.m51546a(this.f131923e, cr4.f131923e) && C46238a.m51546a(this.f131924f, cr4.f131924f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131922d);
            gr4 gr4 = this.f131923e;
            if (gr4 != null) {
                aVar.mo74322i(2, gr4.computeSize());
                this.f131923e.writeFields(aVar);
            }
            er4 er4 = this.f131924f;
            if (er4 != null) {
                aVar.mo74322i(3, er4.computeSize());
                this.f131924f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131922d) + 0;
            gr4 gr42 = this.f131923e;
            if (gr42 != null) {
                e += C52418a.m58682i(2, gr42.computeSize());
            }
            er4 er42 = this.f131924f;
            return er42 != null ? e + C52418a.m58682i(3, er42.computeSize()) : e;
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
            cr4 cr4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cr4.f131922d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    gr4 gr43 = new gr4();
                    if (bArr != null && bArr.length > 0) {
                        gr43.parseFrom(bArr);
                    }
                    cr4.f131923e = gr43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    er4 er43 = new er4();
                    if (bArr2 != null && bArr2.length > 0) {
                        er43.parseFrom(bArr2);
                    }
                    cr4.f131924f = er43;
                }
                return 0;
            }
        }
    }
}
