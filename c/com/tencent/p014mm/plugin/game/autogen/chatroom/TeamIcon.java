package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon */
public class TeamIcon extends C47465a {
    public String desc;
    public JumpInfo jump_info;

    public static final TeamIcon create() {
        return new TeamIcon();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof TeamIcon)) {
            return false;
        }
        TeamIcon teamIcon = (TeamIcon) aVar;
        return C46238a.m51546a(this.jump_info, teamIcon.jump_info) && C46238a.m51546a(this.desc, teamIcon.desc);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(1, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            String str = this.desc;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                i2 = 0 + C52418a.m58682i(1, jumpInfo2.computeSize());
            }
            String str2 = this.desc;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            TeamIcon teamIcon = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    teamIcon.jump_info = jumpInfo3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                teamIcon.desc = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public TeamIcon setDesc(String str) {
        this.desc = str;
        return this;
    }

    public TeamIcon setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }
}
