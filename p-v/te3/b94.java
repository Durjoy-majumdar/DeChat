package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b94 extends C101820nt3 {

    /* renamed from: d */
    public String f297947d;

    /* renamed from: e */
    public String f297948e;

    /* renamed from: f */
    public long f297949f;

    /* renamed from: g */
    public int f297950g;

    /* renamed from: h */
    public long f297951h;

    /* renamed from: i */
    public int f297952i;

    /* renamed from: j */
    public int f297953j;

    /* renamed from: n */
    public int f297954n;

    /* renamed from: o */
    public int f297955o;

    /* renamed from: p */
    public int f297956p;

    /* renamed from: q */
    public int f297957q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b94)) {
            return false;
        }
        b94 b94 = (b94) aVar;
        return C46238a.m51546a(this.BaseRequest, b94.BaseRequest) && C46238a.m51546a(this.f297947d, b94.f297947d) && C46238a.m51546a(this.f297948e, b94.f297948e) && C46238a.m51546a(Long.valueOf(this.f297949f), Long.valueOf(b94.f297949f)) && C46238a.m51546a(Integer.valueOf(this.f297950g), Integer.valueOf(b94.f297950g)) && C46238a.m51546a(Long.valueOf(this.f297951h), Long.valueOf(b94.f297951h)) && C46238a.m51546a(Integer.valueOf(this.f297952i), Integer.valueOf(b94.f297952i)) && C46238a.m51546a(Integer.valueOf(this.f297953j), Integer.valueOf(b94.f297953j)) && C46238a.m51546a(Integer.valueOf(this.f297954n), Integer.valueOf(b94.f297954n)) && C46238a.m51546a(Integer.valueOf(this.f297955o), Integer.valueOf(b94.f297955o)) && C46238a.m51546a(Integer.valueOf(this.f297956p), Integer.valueOf(b94.f297956p)) && C46238a.m51546a(Integer.valueOf(this.f297957q), Integer.valueOf(b94.f297957q));
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
            String str = this.f297947d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f297948e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f297949f);
            aVar.mo74318e(5, this.f297950g);
            aVar.mo74321h(6, this.f297951h);
            aVar.mo74318e(7, this.f297952i);
            aVar.mo74318e(8, this.f297953j);
            aVar.mo74318e(9, this.f297954n);
            aVar.mo74318e(10, this.f297955o);
            aVar.mo74318e(11, this.f297956p);
            aVar.mo74318e(12, this.f297957q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f297947d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f297948e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58681h(4, this.f297949f) + C52418a.m58678e(5, this.f297950g) + C52418a.m58681h(6, this.f297951h) + C52418a.m58678e(7, this.f297952i) + C52418a.m58678e(8, this.f297953j) + C52418a.m58678e(9, this.f297954n) + C52418a.m58678e(10, this.f297955o) + C52418a.m58678e(11, this.f297956p) + C52418a.m58678e(12, this.f297957q);
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
            b94 b94 = objArr[1];
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
                        b94.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    b94.f297947d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    b94.f297948e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b94.f297949f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    b94.f297950g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    b94.f297951h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    b94.f297952i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    b94.f297953j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    b94.f297954n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    b94.f297955o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    b94.f297956p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    b94.f297957q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
