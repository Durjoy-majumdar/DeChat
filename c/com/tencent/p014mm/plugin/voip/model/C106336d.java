package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.TimerTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import lu3.C34379c;
import lu3.C88654b;
import p1155sh.C110787a;
import p331dj.C107045e;
import pu0.C110248b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.d */
public class C106336d {

    /* renamed from: A */
    public int f317178A = 0;

    /* renamed from: B */
    public int f317179B = 1;

    /* renamed from: C */
    public int f317180C = 0;

    /* renamed from: D */
    public long f317181D = 0;

    /* renamed from: E */
    public int f317182E = 1;

    /* renamed from: F */
    public int f317183F = 0;

    /* renamed from: G */
    public int f317184G = -1;

    /* renamed from: H */
    public int f317185H = 0;

    /* renamed from: I */
    public int f317186I = 1;

    /* renamed from: J */
    public int f317187J = 0;

    /* renamed from: K */
    public final Object f317188K = new Object();

    /* renamed from: L */
    public int f317189L = 0;

    /* renamed from: M */
    public int f317190M = 0;

    /* renamed from: N */
    public int f317191N = 0;

    /* renamed from: O */
    public int f317192O = 0;

    /* renamed from: P */
    public int f317193P = 0;

    /* renamed from: Q */
    public int f317194Q = 0;

    /* renamed from: R */
    public C110787a f317195R;

    /* renamed from: a */
    public boolean f317196a = false;

    /* renamed from: b */
    public boolean f317197b = true;

    /* renamed from: c */
    public int f317198c = 2;

    /* renamed from: d */
    public int f317199d = 0;

    /* renamed from: e */
    public int f317200e = 0;

    /* renamed from: f */
    public byte[] f317201f = null;

    /* renamed from: g */
    public byte[] f317202g = null;

    /* renamed from: h */
    public byte[] f317203h = null;

    /* renamed from: i */
    public byte[] f317204i = null;

    /* renamed from: j */
    public byte[] f317205j = null;

    /* renamed from: k */
    public int f317206k = 0;

    /* renamed from: l */
    public int f317207l = 0;

    /* renamed from: m */
    public int f317208m = 0;

    /* renamed from: n */
    public int f317209n = 20;

    /* renamed from: o */
    public AudioTrack f317210o = null;

    /* renamed from: p */
    public AtomicBoolean f317211p = new AtomicBoolean(false);

    /* renamed from: q */
    public C106333b f317212q = null;

    /* renamed from: r */
    public C34379c<?> f317213r = null;

    /* renamed from: s */
    public int f317214s = 0;

    /* renamed from: t */
    public String f317215t = null;

    /* renamed from: u */
    public Context f317216u;

    /* renamed from: v */
    public boolean f317217v = false;

    /* renamed from: w */
    public C88654b f317218w;

    /* renamed from: x */
    public int f317219x = 0;

    /* renamed from: y */
    public int f317220y = 0;

    /* renamed from: z */
    public int f317221z = 0;

    /* renamed from: com.tencent.mm.plugin.voip.model.d$a */
    public class C106337a extends TimerTask {
        public C106337a() {
        }

