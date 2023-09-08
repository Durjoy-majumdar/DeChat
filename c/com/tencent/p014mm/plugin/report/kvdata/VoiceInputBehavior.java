package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior */
public class VoiceInputBehavior extends C47465a {
    public int cancel;
    public int chooseArea;
    public int chooseCantonese;
    public int clear;
    public int click;
    public int fail;
    public int fullScreenVoiceLongClick;
    public long fullScreenVoiceLongClickTime;
    public long initChoose;
    public int longClick;
    public long longClickTime;
    public int send;
    public int setDefaultLanguage;
    public int setSwitchCantonese;
    public int setlanguage;
    public int showInit;
    public int smileIconClick;
    public int textChangeCount;
    public int textChangeReturn;
    public long textChangeTime;
    public int textClick;
    public int voiceIconClick;
    public long voiceInputTime;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof VoiceInputBehavior)) {
            return false;
        }
        VoiceInputBehavior voiceInputBehavior = (VoiceInputBehavior) aVar;
        return C46238a.m51546a(Integer.valueOf(this.cancel), Integer.valueOf(voiceInputBehavior.cancel)) && C46238a.m51546a(Integer.valueOf(this.send), Integer.valueOf(voiceInputBehavior.send)) && C46238a.m51546a(Integer.valueOf(this.click), Integer.valueOf(voiceInputBehavior.click)) && C46238a.m51546a(Integer.valueOf(this.longClick), Integer.valueOf(voiceInputBehavior.longClick)) && C46238a.m51546a(Long.valueOf(this.longClickTime), Long.valueOf(voiceInputBehavior.longClickTime)) && C46238a.m51546a(Integer.valueOf(this.textClick), Integer.valueOf(voiceInputBehavior.textClick)) && C46238a.m51546a(Integer.valueOf(this.textChangeCount), Integer.valueOf(voiceInputBehavior.textChangeCount)) && C46238a.m51546a(Long.valueOf(this.textChangeTime), Long.valueOf(voiceInputBehavior.textChangeTime)) && C46238a.m51546a(Integer.valueOf(this.textChangeReturn), Integer.valueOf(voiceInputBehavior.textChangeReturn)) && C46238a.m51546a(Long.valueOf(this.voiceInputTime), Long.valueOf(voiceInputBehavior.voiceInputTime)) && C46238a.m51546a(Integer.valueOf(this.fail), Integer.valueOf(voiceInputBehavior.fail)) && C46238a.m51546a(Integer.valueOf(this.clear), Integer.valueOf(voiceInputBehavior.clear)) && C46238a.m51546a(Integer.valueOf(this.smileIconClick), Integer.valueOf(voiceInputBehavior.smileIconClick)) && C46238a.m51546a(Integer.valueOf(this.voiceIconClick), Integer.valueOf(voiceInputBehavior.voiceIconClick)) && C46238a.m51546a(Integer.valueOf(this.fullScreenVoiceLongClick), Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick)) && C46238a.m51546a(Long.valueOf(this.fullScreenVoiceLongClickTime), Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime)) && C46238a.m51546a(Integer.valueOf(this.showInit), Integer.valueOf(voiceInputBehavior.showInit)) && C46238a.m51546a(Long.valueOf(this.initChoose), Long.valueOf(voiceInputBehavior.initChoose)) && C46238a.m51546a(Integer.valueOf(this.chooseArea), Integer.valueOf(voiceInputBehavior.chooseArea)) && C46238a.m51546a(Integer.valueOf(this.chooseCantonese), Integer.valueOf(voiceInputBehavior.chooseCantonese)) && C46238a.m51546a(Integer.valueOf(this.setlanguage), Integer.valueOf(voiceInputBehavior.setlanguage)) && C46238a.m51546a(Integer.valueOf(this.setSwitchCantonese), Integer.valueOf(voiceInputBehavior.setSwitchCantonese)) && C46238a.m51546a(Integer.valueOf(this.setDefaultLanguage), Integer.valueOf(voiceInputBehavior.setDefaultLanguage));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.cancel);
            aVar.mo74318e(2, this.send);
            aVar.mo74318e(3, this.click);
            aVar.mo74318e(4, this.longClick);
            aVar.mo74321h(5, this.longClickTime);
            aVar.mo74318e(6, this.textClick);
            aVar.mo74318e(7, this.textChangeCount);
            aVar.mo74321h(8, this.textChangeTime);
            aVar.mo74318e(9, this.textChangeReturn);
            aVar.mo74321h(10, this.voiceInputTime);
            aVar.mo74318e(11, this.fail);
            aVar.mo74318e(12, this.clear);
            aVar.mo74318e(13, this.smileIconClick);
            aVar.mo74318e(14, this.voiceIconClick);
            aVar.mo74318e(15, this.fullScreenVoiceLongClick);
            aVar.mo74321h(16, this.fullScreenVoiceLongClickTime);
            aVar.mo74318e(17, this.showInit);
            aVar.mo74321h(18, this.initChoose);
            aVar.mo74318e(19, this.chooseArea);
            aVar.mo74318e(20, this.chooseCantonese);
            aVar.mo74318e(21, this.setlanguage);
            aVar.mo74318e(22, this.setSwitchCantonese);
            aVar.mo74318e(23, this.setDefaultLanguage);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58678e(1, this.cancel) + 0 + C52418a.m58678e(2, this.send) + C52418a.m58678e(3, this.click) + C52418a.m58678e(4, this.longClick) + C52418a.m58681h(5, this.longClickTime) + C52418a.m58678e(6, this.textClick) + C52418a.m58678e(7, this.textChangeCount) + C52418a.m58681h(8, this.textChangeTime) + C52418a.m58678e(9, this.textChangeReturn) + C52418a.m58681h(10, this.voiceInputTime) + C52418a.m58678e(11, this.fail) + C52418a.m58678e(12, this.clear) + C52418a.m58678e(13, this.smileIconClick) + C52418a.m58678e(14, this.voiceIconClick) + C52418a.m58678e(15, this.fullScreenVoiceLongClick) + C52418a.m58681h(16, this.fullScreenVoiceLongClickTime) + C52418a.m58678e(17, this.showInit) + C52418a.m58681h(18, this.initChoose) + C52418a.m58678e(19, this.chooseArea) + C52418a.m58678e(20, this.chooseCantonese) + C52418a.m58678e(21, this.setlanguage) + C52418a.m58678e(22, this.setSwitchCantonese) + C52418a.m58678e(23, this.setDefaultLanguage);
        } else {
            if (i2 == 2) {
                C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                    if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                        aVar2.mo141624b();
                    }
                }
                return 0;
            } else if (i2 != 3) {
                return -1;
            } else {
                C102122a aVar3 = objArr[0];
                VoiceInputBehavior voiceInputBehavior = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        voiceInputBehavior.cancel = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        voiceInputBehavior.send = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        voiceInputBehavior.click = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        voiceInputBehavior.longClick = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        voiceInputBehavior.longClickTime = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        voiceInputBehavior.textClick = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        voiceInputBehavior.textChangeCount = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        voiceInputBehavior.textChangeTime = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        voiceInputBehavior.textChangeReturn = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        voiceInputBehavior.voiceInputTime = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        voiceInputBehavior.fail = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        voiceInputBehavior.clear = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        voiceInputBehavior.smileIconClick = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        voiceInputBehavior.voiceIconClick = aVar3.mo141629g(intValue);
                        return 0;
                    case 15:
                        voiceInputBehavior.fullScreenVoiceLongClick = aVar3.mo141629g(intValue);
                        return 0;
                    case 16:
                        voiceInputBehavior.fullScreenVoiceLongClickTime = aVar3.mo141631i(intValue);
                        return 0;
                    case 17:
                        voiceInputBehavior.showInit = aVar3.mo141629g(intValue);
                        return 0;
                    case 18:
                        voiceInputBehavior.initChoose = aVar3.mo141631i(intValue);
                        return 0;
                    case 19:
                        voiceInputBehavior.chooseArea = aVar3.mo141629g(intValue);
                        return 0;
                    case 20:
                        voiceInputBehavior.chooseCantonese = aVar3.mo141629g(intValue);
                        return 0;
                    case 21:
                        voiceInputBehavior.setlanguage = aVar3.mo141629g(intValue);
                        return 0;
                    case 22:
                        voiceInputBehavior.setSwitchCantonese = aVar3.mo141629g(intValue);
                        return 0;
                    case 23:
                        voiceInputBehavior.setDefaultLanguage = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
