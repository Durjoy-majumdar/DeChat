package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yr1 */
public class C64863yr1 extends C47465a {

    /* renamed from: d */
    public String f186583d;

    /* renamed from: e */
    public String f186584e;

    /* renamed from: f */
    public int f186585f;

    /* renamed from: g */
    public int f186586g;

    /* renamed from: h */
    public int f186587h;

    /* renamed from: i */
    public int f186588i;

    /* renamed from: j */
    public int f186589j;

    /* renamed from: n */
    public String f186590n;

    /* renamed from: o */
    public String f186591o;

    /* renamed from: p */
    public LinkedList<String> f186592p = new LinkedList<>();

    /* renamed from: q */
    public C64325ds1 f186593q;

    /* renamed from: r */
    public int f186594r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64863yr1)) {
            return false;
        }
        C64863yr1 yr12 = (C64863yr1) aVar;
        return C46238a.m51546a(this.f186583d, yr12.f186583d) && C46238a.m51546a(this.f186584e, yr12.f186584e) && C46238a.m51546a(Integer.valueOf(this.f186585f), Integer.valueOf(yr12.f186585f)) && C46238a.m51546a(Integer.valueOf(this.f186586g), Integer.valueOf(yr12.f186586g)) && C46238a.m51546a(Integer.valueOf(this.f186587h), Integer.valueOf(yr12.f186587h)) && C46238a.m51546a(Integer.valueOf(this.f186588i), Integer.valueOf(yr12.f186588i)) && C46238a.m51546a(Integer.valueOf(this.f186589j), Integer.valueOf(yr12.f186589j)) && C46238a.m51546a(this.f186590n, yr12.f186590n) && C46238a.m51546a(this.f186591o, yr12.f186591o) && C46238a.m51546a(this.f186592p, yr12.f186592p) && C46238a.m51546a(this.f186593q, yr12.f186593q) && C46238a.m51546a(Integer.valueOf(this.f186594r), Integer.valueOf(yr12.f186594r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186583d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186584e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f186585f);
            aVar.mo74318e(4, this.f186586g);
            aVar.mo74318e(5, this.f186587h);
            aVar.mo74318e(6, this.f186588i);
            aVar.mo74318e(7, this.f186589j);
            String str3 = this.f186590n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            String str4 = this.f186591o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74320g(10, 1, this.f186592p);
            C64325ds1 ds12 = this.f186593q;
            if (ds12 != null) {
                aVar.mo74322i(11, ds12.computeSize());
                this.f186593q.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f186594r);
            return 0;
        } else if (i == 1) {
            String str5 = this.f186583d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f186584e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f186585f) + C52418a.m58678e(4, this.f186586g) + C52418a.m58678e(5, this.f186587h) + C52418a.m58678e(6, this.f186588i) + C52418a.m58678e(7, this.f186589j);
            String str7 = this.f186590n;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            String str8 = this.f186591o;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            int g = e + C52418a.m58680g(10, 1, this.f186592p);
            C64325ds1 ds13 = this.f186593q;
            if (ds13 != null) {
                g += C52418a.m58682i(11, ds13.computeSize());
            }
            return g + C52418a.m58678e(12, this.f186594r);
        } else if (i == 2) {
            this.f186592p.clear();
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
            C64863yr1 yr12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yr12.f186583d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yr12.f186584e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yr12.f186585f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    yr12.f186586g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    yr12.f186587h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yr12.f186588i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    yr12.f186589j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    yr12.f186590n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    yr12.f186591o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    yr12.f186592p.add(aVar3.mo141633k(intValue));
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64325ds1 ds14 = new C64325ds1();
                        if (bArr != null && bArr.length > 0) {
                            ds14.parseFrom(bArr);
                        }
                        yr12.f186593q = ds14;
                    }
                    return 0;
                case 12:
                    yr12.f186594r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
