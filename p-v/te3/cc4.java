package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class cc4 extends C47465a {

    /* renamed from: d */
    public String f131655d;

    /* renamed from: e */
    public int f131656e;

    /* renamed from: f */
    public long f131657f;

    /* renamed from: g */
    public int f131658g;

    /* renamed from: h */
    public String f131659h;

    /* renamed from: i */
    public int f131660i;

    /* renamed from: j */
    public int f131661j;

    /* renamed from: n */
    public ac4 f131662n;

    /* renamed from: o */
    public String f131663o;

    /* renamed from: p */
    public boolean f131664p;

    /* renamed from: q */
    public LinkedList<String> f131665q = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cc4)) {
            return false;
        }
        cc4 cc4 = (cc4) aVar;
        return C46238a.m51546a(this.f131655d, cc4.f131655d) && C46238a.m51546a(Integer.valueOf(this.f131656e), Integer.valueOf(cc4.f131656e)) && C46238a.m51546a(Long.valueOf(this.f131657f), Long.valueOf(cc4.f131657f)) && C46238a.m51546a(Integer.valueOf(this.f131658g), Integer.valueOf(cc4.f131658g)) && C46238a.m51546a(this.f131659h, cc4.f131659h) && C46238a.m51546a(Integer.valueOf(this.f131660i), Integer.valueOf(cc4.f131660i)) && C46238a.m51546a(Integer.valueOf(this.f131661j), Integer.valueOf(cc4.f131661j)) && C46238a.m51546a(this.f131662n, cc4.f131662n) && C46238a.m51546a(this.f131663o, cc4.f131663o) && C46238a.m51546a(Boolean.valueOf(this.f131664p), Boolean.valueOf(cc4.f131664p)) && C46238a.m51546a(this.f131665q, cc4.f131665q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131655d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f131656e);
            aVar.mo74321h(3, this.f131657f);
            aVar.mo74318e(4, this.f131658g);
            String str2 = this.f131659h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f131660i);
            aVar.mo74318e(7, this.f131661j);
            ac4 ac4 = this.f131662n;
            if (ac4 != null) {
                aVar.mo74322i(8, ac4.computeSize());
                this.f131662n.writeFields(aVar);
            }
            String str3 = this.f131663o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74314a(10, this.f131664p);
            aVar.mo74320g(11, 1, this.f131665q);
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f131655d;
            if (str4 != null) {
                i3 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i3 + C52418a.m58678e(2, this.f131656e) + C52418a.m58681h(3, this.f131657f) + C52418a.m58678e(4, this.f131658g);
            String str5 = this.f131659h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int e2 = e + C52418a.m58678e(6, this.f131660i) + C52418a.m58678e(7, this.f131661j);
            ac4 ac42 = this.f131662n;
            if (ac42 != null) {
                e2 += C52418a.m58682i(8, ac42.computeSize());
            }
            String str6 = this.f131663o;
            if (str6 != null) {
                e2 += C52418a.m58683j(9, str6);
            }
            return e2 + C52418a.m58674a(10, this.f131664p) + C52418a.m58680g(11, 1, this.f131665q);
        } else if (i2 == 2) {
            this.f131665q.clear();
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
            cc4 cc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cc4.f131655d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    cc4.f131656e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    cc4.f131657f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    cc4.f131658g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    cc4.f131659h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cc4.f131660i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cc4.f131661j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        ac4 ac43 = new ac4();
                        if (bArr != null && bArr.length > 0) {
                            ac43.parseFrom(bArr);
                        }
                        cc4.f131662n = ac43;
                    }
                    return 0;
                case 9:
                    cc4.f131663o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    cc4.f131664p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    cc4.f131665q.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
