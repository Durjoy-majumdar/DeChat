package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MsgContent */
public class MsgContent extends C47465a {
    public ChatroomMsgApp chatroom_app;
    public ChatroomMsgEmoji chatroom_emoji;
    public ChatroomMsgImage chatroom_image;
    public ChatroomMsgImgCard chatroom_img_card;
    public ChatroomMsgImgLink chatroom_img_link;
    public ChatroomMsgNotice chatroom_notice;
    public ChatroomMsgShareLink chatroom_share_link;
    public ChatroomMsgSheetCard chatroom_sheet_card;
    public ChatroomMsgSys chatroom_sys;
    public ChatroomMsgText chatroom_text;
    public ChatroomMsgTpl chatroom_tpl;

    public static final MsgContent create() {
        return new MsgContent();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof MsgContent)) {
            return false;
        }
        MsgContent msgContent = (MsgContent) aVar;
        return C46238a.m51546a(this.chatroom_app, msgContent.chatroom_app) && C46238a.m51546a(this.chatroom_tpl, msgContent.chatroom_tpl) && C46238a.m51546a(this.chatroom_text, msgContent.chatroom_text) && C46238a.m51546a(this.chatroom_sys, msgContent.chatroom_sys) && C46238a.m51546a(this.chatroom_notice, msgContent.chatroom_notice) && C46238a.m51546a(this.chatroom_emoji, msgContent.chatroom_emoji) && C46238a.m51546a(this.chatroom_img_link, msgContent.chatroom_img_link) && C46238a.m51546a(this.chatroom_share_link, msgContent.chatroom_share_link) && C46238a.m51546a(this.chatroom_img_card, msgContent.chatroom_img_card) && C46238a.m51546a(this.chatroom_image, msgContent.chatroom_image) && C46238a.m51546a(this.chatroom_sheet_card, msgContent.chatroom_sheet_card);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ChatroomMsgApp chatroomMsgApp = this.chatroom_app;
            if (chatroomMsgApp != null) {
                aVar.mo74322i(1, chatroomMsgApp.computeSize());
                this.chatroom_app.writeFields(aVar);
            }
            ChatroomMsgTpl chatroomMsgTpl = this.chatroom_tpl;
            if (chatroomMsgTpl != null) {
                aVar.mo74322i(2, chatroomMsgTpl.computeSize());
                this.chatroom_tpl.writeFields(aVar);
            }
            ChatroomMsgText chatroomMsgText = this.chatroom_text;
            if (chatroomMsgText != null) {
                aVar.mo74322i(7, chatroomMsgText.computeSize());
                this.chatroom_text.writeFields(aVar);
            }
            ChatroomMsgSys chatroomMsgSys = this.chatroom_sys;
            if (chatroomMsgSys != null) {
                aVar.mo74322i(3, chatroomMsgSys.computeSize());
                this.chatroom_sys.writeFields(aVar);
            }
            ChatroomMsgNotice chatroomMsgNotice = this.chatroom_notice;
            if (chatroomMsgNotice != null) {
                aVar.mo74322i(4, chatroomMsgNotice.computeSize());
                this.chatroom_notice.writeFields(aVar);
            }
            ChatroomMsgEmoji chatroomMsgEmoji = this.chatroom_emoji;
            if (chatroomMsgEmoji != null) {
                aVar.mo74322i(5, chatroomMsgEmoji.computeSize());
                this.chatroom_emoji.writeFields(aVar);
            }
            ChatroomMsgImgLink chatroomMsgImgLink = this.chatroom_img_link;
            if (chatroomMsgImgLink != null) {
                aVar.mo74322i(6, chatroomMsgImgLink.computeSize());
                this.chatroom_img_link.writeFields(aVar);
            }
            ChatroomMsgShareLink chatroomMsgShareLink = this.chatroom_share_link;
            if (chatroomMsgShareLink != null) {
                aVar.mo74322i(8, chatroomMsgShareLink.computeSize());
                this.chatroom_share_link.writeFields(aVar);
            }
            ChatroomMsgImgCard chatroomMsgImgCard = this.chatroom_img_card;
            if (chatroomMsgImgCard != null) {
                aVar.mo74322i(9, chatroomMsgImgCard.computeSize());
                this.chatroom_img_card.writeFields(aVar);
            }
            ChatroomMsgImage chatroomMsgImage = this.chatroom_image;
            if (chatroomMsgImage != null) {
                aVar.mo74322i(10, chatroomMsgImage.computeSize());
                this.chatroom_image.writeFields(aVar);
            }
            ChatroomMsgSheetCard chatroomMsgSheetCard = this.chatroom_sheet_card;
            if (chatroomMsgSheetCard != null) {
                aVar.mo74322i(11, chatroomMsgSheetCard.computeSize());
                this.chatroom_sheet_card.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            ChatroomMsgApp chatroomMsgApp2 = this.chatroom_app;
            if (chatroomMsgApp2 != null) {
                i2 = 0 + C52418a.m58682i(1, chatroomMsgApp2.computeSize());
            }
            ChatroomMsgTpl chatroomMsgTpl2 = this.chatroom_tpl;
            if (chatroomMsgTpl2 != null) {
                i2 += C52418a.m58682i(2, chatroomMsgTpl2.computeSize());
            }
            ChatroomMsgText chatroomMsgText2 = this.chatroom_text;
            if (chatroomMsgText2 != null) {
                i2 += C52418a.m58682i(7, chatroomMsgText2.computeSize());
            }
            ChatroomMsgSys chatroomMsgSys2 = this.chatroom_sys;
            if (chatroomMsgSys2 != null) {
                i2 += C52418a.m58682i(3, chatroomMsgSys2.computeSize());
            }
            ChatroomMsgNotice chatroomMsgNotice2 = this.chatroom_notice;
            if (chatroomMsgNotice2 != null) {
                i2 += C52418a.m58682i(4, chatroomMsgNotice2.computeSize());
            }
            ChatroomMsgEmoji chatroomMsgEmoji2 = this.chatroom_emoji;
            if (chatroomMsgEmoji2 != null) {
                i2 += C52418a.m58682i(5, chatroomMsgEmoji2.computeSize());
            }
            ChatroomMsgImgLink chatroomMsgImgLink2 = this.chatroom_img_link;
            if (chatroomMsgImgLink2 != null) {
                i2 += C52418a.m58682i(6, chatroomMsgImgLink2.computeSize());
            }
            ChatroomMsgShareLink chatroomMsgShareLink2 = this.chatroom_share_link;
            if (chatroomMsgShareLink2 != null) {
                i2 += C52418a.m58682i(8, chatroomMsgShareLink2.computeSize());
            }
            ChatroomMsgImgCard chatroomMsgImgCard2 = this.chatroom_img_card;
            if (chatroomMsgImgCard2 != null) {
                i2 += C52418a.m58682i(9, chatroomMsgImgCard2.computeSize());
            }
            ChatroomMsgImage chatroomMsgImage2 = this.chatroom_image;
            if (chatroomMsgImage2 != null) {
                i2 += C52418a.m58682i(10, chatroomMsgImage2.computeSize());
            }
            ChatroomMsgSheetCard chatroomMsgSheetCard2 = this.chatroom_sheet_card;
            return chatroomMsgSheetCard2 != null ? i2 + C52418a.m58682i(11, chatroomMsgSheetCard2.computeSize()) : i2;
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
            MsgContent msgContent = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        ChatroomMsgApp chatroomMsgApp3 = new ChatroomMsgApp();
                        if (bArr != null && bArr.length > 0) {
                            chatroomMsgApp3.parseFrom(bArr);
                        }
                        msgContent.chatroom_app = chatroomMsgApp3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ChatroomMsgTpl chatroomMsgTpl3 = new ChatroomMsgTpl();
                        if (bArr2 != null && bArr2.length > 0) {
                            chatroomMsgTpl3.parseFrom(bArr2);
                        }
                        msgContent.chatroom_tpl = chatroomMsgTpl3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ChatroomMsgSys chatroomMsgSys3 = new ChatroomMsgSys();
                        if (bArr3 != null && bArr3.length > 0) {
                            chatroomMsgSys3.parseFrom(bArr3);
                        }
                        msgContent.chatroom_sys = chatroomMsgSys3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        ChatroomMsgNotice chatroomMsgNotice3 = new ChatroomMsgNotice();
                        if (bArr4 != null && bArr4.length > 0) {
                            chatroomMsgNotice3.parseFrom(bArr4);
                        }
                        msgContent.chatroom_notice = chatroomMsgNotice3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        ChatroomMsgEmoji chatroomMsgEmoji3 = new ChatroomMsgEmoji();
                        if (bArr5 != null && bArr5.length > 0) {
                            chatroomMsgEmoji3.parseFrom(bArr5);
                        }
                        msgContent.chatroom_emoji = chatroomMsgEmoji3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        ChatroomMsgImgLink chatroomMsgImgLink3 = new ChatroomMsgImgLink();
                        if (bArr6 != null && bArr6.length > 0) {
                            chatroomMsgImgLink3.parseFrom(bArr6);
                        }
                        msgContent.chatroom_img_link = chatroomMsgImgLink3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        ChatroomMsgText chatroomMsgText3 = new ChatroomMsgText();
                        if (bArr7 != null && bArr7.length > 0) {
                            chatroomMsgText3.parseFrom(bArr7);
                        }
                        msgContent.chatroom_text = chatroomMsgText3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        ChatroomMsgShareLink chatroomMsgShareLink3 = new ChatroomMsgShareLink();
                        if (bArr8 != null && bArr8.length > 0) {
                            chatroomMsgShareLink3.parseFrom(bArr8);
                        }
                        msgContent.chatroom_share_link = chatroomMsgShareLink3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        ChatroomMsgImgCard chatroomMsgImgCard3 = new ChatroomMsgImgCard();
                        if (bArr9 != null && bArr9.length > 0) {
                            chatroomMsgImgCard3.parseFrom(bArr9);
                        }
                        msgContent.chatroom_img_card = chatroomMsgImgCard3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        ChatroomMsgImage chatroomMsgImage3 = new ChatroomMsgImage();
                        if (bArr10 != null && bArr10.length > 0) {
                            chatroomMsgImage3.parseFrom(bArr10);
                        }
                        msgContent.chatroom_image = chatroomMsgImage3;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i18 = 0; i18 < size11; i18++) {
                        byte[] bArr11 = j16.get(i18);
                        ChatroomMsgSheetCard chatroomMsgSheetCard3 = new ChatroomMsgSheetCard();
                        if (bArr11 != null && bArr11.length > 0) {
                            chatroomMsgSheetCard3.parseFrom(bArr11);
                        }
                        msgContent.chatroom_sheet_card = chatroomMsgSheetCard3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public MsgContent setChatroom_app(ChatroomMsgApp chatroomMsgApp) {
        this.chatroom_app = chatroomMsgApp;
        return this;
    }

    public MsgContent setChatroom_emoji(ChatroomMsgEmoji chatroomMsgEmoji) {
        this.chatroom_emoji = chatroomMsgEmoji;
        return this;
    }

    public MsgContent setChatroom_image(ChatroomMsgImage chatroomMsgImage) {
        this.chatroom_image = chatroomMsgImage;
        return this;
    }

    public MsgContent setChatroom_img_card(ChatroomMsgImgCard chatroomMsgImgCard) {
        this.chatroom_img_card = chatroomMsgImgCard;
        return this;
    }

    public MsgContent setChatroom_img_link(ChatroomMsgImgLink chatroomMsgImgLink) {
        this.chatroom_img_link = chatroomMsgImgLink;
        return this;
    }

    public MsgContent setChatroom_notice(ChatroomMsgNotice chatroomMsgNotice) {
        this.chatroom_notice = chatroomMsgNotice;
        return this;
    }

    public MsgContent setChatroom_share_link(ChatroomMsgShareLink chatroomMsgShareLink) {
        this.chatroom_share_link = chatroomMsgShareLink;
        return this;
    }

    public MsgContent setChatroom_sheet_card(ChatroomMsgSheetCard chatroomMsgSheetCard) {
        this.chatroom_sheet_card = chatroomMsgSheetCard;
        return this;
    }

    public MsgContent setChatroom_sys(ChatroomMsgSys chatroomMsgSys) {
        this.chatroom_sys = chatroomMsgSys;
        return this;
    }

    public MsgContent setChatroom_text(ChatroomMsgText chatroomMsgText) {
        this.chatroom_text = chatroomMsgText;
        return this;
    }

    public MsgContent setChatroom_tpl(ChatroomMsgTpl chatroomMsgTpl) {
        this.chatroom_tpl = chatroomMsgTpl;
        return this;
    }
}
