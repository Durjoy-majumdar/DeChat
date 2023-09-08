package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l70 */
public class C101805l70 extends C47465a {

    /* renamed from: d */
    public String f298709d;

    /* renamed from: e */
    public String f298710e;

    /* renamed from: f */
    public wr4 f298711f;

    /* renamed from: g */
    public wr4 f298712g;

    /* renamed from: h */
    public C101769d70 f298713h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101805l70)) {
            return false;
        }
        C101805l70 l702 = (C101805l70) aVar;
        return C46238a.m51546a(this.f298709d, l702.f298709d) && C46238a.m51546a(this.f298710e, l702.f298710e) && C46238a.m51546a(this.f298711f, l702.f298711f) && C46238a.m51546a(this.f298712g, l702.f298712g) && C46238a.m51546a(this.f298713h, l702.f298713h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298709d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: md5");
            } else if (this.f298711f == null) {
                throw new C52419b("Not all required fields were included: editorMatrix");
            } else if (this.f298712g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f298710e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                wr4 wr4 = this.f298711f;
                if (wr4 != null) {
                    aVar.mo74322i(3, wr4.computeSize());
                    this.f298711f.writeFields(aVar);
                }
                wr4 wr42 = this.f298712g;
                if (wr42 != null) {
                    aVar.mo74322i(4, wr42.computeSize());
                    this.f298712g.writeFields(aVar);
                }
                C101769d70 d702 = this.f298713h;
                if (d702 != null) {
                    aVar.mo74322i(5, d702.computeSize());
                    this.f298713h.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: showMatrix");
            }
        } else if (i == 1) {
            String str3 = this.f298709d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f298710e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            wr4 wr43 = this.f298711f;
            if (wr43 != null) {
                i2 += C52418a.m58682i(3, wr43.computeSize());
            }
            wr4 wr44 = this.f298712g;
            if (wr44 != null) {
                i2 += C52418a.m58682i(4, wr44.computeSize());
            }
            C101769d70 d703 = this.f298713h;
            return d703 != null ? i2 + C52418a.m58682i(5, d703.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298709d == null) {
                throw new C52419b("Not all required fields were included: md5");
            } else if (this.f298711f == null) {
                throw new C52419b("Not all required fields were included: editorMatrix");
            } else if (this.f298712g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: showMatrix");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101805l70 l702 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l702.f298709d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                l702.f298710e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    wr4 wr45 = new wr4();
                    if (bArr != null && bArr.length > 0) {
                        wr45.parseFrom(bArr);
                    }
                    l702.f298711f = wr45;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    wr4 wr46 = new wr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        wr46.parseFrom(bArr2);
                    }
                    l702.f298712g = wr46;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C101769d70 d704 = new C101769d70();
                    if (bArr3 != null && bArr3.length > 0) {
                        d704.parseFrom(bArr3);
                    }
                    l702.f298713h = d704;
                }
                return 0;
            }
        }
    }
}
