package l23;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l23.C109202j;
import lh2.C99417a;
import qh2.C101198e;
import qw1.C101315h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp3.C110794b;
import sp3.C36777d;
import sx3.C110818d0;
import sx3.C26236u;

/* renamed from: l23.d0 */
public final class C109171d0 extends C99417a implements C109202j.C109205d {

    /* renamed from: A */
    public final C13601g f326873A;

    /* renamed from: f */
    public final ViewGroup f326874f;

    /* renamed from: g */
    public final Context f326875g;

    /* renamed from: h */
    public final MultiProcessMMKV f326876h = MultiProcessMMKV.getMMKV("MultiEditPostPreviewPlugin");

    /* renamed from: i */
    public final View f326877i;

    /* renamed from: j */
    public final View f326878j;

    /* renamed from: n */
    public final C13601g f326879n;

    /* renamed from: o */
    public final C13601g f326880o;

    /* renamed from: p */
    public boolean f326881p;

    /* renamed from: q */
    public C96552p0 f326882q;

    /* renamed from: r */
    public final C13601g f326883r;

    /* renamed from: s */
    public final C13601g f326884s;

    /* renamed from: t */
    public final C13601g f326885t;

    /* renamed from: u */
    public final int f326886u;

    /* renamed from: v */
    public final int f326887v;

    /* renamed from: w */
    public C36777d f326888w;

    /* renamed from: x */
    public String f326889x;

    /* renamed from: y */
    public boolean f326890y;

    /* renamed from: z */
    public boolean f326891z;

    /* renamed from: l23.d0$a */
    public static final class C109172a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326892d;

        public C109172a(C109171d0 d0Var) {
            this.f326892d = d0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109171d0 d0Var = this.f326892d;
            d0Var.mo160415y(!d0Var.f326881p);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l23.d0$b */
    public static final class C109173b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326893d;

        public C109173b(C109171d0 d0Var) {
            this.f326893d = d0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f326893d.mo160410A();
            ((C104428a) ((C36570n) this.f326893d.f326873A).getValue()).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l23.d0$c */
    public static final class C109174c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109174c(C109171d0 d0Var) {
            super(0);
            this.f326894d = d0Var;
        }

        public Object invoke() {
            return View.inflate(this.f326894d.f326875g, C0966R.C0971layout.a0l, (ViewGroup) null);
        }
    }

    /* renamed from: l23.d0$d */
    public static final class C109175d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109175d(C109171d0 d0Var) {
            super(0);
            this.f326895d = d0Var;
        }

        public Object invoke() {
            return this.f326895d.f326874f.findViewById(C0966R.C0970id.cc_);
        }
    }

    /* renamed from: l23.d0$e */
    public static final class C109176e extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109176e(C109171d0 d0Var) {
            super(2);
            this.f326896d = d0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            Bitmap bitmap = (Bitmap) obj2;
            ((ImageView) ((C36570n) this.f326896d.f326884s).getValue()).setImageBitmap(bitmap);
            ((ImageView) ((C36570n) this.f326896d.f326885t).getValue()).setImageBitmap(bitmap);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.d0$f */
    public static final class C109177f extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109177f(C109171d0 d0Var) {
            super(0);
            this.f326897d = d0Var;
        }

        public Object invoke() {
            return (Button) this.f326897d.f326874f.findViewById(C0966R.C0970id.ccp);
        }
    }

    /* renamed from: l23.d0$g */
    public static final class C109178g extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109178g(C109171d0 d0Var) {
            super(0);
            this.f326898d = d0Var;
        }

