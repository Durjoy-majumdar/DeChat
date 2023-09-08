package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rw */
public class C51164rw extends C47465a {

    /* renamed from: d */
    public C89349b f141177d;

    /* renamed from: e */
    public C89349b f141178e;

    /* renamed from: f */
    public C89349b f141179f;

    /* renamed from: g */
    public C89349b f141180g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51164rw)) {
            return false;
        }
        C51164rw rwVar = (C51164rw) aVar;
        return C46238a.m51546a(this.f141177d, rwVar.f141177d) && C46238a.m51546a(this.f141178e, rwVar.f141178e) && C46238a.m51546a(this.f141179f, rwVar.f141179f) && C46238a.m51546a(this.f141180g, rwVar.f141180g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f141177d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C89349b bVar2 = this.f141178e;
            if (bVar2 != null) {
                aVar.mo74315b(2, bVar2);
            }
            C89349b bVar3 = this.f141179f;
            if (bVar3 != null) {
                aVar.mo74315b(3, bVar3);
            }
            C89349b bVar4 = this.f141180g;
            if (bVar4 != null) {
                aVar.mo74315b(4, bVar4);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar5 = this.f141177d;
            if (bVar5 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar5);
            }
            C89349b bVar6 = this.f141178e;
            if (bVar6 != null) {
                i2 += C52418a.m58675b(2, bVar6);
            }
            C89349b bVar7 = this.f141179f;
            if (bVar7 != null) {
                i2 += C52418a.m58675b(3, bVar7);
            }
            C89349b bVar8 = this.f141180g;
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
            C51164rw rwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rwVar.f141177d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                rwVar.f141178e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                rwVar.f141179f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                rwVar.f141180g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
