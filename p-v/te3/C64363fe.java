package te3;

import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fe */
public class C64363fe extends C101820nt3 {

    /* renamed from: d */
    public C89349b f183111d;

    /* renamed from: e */
    public int f183112e;

    /* renamed from: f */
    public int f183113f;

    /* renamed from: g */
    public long f183114g;

    /* renamed from: h */
    public GoodsObject f183115h;

    /* renamed from: i */
    public int f183116i;

    /* renamed from: j */
    public C64421he f183117j;

    /* renamed from: n */
    public C64852yd f183118n;

    /* renamed from: o */
    public long f183119o;

    /* renamed from: p */
    public String f183120p;

    /* renamed from: q */
    public String f183121q;

    /* renamed from: r */
    public String f183122r;

    /* renamed from: s */
    public String f183123s;

    /* renamed from: t */
    public String f183124t;

    /* renamed from: u */
    public int f183125u;

    /* renamed from: v */
    public int f183126v;

    /* renamed from: w */
    public LinkedList<C101856vd> f183127w = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64363fe)) {
            return false;
        }
        C64363fe feVar = (C64363fe) aVar;
        return C46238a.m51546a(this.BaseRequest, feVar.BaseRequest) && C46238a.m51546a(this.f183111d, feVar.f183111d) && C46238a.m51546a(Integer.valueOf(this.f183112e), Integer.valueOf(feVar.f183112e)) && C46238a.m51546a(Integer.valueOf(this.f183113f), Integer.valueOf(feVar.f183113f)) && C46238a.m51546a(Long.valueOf(this.f183114g), Long.valueOf(feVar.f183114g)) && C46238a.m51546a(this.f183115h, feVar.f183115h) && C46238a.m51546a(Integer.valueOf(this.f183116i), Integer.valueOf(feVar.f183116i)) && C46238a.m51546a(this.f183117j, feVar.f183117j) && C46238a.m51546a(this.f183118n, feVar.f183118n) && C46238a.m51546a(Long.valueOf(this.f183119o), Long.valueOf(feVar.f183119o)) && C46238a.m51546a(this.f183120p, feVar.f183120p) && C46238a.m51546a(this.f183121q, feVar.f183121q) && C46238a.m51546a(this.f183122r, feVar.f183122r) && C46238a.m51546a(this.f183123s, feVar.f183123s) && C46238a.m51546a(this.f183124t, feVar.f183124t) && C46238a.m51546a(Integer.valueOf(this.f183125u), Integer.valueOf(feVar.f183125u)) && C46238a.m51546a(Integer.valueOf(this.f183126v), Integer.valueOf(feVar.f183126v)) && C46238a.m51546a(this.f183127w, feVar.f183127w);
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
            C89349b bVar = this.f183111d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(11, this.f183112e);
            aVar.mo74318e(12, this.f183113f);
            aVar.mo74321h(18, this.f183114g);
            GoodsObject goodsObject = this.f183115h;
            if (goodsObject != null) {
                aVar.mo74322i(21, goodsObject.computeSize());
                this.f183115h.writeFields(aVar);
            }
            aVar.mo74318e(22, this.f183116i);
            C64421he heVar = this.f183117j;
            if (heVar != null) {
                aVar.mo74322i(23, heVar.computeSize());
                this.f183117j.writeFields(aVar);
            }
            C64852yd ydVar = this.f183118n;
            if (ydVar != null) {
                aVar.mo74322i(26, ydVar.computeSize());
                this.f183118n.writeFields(aVar);
            }
            aVar.mo74321h(27, this.f183119o);
            String str = this.f183120p;
            if (str != null) {
                aVar.mo74323j(28, str);
            }
            String str2 = this.f183121q;
            if (str2 != null) {
                aVar.mo74323j(29, str2);
            }
            String str3 = this.f183122r;
            if (str3 != null) {
                aVar.mo74323j(30, str3);
            }
            String str4 = this.f183123s;
            if (str4 != null) {
                aVar.mo74323j(31, str4);
            }
            String str5 = this.f183124t;
            if (str5 != null) {
                aVar.mo74323j(32, str5);
            }
            aVar.mo74318e(33, this.f183125u);
            aVar.mo74318e(34, this.f183126v);
            aVar.mo74320g(35, 8, this.f183127w);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C89349b bVar2 = this.f183111d;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(2, bVar2);
            }
            int e = i3 + C52418a.m58678e(11, this.f183112e) + C52418a.m58678e(12, this.f183113f) + C52418a.m58681h(18, this.f183114g);
            GoodsObject goodsObject2 = this.f183115h;
            if (goodsObject2 != null) {
                e += C52418a.m58682i(21, goodsObject2.computeSize());
            }
            int e2 = e + C52418a.m58678e(22, this.f183116i);
            C64421he heVar2 = this.f183117j;
            if (heVar2 != null) {
                e2 += C52418a.m58682i(23, heVar2.computeSize());
            }
            C64852yd ydVar2 = this.f183118n;
            if (ydVar2 != null) {
                e2 += C52418a.m58682i(26, ydVar2.computeSize());
            }
            int h = e2 + C52418a.m58681h(27, this.f183119o);
            String str6 = this.f183120p;
            if (str6 != null) {
                h += C52418a.m58683j(28, str6);
            }
            String str7 = this.f183121q;
            if (str7 != null) {
                h += C52418a.m58683j(29, str7);
            }
            String str8 = this.f183122r;
            if (str8 != null) {
                h += C52418a.m58683j(30, str8);
            }
            String str9 = this.f183123s;
            if (str9 != null) {
                h += C52418a.m58683j(31, str9);
            }
            String str10 = this.f183124t;
            if (str10 != null) {
                h += C52418a.m58683j(32, str10);
            }
            return h + C52418a.m58678e(33, this.f183125u) + C52418a.m58678e(34, this.f183126v) + C52418a.m58680g(35, 8, this.f183127w);
        } else if (i2 == 2) {
            this.f183127w.clear();
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
            C64363fe feVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    feVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                feVar.f183111d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 11) {
                feVar.f183112e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 12) {
                feVar.f183113f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 18) {
                switch (intValue) {
                    case 21:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            GoodsObject goodsObject3 = new GoodsObject();
                            if (bArr2 != null && bArr2.length > 0) {
                                goodsObject3.parseFrom(bArr2);
                            }
                            feVar.f183115h = goodsObject3;
                        }
                        return 0;
                    case 22:
                        feVar.f183116i = aVar3.mo141629g(intValue);
                        return 0;
                    case 23:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C64421he heVar3 = new C64421he();
                            if (bArr3 != null && bArr3.length > 0) {
                                heVar3.parseFrom(bArr3);
                            }
                            feVar.f183117j = heVar3;
                        }
                        return 0;
                    default:
                        switch (intValue) {
                            case 26:
                                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                                int size4 = j4.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    byte[] bArr4 = j4.get(i7);
                                    C64852yd ydVar3 = new C64852yd();
                                    if (bArr4 != null && bArr4.length > 0) {
                                        ydVar3.parseFrom(bArr4);
                                    }
                                    feVar.f183118n = ydVar3;
                                }
                                return 0;
                            case 27:
                                feVar.f183119o = aVar3.mo141631i(intValue);
                                return 0;
                            case 28:
                                feVar.f183120p = aVar3.mo141633k(intValue);
                                return 0;
                            case 29:
                                feVar.f183121q = aVar3.mo141633k(intValue);
                                return 0;
                            case 30:
                                feVar.f183122r = aVar3.mo141633k(intValue);
                                return 0;
                            case 31:
                                feVar.f183123s = aVar3.mo141633k(intValue);
                                return 0;
                            case 32:
                                feVar.f183124t = aVar3.mo141633k(intValue);
                                return 0;
                            case 33:
                                feVar.f183125u = aVar3.mo141629g(intValue);
                                return 0;
                            case 34:
                                feVar.f183126v = aVar3.mo141629g(intValue);
                                return 0;
                            case 35:
                                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                                int size5 = j5.size();
                                for (int i8 = 0; i8 < size5; i8++) {
                                    byte[] bArr5 = j5.get(i8);
                                    C101856vd vdVar = new C101856vd();
                                    if (bArr5 != null && bArr5.length > 0) {
                                        vdVar.parseFrom(bArr5);
                                    }
                                    feVar.f183127w.add(vdVar);
                                }
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                feVar.f183114g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
