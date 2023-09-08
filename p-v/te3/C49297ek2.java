package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ek2 */
public class C49297ek2 extends C101820nt3 {

    /* renamed from: d */
    public String f132983d;

    /* renamed from: e */
    public LinkedList<String> f132984e = new LinkedList<>();

    /* renamed from: f */
    public int f132985f;

    /* renamed from: g */
    public w55 f132986g;

    /* renamed from: h */
    public String f132987h;

    /* renamed from: i */
    public t65 f132988i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49297ek2)) {
            return false;
        }
        C49297ek2 ek22 = (C49297ek2) aVar;
        return C46238a.m51546a(this.BaseRequest, ek22.BaseRequest) && C46238a.m51546a(this.f132983d, ek22.f132983d) && C46238a.m51546a(this.f132984e, ek22.f132984e) && C46238a.m51546a(Integer.valueOf(this.f132985f), Integer.valueOf(ek22.f132985f)) && C46238a.m51546a(this.f132986g, ek22.f132986g) && C46238a.m51546a(this.f132987h, ek22.f132987h) && C46238a.m51546a(this.f132988i, ek22.f132988i);
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
            String str = this.f132983d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f132984e);
            aVar.mo74318e(4, this.f132985f);
            w55 w55 = this.f132986g;
            if (w55 != null) {
                aVar.mo74322i(5, w55.computeSize());
                this.f132986g.writeFields(aVar);
            }
            String str2 = this.f132987h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            t65 t65 = this.f132988i;
            if (t65 != null) {
                aVar.mo74322i(7, t65.computeSize());
                this.f132988i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f132983d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f132984e) + C52418a.m58678e(4, this.f132985f);
            w55 w552 = this.f132986g;
            if (w552 != null) {
                g += C52418a.m58682i(5, w552.computeSize());
            }
            String str4 = this.f132987h;
            if (str4 != null) {
                g += C52418a.m58683j(6, str4);
            }
            t65 t652 = this.f132988i;
            return t652 != null ? g + C52418a.m58682i(7, t652.computeSize()) : g;
        } else if (i == 2) {
            this.f132984e.clear();
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
            C49297ek2 ek22 = objArr[1];
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
                        ek22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ek22.f132983d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ek22.f132984e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    ek22.f132985f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        w55 w553 = new w55();
                        if (bArr2 != null && bArr2.length > 0) {
                            w553.parseFrom(bArr2);
                        }
                        ek22.f132986g = w553;
                    }
                    return 0;
                case 6:
                    ek22.f132987h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        t65 t653 = new t65();
                        if (bArr3 != null && bArr3.length > 0) {
                            t653.parseFrom(bArr3);
                        }
                        ek22.f132988i = t653;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
