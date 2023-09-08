package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p910lj.C76701a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.widget.MMNeat7extView */
public class MMNeat7extView extends NeatTextView {

    /* renamed from: S */
    public static boolean f220391S;

    /* renamed from: T */
    public static final String f220392T = "^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$".substring(1, 149);

    /* renamed from: U */
    public static boolean f220393U = true;

    /* renamed from: M */
    public GestureDetector f220394M;

    /* renamed from: N */
    public View.OnLongClickListener f220395N;

    /* renamed from: P */
    public C74954d f220396P;

    /* renamed from: Q */
    public C74955e f220397Q;

    /* renamed from: R */
    public final View.AccessibilityDelegate f220398R = new C74956c();

    /* renamed from: com.tencent.mm.ui.widget.MMNeat7extView$a */
    public class C74952a extends GestureDetector.SimpleOnGestureListener {
        public C74952a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            if (MMNeat7extView.this.getOnDoubleClickListener() == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return false;
            }
            boolean b = MMNeat7extView.this.getOnDoubleClickListener().mo103047b(MMNeat7extView.this, motionEvent);
            C117292a.m165362h(b, this, "com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return b;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/widget/MMNeat7extView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMNeat7extView$b */
    public class C74953b implements View.OnLongClickListener {
        public C74953b() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (MMNeat7extView.f220391S) {
                Context context = MMNeat7extView.this.getContext();
                MMNeat7extView mMNeat7extView = MMNeat7extView.this;
                String charSequence = mMNeat7extView.mo154968a().toString();
                mMNeat7extView.getClass();
                String replaceAll = charSequence.replaceAll(MMNeat7extView.f220392T, "*");
                StringBuilder sb = new StringBuilder(replaceAll);
                sb.append(10);
                sb.append('[');
                char[] charArray = replaceAll.toCharArray();
                for (char c : charArray) {
                    if (c != '*') {
                        sb.append("{\\u");
                        sb.append(String.format("%x", new Object[]{Integer.valueOf(c)}));
                        sb.append("}");
                    }
                }
                sb.append(']');
                C76701a.makeText(context, (CharSequence) sb.toString(), 1).show();
            }
            View.OnLongClickListener onLongClickListener = MMNeat7extView.this.f220395N;
            if (onLongClickListener != null) {
                boolean onLongClick = onLongClickListener.onLongClick(view);
                C117292a.m165362h(onLongClick, this, "com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return onLongClick;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/MMNeat7extView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMNeat7extView$d */
    public interface C74954d {
        /* renamed from: a */
        void mo103126a(CharSequence charSequence, TextView.BufferType bufferType);
    }

    /* renamed from: com.tencent.mm.ui.widget.MMNeat7extView$e */
    public interface C74955e {
    }

    /* renamed from: com.tencent.mm.ui.widget.MMNeat7extView$c */
    public class C74956c extends View.AccessibilityDelegate {
        public C74956c() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 8192) {
                accessibilityEvent.setFromIndex(Selection.getSelectionStart(MMNeat7extView.this.mo154968a()));
                accessibilityEvent.setToIndex(Selection.getSelectionEnd(MMNeat7extView.this.mo154968a()));
                accessibilityEvent.setItemCount(MMNeat7extView.this.mo154968a().length());
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setText(MMNeat7extView.this.mo154968a());
            accessibilityNodeInfo.setContentDescription((CharSequence) null);
            accessibilityNodeInfo.setFocusable(true);
            if (!TextUtils.isEmpty(MMNeat7extView.this.mo154968a())) {
                accessibilityNodeInfo.addAction(256);
                accessibilityNodeInfo.addAction(512);
                accessibilityNodeInfo.setMovementGranularities(31);
                accessibilityNodeInfo.addAction(131072);
            }
            MMNeat7extView mMNeat7extView = MMNeat7extView.this;
            boolean z = false;
            if (mMNeat7extView.mo154968a().length() > 0) {
                int selectionStart = mMNeat7extView.getSelectionStart();
                int selectionEnd = mMNeat7extView.getSelectionEnd();
                if (selectionStart >= 0 && selectionEnd > 0 && selectionStart != selectionEnd) {
                    z = true;
                }
            }
            if (z) {
                accessibilityNodeInfo.addAction(16384);
            }
            if (MMNeat7extView.this.getMaxLines() >= 1) {
                accessibilityNodeInfo.setMultiLine(true);
            }
        }
    }

    public MMNeat7extView(Context context) {
        super(context);
        mo104287n();
    }

    /* renamed from: b */
    public void mo104279b(CharSequence charSequence) {
        C74955e eVar;
        try {
            super.mo104279b(charSequence);
            if (this.f320006e && (eVar = this.f220397Q) != null) {
                charSequence.toString();
                eVar.getClass();
            }
            setContentDescription(charSequence);
        } catch (Exception e) {
            String replaceAll = mo154968a().toString().replaceAll(f220392T, "*");
            Log.m105921e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", replaceAll, e);
            C74955e eVar2 = this.f220397Q;
            if (eVar2 != null) {
                ((C74059i7.C74063d) eVar2).mo103135a(e, replaceAll, "_setText");
            } else {
                throw e;
            }
        }
        C74954d dVar = this.f220396P;
        if (dVar != null) {
            dVar.mo103126a(charSequence, charSequence instanceof Spannable ? TextView.BufferType.SPANNABLE : TextView.BufferType.NORMAL);
        }
    }

    /* renamed from: c */
    public void mo104280c(CharSequence charSequence, TextView.BufferType bufferType, Boolean bool) {
        C74955e eVar;
        try {
            super.mo104280c(charSequence, bufferType, bool);
            if (this.f320006e && (eVar = this.f220397Q) != null) {
                charSequence.toString();
                eVar.getClass();
            }
            setContentDescription(charSequence);
        } catch (Exception e) {
            String replaceAll = mo154968a().toString().replaceAll(f220392T, "*");
            Log.m105921e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", replaceAll, e);
            C74955e eVar2 = this.f220397Q;
            if (eVar2 != null) {
                ((C74059i7.C74063d) eVar2).mo103135a(e, replaceAll, "_setText");
            } else {
                throw e;
            }
        }
        C74954d dVar = this.f220396P;
        if (dVar != null) {
            dVar.mo103126a(charSequence, bufferType);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return TextView.class.getName();
    }

    public CharSequence getContentDescription() {
        boolean z = true;
        Log.m105919d("MicroMsg.MMNeat7extView", "[isOpen] %s", Boolean.FALSE);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (!isEnabled || !isTouchExplorationEnabled) {
            z = false;
        }
        return (z || CrashReportFactory.hasDebuger()) ? mo154968a() : "";
    }

    public int getSelectionEnd() {
        return Selection.getSelectionEnd(mo154968a());
    }

    public int getSelectionStart() {
        return Selection.getSelectionStart(mo154968a());
    }

    public float getVerticalOffset() {
        if (!f220391S) {
            return super.getVerticalOffset();
        }
        float verticalOffset = super.getVerticalOffset();
        getMeasuredHeight();
        return verticalOffset;
    }

    /* renamed from: h */
    public boolean mo104286h() {
        return f220393U;
    }

    /* renamed from: n */
    public final void mo104287n() {
        this.f220394M = new GestureDetector(getContext(), new C74952a(), new Handler(Looper.getMainLooper()));
        setAccessibilityDelegate(this.f220398R);
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            String replaceAll = mo154968a().toString().replaceAll(f220392T, "*");
            Log.m105921e("MicroMsg.MMNeat7extView", "[onDraw] replaceContent:%s exception:%s", replaceAll, e);
            if (this.f220397Q != null) {
                ((C74059i7.C74063d) this.f220397Q).mo103135a(e, replaceAll, "onDraw");
                return;
            }
            throw e;
        }
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            String replaceAll = mo154968a().toString().replaceAll(f220392T, "*");
            Log.m105921e("MicroMsg.MMNeat7extView", "[onMeasure] replaceContent:%s exception:%s", replaceAll, e);
            if (this.f220397Q != null) {
                ((C74059i7.C74063d) this.f220397Q).mo103135a(e, replaceAll, "onMeasure");
                return;
            }
            throw e;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!f220393U || (this.f320006e && this.f220394M != null)) {
            GestureDetector gestureDetector = this.f220394M;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/ui/widget/MMNeat7extView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/widget/MMNeat7extView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (getWrappedTextView() != null) {
            getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (getWrappedTextView() != null) {
            getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setIsOpen(boolean z) {
        f220393U = z;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f220395N = onLongClickListener;
        super.setOnLongClickListener(new C74953b());
    }

    public void setTextCrashListener(C74955e eVar) {
        this.f220397Q = eVar;
    }

    public void setTextListener(C74954d dVar) {
        this.f220396P = dVar;
    }

    public MMNeat7extView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104287n();
    }
}
