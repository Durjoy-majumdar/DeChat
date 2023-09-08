package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hc0 */
public class C49685hc0 extends C101820nt3 {

    /* renamed from: d */
    public long f134561d;

    /* renamed from: e */
    public String f134562e;

    /* renamed from: f */
    public String f134563f;

    /* renamed from: g */
    public String f134564g;

    /* renamed from: h */
    public int f134565h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49685hc0)) {
            return false;
        }
        C49685hc0 hc02 = (C49685hc0) aVar;
        return C46238a.m51546a(this.BaseRequest, hc02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f134561d), Long.valueOf(hc02.f134561d)) && C46238a.m51546a(this.f134562e, hc02.f134562e) && C46238a.m51546a(this.f134563f, hc02.f134563f) && C46238a.m51546a(this.f134564g, hc02.f134564g) && C46238a.m51546a(Integer.valueOf(this.f134565h), Integer.valueOf(hc02.f134565h));
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
            aVar.mo74321h(2, this.f134561d);
            String str = this.f134562e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f134563f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f134564g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f134565h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f134561d);
            String str4 = this.f134562e;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            String str5 = this.f134563f;
            if (str5 != null) {
                h += C52418a.m58683j(4, str5);
            }
            String str6 = this.f134564g;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            return h + C52418a.m58678e(6, this.f134565h);
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
            C49685hc0 hc02 = objArr[1];
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
                        hc02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    hc02.f134561d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    hc02.f134562e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hc02.f134563f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hc02.f134564g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hc02.f134565h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
