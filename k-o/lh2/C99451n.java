package lh2;

import ai2.C92007a;
import ai2.C92013g;
import ai2.C92015i;
import ai2.C92025s;
import ai2.C92026t;
import ai2.C92027u;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import bi2.C92262a;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorFrameView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gi2.C107818f;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;
import th2.C110992d;
import yh2.C79119j;
import z04.C112551y;
import zg2.C103020m;

/* renamed from: lh2.n */
public final class C99451n implements C109344g0 {

    /* renamed from: d */
    public EditorItemContainer f291592d;

    /* renamed from: e */
    public C101198e f291593e;

    /* renamed from: f */
    public C92026t f291594f;

    /* renamed from: g */
    public C92027u f291595g;

    /* renamed from: lh2.n$a */
    public static final class C99452a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99451n f291596d;

        public C99452a(C99451n nVar) {
            this.f291596d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C99451n nVar = this.f291596d;
            C92026t tVar = view instanceof C92026t ? (C92026t) view : null;
            nVar.f291594f = tVar;
            if (tVar != null) {
                tVar.setVisibility(8);
                Bundle bundle = new Bundle();
                bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", tVar.getText());
                bundle.putInt("PARAM_EDIT_TEXT_COLOR", tVar.getColor());
                bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", tVar.getTextBg());
                nVar.f291593e.mo14585p(C101198e.C101199b.EDIT_CHANGE_TEXT, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lh2.n$b */
    public static final class C99453b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99451n f291597d;

        public C99453b(C99451n nVar) {
            this.f291597d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C99451n nVar = this.f291597d;
            C92027u uVar = view instanceof C92027u ? (C92027u) view : null;
            nVar.f291595g = uVar;
            if (uVar != null) {
                uVar.setVisibility(8);
                Bundle bundle = new Bundle();
                bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", uVar.getText());
                bundle.putInt("PARAM_EDIT_TEXT_COLOR", uVar.getColor());
                bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", uVar.getTextBg());
                nVar.f291593e.mo14585p(C101198e.C101199b.EDIT_CHANGE_TIP, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lh2.n$c */
    public static final class C99454c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99451n f291598d;

        public C99454c(C99451n nVar) {
            this.f291598d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101198e.C62622a.m73576a(this.f291598d.f291593e, C101198e.C101199b.EDIT_CHANGE_POI, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lh2.n$d */
    public static final class C99455d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99451n f291599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99455d(C99451n nVar) {
            super(1);
            this.f291599d = nVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f291599d.f291593e, C101198e.C101199b.EDIT_DELETE_ITEM, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f291599d.f291593e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lh2.n$e */
    public static final class C99456e extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99451n f291600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99456e(C99451n nVar) {
            super(1);
            this.f291600d = nVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            if (view instanceof C107818f) {
                Bundle bundle = new Bundle();
                bundle.putInt("PARAM_DELETE_VIEW_TYPE_INT", ((C107818f) view).getType().ordinal());
                this.f291600d.f291593e.mo14585p(C101198e.C101199b.EDIT_DELETE_ITEM_DONE, bundle);
            }
            return C13598b0.f38549a;
        }
    }

    public C99451n(EditorItemContainer editorItemContainer, C101198e eVar) {
        C87412m.m108594g(editorItemContainer, "view");
        C87412m.m108594g(eVar, "status");
        this.f291592d = editorItemContainer;
        this.f291593e = eVar;
        editorItemContainer.setOnTextClick(new C99452a(this));
        this.f291592d.setOnTipClick(new C99453b(this));
        this.f291592d.setOnLocationClick(new C99454c(this));
        this.f291592d.setDeleteStateListener(new C99455d(this));
        this.f291592d.setItemChangeListener(new C99456e(this));
    }

    /* renamed from: a */
    public final void mo138887a(String str, int i, int i2) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        EditorItemContainer editorItemContainer = this.f291592d;
        C92027u uVar = editorItemContainer.f273050C;
        if (uVar != null) {
            editorItemContainer.f273059j.removeView(uVar);
            editorItemContainer.f273050C = null;
        }
        EditorItemContainer editorItemContainer2 = this.f291592d;
        editorItemContainer2.getClass();
        if (!C112551y.m153811k(str)) {
            editorItemContainer2.f273050C = new C92027u(editorItemContainer2.getContext());
            editorItemContainer2.f273059j.addView(editorItemContainer2.f273050C, new RelativeLayout.LayoutParams(-2, -2));
            C92027u uVar2 = editorItemContainer2.f273050C;
            if (uVar2 != null) {
                uVar2.mo53782m(C103020m.f303987c, C103020m.f303990f);
            }
            C92027u uVar3 = editorItemContainer2.f273050C;
            if (uVar3 != null) {
                uVar3.setValidArea(C103020m.f303988d);
            }
            C92027u uVar4 = editorItemContainer2.f273050C;
            if (uVar4 != null) {
                C107818f.C107819a.m146077a(uVar4, editorItemContainer2.f273058i, 0.0f, 2, (Object) null);
            }
            C92027u uVar5 = editorItemContainer2.f273050C;
            if (uVar5 != null) {
                uVar5.setStateResolve(editorItemContainer2.f273057J);
            }
            C92027u uVar6 = editorItemContainer2.f273050C;
            if (uVar6 != null) {
                uVar6.setText(new C92025s(str, i, i2, editorItemContainer2.getLocationItemHeight(), new Matrix()));
            }
            C92027u uVar7 = editorItemContainer2.f273050C;
            if (uVar7 != null) {
                uVar7.setOnClickListener(editorItemContainer2.f273053F);
            }
        }
    }

    /* renamed from: b */
    public final float[] mo138888b() {
        return new float[]{(float) this.f291592d.getLeft(), (float) this.f291592d.getTop(), (float) this.f291592d.getRight(), (float) this.f291592d.getBottom()};
    }

    /* renamed from: c */
    public final ArrayList<C92007a> mo138889c() {
        ArrayList<C92007a> arrayList = new ArrayList<>();
        for (C92015i d : this.f291592d.getAllItemViews()) {
            C92007a d2 = d.mo53771d();
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final ArrayList<C92262a> mo138890d(Matrix matrix) {
        ArrayList<C92262a> arrayList = new ArrayList<>();
        for (C92015i i : this.f291592d.getAllItemViews()) {
            C92262a i2 = i.mo53781i(matrix);
            if (i2 != null) {
                arrayList.add(i2);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    /* renamed from: f */
    public final int mo138891f() {
        int i = 0;
        for (C92015i iVar : this.f291592d.getAllItemViews()) {
            if (iVar instanceof C92013g) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public final int mo138892g() {
        int i = 0;
        for (C92015i iVar : this.f291592d.getAllItemViews()) {
            if (iVar instanceof C92026t) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public final float[] mo138893h() {
        C103020m mVar = C103020m.f303985a;
        Rect rect = C103020m.f303988d;
        return new float[]{(float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom};
    }

    /* renamed from: i */
    public final void mo138894i(float f, float f2) {
        EditorItemContainer editorItemContainer = this.f291592d;
        Context context = editorItemContainer.getContext();
        C87412m.m108593f(context, "context");
        EditorFrameView editorFrameView = new EditorFrameView(context);
        editorItemContainer.f273064r = editorFrameView;
        editorFrameView.setPosition(C79119j.POSITION_TOP);
        EditorFrameView editorFrameView2 = editorItemContainer.f273064r;
        if (editorFrameView2 != null) {
            editorFrameView2.setVisibility(4);
        }
        int i = (int) f2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
        layoutParams.addRule(10);
        editorItemContainer.addView(editorItemContainer.f273064r, layoutParams);
        Context context2 = editorItemContainer.getContext();
        C87412m.m108593f(context2, "context");
        EditorFrameView editorFrameView3 = new EditorFrameView(context2);
        editorItemContainer.f273066t = editorFrameView3;
        editorFrameView3.setPosition(C79119j.POSITION_BOTTOM);
        EditorFrameView editorFrameView4 = editorItemContainer.f273066t;
        if (editorFrameView4 != null) {
            editorFrameView4.setVisibility(4);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, i);
        layoutParams2.addRule(12);
        editorItemContainer.addView(editorItemContainer.f273066t, layoutParams2);
        Rect rect = C103020m.f303987c;
        rect.top = i;
        rect.bottom = i + ((int) f);
        Log.m105924i("MicroMsg.EditorItemContainer", "logStory: initHeightSafeArea safeAreaRect:" + C103020m.f303987c);
    }

    /* renamed from: j */
    public final void mo138895j(float f, float f2) {
        EditorItemContainer editorItemContainer = this.f291592d;
        Context context = editorItemContainer.getContext();
        C87412m.m108593f(context, "context");
        EditorFrameView editorFrameView = new EditorFrameView(context);
        editorItemContainer.f273063q = editorFrameView;
        editorFrameView.setPosition(C79119j.POSITION_LEFT);
        EditorFrameView editorFrameView2 = editorItemContainer.f273063q;
        if (editorFrameView2 != null) {
            editorFrameView2.setVisibility(4);
        }
        int i = (int) f2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -1);
        layoutParams.addRule(20);
        editorItemContainer.addView(editorItemContainer.f273063q, layoutParams);
        Context context2 = editorItemContainer.getContext();
        C87412m.m108593f(context2, "context");
        EditorFrameView editorFrameView3 = new EditorFrameView(context2);
        editorItemContainer.f273065s = editorFrameView3;
        editorFrameView3.setPosition(C79119j.POSITION_RIGHT);
        EditorFrameView editorFrameView4 = editorItemContainer.f273065s;
        if (editorFrameView4 != null) {
            editorFrameView4.setVisibility(4);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
        layoutParams2.addRule(21);
        editorItemContainer.addView(editorItemContainer.f273065s, layoutParams2);
        Rect rect = C103020m.f303987c;
        rect.left = i;
        rect.right = i + ((int) f);
        Log.m105924i("MicroMsg.EditorItemContainer", "logStory: initWidthSafeArea safeAreaRect:" + C103020m.f303987c);
    }

    public String name() {
        return C99451n.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
        EditorItemContainer editorItemContainer = this.f291592d;
        int childCount = editorItemContainer.f273059j.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = editorItemContainer.f273059j.getChildAt(i);
            if (childAt instanceof C92013g) {
                ((C92013g) childAt).pause();
            }
        }
        C110992d.f332425a.mo162677k("KEY_TEXT_WIDGET_CONTENT_STRING", this.f291592d.getTextContents());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        EditorItemContainer editorItemContainer = this.f291592d;
        int childCount = editorItemContainer.f273059j.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = editorItemContainer.f273059j.getChildAt(i);
            if (childAt instanceof C92013g) {
                ((C92013g) childAt).resume();
            }
        }
    }

    public void release() {
        EditorItemContainer editorItemContainer = this.f291592d;
        editorItemContainer.f273048A = null;
        editorItemContainer.f273050C = null;
        editorItemContainer.f273049B = null;
        editorItemContainer.f273059j.removeAllViews();
    }

    public void reset() {
        EditorItemContainer editorItemContainer = this.f291592d;
        editorItemContainer.f273048A = null;
        editorItemContainer.f273050C = null;
        editorItemContainer.f273049B = null;
        editorItemContainer.f273059j.removeAllViews();
    }

    public void setVisibility(int i) {
        this.f291592d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