        public Object invoke() {
            return (ImageView) C109171d0.m148219x(this.f326898d).findViewById(C0966R.C0970id.egx);
        }
    }

    /* renamed from: l23.d0$h */
    public static final class C109179h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109179h(C109171d0 d0Var) {
            super(0);
            this.f326899d = d0Var;
        }

        public Object invoke() {
            return (ImageView) C109171d0.m148219x(this.f326899d).findViewById(C0966R.C0970id.et_);
        }
    }

    /* renamed from: l23.d0$i */
    public static final class C109180i extends C87413o implements C32224a<C104428a> {

        /* renamed from: d */
        public final /* synthetic */ C109171d0 f326900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109180i(C109171d0 d0Var) {
            super(0);
            this.f326900d = d0Var;
        }

        public Object invoke() {
            C104428a aVar = new C104428a(this.f326900d.f326875g, 0);
            C109171d0 d0Var = this.f326900d;
            C109171d0.m148219x(d0Var).findViewById(C0966R.C0970id.evo).setOnClickListener(new C10459e0(aVar));
            aVar.setContentView(C109171d0.m148219x(d0Var));
            return aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109171d0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "layout");
        C87412m.m108594g(eVar, "status");
        this.f326874f = viewGroup;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "layout.context");
        this.f326875g = context;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.etb);
        C87412m.m108593f(findViewById, "layout.findViewById(R.id.half_screen_select_btn)");
        this.f326877i = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.et8);
        C87412m.m108593f(findViewById2, "layout.findViewById(R.id.half_screen_header)");
        this.f326878j = findViewById2;
        this.f326879n = C36568h.m40985a(new C109175d(this));
        this.f326880o = C36568h.m40985a(new C109177f(this));
        this.f326883r = C36568h.m40985a(new C109174c(this));
        this.f326884s = C36568h.m40985a(new C109179h(this));
        this.f326885t = C36568h.m40985a(new C109178g(this));
        this.f326886u = C76577a.m92157h(context, C0966R.dimen.f3709c2);
        this.f326887v = C76577a.m92157h(context, C0966R.dimen.f3730cj);
        this.f326873A = C36568h.m40985a(new C109180i(this));
        findViewById.setOnClickListener(new C109172a(this));
        findViewById2.setOnClickListener(new C109173b(this));
    }

    /* renamed from: x */
    public static final View m148219x(C109171d0 d0Var) {
        Object value = ((C36570n) d0Var.f326883r).getValue();
        C87412m.m108593f(value, "<get-dialogView>(...)");
        return (View) value;
    }

    /* renamed from: A */
    public final void mo160410A() {
        Bitmap a;
        String str = this.f326889x;
        if (!(str == null || (a = C101315h.m132899a(C86013q1.m106448i(str, false), Math.max(this.f326886u, this.f326887v))) == null)) {
            try {
                int attributeInt = new ExifInterface(C86013q1.m106423E(str)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                Matrix matrix = new Matrix();
                matrix.postRotate(attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0.0f : 270.0f : 90.0f : 180.0f);
                Bitmap createBitmap = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
                ((ImageView) ((C36570n) this.f326884s).getValue()).setImageBitmap(createBitmap);
                ((ImageView) ((C36570n) this.f326885t).getValue()).setImageBitmap(createBitmap);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MultiEditPostPreviewPlugin", "cannot decode thumbnail from " + this.f326889x + ", " + e.getLocalizedMessage());
            }
        }
        C96552p0 p0Var = this.f326882q;
        if (p0Var != null) {
            C36777d dVar = this.f326888w;
            if (dVar != null) {
                ((C110794b) dVar).destroy();
            }
            C110794b a2 = C110794b.f331445i.mo162358a(((C106205q0) C110818d0.m150914L(p0Var.f282570c)).f316501l);
            this.f326888w = a2;
            a2.mo58663C(this.f326886u, this.f326887v);
            C36777d dVar2 = this.f326888w;
            if (dVar2 != null) {
                ((C110794b) dVar2).mo58665b(C26236u.m33719b(0L), new C109176e(this));
            }
        }
    }

    /* renamed from: B */
    public final void mo160411B() {
        mo160415y(false);
    }

    /* renamed from: C */
    public final boolean mo160412C() {
        return this.f326881p;
    }

    /* renamed from: D */
    public final void mo160413D(boolean z) {
        this.f326891z = z;
    }

    /* renamed from: E */
    public final void mo160414E() {
        if (!this.f326876h.getBoolean("isFirstEnter", false) && this.f326890y) {
            this.f326876h.putBoolean("isFirstEnter", true);
            mo160410A();
            ((C104428a) ((C36570n) this.f326873A).getValue()).show();
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f326881p) {
            return false;
        }
        mo160415y(false);
        return true;
    }

    /* renamed from: s */
    public void mo159389s(C96552p0 p0Var, long j, boolean z) {
        this.f326882q = p0Var;
    }

    /* renamed from: y */
    public final void mo160415y(boolean z) {
        boolean z2 = z;
        this.f326881p = z2;
        if (z2) {
            View view = this.f326878j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f326877i;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = (View) ((C36570n) this.f326879n).getValue();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((Button) ((C36570n) this.f326880o).getValue()).setText(this.f326875g.getString(C0966R.string.a18));
        } else {
            View view7 = this.f326878j;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = this.f326877i;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = (View) ((C36570n) this.f326879n).getValue();
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "changePreviewMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((Button) ((C36570n) this.f326880o).getValue()).setText(this.f326875g.getString(C0966R.string.f360089a13));
        }
        C101198e eVar = this.f291492d;
        C101198e.C101199b bVar = C101198e.C101199b.EDIT_PREVIEW_MODE_CHANGE;
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_1_INT", this.f326881p ? 2 : 1);
        C13598b0 b0Var = C13598b0.f38549a;
        eVar.mo14585p(bVar, bundle);
    }

    /* renamed from: z */
    public final void mo160416z(boolean z) {
        boolean z2 = z;
        this.f326890y = z2;
        if (z2) {
            View view = this.f326877i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f326877i;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin", "enablePreview", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
