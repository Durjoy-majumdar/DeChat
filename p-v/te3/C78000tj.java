package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tj */
public class C78000tj extends C101820nt3 {

    /* renamed from: d */
    public int f228263d;

    /* renamed from: e */
    public int f228264e;

    /* renamed from: f */
    public int f228265f;

    /* renamed from: g */
    public String f228266g;

    /* renamed from: h */
    public String f228267h;

    /* renamed from: i */
    public String f228268i;

    /* renamed from: j */
    public String f228269j;

    /* renamed from: n */
    public String f228270n;

    /* renamed from: o */
    public String f228271o;

    /* renamed from: p */
    public int f228272p;

    /* renamed from: q */
    public int f228273q;

    /* renamed from: r */
    public LinkedList<C77920eb0> f228274r = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78000tj)) {
            return false;
        }
        C78000tj tjVar = (C78000tj) aVar;
        return C46238a.m51546a(this.BaseRequest, tjVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f228263d), Integer.valueOf(tjVar.f228263d)) && C46238a.m51546a(Integer.valueOf(this.f228264e), Integer.valueOf(tjVar.f228264e)) && C46238a.m51546a(Integer.valueOf(this.f228265f), Integer.valueOf(tjVar.f228265f)) && C46238a.m51546a(this.f228266g, tjVar.f228266g) && C46238a.m51546a(this.f228267h, tjVar.f228267h) && C46238a.m51546a(this.f228268i, tjVar.f228268i) && C46238a.m51546a(this.f228269j, tjVar.f228269j) && C46238a.m51546a(this.f228270n, tjVar.f228270n) && C46238a.m51546a(this.f228271o, tjVar.f228271o) && C46238a.m51546a(Integer.valueOf(this.f228272p), Integer.valueOf(tjVar.f228272p)) && C46238a.m51546a(Integer.valueOf(this.f228273q), Integer.valueOf(tjVar.f228273q)) && C46238a.m51546a(this.f228274r, tjVar.f228274r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f228263d);
            aVar.mo74318e(3, this.f228264e);
            aVar.mo74318e(4, this.f228265f);
            String str = this.f228266g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f228267h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f228268i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f228269j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f228270n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f228271o;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            aVar.mo74318e(11, this.f228272p);
            aVar.mo74318e(12, this.f228273q);
            aVar.mo74320g(13, 8, this.f228274r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = (iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f228263d) + C52418a.m58678e(3, this.f228264e) + C52418a.m58678e(4, this.f228265f);
            String str7 = this.f228266g;
            if (str7 != null) {
                i3 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f228267h;
            if (str8 != null) {
                i3 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f228268i;
            if (str9 != null) {
                i3 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f228269j;
            if (str10 != null) {
                i3 += C52418a.m58683j(8, str10);
            }
            String str11 = this.f228270n;
            if (str11 != null) {
                i3 += C52418a.m58683j(9, str11);
            }
            String str12 = this.f228271o;
            if (str12 != null) {
                i3 += C52418a.m58683j(10, str12);
            }
            return i3 + C52418a.m58678e(11, this.f228272p) + C52418a.m58678e(12, this.f228273q) + C52418a.m58680g(13, 8, this.f228274r);
        } else if (i2 == 2) {
            this.f228274r.clear();
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
            C78000tj tjVar = objArr[1];
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
                        tjVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tjVar.f228263d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tjVar.f228264e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    tjVar.f228265f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    tjVar.f228266g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tjVar.f228267h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tjVar.f228268i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tjVar.f228269j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    tjVar.f228270n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    tjVar.f228271o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    tjVar.f228272p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    tjVar.f228273q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77920eb0 eb02 = new C77920eb0();
                        if (bArr2 != null && bArr2.length > 0) {
                            eb02.parseFrom(bArr2);
                        }
                        tjVar.f228274r.add(eb02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
