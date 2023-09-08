package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tr1 */
public class C51434tr1 extends C47465a {

    /* renamed from: d */
    public String f142366d;

    /* renamed from: e */
    public String f142367e;

    /* renamed from: f */
    public String f142368f;

    /* renamed from: g */
    public String f142369g;

    /* renamed from: h */
    public int f142370h;

    /* renamed from: i */
    public int f142371i;

    /* renamed from: j */
    public String f142372j;

    /* renamed from: n */
    public int f142373n;

    /* renamed from: o */
    public String f142374o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51434tr1)) {
            return false;
        }
        C51434tr1 tr12 = (C51434tr1) aVar;
        return C46238a.m51546a(this.f142366d, tr12.f142366d) && C46238a.m51546a(this.f142367e, tr12.f142367e) && C46238a.m51546a(this.f142368f, tr12.f142368f) && C46238a.m51546a(this.f142369g, tr12.f142369g) && C46238a.m51546a(Integer.valueOf(this.f142370h), Integer.valueOf(tr12.f142370h)) && C46238a.m51546a(Integer.valueOf(this.f142371i), Integer.valueOf(tr12.f142371i)) && C46238a.m51546a(this.f142372j, tr12.f142372j) && C46238a.m51546a(Integer.valueOf(this.f142373n), Integer.valueOf(tr12.f142373n)) && C46238a.m51546a(this.f142374o, tr12.f142374o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142366d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f142367e == null) {
                throw new C52419b("Not all required fields were included: Desc");
            } else if (this.f142368f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f142367e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f142368f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f142369g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74318e(5, this.f142370h);
                aVar.mo74318e(6, this.f142371i);
                String str5 = this.f142372j;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                aVar.mo74318e(8, this.f142373n);
                String str6 = this.f142374o;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThumbUrl");
            }
        } else if (i == 1) {
            String str7 = this.f142366d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f142367e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f142368f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f142369g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int e = i2 + C52418a.m58678e(5, this.f142370h) + C52418a.m58678e(6, this.f142371i);
            String str11 = this.f142372j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            int e2 = e + C52418a.m58678e(8, this.f142373n);
            String str12 = this.f142374o;
            return str12 != null ? e2 + C52418a.m58683j(9, str12) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142366d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f142367e == null) {
                throw new C52419b("Not all required fields were included: Desc");
            } else if (this.f142368f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThumbUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51434tr1 tr12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tr12.f142366d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    tr12.f142367e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tr12.f142368f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tr12.f142369g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tr12.f142370h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    tr12.f142371i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tr12.f142372j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tr12.f142373n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    tr12.f142374o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
