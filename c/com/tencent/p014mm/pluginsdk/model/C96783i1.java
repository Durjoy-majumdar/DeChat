package com.tencent.p014mm.pluginsdk.model;

import android.os.FileObserver;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.model.i1 */
public class C96783i1 extends FileObserver {

    /* renamed from: a */
    public String f283529a;

    /* renamed from: b */
    public C96784a f283530b;

    /* renamed from: com.tencent.mm.pluginsdk.model.i1$a */
    public interface C96784a {
        /* renamed from: a */
        void mo132611a(String str);
    }

    public C96783i1(String str, C96784a aVar) {
        super(str);
        Log.m105924i("MicroMsg.ScreenshotObserver", "observer  " + str);
        this.f283530b = aVar;
    }

    public void onEvent(int i, String str) {
        if (str != null && i == 8) {
            String str2 = this.f283529a;
            if (str2 == null || !str.equalsIgnoreCase(str2)) {
                this.f283529a = str;
                this.f283530b.mo132611a(str);
                Log.m105924i("MicroMsg.ScreenshotObserver", "Send event to listener. " + str);
            }
        }
    }
}
