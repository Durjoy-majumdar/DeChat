package kn0;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import in0.C21108a;
import in0.C21109f;
import in0.C87760d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mn0.C21518b;
import mn0.C21522d;
import p210o.C11323a;
import p224ra.C89909e;
import p294b7.C16744h;
import p295b8.C16765c;
import p295b8.C16774g;
import p300c8.C16873k;
import p300c8.C16876u;
import p300c8.C79946g;
import p300c8.C79950j;
import p300c8.C79958t;
import p333e8.C20551y;
import p337f8.C20694l;
import p353k7.C21304b;
import p355l7.C21396d;
import p370p7.C117991w;
import p370p7.C21920c;
import p370p7.C21941l;
import p370p7.C21949o;
import p370p7.C21962v;
import p380r7.C22210h;
import p383t7.C22439a;
import p383t7.C22449j;
import p396x6.C22995c;
import p396x6.C22997e;
import p396x6.C22998f;
import p396x6.C23002g;
import p396x6.C23016o;
import p396x6.C23019q;
import p396x6.C23027v;
import p401y6.C23233i;
import p404z6.C91618d;
import ym0.C91509g;
import ym0.C91512j;
import zt3.C119157j;

/* renamed from: kn0.k */
public class C21365k extends C21108a {

    /* renamed from: A */
    public Handler f60437A;

    /* renamed from: B */
    public HandlerThread f60438B;

    /* renamed from: C */
    public C21109f f60439C;

    /* renamed from: D */
    public int f60440D;

    /* renamed from: E */
    public int f60441E;

    /* renamed from: F */
    public int f60442F;

    /* renamed from: G */
    public boolean f60443G;

    /* renamed from: H */
    public boolean f60444H;

    /* renamed from: I */
    public volatile boolean f60445I;

    /* renamed from: J */
    public final AtomicBoolean f60446J;

    /* renamed from: K */
    public final AtomicBoolean f60447K;

    /* renamed from: L */
    public float f60448L;

    /* renamed from: M */
    public int f60449M;

    /* renamed from: N */
    public int f60450N;

    /* renamed from: O */
    public int f60451O;

    /* renamed from: P */
    public int f60452P;

    /* renamed from: Q */
    public int f60453Q;

    /* renamed from: R */
    public int f60454R;

    /* renamed from: S */
    public int f60455S;

    /* renamed from: T */
    public C91618d f60456T;

    /* renamed from: U */
    public C91618d f60457U;

    /* renamed from: V */
    public volatile boolean f60458V;

    /* renamed from: W */
    public volatile boolean f60459W;

    /* renamed from: o */
    public Context f60460o;

    /* renamed from: p */
    public C22998f f60461p;

    /* renamed from: q */
    public Surface f60462q;

    /* renamed from: r */
    public boolean f60463r;

    /* renamed from: s */
    public C21376f f60464s;

    /* renamed from: t */
    public C21949o f60465t;

    /* renamed from: u */
    public String f60466u;

    /* renamed from: v */
    public List<C23019q> f60467v;

    /* renamed from: w */
    public C22998f.C22999a f60468w;

    /* renamed from: x */
    public C21367c f60469x;

    /* renamed from: y */
    public C21361f f60470y;

    /* renamed from: z */
    public C21522d.C21523a f60471z;

    /* renamed from: kn0.k$a */
    public class C21366a implements C21109f.C21112c {
        public C21366a(C21363i iVar) {
        }
    }

    /* renamed from: kn0.k$c */
    public class C21367c implements C21920c, C21941l.C21942a {
        public C21367c(C21363i iVar) {
        }

        /* renamed from: d */
        public void mo33442d() {
            C21365k.this.f60470y.mo33442d();
        }

        /* renamed from: k */
        public void mo33447k(int i, Format format, int i2, Object obj, long j) {
            Log.m105925i("MicroMsg.SameLayer.ExoMediaPlayer", "[TRACE_ADAPTIVE] onDownstreamFormatChanged, trackType:%s, trackFormat:%s, mediaTimeMs:%s", Integer.valueOf(i), format, Long.valueOf(j));
            C21365k.this.mo32890y(format.f45772d);
        }

        /* renamed from: l */
        public void mo33448l(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            C21365k.this.f60470y.mo33448l(jVar, i, i2, format, i3, obj, j, j2, j3, j4, j5, iOException, z);
            Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayer", iOException, "onLoadError1, IOException, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s, loadDurationMs:%s, bytesLoaded:%s, wasCanceled:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Boolean.valueOf(z));
            C21365k.m24049F(C21365k.this);
            C21365k.this.mo33467N();
        }

