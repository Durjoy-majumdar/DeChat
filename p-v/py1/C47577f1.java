package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.f1 */
public class C47577f1 extends C47465a {

    /* renamed from: d */
    public String f127684d;

    /* renamed from: e */
    public String f127685e;

    /* renamed from: f */
    public LinkedList<C47559c4> f127686f = new LinkedList<>();

    /* renamed from: g */
    public C47672s5 f127687g;

    /* renamed from: h */
    public String f127688h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47577f1)) {
            return false;
        }
        C47577f1 f1Var = (C47577f1) aVar;
        return C46238a.m51546a(this.f127684d, f1Var.f127684d) && C46238a.m51546a(this.f127685e, f1Var.f127685e) && C46238a.m51546a(this.f127686f, f1Var.f127686f) && C46238a.m51546a(this.f127687g, f1Var.f127687g) && C46238a.m51546a(this.f127688h, f1Var.f127688h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127684d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127685e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f127686f);
            C47672s5 s5Var = this.f127687g;
            if (s5Var != null) {
                aVar.mo74322i(4, s5Var.computeSize());
                this.f127687g.writeFields(aVar);
            }
            String str3 = this.f127688h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f127684d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f127685e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f127686f);
            C47672s5 s5Var2 = this.f127687g;
            if (s5Var2 != null) {
                g += C52418a.m58682i(4, s5Var2.computeSize());
            }
            String str6 = this.f127688h;
            return str6 != null ? g + C52418a.m58683j(5, str6) : g;
        } else if (i == 2) {
            this.f127686f.clear();
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
            C47577f1 f1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f1Var.f127684d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                f1Var.f127685e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47559c4 c4Var = new C47559c4();
                    if (bArr != null && bArr.length > 0) {
                        c4Var.parseFrom(bArr);
                    }
                    f1Var.f127686f.add(c4Var);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47672s5 s5Var3 = new C47672s5();
                    if (bArr2 != null && bArr2.length > 0) {
                        s5Var3.parseFrom(bArr2);
                    }
                    f1Var.f127687g = s5Var3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                f1Var.f127688h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
