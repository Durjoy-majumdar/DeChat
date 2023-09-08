package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.w1 */
public final class C92903w1 extends C115249m {
    public static final int CTRL_INDEX = 217;
    public static final String NAME = "saveImageToPhotosAlbum";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.w1$a */
    public class C92904a implements Runnable {
        public C92904a(C92903w1 w1Var) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getToastSysCameraPath()}), 1).show();
        }
    }

    /* renamed from: x */
    public boolean mo127298x(String str) {
        return Util.nullAsNil(str).toLowerCase().contains("image");
    }

    /* renamed from: y */
    public String mo127299y(String str) {
        return AndroidMediaUtil.getExportImagePath(str);
    }

    /* renamed from: z */
    public void mo127300z(String str) {
        MMHandlerThread.postToMainThread(new C92904a(this));
    }
}
