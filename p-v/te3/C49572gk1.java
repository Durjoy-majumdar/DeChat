package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gk1 */
public class C49572gk1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48868bk1> f134088d = new LinkedList<>();

    /* renamed from: e */
    public int f134089e;

    /* renamed from: f */
    public int f134090f;

    /* renamed from: g */
    public LinkedList<FinderObject> f134091g = new LinkedList<>();

    /* renamed from: h */
    public C89349b f134092h;

    /* renamed from: i */
    public String f134093i;

    /* renamed from: j */
    public LinkedList<C51571un1> f134094j = new LinkedList<>();

    /* renamed from: n */
    public int f134095n;

    /* renamed from: o */
    public int f134096o;

    /* renamed from: p */
    public LinkedList<C51817wd1> f134097p = new LinkedList<>();

    /* renamed from: q */
    public int f134098q;

    /* renamed from: r */
    public C49716hk1 f134099r;

    /* renamed from: s */
    public C48727ak1 f134100s;

    /* renamed from: t */
    public LinkedList<C51701vj1> f134101t = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49572gk1)) {
            return false;
        }
        C49572gk1 gk12 = (C49572gk1) aVar;
        return C46238a.m51546a(this.BaseResponse, gk12.BaseResponse) && C46238a.m51546a(this.f134088d, gk12.f134088d) && C46238a.m51546a(Integer.valueOf(this.f134089e), Integer.valueOf(gk12.f134089e)) && C46238a.m51546a(Integer.valueOf(this.f134090f), Integer.valueOf(gk12.f134090f)) && C46238a.m51546a(this.f134091g, gk12.f134091g) && C46238a.m51546a(this.f134092h, gk12.f134092h) && C46238a.m51546a(this.f134093i, gk12.f134093i) && C46238a.m51546a(this.f134094j, gk12.f134094j) && C46238a.m51546a(Integer.valueOf(this.f134095n), Integer.valueOf(gk12.f134095n)) && C46238a.m51546a(Integer.valueOf(this.f134096o), Integer.valueOf(gk12.f134096o)) && C46238a.m51546a(this.f134097p, gk12.f134097p) && C46238a.m51546a(Integer.valueOf(this.f134098q), Integer.valueOf(gk12.f134098q)) && C46238a.m51546a(this.f134099r, gk12.f134099r) && C46238a.m51546a(this.f134100s, gk12.f134100s) && C46238a.m51546a(this.f134101t, gk12.f134101t);
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
            aVar.mo74320g(2, 8, this.f134088d);
            aVar.mo74318e(3, this.f134089e);
            aVar.mo74318e(4, this.f134090f);
            aVar.mo74320g(5, 8, this.f134091g);
            C89349b bVar = this.f134092h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            String str = this.f134093i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74320g(8, 8, this.f134094j);
            aVar.mo74318e(9, this.f134095n);
            aVar.mo74318e(10, this.f134096o);
            aVar.mo74320g(11, 8, this.f134097p);
            aVar.mo74318e(12, this.f134098q);
            C49716hk1 hk12 = this.f134099r;
            if (hk12 != null) {
                aVar.mo74322i(13, hk12.computeSize());
                this.f134099r.writeFields(aVar);
            }
            C48727ak1 ak12 = this.f134100s;
            if (ak12 != null) {
                aVar.mo74322i(14, ak12.computeSize());
                this.f134100s.writeFields(aVar);
            }
            aVar.mo74320g(15, 8, this.f134101t);
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f134088d) + C52418a.m58678e(3, this.f134089e) + C52418a.m58678e(4, this.f134090f) + C52418a.m58680g(5, 8, this.f134091g);
            C89349b bVar2 = this.f134092h;
            if (bVar2 != null) {
                g += C52418a.m58675b(6, bVar2);
            }
            String str2 = this.f134093i;
            if (str2 != null) {
                g += C52418a.m58683j(7, str2);
            }
            int g2 = g + C52418a.m58680g(8, 8, this.f134094j) + C52418a.m58678e(9, this.f134095n) + C52418a.m58678e(10, this.f134096o) + C52418a.m58680g(11, 8, this.f134097p) + C52418a.m58678e(12, this.f134098q);
            C49716hk1 hk13 = this.f134099r;
            if (hk13 != null) {
                g2 += C52418a.m58682i(13, hk13.computeSize());
            }
            C48727ak1 ak13 = this.f134100s;
            if (ak13 != null) {
                g2 += C52418a.m58682i(14, ak13.computeSize());
            }
            return g2 + C52418a.m58680g(15, 8, this.f134101t);
        } else if (i2 == 2) {
            this.f134088d.clear();
            this.f134091g.clear();
            this.f134094j.clear();
            this.f134097p.clear();
            this.f134101t.clear();
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
            C49572gk1 gk12 = objArr[1];
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
                        gk12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48868bk1 bk12 = new C48868bk1();
                        if (bArr2 != null && bArr2.length > 0) {
                            bk12.parseFrom(bArr2);
                        }
                        gk12.f134088d.add(bk12);
                    }
                    return 0;
                case 3:
                    gk12.f134089e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gk12.f134090f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        FinderObject finderObject = new FinderObject();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderObject.parseFrom(bArr3);
                        }
                        gk12.f134091g.add(finderObject);
                    }
                    return 0;
                case 6:
                    gk12.f134092h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    gk12.f134093i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51571un1 un12 = new C51571un1();
                        if (bArr4 != null && bArr4.length > 0) {
                            un12.parseFrom(bArr4);
                        }
                        gk12.f134094j.add(un12);
                    }
                    return 0;
                case 9:
                    gk12.f134095n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    gk12.f134096o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51817wd1 wd12 = new C51817wd1();
                        if (bArr5 != null && bArr5.length > 0) {
                            wd12.parseFrom(bArr5);
                        }
                        gk12.f134097p.add(wd12);
                    }
                    return 0;
                case 12:
                    gk12.f134098q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49716hk1 hk14 = new C49716hk1();
                        if (bArr6 != null && bArr6.length > 0) {
                            hk14.parseFrom(bArr6);
                        }
                        gk12.f134099r = hk14;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C48727ak1 ak14 = new C48727ak1();
                        if (bArr7 != null && bArr7.length > 0) {
                            ak14.parseFrom(bArr7);
                        }
                        gk12.f134100s = ak14;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51701vj1 vj12 = new C51701vj1();
                        if (bArr8 != null && bArr8.length > 0) {
                            vj12.parseFrom(bArr8);
                        }
                        gk12.f134101t.add(vj12);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
