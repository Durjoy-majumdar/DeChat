package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n32 */
public class C64568n32 extends C101820nt3 {

    /* renamed from: d */
    public int f184423d;

    /* renamed from: e */
    public String f184424e;

    /* renamed from: f */
    public int f184425f;

    /* renamed from: g */
    public LinkedList<C64868yx2> f184426g = new LinkedList<>();

    /* renamed from: h */
    public int f184427h;

    /* renamed from: i */
    public LinkedList<C64326ds2> f184428i = new LinkedList<>();

    /* renamed from: j */
    public int f184429j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64568n32)) {
            return false;
        }
        C64568n32 n322 = (C64568n32) aVar;
        return C46238a.m51546a(this.BaseRequest, n322.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184423d), Integer.valueOf(n322.f184423d)) && C46238a.m51546a(this.f184424e, n322.f184424e) && C46238a.m51546a(Integer.valueOf(this.f184425f), Integer.valueOf(n322.f184425f)) && C46238a.m51546a(this.f184426g, n322.f184426g) && C46238a.m51546a(Integer.valueOf(this.f184427h), Integer.valueOf(n322.f184427h)) && C46238a.m51546a(this.f184428i, n322.f184428i) && C46238a.m51546a(Integer.valueOf(this.f184429j), Integer.valueOf(n322.f184429j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f184423d);
            String str = this.f184424e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f184425f);
            aVar.mo74320g(5, 8, this.f184426g);
            aVar.mo74318e(6, this.f184427h);
            aVar.mo74320g(7, 8, this.f184428i);
            aVar.mo74318e(8, this.f184429j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184423d);
            String str2 = this.f184424e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f184425f) + C52418a.m58680g(5, 8, this.f184426g) + C52418a.m58678e(6, this.f184427h) + C52418a.m58680g(7, 8, this.f184428i) + C52418a.m58678e(8, this.f184429j);
        } else if (i == 2) {
            this.f184426g.clear();
            this.f184428i.clear();
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
            C64568n32 n322 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        n322.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    n322.f184423d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n322.f184424e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    n322.f184425f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64868yx2 yx22 = new C64868yx2();
                        if (bArr2 != null && bArr2.length > 0) {
                            yx22.parseFrom(bArr2);
                        }
                        n322.f184426g.add(yx22);
                    }
                    return 0;
                case 6:
                    n322.f184427h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64326ds2 ds22 = new C64326ds2();
                        if (bArr3 != null && bArr3.length > 0) {
                            ds22.parseFrom(bArr3);
                        }
                        n322.f184428i.add(ds22);
                    }
                    return 0;
                case 8:
                    n322.f184429j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
