package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wa3 */
public class C64798wa3 extends C101820nt3 {

    /* renamed from: d */
    public String f186069d;

    /* renamed from: e */
    public C101870ya3 f186070e;

    /* renamed from: f */
    public int f186071f;

    /* renamed from: g */
    public C89349b f186072g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64798wa3)) {
            return false;
        }
        C64798wa3 wa32 = (C64798wa3) aVar;
        return C46238a.m51546a(this.BaseRequest, wa32.BaseRequest) && C46238a.m51546a(this.f186069d, wa32.f186069d) && C46238a.m51546a(this.f186070e, wa32.f186070e) && C46238a.m51546a(Integer.valueOf(this.f186071f), Integer.valueOf(wa32.f186071f)) && C46238a.m51546a(this.f186072g, wa32.f186072g);
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
            String str = this.f186069d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C101870ya3 ya32 = this.f186070e;
            if (ya32 != null) {
                aVar.mo74322i(3, ya32.computeSize());
                this.f186070e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f186071f);
            C89349b bVar = this.f186072g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f186069d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C101870ya3 ya33 = this.f186070e;
            if (ya33 != null) {
                i2 += C52418a.m58682i(3, ya33.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f186071f);
            C89349b bVar2 = this.f186072g;
            return bVar2 != null ? e + C52418a.m58675b(5, bVar2) : e;
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
            C64798wa3 wa32 = objArr[1];
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
                    wa32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                wa32.f186069d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101870ya3 ya34 = new C101870ya3();
                    if (bArr2 != null && bArr2.length > 0) {
                        ya34.parseFrom(bArr2);
                    }
                    wa32.f186070e = ya34;
                }
                return 0;
            } else if (intValue == 4) {
                wa32.f186071f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                wa32.f186072g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
