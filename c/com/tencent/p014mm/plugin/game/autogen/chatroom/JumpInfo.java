package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo */
public class JumpInfo extends C47465a {
    public ChatroomSeq chatroom_seq;
    public HalfScreen half_screen;
    public int jump_type;
    public String jump_url;
    public String preload_id;
    public WeappJumpInfo weapp_jump_info;

    public static final JumpInfo create() {
        return new JumpInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof JumpInfo)) {
            return false;
        }
        JumpInfo jumpInfo = (JumpInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.jump_type), Integer.valueOf(jumpInfo.jump_type)) && C46238a.m51546a(this.jump_url, jumpInfo.jump_url) && C46238a.m51546a(this.weapp_jump_info, jumpInfo.weapp_jump_info) && C46238a.m51546a(this.half_screen, jumpInfo.half_screen) && C46238a.m51546a(this.chatroom_seq, jumpInfo.chatroom_seq) && C46238a.m51546a(this.preload_id, jumpInfo.preload_id);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.jump_type);
            String str = this.jump_url;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            WeappJumpInfo weappJumpInfo = this.weapp_jump_info;
            if (weappJumpInfo != null) {
                aVar.mo74322i(3, weappJumpInfo.computeSize());
                this.weapp_jump_info.writeFields(aVar);
            }
            HalfScreen halfScreen = this.half_screen;
            if (halfScreen != null) {
                aVar.mo74322i(4, halfScreen.computeSize());
                this.half_screen.writeFields(aVar);
            }
            ChatroomSeq chatroomSeq = this.chatroom_seq;
            if (chatroomSeq != null) {
                aVar.mo74322i(5, chatroomSeq.computeSize());
                this.chatroom_seq.writeFields(aVar);
            }
            String str2 = this.preload_id;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.jump_type) + 0;
            String str3 = this.jump_url;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            WeappJumpInfo weappJumpInfo2 = this.weapp_jump_info;
            if (weappJumpInfo2 != null) {
                e += C52418a.m58682i(3, weappJumpInfo2.computeSize());
            }
            HalfScreen halfScreen2 = this.half_screen;
            if (halfScreen2 != null) {
                e += C52418a.m58682i(4, halfScreen2.computeSize());
            }
            ChatroomSeq chatroomSeq2 = this.chatroom_seq;
            if (chatroomSeq2 != null) {
                e += C52418a.m58682i(5, chatroomSeq2.computeSize());
            }
            String str4 = this.preload_id;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
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
            JumpInfo jumpInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jumpInfo.jump_type = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    jumpInfo.jump_url = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        WeappJumpInfo weappJumpInfo3 = new WeappJumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            weappJumpInfo3.parseFrom(bArr);
                        }
                        jumpInfo.weapp_jump_info = weappJumpInfo3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        HalfScreen halfScreen3 = new HalfScreen();
                        if (bArr2 != null && bArr2.length > 0) {
                            halfScreen3.parseFrom(bArr2);
                        }
                        jumpInfo.half_screen = halfScreen3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        ChatroomSeq chatroomSeq3 = new ChatroomSeq();
                        if (bArr3 != null && bArr3.length > 0) {
                            chatroomSeq3.parseFrom(bArr3);
                        }
                        jumpInfo.chatroom_seq = chatroomSeq3;
                    }
                    return 0;
                case 6:
                    jumpInfo.preload_id = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public JumpInfo setChatroom_seq(ChatroomSeq chatroomSeq) {
        this.chatroom_seq = chatroomSeq;
        return this;
    }

    public JumpInfo setHalf_screen(HalfScreen halfScreen) {
        this.half_screen = halfScreen;
        return this;
    }

    public JumpInfo setJump_type(int i) {
        this.jump_type = i;
        return this;
    }

    public JumpInfo setJump_url(String str) {
        this.jump_url = str;
        return this;
    }

    public JumpInfo setPreload_id(String str) {
        this.preload_id = str;
        return this;
    }

    public JumpInfo setWeapp_jump_info(WeappJumpInfo weappJumpInfo) {
        this.weapp_jump_info = weappJumpInfo;
        return this;
    }
}
