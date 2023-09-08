package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.Character;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import p206nj.C11171e;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.sdk.platformtools.Util */
public final class Util {
    public static final int BEGIN_TIME = 22;
    public static final int BIT_OF_GB = 30;
    public static final int BIT_OF_KB = 10;
    public static final int BIT_OF_MB = 20;
    public static final int BYTE_OF_GB = 1073741824;
    public static final int BYTE_OF_KB = 1024;
    public static final int BYTE_OF_MB = 1048576;
    public static final int DAY = 0;
    public static final int END_TIME = 8;
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final char[] INVALID = {'<', '>', '\"', '\'', '&', 13, 10, LOWER_RANGE, 9};
    private static final long[] LIGHT_PATTERN = {300, 50, 300, 50};
    private static final char LOWER_RANGE = ' ';
    public static final int MASK_16BIT = 65535;
    public static final int MASK_32BIT = -1;
    public static final int MASK_4BIT = 15;
    public static final int MASK_8BIT = 255;
    public static final long MAX_32BIT_VALUE = 4294967295L;
    public static final int MAX_ACCOUNT_LENGTH = 20;
    public static final int MAX_DECODE_PICTURE_SIZE = 2764800;
    public static final int MAX_PASSWORD_LENGTH = 16;
    public static final long MILLSECONDS_OF_DAY = 86400000;
    public static final long MILLSECONDS_OF_HOUR = 3600000;
    public static final long MILLSECONDS_OF_MINUTE = 60000;
    public static final long MILLSECONDS_OF_SECOND = 1000;
    public static final long MINUTE_OF_HOUR = 60;
    public static final int MIN_ACCOUNT_LENGTH = 6;
    public static final int MIN_PASSWORD_LENGTH = 8;
    private static final int MTU = 1462;
    private static final int NEW_QQ_PASSWORD_MAX = 16;
    public static final String PHOTO_DEFAULT_EXT = ".jpg";
    public static final long SECONDS_OF_DAY = 86400;
    public static final long SECONDS_OF_HOUR = 3600;
    public static final long SECOND_OF_MINUTE = 60;
    private static final String TAG = "MicroMsg.Util";
    private static final int TCP_HDR_FIX = 52;
    private static final int TCP_HDR_FIX_TOO = 40;
    private static final int TCP_RX_FIX_BYTES = 156;
    private static final int TCP_TX_FIX_BYTES = 172;
    private static final BigInteger TWO_64 = BigInteger.ONE.shiftLeft(64);
    private static final String[] VALID = {"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&#x0D;", "&#x0A;", "&#x20;", "&#x09;"};
    public static final long[] VIRBRATOR_PATTERN = {300, 200, 300, 200};
    private static final String[] clearExifAttributes = {ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, ExifInterface.TAG_DATETIME, "CameraOwnerName", ExifInterface.TAG_MODEL, ExifInterface.TAG_MAKE};
    private static final String[] clearExifAttributesAPI24 = {ExifInterface.TAG_GPS_DEST_LONGITUDE, ExifInterface.TAG_GPS_DEST_LONGITUDE_REF};
    public static Set<String> whiteFileSet = new HashSet();
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.sdk.platformtools.Util$ActivityTaskInfo */
    public static class ActivityTaskInfo {
        private Context context;

        public ActivityTaskInfo(Context context2) {
            this.context = context2;
        }

        public static String getTaskInfo(Context context2) {
            if (context2 == null) {
                return null;
            }
            ActivityManager activityManager = (ActivityManager) context2.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            String packageName = context2.getPackageName();
            if (activityManager == null || Util.isNullOrNil(packageName)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            try {
                for (ActivityManager.RunningTaskInfo next : activityManager.getRunningTasks(100)) {
                    if (next.baseActivity.getClassName().startsWith(packageName) || next.topActivity.getClassName().startsWith(packageName)) {
                        sb.append(String.format("{id:%d num:%d/%d top:%s base:%s}", new Object[]{Integer.valueOf(next.id), Integer.valueOf(next.numRunning), Integer.valueOf(next.numActivities), next.topActivity.getShortClassName(), next.baseActivity.getShortClassName()}));
                    }
                }
                return sb.toString();
            } catch (Exception e) {
                Log.printErrStackTrace(Util.TAG, e, "", new Object[0]);
                return "";
            }
        }

        public String toString() {
            return getTaskInfo(this.context);
        }
    }

    private Util() {
    }

    public static int UnZipFolder(String str, String str2) {
        return C86013q1.m106436R(str, str2);
    }

    public static String addSpace(CharSequence charSequence) {
        String str = "";
        for (int i = 0; i < charSequence.length(); i++) {
            str = str + " " + charSequence.charAt(i);
        }
        return str;
    }

    public static String append(String str, String str2, String str3) {
        if (isNullOrNil(str)) {
            return str2;
        }
        return str + str3 + str2;
    }

    public static byte[] bmpToByteArray(Bitmap bitmap, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (z) {
            Log.m105925i(TAG, "recycle bitmap:%s", bitmap);
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return byteArray;
    }

    public static int byteArrayToInt(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.nativeOrder());
        return wrap.getInt();
    }

    public static boolean checkPermission(Context context, String str) {
        Assert.assertNotNull(context);
        String packageName = context.getPackageName();
        boolean z = context.getPackageManager().checkPermission(str, packageName) == 0;
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(" has ");
        sb.append(z ? "permission " : "no permission ");
        sb.append(str);
        Log.m105918d(TAG, sb.toString());
        return z;
    }

