package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class c85 extends C47465a {

    /* renamed from: d */
    public String f182431d;

    /* renamed from: e */
    public String f182432e;

    /* renamed from: f */
    public LinkedList<C64280c93> f182433f = new LinkedList<>();

    /* renamed from: g */
    public String f182434g;

    /* renamed from: h */
    public int f182435h;

    /* renamed from: i */
    public String f182436i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c85)) {
            return false;
        }
        c85 c85 = (c85) aVar;
        return C46238a.m51546a(this.f182431d, c85.f182431d) && C46238a.m51546a(this.f182432e, c85.f182432e) && C46238a.m51546a(this.f182433f, c85.f182433f) && C46238a.m51546a(this.f182434g, c85.f182434g) && C46238a.m51546a(Integer.valueOf(this.f182435h), Integer.valueOf(c85.f182435h)) && C46238a.m51546a(this.f182436i, c85.f182436i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182431d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182432e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f182433f);
            String str3 = this.f182434g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f182435h);
            String str4 = this.f182436i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f182431d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f182432e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f182433f);
            String str7 = this.f182434g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            int e = g + C52418a.m58678e(5, this.f182435h);
            String str8 = this.f182436i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
        } else if (i == 2) {
            this.f182433f.clear();
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
            c85 c85 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c85.f182431d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    c85.f182432e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64280c93 c932 = new C64280c93();
                        if (bArr != null && bArr.length > 0) {
                            c932.parseFrom(bArr);
                        }
                        c85.f182433f.add(c932);
                    }
                    return 0;
                case 4:
                    c85.f182434g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    c85.f182435h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    c85.f182436i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
