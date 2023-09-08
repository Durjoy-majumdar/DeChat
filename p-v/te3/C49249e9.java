package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e9 */
public class C49249e9 extends C47465a implements r54 {

    /* renamed from: d */
    public int f132794d;

    /* renamed from: e */
    public C51018qv3 f132795e;

    /* renamed from: f */
    public String f132796f;

    /* renamed from: g */
    public C51018qv3 f132797g;

    /* renamed from: h */
    public String f132798h;

    /* renamed from: i */
    public String f132799i;

    /* renamed from: j */
    public int f132800j;

    /* renamed from: n */
    public String f132801n;

    /* renamed from: o */
    public String f132802o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49249e9)) {
            return false;
        }
        C49249e9 e9Var = (C49249e9) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132794d), Integer.valueOf(e9Var.f132794d)) && C46238a.m51546a(this.f132795e, e9Var.f132795e) && C46238a.m51546a(this.f132796f, e9Var.f132796f) && C46238a.m51546a(this.f132797g, e9Var.f132797g) && C46238a.m51546a(this.f132798h, e9Var.f132798h) && C46238a.m51546a(this.f132799i, e9Var.f132799i) && C46238a.m51546a(Integer.valueOf(this.f132800j), Integer.valueOf(e9Var.f132800j)) && C46238a.m51546a(this.f132801n, e9Var.f132801n) && C46238a.m51546a(this.f132802o, e9Var.f132802o);
    }

    public final int getRet() {
        return this.f132794d;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132795e == null) {
                throw new C52419b("Not all required fields were included: QRCodeBuffer");
            } else if (this.f132797g != null) {
                aVar.mo74318e(1, this.f132794d);
                C51018qv3 qv32 = this.f132795e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f132795e.writeFields(aVar);
                }
                String str = this.f132796f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51018qv3 qv33 = this.f132797g;
                if (qv33 != null) {
                    aVar.mo74322i(4, qv33.computeSize());
                    this.f132797g.writeFields(aVar);
                }
                String str2 = this.f132798h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f132799i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74318e(7, this.f132800j);
                String str4 = this.f132801n;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f132802o;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Key");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132794d) + 0;
            C51018qv3 qv34 = this.f132795e;
            if (qv34 != null) {
                e += C52418a.m58682i(2, qv34.computeSize());
            }
            String str6 = this.f132796f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            C51018qv3 qv35 = this.f132797g;
            if (qv35 != null) {
                e += C52418a.m58682i(4, qv35.computeSize());
            }
            String str7 = this.f132798h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f132799i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            int e2 = e + C52418a.m58678e(7, this.f132800j);
            String str9 = this.f132801n;
            if (str9 != null) {
                e2 += C52418a.m58683j(8, str9);
            }
            String str10 = this.f132802o;
            return str10 != null ? e2 + C52418a.m58683j(9, str10) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132795e == null) {
                throw new C52419b("Not all required fields were included: QRCodeBuffer");
            } else if (this.f132797g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Key");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49249e9 e9Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e9Var.f132794d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv36.mo73348f(bArr);
                        }
                        e9Var.f132795e = qv36;
                    }
                    return 0;
                case 3:
                    e9Var.f132796f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv37.mo73348f(bArr2);
                        }
                        e9Var.f132797g = qv37;
                    }
                    return 0;
                case 5:
                    e9Var.f132798h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e9Var.f132799i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e9Var.f132800j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    e9Var.f132801n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    e9Var.f132802o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
