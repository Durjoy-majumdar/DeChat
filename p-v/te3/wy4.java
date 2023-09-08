package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wy4 extends C47465a {

    /* renamed from: d */
    public String f186241d;

    /* renamed from: e */
    public C64630pm f186242e;

    /* renamed from: f */
    public boolean f186243f;

    /* renamed from: g */
    public String f186244g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wy4)) {
            return false;
        }
        wy4 wy4 = (wy4) aVar;
        return C46238a.m51546a(this.f186241d, wy4.f186241d) && C46238a.m51546a(this.f186242e, wy4.f186242e) && C46238a.m51546a(Boolean.valueOf(this.f186243f), Boolean.valueOf(wy4.f186243f)) && C46238a.m51546a(this.f186244g, wy4.f186244g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186241d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64630pm pmVar = this.f186242e;
            if (pmVar != null) {
                aVar.mo74322i(2, pmVar.computeSize());
                this.f186242e.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f186243f);
            String str2 = this.f186244g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f186241d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C64630pm pmVar2 = this.f186242e;
            if (pmVar2 != null) {
                i2 += C52418a.m58682i(2, pmVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(3, this.f186243f);
            String str4 = this.f186244g;
            return str4 != null ? a + C52418a.m58683j(4, str4) : a;
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
            wy4 wy4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wy4.f186241d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64630pm pmVar3 = new C64630pm();
                    if (bArr != null && bArr.length > 0) {
                        pmVar3.parseFrom(bArr);
                    }
                    wy4.f186242e = pmVar3;
                }
                return 0;
            } else if (intValue == 3) {
                wy4.f186243f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                wy4.f186244g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
