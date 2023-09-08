package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sq0 */
public class C51282sq0 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f141671d;

    /* renamed from: e */
    public C49842ig0 f141672e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51282sq0)) {
            return false;
        }
        C51282sq0 sq02 = (C51282sq0) aVar;
        return C46238a.m51546a(this.BaseRequest, sq02.BaseRequest) && C46238a.m51546a(this.f141671d, sq02.f141671d) && C46238a.m51546a(this.f141672e, sq02.f141672e);
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
            C51018qv3 qv32 = this.f141671d;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f141671d.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f141672e;
            if (ig02 != null) {
                aVar.mo74322i(3, ig02.computeSize());
                this.f141672e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f141671d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            C49842ig0 ig03 = this.f141672e;
            return ig03 != null ? i2 + C52418a.m58682i(3, ig03.computeSize()) : i2;
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
            C51282sq0 sq02 = objArr[1];
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
                    sq02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    sq02.f141671d = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ig04.parseFrom(bArr3);
                    }
                    sq02.f141672e = ig04;
                }
                return 0;
            }
        }
    }
}
