package wp3;

import android.graphics.Bitmap;
import com.tencent.tav.player.Player;
import com.tencent.tav.player.PlayerItem;
import com.tencent.tavkit.composition.TAVSource;
import gy3.C87412m;
import sp3.C110807k;
import yp3.C112478a;

/* renamed from: wp3.g */
public final class C111829g {

    /* renamed from: a */
    public Player f334836a;

    /* renamed from: b */
    public TAVSource f334837b;

    /* renamed from: c */
    public PlayerItem f334838c;

    /* renamed from: d */
    public C111823a f334839d;

    /* renamed from: e */
    public int f334840e;

    /* renamed from: f */
    public int f334841f;

    /* renamed from: g */
    public boolean f334842g;

    /* renamed from: h */
    public boolean f334843h;

    /* renamed from: i */
    public C111825c f334844i;

    /* renamed from: j */
    public C110807k f334845j;

    public C111829g(C110807k kVar) {
        C87412m.m108595h(kVar, "composition");
        this.f334845j = kVar;
        TAVSource c = C110807k.m150874c(kVar, false, 1, (Object) null);
        this.f334837b = c;
        PlayerItem playerItem = new PlayerItem(c.getAsset());
        this.f334838c = playerItem;
        playerItem.setVideoComposition(this.f334837b.getVideoComposition());
        this.f334838c.setAudioMix(this.f334837b.getAudioMix());
        Bitmap bitmap = this.f334845j.f331513n;
        if (bitmap != null) {
            this.f334838c.setEnableLut(true, bitmap);
        }
        PlayerItem playerItem2 = this.f334838c;
        playerItem2.setDecoderFactory(this.f334845j.f331516q);
        Player player = new Player(playerItem2);
        this.f334836a = player;
        player.setPlayRange(this.f334845j.mo162387j());
        this.f334845j.getClass();
        this.f334842g = false;
        this.f334843h = false;
        Player player2 = this.f334836a;
        if (player2 != null) {
            player2.setPlayerListener(new C111826d(this));
        }
        C112478a.m153625c("VideoCompositionPlayer", "create player, composition:" + this.f334845j, new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.currentTime();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo163542a() {
        /*
            r4 = this;
            com.tencent.tav.player.Player r0 = r4.f334836a
            if (r0 == 0) goto L_0x000f
            com.tencent.tav.coremedia.CMTime r0 = r0.currentTime()
            if (r0 == 0) goto L_0x000f
            long r0 = r0.getTimeUs()
            goto L_0x0011
        L_0x000f:
            r0 = 0
        L_0x0011:
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 / r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wp3.C111829g.mo163542a():long");
    }

    /* renamed from: b */
    public final void mo163543b(boolean z) {
        C112478a.m153625c("VideoCompositionPlayer", "setLoop:" + z, new Object[0]);
        Player player = this.f334836a;
        if (player != null) {
            player.setLoop(z);
        }
    }

    /* renamed from: c */
    public final void mo163544c() {
        Player player;
        C112478a.m153625c("VideoCompositionPlayer", "start, isUpdatingComposition:" + this.f334843h, new Object[0]);
        if (!this.f334843h && (player = this.f334836a) != null) {
            player.play();
        }
        this.f334842g = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163545d(sp3.C110807k r17, boolean r18, boolean r19, long r20) {
        /*
            r16 = this;
            r9 = r16
            r0 = r17
            r1 = r19
            r2 = r20
            java.lang.String r4 = "composition"
            gy3.C87412m.m108595h(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "updateComposition, surfaceWidth:"
            r4.append(r5)
            int r5 = r9.f334840e
            r4.append(r5)
            java.lang.String r5 = ", surfaceHeight:"
            r4.append(r5)
            int r5 = r9.f334841f
            r4.append(r5)
            java.lang.String r5 = ", playAfterUpdate:"
            r4.append(r5)
            r8 = r18
            r4.append(r8)
            java.lang.String r5 = ", seekToOriginPosition:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", seekTo:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", isStarted:"
            r4.append(r5)
            boolean r5 = r9.f334842g
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "VideoCompositionPlayer"
            yp3.C112478a.m153625c(r7, r4, r6)
            r4 = 1
            r6 = 0
            com.tencent.tavkit.composition.TAVSource r10 = sp3.C110807k.m150874c(r0, r5, r4, r6)
            r9.f334837b = r10
            com.tencent.tav.player.PlayerItem r11 = new com.tencent.tav.player.PlayerItem
            com.tencent.tav.asset.Asset r10 = r10.getAsset()
            r11.<init>((com.tencent.tav.asset.Asset) r10)
            r9.f334838c = r11
            android.graphics.Bitmap r10 = r0.f331513n
            if (r10 == 0) goto L_0x006f
            r12 = 1
            goto L_0x0070
        L_0x006f:
            r12 = 0
        L_0x0070:
            r11.setEnableLut(r12, r10)
            com.tencent.tav.player.PlayerItem r10 = r9.f334838c
            com.tencent.tavkit.composition.TAVSource r11 = r9.f334837b
            com.tencent.tav.core.composition.VideoComposition r11 = r11.getVideoComposition()
            r10.setVideoComposition(r11)
            com.tencent.tav.player.PlayerItem r10 = r9.f334838c
            com.tencent.tavkit.composition.TAVSource r11 = r9.f334837b
            com.tencent.tav.core.AudioMix r11 = r11.getAudioMix()
            r10.setAudioMix(r11)
            com.tencent.tav.player.PlayerItem r10 = r9.f334838c
            com.tencent.tav.codec.IMediaFactory r11 = r0.f331516q
            r10.setDecoderFactory(r11)
            r9.f334845j = r0
            com.tencent.tav.player.Player r0 = r9.f334836a
            if (r0 == 0) goto L_0x009b
            com.tencent.tav.coremedia.CMTime r0 = r0.position()
            r6 = r0
        L_0x009b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "updateComposition, originPosition:"
            r0.append(r10)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r11 = new java.lang.Object[r5]
            yp3.C112478a.m153625c(r7, r0, r11)
            r11 = -1
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00c0
            com.tencent.tav.coremedia.CMTime r0 = new com.tencent.tav.coremedia.CMTime
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r2, r1)
        L_0x00be:
            r11 = r0
            goto L_0x00c7
        L_0x00c0:
            if (r1 == 0) goto L_0x00c4
            r11 = r6
            goto L_0x00c7
        L_0x00c4:
            com.tencent.tav.coremedia.CMTime r0 = com.tencent.tav.coremedia.CMTime.CMTimeZero
            goto L_0x00be
        L_0x00c7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r6)
            java.lang.String r1 = ", newPosition:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            yp3.C112478a.m153625c(r7, r0, r1)
            long r12 = android.os.SystemClock.elapsedRealtime()
            r9.f334843h = r4
            com.tencent.tav.player.Player r0 = r9.f334836a
            if (r0 == 0) goto L_0x00f0
            r0.pause()
        L_0x00f0:
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.tav.player.Player r10 = r9.f334836a
            if (r10 == 0) goto L_0x010a
            com.tencent.tav.player.PlayerItem r14 = r9.f334838c
            wp3.e r15 = new wp3.e
            r0 = r15
            r1 = r16
            r4 = r6
            r5 = r12
            r7 = r11
            r8 = r18
            r0.<init>(r1, r2, r4, r5, r7, r8)
            r10.update(r14, r11, r15)
        L_0x010a:
            com.tencent.tav.player.Player r0 = r9.f334836a
            if (r0 == 0) goto L_0x0117
            sp3.k r1 = r9.f334845j
            com.tencent.tav.coremedia.CMTimeRange r1 = r1.mo162387j()
            r0.setPlayRange(r1)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wp3.C111829g.mo163545d(sp3.k, boolean, boolean, long):void");
    }
}
