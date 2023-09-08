package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.no3 */
public class C50572no3 extends C47465a {

    /* renamed from: d */
    public C101800k70 f138703d;

    /* renamed from: e */
    public String f138704e;

    /* renamed from: f */
    public int f138705f;

    /* renamed from: g */
    public String f138706g;

    /* renamed from: h */
    public int f138707h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50572no3)) {
            return false;
        }
        C50572no3 no32 = (C50572no3) aVar;
        return C46238a.m51546a(this.f138703d, no32.f138703d) && C46238a.m51546a(this.f138704e, no32.f138704e) && C46238a.m51546a(Integer.valueOf(this.f138705f), Integer.valueOf(no32.f138705f)) && C46238a.m51546a(this.f138706g, no32.f138706g) && C46238a.m51546a(Integer.valueOf(this.f138707h), Integer.valueOf(no32.f138707h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101800k70 k702 = this.f138703d;
            if (k702 != null) {
                aVar.mo74322i(1, k702.computeSize());
                this.f138703d.writeFields(aVar);
            }
            String str = this.f138704e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138705f);
            String str2 = this.f138706g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f138707h);
            return 0;
        } else if (i == 1) {
            C101800k70 k703 = this.f138703d;
            if (k703 != null) {
                i2 = 0 + C52418a.m58682i(1, k703.computeSize());
            }
            String str3 = this.f138704e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f138705f);
            String str4 = this.f138706g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f138707h);
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
            C50572no3 no32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C101800k70 k704 = new C101800k70();
                    if (bArr != null && bArr.length > 0) {
                        k704.parseFrom(bArr);
                    }
                    no32.f138703d = k704;
                }
                return 0;
            } else if (intValue == 2) {
                no32.f138704e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                no32.f138705f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                no32.f138706g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                no32.f138707h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
