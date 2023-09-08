package xn1;

import android.os.Handler;
import android.view.FrameMetrics;
import android.view.Window;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C61926c;
import org.json.JSONObject;
import p723vf.C90773a;
import rs1.C101459n1;
import rx3.C13598b0;
import xn1.C66375g;

/* renamed from: xn1.a */
public final class C118888a {

    /* renamed from: a */
    public static final C118888a f356146a = new C118888a();

    /* renamed from: b */
    public static final ConcurrentLinkedDeque<C118889a> f356147b = new ConcurrentLinkedDeque<>();

    /* renamed from: c */
    public static int f356148c = C90773a.m113839e(MMApplicationContext.getContext()).f260682d;

    /* renamed from: xn1.a$a */
    public static final class C118889a {

        /* renamed from: a */
        public final String f356149a;

        /* renamed from: b */
        public final int f356150b;

        /* renamed from: c */
        public long f356151c;

        /* renamed from: d */
        public long f356152d;

        /* renamed from: e */
        public long f356153e;

        /* renamed from: f */
        public long f356154f;

        /* renamed from: g */
        public ArrayList<Integer> f356155g = new ArrayList<>();

        /* renamed from: h */
        public int f356156h;

        /* renamed from: i */
        public long f356157i;

        public C118889a(String str, int i) {
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f356149a = str;
            this.f356150b = i;
        }

        /* renamed from: a */
        public final int mo183587a() {
            long b = mo183588b();
            int b2 = C60641c.m70921b(b > 0 ? (((float) this.f356156h) * 1000.0f) / ((float) b) : 0.0f);
            int i = this.f356150b;
            return i > b2 ? b2 : i;
        }

        /* renamed from: b */
        public final long mo183588b() {
            if (this.f356157i == 0) {
                this.f356157i = TimeUnit.NANOSECONDS.toMillis(this.f356153e - this.f356154f);
            }
            return this.f356157i;
        }

        public String toString() {
            int a = mo183587a();
            return "Duration=" + mo183588b() + "ms FPS=" + a + " RefreshRate=" + this.f356150b + " FrameCount=" + this.f356156h + " DropList=" + this.f356155g;
        }
    }

    /* renamed from: xn1.a$b */
    public static final class C118890b implements Window.OnFrameMetricsAvailableListener {

        /* renamed from: a */
        public final Window f356158a;

        /* renamed from: b */
        public final Handler f356159b;

        /* renamed from: c */
        public final int f356160c;

        /* renamed from: d */
        public final long f356161d;

        /* renamed from: e */
        public final C118889a f356162e;

        /* renamed from: f */
        public long f356163f;

        /* renamed from: g */
        public boolean f356164g = (!BuildInfo.DEBUG);

        /* renamed from: h */
        public boolean f356165h;

        public C118890b(String str, Window window, Handler handler) {
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C87412m.m108594g(window, "window");
            C87412m.m108594g(handler, "handler");
            this.f356158a = window;
            this.f356159b = handler;
            int a = C91312b.m114551a(window);
            this.f356160c = 1000 / a;
            this.f356161d = TimeUnit.SECONDS.toNanos(1) / ((long) a);
            this.f356162e = new C118889a(str, a);
        }

        /* renamed from: a */
        public final boolean mo183590a() {
            boolean z;
            C118889a aVar = this.f356162e;
            long j = aVar.f356152d;
            if (aVar.f356151c <= 0) {
                aVar.f356151c = System.nanoTime();
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            this.f356163f = this.f356162e.f356151c;
            this.f356165h = true;
            this.f356158a.addOnFrameMetricsAvailableListener(this, this.f356159b);
            return true;
        }

        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            int millis;
            Object obj;
            C87412m.m108594g(window, "window");
            C87412m.m108594g(frameMetrics, "frameMetrics");
            long metric = frameMetrics.getMetric(10);
            long j = this.f356162e.f356152d;
            if (1 <= j && j < metric) {
                try {
                    Result.Companion companion = Result.Companion;
                    if (this.f356165h) {
                        window.removeOnFrameMetricsAvailableListener(this);
                        this.f356165h = false;
                    }
                    Log.m105924i("Finder.FpsMonitor", "finish frameInfo=" + this.f356162e);
                    if (this.f356162e.f356150b != C91312b.m114551a(window)) {
                        Log.m105928w("Finder.FpsMonitor", "RefreshRate is unstable in this duration.");
                        obj = C13598b0.f38549a;
                    } else {
                        obj = Boolean.valueOf(C118888a.f356147b.add(this.f356162e));
                    }
                    Result.m168114constructorimpl(obj);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m168114constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (!this.f356164g && (millis = ((int) (TimeUnit.NANOSECONDS.toMillis(metric - this.f356163f) / ((long) this.f356160c))) - 1) > 0) {
                    this.f356162e.f356155g.add(Integer.valueOf(millis));
                }
                C118889a aVar = this.f356162e;
                aVar.f356156h++;
                if (aVar.f356154f == 0) {
                    long j2 = aVar.f356151c;
                    if (j2 < metric) {
                        long j3 = this.f356161d;
                        aVar.f356154f = metric - (((metric - j2) / j3) * j3);
                    } else {
                        aVar.f356154f = metric;
                    }
                }
                aVar.f356153e = metric;
                this.f356163f = metric;
            }
        }
    }

