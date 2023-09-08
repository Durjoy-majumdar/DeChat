package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class k55 extends C47465a {

    /* renamed from: d */
    public String f136569d;

    /* renamed from: e */
    public String f136570e;

    /* renamed from: f */
    public h44 f136571f;

    /* renamed from: g */
    public boolean f136572g;

    /* renamed from: h */
    public boolean f136573h;

    /* renamed from: i */
    public ch4 f136574i;

    /* renamed from: j */
    public boolean f136575j;

    /* renamed from: n */
    public int f136576n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof k55)) {
            return false;
        }
        k55 k55 = (k55) aVar;
        return C46238a.m51546a(this.f136569d, k55.f136569d) && C46238a.m51546a(this.f136570e, k55.f136570e) && C46238a.m51546a(this.f136571f, k55.f136571f) && C46238a.m51546a(Boolean.valueOf(this.f136572g), Boolean.valueOf(k55.f136572g)) && C46238a.m51546a(Boolean.valueOf(this.f136573h), Boolean.valueOf(k55.f136573h)) && C46238a.m51546a(this.f136574i, k55.f136574i) && C46238a.m51546a(Boolean.valueOf(this.f136575j), Boolean.valueOf(k55.f136575j)) && C46238a.m51546a(Integer.valueOf(this.f136576n), Integer.valueOf(k55.f136576n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136569d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136570e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            h44 h44 = this.f136571f;
            if (h44 != null) {
                aVar.mo74322i(3, h44.computeSize());
                this.f136571f.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f136572g);
            aVar.mo74314a(5, this.f136573h);
            ch4 ch4 = this.f136574i;
            if (ch4 != null) {
                aVar.mo74322i(6, ch4.computeSize());
                this.f136574i.writeFields(aVar);
            }
            aVar.mo74314a(7, this.f136575j);
            aVar.mo74318e(8, this.f136576n);
            return 0;
        } else if (i == 1) {
            String str3 = this.f136569d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f136570e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            h44 h442 = this.f136571f;
            if (h442 != null) {
                i2 += C52418a.m58682i(3, h442.computeSize());
            }
            int a = i2 + C52418a.m58674a(4, this.f136572g) + C52418a.m58674a(5, this.f136573h);
            ch4 ch42 = this.f136574i;
            if (ch42 != null) {
                a += C52418a.m58682i(6, ch42.computeSize());
            }
            return a + C52418a.m58674a(7, this.f136575j) + C52418a.m58678e(8, this.f136576n);
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
            k55 k55 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    k55.f136569d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    k55.f136570e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        h44 h443 = new h44();
                        if (bArr != null && bArr.length > 0) {
                            h443.parseFrom(bArr);
                        }
                        k55.f136571f = h443;
                    }
                    return 0;
                case 4:
                    k55.f136572g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    k55.f136573h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ch4 ch43 = new ch4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ch43.parseFrom(bArr2);
                        }
                        k55.f136574i = ch43;
                    }
                    return 0;
                case 7:
                    k55.f136575j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    k55.f136576n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
