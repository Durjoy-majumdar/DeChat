package com.tencent.p014mm.xwebutil;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.webkit.ValueCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xwebutil.XWebAudioPlayerProgressBall;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.xweb.FileReaderHelper;
import java.lang.ref.WeakReference;
import p206nj.C100115c;
import p206nj.C100118d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.xwebutil.j */
public class C19905j {

    /* renamed from: a */
    public static C19909k f56734a;

    /* renamed from: com.tencent.mm.xwebutil.j$a */
    public static /* synthetic */ class C19906a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56735a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.xweb.FileReaderHelper$AudioPlayerStrategy[] r0 = com.tencent.xweb.FileReaderHelper.AudioPlayerStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56735a = r0
                com.tencent.xweb.FileReaderHelper$AudioPlayerStrategy r1 = com.tencent.xweb.FileReaderHelper.AudioPlayerStrategy.tponly     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56735a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.xweb.FileReaderHelper$AudioPlayerStrategy r1 = com.tencent.xweb.FileReaderHelper.AudioPlayerStrategy.tpfirst     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56735a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.xweb.FileReaderHelper$AudioPlayerStrategy r1 = com.tencent.xweb.FileReaderHelper.AudioPlayerStrategy.sysonly     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56735a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.xweb.FileReaderHelper$AudioPlayerStrategy r1 = com.tencent.xweb.FileReaderHelper.AudioPlayerStrategy.sysfirst     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.xwebutil.C19905j.C19906a.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.j$b */
    public static class C19907b implements ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnStopAsyncCompleteListener, ITPPlayerListener.IOnErrorListener {

        /* renamed from: d */
        public boolean f56736d = false;

        /* renamed from: e */
        public String f56737e;

        /* renamed from: f */
        public FileReaderHelper.OpenFileReportData f56738f;

        /* renamed from: g */
        public int f56739g;

        /* renamed from: com.tencent.mm.xwebutil.j$b$a */
        public class C19908a implements Runnable {
            public C19908a() {
            }

            public void run() {
                if (C19905j.m21650b(C19907b.this.f56737e)) {
                    C19909k kVar = C19905j.f56734a;
                    C19905j.m21651c(kVar.f56745e, kVar.f56753m, 0, kVar.mo26672a(), C19907b.this.f56738f);
                }
            }
        }

