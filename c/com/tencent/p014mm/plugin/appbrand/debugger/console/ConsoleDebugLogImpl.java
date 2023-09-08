package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Objects;
import java.util.concurrent.Future;
import kotlin.Metadata;
import x20.C15618a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl */
public final class ConsoleDebugLogImpl extends C81729y {

    /* renamed from: a */
    public final String f239794a;

    /* renamed from: b */
    public int f239795b = 2;

    /* renamed from: c */
    public final C81702a f239796c = new C81702a();

    /* renamed from: d */
    public long f239797d = -1;

    /* renamed from: e */
    public Future<?> f239798e;

    /* renamed from: f */
    public final C81704c f239799f = new C81704c(this);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/debugger/console/ConsoleDebugLogImpl$LogInfo;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo */
    public static final class LogInfo implements Parcelable {
        public static final Parcelable.Creator<LogInfo> CREATOR = new C81701a();

        /* renamed from: d */
        public final int f239800d;

        /* renamed from: e */
        public final String f239801e;

        /* renamed from: f */
        public final int f239802f;

        /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo$a */
        public static final class C81701a implements Parcelable.Creator<LogInfo> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new LogInfo(parcel.readInt(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new LogInfo[i];
            }
        }

        public LogInfo(int i, String str) {
            C87412m.m108594g(str, "logLine");
            this.f239800d = i;
            this.f239801e = str;
            this.f239802f = (str.length() * 2) + 4;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "LogInfo(priority=" + this.f239800d + ", logLine='" + this.f239801e + "')";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f239800d);
            parcel.writeString(this.f239801e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$a */
    public static final class C81702a {

        /* renamed from: a */
        public final LogInfo[] f239803a = new LogInfo[100];

        /* renamed from: b */
        public int f239804b = -1;

        /* renamed from: c */
        public int f239805c;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$b */
    public static final class C81703b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ConsoleDebugLogImpl f239806d;

        /* renamed from: e */
        public final /* synthetic */ int f239807e;

        /* renamed from: f */
        public final /* synthetic */ String f239808f;

        public C81703b(ConsoleDebugLogImpl consoleDebugLogImpl, int i, String str) {
            this.f239806d = consoleDebugLogImpl;
            this.f239807e = i;
            this.f239808f = str;
        }

        public final void run() {
            C81702a aVar = this.f239806d.f239796c;
            LogInfo logInfo = new LogInfo(this.f239807e, this.f239808f);
            aVar.getClass();
            int i = (aVar.f239804b + 1) % 100;
            int i2 = aVar.f239805c + logInfo.f239802f;
            aVar.f239803a[i] = logInfo;
            aVar.f239804b = i;
            aVar.f239805c = i2;
            if (true == (99 <= i || 524288 <= i2)) {
                ConsoleDebugLogImpl.m100258a(this.f239806d);
            }
            this.f239806d.f239797d = SystemClock.elapsedRealtime() + 200;
            ConsoleDebugLogImpl consoleDebugLogImpl = this.f239806d;
            if (consoleDebugLogImpl.f239798e == null) {
                C119179t tVar = C119157j.f356862d;
                C81704c cVar = consoleDebugLogImpl.f239799f;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                Objects.requireNonNull(cVar);
                consoleDebugLogImpl.f239798e = jVar.mo183886q(cVar, 200, (String) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$c */
    public static final class C81704c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ConsoleDebugLogImpl f239809d;

        public C81704c(ConsoleDebugLogImpl consoleDebugLogImpl) {
            this.f239809d = consoleDebugLogImpl;
        }

        public void run() {
            long elapsedRealtime = this.f239809d.f239797d - SystemClock.elapsedRealtime();
            Log.m105924i("MicroMsg.AppBrand.ConsoleDebugLogImpl", "run#flushLogBufferTask, remainDelayTime: " + elapsedRealtime);
            if (elapsedRealtime <= 0) {
                ConsoleDebugLogImpl.m100258a(this.f239809d);
                return;
            }
            ConsoleDebugLogImpl consoleDebugLogImpl = this.f239809d;
            C119157j jVar = (C119157j) C119157j.f356862d;
            jVar.getClass();
            consoleDebugLogImpl.f239798e = jVar.mo183886q(this, elapsedRealtime, (String) null);
        }
    }

    public ConsoleDebugLogImpl(String str) {
        C87412m.m108594g(str, "simpleProcessName");
        this.f239794a = str;
    }

    /* renamed from: a */
    public static final void m100258a(ConsoleDebugLogImpl consoleDebugLogImpl) {
        consoleDebugLogImpl.getClass();
        Log.m105924i("MicroMsg.AppBrand.ConsoleDebugLogImpl", "flushLogBuffer");
        Bundle bundle = new Bundle();
        bundle.setClassLoader(LogInfo.class.getClassLoader());
        C81702a aVar = consoleDebugLogImpl.f239796c;
        int i = aVar.f239804b + 1;
        LogInfo[] logInfoArr = new LogInfo[i];
        for (int i2 = 0; i2 < i; i2++) {
            LogInfo logInfo = aVar.f239803a[i2];
            C87412m.m108591d(logInfo);
            logInfoArr[i2] = logInfo;
        }
        aVar.f239804b = -1;
        aVar.f239805c = 0;
        bundle.putParcelableArray("BatchLogInfo", (Parcelable[]) logInfoArr);
        C15618a.m14628d(bundle, C81706b.f239811a);
        consoleDebugLogImpl.f239798e = null;
    }

    /* renamed from: b */
    public final void mo114059b(int i, String str) {
        ((C119157j) C119157j.f356862d).mo183885p(new C81703b(this, i, str), "ConsoleDebugLog");
    }

    public void logD(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        if (str4 != null && 3 >= this.f239795b) {
            mo114059b(3, '[' + this.f239794a + "] " + str4);
        }
    }

    public void logE(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        if (str4 != null && 6 >= this.f239795b) {
            mo114059b(6, '[' + this.f239794a + ']' + str4);
        }
    }

    public void logI(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        if (str4 != null && 4 >= this.f239795b) {
            mo114059b(4, '[' + this.f239794a + "] " + str4);
        }
    }

    public void logV(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        if (str4 != null && 2 >= this.f239795b) {
            mo114059b(2, '[' + this.f239794a + "] " + str4);
        }
    }

    public void logW(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        if (str4 != null && 5 >= this.f239795b) {
            mo114059b(5, '[' + this.f239794a + "] " + str4);
        }
    }
}
