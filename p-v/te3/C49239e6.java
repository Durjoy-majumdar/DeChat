package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e6 */
public class C49239e6 extends C101820nt3 {

    /* renamed from: d */
    public String f132714d;

    /* renamed from: e */
    public int f132715e;

    /* renamed from: f */
    public String f132716f;

    /* renamed from: g */
    public int f132717g;

    /* renamed from: h */
    public int f132718h;

    /* renamed from: i */
    public int f132719i;

    /* renamed from: j */
    public int f132720j;

    /* renamed from: n */
    public int f132721n;

    /* renamed from: o */
    public int f132722o;

    /* renamed from: p */
    public int f132723p;

    /* renamed from: q */
    public String f132724q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49239e6)) {
            return false;
        }
        C49239e6 e6Var = (C49239e6) aVar;
        return C46238a.m51546a(this.BaseRequest, e6Var.BaseRequest) && C46238a.m51546a(this.f132714d, e6Var.f132714d) && C46238a.m51546a(Integer.valueOf(this.f132715e), Integer.valueOf(e6Var.f132715e)) && C46238a.m51546a(this.f132716f, e6Var.f132716f) && C46238a.m51546a(Integer.valueOf(this.f132717g), Integer.valueOf(e6Var.f132717g)) && C46238a.m51546a(Integer.valueOf(this.f132718h), Integer.valueOf(e6Var.f132718h)) && C46238a.m51546a(Integer.valueOf(this.f132719i), Integer.valueOf(e6Var.f132719i)) && C46238a.m51546a(Integer.valueOf(this.f132720j), Integer.valueOf(e6Var.f132720j)) && C46238a.m51546a(Integer.valueOf(this.f132721n), Integer.valueOf(e6Var.f132721n)) && C46238a.m51546a(Integer.valueOf(this.f132722o), Integer.valueOf(e6Var.f132722o)) && C46238a.m51546a(Integer.valueOf(this.f132723p), Integer.valueOf(e6Var.f132723p)) && C46238a.m51546a(this.f132724q, e6Var.f132724q);
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
            String str = this.f132714d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(5, this.f132715e);
            String str2 = this.f132716f;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f132717g);
            aVar.mo74318e(8, this.f132718h);
            aVar.mo74318e(9, this.f132719i);
            aVar.mo74318e(10, this.f132720j);
            aVar.mo74318e(11, this.f132721n);
            aVar.mo74318e(12, this.f132722o);
            aVar.mo74318e(13, this.f132723p);
            String str3 = this.f132724q;
            if (str3 != null) {
                aVar.mo74323j(14, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f132714d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(5, this.f132715e);
            String str5 = this.f132716f;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            int e2 = e + C52418a.m58678e(7, this.f132717g) + C52418a.m58678e(8, this.f132718h) + C52418a.m58678e(9, this.f132719i) + C52418a.m58678e(10, this.f132720j) + C52418a.m58678e(11, this.f132721n) + C52418a.m58678e(12, this.f132722o) + C52418a.m58678e(13, this.f132723p);
            String str6 = this.f132724q;
            return str6 != null ? e2 + C52418a.m58683j(14, str6) : e2;
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
            C49239e6 e6Var = objArr[1];
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
                    e6Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                switch (intValue) {
                    case 5:
                        e6Var.f132715e = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        e6Var.f132716f = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        e6Var.f132717g = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        e6Var.f132718h = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        e6Var.f132719i = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        e6Var.f132720j = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        e6Var.f132721n = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        e6Var.f132722o = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        e6Var.f132723p = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        e6Var.f132724q = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                e6Var.f132714d = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
