package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ea3 */
public class C101774ea3 extends C47465a {

    /* renamed from: d */
    public String f298199d;

    /* renamed from: e */
    public String f298200e;

    /* renamed from: f */
    public wr4 f298201f;

    /* renamed from: g */
    public C101769d70 f298202g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101774ea3)) {
            return false;
        }
        C101774ea3 ea32 = (C101774ea3) aVar;
        return C46238a.m51546a(this.f298199d, ea32.f298199d) && C46238a.m51546a(this.f298200e, ea32.f298200e) && C46238a.m51546a(this.f298201f, ea32.f298201f) && C46238a.m51546a(this.f298202g, ea32.f298202g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298199d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: pagPath");
            } else if (this.f298201f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f298200e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                wr4 wr4 = this.f298201f;
                if (wr4 != null) {
                    aVar.mo74322i(3, wr4.computeSize());
                    this.f298201f.writeFields(aVar);
                }
                C101769d70 d702 = this.f298202g;
                if (d702 != null) {
                    aVar.mo74322i(4, d702.computeSize());
                    this.f298202g.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: matrix");
            }
        } else if (i == 1) {
            String str3 = this.f298199d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f298200e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            wr4 wr42 = this.f298201f;
            if (wr42 != null) {
                i2 += C52418a.m58682i(3, wr42.computeSize());
            }
            C101769d70 d703 = this.f298202g;
            return d703 != null ? i2 + C52418a.m58682i(4, d703.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298199d == null) {
                throw new C52419b("Not all required fields were included: pagPath");
            } else if (this.f298201f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: matrix");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101774ea3 ea32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ea32.f298199d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ea32.f298200e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    wr4 wr43 = new wr4();
                    if (bArr != null && bArr.length > 0) {
                        wr43.parseFrom(bArr);
                    }
                    ea32.f298201f = wr43;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101769d70 d704 = new C101769d70();
                    if (bArr2 != null && bArr2.length > 0) {
                        d704.parseFrom(bArr2);
                    }
                    ea32.f298202g = d704;
                }
                return 0;
            }
        }
    }
}
