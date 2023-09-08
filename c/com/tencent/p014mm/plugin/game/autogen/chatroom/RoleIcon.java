package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon */
public class RoleIcon extends C47465a {
    public String icon_url;
    public JumpInfo jump_info;

    public static final RoleIcon create() {
        return new RoleIcon();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof RoleIcon)) {
            return false;
        }
        RoleIcon roleIcon = (RoleIcon) aVar;
        return C46238a.m51546a(this.icon_url, roleIcon.icon_url) && C46238a.m51546a(this.jump_info, roleIcon.jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.icon_url;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(2, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.icon_url;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? i2 + C52418a.m58682i(2, jumpInfo2.computeSize()) : i2;
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
            RoleIcon roleIcon = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                roleIcon.icon_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    roleIcon.jump_info = jumpInfo3;
                }
                return 0;
            }
        }
    }

    public RoleIcon setIcon_url(String str) {
        this.icon_url = str;
        return this;
    }

    public RoleIcon setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }
}
