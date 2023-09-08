package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.sdk.platformtools.FilePathGenerator */
public class FilePathGenerator {
    public static final String ANDROID_DIR_SEP = "/";
    public static final int HASH_TYPE_ALL_MD5 = 2;
    public static final int HASH_TYPE_HEAD_2_BYTE = 1;
    public static final String NO_MEDIA_FILENAME = ".nomedia";
    private static final String TAG = "MicroMsg.FilePathGenerator";

    /* renamed from: com.tencent.mm.sdk.platformtools.FilePathGenerator$DIR_HASH_TYPE */
    public enum DIR_HASH_TYPE {
        HEAD_2_BYTE,
        ALL_MD5
    }

    public static boolean checkMkdir(String str) {
        C86013q1.m106461v(str);
        return true;
    }

    public static String defGenPathWithOld(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        String str6 = str + str3 + str4 + str5;
        String genPath = genPath(str2, str3, str4, str5, i, z);
        if (Util.isNullOrNil(str6) || Util.isNullOrNil(genPath)) {
            return null;
        }
        C86009m1 m1Var = new C86009m1(genPath);
        C86009m1 m1Var2 = new C86009m1(str6);
        if (!m1Var.mo119967g() && m1Var2.mo119967g()) {
            FilesCopy.copy(str6, genPath, false);
        }
        return genPath;
    }

    private static String genByAllMd5(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return genByHead2Byte(C90193h.m112878f(str.getBytes()));
    }

    private static String genByHead2Byte(String str) {
        if (Util.isNullOrNil(str) || str.length() <= 4) {
            return null;
        }
        return str.substring(0, 2) + "/" + str.substring(2, 4) + "/";
    }

    public static String genByHead2Byte_Index(String str, int i) {
        if (Util.isNullOrNil(str) || str.length() <= 4) {
            return null;
        }
        return str.substring(0, 2) + "/" + str.substring(2, 4) + "/" + Integer.toString(i) + "/";
    }

    public static String genPath(String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        if (Util.isNullOrNil(str) || !str.endsWith("/")) {
            return null;
        }
        if (i == 1) {
            str5 = genByHead2Byte(str3);
        } else {
            str5 = i == 2 ? genByAllMd5(str3) : "";
        }
        if (Util.isNullOrNil(str5)) {
            return null;
        }
        String str6 = str + str5;
        if (z && !checkMkdir(str6)) {
            return null;
        }
        return str6 + Util.nullAsNil(str2) + str3 + Util.nullAsNil(str4);
    }

    public static String defGenPathWithOld(String str, String str2, String str3, String str4, String str5, int i) {
        return defGenPathWithOld(str, str2, str3, str4, str5, i, true);
    }

    public static String genPath(String str, String str2, int i) {
        String str3;
        if (Util.isNullOrNil(str) || !str.endsWith("/")) {
            return null;
        }
        if (i == 1) {
            str3 = genByHead2Byte(str2);
        } else {
            str3 = i == 2 ? genByAllMd5(str2) : "";
        }
        if (Util.isNullOrNil(str3)) {
            return null;
        }
        return str + str3;
    }

    public static String genPath(String str, String str2, String str3, String str4, int i) {
        return genPath(str, str2, str3, str4, i, true);
    }
}
