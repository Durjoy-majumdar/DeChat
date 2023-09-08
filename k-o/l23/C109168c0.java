package l23;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import gy3.C87412m;
import h33.C108047a;
import h33.C108053b;
import h33.C108054c;
import h33.C108055d;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C36570n;
import th2.C110992d;

/* renamed from: l23.c0 */
public final class C109168c0 extends C99417a {

    /* renamed from: f */
    public final EditorPanelHolder f326864f;

    /* renamed from: g */
    public final C108047a f326865g;

    /* renamed from: h */
    public final ImageView f326866h;

    /* renamed from: i */
    public int f326867i = -1;

    /* renamed from: j */
    public boolean f326868j;

    /* renamed from: l23.c0$a */
    public static final class C109169a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109168c0 f326869d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f326870e;

        public C109169a(C109168c0 c0Var, C101198e eVar) {
            this.f326869d = c0Var;
            this.f326870e = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPhotoPencilPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109168c0 c0Var = this.f326869d;
            boolean z = !c0Var.f326868j;
            c0Var.f326868j = z;
            if (z) {
                C110992d dVar = C110992d.f332425a;
                C110992d.m151314c(dVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, (Object) null);
                dVar.mo162669b(7);
                ImageView imageView = this.f326869d.f326866h;
                imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, this.f326869d.f326866h.getResources().getColor(C0966R.color.akw)));
                C101198e.C62622a.m73576a(this.f326870e, C101198e.C101199b.EDIT_PHOTO_DOODLE, (Bundle) null, 2, (Object) null);
                C108047a aVar = this.f326869d.f326865g;
                if (!aVar.f323561f) {
                    aVar.f323561f = true;
                    aVar.f323556a.setCloseTouchOutside(false);
                    aVar.f323556a.setOutsideTouchable(true);
                    aVar.mo158441a().setRadiusNormalInner((float) C76577a.m92151b(aVar.mo158442b().getContext(), 10));
                    aVar.mo158441a().setRadiusNormalOuter(aVar.mo158442b().getResources().getDimension(C0966R.dimen.f3723cd));
                    aVar.mo158441a().setRadiusSelectInner(aVar.mo158441a().getRadiusNormalOuter());
                    aVar.mo158441a().setRadiusSelectOuter(aVar.mo158442b().getResources().getDimension(C0966R.dimen.f3736cp));
                    aVar.mo158441a().setColorList(C108047a.f323555h);
                    aVar.mo158441a().setSelected(2);
                    aVar.mo158441a().setColorSelectedCallback(new C108053b(aVar));
                    ((ImageView) ((C36570n) aVar.f323559d).getValue()).setOnClickListener(new C108054c(aVar));
                    ((ImageView) ((C36570n) aVar.f323560e).getValue()).setOnClickListener(new C108055d(aVar));
                }
                this.f326869d.f326864f.setShow(true);
                C108047a aVar2 = this.f326869d.f326865g;
                C108047a.C108048a aVar3 = aVar2.f323562g;
                if (aVar3 != null) {
                    aVar3.mo158444b(aVar2.mo158441a().getSelected());
                }
            } else {
                c0Var.mo160408x();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPhotoPencilPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l23.c0$b */
    public static final class C109170b implements C108047a.C108048a {

        /* renamed from: a */
        public final /* synthetic */ C101198e f326871a;

        /* renamed from: b */
        public final /* synthetic */ C109168c0 f326872b;

        public C109170b(C101198e eVar, C109168c0 c0Var) {
            this.f326871a = eVar;
            this.f326872b = c0Var;
        }

        /* renamed from: a */
        public void mo158443a() {
            C109168c0 c0Var = this.f326872b;
            c0Var.f326868j = false;
            c0Var.mo160408x();
        }

        /* renamed from: b */
        public void mo158444b(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", i);
            this.f326871a.mo14585p(C101198e.C101199b.EDIT_PHOTO_DOODLE_PENCIL, bundle);
        }

        /* renamed from: c */
        public void mo158445c() {
            C101198e.C62622a.m73576a(this.f326871a, C101198e.C101199b.EDIT_PHOTO_DOODLE_UNDO, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109168c0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "layout");
        C87412m.m108594g(eVar, "status");
        EditorPanelHolder editorPanelHolder = (EditorPanelHolder) viewGroup.findViewById(C0966R.C0970id.cci);
        this.f326864f = editorPanelHolder;
        C87412m.m108593f(editorPanelHolder, "holder");
        C108047a aVar = new C108047a(editorPanelHolder);
        this.f326865g = aVar;
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.f357897cc1);
        this.f326866h = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, -1));
        imageView.setOnClickListener(new C109169a(this, eVar));
        aVar.f323562g = new C109170b(eVar, this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f326864f.mo151464b()) {
            return false;
        }
        this.f326868j = false;
        mo160408x();
        return true;
    }

    public void reset() {
        this.f326868j = false;
        mo160408x();
    }

    public void setVisibility(int i) {
        this.f326866h.setVisibility(i);
    }

    /* renamed from: x */
    public final void mo160408x() {
        this.f326864f.setShow(false);
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_PHOTO_DOODLE_CANCEL, (Bundle) null, 2, (Object) null);
        ImageView imageView = this.f326866h;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, this.f326867i));
        this.f326864f.setShow(false);
    }
}
