package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.View;
import java.lang.ref.WeakReference;
import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.platformtools.ScreenShotUtil */
public final class ScreenShotUtil {
    /* access modifiers changed from: private */
    public static final String EXTERNAL_CONTENT_URI_MATCHER = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    /* access modifiers changed from: private */
    public static final String[] PROJECTION = {"_display_name", "_data", "date_added"};
    private static final String TAG = "MicroMsg.ScreenShotUtil";
    /* access modifiers changed from: private */
    public static WeakReference<ScreenShotCallback> mCallbackWeakRef;
    /* access modifiers changed from: private */
    public static ContentObserver mScreenShotContentObserver;
    /* access modifiers changed from: private */
    public static final Handler sHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static MMHandler workHandler = new MMHandler(C109639a.m148950a(TAG));

    /* renamed from: com.tencent.mm.sdk.platformtools.ScreenShotUtil$ScreenShotCallback */
    public interface ScreenShotCallback {
        void onScreenShot(String str, long j);
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.ScreenShotUtil$ScreenShotContentObserver */
    public static final class ScreenShotContentObserver extends ContentObserver {
        /* access modifiers changed from: private */
        public Context context;
        private String lastPath;
        private long lastShotTime;
        private Uri lastUri;

        public ScreenShotContentObserver(Context context2, Handler handler) {
            super(handler);
            this.context = context2;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [android.os.CancellationSignal, android.database.Cursor] */
        /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
        /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChangeImpl(android.content.Context r13, android.net.Uri r14) {
            /*
                r12 = this;
                java.lang.String r0 = "MicroMsg.ScreenShotUtil"
                r1 = 0
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r3 = "date_added"
                r4 = 30
                if (r2 < r4) goto L_0x0039
                android.content.pm.ApplicationInfo r2 = r13.getApplicationInfo()     // Catch:{ Exception -> 0x00a8 }
                int r2 = r2.targetSdkVersion     // Catch:{ Exception -> 0x00a8 }
                if (r2 < r4) goto L_0x0039
                android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x00a8 }
                r2.<init>()     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r4 = "android:query-arg-limit"
                r5 = 1
                r2.putInt(r4, r5)     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r4 = "android:query-arg-sort-columns"
                java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x00a8 }
                r2.putStringArray(r4, r6)     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r4 = "android:query-arg-sort-direction"
                r2.putInt(r4, r5)     // Catch:{ Exception -> 0x00a8 }
                android.content.ContentResolver r4 = r13.getContentResolver()     // Catch:{ Exception -> 0x00a8 }
                java.lang.String[] r5 = com.tencent.p014mm.sdk.platformtools.ScreenShotUtil.PROJECTION     // Catch:{ Exception -> 0x00a8 }
                android.database.Cursor r14 = r4.query(r14, r5, r2, r1)     // Catch:{ Exception -> 0x00a8 }
                goto L_0x004a
            L_0x0039:
                android.content.ContentResolver r4 = r13.getContentResolver()     // Catch:{ Exception -> 0x00a8 }
                java.lang.String[] r6 = com.tencent.p014mm.sdk.platformtools.ScreenShotUtil.PROJECTION     // Catch:{ Exception -> 0x00a8 }
                r7 = 0
                r8 = 0
                java.lang.String r9 = "date_added DESC limit 1"
                r5 = r14
                android.database.Cursor r14 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00a8 }
            L_0x004a:
                r1 = r14
                if (r1 == 0) goto L_0x00a0
                boolean r14 = r1.moveToFirst()     // Catch:{ Exception -> 0x00a8 }
                if (r14 == 0) goto L_0x00a0
                java.lang.String r14 = "_data"
                int r14 = r1.getColumnIndex(r14)     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r7 = r1.getString(r14)     // Catch:{ Exception -> 0x00a8 }
                int r14 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x00a8 }
                long r8 = r1.getLong(r14)     // Catch:{ Exception -> 0x00a8 }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a8 }
                r4 = 1000(0x3e8, double:4.94E-321)
                long r10 = r2 / r4
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
                r14.<init>()     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r2 = "summerscreenshot path: "
                r14.append(r2)     // Catch:{ Exception -> 0x00a8 }
                r14.append(r7)     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r2 = ", dateAdded: "
                r14.append(r2)     // Catch:{ Exception -> 0x00a8 }
                r14.append(r8)     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r2 = ", currentTime: "
                r14.append(r2)     // Catch:{ Exception -> 0x00a8 }
                r14.append(r10)     // Catch:{ Exception -> 0x00a8 }
                java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x00a8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r14)     // Catch:{ Exception -> 0x00a8 }
                android.os.Handler r14 = com.tencent.p014mm.sdk.platformtools.ScreenShotUtil.sHandler     // Catch:{ Exception -> 0x00a8 }
                com.tencent.mm.sdk.platformtools.ScreenShotUtil$ScreenShotContentObserver$2 r2 = new com.tencent.mm.sdk.platformtools.ScreenShotUtil$ScreenShotContentObserver$2     // Catch:{ Exception -> 0x00a8 }
                r4 = r2
                r5 = r12
                r6 = r13
                r4.<init>(r6, r7, r8, r10)     // Catch:{ Exception -> 0x00a8 }
                r14.post(r2)     // Catch:{ Exception -> 0x00a8 }
            L_0x00a0:
                if (r1 == 0) goto L_0x00c4
            L_0x00a2:
                r1.close()
                goto L_0x00c4
            L_0x00a6:
                r13 = move-exception
                goto L_0x00c5
            L_0x00a8:
                r13 = move-exception
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
                r14.<init>()     // Catch:{ all -> 0x00a6 }
                java.lang.String r2 = "summerscreenshot fail e:"
                r14.append(r2)     // Catch:{ all -> 0x00a6 }
                java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x00a6 }
                r14.append(r13)     // Catch:{ all -> 0x00a6 }
                java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x00a6 }
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r13)     // Catch:{ all -> 0x00a6 }
                if (r1 == 0) goto L_0x00c4
                goto L_0x00a2
            L_0x00c4:
                return
            L_0x00c5:
                if (r1 == 0) goto L_0x00ca
                r1.close()
            L_0x00ca:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ScreenShotUtil.ScreenShotContentObserver.onChangeImpl(android.content.Context, android.net.Uri):void");
        }

        /* access modifiers changed from: private */
        public void postOnChangeImpl(Context context2, String str, long j, long j2) {
            try {
                if (Math.abs(j2 - j) > 10 || j2 - this.lastShotTime <= 1 || Util.isNullOrNil(str) || ((!str.toLowerCase().contains("screenshot") && !str.contains("截屏") && !str.contains("截图")) || str.equals(this.lastPath))) {
                    j = 0;
                    str = null;
                } else {
                    this.lastShotTime = j2;
                    this.lastPath = str;
                }
                if (!Util.isNullOrNil(str)) {
                    Log.m105924i(ScreenShotUtil.TAG, "summerscreenshot added path: " + str + ", time: " + j);
                    ScreenShotCallback screenShotCallback = ScreenShotUtil.mCallbackWeakRef != null ? (ScreenShotCallback) ScreenShotUtil.mCallbackWeakRef.get() : null;
                    if (screenShotCallback != null) {
                        screenShotCallback.onScreenShot(str, j);
                        return;
                    }
                    if (ScreenShotUtil.mScreenShotContentObserver != null) {
                        context2.getContentResolver().unregisterContentObserver(ScreenShotUtil.mScreenShotContentObserver);
                        ContentObserver unused = ScreenShotUtil.mScreenShotContentObserver = null;
                    }
                    if (ScreenShotUtil.mCallbackWeakRef != null) {
                        ScreenShotUtil.mCallbackWeakRef.clear();
                        WeakReference unused2 = ScreenShotUtil.mCallbackWeakRef = null;
                    }
                    Log.m105924i(ScreenShotUtil.TAG, "summerscreenshot unregisterContentObserver callback is null 2");
                }
            } catch (Throwable th) {
                Log.m105928w(ScreenShotUtil.TAG, "summerscreenshot fail e:" + th.getMessage());
            }
        }

        public void onChange(final boolean z, final Uri uri) {
            Uri uri2 = this.lastUri;
            if (uri2 == null || uri == null || uri2.getPath() == null || !this.lastUri.getPath().equals(uri.getPath())) {
                this.lastUri = uri;
                ScreenShotUtil.workHandler.post(new Runnable() {
                    public void run() {
                        Log.m105918d(ScreenShotUtil.TAG, "summerscreenshot onChange: " + z + ", uri:" + uri.toString());
                        try {
                            if (ScreenShotUtil.mCallbackWeakRef != null) {
                                if (ScreenShotUtil.mCallbackWeakRef.get() != null) {
                                    if (uri.toString().matches(ScreenShotUtil.EXTERNAL_CONTENT_URI_MATCHER) || uri.toString().contains(ScreenShotUtil.EXTERNAL_CONTENT_URI_MATCHER)) {
                                        ScreenShotContentObserver screenShotContentObserver = ScreenShotContentObserver.this;
                                        screenShotContentObserver.onChangeImpl(screenShotContentObserver.context, uri);
                                        return;
                                    }
                                    return;
                                }
                            }
                            Log.m105925i(ScreenShotUtil.TAG, "summerscreenshot unregisterContentObserver callback is null 1 mCallbackWeakRef[%s]", ScreenShotUtil.mCallbackWeakRef);
                            if (ScreenShotUtil.mScreenShotContentObserver != null) {
                                ScreenShotContentObserver.this.context.getContentResolver().unregisterContentObserver(ScreenShotUtil.mScreenShotContentObserver);
                                ContentObserver unused = ScreenShotUtil.mScreenShotContentObserver = null;
                            }
                            if (ScreenShotUtil.mCallbackWeakRef != null) {
                                ScreenShotUtil.mCallbackWeakRef.clear();
                                WeakReference unused2 = ScreenShotUtil.mCallbackWeakRef = null;
                            }
                        } catch (Throwable th) {
                            Log.m105928w(ScreenShotUtil.TAG, "summerscreenshot fail e:" + th.getMessage());
                        }
                    }
                });
                super.onChange(z, uri);
                return;
            }
            super.onChange(z, uri);
        }
    }

    public static void setScreenShotCallback(final Context context, final ScreenShotCallback screenShotCallback) {
        workHandler.post(new Runnable() {
            public void run() {
                Log.m105925i(ScreenShotUtil.TAG, "summerscreenshot setScreenShotCallback context[%s] callback[%s], stack[%s]", context, screenShotCallback, Util.getStack());
                try {
                    if (context != null) {
                        if (screenShotCallback == null) {
                            if (ScreenShotUtil.mScreenShotContentObserver != null) {
                                context.getContentResolver().unregisterContentObserver(ScreenShotUtil.mScreenShotContentObserver);
                                ContentObserver unused = ScreenShotUtil.mScreenShotContentObserver = null;
                            }
                            if (ScreenShotUtil.mCallbackWeakRef != null) {
                                ScreenShotUtil.mCallbackWeakRef.clear();
                                WeakReference unused2 = ScreenShotUtil.mCallbackWeakRef = null;
                                return;
                            }
                            return;
                        }
                        WeakReference unused3 = ScreenShotUtil.mCallbackWeakRef = new WeakReference(screenShotCallback);
                        if (ScreenShotUtil.mScreenShotContentObserver == null) {
                            ContentObserver unused4 = ScreenShotUtil.mScreenShotContentObserver = new ScreenShotContentObserver(context, ScreenShotUtil.sHandler);
                            context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, ScreenShotUtil.mScreenShotContentObserver);
                        }
                    }
                } catch (Throwable th) {
                    Log.m105928w(ScreenShotUtil.TAG, "summerscreenshot fail e:" + th.getMessage());
                }
            }
        });
    }

    public static Bitmap takeScreenShot(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        Bitmap drawingCache = decorView.getDrawingCache();
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        try {
            drawingCache = Bitmap.createBitmap(drawingCache, 0, i, activity.getWindowManager().getDefaultDisplay().getWidth(), activity.getWindowManager().getDefaultDisplay().getHeight() - i);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        decorView.destroyDrawingCache();
        return drawingCache;
    }
}
