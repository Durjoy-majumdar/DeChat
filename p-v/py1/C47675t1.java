package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.t1 */
public class C47675t1 extends C101820nt3 {

    /* renamed from: d */
    public String f128017d;

    /* renamed from: e */
    public String f128018e;

    /* renamed from: f */
    public int f128019f;

    /* renamed from: g */
    public C47582g f128020g;

    /* renamed from: h */
    public int f128021h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47675t1)) {
            return false;
        }
        C47675t1 t1Var = (C47675t1) aVar;
        return C46238a.m51546a(this.BaseRequest, t1Var.BaseRequest) && C46238a.m51546a(this.f128017d, t1Var.f128017d) && C46238a.m51546a(this.f128018e, t1Var.f128018e) && C46238a.m51546a(Integer.valueOf(this.f128019f), Integer.valueOf(t1Var.f128019f)) && C46238a.m51546a(this.f128020g, t1Var.f128020g) && C46238a.m51546a(Integer.valueOf(this.f128021h), Integer.valueOf(t1Var.f128021h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f128017d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f128017d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f128018e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f128019f);
                C47582g gVar = this.f128020g;
                if (gVar != null) {
                    aVar.mo74322i(5, gVar.computeSize());
                    this.f128020g.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f128021h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f128017d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f128018e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f128019f);
            C47582g gVar2 = this.f128020g;
            if (gVar2 != null) {
                e += C52418a.m58682i(5, gVar2.computeSize());
            }
            return e + C52418a.m58678e(7, this.f128021h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128017d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47675t1 t1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    t1Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                t1Var.f128017d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                t1Var.f128018e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                t1Var.f128019f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47582g gVar3 = new C47582g();
                    if (bArr2 != null && bArr2.length > 0) {
                        gVar3.parseFrom(bArr2);
                    }
                    t1Var.f128020g = gVar3;
                }
                return 0;
            } else if (intValue != 7) {
                return -1;
            } else {
                t1Var.f128021h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
