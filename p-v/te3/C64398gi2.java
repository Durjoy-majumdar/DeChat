package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gi2 */
public class C64398gi2 extends C47465a {

    /* renamed from: d */
    public String f183337d;

    /* renamed from: e */
    public String f183338e;

    /* renamed from: f */
    public C64384g40 f183339f;

    /* renamed from: g */
    public C64384g40 f183340g;

    /* renamed from: h */
    public String f183341h;

    /* renamed from: i */
    public String f183342i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64398gi2)) {
            return false;
        }
        C64398gi2 gi22 = (C64398gi2) aVar;
        return C46238a.m51546a(this.f183337d, gi22.f183337d) && C46238a.m51546a(this.f183338e, gi22.f183338e) && C46238a.m51546a(this.f183339f, gi22.f183339f) && C46238a.m51546a(this.f183340g, gi22.f183340g) && C46238a.m51546a(this.f183341h, gi22.f183341h) && C46238a.m51546a(this.f183342i, gi22.f183342i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183337d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183338e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            C64384g40 g402 = this.f183339f;
            if (g402 != null) {
                aVar.mo74322i(3, g402.computeSize());
                this.f183339f.writeFields(aVar);
            }
            C64384g40 g403 = this.f183340g;
            if (g403 != null) {
                aVar.mo74322i(4, g403.computeSize());
                this.f183340g.writeFields(aVar);
            }
            String str3 = this.f183341h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f183342i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f183337d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f183338e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            C64384g40 g404 = this.f183339f;
            if (g404 != null) {
                i2 += C52418a.m58682i(3, g404.computeSize());
            }
            C64384g40 g405 = this.f183340g;
            if (g405 != null) {
                i2 += C52418a.m58682i(4, g405.computeSize());
            }
            String str7 = this.f183341h;
            if (str7 != null) {
                i2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f183342i;
            return str8 != null ? i2 + C52418a.m58683j(6, str8) : i2;
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
            C64398gi2 gi22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gi22.f183337d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gi22.f183338e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64384g40 g406 = new C64384g40();
                        if (bArr != null && bArr.length > 0) {
                            g406.parseFrom(bArr);
                        }
                        gi22.f183339f = g406;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64384g40 g407 = new C64384g40();
                        if (bArr2 != null && bArr2.length > 0) {
                            g407.parseFrom(bArr2);
                        }
                        gi22.f183340g = g407;
                    }
                    return 0;
                case 5:
                    gi22.f183341h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gi22.f183342i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
