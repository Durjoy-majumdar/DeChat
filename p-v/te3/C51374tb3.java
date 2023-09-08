package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tb3 */
public class C51374tb3 extends C101820nt3 {

    /* renamed from: d */
    public int f142103d;

    /* renamed from: e */
    public String f142104e;

    /* renamed from: f */
    public int f142105f;

    /* renamed from: g */
    public String f142106g;

    /* renamed from: h */
    public C77963l1 f142107h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51374tb3)) {
            return false;
        }
        C51374tb3 tb32 = (C51374tb3) aVar;
        return C46238a.m51546a(this.BaseRequest, tb32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f142103d), Integer.valueOf(tb32.f142103d)) && C46238a.m51546a(this.f142104e, tb32.f142104e) && C46238a.m51546a(Integer.valueOf(this.f142105f), Integer.valueOf(tb32.f142105f)) && C46238a.m51546a(this.f142106g, tb32.f142106g) && C46238a.m51546a(this.f142107h, tb32.f142107h);
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
            aVar.mo74318e(2, this.f142103d);
            String str = this.f142104e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f142105f);
            String str2 = this.f142106g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            C77963l1 l1Var = this.f142107h;
            if (l1Var != null) {
                aVar.mo74322i(6, l1Var.computeSize());
                this.f142107h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142103d);
            String str3 = this.f142104e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f142105f);
            String str4 = this.f142106g;
            if (str4 != null) {
                e2 += C52418a.m58683j(5, str4);
            }
            C77963l1 l1Var2 = this.f142107h;
            return l1Var2 != null ? e2 + C52418a.m58682i(6, l1Var2.computeSize()) : e2;
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
            C51374tb3 tb32 = objArr[1];
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
                        tb32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tb32.f142103d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tb32.f142104e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tb32.f142105f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    tb32.f142106g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr2 != null && bArr2.length > 0) {
                            l1Var3.parseFrom(bArr2);
                        }
                        tb32.f142107h = l1Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
