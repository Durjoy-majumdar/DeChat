package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zz4 extends C101820nt3 {

    /* renamed from: d */
    public int f146297d;

    /* renamed from: e */
    public String f146298e;

    /* renamed from: f */
    public LinkedList<b05> f146299f = new LinkedList<>();

    /* renamed from: g */
    public int f146300g = 0;

    /* renamed from: h */
    public int f146301h = 0;

    /* renamed from: i */
    public int f146302i = 0;

    /* renamed from: j */
    public int f146303j = 0;

    /* renamed from: n */
    public int f146304n = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zz4)) {
            return false;
        }
        zz4 zz4 = (zz4) aVar;
        return C46238a.m51546a(this.BaseRequest, zz4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f146297d), Integer.valueOf(zz4.f146297d)) && C46238a.m51546a(this.f146298e, zz4.f146298e) && C46238a.m51546a(this.f146299f, zz4.f146299f) && C46238a.m51546a(Integer.valueOf(this.f146300g), Integer.valueOf(zz4.f146300g)) && C46238a.m51546a(Integer.valueOf(this.f146301h), Integer.valueOf(zz4.f146301h)) && C46238a.m51546a(Integer.valueOf(this.f146302i), Integer.valueOf(zz4.f146302i)) && C46238a.m51546a(Integer.valueOf(this.f146303j), Integer.valueOf(zz4.f146303j)) && C46238a.m51546a(Integer.valueOf(this.f146304n), Integer.valueOf(zz4.f146304n));
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
            aVar.mo74318e(2, this.f146297d);
            String str = this.f146298e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 8, this.f146299f);
            aVar.mo74318e(5, this.f146300g);
            aVar.mo74318e(6, this.f146301h);
            aVar.mo74318e(7, this.f146302i);
            aVar.mo74318e(8, this.f146303j);
            aVar.mo74318e(9, this.f146304n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f146297d);
            String str2 = this.f146298e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58680g(4, 8, this.f146299f) + C52418a.m58678e(5, this.f146300g) + C52418a.m58678e(6, this.f146301h) + C52418a.m58678e(7, this.f146302i) + C52418a.m58678e(8, this.f146303j) + C52418a.m58678e(9, this.f146304n);
        } else if (i == 2) {
            this.f146299f.clear();
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
            zz4 zz4 = objArr[1];
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
                        zz4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zz4.f146297d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zz4.f146298e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        b05 b05 = new b05();
                        if (bArr2 != null && bArr2.length > 0) {
                            b05.parseFrom(bArr2);
                        }
                        zz4.f146299f.add(b05);
                    }
                    return 0;
                case 5:
                    zz4.f146300g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zz4.f146301h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zz4.f146302i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zz4.f146303j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    zz4.f146304n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
