package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mi2 */
public class C50407mi2 extends C47465a {

    /* renamed from: d */
    public int f138046d;

    /* renamed from: e */
    public String f138047e;

    /* renamed from: f */
    public String f138048f;

    /* renamed from: g */
    public LinkedList<C52121yi2> f138049g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C49154dj2> f138050h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50407mi2)) {
            return false;
        }
        C50407mi2 mi22 = (C50407mi2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138046d), Integer.valueOf(mi22.f138046d)) && C46238a.m51546a(this.f138047e, mi22.f138047e) && C46238a.m51546a(this.f138048f, mi22.f138048f) && C46238a.m51546a(this.f138049g, mi22.f138049g) && C46238a.m51546a(this.f138050h, mi22.f138050h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138046d);
            String str = this.f138047e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138048f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f138049g);
            aVar.mo74320g(5, 8, this.f138050h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138046d) + 0;
            String str3 = this.f138047e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138048f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58680g(4, 8, this.f138049g) + C52418a.m58680g(5, 8, this.f138050h);
        } else if (i == 2) {
            this.f138049g.clear();
            this.f138050h.clear();
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
            C50407mi2 mi22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mi22.f138046d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                mi22.f138047e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mi22.f138048f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52121yi2 yi22 = new C52121yi2();
                    if (bArr != null && bArr.length > 0) {
                        yi22.parseFrom(bArr);
                    }
                    mi22.f138049g.add(yi22);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49154dj2 dj22 = new C49154dj2();
                    if (bArr2 != null && bArr2.length > 0) {
                        dj22.parseFrom(bArr2);
                    }
                    mi22.f138050h.add(dj22);
                }
                return 0;
            }
        }
    }
}
