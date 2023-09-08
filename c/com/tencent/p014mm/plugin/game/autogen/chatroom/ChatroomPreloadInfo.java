package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo */
public class ChatroomPreloadInfo extends C47465a {
    public JumpInfo preload_create_account_jump_info;
    public JumpInfo preload_premade_h5_jump_info;
    public JumpInfo preload_profile_jump_info;

    public static final ChatroomPreloadInfo create() {
        return new ChatroomPreloadInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomPreloadInfo)) {
            return false;
        }
        ChatroomPreloadInfo chatroomPreloadInfo = (ChatroomPreloadInfo) aVar;
        return C46238a.m51546a(this.preload_profile_jump_info, chatroomPreloadInfo.preload_profile_jump_info) && C46238a.m51546a(this.preload_create_account_jump_info, chatroomPreloadInfo.preload_create_account_jump_info) && C46238a.m51546a(this.preload_premade_h5_jump_info, chatroomPreloadInfo.preload_premade_h5_jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            JumpInfo jumpInfo = this.preload_profile_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(1, jumpInfo.computeSize());
                this.preload_profile_jump_info.writeFields(aVar);
            }
            JumpInfo jumpInfo2 = this.preload_create_account_jump_info;
            if (jumpInfo2 != null) {
                aVar.mo74322i(2, jumpInfo2.computeSize());
                this.preload_create_account_jump_info.writeFields(aVar);
            }
            JumpInfo jumpInfo3 = this.preload_premade_h5_jump_info;
            if (jumpInfo3 != null) {
                aVar.mo74322i(3, jumpInfo3.computeSize());
                this.preload_premade_h5_jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            JumpInfo jumpInfo4 = this.preload_profile_jump_info;
            if (jumpInfo4 != null) {
                i2 = 0 + C52418a.m58682i(1, jumpInfo4.computeSize());
            }
            JumpInfo jumpInfo5 = this.preload_create_account_jump_info;
            if (jumpInfo5 != null) {
                i2 += C52418a.m58682i(2, jumpInfo5.computeSize());
            }
            JumpInfo jumpInfo6 = this.preload_premade_h5_jump_info;
            return jumpInfo6 != null ? i2 + C52418a.m58682i(3, jumpInfo6.computeSize()) : i2;
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
            ChatroomPreloadInfo chatroomPreloadInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    JumpInfo jumpInfo7 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo7.parseFrom(bArr);
                    }
                    chatroomPreloadInfo.preload_profile_jump_info = jumpInfo7;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    JumpInfo jumpInfo8 = new JumpInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        jumpInfo8.parseFrom(bArr2);
                    }
                    chatroomPreloadInfo.preload_create_account_jump_info = jumpInfo8;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    JumpInfo jumpInfo9 = new JumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        jumpInfo9.parseFrom(bArr3);
                    }
                    chatroomPreloadInfo.preload_premade_h5_jump_info = jumpInfo9;
                }
                return 0;
            }
        }
    }

    public ChatroomPreloadInfo setPreload_create_account_jump_info(JumpInfo jumpInfo) {
        this.preload_create_account_jump_info = jumpInfo;
        return this;
    }

    public ChatroomPreloadInfo setPreload_premade_h5_jump_info(JumpInfo jumpInfo) {
        this.preload_premade_h5_jump_info = jumpInfo;
        return this;
    }

    public ChatroomPreloadInfo setPreload_profile_jump_info(JumpInfo jumpInfo) {
        this.preload_profile_jump_info = jumpInfo;
        return this;
    }
}
