package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import gk3.C98140g;
import java.util.Iterator;

/* renamed from: com.tencent.mm.ui.chatting.gallery.f0 */
public class C97049f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284693d;

    public C97049f0(ImageGalleryUI imageGalleryUI) {
        this.f284693d = imageGalleryUI;
    }

    public void run() {
        C98140g gVar = this.f284693d.f284461q1;
        Iterator<Integer> it = gVar.f287752a.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (gVar.mo137425e(intValue) == null) {
                Log.m105927v("MicroMsg.ImageScanButtonStatusManager", "updateAllStatusIfNeedOnOverTime type: %d", Integer.valueOf(intValue));
                gVar.mo137422b(intValue);
                gVar.mo137429i(intValue, 4);
            }
        }
        this.f284693d.f284461q1.mo137429i(4, 1);
        this.f284693d.mo135738Q7(4, false);
    }
}
