package com.tencent.kinda.framework.widget.tools;

import android.content.Context;

public class ResourcesUtils {
    public static final String JPG = ".jpg";
    private static final String RES_ANIM = "anim";
    private static final String RES_COLOR = "color";
    private static final String RES_DIMEN = "dimen";
    private static final String RES_DRABLE = "drawable";
    private static final String RES_ID = "id";
    private static final String RES_LAYOUT = "layout";
    private static final String RES_MENU = "menu";
    private static final String RES_STRING = "string";
    private static final String RES_STYLE = "style";

    private static String filter(String str) {
        return str.endsWith(".jpg") ? str.substring(0, str.length() - 4) : str;
    }

    public static int getAnimId(Context context, String str) {
        return getResId(context, filter(str), RES_ANIM);
    }

    public static int getColorId(Context context, String str) {
        return getResId(context, filter(str), RES_COLOR);
    }

    public static int getDimenId(Context context, String str) {
        return getResId(context, filter(str), RES_DIMEN);
    }

    public static int getDrawableId(Context context, String str) {
        return getResId(context, filter(str), RES_DRABLE);
    }

    public static int getId(Context context, String str) {
        return getResId(context, filter(str), "id");
    }

    public static int getLayoutId(Context context, String str) {
        return getResId(context, str, RES_LAYOUT);
    }

    public static int getMenuId(Context context, String str) {
        return getResId(context, filter(str), RES_MENU);
    }

    public static int getResId(Context context, String str, String str2) {
        return context.getResources().getIdentifier(filter(str), str2, context.getPackageName());
    }

    public static int getStringId(Context context, String str) {
        return getResId(context, filter(str), RES_STRING);
    }

    public static int getStyleId(Context context, String str) {
        return getResId(context, filter(str), RES_STYLE);
    }
}
