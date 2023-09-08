package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo */
public class ChosenInfo extends C47465a {
    public boolean can_be_chosen;

    public static final ChosenInfo create() {
        return new ChosenInfo();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof ChosenInfo) && C46238a.m51546a(Boolean.valueOf(this.can_be_chosen), Boolean.valueOf(((ChosenInfo) aVar).can_be_chosen));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74314a(1, this.can_be_chosen);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.can_be_chosen) + 0;
        } else {
            if (i == 2) {
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                ChosenInfo chosenInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                chosenInfo.can_be_chosen = aVar2.mo141625c(intValue);
                return 0;
            }
        }
    }

    public ChosenInfo setCan_be_chosen(boolean z) {
        this.can_be_chosen = z;
        return this;
    }
}
