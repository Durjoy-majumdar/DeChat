package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zf3 */
public class C64881zf3 extends C47465a {

    /* renamed from: d */
    public int f186700d;

    /* renamed from: e */
    public String f186701e;

    /* renamed from: f */
    public String f186702f;

    /* renamed from: g */
    public ek4 f186703g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64881zf3)) {
            return false;
        }
        C64881zf3 zf32 = (C64881zf3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186700d), Integer.valueOf(zf32.f186700d)) && C46238a.m51546a(this.f186701e, zf32.f186701e) && C46238a.m51546a(this.f186702f, zf32.f186702f) && C46238a.m51546a(this.f186703g, zf32.f186703g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186700d);
            String str = this.f186701e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186702f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            ek4 ek4 = this.f186703g;
            if (ek4 != null) {
                aVar.mo74322i(4, ek4.computeSize());
                this.f186703g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186700d) + 0;
            String str3 = this.f186701e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f186702f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            ek4 ek42 = this.f186703g;
            return ek42 != null ? e + C52418a.m58682i(4, ek42.computeSize()) : e;
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
            C64881zf3 zf32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zf32.f186700d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                zf32.f186701e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zf32.f186702f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    ek4 ek43 = new ek4();
                    if (bArr != null && bArr.length > 0) {
                        ek43.parseFrom(bArr);
                    }
                    zf32.f186703g = ek43;
                }
                return 0;
            }
        }
    }
}
