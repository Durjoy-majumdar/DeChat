package ma2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.music.p080ui.FloatBallMusicViewNew;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;
import la2.C99358f;
import la2.C99364n;
import p447aw.C103918d;
import p529fv.C59325i;
import p646pn.C100824i;
import qc0.C101093a;
import qc0.C101106m;
import ra2.C101365a;
import rx3.C13598b0;
import te3.C101822o23;
import te3.C64719t23;
import ua2.C101991b;

/* renamed from: ma2.p */
public final class C99815p extends C99803i implements C59325i {

    /* renamed from: o */
    public final CopyOnWriteArraySet<C99818c> f292503o = new CopyOnWriteArraySet<>();

    /* renamed from: p */
    public FloatBallMusicViewNew f292504p;

    /* renamed from: q */
    public Bundle f292505q;

    /* renamed from: r */
    public String f292506r;

    /* renamed from: s */
    public C64719t23 f292507s;

    /* renamed from: t */
    public final C99824y f292508t = new C99824y();

    /* renamed from: u */
    public boolean f292509u;

    /* renamed from: v */
    public boolean f292510v;

    /* renamed from: w */
    public boolean f292511w = true;

    /* renamed from: x */
    public boolean f292512x = true;

    /* renamed from: ma2.p$a */
    public static final class C99816a {
        public C99816a(C8480h hVar) {
        }
    }

    /* renamed from: ma2.p$b */
    public static final class C99817b {

        /* renamed from: a */
        public static final C99817b f292513a = new C99817b();

        /* renamed from: b */
        public static C99815p f292514b = new C99815p();
    }

    /* renamed from: ma2.p$c */
    public interface C99818c {
        /* renamed from: a */
        void mo129519a(Bundle bundle);
    }

    static {
        new C99816a((C8480h) null);
    }

    public C99815p() {
        super("MicroMsg.GlobalMusicPlayerFloatBallHelper");
    }

    /* renamed from: A0 */
    public void mo139150A0(MusicPlayerEvent musicPlayerEvent, C101106m mVar) {
        BallInfo.BallButtonInfo ballButtonInfo = this.f311726d.f311693n;
        ballButtonInfo.f311706d = false;
        ballButtonInfo.f311707e = true;
        ballButtonInfo.f311710h = true;
        mo90540s(ballButtonInfo);
    }

    /* renamed from: C */
    public void mo64001C() {
        super.mo64001C();
        this.f292510v = false;
        if (mo90541w() && this.f311726d.f311681F) {
            mo90537e(false);
        }
    }

    /* renamed from: C0 */
    public void mo139152C0(MusicPlayerEvent musicPlayerEvent, C101106m mVar) {
        mo139172J0(true);
    }

    /* renamed from: D0 */
    public void mo139153D0(MusicPlayerEvent musicPlayerEvent) {
        mo139172J0(false);
    }

    /* renamed from: E0 */
    public void mo139154E0() {
        mo149078s0(((C100824i) C86312j.m106911c(C100824i.class)).g30(this.f311726d.f311679D, 8));
    }

