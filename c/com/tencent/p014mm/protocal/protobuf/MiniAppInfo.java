package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.MiniAppInfo */
public class MiniAppInfo extends C47465a {
    public String app_id;
    public String appusername;
    public C89349b extra_data;
    public String fetch_info_id;
    public boolean hide_default_bar;
    public boolean hide_drag_bar;
    public int launch_animation_type;
    public String path;
    public String product_path_cookie;
    public String request_id;
    public int scene;
    public String scene_note;
    public int version_type;

    public static final MiniAppInfo create() {
        return new MiniAppInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof MiniAppInfo)) {
            return false;
        }
        MiniAppInfo miniAppInfo = (MiniAppInfo) aVar;
        return C46238a.m51546a(this.app_id, miniAppInfo.app_id) && C46238a.m51546a(this.path, miniAppInfo.path) && C46238a.m51546a(this.fetch_info_id, miniAppInfo.fetch_info_id) && C46238a.m51546a(this.request_id, miniAppInfo.request_id) && C46238a.m51546a(this.appusername, miniAppInfo.appusername) && C46238a.m51546a(Integer.valueOf(this.version_type), Integer.valueOf(miniAppInfo.version_type)) && C46238a.m51546a(this.extra_data, miniAppInfo.extra_data) && C46238a.m51546a(this.product_path_cookie, miniAppInfo.product_path_cookie) && C46238a.m51546a(Integer.valueOf(this.scene), Integer.valueOf(miniAppInfo.scene)) && C46238a.m51546a(Boolean.valueOf(this.hide_default_bar), Boolean.valueOf(miniAppInfo.hide_default_bar)) && C46238a.m51546a(Boolean.valueOf(this.hide_drag_bar), Boolean.valueOf(miniAppInfo.hide_drag_bar)) && C46238a.m51546a(Integer.valueOf(this.launch_animation_type), Integer.valueOf(miniAppInfo.launch_animation_type)) && C46238a.m51546a(this.scene_note, miniAppInfo.scene_note);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.app_id;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.path;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.fetch_info_id;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.request_id;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.appusername;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.version_type);
            C89349b bVar = this.extra_data;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            String str6 = this.product_path_cookie;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.scene);
            aVar.mo74314a(10, this.hide_default_bar);
            aVar.mo74314a(11, this.hide_drag_bar);
            aVar.mo74318e(12, this.launch_animation_type);
            String str7 = this.scene_note;
            if (str7 == null) {
                return 0;
            }
            aVar.mo74323j(13, str7);
            return 0;
        } else if (i2 == 1) {
            String str8 = this.app_id;
            int j = str8 != null ? 0 + C52418a.m58683j(1, str8) : 0;
            String str9 = this.path;
            if (str9 != null) {
                j += C52418a.m58683j(2, str9);
            }
            String str10 = this.fetch_info_id;
            if (str10 != null) {
                j += C52418a.m58683j(3, str10);
            }
            String str11 = this.request_id;
            if (str11 != null) {
                j += C52418a.m58683j(4, str11);
            }
            String str12 = this.appusername;
            if (str12 != null) {
                j += C52418a.m58683j(5, str12);
            }
            int e = j + C52418a.m58678e(6, this.version_type);
            C89349b bVar2 = this.extra_data;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            String str13 = this.product_path_cookie;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            int e2 = e + C52418a.m58678e(9, this.scene) + C52418a.m58674a(10, this.hide_default_bar) + C52418a.m58674a(11, this.hide_drag_bar) + C52418a.m58678e(12, this.launch_animation_type);
            String str14 = this.scene_note;
            return str14 != null ? e2 + C52418a.m58683j(13, str14) : e2;
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
            MiniAppInfo miniAppInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    miniAppInfo.app_id = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    miniAppInfo.path = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    miniAppInfo.fetch_info_id = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    miniAppInfo.request_id = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    miniAppInfo.appusername = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    miniAppInfo.version_type = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    miniAppInfo.extra_data = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    miniAppInfo.product_path_cookie = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    miniAppInfo.scene = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    miniAppInfo.hide_default_bar = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    miniAppInfo.hide_drag_bar = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    miniAppInfo.launch_animation_type = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    miniAppInfo.scene_note = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public MiniAppInfo setApp_id(String str) {
        this.app_id = str;
        return this;
    }

    public MiniAppInfo setAppusername(String str) {
        this.appusername = str;
        return this;
    }

    public MiniAppInfo setExtra_data(C89349b bVar) {
        this.extra_data = bVar;
        return this;
    }

    public MiniAppInfo setFetch_info_id(String str) {
        this.fetch_info_id = str;
        return this;
    }

    public MiniAppInfo setHide_default_bar(boolean z) {
        this.hide_default_bar = z;
        return this;
    }

    public MiniAppInfo setHide_drag_bar(boolean z) {
        this.hide_drag_bar = z;
        return this;
    }

    public MiniAppInfo setLaunch_animation_type(int i) {
        this.launch_animation_type = i;
        return this;
    }

    public MiniAppInfo setPath(String str) {
        this.path = str;
        return this;
    }

    public MiniAppInfo setProduct_path_cookie(String str) {
        this.product_path_cookie = str;
        return this;
    }

    public MiniAppInfo setRequest_id(String str) {
        this.request_id = str;
        return this;
    }

    public MiniAppInfo setScene(int i) {
        this.scene = i;
        return this;
    }

    public MiniAppInfo setScene_note(String str) {
        this.scene_note = str;
        return this;
    }

    public MiniAppInfo setVersion_type(int i) {
        this.version_type = i;
        return this;
    }
}
