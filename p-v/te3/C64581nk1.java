package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nk1 */
public class C64581nk1 extends C47465a {

    /* renamed from: d */
    public String f184475d;

    /* renamed from: e */
    public String f184476e;

    /* renamed from: f */
    public String f184477f;

    /* renamed from: g */
    public LinkedList<String> f184478g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<String> f184479h = new LinkedList<>();

    /* renamed from: i */
    public C89349b f184480i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64581nk1)) {
            return false;
        }
        C64581nk1 nk12 = (C64581nk1) aVar;
        return C46238a.m51546a(this.f184475d, nk12.f184475d) && C46238a.m51546a(this.f184476e, nk12.f184476e) && C46238a.m51546a(this.f184477f, nk12.f184477f) && C46238a.m51546a(this.f184478g, nk12.f184478g) && C46238a.m51546a(this.f184479h, nk12.f184479h) && C46238a.m51546a(this.f184480i, nk12.f184480i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184475d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184476e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184477f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 1, this.f184478g);
            aVar.mo74320g(5, 1, this.f184479h);
            C89349b bVar = this.f184480i;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f184475d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f184476e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f184477f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int g = i2 + C52418a.m58680g(4, 1, this.f184478g) + C52418a.m58680g(5, 1, this.f184479h);
            C89349b bVar2 = this.f184480i;
            return bVar2 != null ? g + C52418a.m58675b(6, bVar2) : g;
        } else if (i == 2) {
            this.f184478g.clear();
            this.f184479h.clear();
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
            C64581nk1 nk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nk12.f184475d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    nk12.f184476e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nk12.f184477f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nk12.f184478g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    nk12.f184479h.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    nk12.f184480i = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
