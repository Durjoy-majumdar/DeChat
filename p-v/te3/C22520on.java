package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.on */
public class C22520on extends C47465a {

    /* renamed from: d */
    public String f64362d;

    /* renamed from: e */
    public String f64363e;

    /* renamed from: f */
    public String f64364f;

    /* renamed from: g */
    public String f64365g;

    /* renamed from: h */
    public String f64366h;

    /* renamed from: i */
    public String f64367i;

    /* renamed from: j */
    public int f64368j;

    /* renamed from: n */
    public String f64369n;

    /* renamed from: o */
    public int f64370o;

    /* renamed from: p */
    public String f64371p;

    /* renamed from: q */
    public C51997xn f64372q;

    /* renamed from: r */
    public String f64373r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22520on)) {
            return false;
        }
        C22520on onVar = (C22520on) aVar;
        return C46238a.m51546a(this.f64362d, onVar.f64362d) && C46238a.m51546a(this.f64363e, onVar.f64363e) && C46238a.m51546a(this.f64364f, onVar.f64364f) && C46238a.m51546a(this.f64365g, onVar.f64365g) && C46238a.m51546a(this.f64366h, onVar.f64366h) && C46238a.m51546a(this.f64367i, onVar.f64367i) && C46238a.m51546a(Integer.valueOf(this.f64368j), Integer.valueOf(onVar.f64368j)) && C46238a.m51546a(this.f64369n, onVar.f64369n) && C46238a.m51546a(Integer.valueOf(this.f64370o), Integer.valueOf(onVar.f64370o)) && C46238a.m51546a(this.f64371p, onVar.f64371p) && C46238a.m51546a(this.f64372q, onVar.f64372q) && C46238a.m51546a(this.f64373r, onVar.f64373r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64362d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64363e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64364f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64365g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f64366h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f64367i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f64368j);
            String str7 = this.f64369n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f64370o);
            String str8 = this.f64371p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            C51997xn xnVar = this.f64372q;
            if (xnVar != null) {
                aVar.mo74322i(11, xnVar.computeSize());
                this.f64372q.writeFields(aVar);
            }
            String str9 = this.f64373r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            return 0;
        } else if (i == 1) {
            String str10 = this.f64362d;
            if (str10 != null) {
                i2 = 0 + C52418a.m58683j(1, str10);
            }
            String str11 = this.f64363e;
            if (str11 != null) {
                i2 += C52418a.m58683j(2, str11);
            }
            String str12 = this.f64364f;
            if (str12 != null) {
                i2 += C52418a.m58683j(3, str12);
            }
            String str13 = this.f64365g;
            if (str13 != null) {
                i2 += C52418a.m58683j(4, str13);
            }
            String str14 = this.f64366h;
            if (str14 != null) {
                i2 += C52418a.m58683j(5, str14);
            }
            String str15 = this.f64367i;
            if (str15 != null) {
                i2 += C52418a.m58683j(6, str15);
            }
            int e = i2 + C52418a.m58678e(7, this.f64368j);
            String str16 = this.f64369n;
            if (str16 != null) {
                e += C52418a.m58683j(8, str16);
            }
            int e2 = e + C52418a.m58678e(9, this.f64370o);
            String str17 = this.f64371p;
            if (str17 != null) {
                e2 += C52418a.m58683j(10, str17);
            }
            C51997xn xnVar2 = this.f64372q;
            if (xnVar2 != null) {
                e2 += C52418a.m58682i(11, xnVar2.computeSize());
            }
            String str18 = this.f64373r;
            return str18 != null ? e2 + C52418a.m58683j(12, str18) : e2;
        } else if (i == 2) {
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
            C22520on onVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    onVar.f64362d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    onVar.f64363e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    onVar.f64364f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    onVar.f64365g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    onVar.f64366h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    onVar.f64367i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    onVar.f64368j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    onVar.f64369n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    onVar.f64370o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    onVar.f64371p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        onVar.f64372q = xnVar3;
                    }
                    return 0;
                case 12:
                    onVar.f64373r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
