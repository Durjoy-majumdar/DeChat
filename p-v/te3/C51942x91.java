package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x91 */
public class C51942x91 extends C47465a {

    /* renamed from: d */
    public int f144531d;

    /* renamed from: e */
    public String f144532e;

    /* renamed from: f */
    public boolean f144533f;

    /* renamed from: g */
    public boolean f144534g;

    /* renamed from: h */
    public boolean f144535h;

    /* renamed from: i */
    public boolean f144536i;

    /* renamed from: j */
    public LinkedList<C51942x91> f144537j = new LinkedList<>();

    /* renamed from: n */
    public int f144538n;

    /* renamed from: o */
    public long f144539o;

    /* renamed from: p */
    public String f144540p;

    /* renamed from: q */
    public String f144541q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51942x91)) {
            return false;
        }
        C51942x91 x912 = (C51942x91) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144531d), Integer.valueOf(x912.f144531d)) && C46238a.m51546a(this.f144532e, x912.f144532e) && C46238a.m51546a(Boolean.valueOf(this.f144533f), Boolean.valueOf(x912.f144533f)) && C46238a.m51546a(Boolean.valueOf(this.f144534g), Boolean.valueOf(x912.f144534g)) && C46238a.m51546a(Boolean.valueOf(this.f144535h), Boolean.valueOf(x912.f144535h)) && C46238a.m51546a(Boolean.valueOf(this.f144536i), Boolean.valueOf(x912.f144536i)) && C46238a.m51546a(this.f144537j, x912.f144537j) && C46238a.m51546a(Integer.valueOf(this.f144538n), Integer.valueOf(x912.f144538n)) && C46238a.m51546a(Long.valueOf(this.f144539o), Long.valueOf(x912.f144539o)) && C46238a.m51546a(this.f144540p, x912.f144540p) && C46238a.m51546a(this.f144541q, x912.f144541q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144531d);
            String str = this.f144532e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f144533f);
            aVar.mo74314a(4, this.f144534g);
            aVar.mo74314a(5, this.f144535h);
            aVar.mo74314a(6, this.f144536i);
            aVar.mo74320g(7, 8, this.f144537j);
            aVar.mo74318e(8, this.f144538n);
            aVar.mo74321h(9, this.f144539o);
            String str2 = this.f144540p;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            String str3 = this.f144541q;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144531d) + 0;
            String str4 = this.f144532e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int a = e + C52418a.m58674a(3, this.f144533f) + C52418a.m58674a(4, this.f144534g) + C52418a.m58674a(5, this.f144535h) + C52418a.m58674a(6, this.f144536i) + C52418a.m58680g(7, 8, this.f144537j) + C52418a.m58678e(8, this.f144538n) + C52418a.m58681h(9, this.f144539o);
            String str5 = this.f144540p;
            if (str5 != null) {
                a += C52418a.m58683j(10, str5);
            }
            String str6 = this.f144541q;
            return str6 != null ? a + C52418a.m58683j(11, str6) : a;
        } else if (i == 2) {
            this.f144537j.clear();
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
            C51942x91 x912 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x912.f144531d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    x912.f144532e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x912.f144533f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    x912.f144534g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    x912.f144535h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    x912.f144536i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51942x91 x913 = new C51942x91();
                        if (bArr != null && bArr.length > 0) {
                            x913.parseFrom(bArr);
                        }
                        x912.f144537j.add(x913);
                    }
                    return 0;
                case 8:
                    x912.f144538n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    x912.f144539o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    x912.f144540p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    x912.f144541q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
