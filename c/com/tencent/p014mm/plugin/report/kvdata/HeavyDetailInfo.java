package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo */
public class HeavyDetailInfo extends C47465a {
    public long chatroom_;
    public long contact_;
    public long conversation_;
    public long dbSize_;
    public long favDbSize_;
    public long flag_;
    public long message_;
    public long sdFileRatio_;
    public long sdFileSize_;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof HeavyDetailInfo)) {
            return false;
        }
        HeavyDetailInfo heavyDetailInfo = (HeavyDetailInfo) aVar;
        return C46238a.m51546a(Long.valueOf(this.flag_), Long.valueOf(heavyDetailInfo.flag_)) && C46238a.m51546a(Long.valueOf(this.sdFileSize_), Long.valueOf(heavyDetailInfo.sdFileSize_)) && C46238a.m51546a(Long.valueOf(this.sdFileRatio_), Long.valueOf(heavyDetailInfo.sdFileRatio_)) && C46238a.m51546a(Long.valueOf(this.dbSize_), Long.valueOf(heavyDetailInfo.dbSize_)) && C46238a.m51546a(Long.valueOf(this.message_), Long.valueOf(heavyDetailInfo.message_)) && C46238a.m51546a(Long.valueOf(this.conversation_), Long.valueOf(heavyDetailInfo.conversation_)) && C46238a.m51546a(Long.valueOf(this.contact_), Long.valueOf(heavyDetailInfo.contact_)) && C46238a.m51546a(Long.valueOf(this.chatroom_), Long.valueOf(heavyDetailInfo.chatroom_)) && C46238a.m51546a(Long.valueOf(this.favDbSize_), Long.valueOf(heavyDetailInfo.favDbSize_));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.flag_);
            aVar.mo74321h(2, this.sdFileSize_);
            aVar.mo74321h(3, this.sdFileRatio_);
            aVar.mo74321h(4, this.dbSize_);
            aVar.mo74321h(5, this.message_);
            aVar.mo74321h(6, this.conversation_);
            aVar.mo74321h(7, this.contact_);
            aVar.mo74321h(8, this.chatroom_);
            aVar.mo74321h(9, this.favDbSize_);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.flag_) + 0 + C52418a.m58681h(2, this.sdFileSize_) + C52418a.m58681h(3, this.sdFileRatio_) + C52418a.m58681h(4, this.dbSize_) + C52418a.m58681h(5, this.message_) + C52418a.m58681h(6, this.conversation_) + C52418a.m58681h(7, this.contact_) + C52418a.m58681h(8, this.chatroom_) + C52418a.m58681h(9, this.favDbSize_);
        } else {
            if (i == 2) {
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
                HeavyDetailInfo heavyDetailInfo = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        heavyDetailInfo.flag_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        heavyDetailInfo.sdFileSize_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        heavyDetailInfo.sdFileRatio_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        heavyDetailInfo.dbSize_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        heavyDetailInfo.message_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        heavyDetailInfo.conversation_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        heavyDetailInfo.contact_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        heavyDetailInfo.chatroom_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        heavyDetailInfo.favDbSize_ = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
