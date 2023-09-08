package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaRelateBrandInfo */
public class WxaRelateBrandInfo extends C47465a {
    public String desc;
    public String icon_url;
    public String title;
    public String username;

    public static final WxaRelateBrandInfo create() {
        return new WxaRelateBrandInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof WxaRelateBrandInfo)) {
            return false;
        }
        WxaRelateBrandInfo wxaRelateBrandInfo = (WxaRelateBrandInfo) aVar;
        return C46238a.m51546a(this.icon_url, wxaRelateBrandInfo.icon_url) && C46238a.m51546a(this.title, wxaRelateBrandInfo.title) && C46238a.m51546a(this.desc, wxaRelateBrandInfo.desc) && C46238a.m51546a(this.username, wxaRelateBrandInfo.username);
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
            String str2 = this.title;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.desc;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.username;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.icon_url;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.title;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.desc;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.username;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            WxaRelateBrandInfo wxaRelateBrandInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wxaRelateBrandInfo.icon_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wxaRelateBrandInfo.title = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wxaRelateBrandInfo.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                wxaRelateBrandInfo.username = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public WxaRelateBrandInfo setDesc(String str) {
        this.desc = str;
        return this;
    }

    public WxaRelateBrandInfo setIcon_url(String str) {
        this.icon_url = str;
        return this;
    }

    public WxaRelateBrandInfo setTitle(String str) {
        this.title = str;
        return this;
    }

    public WxaRelateBrandInfo setUsername(String str) {
        this.username = str;
        return this;
    }
}
