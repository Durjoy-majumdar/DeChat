package com.tencent.p014mm.plugin.finder.preload;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.VideoFeedProgressChangeEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.preload.b */
public final class C56186b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MediaPreloadCore f160323d;

    /* renamed from: e */
    public final /* synthetic */ VideoFeedProgressChangeEvent f160324e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56186b(MediaPreloadCore mediaPreloadCore, VideoFeedProgressChangeEvent videoFeedProgressChangeEvent) {
        super(0);
        this.f160323d = mediaPreloadCore;
        this.f160324e = videoFeedProgressChangeEvent;
    }

    public Object invoke() {
        MediaPreloadCore mediaPreloadCore = this.f160323d;
        String str = this.f160324e.f154897d.f154898a;
        C87412m.m108593f(str, "event.data.mediaId");
        VideoFeedProgressChangeEvent.C55175a aVar = this.f160324e.f154897d;
        long j = aVar.f154899b;
        long j2 = aVar.f154900c;
        long j3 = aVar.f154901d;
        int i = aVar.f154902e;
        boolean z = MediaPreloadCore.f160304p;
        mediaPreloadCore.getClass();
        C37521f.f99374d.getClass();
        if (C37521f.f99330X6.mo60266n().intValue() == 0) {
            Log.m105928w("Finder.MediaPreloadCore", "checkProgressToAdjustPreload return for disable");
        } else if (TextUtils.isEmpty(str) || !C87412m.m108589b(str, mediaPreloadCore.f160311j)) {
            Log.m105928w("Finder.MediaPreloadCore", "checkProgressToAdjustPreload return for mediaId:" + str + " focusMediaId:" + mediaPreloadCore.f160311j);
        } else {
            String str2 = "Finder.MediaPreloadCore";
            double d = (((double) j) * 8.0d) / ((double) j3);
            if (j >= j2) {
                mediaPreloadCore.mo78446g3("checkProgressToAdjustPreload#1");
            } else {
                int i2 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154569x;
                String str3 = str2;
                double d2 = d - ((double) i);
                String str4 = "checkProgressToAdjustPreload return for mediaId:";
                MediaPreloadCore mediaPreloadCore2 = mediaPreloadCore;
                String str5 = " curBufferDuration:";
                String str6 = " minBufferDuration:";
                String str7 = " curPlayPos:";
                long j4 = j3;
                if (i <= 0 || i2 <= 0 || d2 <= 0.0d) {
                    int i3 = i2;
                    String str8 = str7;
                    Log.m105928w(str3, str4 + str + " bufferDuration:" + d + " offset:" + j + " total:" + j2 + " bitrate:" + j4 + str8 + i + str6 + i3 + str5 + d2);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkProgressToAdjustPreload adjust mediaId:");
                    sb.append(str);
                    sb.append(" bufferDuration:");
                    sb.append(d);
                    sb.append(" offset:");
                    sb.append(j);
                    sb.append(" total:");
                    sb.append(j2);
                    sb.append(" bitrate:");
                    sb.append(j4);
                    sb.append(str7);
                    sb.append(i);
                    sb.append(str6);
                    sb.append(i2);
                    sb.append(str5);
                    double d3 = d2;
                    sb.append(d3);
                    Log.m105928w(str3, sb.toString());
                    if (d3 < ((double) i2)) {
                        mediaPreloadCore2.mo78447i3("checkProgressToAdjustPreload#2");
                    } else {
                        mediaPreloadCore2.mo78446g3("checkProgressToAdjustPreload#3");
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
