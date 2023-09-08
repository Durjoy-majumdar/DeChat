package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class io4 extends C47465a {

    /* renamed from: d */
    public String f135548d;

    /* renamed from: e */
    public String f135549e;

    /* renamed from: f */
    public int f135550f;

    /* renamed from: g */
    public LinkedList<jo4> f135551g = new LinkedList<>();

    /* renamed from: h */
    public int f135552h;

    /* renamed from: i */
    public String f135553i;

    /* renamed from: j */
    public String f135554j;

    /* renamed from: n */
    public int f135555n;

    /* renamed from: o */
    public String f135556o;

    /* renamed from: p */
    public String f135557p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof io4)) {
            return false;
        }
        io4 io4 = (io4) aVar;
        return C46238a.m51546a(this.f135548d, io4.f135548d) && C46238a.m51546a(this.f135549e, io4.f135549e) && C46238a.m51546a(Integer.valueOf(this.f135550f), Integer.valueOf(io4.f135550f)) && C46238a.m51546a(this.f135551g, io4.f135551g) && C46238a.m51546a(Integer.valueOf(this.f135552h), Integer.valueOf(io4.f135552h)) && C46238a.m51546a(this.f135553i, io4.f135553i) && C46238a.m51546a(this.f135554j, io4.f135554j) && C46238a.m51546a(Integer.valueOf(this.f135555n), Integer.valueOf(io4.f135555n)) && C46238a.m51546a(this.f135556o, io4.f135556o) && C46238a.m51546a(this.f135557p, io4.f135557p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135548d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135549e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f135550f);
            aVar.mo74320g(4, 8, this.f135551g);
            aVar.mo74318e(5, this.f135552h);
            String str3 = this.f135553i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f135554j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f135555n);
            String str5 = this.f135556o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f135557p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f135548d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f135549e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int e = i2 + C52418a.m58678e(3, this.f135550f) + C52418a.m58680g(4, 8, this.f135551g) + C52418a.m58678e(5, this.f135552h);
            String str9 = this.f135553i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f135554j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            int e2 = e + C52418a.m58678e(8, this.f135555n);
            String str11 = this.f135556o;
            if (str11 != null) {
                e2 += C52418a.m58683j(9, str11);
            }
            String str12 = this.f135557p;
            return str12 != null ? e2 + C52418a.m58683j(10, str12) : e2;
        } else if (i == 2) {
            this.f135551g.clear();
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
            io4 io4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    io4.f135548d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    io4.f135549e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    io4.f135550f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        jo4 jo4 = new jo4();
                        if (bArr != null && bArr.length > 0) {
                            jo4.parseFrom(bArr);
                        }
                        io4.f135551g.add(jo4);
                    }
                    return 0;
                case 5:
                    io4.f135552h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    io4.f135553i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    io4.f135554j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    io4.f135555n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    io4.f135556o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    io4.f135557p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
