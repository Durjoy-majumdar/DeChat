package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l31 */
public class C50209l31 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f137145d;

    /* renamed from: e */
    public int f137146e;

    /* renamed from: f */
    public String f137147f;

    /* renamed from: g */
    public String f137148g;

    /* renamed from: h */
    public long f137149h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50209l31)) {
            return false;
        }
        C50209l31 l312 = (C50209l31) aVar;
        return C46238a.m51546a(this.f137145d, l312.f137145d) && C46238a.m51546a(Integer.valueOf(this.f137146e), Integer.valueOf(l312.f137146e)) && C46238a.m51546a(this.f137147f, l312.f137147f) && C46238a.m51546a(this.f137148g, l312.f137148g) && C46238a.m51546a(Long.valueOf(this.f137149h), Long.valueOf(l312.f137149h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f137145d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f137145d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f137146e);
            String str = this.f137147f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f137148g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f137149h);
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f137145d;
            if (hx03 != null) {
                i2 = 0 + C52418a.m58682i(1, hx03.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137146e);
            String str3 = this.f137147f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f137148g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58681h(5, this.f137149h);
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
            C50209l31 l312 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49765hx0 hx04 = new C49765hx0();
                    if (bArr != null && bArr.length > 0) {
                        hx04.parseFrom(bArr);
                    }
                    l312.f137145d = hx04;
                }
                return 0;
            } else if (intValue == 2) {
                l312.f137146e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                l312.f137147f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                l312.f137148g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                l312.f137149h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
