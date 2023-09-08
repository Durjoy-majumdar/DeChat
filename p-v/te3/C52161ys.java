package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ys */
public class C52161ys extends C101820nt3 {

    /* renamed from: d */
    public String f145483d;

    /* renamed from: e */
    public String f145484e;

    /* renamed from: f */
    public long f145485f;

    /* renamed from: g */
    public String f145486g;

    /* renamed from: h */
    public String f145487h;

    /* renamed from: i */
    public int f145488i;

    /* renamed from: j */
    public String f145489j;

    /* renamed from: n */
    public String f145490n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52161ys)) {
            return false;
        }
        C52161ys ysVar = (C52161ys) aVar;
        return C46238a.m51546a(this.BaseRequest, ysVar.BaseRequest) && C46238a.m51546a(this.f145483d, ysVar.f145483d) && C46238a.m51546a(this.f145484e, ysVar.f145484e) && C46238a.m51546a(Long.valueOf(this.f145485f), Long.valueOf(ysVar.f145485f)) && C46238a.m51546a(this.f145486g, ysVar.f145486g) && C46238a.m51546a(this.f145487h, ysVar.f145487h) && C46238a.m51546a(Integer.valueOf(this.f145488i), Integer.valueOf(ysVar.f145488i)) && C46238a.m51546a(this.f145489j, ysVar.f145489j) && C46238a.m51546a(this.f145490n, ysVar.f145490n);
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
            String str = this.f145483d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145484e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f145485f);
            String str3 = this.f145486g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f145487h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f145488i);
            String str5 = this.f145489j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f145490n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f145483d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f145484e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int h = i2 + C52418a.m58681h(4, this.f145485f);
            String str9 = this.f145486g;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            String str10 = this.f145487h;
            if (str10 != null) {
                h += C52418a.m58683j(6, str10);
            }
            int e = h + C52418a.m58678e(7, this.f145488i);
            String str11 = this.f145489j;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f145490n;
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
            C52161ys ysVar = objArr[1];
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
                        ysVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ysVar.f145483d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ysVar.f145484e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ysVar.f145485f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ysVar.f145486g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ysVar.f145487h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ysVar.f145488i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ysVar.f145489j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ysVar.f145490n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
