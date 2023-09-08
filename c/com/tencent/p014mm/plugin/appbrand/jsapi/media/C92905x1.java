package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.x1 */
public final class C92905x1 extends C115249m {
    public static final int CTRL_INDEX = 216;
    public static final String NAME = "saveVideoToPhotosAlbum";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.x1$a */
    public class C92906a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267596d;

        public C92906a(C92905x1 x1Var, String str) {
            this.f267596d = str;
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(this.f267596d)}), 1).show();
        }
    }

    /* renamed from: x */
    public boolean mo127298x(String str) {
        return Util.nullAsNil(str).toLowerCase().contains("video");
    }

    /* renamed from: y */
    public String mo127299y(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "mp4";
        }
        return AndroidMediaUtil.getExportVideoPath(str);
    }

    /* renamed from: z */
    public void mo127300z(String str) {
        MMHandlerThread.postToMainThread(new C92906a(this, str));
    }
}
