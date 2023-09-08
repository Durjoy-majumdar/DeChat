package uw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uw1.g */
public class C52629g extends C47465a {

    /* renamed from: d */
    public String f146947d;

    /* renamed from: e */
    public boolean f146948e;

    /* renamed from: f */
    public C52627e f146949f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52629g)) {
            return false;
        }
        C52629g gVar = (C52629g) aVar;
        return C46238a.m51546a(this.f146947d, gVar.f146947d) && C46238a.m51546a(Boolean.valueOf(this.f146948e), Boolean.valueOf(gVar.f146948e)) && C46238a.m51546a(this.f146949f, gVar.f146949f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146947d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74314a(2, this.f146948e);
                C52627e eVar = this.f146949f;
                if (eVar != null) {
                    aVar.mo74322i(3, eVar.computeSize());
                    this.f146949f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: url");
        } else if (i == 1) {
            String str2 = this.f146947d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int a = i2 + C52418a.m58674a(2, this.f146948e);
            C52627e eVar2 = this.f146949f;
            return eVar2 != null ? a + C52418a.m58682i(3, eVar2.computeSize()) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146947d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: url");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52629g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gVar.f146947d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gVar.f146948e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52627e eVar3 = new C52627e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.parseFrom(bArr);
                    }
                    gVar.f146949f = eVar3;
                }
                return 0;
            }
        }
    }
}
