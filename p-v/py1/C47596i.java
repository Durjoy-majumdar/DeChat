package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.i */
public class C47596i extends C47465a {

    /* renamed from: d */
    public int f127764d;

    /* renamed from: e */
    public String f127765e;

    /* renamed from: f */
    public boolean f127766f;

    /* renamed from: g */
    public int f127767g;

    /* renamed from: h */
    public C47628m3 f127768h;

    /* renamed from: i */
    public String f127769i;

    /* renamed from: j */
    public LinkedList<C47576f0> f127770j = new LinkedList<>();

    /* renamed from: n */
    public String f127771n;

    /* renamed from: o */
    public String f127772o;

    /* renamed from: p */
    public LinkedList<C47710z> f127773p = new LinkedList<>();

    /* renamed from: q */
    public int f127774q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47596i)) {
            return false;
        }
        C47596i iVar = (C47596i) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127764d), Integer.valueOf(iVar.f127764d)) && C46238a.m51546a(this.f127765e, iVar.f127765e) && C46238a.m51546a(Boolean.valueOf(this.f127766f), Boolean.valueOf(iVar.f127766f)) && C46238a.m51546a(Integer.valueOf(this.f127767g), Integer.valueOf(iVar.f127767g)) && C46238a.m51546a(this.f127768h, iVar.f127768h) && C46238a.m51546a(this.f127769i, iVar.f127769i) && C46238a.m51546a(this.f127770j, iVar.f127770j) && C46238a.m51546a(this.f127771n, iVar.f127771n) && C46238a.m51546a(this.f127772o, iVar.f127772o) && C46238a.m51546a(this.f127773p, iVar.f127773p) && C46238a.m51546a(Integer.valueOf(this.f127774q), Integer.valueOf(iVar.f127774q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127764d);
            String str = this.f127765e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f127766f);
            aVar.mo74318e(4, this.f127767g);
            C47628m3 m3Var = this.f127768h;
            if (m3Var != null) {
                aVar.mo74322i(5, m3Var.computeSize());
                this.f127768h.writeFields(aVar);
            }
            String str2 = this.f127769i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74320g(7, 8, this.f127770j);
            String str3 = this.f127771n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            String str4 = this.f127772o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74320g(10, 8, this.f127773p);
            aVar.mo74318e(11, this.f127774q);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127764d) + 0;
            String str5 = this.f127765e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            int a = e + C52418a.m58674a(3, this.f127766f) + C52418a.m58678e(4, this.f127767g);
            C47628m3 m3Var2 = this.f127768h;
            if (m3Var2 != null) {
                a += C52418a.m58682i(5, m3Var2.computeSize());
            }
            String str6 = this.f127769i;
            if (str6 != null) {
                a += C52418a.m58683j(6, str6);
            }
            int g = a + C52418a.m58680g(7, 8, this.f127770j);
            String str7 = this.f127771n;
            if (str7 != null) {
                g += C52418a.m58683j(8, str7);
            }
            String str8 = this.f127772o;
            if (str8 != null) {
                g += C52418a.m58683j(9, str8);
            }
            return g + C52418a.m58680g(10, 8, this.f127773p) + C52418a.m58678e(11, this.f127774q);
        } else if (i == 2) {
            this.f127770j.clear();
            this.f127773p.clear();
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
            C47596i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    iVar.f127764d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    iVar.f127765e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    iVar.f127766f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    iVar.f127767g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C47628m3 m3Var3 = new C47628m3();
                        if (bArr != null && bArr.length > 0) {
                            m3Var3.parseFrom(bArr);
                        }
                        iVar.f127768h = m3Var3;
                    }
                    return 0;
                case 6:
                    iVar.f127769i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C47576f0 f0Var = new C47576f0();
                        if (bArr2 != null && bArr2.length > 0) {
                            f0Var.parseFrom(bArr2);
                        }
                        iVar.f127770j.add(f0Var);
                    }
                    return 0;
                case 8:
                    iVar.f127771n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    iVar.f127772o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C47710z zVar = new C47710z();
                        if (bArr3 != null && bArr3.length > 0) {
                            zVar.parseFrom(bArr3);
                        }
                        iVar.f127773p.add(zVar);
                    }
                    return 0;
                case 11:
                    iVar.f127774q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
