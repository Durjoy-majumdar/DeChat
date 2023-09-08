package x10;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: x10.c */
public class C53279c extends C101820nt3 {

    /* renamed from: d */
    public String f148861d;

    /* renamed from: e */
    public String f148862e;

    /* renamed from: f */
    public String f148863f;

    /* renamed from: g */
    public String f148864g;

    /* renamed from: h */
    public String f148865h;

    /* renamed from: i */
    public int f148866i;

    /* renamed from: j */
    public String f148867j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53279c)) {
            return false;
        }
        C53279c cVar = (C53279c) aVar;
        return C46238a.m51546a(this.BaseRequest, cVar.BaseRequest) && C46238a.m51546a(this.f148861d, cVar.f148861d) && C46238a.m51546a(this.f148862e, cVar.f148862e) && C46238a.m51546a(this.f148863f, cVar.f148863f) && C46238a.m51546a(this.f148864g, cVar.f148864g) && C46238a.m51546a(this.f148865h, cVar.f148865h) && C46238a.m51546a(Integer.valueOf(this.f148866i), Integer.valueOf(cVar.f148866i)) && C46238a.m51546a(this.f148867j, cVar.f148867j);
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
            String str = this.f148861d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f148862e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f148863f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f148864g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f148865h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f148866i);
            String str6 = this.f148867j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f148861d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f148862e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f148863f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f148864g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f148865h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            int e = i2 + C52418a.m58678e(7, this.f148866i);
            String str12 = this.f148867j;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
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
            C53279c cVar = objArr[1];
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
                        cVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    cVar.f148861d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cVar.f148862e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cVar.f148863f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cVar.f148864g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cVar.f148865h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cVar.f148866i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    cVar.f148867j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
