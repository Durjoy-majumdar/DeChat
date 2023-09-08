package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u40 */
public class C51492u40 extends C47465a {

    /* renamed from: d */
    public int f142585d;

    /* renamed from: e */
    public String f142586e;

    /* renamed from: f */
    public C50456mv3 f142587f;

    /* renamed from: g */
    public C50746ox f142588g;

    /* renamed from: h */
    public String f142589h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51492u40)) {
            return false;
        }
        C51492u40 u402 = (C51492u40) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142585d), Integer.valueOf(u402.f142585d)) && C46238a.m51546a(this.f142586e, u402.f142586e) && C46238a.m51546a(this.f142587f, u402.f142587f) && C46238a.m51546a(this.f142588g, u402.f142588g) && C46238a.m51546a(this.f142589h, u402.f142589h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142585d);
            String str = this.f142586e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C50456mv3 mv32 = this.f142587f;
            if (mv32 != null) {
                aVar.mo74322i(3, mv32.computeSize());
                this.f142587f.writeFields(aVar);
            }
            C50746ox oxVar = this.f142588g;
            if (oxVar != null) {
                aVar.mo74322i(4, oxVar.computeSize());
                this.f142588g.writeFields(aVar);
            }
            String str2 = this.f142589h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142585d) + 0;
            String str3 = this.f142586e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            C50456mv3 mv33 = this.f142587f;
            if (mv33 != null) {
                e += C52418a.m58682i(3, mv33.computeSize());
            }
            C50746ox oxVar2 = this.f142588g;
            if (oxVar2 != null) {
                e += C52418a.m58682i(4, oxVar2.computeSize());
            }
            String str4 = this.f142589h;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C51492u40 u402 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u402.f142585d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                u402.f142586e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr != null && bArr.length > 0) {
                        mv34.parseFrom(bArr);
                    }
                    u402.f142587f = mv34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50746ox oxVar3 = new C50746ox();
                    if (bArr2 != null && bArr2.length > 0) {
                        oxVar3.parseFrom(bArr2);
                    }
                    u402.f142588g = oxVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                u402.f142589h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
