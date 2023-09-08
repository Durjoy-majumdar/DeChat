package q23;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: q23.b */
public final class C110361b extends LinearLayout implements View.OnClickListener {

    /* renamed from: d */
    public C32224a<C13598b0> f330107d;

    /* renamed from: e */
    public C32224a<C13598b0> f330108e;

    /* renamed from: f */
    public C32224a<C13598b0> f330109f;

    /* renamed from: g */
    public C32224a<C13598b0> f330110g;

    /* renamed from: h */
    public C32224a<C13598b0> f330111h;

    /* renamed from: i */
    public ViewGroup f330112i;

    /* renamed from: j */
    public ViewGroup f330113j;

    /* renamed from: n */
    public ViewGroup f330114n;

    /* renamed from: o */
    public ViewGroup f330115o;

    /* renamed from: p */
    public ViewGroup f330116p;

    /* renamed from: q */
    public final boolean f330117q = true;

    /* renamed from: r */
    public final C13601g f330118r = C36568h.m40985a(new C110363b(this));

    /* renamed from: s */
    public final C13601g f330119s = C36568h.m40985a(new C110362a(this));

    /* renamed from: q23.b$a */
    public static final class C110362a extends C87413o implements C32224a<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ C110361b f330120d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110362a(C110361b bVar) {
            super(0);
            this.f330120d = bVar;
        }

        public Object invoke() {
            return C76577a.m92158i(this.f330120d.getContext(), C0966R.C0969drawable.bzu);
        }
    }

    /* renamed from: q23.b$b */
    public static final class C110363b extends C87413o implements C32224a<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ C110361b f330121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110363b(C110361b bVar) {
            super(0);
            this.f330121d = bVar;
        }

        public Object invoke() {
            return C76577a.m92158i(this.f330121d.getContext(), C0966R.C0969drawable.bzv);
        }
    }

    public C110361b(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.c_9, this, true);
        View findViewById = findViewById(C0966R.C0970id.fbc);
        C87412m.m108593f(findViewById, "findViewById(R.id.item_menu_time)");
        this.f330112i = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.fb_);
        C87412m.m108593f(findViewById2, "findViewById(R.id.item_menu_delete)");
        this.f330113j = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.fba);
        C87412m.m108593f(findViewById3, "findViewById(R.id.item_menu_edit)");
        this.f330114n = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.fb9);
        C87412m.m108593f(findViewById4, "findViewById(R.id.item_menu_caption)");
        this.f330115o = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.fbb);
        C87412m.m108593f(findViewById5, "findViewById(R.id.item_menu_read)");
        this.f330116p = (ViewGroup) findViewById5;
        mo161864b(this.f330112i, C0966R.raw.icons_filled_time, C0966R.string.kbx);
        mo161864b(this.f330113j, C0966R.raw.icons_filled_delete, C0966R.string.kbu);
        mo161864b(this.f330114n, C0966R.raw.icons_filled_pencil, C0966R.string.kbv);
        mo161864b(this.f330115o, C0966R.raw.icons_filled_caption, C0966R.string.kbt);
        mo161864b(this.f330116p, C0966R.raw.icons_filled_talk, C0966R.string.kbw);
    }

    private final Drawable getDownDrawable() {
        return (Drawable) ((C36570n) this.f330119s).getValue();
    }

    private final Drawable getUpDrawable() {
        return (Drawable) ((C36570n) this.f330118r).getValue();
    }

    /* renamed from: a */
    public final void mo161863a() {
        setBackground(getDownDrawable());
    }

    /* renamed from: b */
    public final void mo161864b(ViewGroup viewGroup, int i, int i2) {
        ((TextView) viewGroup.findViewById(C0966R.C0970id.knx)).setText(C76577a.m92166q(getContext(), i2));
        ((WeImageView) viewGroup.findViewById(C0966R.C0970id.f15)).setImageResource(i);
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.b_4);
        if (imageView != null) {
            imageView.setImageDrawable(C76577a.m92158i(getContext(), C0966R.raw.popvideo_post_selected_origin));
        }
        viewGroup.setOnClickListener(this);
    }

    /* renamed from: c */
    public final void mo161865c() {
        setBackground(getUpDrawable());
    }

    public final C32224a<C13598b0> getDeleteListener() {
        return this.f330108e;
    }

    public final C32224a<C13598b0> getEditCaptionListener() {
        return this.f330110g;
    }

    public final C32224a<C13598b0> getEditContentListener() {
        return this.f330109f;
    }

    public final C32224a<C13598b0> getEditTimeListener() {
        return this.f330107d;
    }

    public final C32224a<C13598b0> getReadTextListener() {
        return this.f330111h;
    }

    public void onClick(View view) {
        C32224a<C13598b0> aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fb_) {
            C32224a<C13598b0> aVar2 = this.f330108e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fbc) {
            C32224a<C13598b0> aVar3 = this.f330107d;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fba) {
            C32224a<C13598b0> aVar4 = this.f330109f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fb9) {
            C32224a<C13598b0> aVar5 = this.f330110g;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.fbb || (aVar = this.f330111h) == null)) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setDeleteListener(C32224a<C13598b0> aVar) {
        this.f330108e = aVar;
    }

    public final void setEditCaptionListener(C32224a<C13598b0> aVar) {
        this.f330110g = aVar;
    }

    public final void setEditContentListener(C32224a<C13598b0> aVar) {
        this.f330109f = aVar;
    }

    public final void setEditTimeListener(C32224a<C13598b0> aVar) {
        this.f330107d = aVar;
    }

    public final void setReadTextListener(C32224a<C13598b0> aVar) {
        this.f330111h = aVar;
    }
}
