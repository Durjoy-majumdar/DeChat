package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tt0 */
public class C51443tt0 extends C47465a {

    /* renamed from: d */
    public String f142388d;

    /* renamed from: e */
    public C50767p11 f142389e;

    /* renamed from: f */
    public String f142390f;

    /* renamed from: g */
    public int f142391g;

    /* renamed from: h */
    public String f142392h;

    /* renamed from: i */
    public int f142393i;

    /* renamed from: j */
    public C89349b f142394j;

    /* renamed from: n */
    public C51600uu3 f142395n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51443tt0)) {
            return false;
        }
        C51443tt0 tt02 = (C51443tt0) aVar;
        return C46238a.m51546a(this.f142388d, tt02.f142388d) && C46238a.m51546a(this.f142389e, tt02.f142389e) && C46238a.m51546a(this.f142390f, tt02.f142390f) && C46238a.m51546a(Integer.valueOf(this.f142391g), Integer.valueOf(tt02.f142391g)) && C46238a.m51546a(this.f142392h, tt02.f142392h) && C46238a.m51546a(Integer.valueOf(this.f142393i), Integer.valueOf(tt02.f142393i)) && C46238a.m51546a(this.f142394j, tt02.f142394j) && C46238a.m51546a(this.f142395n, tt02.f142395n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142388d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C50767p11 p112 = this.f142389e;
            if (p112 != null) {
                aVar.mo74322i(2, p112.computeSize());
                this.f142389e.writeFields(aVar);
            }
            String str2 = this.f142390f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f142391g);
            String str3 = this.f142392h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f142393i);
            C89349b bVar = this.f142394j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            C51600uu3 uu32 = this.f142395n;
            if (uu32 != null) {
                aVar.mo74322i(8, uu32.computeSize());
                this.f142395n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f142388d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            C50767p11 p113 = this.f142389e;
            if (p113 != null) {
                i2 += C52418a.m58682i(2, p113.computeSize());
            }
            String str5 = this.f142390f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f142391g);
            String str6 = this.f142392h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int e2 = e + C52418a.m58678e(6, this.f142393i);
            C89349b bVar2 = this.f142394j;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(7, bVar2);
            }
            C51600uu3 uu33 = this.f142395n;
            return uu33 != null ? e2 + C52418a.m58682i(8, uu33.computeSize()) : e2;
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
            C51443tt0 tt02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tt02.f142388d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50767p11 p114 = new C50767p11();
                        if (bArr != null && bArr.length > 0) {
                            p114.parseFrom(bArr);
                        }
                        tt02.f142389e = p114;
                    }
                    return 0;
                case 3:
                    tt02.f142390f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tt02.f142391g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    tt02.f142392h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tt02.f142393i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tt02.f142394j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51600uu3 uu34 = new C51600uu3();
                        if (bArr2 != null && bArr2.length > 0) {
                            uu34.parseFrom(bArr2);
                        }
                        tt02.f142395n = uu34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
