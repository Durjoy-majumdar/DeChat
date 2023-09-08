package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mf2 */
public class C50395mf2 extends C47465a {

    /* renamed from: d */
    public C89349b f138003d;

    /* renamed from: e */
    public C89349b f138004e;

    /* renamed from: f */
    public C89349b f138005f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50395mf2)) {
            return false;
        }
        C50395mf2 mf22 = (C50395mf2) aVar;
        return C46238a.m51546a(this.f138003d, mf22.f138003d) && C46238a.m51546a(this.f138004e, mf22.f138004e) && C46238a.m51546a(this.f138005f, mf22.f138005f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f138003d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C89349b bVar2 = this.f138004e;
            if (bVar2 != null) {
                aVar.mo74315b(2, bVar2);
            }
            C89349b bVar3 = this.f138005f;
            if (bVar3 != null) {
                aVar.mo74315b(3, bVar3);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar4 = this.f138003d;
            if (bVar4 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar4);
            }
            C89349b bVar5 = this.f138004e;
            if (bVar5 != null) {
                i2 += C52418a.m58675b(2, bVar5);
            }
            C89349b bVar6 = this.f138005f;
            return bVar6 != null ? i2 + C52418a.m58675b(3, bVar6) : i2;
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
            C50395mf2 mf22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mf22.f138003d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                mf22.f138004e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                mf22.f138005f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
