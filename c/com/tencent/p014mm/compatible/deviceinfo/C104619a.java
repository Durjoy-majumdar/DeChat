package com.tencent.p014mm.compatible.deviceinfo;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.compatible.deviceinfo.MediaCodecProxyUtils;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.compatible.deviceinfo.a */
public class C104619a {

    /* renamed from: a */
    public MediaCodec f310657a;

    /* renamed from: b */
    public MediaCodecProxyUtils.C104617a f310658b;

    /* renamed from: c */
    public volatile boolean f310659c = false;

    /* renamed from: d */
    public AtomicInteger f310660d = new AtomicInteger();

    /* renamed from: e */
    public AtomicInteger f310661e = new AtomicInteger();

    /* renamed from: f */
    public AtomicInteger f310662f = new AtomicInteger();

    /* renamed from: g */
    public AtomicInteger f310663g = new AtomicInteger();

    /* renamed from: h */
    public AtomicInteger f310664h = new AtomicInteger();

    /* renamed from: i */
    public long f310665i = 0;

    /* renamed from: j */
    public long f310666j = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;

    /* renamed from: com.tencent.mm.compatible.deviceinfo.a$a */
    public class C104620a implements Runnable {
        public C104620a(C104619a aVar) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("MediaCodecProxy queueInputBuffer, thread:[%s]", new Object[]{Integer.valueOf(Process.myTid())}), 1).show();
        }
    }

    /* renamed from: com.tencent.mm.compatible.deviceinfo.a$b */
    public class C104621b implements Runnable {
        public C104621b(C104619a aVar) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("MediaCodecProxy dequeueInputBuffer, thread:[%s]", new Object[]{Integer.valueOf(Process.myTid())}), 1).show();
        }
    }

    /* renamed from: com.tencent.mm.compatible.deviceinfo.a$c */
    public class C104622c implements Runnable {
        public C104622c(C104619a aVar) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("MediaCodecProxy dequeueOutputBuffer, thread:[%s]", new Object[]{Integer.valueOf(Process.myTid())}), 1).show();
        }
    }

    public C104619a(MediaCodec mediaCodec, MediaCodecProxyUtils.C104617a aVar) {
        this.f310657a = mediaCodec;
        this.f310658b = aVar;
        this.f310659c = true;
    }

    /* renamed from: b */
    public static C104619a m140210b(String str) {
        Log.m105925i("MicroMsg.MediaCodecProxy", "into createByCodecName, name = [%s]", str);
        MediaCodecProxyUtils.C104617a aVar = new MediaCodecProxyUtils.C104617a();
        try {
            MediaCodecProxyUtils.C104618b.m140206a(7);
            MediaCodecProxyUtils.C104618b.m140206a(66);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            MediaCodecProxyUtils.C104618b.m140206a(67);
            MediaCodecProxyUtils.C104617a d = MediaCodecProxyUtils.m140202d(createByCodecName.hashCode(), str);
            int codecCount = MediaCodecList.getCodecCount();
            int i = 0;
            while (true) {
                if (i >= codecCount) {
                    Log.m105921e("MicroMsg.MediaCodecProxyUtils", "codecNameSupportCheck error, type unsupport:[%s]", str);
                    MediaCodecProxyUtils.C104618b.m140206a(24);
                    MediaCodecProxyUtils.C104618b.m140207b(24, d);
                    break;
                } else if (TextUtils.equals(str, MediaCodecList.getCodecInfoAt(i).getName())) {
                    d.f310655e = str;
                    break;
                } else {
                    i++;
                }
            }
            MediaCodecProxyUtils.m140199a();
            return new C104619a(createByCodecName, d);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "createByCodecName func error " + str, new Object[0]);
            m140213t(2, e, aVar);
            int codecCount2 = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount2; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (TextUtils.equals(codecInfoAt.getName(), str)) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    if (supportedTypes.length > 0) {
                        MediaCodecProxyUtils.m140201c(codecInfoAt.isEncoder(), supportedTypes[0], aVar);
                    }
                }
            }
            throw e;
        }
    }

    /* renamed from: c */
    public static C104619a m140211c(String str) {
        Log.m105925i("MicroMsg.MediaCodecProxy", "into createDecoderByType, type = [%s]", str);
        MediaCodecProxyUtils.C104617a aVar = new MediaCodecProxyUtils.C104617a();
        try {
            MediaCodecProxyUtils.C104618b.m140206a(7);
            MediaCodecProxyUtils.C104618b.m140206a(60);
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
            MediaCodecProxyUtils.C104618b.m140206a(61);
            aVar = MediaCodecProxyUtils.m140203e(createDecoderByType.hashCode(), false, str);
            MediaCodecProxyUtils.m140204f(str, aVar);
            MediaCodecProxyUtils.m140199a();
            return new C104619a(createDecoderByType, aVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "createDecoderByType error " + str, new Object[0]);
            m140213t(0, e, aVar);
            MediaCodecProxyUtils.m140201c(false, str, aVar);
            throw e;
        }
    }

    /* renamed from: d */
    public static C104619a m140212d(String str, boolean z) {
        Log.m105925i("MicroMsg.MediaCodecProxy", "into createEncoderByType, type = [%s]", str);
        MediaCodecProxyUtils.C104617a aVar = new MediaCodecProxyUtils.C104617a();
        try {
            MediaCodecProxyUtils.C104618b.m140206a(7);
            MediaCodecProxyUtils.C104618b.m140206a(63);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(str);
            MediaCodecProxyUtils.C104618b.m140206a(64);
            aVar = MediaCodecProxyUtils.m140203e(createEncoderByType.hashCode(), true, str);
            MediaCodecProxyUtils.m140204f(str, aVar);
            MediaCodecProxyUtils.m140199a();
            return new C104619a(createEncoderByType, aVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "createByCodecName error " + str, new Object[0]);
            if (!z) {
                m140213t(1, e, aVar);
                MediaCodecProxyUtils.m140201c(true, str, aVar);
            }
            throw e;
        }
    }

    /* renamed from: t */
    public static void m140213t(int i, Exception exc, MediaCodecProxyUtils.C104617a aVar) {
        String str;
        if (aVar != null) {
            if (exc != null) {
                str = exc.toString() + "----" + Util.getStack().toString();
            } else {
                str = Util.getStack().toString();
            }
            aVar.f310653c = str;
        }
        MediaCodecProxyUtils.C104618b.m140206a(i);
        MediaCodecProxyUtils.C104618b.m140207b(i, aVar);
    }

    /* renamed from: a */
    public void mo148202a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        try {
            Log.m105925i("MicroMsg.MediaCodecProxy", "configure 1 function, thread:[%s], threadName:[%s]", Integer.valueOf(Process.myTid()), Thread.currentThread().getName());
            StringBuilder sb = new StringBuilder();
            sb.append("configure 1 format = ");
            String str = "null";
            sb.append(mediaFormat != null ? mediaFormat.toString() : str);
            sb.append(" surface = ");
            sb.append(surface != null ? surface.toString() : str);
            sb.append(" crypto = ");
            if (mediaCrypto != null) {
                str = mediaCrypto.toString();
            }
            sb.append(str);
            sb.append(" flags = ");
            sb.append(i);
            Log.m105924i("MicroMsg.MediaCodecProxy", sb.toString());
            if (!this.f310659c) {
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy configure not alive");
            }
            if (mediaFormat != null) {
                this.f310658b.f310656f = mediaFormat.toString();
            }
            MediaCodecProxyUtils.C104618b.m140206a(75);
            this.f310657a.configure(mediaFormat, surface, mediaCrypto, i);
            MediaCodecProxyUtils.C104618b.m140206a(76);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy configure 1", new Object[0]);
            m140213t(32, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: e */
    public final Surface mo148203e() {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(87);
            Surface createInputSurface = this.f310657a.createInputSurface();
            MediaCodecProxyUtils.C104618b.m140206a(88);
            return createInputSurface;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy createInputSurface", new Object[0]);
            m140213t(36, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: f */
    public final int mo148204f(long j) {
        try {
            if (!this.f310659c) {
                Log.m105921e("MicroMsg.MediaCodecProxy", "dequeueInputBuffer function, threadName:[%s]", Integer.valueOf(Process.myTid()), Thread.currentThread().getName());
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy dequeueInputBuffer not alive");
            }
            return this.f310657a.dequeueInputBuffer(j);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy dequeueInputBuffer, thread:[%s]", Integer.valueOf(Process.myTid()));
            MediaCodecProxyUtils.C104618b.m140206a(42);
            this.f310663g.getAndIncrement();
            if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) && System.currentTimeMillis() - this.f310665i > this.f310666j) {
                this.f310665i = System.currentTimeMillis();
                MMHandlerThread.postToMainThread(new C104621b(this));
            }
            throw e;
        }
    }

    /* renamed from: g */
    public final int mo148205g(MediaCodec.BufferInfo bufferInfo, long j) {
        try {
            if (!this.f310659c) {
                Log.m105921e("MicroMsg.MediaCodecProxy", "dequeueOutputBuffer function, threadName:[%s]", Integer.valueOf(Process.myTid()), Thread.currentThread().getName());
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy dequeueOutputBuffer not alive");
            }
            return this.f310657a.dequeueOutputBuffer(bufferInfo, j);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy dequeueOutputBuffer, thread:[%s]", Integer.valueOf(Process.myTid()));
            MediaCodecProxyUtils.C104618b.m140206a(43);
            if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) && System.currentTimeMillis() - this.f310665i > this.f310666j) {
                this.f310665i = System.currentTimeMillis();
                MMHandlerThread.postToMainThread(new C104622c(this));
            }
            this.f310664h.getAndIncrement();
            throw e;
        }
    }

    /* renamed from: h */
    public final void mo148206h() {
        try {
            if (!this.f310659c) {
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy flush not alive");
            }
            MediaCodecProxyUtils.C104618b.m140206a(96);
            this.f310657a.flush();
            MediaCodecProxyUtils.C104618b.m140206a(97);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy flush, thread:[%s]", Integer.valueOf(Process.myTid()));
            MediaCodecProxyUtils.C104618b.m140206a(39);
            this.f310660d.getAndIncrement();
            throw e;
        }
    }

    /* renamed from: i */
    public ByteBuffer mo148207i(int i) {
        try {
            return this.f310657a.getInputBuffer(i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy getInputBuffer", new Object[0]);
            m140213t(51, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: j */
    public ByteBuffer[] mo148208j() {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(126);
            ByteBuffer[] inputBuffers = this.f310657a.getInputBuffers();
            MediaCodecProxyUtils.C104618b.m140206a(127);
            return inputBuffers;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy getInputBuffers", new Object[0]);
            m140213t(49, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: k */
    public final String mo148209k() {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(147);
            String name = this.f310657a.getName();
            MediaCodecProxyUtils.C104618b.m140206a(148);
            return name;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy getName", new Object[0]);
            m140213t(56, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: l */
    public ByteBuffer mo148210l(int i) {
        try {
            return this.f310657a.getOutputBuffer(i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy getOutputBuffer", new Object[0]);
            m140213t(53, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: m */
    public ByteBuffer[] mo148211m() {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(129);
            ByteBuffer[] outputBuffers = this.f310657a.getOutputBuffers();
            MediaCodecProxyUtils.C104618b.m140206a(130);
            return outputBuffers;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy getOutputBuffers", new Object[0]);
            m140213t(50, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: n */
    public final MediaFormat mo148212n() {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(120);
            MediaFormat outputFormat = this.f310657a.getOutputFormat();
            MediaCodecProxyUtils.C104618b.m140206a(121);
            return outputFormat;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy getOutputFormat, thread:[%s]", Integer.valueOf(Process.myTid()));
            m140213t(47, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: o */
    public final void mo148213o(int i, int i2, int i3, long j, int i4) {
        try {
            if (!this.f310659c) {
                Log.m105921e("MicroMsg.MediaCodecProxy", "queueInputBuffer function, threadName:[%s]", Integer.valueOf(Process.myTid()), Thread.currentThread().getName());
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy queueInputBuffer not alive");
            }
            this.f310657a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy queueInputBuffer, thread:[%s]", Integer.valueOf(Process.myTid()));
            MediaCodecProxyUtils.C104618b.m140206a(40);
            this.f310661e.getAndIncrement();
            if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) && System.currentTimeMillis() - this.f310665i > this.f310666j) {
                this.f310665i = System.currentTimeMillis();
                MMHandlerThread.postToMainThread(new C104620a(this));
            }
            throw e;
        }
    }

    /* renamed from: p */
    public final void mo148214p() {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(11);
            Log.m105925i("MicroMsg.MediaCodecProxy", "into release function, thread:[%s], stack:[%s]", Integer.valueOf(Process.myTid()), Util.getStack().toString());
            if (!this.f310659c) {
                Log.m105921e("MicroMsg.MediaCodecProxy", "release error, multi release, stack:[%s]", Util.getStack().toString());
                m140213t(10, (Exception) null, this.f310658b);
            }
            MediaCodecProxyUtils.m140205g(this.f310657a.hashCode());
            MediaCodecProxyUtils.m140199a();
            MediaCodecProxyUtils.C104618b.m140206a(69);
            this.f310657a.release();
            MediaCodecProxyUtils.C104618b.m140206a(70);
            mo148217s();
            this.f310659c = false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy release", new Object[0]);
            m140213t(30, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: q */
    public final void mo148215q(int i, long j) {
        try {
            if (!this.f310659c) {
                Log.m105921e("MicroMsg.MediaCodecProxy", "releaseOutputBuffer function, threadName:[%s]", Integer.valueOf(Process.myTid()), Thread.currentThread().getName());
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy releaseOutputBuffer not alive");
            }
            MediaCodecProxyUtils.C104618b.m140206a(114);
            this.f310657a.releaseOutputBuffer(i, j);
            MediaCodecProxyUtils.C104618b.m140206a(115);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy releaseOutputBuffer 2, thread:[%s]", Integer.valueOf(Process.myTid()));
            m140213t(45, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: r */
    public final void mo148216r(int i, boolean z) {
        try {
            if (!this.f310659c) {
                Log.m105921e("MicroMsg.MediaCodecProxy", "releaseOutputBuffer function, threadName:[%s]", Integer.valueOf(Process.myTid()), Thread.currentThread().getName());
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy releaseOutputBuffer not alive");
            }
            this.f310657a.releaseOutputBuffer(i, z);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy releaseOutputBuffer 1, thread:[%s]", Integer.valueOf(Process.myTid()));
            m140213t(44, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: s */
    public final void mo148217s() {
        int i = this.f310660d.get() + this.f310663g.get() + this.f310664h.get() + this.f310661e.get() + this.f310662f.get();
        if (i > 10) {
            Log.m105919d("MicroMsg.MediaCodecProxy", "reportCount count:[%d]", Integer.valueOf(i));
            StringBuilder sb = new StringBuilder();
            sb.append("countFlush:");
            sb.append(this.f310660d);
            sb.append(";");
            sb.append("countDequeueInputBuffer:");
            sb.append(this.f310663g);
            sb.append(";");
            sb.append("countDequeueOutputBuffer:");
            sb.append(this.f310664h);
            sb.append(";");
            sb.append("countQueueInputBuffer:");
            sb.append(this.f310661e);
            sb.append(";");
            sb.append("countQueueSecureInputBuffer:");
            sb.append(this.f310662f);
            sb.append(";");
            MediaCodecProxyUtils.C104617a aVar = this.f310658b;
            if (aVar != null) {
                String str = aVar.f310656f;
                String replace = str != null ? str.replace(",", ";") : "";
                sb.append(this.f310658b.f310652b);
                sb.append(";");
                sb.append(this.f310658b.f310654d);
                sb.append(";");
                sb.append(this.f310658b.f310655e);
                sb.append(";");
                sb.append(MMApplicationContext.getProcessName());
                sb.append(";");
                sb.append(replace);
                sb.append(";");
                sb.append("stack:");
                sb.append(this.f310658b.f310653c);
            }
            MediaCodecProxyUtils.C104618b.m140206a(16);
            MediaCodecProxyUtils.C104618b.m140209d(16, sb.toString());
            this.f310660d.set(0);
            this.f310663g.set(0);
            this.f310664h.set(0);
            this.f310661e.set(0);
            this.f310662f.set(0);
        }
    }

    /* renamed from: u */
    public void mo148218u(MediaCodec.Callback callback, Handler handler) {
        this.f310657a.setCallback(callback, handler);
    }

    /* renamed from: v */
    public void mo148219v(Surface surface) {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(81);
            this.f310657a.setOutputSurface(surface);
            MediaCodecProxyUtils.C104618b.m140206a(82);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy setOutputSurface", new Object[0]);
            m140213t(34, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: w */
    public final void mo148220w(Bundle bundle) {
        try {
            MediaCodecProxyUtils.C104618b.m140206a(150);
            this.f310657a.setParameters(bundle);
            MediaCodecProxyUtils.C104618b.m140206a(151);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy setParameters, thread:[%s]", Integer.valueOf(Process.myTid()));
            m140213t(57, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: x */
    public final void mo148221x() {
        try {
            Log.m105925i("MicroMsg.MediaCodecProxy", "signalEndOfInputStream function, thread:[%s]", Integer.valueOf(Process.myTid()));
            MediaCodecProxyUtils.C104618b.m140206a(117);
            this.f310657a.signalEndOfInputStream();
            MediaCodecProxyUtils.C104618b.m140206a(118);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy signalEndOfInputStream, thread:[%s]", Integer.valueOf(Process.myTid()));
            m140213t(46, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: y */
    public final void mo148222y() {
        try {
            Log.m105925i("MicroMsg.MediaCodecProxy", "start function, thread:[%s]", Integer.valueOf(Process.myTid()));
            if (!this.f310659c) {
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy start not alive");
            }
            MediaCodecProxyUtils.C104618b.m140206a(90);
            this.f310657a.start();
            MediaCodecProxyUtils.C104618b.m140206a(91);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy start", new Object[0]);
            m140213t(37, e, this.f310658b);
            throw e;
        }
    }

    /* renamed from: z */
    public final void mo148223z() {
        try {
            Log.m105925i("MicroMsg.MediaCodecProxy", "stop function, thread:[%s]", Integer.valueOf(Process.myTid()));
            if (!this.f310659c) {
                Log.m105920e("MicroMsg.MediaCodecProxy", "MediaCodecProxy stop not alive");
            }
            MediaCodecProxyUtils.C104618b.m140206a(93);
            this.f310657a.stop();
            MediaCodecProxyUtils.C104618b.m140206a(94);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e, "MediaCodecProxy stop", new Object[0]);
            m140213t(38, e, this.f310658b);
            throw e;
        }
    }
}
