package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sv2 */
public class C51305sv2 extends C47465a {

    /* renamed from: d */
    public String f141780d;

    /* renamed from: e */
    public LinkedList<C64299cw2> f141781e = new LinkedList<>();

    /* renamed from: f */
    public int f141782f;

    /* renamed from: g */
    public String f141783g;

    /* renamed from: h */
    public C48917bw2 f141784h;

    /* renamed from: i */
    public C51882wv2 f141785i;

    /* renamed from: j */
    public C48917bw2 f141786j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51305sv2)) {
            return false;
        }
        C51305sv2 sv22 = (C51305sv2) aVar;
        return C46238a.m51546a(this.f141780d, sv22.f141780d) && C46238a.m51546a(this.f141781e, sv22.f141781e) && C46238a.m51546a(Integer.valueOf(this.f141782f), Integer.valueOf(sv22.f141782f)) && C46238a.m51546a(this.f141783g, sv22.f141783g) && C46238a.m51546a(this.f141784h, sv22.f141784h) && C46238a.m51546a(this.f141785i, sv22.f141785i) && C46238a.m51546a(this.f141786j, sv22.f141786j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141780d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f141781e);
            aVar.mo74318e(3, this.f141782f);
            String str2 = this.f141783g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C48917bw2 bw22 = this.f141784h;
            if (bw22 != null) {
                aVar.mo74322i(5, bw22.computeSize());
                this.f141784h.writeFields(aVar);
            }
            C51882wv2 wv22 = this.f141785i;
            if (wv22 != null) {
                aVar.mo74322i(6, wv22.computeSize());
                this.f141785i.writeFields(aVar);
            }
            C48917bw2 bw23 = this.f141786j;
            if (bw23 != null) {
                aVar.mo74322i(7, bw23.computeSize());
                this.f141786j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f141780d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f141781e) + C52418a.m58678e(3, this.f141782f);
            String str4 = this.f141783g;
            if (str4 != null) {
                g += C52418a.m58683j(4, str4);
            }
            C48917bw2 bw24 = this.f141784h;
            if (bw24 != null) {
                g += C52418a.m58682i(5, bw24.computeSize());
            }
            C51882wv2 wv23 = this.f141785i;
            if (wv23 != null) {
                g += C52418a.m58682i(6, wv23.computeSize());
            }
            C48917bw2 bw25 = this.f141786j;
            return bw25 != null ? g + C52418a.m58682i(7, bw25.computeSize()) : g;
        } else if (i == 2) {
            this.f141781e.clear();
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
            C51305sv2 sv22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sv22.f141780d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64299cw2 cw22 = new C64299cw2();
                        if (bArr != null && bArr.length > 0) {
                            cw22.parseFrom(bArr);
                        }
                        sv22.f141781e.add(cw22);
                    }
                    return 0;
                case 3:
                    sv22.f141782f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sv22.f141783g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48917bw2 bw26 = new C48917bw2();
                        if (bArr2 != null && bArr2.length > 0) {
                            bw26.parseFrom(bArr2);
                        }
                        sv22.f141784h = bw26;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51882wv2 wv24 = new C51882wv2();
                        if (bArr3 != null && bArr3.length > 0) {
                            wv24.parseFrom(bArr3);
                        }
                        sv22.f141785i = wv24;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C48917bw2 bw27 = new C48917bw2();
                        if (bArr4 != null && bArr4.length > 0) {
                            bw27.parseFrom(bArr4);
                        }
                        sv22.f141786j = bw27;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
