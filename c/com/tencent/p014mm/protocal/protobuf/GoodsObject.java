package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.GoodsObject */
public class GoodsObject extends C47465a {
    public float center_x;
    public float center_y;
    public int maxx;
    public int maxy;
    public int minx;
    public int miny;
    public float obj_h;
    public float obj_w;
    public float relative_maxx;
    public float relative_maxy;
    public float relative_minx;
    public float relative_miny;
    public float score;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GoodsObject)) {
            return false;
        }
        GoodsObject goodsObject = (GoodsObject) aVar;
        return C46238a.m51546a(Float.valueOf(this.relative_minx), Float.valueOf(goodsObject.relative_minx)) && C46238a.m51546a(Float.valueOf(this.relative_miny), Float.valueOf(goodsObject.relative_miny)) && C46238a.m51546a(Float.valueOf(this.relative_maxx), Float.valueOf(goodsObject.relative_maxx)) && C46238a.m51546a(Float.valueOf(this.relative_maxy), Float.valueOf(goodsObject.relative_maxy)) && C46238a.m51546a(Float.valueOf(this.score), Float.valueOf(goodsObject.score)) && C46238a.m51546a(Integer.valueOf(this.minx), Integer.valueOf(goodsObject.minx)) && C46238a.m51546a(Integer.valueOf(this.miny), Integer.valueOf(goodsObject.miny)) && C46238a.m51546a(Integer.valueOf(this.maxx), Integer.valueOf(goodsObject.maxx)) && C46238a.m51546a(Integer.valueOf(this.maxy), Integer.valueOf(goodsObject.maxy)) && C46238a.m51546a(Float.valueOf(this.center_x), Float.valueOf(goodsObject.center_x)) && C46238a.m51546a(Float.valueOf(this.center_y), Float.valueOf(goodsObject.center_y)) && C46238a.m51546a(Float.valueOf(this.obj_w), Float.valueOf(goodsObject.obj_w)) && C46238a.m51546a(Float.valueOf(this.obj_h), Float.valueOf(goodsObject.obj_h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.relative_minx);
            aVar.mo74317d(2, this.relative_miny);
            aVar.mo74317d(3, this.relative_maxx);
            aVar.mo74317d(4, this.relative_maxy);
            aVar.mo74317d(5, this.score);
            aVar.mo74318e(11, this.minx);
            aVar.mo74318e(12, this.miny);
            aVar.mo74318e(13, this.maxx);
            aVar.mo74318e(14, this.maxy);
            aVar.mo74317d(21, this.center_x);
            aVar.mo74317d(22, this.center_y);
            aVar.mo74317d(23, this.obj_w);
            aVar.mo74317d(24, this.obj_h);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58677d(1, this.relative_minx) + 0 + C52418a.m58677d(2, this.relative_miny) + C52418a.m58677d(3, this.relative_maxx) + C52418a.m58677d(4, this.relative_maxy) + C52418a.m58677d(5, this.score) + C52418a.m58678e(11, this.minx) + C52418a.m58678e(12, this.miny) + C52418a.m58678e(13, this.maxx) + C52418a.m58678e(14, this.maxy) + C52418a.m58677d(21, this.center_x) + C52418a.m58677d(22, this.center_y) + C52418a.m58677d(23, this.obj_w) + C52418a.m58677d(24, this.obj_h);
        } else {
            if (i2 == 2) {
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
                GoodsObject goodsObject = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    goodsObject.relative_minx = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    goodsObject.relative_miny = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 3) {
                    goodsObject.relative_maxx = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 4) {
                    goodsObject.relative_maxy = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 5) {
                    switch (intValue) {
                        case 11:
                            goodsObject.minx = aVar3.mo141629g(intValue);
                            return 0;
                        case 12:
                            goodsObject.miny = aVar3.mo141629g(intValue);
                            return 0;
                        case 13:
                            goodsObject.maxx = aVar3.mo141629g(intValue);
                            return 0;
                        case 14:
                            goodsObject.maxy = aVar3.mo141629g(intValue);
                            return 0;
                        default:
                            switch (intValue) {
                                case 21:
                                    goodsObject.center_x = aVar3.mo141628f(intValue);
                                    return 0;
                                case 22:
                                    goodsObject.center_y = aVar3.mo141628f(intValue);
                                    return 0;
                                case 23:
                                    goodsObject.obj_w = aVar3.mo141628f(intValue);
                                    return 0;
                                case 24:
                                    goodsObject.obj_h = aVar3.mo141628f(intValue);
                                    return 0;
                                default:
                                    return -1;
                            }
                    }
                } else {
                    goodsObject.score = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
