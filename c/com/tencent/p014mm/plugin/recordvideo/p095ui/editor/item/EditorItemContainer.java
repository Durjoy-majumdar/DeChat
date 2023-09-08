package com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item;

import ai2.C92013g;
import ai2.C92015i;
import ai2.C92021o;
import ai2.C92024r;
import ai2.C92026t;
import ai2.C92027u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorFrameView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gi2.C107818f;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C101765cp3;
import te3.C49044cs2;
import zg2.C103020m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001NB!\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0004\bK\u0010LB\u001b\b\u0016\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bK\u0010MJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R2\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006O"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/EditorItemContainer;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$a;", "", "type", "Lrx3/b0;", "setSafeType", "Landroid/view/View$OnClickListener;", "locationClickListener", "setOnLocationClick", "textClickListener", "setOnTextClick", "tipClickListener", "setOnTipClick", "lyricsClickListener", "setOnLyricsClick", "", "Lai2/i;", "getAllItemViews", "Landroid/view/ViewGroup;", "getItemLayout", "getLocationItemHeight", "", "enable", "setEnableTouch", "", "getTextContents", "Landroid/graphics/Rect;", "i", "Landroid/graphics/Rect;", "getDisplayArea", "()Landroid/graphics/Rect;", "displayArea", "Lkotlin/Function1;", "w", "Lfy3/l;", "getDeleteStateListener", "()Lfy3/l;", "setDeleteStateListener", "(Lfy3/l;)V", "deleteStateListener", "Landroid/view/View;", "x", "getItemChangeListener", "setItemChangeListener", "itemChangeListener", "Lai2/r;", "A", "Lai2/r;", "getLocationView", "()Lai2/r;", "setLocationView", "(Lai2/r;)V", "locationView", "Lai2/o;", "B", "Lai2/o;", "getLyricsView", "()Lai2/o;", "setLyricsView", "(Lai2/o;)V", "lyricsView", "Lai2/u;", "C", "Lai2/u;", "getTipItemView", "()Lai2/u;", "setTipItemView", "(Lai2/u;)V", "tipItemView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer */
public final class EditorItemContainer extends InsectRelativeLayout implements CropLayout.C106803a {

    /* renamed from: A */
    public C92024r f273048A;

    /* renamed from: B */
    public C92021o f273049B;

    /* renamed from: C */
    public C92027u f273050C;

    /* renamed from: D */
    public View.OnClickListener f273051D;

    /* renamed from: E */
    public View.OnClickListener f273052E;

    /* renamed from: F */
    public View.OnClickListener f273053F;

    /* renamed from: G */
    public int f273054G;

    /* renamed from: H */
    public float f273055H;

    /* renamed from: I */
    public boolean f273056I;

    /* renamed from: J */
    public final C94439c f273057J;

    /* renamed from: i */
    public final Rect f273058i;

    /* renamed from: j */
    public final ViewGroup f273059j;

    /* renamed from: n */
    public TextView f273060n;

    /* renamed from: o */
    public ImageView f273061o;

    /* renamed from: p */
    public ViewGroup f273062p;

    /* renamed from: q */
    public EditorFrameView f273063q;

    /* renamed from: r */
    public EditorFrameView f273064r;

    /* renamed from: s */
    public EditorFrameView f273065s;

    /* renamed from: t */
    public EditorFrameView f273066t;

    /* renamed from: u */
    public RecordConfigProvider f273067u;

    /* renamed from: v */
    public View f273068v;

    /* renamed from: w */
    public C32226l<? super Boolean, C13598b0> f273069w;

    /* renamed from: x */
    public C32226l<? super View, C13598b0> f273070x;

    /* renamed from: y */
    public View f273071y;

