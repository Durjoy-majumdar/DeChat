package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m45 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<l45> f259682d = new LinkedList<>();

    /* renamed from: e */
    public String f259683e;

    /* renamed from: f */
    public String f259684f;

    /* renamed from: g */
    public String f259685g;

    /* renamed from: h */
    public String f259686h;

    /* renamed from: i */
    public String f259687i;

    /* renamed from: j */
    public int f259688j;

    /* renamed from: n */
    public String f259689n;

    /* renamed from: o */
    public String f259690o;

    /* renamed from: p */
    public String f259691p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m45)) {
            return false;
        }
        m45 m45 = (m45) aVar;
        return C46238a.m51546a(this.BaseRequest, m45.BaseRequest) && C46238a.m51546a(this.f259682d, m45.f259682d) && C46238a.m51546a(this.f259683e, m45.f259683e) && C46238a.m51546a(this.f259684f, m45.f259684f) && C46238a.m51546a(this.f259685g, m45.f259685g) && C46238a.m51546a(this.f259686h, m45.f259686h) && C46238a.m51546a(this.f259687i, m45.f259687i) && C46238a.m51546a(Integer.valueOf(this.f259688j), Integer.valueOf(m45.f259688j)) && C46238a.m51546a(this.f259689n, m45.f259689n) && C46238a.m51546a(this.f259690o, m45.f259690o) && C46238a.m51546a(this.f259691p, m45.f259691p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f259682d);
            String str = this.f259683e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f259684f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f259685g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f259686h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f259687i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f259688j);
            String str6 = this.f259689n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f259690o;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f259691p;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f259682d);
            String str9 = this.f259683e;
            if (str9 != null) {
                g += C52418a.m58683j(3, str9);
            }
            String str10 = this.f259684f;
            if (str10 != null) {
                g += C52418a.m58683j(4, str10);
            }
            String str11 = this.f259685g;
            if (str11 != null) {
                g += C52418a.m58683j(5, str11);
            }
            String str12 = this.f259686h;
            if (str12 != null) {
                g += C52418a.m58683j(6, str12);
            }
            String str13 = this.f259687i;
            if (str13 != null) {
                g += C52418a.m58683j(7, str13);
            }
            int e = g + C52418a.m58678e(8, this.f259688j);
            String str14 = this.f259689n;
            if (str14 != null) {
                e += C52418a.m58683j(9, str14);
            }
            String str15 = this.f259690o;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            String str16 = this.f259691p;
            return str16 != null ? e + C52418a.m58683j(11, str16) : e;
        } else if (i == 2) {
            this.f259682d.clear();
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
            m45 m45 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        m45.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        l45 l45 = new l45();
                        if (bArr2 != null && bArr2.length > 0) {
                            l45.parseFrom(bArr2);
                        }
                        m45.f259682d.add(l45);
                    }
                    return 0;
                case 3:
                    m45.f259683e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m45.f259684f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m45.f259685g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m45.f259686h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    m45.f259687i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    m45.f259688j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    m45.f259689n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    m45.f259690o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    m45.f259691p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
