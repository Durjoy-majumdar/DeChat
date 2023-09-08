package z72;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: z72.a */
public class C53755a extends C47465a {

    /* renamed from: d */
    public String f150889d;

    /* renamed from: e */
    public C53756b f150890e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53755a)) {
            return false;
        }
        C53755a aVar2 = (C53755a) aVar;
        return C46238a.m51546a(this.f150889d, aVar2.f150889d) && C46238a.m51546a(this.f150890e, aVar2.f150890e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f150889d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C53756b bVar = this.f150890e;
            if (bVar != null) {
                aVar.mo74322i(2, bVar.computeSize());
                this.f150890e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f150889d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C53756b bVar2 = this.f150890e;
            return bVar2 != null ? i2 + C52418a.m58682i(2, bVar2.computeSize()) : i2;
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
            C53755a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                aVar4.f150889d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C53756b bVar3 = new C53756b();
                    if (bArr != null && bArr.length > 0) {
                        bVar3.parseFrom(bArr);
                    }
                    aVar4.f150890e = bVar3;
                }
                return 0;
            }
        }
    }
}
