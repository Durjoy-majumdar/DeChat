package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p156gj.C107835h0;
import p206nj.C88960n;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.y1 */
public class C96895y1 {
    /* renamed from: a */
    public static C96875r0 m124471a(Context context) {
        if (Util.nullAs(C107835h0.f322856m.f322886Z, "").equals("surface")) {
            Log.m105924i("MicroMsg.VideoViewFactory", "match full type surface");
            return new VideoSurfaceView(context, (AttributeSet) null);
        } else if (C88960n.m111088a()) {
            Log.m105924i("MicroMsg.VideoViewFactory", "IS MTK platform");
            return new VideoSightView(context);
        } else {
            Log.m105924i("MicroMsg.VideoViewFactory", "default settings, use sightview");
            return new VideoSightView(context);
        }
    }
}
