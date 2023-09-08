package k72;

import android.os.Process;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import lu3.C88654b;

/* renamed from: k72.h */
public class C108910h {

    /* renamed from: a */
    public C108912b f326266a;

    /* renamed from: b */
    public int f326267b;

    /* renamed from: c */
    public int f326268c;

    /* renamed from: d */
    public int f326269d;

    /* renamed from: e */
    public int f326270e;

    /* renamed from: f */
    public int f326271f = 0;

    /* renamed from: k72.h$b */
    public class C108912b extends C88654b {

        /* renamed from: e */
        public volatile int f326272e;

        /* renamed from: f */
        public int f326273f;

        /* renamed from: g */
        public boolean f326274g;

        /* renamed from: h */
        public final Object f326275h = new Object();

        public C108912b(C108910h hVar, C108911a aVar) {
        }

        public String getKey() {
            return "MediaCodecFFMpegTranscoder_Encoder";
        }

        public void run() {
            if (this.f326273f == -1) {
                this.f326273f = Process.myTid();
                Process.setThreadPriority(Process.myTid(), -2);
                Log.m105925i("MicroMsg.MMSightRemuxX264Encoder", "encodeTid: %s", Integer.valueOf(this.f326273f));
            }
            this.f326272e = 0;
            synchronized (this.f326275h) {
                while (!this.f326274g) {
                    long currentTicks = Util.currentTicks();
                    Log.m105924i("MicroMsg.MMSightRemuxX264Encoder", "try trigger encode");
                    int triggerEncodeForSegmentLock = MP4MuxerJNI.triggerEncodeForSegmentLock(Math.max(0, this.f326272e), false);
                    Log.m105925i("MicroMsg.MMSightRemuxX264Encoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(this.f326272e), Integer.valueOf(triggerEncodeForSegmentLock), Long.valueOf(Thread.currentThread().getId()));
                    if (triggerEncodeForSegmentLock == this.f326272e) {
                        try {
                            Thread.sleep(10);
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.MMSightRemuxX264Encoder", "thread sleep error");
                        }
                    }
                    this.f326272e = triggerEncodeForSegmentLock;
                }
                long currentTicks2 = Util.currentTicks();
                this.f326272e = MP4MuxerJNI.triggerEncodeForSegmentLock(this.f326272e, true);
                Log.m105925i("MicroMsg.MMSightRemuxX264Encoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks2)), Integer.valueOf(this.f326272e), Long.valueOf(Thread.currentThread().getId()));
            }
        }
    }

    public C108910h(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15) {
        this.f326267b = i;
        this.f326268c = i2;
        this.f326269d = i3;
        this.f326270e = i4;
    }
}
