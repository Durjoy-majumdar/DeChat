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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo3;", "Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo2;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo3 */
public final class RepairerSharedElementDemo3 extends RepairerSharedElementDemo2 {

    /* renamed from: n */
    public final C13601g f165009n = C36568h.m40985a(new C57644c(this));

    /* renamed from: o */
    public final C13601g f165010o = C36568h.m40985a(new C57642a(this));

    /* renamed from: p */
    public final C13601g f165011p = C36568h.m40985a(new C57643b(this));

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo3$a */
    public static final class C57642a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo3 f165012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57642a(RepairerSharedElementDemo3 repairerSharedElementDemo3) {
            super(0);
            this.f165012d = repairerSharedElementDemo3;
        }

        public Object invoke() {
            return (ImageView) this.f165012d.findViewById(C0966R.C0970id.o8r);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo3$b */
    public static final class C57643b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo3 f165013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57643b(RepairerSharedElementDemo3 repairerSharedElementDemo3) {
            super(0);
            this.f165013d = repairerSharedElementDemo3;
        }

        public Object invoke() {
            return (ImageView) this.f165013d.findViewById(C0966R.C0970id.o8s);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo3$c */
    public static final class C57644c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo3 f165014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57644c(RepairerSharedElementDemo3 repairerSharedElementDemo3) {
            super(0);
            this.f165014d = repairerSharedElementDemo3;
        }

        public Object invoke() {
            return (LinearLayout) this.f165014d.findViewById(C0966R.C0970id.o96);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo3$d */
    public static final class C57645d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo3 f165015d;

        public C57645d(RepairerSharedElementDemo3 repairerSharedElementDemo3) {
            this.f165015d = repairerSharedElementDemo3;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImageView imageView = (ImageView) ((C36570n) this.f165015d.f165010o).getValue();
            C87412m.m108593f(imageView, "iv1");
            C59476i.m69399a(imageView, "soontest0", 0);
            ImageView imageView2 = (ImageView) ((C36570n) this.f165015d.f165011p).getValue();
            C87412m.m108593f(imageView2, "iv2");
            C59476i.m69399a(imageView2, "soontest1", 1);
            RepairerSharedElementDemo3 repairerSharedElementDemo3 = this.f165015d;
            repairerSharedElementDemo3.f165002i.add(Pair.create((ImageView) ((C36570n) repairerSharedElementDemo3.f165010o).getValue(), ((ImageView) ((C36570n) this.f165015d.f165010o).getValue()).getTransitionName()));
            RepairerSharedElementDemo3 repairerSharedElementDemo32 = this.f165015d;
            repairerSharedElementDemo32.f165002i.add(Pair.create((ImageView) ((C36570n) repairerSharedElementDemo32.f165011p).getValue(), ((ImageView) ((C36570n) this.f165015d.f165011p).getValue()).getTransitionName()));
            Intent intent = new Intent(this.f165015d, RepairerSharedElementPreviewActivity2.class);
            Bundle a = C59473f.m69397a(((C59474h) this.f165015d.component(C59474h.class)).f169947e, view, (C59469a) null, (Intent) null, 6, (Object) null);
            RepairerSharedElementDemo3 repairerSharedElementDemo33 = this.f165015d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(a);
            aVar.mo10233c(intent);
            RepairerSharedElementDemo3 repairerSharedElementDemo34 = repairerSharedElementDemo33;
            C117292a.m165358d(repairerSharedElementDemo34, aVar.mo10232b(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            repairerSharedElementDemo33.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(repairerSharedElementDemo34, "com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo3$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: J7 */
    public void mo81982J7(List<Integer> list) {
        C87412m.m108594g(list, "dataList");
        ((ImageView) ((C36570n) this.f165010o).getValue()).setImageResource(list.get(0).intValue());
        ((ImageView) ((C36570n) this.f165011p).getValue()).setImageResource(list.get(1).intValue());
    }

    /* renamed from: K7 */
    public void mo81983K7(int i) {
        List<Integer> H7 = mo81980H7(2);
        mo81982J7(H7);
        RepairerSharedElementDemo2.f164996j = H7;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d8l;
    }

    public void initView() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("SharedElementDemo3");
        mo81983K7(2);
        ((LinearLayout) ((C36570n) this.f165009n).getValue()).setOnClickListener(new C57645d(this));
    }
}
