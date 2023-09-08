package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.w2 */
public class C47695w2 extends C47465a {

    /* renamed from: d */
    public String f128112d;

    /* renamed from: e */
    public LinkedList<C47701x2> f128113e = new LinkedList<>();

    /* renamed from: f */
    public String f128114f;

    /* renamed from: g */
    public String f128115g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47695w2)) {
            return false;
        }
        C47695w2 w2Var = (C47695w2) aVar;
        return C46238a.m51546a(this.f128112d, w2Var.f128112d) && C46238a.m51546a(this.f128113e, w2Var.f128113e) && C46238a.m51546a(this.f128114f, w2Var.f128114f) && C46238a.m51546a(this.f128115g, w2Var.f128115g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128112d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 8, this.f128113e);
                String str2 = this.f128114f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f128115g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i == 1) {
            String str4 = this.f128112d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f128113e);
            String str5 = this.f128114f;
            if (str5 != null) {
                g += C52418a.m58683j(3, str5);
            }
            String str6 = this.f128115g;
            return str6 != null ? g + C52418a.m58683j(4, str6) : g;
        } else if (i == 2) {
            this.f128113e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128112d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47695w2 w2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w2Var.f128112d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47701x2 x2Var = new C47701x2();
                    if (bArr != null && bArr.length > 0) {
                        x2Var.parseFrom(bArr);
                    }
                    w2Var.f128113e.add(x2Var);
                }
                return 0;
            } else if (intValue == 3) {
                w2Var.f128114f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                w2Var.f128115g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
