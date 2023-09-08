package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.widget.InsectFrameLayout;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\t\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0016R\"\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR*\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder;", "Lcom/tencent/mm/ui/widget/InsectFrameLayout;", "", "", "show", "Lrx3/b0;", "setShow", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "n", "Z", "getCoverByKeyboard", "()Z", "setCoverByKeyboard", "(Z)V", "coverByKeyboard", "o", "getCloseTouchOutside", "setCloseTouchOutside", "closeTouchOutside", "value", "p", "getOutsideTouchable", "setOutsideTouchable", "outsideTouchable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "video-recorder-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder */
public final class EditorPanelHolder extends InsectFrameLayout {

    /* renamed from: h */
    public View f315616h;

    /* renamed from: i */
    public C32226l<? super Boolean, C13598b0> f315617i;

    /* renamed from: j */
    public boolean f315618j;

    /* renamed from: n */
    public boolean f315619n;

    /* renamed from: o */
    public boolean f315620o;

    /* renamed from: p */
    public boolean f315621p;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder$b */
    public static final class C5043b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f20387d;

        /* renamed from: e */
        public final /* synthetic */ int f20388e;

        public C5043b(View view, int i) {
            this.f20387d = view;
            this.f20388e = i;
        }

        public final void run() {
            View view = this.f20387d;
            view.setPadding(view.getPaddingLeft(), this.f20387d.getPaddingTop(), this.f20387d.getPaddingRight(), this.f20388e);
            this.f20387d.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder$d */
    public static final class C5044d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f20389d;

        public C5044d(View view) {
            this.f20389d = view;
        }

        public final void run() {
            View view = this.f20389d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$setShow$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$setShow$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f20389d;
            view2.setTranslationY((float) view2.getHeight());
            this.f20389d.animate().translationY(0.0f).start();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder$a */
    public static final class C106035a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorPanelHolder f315622d;

        public C106035a(EditorPanelHolder editorPanelHolder) {
            this.f315622d = editorPanelHolder;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f315622d.getCloseTouchOutside()) {
                this.f315622d.setShow(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder$c */
    public static final class C106036c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorPanelHolder f315623d;

        public C106036c(EditorPanelHolder editorPanelHolder) {
            this.f315623d = editorPanelHolder;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$outsideTouchable$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f315623d.getCloseTouchOutside()) {
                this.f315623d.setShow(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$outsideTouchable$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder$e */
    public static final class C106037e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorPanelHolder f315624d;

        public C106037e(EditorPanelHolder editorPanelHolder) {
            this.f315624d = editorPanelHolder;
        }

        public final void run() {
            this.f315624d.setVisibility(8);
            this.f315624d.f315618j = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorPanelHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315620o = true;
        setOnClickListener(new C106035a(this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    public static void m142603c(EditorPanelHolder editorPanelHolder, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 2) != 0) {
            layoutParams = null;
        }
        editorPanelHolder.getClass();
        C87412m.m108594g(view, "view");
        editorPanelHolder.f315616h = view;
        FrameLayout.LayoutParams layoutParams2 = layoutParams != null ? new FrameLayout.LayoutParams(layoutParams) : view.getLayoutParams() != null ? new FrameLayout.LayoutParams(view.getLayoutParams()) : new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        editorPanelHolder.addView(view, layoutParams2);
    }

    /* renamed from: a */
    public boolean mo70447a(int i) {
        View view;
        if (!((this.f315619n && (i > 200 || i < 0)) || (view = this.f315616h) == null || view.getPaddingBottom() == i)) {
            view.post(new C5043b(view, i));
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo151464b() {
        return getVisibility() == 0 && !this.f315618j;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C87412m.m108594g(keyEvent, "event");
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            setShow(false);
            return true;
        }
    }

    public final boolean getCloseTouchOutside() {
        return this.f315620o;
    }

    public final boolean getCoverByKeyboard() {
        return this.f315619n;
    }

    public final boolean getOutsideTouchable() {
        return this.f315621p;
    }

    public final void setCloseTouchOutside(boolean z) {
        this.f315620o = z;
    }

    public final void setCoverByKeyboard(boolean z) {
        this.f315619n = z;
    }

    public void setOnVisibleChangeCallback(C32226l<? super Boolean, C13598b0> lVar) {
        this.f315617i = lVar;
    }

    public final void setOutsideTouchable(boolean z) {
        this.f315621p = z;
        if (z) {
            setOnClickListener((View.OnClickListener) null);
            setClickable(false);
            return;
        }
        setOnClickListener(new C106036c(this));
    }

    public void setShow(boolean z) {
        if (z) {
            setVisibility(0);
            C32226l<? super Boolean, C13598b0> lVar = this.f315617i;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            View view = this.f315616h;
            if (view != null) {
                view.animate().cancel();
                if (view.getHeight() == 0) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder", "setShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder", "setShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.post(new C5044d(view));
                    return;
                }
                view.animate().translationY(0.0f).start();
                return;
            }
            return;
        }
        this.f315618j = true;
        C32226l<? super Boolean, C13598b0> lVar2 = this.f315617i;
        if (lVar2 != null) {
            lVar2.invoke(Boolean.FALSE);
        }
        View view3 = this.f315616h;
        if (view3 != null) {
            view3.animate().cancel();
            view3.animate().translationY((float) view3.getHeight()).withEndAction(new C106037e(this)).start();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorPanelHolder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorPanelHolder(Context context) {
        this(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }
}
