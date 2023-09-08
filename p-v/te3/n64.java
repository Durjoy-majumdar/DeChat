package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class n64 extends C47465a {

    /* renamed from: d */
    public long f298897d;

    /* renamed from: e */
    public long f298898e;

    /* renamed from: f */
    public m64 f298899f;

    /* renamed from: g */
    public m64 f298900g;

    /* renamed from: h */
    public String f298901h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n64)) {
            return false;
        }
        n64 n64 = (n64) aVar;
        return C46238a.m51546a(Long.valueOf(this.f298897d), Long.valueOf(n64.f298897d)) && C46238a.m51546a(Long.valueOf(this.f298898e), Long.valueOf(n64.f298898e)) && C46238a.m51546a(this.f298899f, n64.f298899f) && C46238a.m51546a(this.f298900g, n64.f298900g) && C46238a.m51546a(this.f298901h, n64.f298901h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f298899f != null) {
                aVar.mo74321h(1, this.f298897d);
                aVar.mo74321h(2, this.f298898e);
                m64 m64 = this.f298899f;
                if (m64 != null) {
                    aVar.mo74322i(3, m64.computeSize());
                    this.f298899f.writeFields(aVar);
                }
                m64 m642 = this.f298900g;
                if (m642 != null) {
                    aVar.mo74322i(4, m642.computeSize());
                    this.f298900g.writeFields(aVar);
                }
                String str = this.f298901h;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: CurrentAction");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f298897d) + 0 + C52418a.m58681h(2, this.f298898e);
            m64 m643 = this.f298899f;
            if (m643 != null) {
                h += C52418a.m58682i(3, m643.computeSize());
            }
            m64 m644 = this.f298900g;
            if (m644 != null) {
                h += C52418a.m58682i(4, m644.computeSize());
            }
            String str2 = this.f298901h;
            return str2 != null ? h + C52418a.m58683j(5, str2) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298899f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: CurrentAction");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            n64 n64 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n64.f298897d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                n64.f298898e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    m64 m645 = new m64();
                    if (bArr != null && bArr.length > 0) {
                        m645.parseFrom(bArr);
                    }
                    n64.f298899f = m645;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    m64 m646 = new m64();
                    if (bArr2 != null && bArr2.length > 0) {
                        m646.parseFrom(bArr2);
                    }
                    n64.f298900g = m646;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                n64.f298901h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
