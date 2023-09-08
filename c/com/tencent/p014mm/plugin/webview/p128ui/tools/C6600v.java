package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.v */
public class C6600v {

    /* renamed from: a */
    public static final HashMap<String, WeakReference<Bitmap>> f23854a = new HashMap<>();

    /* renamed from: a */
    public static Bitmap m6906a(String str) {
        Bitmap bitmap;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        HashMap<String, WeakReference<Bitmap>> hashMap = f23854a;
        WeakReference weakReference = hashMap.get(str);
        if (weakReference != null && weakReference.get() != null && !((Bitmap) weakReference.get()).isRecycled()) {
            return (Bitmap) weakReference.get();
        }
        byte[] decode = Base64.decode(str, 0);
        if (decode == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int min = Math.min(i, i2);
        options.inJustDecodeBounds = false;
        if (min > 96) {
            options.inSampleSize = Math.max((int) ((((float) min) * 1.0f) / 96.0f), 1);
            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (bitmap == null) {
                return null;
            }
            i = bitmap.getWidth();
            i2 = bitmap.getHeight();
            min = Math.min(i, i2);
        } else {
            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (bitmap == null) {
                return null;
            }
        }
        int i3 = min / 2;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, Math.max((i / 2) - i3, 0), Math.max((i2 / 2) - i3, 0), min, min);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 96, 96, false);
        if (createBitmap != createScaledBitmap) {
            Log.m105925i("MicroMsg.WebView.RemoteUtil", "bitmap recycle %s", createBitmap.toString());
            createBitmap.recycle();
        }
        if (createScaledBitmap != null && !createScaledBitmap.isRecycled()) {
            hashMap.put(str, new WeakReference(createScaledBitmap));
        }
        return createScaledBitmap;
    }

    /* renamed from: b */
    public static void m6907b(C43791l lVar, int i, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        if (objArr != null && objArr.length != 0) {
            try {
                for (Object valueOf : objArr) {
                    arrayList.add(String.valueOf(valueOf));
                }
                lVar.mo68129eO(i, arrayList);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static int m6908c(String str, int i) {
        return (int) m6909d(str, Long.valueOf((long) i).longValue());
    }

    /* renamed from: d */
    public static long m6909d(String str, long j) {
        if (Util.isNullOrNil(str)) {
            return j;
        }
        if (str.startsWith("#") && str.length() == 4) {
            StringBuilder sb = new StringBuilder(str);
            sb.insert(2, str.charAt(1));
            sb.insert(4, str.charAt(2));
            sb.insert(6, str.charAt(3));
            str = sb.toString();
        }
        try {
            return ((long) Color.parseColor(str)) & Util.MAX_32BIT_VALUE;
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.WebView.RemoteUtil", "Failed to parse color: %s", str);
            return j;
        }
    }

    /* renamed from: e */
    public static boolean m6910e(Bundle bundle, String str, String str2, C6107m mVar, Runnable runnable) {
        if (mVar == null) {
            if (runnable != null) {
                runnable.run();
            }
            return true;
        }
        Bundle bundle2 = new Bundle(3);
        bundle2.putBundle("open_ui_with_webview_ui_extras", bundle);
        bundle2.putString("open_ui_with_webview_ui_plugin_name", str);
        bundle2.putString("open_ui_with_webview_ui_plugin_entry", str2);
        try {
            mVar.mo7031V5(101, bundle2);
            return true;
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.WebView.RemoteUtil", e, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", str, str2);
            return false;
        } catch (Exception e2) {
            if (runnable != null) {
                runnable.run();
            }
            Log.printErrStackTrace("MicroMsg.WebView.RemoteUtil", e2, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", str, str2);
            return false;
        }
    }
}
