package a43;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import nj2.C61767o;
import ou0.C110066a;
import ou0.C110071c;
import p156gj.C107835h0;
import p206nj.C100118d;
import p206nj.C11171e;
import p331dj.C97481g;
import p734vz.C65905c;
import pu0.C110248b;
import rx3.C13598b0;

/* renamed from: a43.i */
public class C103310i implements C65905c {

    /* renamed from: a */
    public AudioManager f304597a;

    /* renamed from: b */
    public Context f304598b;

    /* renamed from: c */
    public MediaPlayer f304599c;

    /* renamed from: d */
    public Vibrator f304600d;

    /* renamed from: e */
    public boolean f304601e = false;

    /* renamed from: f */
    public int f304602f = 65536;

    /* renamed from: g */
    public long f304603g;

    /* renamed from: h */
    public long f304604h;

    /* renamed from: i */
    public boolean f304605i = false;

    /* renamed from: j */
    public MMHandler f304606j = new MMHandler(Looper.getMainLooper());

    /* renamed from: k */
    public C103315e f304607k;

    /* renamed from: a43.i$a */
    public class C103311a implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final /* synthetic */ String f304608a;

        /* renamed from: b */
        public final /* synthetic */ long f304609b;

        /* renamed from: c */
        public final /* synthetic */ boolean f304610c;

        /* renamed from: d */
        public final /* synthetic */ int f304611d;

