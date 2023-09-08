package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ko3 */
public class C50157ko3 extends C47465a {

    /* renamed from: d */
    public String f136915d;

    /* renamed from: e */
    public long f136916e;

    /* renamed from: f */
    public LinkedList<String> f136917f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<String> f136918g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50157ko3)) {
            return false;
        }
        C50157ko3 ko32 = (C50157ko3) aVar;
        return C46238a.m51546a(this.f136915d, ko32.f136915d) && C46238a.m51546a(Long.valueOf(this.f136916e), Long.valueOf(ko32.f136916e)) && C46238a.m51546a(this.f136917f, ko32.f136917f) && C46238a.m51546a(this.f136918g, ko32.f136918g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136915d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f136916e);
            aVar.mo74320g(3, 1, this.f136917f);
            aVar.mo74320g(4, 1, this.f136918g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f136915d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f136916e) + C52418a.m58680g(3, 1, this.f136917f) + C52418a.m58680g(4, 1, this.f136918g);
        } else if (i == 2) {
            this.f136917f.clear();
            this.f136918g.clear();
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
            C50157ko3 ko32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ko32.f136915d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ko32.f136916e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                ko32.f136917f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ko32.f136918g.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