        public void run() {
            C106333b bVar;
            System.currentTimeMillis();
            C106336d dVar = C106336d.this;
            if (dVar.f317214s == 1 && dVar.f317196a) {
                System.currentTimeMillis();
                C106336d dVar2 = C106336d.this;
                int i = dVar2.f317220y;
                int i2 = dVar2.f317209n;
                if (i + i2 < dVar2.f317200e && dVar2.f317194Q == 0 && (bVar = dVar2.f317212q) != null) {
                    dVar2.f317193P = 1;
                    int a = bVar.mo149458a(dVar2.f317205j, i2);
                    C106336d dVar3 = C106336d.this;
                    dVar3.f317193P = 0;
                    if (a < 0) {
                        Log.m105918d("MicroMsg.Voip.AudioPlayer", "Task AudioPlayer::  pDevCallBack.PlayDevDataCallBack ret :" + a);
                        return;
                    }
                    synchronized (dVar3.f317188K) {
                        C106336d dVar4 = C106336d.this;
                        System.arraycopy(dVar4.f317205j, 0, dVar4.f317202g, dVar4.f317220y, dVar4.f317209n);
                        C106336d dVar5 = C106336d.this;
                        dVar5.f317220y += dVar5.f317209n;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo152542a() {
        if (this.f317206k == 0) {
            Log.m105920e("MicroMsg.Voip.AudioPlayer", "nSamplerate is no init now  ");
            return 0;
        }
        AudioTrack audioTrack = this.f317210o;
        if (audioTrack == null) {
            Log.m105918d("MicroMsg.Voip.AudioPlayer", "  audioTrack==null,m_iPlayBufSizeOrg:" + this.f317178A + ",nSamplerate:" + this.f317206k);
            return (this.f317178A * 1000) / this.f317206k;
        } else if (!this.f317196a || audioTrack.getState() == 0) {
            return (this.f317178A * 1000) / this.f317206k;
        } else {
            try {
                return ((this.f317219x - this.f317210o.getPlaybackHeadPosition()) * 1000) / this.f317206k;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.Voip.AudioPlayer", "audioTrack getPlaybackHeadPosition error:%s", e.getMessage());
                return (this.f317178A * 1000) / this.f317206k;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:7|(2:(1:10)|11)|12|13|14|(2:16|17)|18|19|22|(4:26|(1:28)|(1:30)(1:31)|32)|33|(2:35|36)(2:37|(2:39|40)(4:41|(1:43)|44|45))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00a1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo152543b(android.content.Context r25, boolean r26) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "MicroMsg.Voip.AudioPlayer"
            java.lang.String r0 = "enter to Init..."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            r0 = r25
            r1.f317216u = r0
            int r0 = r1.f317207l
            r3 = 2
            r4 = 3
            if (r0 != r3) goto L_0x0016
            r1.f317198c = r4
            goto L_0x0018
        L_0x0016:
            r1.f317198c = r3
        L_0x0018:
            int r0 = r1.f317206k
            int r5 = r1.f317198c
            int r0 = android.media.AudioTrack.getMinBufferSize(r0, r5, r3)
            r1.f317199d = r0
            r5 = -2
            r6 = -1
            r7 = 1
            if (r0 == r5) goto L_0x01a0
            if (r0 != r6) goto L_0x002b
            goto L_0x01a0
        L_0x002b:
            r1.f317178A = r0
            int r5 = r1.f317182E
            int r5 = r5 * r0
            r1.f317183F = r5
            int r5 = r1.f317186I
            int r5 = r5 * r0
            r1.f317199d = r5
            int r0 = r0 >> r7
            float r0 = (float) r0
            int r5 = r1.f317206k
            float r5 = (float) r5
            float r0 = r0 / r5
            int r5 = p156gj.C107842p.m146108a()
            gj.c r8 = p156gj.C107835h0.f322846c
            int r8 = r8.f322766r0
            r5 = r5 & 1024(0x400, float:1.435E-42)
            r9 = 0
            if (r5 == 0) goto L_0x0063
            if (r8 > 0) goto L_0x004f
            r8 = 0
        L_0x004f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "CPU ARMv7, ablePlayTimer: "
            r5.append(r10)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
        L_0x0063:
            r1.f317197b = r9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "playBufSize:"
            r5.append(r8)
            int r8 = r1.f317199d
            r5.append(r8)
            java.lang.String r8 = "  MinBufSizeInMs:"
            r5.append(r8)
            r5.append(r0)
            java.lang.String r0 = ",bPlayTimer:"
            r5.append(r0)
            boolean r0 = r1.f317197b
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = r26
            int r5 = r1.mo152551j(r0)
            android.media.AudioTrack r0 = r1.f317210o     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x00a1
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f317211p     // Catch:{ Exception -> 0x00a1 }
            r0.compareAndSet(r9, r7)     // Catch:{ Exception -> 0x00a1 }
            android.media.AudioTrack r0 = r1.f317210o     // Catch:{ Exception -> 0x00a1 }
            r0.release()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            dj.e r0 = new dj.e     // Catch:{ Exception -> 0x00b9 }
            int r12 = r1.f317206k     // Catch:{ Exception -> 0x00b9 }
            int r13 = r1.f317198c     // Catch:{ Exception -> 0x00b9 }
            r14 = 2
            int r15 = r1.f317199d     // Catch:{ Exception -> 0x00b9 }
            r16 = 1
            r10 = r0
            r11 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00b9 }
            r1.f317210o = r0     // Catch:{ Exception -> 0x00b9 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f317211p     // Catch:{ Exception -> 0x00b9 }
            r0.compareAndSet(r7, r9)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00c6
        L_0x00b9:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r9] = r0
            java.lang.String r0 = "new AudioTrack:"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r8)
            r0 = 6
            r1.f317189L = r0
        L_0x00c6:
            android.media.AudioTrack r0 = r1.f317210o
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.getState()
            if (r0 != 0) goto L_0x011a
        L_0x00d0:
            r1.f317189L = r3
            java.lang.String r0 = "AudioPlayer audioTrack.getState() == AudioTrack.STATE_UNINITIALIZED"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            android.media.AudioTrack r0 = r1.f317210o
            if (r0 == 0) goto L_0x00e5
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f317211p
            r0.compareAndSet(r9, r7)
            android.media.AudioTrack r0 = r1.f317210o
            r0.release()
        L_0x00e5:
            if (r5 != 0) goto L_0x00fa
            dj.e r0 = new dj.e
            r11 = 3
            int r12 = r1.f317206k
            int r13 = r1.f317198c
            r14 = 2
            int r15 = r1.f317199d
            r16 = 1
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.f317210o = r0
            goto L_0x0115
        L_0x00fa:
            dj.e r0 = new dj.e
            r18 = 0
            int r8 = r1.f317206k
            int r10 = r1.f317198c
            r21 = 2
            int r11 = r1.f317199d
            r23 = 1
            r17 = r0
            r19 = r8
            r20 = r10
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r1.f317210o = r0
        L_0x0115:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f317211p
            r0.compareAndSet(r7, r9)
        L_0x011a:
            android.media.AudioTrack r0 = r1.f317210o
            if (r0 != 0) goto L_0x0126
            r1.f317189L = r4
            java.lang.String r0 = "null == audioTrack return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return r6
        L_0x0126:
            int r0 = r0.getState()
            if (r0 != 0) goto L_0x0141
            r1.f317189L = r4
            java.lang.String r0 = "AudioPlayer STATE_UNINITIALIZED call AudioTrack.release() and return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f317211p
            r0.compareAndSet(r9, r7)
            android.media.AudioTrack r0 = r1.f317210o
            r0.release()
            r0 = 0
            r1.f317210o = r0
            return r6
        L_0x0141:
            int r0 = r1.f317199d
            byte[] r6 = new byte[r0]
            r1.f317201f = r6
            int r6 = r1.f317209n
            byte[] r8 = new byte[r6]
            r1.f317204i = r8
            boolean r8 = r1.f317197b
            if (r8 == 0) goto L_0x015f
            r1.f317200e = r0
            byte[] r8 = new byte[r0]
            r1.f317202g = r8
            byte[] r0 = new byte[r0]
            r1.f317203h = r0
            byte[] r0 = new byte[r6]
            r1.f317205j = r0
        L_0x015f:
            r1.f317196a = r9
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r6 = pu0.C110248b.xx0()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r9] = r6
            pu0.b$a r6 = pu0.C110248b.f329777h
            boolean r6 = r6.mo161667l()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0[r7] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r3] = r5
            int r5 = r1.f317199d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            r4 = 4
            int r5 = r1.f317206k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r4 = "dkbt AudioTrack init ok, mode:%d issp:%b m:%d size %d,nSamplerate:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            int r0 = r1.f317199d
            int r0 = r0 * 1000
            int r2 = r1.f317206k
            int r2 = r2 * 2
            int r0 = r0 / r2
            return r0
        L_0x01a0:
            r1.f317189L = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106336d.mo152543b(android.content.Context, boolean):int");
    }

    /* renamed from: c */
    public int mo152544c(int i, int i2, int i3, int i4) {
        if (true == this.f317196a) {
            return 0;
        }
        this.f317206k = i;
        this.f317207l = i2;
        this.f317208m = i3;
        this.f317192O = i4;
        this.f317209n = (i / 1000) * i2 * i3 * 2;
        this.f317185H = (i * 60) / 1000;
        return 1;
    }

    /* renamed from: d */
    public int mo152545d() {
        int i;
        if (true == this.f317196a) {
            return 1;
        }
        AudioTrack audioTrack = this.f317210o;
        if (audioTrack == null) {
            Log.m105920e("MicroMsg.Voip.AudioPlayer", "audioTrack error: audioTrack is null!!");
            return 0;
        }
        this.f317196a = true;
        try {
            audioTrack.play();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Voip.AudioPlayer", "audioTrack.play Exception:%s", e.getMessage());
        }
        AudioTrack audioTrack2 = this.f317210o;
        if (audioTrack2 == null || audioTrack2.getPlayState() == 3) {
            AudioTrack audioTrack3 = this.f317210o;
            if (audioTrack3 == null || audioTrack3.getState() != 0) {
                if (this.f317197b) {
                    if (this.f317213r != null) {
                        Log.m105928w("MicroMsg.Voip.AudioPlayer", "Task has been created. " + this.f317213r);
                        i = -1;
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        Log.m105920e("MicroMsg.Voip.AudioPlayer", "InitAudioRecTimer failed, error code = " + i);
                        return 0;
                    }
                    this.f317213r = ((C119157j) C119157j.f356862d).mo183873d(new C106337a(), 0, 20);
                }
                this.f317195R = new C110787a();
                this.f317218w = new C106334c(this);
                ((C119157j) C119157j.f356862d).mo183894y("AudioPlayer_play");
                ((C119157j) C119157j.f356862d).mo183876g(this.f317218w, "AudioPlayer_play");
                return 1;
            }
            Log.m105920e("MicroMsg.Voip.AudioPlayer", "audioTrack error: AudioTrack.STATE_UNINITIALIZED, no more AudioTrack resource!!");
            return 0;
        }
        this.f317189L = 4;
        Log.m105920e("MicroMsg.Voip.AudioPlayer", "audioTrack play error: AudioTrack.PLAYSTATE_PLAYING, play do not start !");
        return 0;
    }

    /* renamed from: e */
    public int mo152546e() {
        C34379c<?> cVar = this.f317213r;
        if (cVar != null) {
            cVar.cancel(false);
            this.f317213r = null;
        }
        Log.m105924i("MicroMsg.Voip.AudioPlayer", "audio player call stop play");
        if (!this.f317196a) {
            Log.m105924i("MicroMsg.Voip.AudioPlayer", "audio player call stop play failed cause current is not playing ");
            return 1;
        }
        this.f317196a = false;
        this.f317187J = 0;
        try {
            C88654b bVar = this.f317218w;
            if (bVar != null) {
                try {
                    Future future = bVar.f255969d;
                    if (future != null && !future.isCancelled()) {
                        bVar.f255969d.get();
                    }
                } catch (ExecutionException e) {
                    Log.printErrStackTrace("MicroMsg.Voip.AudioPlayer", e, "", new Object[0]);
                }
            }
        } catch (InterruptedException | CancellationException e2) {
            Log.printErrStackTrace("MicroMsg.Voip.AudioPlayer", e2, "", new Object[0]);
        }
        try {
            if (this.f317210o != null) {
                this.f317211p.compareAndSet(false, true);
                this.f317218w.mo97819a();
                ((C119157j) C119157j.f356862d).mo183894y("AudioPlayer_play");
                this.f317210o.stop();
                this.f317210o.release();
                Log.m105924i("MicroMsg.Voip.AudioPlayer", "StopPlay stop audioTrack");
            }
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.Voip.AudioPlayer", "StopPlay audioTrack.stop Exception:%s", e3.getMessage());
        }
        return 1;
    }

    /* renamed from: f */
    public int mo152547f() {
        Log.m105924i("MicroMsg.Voip.AudioPlayer", "audio player call uninit");
        if (this.f317210o != null) {
            this.f317211p.compareAndSet(false, true);
            this.f317210o.release();
            this.f317210o = null;
        } else {
            Log.m105924i("MicroMsg.Voip.AudioPlayer", "audio player call uninit failed cause audio track is null");
        }
        this.f317196a = false;
        return 1;
    }

    /* renamed from: g */
    public int mo152548g() {
        AudioTrack audioTrack = this.f317210o;
        return audioTrack != null ? audioTrack.getStreamType() : mo152551j(true);
    }

    /* renamed from: h */
    public int mo152549h() {
        Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer  mAudioPlayErrState:" + this.f317189L);
        return this.f317189L;
    }

    /* renamed from: i */
    public int mo152550i() {
        AudioTrack audioTrack;
        AudioManager audioManager = (AudioManager) MMApplicationContext.getContext().getSystemService("audio");
        if (audioManager == null || (audioTrack = this.f317210o) == null) {
            return 0;
        }
        return audioManager.getStreamVolume(audioTrack.getStreamType());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r5 = r1.f322683C0;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo152551j(boolean r5) {
        /*
            r4 = this;
            gj.c r0 = p156gj.C107835h0.f322846c
            int r1 = r0.f322733b
            r2 = -1
            if (r1 <= 0) goto L_0x000e
            pu0.b$a r0 = pu0.C110248b.f329777h
            int r0 = r0.mo161663h(r5)
            goto L_0x0014
        L_0x000e:
            int r0 = r0.f322690G
            if (r0 <= r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r5 == 0) goto L_0x001e
            gj.c r1 = p156gj.C107835h0.f322846c
            int r1 = r1.f322692H
            if (r1 <= r2) goto L_0x001e
        L_0x001c:
            r0 = r1
            goto L_0x0027
        L_0x001e:
            if (r5 != 0) goto L_0x0027
            gj.c r1 = p156gj.C107835h0.f322846c
            int r1 = r1.f322694I
            if (r1 <= r2) goto L_0x0027
            goto L_0x001c
        L_0x0027:
            r1 = 1
            int r3 = r4.f317192O
            if (r1 != r3) goto L_0x0042
            gj.c r1 = p156gj.C107835h0.f322846c
            int r3 = r1.f322679A0
            if (r3 <= r2) goto L_0x0033
            r0 = r3
        L_0x0033:
            if (r5 == 0) goto L_0x003b
            int r3 = r1.f322681B0
            if (r3 <= r2) goto L_0x003b
            r0 = r3
            goto L_0x0042
        L_0x003b:
            if (r5 != 0) goto L_0x0042
            int r5 = r1.f322683C0
            if (r5 <= r2) goto L_0x0042
            r0 = r5
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106336d.mo152551j(boolean):int");
    }

    /* renamed from: k */
    public boolean mo152552k(boolean z) {
        Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer enter to switchSpeakerPhone...");
        int j = C110248b.Jh0() ? 0 : mo152551j(z);
        Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone:speakerOn:" + z + ":streamtype:" + j);
        AudioTrack audioTrack = this.f317210o;
        if (audioTrack == null || j != audioTrack.getStreamType()) {
            mo152546e();
            this.f317217v = true;
            if (this.f317207l == 2) {
                this.f317198c = 3;
            } else {
                this.f317198c = 2;
            }
            int minBufferSize = AudioTrack.getMinBufferSize(this.f317206k, this.f317198c, 2);
            this.f317199d = minBufferSize;
            if (minBufferSize == -2 || minBufferSize == -1) {
                this.f317217v = false;
                return false;
            }
            this.f317219x = 0;
            this.f317221z = 0;
            this.f317179B = 1;
            this.f317180C = 0;
            this.f317181D = 0;
            this.f317182E = 1;
            this.f317184G = -1;
            this.f317185H = 0;
            this.f317178A = minBufferSize;
            this.f317183F = minBufferSize * 1;
            this.f317199d = this.f317186I * minBufferSize;
            Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone:playBufSize:" + this.f317199d + "  MinBufSizeInMs:" + (((float) minBufferSize) / 16.0f));
            if (this.f317210o != null) {
                try {
                    this.f317211p.compareAndSet(false, true);
                    this.f317218w.mo97819a();
                    ((C119157j) C119157j.f356862d).mo183894y("AudioPlayer_play");
                    this.f317210o.stop();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone audioTrack.stop Exception:%s", e.getMessage());
                }
                this.f317210o.release();
                this.f317210o = null;
            }
            Log.m105925i("MicroMsg.Voip.AudioPlayer", "AudioPlayer dkbt switchSpeakerPhone mode:%d issp:%b m:%d size %d,nSamplerate:%d", Integer.valueOf(C110248b.xx0()), Boolean.valueOf(C110248b.f329777h.mo161667l()), Integer.valueOf(j), Integer.valueOf(this.f317199d), Integer.valueOf(this.f317206k));
            C107045e eVar = new C107045e(j, this.f317206k, this.f317198c, 2, this.f317199d, 1);
            this.f317210o = eVar;
            if (eVar.getState() == 0) {
                Log.m105920e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone STATE_UNINITIALIZED call AudioTrack.release() and return");
                this.f317211p.compareAndSet(false, true);
                this.f317210o.release();
                this.f317210o = null;
                return false;
            }
            Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer leave  switchSpeakerPhone...");
            if (this.f317210o != null) {
                this.f317217v = false;
                mo152545d();
                return true;
            }
            this.f317217v = false;
            return false;
        }
        Log.m105918d("MicroMsg.Voip.AudioPlayer", "switchSpeakerPhone:stream type do not need to  change");
        return false;
    }
}
