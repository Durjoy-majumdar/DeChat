package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.po0 */
public class C50855po0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139859d;

    /* renamed from: e */
    public float f139860e;

    /* renamed from: f */
    public float f139861f;

    /* renamed from: g */
    public int f139862g;

    /* renamed from: h */
    public String f139863h;

    /* renamed from: i */
    public String f139864i;

    /* renamed from: j */
    public String f139865j;

    /* renamed from: n */
    public String f139866n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50855po0)) {
            return false;
        }
        C50855po0 po02 = (C50855po0) aVar;
        return C46238a.m51546a(this.BaseRequest, po02.BaseRequest) && C46238a.m51546a(this.f139859d, po02.f139859d) && C46238a.m51546a(Float.valueOf(this.f139860e), Float.valueOf(po02.f139860e)) && C46238a.m51546a(Float.valueOf(this.f139861f), Float.valueOf(po02.f139861f)) && C46238a.m51546a(Integer.valueOf(this.f139862g), Integer.valueOf(po02.f139862g)) && C46238a.m51546a(this.f139863h, po02.f139863h) && C46238a.m51546a(this.f139864i, po02.f139864i) && C46238a.m51546a(this.f139865j, po02.f139865j) && C46238a.m51546a(this.f139866n, po02.f139866n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f139859d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139859d.writeFields(aVar);
            }
            aVar.mo74317d(3, this.f139860e);
            aVar.mo74317d(4, this.f139861f);
            aVar.mo74318e(5, this.f139862g);
            String str = this.f139863h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f139864i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f139865j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            String str4 = this.f139866n;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139859d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int d = i2 + C52418a.m58677d(3, this.f139860e) + C52418a.m58677d(4, this.f139861f) + C52418a.m58678e(5, this.f139862g);
            String str5 = this.f139863h;
            if (str5 != null) {
                d += C52418a.m58683j(6, str5);
            }
            String str6 = this.f139864i;
            if (str6 != null) {
                d += C52418a.m58683j(7, str6);
            }
            String str7 = this.f139865j;
            if (str7 != null) {
                d += C52418a.m58683j(8, str7);
            }
            String str8 = this.f139866n;
            return str8 != null ? d + C52418a.m58683j(9, str8) : d;
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
            C50855po0 po02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        po02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        po02.f139859d = ig04;
                    }
                    return 0;
                case 3:
                    po02.f139860e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    po02.f139861f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    po02.f139862g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    po02.f139863h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    po02.f139864i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    po02.f139865j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    po02.f139866n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
