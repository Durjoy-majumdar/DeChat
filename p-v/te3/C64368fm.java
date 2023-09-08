package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fm */
public class C64368fm extends C47465a {

    /* renamed from: d */
    public C89349b f183148d;

    /* renamed from: e */
    public long f183149e;

    /* renamed from: f */
    public long f183150f;

    /* renamed from: g */
    public boolean f183151g;

    /* renamed from: h */
    public long f183152h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64368fm)) {
            return false;
        }
        C64368fm fmVar = (C64368fm) aVar;
        return C46238a.m51546a(this.f183148d, fmVar.f183148d) && C46238a.m51546a(Long.valueOf(this.f183149e), Long.valueOf(fmVar.f183149e)) && C46238a.m51546a(Long.valueOf(this.f183150f), Long.valueOf(fmVar.f183150f)) && C46238a.m51546a(Boolean.valueOf(this.f183151g), Boolean.valueOf(fmVar.f183151g)) && C46238a.m51546a(Long.valueOf(this.f183152h), Long.valueOf(fmVar.f183152h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f183148d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            aVar.mo74321h(2, this.f183149e);
            aVar.mo74321h(3, this.f183150f);
            aVar.mo74314a(4, this.f183151g);
            aVar.mo74321h(5, this.f183152h);
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f183148d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            return i2 + C52418a.m58681h(2, this.f183149e) + C52418a.m58681h(3, this.f183150f) + C52418a.m58674a(4, this.f183151g) + C52418a.m58681h(5, this.f183152h);
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
            C64368fm fmVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fmVar.f183148d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                fmVar.f183149e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                fmVar.f183150f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                fmVar.f183151g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                fmVar.f183152h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
