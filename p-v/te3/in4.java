package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class in4 extends C101820nt3 {

    /* renamed from: d */
    public String f183707d;

    /* renamed from: e */
    public int f183708e;

    /* renamed from: f */
    public String f183709f;

    /* renamed from: g */
    public int f183710g;

    /* renamed from: h */
    public LinkedList<C64868yx2> f183711h = new LinkedList<>();

    /* renamed from: i */
    public int f183712i;

    /* renamed from: j */
    public LinkedList<C64326ds2> f183713j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof in4)) {
            return false;
        }
        in4 in4 = (in4) aVar;
        return C46238a.m51546a(this.BaseRequest, in4.BaseRequest) && C46238a.m51546a(this.f183707d, in4.f183707d) && C46238a.m51546a(Integer.valueOf(this.f183708e), Integer.valueOf(in4.f183708e)) && C46238a.m51546a(this.f183709f, in4.f183709f) && C46238a.m51546a(Integer.valueOf(this.f183710g), Integer.valueOf(in4.f183710g)) && C46238a.m51546a(this.f183711h, in4.f183711h) && C46238a.m51546a(Integer.valueOf(this.f183712i), Integer.valueOf(in4.f183712i)) && C46238a.m51546a(this.f183713j, in4.f183713j);
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
            String str = this.f183707d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f183708e);
            String str2 = this.f183709f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f183710g);
            aVar.mo74320g(6, 8, this.f183711h);
            aVar.mo74318e(7, this.f183712i);
            aVar.mo74320g(8, 8, this.f183713j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f183707d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f183708e);
            String str4 = this.f183709f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f183710g) + C52418a.m58680g(6, 8, this.f183711h) + C52418a.m58678e(7, this.f183712i) + C52418a.m58680g(8, 8, this.f183713j);
        } else if (i == 2) {
            this.f183711h.clear();
            this.f183713j.clear();
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
            in4 in4 = objArr[1];
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
                        in4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    in4.f183707d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    in4.f183708e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    in4.f183709f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    in4.f183710g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64868yx2 yx22 = new C64868yx2();
                        if (bArr2 != null && bArr2.length > 0) {
                            yx22.parseFrom(bArr2);
                        }
                        in4.f183711h.add(yx22);
                    }
                    return 0;
                case 7:
                    in4.f183712i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64326ds2 ds22 = new C64326ds2();
                        if (bArr3 != null && bArr3.length > 0) {
                            ds22.parseFrom(bArr3);
                        }
                        in4.f183713j.add(ds22);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
