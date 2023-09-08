package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo */
public class EnterLeadSpeakInfo extends C47465a {
    public int disappear_second;
    public String jump_wording;
    public String lead_speak_wording;

    public static final EnterLeadSpeakInfo create() {
        return new EnterLeadSpeakInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof EnterLeadSpeakInfo)) {
            return false;
        }
        EnterLeadSpeakInfo enterLeadSpeakInfo = (EnterLeadSpeakInfo) aVar;
        return C46238a.m51546a(this.jump_wording, enterLeadSpeakInfo.jump_wording) && C46238a.m51546a(this.lead_speak_wording, enterLeadSpeakInfo.lead_speak_wording) && C46238a.m51546a(Integer.valueOf(this.disappear_second), Integer.valueOf(enterLeadSpeakInfo.disappear_second));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.jump_wording;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.lead_speak_wording;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.disappear_second);
            return 0;
        } else if (i == 1) {
            String str3 = this.jump_wording;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.lead_speak_wording;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.disappear_second);
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
            EnterLeadSpeakInfo enterLeadSpeakInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                enterLeadSpeakInfo.jump_wording = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                enterLeadSpeakInfo.lead_speak_wording = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                enterLeadSpeakInfo.disappear_second = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public EnterLeadSpeakInfo setDisappear_second(int i) {
        this.disappear_second = i;
        return this;
    }

    public EnterLeadSpeakInfo setJump_wording(String str) {
        this.jump_wording = str;
        return this;
    }

    public EnterLeadSpeakInfo setLead_speak_wording(String str) {
        this.lead_speak_wording = str;
        return this;
    }
}
