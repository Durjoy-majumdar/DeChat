package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jp */
public class C77953jp extends C101820nt3 {

    /* renamed from: d */
    public String f227671d;

    /* renamed from: e */
    public String f227672e;

    /* renamed from: f */
    public int f227673f;

    /* renamed from: g */
    public String f227674g;

    /* renamed from: h */
    public String f227675h;

    /* renamed from: i */
    public int f227676i;

    /* renamed from: j */
    public int f227677j;

    /* renamed from: n */
    public String f227678n;

    /* renamed from: o */
    public String f227679o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77953jp)) {
            return false;
        }
        C77953jp jpVar = (C77953jp) aVar;
        return C46238a.m51546a(this.BaseRequest, jpVar.BaseRequest) && C46238a.m51546a(this.f227671d, jpVar.f227671d) && C46238a.m51546a(this.f227672e, jpVar.f227672e) && C46238a.m51546a(Integer.valueOf(this.f227673f), Integer.valueOf(jpVar.f227673f)) && C46238a.m51546a(this.f227674g, jpVar.f227674g) && C46238a.m51546a(this.f227675h, jpVar.f227675h) && C46238a.m51546a(Integer.valueOf(this.f227676i), Integer.valueOf(jpVar.f227676i)) && C46238a.m51546a(Integer.valueOf(this.f227677j), Integer.valueOf(jpVar.f227677j)) && C46238a.m51546a(this.f227678n, jpVar.f227678n) && C46238a.m51546a(this.f227679o, jpVar.f227679o);
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
            String str = this.f227671d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227672e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f227673f);
            String str3 = this.f227674g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f227675h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f227676i);
            aVar.mo74318e(8, this.f227677j);
            String str5 = this.f227678n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f227679o;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f227671d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f227672e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f227673f);
            String str9 = this.f227674g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f227675h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            int e2 = e + C52418a.m58678e(7, this.f227676i) + C52418a.m58678e(8, this.f227677j);
            String str11 = this.f227678n;
            if (str11 != null) {
                e2 += C52418a.m58683j(9, str11);
            }
            String str12 = this.f227679o;
            return str12 != null ? e2 + C52418a.m58683j(10, str12) : e2;
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
            C77953jp jpVar = objArr[1];
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
                        jpVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    jpVar.f227671d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jpVar.f227672e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jpVar.f227673f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jpVar.f227674g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jpVar.f227675h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jpVar.f227676i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    jpVar.f227677j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jpVar.f227678n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jpVar.f227679o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