    /* renamed from: G0 */
    public void mo139156G0(C101106m mVar) {
        C87412m.m108594g(mVar, "wrapper");
        if (mVar.f295958T) {
            this.f311726d.f311679D = ((C100824i) C86312j.m106911c(C100824i.class)).mo139644ye(this.f311726d.f311679D, 8);
            mo149078s0(this.f311726d.f311679D);
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo139171I0() {
        /*
            r8 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.os.Bundle r1 = r8.f292505q
            r2 = 1
            java.lang.String r3 = "MicroMsg.GlobalMusicPlayerFloatBallHelper"
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x002b
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r1 == 0) goto L_0x001a
            int r1 = r1.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L_0x001a:
            r2[r4] = r5
            java.lang.String r1 = "getMusicMvUIIntent jump by extra %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
            android.os.Bundle r1 = r8.f292505q
            gy3.C87412m.m108591d(r1)
            r0.putExtras(r1)
            goto L_0x014f
        L_0x002b:
            te3.t23 r1 = r8.f292507s
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r1 == 0) goto L_0x003a
            int r6 = r1.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x003b
        L_0x003a:
            r6 = r5
        L_0x003b:
            r2[r4] = r6
            java.lang.String r6 = "getMusicMvUIIntent jump by musicShareObject: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            r2 = 6
            java.lang.String r3 = "key_scene"
            r0.putExtra(r3, r2)
            if (r1 == 0) goto L_0x004e
            java.lang.String r2 = r1.f185459d
            goto L_0x004f
        L_0x004e:
            r2 = r5
        L_0x004f:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0054
            r2 = r3
        L_0x0054:
            java.lang.String r6 = "key_mv_feed_id"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x005f
            java.lang.String r2 = r1.f185460e
            goto L_0x0060
        L_0x005f:
            r2 = r5
        L_0x0060:
            if (r2 != 0) goto L_0x0063
            r2 = r3
        L_0x0063:
            java.lang.String r6 = "key_mv_nonce_id"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x006e
            java.lang.String r2 = r1.f185461f
            goto L_0x006f
        L_0x006e:
            r2 = r5
        L_0x006f:
            if (r2 != 0) goto L_0x0072
            r2 = r3
        L_0x0072:
            java.lang.String r6 = "key_mv_cover_url"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x007d
            java.lang.String r2 = r1.f185462g
            goto L_0x007e
        L_0x007d:
            r2 = r5
        L_0x007e:
            if (r2 != 0) goto L_0x0081
            r2 = r3
        L_0x0081:
            java.lang.String r6 = "key_mv_poster"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x008c
            java.lang.String r2 = r1.f185473u
            goto L_0x008d
        L_0x008c:
            r2 = r5
        L_0x008d:
            if (r2 != 0) goto L_0x0090
            r2 = r3
        L_0x0090:
            java.lang.String r6 = "key_mv_song_name"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x009b
            java.lang.String r2 = r1.f185474v
            goto L_0x009c
        L_0x009b:
            r2 = r5
        L_0x009c:
            if (r2 != 0) goto L_0x009f
            r2 = r3
        L_0x009f:
            java.lang.String r6 = "key_mv_song_lyric"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x00aa
            java.lang.String r2 = r1.f185463h
            goto L_0x00ab
        L_0x00aa:
            r2 = r5
        L_0x00ab:
            if (r2 != 0) goto L_0x00ae
            r2 = r3
        L_0x00ae:
            java.lang.String r6 = "key_mv_singer_name"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x00b9
            java.lang.String r2 = r1.f185464i
            goto L_0x00ba
        L_0x00b9:
            r2 = r5
        L_0x00ba:
            if (r2 != 0) goto L_0x00bd
            r2 = r3
        L_0x00bd:
            java.lang.String r6 = "key_mv_album_name"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r2 = r1.f185466n
            goto L_0x00c9
        L_0x00c8:
            r2 = r5
        L_0x00c9:
            if (r2 != 0) goto L_0x00cc
            r2 = r3
        L_0x00cc:
            java.lang.String r6 = "key_mv_music_genre"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x00e0
            long r6 = r1.f185467o
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x00e1
        L_0x00e0:
            r2 = r3
        L_0x00e1:
            java.lang.String r6 = "key_mv_issue_date"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x00ec
            java.lang.String r2 = r1.f185475w
            goto L_0x00ed
        L_0x00ec:
            r2 = r5
        L_0x00ed:
            if (r2 != 0) goto L_0x00f0
            r2 = r3
        L_0x00f0:
            java.lang.String r6 = "key_mv_album_cover_url"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x00fb
            java.lang.String r2 = r1.f185468p
            goto L_0x00fc
        L_0x00fb:
            r2 = r5
        L_0x00fc:
            if (r2 != 0) goto L_0x00ff
            r2 = r3
        L_0x00ff:
            java.lang.String r6 = "key_mv_identification"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x010a
            java.lang.String r2 = r1.f185465j
            goto L_0x010b
        L_0x010a:
            r2 = r5
        L_0x010b:
            if (r2 != 0) goto L_0x010e
            r2 = r3
        L_0x010e:
            java.lang.String r6 = "key_mv_extra_info"
            r0.putExtra(r6, r2)
            if (r1 == 0) goto L_0x0118
            int r4 = r1.f185469q
        L_0x0118:
            java.lang.String r2 = "key_mv_music_duration"
            r0.putExtra(r2, r4)
            if (r1 == 0) goto L_0x0123
            java.lang.String r2 = r1.f185472t
            goto L_0x0124
        L_0x0123:
            r2 = r5
        L_0x0124:
            if (r2 != 0) goto L_0x0127
            r2 = r3
        L_0x0127:
            java.lang.String r4 = "key_mv_thumb_path"
            r0.putExtra(r4, r2)
            if (r1 == 0) goto L_0x0132
            java.lang.String r2 = r1.f185471s
            goto L_0x0133
        L_0x0132:
            r2 = r5
        L_0x0133:
            if (r2 != 0) goto L_0x0136
            r2 = r3
        L_0x0136:
            java.lang.String r4 = "key_mv_music_operation_url"
            r0.putExtra(r4, r2)
            if (r1 == 0) goto L_0x0140
            java.lang.String r5 = r1.f185470r
        L_0x0140:
            if (r5 != 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r3 = r5
        L_0x0144:
            java.lang.String r1 = "key_mv_song_mid"
            r0.putExtra(r1, r3)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r1)
        L_0x014f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma2.C99815p.mo139171I0():android.content.Intent");
    }

    /* renamed from: J0 */
    public final void mo139172J0(boolean z) {
        BallInfo.BallButtonInfo ballButtonInfo = this.f311726d.f311693n;
        if (ballButtonInfo.f311706d != z) {
            ballButtonInfo.f311706d = z;
            ballButtonInfo.f311707e = true;
            ballButtonInfo.f311710h = true;
            mo90540s(ballButtonInfo);
        }
    }

    /* renamed from: K0 */
    public final void mo139173K0(String str, boolean z) {
        Log.m105925i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "alvinluo updateMusicCoverPath %s, notify: %s", str, Boolean.valueOf(z));
        this.f292506r = str;
        if (z) {
            FloatBallMusicViewNew floatBallMusicViewNew = this.f292504p;
            if (floatBallMusicViewNew != null) {
                floatBallMusicViewNew.setCoverPath(str);
            }
            BallInfo.C55569c cVar = this.f311726d.f311694o;
            cVar.f158210a = str;
            mo90542x(cVar);
        }
    }

    /* renamed from: L0 */
    public final void mo139174L0(Bundle bundle) {
        if (!C87412m.m108589b(this.f292505q, bundle)) {
            this.f292505q = bundle;
            Object[] objArr = new Object[1];
            objArr[0] = bundle != null ? Integer.valueOf(bundle.hashCode()) : null;
            Log.m105925i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "alvinluo updateMusicMvUIExtra hashCode: %s", objArr);
            for (C99818c cVar : this.f292503o) {
                if (cVar != null) {
                    cVar.mo129519a(this.f292505q);
                }
            }
        }
    }

    /* renamed from: M */
    public void mo84423M(boolean z) {
        this.f292510v = z;
        if (z) {
            this.f292512x = true;
        }
    }

    /* renamed from: M0 */
    public final void mo139175M0(C64719t23 t232) {
        this.f292507s = t232;
        Object[] objArr = new Object[1];
        objArr[0] = t232 != null ? Integer.valueOf(t232.hashCode()) : null;
        Log.m105925i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "alvinluo updateMusicShareObject hashCode: %s", objArr);
    }

