package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zs0 */
public class C64894zs0 extends C47465a {

    /* renamed from: d */
    public String f186851d;

    /* renamed from: e */
    public int f186852e;

    /* renamed from: f */
    public int f186853f;

    /* renamed from: g */
    public C64265bq2 f186854g;

    /* renamed from: h */
    public C49765hx0 f186855h;

    /* renamed from: i */
    public long f186856i;

    /* renamed from: j */
    public long f186857j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64894zs0)) {
            return false;
        }
        C64894zs0 zs02 = (C64894zs0) aVar;
        return C46238a.m51546a(this.f186851d, zs02.f186851d) && C46238a.m51546a(Integer.valueOf(this.f186852e), Integer.valueOf(zs02.f186852e)) && C46238a.m51546a(Integer.valueOf(this.f186853f), Integer.valueOf(zs02.f186853f)) && C46238a.m51546a(this.f186854g, zs02.f186854g) && C46238a.m51546a(this.f186855h, zs02.f186855h) && C46238a.m51546a(Long.valueOf(this.f186856i), Long.valueOf(zs02.f186856i)) && C46238a.m51546a(Long.valueOf(this.f186857j), Long.valueOf(zs02.f186857j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186851d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(51, this.f186852e);
            aVar.mo74318e(52, this.f186853f);
            C64265bq2 bq22 = this.f186854g;
            if (bq22 != null) {
                aVar.mo74322i(101, bq22.computeSize());
                this.f186854g.writeFields(aVar);
            }
            C49765hx0 hx02 = this.f186855h;
            if (hx02 != null) {
                aVar.mo74322i(102, hx02.computeSize());
                this.f186855h.writeFields(aVar);
            }
            aVar.mo74321h(103, this.f186856i);
            aVar.mo74321h(104, this.f186857j);
            return 0;
        } else if (i == 1) {
            String str2 = this.f186851d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(51, this.f186852e) + C52418a.m58678e(52, this.f186853f);
            C64265bq2 bq23 = this.f186854g;
            if (bq23 != null) {
                e += C52418a.m58682i(101, bq23.computeSize());
            }
            C49765hx0 hx03 = this.f186855h;
            if (hx03 != null) {
                e += C52418a.m58682i(102, hx03.computeSize());
            }
            return e + C52418a.m58681h(103, this.f186856i) + C52418a.m58681h(104, this.f186857j);
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
            C64894zs0 zs02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zs02.f186851d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 51) {
                zs02.f186852e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 52) {
                switch (intValue) {
                    case 101:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            C64265bq2 bq24 = new C64265bq2();
                            if (bArr != null && bArr.length > 0) {
                                bq24.parseFrom(bArr);
                            }
                            zs02.f186854g = bq24;
                        }
                        return 0;
                    case 102:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C49765hx0 hx04 = new C49765hx0();
                            if (bArr2 != null && bArr2.length > 0) {
                                hx04.parseFrom(bArr2);
                            }
                            zs02.f186855h = hx04;
                        }
                        return 0;
                    case 103:
                        zs02.f186856i = aVar3.mo141631i(intValue);
                        return 0;
                    case 104:
                        zs02.f186857j = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                zs02.f186853f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
