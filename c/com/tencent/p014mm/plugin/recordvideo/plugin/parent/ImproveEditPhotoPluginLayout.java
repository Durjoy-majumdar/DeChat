package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import lh2.C109370r;
import me3.C109612c;
import me3.C109623f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sn0.C90259e;
import vg2.C78414c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Landroid/view/View;", "w", "Lrx3/g;", "getCloseView", "()Landroid/view/View;", "closeView", "x", "getFuncBottomParent", "funcBottomParent", "Landroid/widget/Button;", "y", "getFinishBtn", "()Landroid/widget/Button;", "finishBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout */
public final class ImproveEditPhotoPluginLayout extends EditPhotoPluginLayout {

    /* renamed from: A */
    public int f315391A = -1;

    /* renamed from: B */
    public float f315392B = 0.8f;

    /* renamed from: C */
    public boolean f315393C;

    /* renamed from: D */
    public final GestureDetector f315394D;

    /* renamed from: w */
    public final C13601g f315395w = C36568h.m40985a(new C105973a(this));

    /* renamed from: x */
    public final C13601g f315396x = C36568h.m40985a(new C105975c(this));

    /* renamed from: y */
    public final C13601g f315397y = C36568h.m40985a(new C105974b(this));

    /* renamed from: z */
    public int f315398z = -1;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout$a */
    public static final class C105973a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditPhotoPluginLayout f315399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105973a(ImproveEditPhotoPluginLayout improveEditPhotoPluginLayout) {
            super(0);
            this.f315399d = improveEditPhotoPluginLayout;
        }

