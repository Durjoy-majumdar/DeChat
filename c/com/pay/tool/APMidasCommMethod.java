package com.pay.tool;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.comm.APLog;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class APMidasCommMethod {
    private static Stack<Activity> activityStack;

    public static String MaptoString(HashMap<String, String> hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry next : hashMap.entrySet()) {
            stringBuffer.append((String) next.getKey());
            stringBuffer.append("=");
            stringBuffer.append((String) next.getValue());
            stringBuffer.append("&");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public static String dealString(String str) {
        String rawString = rawString(str);
        if (rawString.length() <= 3) {
            return str;
        }
        if (rawString.length() > 3 && rawString.length() <= 6) {
            return str.substring(0, 3) + " " + str.substring(4, str.length());
        } else if (rawString.length() > 6 && rawString.length() <= 9) {
            return str.substring(3, 6) + " " + str.substring(7, str.length());
        } else if (rawString.length() <= 9 || rawString.length() > 12) {
            return str;
        } else {
            return str.substring(6, 9) + " " + str.substring(10, str.length());
        }
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String fenToYuan(String str, int i) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance();
        if (i == 0) {
            decimalFormat.applyPattern("0");
        } else if (i == 1) {
            decimalFormat.applyPattern("0.0");
        } else if (i == 2) {
            decimalFormat.applyPattern("0.00");
        }
        try {
            return decimalFormat.format((double) (Float.valueOf(str).floatValue() / 100.0f));
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getAnimId(Context context, String str) {
        return context.getApplicationContext().getResources().getIdentifier(str, "anim", context.getApplicationContext().getPackageName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r2 = r1.getPackageManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getApplicationPackageName() {
        /*
            java.lang.String r0 = ""
            android.content.Context r1 = com.tencent.midas.api.APMidasPayAPI.fromApplicationContext     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x0017
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ Exception -> 0x0018 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0018 }
            r3 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch:{ Exception -> 0x0018 }
            java.lang.String r0 = r1.packageName     // Catch:{ Exception -> 0x0018 }
        L_0x0017:
            return r0
        L_0x0018:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getApplicationPackageName error:"
            r2.append(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "APMidasCommMethod"
            com.tencent.midas.comm.APLog.m161214i(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pay.tool.APMidasCommMethod.getApplicationPackageName():java.lang.String");
    }

    public static String getApplicationVersion() {
        try {
            return APMidasPayAPI.fromApplicationContext.getPackageManager().getPackageInfo(APMidasPayAPI.fromApplicationContext.getPackageName(), 0).versionName;
        } catch (Exception e) {
            APLog.m161214i("APMidasCommMethod", "getApplicationVersion error:" + e.toString());
            return "";
        }
    }

    public static int getColorId(Context context, String str) {
        return context.getResources().getColor(context.getResources().getIdentifier(str, "color", context.getPackageName()));
    }

    public static Drawable getDrawable(Context context, String str) {
        return context.getResources().getDrawable(context.getResources().getIdentifier(str, "drawable", context.getPackageName()));
    }

    public static int getDrawableId(Context context, String str) {
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    public static int getId(Context context, String str) {
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public static int getLayoutId(Context context, String str) {
        return context.getResources().getIdentifier(str, "layout", context.getPackageName());
    }

    public static String getStringId(Context context, String str) {
        return context.getResources().getString(context.getResources().getIdentifier(str, "string", context.getPackageName()));
    }

    public static int getStyleId(Context context, String str) {
        return context.getResources().getIdentifier(str, "style", context.getPackageName());
    }

    public static void popActivity() {
        APLog.m161214i("jar popActivity", "1");
        try {
            if (activityStack != null) {
                for (int i = 0; i < activityStack.size(); i++) {
                    if (activityStack.get(i) != null) {
                        activityStack.get(i).finish();
                    }
                }
                releaseActivityStack();
            }
        } catch (Exception e) {
            APLog.m161214i("jar popActivity ex", e.toString());
        }
    }

    public static void pushActivity(Activity activity) {
        if (activityStack == null) {
            activityStack = new Stack<>();
        }
        activityStack.push(activity);
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String rawString(String str) {
        return str.replace(" ", "");
    }

    public static void releaseActivityStack() {
        Stack<Activity> stack = activityStack;
        if (stack != null) {
            stack.clear();
        }
        activityStack = null;
    }

    public static void transformStrToList(String str, List<String> list) {
        int indexOf = str.indexOf("[");
        int indexOf2 = str.indexOf("]");
        list.clear();
        if (indexOf != -1 && indexOf2 != -1 && indexOf2 > indexOf) {
            String substring = str.substring(indexOf + 1, indexOf2);
            if (substring.length() != 0) {
                for (String add : substring.split(",")) {
                    list.add(add);
                }
            }
        }
    }

    public static void transformStrToMap(String str, TreeMap<String, String> treeMap) {
        int indexOf = str.indexOf("[");
        int indexOf2 = str.indexOf("]");
        if (indexOf != -1 && indexOf2 != -1 && indexOf2 > indexOf) {
            String substring = str.substring(indexOf + 1, indexOf2);
            if (substring.length() == 0) {
                treeMap.clear();
                return;
            }
            String[] split = substring.split(",");
            int length = split.length;
            if (length > 0 && length % 2 == 0) {
                treeMap.clear();
                for (int i = 0; i < length / 2; i++) {
                    int i2 = i * 2;
                    treeMap.put(split[i2], split[i2 + 1]);
                }
            }
        }
    }

    public static void transformStrToMpInfoList(String str, List<String> list, List<String> list2) {
        int indexOf = str.indexOf("[");
        int indexOf2 = str.indexOf("]");
        if (indexOf != -1 && indexOf2 != -1 && indexOf2 > indexOf) {
            String substring = str.substring(indexOf + 1, indexOf2);
            if (substring.length() == 0) {
                list.clear();
                list2.clear();
                return;
            }
            String[] split = substring.split(",");
            int length = split.length;
            if (length > 0 && length % 2 == 0) {
                list.clear();
                list2.clear();
                for (int i = 0; i < length / 2; i++) {
                    int i2 = i * 2;
                    String str2 = split[i2];
                    String str3 = split[i2 + 1];
                    list.add(str2);
                    list2.add(str3);
                }
            }
        }
    }

    public static String MaptoString(HashMap<String, String> hashMap, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> value : hashMap.entrySet()) {
            stringBuffer.append((String) value.getValue());
            stringBuffer.append(str);
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }
}
