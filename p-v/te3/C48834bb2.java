package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bb2 */
public class C48834bb2 extends C47465a {

    /* renamed from: d */
    public LinkedList<so4> f131036d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f131037e;

    /* renamed from: f */
    public uo4 f131038f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48834bb2)) {
            return false;
        }
        C48834bb2 bb22 = (C48834bb2) aVar;
        return C46238a.m51546a(this.f131036d, bb22.f131036d) && C46238a.m51546a(this.f131037e, bb22.f131037e) && C46238a.m51546a(this.f131038f, bb22.f131038f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f131036d);
            C89349b bVar = this.f131037e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            uo4 uo4 = this.f131038f;
            if (uo4 != null) {
                aVar.mo74322i(5, uo4.computeSize());
                this.f131038f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f131036d) + 0;
            C89349b bVar2 = this.f131037e;
            if (bVar2 != null) {
                g += C52418a.m58675b(2, bVar2);
            }
            uo4 uo42 = this.f131038f;
            return uo42 != null ? g + C52418a.m58682i(5, uo42.computeSize()) : g;
        } else if (i == 2) {
            this.f131036d.clear();
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
            C48834bb2 bb22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    so4 so4 = new so4();
                    if (bArr != null && bArr.length > 0) {
                        so4.parseFrom(bArr);
                    }
                    bb22.f131036d.add(so4);
                }
                return 0;
            } else if (intValue == 2) {
                bb22.f131037e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    uo4 uo43 = new uo4();
                    if (bArr2 != null && bArr2.length > 0) {
                        uo43.parseFrom(bArr2);
                    }
                    bb22.f131038f = uo43;
                }
                return 0;
            }
        }
    }
}
