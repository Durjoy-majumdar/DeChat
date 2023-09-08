package tw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: tw1.a */
public class C52367a extends C101820nt3 {

    /* renamed from: d */
    public int f146350d;

    /* renamed from: e */
    public String f146351e;

    /* renamed from: f */
    public String f146352f;

    /* renamed from: g */
    public long f146353g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52367a)) {
            return false;
        }
        C52367a aVar2 = (C52367a) aVar;
        return C46238a.m51546a(this.BaseRequest, aVar2.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f146350d), Integer.valueOf(aVar2.f146350d)) && C46238a.m51546a(this.f146351e, aVar2.f146351e) && C46238a.m51546a(this.f146352f, aVar2.f146352f) && C46238a.m51546a(Long.valueOf(this.f146353g), Long.valueOf(aVar2.f146353g));
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
            aVar.mo74318e(2, this.f146350d);
            String str = this.f146351e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f146352f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f146353g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f146350d);
            String str3 = this.f146351e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f146352f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58681h(5, this.f146353g);
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
            C52367a aVar4 = objArr[1];
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
                aVar4.f146350d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                aVar4.f146351e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                aVar4.f146352f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                aVar4.f146353g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
