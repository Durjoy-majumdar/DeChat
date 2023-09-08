package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xp1 */
public class C52003xp1 extends C101820nt3 {

    /* renamed from: d */
    public C48826ba f144796d;

    /* renamed from: e */
    public String f144797e;

    /* renamed from: f */
    public int f144798f;

    /* renamed from: g */
    public int f144799g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52003xp1)) {
            return false;
        }
        C52003xp1 xp12 = (C52003xp1) aVar;
        return C46238a.m51546a(this.BaseRequest, xp12.BaseRequest) && C46238a.m51546a(this.f144796d, xp12.f144796d) && C46238a.m51546a(this.f144797e, xp12.f144797e) && C46238a.m51546a(Integer.valueOf(this.f144798f), Integer.valueOf(xp12.f144798f)) && C46238a.m51546a(Integer.valueOf(this.f144799g), Integer.valueOf(xp12.f144799g));
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
            C48826ba baVar = this.f144796d;
            if (baVar != null) {
                aVar.mo74322i(2, baVar.computeSize());
                this.f144796d.writeFields(aVar);
            }
            String str = this.f144797e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f144798f);
            aVar.mo74318e(5, this.f144799g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C48826ba baVar2 = this.f144796d;
            if (baVar2 != null) {
                i2 += C52418a.m58682i(2, baVar2.computeSize());
            }
            String str2 = this.f144797e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58678e(4, this.f144798f) + C52418a.m58678e(5, this.f144799g);
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
            C52003xp1 xp12 = objArr[1];
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
                    xp12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48826ba baVar3 = new C48826ba();
                    if (bArr2 != null && bArr2.length > 0) {
                        baVar3.parseFrom(bArr2);
                    }
                    xp12.f144796d = baVar3;
                }
                return 0;
            } else if (intValue == 3) {
                xp12.f144797e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                xp12.f144798f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xp12.f144799g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
