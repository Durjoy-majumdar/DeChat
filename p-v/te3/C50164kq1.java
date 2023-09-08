package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kq1 */
public class C50164kq1 extends C47465a {

    /* renamed from: d */
    public int f136978d;

    /* renamed from: e */
    public C51163rv3 f136979e;

    /* renamed from: f */
    public C51163rv3 f136980f;

    /* renamed from: g */
    public int f136981g;

    /* renamed from: h */
    public int f136982h;

    /* renamed from: i */
    public int f136983i;

    /* renamed from: j */
    public String f136984j;

    /* renamed from: n */
    public long f136985n;

    /* renamed from: o */
    public int f136986o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50164kq1)) {
            return false;
        }
        C50164kq1 kq12 = (C50164kq1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136978d), Integer.valueOf(kq12.f136978d)) && C46238a.m51546a(this.f136979e, kq12.f136979e) && C46238a.m51546a(this.f136980f, kq12.f136980f) && C46238a.m51546a(Integer.valueOf(this.f136981g), Integer.valueOf(kq12.f136981g)) && C46238a.m51546a(Integer.valueOf(this.f136982h), Integer.valueOf(kq12.f136982h)) && C46238a.m51546a(Integer.valueOf(this.f136983i), Integer.valueOf(kq12.f136983i)) && C46238a.m51546a(this.f136984j, kq12.f136984j) && C46238a.m51546a(Long.valueOf(this.f136985n), Long.valueOf(kq12.f136985n)) && C46238a.m51546a(Integer.valueOf(this.f136986o), Integer.valueOf(kq12.f136986o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f136979e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f136980f == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f136984j != null) {
                aVar.mo74318e(1, this.f136978d);
                C51163rv3 rv32 = this.f136979e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f136979e.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f136980f;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f136980f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f136981g);
                aVar.mo74318e(5, this.f136982h);
                aVar.mo74318e(6, this.f136983i);
                String str = this.f136984j;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                aVar.mo74321h(8, this.f136985n);
                aVar.mo74318e(9, this.f136986o);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MsgSource");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136978d) + 0;
            C51163rv3 rv34 = this.f136979e;
            if (rv34 != null) {
                e += C52418a.m58682i(2, rv34.computeSize());
            }
            C51163rv3 rv35 = this.f136980f;
            if (rv35 != null) {
                e += C52418a.m58682i(3, rv35.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f136981g) + C52418a.m58678e(5, this.f136982h) + C52418a.m58678e(6, this.f136983i);
            String str2 = this.f136984j;
            if (str2 != null) {
                e2 += C52418a.m58683j(7, str2);
            }
            return e2 + C52418a.m58681h(8, this.f136985n) + C52418a.m58678e(9, this.f136986o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136979e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f136980f == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f136984j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MsgSource");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50164kq1 kq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kq12.f136978d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv36.mo73356d(bArr);
                        }
                        kq12.f136979e = rv36;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv37.mo73356d(bArr2);
                        }
                        kq12.f136980f = rv37;
                    }
                    return 0;
                case 4:
                    kq12.f136981g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kq12.f136982h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kq12.f136983i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    kq12.f136984j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kq12.f136985n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    kq12.f136986o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
