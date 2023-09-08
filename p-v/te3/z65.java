package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class z65 extends C101820nt3 {

    /* renamed from: d */
    public int f145728d;

    /* renamed from: e */
    public C89349b f145729e;

    /* renamed from: f */
    public String f145730f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof z65)) {
            return false;
        }
        z65 z65 = (z65) aVar;
        return C46238a.m51546a(this.BaseRequest, z65.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f145728d), Integer.valueOf(z65.f145728d)) && C46238a.m51546a(this.f145729e, z65.f145729e) && C46238a.m51546a(this.f145730f, z65.f145730f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f145728d);
            C89349b bVar = this.f145729e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f145730f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145728d);
            C89349b bVar2 = this.f145729e;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            String str2 = this.f145730f;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
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
            z65 z65 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    z65.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                z65.f145728d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                z65.f145729e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                z65.f145730f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
