package te3;

import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ge */
public class C49547ge extends C49335eu3 {

    /* renamed from: d */
    public int f133986d;

    /* renamed from: e */
    public String f133987e;

    /* renamed from: f */
    public String f133988f;

    /* renamed from: g */
    public GoodsObject f133989g;

    /* renamed from: h */
    public long f133990h;

    /* renamed from: i */
    public int f133991i;

    /* renamed from: j */
    public int f133992j;

    /* renamed from: n */
    public String f133993n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49547ge)) {
            return false;
        }
        C49547ge geVar = (C49547ge) aVar;
        return C46238a.m51546a(this.BaseResponse, geVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133986d), Integer.valueOf(geVar.f133986d)) && C46238a.m51546a(this.f133987e, geVar.f133987e) && C46238a.m51546a(this.f133988f, geVar.f133988f) && C46238a.m51546a(this.f133989g, geVar.f133989g) && C46238a.m51546a(Long.valueOf(this.f133990h), Long.valueOf(geVar.f133990h)) && C46238a.m51546a(Integer.valueOf(this.f133991i), Integer.valueOf(geVar.f133991i)) && C46238a.m51546a(Integer.valueOf(this.f133992j), Integer.valueOf(geVar.f133992j)) && C46238a.m51546a(this.f133993n, geVar.f133993n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f133986d);
                String str = this.f133987e;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                String str2 = this.f133988f;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                GoodsObject goodsObject = this.f133989g;
                if (goodsObject != null) {
                    aVar.mo74322i(9, goodsObject.computeSize());
                    this.f133989g.writeFields(aVar);
                }
                aVar.mo74321h(11, this.f133990h);
                aVar.mo74318e(14, this.f133991i);
                aVar.mo74318e(15, this.f133992j);
                String str3 = this.f133993n;
                if (str3 != null) {
                    aVar.mo74323j(21, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133986d);
            String str4 = this.f133987e;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            String str5 = this.f133988f;
            if (str5 != null) {
                e += C52418a.m58683j(8, str5);
            }
            GoodsObject goodsObject2 = this.f133989g;
            if (goodsObject2 != null) {
                e += C52418a.m58682i(9, goodsObject2.computeSize());
            }
            int h = e + C52418a.m58681h(11, this.f133990h) + C52418a.m58678e(14, this.f133991i) + C52418a.m58678e(15, this.f133992j);
            String str6 = this.f133993n;
            return str6 != null ? h + C52418a.m58683j(21, str6) : h;
        } else if (i == 2) {
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49547ge geVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    geVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                geVar.f133986d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 7) {
                geVar.f133987e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 8) {
                geVar.f133988f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 9) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    GoodsObject goodsObject3 = new GoodsObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        goodsObject3.parseFrom(bArr2);
                    }
                    geVar.f133989g = goodsObject3;
                }
                return 0;
            } else if (intValue == 11) {
                geVar.f133990h = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 21) {
                geVar.f133993n = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 14) {
                geVar.f133991i = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 15) {
                return -1;
            } else {
                geVar.f133992j = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
