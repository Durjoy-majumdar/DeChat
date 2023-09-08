package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b11 */
public class C48792b11 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f130884d;

    /* renamed from: e */
    public String f130885e;

    /* renamed from: f */
    public long f130886f;

    /* renamed from: g */
    public long f130887g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48792b11)) {
            return false;
        }
        C48792b11 b112 = (C48792b11) aVar;
        return C46238a.m51546a(this.BaseRequest, b112.BaseRequest) && C46238a.m51546a(this.f130884d, b112.f130884d) && C46238a.m51546a(this.f130885e, b112.f130885e) && C46238a.m51546a(Long.valueOf(this.f130886f), Long.valueOf(b112.f130886f)) && C46238a.m51546a(Long.valueOf(this.f130887g), Long.valueOf(b112.f130887g));
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
            C49842ig0 ig02 = this.f130884d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f130884d.writeFields(aVar);
            }
            String str = this.f130885e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f130886f);
            aVar.mo74321h(5, this.f130887g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f130884d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f130885e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58681h(4, this.f130886f) + C52418a.m58681h(5, this.f130887g);
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
            C48792b11 b112 = objArr[1];
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
                    b112.BaseRequest = iaVar3;
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
                    b112.f130884d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                b112.f130885e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                b112.f130886f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                b112.f130887g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
