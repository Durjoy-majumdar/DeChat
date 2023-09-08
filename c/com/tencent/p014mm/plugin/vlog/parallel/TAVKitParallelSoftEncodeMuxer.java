package com.tencent.p014mm.plugin.vlog.parallel;

import android.media.MediaFormat;
import android.text.TextUtils;
import com.tencent.p014mm.mediaplus.ParallelMuxerJni;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.tav.decoder.muxer.MediaMuxerFactory;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p206nj.C88957l;
import rw0.C101478s;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer */
public final class TAVKitParallelSoftEncodeMuxer {

    /* renamed from: a */
    public static final TAVKitParallelSoftEncodeMuxer f316508a = new TAVKitParallelSoftEncodeMuxer();

    /* renamed from: b */
    public static final SightVideoJNIMediaMuxerFactory f316509b = new SightVideoJNIMediaMuxerFactory();

    @Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/parallel/TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory;", "Lcom/tencent/tav/decoder/muxer/MediaMuxerFactory$MediaMuxerCreator;", "()V", "createMediaMuxer", "Lcom/tencent/tav/decoder/muxer/IMediaMuxer;", "path", "", "format", "", "parallelMux", "muxers", "", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.vlog.parallel.TAVKitParallelSoftEncodeMuxer$SightVideoJNIMediaMuxerFactory */
    public static final class SightVideoJNIMediaMuxerFactory implements MediaMuxerFactory.MediaMuxerCreator {
        public IMediaMuxer createMediaMuxer(String str, int i) {
            C87412m.m108594g(str, "path");
            return new C106212c(str, i);
        }

