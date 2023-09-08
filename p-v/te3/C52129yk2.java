package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yk2 */
public class C52129yk2 extends C47465a {

    /* renamed from: d */
    public String f145341d;

    /* renamed from: e */
    public String f145342e;

    /* renamed from: f */
    public int f145343f;

    /* renamed from: g */
    public LinkedList<C52109yf2> f145344g = new LinkedList<>();

    /* renamed from: h */
    public int f145345h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52129yk2)) {
            return false;
        }
        C52129yk2 yk22 = (C52129yk2) aVar;
        return C46238a.m51546a(this.f145341d, yk22.f145341d) && C46238a.m51546a(this.f145342e, yk22.f145342e) && C46238a.m51546a(Integer.valueOf(this.f145343f), Integer.valueOf(yk22.f145343f)) && C46238a.m51546a(this.f145344g, yk22.f145344g) && C46238a.m51546a(Integer.valueOf(this.f145345h), Integer.valueOf(yk22.f145345h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145341d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f145342e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f145343f);
            aVar.mo74320g(4, 8, this.f145344g);
            aVar.mo74318e(5, this.f145345h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f145341d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f145342e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f145343f) + C52418a.m58680g(4, 8, this.f145344g) + C52418a.m58678e(5, this.f145345h);
        } else if (i == 2) {
            this.f145344g.clear();
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
            C52129yk2 yk22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yk22.f145341d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                yk22.f145342e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                yk22.f145343f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52109yf2 yf22 = new C52109yf2();
                    if (bArr != null && bArr.length > 0) {
                        yf22.parseFrom(bArr);
                    }
                    yk22.f145344g.add(yf22);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                yk22.f145345h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
