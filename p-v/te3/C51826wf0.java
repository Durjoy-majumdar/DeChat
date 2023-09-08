package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wf0 */
public class C51826wf0 extends C101820nt3 {

    /* renamed from: d */
    public String f144011d;

    /* renamed from: e */
    public String f144012e;

    /* renamed from: f */
    public int f144013f;

    /* renamed from: g */
    public long f144014g;

    /* renamed from: h */
    public C49946j51 f144015h;

    /* renamed from: i */
    public String f144016i;

    /* renamed from: j */
    public int f144017j;

    /* renamed from: n */
    public int f144018n;

    /* renamed from: o */
    public String f144019o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51826wf0)) {
            return false;
        }
        C51826wf0 wf02 = (C51826wf0) aVar;
        return C46238a.m51546a(this.BaseRequest, wf02.BaseRequest) && C46238a.m51546a(this.f144011d, wf02.f144011d) && C46238a.m51546a(this.f144012e, wf02.f144012e) && C46238a.m51546a(Integer.valueOf(this.f144013f), Integer.valueOf(wf02.f144013f)) && C46238a.m51546a(Long.valueOf(this.f144014g), Long.valueOf(wf02.f144014g)) && C46238a.m51546a(this.f144015h, wf02.f144015h) && C46238a.m51546a(this.f144016i, wf02.f144016i) && C46238a.m51546a(Integer.valueOf(this.f144017j), Integer.valueOf(wf02.f144017j)) && C46238a.m51546a(Integer.valueOf(this.f144018n), Integer.valueOf(wf02.f144018n)) && C46238a.m51546a(this.f144019o, wf02.f144019o);
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
            String str = this.f144011d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144012e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f144013f);
            aVar.mo74321h(5, this.f144014g);
            C49946j51 j512 = this.f144015h;
            if (j512 != null) {
                aVar.mo74322i(6, j512.computeSize());
                this.f144015h.writeFields(aVar);
            }
            String str3 = this.f144016i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f144017j);
            aVar.mo74318e(9, this.f144018n);
            String str4 = this.f144019o;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f144011d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f144012e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f144013f) + C52418a.m58681h(5, this.f144014g);
            C49946j51 j513 = this.f144015h;
            if (j513 != null) {
                e += C52418a.m58682i(6, j513.computeSize());
            }
            String str7 = this.f144016i;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            int e2 = e + C52418a.m58678e(8, this.f144017j) + C52418a.m58678e(9, this.f144018n);
            String str8 = this.f144019o;
            return str8 != null ? e2 + C52418a.m58683j(10, str8) : e2;
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
            C51826wf0 wf02 = objArr[1];
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
                        wf02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    wf02.f144011d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wf02.f144012e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wf02.f144013f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wf02.f144014g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49946j51 j514 = new C49946j51();
                        if (bArr2 != null && bArr2.length > 0) {
                            j514.parseFrom(bArr2);
                        }
                        wf02.f144015h = j514;
                    }
                    return 0;
                case 7:
                    wf02.f144016i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wf02.f144017j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    wf02.f144018n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    wf02.f144019o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
