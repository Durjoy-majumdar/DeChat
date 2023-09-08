package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oa3 */
public class C50655oa3 extends C47465a {

    /* renamed from: d */
    public String f139060d;

    /* renamed from: e */
    public String f139061e;

    /* renamed from: f */
    public String f139062f;

    /* renamed from: g */
    public String f139063g;

    /* renamed from: h */
    public int f139064h;

    /* renamed from: i */
    public LinkedList<C49871in> f139065i = new LinkedList<>();

    /* renamed from: j */
    public String f139066j;

    /* renamed from: n */
    public String f139067n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50655oa3)) {
            return false;
        }
        C50655oa3 oa32 = (C50655oa3) aVar;
        return C46238a.m51546a(this.f139060d, oa32.f139060d) && C46238a.m51546a(this.f139061e, oa32.f139061e) && C46238a.m51546a(this.f139062f, oa32.f139062f) && C46238a.m51546a(this.f139063g, oa32.f139063g) && C46238a.m51546a(Integer.valueOf(this.f139064h), Integer.valueOf(oa32.f139064h)) && C46238a.m51546a(this.f139065i, oa32.f139065i) && C46238a.m51546a(this.f139066j, oa32.f139066j) && C46238a.m51546a(this.f139067n, oa32.f139067n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139060d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139061e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f139062f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f139063g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f139064h);
            aVar.mo74320g(6, 8, this.f139065i);
            String str5 = this.f139066j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f139067n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f139060d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f139061e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f139062f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f139063g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int e = i2 + C52418a.m58678e(5, this.f139064h) + C52418a.m58680g(6, 8, this.f139065i);
            String str11 = this.f139066j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f139067n;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
        } else if (i == 2) {
            this.f139065i.clear();
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
            C50655oa3 oa32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oa32.f139060d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    oa32.f139061e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    oa32.f139062f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    oa32.f139063g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oa32.f139064h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49871in inVar = new C49871in();
                        if (bArr != null && bArr.length > 0) {
                            inVar.parseFrom(bArr);
                        }
                        oa32.f139065i.add(inVar);
                    }
                    return 0;
                case 7:
                    oa32.f139066j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    oa32.f139067n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
