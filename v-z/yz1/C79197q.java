package yz1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: yz1.q */
public class C79197q implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ GroupSolitatireEditUI f232508d;

    public C79197q(GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f232508d = groupSolitatireEditUI;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$26", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$26", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GroupSolitatireEditUI groupSolitatireEditUI = this.f232508d;
        if (groupSolitatireEditUI.f198388K) {
            return false;
        }
        groupSolitatireEditUI.hideVKB();
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$26", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$26", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
