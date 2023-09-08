package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lh3 */
public class C64525lh3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64493kh3> f184106d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64506kz3> f184107e = new LinkedList<>();

    /* renamed from: f */
    public String f184108f;

    /* renamed from: g */
    public String f184109g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64525lh3)) {
            return false;
        }
        C64525lh3 lh32 = (C64525lh3) aVar;
        return C46238a.m51546a(this.f184106d, lh32.f184106d) && C46238a.m51546a(this.f184107e, lh32.f184107e) && C46238a.m51546a(this.f184108f, lh32.f184108f) && C46238a.m51546a(this.f184109g, lh32.f184109g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f184106d);
            aVar.mo74320g(2, 8, this.f184107e);
            String str = this.f184108f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f184109g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f184106d) + 0 + C52418a.m58680g(2, 8, this.f184107e);
            String str3 = this.f184108f;
            if (str3 != null) {
                g += C52418a.m58683j(3, str3);
            }
            String str4 = this.f184109g;
            return str4 != null ? g + C52418a.m58683j(4, str4) : g;
        } else if (i == 2) {
            this.f184106d.clear();
            this.f184107e.clear();
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
            C64525lh3 lh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64493kh3 kh32 = new C64493kh3();
                    if (bArr != null && bArr.length > 0) {
                        kh32.parseFrom(bArr);
                    }
                    lh32.f184106d.add(kh32);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C64506kz3 kz32 = new C64506kz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        kz32.parseFrom(bArr2);
                    }
                    lh32.f184107e.add(kz32);
                }
                return 0;
            } else if (intValue == 3) {
                lh32.f184108f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lh32.f184109g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
