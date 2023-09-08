package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.r2 */
public class C47662r2 extends C47465a {

    /* renamed from: d */
    public String f127971d;

    /* renamed from: e */
    public String f127972e;

    /* renamed from: f */
    public LinkedList<C47565d3> f127973f = new LinkedList<>();

    /* renamed from: g */
    public String f127974g;

    /* renamed from: h */
    public String f127975h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47662r2)) {
            return false;
        }
        C47662r2 r2Var = (C47662r2) aVar;
        return C46238a.m51546a(this.f127971d, r2Var.f127971d) && C46238a.m51546a(this.f127972e, r2Var.f127972e) && C46238a.m51546a(this.f127973f, r2Var.f127973f) && C46238a.m51546a(this.f127974g, r2Var.f127974g) && C46238a.m51546a(this.f127975h, r2Var.f127975h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127971d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127972e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f127973f);
            String str3 = this.f127974g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f127975h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f127971d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f127972e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f127973f);
            String str7 = this.f127974g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f127975h;
            return str8 != null ? g + C52418a.m58683j(5, str8) : g;
        } else if (i == 2) {
            this.f127973f.clear();
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
            C47662r2 r2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r2Var.f127971d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                r2Var.f127972e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47565d3 d3Var = new C47565d3();
                    if (bArr != null && bArr.length > 0) {
                        d3Var.parseFrom(bArr);
                    }
                    r2Var.f127973f.add(d3Var);
                }
                return 0;
            } else if (intValue == 4) {
                r2Var.f127974g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                r2Var.f127975h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
