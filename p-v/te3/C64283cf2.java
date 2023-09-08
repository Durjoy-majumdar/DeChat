package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cf2 */
public class C64283cf2 extends C47465a {

    /* renamed from: d */
    public String f182463d;

    /* renamed from: e */
    public float f182464e;

    /* renamed from: f */
    public float f182465f;

    /* renamed from: g */
    public C64899zy f182466g;

    /* renamed from: h */
    public String f182467h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64283cf2)) {
            return false;
        }
        C64283cf2 cf22 = (C64283cf2) aVar;
        return C46238a.m51546a(this.f182463d, cf22.f182463d) && C46238a.m51546a(Float.valueOf(this.f182464e), Float.valueOf(cf22.f182464e)) && C46238a.m51546a(Float.valueOf(this.f182465f), Float.valueOf(cf22.f182465f)) && C46238a.m51546a(this.f182466g, cf22.f182466g) && C46238a.m51546a(this.f182467h, cf22.f182467h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182463d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74317d(2, this.f182464e);
            aVar.mo74317d(3, this.f182465f);
            C64899zy zyVar = this.f182466g;
            if (zyVar != null) {
                aVar.mo74322i(4, zyVar.computeSize());
                this.f182466g.writeFields(aVar);
            }
            String str2 = this.f182467h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f182463d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int d = i2 + C52418a.m58677d(2, this.f182464e) + C52418a.m58677d(3, this.f182465f);
            C64899zy zyVar2 = this.f182466g;
            if (zyVar2 != null) {
                d += C52418a.m58682i(4, zyVar2.computeSize());
            }
            String str4 = this.f182467h;
            return str4 != null ? d + C52418a.m58683j(5, str4) : d;
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
            C64283cf2 cf22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cf22.f182463d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                cf22.f182464e = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 3) {
                cf22.f182465f = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64899zy zyVar3 = new C64899zy();
                    if (bArr != null && bArr.length > 0) {
                        zyVar3.parseFrom(bArr);
                    }
                    cf22.f182466g = zyVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                cf22.f182467h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