        /* renamed from: m */
        public void mo33449m(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            Log.m105919d("MicroMsg.SameLayer.ExoMediaPlayer", "onLoadCompleted, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        }

        /* renamed from: o */
        public void mo33451o(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
            Log.m105919d("MicroMsg.SameLayer.ExoMediaPlayer", "onLoadStarted, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        }

        public void onLoadError(IOException iOException) {
            C21365k.this.f60470y.onLoadError(iOException);
            C21365k.m24049F(C21365k.this);
            C21365k.this.mo33468O();
        }

        /* renamed from: t */
        public void mo33454t(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            Log.m105919d("MicroMsg.SameLayer.ExoMediaPlayer", "onLoadCanceled, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        }
    }

    /* renamed from: kn0.k$d */
    public class C21368d implements C22998f.C22999a {

        /* renamed from: kn0.k$d$a */
        public class C21369a implements C11323a<String, Void> {
            public C21369a(C21368d dVar) {
            }

            public Object apply(Object obj) {
                Log.m105920e("MicroMsg.SameLayer.ExoMediaPlayer", (String) obj);
                return null;
            }
        }

        /* renamed from: kn0.k$d$b */
        public class C21370b implements C11323a<String, Void> {
            public C21370b(C21368d dVar) {
            }

            public Object apply(Object obj) {
                Log.m105920e("MicroMsg.SameLayer.ExoMediaPlayer", (String) obj);
                return null;
            }
        }

        /* renamed from: kn0.k$d$c */
        public class C21371c implements C11323a<String, Void> {
            public C21371c(C21368d dVar) {
            }

            public Object apply(Object obj) {
                Log.m105920e("MicroMsg.SameLayer.ExoMediaPlayer", (String) obj);
                return null;
            }
        }

        /* renamed from: kn0.k$d$d */
        public class C21372d implements C11323a<String, Void> {
            public C21372d(C21368d dVar) {
            }

            public Object apply(Object obj) {
                Log.m105920e("MicroMsg.SameLayer.ExoMediaPlayer", (String) obj);
                return null;
            }
        }

        /* renamed from: kn0.k$d$e */
        public class C21373e implements C11323a<String, Void> {
            public C21373e(C21368d dVar) {
            }

            public Object apply(Object obj) {
                Log.m105920e("MicroMsg.SameLayer.ExoMediaPlayer", (String) obj);
                return null;
            }
        }

        /* renamed from: kn0.k$d$f */
        public class C21374f implements C11323a<String, Void> {
            public C21374f(C21368d dVar) {
            }

            public Object apply(Object obj) {
                Log.m105920e("MicroMsg.SameLayer.ExoMediaPlayer", (String) obj);
                return null;
            }
        }

        public C21368d(C21363i iVar) {
        }

        public void onLoadingChanged(boolean z) {
            C21365k.this.f60470y.onLoadingChanged(z);
            if (z) {
                C21365k.this.mo33470Q(true);
            }
        }

        public void onPlaybackParametersChanged(C23016o oVar) {
            C21365k.this.f60470y.onPlaybackParametersChanged(oVar);
        }

        public void onPlayerError(C22997e eVar) {
            String str;
            C21365k.this.f60470y.onPlayerError(eVar);
            if (C21365k.this.mo33460G()) {
                C21365k.this.mo33470Q(false);
            }
            int i = -4999;
            if (eVar != null) {
                Throwable cause = eVar.getCause();
                if (cause != null) {
                    if (cause instanceof C79958t.C79960b) {
                        i = -4000;
                        if (cause.toString().contains("Unable to connect")) {
                            Context context = C21365k.this.f60460o;
                            C21518b bVar = C88235m.f255053a;
                            boolean isNetworkConnected = NetStatusUtil.isNetworkConnected(context);
                            Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayer", cause, "ExoPlaybackException hasNetwork=" + isNetworkConnected, new Object[0]);
                            if (!isNetworkConnected) {
                                C21365k.this.mo32891z(-4000, -2);
                                return;
                            } else {
                                C21365k.this.mo32891z(-4000, -3);
                                return;
                            }
                        } else if (cause instanceof C79958t.C79962d) {
                            String th = cause.toString();
                            if (th.contains("403")) {
                                C21365k.this.mo32891z(-4000, -10);
                                return;
                            } else if (th.contains("404")) {
                                C21365k.this.mo32891z(-4000, -11);
                                return;
                            } else if (th.contains("500")) {
                                C21365k.this.mo32891z(-4000, -12);
                                return;
                            } else if (th.contains("502")) {
                                C21365k.this.mo32891z(-4000, -13);
                                return;
                            } else {
                                C21365k.this.mo32891z(-4000, -30);
                                return;
                            }
                        }
                    } else if (cause instanceof C117991w) {
                        C21369a aVar = new C21369a(this);
                        C21518b bVar2 = C88235m.f255053a;
                        if (!MMHandlerThread.isMainThread()) {
                            aVar.apply(C88235m.m109883b(0, (String) null, 10));
                        } else {
                            ((C119157j) C119157j.f356862d).mo183875f(new C88234l(aVar, 0, (String) null, 10));
                        }
                        C21365k.this.mo32891z(-4001, -1);
                        return;
                    } else if (cause instanceof IllegalStateException) {
                        C21370b bVar3 = new C21370b(this);
                        C21518b bVar4 = C88235m.f255053a;
                        if (!MMHandlerThread.isMainThread()) {
                            bVar3.apply(C88235m.m109883b(0, (String) null, 10));
                        } else {
                            ((C119157j) C119157j.f356862d).mo183875f(new C88234l(bVar3, 0, (String) null, 10));
                        }
                        C21365k.this.mo32891z(-4002, -1);
                        return;
                    } else if (cause instanceof C21304b.C21305a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onPlayError, error: ");
                        C21518b bVar5 = C88235m.f255053a;
                        if (eVar instanceof C21304b.C21305a) {
                            C21304b.C21305a aVar2 = (C21304b.C21305a) eVar;
                            str = "DecoderInitializationException{message='" + aVar2.getLocalizedMessage() + '\'' + ", mimeType='" + aVar2.f60202d + '\'' + ", secureDecoderRequired=" + aVar2.f60203e + ", decoderName='" + aVar2.f60204f + '\'' + ", diagnosticInfo='" + aVar2.f60205g + '\'' + '}';
                        } else {
                            str = eVar.toString();
                        }
                        sb.append(str);
                        Log.m105928w("MicroMsg.SameLayer.ExoMediaPlayer", sb.toString());
                        C21371c cVar = new C21371c(this);
                        if (!MMHandlerThread.isMainThread()) {
                            cVar.apply(C88235m.m109883b(0, (String) null, 10));
                        } else {
                            ((C119157j) C119157j.f356862d).mo183875f(new C88234l(cVar, 0, (String) null, 10));
                        }
                        C21365k.this.mo32891z(-4003, -1);
                        return;
                    } else if (cause instanceof C16876u.C16882f) {
                        C21372d dVar = new C21372d(this);
                        C21518b bVar6 = C88235m.f255053a;
                        if (!MMHandlerThread.isMainThread()) {
                            dVar.apply(C88235m.m109883b(0, (String) null, 10));
                        } else {
                            ((C119157j) C119157j.f356862d).mo183875f(new C88234l(dVar, 0, (String) null, 10));
                        }
                        C21365k.this.mo32891z(-4004, -1);
                        return;
                    }
                }
                if (1 == eVar.f66080d) {
                    C21373e eVar2 = new C21373e(this);
                    C21518b bVar7 = C88235m.f255053a;
                    if (!MMHandlerThread.isMainThread()) {
                        eVar2.apply(C88235m.m109883b(0, (String) null, 10));
                    } else {
                        ((C119157j) C119157j.f356862d).mo183875f(new C88234l(eVar2, 0, (String) null, 10));
                    }
                    C21365k.this.mo32891z(-4005, -1);
                    return;
                }
            }
            C21374f fVar = new C21374f(this);
            C21518b bVar8 = C88235m.f255053a;
            if (!MMHandlerThread.isMainThread()) {
                fVar.apply(C88235m.m109883b(0, (String) null, 30));
            } else {
                ((C119157j) C119157j.f356862d).mo183875f(new C88234l(fVar, 0, (String) null, 30));
            }
            C21365k.this.mo32891z(i, -1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPlayerStateChanged(boolean r9, int r10) {
            /*
                r8 = this;
                kn0.k r0 = kn0.C21365k.this
                kn0.f r0 = r0.f60470y
                r0.onPlayerStateChanged(r9, r10)
                kn0.k r9 = kn0.C21365k.this
                monitor-enter(r9)
                x6.f r10 = r9.f60461p     // Catch:{ all -> 0x0188 }
                if (r10 == 0) goto L_0x0186
                boolean r10 = r9.f60445I     // Catch:{ all -> 0x0188 }
                if (r10 == 0) goto L_0x0014
                goto L_0x0186
            L_0x0014:
                x6.f r10 = r9.f60461p     // Catch:{ all -> 0x0188 }
                r0 = r10
                x6.g r0 = (p396x6.C23002g) r0     // Catch:{ all -> 0x0188 }
                int r0 = r0.f66095l     // Catch:{ all -> 0x0188 }
                x6.g r10 = (p396x6.C23002g) r10     // Catch:{ all -> 0x0188 }
                boolean r10 = r10.f66093j     // Catch:{ all -> 0x0188 }
                kn0.k$f r1 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int r1 = r1.mo33472a(r10, r0)     // Catch:{ all -> 0x0188 }
                kn0.k$f r2 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int[] r2 = r2.f60476a     // Catch:{ all -> 0x0188 }
                r3 = 3
                r2 = r2[r3]     // Catch:{ all -> 0x0188 }
                if (r1 == r2) goto L_0x0184
                java.lang.String r2 = "MicroMsg.SameLayer.ExoMediaPlayer"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0188 }
                r4.<init>()     // Catch:{ all -> 0x0188 }
                java.lang.String r5 = "reportPlayerState, set new recent state ["
                r4.append(r5)     // Catch:{ all -> 0x0188 }
                r4.append(r10)     // Catch:{ all -> 0x0188 }
                java.lang.String r5 = ","
                r4.append(r5)     // Catch:{ all -> 0x0188 }
                r4.append(r0)     // Catch:{ all -> 0x0188 }
                java.lang.String r5 = "]"
                r4.append(r5)     // Catch:{ all -> 0x0188 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0188 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x0188 }
                kn0.k$f r2 = r9.f60464s     // Catch:{ all -> 0x0188 }
                r2.mo33474c(r10, r0)     // Catch:{ all -> 0x0188 }
                r10 = 4
                r2 = 1
                r4 = 0
                if (r1 != r3) goto L_0x005f
                r9.mo33470Q(r2)     // Catch:{ all -> 0x0188 }
                goto L_0x0066
            L_0x005f:
                if (r1 == r2) goto L_0x0063
                if (r1 != r10) goto L_0x0066
            L_0x0063:
                r9.mo33470Q(r4)     // Catch:{ all -> 0x0188 }
            L_0x0066:
                kn0.k$f r5 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int r5 = r5.mo33472a(r2, r10)     // Catch:{ all -> 0x0188 }
                r6 = 2
                if (r1 != r5) goto L_0x00b7
                java.lang.String r10 = "MicroMsg.SameLayer.ExoMediaPlayer"
                java.lang.String r0 = "reportPlayerState, isSeeking: %b, loopingPlaySeek: %b"
                java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0188 }
                java.util.concurrent.atomic.AtomicBoolean r3 = r9.f60447K     // Catch:{ all -> 0x0188 }
                boolean r3 = r3.get()     // Catch:{ all -> 0x0188 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0188 }
                r1[r4] = r3     // Catch:{ all -> 0x0188 }
                boolean r3 = r9.f60444H     // Catch:{ all -> 0x0188 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0188 }
                r1[r2] = r3     // Catch:{ all -> 0x0188 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r1)     // Catch:{ all -> 0x0188 }
                java.util.concurrent.atomic.AtomicBoolean r10 = r9.f60447K     // Catch:{ all -> 0x0188 }
                boolean r10 = r10.getAndSet(r4)     // Catch:{ all -> 0x0188 }
                if (r10 == 0) goto L_0x009b
                boolean r10 = r9.f60444H     // Catch:{ all -> 0x0188 }
                if (r10 != 0) goto L_0x009b
                r9.mo22527D()     // Catch:{ all -> 0x0188 }
            L_0x009b:
                boolean r10 = r9.f60443G     // Catch:{ all -> 0x0188 }
                if (r10 == 0) goto L_0x00ae
                java.lang.String r10 = "MicroMsg.SameLayer.ExoMediaPlayer"
                java.lang.String r0 = "looping play start"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ all -> 0x0188 }
                r9.f60444H = r2     // Catch:{ all -> 0x0188 }
                r0 = 0
                r9.seekTo(r0)     // Catch:{ all -> 0x0188 }
                goto L_0x00b4
            L_0x00ae:
                r10 = 6
                r9.f59681a = r10     // Catch:{ all -> 0x0188 }
                r9.mo32889x()     // Catch:{ all -> 0x0188 }
            L_0x00b4:
                monitor-exit(r9)
                goto L_0x0187
            L_0x00b7:
                kn0.k$f r1 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int[] r5 = new int[r3]     // Catch:{ all -> 0x0188 }
                int r7 = r1.mo33472a(r4, r2)     // Catch:{ all -> 0x0188 }
                r5[r4] = r7     // Catch:{ all -> 0x0188 }
                kn0.k$f r7 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int r7 = r7.mo33472a(r4, r6)     // Catch:{ all -> 0x0188 }
                r5[r2] = r7     // Catch:{ all -> 0x0188 }
                kn0.k$f r7 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int r7 = r7.mo33472a(r4, r3)     // Catch:{ all -> 0x0188 }
                r5[r6] = r7     // Catch:{ all -> 0x0188 }
                boolean r1 = r1.mo33473b(r5, r4)     // Catch:{ all -> 0x0188 }
                if (r1 != 0) goto L_0x017b
                boolean r1 = r9.f60458V     // Catch:{ all -> 0x0188 }
                if (r1 == 0) goto L_0x00df
                if (r0 != r3) goto L_0x00df
                goto L_0x017b
            L_0x00df:
                kn0.k$f r0 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int[] r1 = new int[r3]     // Catch:{ all -> 0x0188 }
                r5 = 100
                r1[r4] = r5     // Catch:{ all -> 0x0188 }
                r1[r2] = r6     // Catch:{ all -> 0x0188 }
                r1[r6] = r3     // Catch:{ all -> 0x0188 }
                boolean r0 = r0.mo33473b(r1, r2)     // Catch:{ all -> 0x0188 }
                kn0.k$f r1 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int[] r7 = new int[r3]     // Catch:{ all -> 0x0188 }
                r7[r4] = r6     // Catch:{ all -> 0x0188 }
                r7[r2] = r5     // Catch:{ all -> 0x0188 }
                r7[r6] = r3     // Catch:{ all -> 0x0188 }
                boolean r1 = r1.mo33473b(r7, r2)     // Catch:{ all -> 0x0188 }
                r0 = r0 | r1
                kn0.k$f r1 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int[] r10 = new int[r10]     // Catch:{ all -> 0x0188 }
                r10[r4] = r5     // Catch:{ all -> 0x0188 }
                r10[r2] = r3     // Catch:{ all -> 0x0188 }
                r10[r6] = r6     // Catch:{ all -> 0x0188 }
                r10[r3] = r3     // Catch:{ all -> 0x0188 }
                boolean r10 = r1.mo33473b(r10, r2)     // Catch:{ all -> 0x0188 }
                r10 = r10 | r0
                if (r10 == 0) goto L_0x0122
                boolean r10 = r9.f60444H     // Catch:{ all -> 0x0188 }
                if (r10 != 0) goto L_0x0119
                r9.mo22527D()     // Catch:{ all -> 0x0188 }
                goto L_0x011b
            L_0x0119:
                r9.f60444H = r4     // Catch:{ all -> 0x0188 }
            L_0x011b:
                java.util.concurrent.atomic.AtomicBoolean r10 = r9.f60447K     // Catch:{ all -> 0x0188 }
                r10.set(r4)     // Catch:{ all -> 0x0188 }
                monitor-exit(r9)
                goto L_0x0187
            L_0x0122:
                kn0.k$f r10 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int[] r0 = new int[r6]     // Catch:{ all -> 0x0188 }
                int r1 = r10.mo33472a(r2, r3)     // Catch:{ all -> 0x0188 }
                r0[r4] = r1     // Catch:{ all -> 0x0188 }
                kn0.k$f r1 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int r1 = r1.mo33472a(r2, r6)     // Catch:{ all -> 0x0188 }
                r0[r2] = r1     // Catch:{ all -> 0x0188 }
                boolean r10 = r10.mo33473b(r0, r4)     // Catch:{ all -> 0x0188 }
                if (r10 == 0) goto L_0x014f
                r10 = 701(0x2bd, float:9.82E-43)
                boolean r0 = r9.mo33460G()     // Catch:{ all -> 0x0188 }
                if (r0 == 0) goto L_0x014a
                x6.f r0 = r9.f60461p     // Catch:{ all -> 0x0188 }
                x6.g r0 = (p396x6.C23002g) r0     // Catch:{ all -> 0x0188 }
                int r4 = r0.mo36269h()     // Catch:{ all -> 0x0188 }
            L_0x014a:
                r9.mo32883B(r10, r4)     // Catch:{ all -> 0x0188 }
                monitor-exit(r9)
                goto L_0x0187
            L_0x014f:
                kn0.k$f r10 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int[] r0 = new int[r6]     // Catch:{ all -> 0x0188 }
                int r1 = r10.mo33472a(r2, r6)     // Catch:{ all -> 0x0188 }
                r0[r4] = r1     // Catch:{ all -> 0x0188 }
                kn0.k$f r1 = r9.f60464s     // Catch:{ all -> 0x0188 }
                int r1 = r1.mo33472a(r2, r3)     // Catch:{ all -> 0x0188 }
                r0[r2] = r1     // Catch:{ all -> 0x0188 }
                boolean r10 = r10.mo33473b(r0, r4)     // Catch:{ all -> 0x0188 }
                if (r10 == 0) goto L_0x0184
                r10 = 702(0x2be, float:9.84E-43)
                boolean r0 = r9.mo33460G()     // Catch:{ all -> 0x0188 }
                if (r0 == 0) goto L_0x0177
                x6.f r0 = r9.f60461p     // Catch:{ all -> 0x0188 }
                x6.g r0 = (p396x6.C23002g) r0     // Catch:{ all -> 0x0188 }
                int r4 = r0.mo36269h()     // Catch:{ all -> 0x0188 }
            L_0x0177:
                r9.mo32883B(r10, r4)     // Catch:{ all -> 0x0188 }
                goto L_0x0184
            L_0x017b:
                r9.f59681a = r6     // Catch:{ all -> 0x0188 }
                r9.mo32884C()     // Catch:{ all -> 0x0188 }
                r9.f60458V = r4     // Catch:{ all -> 0x0188 }
                monitor-exit(r9)
                goto L_0x0187
            L_0x0184:
                monitor-exit(r9)
                goto L_0x0187
            L_0x0186:
                monitor-exit(r9)
            L_0x0187:
                return
            L_0x0188:
                r10 = move-exception
                monitor-exit(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kn0.C21365k.C21368d.onPlayerStateChanged(boolean, int):void");
        }

        public void onPositionDiscontinuity() {
            C21365k.this.f60470y.onPositionDiscontinuity();
        }

        public void onRepeatModeChanged(int i) {
            C21365k.this.f60470y.onRepeatModeChanged(i);
        }

        public void onTimelineChanged(C23027v vVar, Object obj) {
            C21365k.this.f60470y.onTimelineChanged(vVar, obj);
        }

        public void onTracksChanged(C21962v vVar, C16774g gVar) {
            C21365k.this.f60470y.onTracksChanged(vVar, gVar);
        }
    }

    /* renamed from: kn0.k$e */
    public class C21375e implements C20694l, C23233i, C21396d.C21397a, C22449j.C22450a {
        public C21375e(C21363i iVar) {
        }

        /* renamed from: a */
        public void mo32402a(int i, int i2, int i3, float f) {
            C21365k.this.f60470y.mo32402a(i, i2, i3, f);
            C21365k.this.getClass();
            Size size = new Size(i, i2);
            int width = size.getWidth();
            int height = size.getHeight();
            C21365k kVar = C21365k.this;
            kVar.f60440D = width;
            kVar.f60441E = height;
            kVar.mo32885E(width, height);
        }

        /* renamed from: b */
        public void mo33441b(String str, long j, long j2) {
            C21365k.this.f60470y.mo33441b(str, j, j2);
        }

        /* renamed from: c */
        public void mo32403c(int i, long j) {
            C21365k.this.f60470y.mo32403c(i, j);
        }

        /* renamed from: d */
        public void mo33471d(List<C22439a> list) {
            Log.m105918d("MicroMsg.SameLayer.ExoMediaPlayer", "onCues");
        }

        /* renamed from: e */
        public void mo33443e(int i) {
            C21365k.this.f60470y.mo33443e(i);
        }

        /* renamed from: f */
        public void mo32404f(Surface surface) {
            C21365k.this.f60470y.mo32404f(surface);
            C21365k.this.mo32883B(3, 0);
        }

        /* renamed from: g */
        public void mo33444g(Metadata metadata) {
            C21365k.this.f60470y.mo33444g(metadata);
        }

        /* renamed from: h */
        public void mo33445h(C91618d dVar) {
            C21365k.this.f60470y.mo33445h(dVar);
            C21365k.this.f60457U = null;
        }

        /* renamed from: i */
        public void mo32405i(C91618d dVar) {
            C21365k.this.f60470y.mo32405i(dVar);
            C21365k.this.f60456T = dVar;
        }

        /* renamed from: j */
        public void mo33446j(Format format) {
            C21365k.this.f60470y.mo33446j(format);
        }

        /* renamed from: n */
        public void mo33450n(C91618d dVar) {
            C21365k.this.f60470y.mo33450n(dVar);
            C21365k.this.f60457U = dVar;
        }

        /* renamed from: p */
        public void mo32406p(String str, long j, long j2) {
            C21365k.this.f60470y.mo32406p(str, j, j2);
        }

        /* renamed from: q */
        public void mo32407q(Format format) {
            C21365k.this.f60470y.mo32407q(format);
        }

        /* renamed from: r */
        public void mo32408r(C91618d dVar) {
            C21365k.this.f60470y.mo32408r(dVar);
            C21365k.this.f60456T = null;
        }

        /* renamed from: s */
        public void mo33453s(int i, long j, long j2) {
            C21365k.this.f60470y.mo33453s(i, j, j2);
        }
    }

    /* renamed from: kn0.k$f */
    public static class C21376f {

        /* renamed from: a */
        public int[] f60476a = {1, 1, 1, 1};

        public C21376f(C21363i iVar) {
        }

        /* renamed from: a */
        public int mo33472a(boolean z, int i) {
            return (z ? ShareElfFile.SectionHeader.SHF_MASKPROC : 0) | i;
        }

        /* renamed from: b */
        public boolean mo33473b(int[] iArr, boolean z) {
            int i = z ? 268435455 : -1;
            int length = this.f60476a.length - iArr.length;
            int i2 = length;
            boolean z2 = true;
            while (true) {
                int[] iArr2 = this.f60476a;
                if (i2 >= iArr2.length) {
                    return z2;
                }
                z2 &= (iArr2[i2] & i) == (iArr[i2 - length] & i);
                i2++;
            }
        }

        /* renamed from: c */
        public void mo33474c(boolean z, int i) {
            int a = mo33472a(z, i);
            Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "request setMostRecentState [" + z + "," + i + "], lastState=" + this.f60476a[3] + ", newState=" + a);
            int[] iArr = this.f60476a;
            int i2 = iArr[3];
            if (i2 != a) {
                iArr[0] = iArr[1];
                iArr[1] = iArr[2];
                iArr[2] = i2;
                iArr[3] = a;
                Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "new MostRecentState [" + this.f60476a[0] + "," + this.f60476a[1] + "," + this.f60476a[2] + "," + this.f60476a[3] + "]");
            }
        }
    }

    /* renamed from: kn0.k$b */
    public static class C21377b {

        /* renamed from: a */
        public final boolean f60477a;

        /* renamed from: b */
        public final boolean f60478b;

        public C21377b(boolean z, boolean z2) {
            this.f60477a = z;
            this.f60478b = z2;
        }
    }

    public C21365k() {
        this((Handler) null);
    }

    /* renamed from: F */
    public static void m24049F(C21365k kVar) {
        kVar.getClass();
        Log.m105918d("MicroMsg.SameLayer.ExoMediaPlayer", "dispatchOnErrorWorkaroundWhenLoadErrorIfNeed");
        int i = kVar.f60455S + 1;
        kVar.f60455S = i;
        if (6 <= i) {
            Context context = kVar.f60460o;
            C21518b bVar = C88235m.f255053a;
            if (!NetStatusUtil.isNetworkConnected(context)) {
                Log.m105918d("MicroMsg.SameLayer.ExoMediaPlayer", "dispatchOnErrorWorkaroundWhenLoadErrorIfNeed, notifyOnError");
                kVar.mo32891z(-4006, -2);
            }
        }
    }

    /* renamed from: G */
    public final boolean mo33460G() {
        return this.f60461p != null;
    }

    /* renamed from: H */
    public final C21949o mo33461H(Uri uri, String str, String str2, int i) {
        int I = 2 == i ? 2 : mo33462I(uri);
        Map singletonMap = str != null ? Collections.singletonMap("Referer", str) : null;
        if (I == 2) {
            Log.m105925i("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, type:HLS, url:%s", uri);
            return new C22210h(uri, C88235m.m109882a(this.f60460o, singletonMap), this.f60437A, this.f60469x);
        } else if (I != 3) {
            Log.m105920e("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, unsupported type:" + I + ", url:" + uri);
            return null;
        } else {
            Log.m105925i("MicroMsg.SameLayer.ExoMediaPlayer", "buildMediaSource, type:other, url:%s", uri);
            if (str2 == null || str2.length() <= 0) {
                return new C21941l(uri, mo33463J(singletonMap), mo33464K(), this.f60437A, this.f60469x);
            }
            Log.m105925i("MicroMsg.SameLayer.ExoMediaPlayer", "[TRACE_VIDEO_PRELOAD] buildMediaSource with cutomkey = %s", str2);
            return new C21941l(uri, mo33463J(singletonMap), mo33464K(), this.f60437A, this.f60469x, str2);
        }
    }

    /* renamed from: I */
    public int mo33462I(Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            if (uri2.contains(".m3u8") || uri2.contains(".m3u")) {
                return 2;
            }
        }
        return 3;
    }

    /* renamed from: J */
    public C79946g.C79947a mo33463J(Map<String, String> map) {
        if (map == null && !C91512j.m114810c().f262321e) {
            C79946g.C79947a aVar = null;
            C91509g L = mo33465L();
            if (L != null) {
                aVar = L.mo123039pR();
            }
            if (aVar != null) {
                Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "getDataSourceFactory, return customized data source factory");
                return aVar;
            }
        }
        Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "getDataSourceFactory, return default data source factory");
        return C88235m.m109882a(this.f60460o, map);
    }

    /* renamed from: K */
    public C16744h mo33464K() {
        return new C21362h();
    }

    /* renamed from: L */
    public C91509g mo33465L() {
        return (C91509g) C89909e.m112436a(C91509g.class);
    }

    /* renamed from: M */
    public final void mo33466M() {
        Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "iniMediaPlayer");
        C21522d.C21523a aVar = new C21522d.C21523a(C88235m.f255053a, 0, this.f60449M, this.f60450N, 25000, this.f60448L);
        this.f60471z = aVar;
        C16765c cVar = new C16765c(aVar);
        this.f60470y = new C21361f(cVar);
        C22995c cVar2 = new C22995c(new C16873k(true, 65536), this.f60451O, this.f60452P, (long) this.f60453Q, (long) this.f60454R);
        ArrayList arrayList = (ArrayList) this.f60467v;
        C23002g gVar = new C23002g((C23019q[]) arrayList.toArray(new C23019q[arrayList.size()]), cVar, cVar2);
        this.f60461p = gVar;
        gVar.f66089f.add(this.f60468w);
    }

    /* renamed from: N */
    public void mo33467N() {
    }

    /* renamed from: O */
    public void mo33468O() {
    }

    /* renamed from: P */
    public final void mo33469P(int i, int i2, Object obj, boolean z) {
        if (!((ArrayList) this.f60467v).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.f60467v).iterator();
            while (it.hasNext()) {
                C23019q qVar = (C23019q) it.next();
                if (qVar.mo36239j() == i) {
                    arrayList.add(new C22998f.C23001c(qVar, i2, obj));
                }
            }
            if (z) {
                this.f60461p.mo36261g((C22998f.C23001c[]) arrayList.toArray(new C22998f.C23001c[arrayList.size()]));
            } else {
                this.f60461p.mo36260e((C22998f.C23001c[]) arrayList.toArray(new C22998f.C23001c[arrayList.size()]));
            }
        }
    }

    /* renamed from: Q */
    public final void mo33470Q(boolean z) {
        Log.m105918d("MicroMsg.SameLayer.ExoMediaPlayer", "setBufferRepeaterStarted " + z);
        if (!z || this.f59688h == null) {
            this.f60439C.f59695a = false;
            return;
        }
        C21109f fVar = this.f60439C;
        if (!fVar.f59695a) {
            fVar.f59695a = true;
            C21109f fVar2 = C21109f.this;
            fVar2.f59697c.postDelayed(fVar2.f59699e, (long) fVar2.f59696b);
        }
    }

    /* renamed from: a */
    public void mo22532a(float f, float f2) {
        mo33469P(1, 2, Float.valueOf(f), false);
    }

    /* renamed from: b */
    public void mo22533b(boolean z) {
        this.f60443G = z;
    }

    /* renamed from: d */
    public void mo22534d(String str, String str2) {
        mo22577g(str, str2, 0);
    }

    /* renamed from: e */
    public void mo22535e(double d) {
        C21522d.C21523a aVar = this.f60471z;
        aVar.getClass();
        Log.m105924i("MicroMsg.AdavanceTrackSelection", "set#preferredPeakBitRate, value: " + d);
        aVar.f60957h = d;
        Iterator<C21522d> it = aVar.f60956g.iterator();
        while (it.hasNext()) {
            it.next().f60949n = d;
        }
    }

    /* renamed from: g */
    public void mo22577g(String str, String str2, int i) {
        this.f60465t = mo33461H(Uri.parse(str), str2, "", i);
        this.f60466u = str;
        this.f60455S = 0;
        this.f59681a = 1;
    }

    public int getCurrentPosition() {
        if (mo33460G()) {
            return (int) this.f60461p.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (mo33460G()) {
            return (int) this.f60461p.getDuration();
        }
        return 0;
    }

    public int getPlayerType() {
        return 2;
    }

    public int getVideoHeight() {
        return this.f60441E;
    }

    public int getVideoWidth() {
        return this.f60440D;
    }

    /* renamed from: h */
    public void mo22541h(String str, int i) {
        mo22577g(str, (String) null, i);
    }

    public boolean isPlaying() {
        if (!mo33460G()) {
            return false;
        }
        int f = this.f60461p.mo36266f();
        return (f == 1 || f == 2 || f == 3) ? this.f60461p.mo36263b() : f == 4 && this.f60443G;
    }

    /* renamed from: l */
    public boolean mo22543l(float f) {
        if (!mo33460G()) {
            return false;
        }
        this.f60461p.mo36264c(new C23016o(f, 1.0f));
        return true;
    }

    /* renamed from: o */
    public <PlayerImpl extends C87760d> PlayerImpl mo22544o(Class<PlayerImpl> cls) {
        C21365k kVar = C21365k.class.isAssignableFrom(cls) ? this : null;
        Log.m105925i("MicroMsg.SameLayer.ExoMediaPlayer", "castTo, playerClass: %s, playerImpl: %s", cls, kVar);
        return kVar;
    }

    public void pause() {
        if (mo33460G()) {
            this.f60461p.mo36262a(false);
            this.f59681a = 3;
        }
    }

    public void prepareAsync() {
        if (this.f60465t == null) {
            Log.m105928w("MicroMsg.SameLayer.ExoMediaPlayer", "prepareAsync, media source is null");
        } else if (mo33460G()) {
            ((C23002g) this.f60461p).mo36262a(false);
            ((C23002g) this.f60461p).mo36272k(this.f60465t);
            this.f60458V = true;
        }
    }

    public void release() {
        this.f60445I = true;
        if (mo33460G()) {
            mo33470Q(false);
            if (mo33460G()) {
                this.f60461p.release();
                this.f60461p.mo36265d(this.f60468w);
                this.f60461p = null;
            }
            this.f60440D = 0;
            this.f60441E = 0;
            this.f60442F = 0;
        }
        HandlerThread handlerThread = this.f60438B;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f60438B = null;
        }
        Surface surface = this.f60462q;
        if (surface != null) {
            if (this.f60463r) {
                surface.release();
            }
            this.f60462q = null;
        }
        this.f59683c = null;
        this.f59684d = null;
        this.f59685e = null;
        this.f59686f = null;
        this.f59687g = null;
        this.f59688h = null;
        this.f59689i = null;
        this.f59681a = -2;
        this.f59682b = true;
    }

    public void reset() {
        if (mo33460G()) {
            mo33470Q(false);
            if (mo33460G()) {
                this.f60461p.mo36262a(false);
                this.f60461p.stop();
            }
            this.f60443G = false;
            this.f60442F = 0;
            C21376f fVar = this.f60464s;
            fVar.getClass();
            fVar.f60476a = new int[]{1, 1, 1, 1};
            this.f59681a = 0;
        }
    }

    public void seekTo(long j) {
        if (mo33460G()) {
            ((C23002g) this.f60461p).mo36273l(j);
            C21376f fVar = this.f60464s;
            fVar.mo33474c((fVar.f60476a[3] & ShareElfFile.SectionHeader.SHF_MASKPROC) != 0, 100);
            this.f60447K.set(true);
        }
    }

    public void setDataSource(String str) {
        mo22577g(str, (String) null, 0);
    }

    public void setMute(boolean z) {
        if (!mo33460G()) {
            return;
        }
        if (z) {
            mo22532a(0.0f, 0.0f);
        } else {
            mo22532a(1.0f, 1.0f);
        }
    }

    public void setSurface(Surface surface) {
        if (mo33460G() && mo33460G()) {
            Surface surface2 = this.f60462q;
            if (surface2 == null || surface2 == surface || surface == null) {
                mo33469P(2, 1, surface, false);
            } else {
                if (this.f60463r) {
                    surface2.release();
                }
                mo33469P(2, 1, surface, true);
                long currentPosition = this.f60461p.getCurrentPosition();
                if (C20551y.f57835a < 23) {
                    this.f60437A.postDelayed(new C21364j(this, currentPosition), 200);
                }
            }
            this.f60462q = surface;
            this.f60463r = false;
        }
    }

    public void start() {
        if (mo33460G()) {
            C22998f fVar = this.f60461p;
            if (((C23002g) fVar).f66095l == 4) {
                ((C23002g) fVar).mo36273l(0);
            }
            ((C23002g) this.f60461p).mo36262a(true);
            this.f59681a = 3;
            this.f60446J.set(false);
        }
    }

    public void stop() {
        if (mo33460G() && !this.f60446J.getAndSet(true)) {
            this.f60461p.mo36262a(false);
            this.f60461p.stop();
            this.f59681a = 5;
        }
    }

    /* renamed from: z */
    public boolean mo32891z(int i, int i2) {
        boolean z = super.mo32891z(i, i2);
        C91509g L = mo33465L();
        if (L != null) {
            L.mo123038hU(this.f60466u);
        }
        this.f60459W = true;
        this.f60455S = 0;
        return z;
    }

    public C21365k(Handler handler) {
        this(handler, 0, 0.75f, 10000, 25000, 15000, 30000, 2500, 5000);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0162 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21365k(android.os.Handler r18, int r19, float r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r17.<init>()
            r2 = 0
            r1.f60466u = r2
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r1.f60446J = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 0
            r3.<init>(r4)
            r1.f60447K = r3
            r3 = 1061158912(0x3f400000, float:0.75)
            r1.f60448L = r3
            r3 = 10000(0x2710, float:1.4013E-41)
            r1.f60449M = r3
            r3 = 25000(0x61a8, float:3.5032E-41)
            r1.f60450N = r3
            r3 = 15000(0x3a98, float:2.102E-41)
            r1.f60451O = r3
            r3 = 30000(0x7530, float:4.2039E-41)
            r1.f60452P = r3
            r3 = 2500(0x9c4, float:3.503E-42)
            r1.f60453Q = r3
            r3 = 5000(0x1388, float:7.006E-42)
            r1.f60454R = r3
            r1.f60455S = r4
            r1.f60456T = r2
            r1.f60457U = r2
            r1.f60458V = r4
            r1.f60459W = r4
            java.lang.String r5 = "MicroMsg.SameLayer.ExoMediaPlayer"
            java.lang.String r6 = "ExoMediaPlayer, handler = %s, maxInitBitrate = %s, bandFraction = %s, minDur = %s, maxDur = %s, minBuffer = %s, maxBuffer = %s, bufferForPlaybackMs:%s, bufferForPlaybackAfterRebufferMs:%s"
            r7 = 9
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r19)
            r9 = 1
            r7[r9] = r8
            java.lang.Float r8 = java.lang.Float.valueOf(r20)
            r9 = 2
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
            r9 = 3
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            r9 = 4
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
            r9 = 5
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r24)
            r10 = 6
            r7[r10] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r25)
            r10 = 7
            r7[r10] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r26)
            r10 = 8
            r7[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)
            r5 = r20
            r1.f60448L = r5
            r5 = r21
            r1.f60449M = r5
            r5 = r22
            r1.f60450N = r5
            r5 = r23
            r1.f60451O = r5
            r5 = r24
            r1.f60452P = r5
            r5 = r25
            r1.f60453Q = r5
            r5 = r26
            r1.f60454R = r5
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1.f60460o = r5
            kn0.k$f r5 = new kn0.k$f
            r5.<init>(r2)
            r1.f60464s = r5
            if (r0 == 0) goto L_0x00b3
            r1.f60437A = r0
            goto L_0x00cd
        L_0x00b3:
            java.lang.String r5 = "ExoMediaPlayer_HandlerThread"
            int r6 = eu3.C58834h.f168432b
            android.os.HandlerThread r5 = eu3.C97749e.m126093a(r5, r9)
            r1.f60438B = r5
            r5.start()
            android.os.Handler r5 = new android.os.Handler
            android.os.HandlerThread r6 = r1.f60438B
            android.os.Looper r6 = r6.getLooper()
            r5.<init>(r6)
            r1.f60437A = r5
        L_0x00cd:
            kn0.k$d r5 = new kn0.k$d
            r5.<init>(r2)
            r1.f60468w = r5
            kn0.k$c r5 = new kn0.k$c
            r5.<init>(r2)
            r1.f60469x = r5
            in0.f r5 = new in0.f
            android.os.Handler r6 = r1.f60437A
            r5.<init>(r6)
            r1.f60439C = r5
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.f59696b = r6
            kn0.k$a r6 = new kn0.k$a
            r6.<init>(r2)
            r5.f59698d = r6
            kn0.k$e r15 = new kn0.k$e
            r15.<init>(r2)
            android.content.Context r8 = r1.f60460o
            android.os.Handler r14 = r1.f60437A
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            y6.n r6 = new y6.n
            k7.c r9 = p353k7.C21306c.f60206a
            y6.c r7 = p401y6.C118940c.m167684a(r8)
            y6.d[] r4 = new p401y6.C23227d[r4]
            r10 = 0
            r11 = 1
            r19 = r6
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r14
            r24 = r15
            r25 = r7
            r26 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r5.add(r6)
            r2.addAll(r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            f8.c r5 = new f8.c
            long r10 = (long) r3
            r12 = 0
            r13 = 0
            r16 = 50
            r7 = r5
            r7.<init>(r8, r9, r10, r12, r13, r14, r15, r16)
            r4.add(r5)
            r2.addAll(r4)
            r1.f60467v = r2
            if (r0 == 0) goto L_0x014f
            android.os.Looper r0 = r18.getLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r0 != r2) goto L_0x014f
            r17.mo33466M()
            goto L_0x016b
        L_0x014f:
            android.os.Handler r0 = r1.f60437A
            kn0.i r2 = new kn0.i
            r2.<init>(r1)
            r0.post(r2)
            monitor-enter(r17)
        L_0x015a:
            x6.f r0 = r1.f60461p     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x016a
            r17.wait()     // Catch:{ InterruptedException -> 0x0162 }
            goto L_0x015a
        L_0x0162:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x016c }
            r0.interrupt()     // Catch:{ all -> 0x016c }
            goto L_0x015a
        L_0x016a:
            monitor-exit(r17)     // Catch:{ all -> 0x016c }
        L_0x016b:
            return
        L_0x016c:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x016c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kn0.C21365k.<init>(android.os.Handler, int, float, int, int, int, int, int, int):void");
    }
}
