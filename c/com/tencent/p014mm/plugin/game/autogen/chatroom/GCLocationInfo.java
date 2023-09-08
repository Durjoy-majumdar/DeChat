package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo */
public class GCLocationInfo extends C47465a {
    public String ad_code;
    public String city;
    public String country;
    public String province;
    public String region;

    public static final GCLocationInfo create() {
        return new GCLocationInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GCLocationInfo)) {
            return false;
        }
        GCLocationInfo gCLocationInfo = (GCLocationInfo) aVar;
        return C46238a.m51546a(this.province, gCLocationInfo.province) && C46238a.m51546a(this.country, gCLocationInfo.country) && C46238a.m51546a(this.city, gCLocationInfo.city) && C46238a.m51546a(this.ad_code, gCLocationInfo.ad_code) && C46238a.m51546a(this.region, gCLocationInfo.region);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.province;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.country;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.city;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.ad_code;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.region;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.province;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.country;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.city;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.ad_code;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.region;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            GCLocationInfo gCLocationInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gCLocationInfo.province = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gCLocationInfo.country = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gCLocationInfo.city = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                gCLocationInfo.ad_code = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gCLocationInfo.region = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public GCLocationInfo setAd_code(String str) {
        this.ad_code = str;
        return this;
    }

    public GCLocationInfo setCity(String str) {
        this.city = str;
        return this;
    }

    public GCLocationInfo setCountry(String str) {
        this.country = str;
        return this;
    }

    public GCLocationInfo setProvince(String str) {
        this.province = str;
        return this;
    }

    public GCLocationInfo setRegion(String str) {
        this.region = str;
        return this;
    }
}
