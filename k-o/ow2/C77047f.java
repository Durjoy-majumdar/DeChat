package ow2;

import android.content.Context;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import en3.C75627f;
import gy3.C87412m;
import nj3.C76879j;

/* renamed from: ow2.f */
public final class C77047f extends C75627f {

    /* renamed from: a */
    public StoryGalleryView f225081a;

    /* renamed from: b */
    public float f225082b;

    /* renamed from: c */
    public int f225083c;

    /* renamed from: d */
    public int f225084d;

    /* renamed from: a */
    public boolean mo105974a(MotionEvent motionEvent, boolean z, int i) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        StoryGalleryView storyGalleryView;
        C87412m.m108594g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 0) {
            motionEvent.getX();
            this.f225082b = motionEvent.getY();
        } else if (actionMasked == 1) {
            if (this.f225083c > 0 && this.f225084d == 1) {
                StoryGalleryView storyGalleryView2 = this.f225081a;
                if (!(storyGalleryView2 == null || (animate = storyGalleryView2.animate()) == null || (translationY = animate.translationY(0.0f)) == null)) {
                    translationY.start();
                }
                this.f225084d = 0;
                Context context = MMApplicationContext.getContext();
                Object systemService = context.getSystemService("vibrator");
                Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(10);
                }
                C76879j.m92726T(context, context.getString(C0966R.string.jph));
            }
            this.f225083c = 0;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                Log.m105924i("MicroMsg.GalleryOverScrollConsumer", "LogStory: touch cancel");
                this.f225084d = 0;
                StoryGalleryView storyGalleryView3 = this.f225081a;
                if (storyGalleryView3 != null) {
                    storyGalleryView3.setTranslationY(0.0f);
                }
                this.f225083c = 0;
            }
        } else if (z) {
            this.f225084d = i;
            if (i == 1) {
                z2 = true;
            }
            float y = motionEvent.getY() - this.f225082b;
            if (y <= 0.0f && (storyGalleryView = this.f225081a) != null) {
                this.f225083c = -((int) y);
                storyGalleryView.animate().cancel();
                storyGalleryView.setTranslationY(y / ((float) 2));
            }
        }
        return z2;
    }

    /* renamed from: b */
    public int mo105975b() {
        return 1;
    }
}
