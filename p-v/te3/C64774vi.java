package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vi */
public class C64774vi extends C47465a {

    /* renamed from: d */
    public boolean f185899d;

    /* renamed from: e */
    public C118447nw2 f185900e;

    /* renamed from: f */
    public String f185901f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64774vi)) {
            return false;
        }
        C64774vi viVar = (C64774vi) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f185899d), Boolean.valueOf(viVar.f185899d)) && C46238a.m51546a(this.f185900e, viVar.f185900e) && C46238a.m51546a(this.f185901f, viVar.f185901f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f185899d);
            C118447nw2 nw22 = this.f185900e;
            if (nw22 != null) {
                aVar.mo74322i(2, nw22.computeSize());
                this.f185900e.writeFields(aVar);
            }
            String str = this.f185901f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f185899d) + 0;
            C118447nw2 nw23 = this.f185900e;
            if (nw23 != null) {
                a += C52418a.m58682i(2, nw23.computeSize());
            }
            String str2 = this.f185901f;
            return str2 != null ? a + C52418a.m58683j(3, str2) : a;
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
            C64774vi viVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                viVar.f185899d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C118447nw2 nw24 = new C118447nw2();
                    if (bArr != null && bArr.length > 0) {
                        nw24.parseFrom(bArr);
                    }
                    viVar.f185900e = nw24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                viVar.f185901f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
