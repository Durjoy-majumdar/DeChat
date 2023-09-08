package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l34 */
public class C50212l34 extends C101820nt3 {

    /* renamed from: d */
    public float f137154d;

    /* renamed from: e */
    public float f137155e;

    /* renamed from: f */
    public int f137156f;

    /* renamed from: g */
    public String f137157g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50212l34)) {
            return false;
        }
        C50212l34 l342 = (C50212l34) aVar;
        return C46238a.m51546a(this.BaseRequest, l342.BaseRequest) && C46238a.m51546a(Float.valueOf(this.f137154d), Float.valueOf(l342.f137154d)) && C46238a.m51546a(Float.valueOf(this.f137155e), Float.valueOf(l342.f137155e)) && C46238a.m51546a(Integer.valueOf(this.f137156f), Integer.valueOf(l342.f137156f)) && C46238a.m51546a(this.f137157g, l342.f137157g);
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
            aVar.mo74317d(2, this.f137154d);
            aVar.mo74317d(3, this.f137155e);
            aVar.mo74318e(4, this.f137156f);
            String str = this.f137157g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int d = i2 + C52418a.m58677d(2, this.f137154d) + C52418a.m58677d(3, this.f137155e) + C52418a.m58678e(4, this.f137156f);
            String str2 = this.f137157g;
            return str2 != null ? d + C52418a.m58683j(5, str2) : d;
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
            C50212l34 l342 = objArr[1];
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
                    l342.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                l342.f137154d = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 3) {
                l342.f137155e = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 4) {
                l342.f137156f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                l342.f137157g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
