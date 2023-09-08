package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a03 */
public class C48644a03 extends C101820nt3 {

    /* renamed from: d */
    public C49546gd3 f130185d;

    /* renamed from: e */
    public String f130186e;

    /* renamed from: f */
    public String f130187f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48644a03)) {
            return false;
        }
        C48644a03 a032 = (C48644a03) aVar;
        return C46238a.m51546a(this.BaseRequest, a032.BaseRequest) && C46238a.m51546a(this.f130185d, a032.f130185d) && C46238a.m51546a(this.f130186e, a032.f130186e) && C46238a.m51546a(this.f130187f, a032.f130187f);
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
            C49546gd3 gd32 = this.f130185d;
            if (gd32 != null) {
                aVar.mo74322i(2, gd32.computeSize());
                this.f130185d.writeFields(aVar);
            }
            String str = this.f130186e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f130187f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49546gd3 gd33 = this.f130185d;
            if (gd33 != null) {
                i2 += C52418a.m58682i(2, gd33.computeSize());
            }
            String str3 = this.f130186e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f130187f;
            return str4 != null ? i2 + C52418a.m58683j(4, str4) : i2;
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
            C48644a03 a032 = objArr[1];
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
                    a032.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49546gd3 gd34 = new C49546gd3();
                    if (bArr2 != null && bArr2.length > 0) {
                        gd34.parseFrom(bArr2);
                    }
                    a032.f130185d = gd34;
                }
                return 0;
            } else if (intValue == 3) {
                a032.f130186e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                a032.f130187f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
