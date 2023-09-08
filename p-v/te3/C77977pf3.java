package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pf3 */
public class C77977pf3 extends C47465a {

    /* renamed from: d */
    public String f228010d;

    /* renamed from: e */
    public String f228011e;

    /* renamed from: f */
    public int f228012f;

    /* renamed from: g */
    public C51892wy f228013g;

    /* renamed from: h */
    public C78008wk f228014h;

    /* renamed from: i */
    public C78008wk f228015i;

    /* renamed from: j */
    public String f228016j;

    /* renamed from: n */
    public String f228017n;

    /* renamed from: o */
    public String f228018o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77977pf3)) {
            return false;
        }
        C77977pf3 pf32 = (C77977pf3) aVar;
        return C46238a.m51546a(this.f228010d, pf32.f228010d) && C46238a.m51546a(this.f228011e, pf32.f228011e) && C46238a.m51546a(Integer.valueOf(this.f228012f), Integer.valueOf(pf32.f228012f)) && C46238a.m51546a(this.f228013g, pf32.f228013g) && C46238a.m51546a(this.f228014h, pf32.f228014h) && C46238a.m51546a(this.f228015i, pf32.f228015i) && C46238a.m51546a(this.f228016j, pf32.f228016j) && C46238a.m51546a(this.f228017n, pf32.f228017n) && C46238a.m51546a(this.f228018o, pf32.f228018o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228010d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f228011e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f228012f);
            C51892wy wyVar = this.f228013g;
            if (wyVar != null) {
                aVar.mo74322i(4, wyVar.computeSize());
                this.f228013g.writeFields(aVar);
            }
            C78008wk wkVar = this.f228014h;
            if (wkVar != null) {
                aVar.mo74322i(5, wkVar.computeSize());
                this.f228014h.writeFields(aVar);
            }
            C78008wk wkVar2 = this.f228015i;
            if (wkVar2 != null) {
                aVar.mo74322i(6, wkVar2.computeSize());
                this.f228015i.writeFields(aVar);
            }
            String str3 = this.f228016j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f228017n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f228018o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f228010d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f228011e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f228012f);
            C51892wy wyVar2 = this.f228013g;
            if (wyVar2 != null) {
                e += C52418a.m58682i(4, wyVar2.computeSize());
            }
            C78008wk wkVar3 = this.f228014h;
            if (wkVar3 != null) {
                e += C52418a.m58682i(5, wkVar3.computeSize());
            }
            C78008wk wkVar4 = this.f228015i;
            if (wkVar4 != null) {
                e += C52418a.m58682i(6, wkVar4.computeSize());
            }
            String str8 = this.f228016j;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            String str9 = this.f228017n;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            String str10 = this.f228018o;
            return str10 != null ? e + C52418a.m58683j(9, str10) : e;
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
            C77977pf3 pf32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pf32.f228010d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pf32.f228011e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pf32.f228012f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51892wy wyVar3 = new C51892wy();
                        if (bArr != null && bArr.length > 0) {
                            wyVar3.parseFrom(bArr);
                        }
                        pf32.f228013g = wyVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C78008wk wkVar5 = new C78008wk();
                        if (bArr2 != null && bArr2.length > 0) {
                            wkVar5.parseFrom(bArr2);
                        }
                        pf32.f228014h = wkVar5;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C78008wk wkVar6 = new C78008wk();
                        if (bArr3 != null && bArr3.length > 0) {
                            wkVar6.parseFrom(bArr3);
                        }
                        pf32.f228015i = wkVar6;
                    }
                    return 0;
                case 7:
                    pf32.f228016j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pf32.f228017n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    pf32.f228018o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
