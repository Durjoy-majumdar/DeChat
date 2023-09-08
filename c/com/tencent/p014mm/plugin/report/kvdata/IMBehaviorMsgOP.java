package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.IMBehaviorMsgOP */
public class IMBehaviorMsgOP extends C47465a {
    public int appMsgInnerType;
    public int count;
    public int msgOpType;
    public int msgType;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof IMBehaviorMsgOP)) {
            return false;
        }
        IMBehaviorMsgOP iMBehaviorMsgOP = (IMBehaviorMsgOP) aVar;
        return C46238a.m51546a(Integer.valueOf(this.msgType), Integer.valueOf(iMBehaviorMsgOP.msgType)) && C46238a.m51546a(Integer.valueOf(this.msgOpType), Integer.valueOf(iMBehaviorMsgOP.msgOpType)) && C46238a.m51546a(Integer.valueOf(this.appMsgInnerType), Integer.valueOf(iMBehaviorMsgOP.appMsgInnerType)) && C46238a.m51546a(Integer.valueOf(this.count), Integer.valueOf(iMBehaviorMsgOP.count));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.msgType);
            aVar.mo74318e(2, this.msgOpType);
            aVar.mo74318e(3, this.appMsgInnerType);
            aVar.mo74318e(4, this.count);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.msgType) + 0 + C52418a.m58678e(2, this.msgOpType) + C52418a.m58678e(3, this.appMsgInnerType) + C52418a.m58678e(4, this.count);
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
                IMBehaviorMsgOP iMBehaviorMsgOP = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    iMBehaviorMsgOP.msgType = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    iMBehaviorMsgOP.msgOpType = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    iMBehaviorMsgOP.appMsgInnerType = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    iMBehaviorMsgOP.count = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
