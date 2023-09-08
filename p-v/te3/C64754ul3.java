package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ul3 */
public class C64754ul3 extends C49335eu3 {

    /* renamed from: d */
    public long f185761d;

    /* renamed from: e */
    public int f185762e;

    /* renamed from: f */
    public long f185763f;

    /* renamed from: g */
    public int f185764g;

    /* renamed from: h */
    public long f185765h;

    /* renamed from: i */
    public int f185766i;

    /* renamed from: j */
    public LinkedList<C64678re2> f185767j = new LinkedList<>();

    /* renamed from: n */
    public String f185768n;

    /* renamed from: o */
    public String f185769o;

    /* renamed from: p */
    public String f185770p;

    /* renamed from: q */
    public String f185771q;

    /* renamed from: r */
    public int f185772r;

    /* renamed from: s */
    public String f185773s;

    /* renamed from: t */
    public int f185774t;

    /* renamed from: u */
    public String f185775u;

    /* renamed from: v */
    public int f185776v;

    /* renamed from: w */
    public int f185777w;

    /* renamed from: x */
    public int f185778x;

    /* renamed from: y */
    public String f185779y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64754ul3)) {
            return false;
        }
        C64754ul3 ul32 = (C64754ul3) aVar;
        return C46238a.m51546a(this.BaseResponse, ul32.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f185761d), Long.valueOf(ul32.f185761d)) && C46238a.m51546a(Integer.valueOf(this.f185762e), Integer.valueOf(ul32.f185762e)) && C46238a.m51546a(Long.valueOf(this.f185763f), Long.valueOf(ul32.f185763f)) && C46238a.m51546a(Integer.valueOf(this.f185764g), Integer.valueOf(ul32.f185764g)) && C46238a.m51546a(Long.valueOf(this.f185765h), Long.valueOf(ul32.f185765h)) && C46238a.m51546a(Integer.valueOf(this.f185766i), Integer.valueOf(ul32.f185766i)) && C46238a.m51546a(this.f185767j, ul32.f185767j) && C46238a.m51546a(this.f185768n, ul32.f185768n) && C46238a.m51546a(this.f185769o, ul32.f185769o) && C46238a.m51546a(this.f185770p, ul32.f185770p) && C46238a.m51546a(this.f185771q, ul32.f185771q) && C46238a.m51546a(Integer.valueOf(this.f185772r), Integer.valueOf(ul32.f185772r)) && C46238a.m51546a(this.f185773s, ul32.f185773s) && C46238a.m51546a(Integer.valueOf(this.f185774t), Integer.valueOf(ul32.f185774t)) && C46238a.m51546a(this.f185775u, ul32.f185775u) && C46238a.m51546a(Integer.valueOf(this.f185776v), Integer.valueOf(ul32.f185776v)) && C46238a.m51546a(Integer.valueOf(this.f185777w), Integer.valueOf(ul32.f185777w)) && C46238a.m51546a(Integer.valueOf(this.f185778x), Integer.valueOf(ul32.f185778x)) && C46238a.m51546a(this.f185779y, ul32.f185779y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f185761d);
                aVar.mo74318e(3, this.f185762e);
                aVar.mo74321h(4, this.f185763f);
                aVar.mo74318e(5, this.f185764g);
                aVar.mo74321h(6, this.f185765h);
                aVar.mo74318e(9, this.f185766i);
                aVar.mo74320g(10, 8, this.f185767j);
                String str = this.f185768n;
                if (str != null) {
                    aVar.mo74323j(11, str);
                }
                String str2 = this.f185769o;
                if (str2 != null) {
                    aVar.mo74323j(12, str2);
                }
                String str3 = this.f185770p;
                if (str3 != null) {
                    aVar.mo74323j(13, str3);
                }
                String str4 = this.f185771q;
                if (str4 != null) {
                    aVar.mo74323j(14, str4);
                }
                aVar.mo74318e(15, this.f185772r);
                String str5 = this.f185773s;
                if (str5 != null) {
                    aVar.mo74323j(16, str5);
                }
                aVar.mo74318e(17, this.f185774t);
                String str6 = this.f185775u;
                if (str6 != null) {
                    aVar.mo74323j(18, str6);
                }
                aVar.mo74318e(19, this.f185776v);
                aVar.mo74318e(20, this.f185777w);
                aVar.mo74318e(21, this.f185778x);
                String str7 = this.f185779y;
                if (str7 != null) {
                    aVar.mo74323j(22, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f185761d) + C52418a.m58678e(3, this.f185762e) + C52418a.m58681h(4, this.f185763f) + C52418a.m58678e(5, this.f185764g) + C52418a.m58681h(6, this.f185765h) + C52418a.m58678e(9, this.f185766i) + C52418a.m58680g(10, 8, this.f185767j);
            String str8 = this.f185768n;
            if (str8 != null) {
                h += C52418a.m58683j(11, str8);
            }
            String str9 = this.f185769o;
            if (str9 != null) {
                h += C52418a.m58683j(12, str9);
            }
            String str10 = this.f185770p;
            if (str10 != null) {
                h += C52418a.m58683j(13, str10);
            }
            String str11 = this.f185771q;
            if (str11 != null) {
                h += C52418a.m58683j(14, str11);
            }
            int e = h + C52418a.m58678e(15, this.f185772r);
            String str12 = this.f185773s;
            if (str12 != null) {
                e += C52418a.m58683j(16, str12);
            }
            int e2 = e + C52418a.m58678e(17, this.f185774t);
            String str13 = this.f185775u;
            if (str13 != null) {
                e2 += C52418a.m58683j(18, str13);
            }
            int e3 = e2 + C52418a.m58678e(19, this.f185776v) + C52418a.m58678e(20, this.f185777w) + C52418a.m58678e(21, this.f185778x);
            String str14 = this.f185779y;
            return str14 != null ? e3 + C52418a.m58683j(22, str14) : e3;
        } else if (i2 == 2) {
            this.f185767j.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64754ul3 ul32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ul32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ul32.f185761d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ul32.f185762e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ul32.f185763f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ul32.f185764g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ul32.f185765h = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    ul32.f185766i = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64678re2 re22 = new C64678re2();
                        if (bArr2 != null && bArr2.length > 0) {
                            re22.parseFrom(bArr2);
                        }
                        ul32.f185767j.add(re22);
                    }
                    return 0;
                case 11:
                    ul32.f185768n = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ul32.f185769o = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ul32.f185770p = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ul32.f185771q = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ul32.f185772r = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    ul32.f185773s = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    ul32.f185774t = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    ul32.f185775u = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    ul32.f185776v = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    ul32.f185777w = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    ul32.f185778x = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    ul32.f185779y = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
