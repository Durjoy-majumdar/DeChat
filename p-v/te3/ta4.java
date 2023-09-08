package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ta4 extends C47465a {

    /* renamed from: d */
    public fh4 f64613d;

    /* renamed from: e */
    public fh4 f64614e;

    /* renamed from: f */
    public boolean f64615f = false;

    /* renamed from: g */
    public String f64616g;

    /* renamed from: h */
    public int f64617h;

    /* renamed from: i */
    public String f64618i;

    /* renamed from: j */
    public String f64619j;

    /* renamed from: n */
    public String f64620n;

    /* renamed from: o */
    public long f64621o = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ta4)) {
            return false;
        }
        ta4 ta4 = (ta4) aVar;
        return C46238a.m51546a(this.f64613d, ta4.f64613d) && C46238a.m51546a(this.f64614e, ta4.f64614e) && C46238a.m51546a(Boolean.valueOf(this.f64615f), Boolean.valueOf(ta4.f64615f)) && C46238a.m51546a(this.f64616g, ta4.f64616g) && C46238a.m51546a(Integer.valueOf(this.f64617h), Integer.valueOf(ta4.f64617h)) && C46238a.m51546a(this.f64618i, ta4.f64618i) && C46238a.m51546a(this.f64619j, ta4.f64619j) && C46238a.m51546a(this.f64620n, ta4.f64620n) && C46238a.m51546a(Long.valueOf(this.f64621o), Long.valueOf(ta4.f64621o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            fh4 fh4 = this.f64613d;
            if (fh4 != null) {
                aVar.mo74322i(1, fh4.computeSize());
                this.f64613d.writeFields(aVar);
            }
            fh4 fh42 = this.f64614e;
            if (fh42 != null) {
                aVar.mo74322i(2, fh42.computeSize());
                this.f64614e.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f64615f);
            String str = this.f64616g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f64617h);
            String str2 = this.f64618i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f64619j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f64620n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74321h(9, this.f64621o);
            return 0;
        } else if (i == 1) {
            fh4 fh43 = this.f64613d;
            if (fh43 != null) {
                i2 = 0 + C52418a.m58682i(1, fh43.computeSize());
            }
            fh4 fh44 = this.f64614e;
            if (fh44 != null) {
                i2 += C52418a.m58682i(2, fh44.computeSize());
            }
            int a = i2 + C52418a.m58674a(3, this.f64615f);
            String str5 = this.f64616g;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            int e = a + C52418a.m58678e(5, this.f64617h);
            String str6 = this.f64618i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            String str7 = this.f64619j;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            String str8 = this.f64620n;
            if (str8 != null) {
                e += C52418a.m58683j(8, str8);
            }
            return e + C52418a.m58681h(9, this.f64621o);
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
            ta4 ta4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        fh4 fh45 = new fh4();
                        if (bArr != null && bArr.length > 0) {
                            fh45.parseFrom(bArr);
                        }
                        ta4.f64613d = fh45;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        fh4 fh46 = new fh4();
                        if (bArr2 != null && bArr2.length > 0) {
                            fh46.parseFrom(bArr2);
                        }
                        ta4.f64614e = fh46;
                    }
                    return 0;
                case 3:
                    ta4.f64615f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    ta4.f64616g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ta4.f64617h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ta4.f64618i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ta4.f64619j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ta4.f64620n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ta4.f64621o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
