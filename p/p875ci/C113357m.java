package p875ci;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import eu3.C58834h;
import eu3.C97749e;
import java.io.File;
import java.io.IOException;
import p156gj.C107835h0;
import p331dj.C97481g;
import pu0.C110248b;

/* renamed from: ci.m */
public class C113357m extends C113348f {

    /* renamed from: f */
    public boolean f339146f = false;

    /* renamed from: g */
    public MediaPlayer f339147g = null;

    /* renamed from: h */
    public Context f339148h = MMApplicationContext.getContext();

    /* renamed from: i */
    public MMHandler f339149i;

    /* renamed from: ci.m$a */
    public class C113358a extends MMHandler {
        public C113358a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 305419896) {
                C113357m mVar = C113357m.this;
                Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", Boolean.valueOf(mVar.f339146f));
                try {
                    if (mVar.f339146f) {
                        if (mVar.f339147g.isPlaying()) {
                            mVar.f339147g.stop();
                        }
                        mVar.f339147g.release();
                        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", Boolean.valueOf(mVar.f339146f));
                    }
                } catch (IllegalStateException e) {
                    Log.printErrStackTrace("MicroMsg.Notification.Tool.SoundFixed", e, "Exception in playSoundHander,playerIsInit:%s", Boolean.valueOf(mVar.f339146f));
                    MediaPlayer mediaPlayer = mVar.f339147g;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                } catch (Throwable th) {
                    mVar.f339146f = false;
                    throw th;
                }
                mVar.f339146f = false;
            }
        }
    }

    /* renamed from: ci.m$b */
    public class C113359b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f339151d;

        /* renamed from: e */
        public final /* synthetic */ boolean f339152e;

        /* renamed from: f */
        public final /* synthetic */ boolean f339153f;

        public C113359b(String str, boolean z, boolean z2) {
            this.f339151d = str;
            this.f339152e = z;
            this.f339153f = z2;
        }

        public void run() {
            C113357m.m155164c(C113357m.this, this.f339151d, this.f339152e, this.f339153f);
        }
    }

    /* renamed from: b */
    private void m155163b(MediaPlayer mediaPlayer, String str, boolean z, boolean z2) {
        Uri uri;
        long currentTimeMillis = System.currentTimeMillis();
        if (Util.isNullOrNil(str)) {
            uri = RingtoneManager.getDefaultUri(2);
        } else if (z2) {
            uri = FileProviderHelper.getUriForFile(this.f339148h, C86009m1.m106378c(new File(str)));
        } else if (z) {
            AssetFileDescriptor openFd = this.f339148h.getAssets().openFd(str);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            uri = null;
        } else {
            uri = Uri.parse(str);
        }
        if (uri != null) {
            try {
                mediaPlayer.setDataSource(this.f339148h, uri);
            } catch (IOException unused) {
                if (!Util.isNullOrNil(str)) {
                    mediaPlayer.setDataSource(this.f339148h, RingtoneManager.getDefaultUri(2));
                } else {
                    Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "setPlayerDataSource IOException soundUri:%s, isAsset:%s", str, Boolean.valueOf(z));
                }
            }
        }
        Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "summeranrt setPlayerDataSource tid[%d] [%d]ms", Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: c */
    public static void m155164c(C113357m mVar, String str, boolean z, boolean z2) {
        C113357m mVar2 = mVar;
        String str2 = str;
        if (mVar2.f339148h == null) {
            mVar2.f339148h = MMApplicationContext.getContext();
        }
        Context context = mVar2.f339148h;
        if (context == null) {
            Log.m105928w("MicroMsg.Notification.Tool.SoundFixed", "playSound:context is null!!");
            return;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager.getStreamVolume(5) != 0) {
                boolean z3 = true;
                Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound playerIsInit: %s", Boolean.valueOf(mVar2.f339146f));
                if (mVar2.f339146f) {
                    try {
                        MediaPlayer mediaPlayer = mVar2.f339147g;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mVar2.f339147g.stop();
                            }
                            mVar2.f339147g.release();
                            Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "try to release player before playSound playerIsInit: %s", Boolean.valueOf(mVar2.f339146f));
                        }
                    } catch (IllegalStateException unused) {
                        Log.m105928w("MicroMsg.Notification.Tool.SoundFixed", "try to release player before playSound error");
                        MediaPlayer mediaPlayer2 = mVar2.f339147g;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                        }
                    }
                    mVar2.f339146f = false;
                }
                C97481g gVar = new C97481g();
                mVar2.f339147g = gVar;
                Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound player: %s", gVar);
                mVar2.m155163b(mVar2.f339147g, str2, z, z2);
                if (audioManager.isWiredHeadsetOn()) {
                    int h = C110248b.f329777h.mo161663h(false);
                    Log.m105919d("MicroMsg.Notification.Tool.SoundFixed", "headset on, selected stream type: %s", Integer.valueOf(h));
                    float streamVolume = (float) audioManager.getStreamVolume(h);
                    float streamVolume2 = (float) audioManager.getStreamVolume(3);
                    float streamMaxVolume = (float) audioManager.getStreamMaxVolume(h);
                    float streamMaxVolume2 = (float) audioManager.getStreamMaxVolume(3);
                    float f = streamVolume / streamMaxVolume;
                    float f2 = streamVolume2 / streamMaxVolume2;
                    Log.m105919d("MicroMsg.Notification.Tool.SoundFixed", "headset on, toneVolume: %s, maxVolume: %s, toneScale: %s", Float.valueOf(streamVolume), Float.valueOf(streamMaxVolume), Float.valueOf(f));
                    Log.m105919d("MicroMsg.Notification.Tool.SoundFixed", "headset on, toneMUSICVolume: %s, maxMUSICVolume: %s, toneMusicScale: %s", Float.valueOf(streamVolume2), Float.valueOf(streamMaxVolume2), Float.valueOf(f2));
                    if (f > f2) {
                        streamVolume = streamMaxVolume * f2;
                        Log.m105919d("MicroMsg.Notification.Tool.SoundFixed", "headset on, toneVolume: %s", Float.valueOf(streamVolume));
                    }
                    Log.m105924i("MicroMsg.Notification.Tool.SoundFixed", "headset on, setSpeakerphoneOn to false");
                    audioManager.setSpeakerphoneOn(false);
                    Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "notificationSetMode: %s", Integer.valueOf(C107835h0.f322856m.f322896e0));
                    if (C107835h0.f322856m.f322896e0 == 1) {
                        Log.m105924i("MicroMsg.Notification.Tool.SoundFixed", "notification set mode enable, set mode now");
                        if (audioManager.getMode() == 0) {
                            audioManager.setMode(3);
                        }
                        mVar2.f339147g.setOnCompletionListener(new C113360n(mVar2, audioManager));
                        mVar2.f339147g.setOnErrorListener(new C113361o(mVar2, audioManager));
                    } else {
                        mVar2.f339147g.setOnCompletionListener(new C113362p(mVar2));
                        mVar2.f339147g.setOnErrorListener(new C113363q(mVar2));
                    }
                    mVar2.f339147g.setAudioStreamType(h);
                    mVar2.f339147g.setLooping(true);
                    mVar2.f339147g.prepare();
                    float f3 = streamVolume / streamMaxVolume;
                    mVar2.f339147g.setVolume(f3, f3);
                    mVar2.f339147g.setLooping(false);
                    mVar2.f339147g.start();
                    mVar2.f339146f = true;
                    return;
                }
                Log.m105919d("MicroMsg.Notification.Tool.SoundFixed", "getStreamVolume =  %d, soundUri = %s", Integer.valueOf(audioManager.getStreamVolume(5)), str2);
                mVar2.f339147g.setOnCompletionListener(new C113364r(mVar2));
                mVar2.f339147g.setOnErrorListener(new C113365s(mVar2));
                mVar2.f339147g.setAudioStreamType(5);
                mVar2.f339147g.setLooping(true);
                mVar2.f339147g.prepare();
                mVar2.f339147g.setLooping(false);
                mVar2.f339147g.start();
                mVar2.f339146f = true;
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.TRUE;
                objArr[1] = Boolean.valueOf(Looper.myLooper() != null);
                if (Looper.getMainLooper() == null) {
                    z3 = false;
                }
                objArr[2] = Boolean.valueOf(z3);
                Log.m105925i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound start finish playerIsInit:%s, myLooper[%b] mainLooper[%b]", objArr);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Notification.Tool.SoundFixed", e, "PlaySound Exception:", new Object[0]);
            try {
                MediaPlayer mediaPlayer3 = mVar2.f339147g;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
                mVar2.f339146f = false;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.Notification.Tool.SoundFixed", e2, "try to release player in Exception:", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo165898a(String str, boolean z, boolean z2) {
        if (this.f339149i == null) {
            Log.m105924i("MicroMsg.Notification.Tool.SoundFixed", "playSound playHandler == null");
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("playSoundThread", 0);
            a.start();
            this.f339149i = new C113358a(a.getLooper());
        }
        this.f339149i.removeMessages(305419896);
        this.f339149i.sendEmptyMessageDelayed(305419896, 8000);
        this.f339149i.post(new C113359b(str, z, z2));
    }
}
