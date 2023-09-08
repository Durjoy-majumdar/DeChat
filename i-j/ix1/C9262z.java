package ix1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: ix1.z */
public class C9262z implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ GestureDetector f29012d;

    public C9262z(C46337n nVar, GestureDetector gestureDetector) {
        this.f29012d = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        ArrayList arrayList = new ArrayList();
        View view2 = view;
        arrayList.add(view);
        arrayList.add(motionEvent2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        GestureDetector gestureDetector = this.f29012d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent2);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$4", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$4", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
