package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nt2 */
public class C50592nt2 extends C101820nt3 {

    /* renamed from: d */
    public int f138761d;

    /* renamed from: e */
    public String f138762e;

    /* renamed from: f */
    public String f138763f;

    /* renamed from: g */
    public int f138764g;

    /* renamed from: h */
    public String f138765h;

    /* renamed from: i */
    public String f138766i;

    /* renamed from: j */
    public String f138767j;

    /* renamed from: n */
    public int f138768n;

    /* renamed from: o */
    public int f138769o;

    /* renamed from: p */
    public int f138770p;

    /* renamed from: q */
    public int f138771q;

    /* renamed from: r */
    public long f138772r;

    /* renamed from: s */
    public int f138773s;

    /* renamed from: t */
    public int f138774t;

    /* renamed from: u */
    public int f138775u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50592nt2)) {
            return false;
        }
        C50592nt2 nt22 = (C50592nt2) aVar;
        return C46238a.m51546a(this.BaseRequest, nt22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f138761d), Integer.valueOf(nt22.f138761d)) && C46238a.m51546a(this.f138762e, nt22.f138762e) && C46238a.m51546a(this.f138763f, nt22.f138763f) && C46238a.m51546a(Integer.valueOf(this.f138764g), Integer.valueOf(nt22.f138764g)) && C46238a.m51546a(this.f138765h, nt22.f138765h) && C46238a.m51546a(this.f138766i, nt22.f138766i) && C46238a.m51546a(this.f138767j, nt22.f138767j) && C46238a.m51546a(Integer.valueOf(this.f138768n), Integer.valueOf(nt22.f138768n)) && C46238a.m51546a(Integer.valueOf(this.f138769o), Integer.valueOf(nt22.f138769o)) && C46238a.m51546a(Integer.valueOf(this.f138770p), Integer.valueOf(nt22.f138770p)) && C46238a.m51546a(Integer.valueOf(this.f138771q), Integer.valueOf(nt22.f138771q)) && C46238a.m51546a(Long.valueOf(this.f138772r), Long.valueOf(nt22.f138772r)) && C46238a.m51546a(Integer.valueOf(this.f138773s), Integer.valueOf(nt22.f138773s)) && C46238a.m51546a(Integer.valueOf(this.f138774t), Integer.valueOf(nt22.f138774t)) && C46238a.m51546a(Integer.valueOf(this.f138775u), Integer.valueOf(nt22.f138775u));
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
            aVar.mo74318e(2, this.f138761d);
            String str = this.f138762e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f138763f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f138764g);
            String str3 = this.f138765h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f138766i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f138767j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f138768n);
            aVar.mo74318e(10, this.f138769o);
            aVar.mo74318e(11, this.f138770p);
            aVar.mo74318e(12, this.f138771q);
            aVar.mo74321h(13, this.f138772r);
            aVar.mo74318e(14, this.f138773s);
            aVar.mo74318e(15, this.f138774t);
            aVar.mo74318e(16, this.f138775u);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f138761d);
            String str6 = this.f138762e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f138763f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int e2 = e + C52418a.m58678e(5, this.f138764g);
            String str8 = this.f138765h;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f138766i;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f138767j;
            if (str10 != null) {
                e2 += C52418a.m58683j(8, str10);
            }
            return e2 + C52418a.m58678e(9, this.f138768n) + C52418a.m58678e(10, this.f138769o) + C52418a.m58678e(11, this.f138770p) + C52418a.m58678e(12, this.f138771q) + C52418a.m58681h(13, this.f138772r) + C52418a.m58678e(14, this.f138773s) + C52418a.m58678e(15, this.f138774t) + C52418a.m58678e(16, this.f138775u);
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
            C50592nt2 nt22 = objArr[1];
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
                        nt22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    nt22.f138761d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    nt22.f138762e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nt22.f138763f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nt22.f138764g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nt22.f138765h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    nt22.f138766i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    nt22.f138767j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    nt22.f138768n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    nt22.f138769o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    nt22.f138770p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    nt22.f138771q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    nt22.f138772r = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    nt22.f138773s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    nt22.f138774t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    nt22.f138775u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