    public static void clearExif(String str) {
        try {
            if (!C86013q1.m106450k(str) || C86013q1.m106451l(str) <= 0) {
                throw new IllegalArgumentException("clearExif error file not exist!");
            }
            String i = C86013q1.m106448i(str, true);
            if (i != null) {
                ExifInterface exifInterface = new ExifInterface(i);
                boolean z = false;
                for (String hasAttribute : clearExifAttributes) {
                    z |= exifInterface.hasAttribute(hasAttribute);
                }
                if (C11171e.m11046c(24)) {
                    for (String hasAttribute2 : clearExifAttributesAPI24) {
                        z |= exifInterface.hasAttribute(hasAttribute2);
                    }
                }
                if (!z) {
                    Log.m105924i(TAG, "clearExif not contains any attributes");
                    return;
                }
                long l = C86013q1.m106451l(str);
                exifInterface.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, (String) null);
                exifInterface.setAttribute(ExifInterface.TAG_GPS_LATITUDE, (String) null);
                exifInterface.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, (String) null);
                exifInterface.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, (String) null);
                if (C11171e.m11046c(24)) {
                    exifInterface.setAttribute(ExifInterface.TAG_GPS_DEST_LONGITUDE, (String) null);
                    exifInterface.setAttribute(ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, (String) null);
                }
                exifInterface.setAttribute(ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, (String) null);
                exifInterface.setAttribute(ExifInterface.TAG_DATETIME, (String) null);
                exifInterface.setAttribute("CameraOwnerName", (String) null);
                exifInterface.setAttribute(ExifInterface.TAG_MODEL, (String) null);
                exifInterface.setAttribute(ExifInterface.TAG_MAKE, (String) null);
                exifInterface.saveAttributes();
                if (((double) Math.abs(l - C86013q1.m106451l(str))) >= ((double) l) * 0.1d) {
                    Log.m105920e(TAG, "error saveAttribute with possibility wrong file length");
                    throw new IllegalArgumentException("clearExif error saveAttributes");
                }
                return;
            }
            throw new IllegalArgumentException("clearExif error null file path");
        } catch (IOException e) {
            Log.printErrStackTrace(TAG, e, "clearExif error", new Object[0]);
            throw e;
        }
    }

    public static boolean compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        Log.printErrStackTrace(TAG, e, "", new Object[0]);
                    }
                }
            } catch (IOException e2) {
                Log.printErrStackTrace(TAG, e2, "", new Object[0]);
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace(TAG, e3, "", new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace(TAG, e4, "", new Object[0]);
                }
                throw th;
            }
        }
        inputStream.close();
        return sb.toString();
    }

    public static int convertStringToRGB(String str, int i) {
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "colorString:%s", str);
            return i;
        }
    }

    public static Intent createExplicitFromImplicitIntent(Context context, Intent intent) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() != 1) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        Log.m105919d(TAG, "createExplicitFromImplicitIntent pa:%s, cl:%s", str, str2);
        ComponentName componentName = new ComponentName(str, str2);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }

    public static long currentDayInMills() {
        return (nowMilliSecond() / 86400000) * 86400000;
    }

    public static long currentTicks() {
        return SystemClock.elapsedRealtime();
    }

    public static byte[] decodeHexString(String str) {
        if (str == null || str.length() <= 0) {
            return new byte[0];
        }
        try {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (Integer.parseInt(str.substring(i2, i2 + 2), 16) & 255);
            }
            return bArr;
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return new byte[0];
        }
    }

    public static boolean deleteFile(String str) {
        if (isNullOrNil(str)) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g()) {
            return true;
        }
        if (m1Var.mo119977o()) {
            return false;
        }
        return m1Var.mo119966f();
    }

    public static void deleteOutOfDateFile(String str, String str2, long j) {
        C86009m1[] u;
        if (!isNullOrNil(str)) {
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119967g() && m1Var.mo119977o() && (u = m1Var.mo119984u()) != null && u.length != 0) {
                for (C86009m1 m1Var2 : u) {
                    if (m1Var2.mo119978p() && m1Var2.getName().startsWith(str2) && (nowMilliSecond() - m1Var2.mo119979q()) - j >= 0) {
                        m1Var2.mo119966f();
                    }
                }
            }
        }
    }

    public static String dumpHex(byte[] bArr) {
        if (bArr == null) {
            return "(null)";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int length = bArr.length;
        char[] cArr2 = new char[(length * 3)];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            cArr2[i2] = LOWER_RANGE;
            int i4 = i3 + 1;
            cArr2[i3] = cArr[(b >>> 4) & 15];
            cArr2[i4] = cArr[b & 15];
            i++;
            i2 = i4 + 1;
        }
        return new String(cArr2);
    }

    public static String dumpHexBuf(byte[] bArr) {
        return dumpHexBuf(bArr, 0, 0);
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr != null) {
            for (int i = 0; i < bArr.length; i++) {
                sb.append(String.format("%02x", new Object[]{Integer.valueOf(bArr[i] & ExifInterface.MARKER)}));
            }
        }
        return sb.toString();
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String escapeDirTraversal(String str) {
        return str != null ? str.replace("../", "") : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r2 = r4.charAt(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String escapeSqlValue(java.lang.String r4) {
        /*
            if (r4 == 0) goto L_0x004c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            r0.<init>(r1)
            r0 = 0
        L_0x000c:
            int r1 = r4.length()
            if (r0 >= r1) goto L_0x004c
            char r1 = r4.charAt(r0)
            r2 = 37
            if (r1 == r2) goto L_0x0049
            r2 = 39
            if (r1 == r2) goto L_0x0049
            r2 = 34
            if (r1 != r2) goto L_0x0023
            goto L_0x0049
        L_0x0023:
            r2 = 92
            if (r1 != r2) goto L_0x0049
            int r1 = r0 + 1
            int r2 = r4.length()
            if (r1 >= r2) goto L_0x0047
            char r2 = r4.charAt(r1)
            r3 = 91
            if (r2 != r3) goto L_0x003a
        L_0x0037:
            int r0 = r0 + 2
            goto L_0x000c
        L_0x003a:
            r3 = 94
            if (r2 == r3) goto L_0x0037
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L_0x0037
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 != r3) goto L_0x0047
            goto L_0x0037
        L_0x0047:
            r0 = r1
            goto L_0x000c
        L_0x0049:
            int r0 = r0 + 1
            goto L_0x000c
        L_0x004c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(java.lang.String):java.lang.String");
    }

    public static String escapeStringForUCC(String str) {
        return isNullOrNil(str) ? str : str.replaceAll("‮", "");
    }

    public static String escapeStringForXml(String str) {
        if (str == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            int length2 = INVALID.length - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                } else if (INVALID[length2] == charAt) {
                    stringBuffer.append(VALID[length2]);
                    z = false;
                    break;
                } else {
                    length2--;
                }
            }
            if (i == length - 1 && Character.isHighSurrogate(charAt)) {
                z = false;
            }
            if (z) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    private static String expandEntities(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            int i4 = i + 1;
            cArr[i] = charAt;
            if (charAt == '&' && i2 == -1) {
                i = i4;
                i2 = i;
            } else if (i2 != -1 && !Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '#') {
                if (charAt == ';') {
                    int lookupEntity = lookupEntity(cArr, i2, (i4 - i2) - 1);
                    if (lookupEntity > 65535) {
                        int i5 = lookupEntity - 65536;
                        cArr[i2 - 1] = (char) ((i5 >> 10) + 55296);
                        cArr[i2] = (char) ((i5 & 1023) + 56320);
                        i2++;
                    } else if (lookupEntity != 0) {
                        cArr[i2 - 1] = (char) lookupEntity;
                    } else {
                        i2 = i4;
                    }
                    i = i2;
                } else {
                    i = i4;
                }
                i2 = -1;
            } else {
                i = i4;
            }
        }
        return new String(cArr, 0, i);
    }

    public static void expandViewTouchArea(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i2;
        rect.bottom += i4;
        rect.left -= i;
        rect.right += i3;
        TouchDelegate touchDelegate = new TouchDelegate(rect, view);
        if (View.class.isInstance(view.getParent())) {
            ((View) view.getParent()).setTouchDelegate(touchDelegate);
        }
    }

    public static CharSequence filterNumber(CharSequence charSequence) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static String formatMoney2f(double d) {
        return String.format("%.2f", new Object[]{Double.valueOf(d)});
    }

    public static String formatNumber(String str) {
        if (isNullOrNil(str)) {
            return "";
        }
        String replaceAll = str.replaceAll(",", "");
        if (replaceAll.length() <= 3) {
            return replaceAll;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int length = replaceAll.length() - 1; length >= 0; length--) {
            stringBuffer.append(replaceAll.charAt(length));
            if ((replaceAll.length() - length) % 3 == 0 && length != 0) {
                stringBuffer.append(",");
            }
        }
        return stringBuffer.reverse().toString();
    }

    public static String formatSecToMin(int i) {
        long j = (long) i;
        return String.format("%d:%02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)});
    }

    public static String formatUnixTime(long j) {
        return new SimpleDateFormat("[yy-MM-dd HH:mm:ss]").format(new Date(j * 1000));
    }

    public static View.OnTouchListener genLinearPressedListener() {
        return new View.OnTouchListener() {
            private byte _hellAccFlag_;

            public boolean onTouch(final View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/sdk/platformtools/Util$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                int action = motionEvent.getAction();
                if (action == 0) {
                    view.setPressed(true);
                } else if (action == 1 || action == 3 || action == 4) {
                    view.post(new Runnable() {
                        public void run() {
                            view.setPressed(false);
                        }
                    });
                }
                C117292a.m165362h(false, this, "com/tencent/mm/sdk/platformtools/Util$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        };
    }

    public static ActivityTaskInfo getActivityTaskInfo(Context context) {
        return new ActivityTaskInfo(context);
    }

    public static long getAvailableMemoryMB(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (memoryInfo.availMem / 1024) / 1024;
    }

    private static byte[] getBase64Data(String str) {
        try {
            int indexOf = str.indexOf("base64");
            if (indexOf > 0) {
                str = str.substring(indexOf + 7);
            }
            return Base64.decode(str, 0);
        } catch (Exception e) {
            Log.m105921e(TAG, "decode base64 url failed : %s", e.getMessage());
            return null;
        }
    }

    public static long getBeginTimeOfToday() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        return instance.getTimeInMillis();
    }

    public static boolean getBoolean(String str, boolean z) {
        if (str == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return z;
        }
    }

    public static ActivityManager.RunningTaskInfo getCurrentTaskInfo(Context context, int i) {
        for (ActivityManager.RunningTaskInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1000)) {
            if (next.id == i) {
                return next;
            }
        }
        return null;
    }

    public static String getCutPasswordMD5(String str) {
        if (str == null) {
            str = "";
        }
        return str.length() <= 16 ? getFullPasswordMD5(str) : getFullPasswordMD5(str.substring(0, 16));
    }

    public static long getDataAvailableSize() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Exception e) {
            Log.m105921e(TAG, "getDataAvailableSize exception:%s", e.getMessage());
            return 0;
        }
    }

    public static long getDataCRC32(byte[] bArr) {
        if (isNullOrNil(bArr)) {
            return 0;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|18|24|25|(1:27)|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r7.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0045 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0045 }
            if (r8 == 0) goto L_0x003d
            boolean r10 = r8.moveToFirst()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            if (r10 == 0) goto L_0x003d
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            java.lang.String r10 = "MicroMsg.Util"
            java.lang.String r11 = "getDataColumn : columnIdx is -1, column with columnName = _data does not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r8.close()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r8.close()
            return r7
        L_0x0030:
            java.lang.String r9 = r8.getString(r10)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r8.close()
            return r9
        L_0x0038:
            r9 = move-exception
            r7 = r8
            goto L_0x0053
        L_0x003b:
            r7 = r8
            goto L_0x0045
        L_0x003d:
            if (r8 == 0) goto L_0x0042
            r8.close()
        L_0x0042:
            return r7
        L_0x0043:
            r9 = move-exception
            goto L_0x0053
        L_0x0045:
            java.lang.String r8 = r9.getPath()     // Catch:{ all -> 0x0043 }
            java.lang.String r8 = getPathFromUri(r8)     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x0052
            r7.close()
        L_0x0052:
            return r8
        L_0x0053:
            if (r7 == 0) goto L_0x0058
            r7.close()
        L_0x0058:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static final String getDomin(String str) {
        if (isNullOrNil(str)) {
            return null;
        }
        return Uri.parse(str).getHost();
    }

    public static double getDouble(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return d;
        }
    }

    private static int getEntity(String str) {
        return 0;
    }

    public static String getErrMsgContent(String str) {
        if (isNullOrNil(str)) {
            return null;
        }
        try {
            Map<String, String> parseXml = XmlParser.parseXml(str, "e", (String) null);
            if (parseXml != null && !parseXml.isEmpty() && parseXml.containsKey(".e.Content")) {
                return parseXml.get(".e.Content");
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "getErrMsgContent", new Object[0]);
        }
        return null;
    }

    public static String getFilePath(Context context, Uri uri) {
        String str;
        Uri uri2 = null;
        if (context == null || uri == null) {
            Log.m105920e(TAG, "getFilePath : context is null or uri is null");
            return null;
        }
        String scheme = uri.getScheme();
        if (isNullOrNil(scheme)) {
            Log.m105921e(TAG, "input uri error. %s", uri);
            return null;
        } else if (scheme.equalsIgnoreCase("file")) {
            Log.m105924i(TAG, "getFilePath : scheme is SCHEME_FILE");
            return uri.getPath();
        } else {
            if (scheme.equalsIgnoreCase("content")) {
                Log.m105924i(TAG, "getFilePath : scheme is SCHEME_CONTENT: " + uri.toString());
                if (isGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                try {
                    context.grantUriPermission(uri.getAuthority(), uri, 1);
                    str = getDataColumn(context, uri, (String) null, (String[]) null);
                } catch (SecurityException e) {
                    Log.m105920e(TAG, "getFilePath : exception = " + e);
                    str = null;
                }
                if (!isNullOrNil(str)) {
                    return str;
                }
                if (DocumentsContract.isDocumentUri(context, uri)) {
                    if (isExternalStorageDocument(uri)) {
                        String[] split = DocumentsContract.getDocumentId(uri).split(XVFSFile.PATH_SEPARATOR);
                        if (!"primary".equalsIgnoreCase(split[0])) {
                            return null;
                        }
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    } else if (isDownloadsDocument(uri)) {
                        String[] split2 = DocumentsContract.getDocumentId(uri).split(XVFSFile.PATH_SEPARATOR);
                        if (ShareConstants.DEXMODE_RAW.equals(split2[0])) {
                            return split2[1];
                        }
                        try {
                            return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(split2[1])), (String) null, (String[]) null);
                        } catch (Throwable th) {
                            Log.printErrStackTrace(TAG, th, "Failure.", new Object[0]);
                            return null;
                        }
                    } else if (isMediaDocument(uri)) {
                        String[] split3 = DocumentsContract.getDocumentId(uri).split(XVFSFile.PATH_SEPARATOR);
                        String str2 = split3[0];
                        if ("image".equals(str2)) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if ("video".equals(str2)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if ("audio".equals(str2)) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        return getDataColumn(context, uri2, "_id=?", new String[]{split3[1]});
                    }
                }
            }
            Log.m105920e(TAG, "unknown scheme");
            return null;
        }
    }

    public static String getFilterString(String str) {
        if (str == null) {
            return null;
        }
        for (int length = str.length(); length > 0; length--) {
            int i = length - 1;
            if (str.charAt(i) != 10 && str.charAt(i) != 13) {
                return str.substring(0, length);
            }
        }
        return str;
    }

    public static float getFloat(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return f;
        }
    }

    public static String getFullPasswordMD5(String str) {
        return C90193h.m112878f(str.getBytes());
    }

    public static int getHex(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return (int) (Long.decode(str).longValue() & MAX_32BIT_VALUE);
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return i;
        }
    }

    public static final String getHost(String str) {
        if (isNullOrNil(str)) {
            return "";
        }
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            Log.m105928w(TAG, "get host error");
            return str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getHttpData(java.lang.String r9) {
        /*
            java.lang.String r0 = "MicroMsg.Util"
            r1 = 1
            r2 = 0
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x007e, all -> 0x007a }
            r4.<init>(r9)     // Catch:{ Exception -> 0x007e, all -> 0x007a }
            java.net.URLConnection r9 = r4.openConnection()     // Catch:{ Exception -> 0x007e, all -> 0x007a }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x007e, all -> 0x007a }
            java.lang.String r4 = "GET"
            r9.setRequestMethod(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            int r4 = r9.getResponseCode()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x0034
            java.lang.String r5 = "http get response code = %d"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r6[r2] = r4     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r6)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            qualityClose(r3)
            qualityClose(r3)
            r9.disconnect()
            return r3
        L_0x0034:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.io.InputStream r5 = r9.getInputStream()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x006e, all -> 0x006a }
            r5.<init>()     // Catch:{ Exception -> 0x006e, all -> 0x006a }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            int r7 = r4.read(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
        L_0x004a:
            if (r7 <= 0) goto L_0x0054
            r5.write(r6, r2, r7)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            int r7 = r4.read(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            goto L_0x004a
        L_0x0054:
            byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            qualityClose(r4)
            qualityClose(r5)
            r9.disconnect()
            return r0
        L_0x0062:
            r0 = move-exception
            goto L_0x006c
        L_0x0064:
            r6 = move-exception
            r8 = r5
            r5 = r4
            r4 = r6
            r6 = r8
            goto L_0x0082
        L_0x006a:
            r0 = move-exception
            r5 = r3
        L_0x006c:
            r3 = r4
            goto L_0x009e
        L_0x006e:
            r5 = move-exception
            r6 = r3
            r8 = r5
            r5 = r4
            r4 = r8
            goto L_0x0082
        L_0x0074:
            r0 = move-exception
            r5 = r3
            goto L_0x009e
        L_0x0077:
            r4 = move-exception
            r5 = r3
            goto L_0x0081
        L_0x007a:
            r0 = move-exception
            r9 = r3
            r5 = r9
            goto L_0x009e
        L_0x007e:
            r4 = move-exception
            r9 = r3
            r5 = r9
        L_0x0081:
            r6 = r5
        L_0x0082:
            java.lang.String r7 = "http download failed : %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x009b }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x009b }
            r1[r2] = r4     // Catch:{ all -> 0x009b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r1)     // Catch:{ all -> 0x009b }
            qualityClose(r5)
            qualityClose(r6)
            if (r9 == 0) goto L_0x009a
            r9.disconnect()
        L_0x009a:
            return r3
        L_0x009b:
            r0 = move-exception
            r3 = r5
            r5 = r6
        L_0x009e:
            qualityClose(r3)
            qualityClose(r5)
            if (r9 == 0) goto L_0x00a9
            r9.disconnect()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.getHttpData(java.lang.String):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getHttpsData(java.lang.String r9) {
        /*
            java.lang.String r0 = "MicroMsg.Util"
            r1 = 1
            r2 = 0
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x0084, all -> 0x0080 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x0084, all -> 0x0080 }
            java.net.URLConnection r9 = r4.openConnection()     // Catch:{ Exception -> 0x0084, all -> 0x0080 }
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch:{ Exception -> 0x0084, all -> 0x0080 }
            java.lang.String r4 = "GET"
            r9.setRequestMethod(r4)     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            int r4 = r9.getResponseCode()     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x0034
            java.lang.String r5 = "https get response code = %d"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            r6[r2] = r4     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r6)     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            qualityClose(r3)
            qualityClose(r3)
            r9.disconnect()
            return r3
        L_0x0034:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            java.io.InputStream r5 = r9.getInputStream()     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            r4.<init>(r5)     // Catch:{ Exception -> 0x007d, all -> 0x007a }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0074, all -> 0x0070 }
            r5.<init>()     // Catch:{ Exception -> 0x0074, all -> 0x0070 }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            int r7 = r4.read(r6)     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
        L_0x004a:
            if (r7 <= 0) goto L_0x0054
            r5.write(r6, r2, r7)     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            int r7 = r4.read(r6)     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            goto L_0x004a
        L_0x0054:
            byte[] r6 = r5.toByteArray()     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            r4.close()     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            r5.close()     // Catch:{ Exception -> 0x006a, all -> 0x0068 }
            qualityClose(r4)
            qualityClose(r5)
            r9.disconnect()
            return r6
        L_0x0068:
            r0 = move-exception
            goto L_0x0072
        L_0x006a:
            r6 = move-exception
            r8 = r5
            r5 = r4
            r4 = r6
            r6 = r8
            goto L_0x0088
        L_0x0070:
            r0 = move-exception
            r5 = r3
        L_0x0072:
            r3 = r4
            goto L_0x00a4
        L_0x0074:
            r5 = move-exception
            r6 = r3
            r8 = r5
            r5 = r4
            r4 = r8
            goto L_0x0088
        L_0x007a:
            r0 = move-exception
            r5 = r3
            goto L_0x00a4
        L_0x007d:
            r4 = move-exception
            r5 = r3
            goto L_0x0087
        L_0x0080:
            r0 = move-exception
            r9 = r3
            r5 = r9
            goto L_0x00a4
        L_0x0084:
            r4 = move-exception
            r9 = r3
            r5 = r9
        L_0x0087:
            r6 = r5
        L_0x0088:
            java.lang.String r7 = "getHttpsData failed : %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00a1 }
            r1[r2] = r4     // Catch:{ all -> 0x00a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r1)     // Catch:{ all -> 0x00a1 }
            qualityClose(r5)
            qualityClose(r6)
            if (r9 == 0) goto L_0x00a0
            r9.disconnect()
        L_0x00a0:
            return r3
        L_0x00a1:
            r0 = move-exception
            r3 = r5
            r5 = r6
        L_0x00a4:
            qualityClose(r3)
            qualityClose(r5)
            if (r9 == 0) goto L_0x00af
            r9.disconnect()
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.getHttpsData(java.lang.String):byte[]");
    }

    public static int getInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            if (str.length() <= 0) {
                return i;
            }
            return Integer.decode(str).intValue();
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return i;
        }
    }

    public static int getIntRandom(int i, int i2) {
        Assert.assertTrue(i > i2);
        return new Random(System.currentTimeMillis()).nextInt((i - i2) + 1) + i2;
    }

    public static int getLength(String str) {
        if (str == null) {
            return -1;
        }
        return str.length();
    }

    public static String getLengthStr(float f) {
        if (f < 1024.0f) {
            return String.format("%.1fB", new Object[]{Float.valueOf(f)});
        } else if (f < 1048576.0f) {
            return String.format("%.1fKB", new Object[]{Float.valueOf(f / 1024.0f)});
        } else if (f < 1.07374182E9f) {
            return String.format("%.1fMB", new Object[]{Float.valueOf((f / 1024.0f) / 1024.0f)});
        } else {
            return String.format("%.1fGB", new Object[]{Float.valueOf(((f / 1024.0f) / 1024.0f) / 1024.0f)});
        }
    }

    public static String getLine1Number(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return (String) C117292a.m165363i(telephonyManager, "com/tencent/mm/sdk/platformtools/Util", "getLine1Number", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getLine1Number", "()Ljava/lang/String;");
            }
            Log.m105920e(TAG, "getLine1Number failed, null tm");
            return null;
        } catch (Exception e) {
            Log.m105921e(TAG, "getLine1Number failed:%s ", stackTraceToString(e));
            return null;
        }
    }

    public static long getLong(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return str.length() <= 0 ? j : Long.decode(str).longValue();
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return j;
        }
    }

    public static String getNetworkCountryCode(Context context) {
        if (context == null) {
            Log.m105928w(TAG, "getNetworkCountryCode context is null.");
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (isNullOrNil(networkCountryIso)) {
            return null;
        }
        return networkCountryIso.toLowerCase().trim();
    }

    public static String getPathFromUri(String str) {
        return C11171e.m11046c(24) ? str.replace("external_files", "") : str;
    }

    public static String getPrivacyPhoneNum(String str) {
        if (isNullOrNil(str) || str.startsWith("+")) {
            return "";
        }
        if (str.length() <= 5) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.subSequence(0, 3));
        for (int i = 0; i < str.length() - 5; i++) {
            char charAt = str.charAt(i + 3);
            if (charAt < '0' || charAt > '9') {
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append('*');
            }
        }
        stringBuffer.append(str.charAt(str.length() - 2));
        stringBuffer.append(str.charAt(str.length() - 1));
        return stringBuffer.toString();
    }

    public static String getProcessNameByPid(Context context, int i) {
        Log.m105924i(TAG, "getProcessNameByPid, pid = " + i);
        return ProcessCache.getProcessNameByPidFromCache(context, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094 A[SYNTHETIC, Splitter:B:48:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a A[SYNTHETIC, Splitter:B:53:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getProcessNameByPidOriginal(android.content.Context r9, int r10) {
        /*
            java.lang.String r0 = "MicroMsg.Util"
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x009e
            if (r10 > 0) goto L_0x000a
            goto L_0x009e
        L_0x000a:
            r2 = 0
            java.lang.String r3 = "activity"
            java.lang.Object r9 = r9.getSystemService(r3)     // Catch:{ Exception -> 0x0038 }
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch:{ Exception -> 0x0038 }
            java.util.List r9 = r9.getRunningAppProcesses()     // Catch:{ Exception -> 0x0038 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0038 }
        L_0x001b:
            boolean r3 = r9.hasNext()     // Catch:{ Exception -> 0x0038 }
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r9.next()     // Catch:{ Exception -> 0x0038 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ Exception -> 0x0038 }
            int r4 = r3.pid     // Catch:{ Exception -> 0x0038 }
            if (r4 != r10) goto L_0x001b
            java.lang.String r4 = r3.processName     // Catch:{ Exception -> 0x0038 }
            if (r4 == 0) goto L_0x001b
            boolean r4 = r4.equals(r1)     // Catch:{ Exception -> 0x0038 }
            if (r4 != 0) goto L_0x001b
            java.lang.String r9 = r3.processName     // Catch:{ Exception -> 0x0038 }
            return r9
        L_0x0038:
            r9 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r1, r3)
        L_0x003e:
            r9 = 128(0x80, float:1.794E-43)
            byte[] r3 = new byte[r9]
            r4 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x008c }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008c }
            r7.<init>()     // Catch:{ Exception -> 0x008c }
            java.lang.String r8 = "/proc/"
            r7.append(r8)     // Catch:{ Exception -> 0x008c }
            r7.append(r10)     // Catch:{ Exception -> 0x008c }
            java.lang.String r10 = "/cmdline"
            r7.append(r10)     // Catch:{ Exception -> 0x008c }
            java.lang.String r10 = r7.toString()     // Catch:{ Exception -> 0x008c }
            r6.<init>(r10)     // Catch:{ Exception -> 0x008c }
            r5.<init>(r6)     // Catch:{ Exception -> 0x008c }
            int r10 = r5.read(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            if (r10 <= 0) goto L_0x0080
            r4 = 0
        L_0x006a:
            if (r4 >= r10) goto L_0x0077
            byte r6 = r3[r4]     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            if (r6 > r9) goto L_0x0076
            if (r6 > 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            int r4 = r4 + 1
            goto L_0x006a
        L_0x0076:
            r10 = r4
        L_0x0077:
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            r9.<init>(r3, r2, r10)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            r5.close()     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            return r9
        L_0x0080:
            r5.close()     // Catch:{ Exception -> 0x0097 }
            goto L_0x0097
        L_0x0084:
            r9 = move-exception
            r4 = r5
            goto L_0x0098
        L_0x0087:
            r9 = move-exception
            r4 = r5
            goto L_0x008d
        L_0x008a:
            r9 = move-exception
            goto L_0x0098
        L_0x008c:
            r9 = move-exception
        L_0x008d:
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x008a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r1, r10)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0097
            r4.close()     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            return r1
        L_0x0098:
            if (r4 == 0) goto L_0x009d
            r4.close()     // Catch:{ Exception -> 0x009d }
        L_0x009d:
            throw r9
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.getProcessNameByPidOriginal(android.content.Context, int):java.lang.String");
    }

    public static String getRandomString(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[SYNTHETIC, Splitter:B:22:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[SYNTHETIC, Splitter:B:31:0x0088] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.String> getRunningAppProcessesByPs() {
        /*
            java.lang.String r0 = "getRunningProcessesByPs finally got ex = %s"
            java.lang.String r1 = "MicroMsg.Util"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            java.lang.String r7 = "ps"
            java.lang.Process r6 = r6.exec(r7)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            java.io.LineNumberReader r7 = new java.io.LineNumberReader     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            java.io.InputStream r9 = r6.getInputStream()     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
        L_0x0025:
            java.lang.String r5 = r7.readLine()     // Catch:{ Exception -> 0x004c }
            if (r5 == 0) goto L_0x0035
            int r8 = r5.length()     // Catch:{ Exception -> 0x004c }
            if (r8 <= 0) goto L_0x0025
            r2.add(r5)     // Catch:{ Exception -> 0x004c }
            goto L_0x0025
        L_0x0035:
            r6.waitFor()     // Catch:{ Exception -> 0x004c }
            r6.destroy()     // Catch:{ Exception -> 0x004c }
            r7.close()     // Catch:{ Exception -> 0x003f }
            goto L_0x0072
        L_0x003f:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r6[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r6)
            goto L_0x0072
        L_0x004c:
            r5 = move-exception
            goto L_0x0053
        L_0x004e:
            r2 = move-exception
            goto L_0x0086
        L_0x0050:
            r6 = move-exception
            r7 = r5
            r5 = r6
        L_0x0053:
            java.lang.String r6 = "getRunningAppProcessesByPs fail, ex = %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0084 }
            r8[r3] = r5     // Catch:{ all -> 0x0084 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r8)     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0072
            r7.close()     // Catch:{ Exception -> 0x0066 }
            goto L_0x0072
        L_0x0066:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r6[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r6)
        L_0x0072:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r4 = r2.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "getRunningAppProcessesByPs, result list size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            return r2
        L_0x0084:
            r2 = move-exception
            r5 = r7
        L_0x0086:
            if (r5 == 0) goto L_0x0098
            r5.close()     // Catch:{ Exception -> 0x008c }
            goto L_0x0098
        L_0x008c:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r4[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
        L_0x0098:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.getRunningAppProcessesByPs():java.util.List");
    }

    public static int getSeconds(String str, int i) {
        if (isNullOrNil(str)) {
            return i;
        }
        try {
            return (int) (new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime() / 1000);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return i;
        }
    }

    public static int getSelfMemInMB(Context context) {
        if (context == null) {
            Log.m105924i(TAG, "getSelfMemInMB context is null.");
            return -1;
        }
        Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessMemoryInfo(new int[]{Process.myPid()});
        if (processMemoryInfo == null || processMemoryInfo.length <= 0) {
            return 0;
        }
        return processMemoryInfo[0].getTotalPss() / 1024;
    }

    public static String getSignaturesMd5(String str, Context context) {
        if (context != null && !isNullOrNil(str)) {
            try {
                return C90193h.m112878f(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return null;
    }

    public static String getSimCountryCode(Context context) {
        if (context == null) {
            Log.m105928w(TAG, "getSimCountryCode context is null.");
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        String simCountryIso = telephonyManager.getSimCountryIso();
        return isNullOrNil(simCountryIso) ? "" : simCountryIso.toUpperCase().trim();
    }

    public static String getSizeGB(long j, double d) {
        double round = ((double) Math.round((((double) j) * d) / 1.073741824E9d)) / d;
        return "" + round + " GB";
    }

    public static String getSizeKB(long j, double d) {
        if ((j >> 30) > 0) {
            return getSizeGB(j, d);
        }
        if ((j >> 20) > 0) {
            return getSizeMB(j, d);
        }
        if ((j >> 9) > 0) {
            double round = ((double) Math.round((((double) j) * d) / 1024.0d)) / d;
            return "" + round + " KB";
        }
        return "" + j + " B";
    }

    public static String getSizeMB(long j, double d) {
        double round = ((double) Math.round((((double) j) * d) / 1048576.0d)) / d;
        return "" + round + " MB";
    }

    public static String getSourceeMd5(Context context) {
        if (context == null) {
            return null;
        }
        return getSignaturesMd5(context.getPackageName(), context);
    }

    public static MMStack getStack() {
        return new MMStack();
    }

    public static String getTimeZoneOffset() {
        TimeZone timeZone = TimeZone.getDefault();
        return String.format("%.2f", new Object[]{Double.valueOf((((double) (timeZone.getRawOffset() / 1000)) / 3600.0d) + ((double) ((!timeZone.useDaylightTime() || !timeZone.inDaylightTime(new java.sql.Date(System.currentTimeMillis()))) ? 0 : 1)))});
    }

    @Deprecated
    public static ComponentName getTopActivity(Context context) {
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1);
            if (runningTasks == null || runningTasks.size() <= 0) {
                return null;
            }
            return runningTasks.get(0).topActivity;
        } catch (Exception e) {
            Log.m105921e(TAG, "get Top Activity Exception:%s", e.getMessage());
            return null;
        }
    }

    public static ComponentName getTopActivityByAppTasks(Context context) {
        ComponentName componentName;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (Build.VERSION.SDK_INT < 23) {
                return getTopActivity(context);
            }
            List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            if (appTasks != null) {
                if (appTasks.size() > 0) {
                    Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                    if (!it.hasNext() || (componentName = it.next().getTaskInfo().topActivity) == null) {
                        return null;
                    }
                    return componentName;
                }
            }
            return null;
        } catch (Exception e) {
            Log.m105921e(TAG, "get Top Activity Exception:%s", e.getMessage());
            return null;
        }
    }

    @Deprecated
    public static String getTopActivityName(Context context) {
        try {
            return ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity.getClassName();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return "(null)";
        }
    }

    public static String getTopActivityName2(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (Build.VERSION.SDK_INT >= 23) {
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                if (appTasks != null) {
                    if (appTasks.size() > 0) {
                        Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                        if (it.hasNext()) {
                            ComponentName componentName = it.next().getTaskInfo().topActivity;
                            if (componentName == null) {
                                return null;
                            }
                            String className = componentName.getClassName();
                            return className.contains(".") ? className.substring(className.lastIndexOf(".") + 1) : className;
                        }
                        return "";
                    }
                }
                return "";
            }
            String className2 = activityManager.getRunningTasks(1).get(0).topActivity.getClassName();
            return className2.contains(".") ? className2.substring(className2.lastIndexOf(".") + 1) : className2;
        } catch (Exception e) {
            Log.m105921e(TAG, "getTopActivityName Exception:%s stack:%s", e.getMessage(), stackTraceToString(e));
        }
    }

    public static int getUTF8ByteLength(String str) {
        if (str == null) {
            return -1;
        }
        return str.getBytes(Charset.forName("UTF-8")).length;
    }

    public static long getUnsignedLong(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return str.length() <= 0 ? j : C72948a.m85548a(str);
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return j;
        }
    }

    public static String getUnsignedLongString(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(TWO_64);
        }
        return valueOf.toString();
    }

    public static byte[] getUuidRandom() {
        try {
            InputStream E = C86013q1.m106423E("/dev/urandom");
            byte[] bArr = new byte[16];
            int read = E.read(bArr);
            E.close();
            if (read == 16) {
                return bArr;
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        UUID randomUUID = UUID.randomUUID();
        return C90193h.m112879g((randomUUID.toString() + nowMilliSecond()).getBytes());
    }

    public static boolean hideVKB(View view) {
        boolean z;
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager == null) {
                return false;
            }
            z = inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
            Log.m105927v(TAG, "hide VKB result %B", Boolean.valueOf(z));
            return z;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            Log.m105921e(TAG, "hide VKB exception %s", e);
            z = false;
        }
    }

    public static byte[] httpGet(String str) {
        if (str != null && str.length() != 0) {
            return URLUtil.isDataUrl(str) ? getBase64Data(str) : URLUtil.isHttpsUrl(str) ? getHttpsData(str) : getHttpData(str);
        }
        Log.m105920e(TAG, "httpGet, url is null");
        return null;
    }

    public static String intListToString(List<Integer> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i).toString());
            } else {
                sb.append(list.get(i).toString() + ",");
            }
        }
        return sb.toString();
    }

    public static void invoke(String str, String str2, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method[] methods = cls.getMethods();
            int length = methods.length;
            int i = 0;
            while (i < length) {
                Method method = methods[i];
                if (method.getName().equals(str2)) {
                    try {
                        method.invoke(cls.newInstance(), objArr);
                        return;
                    } catch (Exception e) {
                        Log.m105921e(TAG, "invoke failed, %s::%s", str, str2);
                        Log.printErrStackTrace(TAG, e, "", new Object[0]);
                    }
                } else {
                    i++;
                }
            }
            Log.m105920e(TAG, "invoke failed, no method matched");
        } catch (Exception e2) {
            Log.m105921e(TAG, "invoke failed, %s::%s", str, str2);
            Log.printErrStackTrace(TAG, e2, "", new Object[0]);
        }
    }

    public static boolean isART() {
        String property = System.getProperty("java.vm.version");
        return !isNullOrNil(property) && property.startsWith("2");
    }

    public static boolean isAffectedByPackageVisibility(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 30 && context.getApplicationInfo().targetSdkVersion >= 30;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "isAffectedByPackageVisibility", new Object[0]);
            return false;
        }
    }

    public static boolean isAllAlpha(String str) {
        for (char c : str.toCharArray()) {
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isChinese(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }

    public static boolean isDayTimeNow() {
        long j = (long) new GregorianCalendar().get(11);
        return j >= 6 && j < 18;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isEqual(int i, int i2) {
        return i == i2;
    }

    public static boolean isEqual(long j, long j2) {
        return j == j2;
    }

    public static boolean isEqual(String str, String str2) {
        if (isNullOrNil(str) && isNullOrNil(str2)) {
            return true;
        }
        if (isNullOrNil(str) && !isNullOrNil(str2)) {
            return false;
        }
        if (isNullOrNil(str) || !isNullOrNil(str2)) {
            return str.equals(str2);
        }
        return false;
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isFilePathSafeToBeCopySrc(String str) {
        if (isNullOrNil(str)) {
            return true;
        }
        try {
            return isResolvedPathSafeToBeCopySrc(new File(C86013q1.m106448i(str, false)).getCanonicalPath());
        } catch (NullPointerException e) {
            Log.printErrStackTrace(TAG, e, "[-] Fail to resolve canonical path of %s", str);
            return false;
        } catch (IOException e2) {
            Log.printErrStackTrace(TAG, e2, "[-] Fail to resolve canonical path of %s", str);
            return false;
        }
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isImageExt(String str) {
        if (isNullOrNil(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("webp")) {
            return true;
        }
        return (lowerCase.equals("heic") && Build.VERSION.SDK_INT >= 28) || lowerCase.equals("jpg") || lowerCase.equals("gif") || lowerCase.equals("bmp") || lowerCase.equals("jpeg") || lowerCase.equals("png");
    }

    public static boolean isImageFilename(String str) {
        int lastIndexOf;
        if (!isNullOrNil(str) && (lastIndexOf = str.lastIndexOf(".")) != -1) {
            return isImageExt(str.substring(lastIndexOf + 1));
        }
        return false;
    }

    public static boolean isIntentAvailable(Context context, Intent intent, boolean z) {
        return isIntentAvailable(context, intent, z, false);
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isMobileNO(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$").matcher(str).matches();
    }

    public static boolean isNullOrNil(List list) {
        return list == null || list.size() == 0;
    }

    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    @Deprecated
    public static boolean isOverseasUser(Context context) {
        if (!Locale.getDefault().getCountry().equalsIgnoreCase("CN")) {
            return true;
        }
        if (TimeZone.getDefault().getRawOffset() != TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return true;
        }
        if (context == null) {
            Log.m105928w(TAG, "isOverseasUser context is null");
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            return !isNullOrNil(networkCountryIso) && !networkCountryIso.contains("cn") && !networkCountryIso.contains("CN");
        }
    }

    public static Boolean isPhoneNumber(String str) {
        return Boolean.valueOf(Pattern.compile("^[+][0-9]{10,13}$").matcher(str).matches() || Pattern.compile("^1[0-9]{10}$").matcher(str).matches());
    }

    public static boolean isProcessRunning(Context context, String str) {
        try {
            if (!str.equals(context.getPackageName())) {
                if (!str.startsWith(context.getPackageName() + XVFSFile.PATH_SEPARATOR)) {
                    Log.m105925i(TAG, "isProcessRunning, use ps command. process = %s", str);
                    for (String next : getRunningAppProcessesByPs()) {
                        Log.m105919d(TAG, "isProcessRunning, process command line = %s", next);
                        if (next != null && next.contains(str)) {
                            String[] split = next.split("\\s+");
                            for (String equals : split) {
                                if (str.equals(equals)) {
                                    Log.m105925i(TAG, "process %s is running", str);
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                    Log.m105928w(TAG, "process " + str + " is not running");
                    return false;
                }
            }
            Log.m105925i(TAG, "isProcessRunning, use ActivityManager. process = %s", str);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next2 : runningAppProcesses) {
                if (next2 != null) {
                    String str2 = next2.processName;
                    if (str2 != null) {
                        if (str2.equals(str)) {
                            Log.m105928w(TAG, "process " + str + " is running");
                            return true;
                        }
                    }
                }
            }
            Log.m105928w(TAG, "process " + str + " is not running");
            return false;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static boolean isResolvedPathSafeToBeCopySrc(String str) {
        String packageName = ApplicationGlobal.context().getPackageName();
        if (str.contains("/" + packageName + "/cache/")) {
            return true;
        }
        String str2 = "/" + packageName + "-";
        int indexOf = str.indexOf(str2);
        if (indexOf >= 0 && str.startsWith("/cache/", str.indexOf("/", indexOf + str2.length()))) {
            return true;
        }
        if (!str.contains("/data/data/") && !str.contains("/data/user/")) {
            return true;
        }
        if (!str.contains("/" + packageName + "/")) {
            if (!str.contains("/" + packageName + "-")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSameDay(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        return instance.get(1) == instance2.get(1) && instance.get(5) == instance2.get(5) && instance.get(2) == instance2.get(2);
    }

    public static boolean isServiceRunning(Context context, String str) {
        ComponentName componentName;
        for (ActivityManager.RunningServiceInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningServices(Integer.MAX_VALUE)) {
            if (next != null && (componentName = next.service) != null && componentName.getClassName().toString().equals(str)) {
                Log.m105928w(TAG, "service " + str + " is running");
                return true;
            }
        }
        Log.m105928w(TAG, "service " + str + " is not running");
        return false;
    }

    @Deprecated
    public static boolean isTopActivity(Context context) {
        String name = context.getClass().getName();
        String topActivityName = getTopActivityName(context);
        Log.m105918d(TAG, "top activity=" + topActivityName + ", context=" + name);
        return topActivityName.equalsIgnoreCase(name);
    }

    @Deprecated
    public static boolean isTopApplication(Context context) {
        try {
            String className = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity.getClassName();
            String packageName = context.getPackageName();
            Log.m105918d(TAG, "top activity=" + className + ", context=" + packageName);
            return className.contains(packageName);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return false;
        }
    }

    public static boolean isUriSafeToBeCopySrc(Uri uri) {
        String str;
        if (uri == null) {
            return false;
        }
        if (whiteFileSet.contains(uri.toString())) {
            return true;
        }
        if (!"file".equalsIgnoreCase(uri.getScheme()) && !"content".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        if (C11171e.m11046c(30)) {
            str = uri.getPath();
            if (!new File(str).exists()) {
                str = getFilePath(ApplicationGlobal.context(), uri);
            }
        } else {
            str = getFilePath(ApplicationGlobal.context(), uri);
        }
        return isFilePathSafeToBeCopySrc(str);
    }

    public static boolean isValidAccount(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.length() < 6 || trim.length() > 20 || !isAlpha(trim.charAt(0))) {
            return false;
        }
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (!isAlpha(charAt) && !isNum(charAt) && charAt != '-' && charAt != '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidEmail(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.trim().matches("^[a-zA-Z0-9][\\w\\.-]*@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
    }

    public static boolean isValidPassword(String str) {
        if (str == null || str.length() < 8) {
            return false;
        }
        try {
            Long.parseLong(str);
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public static boolean isValidQQNum(String str) {
        if (str != null && str.length() > 0) {
            try {
                long longValue = Long.valueOf(str.trim()).longValue();
                return longValue > 0 && longValue <= MAX_32BIT_VALUE;
            } catch (NumberFormatException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return false;
    }

    public static boolean jump(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!isIntentAvailable(context, intent, false)) {
            Log.m105920e(TAG, "jump to url failed, " + str);
            return false;
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/Util", "jump", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/sdk/platformtools/Util", "jump", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return true;
        }
    }

    public static void lightShake(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(LIGHT_PATTERN, -1);
        }
    }

    public static String linkedListPairToString(LinkedList<Pair<String, String>> linkedList, String str) {
        if (linkedList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < linkedList.size(); i++) {
            if (i == linkedList.size() - 1) {
                sb.append(((String) linkedList.get(i).first).trim());
                sb.append(str);
                sb.append(((String) linkedList.get(i).second).trim());
            } else {
                sb.append(((String) linkedList.get(i).first).trim());
                sb.append(str);
                sb.append(((String) linkedList.get(i).second).trim());
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String listToString(List<String> list, String str) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i).trim());
            } else {
                sb.append(list.get(i).trim() + str);
            }
        }
        return sb.toString();
    }

    public static String[] listToStrings(List<String> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    private static int lookupEntity(char[] cArr, int i, int i2) {
        char c;
        if (i2 < 1) {
            return 0;
        }
        if (cArr[i] != '#') {
            return getEntity(new String(cArr, i, i2));
        }
        if (i2 <= 1 || !((c = cArr[i + 1]) == 'x' || c == 'X')) {
            try {
                return Integer.parseInt(new String(cArr, i + 1, i2 - 1), 10);
            } catch (NumberFormatException unused) {
                return 0;
            }
        } else {
            try {
                return Integer.parseInt(new String(cArr, i + 2, i2 - 2), 16);
            } catch (NumberFormatException unused2) {
                return 0;
            }
        }
    }

    public static String mapToXml(String str, LinkedHashMap<String, String> linkedHashMap) {
        StringBuilder sb = new StringBuilder();
        sb.append("<key>");
        for (Map.Entry next : linkedHashMap.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (key == null) {
                key = "unknow";
            }
            if (value == null) {
                value = "unknow";
            }
            sb.append("<" + key + ">");
            sb.append(value);
            sb.append("</" + key + ">");
        }
        sb.append("</key>");
        return sb.toString();
    }

    public static long milliSecondsToDate(String str) {
        if (isNullOrNil(str)) {
            return 0;
        }
        try {
            long time = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).parse(str).getTime();
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105925i(TAG, "todate:[%d], now date:[%d]", Long.valueOf(time), Long.valueOf(currentTimeMillis));
            return currentTimeMillis - time;
        } catch (ParseException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return 0;
        }
    }

    public static long milliSecondsToNow(long j) {
        return System.currentTimeMillis() - j;
    }

    public static String notNullToString(Object obj) {
        return obj != null ? obj.toString() : "null";
    }

    public static long nowMilliSecond() {
        return System.currentTimeMillis();
    }

    public static long nowSecond() {
        return System.currentTimeMillis() / 1000;
    }

    public static int nullAs(Integer num, int i) {
        return num == null ? i : num.intValue();
    }

    public static String nullAs(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static byte[] nullAs(byte[] bArr, byte[] bArr2) {
        return bArr == null ? bArr2 : bArr;
    }

    public static boolean nullAsFalse(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static int nullAsInt(Object obj, int i) {
        return obj == null ? i : obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof Long ? ((Long) obj).intValue() : i;
    }

    public static long nullAsLong(Object obj, long j) {
        return (obj != null && (obj instanceof Long)) ? ((Long) obj).longValue() : j;
    }

    public static int nullAsNil(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String nullAsNil(String str) {
        return str == null ? "" : str;
    }

    public static boolean nullAsTrue(Boolean bool) {
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static String processXml(String str) {
        return str;
    }

    public static void qualityClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.printErrStackTrace(TAG, e, "qualityClose", new Object[0]);
            }
        }
    }

    public static List<ResolveInfo> queryIntentActivities(Context context, Intent intent) {
        if (context == null || intent == null) {
            return null;
        }
        return context.getPackageManager().queryIntentActivities(intent, 65536);
    }

    public static int random() {
        return new Random().nextInt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f A[SYNTHETIC, Splitter:B:36:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c A[SYNTHETIC, Splitter:B:42:0x008c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readFromFile(java.lang.String r10) {
        /*
            java.lang.String r0 = ""
            boolean r1 = isNullOrNil((java.lang.String) r10)
            r2 = 0
            java.lang.String r3 = "MicroMsg.Util"
            if (r1 == 0) goto L_0x0012
            java.lang.String r10 = "readFromFile error, path is null or empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r10)
            return r2
        L_0x0012:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r10)
            boolean r4 = r1.mo119967g()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x002a
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r10
            java.lang.String r10 = "readFromFile error, file is not exit, path = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r10, r0)
            return r2
        L_0x002a:
            long r7 = r1.mo119980r()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            int r4 = (int) r7     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106422D(r1)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            byte[] r7 = new byte[r4]     // Catch:{ Exception -> 0x0072 }
            int r8 = r1.read(r7)     // Catch:{ Exception -> 0x0072 }
            if (r8 == r4) goto L_0x005e
            java.lang.String r7 = "readFromFile error, size is not equal, path = %s, file length is %d, count is %d"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0072 }
            r9[r6] = r10     // Catch:{ Exception -> 0x0072 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0072 }
            r9[r5] = r10     // Catch:{ Exception -> 0x0072 }
            r10 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0072 }
            r9[r10] = r4     // Catch:{ Exception -> 0x0072 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r7, r9)     // Catch:{ Exception -> 0x0072 }
            r1.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005d
        L_0x0057:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r10, r0, r1)
        L_0x005d:
            return r2
        L_0x005e:
            java.lang.String r10 = "readFromFile ok!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r10)     // Catch:{ Exception -> 0x0072 }
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x006e
        L_0x0068:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r10, r0, r1)
        L_0x006e:
            return r7
        L_0x006f:
            r10 = move-exception
            r2 = r1
            goto L_0x008a
        L_0x0072:
            r10 = move-exception
            goto L_0x0078
        L_0x0074:
            r10 = move-exception
            goto L_0x008a
        L_0x0076:
            r10 = move-exception
            r1 = r2
        L_0x0078:
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x006f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r10, r0, r4)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0089
        L_0x0083:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r10, r0, r1)
        L_0x0089:
            return r2
        L_0x008a:
            if (r2 == 0) goto L_0x0096
            r2.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0096
        L_0x0090:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r0, r2)
        L_0x0096:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.readFromFile(java.lang.String):byte[]");
    }

    public static int safeDecodeInt(String str) {
        try {
            return Integer.decode(str).intValue();
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "decodeInt error " + str, new Object[0]);
            return 0;
        }
    }

    public static String safeFormatString(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            Log.m105925i(TAG, "error safeFormatString %s", e.getMessage());
            return str;
        }
    }

    public static double safeParseDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            if (str != null) {
                Log.m105920e(TAG, "parseDouble error " + str);
            }
            return 0.0d;
        }
    }

    public static float safeParseFloat(String str) {
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            if (str != null) {
                Log.m105920e(TAG, "parseFloat error " + str);
            }
            return 0.0f;
        }
    }

    public static int safeParseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            if (str != null) {
                Log.m105920e(TAG, "parserInt error " + str);
            }
            return 0;
        }
    }

    public static long safeParseLong(String str) {
        return safeParseLong(str, 0);
    }

    public static String secPrint(String str) {
        if (isNullOrNil(str)) {
            return "";
        }
        int length = str.length();
        if (length < 4) {
            return "*~" + length;
        } else if (length < 8) {
            return str.substring(0, 1) + "*" + str.substring(length - 2, length - 1) + "~" + length;
        } else {
            return str.substring(0, 2) + "*" + str.substring(length - 3, length - 1) + "~" + length;
        }
    }

    public static long secondsToNow(long j) {
        return (System.currentTimeMillis() / 1000) - j;
    }

    public static void selectPicture(Context context, int i) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(createChooser);
        C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/Util", "selectPicture", "(Landroid/content/Context;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public static boolean setComponentEnabledSetting(Context context, ComponentName componentName, int i, int i2) {
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, i, i2);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "setComponentEnabledSetting fail", new Object[0]);
            return false;
        }
    }

    public static String setToString(Set<String> set, String str) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        for (String next : set) {
            if (i == set.size() - 1) {
                sb.append(next.trim());
            } else {
                sb.append(next.trim());
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }

    public static void shake(Context context, boolean z) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator == null) {
            Log.m105928w(TAG, "shake:vibrator is null!");
        } else if (z) {
            vibrator.vibrate(VIRBRATOR_PATTERN, -1);
        } else {
            vibrator.cancel();
        }
    }

    public static int[] splitToIntArray(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(XVFSFile.PATH_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (str2 != null && str2.length() > 0) {
                try {
                    arrayList.add(Integer.valueOf(Integer.valueOf(str2).intValue()));
                } catch (Exception e) {
                    Log.printErrStackTrace(TAG, e, "", new Object[0]);
                    Log.m105920e(TAG, "invalid port num, ignore");
                }
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    public static String stackTraceToString(Throwable th) {
        return MMStack.stackTraceToString(th);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String streamToString(java.io.InputStream r7) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.Util"
            if (r7 != 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 0
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0039, all -> 0x002d }
        L_0x0012:
            int r5 = r7.read(r3)     // Catch:{ Exception -> 0x0039, all -> 0x002d }
            r6 = -1
            if (r5 == r6) goto L_0x0022
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0039, all -> 0x002d }
            r6.<init>(r3, r4, r5)     // Catch:{ Exception -> 0x0039, all -> 0x002d }
            r2.append(r6)     // Catch:{ Exception -> 0x0039, all -> 0x002d }
            goto L_0x0012
        L_0x0022:
            r7.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x0043
        L_0x0026:
            r7 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r3)
            goto L_0x0043
        L_0x002d:
            r2 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0038
        L_0x0032:
            r7 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r3)
        L_0x0038:
            throw r2
        L_0x0039:
            r7.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0043
        L_0x003d:
            r7 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r3)
        L_0x0043:
            java.lang.String r7 = r2.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.streamToString(java.io.InputStream):java.lang.String");
    }

    public static boolean stringEquals(String str, String str2) {
        return TextUtils.equals(str, str2);
    }

    public static List<String> stringToList(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        String[] split = str.split(str2);
        return split == null ? Collections.EMPTY_LIST : Arrays.asList(split);
    }

    public static LinkedList<Pair<String, String>> stringsToLinkedListPair(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList<Pair<String, String>> linkedList = new LinkedList<>();
        for (int i = 1; i < strArr.length; i += 2) {
            linkedList.add(new Pair(strArr[i - 1], strArr[i]));
        }
        return linkedList;
    }

    public static ArrayList<String> stringsToList(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String add : strArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r2.lastIndexOf("@");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String subStringEmail(java.lang.String r2) {
        /*
            if (r2 == 0) goto L_0x0016
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0016
            java.lang.String r0 = "@"
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L_0x0016
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.Util.subStringEmail(java.lang.String):java.lang.String");
    }

    public static long ticksToNow(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    public static String[] toStringArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new String[0];
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    public static String trimPhoneNumber(String str) {
        return str.replaceAll("[\\.\\-]", "").trim();
    }

    public static String unixTimeMsToTime(long j) {
        return new SimpleDateFormat("HH:mm:ss").format(new Date(j));
    }

    public static int videoMsToSec(long j) {
        return Math.round(((float) j) / 1000.0f);
    }

    public static boolean writeToFile(String str, byte[] bArr) {
        if (isNullOrNil(str) || isNullOrNil(bArr)) {
            Log.m105928w(TAG, "write to file error, path is null or empty, or data is empty");
            return false;
        }
        OutputStream outputStream = null;
        try {
            outputStream = C86013q1.m106429K(str, false);
            outputStream.write(bArr);
            outputStream.flush();
            try {
                outputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
            Log.m105918d(TAG, "writeToFile ok!");
            return true;
        } catch (Exception e2) {
            Log.printErrStackTrace(TAG, e2, "", new Object[0]);
            Log.m105928w(TAG, "write to file error");
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace(TAG, e3, "", new Object[0]);
                }
            }
            return false;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace(TAG, e4, "", new Object[0]);
                }
            }
            throw th;
        }
    }

    public static String dumpHexBuf(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "(null)";
        }
        if (i2 <= 0) {
            i2 = bArr.length;
        }
        int i3 = 0;
        if (i > i2) {
            i = 0;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[((i2 * 3) + (i2 / 16))];
        for (int i4 = i; i4 < i2 + i; i4++) {
            byte b = bArr[i4];
            int i5 = i3 + 1;
            cArr2[i3] = LOWER_RANGE;
            int i6 = i5 + 1;
            cArr2[i5] = cArr[(b >>> 4) & 15];
            int i7 = i6 + 1;
            cArr2[i6] = cArr[b & 15];
            if (i4 % 16 != 0 || i4 <= 0) {
                i3 = i7;
            } else {
                i3 = i7 + 1;
                cArr2[i7] = 10;
            }
        }
        return new String(cArr2);
    }

    public static int getLength(byte[] bArr) {
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public static boolean isIntentAvailable(Context context, Intent intent, boolean z, boolean z2) {
        if (!z || !isAffectedByPackageVisibility(context)) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            boolean z3 = queryIntentActivities != null && queryIntentActivities.size() > 0;
            if (z2) {
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(z3);
                objArr[1] = Integer.valueOf(queryIntentActivities != null ? queryIntentActivities.size() : -1);
                Log.m105925i(TAG, "isIntentAvailable res:%s listSize:%s", objArr);
            }
            return z3;
        }
        if (z2) {
            Log.m105924i(TAG, "isIntentAvailable return true by force");
        }
        return true;
    }

    public static boolean isNullOrNil(String str) {
        return str == null || str.length() <= 0;
    }

    public static long nullAs(Long l, long j) {
        return l == null ? j : l.longValue();
    }

    public static long nullAsNil(Long l) {
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public static long safeParseLong(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            if (str == null) {
                return j;
            }
            Log.m105920e(TAG, "parseLong error " + str);
            return j;
        }
    }

    public static int getInt(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        try {
            return getInt(obj.toString(), i);
        } catch (NumberFormatException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return i;
        }
    }

    public static String getSizeGB(long j) {
        return getSizeGB(j, 10.0d);
    }

    public static String getSizeMB(long j) {
        return getSizeMB(j, 10.0d);
    }

    public static boolean isChinese(String str) {
        if (isNullOrNil(str)) {
            return false;
        }
        return Pattern.compile("[\\u4e00-\\u9fa5]+").matcher(str).find();
    }

    public static boolean isNullOrNil(CharSequence charSequence) {
        return charSequence == null || charSequence.length() <= 0;
    }

    public static boolean nullAs(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    public static int safeParseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            if (str == null) {
                return i;
            }
            Log.m105920e(TAG, "parserInt error " + str);
            return i;
        }
    }

    public static boolean isNullOrNil(byte[] bArr) {
        return bArr == null || bArr.length <= 0;
    }

    public static boolean isEqual(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean isNullOrNil(String... strArr) {
        for (String isNullOrNil : strArr) {
            if (isNullOrNil(isNullOrNil)) {
                return true;
            }
        }
        return false;
    }

    public static String getSizeKB(long j) {
        return getSizeKB(j, 10.0d);
    }

    public static boolean isEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
