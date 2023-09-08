package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qy1 */
public class C51029qy1 extends C101820nt3 {

    /* renamed from: d */
    public String f140613d;

    /* renamed from: e */
    public long f140614e;

    /* renamed from: f */
    public C118476wb3 f140615f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51029qy1)) {
            return false;
        }
        C51029qy1 qy12 = (C51029qy1) aVar;
        return C46238a.m51546a(this.BaseRequest, qy12.BaseRequest) && C46238a.m51546a(this.f140613d, qy12.f140613d) && C46238a.m51546a(Long.valueOf(this.f140614e), Long.valueOf(qy12.f140614e)) && C46238a.m51546a(this.f140615f, qy12.f140615f);
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
            String str = this.f140613d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f140614e);
            C118476wb3 wb32 = this.f140615f;
            if (wb32 != null) {
                aVar.mo74322i(4, wb32.computeSize());
                this.f140615f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f140613d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int h = i2 + C52418a.m58681h(3, this.f140614e);
            C118476wb3 wb33 = this.f140615f;
            return wb33 != null ? h + C52418a.m58682i(4, wb33.computeSize()) : h;
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
            C51029qy1 qy12 = objArr[1];
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
                    qy12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                qy12.f140613d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                qy12.f140614e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C118476wb3 wb34 = new C118476wb3();
                    if (bArr2 != null && bArr2.length > 0) {
                        wb34.parseFrom(bArr2);
                    }
                    qy12.f140615f = wb34;
                }
                return 0;
            }
        }
    }
}