        public C19907b(String str, FileReaderHelper.OpenFileReportData openFileReportData) {
            this.f56737e = str;
            this.f56738f = openFileReportData;
            this.f56739g = -1;
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            XWebAudioPlayerProgress b;
            XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall;
            Runnable runnable;
            try {
                Log.m105924i("XFilesAudioPlayerLogic", "onCompletion");
                if (iTPPlayer.getPlayerType() == 1) {
                    Log.m105924i("XFilesAudioPlayerLogic", "onCompletion, is sys audio player, try stopAsync");
                    iTPPlayer.stopAsync();
                }
                if (C19905j.m21650b(this.f56737e) && (b = C19905j.f56734a.mo26673b()) != null && (xWebAudioPlayerProgressBall = b.f56703i) != null && (runnable = b.f56706o) != null) {
                    xWebAudioPlayerProgressBall.postDelayed(runnable, 5);
                }
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "onCompletion error: " + th.getMessage());
                C19905j.m21652d("onCompletion error ", th);
            }
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            Log.m105921e("XFilesAudioPlayerLogic", "onError, errorType = %d, errorCode = %d, arg1 = %d, arg2 = %d", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2));
            if (!C19905j.m21650b(this.f56737e)) {
                Log.m105920e("XFilesAudioPlayerLogic", "onError, sCurrentParams invalid");
                return;
            }
            C19909k kVar = C19905j.f56734a;
            C19905j.m21651c(kVar.f56745e, kVar.f56753m, i2, kVar.mo26672a(), this.f56738f);
        }

        public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            Log.m105925i("XFilesAudioPlayerLogic", "onInfo what = %d, arg1 = %d, arg2 = %d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            try {
                Log.m105924i("XFilesAudioPlayerLogic", "onPrepared");
                if (!C19905j.m21650b(this.f56737e)) {
                    Log.m105920e("XFilesAudioPlayerLogic", "onPrepared, sCurrentParams invalid");
                    return;
                }
                XWebAudioPlayerProgress b = C19905j.f56734a.mo26673b();
                if (b != null) {
                    b.setTotalTime(iTPPlayer.getDurationMs());
                }
                int i = this.f56739g;
                if (i > 0 && ((long) i) <= iTPPlayer.getDurationMs()) {
                    Log.m105924i("XFilesAudioPlayerLogic", "onPrepared, seek to " + this.f56739g);
                    iTPPlayer.seekTo(this.f56739g);
                }
                iTPPlayer.start();
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "onPrepared error: " + th.getMessage());
                C19905j.m21652d("onPrepared error ", th);
                C19909k kVar = C19905j.f56734a;
                C19905j.m21651c(kVar.f56745e, kVar.f56753m, -10, kVar.mo26672a(), this.f56738f);
            }
        }

        public void onStateChange(int i, int i2) {
            try {
                Log.m105925i("XFilesAudioPlayerLogic", "onStateChange from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
                if (!C19905j.m21650b(this.f56737e)) {
                    Log.m105920e("XFilesAudioPlayerLogic", "onStateChange, sCurrentParams invalid");
                    return;
                }
                MMActivity a = C19905j.f56734a.mo26672a();
                if (a != null) {
                    if (!a.isFinishing()) {
                        XWebAudioPlayerProgress b = C19905j.f56734a.mo26673b();
                        if (b == null) {
                            Log.m105920e("XFilesAudioPlayerLogic", "onStateChange, progressBarInParams invalid");
                            return;
                        }
                        C19909k kVar = C19905j.f56734a;
                        C100115c cVar = kVar.f56750j;
                        if (cVar == null) {
                            Log.m105920e("XFilesAudioPlayerLogic", "onStateChange, audioFocusHelper invalid");
                            return;
                        }
                        WeakReference<WeImageView> weakReference = kVar.f56742b;
                        WeImageView weImageView = weakReference == null ? null : weakReference.get();
                        if (weImageView == null) {
                            Log.m105920e("XFilesAudioPlayerLogic", "onStateChange, playBtn invalid");
                            return;
                        } else if (i2 == 5) {
                            cVar.mo139415b();
                            if (b.f56705n == null) {
                                Log.m105924i("XFilesAudioPlayerProgress", "startTimer");
                                b.f56705n = ((C119157j) C119157j.f356862d).mo183872c(new C19910l(b), 5, 250);
                            }
                            Drawable drawable = a.getDrawable(C0966R.raw.icons_filled_pause);
                            C74933u4.m89769f(drawable, -1);
                            weImageView.setImageDrawable(drawable);
                            if (!this.f56736d) {
                                Log.m105924i("XFilesAudioPlayerLogic", "onStateChange, first start state");
                                this.f56736d = true;
                                weImageView.postDelayed(new C19908a(), 2000);
                                return;
                            }
                            return;
                        } else {
                            cVar.mo139414a();
                            if (b.f56705n != null) {
                                Log.m105924i("XFilesAudioPlayerProgress", "stopTimer");
                                b.f56705n.cancel(false);
                                b.f56705n = null;
                            }
                            Drawable drawable2 = a.getDrawable(C0966R.raw.icons_filled_play);
                            C74933u4.m89769f(drawable2, -1);
                            weImageView.setImageDrawable(drawable2);
                            return;
                        }
                    }
                }
                Log.m105920e("XFilesAudioPlayerLogic", "onStateChange, activity invalid, try finishCurrentPlay");
                C19909k kVar2 = C19905j.f56734a;
                if (kVar2 != null) {
                    C19905j.m21649a(kVar2.f56746f, kVar2.f56744d);
                }
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "onStateChange error: " + th.getMessage());
                C19905j.m21652d("onStateChange error ", th);
            }
        }

        public void onStopAsyncComplete(ITPPlayer iTPPlayer) {
            XWebAudioPlayerProgress b;
            XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall;
            Runnable runnable;
            try {
                Log.m105924i("XFilesAudioPlayerLogic", "onStopAsyncComplete");
                if (C19905j.m21650b(this.f56737e) && (b = C19905j.f56734a.mo26673b()) != null && (xWebAudioPlayerProgressBall = b.f56703i) != null && (runnable = b.f56706o) != null) {
                    xWebAudioPlayerProgressBall.postDelayed(runnable, 5);
                }
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "onStopAsyncComplete error: " + th.getMessage());
                C19905j.m21652d("onStopAsyncComplete error ", th);
            }
        }
    }

    /* renamed from: a */
    public static void m21649a(String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && m21650b(str) && str2.equals(f56734a.f56744d)) {
            try {
                C19909k kVar = f56734a;
                C100115c cVar = kVar.f56750j;
                C100115c.C100116a aVar = kVar.f56751k;
                if (!(cVar == null || aVar == null)) {
                    Log.m105924i("XFilesAudioPlayerLogic", "finishPlay removeFocusListener");
                    C100115c.C100117b bVar = cVar.f293268b;
                    if (bVar != null) {
                        C100118d dVar = (C100118d) bVar;
                        if (dVar.f293271c == aVar) {
                            dVar.f293271c = null;
                        }
                    }
                    cVar.mo139414a();
                }
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "finishPlay removeFocusListener error: " + th.getMessage());
                m21652d("finishPlay error ", th);
            }
            try {
                MMActivity a = f56734a.mo26672a();
                WeakReference<BroadcastReceiver> weakReference = f56734a.f56752l;
                BroadcastReceiver broadcastReceiver = weakReference == null ? null : weakReference.get();
                if (!(a == null || broadcastReceiver == null)) {
                    Log.m105924i("XFilesAudioPlayerLogic", "finishPlay unregisterReceiver");
                    a.unregisterReceiver(broadcastReceiver);
                }
            } catch (Throwable th4) {
                Log.m105920e("XFilesAudioPlayerLogic", "finishPlay unregisterReceiver error: " + th4.getMessage());
                m21652d("finishPlay error ", th4);
            }
            try {
                XWebAudioPlayerProgress b = f56734a.mo26673b();
                if (b != null) {
                    Log.m105924i("XFilesAudioPlayerLogic", "finishPlay releaseProgressBar");
                    if (b.f56705n != null) {
                        Log.m105924i("XFilesAudioPlayerProgress", "stopTimer");
                        b.f56705n.cancel(false);
                        b.f56705n = null;
                    }
                    b.f56704j = null;
                    XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall = b.f56703i;
                    if (xWebAudioPlayerProgressBall != null) {
                        xWebAudioPlayerProgressBall.setOperationCallback((XWebAudioPlayerProgressBall.C19893a) null);
                    }
                }
            } catch (Throwable th5) {
                Log.m105920e("XFilesAudioPlayerLogic", "finishPlay releaseProgressBar error: " + th5.getMessage());
                m21652d("finishPlay error ", th5);
            }
            try {
                ITPPlayer iTPPlayer = f56734a.f56748h;
                if (!(iTPPlayer == null || iTPPlayer.getCurrentState() == 11)) {
                    Log.m105924i("XFilesAudioPlayerLogic", "finishPlay releasePlayer");
                    iTPPlayer.release();
                }
            } catch (Throwable th6) {
                Log.m105920e("XFilesAudioPlayerLogic", "finishPlay releasePlayer error: " + th6.getMessage());
                m21652d("finishPlay error ", th6);
            }
            f56734a = null;
            Log.m105924i("XFilesAudioPlayerLogic", "finishPlay complete, token = " + str);
        }
    }

    /* renamed from: b */
    public static boolean m21650b(String str) {
        C19909k kVar;
        if (str == null || str.isEmpty() || (kVar = f56734a) == null) {
            return false;
        }
        if (str.equals(kVar.f56746f)) {
            return true;
        }
        Log.m105924i("XFilesAudioPlayerLogic", "isCurrentParamsValid, token invalid, token in param = " + f56734a.f56746f + ", token = " + str);
        return false;
    }

    /* renamed from: c */
    public static void m21651c(String str, ValueCallback<Integer> valueCallback, int i, Context context, FileReaderHelper.OpenFileReportData openFileReportData) {
        C19909k kVar = f56734a;
        if (kVar != null) {
            if (kVar.f56754n) {
                Log.m105920e("XFilesAudioPlayerLogic", "onReceiveValueProcess already reported ret, ignore");
                return;
            }
            kVar.f56754n = true;
        }
        FileReaderHelper.reportXWebErrorCode(str, -1, i, context, openFileReportData);
        if (valueCallback == null) {
            return;
        }
        if (i != 0) {
            valueCallback.onReceiveValue(-102);
        } else {
            valueCallback.onReceiveValue(Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public static void m21652d(String str, Throwable th) {
        C19909k kVar = f56734a;
        if (kVar != null) {
            String str2 = kVar.f56745e;
            if (str2 == null) {
                str2 = "";
            }
            FileReaderHelper.reportException("XFilesAudioPlayer_" + str2, -1, str, th);
        }
    }

    /* renamed from: e */
    public static boolean m21653e(ITPPlayer iTPPlayer, String str, String str2, C19907b bVar, FileReaderHelper.AudioPlayerStrategy audioPlayerStrategy, int i) {
        if (bVar == null) {
            try {
                Log.m105920e("XFilesAudioPlayerLogic", "tryPlayInner, playerListener invalid");
                return false;
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "tryPlayInner error: " + th.getMessage());
                m21652d("tryPlayInner error ", th);
                return false;
            }
        } else {
            bVar.f56739g = -1;
            if (iTPPlayer == null) {
                Log.m105920e("XFilesAudioPlayerLogic", "tryPlayInner, tpPlayer is null");
                return false;
            }
            if (!(str == null || str.isEmpty() || str2 == null)) {
                if (!str2.isEmpty()) {
                    int currentState = iTPPlayer.getCurrentState();
                    if (!(currentState == 1 || currentState == 2)) {
                        if (currentState != 9) {
                            if (i >= 0) {
                                Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner, need seek to " + i);
                                iTPPlayer.seekTo(i);
                            } else if (currentState == 7) {
                                Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner, now is complete, need seek to 0");
                                iTPPlayer.seekTo(0);
                            }
                            if (currentState != 5) {
                                Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner, try start");
                                iTPPlayer.start();
                            }
                            return true;
                        }
                    }
                    Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner need prepare, currentState = " + currentState + ", needSeekToMs = " + i);
                    int i2 = C19906a.f56735a[audioPlayerStrategy.ordinal()];
                    if (i2 == 1) {
                        Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner set tponly");
                        iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 1));
                    } else if (i2 == 2) {
                        Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner set tpfirst");
                        iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 2));
                    } else if (i2 == 3) {
                        Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner set sysonly");
                        iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 3));
                    } else if (i2 == 4) {
                        Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner set sysfirst");
                        iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 4));
                    }
                    if (FileReaderHelper.AAC_EXT.equalsIgnoreCase(str2)) {
                        Log.m105924i("XFilesAudioPlayerLogic", "tryPlayInner is aac, enable accurate duration");
                        iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(144, true));
                    }
                    iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 3));
                    iTPPlayer.setDataSource(str);
                    iTPPlayer.setLoopback(false);
                    iTPPlayer.setOnPreparedListener(bVar);
                    iTPPlayer.setOnInfoListener(bVar);
                    iTPPlayer.setOnPlayerStateChangeListener(bVar);
                    iTPPlayer.setOnCompletionListener(bVar);
                    iTPPlayer.setOnErrorListener(bVar);
                    bVar.f56739g = i;
                    iTPPlayer.prepareAsync();
                    return true;
                }
            }
            Log.m105920e("XFilesAudioPlayerLogic", "tryPlayInner, filePath is empty");
            return false;
        }
    }
}
