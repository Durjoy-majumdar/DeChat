package p226rg;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;
import th0.C101888l;

/* renamed from: rg.m */
public final class C63428m implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ AlbumPreviewUIC f179912d;

    /* renamed from: e */
    public final /* synthetic */ IStateAction f179913e;

    public C63428m(AlbumPreviewUIC albumPreviewUIC, IStateAction iStateAction) {
        this.f179912d = albumPreviewUIC;
        this.f179913e = iStateAction;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "motionEvent");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "motionEvent");
        C87412m.m108594g(motionEvent2, "motionEvent1");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$3", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(motionEvent, "motionEvent");
        if (!C101888l.f300029a.mo141352a((String) null)) {
            C117292a.m165361g(this, "com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$3", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        this.f179912d.mo76238j3().mo90693a().performHapticFeedback(0);
        this.f179912d.mo76239k3().dispatch(new C63415f(AlbumPreviewUIC.m62215g3(this.f179912d), ((C63413d) this.f179913e).f179894a));
        C117292a.m165361g(this, "com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$3", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "motionEvent");
        C87412m.m108594g(motionEvent2, "motionEvent1");
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "motionEvent");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$3", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "motionEvent");
        C117292a.m165362h(false, this, "com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$3", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
