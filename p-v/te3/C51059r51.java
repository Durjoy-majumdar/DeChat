package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r51 */
public class C51059r51 extends C47465a {

    /* renamed from: d */
    public long f140705d;

    /* renamed from: e */
    public int f140706e;

    /* renamed from: f */
    public C89349b f140707f;

    /* renamed from: g */
    public boolean f140708g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51059r51)) {
            return false;
        }
        C51059r51 r512 = (C51059r51) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140705d), Long.valueOf(r512.f140705d)) && C46238a.m51546a(Integer.valueOf(this.f140706e), Integer.valueOf(r512.f140706e)) && C46238a.m51546a(this.f140707f, r512.f140707f) && C46238a.m51546a(Boolean.valueOf(this.f140708g), Boolean.valueOf(r512.f140708g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140705d);
            aVar.mo74318e(2, this.f140706e);
            C89349b bVar = this.f140707f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74314a(4, this.f140708g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f140705d) + 0 + C52418a.m58678e(2, this.f140706e);
            C89349b bVar2 = this.f140707f;
            if (bVar2 != null) {
                h += C52418a.m58675b(3, bVar2);
            }
            return h + C52418a.m58674a(4, this.f140708g);
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
            C51059r51 r512 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r512.f140705d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                r512.f140706e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                r512.f140707f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                r512.f140708g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
