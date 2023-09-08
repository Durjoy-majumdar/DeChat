package com.tencent.p014mm.sdk.platformtools;

import a70.C79471a;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: com.tencent.mm.sdk.platformtools.BuildInfo */
public class BuildInfo {
    public static String BUILD_RAND_ID;
    public static String BUILD_TAG;
    public static String CLIENT_VERSION;
    public static int CLIENT_VERSION_INT;
    public static String COMMAND;
    public static boolean DEBUG;
    public static boolean ENABLE_FPS_ANALYSE;
    public static boolean ENABLE_LIVE_SDK_DEBUG;
    public static boolean ENABLE_MATRIX;
    public static boolean ENABLE_MATRIX_MEMORY_HOOK;
    public static boolean ENABLE_MATRIX_MEMORY_TRIGGERS;
    public static boolean ENABLE_MATRIX_OPENGL_HOOK;
    public static boolean ENABLE_MATRIX_PTHREAD_HOOK;
    public static boolean ENABLE_MATRIX_SILENCE_ANALYSE;
    public static boolean ENABLE_MATRIX_TRACE;
    public static boolean ENABLE_PAYTEST;
    public static boolean ENABLE_SYSTRACE;
    public static boolean ENABLE_UI_TOOL;
    public static boolean ENABLE_XPOSED_HOOK;
    public static boolean EX_DEVICE_LOGIN;
    public static String HOSTNAME;
    public static boolean IS_ARM64;
    public static boolean IS_FLAVOR_BLUE;
    public static boolean IS_FLAVOR_PURPLE;
    public static boolean IS_FLAVOR_P_ALPHA;
    public static boolean IS_FLAVOR_RED;
    public static boolean IS_UAT;
    public static String KINDA_DEFAULT;
    public static boolean MAAS_IN_PKG;
    public static String MATRIX_VERSION;
    public static String OVERRIDE_VERSION_NAME;
    public static String OWNER;
    public static boolean PRE_RELEASE;
    public static boolean REDESIGN_ENTRANCE;
    public static String REV;
    public static String SVNPATH;
    public static String TIME;
    public static String TINKER_VERSION;
    public static String curClientVersion = CLIENT_VERSION;
    public static final ImmutableBundle ext = new ImmutableBundle();

    /* renamed from: com.tencent.mm.sdk.platformtools.BuildInfo$Developer */
    public interface Developer {
        public static final int alexanderlu = 31;
        public static final int ashukang = 12;
        public static final int cpan = 99;
        public static final int dkyang = 20;
        public static final int edwardgu = 30;
        public static final int hakonzhao = 32;
        public static final int jiaminchen = 100;
        public static final int justinliu = 0;
        public static final int kirozhao = 1;
        public static final int klemlin = 11;
        public static final int pandyduan = 50;
        public static final int smoothieli = 10000;
        public static final int williamlin = 40;
        public static final int yihengliu = 10;
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.BuildInfo$StringUtil */
    public static class StringUtil {
        private StringUtil() {
        }

        public static String diffStr(String str, String str2) {
            if (str == null) {
                return null;
            }
            if (str.equals(str2)) {
                return str;
            }
            return String.format("%s(%s)", new Object[]{str, str2});
        }

        public static String stringFrom(String str, String str2) {
            if (str == null) {
                return null;
            }
            int indexOf = str.indexOf(str2);
            return indexOf < 0 ? str : str.substring(indexOf);
        }
    }

    public static String info() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = BUILD_TAG;
        String str3 = TIME;
        String str4 = REV;
        sb.append(String.format("[b.ver] %s\n", new Object[]{StringUtil.diffStr(curClientVersion, C79471a.f233015c)}));
        sb.append(String.format("[tag  ] %s\n", new Object[]{StringUtil.diffStr(str2, C79471a.f233019g)}));
        sb.append(String.format("[time ] %s\n", new Object[]{StringUtil.diffStr(str3, C79471a.f233017e)}));
        sb.append(String.format("[cmd  ] %s\n", new Object[]{StringUtil.diffStr(COMMAND, C79471a.f233020h)}));
        sb.append(String.format("[rev  ] %s\n", new Object[]{StringUtil.diffStr(str4, C79471a.f233014b)}));
        Object[] objArr = new Object[1];
        if (!(!"false".equalsIgnoreCase(C79471a.f233013a))) {
            str = "disabled";
        } else if (C79471a.f233021i == null) {
            str = C79471a.f233014b;
        } else {
            str = C79471a.f233014b + "." + C79471a.f233021i;
        }
        objArr[0] = str;
        sb.append(String.format("[p.rev] %s\n", objArr));
        Object[] objArr2 = new Object[1];
        objArr2[0] = IS_ARM64 ? XWalkEnvironment.RUNTIME_ABI_ARM64_STR : XWalkEnvironment.RUNTIME_ABI_ARM32_STR;
        sb.append(String.format("[eabi ] %s\n", objArr2));
        sb.append(String.format("[feature_id] %s\n", new Object[]{ext.getString("FEATURE_ID")}));
        return sb.toString();
    }
}
