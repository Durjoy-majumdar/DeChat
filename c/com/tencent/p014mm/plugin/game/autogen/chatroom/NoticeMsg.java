package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg */
public class NoticeMsg extends C47465a {
    public boolean highlight;
    public String notice_text;
    public long seq;

    public static final NoticeMsg create() {
        return new NoticeMsg();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof NoticeMsg)) {
            return false;
        }
        NoticeMsg noticeMsg = (NoticeMsg) aVar;
        return C46238a.m51546a(Long.valueOf(this.seq), Long.valueOf(noticeMsg.seq)) && C46238a.m51546a(this.notice_text, noticeMsg.notice_text) && C46238a.m51546a(Boolean.valueOf(this.highlight), Boolean.valueOf(noticeMsg.highlight));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.notice_text != null) {
                aVar.mo74321h(1, this.seq);
                String str = this.notice_text;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74314a(3, this.highlight);
                return 0;
            }
            throw new C52419b("Not all required fields were included: notice_text");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.seq) + 0;
            String str2 = this.notice_text;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58674a(3, this.highlight);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.notice_text != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: notice_text");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            NoticeMsg noticeMsg = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                noticeMsg.seq = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                noticeMsg.notice_text = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                noticeMsg.highlight = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public NoticeMsg setHighlight(boolean z) {
        this.highlight = z;
        return this;
    }

    public NoticeMsg setNotice_text(String str) {
        this.notice_text = str;
        return this;
    }

    public NoticeMsg setSeq(long j) {
        this.seq = j;
        return this;
    }
}
