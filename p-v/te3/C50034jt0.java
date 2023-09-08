package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jt0 */
public class C50034jt0 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f136310d;

    /* renamed from: e */
    public int f136311e;

    /* renamed from: f */
    public String f136312f;

    /* renamed from: g */
    public String f136313g;

    /* renamed from: h */
    public long f136314h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50034jt0)) {
            return false;
        }
        C50034jt0 jt02 = (C50034jt0) aVar;
        return C46238a.m51546a(this.f136310d, jt02.f136310d) && C46238a.m51546a(Integer.valueOf(this.f136311e), Integer.valueOf(jt02.f136311e)) && C46238a.m51546a(this.f136312f, jt02.f136312f) && C46238a.m51546a(this.f136313g, jt02.f136313g) && C46238a.m51546a(Long.valueOf(this.f136314h), Long.valueOf(jt02.f136314h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f136310d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f136310d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f136311e);
            String str = this.f136312f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f136313g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f136314h);
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f136310d;
            if (hx03 != null) {
                i2 = 0 + C52418a.m58682i(1, hx03.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136311e);
            String str3 = this.f136312f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f136313g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58681h(5, this.f136314h);
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
            C50034jt0 jt02 = objArr[1];
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
                    jt02.f136310d = hx04;
                }
                return 0;
            } else if (intValue == 2) {
                jt02.f136311e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                jt02.f136312f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                jt02.f136313g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                jt02.f136314h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
