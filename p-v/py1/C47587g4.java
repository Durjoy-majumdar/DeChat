package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.g4 */
public class C47587g4 extends C47465a {

    /* renamed from: d */
    public String f127715d;

    /* renamed from: e */
    public LinkedList<C47594h4> f127716e = new LinkedList<>();

    /* renamed from: f */
    public String f127717f;

    /* renamed from: g */
    public String f127718g;

    /* renamed from: h */
    public String f127719h;

    /* renamed from: i */
    public String f127720i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47587g4)) {
            return false;
        }
        C47587g4 g4Var = (C47587g4) aVar;
        return C46238a.m51546a(this.f127715d, g4Var.f127715d) && C46238a.m51546a(this.f127716e, g4Var.f127716e) && C46238a.m51546a(this.f127717f, g4Var.f127717f) && C46238a.m51546a(this.f127718g, g4Var.f127718g) && C46238a.m51546a(this.f127719h, g4Var.f127719h) && C46238a.m51546a(this.f127720i, g4Var.f127720i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127715d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 8, this.f127716e);
                String str2 = this.f127717f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f127718g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f127719h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f127720i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i == 1) {
            String str6 = this.f127715d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f127716e);
            String str7 = this.f127717f;
            if (str7 != null) {
                g += C52418a.m58683j(3, str7);
            }
            String str8 = this.f127718g;
            if (str8 != null) {
                g += C52418a.m58683j(4, str8);
            }
            String str9 = this.f127719h;
            if (str9 != null) {
                g += C52418a.m58683j(5, str9);
            }
            String str10 = this.f127720i;
            return str10 != null ? g + C52418a.m58683j(6, str10) : g;
        } else if (i == 2) {
            this.f127716e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127715d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47587g4 g4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    g4Var.f127715d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47594h4 h4Var = new C47594h4();
                        if (bArr != null && bArr.length > 0) {
                            h4Var.parseFrom(bArr);
                        }
                        g4Var.f127716e.add(h4Var);
                    }
                    return 0;
                case 3:
                    g4Var.f127717f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    g4Var.f127718g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    g4Var.f127719h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    g4Var.f127720i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
