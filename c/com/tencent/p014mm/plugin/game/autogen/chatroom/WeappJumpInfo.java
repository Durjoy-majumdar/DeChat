package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo */
public class WeappJumpInfo extends C47465a {
    public String appid;
    public String path;

    public static final WeappJumpInfo create() {
        return new WeappJumpInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof WeappJumpInfo)) {
            return false;
        }
        WeappJumpInfo weappJumpInfo = (WeappJumpInfo) aVar;
        return C46238a.m51546a(this.appid, weappJumpInfo.appid) && C46238a.m51546a(this.path, weappJumpInfo.path);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.appid;
            if (str == null) {
                throw new C52419b("Not all required fields were included: appid");
            } else if (this.path != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.path;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: path");
            }
        } else if (i == 1) {
            String str3 = this.appid;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.path;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.appid == null) {
                throw new C52419b("Not all required fields were included: appid");
            } else if (this.path != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: path");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            WeappJumpInfo weappJumpInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                weappJumpInfo.appid = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                weappJumpInfo.path = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public WeappJumpInfo setAppid(String str) {
        this.appid = str;
        return this;
    }

    public WeappJumpInfo setPath(String str) {
        this.path = str;
        return this;
    }
}
