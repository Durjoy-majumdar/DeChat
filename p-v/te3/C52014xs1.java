package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xs1 */
public class C52014xs1 extends C101820nt3 {

    /* renamed from: d */
    public String f144917d;

    /* renamed from: e */
    public String f144918e;

    /* renamed from: f */
    public String f144919f;

    /* renamed from: g */
    public String f144920g;

    /* renamed from: h */
    public String f144921h;

    /* renamed from: i */
    public String f144922i;

    /* renamed from: j */
    public String f144923j;

    /* renamed from: n */
    public String f144924n;

    /* renamed from: o */
    public int f144925o;

    /* renamed from: p */
    public String f144926p;

    /* renamed from: q */
    public int f144927q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52014xs1)) {
            return false;
        }
        C52014xs1 xs12 = (C52014xs1) aVar;
        return C46238a.m51546a(this.BaseRequest, xs12.BaseRequest) && C46238a.m51546a(this.f144917d, xs12.f144917d) && C46238a.m51546a(this.f144918e, xs12.f144918e) && C46238a.m51546a(this.f144919f, xs12.f144919f) && C46238a.m51546a(this.f144920g, xs12.f144920g) && C46238a.m51546a(this.f144921h, xs12.f144921h) && C46238a.m51546a(this.f144922i, xs12.f144922i) && C46238a.m51546a(this.f144923j, xs12.f144923j) && C46238a.m51546a(this.f144924n, xs12.f144924n) && C46238a.m51546a(Integer.valueOf(this.f144925o), Integer.valueOf(xs12.f144925o)) && C46238a.m51546a(this.f144926p, xs12.f144926p) && C46238a.m51546a(Integer.valueOf(this.f144927q), Integer.valueOf(xs12.f144927q));
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
            String str = this.f144917d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144918e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144919f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f144920g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f144921h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f144922i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f144923j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f144924n;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f144925o);
            String str9 = this.f144926p;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            aVar.mo74318e(12, this.f144927q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str10 = this.f144917d;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f144918e;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f144919f;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f144920g;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f144921h;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f144922i;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f144923j;
            if (str16 != null) {
                i2 += C52418a.m58683j(8, str16);
            }
            String str17 = this.f144924n;
            if (str17 != null) {
                i2 += C52418a.m58683j(9, str17);
            }
            int e = i2 + C52418a.m58678e(10, this.f144925o);
            String str18 = this.f144926p;
            if (str18 != null) {
                e += C52418a.m58683j(11, str18);
            }
            return e + C52418a.m58678e(12, this.f144927q);
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
            C52014xs1 xs12 = objArr[1];
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
                        xs12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xs12.f144917d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xs12.f144918e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xs12.f144919f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xs12.f144920g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xs12.f144921h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    xs12.f144922i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xs12.f144923j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xs12.f144924n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xs12.f144925o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    xs12.f144926p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    xs12.f144927q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
