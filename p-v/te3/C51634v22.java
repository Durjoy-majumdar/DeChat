package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v22 */
public class C51634v22 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f143263d;

    /* renamed from: e */
    public long f143264e;

    /* renamed from: f */
    public String f143265f;

    /* renamed from: g */
    public boolean f143266g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51634v22)) {
            return false;
        }
        C51634v22 v222 = (C51634v22) aVar;
        return C46238a.m51546a(this.BaseRequest, v222.BaseRequest) && C46238a.m51546a(this.f143263d, v222.f143263d) && C46238a.m51546a(Long.valueOf(this.f143264e), Long.valueOf(v222.f143264e)) && C46238a.m51546a(this.f143265f, v222.f143265f) && C46238a.m51546a(Boolean.valueOf(this.f143266g), Boolean.valueOf(v222.f143266g));
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
            C89349b bVar = this.f143263d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74321h(3, this.f143264e);
            String str = this.f143265f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74314a(5, this.f143266g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f143263d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            int h = i2 + C52418a.m58681h(3, this.f143264e);
            String str2 = this.f143265f;
            if (str2 != null) {
                h += C52418a.m58683j(4, str2);
            }
            return h + C52418a.m58674a(5, this.f143266g);
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
            C51634v22 v222 = objArr[1];
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
                    v222.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                v222.f143263d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                v222.f143264e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                v222.f143265f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                v222.f143266g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
