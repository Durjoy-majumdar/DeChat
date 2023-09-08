package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.a */
public class C52421a extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<String> f146502d = new LinkedList<>();

    /* renamed from: e */
    public boolean f146503e;

    /* renamed from: f */
    public boolean f146504f;

    /* renamed from: g */
    public boolean f146505g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52421a)) {
            return false;
        }
        C52421a aVar2 = (C52421a) aVar;
        return C46238a.m51546a(this.BaseRequest, aVar2.BaseRequest) && C46238a.m51546a(this.f146502d, aVar2.f146502d) && C46238a.m51546a(Boolean.valueOf(this.f146503e), Boolean.valueOf(aVar2.f146503e)) && C46238a.m51546a(Boolean.valueOf(this.f146504f), Boolean.valueOf(aVar2.f146504f)) && C46238a.m51546a(Boolean.valueOf(this.f146505g), Boolean.valueOf(aVar2.f146505g));
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
            aVar.mo74320g(2, 1, this.f146502d);
            aVar.mo74314a(3, this.f146503e);
            aVar.mo74314a(4, this.f146504f);
            aVar.mo74314a(5, this.f146505g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.f146502d) + C52418a.m58674a(3, this.f146503e) + C52418a.m58674a(4, this.f146504f) + C52418a.m58674a(5, this.f146505g);
        } else if (i == 2) {
            this.f146502d.clear();
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
            C52421a aVar4 = objArr[1];
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
                    aVar4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                aVar4.f146502d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                aVar4.f146503e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 4) {
                aVar4.f146504f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                aVar4.f146505g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
