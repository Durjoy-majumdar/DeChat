package s90;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s90.g */
public class C77628g extends C47465a {

    /* renamed from: d */
    public long f226297d;

    /* renamed from: e */
    public long f226298e;

    /* renamed from: f */
    public String f226299f;

    /* renamed from: g */
    public int f226300g;

    /* renamed from: h */
    public int f226301h;

    /* renamed from: i */
    public String f226302i;

    /* renamed from: j */
    public String f226303j;

    /* renamed from: n */
    public String f226304n;

    /* renamed from: o */
    public String f226305o;

    /* renamed from: p */
    public int f226306p;

    /* renamed from: q */
    public C77630j f226307q;

    /* renamed from: r */
    public LinkedList<String> f226308r = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77628g)) {
            return false;
        }
        C77628g gVar = (C77628g) aVar;
        return C46238a.m51546a(Long.valueOf(this.f226297d), Long.valueOf(gVar.f226297d)) && C46238a.m51546a(Long.valueOf(this.f226298e), Long.valueOf(gVar.f226298e)) && C46238a.m51546a(this.f226299f, gVar.f226299f) && C46238a.m51546a(Integer.valueOf(this.f226300g), Integer.valueOf(gVar.f226300g)) && C46238a.m51546a(Integer.valueOf(this.f226301h), Integer.valueOf(gVar.f226301h)) && C46238a.m51546a(this.f226302i, gVar.f226302i) && C46238a.m51546a(this.f226303j, gVar.f226303j) && C46238a.m51546a(this.f226304n, gVar.f226304n) && C46238a.m51546a(this.f226305o, gVar.f226305o) && C46238a.m51546a(Integer.valueOf(this.f226306p), Integer.valueOf(gVar.f226306p)) && C46238a.m51546a(this.f226307q, gVar.f226307q) && C46238a.m51546a(this.f226308r, gVar.f226308r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f226297d);
            aVar.mo74321h(2, this.f226298e);
            String str = this.f226299f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f226300g);
            aVar.mo74318e(5, this.f226301h);
            String str2 = this.f226302i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f226303j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f226304n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f226305o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f226306p);
            C77630j jVar = this.f226307q;
            if (jVar != null) {
                aVar.mo74322i(11, jVar.computeSize());
                this.f226307q.writeFields(aVar);
            }
            aVar.mo74320g(12, 1, this.f226308r);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f226297d) + 0 + C52418a.m58681h(2, this.f226298e);
            String str6 = this.f226299f;
            if (str6 != null) {
                h += C52418a.m58683j(3, str6);
            }
            int e = h + C52418a.m58678e(4, this.f226300g) + C52418a.m58678e(5, this.f226301h);
            String str7 = this.f226302i;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f226303j;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            String str9 = this.f226304n;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            String str10 = this.f226305o;
            if (str10 != null) {
                e += C52418a.m58683j(9, str10);
            }
            int e2 = e + C52418a.m58678e(10, this.f226306p);
            C77630j jVar2 = this.f226307q;
            if (jVar2 != null) {
                e2 += C52418a.m58682i(11, jVar2.computeSize());
            }
            return e2 + C52418a.m58680g(12, 1, this.f226308r);
        } else if (i2 == 2) {
            this.f226308r.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77628g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gVar.f226297d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    gVar.f226298e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    gVar.f226299f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gVar.f226300g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gVar.f226301h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gVar.f226302i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gVar.f226303j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    gVar.f226304n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    gVar.f226305o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    gVar.f226306p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77630j jVar3 = new C77630j();
                        if (bArr != null && bArr.length > 0) {
                            jVar3.parseFrom(bArr);
                        }
                        gVar.f226307q = jVar3;
                    }
                    return 0;
                case 12:
                    gVar.f226308r.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
