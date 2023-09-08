package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bg2 */
public class C22490bg2 extends C47465a {

    /* renamed from: d */
    public int f63710d = -1;

    /* renamed from: e */
    public fh4 f63711e;

    /* renamed from: f */
    public fh4 f63712f;

    /* renamed from: g */
    public boolean f63713g = false;

    /* renamed from: h */
    public String f63714h;

    /* renamed from: i */
    public int f63715i;

    /* renamed from: j */
    public String f63716j;

    /* renamed from: n */
    public String f63717n;

    /* renamed from: o */
    public String f63718o;

    /* renamed from: p */
    public boolean f63719p = false;

    /* renamed from: q */
    public boolean f63720q;

    /* renamed from: r */
    public boolean f63721r = false;

    /* renamed from: s */
    public C101777fg2 f63722s;

    /* renamed from: t */
    public long f63723t = 0;

    /* renamed from: u */
    public xr4 f63724u;

    /* renamed from: v */
    public int f63725v;

    /* renamed from: w */
    public C51189s12 f63726w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22490bg2)) {
            return false;
        }
        C22490bg2 bg22 = (C22490bg2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f63710d), Integer.valueOf(bg22.f63710d)) && C46238a.m51546a(this.f63711e, bg22.f63711e) && C46238a.m51546a(this.f63712f, bg22.f63712f) && C46238a.m51546a(Boolean.valueOf(this.f63713g), Boolean.valueOf(bg22.f63713g)) && C46238a.m51546a(this.f63714h, bg22.f63714h) && C46238a.m51546a(Integer.valueOf(this.f63715i), Integer.valueOf(bg22.f63715i)) && C46238a.m51546a(this.f63716j, bg22.f63716j) && C46238a.m51546a(this.f63717n, bg22.f63717n) && C46238a.m51546a(this.f63718o, bg22.f63718o) && C46238a.m51546a(Boolean.valueOf(this.f63719p), Boolean.valueOf(bg22.f63719p)) && C46238a.m51546a(Boolean.valueOf(this.f63720q), Boolean.valueOf(bg22.f63720q)) && C46238a.m51546a(Boolean.valueOf(this.f63721r), Boolean.valueOf(bg22.f63721r)) && C46238a.m51546a(this.f63722s, bg22.f63722s) && C46238a.m51546a(Long.valueOf(this.f63723t), Long.valueOf(bg22.f63723t)) && C46238a.m51546a(this.f63724u, bg22.f63724u) && C46238a.m51546a(Integer.valueOf(this.f63725v), Integer.valueOf(bg22.f63725v)) && C46238a.m51546a(this.f63726w, bg22.f63726w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f63710d);
            fh4 fh4 = this.f63711e;
            if (fh4 != null) {
                aVar.mo74322i(2, fh4.computeSize());
                this.f63711e.writeFields(aVar);
            }
            fh4 fh42 = this.f63712f;
            if (fh42 != null) {
                aVar.mo74322i(3, fh42.computeSize());
                this.f63712f.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f63713g);
            String str = this.f63714h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f63715i);
            String str2 = this.f63716j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f63717n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            String str4 = this.f63718o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74314a(10, this.f63719p);
            aVar.mo74314a(11, this.f63720q);
            aVar.mo74314a(12, this.f63721r);
            C101777fg2 fg22 = this.f63722s;
            if (fg22 != null) {
                aVar.mo74322i(13, fg22.computeSize());
                this.f63722s.writeFields(aVar);
            }
            aVar.mo74321h(14, this.f63723t);
            xr4 xr4 = this.f63724u;
            if (xr4 != null) {
                aVar.mo74322i(15, xr4.computeSize());
                this.f63724u.writeFields(aVar);
            }
            aVar.mo74318e(16, this.f63725v);
            C51189s12 s122 = this.f63726w;
            if (s122 != null) {
                aVar.mo74322i(17, s122.computeSize());
                this.f63726w.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f63710d) + 0;
            fh4 fh43 = this.f63711e;
            if (fh43 != null) {
                e += C52418a.m58682i(2, fh43.computeSize());
            }
            fh4 fh44 = this.f63712f;
            if (fh44 != null) {
                e += C52418a.m58682i(3, fh44.computeSize());
            }
            int a = e + C52418a.m58674a(4, this.f63713g);
            String str5 = this.f63714h;
            if (str5 != null) {
                a += C52418a.m58683j(5, str5);
            }
            int e2 = a + C52418a.m58678e(6, this.f63715i);
            String str6 = this.f63716j;
            if (str6 != null) {
                e2 += C52418a.m58683j(7, str6);
            }
            String str7 = this.f63717n;
            if (str7 != null) {
                e2 += C52418a.m58683j(8, str7);
            }
            String str8 = this.f63718o;
            if (str8 != null) {
                e2 += C52418a.m58683j(9, str8);
            }
            int a2 = e2 + C52418a.m58674a(10, this.f63719p) + C52418a.m58674a(11, this.f63720q) + C52418a.m58674a(12, this.f63721r);
            C101777fg2 fg23 = this.f63722s;
            if (fg23 != null) {
                a2 += C52418a.m58682i(13, fg23.computeSize());
            }
            int h = a2 + C52418a.m58681h(14, this.f63723t);
            xr4 xr42 = this.f63724u;
            if (xr42 != null) {
                h += C52418a.m58682i(15, xr42.computeSize());
            }
            int e3 = h + C52418a.m58678e(16, this.f63725v);
            C51189s12 s123 = this.f63726w;
            return s123 != null ? e3 + C52418a.m58682i(17, s123.computeSize()) : e3;
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
            C22490bg2 bg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bg22.f63710d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        fh4 fh45 = new fh4();
                        if (bArr != null && bArr.length > 0) {
                            fh45.parseFrom(bArr);
                        }
                        bg22.f63711e = fh45;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        fh4 fh46 = new fh4();
                        if (bArr2 != null && bArr2.length > 0) {
                            fh46.parseFrom(bArr2);
                        }
                        bg22.f63712f = fh46;
                    }
                    return 0;
                case 4:
                    bg22.f63713g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    bg22.f63714h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bg22.f63715i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    bg22.f63716j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bg22.f63717n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bg22.f63718o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    bg22.f63719p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    bg22.f63720q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    bg22.f63721r = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C101777fg2 fg24 = new C101777fg2();
                        if (bArr3 != null && bArr3.length > 0) {
                            fg24.parseFrom(bArr3);
                        }
                        bg22.f63722s = fg24;
                    }
                    return 0;
                case 14:
                    bg22.f63723t = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        xr4 xr43 = new xr4();
                        if (bArr4 != null && bArr4.length > 0) {
                            xr43.parseFrom(bArr4);
                        }
                        bg22.f63724u = xr43;
                    }
                    return 0;
                case 16:
                    bg22.f63725v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51189s12 s124 = new C51189s12();
                        if (bArr5 != null && bArr5.length > 0) {
                            s124.parseFrom(bArr5);
                        }
                        bg22.f63726w = s124;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
