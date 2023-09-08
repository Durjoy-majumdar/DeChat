package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.us1 */
public class C51591us1 extends C47465a {

    /* renamed from: d */
    public String f143068d;

    /* renamed from: e */
    public C51149rs1 f143069e;

    /* renamed from: f */
    public C89349b f143070f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51591us1)) {
            return false;
        }
        C51591us1 us12 = (C51591us1) aVar;
        return C46238a.m51546a(this.f143068d, us12.f143068d) && C46238a.m51546a(this.f143069e, us12.f143069e) && C46238a.m51546a(this.f143070f, us12.f143070f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143068d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51149rs1 rs12 = this.f143069e;
            if (rs12 != null) {
                aVar.mo74322i(2, rs12.computeSize());
                this.f143069e.writeFields(aVar);
            }
            C89349b bVar = this.f143070f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f143068d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C51149rs1 rs13 = this.f143069e;
            if (rs13 != null) {
                i2 += C52418a.m58682i(2, rs13.computeSize());
            }
            C89349b bVar2 = this.f143070f;
            return bVar2 != null ? i2 + C52418a.m58675b(3, bVar2) : i2;
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
            C51591us1 us12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                us12.f143068d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51149rs1 rs14 = new C51149rs1();
                    if (bArr != null && bArr.length > 0) {
                        rs14.parseFrom(bArr);
                    }
                    us12.f143069e = rs14;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                us12.f143070f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
