package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tw2 */
public class C51457tw2 extends C101820nt3 {

    /* renamed from: d */
    public String f142451d;

    /* renamed from: e */
    public long f142452e;

    /* renamed from: f */
    public String f142453f;

    /* renamed from: g */
    public String f142454g;

    /* renamed from: h */
    public String f142455h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51457tw2)) {
            return false;
        }
        C51457tw2 tw22 = (C51457tw2) aVar;
        return C46238a.m51546a(this.BaseRequest, tw22.BaseRequest) && C46238a.m51546a(this.f142451d, tw22.f142451d) && C46238a.m51546a(Long.valueOf(this.f142452e), Long.valueOf(tw22.f142452e)) && C46238a.m51546a(this.f142453f, tw22.f142453f) && C46238a.m51546a(this.f142454g, tw22.f142454g) && C46238a.m51546a(this.f142455h, tw22.f142455h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f142451d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f142451d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74321h(3, this.f142452e);
                String str2 = this.f142453f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f142454g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f142455h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: scan_id");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f142451d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f142452e);
            String str6 = this.f142453f;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f142454g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            String str8 = this.f142455h;
            return str8 != null ? h + C52418a.m58683j(6, str8) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142451d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: scan_id");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51457tw2 tw22 = objArr[1];
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
                        tw22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tw22.f142451d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tw22.f142452e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    tw22.f142453f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tw22.f142454g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tw22.f142455h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
