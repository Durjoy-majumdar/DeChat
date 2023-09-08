package uz2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.u1 */
public class C78317u1 extends C47465a {

    /* renamed from: d */
    public C52718u f229448d;

    /* renamed from: e */
    public LinkedList<String> f229449e = new LinkedList<>();

    /* renamed from: f */
    public boolean f229450f;

    /* renamed from: g */
    public String f229451g;

    /* renamed from: h */
    public String f229452h;

    /* renamed from: i */
    public int f229453i;

    /* renamed from: j */
    public int f229454j;

    /* renamed from: n */
    public long f229455n;

    /* renamed from: o */
    public boolean f229456o;

    /* renamed from: p */
    public String f229457p;

    /* renamed from: q */
    public String f229458q;

    /* renamed from: r */
    public String f229459r;

    /* renamed from: s */
    public String f229460s;

    /* renamed from: t */
    public long f229461t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78317u1)) {
            return false;
        }
        C78317u1 u1Var = (C78317u1) aVar;
        return C46238a.m51546a(this.f229448d, u1Var.f229448d) && C46238a.m51546a(this.f229449e, u1Var.f229449e) && C46238a.m51546a(Boolean.valueOf(this.f229450f), Boolean.valueOf(u1Var.f229450f)) && C46238a.m51546a(this.f229451g, u1Var.f229451g) && C46238a.m51546a(this.f229452h, u1Var.f229452h) && C46238a.m51546a(Integer.valueOf(this.f229453i), Integer.valueOf(u1Var.f229453i)) && C46238a.m51546a(Integer.valueOf(this.f229454j), Integer.valueOf(u1Var.f229454j)) && C46238a.m51546a(Long.valueOf(this.f229455n), Long.valueOf(u1Var.f229455n)) && C46238a.m51546a(Boolean.valueOf(this.f229456o), Boolean.valueOf(u1Var.f229456o)) && C46238a.m51546a(this.f229457p, u1Var.f229457p) && C46238a.m51546a(this.f229458q, u1Var.f229458q) && C46238a.m51546a(this.f229459r, u1Var.f229459r) && C46238a.m51546a(this.f229460s, u1Var.f229460s) && C46238a.m51546a(Long.valueOf(this.f229461t), Long.valueOf(u1Var.f229461t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C52718u uVar = this.f229448d;
            if (uVar != null) {
                aVar.mo74322i(1, uVar.computeSize());
                this.f229448d.writeFields(aVar);
            }
            aVar.mo74320g(2, 1, this.f229449e);
            aVar.mo74314a(3, this.f229450f);
            String str = this.f229451g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f229452h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f229453i);
            aVar.mo74318e(7, this.f229454j);
            aVar.mo74321h(8, this.f229455n);
            aVar.mo74314a(9, this.f229456o);
            String str3 = this.f229457p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            String str4 = this.f229458q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            String str5 = this.f229459r;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            String str6 = this.f229460s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            aVar.mo74321h(14, this.f229461t);
            return 0;
        } else if (i2 == 1) {
            C52718u uVar2 = this.f229448d;
            if (uVar2 != null) {
                i3 = C52418a.m58682i(1, uVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 1, this.f229449e) + C52418a.m58674a(3, this.f229450f);
            String str7 = this.f229451g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f229452h;
            if (str8 != null) {
                g += C52418a.m58683j(5, str8);
            }
            int e = g + C52418a.m58678e(6, this.f229453i) + C52418a.m58678e(7, this.f229454j) + C52418a.m58681h(8, this.f229455n) + C52418a.m58674a(9, this.f229456o);
            String str9 = this.f229457p;
            if (str9 != null) {
                e += C52418a.m58683j(10, str9);
            }
            String str10 = this.f229458q;
            if (str10 != null) {
                e += C52418a.m58683j(11, str10);
            }
            String str11 = this.f229459r;
            if (str11 != null) {
                e += C52418a.m58683j(12, str11);
            }
            String str12 = this.f229460s;
            if (str12 != null) {
                e += C52418a.m58683j(13, str12);
            }
            return e + C52418a.m58681h(14, this.f229461t);
        } else if (i2 == 2) {
            this.f229449e.clear();
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
            C78317u1 u1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C52718u uVar3 = new C52718u();
                        if (bArr != null && bArr.length > 0) {
                            uVar3.parseFrom(bArr);
                        }
                        u1Var.f229448d = uVar3;
                    }
                    return 0;
                case 2:
                    u1Var.f229449e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 3:
                    u1Var.f229450f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    u1Var.f229451g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    u1Var.f229452h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    u1Var.f229453i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    u1Var.f229454j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    u1Var.f229455n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    u1Var.f229456o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    u1Var.f229457p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    u1Var.f229458q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    u1Var.f229459r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    u1Var.f229460s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    u1Var.f229461t = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
