package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e0 */
public class C118426e0 extends C47465a {

    /* renamed from: d */
    public String f353962d;

    /* renamed from: e */
    public String f353963e;

    /* renamed from: f */
    public String f353964f;

    /* renamed from: g */
    public String f353965g;

    /* renamed from: h */
    public String f353966h;

    /* renamed from: i */
    public String f353967i;

    /* renamed from: j */
    public LinkedList<String> f353968j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118426e0)) {
            return false;
        }
        C118426e0 e0Var = (C118426e0) aVar;
        return C46238a.m51546a(this.f353962d, e0Var.f353962d) && C46238a.m51546a(this.f353963e, e0Var.f353963e) && C46238a.m51546a(this.f353964f, e0Var.f353964f) && C46238a.m51546a(this.f353965g, e0Var.f353965g) && C46238a.m51546a(this.f353966h, e0Var.f353966h) && C46238a.m51546a(this.f353967i, e0Var.f353967i) && C46238a.m51546a(this.f353968j, e0Var.f353968j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353962d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f353963e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f353964f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f353965g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f353966h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f353967i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74320g(7, 1, this.f353968j);
            return 0;
        } else if (i == 1) {
            String str7 = this.f353962d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f353963e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f353964f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f353965g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f353966h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f353967i;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            return i2 + C52418a.m58680g(7, 1, this.f353968j);
        } else if (i == 2) {
            this.f353968j.clear();
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
            C118426e0 e0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e0Var.f353962d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e0Var.f353963e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e0Var.f353964f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e0Var.f353965g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    e0Var.f353966h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e0Var.f353967i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e0Var.f353968j.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
