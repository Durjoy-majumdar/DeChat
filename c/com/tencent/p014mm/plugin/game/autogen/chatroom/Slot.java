package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Slot */
public class Slot extends C47465a {
    public JumpInfo jump_info;
    public OnlineUser online_user_status;
    public int slot_type;

    public static final Slot create() {
        return new Slot();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Slot)) {
            return false;
        }
        Slot slot = (Slot) aVar;
        return C46238a.m51546a(Integer.valueOf(this.slot_type), Integer.valueOf(slot.slot_type)) && C46238a.m51546a(this.online_user_status, slot.online_user_status) && C46238a.m51546a(this.jump_info, slot.jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.slot_type);
            OnlineUser onlineUser = this.online_user_status;
            if (onlineUser != null) {
                aVar.mo74322i(2, onlineUser.computeSize());
                this.online_user_status.writeFields(aVar);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.slot_type) + 0;
            OnlineUser onlineUser2 = this.online_user_status;
            if (onlineUser2 != null) {
                e += C52418a.m58682i(2, onlineUser2.computeSize());
            }
            JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? e + C52418a.m58682i(3, jumpInfo2.computeSize()) : e;
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
            Slot slot = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                slot.slot_type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    OnlineUser onlineUser3 = new OnlineUser();
                    if (bArr != null && bArr.length > 0) {
                        onlineUser3.parseFrom(bArr);
                    }
                    slot.online_user_status = onlineUser3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        jumpInfo3.parseFrom(bArr2);
                    }
                    slot.jump_info = jumpInfo3;
                }
                return 0;
            }
        }
    }

    public Slot setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public Slot setOnline_user_status(OnlineUser onlineUser) {
        this.online_user_status = onlineUser;
        return this;
    }

    public Slot setSlot_type(int i) {
        this.slot_type = i;
        return this;
    }
}
