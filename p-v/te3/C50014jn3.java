package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jn3 */
public class C50014jn3 extends C49335eu3 {

    /* renamed from: d */
    public int f136211d;

    /* renamed from: e */
    public String f136212e;

    /* renamed from: f */
    public C77941hj f136213f;

    /* renamed from: g */
    public C50492n4 f136214g;

    /* renamed from: h */
    public String f136215h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50014jn3)) {
            return false;
        }
        C50014jn3 jn32 = (C50014jn3) aVar;
        return C46238a.m51546a(this.BaseResponse, jn32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136211d), Integer.valueOf(jn32.f136211d)) && C46238a.m51546a(this.f136212e, jn32.f136212e) && C46238a.m51546a(this.f136213f, jn32.f136213f) && C46238a.m51546a(this.f136214g, jn32.f136214g) && C46238a.m51546a(this.f136215h, jn32.f136215h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f136211d);
            String str = this.f136212e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C77941hj hjVar = this.f136213f;
            if (hjVar != null) {
                aVar.mo74322i(4, hjVar.computeSize());
                this.f136213f.writeFields(aVar);
            }
            C50492n4 n4Var = this.f136214g;
            if (n4Var != null) {
                aVar.mo74322i(5, n4Var.computeSize());
                this.f136214g.writeFields(aVar);
            }
            String str2 = this.f136215h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136211d);
            String str3 = this.f136212e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C77941hj hjVar2 = this.f136213f;
            if (hjVar2 != null) {
                e += C52418a.m58682i(4, hjVar2.computeSize());
            }
            C50492n4 n4Var2 = this.f136214g;
            if (n4Var2 != null) {
                e += C52418a.m58682i(5, n4Var2.computeSize());
            }
            String str4 = this.f136215h;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
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
            C50014jn3 jn32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        jn32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    jn32.f136211d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jn32.f136212e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77941hj hjVar3 = new C77941hj();
                        if (bArr2 != null && bArr2.length > 0) {
                            hjVar3.parseFrom(bArr2);
                        }
                        jn32.f136213f = hjVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50492n4 n4Var3 = new C50492n4();
                        if (bArr3 != null && bArr3.length > 0) {
                            n4Var3.parseFrom(bArr3);
                        }
                        jn32.f136214g = n4Var3;
                    }
                    return 0;
                case 6:
                    jn32.f136215h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
