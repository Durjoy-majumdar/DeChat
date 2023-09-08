package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zb3 */
public class C52243zb3 extends C101820nt3 {

    /* renamed from: d */
    public String f145788d;

    /* renamed from: e */
    public String f145789e;

    /* renamed from: f */
    public String f145790f;

    /* renamed from: g */
    public String f145791g;

    /* renamed from: h */
    public String f145792h;

    /* renamed from: i */
    public String f145793i;

    /* renamed from: j */
    public String f145794j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52243zb3)) {
            return false;
        }
        C52243zb3 zb32 = (C52243zb3) aVar;
        return C46238a.m51546a(this.BaseRequest, zb32.BaseRequest) && C46238a.m51546a(this.f145788d, zb32.f145788d) && C46238a.m51546a(this.f145789e, zb32.f145789e) && C46238a.m51546a(this.f145790f, zb32.f145790f) && C46238a.m51546a(this.f145791g, zb32.f145791g) && C46238a.m51546a(this.f145792h, zb32.f145792h) && C46238a.m51546a(this.f145793i, zb32.f145793i) && C46238a.m51546a(this.f145794j, zb32.f145794j);
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
            String str = this.f145788d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145789e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f145790f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f145791g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f145792h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f145793i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f145794j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str8 = this.f145788d;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f145789e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f145790f;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f145791g;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f145792h;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            String str13 = this.f145793i;
            if (str13 != null) {
                i2 += C52418a.m58683j(7, str13);
            }
            String str14 = this.f145794j;
            return str14 != null ? i2 + C52418a.m58683j(8, str14) : i2;
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
            C52243zb3 zb32 = objArr[1];
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
                        zb32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zb32.f145788d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zb32.f145789e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zb32.f145790f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zb32.f145791g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zb32.f145792h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zb32.f145793i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    zb32.f145794j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
