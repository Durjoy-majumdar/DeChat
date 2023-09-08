package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify */
public class FirstEnterNotify extends C47465a {
    public JumpInfo jump_info;

    public static final FirstEnterNotify create() {
        return new FirstEnterNotify();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof FirstEnterNotify) && C46238a.m51546a(this.jump_info, ((FirstEnterNotify) aVar).jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(1, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                return 0 + C52418a.m58682i(1, jumpInfo2.computeSize());
            }
            return 0;
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
            FirstEnterNotify firstEnterNotify = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                JumpInfo jumpInfo3 = new JumpInfo();
                if (bArr != null && bArr.length > 0) {
                    jumpInfo3.parseFrom(bArr);
                }
                firstEnterNotify.jump_info = jumpInfo3;
            }
            return 0;
        }
    }

    public FirstEnterNotify setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }
}
