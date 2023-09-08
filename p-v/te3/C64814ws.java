package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ws */
public class C64814ws extends C101820nt3 {

    /* renamed from: d */
    public String f186195d;

    /* renamed from: e */
    public String f186196e;

    /* renamed from: f */
    public long f186197f;

    /* renamed from: g */
    public String f186198g;

    /* renamed from: h */
    public String f186199h;

    /* renamed from: i */
    public int f186200i;

    /* renamed from: j */
    public String f186201j;

    /* renamed from: n */
    public String f186202n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64814ws)) {
            return false;
        }
        C64814ws wsVar = (C64814ws) aVar;
        return C46238a.m51546a(this.BaseRequest, wsVar.BaseRequest) && C46238a.m51546a(this.f186195d, wsVar.f186195d) && C46238a.m51546a(this.f186196e, wsVar.f186196e) && C46238a.m51546a(Long.valueOf(this.f186197f), Long.valueOf(wsVar.f186197f)) && C46238a.m51546a(this.f186198g, wsVar.f186198g) && C46238a.m51546a(this.f186199h, wsVar.f186199h) && C46238a.m51546a(Integer.valueOf(this.f186200i), Integer.valueOf(wsVar.f186200i)) && C46238a.m51546a(this.f186201j, wsVar.f186201j) && C46238a.m51546a(this.f186202n, wsVar.f186202n);
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
            String str = this.f186195d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186196e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f186197f);
            String str3 = this.f186198g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f186199h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f186200i);
            String str5 = this.f186201j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f186202n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f186195d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f186196e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int h = i2 + C52418a.m58681h(4, this.f186197f);
            String str9 = this.f186198g;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            String str10 = this.f186199h;
            if (str10 != null) {
                h += C52418a.m58683j(6, str10);
            }
            int e = h + C52418a.m58678e(7, this.f186200i);
            String str11 = this.f186201j;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f186202n;
            return str12 != null ? e + C52418a.m58683j(9, str12) : e;
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
            C64814ws wsVar = objArr[1];
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
                        wsVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    wsVar.f186195d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wsVar.f186196e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wsVar.f186197f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    wsVar.f186198g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wsVar.f186199h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    wsVar.f186200i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    wsVar.f186201j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wsVar.f186202n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
