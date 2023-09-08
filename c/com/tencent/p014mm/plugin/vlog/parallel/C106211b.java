package com.tencent.p014mm.plugin.vlog.parallel;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.vlog.parallel.b */
public final class C106211b implements IMediaMuxer {

    /* renamed from: a */
    public final String f316522a;

    /* renamed from: b */
    public final String f316523b = ("MicroMsg.ParallelVideoJniMuxer[" + hashCode() + ']');

    /* renamed from: c */
    public ExportConfig f316524c;

    /* renamed from: d */
    public boolean f316525d;

    /* renamed from: e */
    public volatile boolean f316526e;

    /* renamed from: f */
    public ArrayList<C106210a> f316527f = new ArrayList<>();

    /* renamed from: g */
    public int f316528g = -1;

    /* renamed from: h */
    public CMTimeRange f316529h;

    /* renamed from: i */
    public int f316530i;

    /* renamed from: j */
    public int f316531j;

    /* renamed from: k */
    public ArrayList<Long> f316532k = new ArrayList<>();

    public C106211b(String str, int i) {
        C87412m.m108594g(str, "path");
        this.f316522a = str;
    }

    /* renamed from: a */
    public final C106210a mo152169a() {
        T t;
        Iterator<T> it = this.f316527f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!((C106210a) t).f316511a) {
                break;
            }
        }
        return (C106210a) t;
    }

    public int addTrack(MediaFormat mediaFormat) {
        C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
        String str = this.f316523b;
        Log.m105924i(str, '[' + hashCode() + "]add track " + mediaFormat.getString("mime"));
        C106210a a = C106210a.f316510l.mo134640a(mediaFormat, String.valueOf(hashCode()));
        this.f316527f.add(a);
        return a.f316512b;
    }

    public int audioTrackIndex() {
        C106210a a = mo152169a();
        if (a != null) {
            return a.f316512b;
        }
        return -1;
    }

    /* renamed from: b */
    public final C106210a mo152170b() {
        T t;
        Iterator<T> it = this.f316527f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C106210a) t).f316511a) {
                break;
            }
        }
        return (C106210a) t;
    }

    public void clearResource() {
        for (C106210a aVar : this.f316527f) {
            C86013q1.m106447h(aVar.f316516f);
            String str = this.f316523b;
            Log.m105924i(str, "clearResource:" + aVar.f316516f);
        }
    }

    public ExportConfig getExportConfig() {
        return this.f316524c;
    }

    public boolean ignoreHeader() {
        return false;
    }

    public boolean isMuxerStarted() {
        return this.f316525d;
    }

    public void prepareParallelSegmentInfo(int i, CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        this.f316528g = i;
        this.f316529h = cMTimeRange;
        String str = this.f316523b;
        Log.m105924i(str, "index:" + i + " segmentRange:" + cMTimeRange + " allRange:" + cMTimeRange2);
    }

    public void release() {
    }

    public void setExportConfig(ExportConfig exportConfig) {
        C87412m.m108594g(exportConfig, "exportConfig");
        this.f316524c = exportConfig;
    }

    public void start() {
        this.f316525d = true;
    }

    public boolean stop(boolean z) {
        if (!this.f316526e) {
            String str = this.f316523b;
            Log.m105924i(str, "muxer[" + hashCode() + "][" + this.f316528g + "] stop  timeCount:" + this.f316530i + "  dataCount:" + this.f316531j);
            Iterator<C106210a> it = this.f316527f.iterator();
            while (it.hasNext()) {
                C106210a next = it.next();
                next.getClass();
                try {
                    WritableByteChannel writableByteChannel = next.f316520j;
                    if (writableByteChannel != null) {
                        writableByteChannel.close();
                    }
                } catch (Exception unused) {
                }
            }
            this.f316526e = true;
            this.f316525d = false;
        }
        return true;
    }

    public int videoTrackIndex() {
        C106210a b = mo152170b();
        if (b != null) {
            return b.f316512b;
        }
        return -1;
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        T t;
        boolean z;
        C87412m.m108594g(byteBuffer, "byteBuf");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        if (this.f316526e) {
            Log.m105924i(this.f316523b, "writeSampleData error,has finished");
            return;
        }
        Iterator<T> it = this.f316527f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C106210a) t).f316512b == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C106210a aVar = (C106210a) t;
        if (aVar != null) {
            if (aVar.f316511a && bufferInfo.presentationTimeUs == 0) {
                Log.m105920e(this.f316523b, '[' + hashCode() + "]writeSampleData pts track id:" + i + "  timeUs:" + bufferInfo.presentationTimeUs);
            }
            aVar.mo152165a(byteBuffer, bufferInfo);
            this.f316531j++;
            Log.m105918d(this.f316523b, "writeSampleData index:" + this.f316531j + " value:" + bufferInfo.presentationTimeUs);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0114, code lost:
        r8 = r8.f316517g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeSampleDataTime(boolean r8, com.tencent.tav.coremedia.CMTime r9) {
        /*
            r7 = this;
            java.lang.String r0 = "sampleTime"
            gy3.C87412m.m108594g(r9, r0)
            boolean r0 = r7.f316526e
            if (r0 == 0) goto L_0x0012
            java.lang.String r8 = r7.f316523b
            java.lang.String r9 = "writeSampleDataTime error,has finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            return
        L_0x0012:
            int r0 = r7.f316530i
            r1 = 1
            int r0 = r0 + r1
            r7.f316530i = r0
            if (r8 == 0) goto L_0x012c
            com.tencent.mm.plugin.vlog.parallel.a r8 = r7.mo152170b()
            if (r8 != 0) goto L_0x002f
            java.util.ArrayList<java.lang.Long> r8 = r7.f316532k
            long r0 = r9.getTimeUs()
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r8.add(r9)
            goto L_0x012c
        L_0x002f:
            java.util.ArrayList<java.lang.Long> r8 = r7.f316532k
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r1
            if (r8 == 0) goto L_0x0069
            java.lang.String r8 = r7.f316523b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "videoTrack cache dts size:"
            r0.append(r2)
            java.util.ArrayList<java.lang.Long> r2 = r7.f316532k
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.mm.plugin.vlog.parallel.a r8 = r7.mo152170b()
            if (r8 == 0) goto L_0x0064
            java.util.ArrayList<java.lang.Long> r8 = r8.f316517g
            if (r8 == 0) goto L_0x0064
            java.util.ArrayList<java.lang.Long> r0 = r7.f316532k
            r8.addAll(r0)
        L_0x0064:
            java.util.ArrayList<java.lang.Long> r8 = r7.f316532k
            r8.clear()
        L_0x0069:
            com.tencent.mm.plugin.vlog.parallel.a r8 = r7.mo152170b()
            if (r8 == 0) goto L_0x012c
            java.util.ArrayList<java.lang.Long> r8 = r8.f316517g
            if (r8 == 0) goto L_0x012c
            int r0 = r8.size()
            r2 = 2
            if (r0 <= r2) goto L_0x00d4
            long r3 = r9.getTimeUs()
            java.lang.Object r0 = sx3.C110818d0.m150923U(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00d4
            java.lang.Object r0 = sx3.C110818d0.m150923U(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            java.lang.Object r0 = r8.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r5 = "dtsList[2]"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            long r0 = r0 - r5
            long r3 = r3 + r0
            java.lang.String r0 = r7.f316523b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "writeSampleDataTime error timeus:"
            r1.append(r2)
            long r5 = r9.getTimeUs()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r8.add(r0)
            goto L_0x00df
        L_0x00d4:
            long r0 = r9.getTimeUs()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.add(r0)
        L_0x00df:
            java.lang.String r0 = r7.f316523b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "writeSampleTime index:"
            r1.append(r2)
            int r2 = r7.f316530i
            r1.append(r2)
            java.lang.String r2 = " value:"
            r1.append(r2)
            long r2 = r9.getTimeUs()
            r1.append(r2)
            java.lang.String r9 = " dtsList:"
            r1.append(r9)
            int r8 = r8.size()
            r1.append(r8)
            java.lang.String r8 = " real:"
            r1.append(r8)
            com.tencent.mm.plugin.vlog.parallel.a r8 = r7.mo152170b()
            if (r8 == 0) goto L_0x0121
            java.util.ArrayList<java.lang.Long> r8 = r8.f316517g
            if (r8 == 0) goto L_0x0121
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0122
        L_0x0121:
            r8 = 0
        L_0x0122:
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r8)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.parallel.C106211b.writeSampleDataTime(boolean, com.tencent.tav.coremedia.CMTime):void");
    }
}
