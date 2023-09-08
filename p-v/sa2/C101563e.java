package sa2;

import com.tencent.p014mm.plugin.music.player.base.C94221e;
import com.tencent.p014mm.plugin.music.player.base.C94226i;
import com.tencent.p014mm.sdk.platformtools.Log;
import ja2.C98927b;
import la2.C99357e;
import la2.C99364n;
import p206nj.C11171e;
import qc0.C101106m;
import qc0.C12155j;
import ua2.C101991b;

/* renamed from: sa2.e */
public class C101563e extends C101555a {

    /* renamed from: q */
    public C101106m f297323q;

    /* renamed from: r */
    public C94221e f297324r;

    /* renamed from: s */
    public C98927b f297325s;

    /* renamed from: t */
    public boolean f297326t;

    /* renamed from: u */
    public C12155j f297327u;

    /* renamed from: v */
    public boolean f297328v;

    /* renamed from: w */
    public C98927b.C98929b f297329w = new C101565b();

    /* renamed from: x */
    public boolean f297330x = false;

    /* renamed from: sa2.e$a */
    public class C101564a implements C94226i {

        /* renamed from: a */
        public long f297331a;

        public C101564a() {
        }
    }

    /* renamed from: sa2.e$b */
    public class C101565b implements C98927b.C98929b {
        public C101565b() {
        }
    }

    /* renamed from: C */
    public static void m133349C(C101563e eVar, C101106m mVar, int i) {
        eVar.getClass();
        if (mVar == null) {
            Log.m105920e("MicroMsg.Music.MusicPlayer", "currentMusic is null, don't idKeyReportMusicError");
            return;
        }
        int i2 = 0;
        Log.m105925i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicError, action:%d", Integer.valueOf(i));
        C94221e eVar2 = eVar.f297324r;
        if (eVar2 != null && (eVar2 instanceof C110783c)) {
            i2 = ((C110783c) eVar2).f331417n;
        }
        C99357e eVar3 = eVar.f297305g;
        if (eVar3 != null) {
            eVar3.mo138801d0(eVar.f297323q, i, i2);
        }
    }

