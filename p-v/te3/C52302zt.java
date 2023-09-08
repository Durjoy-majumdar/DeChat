package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zt */
public class C52302zt extends C49335eu3 {

    /* renamed from: d */
    public int f146201d;

    /* renamed from: e */
    public String f146202e;

    /* renamed from: f */
    public long f146203f;

    /* renamed from: g */
    public long f146204g;

    /* renamed from: h */
    public String f146205h;

    /* renamed from: i */
    public String f146206i;

    /* renamed from: j */
    public String f146207j;

    /* renamed from: n */
    public String f146208n;

    /* renamed from: o */
    public C77933g43 f146209o;

    /* renamed from: p */
    public String f146210p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52302zt)) {
            return false;
        }
        C52302zt ztVar = (C52302zt) aVar;
        return C46238a.m51546a(this.BaseResponse, ztVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f146201d), Integer.valueOf(ztVar.f146201d)) && C46238a.m51546a(this.f146202e, ztVar.f146202e) && C46238a.m51546a(Long.valueOf(this.f146203f), Long.valueOf(ztVar.f146203f)) && C46238a.m51546a(Long.valueOf(this.f146204g), Long.valueOf(ztVar.f146204g)) && C46238a.m51546a(this.f146205h, ztVar.f146205h) && C46238a.m51546a(this.f146206i, ztVar.f146206i) && C46238a.m51546a(this.f146207j, ztVar.f146207j) && C46238a.m51546a(this.f146208n, ztVar.f146208n) && C46238a.m51546a(this.f146209o, ztVar.f146209o) && C46238a.m51546a(this.f146210p, ztVar.f146210p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f146201d);
                String str = this.f146202e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74321h(4, this.f146203f);
                aVar.mo74321h(5, this.f146204g);
                String str2 = this.f146205h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f146206i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f146207j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f146208n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                C77933g43 g432 = this.f146209o;
                if (g432 != null) {
                    aVar.mo74322i(10, g432.computeSize());
                    this.f146209o.writeFields(aVar);
                }
                String str6 = this.f146210p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f146201d);
            String str7 = this.f146202e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            int h = e + C52418a.m58681h(4, this.f146203f) + C52418a.m58681h(5, this.f146204g);
            String str8 = this.f146205h;
            if (str8 != null) {
                h += C52418a.m58683j(6, str8);
            }
            String str9 = this.f146206i;
            if (str9 != null) {
                h += C52418a.m58683j(7, str9);
            }
            String str10 = this.f146207j;
            if (str10 != null) {
                h += C52418a.m58683j(8, str10);
            }
            String str11 = this.f146208n;
            if (str11 != null) {
                h += C52418a.m58683j(9, str11);
            }
            C77933g43 g433 = this.f146209o;
            if (g433 != null) {
                h += C52418a.m58682i(10, g433.computeSize());
            }
            String str12 = this.f146210p;
            return str12 != null ? h + C52418a.m58683j(11, str12) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52302zt ztVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ztVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ztVar.f146201d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ztVar.f146202e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ztVar.f146203f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ztVar.f146204g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ztVar.f146205h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ztVar.f146206i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ztVar.f146207j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ztVar.f146208n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77933g43 g434 = new C77933g43();
                        if (bArr2 != null && bArr2.length > 0) {
                            g434.parseFrom(bArr2);
                        }
                        ztVar.f146209o = g434;
                    }
                    return 0;
                case 11:
                    ztVar.f146210p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
