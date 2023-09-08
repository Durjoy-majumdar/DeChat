package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tc2 */
public class C51377tc2 extends C101820nt3 {

    /* renamed from: d */
    public int f142119d;

    /* renamed from: e */
    public String f142120e;

    /* renamed from: f */
    public int f142121f;

    /* renamed from: g */
    public int f142122g;

    /* renamed from: h */
    public String f142123h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51377tc2)) {
            return false;
        }
        C51377tc2 tc22 = (C51377tc2) aVar;
        return C46238a.m51546a(this.BaseRequest, tc22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f142119d), Integer.valueOf(tc22.f142119d)) && C46238a.m51546a(this.f142120e, tc22.f142120e) && C46238a.m51546a(Integer.valueOf(this.f142121f), Integer.valueOf(tc22.f142121f)) && C46238a.m51546a(Integer.valueOf(this.f142122g), Integer.valueOf(tc22.f142122g)) && C46238a.m51546a(this.f142123h, tc22.f142123h);
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
            aVar.mo74318e(2, this.f142119d);
            String str = this.f142120e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f142121f);
            aVar.mo74318e(5, this.f142122g);
            String str2 = this.f142123h;
            if (str2 != null) {
                aVar.mo74323j(101, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142119d);
            String str3 = this.f142120e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f142121f) + C52418a.m58678e(5, this.f142122g);
            String str4 = this.f142123h;
            return str4 != null ? e2 + C52418a.m58683j(101, str4) : e2;
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
            C51377tc2 tc22 = objArr[1];
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
                    tc22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                tc22.f142119d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                tc22.f142120e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                tc22.f142121f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                tc22.f142122g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 101) {
                return -1;
            } else {
                tc22.f142123h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
