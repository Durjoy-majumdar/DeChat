package te3;

import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.td */
public class C51378td extends C47465a {

    /* renamed from: d */
    public int f142124d;

    /* renamed from: e */
    public GoodsObject f142125e;

    /* renamed from: f */
    public float f142126f;

    /* renamed from: g */
    public String f142127g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51378td)) {
            return false;
        }
        C51378td tdVar = (C51378td) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142124d), Integer.valueOf(tdVar.f142124d)) && C46238a.m51546a(this.f142125e, tdVar.f142125e) && C46238a.m51546a(Float.valueOf(this.f142126f), Float.valueOf(tdVar.f142126f)) && C46238a.m51546a(this.f142127g, tdVar.f142127g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142124d);
            GoodsObject goodsObject = this.f142125e;
            if (goodsObject != null) {
                aVar.mo74322i(2, goodsObject.computeSize());
                this.f142125e.writeFields(aVar);
            }
            aVar.mo74317d(3, this.f142126f);
            String str = this.f142127g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142124d) + 0;
            GoodsObject goodsObject2 = this.f142125e;
            if (goodsObject2 != null) {
                e += C52418a.m58682i(2, goodsObject2.computeSize());
            }
            int d = e + C52418a.m58677d(3, this.f142126f);
            String str2 = this.f142127g;
            return str2 != null ? d + C52418a.m58683j(4, str2) : d;
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
            C51378td tdVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tdVar.f142124d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    GoodsObject goodsObject3 = new GoodsObject();
                    if (bArr != null && bArr.length > 0) {
                        goodsObject3.parseFrom(bArr);
                    }
                    tdVar.f142125e = goodsObject3;
                }
                return 0;
            } else if (intValue == 3) {
                tdVar.f142126f = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                tdVar.f142127g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