    /* renamed from: B */
    public final void mo141041B(boolean z) {
        try {
            C94221e eVar = this.f297324r;
            if (eVar == null || eVar.mo129529e()) {
                Log.m105924i("MicroMsg.Music.MusicPlayer", "music is playing");
                return;
            }
            Log.m105925i("MicroMsg.Music.MusicPlayer", "resume requestFocus:%b", Boolean.valueOf(z));
            if (z) {
                if (!mo141035z()) {
                    Log.m105920e("MicroMsg.Music.MusicPlayer", "request focus error");
                    return;
                }
            }
            this.f297324r.mo129532h();
            mo141028s(this.f297323q);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e, "resume", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo141042D() {
        /*
            r12 = this;
            ja2.b r0 = r12.f297325s
            r1 = 0
            if (r0 == 0) goto L_0x0068
            boolean r2 = r0.f289994i
            r3 = 100
            r5 = 0
            r7 = 2
            java.lang.String r8 = "MicroMsg.Music.MusicDownloadTask"
            r9 = 1
            if (r2 == 0) goto L_0x003a
            java.lang.Object[] r2 = new java.lang.Object[r7]
            ja2.a r7 = r0.f289991f
            long r10 = r7.f289987f
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r2[r1] = r7
            ja2.a r7 = r0.f289991f
            long r10 = r7.f289985d
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r2[r9] = r7
            java.lang.String r7 = "WifiFileLength: %d downloadLength: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r7, r2)
            ja2.a r0 = r0.f289991f
            long r7 = r0.f289987f
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0064
            long r5 = r0.f289985d
            long r5 = r5 * r3
            long r5 = r5 / r7
            goto L_0x0062
        L_0x003a:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            ja2.a r7 = r0.f289991f
            long r10 = r7.f289983b
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r2[r1] = r7
            ja2.a r7 = r0.f289991f
            long r10 = r7.f289982a
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r2[r9] = r7
            java.lang.String r7 = "fileLength: %d downloadLength: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r7, r2)
            ja2.a r0 = r0.f289991f
            long r7 = r0.f289983b
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0064
            long r5 = r0.f289982a
            long r5 = r5 * r3
            long r5 = r5 / r7
        L_0x0062:
            int r0 = (int) r5
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            if (r0 < r9) goto L_0x0068
            r1 = r0
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sa2.C101563e.mo141042D():int");
    }

    /* renamed from: E */
    public final void mo141043E(C101106m mVar, boolean z) {
        if (this.f297324r == null) {
            if (z || !C11171e.m11045b(15)) {
                Log.m105924i("MicroMsg.Music.MusicPlayer", "use MMMediaPlayer");
                this.f297324r = new C101557b();
            } else {
                Log.m105924i("MicroMsg.Music.MusicPlayer", "use MMPlayer");
                this.f297324r = new C110783c();
            }
            C94221e eVar = this.f297324r;
            eVar.f272185b = mVar;
            eVar.f272184a = new C101564a();
        }
    }

    /* renamed from: F */
    public void mo141044F() {
        this.f297305g = (C99357e) C101991b.m134284b(C99357e.class);
        this.f297306h = C99364n.m129618m();
    }

    /* renamed from: a */
    public boolean mo32203a(int i) {
        Log.m105925i("MicroMsg.Music.MusicPlayer", "seekToMusic pos:%d", Integer.valueOf(i));
        try {
            int duration = getDuration();
            int D = mo141042D();
            if (duration >= 0) {
                if (i <= duration) {
                    int i2 = (int) ((((double) D) / 100.0d) * ((double) duration));
                    if (D != 100 && i > i2) {
                        i = i2 - 2000;
                        Log.m105925i("MicroMsg.Music.MusicPlayer", "on completed seekto, position is %d =", Integer.valueOf(i));
                    }
                    C94221e eVar = this.f297324r;
                    if (eVar != null && i >= 0) {
                        eVar.mo129533i((long) i);
                        mo141029t(this.f297323q);
                        return true;
                    }
                    return false;
                }
            }
            Log.m105920e("MicroMsg.Music.MusicPlayer", "duration or position is illegal, stop");
            mo32210j();
            return false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e, "seekTo", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo32204b() {
        Log.m105924i("MicroMsg.Music.MusicPlayer", "pauseAndAbandonFocus");
        pause();
        mo141021l();
    }

    /* renamed from: c */
    public boolean mo32205c() {
        return false;
    }

    /* renamed from: d */
    public C12155j mo32193d() {
        int i;
        int duration = getDuration();
        int playPosition = getPlayPosition();
        int i2 = 0;
        if (mo32206f()) {
            i = 1;
        } else {
            i = this.f297328v && (this.f297326t || this.f297302d) ? 0 : 2;
        }
        Log.m105925i("MicroMsg.Music.MusicPlayer", "get music status = %d", Integer.valueOf(i));
        int D = mo141042D();
        if (duration > 0) {
            i2 = D;
        }
        C12155j jVar = this.f297327u;
        if (jVar != null) {
            jVar.f35260a = duration;
            jVar.f35261b = playPosition;
            jVar.f35262c = i;
            jVar.f35263d = i2;
        } else {
            this.f297327u = new C12155j(duration, playPosition, i, i2);
        }
        this.f297327u.getClass();
        C12155j jVar2 = this.f297327u;
        jVar2.f35264e = this.f297303e;
        return jVar2;
    }

    /* renamed from: e */
    public boolean mo32194e() {
        return this.f297328v && this.f297330x;
    }

    /* renamed from: f */
    public boolean mo32206f() {
        C94221e eVar = this.f297324r;
        if (eVar != null) {
            try {
                return eVar.mo129529e();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public int getDuration() {
        C94221e eVar = this.f297324r;
        if (eVar != null) {
            return eVar.mo129526b();
        }
        return -1;
    }

    public int getPlayPosition() {
        C94221e eVar = this.f297324r;
        if (eVar != null) {
            return eVar.mo129525a();
        }
        return -1;
    }

    /* renamed from: h */
    public void mo32209h(boolean z) {
        mo141041B(z);
    }

    /* renamed from: i */
    public void mo32196i() {
        this.f297330x = true;
        Log.m105924i("MicroMsg.Music.MusicPlayer", "passivePause");
        try {
            C94221e eVar = this.f297324r;
            if (eVar != null && eVar.mo129529e()) {
                this.f297324r.mo129531g();
                mo141025p(this.f297323q);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e, "passivePause", new Object[0]);
        }
    }

    /* renamed from: j */
    public void mo32210j() {
        Log.m105924i("MicroMsg.Music.MusicPlayer", "stopPlay");
        C94221e eVar = this.f297324r;
        if (eVar != null && (eVar instanceof C110783c)) {
            String c = eVar.mo129527c();
            C99357e eVar2 = this.f297305g;
            if (eVar2 != null) {
                eVar2.mo138805l0(this.f297323q, c);
            }
        }
        try {
            C98927b bVar = this.f297325s;
            if (bVar != null) {
                bVar.f289995j = true;
                this.f297325s = null;
            }
            C94221e eVar3 = this.f297324r;
            if (eVar3 != null) {
                eVar3.mo129535k();
                this.f297324r = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e, "stopPlay", new Object[0]);
        }
        mo141021l();
        this.f297328v = false;
        this.f297330x = false;
    }

    /* renamed from: k */
    public boolean mo32211k() {
        return this.f297328v;
    }

    public void pause() {
        this.f297330x = false;
        Log.m105924i("MicroMsg.Music.MusicPlayer", "pause");
        try {
            C94221e eVar = this.f297324r;
            if (eVar != null && eVar.mo129529e()) {
                this.f297324r.mo129531g();
                this.f297326t = true;
                mo141025p(this.f297323q);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e, "pause", new Object[0]);
        }
    }

    public void resume() {
        mo141041B(true);
    }
}
