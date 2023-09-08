package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.AtInfo */
public class AtInfo extends C47465a {
    public LinkedList<Long> seq_list = new LinkedList<>();

    public static final AtInfo create() {
        return new AtInfo();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof AtInfo) && C46238a.m51546a(this.seq_list, ((AtInfo) aVar).seq_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 3, this.seq_list);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 3, this.seq_list) + 0;
        } else {
            if (i == 2) {
                this.seq_list.clear();
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
                AtInfo atInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                atInfo.seq_list.add(Long.valueOf(aVar2.mo141631i(intValue)));
                return 0;
            }
        }
    }

    public AtInfo setSeq_list(LinkedList<Long> linkedList) {
        this.seq_list = linkedList;
        return this;
    }
}
