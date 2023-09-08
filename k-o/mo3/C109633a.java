package mo3;

import android.text.Spannable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;

/* renamed from: mo3.a */
public interface C109633a {
    boolean canSelectArbitrarily();

    void initialize(CustomTextView customTextView, Spannable spannable);

    boolean onGenericMotionEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent);

    boolean onKeyDown(CustomTextView customTextView, Spannable spannable, int i, KeyEvent keyEvent);

    boolean onKeyOther(CustomTextView customTextView, Spannable spannable, KeyEvent keyEvent);

    boolean onKeyUp(CustomTextView customTextView, Spannable spannable, int i, KeyEvent keyEvent);

    void onTakeFocus(CustomTextView customTextView, Spannable spannable, int i);

    boolean onTouchEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent);

    boolean onTrackballEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent);
}
