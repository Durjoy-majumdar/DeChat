package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class o94 extends C101820nt3 {

    /* renamed from: d */
    public String f184640d;

    /* renamed from: e */
    public String f184641e;

    /* renamed from: f */
    public long f184642f;

    /* renamed from: g */
    public int f184643g;

    /* renamed from: h */
    public long f184644h;

    /* renamed from: i */
    public int f184645i;

    /* renamed from: j */
    public int f184646j;

    /* renamed from: n */
    public int f184647n;

    /* renamed from: o */
    public int f184648o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o94)) {
            return false;
        }
        o94 o94 = (o94) aVar;
        return C46238a.m51546a(this.BaseRequest, o94.BaseRequest) && C46238a.m51546a(this.f184640d, o94.f184640d) && C46238a.m51546a(this.f184641e, o94.f184641e) && C46238a.m51546a(Long.valueOf(this.f184642f), Long.valueOf(o94.f184642f)) && C46238a.m51546a(Integer.valueOf(this.f184643g), Integer.valueOf(o94.f184643g)) && C46238a.m51546a(Long.valueOf(this.f184644h), Long.valueOf(o94.f184644h)) && C46238a.m51546a(Integer.valueOf(this.f184645i), Integer.valueOf(o94.f184645i)) && C46238a.m51546a(Integer.valueOf(this.f184646j), Integer.valueOf(o94.f184646j)) && C46238a.m51546a(Integer.valueOf(this.f184647n), Integer.valueOf(o94.f184647n)) && C46238a.m51546a(Integer.valueOf(this.f184648o), Integer.valueOf(o94.f184648o));
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
            String str = this.f184640d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184641e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f184642f);
            aVar.mo74318e(5, this.f184643g);
            aVar.mo74321h(6, this.f184644h);
            aVar.mo74318e(7, this.f184645i);
            aVar.mo74318e(8, this.f184646j);
            aVar.mo74318e(9, this.f184647n);
            aVar.mo74318e(10, this.f184648o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f184640d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f184641e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58681h(4, this.f184642f) + C52418a.m58678e(5, this.f184643g) + C52418a.m58681h(6, this.f184644h) + C52418a.m58678e(7, this.f184645i) + C52418a.m58678e(8, this.f184646j) + C52418a.m58678e(9, this.f184647n) + C52418a.m58678e(10, this.f184648o);
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
            o94 o94 = objArr[1];
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
                        o94.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o94.f184640d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o94.f184641e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o94.f184642f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    o94.f184643g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    o94.f184644h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    o94.f184645i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    o94.f184646j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    o94.f184647n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    o94.f184648o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
