package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=B#\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010>\u001a\u00020\u0002¢\u0006\u0004\b<\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000bJ\"\u0010\u0012\u001a\u00020\u00042\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00108\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006@"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/component/LoadableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxLines", "Lrx3/b0;", "setMaxLines", "maxPixels", "setMaxHeight", "", "text", "setOriginText", "", "getOriginText", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/view/MotionEvent;", "", "callback", "setOnDoubleClickListener", "h", "I", "getExpectWidth", "()I", "setExpectWidth", "(I)V", "expectWidth", "value", "j", "Z", "isLoading", "()Z", "setLoading", "(Z)V", "o", "getDotCounter", "setDotCounter", "dotCounter", "p", "Ljava/lang/String;", "getDotStr", "()Ljava/lang/String;", "setDotStr", "(Ljava/lang/String;)V", "dotStr", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler$CallBack;", "q", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler$CallBack;", "getUpdateDotCallback", "()Lcom/tencent/mm/sdk/platformtools/MTimerHandler$CallBack;", "updateDotCallback", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "r", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "getUpdateDotTimer", "()Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "updateDotTimer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.component.LoadableTextView */
public final class LoadableTextView extends AppCompatTextView {

    /* renamed from: g */
    public final GestureDetector f215644g;

    /* renamed from: h */
    public int f215645h;

    /* renamed from: i */
    public C32227p<? super View, ? super MotionEvent, Boolean> f215646i;

    /* renamed from: j */
    public boolean f215647j;

    /* renamed from: n */
    public String f215648n;

    /* renamed from: o */
    public int f215649o;

    /* renamed from: p */
    public String f215650p;

    /* renamed from: q */
    public final MTimerHandler.CallBack f215651q;

    /* renamed from: r */
    public final MTimerHandler f215652r;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoadableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final int getDotCounter() {
        return this.f215649o;
    }

    public final String getDotStr() {
        return this.f215650p;
    }

    public final int getExpectWidth() {
        return this.f215645h;
    }

    public final String getOriginText() {
        return this.f215648n;
    }

    public final MTimerHandler.CallBack getUpdateDotCallback() {
        return this.f215651q;
    }

    public final MTimerHandler getUpdateDotTimer() {
        return this.f215652r;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f215645h;
        if (i3 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f215644g;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/LoadableTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/ui/chatting/component/LoadableTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (onTouchEvent) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDotCounter(int i) {
        this.f215649o = i;
    }

    public final void setDotStr(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f215650p = str;
    }

    public final void setExpectWidth(int i) {
        this.f215645h = i;
    }

    public final void setLoading(boolean z) {
        this.f215647j = z;
        if (z) {
            this.f215652r.setCallBack(this.f215651q);
            this.f215652r.startTimer(0, 500);
            return;
        }
        this.f215652r.stopTimer();
        this.f215652r.setCallBack((MTimerHandler.CallBack) null);
    }

    public void setMaxHeight(int i) {
        if (i != -1) {
            setSingleLine(false);
            setMovementMethod(ScrollingMovementMethod.getInstance());
            setVerticalScrollBarEnabled(true);
            setScrollbarFadingEnabled(true);
        }
        super.setMaxHeight(i);
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        if (i == 1) {
            setMovementMethod((MovementMethod) null);
            setVerticalScrollBarEnabled(false);
            setScrollbarFadingEnabled(false);
            return;
        }
        setMovementMethod(ScrollingMovementMethod.getInstance());
        setVerticalScrollBarEnabled(true);
        setScrollbarFadingEnabled(true);
    }

    public final void setOnDoubleClickListener(C32227p<? super View, ? super MotionEvent, Boolean> pVar) {
        this.f215646i = pVar;
    }

    public final void setOriginText(CharSequence charSequence) {
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        String obj = charSequence.toString();
        this.f215648n = obj;
        setText(obj);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        boolean z = true;
        if (getMaxLines() == 1) {
            if (getText() != null) {
                CharSequence text = getText();
                C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
                if (text.length() != 0) {
                    z = false;
                }
                if (!z) {
                    float measureText = getPaint().measureText(getText().toString());
                    if (measureText > ((float) getWidth())) {
                        scrollBy(((int) (measureText - ((float) getWidth()))) - getScrollX(), 0);
                        return;
                    } else {
                        scrollTo(0, getScrollY());
                        return;
                    }
                }
            }
            scrollTo(0, getScrollY());
        } else if (getMaxLines() > 1) {
            if (getText() != null) {
                CharSequence text2 = getText();
                C87412m.m108593f(text2, MimeTypes.BASE_TYPE_TEXT);
                if (text2.length() != 0) {
                    z = false;
                }
                if (!z && getLineCount() > getMaxLines()) {
                    scrollBy(0, ((getLineCount() - getMaxLines()) * getLineHeight()) - getScrollY());
                    return;
                }
            }
            scrollTo(0, 0);
        } else if (getMaxLines() != -1 || getMaxHeight() <= 0) {
            Log.m105920e("MicroMsg.LoadableTextView", "LoadableTextView auto scroll error? maxLines=" + getMaxLines() + " maxHeight=" + getMaxHeight());
        } else {
            post(new C73462d3(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C6776b3());
        gestureDetector.setOnDoubleTapListener(new C73451c3(this));
        this.f215644g = gestureDetector;
        this.f215648n = "";
        this.f215650p = "";
        C73466e3 e3Var = new C73466e3(this);
        this.f215651q = e3Var;
        this.f215652r = new MTimerHandler(e3Var, true);
        setSingleLine();
    }
}
