package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u01 */
public class C51474u01 extends C49335eu3 {

    /* renamed from: d */
    public C52306zt3 f142514d;

    /* renamed from: e */
    public LinkedList<C52306zt3> f142515e = new LinkedList<>();

    /* renamed from: f */
    public C52306zt3 f142516f;

    /* renamed from: g */
    public String f142517g;

    /* renamed from: h */
    public String f142518h;

    /* renamed from: i */
    public String f142519i;

    /* renamed from: j */
    public C52306zt3 f142520j;

    /* renamed from: n */
    public C51390tf3 f142521n;

    /* renamed from: o */
    public C51390tf3 f142522o;

    /* renamed from: p */
    public String f142523p;

    /* renamed from: q */
    public int f142524q;

    /* renamed from: r */
    public int f142525r;

    /* renamed from: s */
    public int f142526s;

    /* renamed from: t */
    public int f142527t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51474u01)) {
            return false;
        }
        C51474u01 u012 = (C51474u01) aVar;
        return C46238a.m51546a(this.BaseResponse, u012.BaseResponse) && C46238a.m51546a(this.f142514d, u012.f142514d) && C46238a.m51546a(this.f142515e, u012.f142515e) && C46238a.m51546a(this.f142516f, u012.f142516f) && C46238a.m51546a(this.f142517g, u012.f142517g) && C46238a.m51546a(this.f142518h, u012.f142518h) && C46238a.m51546a(this.f142519i, u012.f142519i) && C46238a.m51546a(this.f142520j, u012.f142520j) && C46238a.m51546a(this.f142521n, u012.f142521n) && C46238a.m51546a(this.f142522o, u012.f142522o) && C46238a.m51546a(this.f142523p, u012.f142523p) && C46238a.m51546a(Integer.valueOf(this.f142524q), Integer.valueOf(u012.f142524q)) && C46238a.m51546a(Integer.valueOf(this.f142525r), Integer.valueOf(u012.f142525r)) && C46238a.m51546a(Integer.valueOf(this.f142526s), Integer.valueOf(u012.f142526s)) && C46238a.m51546a(Integer.valueOf(this.f142527t), Integer.valueOf(u012.f142527t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C52306zt3 zt32 = this.f142514d;
            if (zt32 != null) {
                aVar.mo74322i(2, zt32.computeSize());
                this.f142514d.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f142515e);
            C52306zt3 zt33 = this.f142516f;
            if (zt33 != null) {
                aVar.mo74322i(4, zt33.computeSize());
                this.f142516f.writeFields(aVar);
            }
            String str = this.f142517g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f142518h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f142519i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            C52306zt3 zt34 = this.f142520j;
            if (zt34 != null) {
                aVar.mo74322i(8, zt34.computeSize());
                this.f142520j.writeFields(aVar);
            }
            C51390tf3 tf32 = this.f142521n;
            if (tf32 != null) {
                aVar.mo74322i(9, tf32.computeSize());
                this.f142521n.writeFields(aVar);
            }
            C51390tf3 tf33 = this.f142522o;
            if (tf33 != null) {
                aVar.mo74322i(10, tf33.computeSize());
                this.f142522o.writeFields(aVar);
            }
            String str4 = this.f142523p;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            aVar.mo74318e(12, this.f142524q);
            aVar.mo74318e(13, this.f142525r);
            aVar.mo74318e(14, this.f142526s);
            aVar.mo74318e(15, this.f142527t);
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C52306zt3 zt35 = this.f142514d;
            if (zt35 != null) {
                i3 += C52418a.m58682i(2, zt35.computeSize());
            }
            int g = i3 + C52418a.m58680g(3, 8, this.f142515e);
            C52306zt3 zt36 = this.f142516f;
            if (zt36 != null) {
                g += C52418a.m58682i(4, zt36.computeSize());
            }
            String str5 = this.f142517g;
            if (str5 != null) {
                g += C52418a.m58683j(5, str5);
            }
            String str6 = this.f142518h;
            if (str6 != null) {
                g += C52418a.m58683j(6, str6);
            }
            String str7 = this.f142519i;
            if (str7 != null) {
                g += C52418a.m58683j(7, str7);
            }
            C52306zt3 zt37 = this.f142520j;
            if (zt37 != null) {
                g += C52418a.m58682i(8, zt37.computeSize());
            }
            C51390tf3 tf34 = this.f142521n;
            if (tf34 != null) {
                g += C52418a.m58682i(9, tf34.computeSize());
            }
            C51390tf3 tf35 = this.f142522o;
            if (tf35 != null) {
                g += C52418a.m58682i(10, tf35.computeSize());
            }
            String str8 = this.f142523p;
            if (str8 != null) {
                g += C52418a.m58683j(11, str8);
            }
            return g + C52418a.m58678e(12, this.f142524q) + C52418a.m58678e(13, this.f142525r) + C52418a.m58678e(14, this.f142526s) + C52418a.m58678e(15, this.f142527t);
        } else if (i2 == 2) {
            this.f142515e.clear();
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
            C51474u01 u012 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        u012.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52306zt3 zt38 = new C52306zt3();
                        if (bArr2 != null && bArr2.length > 0) {
                            zt38.parseFrom(bArr2);
                        }
                        u012.f142514d = zt38;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C52306zt3 zt39 = new C52306zt3();
                        if (bArr3 != null && bArr3.length > 0) {
                            zt39.parseFrom(bArr3);
                        }
                        u012.f142515e.add(zt39);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C52306zt3 zt310 = new C52306zt3();
                        if (bArr4 != null && bArr4.length > 0) {
                            zt310.parseFrom(bArr4);
                        }
                        u012.f142516f = zt310;
                    }
                    return 0;
                case 5:
                    u012.f142517g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    u012.f142518h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    u012.f142519i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C52306zt3 zt311 = new C52306zt3();
                        if (bArr5 != null && bArr5.length > 0) {
                            zt311.parseFrom(bArr5);
                        }
                        u012.f142520j = zt311;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51390tf3 tf36 = new C51390tf3();
                        if (bArr6 != null && bArr6.length > 0) {
                            tf36.parseFrom(bArr6);
                        }
                        u012.f142521n = tf36;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51390tf3 tf37 = new C51390tf3();
                        if (bArr7 != null && bArr7.length > 0) {
                            tf37.parseFrom(bArr7);
                        }
                        u012.f142522o = tf37;
                    }
                    return 0;
                case 11:
                    u012.f142523p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    u012.f142524q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    u012.f142525r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    u012.f142526s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    u012.f142527t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
