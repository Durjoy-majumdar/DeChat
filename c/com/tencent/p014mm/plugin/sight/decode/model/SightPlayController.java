package com.tencent.p014mm.plugin.sight.decode.model;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UIStatusChangedEvent;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.memory.C92716o;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import p331dj.C97481g;
import p682rz.C101485o;

/* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController */
public abstract class SightPlayController {

    /* renamed from: I */
    public static Map<String, Integer> f273459I = new ConcurrentHashMap();

    /* renamed from: A */
    public boolean f273460A = true;

    /* renamed from: B */
    public double f273461B = -1.0d;

    /* renamed from: C */
    public double f273462C = -1.0d;

    /* renamed from: D */
    public int f273463D;

    /* renamed from: E */
    public boolean f273464E = false;

    /* renamed from: F */
    public ChattingUIStatusListener f273465F;

    /* renamed from: G */
    public volatile C94564e f273466G;

    /* renamed from: H */
    public volatile C94565f f273467H;

    /* renamed from: a */
    public int f273468a = 0;

    /* renamed from: b */
    public int f273469b = 0;

    /* renamed from: c */
    public String f273470c = "";

    /* renamed from: d */
    public String f273471d = "";

    /* renamed from: e */
    public int f273472e = -1;

    /* renamed from: f */
    public Queue<Integer> f273473f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    public int f273474g = 41;

    /* renamed from: h */
    public Bitmap f273475h;

    /* renamed from: i */
    public WeakReference<View> f273476i;

    /* renamed from: j */
    public MMHandler f273477j;

    /* renamed from: k */
    public long f273478k;

    /* renamed from: l */
    public WeakReference<View> f273479l;

    /* renamed from: m */
    public Animation f273480m;

    /* renamed from: n */
    public Animation f273481n;

    /* renamed from: o */
    public volatile C94566h f273482o;

    /* renamed from: p */
    public volatile C94557b f273483p;

    /* renamed from: q */
    public volatile C94567i f273484q;

    /* renamed from: r */
    public volatile C94562c f273485r;

    /* renamed from: s */
    public C94569j f273486s;

    /* renamed from: t */
    public C94563d f273487t;

    /* renamed from: u */
    public C94565f f273488u = new C94556a(this);

    /* renamed from: v */
    public boolean f273489v = true;

    /* renamed from: w */
    public boolean f273490w = true;

    /* renamed from: x */
    public boolean f273491x = false;

    /* renamed from: y */
    public boolean f273492y = false;

    /* renamed from: z */
    public boolean f273493z = false;

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$g */
    public interface C30395g {
        /* renamed from: a */
        int mo57352a();

        /* renamed from: b */
        View mo57353b();

        /* renamed from: c */
        int mo57354c();
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$ChattingUIStatusListener */
    public static class ChattingUIStatusListener extends IListener<UIStatusChangedEvent> {

        /* renamed from: d */
        public int f273494d = 0;

        /* renamed from: e */
        public int f273495e = 0;

        /* renamed from: f */
        public int f273496f = 0;

        /* renamed from: g */
        public WeakReference<SightPlayController> f273497g;

        public ChattingUIStatusListener(SightPlayController sightPlayController) {
            super(C40008f.f107254d);
            this.f273497g = new WeakReference<>(sightPlayController);
            this.__eventId = 2023294236;
        }

