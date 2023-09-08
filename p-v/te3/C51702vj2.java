package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vj2 */
public class C51702vj2 extends C101820nt3 {

    /* renamed from: d */
    public String f143514d;

    /* renamed from: e */
    public String f143515e;

    /* renamed from: f */
    public LinkedList<String> f143516f = new LinkedList<>();

    /* renamed from: g */
    public String f143517g;

    /* renamed from: h */
    public String f143518h;

    /* renamed from: i */
    public String f143519i;

    /* renamed from: j */
    public String f143520j;

    /* renamed from: n */
    public int f143521n;

    /* renamed from: o */
    public String f143522o;

    /* renamed from: p */
    public LinkedList<String> f143523p = new LinkedList<>();

    /* renamed from: q */
    public String f143524q;

    /* renamed from: r */
    public int f143525r;

    /* renamed from: s */
    public int f143526s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51702vj2)) {
            return false;
        }
        C51702vj2 vj22 = (C51702vj2) aVar;
        return C46238a.m51546a(this.BaseRequest, vj22.BaseRequest) && C46238a.m51546a(this.f143514d, vj22.f143514d) && C46238a.m51546a(this.f143515e, vj22.f143515e) && C46238a.m51546a(this.f143516f, vj22.f143516f) && C46238a.m51546a(this.f143517g, vj22.f143517g) && C46238a.m51546a(this.f143518h, vj22.f143518h) && C46238a.m51546a(this.f143519i, vj22.f143519i) && C46238a.m51546a(this.f143520j, vj22.f143520j) && C46238a.m51546a(Integer.valueOf(this.f143521n), Integer.valueOf(vj22.f143521n)) && C46238a.m51546a(this.f143522o, vj22.f143522o) && C46238a.m51546a(this.f143523p, vj22.f143523p) && C46238a.m51546a(this.f143524q, vj22.f143524q) && C46238a.m51546a(Integer.valueOf(this.f143525r), Integer.valueOf(vj22.f143525r)) && C46238a.m51546a(Integer.valueOf(this.f143526s), Integer.valueOf(vj22.f143526s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f143514d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143515e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 1, this.f143516f);
            String str3 = this.f143517g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f143518h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f143519i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f143520j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.f143521n);
            String str7 = this.f143522o;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74320g(11, 1, this.f143523p);
            String str8 = this.f143524q;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            aVar.mo74318e(13, this.f143525r);
            aVar.mo74318e(14, this.f143526s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str9 = this.f143514d;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f143515e;
            if (str10 != null) {
                i3 += C52418a.m58683j(3, str10);
            }
            int g = i3 + C52418a.m58680g(4, 1, this.f143516f);
            String str11 = this.f143517g;
            if (str11 != null) {
                g += C52418a.m58683j(5, str11);
            }
            String str12 = this.f143518h;
            if (str12 != null) {
                g += C52418a.m58683j(6, str12);
            }
            String str13 = this.f143519i;
            if (str13 != null) {
                g += C52418a.m58683j(7, str13);
            }
            String str14 = this.f143520j;
            if (str14 != null) {
                g += C52418a.m58683j(8, str14);
            }
            int e = g + C52418a.m58678e(9, this.f143521n);
            String str15 = this.f143522o;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            int g2 = e + C52418a.m58680g(11, 1, this.f143523p);
            String str16 = this.f143524q;
            if (str16 != null) {
                g2 += C52418a.m58683j(12, str16);
            }
            return g2 + C52418a.m58678e(13, this.f143525r) + C52418a.m58678e(14, this.f143526s);
        } else if (i2 == 2) {
            this.f143516f.clear();
            this.f143523p.clear();
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
            C51702vj2 vj22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        vj22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    vj22.f143514d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vj22.f143515e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vj22.f143516f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    vj22.f143517g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vj22.f143518h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vj22.f143519i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    vj22.f143520j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    vj22.f143521n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    vj22.f143522o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    vj22.f143523p.add(aVar3.mo141633k(intValue));
                    return 0;
                case 12:
                    vj22.f143524q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    vj22.f143525r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    vj22.f143526s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
