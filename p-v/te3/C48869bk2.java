package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bk2 */
public class C48869bk2 extends C47465a {

    /* renamed from: d */
    public String f131168d;

    /* renamed from: e */
    public String f131169e;

    /* renamed from: f */
    public String f131170f;

    /* renamed from: g */
    public LinkedList<String> f131171g = new LinkedList<>();

    /* renamed from: h */
    public int f131172h;

    /* renamed from: i */
    public int f131173i;

    /* renamed from: j */
    public String f131174j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48869bk2)) {
            return false;
        }
        C48869bk2 bk22 = (C48869bk2) aVar;
        return C46238a.m51546a(this.f131168d, bk22.f131168d) && C46238a.m51546a(this.f131169e, bk22.f131169e) && C46238a.m51546a(this.f131170f, bk22.f131170f) && C46238a.m51546a(this.f131171g, bk22.f131171g) && C46238a.m51546a(Integer.valueOf(this.f131172h), Integer.valueOf(bk22.f131172h)) && C46238a.m51546a(Integer.valueOf(this.f131173i), Integer.valueOf(bk22.f131173i)) && C46238a.m51546a(this.f131174j, bk22.f131174j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131168d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131169e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f131170f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 1, this.f131171g);
            aVar.mo74318e(5, this.f131172h);
            aVar.mo74318e(6, this.f131173i);
            String str4 = this.f131174j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f131168d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f131169e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f131170f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int g = i2 + C52418a.m58680g(4, 1, this.f131171g) + C52418a.m58678e(5, this.f131172h) + C52418a.m58678e(6, this.f131173i);
            String str8 = this.f131174j;
            return str8 != null ? g + C52418a.m58683j(7, str8) : g;
        } else if (i == 2) {
            this.f131171g.clear();
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
            C48869bk2 bk22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bk22.f131168d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bk22.f131169e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bk22.f131170f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bk22.f131171g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    bk22.f131172h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    bk22.f131173i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    bk22.f131174j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
