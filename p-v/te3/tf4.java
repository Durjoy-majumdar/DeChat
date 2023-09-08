package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class tf4 extends C101820nt3 {

    /* renamed from: d */
    public int f185551d;

    /* renamed from: e */
    public int f185552e;

    /* renamed from: f */
    public C51018qv3 f185553f;

    /* renamed from: g */
    public C51018qv3 f185554g;

    /* renamed from: h */
    public String f185555h;

    /* renamed from: i */
    public String f185556i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tf4)) {
            return false;
        }
        tf4 tf4 = (tf4) aVar;
        return C46238a.m51546a(this.BaseRequest, tf4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f185551d), Integer.valueOf(tf4.f185551d)) && C46238a.m51546a(Integer.valueOf(this.f185552e), Integer.valueOf(tf4.f185552e)) && C46238a.m51546a(this.f185553f, tf4.f185553f) && C46238a.m51546a(this.f185554g, tf4.f185554g) && C46238a.m51546a(this.f185555h, tf4.f185555h) && C46238a.m51546a(this.f185556i, tf4.f185556i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f185553f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f185551d);
                aVar.mo74318e(3, this.f185552e);
                C51018qv3 qv32 = this.f185553f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f185553f.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f185554g;
                if (qv33 != null) {
                    aVar.mo74322i(5, qv33.computeSize());
                    this.f185554g.writeFields(aVar);
                }
                String str = this.f185555h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                String str2 = this.f185556i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqText");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185551d) + C52418a.m58678e(3, this.f185552e);
            C51018qv3 qv34 = this.f185553f;
            if (qv34 != null) {
                e += C52418a.m58682i(4, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f185554g;
            if (qv35 != null) {
                e += C52418a.m58682i(5, qv35.computeSize());
            }
            String str3 = this.f185555h;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f185556i;
            return str4 != null ? e + C52418a.m58683j(7, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185553f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqText");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            tf4 tf4 = objArr[1];
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
                        tf4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tf4.f185551d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tf4.f185552e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        tf4.f185553f = qv36;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        tf4.f185554g = qv37;
                    }
                    return 0;
                case 6:
                    tf4.f185555h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tf4.f185556i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
