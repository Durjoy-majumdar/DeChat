package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tv2 */
public class C64739tv2 extends C101820nt3 {

    /* renamed from: d */
    public C64667qv2 f185679d;

    /* renamed from: e */
    public long f185680e;

    /* renamed from: f */
    public String f185681f;

    /* renamed from: g */
    public String f185682g;

    /* renamed from: h */
    public String f185683h;

    /* renamed from: i */
    public int f185684i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64739tv2)) {
            return false;
        }
        C64739tv2 tv22 = (C64739tv2) aVar;
        return C46238a.m51546a(this.BaseRequest, tv22.BaseRequest) && C46238a.m51546a(this.f185679d, tv22.f185679d) && C46238a.m51546a(Long.valueOf(this.f185680e), Long.valueOf(tv22.f185680e)) && C46238a.m51546a(this.f185681f, tv22.f185681f) && C46238a.m51546a(this.f185682g, tv22.f185682g) && C46238a.m51546a(this.f185683h, tv22.f185683h) && C46238a.m51546a(Integer.valueOf(this.f185684i), Integer.valueOf(tv22.f185684i));
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
            C64667qv2 qv22 = this.f185679d;
            if (qv22 != null) {
                aVar.mo74322i(2, qv22.computeSize());
                this.f185679d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f185680e);
            String str = this.f185681f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f185682g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f185683h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f185684i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C64667qv2 qv23 = this.f185679d;
            if (qv23 != null) {
                i2 += C52418a.m58682i(2, qv23.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f185680e);
            String str4 = this.f185681f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            String str5 = this.f185682g;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f185683h;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            return h + C52418a.m58678e(7, this.f185684i);
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
            C64739tv2 tv22 = objArr[1];
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
                        tv22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64667qv2 qv24 = new C64667qv2();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv24.parseFrom(bArr2);
                        }
                        tv22.f185679d = qv24;
                    }
                    return 0;
                case 3:
                    tv22.f185680e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    tv22.f185681f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tv22.f185682g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tv22.f185683h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tv22.f185684i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
