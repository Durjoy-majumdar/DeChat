package ya2;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.music.p080ui.view.MusicMainSeekBar;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import y00.C66480a;

/* renamed from: ya2.g */
public final class C66602g implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMainSeekBar f191520d;

    public C66602g(MusicMainSeekBar musicMainSeekBar) {
        this.f191520d = musicMainSeekBar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Rect rect = new Rect();
        C66480a aVar = this.f191520d.f162983g;
        if (aVar != null) {
            aVar.f191254b.getHitRect(rect);
            if (motionEvent.getY() < ((float) (rect.top - 500)) || motionEvent.getY() > ((float) (rect.bottom + 500))) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            float height = (float) (rect.top + (rect.height() / 2));
            float x = motionEvent.getX() - ((float) rect.left);
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x < 0.0f ? 0.0f : x > ((float) rect.width()) ? (float) rect.width() : x, height, motionEvent.getMetaState());
            C66480a aVar2 = this.f191520d.f162983g;
            if (aVar2 != null) {
                boolean onTouchEvent = aVar2.f191254b.onTouchEvent(obtain);
                C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return onTouchEvent;
            }
            C87412m.m108603p("seekBarBinding");
            throw null;
        }
        C87412m.m108603p("seekBarBinding");
        throw null;
    }
}
