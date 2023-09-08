package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y51 */
public class C64847y51 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f186441d;

    /* renamed from: e */
    public String f186442e;

    /* renamed from: f */
    public long f186443f;

    /* renamed from: g */
    public long f186444g;

    /* renamed from: h */
    public long f186445h;

    /* renamed from: i */
    public int f186446i;

    /* renamed from: j */
    public String f186447j;

    /* renamed from: n */
    public int f186448n;

    /* renamed from: o */
    public long f186449o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64847y51)) {
            return false;
        }
        C64847y51 y512 = (C64847y51) aVar;
        return C46238a.m51546a(this.BaseRequest, y512.BaseRequest) && C46238a.m51546a(this.f186441d, y512.f186441d) && C46238a.m51546a(this.f186442e, y512.f186442e) && C46238a.m51546a(Long.valueOf(this.f186443f), Long.valueOf(y512.f186443f)) && C46238a.m51546a(Long.valueOf(this.f186444g), Long.valueOf(y512.f186444g)) && C46238a.m51546a(Long.valueOf(this.f186445h), Long.valueOf(y512.f186445h)) && C46238a.m51546a(Integer.valueOf(this.f186446i), Integer.valueOf(y512.f186446i)) && C46238a.m51546a(this.f186447j, y512.f186447j) && C46238a.m51546a(Integer.valueOf(this.f186448n), Integer.valueOf(y512.f186448n)) && C46238a.m51546a(Long.valueOf(this.f186449o), Long.valueOf(y512.f186449o));
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
            C49842ig0 ig02 = this.f186441d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f186441d.writeFields(aVar);
            }
            String str = this.f186442e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f186443f);
            aVar.mo74321h(5, this.f186444g);
            aVar.mo74321h(6, this.f186445h);
            aVar.mo74318e(7, this.f186446i);
            String str2 = this.f186447j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74318e(9, this.f186448n);
            aVar.mo74321h(10, this.f186449o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f186441d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f186442e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int h = i2 + C52418a.m58681h(4, this.f186443f) + C52418a.m58681h(5, this.f186444g) + C52418a.m58681h(6, this.f186445h) + C52418a.m58678e(7, this.f186446i);
            String str4 = this.f186447j;
            if (str4 != null) {
                h += C52418a.m58683j(8, str4);
            }
            return h + C52418a.m58678e(9, this.f186448n) + C52418a.m58681h(10, this.f186449o);
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
            C64847y51 y512 = objArr[1];
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
                        y512.BaseRequest = iaVar3;
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
                        y512.f186441d = ig04;
                    }
                    return 0;
                case 3:
                    y512.f186442e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    y512.f186443f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    y512.f186444g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    y512.f186445h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    y512.f186446i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    y512.f186447j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    y512.f186448n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    y512.f186449o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
