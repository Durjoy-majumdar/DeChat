package com.tencent.p014mm.plugin.appbrand.report;

import android.os.Bundle;
import com.tencent.xweb.file.XVFSFile;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.appbrand.report.w */
public class C68633w {
    /* renamed from: a */
    public static int m80874a(int i, Bundle bundle) {
        if (bundle == null || !m80876c(i)) {
            return 0;
        }
        return bundle.getInt("stat_scene");
    }

    /* renamed from: b */
    public static String m80875b(int i, Bundle bundle) {
        String str = "";
        if (bundle != null && m80876c(i)) {
            switch (bundle.getInt("stat_scene")) {
                case 1:
                    return bundle.getString("stat_send_msg_user");
                case 2:
                    String string = bundle.getString("stat_chat_talker_username");
                    String string2 = bundle.getString("stat_send_msg_user");
                    return string + XVFSFile.PATH_SEPARATOR + string2;
                case 3:
                    String string3 = bundle.getString("stat_msg_id");
                    String string4 = bundle.getString("stat_send_msg_user");
                    return string3 + XVFSFile.PATH_SEPARATOR + string4;
                case 4:
                    return C117627q.m165908a(bundle.getString("stat_url"));
                case 6:
                    String string5 = bundle.getString("stat_app_id");
                    String string6 = bundle.getString("stat_url");
                    StringBuilder sb = new StringBuilder();
                    sb.append(string5);
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    if (string6 != null) {
                        str = string6;
                    }
                    sb.append(C117627q.m165908a(str));
                    return sb.toString();
                case 7:
                    return bundle.getString("stat_chat_talker_username");
                case 8:
                    return "search:" + bundle.getString("stat_search_id");
                case 9:
                    String string7 = bundle.getString("stat_chat_talker_username");
                    String string8 = bundle.getString("stat_send_msg_user");
                    return string7 + XVFSFile.PATH_SEPARATOR + string8;
            }
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m80876c(int i) {
        if (i == 1007 || i == 1008 || i == 1012 || i == 1024 || i == 1031 || i == 1036 || i == 1044 || i == 1048 || i == 1088) {
            return true;
        }
        switch (i) {
            case 1124:
            case 1125:
            case 1126:
                return true;
            default:
                return false;
        }
    }
}
