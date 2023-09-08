package com.tencent.p014mm.plugin.vlog.model;

import android.graphics.Rect;
import android.util.Size;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import te3.C101758az;
import te3.C64899zy;

/* renamed from: com.tencent.mm.plugin.vlog.model.w */
public interface C57465w {

    /* renamed from: com.tencent.mm.plugin.vlog.model.w$a */
    public static final class C57466a {
        /* renamed from: a */
        public static /* synthetic */ C101758az m66223a(C57465w wVar, String str, VideoTransPara videoTransPara, Size size, Rect rect, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                return wVar.mo81181b(str, videoTransPara, size, rect, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: chooseExportConfig");
        }
    }

    /* renamed from: a */
    C64899zy mo81180a();

    /* renamed from: b */
    C101758az mo81181b(String str, VideoTransPara videoTransPara, Size size, Rect rect, boolean z, boolean z2);
}
