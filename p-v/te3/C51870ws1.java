package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ws1 */
public class C51870ws1 extends C47465a {

    /* renamed from: d */
    public String f144243d;

    /* renamed from: e */
    public String f144244e;

    /* renamed from: f */
    public int f144245f;

    /* renamed from: g */
    public C89349b f144246g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51870ws1)) {
            return false;
        }
        C51870ws1 ws12 = (C51870ws1) aVar;
        return C46238a.m51546a(this.f144243d, ws12.f144243d) && C46238a.m51546a(this.f144244e, ws12.f144244e) && C46238a.m51546a(Integer.valueOf(this.f144245f), Integer.valueOf(ws12.f144245f)) && C46238a.m51546a(this.f144246g, ws12.f144246g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144243d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144244e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f144245f);
            C89349b bVar = this.f144246g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f144243d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f144244e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f144245f);
            C89349b bVar2 = this.f144246g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C51870ws1 ws12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ws12.f144243d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ws12.f144244e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ws12.f144245f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ws12.f144246g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
