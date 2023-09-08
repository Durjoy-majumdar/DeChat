package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g6 */
public class C49519g6 extends C101820nt3 {

    /* renamed from: d */
    public String f133874d;

    /* renamed from: e */
    public String f133875e;

    /* renamed from: f */
    public long f133876f;

    /* renamed from: g */
    public int f133877g;

    /* renamed from: h */
    public int f133878h;

    /* renamed from: i */
    public String f133879i;

    /* renamed from: j */
    public int f133880j;

    /* renamed from: n */
    public int f133881n;

    /* renamed from: o */
    public int f133882o;

    /* renamed from: p */
    public int f133883p;

    /* renamed from: q */
    public String f133884q;

    /* renamed from: r */
    public long f133885r;

    /* renamed from: s */
    public int f133886s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49519g6)) {
            return false;
        }
        C49519g6 g6Var = (C49519g6) aVar;
        return C46238a.m51546a(this.BaseRequest, g6Var.BaseRequest) && C46238a.m51546a(this.f133874d, g6Var.f133874d) && C46238a.m51546a(this.f133875e, g6Var.f133875e) && C46238a.m51546a(Long.valueOf(this.f133876f), Long.valueOf(g6Var.f133876f)) && C46238a.m51546a(Integer.valueOf(this.f133877g), Integer.valueOf(g6Var.f133877g)) && C46238a.m51546a(Integer.valueOf(this.f133878h), Integer.valueOf(g6Var.f133878h)) && C46238a.m51546a(this.f133879i, g6Var.f133879i) && C46238a.m51546a(Integer.valueOf(this.f133880j), Integer.valueOf(g6Var.f133880j)) && C46238a.m51546a(Integer.valueOf(this.f133881n), Integer.valueOf(g6Var.f133881n)) && C46238a.m51546a(Integer.valueOf(this.f133882o), Integer.valueOf(g6Var.f133882o)) && C46238a.m51546a(Integer.valueOf(this.f133883p), Integer.valueOf(g6Var.f133883p)) && C46238a.m51546a(this.f133884q, g6Var.f133884q) && C46238a.m51546a(Long.valueOf(this.f133885r), Long.valueOf(g6Var.f133885r)) && C46238a.m51546a(Integer.valueOf(this.f133886s), Integer.valueOf(g6Var.f133886s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f133874d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133875e;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f133876f);
            aVar.mo74318e(6, this.f133877g);
            aVar.mo74318e(7, this.f133878h);
            String str3 = this.f133879i;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74318e(9, this.f133880j);
            aVar.mo74318e(10, this.f133881n);
            aVar.mo74318e(11, this.f133882o);
            aVar.mo74318e(12, this.f133883p);
            String str4 = this.f133884q;
            if (str4 != null) {
                aVar.mo74323j(13, str4);
            }
            aVar.mo74321h(14, this.f133885r);
            aVar.mo74318e(15, this.f133886s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str5 = this.f133874d;
            if (str5 != null) {
                i3 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f133875e;
            if (str6 != null) {
                i3 += C52418a.m58683j(4, str6);
            }
            int h = i3 + C52418a.m58681h(5, this.f133876f) + C52418a.m58678e(6, this.f133877g) + C52418a.m58678e(7, this.f133878h);
            String str7 = this.f133879i;
            if (str7 != null) {
                h += C52418a.m58683j(8, str7);
            }
            int e = h + C52418a.m58678e(9, this.f133880j) + C52418a.m58678e(10, this.f133881n) + C52418a.m58678e(11, this.f133882o) + C52418a.m58678e(12, this.f133883p);
            String str8 = this.f133884q;
            if (str8 != null) {
                e += C52418a.m58683j(13, str8);
            }
            return e + C52418a.m58681h(14, this.f133885r) + C52418a.m58678e(15, this.f133886s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49519g6 g6Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        g6Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    g6Var.f133874d = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    g6Var.f133875e = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    g6Var.f133876f = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    g6Var.f133877g = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    g6Var.f133878h = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    g6Var.f133879i = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    g6Var.f133880j = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    g6Var.f133881n = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    g6Var.f133882o = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    g6Var.f133883p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    g6Var.f133884q = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    g6Var.f133885r = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    g6Var.f133886s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
