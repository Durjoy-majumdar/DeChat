package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dy3 */
public class C77917dy3 extends C47465a {

    /* renamed from: d */
    public String f227190d;

    /* renamed from: e */
    public String f227191e;

    /* renamed from: f */
    public String f227192f;

    /* renamed from: g */
    public String f227193g;

    /* renamed from: h */
    public int f227194h;

    /* renamed from: i */
    public String f227195i;

    /* renamed from: j */
    public String f227196j;

    /* renamed from: n */
    public String f227197n;

    /* renamed from: o */
    public int f227198o;

    /* renamed from: p */
    public C48819b73 f227199p;

    /* renamed from: q */
    public String f227200q;

    /* renamed from: r */
    public String f227201r;

    /* renamed from: s */
    public int f227202s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77917dy3)) {
            return false;
        }
        C77917dy3 dy32 = (C77917dy3) aVar;
        return C46238a.m51546a(this.f227190d, dy32.f227190d) && C46238a.m51546a(this.f227191e, dy32.f227191e) && C46238a.m51546a(this.f227192f, dy32.f227192f) && C46238a.m51546a(this.f227193g, dy32.f227193g) && C46238a.m51546a(Integer.valueOf(this.f227194h), Integer.valueOf(dy32.f227194h)) && C46238a.m51546a(this.f227195i, dy32.f227195i) && C46238a.m51546a(this.f227196j, dy32.f227196j) && C46238a.m51546a(this.f227197n, dy32.f227197n) && C46238a.m51546a(Integer.valueOf(this.f227198o), Integer.valueOf(dy32.f227198o)) && C46238a.m51546a(this.f227199p, dy32.f227199p) && C46238a.m51546a(this.f227200q, dy32.f227200q) && C46238a.m51546a(this.f227201r, dy32.f227201r) && C46238a.m51546a(Integer.valueOf(this.f227202s), Integer.valueOf(dy32.f227202s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227190d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227191e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227192f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227193g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f227194h);
            String str5 = this.f227195i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f227196j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f227197n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f227198o);
            C48819b73 b732 = this.f227199p;
            if (b732 != null) {
                aVar.mo74322i(10, b732.computeSize());
                this.f227199p.writeFields(aVar);
            }
            String str8 = this.f227200q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f227201r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            aVar.mo74318e(13, this.f227202s);
            return 0;
        } else if (i2 == 1) {
            String str10 = this.f227190d;
            int j = str10 != null ? 0 + C52418a.m58683j(1, str10) : 0;
            String str11 = this.f227191e;
            if (str11 != null) {
                j += C52418a.m58683j(2, str11);
            }
            String str12 = this.f227192f;
            if (str12 != null) {
                j += C52418a.m58683j(3, str12);
            }
            String str13 = this.f227193g;
            if (str13 != null) {
                j += C52418a.m58683j(4, str13);
            }
            int e = j + C52418a.m58678e(5, this.f227194h);
            String str14 = this.f227195i;
            if (str14 != null) {
                e += C52418a.m58683j(6, str14);
            }
            String str15 = this.f227196j;
            if (str15 != null) {
                e += C52418a.m58683j(7, str15);
            }
            String str16 = this.f227197n;
            if (str16 != null) {
                e += C52418a.m58683j(8, str16);
            }
            int e2 = e + C52418a.m58678e(9, this.f227198o);
            C48819b73 b733 = this.f227199p;
            if (b733 != null) {
                e2 += C52418a.m58682i(10, b733.computeSize());
            }
            String str17 = this.f227200q;
            if (str17 != null) {
                e2 += C52418a.m58683j(11, str17);
            }
            String str18 = this.f227201r;
            if (str18 != null) {
                e2 += C52418a.m58683j(12, str18);
            }
            return e2 + C52418a.m58678e(13, this.f227202s);
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
            C77917dy3 dy32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dy32.f227190d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dy32.f227191e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dy32.f227192f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dy32.f227193g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dy32.f227194h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dy32.f227195i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dy32.f227196j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dy32.f227197n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dy32.f227198o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C48819b73 b734 = new C48819b73();
                        if (bArr != null && bArr.length > 0) {
                            b734.parseFrom(bArr);
                        }
                        dy32.f227199p = b734;
                    }
                    return 0;
                case 11:
                    dy32.f227200q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    dy32.f227201r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    dy32.f227202s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
