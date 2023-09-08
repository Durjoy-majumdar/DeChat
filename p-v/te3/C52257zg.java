package te3;

import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zg */
public class C52257zg extends C47465a {

    /* renamed from: d */
    public String f145866d;

    /* renamed from: e */
    public String f145867e;

    /* renamed from: f */
    public String f145868f;

    /* renamed from: g */
    public String f145869g;

    /* renamed from: h */
    public String f145870h;

    /* renamed from: i */
    public String f145871i;

    /* renamed from: j */
    public int f145872j;

    /* renamed from: n */
    public String f145873n;

    /* renamed from: o */
    public int f145874o;

    /* renamed from: p */
    public String f145875p;

    /* renamed from: q */
    public String f145876q;

    /* renamed from: r */
    public C49339ev2 f145877r;

    /* renamed from: s */
    public String f145878s;

    /* renamed from: t */
    public String f145879t;

    /* renamed from: u */
    public long f145880u;

    /* renamed from: v */
    public String f145881v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52257zg)) {
            return false;
        }
        C52257zg zgVar = (C52257zg) aVar;
        return C46238a.m51546a(this.f145866d, zgVar.f145866d) && C46238a.m51546a(this.f145867e, zgVar.f145867e) && C46238a.m51546a(this.f145868f, zgVar.f145868f) && C46238a.m51546a(this.f145869g, zgVar.f145869g) && C46238a.m51546a(this.f145870h, zgVar.f145870h) && C46238a.m51546a(this.f145871i, zgVar.f145871i) && C46238a.m51546a(Integer.valueOf(this.f145872j), Integer.valueOf(zgVar.f145872j)) && C46238a.m51546a(this.f145873n, zgVar.f145873n) && C46238a.m51546a(Integer.valueOf(this.f145874o), Integer.valueOf(zgVar.f145874o)) && C46238a.m51546a(this.f145875p, zgVar.f145875p) && C46238a.m51546a(this.f145876q, zgVar.f145876q) && C46238a.m51546a(this.f145877r, zgVar.f145877r) && C46238a.m51546a(this.f145878s, zgVar.f145878s) && C46238a.m51546a(this.f145879t, zgVar.f145879t) && C46238a.m51546a(Long.valueOf(this.f145880u), Long.valueOf(zgVar.f145880u)) && C46238a.m51546a(this.f145881v, zgVar.f145881v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145866d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f145867e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f145868f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f145869g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f145870h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f145871i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f145872j);
            String str7 = this.f145873n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f145874o);
            String str8 = this.f145875p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            String str9 = this.f145876q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            C49339ev2 ev22 = this.f145877r;
            if (ev22 != null) {
                aVar.mo74322i(12, ev22.computeSize());
                this.f145877r.writeFields(aVar);
            }
            String str10 = this.f145878s;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            String str11 = this.f145879t;
            if (str11 != null) {
                aVar.mo74323j(900, str11);
            }
            aVar.mo74321h(901, this.f145880u);
            String str12 = this.f145881v;
            if (str12 != null) {
                aVar.mo74323j(C82613z.CTRL_INDEX, str12);
            }
            return 0;
        } else if (i2 == 1) {
            String str13 = this.f145866d;
            if (str13 != null) {
                i3 = C52418a.m58683j(1, str13) + 0;
            }
            String str14 = this.f145867e;
            if (str14 != null) {
                i3 += C52418a.m58683j(2, str14);
            }
            String str15 = this.f145868f;
            if (str15 != null) {
                i3 += C52418a.m58683j(3, str15);
            }
            String str16 = this.f145869g;
            if (str16 != null) {
                i3 += C52418a.m58683j(4, str16);
            }
            String str17 = this.f145870h;
            if (str17 != null) {
                i3 += C52418a.m58683j(5, str17);
            }
            String str18 = this.f145871i;
            if (str18 != null) {
                i3 += C52418a.m58683j(6, str18);
            }
            int e = i3 + C52418a.m58678e(7, this.f145872j);
            String str19 = this.f145873n;
            if (str19 != null) {
                e += C52418a.m58683j(8, str19);
            }
            int e2 = e + C52418a.m58678e(9, this.f145874o);
            String str20 = this.f145875p;
            if (str20 != null) {
                e2 += C52418a.m58683j(10, str20);
            }
            String str21 = this.f145876q;
            if (str21 != null) {
                e2 += C52418a.m58683j(11, str21);
            }
            C49339ev2 ev23 = this.f145877r;
            if (ev23 != null) {
                e2 += C52418a.m58682i(12, ev23.computeSize());
            }
            String str22 = this.f145878s;
            if (str22 != null) {
                e2 += C52418a.m58683j(13, str22);
            }
            String str23 = this.f145879t;
            if (str23 != null) {
                e2 += C52418a.m58683j(900, str23);
            }
            int h = e2 + C52418a.m58681h(901, this.f145880u);
            String str24 = this.f145881v;
            return str24 != null ? h + C52418a.m58683j(C82613z.CTRL_INDEX, str24) : h;
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
            C52257zg zgVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zgVar.f145866d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    zgVar.f145867e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zgVar.f145868f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zgVar.f145869g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zgVar.f145870h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zgVar.f145871i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zgVar.f145872j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zgVar.f145873n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    zgVar.f145874o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    zgVar.f145875p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    zgVar.f145876q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49339ev2 ev24 = new C49339ev2();
                        if (bArr != null && bArr.length > 0) {
                            ev24.parseFrom(bArr);
                        }
                        zgVar.f145877r = ev24;
                    }
                    return 0;
                case 13:
                    zgVar.f145878s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    switch (intValue) {
                        case 900:
                            zgVar.f145879t = aVar3.mo141633k(intValue);
                            return 0;
                        case 901:
                            zgVar.f145880u = aVar3.mo141631i(intValue);
                            return 0;
                        case C82613z.CTRL_INDEX /*902*/:
                            zgVar.f145881v = aVar3.mo141633k(intValue);
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}
