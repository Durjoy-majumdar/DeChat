package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qt1 */
public class C51011qt1 extends C47465a {

    /* renamed from: d */
    public String f140537d;

    /* renamed from: e */
    public LinkedList<String> f140538e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C51154rt1> f140539f = new LinkedList<>();

    /* renamed from: g */
    public int f140540g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51011qt1)) {
            return false;
        }
        C51011qt1 qt12 = (C51011qt1) aVar;
        return C46238a.m51546a(this.f140537d, qt12.f140537d) && C46238a.m51546a(this.f140538e, qt12.f140538e) && C46238a.m51546a(this.f140539f, qt12.f140539f) && C46238a.m51546a(Integer.valueOf(this.f140540g), Integer.valueOf(qt12.f140540g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140537d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.f140538e);
            aVar.mo74320g(3, 8, this.f140539f);
            aVar.mo74318e(4, this.f140540g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f140537d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.f140538e) + C52418a.m58680g(3, 8, this.f140539f) + C52418a.m58678e(4, this.f140540g);
        } else if (i == 2) {
            this.f140538e.clear();
            this.f140539f.clear();
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
            C51011qt1 qt12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qt12.f140537d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                qt12.f140538e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51154rt1 rt12 = new C51154rt1();
                    if (bArr != null && bArr.length > 0) {
                        rt12.parseFrom(bArr);
                    }
                    qt12.f140539f.add(rt12);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                qt12.f140540g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
