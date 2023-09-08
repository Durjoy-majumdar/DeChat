package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wc0 */
public class C101861wc0 extends C47465a {

    /* renamed from: d */
    public String f299731d;

    /* renamed from: e */
    public String f299732e;

    /* renamed from: f */
    public String f299733f;

    /* renamed from: g */
    public String f299734g;

    /* renamed from: h */
    public String f299735h;

    /* renamed from: i */
    public String f299736i;

    /* renamed from: j */
    public LinkedList<String> f299737j = new LinkedList<>();

    /* renamed from: n */
    public int f299738n;

    /* renamed from: o */
    public C101801kd0 f299739o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101861wc0)) {
            return false;
        }
        C101861wc0 wc02 = (C101861wc0) aVar;
        return C46238a.m51546a(this.f299731d, wc02.f299731d) && C46238a.m51546a(this.f299732e, wc02.f299732e) && C46238a.m51546a(this.f299733f, wc02.f299733f) && C46238a.m51546a(this.f299734g, wc02.f299734g) && C46238a.m51546a(this.f299735h, wc02.f299735h) && C46238a.m51546a(this.f299736i, wc02.f299736i) && C46238a.m51546a(this.f299737j, wc02.f299737j) && C46238a.m51546a(Integer.valueOf(this.f299738n), Integer.valueOf(wc02.f299738n)) && C46238a.m51546a(this.f299739o, wc02.f299739o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299731d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299732e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299733f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f299734g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f299735h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f299736i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74320g(7, 1, this.f299737j);
            aVar.mo74318e(8, this.f299738n);
            C101801kd0 kd02 = this.f299739o;
            if (kd02 != null) {
                aVar.mo74322i(9, kd02.computeSize());
                this.f299739o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f299731d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f299732e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f299733f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f299734g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f299735h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f299736i;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            int g = i2 + C52418a.m58680g(7, 1, this.f299737j) + C52418a.m58678e(8, this.f299738n);
            C101801kd0 kd03 = this.f299739o;
            return kd03 != null ? g + C52418a.m58682i(9, kd03.computeSize()) : g;
        } else if (i == 2) {
            this.f299737j.clear();
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
            C101861wc0 wc02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wc02.f299731d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wc02.f299732e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wc02.f299733f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wc02.f299734g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wc02.f299735h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wc02.f299736i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    wc02.f299737j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    wc02.f299738n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101801kd0 kd04 = new C101801kd0();
                        if (bArr != null && bArr.length > 0) {
                            kd04.parseFrom(bArr);
                        }
                        wc02.f299739o = kd04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
