package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mh0 */
public class C50401mh0 extends C47465a {

    /* renamed from: d */
    public int f138028d;

    /* renamed from: e */
    public C89349b f138029e;

    /* renamed from: f */
    public String f138030f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50401mh0)) {
            return false;
        }
        C50401mh0 mh02 = (C50401mh0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138028d), Integer.valueOf(mh02.f138028d)) && C46238a.m51546a(this.f138029e, mh02.f138029e) && C46238a.m51546a(this.f138030f, mh02.f138030f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138028d);
            C89349b bVar = this.f138029e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str = this.f138030f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138028d) + 0;
            C89349b bVar2 = this.f138029e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            String str2 = this.f138030f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C50401mh0 mh02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mh02.f138028d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                mh02.f138029e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                mh02.f138030f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
