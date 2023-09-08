package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class an4 extends C101820nt3 {

    /* renamed from: d */
    public String f182101d;

    /* renamed from: e */
    public boolean f182102e;

    /* renamed from: f */
    public boolean f182103f;

    /* renamed from: g */
    public LinkedList<String> f182104g = new LinkedList<>();

    /* renamed from: h */
    public String f182105h;

    /* renamed from: i */
    public String f182106i;

    /* renamed from: j */
    public String f182107j;

    /* renamed from: n */
    public String f182108n;

    /* renamed from: o */
    public int f182109o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof an4)) {
            return false;
        }
        an4 an4 = (an4) aVar;
        return C46238a.m51546a(this.BaseRequest, an4.BaseRequest) && C46238a.m51546a(this.f182101d, an4.f182101d) && C46238a.m51546a(Boolean.valueOf(this.f182102e), Boolean.valueOf(an4.f182102e)) && C46238a.m51546a(Boolean.valueOf(this.f182103f), Boolean.valueOf(an4.f182103f)) && C46238a.m51546a(this.f182104g, an4.f182104g) && C46238a.m51546a(this.f182105h, an4.f182105h) && C46238a.m51546a(this.f182106i, an4.f182106i) && C46238a.m51546a(this.f182107j, an4.f182107j) && C46238a.m51546a(this.f182108n, an4.f182108n) && C46238a.m51546a(Integer.valueOf(this.f182109o), Integer.valueOf(an4.f182109o));
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
            String str = this.f182101d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f182102e);
            aVar.mo74314a(4, this.f182103f);
            aVar.mo74320g(5, 1, this.f182104g);
            String str2 = this.f182105h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f182106i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f182107j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f182108n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f182109o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f182101d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int a = i2 + C52418a.m58674a(3, this.f182102e) + C52418a.m58674a(4, this.f182103f) + C52418a.m58680g(5, 1, this.f182104g);
            String str7 = this.f182105h;
            if (str7 != null) {
                a += C52418a.m58683j(6, str7);
            }
            String str8 = this.f182106i;
            if (str8 != null) {
                a += C52418a.m58683j(7, str8);
            }
            String str9 = this.f182107j;
            if (str9 != null) {
                a += C52418a.m58683j(8, str9);
            }
            String str10 = this.f182108n;
            if (str10 != null) {
                a += C52418a.m58683j(9, str10);
            }
            return a + C52418a.m58678e(10, this.f182109o);
        } else if (i == 2) {
            this.f182104g.clear();
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
            an4 an4 = objArr[1];
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
                        an4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    an4.f182101d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    an4.f182102e = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    an4.f182103f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    an4.f182104g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    an4.f182105h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    an4.f182106i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    an4.f182107j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    an4.f182108n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    an4.f182109o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
