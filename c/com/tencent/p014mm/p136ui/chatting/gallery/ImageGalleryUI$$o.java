package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import j20.C117292a;
import java.util.ArrayList;
import vl2.C111557w;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$o */
public class ImageGalleryUI$$o implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284527d;

    public ImageGalleryUI$$o(ImageGalleryUI imageGalleryUI) {
        this.f284527d = imageGalleryUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "gallery ACTION_DOWN!");
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
            ImageGalleryUI imageGalleryUI = this.f284527d;
            PointF c2 = C111557w.m152067c(imageGalleryUI.mo135770g8(imageGalleryUI.f284432g, imageGalleryUI.f284450n), motionEvent.getRawX(), motionEvent.getRawY());
            if (c2 != null) {
                c.mo120962i("key_basescanui_touch_normalize_x", Float.valueOf(c2.x));
                c.mo120962i("key_basescanui_touch_normalize_y", Float.valueOf(c2.y));
            } else {
                Log.m105920e("MicroMsg.ImageGalleryUI", "alvinluo get touchCoordinate is invalid");
                c.mo120962i("key_basescanui_screen_position", Boolean.TRUE);
                c.mo120962i("key_basescanui_screen_x", Float.valueOf(motionEvent.getRawX()));
                c.mo120962i("key_basescanui_screen_y", Float.valueOf(motionEvent.getRawY()));
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
