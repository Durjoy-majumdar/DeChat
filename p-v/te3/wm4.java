package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wm4 extends C101820nt3 {

    /* renamed from: d */
    public String f144138d;

    /* renamed from: e */
    public String f144139e;

    /* renamed from: f */
    public int f144140f;

    /* renamed from: g */
    public int f144141g;

    /* renamed from: h */
    public int f144142h;

    /* renamed from: i */
    public String f144143i;

    /* renamed from: j */
    public String f144144j;

    /* renamed from: n */
    public String f144145n;

    /* renamed from: o */
    public int f144146o;

    /* renamed from: p */
    public String f144147p;

    /* renamed from: q */
    public LinkedList<na4> f144148q = new LinkedList<>();

    /* renamed from: r */
    public int f144149r;

    /* renamed from: s */
    public int f144150s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wm4)) {
            return false;
        }
        wm4 wm4 = (wm4) aVar;
        return C46238a.m51546a(this.BaseRequest, wm4.BaseRequest) && C46238a.m51546a(this.f144138d, wm4.f144138d) && C46238a.m51546a(this.f144139e, wm4.f144139e) && C46238a.m51546a(Integer.valueOf(this.f144140f), Integer.valueOf(wm4.f144140f)) && C46238a.m51546a(Integer.valueOf(this.f144141g), Integer.valueOf(wm4.f144141g)) && C46238a.m51546a(Integer.valueOf(this.f144142h), Integer.valueOf(wm4.f144142h)) && C46238a.m51546a(this.f144143i, wm4.f144143i) && C46238a.m51546a(this.f144144j, wm4.f144144j) && C46238a.m51546a(this.f144145n, wm4.f144145n) && C46238a.m51546a(Integer.valueOf(this.f144146o), Integer.valueOf(wm4.f144146o)) && C46238a.m51546a(this.f144147p, wm4.f144147p) && C46238a.m51546a(this.f144148q, wm4.f144148q) && C46238a.m51546a(Integer.valueOf(this.f144149r), Integer.valueOf(wm4.f144149r)) && C46238a.m51546a(Integer.valueOf(this.f144150s), Integer.valueOf(wm4.f144150s));
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
            String str = this.f144138d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144139e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f144140f);
            aVar.mo74318e(5, this.f144141g);
            aVar.mo74318e(6, this.f144142h);
            String str3 = this.f144143i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f144144j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f144145n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f144146o);
            String str6 = this.f144147p;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74320g(12, 8, this.f144148q);
            aVar.mo74318e(13, this.f144149r);
            aVar.mo74318e(14, this.f144150s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str7 = this.f144138d;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f144139e;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            int e = i3 + C52418a.m58678e(4, this.f144140f) + C52418a.m58678e(5, this.f144141g) + C52418a.m58678e(6, this.f144142h);
            String str9 = this.f144143i;
            if (str9 != null) {
                e += C52418a.m58683j(7, str9);
            }
            String str10 = this.f144144j;
            if (str10 != null) {
                e += C52418a.m58683j(8, str10);
            }
            String str11 = this.f144145n;
            if (str11 != null) {
                e += C52418a.m58683j(9, str11);
            }
            int e2 = e + C52418a.m58678e(10, this.f144146o);
            String str12 = this.f144147p;
            if (str12 != null) {
                e2 += C52418a.m58683j(11, str12);
            }
            return e2 + C52418a.m58680g(12, 8, this.f144148q) + C52418a.m58678e(13, this.f144149r) + C52418a.m58678e(14, this.f144150s);
        } else if (i2 == 2) {
            this.f144148q.clear();
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
            wm4 wm4 = objArr[1];
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
                        wm4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    wm4.f144138d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wm4.f144139e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wm4.f144140f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wm4.f144141g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    wm4.f144142h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    wm4.f144143i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wm4.f144144j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wm4.f144145n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    wm4.f144146o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    wm4.f144147p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        na4 na4 = new na4();
                        if (bArr2 != null && bArr2.length > 0) {
                            na4.parseFrom(bArr2);
                        }
                        wm4.f144148q.add(na4);
                    }
                    return 0;
                case 13:
                    wm4.f144149r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    wm4.f144150s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
