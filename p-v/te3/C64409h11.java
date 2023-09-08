package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h11 */
public class C64409h11 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f183384d;

    /* renamed from: e */
    public long f183385e;

    /* renamed from: f */
    public long f183386f;

    /* renamed from: g */
    public C89349b f183387g;

    /* renamed from: h */
    public String f183388h;

    /* renamed from: i */
    public int f183389i;

    /* renamed from: j */
    public String f183390j;

    /* renamed from: n */
    public String f183391n;

    /* renamed from: o */
    public String f183392o;

    /* renamed from: p */
    public int f183393p;

    /* renamed from: q */
    public C89349b f183394q;

    /* renamed from: r */
    public long f183395r;

    /* renamed from: s */
    public int f183396s;

    /* renamed from: t */
    public C89349b f183397t;

    /* renamed from: u */
    public String f183398u;

    /* renamed from: v */
    public C89349b f183399v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64409h11)) {
            return false;
        }
        C64409h11 h112 = (C64409h11) aVar;
        return C46238a.m51546a(this.BaseRequest, h112.BaseRequest) && C46238a.m51546a(this.f183384d, h112.f183384d) && C46238a.m51546a(Long.valueOf(this.f183385e), Long.valueOf(h112.f183385e)) && C46238a.m51546a(Long.valueOf(this.f183386f), Long.valueOf(h112.f183386f)) && C46238a.m51546a(this.f183387g, h112.f183387g) && C46238a.m51546a(this.f183388h, h112.f183388h) && C46238a.m51546a(Integer.valueOf(this.f183389i), Integer.valueOf(h112.f183389i)) && C46238a.m51546a(this.f183390j, h112.f183390j) && C46238a.m51546a(this.f183391n, h112.f183391n) && C46238a.m51546a(this.f183392o, h112.f183392o) && C46238a.m51546a(Integer.valueOf(this.f183393p), Integer.valueOf(h112.f183393p)) && C46238a.m51546a(this.f183394q, h112.f183394q) && C46238a.m51546a(Long.valueOf(this.f183395r), Long.valueOf(h112.f183395r)) && C46238a.m51546a(Integer.valueOf(this.f183396s), Integer.valueOf(h112.f183396s)) && C46238a.m51546a(this.f183397t, h112.f183397t) && C46238a.m51546a(this.f183398u, h112.f183398u) && C46238a.m51546a(this.f183399v, h112.f183399v);
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
            C49842ig0 ig02 = this.f183384d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f183384d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f183385e);
            aVar.mo74321h(4, this.f183386f);
            C89349b bVar = this.f183387g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str = this.f183388h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f183389i);
            String str2 = this.f183390j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f183391n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            String str4 = this.f183392o;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            aVar.mo74318e(11, this.f183393p);
            C89349b bVar2 = this.f183394q;
            if (bVar2 != null) {
                aVar.mo74315b(12, bVar2);
            }
            aVar.mo74321h(13, this.f183395r);
            aVar.mo74318e(14, this.f183396s);
            C89349b bVar3 = this.f183397t;
            if (bVar3 != null) {
                aVar.mo74315b(15, bVar3);
            }
            String str5 = this.f183398u;
            if (str5 != null) {
                aVar.mo74323j(16, str5);
            }
            C89349b bVar4 = this.f183399v;
            if (bVar4 != null) {
                aVar.mo74315b(100, bVar4);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f183384d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i3 + C52418a.m58681h(3, this.f183385e) + C52418a.m58681h(4, this.f183386f);
            C89349b bVar5 = this.f183387g;
            if (bVar5 != null) {
                h += C52418a.m58675b(5, bVar5);
            }
            String str6 = this.f183388h;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            int e = h + C52418a.m58678e(7, this.f183389i);
            String str7 = this.f183390j;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            String str8 = this.f183391n;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            String str9 = this.f183392o;
            if (str9 != null) {
                e += C52418a.m58683j(10, str9);
            }
            int e2 = e + C52418a.m58678e(11, this.f183393p);
            C89349b bVar6 = this.f183394q;
            if (bVar6 != null) {
                e2 += C52418a.m58675b(12, bVar6);
            }
            int h2 = e2 + C52418a.m58681h(13, this.f183395r) + C52418a.m58678e(14, this.f183396s);
            C89349b bVar7 = this.f183397t;
            if (bVar7 != null) {
                h2 += C52418a.m58675b(15, bVar7);
            }
            String str10 = this.f183398u;
            if (str10 != null) {
                h2 += C52418a.m58683j(16, str10);
            }
            C89349b bVar8 = this.f183399v;
            return bVar8 != null ? h2 + C52418a.m58675b(100, bVar8) : h2;
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
            C64409h11 h112 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            h112.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C49842ig0 ig04 = new C49842ig0();
                            if (bArr2 != null && bArr2.length > 0) {
                                ig04.parseFrom(bArr2);
                            }
                            h112.f183384d = ig04;
                        }
                        return 0;
                    case 3:
                        h112.f183385e = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        h112.f183386f = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        h112.f183387g = aVar3.mo141626d(intValue);
                        return 0;
                    case 6:
                        h112.f183388h = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        h112.f183389i = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        h112.f183390j = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        h112.f183391n = aVar3.mo141633k(intValue);
                        return 0;
                    case 10:
                        h112.f183392o = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        h112.f183393p = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        h112.f183394q = aVar3.mo141626d(intValue);
                        return 0;
                    case 13:
                        h112.f183395r = aVar3.mo141631i(intValue);
                        return 0;
                    case 14:
                        h112.f183396s = aVar3.mo141629g(intValue);
                        return 0;
                    case 15:
                        h112.f183397t = aVar3.mo141626d(intValue);
                        return 0;
                    case 16:
                        h112.f183398u = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                h112.f183399v = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
