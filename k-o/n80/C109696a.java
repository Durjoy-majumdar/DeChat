package n80;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: n80.a */
public abstract class C109696a {

    /* renamed from: a */
    public C32228q<? super ByteBuffer, ? super MediaCodec.BufferInfo, ? super MediaFormat, C13598b0> f328336a;

    /* renamed from: b */
    public C32224a<C13598b0> f328337b;

    /* renamed from: c */
    public C104619a f328338c;

    /* renamed from: d */
    public MediaFormat f328339d;

    /* renamed from: e */
    public volatile boolean f328340e;

    /* renamed from: f */
    public long f328341f;

    /* renamed from: g */
    public long f328342g;

    /* renamed from: h */
    public final Object f328343h = new Object();

    public C109696a(MediaFormat mediaFormat, C32228q<? super ByteBuffer, ? super MediaCodec.BufferInfo, ? super MediaFormat, C13598b0> qVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(mediaFormat, "mediaFormat");
        C87412m.m108594g(qVar, "frameEncodeCallback");
        C87412m.m108594g(aVar, "frameEncodeEndCallback");
        this.f328336a = qVar;
        this.f328337b = aVar;
        Log.m105924i("MicroMsg.IAudioEncoder", "init audio encoder");
        mediaFormat.getString("mime");
        try {
            MediaFormat mediaFormat2 = new MediaFormat();
            this.f328339d = mediaFormat2;
            mediaFormat2.setString("mime", "audio/mp4a-latm");
            this.f328339d.setInteger("aac-profile", 2);
            this.f328339d.setInteger("sample-rate", 44100);
            int integer = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 0;
            integer = integer <= 0 ? 1 : integer;
            this.f328339d.setInteger("channel-count", integer);
            this.f328339d.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, mediaFormat.getInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE));
            this.f328339d.setInteger("max-input-size", integer * 2048);
            C104619a d = C104619a.m140212d("audio/mp4a-latm", false);
            this.f328338c = d;
            d.mo148202a(this.f328339d, (Surface) null, (MediaCrypto) null, 1);
            Log.m105924i("MicroMsg.IAudioEncoder", "finish init audio encoder, dstMediaFormat:" + this.f328339d);
        } catch (Exception unused) {
            throw new IllegalStateException("init encoder error");
        }
    }

    /* renamed from: a */
    public final void mo160914a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        C87412m.m108594g(bufferInfo, "bufferInfo");
        if (byteBuffer == null) {
            Log.m105920e("MicroMsg.IAudioEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
        } else if (bufferInfo.size > 0) {
            Log.m105924i("MicroMsg.IAudioEncoder", "encoder output buffer:" + bufferInfo.size + ", pts:" + bufferInfo.presentationTimeUs);
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            long ticksToNow = Util.ticksToNow(this.f328341f);
            this.f328342g = this.f328342g + ticksToNow;
            Log.m105924i("MicroMsg.IAudioEncoder", hashCode() + " encode frame used " + ticksToNow);
            this.f328336a.invoke(byteBuffer, bufferInfo, this.f328339d);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo160915b() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 1
            java.lang.Object r1 = r6.f328343h     // Catch:{ Exception -> 0x0042 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0042 }
            boolean r2 = r6.f328340e     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0021
            r6.f328340e = r0     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "MicroMsg.IAudioEncoder"
            java.lang.String r3 = "releaseEncoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x003d }
            com.tencent.mm.compatible.deviceinfo.a r2 = r6.f328338c     // Catch:{ all -> 0x003d }
            r2.mo148223z()     // Catch:{ all -> 0x003d }
            com.tencent.mm.compatible.deviceinfo.a r2 = r6.f328338c     // Catch:{ all -> 0x003d }
            r2.mo148214p()     // Catch:{ all -> 0x003d }
            fy3.a<rx3.b0> r2 = r6.f328337b     // Catch:{ all -> 0x003d }
            r2.invoke()     // Catch:{ all -> 0x003d }
        L_0x0021:
            java.lang.String r2 = "MicroMsg.IAudioEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r4 = "total encode used "
            r3.append(r4)     // Catch:{ all -> 0x003d }
            long r4 = r6.f328342g     // Catch:{ all -> 0x003d }
            r3.append(r4)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x003d }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003d }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0053
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0042 }
            throw r2     // Catch:{ Exception -> 0x0042 }
        L_0x0040:
            r0 = move-exception
            goto L_0x0055
        L_0x0042:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.IAudioEncoder"
            java.lang.String r3 = "releaseEncoder error: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0040 }
            r4 = 0
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0040 }
            r0[r4] = r1     // Catch:{ all -> 0x0040 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r0)     // Catch:{ all -> 0x0040 }
        L_0x0053:
            monitor-exit(r6)
            return
        L_0x0055:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n80.C109696a.mo160915b():void");
    }

    /* renamed from: c */
    public abstract void mo160916c(byte[] bArr, long j, boolean z);
}
