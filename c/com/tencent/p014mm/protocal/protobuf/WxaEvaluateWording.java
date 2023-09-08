package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaEvaluateWording */
public class WxaEvaluateWording extends C47465a {
    public int star_num;
    public String wording;

    public static final WxaEvaluateWording create() {
        return new WxaEvaluateWording();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof WxaEvaluateWording)) {
            return false;
        }
        WxaEvaluateWording wxaEvaluateWording = (WxaEvaluateWording) aVar;
        return C46238a.m51546a(Integer.valueOf(this.star_num), Integer.valueOf(wxaEvaluateWording.star_num)) && C46238a.m51546a(this.wording, wxaEvaluateWording.wording);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.star_num);
            String str = this.wording;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.star_num) + 0;
            String str2 = this.wording;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            WxaEvaluateWording wxaEvaluateWording = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wxaEvaluateWording.star_num = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                wxaEvaluateWording.wording = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public WxaEvaluateWording setStar_num(int i) {
        this.star_num = i;
        return this;
    }

    public WxaEvaluateWording setWording(String str) {
        this.wording = str;
        return this;
    }
}
