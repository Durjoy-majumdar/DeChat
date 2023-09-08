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
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import eu3.C58834h;
import eu3.C97749e;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import p156gj.C107835h0;
import p331dj.C97481g;
import pu0.C110248b;

/* renamed from: ci.f */
public class C113348f {

    /* renamed from: a */
    public boolean f339128a = false;

    /* renamed from: b */
    public MediaPlayer f339129b;

    /* renamed from: c */
    public Context f339130c;

    /* renamed from: d */
    public MMHandler f339131d;

    /* renamed from: e */
    public MMHandler f339132e;

    /* renamed from: ci.f$c */
    public static class C67377c {

        /* renamed from: a */
        public static final C113348f f193239a = new C113348f();

        /* renamed from: b */
        public static final C113348f f193240b = new C113357m();

        /* renamed from: c */
        public static boolean f193241c = false;
    }

    /* renamed from: ci.f$a */
    public class C113349a extends MMHandler {
        public C113349a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Log.m105925i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", Boolean.valueOf(C113348f.this.f339128a));
            try {
                MediaPlayer mediaPlayer = C113348f.this.f339129b;
                if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        C113348f.this.f339129b.stop();
                    }
                    C113348f.this.f339129b.release();
                    C113348f.this.f339128a = false;
                    Log.m105925i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", false);
                }
            } catch (IllegalStateException unused) {
                Log.m105929w("MicroMsg.Notification.Tool.Sound", "Exception in playSoundHander,playerIsInit:%s", Boolean.valueOf(C113348f.this.f339128a));
                MediaPlayer mediaPlayer2 = C113348f.this.f339129b;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                }
            }
        }
    }

    /* renamed from: ci.f$b */
    public class C113350b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f339134d;

        /* renamed from: e */
        public final /* synthetic */ boolean f339135e;

        /* renamed from: f */
        public final /* synthetic */ boolean f339136f;

        public C113350b(String str, boolean z, boolean z2) {
            this.f339134d = str;
            this.f339135e = z;
            this.f339136f = z2;
        }

        public void run() {
            C113348f fVar = C113348f.this;
            String str = this.f339134d;
            boolean z = this.f339135e;
            boolean z2 = this.f339136f;
            if (fVar.f339130c == null) {
                fVar.f339130c = MMApplicationContext.getContext();
            }
            Context context = fVar.f339130c;
            if (context == null) {
                Log.m105928w("MicroMsg.Notification.Tool.Sound", "playSound:context is null!!");
                return;
            }
            try {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager.getStreamVolume(5) != 0) {
                    fVar.f339131d.removeMessages(305419896);
                    fVar.f339131d.sendEmptyMessageDelayed(305419896, 8000);
                    boolean z3 = true;
                    Log.m105925i("MicroMsg.Notification.Tool.Sound", "doPlaySound playerIsInit: %s", Boolean.valueOf(fVar.f339128a));
                    if (fVar.f339128a) {
                        try {
                            MediaPlayer mediaPlayer = fVar.f339129b;
                            if (mediaPlayer != null) {
                                if (mediaPlayer.isPlaying()) {
                                    fVar.f339129b.stop();
                                }
                                fVar.f339129b.release();
                                Log.m105925i("MicroMsg.Notification.Tool.Sound", "try to release player before playSound playerIsInit: %s", Boolean.valueOf(fVar.f339128a));
                            }
                        } catch (IllegalStateException unused) {
                            Log.m105928w("MicroMsg.Notification.Tool.Sound", "try to release player before playSound error");
                            MediaPlayer mediaPlayer2 = fVar.f339129b;
                            if (mediaPlayer2 != null) {
                                mediaPlayer2.release();
                            }
                        }
                        fVar.f339128a = false;
                    }
                    C97481g gVar = new C97481g();
                    fVar.f339129b = gVar;
                    Log.m105925i("MicroMsg.Notification.Tool.Sound", "doPlaySound player: %s", gVar);
                    fVar.mo165899b(fVar.f339129b, str, z, z2);
                    if (audioManager.isWiredHeadsetOn()) {
                        int h = C110248b.f329777h.mo161663h(false);
                        Log.m105919d("MicroMsg.Notification.Tool.Sound", "headset on, selected stream type: %s", Integer.valueOf(h));
                        float streamVolume = (float) audioManager.getStreamVolume(h);
                        float streamVolume2 = (float) audioManager.getStreamVolume(3);
                        float streamMaxVolume = (float) audioManager.getStreamMaxVolume(h);
                        float streamMaxVolume2 = (float) audioManager.getStreamMaxVolume(3);
                        float f = streamVolume / streamMaxVolume;
                        float f2 = streamVolume2 / streamMaxVolume2;
                        Log.m105919d("MicroMsg.Notification.Tool.Sound", "headset on, toneVolume: %s, maxVolume: %s, toneScale: %s", Float.valueOf(streamVolume), Float.valueOf(streamMaxVolume), Float.valueOf(f));
                        Log.m105919d("MicroMsg.Notification.Tool.Sound", "headset on, toneMUSICVolume: %s, maxMUSICVolume: %s, toneMusicScale: %s", Float.valueOf(streamVolume2), Float.valueOf(streamMaxVolume2), Float.valueOf(f2));
                        if (f > f2) {
                            streamVolume = streamMaxVolume * f2;
                            Log.m105919d("MicroMsg.Notification.Tool.Sound", "headset on, toneVolume: %s", Float.valueOf(streamVolume));
                        }
                        Log.m105924i("MicroMsg.Notification.Tool.Sound", "headset on, setSpeakerphoneOn to false");
                        audioManager.setSpeakerphoneOn(false);
                        Log.m105925i("MicroMsg.Notification.Tool.Sound", "notificationSetMode: %s", Integer.valueOf(C107835h0.f322856m.f322896e0));
                        if (C107835h0.f322856m.f322896e0 == 1) {
                            Log.m105924i("MicroMsg.Notification.Tool.Sound", "notification set mode enable, set mode now");
                            if (audioManager.getMode() == 0) {
                                audioManager.setMode(3);
                            }
                            fVar.f339129b.setOnCompletionListener(new C113351g(fVar, audioManager));
                            fVar.f339129b.setOnErrorListener(new C113352h(fVar, audioManager));
                        } else {
                            fVar.f339129b.setOnCompletionListener(new C113353i(fVar));
                            fVar.f339129b.setOnErrorListener(new C113354j(fVar));
                        }
                        fVar.f339129b.setAudioStreamType(h);
                        fVar.f339129b.setLooping(true);
                        fVar.f339129b.prepare();
                        float f3 = streamVolume / streamMaxVolume;
                        fVar.f339129b.setVolume(f3, f3);
                        fVar.f339129b.setLooping(false);
                        fVar.f339129b.start();
                        fVar.f339128a = true;
                        return;
                    }
                    Log.m105919d("MicroMsg.Notification.Tool.Sound", "getStreamVolume =  %d, soundUri = %s", Integer.valueOf(audioManager.getStreamVolume(5)), str);
                    fVar.f339129b.setOnCompletionListener(new C113355k(fVar));
                    fVar.f339129b.setOnErrorListener(new C113356l(fVar));
                    fVar.f339129b.setAudioStreamType(5);
                    fVar.f339129b.setLooping(true);
                    fVar.f339129b.prepare();
                    fVar.f339129b.setLooping(false);
                    fVar.f339129b.start();
                    fVar.f339128a = true;
                    Object[] objArr = new Object[3];
                    objArr[0] = Boolean.TRUE;
                    objArr[1] = Boolean.valueOf(Looper.myLooper() != null);
                    if (Looper.getMainLooper() == null) {
                        z3 = false;
                    }
                    objArr[2] = Boolean.valueOf(z3);
                    Log.m105925i("MicroMsg.Notification.Tool.Sound", "doPlaySound start finish playerIsInit:%s, myLooper[%b] mainLooper[%b]", objArr);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Notification.Tool.Sound", e, "PlaySound Exception:", new Object[0]);
                try {
                    MediaPlayer mediaPlayer3 = fVar.f339129b;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.release();
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.Notification.Tool.Sound", e2, "try to release player in Exception:", new Object[0]);
                }
            }
        }
    }

    public C113348f() {
        String str = null;
        this.f339129b = null;
        this.f339131d = new C113349a(Looper.getMainLooper());
        this.f339130c = MMApplicationContext.getContext();
        String str2 = C72994y1.f212832a + "deviceconfig.cfg";
        Log.m105925i("MicroMsg.ServerConfigInfoStorage", "readConfigFromLocalFile, path: %s, isExist: %s", str2, Boolean.valueOf(C86013q1.m106450k(str2)));
        if (C86013q1.m106450k(str2)) {
            byte[] O = C86013q1.m106433O(str2, 0, -1);
            if (!Util.isNullOrNil(O)) {
                String str3 = new String(O, Charset.defaultCharset());
                if (!Util.isNullOrNil(str3)) {
                    str = str3;
                }
            }
        }
        C107835h0.m146105b(str);
    }

    /* renamed from: a */
    public synchronized void mo165898a(String str, boolean z, boolean z2) {
        if (this.f339132e == null) {
            Log.m105924i("MicroMsg.Notification.Tool.Sound", "playSound playHandler == null");
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("playSoundThread", 0);
            a.start();
            this.f339132e = new MMHandler(a.getLooper());
        }
        this.f339132e.post(new C113350b(str, z, z2));
    }

    /* renamed from: b */
    public final void mo165899b(MediaPlayer mediaPlayer, String str, boolean z, boolean z2) {
        Uri uri;
        long currentTimeMillis = System.currentTimeMillis();
        if (Util.isNullOrNil(str)) {
            uri = RingtoneManager.getDefaultUri(2);
        } else if (z2) {
            uri = FileProviderHelper.getUriForFile(this.f339130c, C86009m1.m106378c(new File(str)));
        } else if (z) {
            AssetFileDescriptor openFd = this.f339130c.getAssets().openFd(str);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            uri = null;
        } else {
            uri = Uri.parse(str);
        }
        if (uri != null) {
            try {
                mediaPlayer.setDataSource(this.f339130c, uri);
            } catch (IOException unused) {
                if (!Util.isNullOrNil(str)) {
                    mediaPlayer.setDataSource(this.f339130c, RingtoneManager.getDefaultUri(2));
                } else {
                    Log.m105925i("MicroMsg.Notification.Tool.Sound", "setPlayerDataSource IOException soundUri:%s, isAsset:%s", str, Boolean.valueOf(z));
                }
            }
        }
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "summeranrt setPlayerDataSource tid[%d] [%d]ms", Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
