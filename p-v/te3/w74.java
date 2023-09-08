package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w74 extends C101820nt3 {

    /* renamed from: d */
    public int f143912d;

    /* renamed from: e */
    public LinkedList<s74> f143913e = new LinkedList<>();

    /* renamed from: f */
    public C51018qv3 f143914f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w74)) {
            return false;
        }
        w74 w74 = (w74) aVar;
        return C46238a.m51546a(this.BaseRequest, w74.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f143912d), Integer.valueOf(w74.f143912d)) && C46238a.m51546a(this.f143913e, w74.f143913e) && C46238a.m51546a(this.f143914f, w74.f143914f);
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
            aVar.mo74318e(2, this.f143912d);
            aVar.mo74320g(3, 8, this.f143913e);
            C51018qv3 qv32 = this.f143914f;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f143914f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143912d) + C52418a.m58680g(3, 8, this.f143913e);
            C51018qv3 qv33 = this.f143914f;
            return qv33 != null ? e + C52418a.m58682i(4, qv33.computeSize()) : e;
        } else if (i == 2) {
            this.f143913e.clear();
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
            w74 w74 = objArr[1];
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
                    w74.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                w74.f143912d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    s74 s74 = new s74();
                    if (bArr2 != null && bArr2.length > 0) {
                        s74.parseFrom(bArr2);
                    }
                    w74.f143913e.add(s74);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv34.mo73348f(bArr3);
                    }
                    w74.f143914f = qv34;
                }
                return 0;
            }
        }
    }
}
