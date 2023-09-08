package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.IMBehaviorChattingOP */
public class IMBehaviorChattingOP extends C47465a {
    public int changeNotifyStatus;
    public int changeSaveAddress;
    public int changeTop;
    public int changeUnread;
    public int expose;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof IMBehaviorChattingOP)) {
            return false;
        }
        IMBehaviorChattingOP iMBehaviorChattingOP = (IMBehaviorChattingOP) aVar;
        return C46238a.m51546a(Integer.valueOf(this.changeUnread), Integer.valueOf(iMBehaviorChattingOP.changeUnread)) && C46238a.m51546a(Integer.valueOf(this.changeTop), Integer.valueOf(iMBehaviorChattingOP.changeTop)) && C46238a.m51546a(Integer.valueOf(this.changeNotifyStatus), Integer.valueOf(iMBehaviorChattingOP.changeNotifyStatus)) && C46238a.m51546a(Integer.valueOf(this.changeSaveAddress), Integer.valueOf(iMBehaviorChattingOP.changeSaveAddress)) && C46238a.m51546a(Integer.valueOf(this.expose), Integer.valueOf(iMBehaviorChattingOP.expose));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.changeUnread);
            aVar.mo74318e(2, this.changeTop);
            aVar.mo74318e(3, this.changeNotifyStatus);
            aVar.mo74318e(4, this.changeSaveAddress);
            aVar.mo74318e(5, this.expose);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.changeUnread) + 0 + C52418a.m58678e(2, this.changeTop) + C52418a.m58678e(3, this.changeNotifyStatus) + C52418a.m58678e(4, this.changeSaveAddress) + C52418a.m58678e(5, this.expose);
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
                IMBehaviorChattingOP iMBehaviorChattingOP = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    iMBehaviorChattingOP.changeUnread = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    iMBehaviorChattingOP.changeTop = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    iMBehaviorChattingOP.changeNotifyStatus = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    iMBehaviorChattingOP.changeSaveAddress = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    iMBehaviorChattingOP.expose = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
