package com.tencent.p014mm.plugin.scanner.model;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Enumeration;

/* renamed from: com.tencent.mm.plugin.scanner.model.i1 */
public final class C57316i1 implements Runnable {

    /* renamed from: d */
    public static final C57316i1 f164189d = new C57316i1();

    public final void run() {
        Enumeration<String> keys = C57318j1.f164194a.keys();
        C87412m.m108593f(keys, "key");
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            Bitmap bitmap = C57318j1.f164194a.get(nextElement);
            if (bitmap != null && !bitmap.isRecycled()) {
                Log.m105919d("MicroMsg.ScanTranslationDataHelper", "alvinluo recycle bitmap %s", nextElement);
                bitmap.recycle();
            }
        }
        C57318j1.f164194a.clear();
    }
}
