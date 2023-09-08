package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v45 extends C101820nt3 {

    /* renamed from: d */
    public String f259867d;

    /* renamed from: e */
    public LinkedList<String> f259868e = new LinkedList<>();

    /* renamed from: f */
    public boolean f259869f;

    /* renamed from: g */
    public String f259870g;

    /* renamed from: h */
    public boolean f259871h;

    /* renamed from: i */
    public String f259872i;

    /* renamed from: j */
    public boolean f259873j;

    /* renamed from: n */
    public int f259874n;

    /* renamed from: o */
    public l55 f259875o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v45)) {
            return false;
        }
        v45 v45 = (v45) aVar;
        return C46238a.m51546a(this.BaseRequest, v45.BaseRequest) && C46238a.m51546a(this.f259867d, v45.f259867d) && C46238a.m51546a(this.f259868e, v45.f259868e) && C46238a.m51546a(Boolean.valueOf(this.f259869f), Boolean.valueOf(v45.f259869f)) && C46238a.m51546a(this.f259870g, v45.f259870g) && C46238a.m51546a(Boolean.valueOf(this.f259871h), Boolean.valueOf(v45.f259871h)) && C46238a.m51546a(this.f259872i, v45.f259872i) && C46238a.m51546a(Boolean.valueOf(this.f259873j), Boolean.valueOf(v45.f259873j)) && C46238a.m51546a(Integer.valueOf(this.f259874n), Integer.valueOf(v45.f259874n)) && C46238a.m51546a(this.f259875o, v45.f259875o);
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
            String str = this.f259867d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f259868e);
            aVar.mo74314a(4, this.f259869f);
            String str2 = this.f259870g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74314a(6, this.f259871h);
            String str3 = this.f259872i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74314a(8, this.f259873j);
            aVar.mo74318e(9, this.f259874n);
            l55 l55 = this.f259875o;
            if (l55 != null) {
                aVar.mo74322i(10, l55.computeSize());
                this.f259875o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f259867d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f259868e) + C52418a.m58674a(4, this.f259869f);
            String str5 = this.f259870g;
            if (str5 != null) {
                g += C52418a.m58683j(5, str5);
            }
            int a = g + C52418a.m58674a(6, this.f259871h);
            String str6 = this.f259872i;
            if (str6 != null) {
                a += C52418a.m58683j(7, str6);
            }
            int a2 = a + C52418a.m58674a(8, this.f259873j) + C52418a.m58678e(9, this.f259874n);
            l55 l552 = this.f259875o;
            return l552 != null ? a2 + C52418a.m58682i(10, l552.computeSize()) : a2;
        } else if (i == 2) {
            this.f259868e.clear();
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
            v45 v45 = objArr[1];
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
                        v45.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    v45.f259867d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    v45.f259868e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    v45.f259869f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    v45.f259870g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v45.f259871h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    v45.f259872i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    v45.f259873j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    v45.f259874n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        l55 l553 = new l55();
                        if (bArr2 != null && bArr2.length > 0) {
                            l553.parseFrom(bArr2);
                        }
                        v45.f259875o = l553;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
