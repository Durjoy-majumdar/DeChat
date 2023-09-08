package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cn3 */
public class C49028cn3 extends C47465a {

    /* renamed from: d */
    public String f131839d;

    /* renamed from: e */
    public LinkedList<Integer> f131840e = new LinkedList<>();

    /* renamed from: f */
    public int f131841f;

    /* renamed from: g */
    public String f131842g;

    /* renamed from: h */
    public String f131843h;

    /* renamed from: i */
    public int f131844i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49028cn3)) {
            return false;
        }
        C49028cn3 cn32 = (C49028cn3) aVar;
        return C46238a.m51546a(this.f131839d, cn32.f131839d) && C46238a.m51546a(this.f131840e, cn32.f131840e) && C46238a.m51546a(Integer.valueOf(this.f131841f), Integer.valueOf(cn32.f131841f)) && C46238a.m51546a(this.f131842g, cn32.f131842g) && C46238a.m51546a(this.f131843h, cn32.f131843h) && C46238a.m51546a(Integer.valueOf(this.f131844i), Integer.valueOf(cn32.f131844i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131839d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 2, this.f131840e);
            aVar.mo74318e(3, this.f131841f);
            String str2 = this.f131842g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f131843h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(100, this.f131844i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f131839d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int g = i2 + C52418a.m58680g(2, 2, this.f131840e) + C52418a.m58678e(3, this.f131841f);
            String str5 = this.f131842g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f131843h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            return g + C52418a.m58678e(100, this.f131844i);
        } else if (i == 2) {
            this.f131840e.clear();
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
            C49028cn3 cn32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cn32.f131839d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                cn32.f131840e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 3) {
                cn32.f131841f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                cn32.f131842g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                cn32.f131843h = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                cn32.f131844i = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
