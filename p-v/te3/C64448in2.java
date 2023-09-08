package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.in2 */
public class C64448in2 extends C47465a {

    /* renamed from: d */
    public String f183698d;

    /* renamed from: e */
    public String f183699e;

    /* renamed from: f */
    public String f183700f;

    /* renamed from: g */
    public String f183701g;

    /* renamed from: h */
    public eo4 f183702h;

    /* renamed from: i */
    public String f183703i;

    /* renamed from: j */
    public String f183704j;

    /* renamed from: n */
    public String f183705n;

    /* renamed from: o */
    public String f183706o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64448in2)) {
            return false;
        }
        C64448in2 in22 = (C64448in2) aVar;
        return C46238a.m51546a(this.f183698d, in22.f183698d) && C46238a.m51546a(this.f183699e, in22.f183699e) && C46238a.m51546a(this.f183700f, in22.f183700f) && C46238a.m51546a(this.f183701g, in22.f183701g) && C46238a.m51546a(this.f183702h, in22.f183702h) && C46238a.m51546a(this.f183703i, in22.f183703i) && C46238a.m51546a(this.f183704j, in22.f183704j) && C46238a.m51546a(this.f183705n, in22.f183705n) && C46238a.m51546a(this.f183706o, in22.f183706o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183698d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183699e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183700f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f183701g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            eo4 eo4 = this.f183702h;
            if (eo4 != null) {
                aVar.mo74322i(5, eo4.computeSize());
                this.f183702h.writeFields(aVar);
            }
            String str5 = this.f183703i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f183704j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f183705n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f183706o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f183698d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f183699e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f183700f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f183701g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            eo4 eo42 = this.f183702h;
            if (eo42 != null) {
                i2 += C52418a.m58682i(5, eo42.computeSize());
            }
            String str13 = this.f183703i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f183704j;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            String str15 = this.f183705n;
            if (str15 != null) {
                i2 += C52418a.m58683j(8, str15);
            }
            String str16 = this.f183706o;
            return str16 != null ? i2 + C52418a.m58683j(9, str16) : i2;
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
            C64448in2 in22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    in22.f183698d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    in22.f183699e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    in22.f183700f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    in22.f183701g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        eo4 eo43 = new eo4();
                        if (bArr != null && bArr.length > 0) {
                            eo43.parseFrom(bArr);
                        }
                        in22.f183702h = eo43;
                    }
                    return 0;
                case 6:
                    in22.f183703i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    in22.f183704j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    in22.f183705n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    in22.f183706o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
