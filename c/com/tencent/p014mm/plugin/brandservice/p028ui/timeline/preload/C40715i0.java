package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import rx3.C13601g;
import xx0.C53458b;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 */
public final class C40715i0 {
    /* renamed from: a */
    public static final String m43971a(int i, String str) {
        C87412m.m108594g(str, "uid");
        String str2 = C53458b.m59915j() + i + '_' + str + ".html";
        C13601g gVar = C40716j0.f109362a;
        Log.m105918d("MicroMsg.TmplInfoEx", "genTmplPath() tmplPath:" + str2);
        return str2;
    }

    /* renamed from: b */
    public static final String m43972b(int i, String str, String str2) {
        C87412m.m108594g(str, "uid");
        C87412m.m108594g(str2, "file");
        String str3 = C53458b.m59915j() + i + '_' + str + XVFSFile.SEPARATOR_CHAR + str2;
        C13601g gVar = C40716j0.f109362a;
        Log.m105918d("MicroMsg.TmplInfoEx", "genTmplPath() tmplPath:" + str3);
        return str3;
    }
}
