package sb2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: sb2.c1 */
public final class C13636c1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f38638d;

    public C13636c1(TextView textView) {
        this.f38638d = textView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (C87412m.m108589b(view2, this.f38638d)) {
            int action = motionEvent.getAction();
            if (action == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.3f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 1) {
                view.performClick();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 3) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
