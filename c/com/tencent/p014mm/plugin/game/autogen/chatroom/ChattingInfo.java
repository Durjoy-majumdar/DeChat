package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo */
public class ChattingInfo extends C47465a {
    public String avator;
    public int chating_type;
    public String desc;
    public int version;

    public static final ChattingInfo create() {
        return new ChattingInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChattingInfo)) {
            return false;
        }
        ChattingInfo chattingInfo = (ChattingInfo) aVar;
        return C46238a.m51546a(this.desc, chattingInfo.desc) && C46238a.m51546a(Integer.valueOf(this.chating_type), Integer.valueOf(chattingInfo.chating_type)) && C46238a.m51546a(this.avator, chattingInfo.avator) && C46238a.m51546a(Integer.valueOf(this.version), Integer.valueOf(chattingInfo.version));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.desc;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.chating_type);
            String str2 = this.avator;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.version);
            return 0;
        } else if (i == 1) {
            String str3 = this.desc;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.chating_type);
            String str4 = this.avator;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.version);
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
            ChattingInfo chattingInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chattingInfo.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                chattingInfo.chating_type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                chattingInfo.avator = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                chattingInfo.version = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public ChattingInfo setAvator(String str) {
        this.avator = str;
        return this;
    }

    public ChattingInfo setChating_type(int i) {
        this.chating_type = i;
        return this;
    }

    public ChattingInfo setDesc(String str) {
        this.desc = str;
        return this;
    }

    public ChattingInfo setVersion(int i) {
        this.version = i;
        return this;
    }
}
