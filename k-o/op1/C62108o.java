package op1;

import android.view.View;
import cl1.C54979h1;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import j20.C117292a;
import java.util.ArrayList;
import pp1.C62427b;
import sk1.C48416t;
import te3.C50626o21;

/* renamed from: op1.o */
public final class C62108o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48416t f176612d;

    /* renamed from: e */
    public final /* synthetic */ C62084h f176613e;

    /* renamed from: f */
    public final /* synthetic */ C62427b f176614f;

    public C62108o(C48416t tVar, C62084h hVar, C62427b bVar) {
        this.f176612d = tVar;
        this.f176613e = hVar;
        this.f176614f = bVar;
    }

    public final void onClick(View view) {
        FinderJumpInfo finderJumpInfo;
        NativeInfo nativeInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C50626o21 o212 = this.f176612d.f129597d.f139534d;
        if (o212 == null || (finderJumpInfo = o212.f138912d) == null || (nativeInfo = finderJumpInfo.native_info) == null) {
            this.f176614f.f44854d.performClick();
        } else {
            C62084h hVar = this.f176613e;
            ((C54979h1) hVar.f176533g.mo71262a(C54979h1.class)).mo75941g3(hVar.f176531e, nativeInfo);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
