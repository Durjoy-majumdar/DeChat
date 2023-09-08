package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rn */
public class C22528rn extends C47465a {

    /* renamed from: d */
    public String f64549d;

    /* renamed from: e */
    public String f64550e;

    /* renamed from: f */
    public String f64551f;

    /* renamed from: g */
    public int f64552g;

    /* renamed from: h */
    public String f64553h;

    /* renamed from: i */
    public C51997xn f64554i;

    /* renamed from: j */
    public String f64555j;

    /* renamed from: n */
    public int f64556n;

    /* renamed from: o */
    public int f64557o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22528rn)) {
            return false;
        }
        C22528rn rnVar = (C22528rn) aVar;
        return C46238a.m51546a(this.f64549d, rnVar.f64549d) && C46238a.m51546a(this.f64550e, rnVar.f64550e) && C46238a.m51546a(this.f64551f, rnVar.f64551f) && C46238a.m51546a(Integer.valueOf(this.f64552g), Integer.valueOf(rnVar.f64552g)) && C46238a.m51546a(this.f64553h, rnVar.f64553h) && C46238a.m51546a(this.f64554i, rnVar.f64554i) && C46238a.m51546a(this.f64555j, rnVar.f64555j) && C46238a.m51546a(Integer.valueOf(this.f64556n), Integer.valueOf(rnVar.f64556n)) && C46238a.m51546a(Integer.valueOf(this.f64557o), Integer.valueOf(rnVar.f64557o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64549d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64550e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64551f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f64552g);
            String str4 = this.f64553h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C51997xn xnVar = this.f64554i;
            if (xnVar != null) {
                aVar.mo74322i(6, xnVar.computeSize());
                this.f64554i.writeFields(aVar);
            }
            String str5 = this.f64555j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f64556n);
            aVar.mo74318e(9, this.f64557o);
            return 0;
        } else if (i == 1) {
            String str6 = this.f64549d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f64550e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f64551f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f64552g);
            String str9 = this.f64553h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            C51997xn xnVar2 = this.f64554i;
            if (xnVar2 != null) {
                e += C52418a.m58682i(6, xnVar2.computeSize());
            }
            String str10 = this.f64555j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            return e + C52418a.m58678e(8, this.f64556n) + C52418a.m58678e(9, this.f64557o);
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
            C22528rn rnVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rnVar.f64549d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rnVar.f64550e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rnVar.f64551f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rnVar.f64552g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rnVar.f64553h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        rnVar.f64554i = xnVar3;
                    }
                    return 0;
                case 7:
                    rnVar.f64555j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rnVar.f64556n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    rnVar.f64557o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
