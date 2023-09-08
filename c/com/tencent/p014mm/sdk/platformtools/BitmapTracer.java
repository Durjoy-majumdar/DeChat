package com.tencent.p014mm.sdk.platformtools;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Debug;
import android.os.Message;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.tencent.mm.sdk.platformtools.BitmapTracer */
public class BitmapTracer {
    private static final boolean RECORD_STACK_TRACE = true;
    private static final String TAG = "MicroMsg.BitmapTracer";
    private static final WeakHashMap<Bitmap, BitmapTraceInfo> bitmapTraces = new WeakHashMap<>();
    /* access modifiers changed from: private */
    public static boolean checkingScheduled;
    private static final MMHandler handler;

    /* renamed from: com.tencent.mm.sdk.platformtools.BitmapTracer$BitmapTraceInfo */
    public static final class BitmapTraceInfo {
        public final long acquiredTime = System.currentTimeMillis();
        public final BitmapFactory.Options options;
        public final String source;
        public final StackTraceElement[] stack;

        public BitmapTraceInfo(String str, BitmapFactory.Options options2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            this.stack = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, 4, stackTrace.length);
            this.source = str;
            this.options = options2;
        }
    }

    static {
        if (!WeChatEnvironment.isMonkeyEnv()) {
            handler = null;
            MTimerHandler mTimerHandler = new MTimerHandler("BitmapBriefTracer", (MTimerHandler.CallBack) new MTimerHandler.CallBack() {
                public boolean onTimerExpired() {
                    BitmapTracer.briefDump();
                    return true;
                }
            }, true);
            mTimerHandler.startTimer(3600000);
            mTimerHandler.setLogging(false);
        } else {
            handler = new MMHandler("BitmapTracer", (MMHandler.Callback) new MMHandler.Callback() {
                public long lastGCTime = 0;
                public boolean traceDumped = false;

                public boolean handleMessage(Message message) {
                    PrintWriter printWriter;
                    Exception e;
                    boolean unused = BitmapTracer.checkingScheduled = false;
                    Runtime runtime = Runtime.getRuntime();
                    long j = runtime.totalMemory();
                    long freeMemory = runtime.freeMemory();
                    long j2 = j - freeMemory;
                    Log.m105925i(BitmapTracer.TAG, "Memory level: %s (+%s) / %s", BitmapTracer.humanReadableSize(j2), BitmapTracer.humanReadableSize(freeMemory), BitmapTracer.humanReadableSize(runtime.maxMemory()));
                    if (!this.traceDumped && j2 > 209715200) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - this.lastGCTime > ApkDownloadManager.INTERVAL) {
                            System.gc();
                            this.lastGCTime = currentTimeMillis;
                            return true;
                        }
                        PrintWriter printWriter2 = null;
                        try {
                            printWriter = new PrintWriter(new GZIPOutputStream(C86013q1.m106429K(C112760b.m154195C() + "BitmapTraces.txt.gz", false)));
                            try {
                                BitmapTracer.printStatistics(printWriter, 0, -1);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            Exception exc = e3;
                            printWriter = null;
                            e = exc;
                            try {
                                Log.printErrStackTrace(BitmapTracer.TAG, e, "", new Object[0]);
                                Util.qualityClose(printWriter);
                                Debug.dumpHprofData(C112760b.m154195C() + "Memory.hprof");
                                this.traceDumped = true;
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                printWriter2 = printWriter;
                                Util.qualityClose(printWriter2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Util.qualityClose(printWriter2);
                            throw th;
                        }
                        Util.qualityClose(printWriter);
                        try {
                            Debug.dumpHprofData(C112760b.m154195C() + "Memory.hprof");
                        } catch (Exception e4) {
                            Log.printErrStackTrace(BitmapTracer.TAG, e4, "", new Object[0]);
                        }
                        this.traceDumped = true;
                    }
                    return true;
                }
            });
        }
        MMUncaughtExceptionHandler.addOnUncaughtExceptionListener(new MMUncaughtExceptionHandler.IOnUncaughtExceptionListener() {
            public void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
                if (th instanceof OutOfMemoryError) {
                    BitmapTracer.dumpReadableLog(1048576, -1);
                }
            }
        });
    }

    public static void briefDump() {
        dumpReadableLog(2097152, 3);
    }

    /* access modifiers changed from: private */
    public static void dumpReadableLog(long j, int i) {
        printStatistics(new PrintWriter(new Writer() {

            /* renamed from: sw */
            private StringWriter f249796sw;

            public void close() {
                flush();
            }

            public void flush() {
                StringWriter stringWriter = this.f249796sw;
                if (stringWriter != null) {
                    String stringWriter2 = stringWriter.toString();
                    this.f249796sw = null;
                    Log.m105928w(BitmapTracer.TAG, stringWriter2);
                }
            }

            public void write(char[] cArr, int i, int i2) {
                if (this.f249796sw == null) {
                    this.f249796sw = new StringWriter();
                }
                this.f249796sw.write(cArr, i, i2);
            }
        }, false), j, i);
    }

    /* access modifiers changed from: private */
    public static String humanReadableSize(long j) {
        if (j >= 1073741824) {
            return String.format("%.2f GB", new Object[]{Double.valueOf(((double) j) / 1.073741824E9d)});
        } else if (j >= 1048576) {
            return String.format("%.2f MB", new Object[]{Double.valueOf(((double) j) / 1048576.0d)});
        } else if (j >= 1024) {
            return String.format("%.2f kB", new Object[]{Double.valueOf(((double) j) / 1024.0d)});
        } else {
            return String.format("%d bytes", new Object[]{Long.valueOf(j)});
        }
    }

    private static void printAllocationStack(PrintWriter printWriter, Bitmap bitmap, BitmapTraceInfo bitmapTraceInfo, long j) {
        Bitmap.Config config = bitmap.getConfig();
        Object[] objArr = new Object[4];
        objArr[0] = humanReadableSize((long) bitmap.getAllocationByteCount());
        objArr[1] = Integer.valueOf(bitmap.getWidth());
        objArr[2] = Integer.valueOf(bitmap.getHeight());
        objArr[3] = config == null ? "UNKNOWN" : config.name();
        printWriter.format("\nSize: %s (%d x %d, %s)\n", objArr);
        printWriter.append("Source: ").println(bitmapTraceInfo.source);
        printWriter.format("Acquired: %d seconds ago\n", new Object[]{Long.valueOf((j - bitmapTraceInfo.acquiredTime) / 1000)});
        printWriter.print("Stack:\n");
        printStack(bitmapTraceInfo.stack, printWriter);
        printWriter.print("=======================================================\n");
        printWriter.flush();
    }

    private static void printStack(StackTraceElement[] stackTraceElementArr, PrintWriter printWriter) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            printWriter.append("  at ").println(stackTraceElement.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.tencent.mm.sdk.platformtools.BitmapTracer$BitmapTraceInfo} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStatistics(java.io.PrintWriter r24, long r25, int r27) {
        /*
            r0 = r24
            r1 = r25
            r3 = r27
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0020
            java.lang.String r8 = "Statistics for all Bitmaps larger than %.2f MB:\n"
            java.lang.Object[] r9 = new java.lang.Object[r7]
            double r10 = (double) r1
            r12 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r10 = r10 / r12
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r9[r6] = r10
            r0.format(r8, r9)
            goto L_0x0025
        L_0x0020:
            java.lang.String r8 = "Statistics for all Bitmaps alive:\n"
            r0.print(r8)
        L_0x0025:
            r24.flush()
            long r8 = java.lang.System.currentTimeMillis()
            java.util.WeakHashMap<android.graphics.Bitmap, com.tencent.mm.sdk.platformtools.BitmapTracer$BitmapTraceInfo> r10 = bitmapTraces
            monitor-enter(r10)
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0109 }
            r11.<init>()     // Catch:{ all -> 0x0109 }
            java.util.Set r12 = r10.entrySet()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r11.addAll(r12)     // Catch:{ ConcurrentModificationException -> 0x00fc }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r12 = 0
            r14 = r12
            r15 = r14
            r7 = 0
            r16 = 0
            r12 = r4
        L_0x0046:
            boolean r17 = r11.hasNext()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            if (r17 == 0) goto L_0x00bd
            java.lang.Object r17 = r11.next()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17     // Catch:{ ConcurrentModificationException -> 0x00fc }
            java.lang.Object r18 = r17.getKey()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r6 = r18
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ ConcurrentModificationException -> 0x00fc }
            java.lang.Object r17 = r17.getValue()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r18 = r11
            r11 = r17
            com.tencent.mm.sdk.platformtools.BitmapTracer$BitmapTraceInfo r11 = (com.tencent.p014mm.sdk.platformtools.BitmapTracer.BitmapTraceInfo) r11     // Catch:{ ConcurrentModificationException -> 0x00fc }
            if (r6 != 0) goto L_0x006a
        L_0x0066:
            r11 = r18
            r6 = 0
            goto L_0x0046
        L_0x006a:
            boolean r17 = r6.isRecycled()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            if (r17 == 0) goto L_0x0073
            int r7 = r7 + 1
            goto L_0x0066
        L_0x0073:
            r17 = r7
            int r7 = r6.getAllocationByteCount()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r19 = r6
            long r6 = (long) r7     // Catch:{ ConcurrentModificationException -> 0x00fc }
            long r4 = r4 + r6
            r20 = r4
            int r4 = r16 + 1
            if (r14 == 0) goto L_0x0096
            int r5 = r14.getAllocationByteCount()     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r22 = r14
            r23 = r15
            long r14 = (long) r5     // Catch:{ ConcurrentModificationException -> 0x00fc }
            int r5 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r14 = r22
            r15 = r23
            goto L_0x0099
        L_0x0096:
            r15 = r11
            r14 = r19
        L_0x0099:
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x00b6
            r5 = -1
            if (r3 == r5) goto L_0x00a5
            long r5 = (long) r3     // Catch:{ ConcurrentModificationException -> 0x00fc }
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b6
        L_0x00a5:
            r5 = 1
            long r12 = r12 + r5
            r5 = 35
            java.io.PrintWriter r5 = r0.append(r5)     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r5.println(r4)     // Catch:{ ConcurrentModificationException -> 0x00fc }
            r5 = r19
            printAllocationStack(r0, r5, r11, r8)     // Catch:{ ConcurrentModificationException -> 0x00fc }
        L_0x00b6:
            r16 = r4
            r7 = r17
            r4 = r20
            goto L_0x0066
        L_0x00bd:
            r17 = r7
            r22 = r14
            r23 = r15
            monitor-exit(r10)     // Catch:{ all -> 0x0109 }
            if (r22 == 0) goto L_0x00d4
            if (r23 == 0) goto L_0x00d4
            java.lang.String r1 = "# Biggest Bitmap"
            r0.append(r1)
            r14 = r22
            r15 = r23
            printAllocationStack(r0, r14, r15, r8)
        L_0x00d4:
            java.lang.String r1 = "\n\nLiving Bitmaps: %d, %s\n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r6 = 0
            r2[r6] = r3
            java.lang.String r3 = humanReadableSize(r4)
            r4 = 1
            r2[r4] = r3
            r0.format(r1, r2)
            java.lang.String r1 = "Recycled Bitmaps: "
            java.io.PrintWriter r1 = r0.append(r1)
            r7 = r17
            r1.println(r7)
            r24.flush()
            r24.close()
            return
        L_0x00fc:
            java.lang.String r1 = "ConcurrentModificationException occur."
            r0.print(r1)     // Catch:{ all -> 0x0109 }
            r24.flush()     // Catch:{ all -> 0x0109 }
            r24.close()     // Catch:{ all -> 0x0109 }
            monitor-exit(r10)     // Catch:{ all -> 0x0109 }
            return
        L_0x0109:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0109 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapTracer.printStatistics(java.io.PrintWriter, long, int):void");
    }

    public static Bitmap trace(Bitmap bitmap) {
        return trace(bitmap, (String) null, (BitmapFactory.Options) null);
    }

    public static Bitmap trace(Bitmap bitmap, String str) {
        return trace(bitmap, str, (BitmapFactory.Options) null);
    }

    public static Bitmap trace(Bitmap bitmap, String str, BitmapFactory.Options options) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getAllocationByteCount() < 1048576 && !WeChatEnvironment.isMonkeyEnv()) {
            return bitmap;
        }
        BitmapTraceInfo bitmapTraceInfo = new BitmapTraceInfo(str, options);
        WeakHashMap<Bitmap, BitmapTraceInfo> weakHashMap = bitmapTraces;
        synchronized (weakHashMap) {
            weakHashMap.put(bitmap, bitmapTraceInfo);
            MMHandler mMHandler = handler;
            if (mMHandler != null && !checkingScheduled) {
                mMHandler.sendEmptyMessageDelayed(0, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                checkingScheduled = true;
            }
        }
        return bitmap;
    }
}
