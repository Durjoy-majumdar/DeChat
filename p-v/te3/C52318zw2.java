package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zw2 */
public class C52318zw2 extends C49335eu3 {

    /* renamed from: d */
    public int f146252d;

    /* renamed from: e */
    public C51163rv3 f146253e;

    /* renamed from: f */
    public int f146254f;

    /* renamed from: g */
    public int f146255g;

    /* renamed from: h */
    public int f146256h;

    /* renamed from: i */
    public int f146257i;

    /* renamed from: j */
    public int f146258j;

    /* renamed from: n */
    public long f146259n;

    /* renamed from: o */
    public String f146260o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52318zw2)) {
            return false;
        }
        C52318zw2 zw22 = (C52318zw2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146252d), Integer.valueOf(zw22.f146252d)) && C46238a.m51546a(this.f146253e, zw22.f146253e) && C46238a.m51546a(Integer.valueOf(this.f146254f), Integer.valueOf(zw22.f146254f)) && C46238a.m51546a(Integer.valueOf(this.f146255g), Integer.valueOf(zw22.f146255g)) && C46238a.m51546a(Integer.valueOf(this.f146256h), Integer.valueOf(zw22.f146256h)) && C46238a.m51546a(Integer.valueOf(this.f146257i), Integer.valueOf(zw22.f146257i)) && C46238a.m51546a(Integer.valueOf(this.f146258j), Integer.valueOf(zw22.f146258j)) && C46238a.m51546a(Long.valueOf(this.f146259n), Long.valueOf(zw22.f146259n)) && C46238a.m51546a(this.f146260o, zw22.f146260o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f146253e != null) {
                aVar.mo74318e(1, this.f146252d);
                C51163rv3 rv32 = this.f146253e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f146253e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f146254f);
                aVar.mo74318e(4, this.f146255g);
                aVar.mo74318e(5, this.f146256h);
                aVar.mo74318e(6, this.f146257i);
                aVar.mo74318e(7, this.f146258j);
                aVar.mo74321h(8, this.f146259n);
                String str = this.f146260o;
                if (str != null) {
                    aVar.mo74323j(9, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ToUserName");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f146252d) + 0;
            C51163rv3 rv33 = this.f146253e;
            if (rv33 != null) {
                e += C52418a.m58682i(2, rv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f146254f) + C52418a.m58678e(4, this.f146255g) + C52418a.m58678e(5, this.f146256h) + C52418a.m58678e(6, this.f146257i) + C52418a.m58678e(7, this.f146258j) + C52418a.m58681h(8, this.f146259n);
            String str2 = this.f146260o;
            return str2 != null ? e2 + C52418a.m58683j(9, str2) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146253e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ToUserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52318zw2 zw22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zw22.f146252d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv34.mo73356d(bArr);
                        }
                        zw22.f146253e = rv34;
                    }
                    return 0;
                case 3:
                    zw22.f146254f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    zw22.f146255g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    zw22.f146256h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zw22.f146257i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zw22.f146258j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zw22.f146259n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    zw22.f146260o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
