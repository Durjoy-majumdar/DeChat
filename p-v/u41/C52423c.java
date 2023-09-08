package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.c */
public class C52423c extends C47465a {

    /* renamed from: d */
    public boolean f146508d;

    /* renamed from: e */
    public C52441u f146509e;

    /* renamed from: f */
    public C52428h f146510f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52423c)) {
            return false;
        }
        C52423c cVar = (C52423c) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f146508d), Boolean.valueOf(cVar.f146508d)) && C46238a.m51546a(this.f146509e, cVar.f146509e) && C46238a.m51546a(this.f146510f, cVar.f146510f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f146508d);
            C52441u uVar = this.f146509e;
            if (uVar != null) {
                aVar.mo74322i(2, uVar.computeSize());
                this.f146509e.writeFields(aVar);
            }
            C52428h hVar = this.f146510f;
            if (hVar != null) {
                aVar.mo74322i(3, hVar.computeSize());
                this.f146510f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f146508d) + 0;
            C52441u uVar2 = this.f146509e;
            if (uVar2 != null) {
                a += C52418a.m58682i(2, uVar2.computeSize());
            }
            C52428h hVar2 = this.f146510f;
            return hVar2 != null ? a + C52418a.m58682i(3, hVar2.computeSize()) : a;
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
            C52423c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cVar.f146508d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52441u uVar3 = new C52441u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.parseFrom(bArr);
                    }
                    cVar.f146509e = uVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C52428h hVar3 = new C52428h();
                    if (bArr2 != null && bArr2.length > 0) {
                        hVar3.parseFrom(bArr2);
                    }
                    cVar.f146510f = hVar3;
                }
                return 0;
            }
        }
    }
}
