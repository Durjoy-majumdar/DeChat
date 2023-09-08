package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s70 */
public class C101839s70 extends C47465a {

    /* renamed from: d */
    public String f299379d;

    /* renamed from: e */
    public int f299380e;

    /* renamed from: f */
    public int f299381f;

    /* renamed from: g */
    public C51018qv3 f299382g;

    /* renamed from: h */
    public int f299383h;

    /* renamed from: i */
    public String f299384i;

    /* renamed from: j */
    public String f299385j;

    /* renamed from: n */
    public String f299386n;

    /* renamed from: o */
    public String f299387o;

    /* renamed from: p */
    public String f299388p;

    /* renamed from: q */
    public int f299389q;

    /* renamed from: r */
    public String f299390r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101839s70)) {
            return false;
        }
        C101839s70 s702 = (C101839s70) aVar;
        return C46238a.m51546a(this.f299379d, s702.f299379d) && C46238a.m51546a(Integer.valueOf(this.f299380e), Integer.valueOf(s702.f299380e)) && C46238a.m51546a(Integer.valueOf(this.f299381f), Integer.valueOf(s702.f299381f)) && C46238a.m51546a(this.f299382g, s702.f299382g) && C46238a.m51546a(Integer.valueOf(this.f299383h), Integer.valueOf(s702.f299383h)) && C46238a.m51546a(this.f299384i, s702.f299384i) && C46238a.m51546a(this.f299385j, s702.f299385j) && C46238a.m51546a(this.f299386n, s702.f299386n) && C46238a.m51546a(this.f299387o, s702.f299387o) && C46238a.m51546a(this.f299388p, s702.f299388p) && C46238a.m51546a(Integer.valueOf(this.f299389q), Integer.valueOf(s702.f299389q)) && C46238a.m51546a(this.f299390r, s702.f299390r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299382g != null) {
                String str = this.f299379d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f299380e);
                aVar.mo74318e(3, this.f299381f);
                C51018qv3 qv32 = this.f299382g;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f299382g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f299383h);
                String str2 = this.f299384i;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f299385j;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f299386n;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f299387o;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f299388p;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                aVar.mo74318e(11, this.f299389q);
                String str7 = this.f299390r;
                if (str7 == null) {
                    return 0;
                }
                aVar.mo74323j(12, str7);
                return 0;
            }
            throw new C52419b("Not all required fields were included: EmojiBuffer");
        } else if (i2 == 1) {
            String str8 = this.f299379d;
            int j = (str8 != null ? 0 + C52418a.m58683j(1, str8) : 0) + C52418a.m58678e(2, this.f299380e) + C52418a.m58678e(3, this.f299381f);
            C51018qv3 qv33 = this.f299382g;
            if (qv33 != null) {
                j += C52418a.m58682i(4, qv33.computeSize());
            }
            int e = j + C52418a.m58678e(5, this.f299383h);
            String str9 = this.f299384i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f299385j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            String str11 = this.f299386n;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f299387o;
            if (str12 != null) {
                e += C52418a.m58683j(9, str12);
            }
            String str13 = this.f299388p;
            if (str13 != null) {
                e += C52418a.m58683j(10, str13);
            }
            int e2 = e + C52418a.m58678e(11, this.f299389q);
            String str14 = this.f299390r;
            return str14 != null ? e2 + C52418a.m58683j(12, str14) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299382g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: EmojiBuffer");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101839s70 s702 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s702.f299379d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    s702.f299380e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    s702.f299381f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        s702.f299382g = qv34;
                    }
                    return 0;
                case 5:
                    s702.f299383h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    s702.f299384i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    s702.f299385j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    s702.f299386n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    s702.f299387o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    s702.f299388p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    s702.f299389q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    s702.f299390r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
