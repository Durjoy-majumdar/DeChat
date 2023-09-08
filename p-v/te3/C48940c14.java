package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c14 */
public class C48940c14 extends C47465a {

    /* renamed from: d */
    public C89349b f131443d;

    /* renamed from: e */
    public String f131444e;

    /* renamed from: f */
    public int f131445f;

    /* renamed from: g */
    public int f131446g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48940c14)) {
            return false;
        }
        C48940c14 c142 = (C48940c14) aVar;
        return C46238a.m51546a(this.f131443d, c142.f131443d) && C46238a.m51546a(this.f131444e, c142.f131444e) && C46238a.m51546a(Integer.valueOf(this.f131445f), Integer.valueOf(c142.f131445f)) && C46238a.m51546a(Integer.valueOf(this.f131446g), Integer.valueOf(c142.f131446g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f131443d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            String str = this.f131444e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f131445f);
            aVar.mo74318e(4, this.f131446g);
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f131443d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            String str2 = this.f131444e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f131445f) + C52418a.m58678e(4, this.f131446g);
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
            C48940c14 c142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c142.f131443d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                c142.f131444e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                c142.f131445f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                c142.f131446g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
