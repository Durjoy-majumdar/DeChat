package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class id4 extends C101820nt3 {

    /* renamed from: d */
    public String f63962d;

    /* renamed from: e */
    public int f63963e;

    /* renamed from: f */
    public LinkedList<hd4> f63964f = new LinkedList<>();

    /* renamed from: g */
    public int f63965g;

    /* renamed from: h */
    public String f63966h;

    /* renamed from: i */
    public int f63967i;

    /* renamed from: j */
    public int f63968j;

    /* renamed from: n */
    public String f63969n;

    /* renamed from: o */
    public C89349b f63970o;

    /* renamed from: p */
    public C64710sf3 f63971p;

    /* renamed from: q */
    public int f63972q;

    /* renamed from: r */
    public int f63973r;

    /* renamed from: s */
    public String f63974s;

    /* renamed from: t */
    public String f63975t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof id4)) {
            return false;
        }
        id4 id4 = (id4) aVar;
        return C46238a.m51546a(this.BaseRequest, id4.BaseRequest) && C46238a.m51546a(this.f63962d, id4.f63962d) && C46238a.m51546a(Integer.valueOf(this.f63963e), Integer.valueOf(id4.f63963e)) && C46238a.m51546a(this.f63964f, id4.f63964f) && C46238a.m51546a(Integer.valueOf(this.f63965g), Integer.valueOf(id4.f63965g)) && C46238a.m51546a(this.f63966h, id4.f63966h) && C46238a.m51546a(Integer.valueOf(this.f63967i), Integer.valueOf(id4.f63967i)) && C46238a.m51546a(Integer.valueOf(this.f63968j), Integer.valueOf(id4.f63968j)) && C46238a.m51546a(this.f63969n, id4.f63969n) && C46238a.m51546a(this.f63970o, id4.f63970o) && C46238a.m51546a(this.f63971p, id4.f63971p) && C46238a.m51546a(Integer.valueOf(this.f63972q), Integer.valueOf(id4.f63972q)) && C46238a.m51546a(Integer.valueOf(this.f63973r), Integer.valueOf(id4.f63973r)) && C46238a.m51546a(this.f63974s, id4.f63974s) && C46238a.m51546a(this.f63975t, id4.f63975t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f63962d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f63963e);
            aVar.mo74320g(4, 8, this.f63964f);
            aVar.mo74318e(5, this.f63965g);
            String str2 = this.f63966h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f63967i);
            aVar.mo74318e(8, this.f63968j);
            String str3 = this.f63969n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            C89349b bVar = this.f63970o;
            if (bVar != null) {
                aVar.mo74315b(10, bVar);
            }
            C64710sf3 sf32 = this.f63971p;
            if (sf32 != null) {
                aVar.mo74322i(11, sf32.computeSize());
                this.f63971p.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f63972q);
            aVar.mo74318e(13, this.f63973r);
            String str4 = this.f63974s;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            String str5 = this.f63975t;
            if (str5 != null) {
                aVar.mo74323j(15, str5);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str6 = this.f63962d;
            if (str6 != null) {
                i3 += C52418a.m58683j(2, str6);
            }
            int e = i3 + C52418a.m58678e(3, this.f63963e) + C52418a.m58680g(4, 8, this.f63964f) + C52418a.m58678e(5, this.f63965g);
            String str7 = this.f63966h;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            int e2 = e + C52418a.m58678e(7, this.f63967i) + C52418a.m58678e(8, this.f63968j);
            String str8 = this.f63969n;
            if (str8 != null) {
                e2 += C52418a.m58683j(9, str8);
            }
            C89349b bVar2 = this.f63970o;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(10, bVar2);
            }
            C64710sf3 sf33 = this.f63971p;
            if (sf33 != null) {
                e2 += C52418a.m58682i(11, sf33.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(12, this.f63972q) + C52418a.m58678e(13, this.f63973r);
            String str9 = this.f63974s;
            if (str9 != null) {
                e3 += C52418a.m58683j(14, str9);
            }
            String str10 = this.f63975t;
            return str10 != null ? e3 + C52418a.m58683j(15, str10) : e3;
        } else if (i2 == 2) {
            this.f63964f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            id4 id4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        id4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    id4.f63962d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    id4.f63963e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        hd4 hd4 = new hd4();
                        if (bArr2 != null && bArr2.length > 0) {
                            hd4.parseFrom(bArr2);
                        }
                        id4.f63964f.add(hd4);
                    }
                    return 0;
                case 5:
                    id4.f63965g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    id4.f63966h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    id4.f63967i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    id4.f63968j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    id4.f63969n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    id4.f63970o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64710sf3 sf34 = new C64710sf3();
                        if (bArr3 != null && bArr3.length > 0) {
                            sf34.parseFrom(bArr3);
                        }
                        id4.f63971p = sf34;
                    }
                    return 0;
                case 12:
                    id4.f63972q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    id4.f63973r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    id4.f63974s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    id4.f63975t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
