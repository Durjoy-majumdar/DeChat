package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yv3 */
public class C52176yv3 extends C101820nt3 {

    /* renamed from: d */
    public String f145538d;

    /* renamed from: e */
    public String f145539e;

    /* renamed from: f */
    public int f145540f;

    /* renamed from: g */
    public int f145541g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52176yv3)) {
            return false;
        }
        C52176yv3 yv32 = (C52176yv3) aVar;
        return C46238a.m51546a(this.BaseRequest, yv32.BaseRequest) && C46238a.m51546a(this.f145538d, yv32.f145538d) && C46238a.m51546a(this.f145539e, yv32.f145539e) && C46238a.m51546a(Integer.valueOf(this.f145540f), Integer.valueOf(yv32.f145540f)) && C46238a.m51546a(Integer.valueOf(this.f145541g), Integer.valueOf(yv32.f145541g));
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
            String str = this.f145538d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145539e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f145540f);
            aVar.mo74318e(5, this.f145541g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f145538d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f145539e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f145540f) + C52418a.m58678e(5, this.f145541g);
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
            C52176yv3 yv32 = objArr[1];
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
                    yv32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                yv32.f145538d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                yv32.f145539e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                yv32.f145540f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                yv32.f145541g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
