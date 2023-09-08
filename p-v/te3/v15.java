package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class v15 extends C47465a {

    /* renamed from: d */
    public String f143249d;

    /* renamed from: e */
    public int f143250e;

    /* renamed from: f */
    public C89349b f143251f;

    /* renamed from: g */
    public boolean f143252g;

    /* renamed from: h */
    public boolean f143253h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v15)) {
            return false;
        }
        v15 v15 = (v15) aVar;
        return C46238a.m51546a(this.f143249d, v15.f143249d) && C46238a.m51546a(Integer.valueOf(this.f143250e), Integer.valueOf(v15.f143250e)) && C46238a.m51546a(this.f143251f, v15.f143251f) && C46238a.m51546a(Boolean.valueOf(this.f143252g), Boolean.valueOf(v15.f143252g)) && C46238a.m51546a(Boolean.valueOf(this.f143253h), Boolean.valueOf(v15.f143253h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143249d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f143250e);
                C89349b bVar = this.f143251f;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74314a(4, this.f143252g);
                aVar.mo74314a(5, this.f143253h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Talker");
        } else if (i == 1) {
            String str2 = this.f143249d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f143250e);
            C89349b bVar2 = this.f143251f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            return e + C52418a.m58674a(4, this.f143252g) + C52418a.m58674a(5, this.f143253h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143249d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Talker");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            v15 v15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v15.f143249d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                v15.f143250e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                v15.f143251f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                v15.f143252g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                v15.f143253h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
