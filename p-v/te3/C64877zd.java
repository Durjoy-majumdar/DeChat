package te3;

import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zd */
public class C64877zd extends C101820nt3 {

    /* renamed from: d */
    public C89349b f186653d;

    /* renamed from: e */
    public int f186654e;

    /* renamed from: f */
    public int f186655f;

    /* renamed from: g */
    public String f186656g;

    /* renamed from: h */
    public String f186657h;

    /* renamed from: i */
    public String f186658i;

    /* renamed from: j */
    public int f186659j;

    /* renamed from: n */
    public int f186660n;

    /* renamed from: o */
    public long f186661o;

    /* renamed from: p */
    public boolean f186662p;

    /* renamed from: q */
    public boolean f186663q;

    /* renamed from: r */
    public GoodsObject f186664r;

    /* renamed from: s */
    public int f186665s;

    /* renamed from: t */
    public int f186666t;

    /* renamed from: u */
    public C64852yd f186667u;

    /* renamed from: v */
    public C64799wd f186668v;

    /* renamed from: w */
    public C51957xd f186669w;

    /* renamed from: x */
    public long f186670x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64877zd)) {
            return false;
        }
        C64877zd zdVar = (C64877zd) aVar;
        return C46238a.m51546a(this.BaseRequest, zdVar.BaseRequest) && C46238a.m51546a(this.f186653d, zdVar.f186653d) && C46238a.m51546a(Integer.valueOf(this.f186654e), Integer.valueOf(zdVar.f186654e)) && C46238a.m51546a(Integer.valueOf(this.f186655f), Integer.valueOf(zdVar.f186655f)) && C46238a.m51546a(this.f186656g, zdVar.f186656g) && C46238a.m51546a(this.f186657h, zdVar.f186657h) && C46238a.m51546a(this.f186658i, zdVar.f186658i) && C46238a.m51546a(Integer.valueOf(this.f186659j), Integer.valueOf(zdVar.f186659j)) && C46238a.m51546a(Integer.valueOf(this.f186660n), Integer.valueOf(zdVar.f186660n)) && C46238a.m51546a(Long.valueOf(this.f186661o), Long.valueOf(zdVar.f186661o)) && C46238a.m51546a(Boolean.valueOf(this.f186662p), Boolean.valueOf(zdVar.f186662p)) && C46238a.m51546a(Boolean.valueOf(this.f186663q), Boolean.valueOf(zdVar.f186663q)) && C46238a.m51546a(this.f186664r, zdVar.f186664r) && C46238a.m51546a(Integer.valueOf(this.f186665s), Integer.valueOf(zdVar.f186665s)) && C46238a.m51546a(Integer.valueOf(this.f186666t), Integer.valueOf(zdVar.f186666t)) && C46238a.m51546a(this.f186667u, zdVar.f186667u) && C46238a.m51546a(this.f186668v, zdVar.f186668v) && C46238a.m51546a(this.f186669w, zdVar.f186669w) && C46238a.m51546a(Long.valueOf(this.f186670x), Long.valueOf(zdVar.f186670x));
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
            C89349b bVar = this.f186653d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(11, this.f186654e);
            aVar.mo74318e(12, this.f186655f);
            String str = this.f186656g;
            if (str != null) {
                aVar.mo74323j(13, str);
            }
            String str2 = this.f186657h;
            if (str2 != null) {
                aVar.mo74323j(14, str2);
            }
            String str3 = this.f186658i;
            if (str3 != null) {
                aVar.mo74323j(15, str3);
            }
            aVar.mo74318e(16, this.f186659j);
            aVar.mo74318e(17, this.f186660n);
            aVar.mo74321h(18, this.f186661o);
            aVar.mo74314a(19, this.f186662p);
            aVar.mo74314a(20, this.f186663q);
            GoodsObject goodsObject = this.f186664r;
            if (goodsObject != null) {
                aVar.mo74322i(21, goodsObject.computeSize());
                this.f186664r.writeFields(aVar);
            }
            aVar.mo74318e(22, this.f186665s);
            aVar.mo74318e(23, this.f186666t);
            C64852yd ydVar = this.f186667u;
            if (ydVar != null) {
                aVar.mo74322i(26, ydVar.computeSize());
                this.f186667u.writeFields(aVar);
            }
            C64799wd wdVar = this.f186668v;
            if (wdVar != null) {
                aVar.mo74322i(31, wdVar.computeSize());
                this.f186668v.writeFields(aVar);
            }
            C51957xd xdVar = this.f186669w;
            if (xdVar != null) {
                aVar.mo74322i(32, xdVar.computeSize());
                this.f186669w.writeFields(aVar);
            }
            aVar.mo74321h(50, this.f186670x);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C89349b bVar2 = this.f186653d;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(2, bVar2);
            }
            int e = i3 + C52418a.m58678e(11, this.f186654e) + C52418a.m58678e(12, this.f186655f);
            String str4 = this.f186656g;
            if (str4 != null) {
                e += C52418a.m58683j(13, str4);
            }
            String str5 = this.f186657h;
            if (str5 != null) {
                e += C52418a.m58683j(14, str5);
            }
            String str6 = this.f186658i;
            if (str6 != null) {
                e += C52418a.m58683j(15, str6);
            }
            int e2 = e + C52418a.m58678e(16, this.f186659j) + C52418a.m58678e(17, this.f186660n) + C52418a.m58681h(18, this.f186661o) + C52418a.m58674a(19, this.f186662p) + C52418a.m58674a(20, this.f186663q);
            GoodsObject goodsObject2 = this.f186664r;
            if (goodsObject2 != null) {
                e2 += C52418a.m58682i(21, goodsObject2.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(22, this.f186665s) + C52418a.m58678e(23, this.f186666t);
            C64852yd ydVar2 = this.f186667u;
            if (ydVar2 != null) {
                e3 += C52418a.m58682i(26, ydVar2.computeSize());
            }
            C64799wd wdVar2 = this.f186668v;
            if (wdVar2 != null) {
                e3 += C52418a.m58682i(31, wdVar2.computeSize());
            }
            C51957xd xdVar2 = this.f186669w;
            if (xdVar2 != null) {
                e3 += C52418a.m58682i(32, xdVar2.computeSize());
            }
            return e3 + C52418a.m58681h(50, this.f186670x);
        } else if (i2 == 2) {
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
            C64877zd zdVar = objArr[1];
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
                    zdVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zdVar.f186653d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 26) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    byte[] bArr2 = j2.get(i5);
                    C64852yd ydVar3 = new C64852yd();
                    if (bArr2 != null && bArr2.length > 0) {
                        ydVar3.parseFrom(bArr2);
                    }
                    zdVar.f186667u = ydVar3;
                }
                return 0;
            } else if (intValue == 50) {
                zdVar.f186670x = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 31) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    byte[] bArr3 = j3.get(i6);
                    C64799wd wdVar3 = new C64799wd();
                    if (bArr3 != null && bArr3.length > 0) {
                        wdVar3.parseFrom(bArr3);
                    }
                    zdVar.f186668v = wdVar3;
                }
                return 0;
            } else if (intValue != 32) {
                switch (intValue) {
                    case 11:
                        zdVar.f186654e = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        zdVar.f186655f = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        zdVar.f186656g = aVar3.mo141633k(intValue);
                        return 0;
                    case 14:
                        zdVar.f186657h = aVar3.mo141633k(intValue);
                        return 0;
                    case 15:
                        zdVar.f186658i = aVar3.mo141633k(intValue);
                        return 0;
                    case 16:
                        zdVar.f186659j = aVar3.mo141629g(intValue);
                        return 0;
                    case 17:
                        zdVar.f186660n = aVar3.mo141629g(intValue);
                        return 0;
                    case 18:
                        zdVar.f186661o = aVar3.mo141631i(intValue);
                        return 0;
                    case 19:
                        zdVar.f186662p = aVar3.mo141625c(intValue);
                        return 0;
                    case 20:
                        zdVar.f186663q = aVar3.mo141625c(intValue);
                        return 0;
                    case 21:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            GoodsObject goodsObject3 = new GoodsObject();
                            if (bArr4 != null && bArr4.length > 0) {
                                goodsObject3.parseFrom(bArr4);
                            }
                            zdVar.f186664r = goodsObject3;
                        }
                        return 0;
                    case 22:
                        zdVar.f186665s = aVar3.mo141629g(intValue);
                        return 0;
                    case 23:
                        zdVar.f186666t = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i8 = 0; i8 < size5; i8++) {
                    byte[] bArr5 = j5.get(i8);
                    C51957xd xdVar3 = new C51957xd();
                    if (bArr5 != null && bArr5.length > 0) {
                        xdVar3.parseFrom(bArr5);
                    }
                    zdVar.f186669w = xdVar3;
                }
                return 0;
            }
        }
    }
}
