package nj3;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.base.MMAutoCompleteTextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nj3.o */
public class C76895o implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ MMAutoCompleteTextView f224747d;

    public C76895o(MMAutoCompleteTextView mMAutoCompleteTextView) {
        this.f224747d = mMAutoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        MMAutoCompleteTextView mMAutoCompleteTextView = this.f224747d;
        if (mMAutoCompleteTextView.getCompoundDrawables()[2] == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        } else if (motionEvent.getAction() != 1) {
            C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        } else {
            if (motionEvent.getX() > ((float) ((mMAutoCompleteTextView.getWidth() - mMAutoCompleteTextView.getPaddingRight()) - this.f224747d.f214758d.getIntrinsicWidth()))) {
                mMAutoCompleteTextView.setText("");
                MMAutoCompleteTextView mMAutoCompleteTextView2 = this.f224747d;
                mMAutoCompleteTextView2.setCompoundDrawables(mMAutoCompleteTextView2.getCompoundDrawables()[0], mMAutoCompleteTextView2.getCompoundDrawables()[1], (Drawable) null, mMAutoCompleteTextView2.getCompoundDrawables()[3]);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }
}
