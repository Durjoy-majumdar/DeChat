package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m40 */
public class C22513m40 extends C47465a {

    /* renamed from: d */
    public String f64220d;

    /* renamed from: e */
    public String f64221e;

    /* renamed from: f */
    public String f64222f;

    /* renamed from: g */
    public LinkedList<String> f64223g = new LinkedList<>();

    /* renamed from: h */
    public String f64224h;

    /* renamed from: i */
    public String f64225i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22513m40)) {
            return false;
        }
        C22513m40 m402 = (C22513m40) aVar;
        return C46238a.m51546a(this.f64220d, m402.f64220d) && C46238a.m51546a(this.f64221e, m402.f64221e) && C46238a.m51546a(this.f64222f, m402.f64222f) && C46238a.m51546a(this.f64223g, m402.f64223g) && C46238a.m51546a(this.f64224h, m402.f64224h) && C46238a.m51546a(this.f64225i, m402.f64225i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64220d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64221e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64222f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 1, this.f64223g);
            String str4 = this.f64224h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f64225i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f64220d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f64221e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f64222f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int g = i2 + C52418a.m58680g(4, 1, this.f64223g);
            String str9 = this.f64224h;
            if (str9 != null) {
                g += C52418a.m58683j(5, str9);
            }
            String str10 = this.f64225i;
            return str10 != null ? g + C52418a.m58683j(6, str10) : g;
        } else if (i == 2) {
            this.f64223g.clear();
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
            C22513m40 m402 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m402.f64220d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m402.f64221e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m402.f64222f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m402.f64223g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    m402.f64224h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m402.f64225i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
