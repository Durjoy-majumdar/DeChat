package te3;

import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ae */
public class C64230ae extends C49335eu3 {

    /* renamed from: d */
    public int f182067d;

    /* renamed from: e */
    public String f182068e;

    /* renamed from: f */
    public String f182069f;

    /* renamed from: g */
    public String f182070g;

    /* renamed from: h */
    public String f182071h;

    /* renamed from: i */
    public GoodsObject f182072i;

    /* renamed from: j */
    public int f182073j;

    /* renamed from: n */
    public long f182074n;

    /* renamed from: o */
    public int f182075o;

    /* renamed from: p */
    public boolean f182076p = false;

    /* renamed from: q */
    public int f182077q;

    /* renamed from: r */
    public boolean f182078r;

    /* renamed from: s */
    public int f182079s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64230ae)) {
            return false;
        }
        C64230ae aeVar = (C64230ae) aVar;
        return C46238a.m51546a(this.BaseResponse, aeVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f182067d), Integer.valueOf(aeVar.f182067d)) && C46238a.m51546a(this.f182068e, aeVar.f182068e) && C46238a.m51546a(this.f182069f, aeVar.f182069f) && C46238a.m51546a(this.f182070g, aeVar.f182070g) && C46238a.m51546a(this.f182071h, aeVar.f182071h) && C46238a.m51546a(this.f182072i, aeVar.f182072i) && C46238a.m51546a(Integer.valueOf(this.f182073j), Integer.valueOf(aeVar.f182073j)) && C46238a.m51546a(Long.valueOf(this.f182074n), Long.valueOf(aeVar.f182074n)) && C46238a.m51546a(Integer.valueOf(this.f182075o), Integer.valueOf(aeVar.f182075o)) && C46238a.m51546a(Boolean.valueOf(this.f182076p), Boolean.valueOf(aeVar.f182076p)) && C46238a.m51546a(Integer.valueOf(this.f182077q), Integer.valueOf(aeVar.f182077q)) && C46238a.m51546a(Boolean.valueOf(this.f182078r), Boolean.valueOf(aeVar.f182078r)) && C46238a.m51546a(Integer.valueOf(this.f182079s), Integer.valueOf(aeVar.f182079s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f182067d);
                String str = this.f182068e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f182069f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f182070g;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f182071h;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                GoodsObject goodsObject = this.f182072i;
                if (goodsObject != null) {
                    aVar.mo74322i(9, goodsObject.computeSize());
                    this.f182072i.writeFields(aVar);
                }
                aVar.mo74318e(10, this.f182073j);
                aVar.mo74321h(11, this.f182074n);
                aVar.mo74318e(12, this.f182075o);
                aVar.mo74314a(13, this.f182076p);
                aVar.mo74318e(16, this.f182077q);
                aVar.mo74314a(17, this.f182078r);
                aVar.mo74318e(50, this.f182079s);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f182067d);
            String str5 = this.f182068e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f182069f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f182070g;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            String str8 = this.f182071h;
            if (str8 != null) {
                e += C52418a.m58683j(8, str8);
            }
            GoodsObject goodsObject2 = this.f182072i;
            if (goodsObject2 != null) {
                e += C52418a.m58682i(9, goodsObject2.computeSize());
            }
            return e + C52418a.m58678e(10, this.f182073j) + C52418a.m58681h(11, this.f182074n) + C52418a.m58678e(12, this.f182075o) + C52418a.m58674a(13, this.f182076p) + C52418a.m58678e(16, this.f182077q) + C52418a.m58674a(17, this.f182078r) + C52418a.m58678e(50, this.f182079s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64230ae aeVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    aeVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                aeVar.f182067d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                aeVar.f182068e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                aeVar.f182069f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 16) {
                aeVar.f182077q = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 17) {
                aeVar.f182078r = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 50) {
                switch (intValue) {
                    case 7:
                        aeVar.f182070g = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        aeVar.f182071h = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            GoodsObject goodsObject3 = new GoodsObject();
                            if (bArr2 != null && bArr2.length > 0) {
                                goodsObject3.parseFrom(bArr2);
                            }
                            aeVar.f182072i = goodsObject3;
                        }
                        return 0;
                    case 10:
                        aeVar.f182073j = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        aeVar.f182074n = aVar3.mo141631i(intValue);
                        return 0;
                    case 12:
                        aeVar.f182075o = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        aeVar.f182076p = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                aeVar.f182079s = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
