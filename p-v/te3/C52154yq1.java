package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yq1 */
public class C52154yq1 extends C47465a {

    /* renamed from: d */
    public String f145460d;

    /* renamed from: e */
    public long f145461e;

    /* renamed from: f */
    public C89349b f145462f;

    /* renamed from: g */
    public String f145463g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52154yq1)) {
            return false;
        }
        C52154yq1 yq12 = (C52154yq1) aVar;
        return C46238a.m51546a(this.f145460d, yq12.f145460d) && C46238a.m51546a(Long.valueOf(this.f145461e), Long.valueOf(yq12.f145461e)) && C46238a.m51546a(this.f145462f, yq12.f145462f) && C46238a.m51546a(this.f145463g, yq12.f145463g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145460d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f145461e);
            C89349b bVar = this.f145462f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f145463g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f145460d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f145461e);
            C89349b bVar2 = this.f145462f;
            if (bVar2 != null) {
                h += C52418a.m58675b(3, bVar2);
            }
            String str4 = this.f145463g;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
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
            C52154yq1 yq12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yq12.f145460d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                yq12.f145461e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                yq12.f145462f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                yq12.f145463g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
