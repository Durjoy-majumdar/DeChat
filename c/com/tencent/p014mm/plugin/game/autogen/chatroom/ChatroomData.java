package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData */
public class ChatroomData extends C47465a {
    public AdminInfo admin_info;
    public int allow_user_num;
    public String announcement;
    public String appid;
    public String application_question;
    public JumpInfo apply_jump_info;
    public boolean can_chat;
    public boolean can_join;
    public boolean can_onlooker;
    public String chatroom_icon;
    public JumpInfo chatroom_member_jump_info;
    public String chatroom_name;
    public JumpInfo chatroom_profile_jump_info;
    public LinkedList<ChatroomTag> chatroom_tag_list = new LinkedList<>();
    public int chatroom_type;
    public boolean is_private;
    public int kick_out_type;
    public ChatroomNotice notice;
    public String report_str;
    public int room_member_num;
    public String room_name;
    public LinkedList<RestrictRule> rule_list = new LinkedList<>();
    public boolean top_chatroom;
    public int user_chatroom_relation;
    public String version;

    public static final ChatroomData create() {
        return new ChatroomData();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomData)) {
            return false;
        }
        ChatroomData chatroomData = (ChatroomData) aVar;
        return C46238a.m51546a(this.chatroom_name, chatroomData.chatroom_name) && C46238a.m51546a(this.room_name, chatroomData.room_name) && C46238a.m51546a(this.chatroom_icon, chatroomData.chatroom_icon) && C46238a.m51546a(this.appid, chatroomData.appid) && C46238a.m51546a(this.admin_info, chatroomData.admin_info) && C46238a.m51546a(Integer.valueOf(this.chatroom_type), Integer.valueOf(chatroomData.chatroom_type)) && C46238a.m51546a(Boolean.valueOf(this.is_private), Boolean.valueOf(chatroomData.is_private)) && C46238a.m51546a(this.announcement, chatroomData.announcement) && C46238a.m51546a(Integer.valueOf(this.user_chatroom_relation), Integer.valueOf(chatroomData.user_chatroom_relation)) && C46238a.m51546a(Integer.valueOf(this.room_member_num), Integer.valueOf(chatroomData.room_member_num)) && C46238a.m51546a(this.rule_list, chatroomData.rule_list) && C46238a.m51546a(Boolean.valueOf(this.can_join), Boolean.valueOf(chatroomData.can_join)) && C46238a.m51546a(Boolean.valueOf(this.can_onlooker), Boolean.valueOf(chatroomData.can_onlooker)) && C46238a.m51546a(Boolean.valueOf(this.can_chat), Boolean.valueOf(chatroomData.can_chat)) && C46238a.m51546a(this.application_question, chatroomData.application_question) && C46238a.m51546a(this.version, chatroomData.version) && C46238a.m51546a(this.apply_jump_info, chatroomData.apply_jump_info) && C46238a.m51546a(this.chatroom_profile_jump_info, chatroomData.chatroom_profile_jump_info) && C46238a.m51546a(Integer.valueOf(this.kick_out_type), Integer.valueOf(chatroomData.kick_out_type)) && C46238a.m51546a(this.chatroom_member_jump_info, chatroomData.chatroom_member_jump_info) && C46238a.m51546a(this.notice, chatroomData.notice) && C46238a.m51546a(Boolean.valueOf(this.top_chatroom), Boolean.valueOf(chatroomData.top_chatroom)) && C46238a.m51546a(this.chatroom_tag_list, chatroomData.chatroom_tag_list) && C46238a.m51546a(Integer.valueOf(this.allow_user_num), Integer.valueOf(chatroomData.allow_user_num)) && C46238a.m51546a(this.report_str, chatroomData.report_str);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.chatroom_name;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.room_name;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.chatroom_icon;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.appid;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                AdminInfo adminInfo = this.admin_info;
                if (adminInfo != null) {
                    aVar.mo74322i(5, adminInfo.computeSize());
                    this.admin_info.writeFields(aVar);
                }
                aVar.mo74318e(6, this.chatroom_type);
                aVar.mo74314a(7, this.is_private);
                String str5 = this.announcement;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                aVar.mo74318e(9, this.user_chatroom_relation);
                aVar.mo74318e(10, this.room_member_num);
                aVar.mo74320g(11, 8, this.rule_list);
                aVar.mo74314a(12, this.can_join);
                aVar.mo74314a(13, this.can_onlooker);
                aVar.mo74314a(14, this.can_chat);
                String str6 = this.application_question;
                if (str6 != null) {
                    aVar.mo74323j(15, str6);
                }
                String str7 = this.version;
                if (str7 != null) {
                    aVar.mo74323j(16, str7);
                }
                JumpInfo jumpInfo = this.apply_jump_info;
                if (jumpInfo != null) {
                    aVar.mo74322i(17, jumpInfo.computeSize());
                    this.apply_jump_info.writeFields(aVar);
                }
                JumpInfo jumpInfo2 = this.chatroom_profile_jump_info;
                if (jumpInfo2 != null) {
                    aVar.mo74322i(18, jumpInfo2.computeSize());
                    this.chatroom_profile_jump_info.writeFields(aVar);
                }
                aVar.mo74318e(19, this.kick_out_type);
                JumpInfo jumpInfo3 = this.chatroom_member_jump_info;
                if (jumpInfo3 != null) {
                    aVar.mo74322i(20, jumpInfo3.computeSize());
                    this.chatroom_member_jump_info.writeFields(aVar);
                }
                ChatroomNotice chatroomNotice = this.notice;
                if (chatroomNotice != null) {
                    aVar.mo74322i(21, chatroomNotice.computeSize());
                    this.notice.writeFields(aVar);
                }
                aVar.mo74314a(22, this.top_chatroom);
                aVar.mo74320g(23, 8, this.chatroom_tag_list);
                aVar.mo74318e(24, this.allow_user_num);
                String str8 = this.report_str;
                if (str8 != null) {
                    aVar.mo74323j(25, str8);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i2 == 1) {
            String str9 = this.chatroom_name;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.room_name;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.chatroom_icon;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            String str12 = this.appid;
            if (str12 != null) {
                i3 += C52418a.m58683j(4, str12);
            }
            AdminInfo adminInfo2 = this.admin_info;
            if (adminInfo2 != null) {
                i3 += C52418a.m58682i(5, adminInfo2.computeSize());
            }
            int e = i3 + C52418a.m58678e(6, this.chatroom_type) + C52418a.m58674a(7, this.is_private);
            String str13 = this.announcement;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            int e2 = e + C52418a.m58678e(9, this.user_chatroom_relation) + C52418a.m58678e(10, this.room_member_num) + C52418a.m58680g(11, 8, this.rule_list) + C52418a.m58674a(12, this.can_join) + C52418a.m58674a(13, this.can_onlooker) + C52418a.m58674a(14, this.can_chat);
            String str14 = this.application_question;
            if (str14 != null) {
                e2 += C52418a.m58683j(15, str14);
            }
            String str15 = this.version;
            if (str15 != null) {
                e2 += C52418a.m58683j(16, str15);
            }
            JumpInfo jumpInfo4 = this.apply_jump_info;
            if (jumpInfo4 != null) {
                e2 += C52418a.m58682i(17, jumpInfo4.computeSize());
            }
            JumpInfo jumpInfo5 = this.chatroom_profile_jump_info;
            if (jumpInfo5 != null) {
                e2 += C52418a.m58682i(18, jumpInfo5.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(19, this.kick_out_type);
            JumpInfo jumpInfo6 = this.chatroom_member_jump_info;
            if (jumpInfo6 != null) {
                e3 += C52418a.m58682i(20, jumpInfo6.computeSize());
            }
            ChatroomNotice chatroomNotice2 = this.notice;
            if (chatroomNotice2 != null) {
                e3 += C52418a.m58682i(21, chatroomNotice2.computeSize());
            }
            int a = e3 + C52418a.m58674a(22, this.top_chatroom) + C52418a.m58680g(23, 8, this.chatroom_tag_list) + C52418a.m58678e(24, this.allow_user_num);
            String str16 = this.report_str;
            return str16 != null ? a + C52418a.m58683j(25, str16) : a;
        } else if (i2 == 2) {
            this.rule_list.clear();
            this.chatroom_tag_list.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.chatroom_name != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ChatroomData chatroomData = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomData.chatroom_name = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    chatroomData.room_name = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    chatroomData.chatroom_icon = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    chatroomData.appid = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        AdminInfo adminInfo3 = new AdminInfo();
                        if (bArr != null && bArr.length > 0) {
                            adminInfo3.parseFrom(bArr);
                        }
                        chatroomData.admin_info = adminInfo3;
                    }
                    return 0;
                case 6:
                    chatroomData.chatroom_type = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    chatroomData.is_private = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    chatroomData.announcement = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    chatroomData.user_chatroom_relation = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    chatroomData.room_member_num = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        RestrictRule restrictRule = new RestrictRule();
                        if (bArr2 != null && bArr2.length > 0) {
                            restrictRule.parseFrom(bArr2);
                        }
                        chatroomData.rule_list.add(restrictRule);
                    }
                    return 0;
                case 12:
                    chatroomData.can_join = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    chatroomData.can_onlooker = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    chatroomData.can_chat = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    chatroomData.application_question = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    chatroomData.version = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        JumpInfo jumpInfo7 = new JumpInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            jumpInfo7.parseFrom(bArr3);
                        }
                        chatroomData.apply_jump_info = jumpInfo7;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        JumpInfo jumpInfo8 = new JumpInfo();
                        if (bArr4 != null && bArr4.length > 0) {
                            jumpInfo8.parseFrom(bArr4);
                        }
                        chatroomData.chatroom_profile_jump_info = jumpInfo8;
                    }
                    return 0;
                case 19:
                    chatroomData.kick_out_type = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        JumpInfo jumpInfo9 = new JumpInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            jumpInfo9.parseFrom(bArr5);
                        }
                        chatroomData.chatroom_member_jump_info = jumpInfo9;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        ChatroomNotice chatroomNotice3 = new ChatroomNotice();
                        if (bArr6 != null && bArr6.length > 0) {
                            chatroomNotice3.parseFrom(bArr6);
                        }
                        chatroomData.notice = chatroomNotice3;
                    }
                    return 0;
                case 22:
                    chatroomData.top_chatroom = aVar3.mo141625c(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        ChatroomTag chatroomTag = new ChatroomTag();
                        if (bArr7 != null && bArr7.length > 0) {
                            chatroomTag.parseFrom(bArr7);
                        }
                        chatroomData.chatroom_tag_list.add(chatroomTag);
                    }
                    return 0;
                case 24:
                    chatroomData.allow_user_num = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    chatroomData.report_str = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomData setAdmin_info(AdminInfo adminInfo) {
        this.admin_info = adminInfo;
        return this;
    }

    public ChatroomData setAllow_user_num(int i) {
        this.allow_user_num = i;
        return this;
    }

    public ChatroomData setAnnouncement(String str) {
        this.announcement = str;
        return this;
    }

    public ChatroomData setAppid(String str) {
        this.appid = str;
        return this;
    }

    public ChatroomData setApplication_question(String str) {
        this.application_question = str;
        return this;
    }

    public ChatroomData setApply_jump_info(JumpInfo jumpInfo) {
        this.apply_jump_info = jumpInfo;
        return this;
    }

    public ChatroomData setCan_chat(boolean z) {
        this.can_chat = z;
        return this;
    }

    public ChatroomData setCan_join(boolean z) {
        this.can_join = z;
        return this;
    }

    public ChatroomData setCan_onlooker(boolean z) {
        this.can_onlooker = z;
        return this;
    }

    public ChatroomData setChatroom_icon(String str) {
        this.chatroom_icon = str;
        return this;
    }

    public ChatroomData setChatroom_member_jump_info(JumpInfo jumpInfo) {
        this.chatroom_member_jump_info = jumpInfo;
        return this;
    }

    public ChatroomData setChatroom_name(String str) {
        this.chatroom_name = str;
        return this;
    }

    public ChatroomData setChatroom_profile_jump_info(JumpInfo jumpInfo) {
        this.chatroom_profile_jump_info = jumpInfo;
        return this;
    }

    public ChatroomData setChatroom_tag_list(LinkedList<ChatroomTag> linkedList) {
        this.chatroom_tag_list = linkedList;
        return this;
    }

    public ChatroomData setChatroom_type(int i) {
        this.chatroom_type = i;
        return this;
    }

    public ChatroomData setIs_private(boolean z) {
        this.is_private = z;
        return this;
    }

    public ChatroomData setKick_out_type(int i) {
        this.kick_out_type = i;
        return this;
    }

    public ChatroomData setNotice(ChatroomNotice chatroomNotice) {
        this.notice = chatroomNotice;
        return this;
    }

    public ChatroomData setReport_str(String str) {
        this.report_str = str;
        return this;
    }

    public ChatroomData setRoom_member_num(int i) {
        this.room_member_num = i;
        return this;
    }

    public ChatroomData setRoom_name(String str) {
        this.room_name = str;
        return this;
    }

    public ChatroomData setRule_list(LinkedList<RestrictRule> linkedList) {
        this.rule_list = linkedList;
        return this;
    }

    public ChatroomData setTop_chatroom(boolean z) {
        this.top_chatroom = z;
        return this;
    }

    public ChatroomData setUser_chatroom_relation(int i) {
        this.user_chatroom_relation = i;
        return this;
    }

    public ChatroomData setVersion(String str) {
        this.version = str;
        return this;
    }
}
