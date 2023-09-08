package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c24 */
public class C48945c24 extends C101820nt3 {

    /* renamed from: d */
    public long f131470d;

    /* renamed from: e */
    public C89349b f131471e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48945c24)) {
            return false;
        }
        C48945c24 c242 = (C48945c24) aVar;
        return C46238a.m51546a(this.BaseRequest, c242.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f131470d), Long.valueOf(c242.f131470d)) && C46238a.m51546a(this.f131471e, c242.f131471e);
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
            aVar.mo74321h(2, this.f131470d);
            C89349b bVar = this.f131471e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f131470d);
            C89349b bVar2 = this.f131471e;
            return bVar2 != null ? h + C52418a.m58675b(3, bVar2) : h;
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
            C48945c24 c242 = objArr[1];
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
                    c242.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                c242.f131470d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                c242.f131471e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
