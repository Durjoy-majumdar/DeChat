package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ae0 */
public class C101756ae0 extends C47465a {

    /* renamed from: d */
    public String f297863d;

    /* renamed from: e */
    public boolean f297864e = false;

    /* renamed from: f */
    public String f297865f;

    /* renamed from: g */
    public boolean f297866g = false;

    /* renamed from: h */
    public String f297867h;

    /* renamed from: i */
    public boolean f297868i = false;

    /* renamed from: j */
    public String f297869j;

    /* renamed from: n */
    public boolean f297870n = false;

    /* renamed from: o */
    public int f297871o;

    /* renamed from: p */
    public boolean f297872p = false;

    /* renamed from: q */
    public int f297873q;

    /* renamed from: r */
    public boolean f297874r = false;

    /* renamed from: s */
    public String f297875s;

    /* renamed from: t */
    public boolean f297876t = false;

    /* renamed from: u */
    public String f297877u;

    /* renamed from: v */
    public boolean f297878v = false;

    /* renamed from: w */
    public int f297879w;

    /* renamed from: x */
    public boolean f297880x = false;

    /* renamed from: y */
    public LinkedList<C52097yc0> f297881y = new LinkedList<>();

    /* renamed from: z */
    public boolean f297882z = false;

    /* renamed from: b */
    public final String mo141187b() {
        return this.f297867h;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101756ae0)) {
            return false;
        }
        C101756ae0 ae02 = (C101756ae0) aVar;
        return C46238a.m51546a(this.f297863d, ae02.f297863d) && C46238a.m51546a(this.f297865f, ae02.f297865f) && C46238a.m51546a(this.f297867h, ae02.f297867h) && C46238a.m51546a(this.f297869j, ae02.f297869j) && C46238a.m51546a(Integer.valueOf(this.f297871o), Integer.valueOf(ae02.f297871o)) && C46238a.m51546a(Integer.valueOf(this.f297873q), Integer.valueOf(ae02.f297873q)) && C46238a.m51546a(this.f297875s, ae02.f297875s) && C46238a.m51546a(this.f297877u, ae02.f297877u) && C46238a.m51546a(Integer.valueOf(this.f297879w), Integer.valueOf(ae02.f297879w)) && C46238a.m51546a(this.f297881y, ae02.f297881y);
    }

    /* renamed from: d */
    public final int mo141188d() {
        return this.f297873q;
    }

    /* renamed from: f */
    public final String mo141189f() {
        return this.f297865f;
    }

    /* renamed from: j */
    public final int mo141190j() {
        return this.f297879w;
    }

    /* renamed from: k */
    public final int mo141191k() {
        return this.f297871o;
    }

    /* renamed from: l */
    public final String mo141192l() {
        return this.f297869j;
    }

    /* renamed from: m */
    public final String mo141193m() {
        return this.f297863d;
    }

    /* renamed from: n */
    public final C101756ae0 mo141194n(String str) {
        this.f297865f = str;
        this.f297866g = true;
        return this;
    }

    /* renamed from: o */
    public final C101756ae0 mo141195o(int i) {
        this.f297879w = i;
        this.f297880x = true;
        return this;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f297863d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f297865f;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f297867h;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f297869j;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            if (this.f297872p) {
                aVar.mo74318e(5, this.f297871o);
            }
            if (this.f297874r) {
                aVar.mo74318e(6, this.f297873q);
            }
            String str5 = this.f297875s;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f297877u;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            if (this.f297880x) {
                aVar.mo74318e(9, this.f297879w);
            }
            aVar.mo74320g(10, 8, this.f297881y);
            return 0;
        } else if (i == 1) {
            String str7 = this.f297863d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f297865f;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f297867h;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f297869j;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            if (this.f297872p) {
                i2 += C52418a.m58678e(5, this.f297871o);
            }
            if (this.f297874r) {
                i2 += C52418a.m58678e(6, this.f297873q);
            }
            String str11 = this.f297875s;
            if (str11 != null) {
                i2 += C52418a.m58683j(7, str11);
            }
            String str12 = this.f297877u;
            if (str12 != null) {
                i2 += C52418a.m58683j(8, str12);
            }
            if (this.f297880x) {
                i2 += C52418a.m58678e(9, this.f297879w);
            }
            return i2 + C52418a.m58680g(10, 8, this.f297881y);
        } else if (i == 2) {
            this.f297881y.clear();
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
            C101756ae0 ae02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ae02.f297863d = aVar3.mo141633k(intValue);
                    ae02.f297864e = true;
                    return 0;
                case 2:
                    ae02.f297865f = aVar3.mo141633k(intValue);
                    ae02.f297866g = true;
                    return 0;
                case 3:
                    ae02.f297867h = aVar3.mo141633k(intValue);
                    ae02.f297868i = true;
                    return 0;
                case 4:
                    ae02.f297869j = aVar3.mo141633k(intValue);
                    ae02.f297870n = true;
                    return 0;
                case 5:
                    ae02.f297871o = aVar3.mo141629g(intValue);
                    ae02.f297872p = true;
                    return 0;
                case 6:
                    ae02.f297873q = aVar3.mo141629g(intValue);
                    ae02.f297874r = true;
                    return 0;
                case 7:
                    ae02.f297875s = aVar3.mo141633k(intValue);
                    ae02.f297876t = true;
                    return 0;
                case 8:
                    ae02.f297877u = aVar3.mo141633k(intValue);
                    ae02.f297878v = true;
                    return 0;
                case 9:
                    ae02.f297879w = aVar3.mo141629g(intValue);
                    ae02.f297880x = true;
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52097yc0 yc02 = new C52097yc0();
                        if (bArr != null && bArr.length > 0) {
                            yc02.parseFrom(bArr);
                        }
                        ae02.f297881y.add(yc02);
                    }
                    ae02.f297882z = true;
                    return 0;
                default:
                    return -1;
            }
        }
    }

    /* renamed from: p */
    public final C101756ae0 mo141196p(int i) {
        this.f297871o = i;
        this.f297872p = true;
        return this;
    }

    /* renamed from: q */
    public final C101756ae0 mo141197q(String str) {
        this.f297869j = str;
        this.f297870n = true;
        return this;
    }

    /* renamed from: r */
    public final C101756ae0 mo141198r(String str) {
        this.f297863d = str;
        this.f297864e = true;
        return this;
    }
}
