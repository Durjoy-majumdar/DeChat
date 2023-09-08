package te3;

import com.tencent.xweb.util.WXWebReporter;
import if0.C46238a;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mz3 */
public class C101819mz3 extends C101820nt3 {

    /* renamed from: d */
    public C101848u5 f298885d;

    /* renamed from: e */
    public String f298886e;

    /* renamed from: f */
    public int f298887f;

    /* renamed from: g */
    public String f298888g;

    /* renamed from: h */
    public int f298889h;

    /* renamed from: i */
    public String f298890i;

    /* renamed from: j */
    public String f298891j;

    /* renamed from: n */
    public int f298892n;

    /* renamed from: o */
    public int f298893o;

    /* renamed from: p */
    public int f298894p;

    /* renamed from: q */
    public int f298895q;

    /* renamed from: r */
    public String f298896r;

    /* renamed from: b */
    public C89132b<C64596nz3> mo141225b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendappmsg";
        bVar.f127066a = this;
        bVar.f127067b = new C64596nz3();
        C47350c a = bVar.mo72403a();
        C89132b<C64596nz3> bVar2 = new C89132b<>();
        bVar2.mo123453j(a);
        return bVar2;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101819mz3)) {
            return false;
        }
        C101819mz3 mz32 = (C101819mz3) aVar;
        return C46238a.m51546a(this.BaseRequest, mz32.BaseRequest) && C46238a.m51546a(this.f298885d, mz32.f298885d) && C46238a.m51546a(this.f298886e, mz32.f298886e) && C46238a.m51546a(Integer.valueOf(this.f298887f), Integer.valueOf(mz32.f298887f)) && C46238a.m51546a(this.f298888g, mz32.f298888g) && C46238a.m51546a(Integer.valueOf(this.f298889h), Integer.valueOf(mz32.f298889h)) && C46238a.m51546a(this.f298890i, mz32.f298890i) && C46238a.m51546a(this.f298891j, mz32.f298891j) && C46238a.m51546a(Integer.valueOf(this.f298892n), Integer.valueOf(mz32.f298892n)) && C46238a.m51546a(Integer.valueOf(this.f298893o), Integer.valueOf(mz32.f298893o)) && C46238a.m51546a(Integer.valueOf(this.f298894p), Integer.valueOf(mz32.f298894p)) && C46238a.m51546a(Integer.valueOf(this.f298895q), Integer.valueOf(mz32.f298895q)) && C46238a.m51546a(this.f298896r, mz32.f298896r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f298885d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C101848u5 u5Var = this.f298885d;
                if (u5Var != null) {
                    aVar.mo74322i(2, u5Var.computeSize());
                    this.f298885d.writeFields(aVar);
                }
                String str = this.f298886e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f298887f);
                String str2 = this.f298888g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f298889h);
                String str3 = this.f298890i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f298891j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                aVar.mo74318e(9, this.f298892n);
                aVar.mo74318e(10, this.f298893o);
                aVar.mo74318e(11, this.f298894p);
                aVar.mo74318e(12, this.f298895q);
                String str5 = this.f298896r;
                if (str5 != null) {
                    aVar.mo74323j(13, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Msg");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C101848u5 u5Var2 = this.f298885d;
            if (u5Var2 != null) {
                i3 += C52418a.m58682i(2, u5Var2.computeSize());
            }
            String str6 = this.f298886e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            int e = i3 + C52418a.m58678e(4, this.f298887f);
            String str7 = this.f298888g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f298889h);
            String str8 = this.f298890i;
            if (str8 != null) {
                e2 += C52418a.m58683j(7, str8);
            }
            String str9 = this.f298891j;
            if (str9 != null) {
                e2 += C52418a.m58683j(8, str9);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f298892n) + C52418a.m58678e(10, this.f298893o) + C52418a.m58678e(11, this.f298894p) + C52418a.m58678e(12, this.f298895q);
            String str10 = this.f298896r;
            return str10 != null ? e3 + C52418a.m58683j(13, str10) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298885d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Msg");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101819mz3 mz32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        mz32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C101848u5 u5Var3 = new C101848u5();
                        if (bArr2 != null && bArr2.length > 0) {
                            u5Var3.parseFrom(bArr2);
                        }
                        mz32.f298885d = u5Var3;
                    }
                    return 0;
                case 3:
                    mz32.f298886e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mz32.f298887f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mz32.f298888g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mz32.f298889h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    mz32.f298890i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mz32.f298891j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    mz32.f298892n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    mz32.f298893o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    mz32.f298894p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    mz32.f298895q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    mz32.f298896r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
