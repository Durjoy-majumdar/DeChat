package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ry4 extends C47465a {

    /* renamed from: d */
    public C89349b f185305d;

    /* renamed from: e */
    public C89349b f185306e;

    /* renamed from: f */
    public C89349b f185307f;

    /* renamed from: g */
    public C89349b f185308g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ry4)) {
            return false;
        }
        ry4 ry4 = (ry4) aVar;
        return C46238a.m51546a(this.f185305d, ry4.f185305d) && C46238a.m51546a(this.f185306e, ry4.f185306e) && C46238a.m51546a(this.f185307f, ry4.f185307f) && C46238a.m51546a(this.f185308g, ry4.f185308g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f185305d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C89349b bVar2 = this.f185306e;
            if (bVar2 != null) {
                aVar.mo74315b(2, bVar2);
            }
            C89349b bVar3 = this.f185307f;
            if (bVar3 != null) {
                aVar.mo74315b(3, bVar3);
            }
            C89349b bVar4 = this.f185308g;
            if (bVar4 != null) {
                aVar.mo74315b(4, bVar4);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar5 = this.f185305d;
            if (bVar5 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar5);
            }
            C89349b bVar6 = this.f185306e;
            if (bVar6 != null) {
                i2 += C52418a.m58675b(2, bVar6);
            }
            C89349b bVar7 = this.f185307f;
            if (bVar7 != null) {
                i2 += C52418a.m58675b(3, bVar7);
            }
            C89349b bVar8 = this.f185308g;
            return bVar8 != null ? i2 + C52418a.m58675b(4, bVar8) : i2;
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
            ry4 ry4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ry4.f185305d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                ry4.f185306e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                ry4.f185307f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ry4.f185308g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
