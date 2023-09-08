package p857mg;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import j20.C117292a;
import java.util.ArrayList;
import p278yh.C102862b;
import sn0.C90259e;

/* renamed from: mg.d */
public final class C99852d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ C102862b f292597d;

    public C99852d(C102862b bVar) {
        this.f292597d = bVar;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Context context = this.f292597d.mo142565a().getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            activity.onBackPressed();
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
