package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hd0.C98398h0;
import java.util.ArrayList;
import java.util.List;
import sx3.C77813z;

/* renamed from: com.tencent.mm.plugin.vlog.model.d */
public final class C96534d {

    /* renamed from: a */
    public static final C96534d f282494a = new C96534d();

    /* renamed from: a */
    public final C96529a mo134593a(List<C30513b> list, VideoTransPara videoTransPara, int i, int i2, boolean z, int i3) {
        int i4;
        int i5;
        int i6;
        VideoTransPara videoTransPara2 = videoTransPara;
        C87412m.m108594g(list, "videoList");
        C87412m.m108594g(videoTransPara2, "videoParams");
        ArrayList arrayList = new ArrayList();
        try {
            if ((!list.isEmpty()) && videoTransPara2.f267180u == 1) {
                for (C30513b bVar : list) {
                    float f = 1.0f;
                    int i7 = videoTransPara2.f267154A;
                    if (i7 == 1) {
                        f = videoTransPara2.f267182w;
                    } else if (i7 == 2) {
                        f = videoTransPara2.f267183x;
                    }
                    String str = bVar.f82218a;
                    int i8 = videoTransPara2.f267168f;
                    int i9 = videoTransPara2.f267169g;
                    long j = bVar.f82220c;
                    long j2 = bVar.f82219b;
                    float f2 = ((float) j2) / 1000.0f;
                    int i15 = videoTransPara2.f267184y;
                    int i16 = videoTransPara2.f267185z;
                    int i17 = videoTransPara2.f267155B;
                    int i18 = i17;
                    int i19 = i16;
                    float f3 = ((float) (j - j2)) / 1000.0f;
                    int i25 = i15;
                    int i26 = i7;
                    ABAPrams b = AdaptiveAdjustBitrate.m119557b(str, i2, i, i8, i9, f3, f2, i3, f, 0.0f, i25, i19, i26, i18, videoTransPara2.f267156C, z);
                    int i27 = videoTransPara2.f267169g;
                    if (b != null) {
                        i27 = b.outputKbps * 1000;
                        i4 = 0;
                    } else {
                        i4 = -1;
                    }
                    if (b == null || b.resolutionAdjust <= 0) {
                        i6 = i;
                        i5 = i2;
                    } else {
                        int i28 = b.outputWidth;
                        i5 = b.outputHeight;
                        i6 = i28;
                        i4 = 0;
                    }
                    Log.m105924i("MicroMsg.AdaptiveAdjustBitrateHelper", "ABA:  finder video bitrate:" + i27 + " width: " + i6 + " height:" + i5);
                    C92755e0 xx02 = C98398h0.xx0();
                    if (xx02 != null) {
                        xx02.mo126991o(b);
                    }
                    if (i4 != -1) {
                        arrayList.add(new C96529a(i4, i6, i5, i27, b));
                    }
                }
            }
            if (!(!arrayList.isEmpty()) || videoTransPara2.f267180u != 1) {
                return new C96529a(-1, 0, 0, 0, (ABAPrams) null);
            }
            C77813z.m93909o(arrayList, C96532c.f282488d);
            Object obj = arrayList.get(0);
            C87412m.m108593f(obj, "abaParamList[0]");
            return (C96529a) obj;
        } catch (Throwable unused) {
            return new C96529a(-1, 0, 0, 0, (ABAPrams) null);
        }
    }
}
