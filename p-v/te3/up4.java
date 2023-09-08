package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class up4 extends C101820nt3 {

    /* renamed from: d */
    public String f143020d;

    /* renamed from: e */
    public long f143021e;

    /* renamed from: f */
    public C51018qv3 f143022f;

    /* renamed from: g */
    public String f143023g;

    /* renamed from: h */
    public String f143024h;

    /* renamed from: i */
    public int f143025i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof up4)) {
            return false;
        }
        up4 up4 = (up4) aVar;
        return C46238a.m51546a(this.BaseRequest, up4.BaseRequest) && C46238a.m51546a(this.f143020d, up4.f143020d) && C46238a.m51546a(Long.valueOf(this.f143021e), Long.valueOf(up4.f143021e)) && C46238a.m51546a(this.f143022f, up4.f143022f) && C46238a.m51546a(this.f143023g, up4.f143023g) && C46238a.m51546a(this.f143024h, up4.f143024h) && C46238a.m51546a(Integer.valueOf(this.f143025i), Integer.valueOf(up4.f143025i));
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
            String str = this.f143020d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f143021e);
            C51018qv3 qv32 = this.f143022f;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f143022f.writeFields(aVar);
            }
            String str2 = this.f143023g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f143024h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f143025i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f143020d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int h = i2 + C52418a.m58681h(3, this.f143021e);
            C51018qv3 qv33 = this.f143022f;
            if (qv33 != null) {
                h += C52418a.m58682i(4, qv33.computeSize());
            }
            String str5 = this.f143023g;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f143024h;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            return h + C52418a.m58678e(7, this.f143025i);
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
            up4 up4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        up4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    up4.f143020d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    up4.f143021e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        up4.f143022f = qv34;
                    }
                    return 0;
                case 5:
                    up4.f143023g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    up4.f143024h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    up4.f143025i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
