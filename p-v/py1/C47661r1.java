package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.r1 */
public class C47661r1 extends C47465a {

    /* renamed from: d */
    public String f127962d;

    /* renamed from: e */
    public String f127963e;

    /* renamed from: f */
    public LinkedList<String> f127964f = new LinkedList<>();

    /* renamed from: g */
    public String f127965g;

    /* renamed from: h */
    public String f127966h;

    /* renamed from: i */
    public String f127967i;

    /* renamed from: j */
    public String f127968j;

    /* renamed from: n */
    public String f127969n;

    /* renamed from: o */
    public C47589h f127970o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47661r1)) {
            return false;
        }
        C47661r1 r1Var = (C47661r1) aVar;
        return C46238a.m51546a(this.f127962d, r1Var.f127962d) && C46238a.m51546a(this.f127963e, r1Var.f127963e) && C46238a.m51546a(this.f127964f, r1Var.f127964f) && C46238a.m51546a(this.f127965g, r1Var.f127965g) && C46238a.m51546a(this.f127966h, r1Var.f127966h) && C46238a.m51546a(this.f127967i, r1Var.f127967i) && C46238a.m51546a(this.f127968j, r1Var.f127968j) && C46238a.m51546a(this.f127969n, r1Var.f127969n) && C46238a.m51546a(this.f127970o, r1Var.f127970o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127962d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127963e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 1, this.f127964f);
            String str3 = this.f127965g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f127966h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f127967i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f127968j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f127969n;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            C47589h hVar = this.f127970o;
            if (hVar != null) {
                aVar.mo74322i(10, hVar.computeSize());
                this.f127970o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f127962d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f127963e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f127964f);
            String str10 = this.f127965g;
            if (str10 != null) {
                g += C52418a.m58683j(4, str10);
            }
            String str11 = this.f127966h;
            if (str11 != null) {
                g += C52418a.m58683j(5, str11);
            }
            String str12 = this.f127967i;
            if (str12 != null) {
                g += C52418a.m58683j(6, str12);
            }
            String str13 = this.f127968j;
            if (str13 != null) {
                g += C52418a.m58683j(8, str13);
            }
            String str14 = this.f127969n;
            if (str14 != null) {
                g += C52418a.m58683j(9, str14);
            }
            C47589h hVar2 = this.f127970o;
            return hVar2 != null ? g + C52418a.m58682i(10, hVar2.computeSize()) : g;
        } else if (i == 2) {
            this.f127964f.clear();
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
            C47661r1 r1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    r1Var.f127962d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    r1Var.f127963e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    r1Var.f127964f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    r1Var.f127965g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    r1Var.f127966h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    r1Var.f127967i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    r1Var.f127968j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    r1Var.f127969n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47589h hVar3 = new C47589h();
                        if (bArr != null && bArr.length > 0) {
                            hVar3.parseFrom(bArr);
                        }
                        r1Var.f127970o = hVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
