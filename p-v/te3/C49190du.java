package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.du */
public class C49190du extends C101820nt3 {

    /* renamed from: d */
    public C48826ba f132529d;

    /* renamed from: e */
    public String f132530e;

    /* renamed from: f */
    public long f132531f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49190du)) {
            return false;
        }
        C49190du duVar = (C49190du) aVar;
        return C46238a.m51546a(this.BaseRequest, duVar.BaseRequest) && C46238a.m51546a(this.f132529d, duVar.f132529d) && C46238a.m51546a(this.f132530e, duVar.f132530e) && C46238a.m51546a(Long.valueOf(this.f132531f), Long.valueOf(duVar.f132531f));
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
            C48826ba baVar = this.f132529d;
            if (baVar != null) {
                aVar.mo74322i(2, baVar.computeSize());
                this.f132529d.writeFields(aVar);
            }
            String str = this.f132530e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f132531f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C48826ba baVar2 = this.f132529d;
            if (baVar2 != null) {
                i2 += C52418a.m58682i(2, baVar2.computeSize());
            }
            String str2 = this.f132530e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58681h(4, this.f132531f);
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
            C49190du duVar = objArr[1];
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
                    duVar.BaseRequest = iaVar3;
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
                    duVar.f132529d = baVar3;
                }
                return 0;
            } else if (intValue == 3) {
                duVar.f132530e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                duVar.f132531f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
