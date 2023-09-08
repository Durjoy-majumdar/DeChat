package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bz0 */
public class C48928bz0 extends C47465a {

    /* renamed from: d */
    public int f131399d;

    /* renamed from: e */
    public String f131400e;

    /* renamed from: f */
    public String f131401f;

    /* renamed from: g */
    public String f131402g;

    /* renamed from: h */
    public String f131403h;

    /* renamed from: i */
    public String f131404i;

    /* renamed from: j */
    public String f131405j;

    /* renamed from: n */
    public C49068cz0 f131406n;

    /* renamed from: o */
    public C48958c51 f131407o;

    /* renamed from: p */
    public int f131408p;

    /* renamed from: q */
    public int f131409q;

    /* renamed from: r */
    public long f131410r;

    /* renamed from: s */
    public long f131411s;

    /* renamed from: t */
    public int f131412t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48928bz0)) {
            return false;
        }
        C48928bz0 bz02 = (C48928bz0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131399d), Integer.valueOf(bz02.f131399d)) && C46238a.m51546a(this.f131400e, bz02.f131400e) && C46238a.m51546a(this.f131401f, bz02.f131401f) && C46238a.m51546a(this.f131402g, bz02.f131402g) && C46238a.m51546a(this.f131403h, bz02.f131403h) && C46238a.m51546a(this.f131404i, bz02.f131404i) && C46238a.m51546a(this.f131405j, bz02.f131405j) && C46238a.m51546a(this.f131406n, bz02.f131406n) && C46238a.m51546a(this.f131407o, bz02.f131407o) && C46238a.m51546a(Integer.valueOf(this.f131408p), Integer.valueOf(bz02.f131408p)) && C46238a.m51546a(Integer.valueOf(this.f131409q), Integer.valueOf(bz02.f131409q)) && C46238a.m51546a(Long.valueOf(this.f131410r), Long.valueOf(bz02.f131410r)) && C46238a.m51546a(Long.valueOf(this.f131411s), Long.valueOf(bz02.f131411s)) && C46238a.m51546a(Integer.valueOf(this.f131412t), Integer.valueOf(bz02.f131412t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131399d);
            String str = this.f131400e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131401f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f131402g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f131403h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f131404i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f131405j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            C49068cz0 cz02 = this.f131406n;
            if (cz02 != null) {
                aVar.mo74322i(8, cz02.computeSize());
                this.f131406n.writeFields(aVar);
            }
            C48958c51 c512 = this.f131407o;
            if (c512 != null) {
                aVar.mo74322i(9, c512.computeSize());
                this.f131407o.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f131408p);
            aVar.mo74318e(11, this.f131409q);
            aVar.mo74321h(12, this.f131410r);
            aVar.mo74321h(13, this.f131411s);
            aVar.mo74318e(14, this.f131412t);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f131399d) + 0;
            String str7 = this.f131400e;
            if (str7 != null) {
                e += C52418a.m58683j(2, str7);
            }
            String str8 = this.f131401f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f131402g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f131403h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f131404i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f131405j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            C49068cz0 cz03 = this.f131406n;
            if (cz03 != null) {
                e += C52418a.m58682i(8, cz03.computeSize());
            }
            C48958c51 c513 = this.f131407o;
            if (c513 != null) {
                e += C52418a.m58682i(9, c513.computeSize());
            }
            return e + C52418a.m58678e(10, this.f131408p) + C52418a.m58678e(11, this.f131409q) + C52418a.m58681h(12, this.f131410r) + C52418a.m58681h(13, this.f131411s) + C52418a.m58678e(14, this.f131412t);
        } else if (i2 == 2) {
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
            C48928bz0 bz02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bz02.f131399d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    bz02.f131400e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bz02.f131401f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bz02.f131402g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bz02.f131403h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bz02.f131404i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bz02.f131405j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49068cz0 cz04 = new C49068cz0();
                        if (bArr != null && bArr.length > 0) {
                            cz04.parseFrom(bArr);
                        }
                        bz02.f131406n = cz04;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48958c51 c514 = new C48958c51();
                        if (bArr2 != null && bArr2.length > 0) {
                            c514.parseFrom(bArr2);
                        }
                        bz02.f131407o = c514;
                    }
                    return 0;
                case 10:
                    bz02.f131408p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    bz02.f131409q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    bz02.f131410r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    bz02.f131411s = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    bz02.f131412t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
