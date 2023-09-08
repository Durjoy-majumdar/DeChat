package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dz */
public class C49204dz extends C47465a {

    /* renamed from: d */
    public String f132567d;

    /* renamed from: e */
    public String f132568e;

    /* renamed from: f */
    public String f132569f;

    /* renamed from: g */
    public String f132570g;

    /* renamed from: h */
    public String f132571h;

    /* renamed from: i */
    public LinkedList<String> f132572i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<String> f132573j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<String> f132574n = new LinkedList<>();

    /* renamed from: o */
    public String f132575o;

    /* renamed from: p */
    public String f132576p;

    /* renamed from: q */
    public boolean f132577q;

    /* renamed from: r */
    public z35 f132578r;

    /* renamed from: s */
    public LinkedList<String> f132579s = new LinkedList<>();

    /* renamed from: t */
    public LinkedList<String> f132580t = new LinkedList<>();

    /* renamed from: u */
    public LinkedList<String> f132581u = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49204dz)) {
            return false;
        }
        C49204dz dzVar = (C49204dz) aVar;
        return C46238a.m51546a(this.f132567d, dzVar.f132567d) && C46238a.m51546a(this.f132568e, dzVar.f132568e) && C46238a.m51546a(this.f132569f, dzVar.f132569f) && C46238a.m51546a(this.f132570g, dzVar.f132570g) && C46238a.m51546a(this.f132571h, dzVar.f132571h) && C46238a.m51546a(this.f132572i, dzVar.f132572i) && C46238a.m51546a(this.f132573j, dzVar.f132573j) && C46238a.m51546a(this.f132574n, dzVar.f132574n) && C46238a.m51546a(this.f132575o, dzVar.f132575o) && C46238a.m51546a(this.f132576p, dzVar.f132576p) && C46238a.m51546a(Boolean.valueOf(this.f132577q), Boolean.valueOf(dzVar.f132577q)) && C46238a.m51546a(this.f132578r, dzVar.f132578r) && C46238a.m51546a(this.f132579s, dzVar.f132579s) && C46238a.m51546a(this.f132580t, dzVar.f132580t) && C46238a.m51546a(this.f132581u, dzVar.f132581u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132567d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132568e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132569f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f132570g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f132571h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74320g(6, 1, this.f132572i);
            aVar.mo74320g(7, 1, this.f132573j);
            aVar.mo74320g(8, 1, this.f132574n);
            String str6 = this.f132575o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f132576p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74314a(11, this.f132577q);
            z35 z35 = this.f132578r;
            if (z35 != null) {
                aVar.mo74322i(12, z35.computeSize());
                this.f132578r.writeFields(aVar);
            }
            aVar.mo74320g(13, 1, this.f132579s);
            aVar.mo74320g(14, 1, this.f132580t);
            aVar.mo74320g(15, 1, this.f132581u);
            return 0;
        } else if (i2 == 1) {
            String str8 = this.f132567d;
            if (str8 != null) {
                i3 = C52418a.m58683j(1, str8) + 0;
            }
            String str9 = this.f132568e;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f132569f;
            if (str10 != null) {
                i3 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f132570g;
            if (str11 != null) {
                i3 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f132571h;
            if (str12 != null) {
                i3 += C52418a.m58683j(5, str12);
            }
            int g = i3 + C52418a.m58680g(6, 1, this.f132572i) + C52418a.m58680g(7, 1, this.f132573j) + C52418a.m58680g(8, 1, this.f132574n);
            String str13 = this.f132575o;
            if (str13 != null) {
                g += C52418a.m58683j(9, str13);
            }
            String str14 = this.f132576p;
            if (str14 != null) {
                g += C52418a.m58683j(10, str14);
            }
            int a = g + C52418a.m58674a(11, this.f132577q);
            z35 z352 = this.f132578r;
            if (z352 != null) {
                a += C52418a.m58682i(12, z352.computeSize());
            }
            return a + C52418a.m58680g(13, 1, this.f132579s) + C52418a.m58680g(14, 1, this.f132580t) + C52418a.m58680g(15, 1, this.f132581u);
        } else if (i2 == 2) {
            this.f132572i.clear();
            this.f132573j.clear();
            this.f132574n.clear();
            this.f132579s.clear();
            this.f132580t.clear();
            this.f132581u.clear();
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
            C49204dz dzVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dzVar.f132567d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dzVar.f132568e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dzVar.f132569f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dzVar.f132570g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dzVar.f132571h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dzVar.f132572i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    dzVar.f132573j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    dzVar.f132574n.add(aVar3.mo141633k(intValue));
                    return 0;
                case 9:
                    dzVar.f132575o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    dzVar.f132576p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    dzVar.f132577q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        z35 z353 = new z35();
                        if (bArr != null && bArr.length > 0) {
                            z353.parseFrom(bArr);
                        }
                        dzVar.f132578r = z353;
                    }
                    return 0;
                case 13:
                    dzVar.f132579s.add(aVar3.mo141633k(intValue));
                    return 0;
                case 14:
                    dzVar.f132580t.add(aVar3.mo141633k(intValue));
                    return 0;
                case 15:
                    dzVar.f132581u.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
