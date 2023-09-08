package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo */
public class RealtimeControlInfo extends C47465a {
    public ChatroomBanAction chatroom_ban_action;
    public boolean disable_emoji;
    public boolean enable_custom_emoji;
    public KickOutCardInfo kick_out_card_info;
    public String kick_out_wording;
    public PremadeCardInfo premade_card_info;
    public LinkedList<ChatroomUserData> update_user_data_list = new LinkedList<>();
    public UserBanAction user_ban_action;
    public int user_chatroom_relation;
    public String version;

    public static final RealtimeControlInfo create() {
        return new RealtimeControlInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof RealtimeControlInfo)) {
            return false;
        }
        RealtimeControlInfo realtimeControlInfo = (RealtimeControlInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.user_chatroom_relation), Integer.valueOf(realtimeControlInfo.user_chatroom_relation)) && C46238a.m51546a(this.user_ban_action, realtimeControlInfo.user_ban_action) && C46238a.m51546a(this.chatroom_ban_action, realtimeControlInfo.chatroom_ban_action) && C46238a.m51546a(this.version, realtimeControlInfo.version) && C46238a.m51546a(this.kick_out_wording, realtimeControlInfo.kick_out_wording) && C46238a.m51546a(this.update_user_data_list, realtimeControlInfo.update_user_data_list) && C46238a.m51546a(Boolean.valueOf(this.disable_emoji), Boolean.valueOf(realtimeControlInfo.disable_emoji)) && C46238a.m51546a(this.premade_card_info, realtimeControlInfo.premade_card_info) && C46238a.m51546a(Boolean.valueOf(this.enable_custom_emoji), Boolean.valueOf(realtimeControlInfo.enable_custom_emoji)) && C46238a.m51546a(this.kick_out_card_info, realtimeControlInfo.kick_out_card_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.user_chatroom_relation);
            UserBanAction userBanAction = this.user_ban_action;
            if (userBanAction != null) {
                aVar.mo74322i(2, userBanAction.computeSize());
                this.user_ban_action.writeFields(aVar);
            }
            ChatroomBanAction chatroomBanAction = this.chatroom_ban_action;
            if (chatroomBanAction != null) {
                aVar.mo74322i(3, chatroomBanAction.computeSize());
                this.chatroom_ban_action.writeFields(aVar);
            }
            String str = this.version;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.kick_out_wording;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74320g(6, 8, this.update_user_data_list);
            aVar.mo74314a(7, this.disable_emoji);
            PremadeCardInfo premadeCardInfo = this.premade_card_info;
            if (premadeCardInfo != null) {
                aVar.mo74322i(8, premadeCardInfo.computeSize());
                this.premade_card_info.writeFields(aVar);
            }
            aVar.mo74314a(9, this.enable_custom_emoji);
            KickOutCardInfo kickOutCardInfo = this.kick_out_card_info;
            if (kickOutCardInfo != null) {
                aVar.mo74322i(10, kickOutCardInfo.computeSize());
                this.kick_out_card_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.user_chatroom_relation) + 0;
            UserBanAction userBanAction2 = this.user_ban_action;
            if (userBanAction2 != null) {
                e += C52418a.m58682i(2, userBanAction2.computeSize());
            }
            ChatroomBanAction chatroomBanAction2 = this.chatroom_ban_action;
            if (chatroomBanAction2 != null) {
                e += C52418a.m58682i(3, chatroomBanAction2.computeSize());
            }
            String str3 = this.version;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.kick_out_wording;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            int g = e + C52418a.m58680g(6, 8, this.update_user_data_list) + C52418a.m58674a(7, this.disable_emoji);
            PremadeCardInfo premadeCardInfo2 = this.premade_card_info;
            if (premadeCardInfo2 != null) {
                g += C52418a.m58682i(8, premadeCardInfo2.computeSize());
            }
            int a = g + C52418a.m58674a(9, this.enable_custom_emoji);
            KickOutCardInfo kickOutCardInfo2 = this.kick_out_card_info;
            return kickOutCardInfo2 != null ? a + C52418a.m58682i(10, kickOutCardInfo2.computeSize()) : a;
        } else if (i == 2) {
            this.update_user_data_list.clear();
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
            RealtimeControlInfo realtimeControlInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    realtimeControlInfo.user_chatroom_relation = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        UserBanAction userBanAction3 = new UserBanAction();
                        if (bArr != null && bArr.length > 0) {
                            userBanAction3.parseFrom(bArr);
                        }
                        realtimeControlInfo.user_ban_action = userBanAction3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        ChatroomBanAction chatroomBanAction3 = new ChatroomBanAction();
                        if (bArr2 != null && bArr2.length > 0) {
                            chatroomBanAction3.parseFrom(bArr2);
                        }
                        realtimeControlInfo.chatroom_ban_action = chatroomBanAction3;
                    }
                    return 0;
                case 4:
                    realtimeControlInfo.version = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    realtimeControlInfo.kick_out_wording = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        ChatroomUserData chatroomUserData = new ChatroomUserData();
                        if (bArr3 != null && bArr3.length > 0) {
                            chatroomUserData.parseFrom(bArr3);
                        }
                        realtimeControlInfo.update_user_data_list.add(chatroomUserData);
                    }
                    return 0;
                case 7:
                    realtimeControlInfo.disable_emoji = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        PremadeCardInfo premadeCardInfo3 = new PremadeCardInfo();
                        if (bArr4 != null && bArr4.length > 0) {
                            premadeCardInfo3.parseFrom(bArr4);
                        }
                        realtimeControlInfo.premade_card_info = premadeCardInfo3;
                    }
                    return 0;
                case 9:
                    realtimeControlInfo.enable_custom_emoji = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        KickOutCardInfo kickOutCardInfo3 = new KickOutCardInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            kickOutCardInfo3.parseFrom(bArr5);
                        }
                        realtimeControlInfo.kick_out_card_info = kickOutCardInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public RealtimeControlInfo setChatroom_ban_action(ChatroomBanAction chatroomBanAction) {
        this.chatroom_ban_action = chatroomBanAction;
        return this;
    }

    public RealtimeControlInfo setDisable_emoji(boolean z) {
        this.disable_emoji = z;
        return this;
    }

    public RealtimeControlInfo setEnable_custom_emoji(boolean z) {
        this.enable_custom_emoji = z;
        return this;
    }

    public RealtimeControlInfo setKick_out_card_info(KickOutCardInfo kickOutCardInfo) {
        this.kick_out_card_info = kickOutCardInfo;
        return this;
    }

    public RealtimeControlInfo setKick_out_wording(String str) {
        this.kick_out_wording = str;
        return this;
    }

    public RealtimeControlInfo setPremade_card_info(PremadeCardInfo premadeCardInfo) {
        this.premade_card_info = premadeCardInfo;
        return this;
    }

    public RealtimeControlInfo setUpdate_user_data_list(LinkedList<ChatroomUserData> linkedList) {
        this.update_user_data_list = linkedList;
        return this;
    }

    public RealtimeControlInfo setUser_ban_action(UserBanAction userBanAction) {
        this.user_ban_action = userBanAction;
        return this;
    }

    public RealtimeControlInfo setUser_chatroom_relation(int i) {
        this.user_chatroom_relation = i;
        return this;
    }

    public RealtimeControlInfo setVersion(String str) {
        this.version = str;
        return this;
    }
}
