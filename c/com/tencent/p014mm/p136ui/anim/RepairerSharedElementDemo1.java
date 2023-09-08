package com.tencent.p014mm.p136ui.anim;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import fy3.C32224a;
import gj3.C59469a;
import gj3.C59473f;
import gj3.C59474h;
import gj3.C59476i;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo1;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo1 */
public final class RepairerSharedElementDemo1 extends MMSecDataActivity {

    /* renamed from: d */
    public final C13601g f164993d = C36568h.m40985a(new C57634a(this));

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo1$a */
    public static final class C57634a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo1 f164994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57634a(RepairerSharedElementDemo1 repairerSharedElementDemo1) {
            super(0);
            this.f164994d = repairerSharedElementDemo1;
        }

        public Object invoke() {
            return (ImageView) this.f164994d.findViewById(C0966R.C0970id.o8r);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo1$b */
    public static final class C57635b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo1 f164995d;

        public C57635b(RepairerSharedElementDemo1 repairerSharedElementDemo1) {
            this.f164995d = repairerSharedElementDemo1;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImageView H7 = this.f164995d.mo81978H7();
            C87412m.m108593f(H7, "iv1");
            C59476i.m69400b(H7, "soontest", (Object) null, 2, (Object) null);
            LinkedList linkedList = new LinkedList();
            RepairerSharedElementDemo1 repairerSharedElementDemo1 = this.f164995d;
            linkedList.add(Pair.create(repairerSharedElementDemo1.mo81978H7(), repairerSharedElementDemo1.mo81978H7().getTransitionName()));
            Bundle a = C59473f.m69397a(((C59474h) this.f164995d.component(C59474h.class)).f169947e, view, (C59469a) null, (Intent) null, 6, (Object) null);
            Intent intent = new Intent(this.f164995d, RepairerSharedElementPreviewActivity.class);
            RepairerSharedElementDemo1 repairerSharedElementDemo12 = this.f164995d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(a);
            aVar.mo10233c(intent);
            RepairerSharedElementDemo1 repairerSharedElementDemo13 = repairerSharedElementDemo12;
            C117292a.m165358d(repairerSharedElementDemo13, aVar.mo10232b(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            repairerSharedElementDemo12.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(repairerSharedElementDemo13, "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo1$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final ImageView mo81978H7() {
        return (ImageView) ((C36570n) this.f164993d).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d8j;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("SharedElementDemo");
        mo81978H7().setImageResource(C0966R.C0969drawable.f4762m7);
        mo81978H7().setOnClickListener(new C57635b(this));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C59474h.class);
    }
}
