package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v54 extends C47465a {

    /* renamed from: d */
    public qa4 f143320d;

    /* renamed from: e */
    public int f143321e;

    /* renamed from: f */
    public boolean f143322f;

    /* renamed from: g */
    public int f143323g;

    /* renamed from: h */
    public String f143324h;

    /* renamed from: i */
    public String f143325i;

    /* renamed from: j */
    public C50077k40 f143326j;

    /* renamed from: n */
    public int f143327n;

    /* renamed from: o */
    public LinkedList<C49398f93> f143328o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<C49677h93> f143329p = new LinkedList<>();

    /* renamed from: q */
    public int f143330q;

    /* renamed from: r */
    public LinkedList<C49398f93> f143331r = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v54)) {
            return false;
        }
        v54 v54 = (v54) aVar;
        return C46238a.m51546a(this.f143320d, v54.f143320d) && C46238a.m51546a(Integer.valueOf(this.f143321e), Integer.valueOf(v54.f143321e)) && C46238a.m51546a(Boolean.valueOf(this.f143322f), Boolean.valueOf(v54.f143322f)) && C46238a.m51546a(Integer.valueOf(this.f143323g), Integer.valueOf(v54.f143323g)) && C46238a.m51546a(this.f143324h, v54.f143324h) && C46238a.m51546a(this.f143325i, v54.f143325i) && C46238a.m51546a(this.f143326j, v54.f143326j) && C46238a.m51546a(Integer.valueOf(this.f143327n), Integer.valueOf(v54.f143327n)) && C46238a.m51546a(this.f143328o, v54.f143328o) && C46238a.m51546a(this.f143329p, v54.f143329p) && C46238a.m51546a(Integer.valueOf(this.f143330q), Integer.valueOf(v54.f143330q)) && C46238a.m51546a(this.f143331r, v54.f143331r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            qa4 qa4 = this.f143320d;
            if (qa4 != null) {
                aVar.mo74322i(1, qa4.computeSize());
                this.f143320d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f143321e);
            aVar.mo74314a(3, this.f143322f);
            aVar.mo74318e(4, this.f143323g);
            String str = this.f143324h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f143325i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            C50077k40 k402 = this.f143326j;
            if (k402 != null) {
                aVar.mo74322i(7, k402.computeSize());
                this.f143326j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f143327n);
            aVar.mo74320g(9, 8, this.f143328o);
            aVar.mo74320g(10, 8, this.f143329p);
            aVar.mo74318e(11, this.f143330q);
            aVar.mo74320g(12, 8, this.f143331r);
            return 0;
        } else if (i == 1) {
            qa4 qa42 = this.f143320d;
            if (qa42 != null) {
                i2 = 0 + C52418a.m58682i(1, qa42.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143321e) + C52418a.m58674a(3, this.f143322f) + C52418a.m58678e(4, this.f143323g);
            String str3 = this.f143324h;
            if (str3 != null) {
                e += C52418a.m58683j(5, str3);
            }
            String str4 = this.f143325i;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            C50077k40 k403 = this.f143326j;
            if (k403 != null) {
                e += C52418a.m58682i(7, k403.computeSize());
            }
            return e + C52418a.m58678e(8, this.f143327n) + C52418a.m58680g(9, 8, this.f143328o) + C52418a.m58680g(10, 8, this.f143329p) + C52418a.m58678e(11, this.f143330q) + C52418a.m58680g(12, 8, this.f143331r);
        } else if (i == 2) {
            this.f143328o.clear();
            this.f143329p.clear();
            this.f143331r.clear();
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
            v54 v54 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        qa4 qa43 = new qa4();
                        if (bArr != null && bArr.length > 0) {
                            qa43.parseFrom(bArr);
                        }
                        v54.f143320d = qa43;
                    }
                    return 0;
                case 2:
                    v54.f143321e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    v54.f143322f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    v54.f143323g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    v54.f143324h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v54.f143325i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50077k40 k404 = new C50077k40();
                        if (bArr2 != null && bArr2.length > 0) {
                            k404.parseFrom(bArr2);
                        }
                        v54.f143326j = k404;
                    }
                    return 0;
                case 8:
                    v54.f143327n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49398f93 f932 = new C49398f93();
                        if (bArr3 != null && bArr3.length > 0) {
                            f932.parseFrom(bArr3);
                        }
                        v54.f143328o.add(f932);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49677h93 h932 = new C49677h93();
                        if (bArr4 != null && bArr4.length > 0) {
                            h932.parseFrom(bArr4);
                        }
                        v54.f143329p.add(h932);
                    }
                    return 0;
                case 11:
                    v54.f143330q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49398f93 f933 = new C49398f93();
                        if (bArr5 != null && bArr5.length > 0) {
                            f933.parseFrom(bArr5);
                        }
                        v54.f143331r.add(f933);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
