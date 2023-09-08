package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ListView;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.InputStream;
import p914oj.C89231c;

/* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil */
public class BackwardSupportUtil {
    public static final int ANDROID_API_LEVEL_16 = 16;
    private static final int ANDROID_API_LEVEL_8 = 8;
    private static final String TAG = "MicroMsg.SDK.BackwardSupportUtil";

    /* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$BitmapFactory */
    public static class BitmapFactory {
        private static final float HDPI_DENSITY = 1.5f;
        private static final float MDPI_DENSITY = 1.0f;

        public static Bitmap decodeFile(String str, float f) {
            float f2 = 160.0f * f;
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(str, f);
            if (bitmapNative != null) {
                bitmapNative.setDensity((int) f2);
            }
            return bitmapNative;
        }

        public static Bitmap decodeFileWithMemLimit(String str, int i) {
            int i2;
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
            if (imageOptions == null || TextUtils.isEmpty(imageOptions.outMimeType)) {
                Log.m105921e(BackwardSupportUtil.TAG, "[-] [tomys] Fail to get image size: %s", str);
                return null;
            }
            int i3 = imageOptions.outWidth;
            if (i3 == 0 || (i2 = imageOptions.outHeight) == 0) {
                Log.m105929w(BackwardSupportUtil.TAG, "[!] [tomys] Bad image size: %s x %s, try to decode it directly.", Integer.valueOf(i3), Integer.valueOf(imageOptions.outHeight));
                return BitmapUtil.getBitmapNative(str);
            }
            imageOptions.inJustDecodeBounds = false;
            imageOptions.inSampleSize = 1;
            long j = (long) (i3 * i2 * 8);
            while (true) {
                int i4 = imageOptions.inSampleSize;
                j = (j / ((long) i4)) / ((long) i4);
                if (j <= 0) {
                    if (i4 > 1) {
                        imageOptions.inSampleSize = i4 - 1;
                    }
                } else if (j <= ((long) i)) {
                    break;
                } else {
                    imageOptions.inSampleSize = i4 + 1;
                }
            }
            return MMBitmapFactory.m98735d(str, imageOptions);
        }

        public static Bitmap decodeStream(InputStream inputStream) {
            return BitmapUtil.decodeStream(inputStream);
        }

