package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s40 */
public class C51198s40 extends C47465a {

    /* renamed from: d */
    public int f141311d;

    /* renamed from: e */
    public C50778p40 f141312e;

    /* renamed from: f */
    public C50778p40 f141313f;

    /* renamed from: g */
    public int f141314g;

    /* renamed from: h */
    public int f141315h;

    /* renamed from: i */
    public int f141316i;

    /* renamed from: j */
    public int f141317j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51198s40)) {
            return false;
        }
        C51198s40 s402 = (C51198s40) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141311d), Integer.valueOf(s402.f141311d)) && C46238a.m51546a(this.f141312e, s402.f141312e) && C46238a.m51546a(this.f141313f, s402.f141313f) && C46238a.m51546a(Integer.valueOf(this.f141314g), Integer.valueOf(s402.f141314g)) && C46238a.m51546a(Integer.valueOf(this.f141315h), Integer.valueOf(s402.f141315h)) && C46238a.m51546a(Integer.valueOf(this.f141316i), Integer.valueOf(s402.f141316i)) && C46238a.m51546a(Integer.valueOf(this.f141317j), Integer.valueOf(s402.f141317j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141311d);
            C50778p40 p402 = this.f141312e;
            if (p402 != null) {
                aVar.mo74322i(2, p402.computeSize());
                this.f141312e.writeFields(aVar);
            }
            C50778p40 p403 = this.f141313f;
            if (p403 != null) {
                aVar.mo74322i(3, p403.computeSize());
                this.f141313f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f141314g);
            aVar.mo74318e(5, this.f141315h);
            aVar.mo74318e(6, this.f141316i);
            aVar.mo74318e(7, this.f141317j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141311d) + 0;
            C50778p40 p404 = this.f141312e;
            if (p404 != null) {
                e += C52418a.m58682i(2, p404.computeSize());
            }
            C50778p40 p405 = this.f141313f;
            if (p405 != null) {
                e += C52418a.m58682i(3, p405.computeSize());
            }
            return e + C52418a.m58678e(4, this.f141314g) + C52418a.m58678e(5, this.f141315h) + C52418a.m58678e(6, this.f141316i) + C52418a.m58678e(7, this.f141317j);
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
            C51198s40 s402 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s402.f141311d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50778p40 p406 = new C50778p40();
                        if (bArr != null && bArr.length > 0) {
                            p406.parseFrom(bArr);
                        }
                        s402.f141312e = p406;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C50778p40 p407 = new C50778p40();
                        if (bArr2 != null && bArr2.length > 0) {
                            p407.parseFrom(bArr2);
                        }
                        s402.f141313f = p407;
                    }
                    return 0;
                case 4:
                    s402.f141314g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    s402.f141315h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    s402.f141316i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    s402.f141317j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