        public boolean callback(IEvent iEvent) {
            UIStatusChangedEvent uIStatusChangedEvent = (UIStatusChangedEvent) iEvent;
            if (this.f273497g.get() != null) {
                Log.m105919d("MicroMsg.SightPlayController", "#0x%x on chatting status callback, type %d, selfPos %d, visiblePos[%d, %d], headerCount %d recording %B", Integer.valueOf(this.f273497g.get().hashCode()), Integer.valueOf(uIStatusChangedEvent.f193971d.f193972a), Integer.valueOf(this.f273497g.get().f273463D), Integer.valueOf(uIStatusChangedEvent.f193971d.f193973b), Integer.valueOf(uIStatusChangedEvent.f193971d.f193974c), Integer.valueOf(uIStatusChangedEvent.f193971d.f193975d), Boolean.valueOf(this.f273497g.get().f273464E));
                UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
                int i = aVar.f193972a;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 3) {
                            this.f273497g.get().mo130043c();
                        } else if (i == 5) {
                            this.f273494d = aVar.f193975d;
                            this.f273495e = aVar.f193973b;
                            this.f273496f = aVar.f193974c;
                            if (!mo130055e() || this.f273497g.get().f273464E) {
                                this.f273497g.get().mo130043c();
                            } else {
                                if (!"ERROR#PATH".equals(this.f273497g.get().f273471d) && !this.f273497g.get().f273470c.equals(this.f273497g.get().f273471d)) {
                                    Log.m105919d("MicroMsg.SightPlayController", "match diff path, change %s to %s", this.f273497g.get().f273470c, this.f273497g.get().f273471d);
                                    String str = this.f273497g.get().f273471d == null ? "" : this.f273497g.get().f273471d;
                                    this.f273497g.get().mo130043c();
                                    this.f273497g.get().f273470c = str;
                                    this.f273497g.get().f273471d = "ERROR#PATH";
                                }
                                this.f273497g.get().mo130053m();
                            }
                        } else if (i == 6) {
                            this.f273497g.get().f273464E = true;
                        } else if (i == 7 && this.f273497g.get().f273464E) {
                            this.f273497g.get().f273464E = false;
                        }
                    }
                    this.f273497g.get().mo130054n(false);
                }
                UIStatusChangedEvent.C67803a aVar2 = uIStatusChangedEvent.f193971d;
                this.f273494d = aVar2.f193975d;
                this.f273495e = aVar2.f193973b;
                this.f273496f = aVar2.f193974c;
                if (mo130055e() && !this.f273497g.get().f273464E) {
                    this.f273497g.get().mo130053m();
                }
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
            r0 = r3.f273497g.get().f273463D + r3.f273494d;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo130055e() {
            /*
                r3 = this;
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sight.decode.model.SightPlayController> r0 = r3.f273497g
                java.lang.Object r0 = r0.get()
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sight.decode.model.SightPlayController> r0 = r3.f273497g
                java.lang.Object r0 = r0.get()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = (com.tencent.p014mm.plugin.sight.decode.model.SightPlayController) r0
                int r0 = r0.f273463D
                int r2 = r3.f273494d
                int r0 = r0 + r2
                int r2 = r3.f273495e
                if (r0 < r2) goto L_0x0022
                int r2 = r3.f273496f
                if (r0 <= r2) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r0 = 1
                return r0
            L_0x0022:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.ChattingUIStatusListener.mo130055e():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$a */
    public class C94556a implements C94565f {
        public C94556a(SightPlayController sightPlayController) {
        }

        /* renamed from: a */
        public void mo130056a(SightPlayController sightPlayController, long j) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$b */
    public class C94557b implements Runnable {

        /* renamed from: d */
        public volatile boolean f273498d = false;

        /* renamed from: e */
        public C94562c f273499e;

        /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$a */
        public class C94558a implements Runnable {
            public C94558a() {
            }

            public void run() {
                SightPlayController.this.getClass();
                throw null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$b */
        public class C94559b implements Runnable {
            public C94559b() {
            }

            public void run() {
                SightPlayController.this.mo130051k((Bitmap) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$c */
        public class C94560c implements Runnable {
            public C94560c() {
            }

            public void run() {
                if (SightPlayController.this.f273466G != null) {
                    SightPlayController.this.f273466G.mo130064a(SightPlayController.this, 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$d */
        public class C94561d implements Runnable {
            public C94561d() {
            }

            public void run() {
                SightPlayController.this.getClass();
            }
        }

        public C94557b(C94556a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x02d7  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x030a  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x010a A[SYNTHETIC, Splitter:B:33:0x010a] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01e4  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x020e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r25 = this;
                r1 = r25
                java.lang.Class<rz.o> r2 = p682rz.C101485o.class
                java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r0 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r3.getClass()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r4 = r3.f273472e
                java.lang.String r5 = "MicroMsg.SightPlayController"
                r6 = 3
                r7 = 2
                r8 = 1
                r9 = 0
                if (r4 >= 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r6]
                int r2 = r3.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r9] = r2
                int r2 = r25.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r8] = r2
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                java.lang.String r2 = r2.f273470c
                r0[r7] = r2
                java.lang.String r2 = "#0x%x-#0x%x error video id, path %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r2, r0)
                return
            L_0x0039:
                boolean r3 = r1.f273498d
                if (r3 == 0) goto L_0x005b
                java.lang.Object[] r0 = new java.lang.Object[r7]
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r9] = r2
                int r2 = r25.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r8] = r2
                java.lang.String r2 = "#0x%x-#0x%x match stop decode cmd at beg"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r0)
                return
            L_0x005b:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                long r6 = r3.f273478k
                r10 = 0
                int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r4 != 0) goto L_0x007e
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r3 = r3.f273484q
                if (r3 == 0) goto L_0x0076
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r3 = r3.f273484q
                r3.f273512e = r8
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r3 = r3.f273484q
                r3.run()
            L_0x0076:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                long r6 = java.lang.System.currentTimeMillis()
                r3.f273478k = r6
            L_0x007e:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                double r3 = r3.f273462C
                r6 = 0
                r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r7 == 0) goto L_0x00c2
                di3.d r3 = di3.C86312j.m106911c(r0)
                com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                double r12 = r4.f273462C
                int r4 = r4.f273472e
                int r3 = r3.seekStream(r12, r4)
                if (r3 <= 0) goto L_0x00c2
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r3 = r3.f273484q
                if (r3 != 0) goto L_0x00aa
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r4 = new com.tencent.mm.plugin.sight.decode.model.SightPlayController$i
                r4.<init>(r6)
                r3.f273484q = r4
            L_0x00aa:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r3 = r3.f273484q
                r4 = 4
                r3.f273512e = r4
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r3 = r3.f273484q
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                double r6 = r4.f273462C
                r3.f273513f = r6
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r3 = r4.f273484q
                r3.run()
                r3 = 1
                goto L_0x00c3
            L_0x00c2:
                r3 = 0
            L_0x00c3:
                long r6 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                long r12 = r4.f273478k
                long r6 = r6 - r12
                float r6 = (float) r6
                if (r3 == 0) goto L_0x00d1
                r3 = 0
                goto L_0x00d8
            L_0x00d1:
                int r3 = r4.f273474g
                float r3 = (float) r3
                float r6 = r6 / r3
                r3 = 1056964608(0x3f000000, float:0.5)
                float r3 = r3 + r6
            L_0x00d8:
                r4.getClass()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                long r6 = java.lang.System.currentTimeMillis()
                r4.f273478k = r6
                r4 = 1073741824(0x40000000, float:2.0)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 < 0) goto L_0x00f1
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r6 = r4.f273468a
                int r6 = r6 + r8
                r4.f273468a = r6
                goto L_0x00fc
            L_0x00f1:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r6 = r4.f273468a
                int r6 = r6 - r8
                int r6 = java.lang.Math.max(r9, r6)
                r4.f273468a = r6
            L_0x00fc:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r4.mo130049i()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r4 = r4.f273469b
                java.lang.String r6 = "voice time is"
                if (r8 != r4) goto L_0x020e
                di3.d r4 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x01cc }
                r14 = r4
                com.tencent.mm.feature.sight.api.ISightJNIService r14 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r14     // Catch:{ Exception -> 0x01cc }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x01cc }
                int r15 = r4.f273472e     // Catch:{ Exception -> 0x01cc }
                r16 = 0
                int r3 = (int) r3     // Catch:{ Exception -> 0x01cc }
                r4.getClass()     // Catch:{ Exception -> 0x01cc }
                r18 = 0
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x01cc }
                boolean r4 = r4.f273460A     // Catch:{ Exception -> 0x01cc }
                r17 = r3
                r19 = r4
                int r3 = r14.drawSurfaceFrame(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x01cc }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$f r4 = r4.f273467H     // Catch:{ Exception -> 0x0168 }
                if (r4 == 0) goto L_0x0161
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$f r4 = r4.f273467H     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r7 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$f r7 = r7.f273488u     // Catch:{ Exception -> 0x0168 }
                if (r4 == r7) goto L_0x0161
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.feature.sight.api.ISightJNIService r0 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r0     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                int r4 = r4.f273472e     // Catch:{ Exception -> 0x0168 }
                double r14 = r0.getVideoPlayTime(r4)     // Catch:{ Exception -> 0x0168 }
                int r0 = (int) r14     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                double r12 = r4.f273461B     // Catch:{ Exception -> 0x0168 }
                int r7 = (int) r12     // Catch:{ Exception -> 0x0168 }
                if (r0 == r7) goto L_0x015d
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$f r4 = r4.f273467H     // Catch:{ Exception -> 0x0168 }
                if (r4 == 0) goto L_0x015d
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$f r4 = r4.f273467H     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r7 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                long r12 = (long) r0     // Catch:{ Exception -> 0x0168 }
                r4.mo130056a(r7, r12)     // Catch:{ Exception -> 0x0168 }
            L_0x015d:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                r0.f273461B = r14     // Catch:{ Exception -> 0x0168 }
            L_0x0161:
                if (r3 != 0) goto L_0x016a
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                r0.f273462C = r10     // Catch:{ Exception -> 0x0168 }
                goto L_0x01ca
            L_0x0168:
                r0 = move-exception
                goto L_0x01ce
            L_0x016a:
                if (r8 != r3) goto L_0x017c
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                r0.f273462C = r10     // Catch:{ Exception -> 0x0168 }
                r9 = 0
                r0.f273478k = r9     // Catch:{ Exception -> 0x0179 }
                com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.m119570a(r0)     // Catch:{ Exception -> 0x0179 }
                r0 = 1
                goto L_0x01de
            L_0x0179:
                r0 = move-exception
                r4 = 1
                goto L_0x01cf
            L_0x017c:
                r0 = -7
                if (r0 != r3) goto L_0x0186
                java.lang.String r0 = "surface is null, continue"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)     // Catch:{ Exception -> 0x0168 }
                goto L_0x01ca
            L_0x0186:
                java.lang.String r0 = "#0x%x-#0x%x draw surface match error:%d"
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r7 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                int r7 = r7.hashCode()     // Catch:{ Exception -> 0x0168 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0168 }
                r9 = 0
                r4[r9] = r7     // Catch:{ Exception -> 0x0168 }
                int r7 = r25.hashCode()     // Catch:{ Exception -> 0x0168 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0168 }
                r4[r8] = r7     // Catch:{ Exception -> 0x0168 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0168 }
                r9 = 2
                r4[r9] = r7     // Catch:{ Exception -> 0x0168 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r4)     // Catch:{ Exception -> 0x0168 }
                r1.f273498d = r8     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$c r0 = r1.f273499e     // Catch:{ Exception -> 0x0168 }
                if (r0 == 0) goto L_0x01b4
                r0.f273505d = r8     // Catch:{ Exception -> 0x0168 }
            L_0x01b4:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                r4 = 0
                r0.mo130044d(r4)     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G     // Catch:{ Exception -> 0x0168 }
                if (r0 == 0) goto L_0x01ca
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G     // Catch:{ Exception -> 0x0168 }
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this     // Catch:{ Exception -> 0x0168 }
                r7 = -1
                r0.mo130064a(r4, r7)     // Catch:{ Exception -> 0x0168 }
            L_0x01ca:
                r0 = 0
                goto L_0x01de
            L_0x01cc:
                r0 = move-exception
                r3 = 0
            L_0x01ce:
                r4 = 0
            L_0x01cf:
                java.lang.Object[] r7 = new java.lang.Object[r8]
                java.lang.String r0 = r0.getMessage()
                r9 = 0
                r7[r9] = r0
                java.lang.String r0 = "decode job:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r7)
                r0 = r4
            L_0x01de:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r4 = r4.f273484q
                if (r4 == 0) goto L_0x02c5
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r6)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r7 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r7 = r7.f273484q
                android.media.MediaPlayer r7 = r7.f273511d
                if (r7 != 0) goto L_0x01f7
                r9 = 0
                goto L_0x01fc
            L_0x01f7:
                int r7 = r7.getCurrentPosition()
                double r9 = (double) r7
            L_0x01fc:
                r11 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r9 = r9 / r11
                r4.append(r9)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
                goto L_0x02c5
            L_0x020e:
                di3.d r4 = di3.C86312j.m106911c(r0)
                r18 = r4
                com.tencent.mm.feature.sight.api.ISightJNIService r18 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r18
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r7 = r4.f273472e
                android.graphics.Bitmap r9 = r4.f273475h
                int r3 = (int) r3
                r22 = 0
                r23 = 0
                boolean r4 = r4.f273460A
                r19 = r7
                r20 = r9
                r21 = r3
                r24 = r4
                int r3 = r18.drawFrame(r19, r20, r21, r22, r23, r24)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$f r4 = r4.f273467H
                if (r4 == 0) goto L_0x0258
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.feature.sight.api.ISightJNIService r0 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r0
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r4 = r4.f273472e
                double r12 = r0.getVideoPlayTime(r4)
                int r0 = (int) r12
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                double r14 = r4.f273461B
                int r7 = (int) r14
                if (r0 == r7) goto L_0x0253
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$f r4 = r4.f273467H
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r7 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                long r14 = (long) r0
                r4.mo130056a(r7, r14)
            L_0x0253:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.f273461B = r12
                goto L_0x0262
            L_0x0258:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.getClass()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.getClass()
            L_0x0262:
                if (r3 != 0) goto L_0x0269
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.f273462C = r10
                goto L_0x02c4
            L_0x0269:
                if (r8 != r3) goto L_0x0278
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.f273462C = r10
                r9 = 0
                r0.f273478k = r9
                com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.m119570a(r0)
                r0 = 1
                goto L_0x02c5
            L_0x0278:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.f273462C = r10
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r0 = r0.hashCode()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7 = 0
                r4[r7] = r0
                int r0 = r25.hashCode()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4[r8] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                r7 = 2
                r4[r7] = r0
                java.lang.String r0 = "#0x%x-#0x%x draw bitmap match error:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r4)
                r1.f273498d = r8
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$c r0 = r1.f273499e
                if (r0 == 0) goto L_0x02a8
                r0.f273505d = r8
            L_0x02a8:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f273477j
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$b r4 = new com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$b
                r4.<init>()
                r0.post(r4)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G
                if (r0 == 0) goto L_0x02c4
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r7 = -1
                r0.mo130064a(r4, r7)
            L_0x02c4:
                r0 = 0
            L_0x02c5:
                if (r8 != r3) goto L_0x02d3
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r3 = r3.f273477j
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$c r4 = new com.tencent.mm.plugin.sight.decode.model.SightPlayController$b$c
                r4.<init>()
                r3.post(r4)
            L_0x02d3:
                boolean r3 = r1.f273498d
                if (r3 == 0) goto L_0x030a
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r0[r3] = r2
                int r2 = r25.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r8] = r2
                java.lang.String r2 = "#0x%x-#0x%x match stop decode cmd at end"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r0)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r0 = r0.f273484q
                if (r0 == 0) goto L_0x0309
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r0 = r0.f273484q
                r0.f273512e = r3
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r0 = r0.f273484q
                r0.run()
            L_0x0309:
                return
            L_0x030a:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r4 = r3.f273469b
                if (r8 != r4) goto L_0x034c
                int r0 = r3.f273474g
                long r3 = (long) r0
                long r7 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                long r9 = r0.f273478k
                long r7 = r7 - r9
                long r3 = r3 - r7
                r7 = 0
                int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r0 != 0) goto L_0x0334
                di3.d r0 = di3.C86312j.m106911c(r2)
                rz.o r0 = (p682rz.C101485o) r0
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r2 = r2.f273474g
                int r2 = r2 * 5
                long r2 = (long) r2
                r0.mo140808fO(r1, r2)
                goto L_0x035f
            L_0x0334:
                int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x0342
                di3.d r0 = di3.C86312j.m106911c(r2)
                rz.o r0 = (p682rz.C101485o) r0
                r0.mo140808fO(r1, r3)
                goto L_0x035f
            L_0x0342:
                di3.d r0 = di3.C86312j.m106911c(r2)
                rz.o r0 = (p682rz.C101485o) r0
                r0.mo140808fO(r1, r7)
                goto L_0x035f
            L_0x034c:
                if (r0 == 0) goto L_0x0351
                r3.getClass()
            L_0x0351:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$c r0 = r1.f273499e
                r0.getClass()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f273477j
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$c r2 = r1.f273499e
                r0.post(r2)
            L_0x035f:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r0 = r0.f273484q
                if (r0 == 0) goto L_0x038d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$i r2 = r2.f273484q
                android.media.MediaPlayer r2 = r2.f273511d
                if (r2 != 0) goto L_0x0378
                r12 = 0
                goto L_0x037d
            L_0x0378:
                int r2 = r2.getCurrentPosition()
                double r12 = (double) r2
            L_0x037d:
                r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r12 = r12 / r2
                r0.append(r12)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            L_0x038d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.C94557b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$c */
    public class C94562c implements Runnable {

        /* renamed from: d */
        public volatile boolean f273505d = false;

        /* renamed from: e */
        public C94557b f273506e;

        public C94562c() {
            Log.m105924i("MicroMsg.SightPlayController", "make sure drawJob alive");
        }

        public void run() {
            Class cls = C101485o.class;
            if (this.f273505d) {
                Log.m105921e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", Integer.valueOf(SightPlayController.this.hashCode()), Integer.valueOf(hashCode()));
                return;
            }
            SightPlayController sightPlayController = SightPlayController.this;
            sightPlayController.mo130051k(sightPlayController.f273475h);
            SightPlayController sightPlayController2 = SightPlayController.this;
            if (sightPlayController2.f273478k == 0) {
                ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273506e, 0);
                return;
            }
            long currentTimeMillis = ((long) sightPlayController2.f273474g) - (System.currentTimeMillis() - SightPlayController.this.f273478k);
            if (currentTimeMillis > 0) {
                ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273506e, currentTimeMillis);
            } else {
                ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273506e, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$d */
    public class C94563d implements Runnable {
        public C94563d(C94556a aVar) {
        }

        public void run() {
            if (SightPlayController.this.f273479l.get() != null) {
                SightPlayController.this.f273479l.get().startAnimation(SightPlayController.this.f273480m);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$e */
    public interface C94564e {
        /* renamed from: a */
        void mo130064a(SightPlayController sightPlayController, int i);
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$f */
    public interface C94565f {
        /* renamed from: a */
        void mo130056a(SightPlayController sightPlayController, long j);
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$h */
    public class C94566h implements Runnable {

        /* renamed from: d */
        public volatile boolean f273509d = false;

        public C94566h(C94556a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x01a2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                java.lang.Class<rz.o> r0 = p682rz.C101485o.class
                java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r1 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r2.mo130049i()
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                di3.d r3 = di3.C86312j.m106911c(r1)
                com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                java.lang.String r5 = r4.f273470c
                int r4 = r4.f273469b
                r6 = 0
                r7 = 1
                if (r7 != r4) goto L_0x001d
                r4 = 0
                goto L_0x001e
            L_0x001d:
                r4 = 1
            L_0x001e:
                int r3 = r3.openFileVFS(r5, r4, r7, r6)
                r2.f273472e = r3
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r4 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                java.lang.String r5 = r4.f273470c
                r3[r6] = r5
                int r4 = r4.f273472e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r7] = r4
                java.lang.String r4 = "MicroMsg.SightPlayController"
                java.lang.String r5 = "SightVideoJNI.openFile mVideoPath:%s mVideoId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                java.util.Queue<java.lang.Integer> r5 = r3.f273473f
                int r3 = r3.f273472e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
                r5.offer(r3)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r3 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r3 = r3.f273472e
                r5 = 4
                r8 = -1
                r9 = 3
                r10 = 0
                if (r3 >= 0) goto L_0x0097
                java.lang.Object[] r0 = new java.lang.Object[r5]
                int r1 = r15.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r6] = r1
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r1 = r1.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r7] = r1
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r1 = r1.f273472e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r2] = r1
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                java.lang.String r1 = r1.f273470c
                r0[r9] = r1
                java.lang.String r1 = "#0x%x-#0x%x error video id %d, path %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r0)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.mo130044d(r10)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G
                if (r0 == 0) goto L_0x0096
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.mo130064a(r1, r8)
            L_0x0096:
                return
            L_0x0097:
                di3.d r3 = di3.C86312j.m106911c(r1)
                com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r5 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r5 = r5.f273472e
                int r3 = r3.getVideoWidth(r5)
                int r3 = java.lang.Math.max(r7, r3)
                di3.d r5 = di3.C86312j.m106911c(r1)
                com.tencent.mm.feature.sight.api.ISightJNIService r5 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r5
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r11 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r11 = r11.f273472e
                int r5 = r5.getVideoHeight(r11)
                int r5 = java.lang.Math.max(r7, r5)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r11 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r12 = r11.f273469b
                if (r12 != 0) goto L_0x01d6
                boolean r12 = r11.f273491x
                if (r12 == 0) goto L_0x00e4
                int r12 = r3 * r5
                r13 = 2073600(0x1fa400, float:2.905732E-39)
                if (r12 > r13) goto L_0x00d0
                if (r3 <= 0) goto L_0x00d0
                if (r5 > 0) goto L_0x00f0
            L_0x00d0:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0[r7] = r1
                java.lang.String r1 = "get error info for ad,  videoWidth %d height  %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
                return
            L_0x00e4:
                int r12 = r3 * r5
                r13 = 1048576(0x100000, float:1.469368E-39)
                if (r12 >= r13) goto L_0x01c2
                if (r3 <= 0) goto L_0x01c2
                if (r5 > 0) goto L_0x00f0
                goto L_0x01c2
            L_0x00f0:
                java.lang.Object[] r12 = new java.lang.Object[r9]
                int r13 = r11.hashCode()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r12[r6] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
                r12[r7] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
                r12[r2] = r13
                java.lang.String r13 = "#0x%x check bmp, video width %d, height %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r13, r12)
                android.graphics.Bitmap r12 = r11.f273475h
                if (r12 != 0) goto L_0x012b
                com.tencent.mm.memory.o r12 = com.tencent.p014mm.memory.C92716o.f266827d
                com.tencent.mm.memory.o$b r13 = new com.tencent.mm.memory.o$b
                r13.<init>(r3, r5)
                android.graphics.Bitmap r12 = r12.mo126927l(r13)
                r11.f273475h = r12
                java.lang.Object[] r12 = new java.lang.Object[r7]
                java.lang.String r11 = r11.f273470c
                r12[r6] = r11
                java.lang.String r11 = "checkBmp, create new one, videoPath: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r11, r12)
                goto L_0x01d6
            L_0x012b:
                int r12 = r12.getWidth()
                if (r12 != r3) goto L_0x0139
                android.graphics.Bitmap r12 = r11.f273475h
                int r12 = r12.getHeight()
                if (r12 == r5) goto L_0x01d6
            L_0x0139:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "reset bmp, old value "
                r12.append(r13)
                android.graphics.Bitmap r13 = r11.f273475h
                int r13 = r13.getWidth()
                r12.append(r13)
                java.lang.String r13 = "*"
                r12.append(r13)
                android.graphics.Bitmap r13 = r11.f273475h
                int r13 = r13.getHeight()
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r12)
                r12 = 19
                boolean r12 = p206nj.C11171e.m11046c(r12)
                if (r12 == 0) goto L_0x019f
                android.graphics.Bitmap r12 = r11.f273475h
                int r12 = r12.getAllocationByteCount()
                int r13 = r5 * r3
                int r13 = r13 * 4
                if (r12 < r13) goto L_0x019f
                java.lang.String r12 = "reset bmp, try directly reconfigure"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r12)     // Catch:{ Exception -> 0x0185 }
                android.graphics.Bitmap r12 = r11.f273475h     // Catch:{ Exception -> 0x0185 }
                android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0185 }
                r12.reconfigure(r3, r5, r13)     // Catch:{ Exception -> 0x0185 }
                r12 = 1
                goto L_0x01a0
            L_0x0185:
                r12 = move-exception
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "reconfigure failed: %s"
                r13.append(r14)
                java.lang.String r12 = r12.getMessage()
                r13.append(r12)
                java.lang.String r12 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)
            L_0x019f:
                r12 = 0
            L_0x01a0:
                if (r12 != 0) goto L_0x01b6
                com.tencent.mm.memory.o r12 = com.tencent.p014mm.memory.C92716o.f266827d
                android.graphics.Bitmap r13 = r11.f273475h
                r12.mo126928m(r13)
                com.tencent.mm.memory.o r12 = com.tencent.p014mm.memory.C92716o.f266827d
                com.tencent.mm.memory.o$b r13 = new com.tencent.mm.memory.o$b
                r13.<init>(r3, r5)
                android.graphics.Bitmap r12 = r12.mo126927l(r13)
                r11.f273475h = r12
            L_0x01b6:
                java.lang.Object[] r12 = new java.lang.Object[r7]
                java.lang.String r11 = r11.f273470c
                r12[r6] = r11
                java.lang.String r11 = "checkBmp, the origin bmp size not match, create new one, videoPath: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r11, r12)
                goto L_0x01d6
            L_0x01c2:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0[r7] = r1
                java.lang.String r1 = "get error info videoWidth %d height  %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
                return
            L_0x01d6:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r11 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r11.getClass()
                di3.d r1 = di3.C86312j.m106911c(r1)
                com.tencent.mm.feature.sight.api.ISightJNIService r1 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r1
                int r12 = r11.f273472e
                double r12 = r1.getVideoRate(r12)
                int r1 = (int) r12
                int r1 = java.lang.Math.max(r7, r1)
                r12 = 1000(0x3e8, float:1.401E-42)
                int r12 = r12 / r1
                r11.f273474g = r12
                java.lang.Object[] r12 = new java.lang.Object[r9]
                int r13 = r11.hashCode()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r12[r6] = r13
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r12[r7] = r1
                int r1 = r11.f273474g
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r12[r2] = r1
                java.lang.String r1 = "#0x%x update video rate to %d fps, delay %d ms"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r12)
                float r1 = (float) r3
                float r2 = (float) r5
                float r11 = r1 / r2
                r12 = 1084227584(0x40a00000, float:5.0)
                int r11 = java.lang.Float.compare(r11, r12)
                r13 = 0
                if (r11 > 0) goto L_0x02af
                float r2 = r2 / r1
                int r1 = java.lang.Float.compare(r2, r12)
                if (r1 <= 0) goto L_0x0227
                goto L_0x02af
            L_0x0227:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r1.mo130052l(r3, r5)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r2 = r1.f273469b
                if (r7 != r2) goto L_0x024f
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b r2 = new com.tencent.mm.plugin.sight.decode.model.SightPlayController$b
                r2.<init>(r10)
                r1.f273483p = r2
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r1.f273485r = r10
                boolean r1 = r15.f273509d
                if (r1 != 0) goto L_0x0284
                di3.d r0 = di3.C86312j.m106911c(r0)
                rz.o r0 = (p682rz.C101485o) r0
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b r1 = r1.f273483p
                r0.mo140808fO(r1, r13)
                goto L_0x0284
            L_0x024f:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b r2 = new com.tencent.mm.plugin.sight.decode.model.SightPlayController$b
                r2.<init>(r10)
                r1.f273483p = r2
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$c r2 = new com.tencent.mm.plugin.sight.decode.model.SightPlayController$c
                r2.<init>()
                r1.f273485r = r2
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b r1 = r1.f273483p
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$c r2 = r2.f273485r
                r1.f273499e = r2
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$c r1 = r1.f273485r
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b r2 = r2.f273483p
                r1.f273506e = r2
                boolean r1 = r15.f273509d
                if (r1 != 0) goto L_0x0284
                di3.d r0 = di3.C86312j.m106911c(r0)
                rz.o r0 = (p682rz.C101485o) r0
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$b r1 = r1.f273483p
                r0.mo140808fO(r1, r13)
            L_0x0284:
                boolean r0 = r15.f273509d
                if (r0 == 0) goto L_0x02ae
                java.lang.Object[] r0 = new java.lang.Object[r9]
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                int r1 = r1.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r6] = r1
                int r1 = r15.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r7] = r1
                boolean r1 = r15.f273509d
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = "#0x%x-#0x%x open file end, match stop %B"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
            L_0x02ae:
                return
            L_0x02af:
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0[r7] = r1
                java.lang.String r1 = "ERROR Video size %d, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r0)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                java.lang.String r0 = r0.f273470c
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x02dd
                java.util.Map<java.lang.String, java.lang.Integer> r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.f273459I
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                java.lang.String r1 = r1.f273470c
                r2 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                r0.put(r1, r2)
            L_0x02dd:
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.f273478k = r13
                java.util.Queue<java.lang.Integer> r1 = r0.f273473f
                r0.mo130045e(r1)
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.f273472e = r8
                java.lang.String r1 = ""
                r0.f273470c = r1
                java.lang.String r1 = "ERROR#PATH"
                r0.f273471d = r1
                r0.getClass()
                r15.f273509d = r7
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G
                if (r0 == 0) goto L_0x0306
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r0 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                com.tencent.mm.plugin.sight.decode.model.SightPlayController$e r0 = r0.f273466G
                com.tencent.mm.plugin.sight.decode.model.SightPlayController r1 = com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.this
                r0.mo130064a(r1, r8)
            L_0x0306:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sight.decode.model.SightPlayController.C94566h.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$i */
    public class C94567i implements Runnable {

        /* renamed from: d */
        public MediaPlayer f273511d;

        /* renamed from: e */
        public int f273512e;

        /* renamed from: f */
        public double f273513f = -1.0d;

        /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$i$a */
        public class C94568a implements MediaPlayer.OnErrorListener {
            public C94568a() {
            }

            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                Log.m105921e("MicroMsg.SightPlayController", "on error: play %s ERROR!! %d %d", SightPlayController.this.f273470c, Integer.valueOf(i), Integer.valueOf(i2));
                SightPlayController.this.mo130043c();
                if (SightPlayController.this.f273466G != null) {
                    SightPlayController.this.f273466G.mo130064a(SightPlayController.this, -1);
                }
                return true;
            }
        }

        public C94567i(C94556a aVar) {
        }

        /* renamed from: a */
        public final void mo130066a() {
            Log.m105924i("MicroMsg.SightPlayController", "stopPlayer");
            try {
                MediaPlayer mediaPlayer = this.f273511d;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    this.f273511d.release();
                    this.f273511d = null;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SightPlayController", e, "stop play sound error: %s", e.getMessage());
                this.f273511d = null;
            }
        }

        public void run() {
            Object[] objArr = new Object[1];
            int i = this.f273512e;
            objArr[0] = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "seek" : "resume" : "pause" : IXWebBroadcastListener.STAGE_START : "stop";
            Log.m105925i("MicroMsg.SightPlayController", "do play sound, operation %s", objArr);
            int i2 = this.f273512e;
            if (i2 == 0) {
                mo130066a();
            } else if (i2 == 1) {
                mo130066a();
                if (!Util.isNullOrNil(SightPlayController.this.f273470c)) {
                    try {
                        C97481g gVar = new C97481g();
                        this.f273511d = gVar;
                        gVar.setDisplay((SurfaceHolder) null);
                        this.f273511d.reset();
                        this.f273511d.setDataSource(C86013q1.m106448i(SightPlayController.this.f273470c, false));
                        this.f273511d.setAudioStreamType(3);
                        this.f273511d.setOnErrorListener(new C94568a());
                        this.f273511d.prepare();
                        this.f273511d.start();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.SightPlayController", e, "play sound error: %s", e.getMessage());
                        Log.m105921e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", SightPlayController.this.f273470c);
                        SightPlayController.this.mo130043c();
                        if (SightPlayController.this.f273466G != null) {
                            SightPlayController.this.f273466G.mo130064a(SightPlayController.this, -1);
                        }
                    }
                }
            } else if (i2 == 2) {
                try {
                    MediaPlayer mediaPlayer = this.f273511d;
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        this.f273511d.pause();
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.SightPlayController", e2, "pause sound error: %s", e2.getMessage());
                    mo130066a();
                }
            } else if (i2 == 3) {
                try {
                    MediaPlayer mediaPlayer2 = this.f273511d;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.start();
                    }
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.SightPlayController", e3, "pause sound error: %s", e3.getMessage());
                    mo130066a();
                }
            } else if (i2 == 4) {
                try {
                    Log.m105925i("MicroMsg.SightPlayController", "soundplayer seek %f", Double.valueOf(this.f273513f));
                    this.f273511d.seekTo((int) (this.f273513f * 1000.0d));
                } catch (Exception e4) {
                    Log.printErrStackTrace("MicroMsg.SightPlayController", e4, "seek sound error: %s", e4.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$j */
    public class C94569j implements Runnable {

        /* renamed from: d */
        public WeakReference<Bitmap> f273516d = new WeakReference<>((Object) null);

        /* renamed from: com.tencent.mm.plugin.sight.decode.model.SightPlayController$j$a */
        public class C94570a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f273518d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f273519e;

            public C94570a(C94569j jVar, View view, Bitmap bitmap) {
                this.f273518d = view;
                this.f273519e = bitmap;
            }

            public void run() {
                this.f273518d.setBackgroundDrawable(new BitmapDrawable(this.f273519e));
            }
        }

        public C94569j(C94556a aVar) {
        }

        public void run() {
            try {
                SightPlayController.this.getClass();
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(SightPlayController.this.hashCode());
                objArr[1] = Integer.valueOf(hashCode());
                SightPlayController.this.getClass();
                objArr[2] = true;
                objArr[3] = Boolean.valueOf(SightPlayController.this.f273476i == null);
                objArr[4] = Boolean.valueOf(this.f273516d.get() == null);
                SightPlayController.this.getClass();
                objArr[5] = true;
                Log.m105929w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", objArr);
                SightPlayController.this.getClass();
                Bitmap bitmap = this.f273516d.get();
                WeakReference<View> weakReference = SightPlayController.this.f273476i;
                View view = weakReference != null ? weakReference.get() : null;
                if (!(view == null || bitmap == null)) {
                    if (!bitmap.isRecycled()) {
                        view.post(new C94570a(this, view, bitmap));
                        return;
                    }
                }
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(view == null);
                objArr2[1] = Boolean.valueOf(bitmap == null);
                Log.m105921e("MicroMsg.SightPlayController", "bgView:%B, thumb:%B", objArr2);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SightPlayController", e, "", new Object[0]);
            }
        }
    }

    static {
        new HashMap();
    }

    public SightPlayController(int i, View view) {
        this.f273469b = i;
        this.f273477j = new MMHandler(Looper.getMainLooper());
        this.f273479l = new WeakReference<>(view);
        Log.m105925i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m119570a(SightPlayController sightPlayController) {
        if (sightPlayController.f273479l != null && -1 != sightPlayController.mo130047g() && sightPlayController.f273489v && !sightPlayController.f273492y) {
            if (sightPlayController.f273480m == null && sightPlayController.f273479l.get() != null) {
                sightPlayController.f273480m = AnimationUtils.loadAnimation(sightPlayController.f273479l.get().getContext(), sightPlayController.mo130047g());
            }
            if (sightPlayController.f273487t == null) {
                sightPlayController.f273487t = new C94563d((C94556a) null);
            }
            sightPlayController.f273477j.post(sightPlayController.f273487t);
        }
    }

    /* renamed from: b */
    public static boolean m119571b(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        Integer num = (Integer) ((ConcurrentHashMap) f273459I).get(str);
        return num == null || 2 != num.intValue();
    }

    /* renamed from: c */
    public void mo130043c() {
        Log.m105925i("MicroMsg.SightPlayController", "#0x%x do clear, remove render job, video id %d, runing %B", Integer.valueOf(hashCode()), Integer.valueOf(this.f273472e), Boolean.valueOf(mo130050j()));
        mo130054n(true);
        this.f273478k = 0;
        mo130045e(this.f273473f);
        this.f273472e = -1;
        this.f273470c = "";
        this.f273471d = "ERROR#PATH";
        this.f273461B = 0.0d;
        C92716o.f266827d.mo126928m(this.f273475h);
        this.f273475h = null;
    }

    /* renamed from: d */
    public void mo130044d(Bitmap bitmap) {
        Class cls = C101485o.class;
        boolean z = true;
        Object[] objArr = new Object[1];
        if (bitmap != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.SightPlayController", "draw surface thumb, thumb is null ? %B", objArr);
        ((C101485o) C86312j.m106911c(cls)).mo140807aL(this.f273486s);
        if (this.f273486s == null) {
            this.f273486s = new C94569j((C94556a) null);
        }
        this.f273486s.f273516d = new WeakReference<>(bitmap);
        ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273486s, 0);
    }

    /* renamed from: e */
    public final void mo130045e(Queue<Integer> queue) {
        while (true) {
            Integer poll = queue.poll();
            if (poll != null) {
                ((C101485o) C86312j.m106911c(C101485o.class)).mo140808fO(new C30397c(this, poll.intValue()), 0);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public double mo130046f() {
        if (this.f273472e == -1) {
            return 0.0d;
        }
        return ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).getVideoDuration(this.f273472e);
    }

    /* renamed from: g */
    public int mo130047g() {
        return -1;
    }

    /* renamed from: h */
    public IListener mo130048h() {
        if (this.f273465F == null) {
            this.f273465F = new ChattingUIStatusListener(this);
        }
        return this.f273465F;
    }

    /* renamed from: i */
    public final boolean mo130049i() {
        if (!this.f273493z && this.f273468a >= 3) {
            Log.m105926v("MicroMsg.SightPlayController", "match not check bad fps, but now is bad fps");
            this.f273468a = 0;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo130050j() {
        return 1 == this.f273469b ? this.f273483p != null && !this.f273483p.f273498d : this.f273485r != null && !this.f273485r.f273505d && this.f273483p != null && !this.f273483p.f273498d;
    }

    /* renamed from: k */
    public abstract void mo130051k(Bitmap bitmap);

    /* renamed from: l */
    public abstract void mo130052l(int i, int i2);

    /* renamed from: m */
    public void mo130053m() {
        Class cls = C101485o.class;
        Log.m105925i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", Integer.valueOf(hashCode()), Boolean.valueOf(this.f273490w), this.f273470c, Integer.valueOf(this.f273472e));
        if (!this.f273490w) {
            mo130043c();
        } else if (mo130050j()) {
            Log.m105929w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", Integer.valueOf(hashCode()), this.f273470c);
        } else {
            mo130054n(this.f273472e < 0);
            this.f273478k = 0;
            mo130049i();
            if (this.f273472e < 0) {
                Log.m105929w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", Integer.valueOf(hashCode()), this.f273470c);
                if (!Util.isNullOrNil(this.f273470c)) {
                    if (!m119571b(this.f273470c)) {
                        Log.m105928w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                        mo130043c();
                        return;
                    }
                    this.f273482o = new C94566h((C94556a) null);
                    ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273482o, 0);
                }
            } else if (1 == this.f273469b) {
                this.f273483p = new C94557b((C94556a) null);
                this.f273485r = null;
                ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273483p, 0);
            } else {
                this.f273483p = new C94557b((C94556a) null);
                this.f273485r = new C94562c();
                this.f273483p.f273499e = this.f273485r;
                this.f273485r.f273506e = this.f273483p;
                ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273483p, 0);
            }
        }
    }

    /* renamed from: n */
    public void mo130054n(boolean z) {
        Class cls = C101485o.class;
        if (this.f273482o != null) {
            ((C101485o) C86312j.m106911c(cls)).mo140807aL(this.f273482o);
            this.f273482o.f273509d = true;
        }
        if (this.f273485r != null) {
            this.f273477j.removeCallbacks(this.f273485r);
            this.f273485r.f273505d = true;
        }
        if (this.f273483p != null) {
            ((C101485o) C86312j.m106911c(cls)).mo140807aL(this.f273483p);
            this.f273483p.f273498d = true;
        }
        if (this.f273484q != null) {
            this.f273484q.f273512e = z ? 0 : 2;
            ((C101485o) C86312j.m106911c(cls)).mo140808fO(this.f273484q, 0);
        }
    }
}