    /* renamed from: k */
    public void mo68418k() {
        super.mo68418k();
        this.f292504p = null;
    }

    /* renamed from: o */
    public void mo64003o() {
        super.mo64003o();
        this.f292510v = true;
        this.f292511w = false;
        if (mo90541w()) {
            mo90537e(true);
        }
    }

    public void onStart() {
    }

    public void onStop() {
        this.f292511w = true;
        boolean w = mo90541w();
        boolean c = C101093a.m132481c();
        boolean TW = ((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), this.f311726d.f311686d);
        Log.m105925i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "onStop canAddMusicBall: %s, inMusicPlayerPage: %s, hasCurrentBall: %s, playingMusic: %s, hasPermission: %s", Boolean.valueOf(this.f292512x), Boolean.valueOf(this.f292510v), Boolean.valueOf(w), Boolean.valueOf(c), Boolean.valueOf(TW));
        if (TW && this.f292512x && !this.f292510v && !w) {
            super.mo139161y(C101093a.m132480b());
        }
    }

    /* renamed from: q */
    public void mo84426q(boolean z) {
        this.f292512x = z;
    }

    /* renamed from: u */
    public void mo68419u() {
        Log.m105925i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "addMusicBall %s, needEnterTranslation: %s", Boolean.valueOf(this.f292510v), Boolean.valueOf(this.f292511w));
        if (!this.f292510v) {
            this.f311726d.f311696q = this.f292511w;
            super.mo68419u();
        }
    }

    /* renamed from: v0 */
    public void mo139158v0(C101106m mVar) {
        if (mVar != null) {
            Log.m105925i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "addMusicFloatBall isFromNewMusicPlayer: %s", Boolean.valueOf(mVar.f295958T));
            if (mVar.f295958T) {
                Class cls = C100824i.class;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                FloatBallMusicViewNew floatBallMusicViewNew = new FloatBallMusicViewNew(context, (AttributeSet) null);
                this.f292504p = floatBallMusicViewNew;
                floatBallMusicViewNew.setOnMusicCoverClickListener(new C61451q(this));
                FloatBallMusicViewNew floatBallMusicViewNew2 = this.f292504p;
                if (floatBallMusicViewNew2 != null) {
                    floatBallMusicViewNew2.setCoverPath(this.f292506r);
                }
                BallInfo ballInfo = this.f311726d;
                ballInfo.f311689g = this.f292504p;
                if (ballInfo.f311690h == null) {
                    ballInfo.f311690h = new Point();
                }
                this.f311726d.f311690h.x = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.axj);
                this.f311726d.f311690h.y = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.axi);
                BallInfo ballInfo2 = this.f311726d;
                ballInfo2.f311681F = false;
                ballInfo2.f311680E = true;
                ballInfo2.f311677B = true;
                ballInfo2.f311682G = false;
                ballInfo2.f311679D = ((C100824i) C86312j.m106911c(cls)).g30(this.f311726d.f311679D, 2);
                this.f311726d.f311679D = ((C100824i) C86312j.m106911c(cls)).mo139644ye(this.f311726d.f311679D, 2048);
                BallInfo ballInfo3 = this.f311726d;
                ballInfo3.f311692j = 2;
                BallInfo.BallButtonInfo ballButtonInfo = ballInfo3.f311693n;
                ballButtonInfo.f311706d = C101093a.m132481c();
                ballButtonInfo.f311707e = true;
                ballButtonInfo.f311710h = true;
                BallInfo ballInfo4 = this.f311726d;
                ballInfo4.f311694o.f158210a = this.f292506r;
                Log.m105927v("MicroMsg.GlobalMusicPlayerFloatBallHelper", "initMusicFloatBallViewSize %s, ballInfo.state: %d", ballInfo4.f311690h, Integer.valueOf(ballInfo4.f311679D));
                mo68419u();
            }
        }
    }

    /* renamed from: w0 */
    public boolean mo139159w0(C101106m mVar) {
        return mVar != null && mVar.f295958T;
    }

    /* renamed from: x0 */
    public int mo139160x0() {
        return 23;
    }

    /* renamed from: y */
    public void mo139161y(C101106m mVar) {
        super.mo139161y(mVar);
    }

    /* renamed from: y0 */
    public String mo139162y0(BallInfo ballInfo, boolean z) {
        C101365a U = ((C99358f) C101991b.m134284b(C99358f.class)).mo138809U();
        C13598b0 b0Var = null;
        if (U != null) {
            C99824y yVar = this.f292508t;
            boolean z2 = true;
            String format = String.format("%s_%s_%s", Arrays.copyOf(new Object[]{U.field_songName, U.field_songSinger, U.field_songAlbum}, 3));
            C87412m.m108593f(format, "format(format, *args)");
            String mD5String = MD5Util.getMD5String(format);
            C87412m.m108593f(mD5String, "getMD5String(String.form…songName, singer, album))");
            yVar.mo35809D(6, mD5String);
            C99824y yVar2 = this.f292508t;
            C64719t23 t232 = this.f292507s;
            Bundle bundle = this.f292505q;
            yVar2.getClass();
            if (t232 == null && bundle == null) {
                Log.m105928w("MicroMsg.MusicPlayerMultiTaskHelper", "fillMultiTaskData failed");
                yVar2.f326418a = null;
            } else {
                String str = "";
                if (t232 == null) {
                    t232 = new C64719t23();
                    t232.f185461f = bundle != null ? bundle.getString("key_mv_cover_url", (String) null) : null;
                    t232.f185462g = bundle != null ? bundle.getString("key_mv_poster", (String) null) : null;
                    t232.f185460e = bundle != null ? bundle.getString("key_mv_nonce_id", (String) null) : null;
                    t232.f185459d = bundle != null ? bundle.getString("key_mv_feed_id", (String) null) : null;
                    t232.f185473u = bundle != null ? bundle.getString("key_mv_song_name", (String) null) : null;
                    t232.f185474v = bundle != null ? bundle.getString("key_mv_song_lyric", str) : null;
                    t232.f185463h = bundle != null ? bundle.getString("key_mv_singer_name", (String) null) : null;
                    t232.f185464i = bundle != null ? bundle.getString("key_mv_album_name", (String) null) : null;
                    t232.f185466n = bundle != null ? bundle.getString("key_mv_music_genre", (String) null) : null;
                    t232.f185467o = Util.safeParseLong(bundle != null ? bundle.getString("key_mv_issue_date", str) : null);
                    t232.f185475w = bundle != null ? bundle.getString("key_mv_album_cover_url", (String) null) : null;
                    t232.f185468p = bundle != null ? bundle.getString("key_mv_identification", (String) null) : null;
                    t232.f185465j = bundle != null ? bundle.getString("key_mv_extra_info", (String) null) : null;
                    t232.f185469q = bundle != null ? bundle.getInt("key_mv_music_duration", 0) : 0;
                    t232.f185472t = bundle != null ? bundle.getString("key_mv_thumb_path", (String) null) : null;
                    t232.f185471s = bundle != null ? bundle.getString("key_mv_music_operation_url", (String) null) : null;
                }
                MultiTaskInfo multiTaskInfo = yVar2.f326418a;
                if (multiTaskInfo != null) {
                    String str2 = U.field_songSinger;
                    if (!(str2 == null || str2.length() == 0)) {
                        z2 = false;
                    }
                    if (!z2) {
                        str = " · " + U.field_songSinger;
                    }
                    multiTaskInfo.mo80305m2().f183752e = U.field_songName + str;
                    multiTaskInfo.mo80305m2().f183751d = t232.f185462g;
                    C101822o23 o232 = new C101822o23();
                    o232.f298945d = t232;
                    o232.f298946e = U.field_musicType;
                    o232.f298947f = U.field_songAlbumUrl;
                    o232.f298948g = U.field_songName;
                    o232.f298949h = U.field_songSinger;
                    o232.f298950i = U.field_songWebUrl;
                    o232.f298951j = U.field_songWapLinkUrl;
                    o232.f298952n = U.field_songWifiUrl;
                    o232.f298953o = U.field_musicId;
                    o232.f298955q = U.field_songAlbumLocalPath;
                    o232.f298956r = U.field_songAlbum;
                    o232.f298957s = U.field_appId;
                    o232.f298958t = U.field_songHAlbumUrl;
                    multiTaskInfo.field_data = o232.toByteArray();
                }
            }
            C99824y yVar3 = this.f292508t;
            yVar3.getClass();
            C94223g a = C99364n.m129616h().mo138822a();
            int playPosition = a != null ? a.getPlayPosition() : 0;
            Log.m105924i("MicroMsg.MusicPlayerMultiTaskHelper", "onClose " + playPosition);
            if (yVar3.f326418a != null) {
                if (playPosition > yVar3.f292523e) {
                    Log.m105924i("MicroMsg.MusicPlayerMultiTaskHelper", "add historyTaskInfo");
                    yVar3.mo74195s((Bitmap) null);
                } else {
                    yVar3.mo160073K((Bitmap) null, false);
                }
                yVar3.f326418a = null;
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105924i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "onFloatBallRemoved currentMusic is null");
        }
        return super.mo139162y0(ballInfo, z);
    }

    /* renamed from: z0 */
    public void mo139163z0(MusicPlayerEvent musicPlayerEvent) {
        mo139172J0(false);
    }
}
