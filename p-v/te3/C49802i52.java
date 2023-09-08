package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i52 */
public class C49802i52 extends C47465a {

    /* renamed from: d */
    public String f135114d;

    /* renamed from: e */
    public String f135115e;

    /* renamed from: f */
    public LinkedList<String> f135116f = new LinkedList<>();

    /* renamed from: g */
    public int f135117g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49802i52)) {
            return false;
        }
        C49802i52 i522 = (C49802i52) aVar;
        return C46238a.m51546a(this.f135114d, i522.f135114d) && C46238a.m51546a(this.f135115e, i522.f135115e) && C46238a.m51546a(this.f135116f, i522.f135116f) && C46238a.m51546a(Integer.valueOf(this.f135117g), Integer.valueOf(i522.f135117g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135114d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135115e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 1, this.f135116f);
            aVar.mo74318e(4, this.f135117g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f135114d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f135115e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 1, this.f135116f) + C52418a.m58678e(4, this.f135117g);
        } else if (i == 2) {
            this.f135116f.clear();
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
            C49802i52 i522 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i522.f135114d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                i522.f135115e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                i522.f135116f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                i522.f135117g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
