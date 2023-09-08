package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k3 */
public class C77957k3 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f227726d;

    /* renamed from: e */
    public long f227727e;

    /* renamed from: f */
    public int f227728f;

    /* renamed from: g */
    public int f227729g;

    /* renamed from: h */
    public int f227730h;

    /* renamed from: i */
    public C51163rv3 f227731i;

    /* renamed from: j */
    public int f227732j;

    /* renamed from: n */
    public int f227733n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77957k3)) {
            return false;
        }
        C77957k3 k3Var = (C77957k3) aVar;
        return C46238a.m51546a(this.f227726d, k3Var.f227726d) && C46238a.m51546a(Long.valueOf(this.f227727e), Long.valueOf(k3Var.f227727e)) && C46238a.m51546a(Integer.valueOf(this.f227728f), Integer.valueOf(k3Var.f227728f)) && C46238a.m51546a(Integer.valueOf(this.f227729g), Integer.valueOf(k3Var.f227729g)) && C46238a.m51546a(Integer.valueOf(this.f227730h), Integer.valueOf(k3Var.f227730h)) && C46238a.m51546a(this.f227731i, k3Var.f227731i) && C46238a.m51546a(Integer.valueOf(this.f227732j), Integer.valueOf(k3Var.f227732j)) && C46238a.m51546a(Integer.valueOf(this.f227733n), Integer.valueOf(k3Var.f227733n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f227726d;
            if (rv32 == null) {
                throw new C52419b("Not all required fields were included: ChatRoomId");
            } else if (this.f227731i != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f227726d.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f227727e);
                aVar.mo74318e(3, this.f227728f);
                aVar.mo74318e(4, this.f227729g);
                aVar.mo74318e(5, this.f227730h);
                C51163rv3 rv33 = this.f227731i;
                if (rv33 != null) {
                    aVar.mo74322i(6, rv33.computeSize());
                    this.f227731i.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f227732j);
                aVar.mo74318e(8, this.f227733n);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DigestContent");
            }
        } else if (i == 1) {
            C51163rv3 rv34 = this.f227726d;
            if (rv34 != null) {
                i2 = 0 + C52418a.m58682i(1, rv34.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f227727e) + C52418a.m58678e(3, this.f227728f) + C52418a.m58678e(4, this.f227729g) + C52418a.m58678e(5, this.f227730h);
            C51163rv3 rv35 = this.f227731i;
            if (rv35 != null) {
                h += C52418a.m58682i(6, rv35.computeSize());
            }
            return h + C52418a.m58678e(7, this.f227732j) + C52418a.m58678e(8, this.f227733n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f227726d == null) {
                throw new C52419b("Not all required fields were included: ChatRoomId");
            } else if (this.f227731i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DigestContent");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77957k3 k3Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv36.mo73356d(bArr);
                        }
                        k3Var.f227726d = rv36;
                    }
                    return 0;
                case 2:
                    k3Var.f227727e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    k3Var.f227728f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    k3Var.f227729g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    k3Var.f227730h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv37.mo73356d(bArr2);
                        }
                        k3Var.f227731i = rv37;
                    }
                    return 0;
                case 7:
                    k3Var.f227732j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    k3Var.f227733n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
