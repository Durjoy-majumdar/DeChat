package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.test.suitebuilder.annotation.Suppress;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import uk3.C78222a;

/* renamed from: com.tencent.mm.ui.widget.MMTextView */
public class MMTextView extends TextView {

    /* renamed from: d */
    public boolean f220439d;

    /* renamed from: e */
    public C74961b f220440e;

    /* renamed from: f */
    public GestureDetector f220441f;

    /* renamed from: g */
    public boolean f220442g;

    /* renamed from: h */
    public boolean f220443h;

    /* renamed from: i */
    public long f220444i;

    /* renamed from: j */
    public C74960a f220445j;

    /* renamed from: com.tencent.mm.ui.widget.MMTextView$a */
    public interface C74960a {
    }

    /* renamed from: com.tencent.mm.ui.widget.MMTextView$b */
    public interface C74961b {
    }

    public MMTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220439d = false;
        this.f220440e = null;
        this.f220441f = null;
        this.f220442g = false;
        this.f220443h = false;
        this.f220444i = -1;
        this.f220445j = null;
        this.f220441f = new GestureDetector(getContext(), new C74972c(this), new Handler(Looper.getMainLooper()));
    }

    public void cancelLongPress() {
        Log.m105918d("MicroMsg.MMTextView", "cancelLongPress , should ignore Action Up Event next time");
        this.f220439d = true;
        super.cancelLongPress();
    }

    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMTextView", th, "", new Object[0]);
            return -1;
        }
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMTextView", th, "", new Object[0]);
        }
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMTextView", th, "", new Object[0]);
        }
    }

    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (Throwable unused) {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 1 && this.f220439d) {
            Log.m105918d("MicroMsg.MMTextView", "ignore Action Up Event this time");
            return true;
        }
        if (action == 0) {
            this.f220439d = false;
        }
        if (!(this.f220440e == null || (gestureDetector = this.f220441f) == null)) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/ui/widget/MMTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, z, "com/tencent/mm/ui/widget/MMTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return !z ? super.onTouchEvent(motionEvent) : z;
    }

    public boolean performLongClick() {
        Log.m105918d("MicroMsg.MMTextView", "performLongClick , should ignore Action Up Event next time");
        this.f220439d = true;
        return super.performLongClick();
    }

    public void setIsFromChatting(boolean z) {
        if (!this.f220442g) {
            this.f220442g = z;
        }
    }

    public void setMMTextViewCallBack(C74960a aVar) {
        if (!this.f220443h && aVar != null) {
            this.f220445j = aVar;
            this.f220443h = true;
        }
    }

    public void setMsgId(long j) {
        this.f220444i = j;
    }

    public void setOnDoubleClickLitsener(C74961b bVar) {
        this.f220440e = bVar;
    }

    @Suppress
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f220445j != null && this.f220442g && (charSequence instanceof Spannable) && ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class) != null) {
            ((C78222a.C78223a) this.f220445j).mo108242a(charSequence, bufferType, this.f220444i);
        }
    }

    public void setTextInternal(CharSequence charSequence) {
        setText(charSequence);
    }

    public MMTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f220439d = false;
        this.f220440e = null;
        this.f220441f = null;
        this.f220442g = false;
        this.f220443h = false;
        this.f220444i = -1;
        this.f220445j = null;
        this.f220441f = new GestureDetector(getContext(), new C74972c(this), new Handler(Looper.getMainLooper()));
    }
}
