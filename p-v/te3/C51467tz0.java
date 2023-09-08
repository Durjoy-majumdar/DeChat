package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tz0 */
public class C51467tz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f142481d;

    /* renamed from: e */
    public String f142482e;

    /* renamed from: f */
    public C89349b f142483f;

    /* renamed from: g */
    public long f142484g;

    /* renamed from: h */
    public long f142485h;

    /* renamed from: i */
    public String f142486i;

    /* renamed from: j */
    public int f142487j;

    /* renamed from: n */
    public C89349b f142488n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51467tz0)) {
            return false;
        }
        C51467tz0 tz02 = (C51467tz0) aVar;
        return C46238a.m51546a(this.BaseRequest, tz02.BaseRequest) && C46238a.m51546a(this.f142481d, tz02.f142481d) && C46238a.m51546a(this.f142482e, tz02.f142482e) && C46238a.m51546a(this.f142483f, tz02.f142483f) && C46238a.m51546a(Long.valueOf(this.f142484g), Long.valueOf(tz02.f142484g)) && C46238a.m51546a(Long.valueOf(this.f142485h), Long.valueOf(tz02.f142485h)) && C46238a.m51546a(this.f142486i, tz02.f142486i) && C46238a.m51546a(Integer.valueOf(this.f142487j), Integer.valueOf(tz02.f142487j)) && C46238a.m51546a(this.f142488n, tz02.f142488n);
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
            C49842ig0 ig02 = this.f142481d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f142481d.writeFields(aVar);
            }
            String str = this.f142482e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f142483f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74321h(5, this.f142484g);
            aVar.mo74321h(6, this.f142485h);
            String str2 = this.f142486i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f142487j);
            C89349b bVar2 = this.f142488n;
            if (bVar2 != null) {
                aVar.mo74315b(9, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f142481d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f142482e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            C89349b bVar3 = this.f142483f;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(4, bVar3);
            }
            int h = i2 + C52418a.m58681h(5, this.f142484g) + C52418a.m58681h(6, this.f142485h);
            String str4 = this.f142486i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            int e = h + C52418a.m58678e(8, this.f142487j);
            C89349b bVar4 = this.f142488n;
            return bVar4 != null ? e + C52418a.m58675b(9, bVar4) : e;
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
            C51467tz0 tz02 = objArr[1];
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
                        tz02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        tz02.f142481d = ig04;
                    }
                    return 0;
                case 3:
                    tz02.f142482e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tz02.f142483f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    tz02.f142484g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    tz02.f142485h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    tz02.f142486i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tz02.f142487j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    tz02.f142488n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
