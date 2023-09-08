package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import h71.C98318c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001*B!\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b'\u0010)J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006+"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "getTextItem", "", "getAttachedText", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAllEmojiMd5", "", "Lh71/c;", "getAllItemViews", "Landroid/graphics/RectF;", "getValidRect", "itemView", "Lrx3/b0;", "setEditing", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$b;", "i", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$b;", "getStateChangeListener", "()Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$b;", "setStateChangeListener", "(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$b;)V", "stateChangeListener", "", "j", "Z", "getDeleteEnalbe", "()Z", "setDeleteEnalbe", "(Z)V", "deleteEnalbe", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "b", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer */
public final class EditorItemContainer extends RelativeLayout {

    /* renamed from: d */
    public final String f269356d;

    /* renamed from: e */
    public View f269357e;

    /* renamed from: f */
    public TextView f269358f;

    /* renamed from: g */
    public final ViewGroup f269359g;

    /* renamed from: h */
    public final EditorOutsideView f269360h;

    /* renamed from: i */
    public C93342b f269361i;

    /* renamed from: j */
    public boolean f269362j;

    /* renamed from: n */
    public final RectF f269363n;

    /* renamed from: o */
    public C98318c f269364o;

    /* renamed from: p */
    public Runnable f269365p;

    /* renamed from: q */
    public C98318c f269366q;

    /* renamed from: r */
    public final LinkedList<Runnable> f269367r;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer$a */
    public static final class C93341a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorItemContainer f269368d;

        /* renamed from: e */
        public final /* synthetic */ Context f269369e;

        public C93341a(EditorItemContainer editorItemContainer, Context context) {
            this.f269368d = editorItemContainer;
            this.f269369e = context;
        }

