package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oj0 */
public class C50690oj0 extends C101820nt3 {

    /* renamed from: d */
    public long f139212d;

    /* renamed from: e */
    public String f139213e;

    /* renamed from: f */
    public String f139214f;

    /* renamed from: g */
    public C49842ig0 f139215g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50690oj0)) {
            return false;
        }
        C50690oj0 oj02 = (C50690oj0) aVar;
        return C46238a.m51546a(this.BaseRequest, oj02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f139212d), Long.valueOf(oj02.f139212d)) && C46238a.m51546a(this.f139213e, oj02.f139213e) && C46238a.m51546a(this.f139214f, oj02.f139214f) && C46238a.m51546a(this.f139215g, oj02.f139215g);
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
            aVar.mo74321h(2, this.f139212d);
            String str = this.f139213e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f139214f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C49842ig0 ig02 = this.f139215g;
            if (ig02 != null) {
                aVar.mo74322i(5, ig02.computeSize());
                this.f139215g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f139212d);
            String str3 = this.f139213e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            String str4 = this.f139214f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            C49842ig0 ig03 = this.f139215g;
            return ig03 != null ? h + C52418a.m58682i(5, ig03.computeSize()) : h;
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
            C50690oj0 oj02 = objArr[1];
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
                    oj02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                oj02.f139212d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                oj02.f139213e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                oj02.f139214f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    oj02.f139215g = ig04;
                }
                return 0;
            }
        }
    }
}
