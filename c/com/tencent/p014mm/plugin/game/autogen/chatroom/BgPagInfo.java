package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo */
public class BgPagInfo extends C47465a {
    public String pag_url;
    public int play_time;

    public static final BgPagInfo create() {
        return new BgPagInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof BgPagInfo)) {
            return false;
        }
        BgPagInfo bgPagInfo = (BgPagInfo) aVar;
        return C46238a.m51546a(this.pag_url, bgPagInfo.pag_url) && C46238a.m51546a(Integer.valueOf(this.play_time), Integer.valueOf(bgPagInfo.play_time));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.pag_url;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.play_time);
            return 0;
        } else if (i == 1) {
            String str2 = this.pag_url;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.play_time);
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
            BgPagInfo bgPagInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bgPagInfo.pag_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                bgPagInfo.play_time = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public BgPagInfo setPag_url(String str) {
        this.pag_url = str;
        return this;
    }

    public BgPagInfo setPlay_time(int i) {
        this.play_time = i;
        return this;
    }
}
