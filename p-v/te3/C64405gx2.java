package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gx2 */
public class C64405gx2 extends C47465a {

    /* renamed from: d */
    public String f183361d;

    /* renamed from: e */
    public int f183362e;

    /* renamed from: f */
    public String f183363f;

    /* renamed from: g */
    public C89349b f183364g;

    /* renamed from: h */
    public boolean f183365h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64405gx2)) {
            return false;
        }
        C64405gx2 gx22 = (C64405gx2) aVar;
        return C46238a.m51546a(this.f183361d, gx22.f183361d) && C46238a.m51546a(Integer.valueOf(this.f183362e), Integer.valueOf(gx22.f183362e)) && C46238a.m51546a(this.f183363f, gx22.f183363f) && C46238a.m51546a(this.f183364g, gx22.f183364g) && C46238a.m51546a(Boolean.valueOf(this.f183365h), Boolean.valueOf(gx22.f183365h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183361d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f183362e);
            String str2 = this.f183363f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C89349b bVar = this.f183364g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74314a(5, this.f183365h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f183361d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f183362e);
            String str4 = this.f183363f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            C89349b bVar2 = this.f183364g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58674a(5, this.f183365h);
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
            C64405gx2 gx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gx22.f183361d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gx22.f183362e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                gx22.f183363f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                gx22.f183364g = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gx22.f183365h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
