package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mw3 */
public class C50460mw3 extends C47465a {

    /* renamed from: d */
    public C101856vd f138249d;

    /* renamed from: e */
    public LinkedList<C51378td> f138250e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f138251f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50460mw3)) {
            return false;
        }
        C50460mw3 mw32 = (C50460mw3) aVar;
        return C46238a.m51546a(this.f138249d, mw32.f138249d) && C46238a.m51546a(this.f138250e, mw32.f138250e) && C46238a.m51546a(this.f138251f, mw32.f138251f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101856vd vdVar = this.f138249d;
            if (vdVar != null) {
                aVar.mo74322i(1, vdVar.computeSize());
                this.f138249d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f138250e);
            C89349b bVar = this.f138251f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            C101856vd vdVar2 = this.f138249d;
            if (vdVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, vdVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f138250e);
            C89349b bVar2 = this.f138251f;
            return bVar2 != null ? g + C52418a.m58675b(3, bVar2) : g;
        } else if (i == 2) {
            this.f138250e.clear();
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
            C50460mw3 mw32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C101856vd vdVar3 = new C101856vd();
                    if (bArr != null && bArr.length > 0) {
                        vdVar3.parseFrom(bArr);
                    }
                    mw32.f138249d = vdVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51378td tdVar = new C51378td();
                    if (bArr2 != null && bArr2.length > 0) {
                        tdVar.parseFrom(bArr2);
                    }
                    mw32.f138250e.add(tdVar);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                mw32.f138251f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
