package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rh2 */
public class C77991rh2 extends C47465a {

    /* renamed from: d */
    public int f228163d;

    /* renamed from: e */
    public String f228164e;

    /* renamed from: f */
    public String f228165f;

    /* renamed from: g */
    public String f228166g;

    /* renamed from: h */
    public String f228167h;

    /* renamed from: i */
    public C78022z93 f228168i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77991rh2)) {
            return false;
        }
        C77991rh2 rh22 = (C77991rh2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f228163d), Integer.valueOf(rh22.f228163d)) && C46238a.m51546a(this.f228164e, rh22.f228164e) && C46238a.m51546a(this.f228165f, rh22.f228165f) && C46238a.m51546a(this.f228166g, rh22.f228166g) && C46238a.m51546a(this.f228167h, rh22.f228167h) && C46238a.m51546a(this.f228168i, rh22.f228168i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f228164e != null) {
                aVar.mo74318e(1, this.f228163d);
                String str = this.f228164e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f228165f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f228166g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f228167h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                C78022z93 z932 = this.f228168i;
                if (z932 != null) {
                    aVar.mo74322i(6, z932.computeSize());
                    this.f228168i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: session_data");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f228163d) + 0;
            String str5 = this.f228164e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f228165f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f228166g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f228167h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            C78022z93 z933 = this.f228168i;
            return z933 != null ? e + C52418a.m58682i(6, z933.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f228164e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: session_data");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77991rh2 rh22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rh22.f228163d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    rh22.f228164e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rh22.f228165f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rh22.f228166g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rh22.f228167h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C78022z93 z934 = new C78022z93();
                        if (bArr != null && bArr.length > 0) {
                            z934.parseFrom(bArr);
                        }
                        rh22.f228168i = z934;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
