package lh2;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorInputView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;
import th2.C110992d;

/* renamed from: lh2.j */
public final class C109352j implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ViewGroup f327366d;

    /* renamed from: e */
    public C101198e f327367e;

    /* renamed from: f */
    public final EditorInputView f327368f;

    /* renamed from: g */
    public final RelativeLayout f327369g;

    /* renamed from: h */
    public int f327370h = 4;

    /* renamed from: lh2.j$a */
    public static final class C109353a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109352j f327371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109353a(C109352j jVar) {
            super(1);
            this.f327371d = jVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f327371d.f327367e, C101198e.C101199b.EDIT_VIDEO_WITH_TIP, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f327371d.f327367e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lh2.j$b */
    public static final class C109354b implements EditorInputView.C106033k {

        /* renamed from: a */
        public final /* synthetic */ C109352j f327372a;

        public C109354b(C109352j jVar) {
            this.f327372a = jVar;
        }

        /* renamed from: a */
        public void mo151461a(CharSequence charSequence, int i, int i2, String str) {
            C87412m.m108594g(str, "font");
            this.f327372a.f327368f.setShow(false);
            if (charSequence != null) {
                if (!(charSequence.length() == 0)) {
                    this.f327372a.f327369g.setVisibility(8);
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR", i);
                    bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i2);
                    this.f327372a.f327367e.mo14585p(C101198e.C101199b.EDIT_ADD_TIP, bundle);
                }
            }
            this.f327372a.f327369g.setVisibility(0);
            Bundle bundle2 = new Bundle();
            bundle2.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence);
            bundle2.putInt("PARAM_EDIT_TEXT_COLOR", i);
            bundle2.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i2);
            this.f327372a.f327367e.mo14585p(C101198e.C101199b.EDIT_ADD_TIP, bundle2);
        }

        public void onCancel() {
            this.f327372a.f327368f.setShow(false);
        }
    }

    public C109352j(ViewGroup viewGroup, C101198e eVar, EditorInputView editorInputView) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        C87412m.m108594g(editorInputView, "inputPanel");
        this.f327366d = viewGroup;
        this.f327367e = eVar;
        this.f327368f = editorInputView;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f357899cc3);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.editor_add_tip_group)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        this.f327369g = relativeLayout;
        relativeLayout.setOnClickListener(this);
        editorInputView.setConfirmBtnBg(C0966R.C0969drawable.avc);
        editorInputView.setOnVisibleChangeCallback(new C109353a(this));
        editorInputView.setTipCallback(new C109354b(this));
        Point b = C75044y4.m89990b(this.f327366d.getContext());
        float f = (float) b.y;
        float f2 = (float) b.x;
        float f3 = f / f2;
        float f4 = f / 2.18f;
        float f5 = (f2 - f4) / ((float) 2);
        if (f3 <= 1.78f) {
            editorInputView.mo151430f(f4, f5);
        } else if (f3 < 2.18f) {
            editorInputView.mo151430f(f4, f5);
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!(this.f327368f.getVisibility() == 0)) {
            return false;
        }
        this.f327368f.setShow(false);
        return true;
    }

    public String name() {
        return C109352j.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditAddTipPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditorInputView editorInputView = this.f327368f;
        editorInputView.f315581E = 1;
        editorInputView.setShow(true);
        EditorInputView editorInputView2 = this.f327368f;
        int[] iArr = EditorInputView.f315575P;
        editorInputView2.mo151431g("", -1, 0);
        C110992d.f332425a.mo162669b(18);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddTipPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
        ViewGroup.LayoutParams layoutParams = this.f327369g.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C74942w4.m89784a(this.f327369g.getContext(), 44);
        this.f327369g.setVisibility(this.f327370h);
    }

    public void setVisibility(int i) {
        this.f327369g.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
