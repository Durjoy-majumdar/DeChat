package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k33 */
public class C64483k33 extends C47465a {

    /* renamed from: d */
    public String f183885d;

    /* renamed from: e */
    public String f183886e;

    /* renamed from: f */
    public String f183887f;

    /* renamed from: g */
    public int f183888g;

    /* renamed from: h */
    public int f183889h;

    /* renamed from: i */
    public String f183890i;

    /* renamed from: j */
    public String f183891j;

    /* renamed from: n */
    public C50162kp3 f183892n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64483k33)) {
            return false;
        }
        C64483k33 k332 = (C64483k33) aVar;
        return C46238a.m51546a(this.f183885d, k332.f183885d) && C46238a.m51546a(this.f183886e, k332.f183886e) && C46238a.m51546a(this.f183887f, k332.f183887f) && C46238a.m51546a(Integer.valueOf(this.f183888g), Integer.valueOf(k332.f183888g)) && C46238a.m51546a(Integer.valueOf(this.f183889h), Integer.valueOf(k332.f183889h)) && C46238a.m51546a(this.f183890i, k332.f183890i) && C46238a.m51546a(this.f183891j, k332.f183891j) && C46238a.m51546a(this.f183892n, k332.f183892n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183885d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183886e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183887f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f183888g);
            aVar.mo74318e(5, this.f183889h);
            String str4 = this.f183890i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f183891j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            C50162kp3 kp32 = this.f183892n;
            if (kp32 != null) {
                aVar.mo74322i(8, kp32.computeSize());
                this.f183892n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f183885d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f183886e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f183887f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f183888g) + C52418a.m58678e(5, this.f183889h);
            String str9 = this.f183890i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f183891j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            C50162kp3 kp33 = this.f183892n;
            return kp33 != null ? e + C52418a.m58682i(8, kp33.computeSize()) : e;
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
            C64483k33 k332 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    k332.f183885d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    k332.f183886e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    k332.f183887f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k332.f183888g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    k332.f183889h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    k332.f183890i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    k332.f183891j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50162kp3 kp34 = new C50162kp3();
                        if (bArr != null && bArr.length > 0) {
                            kp34.parseFrom(bArr);
                        }
                        k332.f183892n = kp34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