    /* renamed from: xn1.a$c */
    public static final class C118891c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66375g.C66376a f356166d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C118889a> f356167e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118891c(C66375g.C66376a aVar, ArrayList<C118889a> arrayList) {
            super(0);
            this.f356166d = aVar;
            this.f356167e = arrayList;
        }

        public Object invoke() {
            boolean z;
            C118888a aVar = C118888a.f356146a;
            C66375g.C66376a aVar2 = this.f356166d;
            ArrayList<C118889a> arrayList = this.f356167e;
            HashMap hashMap = new HashMap();
            for (C118889a aVar3 : arrayList) {
                String str = aVar3.f356149a + '#' + aVar3.f356150b;
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new C118889a(aVar3.f356149a, aVar3.f356150b);
                    hashMap.put(str, obj);
                }
                C118889a aVar4 = (C118889a) obj;
                aVar4.f356157i += aVar3.mo183588b();
                aVar4.f356156h += aVar3.f356156h;
                aVar4.f356155g.addAll(aVar3.f356155g);
            }
            Collection<C118889a> values = hashMap.values();
            C87412m.m108593f(values, "map.values");
            for (C118889a aVar5 : values) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, aVar5.f356149a);
                jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_FPS, aVar5.mo183587a());
                int[] iArr = new int[5];
                int[] iArr2 = new int[5];
                Iterator<Integer> it = aVar5.f356155g.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    int intValue = it.next().intValue();
                    if (intValue >= 42) {
                        iArr[4] = iArr[4] + 1;
                        iArr2[4] = iArr2[4] + intValue;
                    } else if (intValue >= 24) {
                        iArr[3] = iArr[3] + 1;
                        iArr2[3] = iArr2[3] + intValue;
                    } else if (intValue >= 9) {
                        iArr[2] = iArr[2] + 1;
                        iArr2[2] = iArr2[2] + intValue;
                    } else if (intValue >= 2) {
                        iArr[1] = iArr[1] + 1;
                        iArr2[1] = iArr2[1] + intValue;
                    } else {
                        iArr[0] = iArr[0] + 1;
                        int i = iArr2[0];
                        if (intValue < 0) {
                            intValue = 0;
                        }
                        iArr2[0] = i + intValue;
                    }
                }
                int i2 = iArr2[1];
                int i3 = iArr2[2];
                int i4 = iArr2[3];
                int i5 = iArr2[4];
                int i6 = i2 + i3 + i4 + i5;
                float f = 0.0f;
                float f2 = i6 <= 0 ? 0.0f : (((float) i5) * 80.0f) / ((float) i6);
                float f3 = i6 <= 0 ? 0.0f : (((float) i4) * 60.0f) / ((float) i6);
                float f4 = i6 <= 0 ? 0.0f : (((float) i3) * 40.0f) / ((float) i6);
                if (i6 > 0) {
                    f = (((float) i2) * 20.0f) / ((float) i6);
                }
                int i7 = iArr[4] + iArr[3] + iArr[2] + iArr[1] + iArr[0];
                float b = (float) aVar5.mo183588b();
                jSONObject.put(FirebaseAnalytics.C113379b.SCORE, C60641c.m70921b(f2 + f3 + f4 + f));
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(1.0f - (((float) aVar5.f356156h) / (b / (1000.0f / ((float) aVar5.f356150b)))))}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                jSONObject.put("dropRate", format);
                jSONObject.put("frameCnt", aVar5.f356156h);
                jSONObject.put("durationMS", aVar5.mo183588b());
                jSONObject.put("indexCnt", i7);
                jSONObject.put("frozenIndexCnt", iArr[4]);
                jSONObject.put("highIndexCnt", iArr[3]);
                jSONObject.put("middleIndexCnt", iArr[2]);
                jSONObject.put("normalIndexCnt", iArr[1]);
                jSONObject.put("bestIndexCnt", iArr[0]);
                jSONObject.put("refreshRate", aVar5.f356150b);
                jSONObject.put("deviceLevel", C118888a.f356148c);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("batteryPercentage", C101459n1.f297133e);
                jSONObject2.put("isPowerSaveMode", C101459n1.f297134f);
                jSONObject2.put("isLowBattery", C101459n1.f297135g);
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("battery", jSONObject2);
                if (C101459n1.f297135g || C101459n1.f297134f || C101459n1.f297133e < 30) {
                    z = false;
                }
                jSONObject.put("isBatteryEnough", z);
                aVar2.mo90471a(aVar5.f356149a, jSONObject);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo183586a(C66375g.C66376a aVar) {
        C87412m.m108594g(aVar, "reporter");
        ConcurrentLinkedDeque<C118889a> concurrentLinkedDeque = f356147b;
        if (!concurrentLinkedDeque.isEmpty()) {
            ArrayList arrayList = new ArrayList(concurrentLinkedDeque);
            concurrentLinkedDeque.clear();
            C61926c.m72661F("Finder.FpsMonitor", new C118891c(aVar, arrayList));
        }
    }
}
