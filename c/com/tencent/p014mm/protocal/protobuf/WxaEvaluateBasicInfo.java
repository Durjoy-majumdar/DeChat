package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo */
public class WxaEvaluateBasicInfo extends C47465a {
    public double average_score;
    public long total_score_cnt;

    public static final WxaEvaluateBasicInfo create() {
        return new WxaEvaluateBasicInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof WxaEvaluateBasicInfo)) {
            return false;
        }
        WxaEvaluateBasicInfo wxaEvaluateBasicInfo = (WxaEvaluateBasicInfo) aVar;
        return C46238a.m51546a(Double.valueOf(this.average_score), Double.valueOf(wxaEvaluateBasicInfo.average_score)) && C46238a.m51546a(Long.valueOf(this.total_score_cnt), Long.valueOf(wxaEvaluateBasicInfo.total_score_cnt));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.average_score);
            aVar.mo74321h(2, this.total_score_cnt);
            return 0;
        } else if (i == 1) {
            return C52418a.m58676c(1, this.average_score) + 0 + C52418a.m58681h(2, this.total_score_cnt);
        } else {
            if (i == 2) {
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
                WxaEvaluateBasicInfo wxaEvaluateBasicInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wxaEvaluateBasicInfo.average_score = aVar3.mo141627e(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    wxaEvaluateBasicInfo.total_score_cnt = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public WxaEvaluateBasicInfo setAverage_score(double d) {
        this.average_score = d;
        return this;
    }

    public WxaEvaluateBasicInfo setTotal_score_cnt(long j) {
        this.total_score_cnt = j;
        return this;
    }
}
