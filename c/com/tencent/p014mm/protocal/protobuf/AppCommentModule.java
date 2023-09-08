package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.AppCommentModule */
public class AppCommentModule extends C47465a {
    public String more_appid;
    public String more_path;
    public String more_query;
    public String more_text;
    public String name_img_url;
    public String name_img_url_black;
    public String name_text;
    public String no_score_text;
    public String recommend;
    public int score_num;
    public String score_str;
    public int show_menu;
    public int show_profile;

    public static final AppCommentModule create() {
        return new AppCommentModule();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof AppCommentModule)) {
            return false;
        }
        AppCommentModule appCommentModule = (AppCommentModule) aVar;
        return C46238a.m51546a(Integer.valueOf(this.show_profile), Integer.valueOf(appCommentModule.show_profile)) && C46238a.m51546a(Integer.valueOf(this.show_menu), Integer.valueOf(appCommentModule.show_menu)) && C46238a.m51546a(this.name_text, appCommentModule.name_text) && C46238a.m51546a(this.name_img_url, appCommentModule.name_img_url) && C46238a.m51546a(this.name_img_url_black, appCommentModule.name_img_url_black) && C46238a.m51546a(this.score_str, appCommentModule.score_str) && C46238a.m51546a(Integer.valueOf(this.score_num), Integer.valueOf(appCommentModule.score_num)) && C46238a.m51546a(this.recommend, appCommentModule.recommend) && C46238a.m51546a(this.more_path, appCommentModule.more_path) && C46238a.m51546a(this.more_query, appCommentModule.more_query) && C46238a.m51546a(this.more_appid, appCommentModule.more_appid) && C46238a.m51546a(this.more_text, appCommentModule.more_text) && C46238a.m51546a(this.no_score_text, appCommentModule.no_score_text);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.show_profile);
            aVar.mo74318e(2, this.show_menu);
            String str = this.name_text;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.name_img_url;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.name_img_url_black;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.score_str;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.score_num);
            String str5 = this.recommend;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.more_path;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.more_query;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.more_appid;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.more_text;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.no_score_text;
            if (str10 == null) {
                return 0;
            }
            aVar.mo74323j(13, str10);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.show_profile) + 0 + C52418a.m58678e(2, this.show_menu);
            String str11 = this.name_text;
            if (str11 != null) {
                e += C52418a.m58683j(3, str11);
            }
            String str12 = this.name_img_url;
            if (str12 != null) {
                e += C52418a.m58683j(4, str12);
            }
            String str13 = this.name_img_url_black;
            if (str13 != null) {
                e += C52418a.m58683j(5, str13);
            }
            String str14 = this.score_str;
            if (str14 != null) {
                e += C52418a.m58683j(6, str14);
            }
            int e2 = e + C52418a.m58678e(7, this.score_num);
            String str15 = this.recommend;
            if (str15 != null) {
                e2 += C52418a.m58683j(8, str15);
            }
            String str16 = this.more_path;
            if (str16 != null) {
                e2 += C52418a.m58683j(9, str16);
            }
            String str17 = this.more_query;
            if (str17 != null) {
                e2 += C52418a.m58683j(10, str17);
            }
            String str18 = this.more_appid;
            if (str18 != null) {
                e2 += C52418a.m58683j(11, str18);
            }
            String str19 = this.more_text;
            if (str19 != null) {
                e2 += C52418a.m58683j(12, str19);
            }
            String str20 = this.no_score_text;
            return str20 != null ? e2 + C52418a.m58683j(13, str20) : e2;
        } else if (i2 == 2) {
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
            AppCommentModule appCommentModule = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    appCommentModule.show_profile = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    appCommentModule.show_menu = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    appCommentModule.name_text = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    appCommentModule.name_img_url = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    appCommentModule.name_img_url_black = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    appCommentModule.score_str = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    appCommentModule.score_num = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    appCommentModule.recommend = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    appCommentModule.more_path = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    appCommentModule.more_query = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    appCommentModule.more_appid = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    appCommentModule.more_text = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    appCommentModule.no_score_text = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public AppCommentModule setMore_appid(String str) {
        this.more_appid = str;
        return this;
    }

    public AppCommentModule setMore_path(String str) {
        this.more_path = str;
        return this;
    }

    public AppCommentModule setMore_query(String str) {
        this.more_query = str;
        return this;
    }

    public AppCommentModule setMore_text(String str) {
        this.more_text = str;
        return this;
    }

    public AppCommentModule setName_img_url(String str) {
        this.name_img_url = str;
        return this;
    }

    public AppCommentModule setName_img_url_black(String str) {
        this.name_img_url_black = str;
        return this;
    }

    public AppCommentModule setName_text(String str) {
        this.name_text = str;
        return this;
    }

    public AppCommentModule setNo_score_text(String str) {
        this.no_score_text = str;
        return this;
    }

    public AppCommentModule setRecommend(String str) {
        this.recommend = str;
        return this;
    }

    public AppCommentModule setScore_num(int i) {
        this.score_num = i;
        return this;
    }

    public AppCommentModule setScore_str(String str) {
        this.score_str = str;
        return this;
    }

    public AppCommentModule setShow_menu(int i) {
        this.show_menu = i;
        return this;
    }

    public AppCommentModule setShow_profile(int i) {
        this.show_profile = i;
        return this;
    }
}