        public int parallelMux(List<? extends IMediaMuxer> list) {
            MediaFormat mediaFormat;
            T t;
            T t2;
            ArrayList arrayList;
            boolean z;
            boolean z2;
            List<? extends IMediaMuxer> list2 = list;
            if (list2 == null) {
                return -1;
            }
            TAVKitParallelSoftEncodeMuxer tAVKitParallelSoftEncodeMuxer = TAVKitParallelSoftEncodeMuxer.f316508a;
            Log.m105924i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "parallelMuxImp size:" + list.size());
            ExportConfig exportConfig = ((C106212c) C110818d0.m150914L(list)).getExportConfig();
            Iterator<T> it = list.iterator();
            while (true) {
                mediaFormat = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C106212c) t).getAudioFormat() != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C106212c cVar = (C106212c) t;
            MediaFormat audioFormat = cVar != null ? cVar.getAudioFormat() : null;
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it4.next();
                if (((C106212c) t2).getVideoFormat() != null) {
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
            C106212c cVar2 = (C106212c) t2;
            if (cVar2 != null) {
                mediaFormat = cVar2.getVideoFormat();
            }
            int integer = (audioFormat != null && audioFormat.containsKey("channel-count")) ? audioFormat.getInteger("channel-count") : 0;
            int integer2 = (mediaFormat != null && mediaFormat.containsKey("frame-rate")) ? mediaFormat.getInteger("frame-rate") : 0;
            if (integer2 < 1) {
                integer2 = 30;
            }
            int audioChannelCount = exportConfig != null ? exportConfig.getAudioChannelCount() : 0;
            if (integer < 0) {
                integer = audioChannelCount;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C110818d0.m150943o0(list2, new C106214e());
            ParallelMuxerJni parallelMuxerJni = new ParallelMuxerJni();
            parallelMuxerJni.mo148331e();
            Iterator<T> it5 = list.iterator();
            String str = "";
            long j = 0;
            while (it5.hasNext()) {
                C106212c cVar3 = (C106212c) it5.next();
                C106139e sightEncode = cVar3.getSightEncode();
                String muxerTempVideoPath = SightVideoJNI.getMuxerTempVideoPath(sightEncode != null ? sightEncode.f316167a : 0);
                if (cVar3.getVideoFormat() != null && C86013q1.m106450k(muxerTempVideoPath)) {
                    C106139e sightEncode2 = cVar3.getSightEncode();
                    int i = sightEncode2 != null ? sightEncode2.f316167a : -1;
                    arrayList3.add(Integer.valueOf(i));
                    C87412m.m108591d(muxerTempVideoPath);
                    arrayList2.add(muxerTempVideoPath);
                    j += (long) cVar3.getVideoFrameCount();
                    long[] softEncodeDtsArray = SightVideoJNI.getSoftEncodeDtsArray(i);
                    C87412m.m108593f(softEncodeDtsArray, "getSoftEncodeDtsArray(bufId)");
                    float f = (float) integer2;
                    parallelMuxerJni.mo148328b(softEncodeDtsArray, f);
                    long[] softEncodePtsArray = SightVideoJNI.getSoftEncodePtsArray(i);
                    C87412m.m108593f(softEncodePtsArray, "getSoftEncodePtsArray(bufId)");
                    parallelMuxerJni.mo148330d(softEncodePtsArray, cVar3.getVideoFrameCount(), f);
                } else if (cVar3.getVideoFormat() != null && !C86013q1.m106450k(muxerTempVideoPath)) {
                    Log.m105920e("MicroMsg.TAVKitParallelSoftEncodeMuxer", "mux error,empty video file index:" + cVar3.getIndex() + " path:" + muxerTempVideoPath);
                    TAVKitParallelSoftEncodeMuxer.f316508a.mo152164a(parallelMuxerJni, list2);
                    return -2;
                }
                C106210a aVar = cVar3.f316536d;
                if (aVar != null) {
                    long l = C86013q1.m106451l(aVar.f316516f);
                    StringBuilder sb = new StringBuilder();
                    arrayList = arrayList3;
                    sb.append("muxer[");
                    sb.append(cVar3.getIndex());
                    sb.append("] write audio,path:");
                    sb.append(aVar.f316516f);
                    sb.append(" size:");
                    sb.append(l);
                    Log.m105924i("MicroMsg.TAVKitParallelSoftEncodeMuxer", sb.toString());
                    if (l > 0) {
                        parallelMuxerJni.mo148327a(C110818d0.m150954z0(aVar.f316518h));
                        str = aVar.f316516f;
                    } else {
                        Log.m105920e("MicroMsg.TAVKitParallelSoftEncodeMuxer", "mux error,empty audio file.index:" + cVar3.getIndex());
                        TAVKitParallelSoftEncodeMuxer.f316508a.mo152164a(parallelMuxerJni, list2);
                        return -3;
                    }
                } else {
                    arrayList = arrayList3;
                }
                arrayList3 = arrayList;
            }
            boolean z3 = integer <= 0 || TextUtils.isEmpty(str);
            Log.m105924i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "parallelMuxImp before start,videoFrameCount:" + j + " audioChannelCount " + integer + " mute:" + z3);
            Object[] array = arrayList2.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            int f2 = parallelMuxerJni.mo148332f((String[]) array, str, ((C106212c) C110818d0.m150914L(list)).f316533a, j, (float) integer2, z3);
            tAVKitParallelSoftEncodeMuxer.mo152164a(parallelMuxerJni, list2);
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                String str2 = (String) it6.next();
                if (C86013q1.m106450k(str2)) {
                    C86013q1.m106447h(str2);
                }
            }
            if (C86013q1.m106450k(str)) {
                C86013q1.m106447h(str);
            }
            Log.m105924i("MicroMsg.TAVKitParallelSoftEncodeMuxer", "stop ret:" + f2);
            return f2;
        }
    }

    static {
        C101478s.vx0();
        C88957l.m111078n("mediaplus");
    }

    /* renamed from: a */
    public final void mo152164a(ParallelMuxerJni parallelMuxerJni, List<C106212c> list) {
        parallelMuxerJni.mo148333g();
        for (C106212c cVar : list) {
            cVar.release();
            cVar.clearResource();
        }
    }
}