        public final void run() {
            EditorItemContainer editorItemContainer = this.f269368d;
            editorItemContainer.f269360h.mo94749a(editorItemContainer.getValidRect(), this.f269369e.getResources().getDimension(C0966R.dimen.a3c));
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer$b */
    public interface C93342b {
        /* renamed from: a */
        void mo128118a(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer$c */
    public static final class C93343c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorItemContainer f269370d;

        public C93343c(EditorItemContainer editorItemContainer) {
            this.f269370d = editorItemContainer;
        }

        public final void run() {
            EditorItemContainer editorItemContainer = this.f269370d;
            C98318c cVar = editorItemContainer.f269364o;
            if (cVar != null) {
                C87412m.m108591d(cVar);
                editorItemContainer.mo128123d(cVar, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer$d */
    public static final class C93344d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorItemContainer f269371d;

        public C93344d(EditorItemContainer editorItemContainer) {
            this.f269371d = editorItemContainer;
        }

        public final void run() {
            C98318c cVar = this.f269371d.f269366q;
            if (cVar != null) {
                C87412m.m108591d(cVar);
                if (!cVar.mo137606n()) {
                    EditorItemContainer editorItemContainer = this.f269371d;
                    ViewGroup viewGroup = editorItemContainer.f269359g;
                    C98318c cVar2 = editorItemContainer.f269366q;
                    C87412m.m108592e(cVar2, "null cannot be cast to non-null type android.view.View");
                    viewGroup.removeView((View) cVar2);
                }
            }
            EditorItemContainer editorItemContainer2 = this.f269371d;
            editorItemContainer2.f269366q = null;
            editorItemContainer2.f269364o = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer$e */
    public static final class C93345e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorItemContainer f269372d;

        public C93345e(EditorItemContainer editorItemContainer) {
            this.f269372d = editorItemContainer;
        }

        public final void run() {
            this.f269372d.getValidRect();
            if (!this.f269372d.f269363n.isEmpty()) {
                for (Runnable run : this.f269372d.f269367r) {
                    run.run();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269356d = "MicroMsg.EditorItemContainer";
        this.f269362j = true;
        this.f269363n = new RectF();
        this.f269365p = new C93343c(this);
        this.f269367r = new LinkedList<>();
        View.inflate(context, C0966R.C0971layout.f359650a14, this);
        View findViewById = findViewById(C0966R.C0970id.cd6);
        C87412m.m108593f(findViewById, "findViewById(R.id.editor_valid_area)");
        this.f269357e = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.ccc);
        C87412m.m108593f(findViewById2, "findViewById(R.id.editor_delete_view)");
        TextView textView = (TextView) findViewById2;
        this.f269358f = textView;
        textView.setTextColor(getResources().getColor(C0966R.color.f3320nt));
        View findViewById3 = findViewById(C0966R.C0970id.cea);
        C87412m.m108593f(findViewById3, "findViewById(R.id.emoji_capture_editor_layout)");
        this.f269359g = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.ceb);
        C87412m.m108593f(findViewById4, "findViewById(R.id.emoji_capture_editor_mask)");
        this.f269360h = (EditorOutsideView) findViewById4;
        mo128122c(new C93341a(this, context));
    }

    /* renamed from: a */
    public final void mo128120a(C98318c cVar, MotionEvent motionEvent) {
        C87412m.m108594g(cVar, "itemView");
        C87412m.m108594g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return;
                    }
                } else if (this.f269362j) {
                    int pointerCount = motionEvent.getPointerCount();
                    float f = 0.0f;
                    for (int i = 0; i < pointerCount; i++) {
                        f += motionEvent.getY(i);
                    }
                    if (f / ((float) pointerCount) > ((float) this.f269358f.getTop())) {
                        this.f269358f.setActivated(true);
                        this.f269358f.setText(C0966R.string.c3s);
                        if (this.f269366q == null) {
                            this.f269366q = cVar;
                        }
                    } else {
                        this.f269358f.setActivated(false);
                        this.f269358f.setText(C0966R.string.c3r);
                        if (this.f269366q != null) {
                            this.f269366q = null;
                        }
                    }
                    this.f269358f.setVisibility(0);
                    C93342b bVar = this.f269361i;
                    if (bVar != null) {
                        bVar.mo128118a(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            this.f269359g.bringChildToFront(getTextItem());
            if (this.f269366q != null) {
                post(new C93344d(this));
            } else if (this.f269364o != null) {
                postDelayed(this.f269365p, 1500);
            }
            this.f269358f.setVisibility(8);
            C93342b bVar2 = this.f269361i;
            if (bVar2 != null) {
                bVar2.mo128118a(false);
                return;
            }
            return;
        }
        removeCallbacks(this.f269365p);
        mo128123d(cVar, true);
    }

    /* renamed from: b */
    public final void mo128121b() {
        int childCount = this.f269359g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f269359g.getChildAt(i);
            if (childAt instanceof C98318c) {
                ((C98318c) childAt).pause();
            }
        }
    }

    /* renamed from: c */
    public final void mo128122c(Runnable runnable) {
        C87412m.m108594g(runnable, "r");
        if (!this.f269363n.isEmpty()) {
            runnable.run();
        } else {
            this.f269367r.add(runnable);
        }
    }

    /* renamed from: d */
    public final void mo128123d(C98318c cVar, boolean z) {
        C87412m.m108594g(cVar, "itemView");
        if (z) {
            if (!C87412m.m108589b(cVar, this.f269364o)) {
                C98318c cVar2 = this.f269364o;
                if (cVar2 != null) {
                    cVar2.setEditing(false);
                }
                this.f269364o = cVar;
            }
        } else if (C87412m.m108589b(cVar, this.f269364o)) {
            this.f269364o = null;
        }
        cVar.setEditing(z);
    }

    public final ArrayList<String> getAllEmojiMd5() {
        IEmojiInfo emojiInfo;
        String md5;
        ArrayList<String> arrayList = new ArrayList<>();
        int childCount = this.f269359g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f269359g.getChildAt(i);
            if (!(!(childAt instanceof EmojiEditorItemView) || (emojiInfo = ((EmojiEditorItemView) childAt).getEmojiInfo()) == null || (md5 = emojiInfo.getMd5()) == null)) {
                arrayList.add(md5);
            }
        }
        return arrayList;
    }

    public final List<C98318c> getAllItemViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.f269359g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f269359g.getChildAt(i);
            if (childAt instanceof C98318c) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final String getAttachedText() {
        TextEditorItemView textItem = getTextItem();
        if (textItem == null || textItem.getText() == null) {
            return null;
        }
        return String.valueOf(textItem.getText());
    }

    public final boolean getDeleteEnalbe() {
        return this.f269362j;
    }

    public final C93342b getStateChangeListener() {
        return this.f269361i;
    }

    public final TextEditorItemView getTextItem() {
        int childCount = this.f269359g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f269359g.getChildAt(i);
            if (childAt instanceof TextEditorItemView) {
                return (TextEditorItemView) childAt;
            }
        }
        return null;
    }

    public final RectF getValidRect() {
        this.f269363n.set((float) this.f269357e.getLeft(), (float) this.f269357e.getTop(), (float) this.f269357e.getRight(), (float) this.f269357e.getBottom());
        return this.f269363n;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets == null) {
            WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            C87412m.m108593f(onApplyWindowInsets, "super.onApplyWindowInsets(insets)");
            return onApplyWindowInsets;
        }
        ViewGroup.LayoutParams layoutParams = this.f269357e.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        String str = this.f269356d;
        StringBuilder sb = new StringBuilder();
        sb.append("onApplyWindowInsets: ");
        sb.append(marginLayoutParams != null);
        Log.m105924i(str, sb.toString());
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.ajp) + windowInsets.getSystemWindowInsetTop();
            this.f269357e.setLayoutParams(marginLayoutParams);
        }
        WindowInsets onApplyWindowInsets2 = super.onApplyWindowInsets(windowInsets);
        C87412m.m108593f(onApplyWindowInsets2, "super.onApplyWindowInsets(insets)");
        return onApplyWindowInsets2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (motionEvent.getActionMasked() != 0 || this.f269363n.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            post(new C93345e(this));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            if (!this.f269363n.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            C98318c cVar = this.f269364o;
            if (cVar != null) {
                C87412m.m108591d(cVar);
                mo128123d(cVar, false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDeleteEnalbe(boolean z) {
        this.f269362j = z;
    }

    public final void setEditing(C98318c cVar) {
        C87412m.m108594g(cVar, "itemView");
        removeCallbacks(this.f269365p);
        mo128123d(cVar, true);
        postDelayed(this.f269365p, 1500);
    }

    public final void setStateChangeListener(C93342b bVar) {
        this.f269361i = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
