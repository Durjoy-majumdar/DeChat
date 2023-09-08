package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r */
public class C51036r extends C101820nt3 {

    /* renamed from: d */
    public String f140632d;

    /* renamed from: e */
    public long f140633e;

    /* renamed from: f */
    public int f140634f;

    /* renamed from: g */
    public String f140635g;

    /* renamed from: h */
    public String f140636h;

    /* renamed from: i */
    public String f140637i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51036r)) {
            return false;
        }
        C51036r rVar = (C51036r) aVar;
        return C46238a.m51546a(this.BaseRequest, rVar.BaseRequest) && C46238a.m51546a(this.f140632d, rVar.f140632d) && C46238a.m51546a(Long.valueOf(this.f140633e), Long.valueOf(rVar.f140633e)) && C46238a.m51546a(Integer.valueOf(this.f140634f), Integer.valueOf(rVar.f140634f)) && C46238a.m51546a(this.f140635g, rVar.f140635g) && C46238a.m51546a(this.f140636h, rVar.f140636h) && C46238a.m51546a(this.f140637i, rVar.f140637i);
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
            String str = this.f140632d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f140633e);
            aVar.mo74318e(4, this.f140634f);
            String str2 = this.f140635g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f140636h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f140637i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f140632d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f140633e) + C52418a.m58678e(4, this.f140634f);
            String str6 = this.f140635g;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            String str7 = this.f140636h;
            if (str7 != null) {
                h += C52418a.m58683j(6, str7);
            }
            String str8 = this.f140637i;
            return str8 != null ? h + C52418a.m58683j(7, str8) : h;
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
            C51036r rVar = objArr[1];
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
                        rVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rVar.f140632d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rVar.f140633e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    rVar.f140634f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rVar.f140635g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rVar.f140636h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rVar.f140637i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
