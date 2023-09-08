package com.tencent.p014mm.plugin.vlog.model;

import android.media.MediaFormat;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.vlog.model.e0 */
public final class C96535e0 {
    /* renamed from: a */
    public static final int m123847a(MediaFormat mediaFormat, String str, int i) {
        C87412m.m108594g(mediaFormat, "<this>");
        C87412m.m108594g(str, "name");
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }
}
