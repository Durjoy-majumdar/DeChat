package com.tencent.skyline;

import com.tencent.skyline.jni.SkylineLibraryLoader;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002H J\t\u0010\u0004\u001a\u00020\u0002H J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H J\u0019\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H J\t\u0010\u000b\u001a\u00020\u0002H J\u0019\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H J\t\u0010\r\u001a\u00020\u0002H J\u0019\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H J\u0019\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H J\u0019\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0002J\u0016\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010R\u0014\u0010\u001e\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo182094d2 = {"Lcom/tencent/skyline/TraceLogic;", "", "Lrx3/b0;", "nativeStartTrace", "nativeFlushTrace", "", "filePath", "nativeStopTrace", "category", "name", "nativeTraceBegin", "nativeTraceEnd", "nativeTraceDebugBegin", "nativeTraceDebugEnd", "nativeTraceInstant", "nativeTraceDebugInstant", "", "isolatePtr", "contextPtr", "nativeInitTraceBinding", "startTrace", "flushTrace", "stopTrace", "traceBegin", "traceEnd", "traceDebugBegin", "traceDebugEnd", "traceInstant", "traceDebugInstant", "initTraceBinding", "TAG", "Ljava/lang/String;", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class TraceLogic {
    public static final TraceLogic INSTANCE = new TraceLogic();
    private static final String TAG = "Skyline.TraceLogic";

    static {
        SkylineLibraryLoader.load("trace");
    }

    private TraceLogic() {
    }

    private final native void nativeFlushTrace();

    private final native void nativeInitTraceBinding(long j, long j2);

    private final native void nativeStartTrace();

    private final native void nativeStopTrace(String str);

    private final native void nativeTraceBegin(String str, String str2);

    private final native void nativeTraceDebugBegin(String str, String str2);

    private final native void nativeTraceDebugEnd();

    private final native void nativeTraceDebugInstant(String str, String str2);

    private final native void nativeTraceEnd();

    private final native void nativeTraceInstant(String str, String str2);

    public final void flushTrace() {
        nativeFlushTrace();
    }

    public final void initTraceBinding(long j, long j2) {
        nativeInitTraceBinding(j, j2);
    }

    public final void startTrace() {
        nativeStartTrace();
    }

    public final void stopTrace(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        nativeStopTrace(str);
    }

    public final void traceBegin(String str, String str2) {
        C87412m.m108594g(str, "category");
        C87412m.m108594g(str2, "name");
        nativeTraceBegin(str, str2);
    }

    public final void traceDebugBegin(String str, String str2) {
        C87412m.m108594g(str, "category");
        C87412m.m108594g(str2, "name");
        nativeTraceDebugBegin(str, str2);
    }

    public final void traceDebugEnd() {
        nativeTraceDebugEnd();
    }

    public final void traceDebugInstant(String str, String str2) {
        C87412m.m108594g(str, "category");
        C87412m.m108594g(str2, "name");
        nativeTraceDebugInstant(str, str2);
    }

    public final void traceEnd() {
        nativeTraceEnd();
    }

    public final void traceInstant(String str, String str2) {
        C87412m.m108594g(str, "category");
        C87412m.m108594g(str2, "name");
        nativeTraceInstant(str, str2);
    }
}
