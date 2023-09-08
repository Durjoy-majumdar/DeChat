package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kl */
public class C50143kl extends C47465a {

    /* renamed from: d */
    public int f136862d;

    /* renamed from: e */
    public String f136863e;

    /* renamed from: f */
    public String f136864f;

    /* renamed from: g */
    public String f136865g;

    /* renamed from: h */
    public String f136866h;

    /* renamed from: i */
    public C89349b f136867i;

    /* renamed from: j */
    public String f136868j;

    /* renamed from: n */
    public C50278ll f136869n;

    /* renamed from: o */
    public C101794jl f136870o;

    /* renamed from: p */
    public C101812ml f136871p;

    /* renamed from: q */
    public C49719hl f136872q;

    /* renamed from: r */
    public C49862il f136873r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50143kl)) {
            return false;
        }
        C50143kl klVar = (C50143kl) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136862d), Integer.valueOf(klVar.f136862d)) && C46238a.m51546a(this.f136863e, klVar.f136863e) && C46238a.m51546a(this.f136864f, klVar.f136864f) && C46238a.m51546a(this.f136865g, klVar.f136865g) && C46238a.m51546a(this.f136866h, klVar.f136866h) && C46238a.m51546a(this.f136867i, klVar.f136867i) && C46238a.m51546a(this.f136868j, klVar.f136868j) && C46238a.m51546a(this.f136869n, klVar.f136869n) && C46238a.m51546a(this.f136870o, klVar.f136870o) && C46238a.m51546a(this.f136871p, klVar.f136871p) && C46238a.m51546a(this.f136872q, klVar.f136872q) && C46238a.m51546a(this.f136873r, klVar.f136873r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136862d);
            String str = this.f136863e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136864f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f136865g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f136866h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C89349b bVar = this.f136867i;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            String str5 = this.f136868j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            C50278ll llVar = this.f136869n;
            if (llVar != null) {
                aVar.mo74322i(101, llVar.computeSize());
                this.f136869n.writeFields(aVar);
            }
            C101794jl jlVar = this.f136870o;
            if (jlVar != null) {
                aVar.mo74322i(102, jlVar.computeSize());
                this.f136870o.writeFields(aVar);
            }
            C101812ml mlVar = this.f136871p;
            if (mlVar != null) {
                aVar.mo74322i(103, mlVar.computeSize());
                this.f136871p.writeFields(aVar);
            }
            C49719hl hlVar = this.f136872q;
            if (hlVar != null) {
                aVar.mo74322i(104, hlVar.computeSize());
                this.f136872q.writeFields(aVar);
            }
            C49862il ilVar = this.f136873r;
            if (ilVar != null) {
                aVar.mo74322i(107, ilVar.computeSize());
                this.f136873r.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136862d) + 0;
            String str6 = this.f136863e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f136864f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f136865g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f136866h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            C89349b bVar2 = this.f136867i;
            if (bVar2 != null) {
                e += C52418a.m58675b(6, bVar2);
            }
            String str10 = this.f136868j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            C50278ll llVar2 = this.f136869n;
            if (llVar2 != null) {
                e += C52418a.m58682i(101, llVar2.computeSize());
            }
            C101794jl jlVar2 = this.f136870o;
            if (jlVar2 != null) {
                e += C52418a.m58682i(102, jlVar2.computeSize());
            }
            C101812ml mlVar2 = this.f136871p;
            if (mlVar2 != null) {
                e += C52418a.m58682i(103, mlVar2.computeSize());
            }
            C49719hl hlVar2 = this.f136872q;
            if (hlVar2 != null) {
                e += C52418a.m58682i(104, hlVar2.computeSize());
            }
            C49862il ilVar2 = this.f136873r;
            return ilVar2 != null ? e + C52418a.m58682i(107, ilVar2.computeSize()) : e;
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
            C50143kl klVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 107) {
                switch (intValue) {
                    case 1:
                        klVar.f136862d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        klVar.f136863e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        klVar.f136864f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        klVar.f136865g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        klVar.f136866h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        klVar.f136867i = aVar3.mo141626d(intValue);
                        return 0;
                    case 7:
                        klVar.f136868j = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 101:
                                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                                int size = j.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    byte[] bArr = j.get(i2);
                                    C50278ll llVar3 = new C50278ll();
                                    if (bArr != null && bArr.length > 0) {
                                        llVar3.parseFrom(bArr);
                                    }
                                    klVar.f136869n = llVar3;
                                }
                                return 0;
                            case 102:
                                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                                int size2 = j2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    byte[] bArr2 = j2.get(i3);
                                    C101794jl jlVar3 = new C101794jl();
                                    if (bArr2 != null && bArr2.length > 0) {
                                        jlVar3.parseFrom(bArr2);
                                    }
                                    klVar.f136870o = jlVar3;
                                }
                                return 0;
                            case 103:
                                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                                int size3 = j3.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    byte[] bArr3 = j3.get(i4);
                                    C101812ml mlVar3 = new C101812ml();
                                    if (bArr3 != null && bArr3.length > 0) {
                                        mlVar3.parseFrom(bArr3);
                                    }
                                    klVar.f136871p = mlVar3;
                                }
                                return 0;
                            case 104:
                                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                                int size4 = j4.size();
                                for (int i5 = 0; i5 < size4; i5++) {
                                    byte[] bArr4 = j4.get(i5);
                                    C49719hl hlVar3 = new C49719hl();
                                    if (bArr4 != null && bArr4.length > 0) {
                                        hlVar3.parseFrom(bArr4);
                                    }
                                    klVar.f136872q = hlVar3;
                                }
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    byte[] bArr5 = j5.get(i6);
                    C49862il ilVar3 = new C49862il();
                    if (bArr5 != null && bArr5.length > 0) {
                        ilVar3.parseFrom(bArr5);
                    }
                    klVar.f136873r = ilVar3;
                }
                return 0;
            }
        }
    }
}
