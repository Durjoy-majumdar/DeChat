package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e03 */
public class C49210e03 extends C101820nt3 {

    /* renamed from: d */
    public int f132608d;

    /* renamed from: e */
    public String f132609e;

    /* renamed from: f */
    public kg4 f132610f;

    /* renamed from: g */
    public String f132611g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49210e03)) {
            return false;
        }
        C49210e03 e032 = (C49210e03) aVar;
        return C46238a.m51546a(this.BaseRequest, e032.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f132608d), Integer.valueOf(e032.f132608d)) && C46238a.m51546a(this.f132609e, e032.f132609e) && C46238a.m51546a(this.f132610f, e032.f132610f) && C46238a.m51546a(this.f132611g, e032.f132611g);
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
            aVar.mo74318e(2, this.f132608d);
            String str = this.f132609e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            kg4 kg4 = this.f132610f;
            if (kg4 != null) {
                aVar.mo74322i(4, kg4.computeSize());
                this.f132610f.writeFields(aVar);
            }
            String str2 = this.f132611g;
            if (str2 != null) {
                aVar.mo74323j(100, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132608d);
            String str3 = this.f132609e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            kg4 kg42 = this.f132610f;
            if (kg42 != null) {
                e += C52418a.m58682i(4, kg42.computeSize());
            }
            String str4 = this.f132611g;
            return str4 != null ? e + C52418a.m58683j(100, str4) : e;
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
            C49210e03 e032 = objArr[1];
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
                    e032.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                e032.f132608d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                e032.f132609e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    kg4 kg43 = new kg4();
                    if (bArr2 != null && bArr2.length > 0) {
                        kg43.parseFrom(bArr2);
                    }
                    e032.f132610f = kg43;
                }
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                e032.f132611g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
