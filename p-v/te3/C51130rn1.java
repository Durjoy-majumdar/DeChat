package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rn1 */
public class C51130rn1 extends C47465a {

    /* renamed from: d */
    public LinkedList<bi4> f141044d = new LinkedList<>();

    /* renamed from: e */
    public int f141045e;

    /* renamed from: f */
    public C49295ek0 f141046f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51130rn1)) {
            return false;
        }
        C51130rn1 rn12 = (C51130rn1) aVar;
        return C46238a.m51546a(this.f141044d, rn12.f141044d) && C46238a.m51546a(Integer.valueOf(this.f141045e), Integer.valueOf(rn12.f141045e)) && C46238a.m51546a(this.f141046f, rn12.f141046f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f141044d);
            aVar.mo74318e(2, this.f141045e);
            C49295ek0 ek02 = this.f141046f;
            if (ek02 != null) {
                aVar.mo74322i(19, ek02.computeSize());
                this.f141046f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f141044d) + 0 + C52418a.m58678e(2, this.f141045e);
            C49295ek0 ek03 = this.f141046f;
            return ek03 != null ? g + C52418a.m58682i(19, ek03.computeSize()) : g;
        } else if (i == 2) {
            this.f141044d.clear();
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
            C51130rn1 rn12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    bi4 bi4 = new bi4();
                    if (bArr != null && bArr.length > 0) {
                        bi4.parseFrom(bArr);
                    }
                    rn12.f141044d.add(bi4);
                }
                return 0;
            } else if (intValue == 2) {
                rn12.f141045e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 19) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49295ek0 ek04 = new C49295ek0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ek04.parseFrom(bArr2);
                    }
                    rn12.f141046f = ek04;
                }
                return 0;
            }
        }
    }
}
