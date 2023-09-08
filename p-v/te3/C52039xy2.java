package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xy2 */
public class C52039xy2 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f145022d;

    /* renamed from: e */
    public int f145023e;

    /* renamed from: f */
    public int f145024f;

    /* renamed from: g */
    public int f145025g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52039xy2)) {
            return false;
        }
        C52039xy2 xy22 = (C52039xy2) aVar;
        return C46238a.m51546a(this.f145022d, xy22.f145022d) && C46238a.m51546a(Integer.valueOf(this.f145023e), Integer.valueOf(xy22.f145023e)) && C46238a.m51546a(Integer.valueOf(this.f145024f), Integer.valueOf(xy22.f145024f)) && C46238a.m51546a(Integer.valueOf(this.f145025g), Integer.valueOf(xy22.f145025g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f145022d;
            if (rv32 != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f145022d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f145023e);
                aVar.mo74318e(3, this.f145024f);
                aVar.mo74318e(4, this.f145025g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i == 1) {
            C51163rv3 rv33 = this.f145022d;
            if (rv33 != null) {
                i2 = 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f145023e) + C52418a.m58678e(3, this.f145024f) + C52418a.m58678e(4, this.f145025g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145022d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52039xy2 xy22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    xy22.f145022d = rv34;
                }
                return 0;
            } else if (intValue == 2) {
                xy22.f145023e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                xy22.f145024f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xy22.f145025g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
