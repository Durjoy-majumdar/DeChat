package de3;

import android.os.Handler;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.neattextview.textview.view.C106879c;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import xr3.C112173c;

/* renamed from: de3.o */
public class C107029o extends C106879c {

    /* renamed from: i */
    public View.OnTouchListener f320432i;

    public C107029o(NeatTextView neatTextView, View.OnTouchListener onTouchListener) {
        super(neatTextView.getContext(), neatTextView, new Handler(Looper.getMainLooper()));
        this.f320432i = onTouchListener;
    }

    /* renamed from: a */
    public void mo155026a(int i) {
        C112173c cVar = this.f320039g;
        if (cVar != null) {
            CharacterStyle characterStyle = cVar.f335874g;
            if (characterStyle instanceof C75359b0) {
                ((C75359b0) characterStyle).setIsPressed(false);
            }
        }
        super.mo155026a(i);
    }

    public boolean onDown(MotionEvent motionEvent) {
        boolean onDown = super.onDown(motionEvent);
        C112173c cVar = this.f320039g;
        if (cVar == null) {
            return onDown;
        }
        CharacterStyle characterStyle = cVar.f335874g;
        if (characterStyle instanceof C75359b0) {
            ((C75359b0) characterStyle).setIsPressed(true);
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        View view;
        if (!(this.f320039g == null || (view = this.f320040h) == null)) {
            view.performLongClick();
        }
        mo155026a(1);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        view.setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        if (view instanceof NeatTextView) {
            NeatTextView neatTextView = (NeatTextView) view;
            if (!neatTextView.mo104286h() || neatTextView.f320006e) {
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    neatTextView.getWrappedTextView().setPressed(false);
                } else if (motionEvent.getAction() == 0) {
                    neatTextView.getWrappedTextView().setPressed(true);
                }
                neatTextView.getWrappedTextView().setTag(view.getTag());
                return this.f320432i.onTouch(neatTextView.getWrappedTextView(), motionEvent);
            }
        } else {
            this.f320432i.onTouch(view, motionEvent);
        }
        return super.onTouch(view, motionEvent);
    }
}
