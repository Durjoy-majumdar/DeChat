package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hg2 */
public class C49702hg2 extends C47465a {

    /* renamed from: d */
    public String f134613d;

    /* renamed from: e */
    public int f134614e;

    /* renamed from: f */
    public String f134615f;

    /* renamed from: g */
    public LinkedList<C49175do3> f134616g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49702hg2)) {
            return false;
        }
        C49702hg2 hg22 = (C49702hg2) aVar;
        return C46238a.m51546a(this.f134613d, hg22.f134613d) && C46238a.m51546a(Integer.valueOf(this.f134614e), Integer.valueOf(hg22.f134614e)) && C46238a.m51546a(this.f134615f, hg22.f134615f) && C46238a.m51546a(this.f134616g, hg22.f134616g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134613d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f134614e);
            String str2 = this.f134615f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f134616g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f134613d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f134614e);
            String str4 = this.f134615f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58680g(4, 8, this.f134616g);
        } else if (i == 2) {
            this.f134616g.clear();
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
            C49702hg2 hg22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hg22.f134613d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hg22.f134614e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                hg22.f134615f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49175do3 do32 = new C49175do3();
                    if (bArr != null && bArr.length > 0) {
                        do32.parseFrom(bArr);
                    }
                    hg22.f134616g.add(do32);
                }
                return 0;
            }
        }
    }
}
