package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.tencent.mm.sdk.platformtools.ClipboardHelper */
public class ClipboardHelper {
    public static final int ANDROID_API_LEVEL_11 = 11;
    public static final int ANDROID_API_LEVEL_8 = 8;
    private static final String TAG = "MicroMsg.ClipboardHelper";
    private static int lastCopyTxtHash;
    private static CharSequence lastPasteText;
    private static long lastPasteTime;

    /* renamed from: com.tencent.mm.sdk.platformtools.ClipboardHelper$IClipboard */
    public interface IClipboard {
        Intent getIntent(Context context);

        CharSequence getText(Context context);

        Uri getUri(Context context);

        void setIntent(Context context, CharSequence charSequence, Intent intent);

        void setText(Context context, CharSequence charSequence, CharSequence charSequence2);

        void setText(Context context, CharSequence charSequence, CharSequence charSequence2, String str);

        void setUri(Context context, CharSequence charSequence, Uri uri);
    }

    public static Intent getIntent(Context context) {
        return new ClipbroadHelperImpl30().getIntent(context);
    }

    public static CharSequence getText() {
        return getText(MMApplicationContext.getContext());
    }

    public static Uri getUri(Context context) {
        return new ClipbroadHelperImpl30().getUri(context);
    }

    public static boolean isCopyFromWX(CharSequence charSequence) {
        return !Util.isNullOrNil(charSequence) && lastCopyTxtHash != 0 && charSequence.toString().hashCode() == lastCopyTxtHash;
    }

    public static void setIntent(Context context, CharSequence charSequence, Intent intent) {
        new ClipbroadHelperImpl30().setIntent(context, charSequence, intent);
    }

    public static void setText(CharSequence charSequence) {
        setText(MMApplicationContext.getContext(), (CharSequence) null, charSequence);
    }

    public static boolean setTextSwallowException(CharSequence charSequence) {
        try {
            setText(MMApplicationContext.getContext(), (CharSequence) null, charSequence);
            return true;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return false;
        }
    }

    public static void setUri(Context context, CharSequence charSequence, Uri uri) {
        new ClipbroadHelperImpl30().setUri(context, charSequence, uri);
    }

    public static CharSequence getText(Context context) {
        if (System.currentTimeMillis() - lastPasteTime < 1000 && !Util.isNullOrNil(lastPasteText)) {
            return lastPasteText;
        }
        lastPasteTime = System.currentTimeMillis();
        CharSequence text = new ClipbroadHelperImpl30().getText(context);
        lastPasteText = text;
        if (text != null) {
            return text;
        }
        Log.m105924i("ClipboardHelper", "getText null");
        return "";
    }

    public static void setText(Context context, CharSequence charSequence) {
        setText(context, (CharSequence) null, charSequence);
    }

    public static void setText(Context context, CharSequence charSequence, CharSequence charSequence2) {
        setText(context, charSequence, charSequence2, (String) null);
    }

    public static void setText(Context context, CharSequence charSequence, CharSequence charSequence2, String str) {
        lastPasteTime = 0;
        new ClipbroadHelperImpl30().setText(context, charSequence, charSequence2, str);
        if (charSequence2 != null) {
            lastCopyTxtHash = charSequence2.toString().hashCode();
        }
    }
}
