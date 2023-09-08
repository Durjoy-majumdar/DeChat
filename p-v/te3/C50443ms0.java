package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ms0 */
public class C50443ms0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138173d;

    /* renamed from: e */
    public String f138174e;

    /* renamed from: f */
    public long f138175f;

    /* renamed from: g */
    public long f138176g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50443ms0)) {
            return false;
        }
        C50443ms0 ms02 = (C50443ms0) aVar;
        return C46238a.m51546a(this.BaseRequest, ms02.BaseRequest) && C46238a.m51546a(this.f138173d, ms02.f138173d) && C46238a.m51546a(this.f138174e, ms02.f138174e) && C46238a.m51546a(Long.valueOf(this.f138175f), Long.valueOf(ms02.f138175f)) && C46238a.m51546a(Long.valueOf(this.f138176g), Long.valueOf(ms02.f138176g));
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
            C49842ig0 ig02 = this.f138173d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138173d.writeFields(aVar);
            }
            String str = this.f138174e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f138175f);
            aVar.mo74321h(5, this.f138176g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138173d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f138174e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58681h(4, this.f138175f) + C52418a.m58681h(5, this.f138176g);
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
            C50443ms0 ms02 = objArr[1];
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
                    ms02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    ms02.f138173d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                ms02.f138174e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ms02.f138175f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ms02.f138176g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