        public static int fromDPToPix(Context context, float f) {
            return Math.round((f * ((float) context.getResources().getDisplayMetrics().densityDpi)) / 160.0f);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[SYNTHETIC, Splitter:B:21:0x0060] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0077 A[SYNTHETIC, Splitter:B:29:0x0077] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.Bitmap getBitmapFromURL(java.lang.String r6) {
            /*
                java.lang.String r0 = "MicroMsg.SDK.BackwardSupportUtil"
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                r2.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                java.lang.String r3 = "get bitmap from url:"
                r2.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                r2.append(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                r2.<init>(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                java.net.URLConnection r6 = r2.openConnection()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
                r2 = 1
                r6.setDoInput(r2)     // Catch:{ IOException -> 0x0048 }
                r6.connect()     // Catch:{ IOException -> 0x0048 }
                java.io.InputStream r2 = r6.getInputStream()     // Catch:{ IOException -> 0x0048 }
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r2)     // Catch:{ IOException -> 0x0048 }
                r2.close()     // Catch:{ IOException -> 0x0048 }
                java.io.InputStream r1 = r6.getInputStream()     // Catch:{ Exception -> 0x003c }
                r1.close()     // Catch:{ Exception -> 0x003c }
                goto L_0x0044
            L_0x003c:
                r1 = move-exception
                java.lang.String r1 = r1.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x0044:
                r6.disconnect()
                return r3
            L_0x0048:
                r2 = move-exception
                goto L_0x0051
            L_0x004a:
                r6 = move-exception
                r5 = r1
                r1 = r6
                r6 = r5
                goto L_0x0075
            L_0x004f:
                r2 = move-exception
                r6 = r1
            L_0x0051:
                java.lang.String r3 = "get bitmap from url failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = ""
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0074 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r4)     // Catch:{ all -> 0x0074 }
                if (r6 == 0) goto L_0x0073
                java.io.InputStream r2 = r6.getInputStream()     // Catch:{ Exception -> 0x0068 }
                r2.close()     // Catch:{ Exception -> 0x0068 }
                goto L_0x0070
            L_0x0068:
                r2 = move-exception
                java.lang.String r2 = r2.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            L_0x0070:
                r6.disconnect()
            L_0x0073:
                return r1
            L_0x0074:
                r1 = move-exception
            L_0x0075:
                if (r6 == 0) goto L_0x008a
                java.io.InputStream r2 = r6.getInputStream()     // Catch:{ Exception -> 0x007f }
                r2.close()     // Catch:{ Exception -> 0x007f }
                goto L_0x0087
            L_0x007f:
                r2 = move-exception
                java.lang.String r2 = r2.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            L_0x0087:
                r6.disconnect()
            L_0x008a:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.getBitmapFromURL(java.lang.String):android.graphics.Bitmap");
        }

        public static String getDisplayDensityType(Context context) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Configuration configuration = context.getResources().getConfiguration();
            float f = displayMetrics.density;
            String str = f < 1.0f ? "LDPI" : f >= 1.5f ? "HDPI" : "MDPI";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(configuration.orientation == 2 ? "_L" : "_P");
            return sb.toString();
        }

        public static String getDisplaySizeType(Context context) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return "" + displayMetrics.heightPixels + "x" + displayMetrics.widthPixels;
        }

        public static Bitmap decodeStream(InputStream inputStream, float f) {
            return decodeStream(inputStream, f, 0, 0);
        }

        public static Bitmap decodeStream(InputStream inputStream, float f, int i, int i2) {
            float f2 = 160.0f * f;
            Bitmap decodeStream = BitmapUtil.decodeStream(inputStream, f, i, i2);
            if (decodeStream != null) {
                decodeStream.setDensity((int) f2);
            }
            return decodeStream;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$SmoothScrollFactory */
    public static class SmoothScrollFactory {

        /* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$SmoothScrollFactory$IScroll */
        public interface IScroll {
            void doScroll(ListView listView);

            void doScroll(ListView listView, int i);

            void doScrollFromTop(ListView listView, int i);
        }

        public static void scrollTo(ListView listView, int i) {
            if (listView != null) {
                new SmoothScrollToPosition22().doScroll(listView, i);
            }
        }

        public static void scrollToFromTop(ListView listView, int i) {
            if (listView != null) {
                new SmoothScrollToPosition22().doScrollFromTop(listView, i);
            }
        }

        public static void scrollToTop(ListView listView) {
            if (listView != null) {
                new SmoothScrollToPosition22().doScroll(listView);
            }
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$AnimationHelper */
    public static class AnimationHelper {

        /* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$AnimationHelper$IHelper */
        public interface IHelper {
            void cancelAnimation(View view, Animation animation);
        }

        public static void cancelAnimation(View view, Animation animation) {
            new AnimationHelperImpl22().cancelAnimation(view, animation);
        }

        public static void overridePendingTransition(Activity activity, int i, int i2) {
            activity.overridePendingTransition(i, i2);
        }
    }

    public static ExifHelper.LatLongData getVideoLatLong(String str) {
        C89231c cVar = new C89231c();
        try {
            cVar.setDataSource(str);
            String extractMetadata = cVar.extractMetadata(23);
            cVar.release();
            Log.m105924i(TAG, "getVideoLatLong locationString " + extractMetadata);
            if (TextUtils.isEmpty(extractMetadata)) {
                return null;
            }
            char[] charArray = extractMetadata.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                if (!(c == '+' || c == '-' || c == '.')) {
                    if (!TextUtils.isDigitsOnly(c + "")) {
                    }
                }
                sb.append(c);
            }
            String sb4 = sb.toString();
            int lastIndexOf = sb4.lastIndexOf(43);
            if (-1 == lastIndexOf) {
                lastIndexOf = sb4.lastIndexOf(45);
            }
            ExifHelper.LatLongData latLongData = new ExifHelper.LatLongData();
            latLongData.latitude = Util.safeParseFloat(sb4.substring(0, lastIndexOf));
            latLongData.longtitude = Util.safeParseFloat(sb4.substring(lastIndexOf));
            return latLongData;
        } catch (Exception e) {
            Log.m105920e(TAG, "getVideoLatLong setDataSource failure: " + e.getMessage());
            return null;
        }
    }

    public static String getVideoTakeTime(String str) {
        C89231c cVar = new C89231c();
        try {
            cVar.setDataSource(str);
            String extractMetadata = cVar.extractMetadata(5);
            cVar.release();
            Log.m105924i(TAG, "getVideoTakeTime timeString " + extractMetadata);
            return extractMetadata;
        } catch (Exception e) {
            Log.m105920e(TAG, "getVideoLatLong setDataSource failure: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper */
    public static class ExifHelper {
        public static LatLongData getExifLatLong(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105918d(BackwardSupportUtil.TAG, "filepath is null or nil");
                return null;
            } else if (!C86013q1.m106450k(str)) {
                Log.m105919d(BackwardSupportUtil.TAG, "file not exist:[%s]", str);
                return null;
            } else {
                Exif.C80833a location = Exif.fromFile(str).getLocation();
                if (location == null) {
                    return null;
                }
                LatLongData latLongData = new LatLongData();
                latLongData.latitude = (float) location.f237621a;
                latLongData.longtitude = (float) location.f237622b;
                return latLongData;
            }
        }

        public static int getExifOrientation(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105918d(BackwardSupportUtil.TAG, "filepath is null or nil");
                return 0;
            } else if (C86013q1.m106450k(str)) {
                return Exif.fromFile(str).getOrientationInDegree();
            } else {
                Log.m105919d(BackwardSupportUtil.TAG, "file not exist:[%s]", str);
                return 0;
            }
        }

        public static String getExifTime(String str) {
            if (Util.isNullOrNil(str)) {
                Log.m105918d(BackwardSupportUtil.TAG, "filepath is null or nil");
                return null;
            } else if (C86013q1.m106450k(str)) {
                return Exif.fromFile(str).dateTime;
            } else {
                Log.m105919d(BackwardSupportUtil.TAG, "file not exist:[%s]", str);
                return null;
            }
        }

        /* renamed from: com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData */
        public static class LatLongData implements Parcelable {
            public static final Parcelable.Creator<LatLongData> CREATOR = new Parcelable.Creator<LatLongData>() {
                public LatLongData createFromParcel(Parcel parcel) {
                    LatLongData latLongData = new LatLongData();
                    latLongData.latitude = parcel.readFloat();
                    latLongData.longtitude = parcel.readFloat();
                    return latLongData;
                }

                public LatLongData[] newArray(int i) {
                    return new LatLongData[i];
                }
            };
            private static final float PRECISION = 1.0E-6f;
            public float latitude;
            public float longtitude;

            public LatLongData() {
                this.latitude = 0.0f;
                this.longtitude = 0.0f;
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof LatLongData)) {
                    return false;
                }
                LatLongData latLongData = (LatLongData) obj;
                return Math.abs(this.latitude - latLongData.latitude) < PRECISION && Math.abs(this.longtitude - latLongData.longtitude) < PRECISION;
            }

            public int hashCode() {
                return ((int) (this.latitude * 10000.0f)) + ((int) (this.longtitude * 10000.0f));
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeFloat(this.latitude);
                parcel.writeFloat(this.longtitude);
            }

            public LatLongData(float f, float f2) {
                this.latitude = f;
                this.longtitude = f2;
            }
        }
    }
}
