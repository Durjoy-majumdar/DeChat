package x73;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: x73.a */
public final class C78779a implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C102570e f230512d;

    public C78779a(C102570e eVar) {
        this.f230512d = eVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f230512d.dismiss();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
