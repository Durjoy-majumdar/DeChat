package com.tencent.p014mm.plugin.vlog.parallel;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C8480h;
import gy3.C87412m;
import hi2.C32925e;
import iy3.C60641c;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.vlog.parallel.a */
public final class C106210a {

    /* renamed from: l */
    public static final C96561a f316510l = new C96561a((C8480h) null);

    /* renamed from: a */
    public boolean f316511a;

    /* renamed from: b */
    public int f316512b;

    /* renamed from: c */
    public MediaFormat f316513c;

    /* renamed from: d */
    public int f316514d;

    /* renamed from: e */
    public int f316515e;

    /* renamed from: f */
    public String f316516f;

    /* renamed from: g */
    public ArrayList<Long> f316517g;

    /* renamed from: h */
    public ArrayList<Long> f316518h;

    /* renamed from: i */
    public final String f316519i;

    /* renamed from: j */
    public WritableByteChannel f316520j;

    /* renamed from: k */
    public int f316521k;

    /* renamed from: com.tencent.mm.plugin.vlog.parallel.a$a */
    public static final class C96561a {
        public C96561a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C106210a mo134640a(MediaFormat mediaFormat, String str) {
            String str2;
            C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            C87412m.m108594g(str, DownloadInfo.FILENAME);
            String string = mediaFormat.getString("mime");
            boolean z = string != null && C112550d0.m153801u(string, "video", false);
            if (z) {
                C32925e eVar = C32925e.f89499a;
                str2 = eVar.mo58863c("mux", System.currentTimeMillis() + "..h264");
            } else {
                C32925e eVar2 = C32925e.f89499a;
                str2 = eVar2.mo58863c("mux", System.currentTimeMillis() + "..aac");
            }
            return new C106210a(z, z ? 1 : 0, mediaFormat, 0, 0, str2, (ArrayList) null, (ArrayList) null, 216, (C8480h) null);
        }
    }

    public C106210a(boolean z, int i, MediaFormat mediaFormat, int i2, int i3, String str, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i4, C8480h hVar) {
        i2 = (i4 & 8) != 0 ? 0 : i2;
        i3 = (i4 & 16) != 0 ? 0 : i3;
        arrayList = (i4 & 64) != 0 ? new ArrayList<>() : arrayList;
        arrayList2 = (i4 & 128) != 0 ? new ArrayList<>() : arrayList2;
        C87412m.m108594g(mediaFormat, "mediaFormat");
        C87412m.m108594g(str, "localSavePath");
        C87412m.m108594g(arrayList, "pendingMediaDts");
        C87412m.m108594g(arrayList2, "pendingMediaPts");
        this.f316511a = z;
        this.f316512b = i;
        this.f316513c = mediaFormat;
        this.f316514d = i2;
        this.f316515e = i3;
        this.f316516f = str;
        this.f316517g = arrayList;
        this.f316518h = arrayList2;
        this.f316519i = "MicroMsg.ParallelMuxTrackInfo";
    }

    /* renamed from: a */
    public final void mo152165a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        C87412m.m108594g(byteBuffer, "byteBuf");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        this.f316514d++;
        int b = C60641c.m70921b(((float) bufferInfo.presentationTimeUs) / 1000.0f);
        if (b > this.f316515e) {
            this.f316515e = b;
        }
        if (this.f316520j == null) {
            this.f316520j = C86013q1.m106430L(C116299g2.m163858n(this.f316516f), (C116281f0.C116288h) null, false);
            Log.m105924i(this.f316519i, "create localSavePath:" + this.f316516f);
        }
        try {
            boolean z = byteBuffer.remaining() <= 0 || byteBuffer.get(byteBuffer.position()) != -1;
            if (!this.f316511a && z) {
                byte[] aACADTSHeaderData = SightVideoJNI.getAACADTSHeaderData(byteBuffer.limit(), bufferInfo.presentationTimeUs, this.f316513c.containsKey("aac-profile") ? this.f316513c.getInteger("aac-profile") : 2, this.f316513c.containsKey("sample-rate") ? this.f316513c.getInteger("sample-rate") : 4, this.f316513c.containsKey("channel-count") ? this.f316513c.getInteger("channel-count") : 1);
                WritableByteChannel writableByteChannel = this.f316520j;
                if (writableByteChannel != null) {
                    writableByteChannel.write(ByteBuffer.wrap(aACADTSHeaderData));
                }
            }
            if (this.f316511a && bufferInfo.presentationTimeUs < ((Number) C110818d0.m150923U(this.f316517g)).longValue()) {
                this.f316521k++;
            }
            WritableByteChannel writableByteChannel2 = this.f316520j;
            if (writableByteChannel2 != null) {
                writableByteChannel2.write(byteBuffer);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f316519i, e, "", new Object[0]);
        }
        if (bufferInfo.presentationTimeUs != 0 || this.f316518h.size() <= 0) {
            this.f316518h.add(Long.valueOf(bufferInfo.presentationTimeUs));
            return;
        }
        Log.m105920e(this.f316519i, "happen error ,bufferInfo size:" + bufferInfo.size);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C106210a)) {
            return false;
        }
        C106210a aVar = (C106210a) obj;
        return this.f316511a == aVar.f316511a && this.f316512b == aVar.f316512b && C87412m.m108589b(this.f316513c, aVar.f316513c) && this.f316514d == aVar.f316514d && this.f316515e == aVar.f316515e && C87412m.m108589b(this.f316516f, aVar.f316516f) && C87412m.m108589b(this.f316517g, aVar.f316517g) && C87412m.m108589b(this.f316518h, aVar.f316518h);
    }

    public int hashCode() {
        boolean z = this.f316511a;
        if (z) {
            z = true;
        }
        return ((((((((((((((z ? 1 : 0) * true) + this.f316512b) * 31) + this.f316513c.hashCode()) * 31) + this.f316514d) * 31) + this.f316515e) * 31) + this.f316516f.hashCode()) * 31) + this.f316517g.hashCode()) * 31) + this.f316518h.hashCode();
    }

    public String toString() {
        return "ParallelMuxTrackInfo(isVideoTrack=" + this.f316511a + ", trackId=" + this.f316512b + ", mediaFormat=" + this.f316513c + ", frameCount=" + this.f316514d + ", trackDuration=" + this.f316515e + ", localSavePath=" + this.f316516f + ", pendingMediaDts=" + this.f316517g + ", pendingMediaPts=" + this.f316518h + ')';
    }
}