        public Object invoke() {
            return this.f315399d.findViewById(C0966R.C0970id.cc8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout$b */
    public static final class C105974b extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditPhotoPluginLayout f315400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105974b(ImproveEditPhotoPluginLayout improveEditPhotoPluginLayout) {
            super(0);
            this.f315400d = improveEditPhotoPluginLayout;
        }

        public Object invoke() {
            return (Button) this.f315400d.findViewById(C0966R.C0970id.cco);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout$c */
    public static final class C105975c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditPhotoPluginLayout f315401d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105975c(ImproveEditPhotoPluginLayout improveEditPhotoPluginLayout) {
            super(0);
            this.f315401d = improveEditPhotoPluginLayout;
        }

        public Object invoke() {
            return this.f315401d.findViewById(C0966R.C0970id.ehd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout$d */
    public static final class C105976d implements C109623f.C109624a {

        /* renamed from: a */
        public final /* synthetic */ ImproveEditPhotoPluginLayout f315402a;

        public C105976d(ImproveEditPhotoPluginLayout improveEditPhotoPluginLayout) {
            this.f315402a = improveEditPhotoPluginLayout;
        }

        /* renamed from: a */
        public final boolean mo151262a(MotionEvent motionEvent) {
            GestureDetector gestureDetector = this.f315402a.f315394D;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$loadCurrentPage$1", "onDispatchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$loadCurrentPage$1", "onDispatchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout$e */
    public static final class C105977e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditPhotoPluginLayout f315403d;

        public C105977e(ImproveEditPhotoPluginLayout improveEditPhotoPluginLayout) {
            this.f315403d = improveEditPhotoPluginLayout;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(motionEvent, "e");
            if (!this.f315403d.getEditPencilPlugin().f327448f) {
                ImproveEditPhotoPluginLayout.m142518m(this.f315403d);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveEditPhotoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C105977e(this));
        this.f315394D = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    private final View getCloseView() {
        Object value = ((C36570n) this.f315395w).getValue();
        C87412m.m108593f(value, "<get-closeView>(...)");
        return (View) value;
    }

    private final Button getFinishBtn() {
        Object value = ((C36570n) this.f315397y).getValue();
        C87412m.m108593f(value, "<get-finishBtn>(...)");
        return (Button) value;
    }

    private final View getFuncBottomParent() {
        Object value = ((C36570n) this.f315396x).getValue();
        C87412m.m108593f(value, "<get-funcBottomParent>(...)");
        return (View) value;
    }

    /* renamed from: m */
    public static final void m142518m(ImproveEditPhotoPluginLayout improveEditPhotoPluginLayout) {
        ImproveEditPhotoPluginLayout improveEditPhotoPluginLayout2 = improveEditPhotoPluginLayout;
        if (improveEditPhotoPluginLayout.getFuncBottomParent().getVisibility() == 0 && improveEditPhotoPluginLayout.getCloseView().getVisibility() == 0) {
            View funcBottomParent = improveEditPhotoPluginLayout.getFuncBottomParent();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = funcBottomParent;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View closeView = improveEditPhotoPluginLayout.getCloseView();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view2 = closeView;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            improveEditPhotoPluginLayout2.f315393C = true;
        } else if (improveEditPhotoPluginLayout2.f315393C) {
            View funcBottomParent2 = improveEditPhotoPluginLayout.getFuncBottomParent();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(funcBottomParent2, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(funcBottomParent2, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View closeView2 = improveEditPhotoPluginLayout.getCloseView();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = closeView2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            improveEditPhotoPluginLayout2.f315393C = false;
        }
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        RecordConfigProvider configProvider = getConfigProvider();
        Bundle bundle = configProvider != null ? configProvider.f272912M : null;
        if (bundle != null) {
            int i = bundle.getInt("key_preview_location_type", -1);
            int i2 = bundle.getInt("key_preview_margin_top", -1);
            int i3 = bundle.getInt("key_back_margin_top", -1);
            int i4 = bundle.getInt("key_edit_control_margin_bottom", -1);
            Log.m105924i("MicroMsg.ImproveEditPhotoPluginLayout", "changeUILocation >> previewLocationType: " + i + ", previewMarginTop: " + i2 + ", closeMarginTop: " + i3 + ", editControlMarginBottom: " + i4);
            if (!(i == -1 || i2 == -1 || i3 == -1 || i4 == -1)) {
                ViewGroup.LayoutParams layoutParams = getCloseView().getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int a = i3 - C74942w4.m89784a(getContext(), 6);
                if (a > 0) {
                    layoutParams2.topMargin = a;
                    getCloseView().setLayoutParams(layoutParams2);
                }
                ViewGroup.LayoutParams layoutParams3 = getFuncBottomParent().getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                int a2 = i4 - C74942w4.m89784a(getContext(), 40);
                int a3 = a2 - C74942w4.m89784a(getContext(), 6);
                Log.m105924i("MicroMsg.ImproveEditPhotoPluginLayout", "changeEditControlLocation >> " + i4 + ", " + a2 + ", " + a3);
                if (a3 > 0) {
                    layoutParams4.bottomMargin = a3;
                    getFuncBottomParent().setLayoutParams(layoutParams4);
                }
                if (i != 2) {
                    this.f315398z = i;
                    this.f315391A = i2;
                } else {
                    this.f315398z = i;
                    this.f315391A = -1;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams5 = getFinishBtn().getLayoutParams();
        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        float dimension = getResources().getDimension(C0966R.dimen.al9);
        float dimension2 = getResources().getDimension(C0966R.dimen.f3705bx);
        float dimension3 = getResources().getDimension(C0966R.dimen.f3723cd);
        C78414c cVar = C78414c.f229758a;
        Context context = getFinishBtn().getContext();
        C87412m.m108593f(context, "finishBtn.context");
        int a4 = (int) cVar.mo108364a(context, dimension3);
        float dimension4 = getResources().getDimension(C0966R.dimen.a2o);
        float dimension5 = getResources().getDimension(C0966R.dimen.a2p);
        getFinishBtn().setPadding(a4, 0, a4, 0);
        getFinishBtn().setTextSize(0, (float) C76577a.m92155f(getFinishBtn().getContext(), C0966R.dimen.f3927j7));
        Context context2 = getFinishBtn().getContext();
        C87412m.m108593f(context2, "finishBtn.context");
        layoutParams6.width = (int) cVar.mo108364a(context2, dimension2);
        Context context3 = getFinishBtn().getContext();
        C87412m.m108593f(context3, "finishBtn.context");
        layoutParams6.height = (int) cVar.mo108364a(context3, dimension);
        Context context4 = getFinishBtn().getContext();
        C87412m.m108593f(context4, "finishBtn.context");
        layoutParams6.leftMargin = (int) cVar.mo108364a(context4, dimension4);
        Context context5 = getFinishBtn().getContext();
        C87412m.m108593f(context5, "finishBtn.context");
        layoutParams6.rightMargin = (int) cVar.mo108364a(context5, dimension5);
        getFinishBtn().setLayoutParams(layoutParams6);
        int dimension6 = (int) getResources().getDimension(C0966R.dimen.aba);
        int dimension7 = (int) getResources().getDimension(C0966R.dimen.a2q);
        int dimension8 = (int) getResources().getDimension(C0966R.dimen.al9);
        View findViewById = findViewById(C0966R.C0970id.f357897cc1);
        C87412m.m108593f(findViewById, "findViewById<View>(R.id.editor_add_pencil)");
        cVar.mo108366c(findViewById, dimension6, dimension7, dimension8);
        View findViewById2 = findViewById(C0966R.C0970id.cbs);
        C87412m.m108593f(findViewById2, "findViewById<View>(R.id.editor_add_emoji)");
        cVar.mo108366c(findViewById2, dimension6, dimension7, dimension8);
        View findViewById3 = findViewById(C0966R.C0970id.f357898cc2);
        C87412m.m108593f(findViewById3, "findViewById<View>(R.id.editor_add_text)");
        cVar.mo108366c(findViewById3, dimension6, dimension7, dimension8);
        View findViewById4 = findViewById(C0966R.C0970id.ccs);
        C87412m.m108593f(findViewById4, "findViewById<View>(R.id.editor_photo_crop)");
        cVar.mo108366c(findViewById4, dimension6, dimension7, dimension8);
        this.f315393C = false;
        if (this.f315398z != -1) {
            getEditPhotoWrapper().f327421u = this.f315391A;
        }
        getEditPhotoWrapper().f327422v = this.f315392B;
        super.mo129855l(bVar);
        C109370r editPhotoWrapper = getEditPhotoWrapper();
        C105976d dVar = new C105976d(this);
        editPhotoWrapper.getClass();
        C109623f fVar = editPhotoWrapper.f327415o;
        if (fVar != null) {
            ((C109612c) fVar).f328170m = dVar;
        }
    }
}
