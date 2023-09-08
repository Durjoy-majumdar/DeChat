package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ax1 */
public class C48776ax1 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C51854wn> f130821d = new LinkedList<>();

    /* renamed from: e */
    public int f130822e;

    /* renamed from: f */
    public String f130823f;

    /* renamed from: g */
    public String f130824g;

    /* renamed from: h */
    public String f130825h;

    /* renamed from: i */
    public String f130826i;

    /* renamed from: j */
    public String f130827j;

    /* renamed from: n */
    public String f130828n;

    /* renamed from: o */
    public int f130829o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48776ax1)) {
            return false;
        }
        C48776ax1 ax12 = (C48776ax1) aVar;
        return C46238a.m51546a(this.BaseRequest, ax12.BaseRequest) && C46238a.m51546a(this.f130821d, ax12.f130821d) && C46238a.m51546a(Integer.valueOf(this.f130822e), Integer.valueOf(ax12.f130822e)) && C46238a.m51546a(this.f130823f, ax12.f130823f) && C46238a.m51546a(this.f130824g, ax12.f130824g) && C46238a.m51546a(this.f130825h, ax12.f130825h) && C46238a.m51546a(this.f130826i, ax12.f130826i) && C46238a.m51546a(this.f130827j, ax12.f130827j) && C46238a.m51546a(this.f130828n, ax12.f130828n) && C46238a.m51546a(Integer.valueOf(this.f130829o), Integer.valueOf(ax12.f130829o));
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
            aVar.mo74320g(2, 8, this.f130821d);
            aVar.mo74318e(3, this.f130822e);
            String str = this.f130823f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f130824g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f130825h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f130826i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f130827j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f130828n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74318e(10, this.f130829o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f130821d) + C52418a.m58678e(3, this.f130822e);
            String str7 = this.f130823f;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f130824g;
            if (str8 != null) {
                g += C52418a.m58683j(5, str8);
            }
            String str9 = this.f130825h;
            if (str9 != null) {
                g += C52418a.m58683j(6, str9);
            }
            String str10 = this.f130826i;
            if (str10 != null) {
                g += C52418a.m58683j(7, str10);
            }
            String str11 = this.f130827j;
            if (str11 != null) {
                g += C52418a.m58683j(8, str11);
            }
            String str12 = this.f130828n;
            if (str12 != null) {
                g += C52418a.m58683j(9, str12);
            }
            return g + C52418a.m58678e(10, this.f130829o);
        } else if (i == 2) {
            this.f130821d.clear();
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
            C48776ax1 ax12 = objArr[1];
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
                        ax12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51854wn wnVar = new C51854wn();
                        if (bArr2 != null && bArr2.length > 0) {
                            wnVar.parseFrom(bArr2);
                        }
                        ax12.f130821d.add(wnVar);
                    }
                    return 0;
                case 3:
                    ax12.f130822e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ax12.f130823f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ax12.f130824g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ax12.f130825h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ax12.f130826i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ax12.f130827j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ax12.f130828n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ax12.f130829o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
