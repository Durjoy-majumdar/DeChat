package qz1;

import com.tencent.p014mm.feature.emoji.api.IGIFJNIService;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p823sg.C48380r;

/* renamed from: qz1.f */
public class C101331f {

    /* renamed from: a */
    public final int[] f296869a;

    public C101331f(String str) {
        Class cls = IGIFJNIService.class;
        int[] iArr = new int[6];
        this.f296869a = iArr;
        try {
            ((IGIFJNIService) C86312j.m106911c(cls)).recycle(((IGIFJNIService) C86312j.m106911c(cls)).openByFilePath(C48380r.m53726a(str, false), iArr));
            Log.m105925i("MMGIFInfo", "width:%d height:%d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        } catch (MMGIFException e) {
            Log.m105920e("MMGIFInfo", Util.stackTraceToString(e));
            throw new IllegalStateException(e);
        }
    }
}
