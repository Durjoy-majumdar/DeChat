package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.IMBehavior */
public class IMBehavior extends C47465a {
    public IMBehaviorChattingOP chattingOp;
    public IMBehaviorMsgOP msgOp;
    public int opType;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof IMBehavior)) {
            return false;
        }
        IMBehavior iMBehavior = (IMBehavior) aVar;
        return C46238a.m51546a(Integer.valueOf(this.opType), Integer.valueOf(iMBehavior.opType)) && C46238a.m51546a(this.chattingOp, iMBehavior.chattingOp) && C46238a.m51546a(this.msgOp, iMBehavior.msgOp);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.opType);
            IMBehaviorChattingOP iMBehaviorChattingOP = this.chattingOp;
            if (iMBehaviorChattingOP != null) {
                aVar.mo74322i(2, iMBehaviorChattingOP.computeSize());
                this.chattingOp.writeFields(aVar);
            }
            IMBehaviorMsgOP iMBehaviorMsgOP = this.msgOp;
            if (iMBehaviorMsgOP != null) {
                aVar.mo74322i(3, iMBehaviorMsgOP.computeSize());
                this.msgOp.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.opType) + 0;
            IMBehaviorChattingOP iMBehaviorChattingOP2 = this.chattingOp;
            if (iMBehaviorChattingOP2 != null) {
                e += C52418a.m58682i(2, iMBehaviorChattingOP2.computeSize());
            }
            IMBehaviorMsgOP iMBehaviorMsgOP2 = this.msgOp;
            return iMBehaviorMsgOP2 != null ? e + C52418a.m58682i(3, iMBehaviorMsgOP2.computeSize()) : e;
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
            IMBehavior iMBehavior = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iMBehavior.opType = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    IMBehaviorChattingOP iMBehaviorChattingOP3 = new IMBehaviorChattingOP();
                    if (bArr != null && bArr.length > 0) {
                        iMBehaviorChattingOP3.parseFrom(bArr);
                    }
                    iMBehavior.chattingOp = iMBehaviorChattingOP3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    IMBehaviorMsgOP iMBehaviorMsgOP3 = new IMBehaviorMsgOP();
                    if (bArr2 != null && bArr2.length > 0) {
                        iMBehaviorMsgOP3.parseFrom(bArr2);
                    }
                    iMBehavior.msgOp = iMBehaviorMsgOP3;
                }
                return 0;
            }
        }
    }
}
