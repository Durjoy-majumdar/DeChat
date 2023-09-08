package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo */
public class KickOutCardInfo extends C47465a {
    public JumpInfo right_button_jump_info;
    public String right_button_wording;

    public static final KickOutCardInfo create() {
        return new KickOutCardInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof KickOutCardInfo)) {
            return false;
        }
        KickOutCardInfo kickOutCardInfo = (KickOutCardInfo) aVar;
        return C46238a.m51546a(this.right_button_wording, kickOutCardInfo.right_button_wording) && C46238a.m51546a(this.right_button_jump_info, kickOutCardInfo.right_button_jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.right_button_wording;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            JumpInfo jumpInfo = this.right_button_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(2, jumpInfo.computeSize());
                this.right_button_jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.right_button_wording;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            JumpInfo jumpInfo2 = this.right_button_jump_info;
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
            KickOutCardInfo kickOutCardInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kickOutCardInfo.right_button_wording = aVar3.mo141633k(intValue);
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
                    kickOutCardInfo.right_button_jump_info = jumpInfo3;
                }
                return 0;
            }
        }
    }

    public KickOutCardInfo setRight_button_jump_info(JumpInfo jumpInfo) {
        this.right_button_jump_info = jumpInfo;
        return this;
    }

    public KickOutCardInfo setRight_button_wording(String str) {
        this.right_button_wording = str;
        return this;
    }
}
