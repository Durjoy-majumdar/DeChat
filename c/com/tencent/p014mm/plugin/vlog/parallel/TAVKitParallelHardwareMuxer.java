package com.tencent.p014mm.plugin.vlog.parallel;

import android.media.MediaFormat;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.tav.decoder.muxer.MediaMuxerFactory;
import gy3.C87412m;
import kotlin.Metadata;
import p206nj.C88957l;
import rw0.C101478s;

/* renamed from: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer */
public final class TAVKitParallelHardwareMuxer {

    /* renamed from: a */
    public static final TAVKitParallelHardwareMuxer f282626a = new TAVKitParallelHardwareMuxer();

    /* renamed from: b */
    public static final SightVideoJNIMediaMuxerFactory f282627b = new SightVideoJNIMediaMuxerFactory();

    @Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/parallel/TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory;", "Lcom/tencent/tav/decoder/muxer/MediaMuxerFactory$MediaMuxerCreator;", "()V", "createMediaMuxer", "Lcom/tencent/tav/decoder/muxer/IMediaMuxer;", "path", "", "format", "", "parallelMux", "muxers", "", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer$SightVideoJNIMediaMuxerFactory */
    public static final class SightVideoJNIMediaMuxerFactory implements MediaMuxerFactory.MediaMuxerCreator {
        public IMediaMuxer createMediaMuxer(String str, int i) {
            C87412m.m108594g(str, "path");
            return new C106211b(str, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:137:0x0384 A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0386 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parallelMux(java.util.List<? extends com.tencent.tav.decoder.muxer.IMediaMuxer> r22) {
            /*
                r21 = this;
                r0 = r22
                if (r0 == 0) goto L_0x0388
                java.lang.Object r2 = sx3.C110818d0.m150914L(r22)
                boolean r2 = r2 instanceof com.tencent.p014mm.plugin.vlog.parallel.C106211b
                if (r2 == 0) goto L_0x0388
                com.tencent.mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer r2 = com.tencent.p014mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer.f282626a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "parallelMuxImp size:"
                r3.append(r4)
                int r4 = r22.size()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.TAVKitParallelMuxer"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                java.util.Iterator r3 = r22.iterator()
            L_0x002c:
                boolean r5 = r3.hasNext()
                r6 = 0
                r8 = 0
                if (r5 == 0) goto L_0x0047
                java.lang.Object r5 = r3.next()
                r9 = r5
                com.tencent.mm.plugin.vlog.parallel.b r9 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r9
                com.tencent.mm.plugin.vlog.parallel.a r9 = r9.mo152170b()
                if (r9 == 0) goto L_0x0043
                r9 = 1
                goto L_0x0044
            L_0x0043:
                r9 = 0
            L_0x0044:
                if (r9 == 0) goto L_0x002c
                goto L_0x0048
            L_0x0047:
                r5 = r6
            L_0x0048:
                com.tencent.mm.plugin.vlog.parallel.b r5 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r5
                if (r5 == 0) goto L_0x004f
                com.tencent.tav.core.ExportConfig r3 = r5.f316524c
                goto L_0x0050
            L_0x004f:
                r3 = r6
            L_0x0050:
                java.util.Iterator r5 = r22.iterator()
            L_0x0054:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x0073
                java.lang.Object r9 = r5.next()
                r10 = r9
                com.tencent.mm.plugin.vlog.parallel.b r10 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r10
                com.tencent.mm.plugin.vlog.parallel.a r10 = r10.mo152169a()
                if (r10 == 0) goto L_0x006a
                android.media.MediaFormat r10 = r10.f316513c
                goto L_0x006b
            L_0x006a:
                r10 = r6
            L_0x006b:
                if (r10 == 0) goto L_0x006f
                r10 = 1
                goto L_0x0070
            L_0x006f:
                r10 = 0
            L_0x0070:
                if (r10 == 0) goto L_0x0054
                goto L_0x0074
            L_0x0073:
                r9 = r6
            L_0x0074:
                com.tencent.mm.plugin.vlog.parallel.b r9 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r9
                if (r9 == 0) goto L_0x007d
                com.tencent.mm.plugin.vlog.parallel.a r5 = r9.mo152169a()
                goto L_0x007e
            L_0x007d:
                r5 = r6
            L_0x007e:
                java.util.Iterator r9 = r22.iterator()
            L_0x0082:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x00a1
                java.lang.Object r10 = r9.next()
                r11 = r10
                com.tencent.mm.plugin.vlog.parallel.b r11 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r11
                com.tencent.mm.plugin.vlog.parallel.a r11 = r11.mo152170b()
                if (r11 == 0) goto L_0x0098
                android.media.MediaFormat r11 = r11.f316513c
                goto L_0x0099
            L_0x0098:
                r11 = r6
            L_0x0099:
                if (r11 == 0) goto L_0x009d
                r11 = 1
                goto L_0x009e
            L_0x009d:
                r11 = 0
            L_0x009e:
                if (r11 == 0) goto L_0x0082
                goto L_0x00a2
            L_0x00a1:
                r10 = r6
            L_0x00a2:
                com.tencent.mm.plugin.vlog.parallel.b r10 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r10
                if (r10 == 0) goto L_0x00ab
                com.tencent.mm.plugin.vlog.parallel.a r9 = r10.mo152170b()
                goto L_0x00ac
            L_0x00ab:
                r9 = r6
            L_0x00ac:
                if (r5 == 0) goto L_0x00b1
                android.media.MediaFormat r5 = r5.f316513c
                goto L_0x00b2
            L_0x00b1:
                r5 = r6
            L_0x00b2:
                if (r9 == 0) goto L_0x00b7
                android.media.MediaFormat r10 = r9.f316513c
                goto L_0x00b8
            L_0x00b7:
                r10 = r6
            L_0x00b8:
                java.lang.String r11 = "sample-rate"
                int r11 = r2.mo134639a(r5, r11, r8)
                java.lang.String r12 = "channel-count"
                int r5 = r2.mo134639a(r5, r12, r8)
                java.lang.String r12 = "frame-rate"
                int r13 = r2.mo134639a(r10, r12, r8)
                java.lang.String r14 = "bitrate"
                int r14 = r2.mo134639a(r10, r14, r8)
                int r2 = r2.mo134639a(r10, r12, r8)
                float r2 = (float) r2
                if (r9 == 0) goto L_0x00e3
                int r10 = r9.f316514d
                float r10 = (float) r10
                r12 = 1148846080(0x447a0000, float:1000.0)
                float r10 = r10 * r12
                int r9 = r9.f316515e
                float r9 = (float) r9
                float r10 = r10 / r9
                goto L_0x00e5
            L_0x00e3:
                r10 = 1106247680(0x41f00000, float:30.0)
            L_0x00e5:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r12 = "audioSampleRate:"
                r9.append(r12)
                r9.append(r11)
                java.lang.String r12 = " \naudioChannelCount:"
                r9.append(r12)
                r9.append(r5)
                java.lang.String r12 = " \nmediaFormatFps:"
                r9.append(r12)
                r9.append(r13)
                java.lang.String r12 = " \nvideoBitrate:"
                r9.append(r12)
                r9.append(r14)
                java.lang.String r12 = "\nduration:$0\ncountFps:"
                r9.append(r12)
                r9.append(r10)
                java.lang.String r12 = "\nconfigToSoftEncode:"
                r9.append(r12)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r12 = "exportConfig: \naudioSampleRate:"
                r9.append(r12)
                if (r3 == 0) goto L_0x0133
                int r12 = r3.getAudioSampleRateHz()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0134
            L_0x0133:
                r12 = r6
            L_0x0134:
                r9.append(r12)
                java.lang.String r12 = "\naudioChannelCount:"
                r9.append(r12)
                if (r3 == 0) goto L_0x0147
                int r12 = r3.getAudioChannelCount()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0148
            L_0x0147:
                r12 = r6
            L_0x0148:
                r9.append(r12)
                java.lang.String r12 = "\nvideoBitrate:"
                r9.append(r12)
                if (r3 == 0) goto L_0x015b
                int r12 = r3.getVideoBitRate()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x015c
            L_0x015b:
                r12 = r6
            L_0x015c:
                r9.append(r12)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
                if (r11 > 0) goto L_0x016d
                if (r3 == 0) goto L_0x016d
                r3.getAudioSampleRateHz()
            L_0x016d:
                if (r5 > 0) goto L_0x0177
                if (r3 == 0) goto L_0x0176
                int r5 = r3.getAudioChannelCount()
                goto L_0x0177
            L_0x0176:
                r5 = 0
            L_0x0177:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                com.tencent.mm.plugin.vlog.parallel.d r9 = new com.tencent.mm.plugin.vlog.parallel.d
                r9.<init>()
                sx3.C110818d0.m150943o0(r0, r9)
                r9 = 1065353216(0x3f800000, float:1.0)
                int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r9 >= 0) goto L_0x018b
                r2 = r10
            L_0x018b:
                java.util.Iterator r9 = r22.iterator()
            L_0x018f:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x01a8
                java.lang.Object r10 = r9.next()
                r11 = r10
                com.tencent.mm.plugin.vlog.parallel.b r11 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r11
                com.tencent.mm.plugin.vlog.parallel.a r11 = r11.mo152170b()
                if (r11 == 0) goto L_0x01a4
                r11 = 1
                goto L_0x01a5
            L_0x01a4:
                r11 = 0
            L_0x01a5:
                if (r11 == 0) goto L_0x018f
                r6 = r10
            L_0x01a8:
                com.tencent.mm.plugin.vlog.parallel.b r6 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r6
                if (r6 == 0) goto L_0x01ba
                com.tencent.mm.plugin.vlog.parallel.a r6 = r6.mo152170b()
                if (r6 == 0) goto L_0x01ba
                int r6 = r6.f316521k
                r9 = 30
                if (r6 <= r9) goto L_0x01ba
                r6 = 1
                goto L_0x01bb
            L_0x01ba:
                r6 = 0
            L_0x01bb:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMultiDefault()
                java.lang.String r10 = "device_make_b_frame"
                r9.encode((java.lang.String) r10, (boolean) r6)
                com.tencent.mm.mediaplus.ParallelMuxerJni r6 = new com.tencent.mm.mediaplus.ParallelMuxerJni
                r6.<init>()
                r6.mo148331e()
                java.util.Iterator r9 = r22.iterator()
                java.lang.String r12 = ""
                r19 = r12
                r15 = 0
            L_0x01d6:
                boolean r12 = r9.hasNext()
                if (r12 == 0) goto L_0x0314
                java.lang.Object r12 = r9.next()
                com.tencent.mm.plugin.vlog.parallel.b r12 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r12
                com.tencent.mm.plugin.vlog.parallel.a r13 = r12.mo152170b()
                java.lang.String r14 = " info:"
                java.lang.String r7 = " size:"
                java.lang.String r1 = "muxer["
                if (r13 == 0) goto L_0x02a4
                java.lang.String r8 = r13.f316516f
                long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                int r0 = r12.f316528g
                r8.append(r0)
                java.lang.String r0 = "] write video,path:"
                r8.append(r0)
                java.lang.String r0 = r13.f316516f
                r8.append(r0)
                r8.append(r7)
                r8.append(r10)
                java.lang.String r0 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                r17 = 0
                int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
                if (r0 <= 0) goto L_0x0285
                java.util.ArrayList<java.lang.Long> r0 = r13.f316518h
                long[] r0 = sx3.C110818d0.m150954z0(r0)
                java.util.ArrayList<java.lang.Long> r8 = r13.f316517g
                long[] r8 = sx3.C110818d0.m150954z0(r8)
                r6.mo148329c(r0, r2)
                r6.mo148328b(r8, r2)
                java.lang.String r10 = r13.f316516f
                r3.add(r10)
                int r10 = r13.f316514d
                long r10 = (long) r10
                long r10 = r10 + r15
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r1)
                r20 = r9
                int r9 = r12.hashCode()
                r15.append(r9)
                java.lang.String r9 = "] size:"
                r15.append(r9)
                java.util.ArrayList<java.lang.Long> r9 = r13.f316517g
                int r9 = r9.size()
                r15.append(r9)
                java.lang.String r9 = " pts-size:"
                r15.append(r9)
                int r0 = r0.length
                r15.append(r0)
                java.lang.String r0 = " dts-size:"
                r15.append(r0)
                int r0 = r8.length
                r15.append(r0)
                java.lang.String r0 = " frame-size:"
                r15.append(r0)
                int r0 = r13.f316514d
                r15.append(r0)
                java.lang.String r0 = " total:"
                r15.append(r0)
                r15.append(r10)
                java.lang.String r0 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                r15 = r10
                goto L_0x02a6
            L_0x0285:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "mux error,empty video file.index:"
                r0.append(r1)
                int r1 = r12.f316528g
                r0.append(r1)
                r0.append(r14)
                com.tencent.tav.coremedia.CMTimeRange r1 = r12.f316529h
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x0308
            L_0x02a4:
                r20 = r9
            L_0x02a6:
                com.tencent.mm.plugin.vlog.parallel.a r0 = r12.mo152169a()
                if (r0 == 0) goto L_0x030b
                java.lang.String r8 = r0.f316516f
                long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r1)
                int r1 = r12.f316528g
                r10.append(r1)
                java.lang.String r1 = "] write audio,path:"
                r10.append(r1)
                java.lang.String r1 = r0.f316516f
                r10.append(r1)
                r10.append(r7)
                r10.append(r8)
                java.lang.String r1 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                r10 = 0
                int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r1 <= 0) goto L_0x02ea
                java.util.ArrayList<java.lang.Long> r1 = r0.f316518h
                long[] r1 = sx3.C110818d0.m150954z0(r1)
                r6.mo148327a(r1)
                java.lang.String r0 = r0.f316516f
                r19 = r0
                goto L_0x030d
            L_0x02ea:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "mux error,empty audio file.index:"
                r0.append(r1)
                int r1 = r12.f316528g
                r0.append(r1)
                r0.append(r14)
                com.tencent.tav.coremedia.CMTimeRange r1 = r12.f316529h
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            L_0x0308:
                r0 = 0
                goto L_0x0381
            L_0x030b:
                r10 = 0
            L_0x030d:
                r0 = r22
                r9 = r20
                r8 = 0
                goto L_0x01d6
            L_0x0314:
                if (r5 <= 0) goto L_0x0321
                boolean r0 = android.text.TextUtils.isEmpty(r19)
                if (r0 == 0) goto L_0x031d
                goto L_0x0321
            L_0x031d:
                r0 = 0
                r18 = 0
                goto L_0x0324
            L_0x0321:
                r0 = 0
                r18 = 1
            L_0x0324:
                java.lang.String[] r1 = new java.lang.String[r0]
                java.lang.Object[] r1 = r3.toArray(r1)
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                gy3.C87412m.m108592e(r1, r5)
                r12 = r1
                java.lang.String[] r12 = (java.lang.String[]) r12
                java.lang.Object r1 = sx3.C110818d0.m150914L(r22)
                com.tencent.mm.plugin.vlog.parallel.b r1 = (com.tencent.p014mm.plugin.vlog.parallel.C106211b) r1
                java.lang.String r14 = r1.f316522a
                r11 = r6
                r13 = r19
                r17 = r2
                int r1 = r11.mo148332f(r12, r13, r14, r15, r17, r18)
                r6.mo148333g()
                java.util.Iterator r2 = r3.iterator()
            L_0x034a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0360
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
                if (r5 == 0) goto L_0x034a
                com.tencent.p014mm.vfs.C86013q1.m106447h(r3)
                goto L_0x034a
            L_0x0360:
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r19)
                if (r2 == 0) goto L_0x0369
                com.tencent.p014mm.vfs.C86013q1.m106447h(r19)
            L_0x0369:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "stop ret:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                if (r1 != 0) goto L_0x0381
                r7 = 1
                goto L_0x0382
            L_0x0381:
                r7 = 0
            L_0x0382:
                if (r7 == 0) goto L_0x0386
                r1 = 0
                goto L_0x0387
            L_0x0386:
                r1 = -1
            L_0x0387:
                return r1
            L_0x0388:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.parallel.TAVKitParallelHardwareMuxer.SightVideoJNIMediaMuxerFactory.parallelMux(java.util.List):int");
        }
    }

    static {
        C101478s.vx0();
        C88957l.m111078n("mediaplus");
    }

    /* renamed from: a */
    public final int mo134639a(MediaFormat mediaFormat, String str, int i) {
        return (mediaFormat != null && mediaFormat.containsKey(str)) ? mediaFormat.getInteger(str) : i;
    }
}
