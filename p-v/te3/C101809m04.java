package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m04 */
public class C101809m04 extends C47465a {

    /* renamed from: d */
    public LinkedList<dh4> f298763d = new LinkedList<>();

    /* renamed from: e */
    public String f298764e;

    /* renamed from: f */
    public String f298765f;

    /* renamed from: g */
    public String f298766g;

    /* renamed from: h */
    public String f298767h;

    /* renamed from: i */
    public int f298768i;

    /* renamed from: j */
    public int f298769j;

    /* renamed from: n */
    public int f298770n;

    /* renamed from: o */
    public int f298771o;

    /* renamed from: p */
    public int f298772p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101809m04)) {
            return false;
        }
        C101809m04 m042 = (C101809m04) aVar;
        return C46238a.m51546a(this.f298763d, m042.f298763d) && C46238a.m51546a(this.f298764e, m042.f298764e) && C46238a.m51546a(this.f298765f, m042.f298765f) && C46238a.m51546a(this.f298766g, m042.f298766g) && C46238a.m51546a(this.f298767h, m042.f298767h) && C46238a.m51546a(Integer.valueOf(this.f298768i), Integer.valueOf(m042.f298768i)) && C46238a.m51546a(Integer.valueOf(this.f298769j), Integer.valueOf(m042.f298769j)) && C46238a.m51546a(Integer.valueOf(this.f298770n), Integer.valueOf(m042.f298770n)) && C46238a.m51546a(Integer.valueOf(this.f298771o), Integer.valueOf(m042.f298771o)) && C46238a.m51546a(Integer.valueOf(this.f298772p), Integer.valueOf(m042.f298772p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f298764e != null) {
                aVar.mo74320g(1, 8, this.f298763d);
                String str = this.f298764e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f298765f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f298766g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f298767h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                aVar.mo74318e(6, this.f298768i);
                aVar.mo74318e(7, this.f298769j);
                aVar.mo74318e(8, this.f298770n);
                aVar.mo74318e(9, this.f298771o);
                aVar.mo74318e(10, this.f298772p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: clientID");
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f298763d) + 0;
            String str5 = this.f298764e;
            if (str5 != null) {
                g += C52418a.m58683j(2, str5);
            }
            String str6 = this.f298765f;
            if (str6 != null) {
                g += C52418a.m58683j(3, str6);
            }
            String str7 = this.f298766g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f298767h;
            if (str8 != null) {
                g += C52418a.m58683j(5, str8);
            }
            return g + C52418a.m58678e(6, this.f298768i) + C52418a.m58678e(7, this.f298769j) + C52418a.m58678e(8, this.f298770n) + C52418a.m58678e(9, this.f298771o) + C52418a.m58678e(10, this.f298772p);
        } else if (i == 2) {
            this.f298763d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298764e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: clientID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101809m04 m042 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        dh4 dh4 = new dh4();
                        if (bArr != null && bArr.length > 0) {
                            dh4.parseFrom(bArr);
                        }
                        m042.f298763d.add(dh4);
                    }
                    return 0;
                case 2:
                    m042.f298764e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m042.f298765f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m042.f298766g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m042.f298767h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m042.f298768i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    m042.f298769j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    m042.f298770n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    m042.f298771o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    m042.f298772p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