        public C103311a(String str, long j, boolean z, int i) {
            this.f304608a = str;
            this.f304609b = j;
            this.f304610c = z;
            this.f304611d = i;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            long currentTimeMillis = System.currentTimeMillis();
            C103310i iVar = C103310i.this;
            if (currentTimeMillis - iVar.f304603g > 70000) {
                iVar.f304602f = 4;
            }
            if (iVar.f304601e) {
                String str = this.f304608a;
                long j = this.f304609b;
                C103315e eVar = new C103315e(str, j, this.f304610c, this.f304611d);
                iVar.f304607k = eVar;
                iVar.f304606j.postDelayed(eVar, j);
            }
        }
    }

    /* renamed from: a43.i$b */
    public class C103312b implements MediaPlayer.OnErrorListener {
        public C103312b() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C103310i.this.f304602f = 1;
            Log.m105928w("MicroMsg.RingPlayer", "RingPlayer startPlayCustomRing MediaPlayer onError, what: " + i + ":extra:" + i2);
            return false;
        }
    }

    /* renamed from: a43.i$c */
    public class C103313c implements MediaPlayer.OnCompletionListener {
        public C103313c() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.release();
            long currentTimeMillis = System.currentTimeMillis();
            C103310i iVar = C103310i.this;
            if (currentTimeMillis - iVar.f304604h > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                iVar.f304602f = 8;
            }
        }
    }

    /* renamed from: a43.i$d */
    public class C103314d implements MediaPlayer.OnErrorListener {
        public C103314d() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
                C103310i.this.f304602f = 5;
                Log.m105929w("MicroMsg.RingPlayer", "RingPlayer playSound :onError", mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2));
            }
            return false;
        }
    }

    /* renamed from: a43.i$e */
    public class C103315e implements Runnable {

        /* renamed from: d */
        public String f304616d;

        /* renamed from: e */
        public long f304617e;

        /* renamed from: f */
        public boolean f304618f;

        /* renamed from: g */
        public int f304619g;

        public C103315e(String str, long j, boolean z, int i) {
            this.f304616d = str;
            this.f304617e = j;
            this.f304618f = z;
            this.f304619g = i;
        }

        public void run() {
            C103310i.this.mo143089e(this.f304616d, this.f304617e, this.f304618f, this.f304619g);
        }
    }

    public C103310i(Context context) {
        this.f304598b = context;
        if (context != null) {
            AudioManager audioManager = C110248b.vx0().f329358h;
            this.f304597a = audioManager;
            if (audioManager == null) {
                this.f304597a = (AudioManager) this.f304598b.getSystemService("audio");
            }
            this.f304600d = (Vibrator) this.f304598b.getSystemService("vibrator");
        }
        Context context2 = MMApplicationContext.getContext();
        context2 = context2 instanceof Activity ? MMApplicationContext.getContext() : context2;
        if (C11171e.m11046c(8)) {
            new C100118d(context2);
        }
    }

    /* renamed from: a */
    public void mo143085a() {
        SharedPreferences sharedPreferences = this.f304598b.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        if (C11171e.m11046c(26) ? sharedPreferences.getBoolean("settings_voip_scene_shake", true) : sharedPreferences.getBoolean("settings_shake", true)) {
            int ringerMode = this.f304597a.getRingerMode();
            Log.m105925i("MicroMsg.RingPlayer", "system ringer mode: %s", Integer.valueOf(ringerMode));
            if (ringerMode == 1 || ringerMode == 2) {
                Vibrator vibrator = (Vibrator) this.f304598b.getSystemService("vibrator");
                this.f304600d = vibrator;
                if (vibrator != null) {
                    if (C11171e.m11046c(26)) {
                        this.f304600d.vibrate(VibrationEffect.createWaveform(new long[]{1000, 1000, 1000, 1000}, 0), new AudioAttributes.Builder().setUsage(6).build());
                    } else {
                        this.f304600d.vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.RingPlayer", "system not open vibrate");
            }
        }
    }

    /* renamed from: b */
    public void mo143086b(String str, boolean z, int i, boolean z2) {
        if ((!str.equals("playend") && !str.equals("close_lower_volume")) || C110248b.Jh0() || C110248b.zx0() || (this.f304597a.getRingerMode() != 0 && this.f304597a.getRingerMode() != 1)) {
            boolean z3 = this.f304598b.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("settings_shake", true);
            if (z) {
                Util.shake(this.f304598b, z3);
            }
            Log.m105925i("MicroMsg.RingPlayer", "playSound, type: %s, changeStreamType: %s, shake: %s", Integer.valueOf(i), Boolean.valueOf(z2), Boolean.valueOf(z));
            this.f304604h = System.currentTimeMillis();
            C97481g gVar = new C97481g();
            try {
                gVar.setDataSource(this.f304598b, mo143087c(str));
                gVar.setOnCompletionListener(new C103313c());
                gVar.setOnErrorListener(new C103314d());
                C110248b.C110249a aVar = C110248b.f329777h;
                mo143088d(aVar.mo161667l());
                if (z2) {
                    int c = C110248b.Jh0() ? aVar.mo161658c() : 0;
                    gVar.setAudioStreamType(c);
                    if (C11171e.m11045b(28)) {
                        gVar.setAudioAttributes(new AudioAttributes.Builder().setUsage(6).setLegacyStreamType(c).setContentType(4).build());
                        Log.m105924i("MicroMsg.RingPlayer", "use audio attribute to play ring");
                    } else {
                        gVar.setAudioStreamType(c);
                    }
                }
                if (str.equals("playend") && (C110248b.Jh0() || C110248b.zx0())) {
                    gVar.setVolume(0.5f, 0.5f);
                }
                gVar.prepare();
                gVar.setLooping(false);
                gVar.start();
                if (System.currentTimeMillis() - this.f304604h > 2000) {
                    this.f304602f = 7;
                }
            } catch (Throwable th) {
                Log.m105929w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", th);
                this.f304602f = 6;
            }
        }
    }

    /* renamed from: c */
    public Uri mo143087c(String str) {
        str.getClass();
        if (str.equals("ipcall_phonering")) {
            return Uri.parse("android.resource://" + this.f304598b.getPackageName() + "/" + C0966R.raw.ipcall_phonering);
        } else if (!str.equals("close_lower_volume")) {
            Context context = this.f304598b;
            C87412m.m108594g(context, "context");
            if (!C87412m.m108589b(str, "phonering")) {
                return C87412m.m108589b(str, "playend") ? C61767o.m72468b(context) : C61767o.m72468b(context);
            }
            C61767o oVar = C61767o.f175575a;
            StringBuilder sb = new StringBuilder();
            String str2 = C61767o.f175577c;
            sb.append(str2);
            String str3 = C61767o.f175579e;
            sb.append(str3);
            Uri n = C116299g2.m163858n(sb.toString());
            String path = n.getPath();
            boolean z = false;
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                z = l.f348991a.mo119948x(l.f348992b);
            }
            if (!z) {
                C61767o.f175575a.mo86685a();
            }
            Uri uriForFile = FileProviderHelper.getUriForFile(context, new C86009m1(str2 + str3));
            C87412m.m108593f(uriForFile, "getUriForFile(\n            context,file)");
            return uriForFile;
        } else {
            return Uri.parse("android.resource://" + this.f304598b.getPackageName() + "/" + C0966R.raw.close_lower_volume);
        }
    }

    /* renamed from: d */
    public void mo143088d(boolean z) {
        int i;
        int i2 = 3;
        Log.printInfoStack("MicroMsg.RingPlayer", "setSpeakerStatus, isSpeakerOn: %b, isSpeakerphoneOn: %s, mode: %s", Boolean.valueOf(z), Boolean.valueOf(this.f304597a.isSpeakerphoneOn()), Integer.valueOf(this.f304597a.getMode()));
        if (z) {
            i2 = 0;
        } else if (!C11171e.m11046c(21)) {
            i2 = 2;
        }
        if ((z && (i = C107835h0.f322846c.f322704N) > -1) || (!z && (i = C107835h0.f322846c.f322700L) > -1)) {
            i2 = i;
        }
        if (i2 != this.f304597a.getMode()) {
            Log.m105925i("MicroMsg.RingPlayer", "set AudioManager mode: %s", Integer.valueOf(i2));
            C110248b.vx0().mo161483Z(i2, (C32224a<C13598b0>) null);
        }
        if (z != this.f304597a.isSpeakerphoneOn()) {
            Log.m105925i("MicroMsg.RingPlayer", "set AudioManager speakerphoneOn: %s", Boolean.valueOf(z));
            C110066a vx02 = C110248b.vx0();
            vx02.f329356f = z;
            vx02.f329358h.setSpeakerphoneOn(z);
        }
    }

    /* renamed from: e */
    public final void mo143089e(String str, long j, boolean z, int i) {
        this.f304603g = System.currentTimeMillis();
        this.f304599c = new C97481g();
        try {
            this.f304599c.setDataSource(this.f304598b, mo143087c(str));
            this.f304599c.setOnCompletionListener(new C103311a(str, j, z, i));
            this.f304599c.setOnErrorListener(new C103312b());
            this.f304599c.setAudioStreamType(i);
            if (z) {
                this.f304599c.setVolume(0.6f, 0.6f);
            } else {
                mo143085a();
            }
            this.f304599c.setLooping(false);
            this.f304599c.prepare();
            this.f304599c.start();
            if (System.currentTimeMillis() - this.f304603g > 2000) {
                this.f304602f = 3;
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.RingPlayer", "new MediaPlayer failed, " + e.toString());
        }
    }

    /* renamed from: f */
    public void mo143090f() {
        Class cls = C110248b.class;
        Log.m105919d("MicroMsg.RingPlayer", "stop, isStarted: %b", Boolean.valueOf(this.f304601e));
        Vibrator vibrator = this.f304600d;
        if (vibrator != null) {
            vibrator.cancel();
            this.f304600d = null;
        }
        MediaPlayer mediaPlayer = this.f304599c;
        if (mediaPlayer != null && this.f304601e) {
            try {
                mediaPlayer.stop();
                this.f304599c.release();
                C103315e eVar = this.f304607k;
                if (eVar != null) {
                    this.f304606j.removeCallbacks(eVar);
                }
                this.f304601e = false;
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
                C110066a aVar = ((C110248b) c).f329779e;
                if (aVar == null) {
                    aVar = new C110071c();
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                    ((C110248b) c2).f329781g[0] = "music";
                }
                aVar.mo157511t();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RingPlayer", e.toString());
            }
        }
    }
}
