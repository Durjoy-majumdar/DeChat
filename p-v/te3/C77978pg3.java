package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pg3 */
public class C77978pg3 extends C101820nt3 {

    /* renamed from: d */
    public int f228019d;

    /* renamed from: e */
    public int f228020e;

    /* renamed from: f */
    public C77969n9 f228021f;

    /* renamed from: g */
    public int f228022g;

    /* renamed from: h */
    public int f228023h;

    /* renamed from: i */
    public String f228024i;

    /* renamed from: j */
    public String f228025j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77978pg3)) {
            return false;
        }
        C77978pg3 pg32 = (C77978pg3) aVar;
        return C46238a.m51546a(this.BaseRequest, pg32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f228019d), Integer.valueOf(pg32.f228019d)) && C46238a.m51546a(Integer.valueOf(this.f228020e), Integer.valueOf(pg32.f228020e)) && C46238a.m51546a(this.f228021f, pg32.f228021f) && C46238a.m51546a(Integer.valueOf(this.f228022g), Integer.valueOf(pg32.f228022g)) && C46238a.m51546a(Integer.valueOf(this.f228023h), Integer.valueOf(pg32.f228023h)) && C46238a.m51546a(this.f228024i, pg32.f228024i) && C46238a.m51546a(this.f228025j, pg32.f228025j);
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
            aVar.mo74318e(2, this.f228019d);
            aVar.mo74318e(3, this.f228020e);
            C77969n9 n9Var = this.f228021f;
            if (n9Var != null) {
                aVar.mo74322i(4, n9Var.computeSize());
                this.f228021f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f228022g);
            aVar.mo74318e(6, this.f228023h);
            String str = this.f228024i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f228025j;
            if (str2 != null) {
                aVar.mo74323j(100, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f228019d) + C52418a.m58678e(3, this.f228020e);
            C77969n9 n9Var2 = this.f228021f;
            if (n9Var2 != null) {
                e += C52418a.m58682i(4, n9Var2.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f228022g) + C52418a.m58678e(6, this.f228023h);
            String str3 = this.f228024i;
            if (str3 != null) {
                e2 += C52418a.m58683j(7, str3);
            }
            String str4 = this.f228025j;
            return str4 != null ? e2 + C52418a.m58683j(100, str4) : e2;
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
            C77978pg3 pg32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            pg32.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        pg32.f228019d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        pg32.f228020e = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C77969n9 n9Var3 = new C77969n9();
                            if (bArr2 != null && bArr2.length > 0) {
                                n9Var3.parseFrom(bArr2);
                            }
                            pg32.f228021f = n9Var3;
                        }
                        return 0;
                    case 5:
                        pg32.f228022g = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        pg32.f228023h = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        pg32.f228024i = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                pg32.f228025j = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
