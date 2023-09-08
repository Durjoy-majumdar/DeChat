package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.SchemaInfo */
public class SchemaInfo extends C47465a {
    public String android_app_public_key;
    public String android_appstore_scheme;
    public String android_package;
    public String android_universal_link;
    public String appstore_link;
    public String scheme;
    public String universal_link;

    public static final SchemaInfo create() {
        return new SchemaInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof SchemaInfo)) {
            return false;
        }
        SchemaInfo schemaInfo = (SchemaInfo) aVar;
        return C46238a.m51546a(this.universal_link, schemaInfo.universal_link) && C46238a.m51546a(this.scheme, schemaInfo.scheme) && C46238a.m51546a(this.appstore_link, schemaInfo.appstore_link) && C46238a.m51546a(this.android_universal_link, schemaInfo.android_universal_link) && C46238a.m51546a(this.android_appstore_scheme, schemaInfo.android_appstore_scheme) && C46238a.m51546a(this.android_package, schemaInfo.android_package) && C46238a.m51546a(this.android_app_public_key, schemaInfo.android_app_public_key);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.universal_link;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.scheme;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.appstore_link;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.android_universal_link;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.android_appstore_scheme;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.android_package;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.android_app_public_key;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.universal_link;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.scheme;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.appstore_link;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.android_universal_link;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.android_appstore_scheme;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.android_package;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.android_app_public_key;
            return str14 != null ? i2 + C52418a.m58683j(7, str14) : i2;
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
            SchemaInfo schemaInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    schemaInfo.universal_link = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    schemaInfo.scheme = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    schemaInfo.appstore_link = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    schemaInfo.android_universal_link = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    schemaInfo.android_appstore_scheme = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    schemaInfo.android_package = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    schemaInfo.android_app_public_key = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public SchemaInfo setAndroid_app_public_key(String str) {
        this.android_app_public_key = str;
        return this;
    }

    public SchemaInfo setAndroid_appstore_scheme(String str) {
        this.android_appstore_scheme = str;
        return this;
    }

    public SchemaInfo setAndroid_package(String str) {
        this.android_package = str;
        return this;
    }

    public SchemaInfo setAndroid_universal_link(String str) {
        this.android_universal_link = str;
        return this;
    }

    public SchemaInfo setAppstore_link(String str) {
        this.appstore_link = str;
        return this;
    }

    public SchemaInfo setScheme(String str) {
        this.scheme = str;
        return this;
    }

    public SchemaInfo setUniversal_link(String str) {
        this.universal_link = str;
        return this;
    }
}
