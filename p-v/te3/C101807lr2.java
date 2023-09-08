package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lr2 */
public class C101807lr2 extends C47465a {

    /* renamed from: d */
    public String f298721d;

    /* renamed from: e */
    public String f298722e;

    /* renamed from: f */
    public wr4 f298723f;

    /* renamed from: g */
    public float f298724g;

    /* renamed from: h */
    public float f298725h;

    /* renamed from: i */
    public C101769d70 f298726i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101807lr2)) {
            return false;
        }
        C101807lr2 lr22 = (C101807lr2) aVar;
        return C46238a.m51546a(this.f298721d, lr22.f298721d) && C46238a.m51546a(this.f298722e, lr22.f298722e) && C46238a.m51546a(this.f298723f, lr22.f298723f) && C46238a.m51546a(Float.valueOf(this.f298724g), Float.valueOf(lr22.f298724g)) && C46238a.m51546a(Float.valueOf(this.f298725h), Float.valueOf(lr22.f298725h)) && C46238a.m51546a(this.f298726i, lr22.f298726i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298721d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: cityName");
            } else if (this.f298722e == null) {
                throw new C52419b("Not all required fields were included: poiName");
            } else if (this.f298723f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f298722e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                wr4 wr4 = this.f298723f;
                if (wr4 != null) {
                    aVar.mo74322i(4, wr4.computeSize());
                    this.f298723f.writeFields(aVar);
                }
                aVar.mo74317d(5, this.f298724g);
                aVar.mo74317d(6, this.f298725h);
                C101769d70 d702 = this.f298726i;
                if (d702 != null) {
                    aVar.mo74322i(7, d702.computeSize());
                    this.f298726i.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: matrix");
            }
        } else if (i == 1) {
            String str3 = this.f298721d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f298722e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            wr4 wr42 = this.f298723f;
            if (wr42 != null) {
                i2 += C52418a.m58682i(4, wr42.computeSize());
            }
            int d = i2 + C52418a.m58677d(5, this.f298724g) + C52418a.m58677d(6, this.f298725h);
            C101769d70 d703 = this.f298726i;
            return d703 != null ? d + C52418a.m58682i(7, d703.computeSize()) : d;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298721d == null) {
                throw new C52419b("Not all required fields were included: cityName");
            } else if (this.f298722e == null) {
                throw new C52419b("Not all required fields were included: poiName");
            } else if (this.f298723f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: matrix");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101807lr2 lr22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lr22.f298721d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lr22.f298722e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    wr4 wr43 = new wr4();
                    if (bArr != null && bArr.length > 0) {
                        wr43.parseFrom(bArr);
                    }
                    lr22.f298723f = wr43;
                }
                return 0;
            } else if (intValue == 5) {
                lr22.f298724g = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 6) {
                lr22.f298725h = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue != 7) {
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
                    lr22.f298726i = d704;
                }
                return 0;
            }
        }
    }
}
