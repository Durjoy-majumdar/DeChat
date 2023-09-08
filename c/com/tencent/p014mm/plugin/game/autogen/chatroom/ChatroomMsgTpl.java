package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl */
public class ChatroomMsgTpl extends C47465a {
    public LinkedList<TplBlock> tpl_block_list = new LinkedList<>();

    public static final ChatroomMsgTpl create() {
        return new ChatroomMsgTpl();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof ChatroomMsgTpl) && C46238a.m51546a(this.tpl_block_list, ((ChatroomMsgTpl) aVar).tpl_block_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.tpl_block_list);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.tpl_block_list) + 0;
        } else {
            if (i == 2) {
                this.tpl_block_list.clear();
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
                ChatroomMsgTpl chatroomMsgTpl = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    TplBlock tplBlock = new TplBlock();
                    if (bArr != null && bArr.length > 0) {
                        tplBlock.parseFrom(bArr);
                    }
                    chatroomMsgTpl.tpl_block_list.add(tplBlock);
                }
                return 0;
            }
        }
    }

    public ChatroomMsgTpl setTpl_block_list(LinkedList<TplBlock> linkedList) {
        this.tpl_block_list = linkedList;
        return this;
    }
}
