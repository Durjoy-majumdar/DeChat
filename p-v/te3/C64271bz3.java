package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bz3 */
public class C64271bz3 extends C47465a {

    /* renamed from: d */
    public String f182340d;

    /* renamed from: e */
    public int f182341e;

    /* renamed from: f */
    public int f182342f;

    /* renamed from: g */
    public LinkedList<String> f182343g = new LinkedList<>();

    /* renamed from: h */
    public String f182344h;

    /* renamed from: i */
    public int f182345i;

    /* renamed from: j */
    public String f182346j;

    /* renamed from: n */
    public String f182347n;

    /* renamed from: o */
    public int f182348o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64271bz3)) {
            return false;
        }
        C64271bz3 bz32 = (C64271bz3) aVar;
        return C46238a.m51546a(this.f182340d, bz32.f182340d) && C46238a.m51546a(Integer.valueOf(this.f182341e), Integer.valueOf(bz32.f182341e)) && C46238a.m51546a(Integer.valueOf(this.f182342f), Integer.valueOf(bz32.f182342f)) && C46238a.m51546a(this.f182343g, bz32.f182343g) && C46238a.m51546a(this.f182344h, bz32.f182344h) && C46238a.m51546a(Integer.valueOf(this.f182345i), Integer.valueOf(bz32.f182345i)) && C46238a.m51546a(this.f182346j, bz32.f182346j) && C46238a.m51546a(this.f182347n, bz32.f182347n) && C46238a.m51546a(Integer.valueOf(this.f182348o), Integer.valueOf(bz32.f182348o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182340d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f182341e);
            aVar.mo74318e(3, this.f182342f);
            aVar.mo74320g(4, 1, this.f182343g);
            String str2 = this.f182344h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f182345i);
            String str3 = this.f182346j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f182347n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f182348o);
            return 0;
        } else if (i == 1) {
            String str5 = this.f182340d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f182341e) + C52418a.m58678e(3, this.f182342f) + C52418a.m58680g(4, 1, this.f182343g);
            String str6 = this.f182344h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int e2 = e + C52418a.m58678e(6, this.f182345i);
            String str7 = this.f182346j;
            if (str7 != null) {
                e2 += C52418a.m58683j(7, str7);
            }
            String str8 = this.f182347n;
            if (str8 != null) {
                e2 += C52418a.m58683j(8, str8);
            }
            return e2 + C52418a.m58678e(9, this.f182348o);
        } else if (i == 2) {
            this.f182343g.clear();
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
            C64271bz3 bz32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bz32.f182340d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bz32.f182341e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bz32.f182342f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bz32.f182343g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    bz32.f182344h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bz32.f182345i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    bz32.f182346j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bz32.f182347n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bz32.f182348o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
