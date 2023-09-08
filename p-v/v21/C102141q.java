package v21;

import android.text.Spanned;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p21.C100616a;
import p21.C100628m;
import s21.C101496a;
import u21.C101941c;

/* renamed from: v21.q */
public class C102141q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300790d;

    public C102141q(C102132i iVar) {
        this.f300790d = iVar;
    }

    public void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Editor.EditorSelectManager", "select all");
        this.f300790d.mo141667p();
        if (!C102132i.f300744K) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select all: not init");
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int n = C101941c.m134173q().mo141458n();
        int p = C101941c.m134173q().mo141460p();
        C100616a l = C101941c.m134173q().mo141456l(n);
        C100616a l2 = C101941c.m134173q().mo141456l(p);
        if (l == null || l2 == null) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select all: item is null");
            this.f300790d.mo141669r();
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (l2.mo140076b() == 1) {
            Spanned a = C101496a.m133260a(((C100628m) l2).f294819s);
            if (a == null) {
                Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select all: spanned is null");
                this.f300790d.mo141669r();
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            i = a.length();
        } else {
            i = 1;
        }
        this.f300790d.mo141654b();
        this.f300790d.mo141673v(n, 0, p, i);
        this.f300790d.mo141665n();
        this.f300790d.mo141667p();
        this.f300790d.mo141651E(true, 300);
        this.f300790d.mo141675x(false);
        C102132i iVar = this.f300790d;
        iVar.f300745A.postDelayed(new C102134j(iVar, false), 50);
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
