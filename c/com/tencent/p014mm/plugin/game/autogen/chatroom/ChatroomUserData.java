package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData */
public class ChatroomUserData extends C47465a {
    public String avatar;
    public boolean can_at_all;
    public boolean can_be_at;
    public boolean can_be_kicked;
    public boolean can_kick_member;
    public String chatroom_name;
    public JumpInfo create_account_jump_info;
    public String extern_info;
    public JumpInfo h5_profile_jump_info;
    public AccountIdentityInfo indentity;
    public boolean is_authorized;
    public boolean is_robot;
    public boolean is_self;
    public JumpInfo jump_info;
    public LbsInfo lbs_info;
    public String nickname;
    public int role;
    public int sex;
    public String signature;
    public TagInfo tag_info;
    public UserRole user_role;
    public String username;

    public static final ChatroomUserData create() {
        return new ChatroomUserData();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomUserData)) {
            return false;
        }
        ChatroomUserData chatroomUserData = (ChatroomUserData) aVar;
        return C46238a.m51546a(this.username, chatroomUserData.username) && C46238a.m51546a(this.nickname, chatroomUserData.nickname) && C46238a.m51546a(this.avatar, chatroomUserData.avatar) && C46238a.m51546a(Integer.valueOf(this.sex), Integer.valueOf(chatroomUserData.sex)) && C46238a.m51546a(this.jump_info, chatroomUserData.jump_info) && C46238a.m51546a(this.signature, chatroomUserData.signature) && C46238a.m51546a(Boolean.valueOf(this.is_authorized), Boolean.valueOf(chatroomUserData.is_authorized)) && C46238a.m51546a(this.tag_info, chatroomUserData.tag_info) && C46238a.m51546a(this.lbs_info, chatroomUserData.lbs_info) && C46238a.m51546a(this.chatroom_name, chatroomUserData.chatroom_name) && C46238a.m51546a(Integer.valueOf(this.role), Integer.valueOf(chatroomUserData.role)) && C46238a.m51546a(Boolean.valueOf(this.can_be_at), Boolean.valueOf(chatroomUserData.can_be_at)) && C46238a.m51546a(Boolean.valueOf(this.is_robot), Boolean.valueOf(chatroomUserData.is_robot)) && C46238a.m51546a(Boolean.valueOf(this.can_kick_member), Boolean.valueOf(chatroomUserData.can_kick_member)) && C46238a.m51546a(this.user_role, chatroomUserData.user_role) && C46238a.m51546a(Boolean.valueOf(this.can_be_kicked), Boolean.valueOf(chatroomUserData.can_be_kicked)) && C46238a.m51546a(Boolean.valueOf(this.can_at_all), Boolean.valueOf(chatroomUserData.can_at_all)) && C46238a.m51546a(this.h5_profile_jump_info, chatroomUserData.h5_profile_jump_info) && C46238a.m51546a(this.create_account_jump_info, chatroomUserData.create_account_jump_info) && C46238a.m51546a(this.indentity, chatroomUserData.indentity) && C46238a.m51546a(this.extern_info, chatroomUserData.extern_info) && C46238a.m51546a(Boolean.valueOf(this.is_self), Boolean.valueOf(chatroomUserData.is_self));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.username;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.nickname;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.avatar;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74318e(4, this.sex);
                JumpInfo jumpInfo = this.jump_info;
                if (jumpInfo != null) {
                    aVar.mo74322i(5, jumpInfo.computeSize());
                    this.jump_info.writeFields(aVar);
                }
                String str4 = this.signature;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74314a(7, this.is_authorized);
                TagInfo tagInfo = this.tag_info;
                if (tagInfo != null) {
                    aVar.mo74322i(8, tagInfo.computeSize());
                    this.tag_info.writeFields(aVar);
                }
                LbsInfo lbsInfo = this.lbs_info;
                if (lbsInfo != null) {
                    aVar.mo74322i(9, lbsInfo.computeSize());
                    this.lbs_info.writeFields(aVar);
                }
                String str5 = this.chatroom_name;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                aVar.mo74318e(11, this.role);
                aVar.mo74314a(12, this.can_be_at);
                aVar.mo74314a(13, this.is_robot);
                aVar.mo74314a(14, this.can_kick_member);
                UserRole userRole = this.user_role;
                if (userRole != null) {
                    aVar.mo74322i(15, userRole.computeSize());
                    this.user_role.writeFields(aVar);
                }
                aVar.mo74314a(16, this.can_be_kicked);
                aVar.mo74314a(17, this.can_at_all);
                JumpInfo jumpInfo2 = this.h5_profile_jump_info;
                if (jumpInfo2 != null) {
                    aVar.mo74322i(18, jumpInfo2.computeSize());
                    this.h5_profile_jump_info.writeFields(aVar);
                }
                JumpInfo jumpInfo3 = this.create_account_jump_info;
                if (jumpInfo3 != null) {
                    aVar.mo74322i(19, jumpInfo3.computeSize());
                    this.create_account_jump_info.writeFields(aVar);
                }
                AccountIdentityInfo accountIdentityInfo = this.indentity;
                if (accountIdentityInfo != null) {
                    aVar.mo74322i(20, accountIdentityInfo.computeSize());
                    this.indentity.writeFields(aVar);
                }
                String str6 = this.extern_info;
                if (str6 != null) {
                    aVar.mo74323j(21, str6);
                }
                aVar.mo74314a(22, this.is_self);
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i2 == 1) {
            String str7 = this.username;
            if (str7 != null) {
                i3 = C52418a.m58683j(1, str7) + 0;
            }
            String str8 = this.nickname;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            String str9 = this.avatar;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            int e = i3 + C52418a.m58678e(4, this.sex);
            JumpInfo jumpInfo4 = this.jump_info;
            if (jumpInfo4 != null) {
                e += C52418a.m58682i(5, jumpInfo4.computeSize());
            }
            String str10 = this.signature;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            int a = e + C52418a.m58674a(7, this.is_authorized);
            TagInfo tagInfo2 = this.tag_info;
            if (tagInfo2 != null) {
                a += C52418a.m58682i(8, tagInfo2.computeSize());
            }
            LbsInfo lbsInfo2 = this.lbs_info;
            if (lbsInfo2 != null) {
                a += C52418a.m58682i(9, lbsInfo2.computeSize());
            }
            String str11 = this.chatroom_name;
            if (str11 != null) {
                a += C52418a.m58683j(10, str11);
            }
            int e2 = a + C52418a.m58678e(11, this.role) + C52418a.m58674a(12, this.can_be_at) + C52418a.m58674a(13, this.is_robot) + C52418a.m58674a(14, this.can_kick_member);
            UserRole userRole2 = this.user_role;
            if (userRole2 != null) {
                e2 += C52418a.m58682i(15, userRole2.computeSize());
            }
            int a2 = e2 + C52418a.m58674a(16, this.can_be_kicked) + C52418a.m58674a(17, this.can_at_all);
            JumpInfo jumpInfo5 = this.h5_profile_jump_info;
            if (jumpInfo5 != null) {
                a2 += C52418a.m58682i(18, jumpInfo5.computeSize());
            }
            JumpInfo jumpInfo6 = this.create_account_jump_info;
            if (jumpInfo6 != null) {
                a2 += C52418a.m58682i(19, jumpInfo6.computeSize());
            }
            AccountIdentityInfo accountIdentityInfo2 = this.indentity;
            if (accountIdentityInfo2 != null) {
                a2 += C52418a.m58682i(20, accountIdentityInfo2.computeSize());
            }
            String str12 = this.extern_info;
            if (str12 != null) {
                a2 += C52418a.m58683j(21, str12);
            }
            return a2 + C52418a.m58674a(22, this.is_self);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.username != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ChatroomUserData chatroomUserData = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomUserData.username = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    chatroomUserData.nickname = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    chatroomUserData.avatar = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    chatroomUserData.sex = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        JumpInfo jumpInfo7 = new JumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            jumpInfo7.parseFrom(bArr);
                        }
                        chatroomUserData.jump_info = jumpInfo7;
                    }
                    return 0;
                case 6:
                    chatroomUserData.signature = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    chatroomUserData.is_authorized = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        TagInfo tagInfo3 = new TagInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            tagInfo3.parseFrom(bArr2);
                        }
                        chatroomUserData.tag_info = tagInfo3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        LbsInfo lbsInfo3 = new LbsInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            lbsInfo3.parseFrom(bArr3);
                        }
                        chatroomUserData.lbs_info = lbsInfo3;
                    }
                    return 0;
                case 10:
                    chatroomUserData.chatroom_name = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    chatroomUserData.role = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    chatroomUserData.can_be_at = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    chatroomUserData.is_robot = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    chatroomUserData.can_kick_member = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        UserRole userRole3 = new UserRole();
                        if (bArr4 != null && bArr4.length > 0) {
                            userRole3.parseFrom(bArr4);
                        }
                        chatroomUserData.user_role = userRole3;
                    }
                    return 0;
                case 16:
                    chatroomUserData.can_be_kicked = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    chatroomUserData.can_at_all = aVar3.mo141625c(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        JumpInfo jumpInfo8 = new JumpInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            jumpInfo8.parseFrom(bArr5);
                        }
                        chatroomUserData.h5_profile_jump_info = jumpInfo8;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        JumpInfo jumpInfo9 = new JumpInfo();
                        if (bArr6 != null && bArr6.length > 0) {
                            jumpInfo9.parseFrom(bArr6);
                        }
                        chatroomUserData.create_account_jump_info = jumpInfo9;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        AccountIdentityInfo accountIdentityInfo3 = new AccountIdentityInfo();
                        if (bArr7 != null && bArr7.length > 0) {
                            accountIdentityInfo3.parseFrom(bArr7);
                        }
                        chatroomUserData.indentity = accountIdentityInfo3;
                    }
                    return 0;
                case 21:
                    chatroomUserData.extern_info = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    chatroomUserData.is_self = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomUserData setAvatar(String str) {
        this.avatar = str;
        return this;
    }

    public ChatroomUserData setCan_at_all(boolean z) {
        this.can_at_all = z;
        return this;
    }

    public ChatroomUserData setCan_be_at(boolean z) {
        this.can_be_at = z;
        return this;
    }

    public ChatroomUserData setCan_be_kicked(boolean z) {
        this.can_be_kicked = z;
        return this;
    }

    public ChatroomUserData setCan_kick_member(boolean z) {
        this.can_kick_member = z;
        return this;
    }

    public ChatroomUserData setChatroom_name(String str) {
        this.chatroom_name = str;
        return this;
    }

    public ChatroomUserData setCreate_account_jump_info(JumpInfo jumpInfo) {
        this.create_account_jump_info = jumpInfo;
        return this;
    }

    public ChatroomUserData setExtern_info(String str) {
        this.extern_info = str;
        return this;
    }

    public ChatroomUserData setH5_profile_jump_info(JumpInfo jumpInfo) {
        this.h5_profile_jump_info = jumpInfo;
        return this;
    }

    public ChatroomUserData setIndentity(AccountIdentityInfo accountIdentityInfo) {
        this.indentity = accountIdentityInfo;
        return this;
    }

    public ChatroomUserData setIs_authorized(boolean z) {
        this.is_authorized = z;
        return this;
    }

    public ChatroomUserData setIs_robot(boolean z) {
        this.is_robot = z;
        return this;
    }

    public ChatroomUserData setIs_self(boolean z) {
        this.is_self = z;
        return this;
    }

    public ChatroomUserData setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public ChatroomUserData setLbs_info(LbsInfo lbsInfo) {
        this.lbs_info = lbsInfo;
        return this;
    }

    public ChatroomUserData setNickname(String str) {
        this.nickname = str;
        return this;
    }

    public ChatroomUserData setRole(int i) {
        this.role = i;
        return this;
    }

    public ChatroomUserData setSex(int i) {
        this.sex = i;
        return this;
    }

    public ChatroomUserData setSignature(String str) {
        this.signature = str;
        return this;
    }

    public ChatroomUserData setTag_info(TagInfo tagInfo) {
        this.tag_info = tagInfo;
        return this;
    }

    public ChatroomUserData setUser_role(UserRole userRole) {
        this.user_role = userRole;
        return this;
    }

    public ChatroomUserData setUsername(String str) {
        this.username = str;
        return this;
    }
}
