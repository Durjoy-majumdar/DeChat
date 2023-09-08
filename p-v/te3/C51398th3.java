package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.th3 */
public class C51398th3 extends C47465a {

    /* renamed from: d */
    public int f142221d;

    /* renamed from: e */
    public int f142222e;

    /* renamed from: f */
    public String f142223f;

    /* renamed from: g */
    public LinkedList<String> f142224g = new LinkedList<>();

    /* renamed from: h */
    public int f142225h;

    /* renamed from: i */
    public int f142226i;

    /* renamed from: j */
    public int f142227j;

    /* renamed from: n */
    public C89349b f142228n;

    /* renamed from: o */
    public String f142229o;

    /* renamed from: p */
    public String f142230p;

    /* renamed from: q */
    public int f142231q;

    /* renamed from: r */
    public C89349b f142232r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51398th3)) {
            return false;
        }
        C51398th3 th32 = (C51398th3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142221d), Integer.valueOf(th32.f142221d)) && C46238a.m51546a(Integer.valueOf(this.f142222e), Integer.valueOf(th32.f142222e)) && C46238a.m51546a(this.f142223f, th32.f142223f) && C46238a.m51546a(this.f142224g, th32.f142224g) && C46238a.m51546a(Integer.valueOf(this.f142225h), Integer.valueOf(th32.f142225h)) && C46238a.m51546a(Integer.valueOf(this.f142226i), Integer.valueOf(th32.f142226i)) && C46238a.m51546a(Integer.valueOf(this.f142227j), Integer.valueOf(th32.f142227j)) && C46238a.m51546a(this.f142228n, th32.f142228n) && C46238a.m51546a(this.f142229o, th32.f142229o) && C46238a.m51546a(this.f142230p, th32.f142230p) && C46238a.m51546a(Integer.valueOf(this.f142231q), Integer.valueOf(th32.f142231q)) && C46238a.m51546a(this.f142232r, th32.f142232r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142221d);
            aVar.mo74318e(2, this.f142222e);
            String str = this.f142223f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 1, this.f142224g);
            aVar.mo74318e(5, this.f142225h);
            aVar.mo74318e(6, this.f142226i);
            aVar.mo74318e(7, this.f142227j);
            C89349b bVar = this.f142228n;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            String str2 = this.f142229o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            String str3 = this.f142230p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            aVar.mo74318e(11, this.f142231q);
            C89349b bVar2 = this.f142232r;
            if (bVar2 != null) {
                aVar.mo74315b(12, bVar2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142221d) + 0 + C52418a.m58678e(2, this.f142222e);
            String str4 = this.f142223f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int g = e + C52418a.m58680g(4, 1, this.f142224g) + C52418a.m58678e(5, this.f142225h) + C52418a.m58678e(6, this.f142226i) + C52418a.m58678e(7, this.f142227j);
            C89349b bVar3 = this.f142228n;
            if (bVar3 != null) {
                g += C52418a.m58675b(8, bVar3);
            }
            String str5 = this.f142229o;
            if (str5 != null) {
                g += C52418a.m58683j(9, str5);
            }
            String str6 = this.f142230p;
            if (str6 != null) {
                g += C52418a.m58683j(10, str6);
            }
            int e2 = g + C52418a.m58678e(11, this.f142231q);
            C89349b bVar4 = this.f142232r;
            return bVar4 != null ? e2 + C52418a.m58675b(12, bVar4) : e2;
        } else if (i == 2) {
            this.f142224g.clear();
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
            C51398th3 th32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    th32.f142221d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    th32.f142222e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    th32.f142223f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    th32.f142224g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    th32.f142225h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    th32.f142226i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    th32.f142227j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    th32.f142228n = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    th32.f142229o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    th32.f142230p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    th32.f142231q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    th32.f142232r = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
