package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k1 */
public class C101799k1 extends C47465a {

    /* renamed from: d */
    public int f298574d;

    /* renamed from: e */
    public String f298575e;

    /* renamed from: f */
    public int f298576f;

    /* renamed from: g */
    public String f298577g;

    /* renamed from: h */
    public String f298578h;

    /* renamed from: i */
    public String f298579i;

    /* renamed from: j */
    public C101779g1 f298580j;

    /* renamed from: n */
    public String f298581n;

    /* renamed from: o */
    public C64252b5 f298582o;

    /* renamed from: p */
    public C64721t5 f298583p;

    /* renamed from: q */
    public C101838s5 f298584q;

    /* renamed from: r */
    public C101838s5 f298585r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101799k1)) {
            return false;
        }
        C101799k1 k1Var = (C101799k1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298574d), Integer.valueOf(k1Var.f298574d)) && C46238a.m51546a(this.f298575e, k1Var.f298575e) && C46238a.m51546a(Integer.valueOf(this.f298576f), Integer.valueOf(k1Var.f298576f)) && C46238a.m51546a(this.f298577g, k1Var.f298577g) && C46238a.m51546a(this.f298578h, k1Var.f298578h) && C46238a.m51546a(this.f298579i, k1Var.f298579i) && C46238a.m51546a(this.f298580j, k1Var.f298580j) && C46238a.m51546a(this.f298581n, k1Var.f298581n) && C46238a.m51546a(this.f298582o, k1Var.f298582o) && C46238a.m51546a(this.f298583p, k1Var.f298583p) && C46238a.m51546a(this.f298584q, k1Var.f298584q) && C46238a.m51546a(this.f298585r, k1Var.f298585r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298574d);
            String str = this.f298575e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f298576f);
            String str2 = this.f298577g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f298578h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f298579i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C101779g1 g1Var = this.f298580j;
            if (g1Var != null) {
                aVar.mo74322i(7, g1Var.computeSize());
                this.f298580j.writeFields(aVar);
            }
            String str5 = this.f298581n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            C64252b5 b5Var = this.f298582o;
            if (b5Var != null) {
                aVar.mo74322i(9, b5Var.computeSize());
                this.f298582o.writeFields(aVar);
            }
            C64721t5 t5Var = this.f298583p;
            if (t5Var != null) {
                aVar.mo74322i(10, t5Var.computeSize());
                this.f298583p.writeFields(aVar);
            }
            C101838s5 s5Var = this.f298584q;
            if (s5Var != null) {
                aVar.mo74322i(11, s5Var.computeSize());
                this.f298584q.writeFields(aVar);
            }
            C101838s5 s5Var2 = this.f298585r;
            if (s5Var2 != null) {
                aVar.mo74322i(12, s5Var2.computeSize());
                this.f298585r.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298574d) + 0;
            String str6 = this.f298575e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            int e2 = e + C52418a.m58678e(3, this.f298576f);
            String str7 = this.f298577g;
            if (str7 != null) {
                e2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f298578h;
            if (str8 != null) {
                e2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f298579i;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            C101779g1 g1Var2 = this.f298580j;
            if (g1Var2 != null) {
                e2 += C52418a.m58682i(7, g1Var2.computeSize());
            }
            String str10 = this.f298581n;
            if (str10 != null) {
                e2 += C52418a.m58683j(8, str10);
            }
            C64252b5 b5Var2 = this.f298582o;
            if (b5Var2 != null) {
                e2 += C52418a.m58682i(9, b5Var2.computeSize());
            }
            C64721t5 t5Var2 = this.f298583p;
            if (t5Var2 != null) {
                e2 += C52418a.m58682i(10, t5Var2.computeSize());
            }
            C101838s5 s5Var3 = this.f298584q;
            if (s5Var3 != null) {
                e2 += C52418a.m58682i(11, s5Var3.computeSize());
            }
            C101838s5 s5Var4 = this.f298585r;
            return s5Var4 != null ? e2 + C52418a.m58682i(12, s5Var4.computeSize()) : e2;
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
            C101799k1 k1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    k1Var.f298574d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    k1Var.f298575e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    k1Var.f298576f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    k1Var.f298577g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    k1Var.f298578h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    k1Var.f298579i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C101779g1 g1Var3 = new C101779g1();
                        if (bArr != null && bArr.length > 0) {
                            g1Var3.parseFrom(bArr);
                        }
                        k1Var.f298580j = g1Var3;
                    }
                    return 0;
                case 8:
                    k1Var.f298581n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64252b5 b5Var3 = new C64252b5();
                        if (bArr2 != null && bArr2.length > 0) {
                            b5Var3.parseFrom(bArr2);
                        }
                        k1Var.f298582o = b5Var3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C64721t5 t5Var3 = new C64721t5();
                        if (bArr3 != null && bArr3.length > 0) {
                            t5Var3.parseFrom(bArr3);
                        }
                        k1Var.f298583p = t5Var3;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C101838s5 s5Var5 = new C101838s5();
                        if (bArr4 != null && bArr4.length > 0) {
                            s5Var5.parseFrom(bArr4);
                        }
                        k1Var.f298584q = s5Var5;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C101838s5 s5Var6 = new C101838s5();
                        if (bArr5 != null && bArr5.length > 0) {
                            s5Var6.parseFrom(bArr5);
                        }
                        k1Var.f298585r = s5Var6;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
