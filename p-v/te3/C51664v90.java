package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v90 */
public class C51664v90 extends C101820nt3 {

    /* renamed from: d */
    public int f143391d;

    /* renamed from: e */
    public long f143392e;

    /* renamed from: f */
    public String f143393f;

    /* renamed from: g */
    public int f143394g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51664v90)) {
            return false;
        }
        C51664v90 v902 = (C51664v90) aVar;
        return C46238a.m51546a(this.BaseRequest, v902.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f143391d), Integer.valueOf(v902.f143391d)) && C46238a.m51546a(Long.valueOf(this.f143392e), Long.valueOf(v902.f143392e)) && C46238a.m51546a(this.f143393f, v902.f143393f) && C46238a.m51546a(Integer.valueOf(this.f143394g), Integer.valueOf(v902.f143394g));
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
            aVar.mo74318e(2, this.f143391d);
            aVar.mo74321h(3, this.f143392e);
            String str = this.f143393f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f143394g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143391d) + C52418a.m58681h(3, this.f143392e);
            String str2 = this.f143393f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f143394g);
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
            C51664v90 v902 = objArr[1];
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
                    v902.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                v902.f143391d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                v902.f143392e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                v902.f143393f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                v902.f143394g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
