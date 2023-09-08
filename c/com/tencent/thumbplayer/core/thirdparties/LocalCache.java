package com.tencent.thumbplayer.core.thirdparties;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import com.tencent.thumbplayer.core.utils.TPThreadPool;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

public class LocalCache {
    private static final int MAX_COUNT = Integer.MAX_VALUE;
    private static final int MAX_SIZE = 50000000;
    public static final int TIME_DAY = 86400;
    public static final int TIME_HOUR = 3600;
    private static Map<String, LocalCache> mInstanceMap = new HashMap();
    private ACacheManager mCache;

    public class ACacheManager {
        /* access modifiers changed from: private */
        public final AtomicInteger cacheCount;
        public File cacheDir;
        /* access modifiers changed from: private */
        public final AtomicLong cacheSize;
        private final int countLimit;
        /* access modifiers changed from: private */
        public final Map<File, Long> lastUsageDates;
        private final long sizeLimit;

        private void calculateCacheSizeAndCacheCount() {
            TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() {
                public void run() {
                    File[] listFiles = ACacheManager.this.cacheDir.listFiles();
                    if (listFiles != null) {
                        int i = 0;
                        int i2 = 0;
                        for (File file : listFiles) {
                            i = (int) (((long) i) + ACacheManager.this.calculateSize(file));
                            i2++;
                            ACacheManager.this.lastUsageDates.put(file, Long.valueOf(file.lastModified()));
                        }
                        ACacheManager.this.cacheSize.set((long) i);
                        ACacheManager.this.cacheCount.set(i2);
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        public long calculateSize(File file) {
            if (file == null) {
                return 0;
            }
            return file.length();
        }

        /* access modifiers changed from: private */
        public void clear() {
            this.lastUsageDates.clear();
            this.cacheSize.set(0);
            File[] listFiles = this.cacheDir.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* access modifiers changed from: private */
        public File get(String str) {
            File newFile = newFile(str);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            newFile.setLastModified(valueOf.longValue());
            this.lastUsageDates.put(newFile, valueOf);
            return newFile;
        }

        /* access modifiers changed from: private */
        public File newFile(String str) {
            File file = this.cacheDir;
            return new File(file, str.hashCode() + "");
        }

        /* access modifiers changed from: private */
        public void put(File file) {
            int i = this.cacheCount.get();
            while (i + 1 > this.countLimit) {
                this.cacheSize.addAndGet(-removeNext());
                i = this.cacheCount.addAndGet(-1);
            }
            this.cacheCount.addAndGet(1);
            long calculateSize = calculateSize(file);
            long j = this.cacheSize.get();
            while (j + calculateSize > this.sizeLimit) {
                j = this.cacheSize.addAndGet(-removeNext());
            }
            this.cacheSize.addAndGet(calculateSize);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.lastUsageDates.put(file, valueOf);
        }

        /* access modifiers changed from: private */
        public boolean remove(String str) {
            return get(str).delete();
        }

        private long removeNext() {
            File file;
            if (this.lastUsageDates.isEmpty()) {
                return 0;
            }
            Set<Map.Entry<File, Long>> entrySet = this.lastUsageDates.entrySet();
            synchronized (this.lastUsageDates) {
                file = null;
                Long l = null;
                for (Map.Entry next : entrySet) {
                    if (file == null) {
                        file = (File) next.getKey();
                        l = (Long) next.getValue();
                    } else {
                        Long l2 = (Long) next.getValue();
                        if (l2.longValue() < l.longValue()) {
                            file = (File) next.getKey();
                            l = l2;
                        }
                    }
                }
            }
            if (file == null) {
                return 0;
            }
            long calculateSize = calculateSize(file);
            if (file.delete()) {
                this.lastUsageDates.remove(file);
            }
            return calculateSize;
        }

        private ACacheManager(File file, long j, int i) {
            this.lastUsageDates = Collections.synchronizedMap(new HashMap());
            this.cacheDir = file;
            this.sizeLimit = j;
            this.countLimit = i;
            this.cacheSize = new AtomicLong();
            this.cacheCount = new AtomicInteger();
            calculateCacheSizeAndCacheCount();
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.thirdparties.LocalCache$Utils */
    public static class C116405Utils {
        private static final char mSeparator = ' ';

        private C116405Utils() {
        }

        /* access modifiers changed from: private */
        public static byte[] Bitmap2Bytes(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* access modifiers changed from: private */
        public static Bitmap Bytes2Bimap(byte[] bArr) {
            int length = bArr.length;
            return null;
        }

        /* access modifiers changed from: private */
        public static Drawable bitmap2Drawable(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            return new BitmapDrawable(bitmap);
        }

        /* access modifiers changed from: private */
        public static String clearDateInfo(String str) {
            return (str == null || !hasDateInfo(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        private static byte[] copyOfRange(byte[] bArr, int i, int i2) {
            int i3 = i2 - i;
            if (i3 >= 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
                return bArr2;
            }
            throw new IllegalArgumentException(i + " > " + i2);
        }

        private static String createDateInfo(int i) {
            String str = System.currentTimeMillis() + "";
            while (str.length() < 13) {
                str = "0" + str;
            }
            return str + "-" + i + mSeparator;
        }

        /* access modifiers changed from: private */
        public static Bitmap drawable2Bitmap(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        }

        private static String[] getDateInfoFromDate(byte[] bArr) {
            if (!hasDateInfo(bArr)) {
                return null;
            }
            return new String[]{new String(copyOfRange(bArr, 0, 13)), new String(copyOfRange(bArr, 14, indexOf(bArr, mSeparator)))};
        }

        private static boolean hasDateInfo(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && indexOf(bArr, mSeparator) > 14;
        }

        private static int indexOf(byte[] bArr, char c) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == c) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: private */
        public static boolean isDue(String str) {
            return isDue(str.getBytes());
        }

        /* access modifiers changed from: private */
        public static byte[] newByteArrayWithDateInfo(int i, byte[] bArr) {
            byte[] bytes = createDateInfo(i).getBytes();
            byte[] bArr2 = new byte[(bytes.length + bArr.length)];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* access modifiers changed from: private */
        public static String newStringWithDateInfo(int i, String str) {
            return createDateInfo(i) + str;
        }

        /* access modifiers changed from: private */
        public static boolean isDue(byte[] bArr) {
            String[] dateInfoFromDate = getDateInfoFromDate(bArr);
            if (dateInfoFromDate != null && dateInfoFromDate.length == 2) {
                String str = dateInfoFromDate[0];
                while (str.startsWith("0")) {
                    str = str.substring(1, str.length());
                }
                try {
                    if (System.currentTimeMillis() > Long.valueOf(str).longValue() + (Long.valueOf(dateInfoFromDate[1]).longValue() * 1000)) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public static byte[] clearDateInfo(byte[] bArr) {
            return hasDateInfo(bArr) ? copyOfRange(bArr, indexOf(bArr, mSeparator) + 1, bArr.length) : bArr;
        }
    }

    private LocalCache(File file, long j, int i) {
        if (file.exists() || file.mkdirs()) {
            this.mCache = new ACacheManager(file, j, i);
        } else {
            this.mCache = null;
        }
    }

    public static LocalCache get(Context context) {
        return get(context, "LocalCache");
    }

    private static String myPid() {
        return "_" + Process.myPid();
    }

    public void clear() {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager != null) {
            aCacheManager.clear();
        }
    }

    public File file(String str) {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return null;
        }
        File access$100 = aCacheManager.newFile(str);
        if (access$100.exists()) {
            return access$100;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0044 A[SYNTHETIC, Splitter:B:31:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004b A[SYNTHETIC, Splitter:B:39:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getAsBinary(java.lang.String r6) {
        /*
            r5 = this;
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r0 = r5.mCache
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.io.File r0 = r0.get(r6)     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            if (r2 != 0) goto L_0x0011
            return r1
        L_0x0011:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r3 = "r"
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            long r3 = r2.length()     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            int r0 = (int) r3     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            int r3 = r2.read(r0)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r3 <= 0) goto L_0x003a
            boolean r3 = com.tencent.thumbplayer.core.thirdparties.LocalCache.C116405Utils.isDue((byte[]) r0)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r3 != 0) goto L_0x0033
            byte[] r6 = com.tencent.thumbplayer.core.thirdparties.LocalCache.C116405Utils.clearDateInfo((byte[]) r0)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            r2.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r6
        L_0x0033:
            r2.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r5.remove(r6)
            return r1
        L_0x003a:
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            return r1
        L_0x003e:
            r6 = move-exception
            r1 = r2
            goto L_0x0042
        L_0x0041:
            r6 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r6
        L_0x0048:
            r2 = r1
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.thirdparties.LocalCache.getAsBinary(java.lang.String):byte[]");
    }

    public Bitmap getAsBitmap(String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return C116405Utils.Bytes2Bimap(getAsBinary(str));
    }

    public Drawable getAsDrawable(String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return C116405Utils.bitmap2Drawable(C116405Utils.Bytes2Bimap(getAsBinary(str)));
    }

    public JSONArray getAsJSONArray(String str) {
        try {
            return new JSONArray(getAsString(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject getAsJSONObject(String str) {
        try {
            return new JSONObject(getAsString(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|10|11|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002b A[SYNTHETIC, Splitter:B:22:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0032 A[SYNTHETIC, Splitter:B:26:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x003a A[SYNTHETIC, Splitter:B:34:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0041 A[SYNTHETIC, Splitter:B:38:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAsObject(java.lang.String r4) {
        /*
            r3 = this;
            byte[] r4 = r3.getAsBinary(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0044
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0036, all -> 0x0025 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0036, all -> 0x0025 }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0023, all -> 0x001e }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0023, all -> 0x001e }
            java.lang.Object r0 = r4.readObject()     // Catch:{ Exception -> 0x0038, all -> 0x001c }
            r1.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            r4.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r0
        L_0x001c:
            r0 = move-exception
            goto L_0x0029
        L_0x001e:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L_0x0029
        L_0x0023:
            r4 = r0
            goto L_0x0038
        L_0x0025:
            r4 = move-exception
            r1 = r0
            r0 = r4
            r4 = r1
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r4 == 0) goto L_0x0035
            r4.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r0
        L_0x0036:
            r4 = r0
            r1 = r4
        L_0x0038:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            if (r4 == 0) goto L_0x0044
            r4.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.thirdparties.LocalCache.getAsObject(java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A[SYNTHETIC, Splitter:B:29:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0055 A[SYNTHETIC, Splitter:B:37:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getAsString(java.lang.String r6) {
        /*
            r5 = this;
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r0 = r5.mCache
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.io.File r0 = r0.get(r6)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x0011
            return r1
        L_0x0011:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004b }
            java.lang.String r0 = ""
        L_0x001d:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            if (r3 == 0) goto L_0x0033
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            r4.<init>()     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            r4.append(r0)     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            r4.append(r3)     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            goto L_0x001d
        L_0x0033:
            boolean r3 = com.tencent.thumbplayer.core.thirdparties.LocalCache.C116405Utils.isDue((java.lang.String) r0)     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            if (r3 != 0) goto L_0x0041
            java.lang.String r6 = com.tencent.thumbplayer.core.thirdparties.LocalCache.C116405Utils.clearDateInfo((java.lang.String) r0)     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            r2.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r6
        L_0x0041:
            r2.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r5.remove(r6)
            return r1
        L_0x0048:
            r6 = move-exception
            r1 = r2
            goto L_0x004c
        L_0x004b:
            r6 = move-exception
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r6
        L_0x0052:
            r2 = r1
        L_0x0053:
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.thirdparties.LocalCache.getAsString(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|29|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028 A[SYNTHETIC, Splitter:B:18:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0036 A[SYNTHETIC, Splitter:B:27:0x0036] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0039=Splitter:B:29:0x0039, B:10:0x001c=Splitter:B:10:0x001c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void put(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r0 = r4.mCache
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.io.File r5 = r0.newFile(r5)
            r0 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0034, all -> 0x0025 }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x0034, all -> 0x0025 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0034, all -> 0x0025 }
            r3 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0034, all -> 0x0025 }
            r1.write(r6)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r1.flush()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003c
        L_0x0020:
            r6 = move-exception
            r0 = r1
            goto L_0x0026
        L_0x0023:
            r0 = r1
            goto L_0x0034
        L_0x0025:
            r6 = move-exception
        L_0x0026:
            if (r0 == 0) goto L_0x002e
            r0.flush()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            r0.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r0 = r4.mCache
            r0.put(r5)
            throw r6
        L_0x0034:
            if (r0 == 0) goto L_0x003c
            r0.flush()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r0.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r6 = r4.mCache
            r6.put(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.thirdparties.LocalCache.put(java.lang.String, java.lang.String):void");
    }

    public boolean remove(String str) {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return false;
        }
        return aCacheManager.remove(str);
    }

    public static LocalCache get(Context context, String str) {
        return get(new File(context.getCacheDir(), str), 50000000, Integer.MAX_VALUE);
    }

    public static LocalCache get(File file) {
        return get(file, 50000000, Integer.MAX_VALUE);
    }

    public static LocalCache get(Context context, long j, int i) {
        return get(new File(context.getCacheDir(), "LocalCache"), j, i);
    }

    public static LocalCache get(File file, long j, int i) {
        LocalCache localCache;
        try {
            Map<String, LocalCache> map = mInstanceMap;
            localCache = map.get(file.getAbsoluteFile() + myPid());
        } catch (Exception unused) {
            localCache = null;
        }
        if (localCache != null) {
            return localCache;
        }
        try {
            LocalCache localCache2 = new LocalCache(file, j, i);
            try {
                Map<String, LocalCache> map2 = mInstanceMap;
                map2.put(file.getAbsolutePath() + myPid(), localCache2);
            } catch (Throwable unused2) {
            }
            return localCache2;
        } catch (Throwable unused3) {
            return localCache;
        }
    }

    public void put(String str, String str2, int i) {
        put(str, C116405Utils.newStringWithDateInfo(i, str2));
    }

    public void put(String str, JSONObject jSONObject) {
        put(str, jSONObject.toString());
    }

    public void put(String str, JSONObject jSONObject, int i) {
        put(str, jSONObject.toString(), i);
    }

    public void put(String str, JSONArray jSONArray) {
        put(str, jSONArray.toString());
    }

    public void put(String str, JSONArray jSONArray, int i) {
        put(str, jSONArray.toString(), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[SYNTHETIC, Splitter:B:16:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002f A[SYNTHETIC, Splitter:B:23:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void put(java.lang.String r3, byte[] r4) {
        /*
            r2 = this;
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r0 = r2.mCache
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.io.File r3 = r0.newFile(r3)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002d, all -> 0x001e }
            r1.<init>(r3)     // Catch:{ Exception -> 0x002d, all -> 0x001e }
            r1.write(r4)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r1.flush()     // Catch:{ IOException -> 0x0035 }
            r1.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0035
        L_0x0019:
            r4 = move-exception
            r0 = r1
            goto L_0x001f
        L_0x001c:
            r0 = r1
            goto L_0x002d
        L_0x001e:
            r4 = move-exception
        L_0x001f:
            if (r0 == 0) goto L_0x0027
            r0.flush()     // Catch:{ IOException -> 0x0027 }
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r0 = r2.mCache
            r0.put(r3)
            throw r4
        L_0x002d:
            if (r0 == 0) goto L_0x0035
            r0.flush()     // Catch:{ IOException -> 0x0035 }
            r0.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            com.tencent.thumbplayer.core.thirdparties.LocalCache$ACacheManager r4 = r2.mCache
            r4.put(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.thirdparties.LocalCache.put(java.lang.String, byte[]):void");
    }

    public void put(String str, byte[] bArr, int i) {
        put(str, C116405Utils.newByteArrayWithDateInfo(i, bArr));
    }

    public void put(String str, Serializable serializable) {
        put(str, serializable, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void put(java.lang.String r4, java.io.Serializable r5, int r6) {
        /*
            r3 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x002a, all -> 0x0024 }
            r1.<init>()     // Catch:{ Exception -> 0x002a, all -> 0x0024 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x002a, all -> 0x0024 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x002a, all -> 0x0024 }
            r2.writeObject(r5)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            byte[] r5 = r1.toByteArray()     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r0 = -1
            if (r6 == r0) goto L_0x0019
            r3.put((java.lang.String) r4, (byte[]) r5, (int) r6)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            goto L_0x001c
        L_0x0019:
            r3.put((java.lang.String) r4, (byte[]) r5)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
        L_0x001c:
            r2.close()     // Catch:{ all -> 0x002d }
            goto L_0x002d
        L_0x0020:
            r0 = r2
            goto L_0x0024
        L_0x0022:
            r0 = r2
            goto L_0x002a
        L_0x0024:
            if (r0 == 0) goto L_0x002d
        L_0x0026:
            r0.close()     // Catch:{ all -> 0x002d }
            goto L_0x002d
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            goto L_0x0026
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.thirdparties.LocalCache.put(java.lang.String, java.io.Serializable, int):void");
    }

    public void put(String str, Bitmap bitmap) {
        put(str, C116405Utils.Bitmap2Bytes(bitmap));
    }

    public void put(String str, Bitmap bitmap, int i) {
        put(str, C116405Utils.Bitmap2Bytes(bitmap), i);
    }

    public void put(String str, Drawable drawable) {
        put(str, C116405Utils.drawable2Bitmap(drawable));
    }

    public void put(String str, Drawable drawable, int i) {
        put(str, C116405Utils.drawable2Bitmap(drawable), i);
    }
}
