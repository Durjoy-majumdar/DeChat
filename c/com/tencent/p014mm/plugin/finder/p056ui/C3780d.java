package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import o40.C61926c;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: com.tencent.mm.plugin.finder.ui.d */
public final class C3780d<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ String f17254a;

    /* renamed from: b */
    public final /* synthetic */ FinderActivityDescUI f17255b;

    public C3780d(String str, FinderActivityDescUI finderActivityDescUI) {
        this.f17254a = str;
        this.f17255b = finderActivityDescUI;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            String str = this.f17254a;
            C61926c.m72668M(new C3776c(this.f17255b));
            int i = FinderActivityDescUI.f16726p0;
            Log.m105924i("Finder.FinderActivityDescUI", "[handleActivityProfileCover] [" + bitmap.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + bitmap.getHeight() + "] allocationByteCount=" + Util.getSizeKB((long) bitmap.getAllocationByteCount()) + " coverUrl=" + str);
        }
    }
}
