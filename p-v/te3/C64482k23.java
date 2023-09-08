package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k23 */
public class C64482k23 extends C47465a {

    /* renamed from: d */
    public C64435i23 f183874d;

    /* renamed from: e */
    public String f183875e;

    /* renamed from: f */
    public String f183876f;

    /* renamed from: g */
    public long f183877g;

    /* renamed from: h */
    public String f183878h;

    /* renamed from: i */
    public String f183879i;

    /* renamed from: j */
    public int f183880j;

    /* renamed from: n */
    public int f183881n;

    /* renamed from: o */
    public long f183882o;

    /* renamed from: p */
    public String f183883p;

    /* renamed from: q */
    public String f183884q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64482k23)) {
            return false;
        }
        C64482k23 k232 = (C64482k23) aVar;
        return C46238a.m51546a(this.f183874d, k232.f183874d) && C46238a.m51546a(this.f183875e, k232.f183875e) && C46238a.m51546a(this.f183876f, k232.f183876f) && C46238a.m51546a(Long.valueOf(this.f183877g), Long.valueOf(k232.f183877g)) && C46238a.m51546a(this.f183878h, k232.f183878h) && C46238a.m51546a(this.f183879i, k232.f183879i) && C46238a.m51546a(Integer.valueOf(this.f183880j), Integer.valueOf(k232.f183880j)) && C46238a.m51546a(Integer.valueOf(this.f183881n), Integer.valueOf(k232.f183881n)) && C46238a.m51546a(Long.valueOf(this.f183882o), Long.valueOf(k232.f183882o)) && C46238a.m51546a(this.f183883p, k232.f183883p) && C46238a.m51546a(this.f183884q, k232.f183884q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64435i23 i232 = this.f183874d;
            if (i232 != null) {
                aVar.mo74322i(2, i232.computeSize());
                this.f183874d.writeFields(aVar);
            }
            String str = this.f183875e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f183876f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f183877g);
            String str3 = this.f183878h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f183879i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(9, this.f183880j);
            aVar.mo74318e(13, this.f183881n);
            aVar.mo74321h(14, this.f183882o);
            String str5 = this.f183883p;
            if (str5 != null) {
                aVar.mo74323j(15, str5);
            }
            String str6 = this.f183884q;
            if (str6 != null) {
                aVar.mo74323j(16, str6);
            }
            return 0;
        } else if (i == 1) {
            C64435i23 i233 = this.f183874d;
            if (i233 != null) {
                i2 = 0 + C52418a.m58682i(2, i233.computeSize());
            }
            String str7 = this.f183875e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f183876f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            int h = i2 + C52418a.m58681h(5, this.f183877g);
            String str9 = this.f183878h;
            if (str9 != null) {
                h += C52418a.m58683j(6, str9);
            }
            String str10 = this.f183879i;
            if (str10 != null) {
                h += C52418a.m58683j(7, str10);
            }
            int e = h + C52418a.m58678e(9, this.f183880j) + C52418a.m58678e(13, this.f183881n) + C52418a.m58681h(14, this.f183882o);
            String str11 = this.f183883p;
            if (str11 != null) {
                e += C52418a.m58683j(15, str11);
            }
            String str12 = this.f183884q;
            return str12 != null ? e + C52418a.m58683j(16, str12) : e;
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
            C64482k23 k232 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64435i23 i234 = new C64435i23();
                        if (bArr != null && bArr.length > 0) {
                            i234.parseFrom(bArr);
                        }
                        k232.f183874d = i234;
                    }
                    return 0;
                case 3:
                    k232.f183875e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k232.f183876f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    k232.f183877g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    k232.f183878h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    k232.f183879i = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    k232.f183880j = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    k232.f183881n = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    k232.f183882o = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    k232.f183883p = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    k232.f183884q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
