package com.tencent.p014mm.p136ui.anim;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gj3.C59469a;
import gj3.C59473f;
import gj3.C59474h;
import gj3.C59476i;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo4;", "Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo2;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4 */
public final class RepairerSharedElementDemo4 extends RepairerSharedElementDemo2 {

    /* renamed from: n */
    public final C13601g f165016n = C36568h.m40985a(new C57650e(this));

    /* renamed from: o */
    public final C13601g f165017o = C36568h.m40985a(new C57646a(this));

    /* renamed from: p */
    public final C13601g f165018p = C36568h.m40985a(new C57647b(this));

    /* renamed from: q */
    public final C13601g f165019q = C36568h.m40985a(new C57648c(this));

    /* renamed from: r */
    public final C13601g f165020r = C36568h.m40985a(new C57649d(this));

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4$a */
    public static final class C57646a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo4 f165021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57646a(RepairerSharedElementDemo4 repairerSharedElementDemo4) {
            super(0);
            this.f165021d = repairerSharedElementDemo4;
        }

        public Object invoke() {
            return (ImageView) this.f165021d.findViewById(C0966R.C0970id.o8r);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4$b */
    public static final class C57647b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo4 f165022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57647b(RepairerSharedElementDemo4 repairerSharedElementDemo4) {
            super(0);
            this.f165022d = repairerSharedElementDemo4;
        }

        public Object invoke() {
            return (ImageView) this.f165022d.findViewById(C0966R.C0970id.o8s);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4$c */
    public static final class C57648c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo4 f165023d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57648c(RepairerSharedElementDemo4 repairerSharedElementDemo4) {
            super(0);
            this.f165023d = repairerSharedElementDemo4;
        }

        public Object invoke() {
            return (ImageView) this.f165023d.findViewById(C0966R.C0970id.o8t);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4$d */
    public static final class C57649d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo4 f165024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57649d(RepairerSharedElementDemo4 repairerSharedElementDemo4) {
            super(0);
            this.f165024d = repairerSharedElementDemo4;
        }

        public Object invoke() {
            return (ImageView) this.f165024d.findViewById(C0966R.C0970id.o8u);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4$e */
    public static final class C57650e extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo4 f165025d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57650e(RepairerSharedElementDemo4 repairerSharedElementDemo4) {
            super(0);
            this.f165025d = repairerSharedElementDemo4;
        }

        public Object invoke() {
            return (LinearLayout) this.f165025d.findViewById(C0966R.C0970id.o96);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo4$f */
    public static final class C57651f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo4 f165026d;

        public C57651f(RepairerSharedElementDemo4 repairerSharedElementDemo4) {
            this.f165026d = repairerSharedElementDemo4;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImageView imageView = (ImageView) ((C36570n) this.f165026d.f165017o).getValue();
            C87412m.m108593f(imageView, "iv1");
            C59476i.m69399a(imageView, "soontest0", 0);
            ImageView imageView2 = (ImageView) ((C36570n) this.f165026d.f165018p).getValue();
            C87412m.m108593f(imageView2, "iv2");
            C59476i.m69399a(imageView2, "soontest1", 1);
            ImageView imageView3 = (ImageView) ((C36570n) this.f165026d.f165019q).getValue();
            C87412m.m108593f(imageView3, "iv3");
            C59476i.m69399a(imageView3, "soontest2", 2);
            ImageView imageView4 = (ImageView) ((C36570n) this.f165026d.f165020r).getValue();
            C87412m.m108593f(imageView4, "iv4");
            C59476i.m69399a(imageView4, "soontest3", 3);
            RepairerSharedElementDemo4 repairerSharedElementDemo4 = this.f165026d;
            repairerSharedElementDemo4.f165002i.add(Pair.create((ImageView) ((C36570n) repairerSharedElementDemo4.f165017o).getValue(), ((ImageView) ((C36570n) this.f165026d.f165017o).getValue()).getTransitionName()));
            RepairerSharedElementDemo4 repairerSharedElementDemo42 = this.f165026d;
            repairerSharedElementDemo42.f165002i.add(Pair.create((ImageView) ((C36570n) repairerSharedElementDemo42.f165018p).getValue(), ((ImageView) ((C36570n) this.f165026d.f165018p).getValue()).getTransitionName()));
            RepairerSharedElementDemo4 repairerSharedElementDemo43 = this.f165026d;
            repairerSharedElementDemo43.f165002i.add(Pair.create((ImageView) ((C36570n) repairerSharedElementDemo43.f165019q).getValue(), ((ImageView) ((C36570n) this.f165026d.f165019q).getValue()).getTransitionName()));
            RepairerSharedElementDemo4 repairerSharedElementDemo44 = this.f165026d;
            repairerSharedElementDemo44.f165002i.add(Pair.create((ImageView) ((C36570n) repairerSharedElementDemo44.f165020r).getValue(), ((ImageView) ((C36570n) this.f165026d.f165020r).getValue()).getTransitionName()));
            Intent intent = new Intent(this.f165026d, RepairerSharedElementPreviewActivity2.class);
            Bundle a = C59473f.m69397a(((C59474h) this.f165026d.component(C59474h.class)).f169947e, view, (C59469a) null, (Intent) null, 6, (Object) null);
            RepairerSharedElementDemo4 repairerSharedElementDemo45 = this.f165026d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(a);
            aVar.mo10233c(intent);
            RepairerSharedElementDemo4 repairerSharedElementDemo46 = repairerSharedElementDemo45;
            C117292a.m165358d(repairerSharedElementDemo46, aVar.mo10232b(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            repairerSharedElementDemo45.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(repairerSharedElementDemo46, "com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo4$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: J7 */
    public void mo81982J7(List<Integer> list) {
        C87412m.m108594g(list, "dataList");
        ((ImageView) ((C36570n) this.f165017o).getValue()).setImageResource(list.get(0).intValue());
        ((ImageView) ((C36570n) this.f165018p).getValue()).setImageResource(list.get(1).intValue());
        ((ImageView) ((C36570n) this.f165019q).getValue()).setImageResource(list.get(2).intValue());
        ((ImageView) ((C36570n) this.f165020r).getValue()).setImageResource(list.get(3).intValue());
    }

    /* renamed from: K7 */
    public void mo81983K7(int i) {
        List<Integer> H7 = mo81980H7(i);
        mo81982J7(H7);
        RepairerSharedElementDemo2.f164996j = H7;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d8m;
    }

    public void initView() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("SharedElementDemo4");
        mo81983K7(4);
        ((LinearLayout) ((C36570n) this.f165016n).getValue()).setOnClickListener(new C57651f(this));
    }
}
