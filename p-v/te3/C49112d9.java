package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d9 */
public class C49112d9 extends C47465a {

    /* renamed from: d */
    public int f132189d;

    /* renamed from: e */
    public C51018qv3 f132190e;

    /* renamed from: f */
    public String f132191f;

    /* renamed from: g */
    public int f132192g;

    /* renamed from: h */
    public String f132193h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49112d9)) {
            return false;
        }
        C49112d9 d9Var = (C49112d9) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132189d), Integer.valueOf(d9Var.f132189d)) && C46238a.m51546a(this.f132190e, d9Var.f132190e) && C46238a.m51546a(this.f132191f, d9Var.f132191f) && C46238a.m51546a(Integer.valueOf(this.f132192g), Integer.valueOf(d9Var.f132192g)) && C46238a.m51546a(this.f132193h, d9Var.f132193h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132190e != null) {
                aVar.mo74318e(1, this.f132189d);
                C51018qv3 qv32 = this.f132190e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f132190e.writeFields(aVar);
                }
                String str = this.f132191f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f132192g);
                String str2 = this.f132193h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: QRCodeBuffer");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132189d) + 0;
            C51018qv3 qv33 = this.f132190e;
            if (qv33 != null) {
                e += C52418a.m58682i(2, qv33.computeSize());
            }
            String str3 = this.f132191f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f132192g);
            String str4 = this.f132193h;
            return str4 != null ? e2 + C52418a.m58683j(5, str4) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132190e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: QRCodeBuffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49112d9 d9Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d9Var.f132189d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    d9Var.f132190e = qv34;
                }
                return 0;
            } else if (intValue == 3) {
                d9Var.f132191f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                d9Var.f132192g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                d9Var.f132193h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