    /* renamed from: z */
    public Runnable f273072z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$a */
    public interface C94437a {
        /* renamed from: a */
        void mo129926a(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$b */
    public static final class C94438b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorItemContainer f273073d;

        public C94438b(EditorItemContainer editorItemContainer) {
            this.f273073d = editorItemContainer;
        }

        public final void run() {
            EditorItemContainer editorItemContainer = this.f273073d;
            View view = editorItemContainer.f273071y;
            if (view != null) {
                C87412m.m108591d(view);
                editorItemContainer.mo129912h(view, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$c */
    public static final class C94439c implements C94437a {

        /* renamed from: a */
        public final /* synthetic */ EditorItemContainer f273074a;

        /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$c$a */
        public static final class C94440a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ EditorItemContainer f273075d;

            /* renamed from: e */
            public final /* synthetic */ View f273076e;

            public C94440a(EditorItemContainer editorItemContainer, View view) {
                this.f273075d = editorItemContainer;
                this.f273076e = view;
            }

            public final void run() {
                EditorItemContainer editorItemContainer = this.f273075d;
                editorItemContainer.f273059j.removeView(editorItemContainer.f273068v);
                C32226l<View, C13598b0> itemChangeListener = this.f273075d.getItemChangeListener();
                if (itemChangeListener != null) {
                    itemChangeListener.invoke(this.f273075d.f273068v);
                }
                EditorItemContainer editorItemContainer2 = this.f273075d;
                editorItemContainer2.f273068v = null;
                editorItemContainer2.f273071y = null;
                View view = this.f273076e;
                if (view instanceof C92024r) {
                    editorItemContainer2.setLocationView((C92024r) null);
                } else if (view instanceof C92021o) {
                    editorItemContainer2.setLyricsView((C92021o) null);
                } else if (view instanceof C92027u) {
                    editorItemContainer2.setTipItemView((C92027u) null);
                }
            }
        }

        public C94439c(EditorItemContainer editorItemContainer) {
            this.f273074a = editorItemContainer;
        }

        /* renamed from: a */
        public void mo129926a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(motionEvent, "event");
            EditorItemContainer editorItemContainer = this.f273074a;
            if (editorItemContainer.f273056I) {
                editorItemContainer.mo129901g();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    int i = 4;
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            EditorItemContainer editorItemContainer2 = this.f273074a;
                            editorItemContainer2.getClass();
                            boolean z = view instanceof C92027u;
                            if (!(z || (view instanceof C92024r) || editorItemContainer2.f273054G != 0)) {
                                EditorItemContainer editorItemContainer3 = this.f273074a;
                                editorItemContainer3.getClass();
                                if (view instanceof C107818f) {
                                    float[] contentBoundary = ((C107818f) view).getContentBoundary();
                                    float f = contentBoundary[0];
                                    float f2 = contentBoundary[1];
                                    float f3 = contentBoundary[2];
                                    float f4 = contentBoundary[3];
                                    boolean z2 = f <= ((float) C103020m.f303987c.left);
                                    EditorFrameView editorFrameView = editorItemContainer3.f273063q;
                                    if (editorFrameView != null) {
                                        editorFrameView.setVisibility(z2 ? 0 : 4);
                                    }
                                    boolean z3 = f2 <= ((float) C103020m.f303987c.top);
                                    EditorFrameView editorFrameView2 = editorItemContainer3.f273064r;
                                    if (editorFrameView2 != null) {
                                        editorFrameView2.setVisibility(z3 ? 0 : 4);
                                    }
                                    boolean z4 = f3 >= ((float) C103020m.f303987c.right);
                                    EditorFrameView editorFrameView3 = editorItemContainer3.f273065s;
                                    if (editorFrameView3 != null) {
                                        editorFrameView3.setVisibility(z4 ? 0 : 4);
                                    }
                                    boolean z5 = f4 >= ((float) C103020m.f303987c.bottom);
                                    EditorFrameView editorFrameView4 = editorItemContainer3.f273066t;
                                    if (editorFrameView4 != null) {
                                        if (z5) {
                                            i = 0;
                                        }
                                        editorFrameView4.setVisibility(i);
                                    }
                                }
                            }
                            this.f273074a.getClass();
                            if (!(z || (view instanceof C92024r))) {
                                EditorItemContainer editorItemContainer4 = this.f273074a;
                                editorItemContainer4.getClass();
                                int pointerCount = motionEvent.getPointerCount();
                                float f5 = 0.0f;
                                float f6 = 0.0f;
                                for (int i2 = 0; i2 < pointerCount; i2++) {
                                    f5 += motionEvent.getY(i2);
                                    f6 += motionEvent.getX(i2);
                                }
                                float f7 = (float) pointerCount;
                                float f8 = f6 / f7;
                                if (editorItemContainer4.f273062p.getTop() > 0 && f5 / f7 > ((float) editorItemContainer4.f273062p.getTop()) && ((float) editorItemContainer4.f273062p.getLeft()) < f8 && ((float) editorItemContainer4.f273062p.getRight()) > f8) {
                                    editorItemContainer4.mo129897b(true);
                                    if (editorItemContainer4.f273068v == null) {
                                        editorItemContainer4.f273068v = view;
                                        view.animate().alpha(0.5f).setDuration(100).start();
                                    }
                                } else {
                                    editorItemContainer4.mo129897b(false);
                                    if (editorItemContainer4.f273068v != null) {
                                        editorItemContainer4.f273068v = null;
                                        view.animate().alpha(1.0f).setDuration(100).start();
                                    }
                                }
                                EditorItemContainer editorItemContainer5 = this.f273074a;
                                editorItemContainer5.f273062p.setVisibility(0);
                                C32226l<? super Boolean, C13598b0> lVar = editorItemContainer5.f273069w;
                                if (lVar != null) {
                                    lVar.invoke(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (actionMasked != 3) {
                            return;
                        }
                    }
                    boolean z6 = view instanceof C92013g;
                    boolean z7 = view instanceof C92026t;
                    boolean z8 = view instanceof C92024r;
                    EditorItemContainer editorItemContainer6 = this.f273074a;
                    if (editorItemContainer6.f273068v != null) {
                        editorItemContainer6.post(new C94440a(editorItemContainer6, view));
                    } else if (editorItemContainer6.f273071y != null) {
                        editorItemContainer6.postDelayed(editorItemContainer6.f273072z, 1500);
                    }
                    EditorItemContainer editorItemContainer7 = this.f273074a;
                    editorItemContainer7.f273062p.setVisibility(8);
                    C32226l<? super Boolean, C13598b0> lVar2 = editorItemContainer7.f273069w;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.FALSE);
                    }
                    EditorFrameView editorFrameView5 = this.f273074a.f273063q;
                    if (editorFrameView5 != null) {
                        editorFrameView5.setVisibility(4);
                    }
                    EditorFrameView editorFrameView6 = this.f273074a.f273064r;
                    if (editorFrameView6 != null) {
                        editorFrameView6.setVisibility(4);
                    }
                    EditorFrameView editorFrameView7 = this.f273074a.f273065s;
                    if (editorFrameView7 != null) {
                        editorFrameView7.setVisibility(4);
                    }
                    EditorFrameView editorFrameView8 = this.f273074a.f273066t;
                    if (editorFrameView8 != null) {
                        editorFrameView8.setVisibility(4);
                        return;
                    }
                    return;
                }
                EditorItemContainer editorItemContainer8 = this.f273074a;
                editorItemContainer8.removeCallbacks(editorItemContainer8.f273072z);
                this.f273074a.getClass();
                if ((view instanceof C92024r) || (view instanceof C92027u)) {
                    this.f273074a.mo129912h(view, false);
                } else {
                    this.f273074a.mo129912h(view, true);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f273058i = new Rect();
        this.f273072z = new C94438b(this);
        this.f273055H = 0.5f;
        this.f273056I = true;
        View.inflate(context, C0966R.C0971layout.c68, this);
        View findViewById = findViewById(C0966R.C0970id.ccl);
        C87412m.m108593f(findViewById, "findViewById(R.id.editor_item_layout)");
        this.f273059j = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.ccc);
        C87412m.m108593f(findViewById2, "findViewById(R.id.editor_delete_view)");
        this.f273060n = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.cce);
        C87412m.m108593f(findViewById3, "findViewById(R.id.editor_delete_view_icon)");
        this.f273061o = (ImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.ccd);
        C87412m.m108593f(findViewById4, "findViewById(R.id.editor_delete_view_group)");
        this.f273062p = (ViewGroup) findViewById4;
        C103020m mVar = C103020m.f303985a;
        C103020m.f303987c.set(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        this.f273057J = new C94439c(this);
    }

    /* renamed from: a */
    public boolean mo70458a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f273062p.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i + C76577a.m92151b(getContext(), 32);
        this.f273062p.setLayoutParams(marginLayoutParams);
        return true;
    }

    /* renamed from: b */
    public final void mo129897b(boolean z) {
        this.f273062p.setActivated(z);
        if (z) {
            this.f273060n.setText(C0966R.string.c3s);
            this.f273061o.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_delete_on, -1));
            return;
        }
        this.f273060n.setText(C0966R.string.c3r);
        this.f273061o.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_delete, -1));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f273056I) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo129899e(C101765cp3 cp32) {
        C87412m.m108594g(cp32, "sl");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C92024r rVar = new C92024r(context);
        this.f273048A = rVar;
        C103020m mVar = C103020m.f303985a;
        rVar.mo53782m(C103020m.f303987c, C103020m.f303990f);
        C92024r rVar2 = this.f273048A;
        if (rVar2 != null) {
            C103020m mVar2 = C103020m.f303985a;
            rVar2.setValidArea(C103020m.f303988d);
        }
        C92024r rVar3 = this.f273048A;
        if (rVar3 != null) {
            rVar3.mo53773f(this.f273058i, this.f273055H);
        }
        C92024r rVar4 = this.f273048A;
        if (rVar4 != null) {
            rVar4.setLocation(cp32);
        }
        C92024r rVar5 = this.f273048A;
        if (rVar5 != null) {
            rVar5.setStateResolve(this.f273057J);
        }
        C92024r rVar6 = this.f273048A;
        if (rVar6 != null) {
            rVar6.setOnClickListener(this.f273051D);
        }
        this.f273059j.addView(this.f273048A, layoutParams);
        C92024r rVar7 = this.f273048A;
        C87412m.m108591d(rVar7);
        mo129912h(rVar7, false);
        removeCallbacks(this.f273072z);
        postDelayed(this.f273072z, 1500);
    }

    /* renamed from: f */
    public final void mo129900f(List<? extends C49044cs2> list) {
        C87412m.m108594g(list, "lyricsItemInfos");
        this.f273049B = new C92021o(getContext());
        this.f273059j.addView(this.f273049B, new RelativeLayout.LayoutParams(-1, -1));
        C92021o oVar = this.f273049B;
        if (oVar != null) {
            C103020m mVar = C103020m.f303985a;
            oVar.mo53782m(C103020m.f303987c, C103020m.f303990f);
        }
        C92021o oVar2 = this.f273049B;
        if (oVar2 != null) {
            C103020m mVar2 = C103020m.f303985a;
            oVar2.setValidArea(C103020m.f303988d);
        }
        C92021o oVar3 = this.f273049B;
        if (oVar3 != null) {
            C107818f.C107819a.m146077a(oVar3, this.f273058i, 0.0f, 2, (Object) null);
        }
        C92021o oVar4 = this.f273049B;
        if (oVar4 != null) {
            oVar4.setStateResolve(this.f273057J);
        }
        C92021o oVar5 = this.f273049B;
        if (oVar5 != null) {
            oVar5.mo125955o(list);
        }
    }

    /* renamed from: g */
    public final void mo129901g() {
        C92027u uVar = this.f273050C;
        if (!(uVar == null || uVar == null)) {
            uVar.bringToFront();
        }
        C92024r rVar = this.f273048A;
        if (!(rVar == null || rVar == null)) {
            rVar.bringToFront();
        }
        C92021o oVar = this.f273049B;
        if (oVar != null && oVar != null) {
            oVar.bringToFront();
        }
    }

    public final List<C92015i> getAllItemViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.f273059j.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f273059j.getChildAt(i);
            if (childAt instanceof C92015i) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final C32226l<Boolean, C13598b0> getDeleteStateListener() {
        return this.f273069w;
    }

    public final Rect getDisplayArea() {
        return this.f273058i;
    }

    public final C32226l<View, C13598b0> getItemChangeListener() {
        return this.f273070x;
    }

    public final ViewGroup getItemLayout() {
        return this.f273059j;
    }

    public final int getLocationItemHeight() {
        Bitmap bitmap;
        C92024r rVar = this.f273048A;
        if (rVar == null || (bitmap = rVar.getBitmap()) == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public final C92024r getLocationView() {
        return this.f273048A;
    }

    public final C92021o getLyricsView() {
        return this.f273049B;
    }

    public final String getTextContents() {
        int childCount = this.f273059j.getChildCount();
        if (childCount < 0) {
            return "";
        }
        int i = 0;
        String str = "";
        while (true) {
            if (this.f273059j.getChildAt(i) instanceof C92026t) {
                View childAt = this.f273059j.getChildAt(i);
                C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.TextItemView");
                String valueOf = String.valueOf(((C92026t) childAt).getText());
                if (!Util.isNullOrNil(valueOf)) {
                    if (C87412m.m108589b(str, "")) {
                        str = valueOf;
                    } else {
                        str = str + '#' + valueOf;
                    }
                }
            }
            if (i == childCount) {
                return str;
            }
            i++;
        }
    }

    public final C92027u getTipItemView() {
        return this.f273050C;
    }

    /* renamed from: h */
    public final void mo129912h(View view, boolean z) {
        C87412m.m108594g(view, "itemView");
        if (z) {
            if (!C87412m.m108589b(view, this.f273071y)) {
                View view2 = this.f273071y;
                if (view2 != null) {
                    view2.setActivated(false);
                }
                this.f273071y = view;
            }
        } else if (C87412m.m108589b(view, this.f273071y)) {
            this.f273071y = null;
        }
        view.setActivated(z);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105924i("MicroMsg.EditorItemContainer", "onSizeChanged, w:" + i + ", h:" + i2);
        this.f273058i.set(0, 0, i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0 && (view = this.f273071y) != null) {
            C87412m.m108591d(view);
            mo129912h(view, false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDeleteStateListener(C32226l<? super Boolean, C13598b0> lVar) {
        this.f273069w = lVar;
    }

    public final void setEnableTouch(boolean z) {
        this.f273056I = z;
    }

    public final void setItemChangeListener(C32226l<? super View, C13598b0> lVar) {
        this.f273070x = lVar;
    }

    public final void setLocationView(C92024r rVar) {
        this.f273048A = rVar;
    }

    public final void setLyricsView(C92021o oVar) {
        this.f273049B = oVar;
    }

    public final void setOnLocationClick(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "locationClickListener");
        this.f273051D = onClickListener;
    }

    public final void setOnLyricsClick(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "lyricsClickListener");
    }

    public final void setOnTextClick(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "textClickListener");
        this.f273052E = onClickListener;
    }

    public final void setOnTipClick(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "tipClickListener");
        this.f273053F = onClickListener;
    }

    public final void setSafeType(int i) {
        this.f273054G = i;
        if (i == 0) {
            this.f273055H = 0.7f;
        } else if (i == 1) {
            this.f273055H = 0.5f;
        }
    }

    public final void setTipItemView(C92027u uVar) {
        this.f273050C = uVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
