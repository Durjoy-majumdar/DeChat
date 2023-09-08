package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard */
public class ChatroomMsgSheetCard extends C47465a {
    public String bg_pic_url;
    public JumpInfo jump_info;
    public String pic_url;
    public LinkedList<SheetRow> sheet_row_list = new LinkedList<>();
    public String title;

    public static final ChatroomMsgSheetCard create() {
        return new ChatroomMsgSheetCard();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgSheetCard)) {
            return false;
        }
        ChatroomMsgSheetCard chatroomMsgSheetCard = (ChatroomMsgSheetCard) aVar;
        return C46238a.m51546a(this.title, chatroomMsgSheetCard.title) && C46238a.m51546a(this.pic_url, chatroomMsgSheetCard.pic_url) && C46238a.m51546a(this.jump_info, chatroomMsgSheetCard.jump_info) && C46238a.m51546a(this.sheet_row_list, chatroomMsgSheetCard.sheet_row_list) && C46238a.m51546a(this.bg_pic_url, chatroomMsgSheetCard.bg_pic_url);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.title;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.pic_url;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.sheet_row_list);
            String str3 = this.bg_pic_url;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.title;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.pic_url;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                i2 += C52418a.m58682i(3, jumpInfo2.computeSize());
            }
            int g = i2 + C52418a.m58680g(4, 8, this.sheet_row_list);
            String str6 = this.bg_pic_url;
            return str6 != null ? g + C52418a.m58683j(5, str6) : g;
        } else if (i == 2) {
            this.sheet_row_list.clear();
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
            ChatroomMsgSheetCard chatroomMsgSheetCard = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chatroomMsgSheetCard.title = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                chatroomMsgSheetCard.pic_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    chatroomMsgSheetCard.jump_info = jumpInfo3;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    SheetRow sheetRow = new SheetRow();
                    if (bArr2 != null && bArr2.length > 0) {
                        sheetRow.parseFrom(bArr2);
                    }
                    chatroomMsgSheetCard.sheet_row_list.add(sheetRow);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                chatroomMsgSheetCard.bg_pic_url = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public ChatroomMsgSheetCard setBg_pic_url(String str) {
        this.bg_pic_url = str;
        return this;
    }

    public ChatroomMsgSheetCard setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public ChatroomMsgSheetCard setPic_url(String str) {
        this.pic_url = str;
        return this;
    }

    public ChatroomMsgSheetCard setSheet_row_list(LinkedList<SheetRow> linkedList) {
        this.sheet_row_list = linkedList;
        return this;
    }

    public ChatroomMsgSheetCard setTitle(String str) {
        this.title = str;
        return this;
    }
}
