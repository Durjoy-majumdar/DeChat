package v21;

import android.text.Editable;
import android.text.Spanned;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p21.C100616a;
import p21.C100628m;
import s21.C101496a;
import u21.C101941c;

/* renamed from: v21.p */
public class C102140p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300789d;

    public C102140p(C102132i iVar) {
        this.f300789d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Editor.EditorSelectManager", "select");
        this.f300789d.mo141667p();
        if (!C102132i.f300744K) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: not init");
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (this.f300789d.mo141664m() != 1) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: not insert");
            this.f300789d.mo141669r();
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (C101941c.m134173q().mo141456l(this.f300789d.f300776w.f300735a) == null) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: item is null");
            this.f300789d.mo141669r();
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            RecyclerView i = this.f300789d.mo141660i();
            if (i == null) {
                Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: recyclerView is null");
                this.f300789d.mo141669r();
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C102126c a = C102142r.m134570a(C102142r.m134571b(i, this.f300789d.f300776w.f300735a));
            if (a == null) {
                Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: rteInfo is null");
                this.f300789d.mo141669r();
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            WXRTEditText wXRTEditText = a.f300732a;
            if (wXRTEditText != null) {
                Editable text = wXRTEditText.getText();
                if (text == null) {
                    Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: text is null");
                    this.f300789d.mo141669r();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (text.length() > 0) {
                    a.f300732a.mo127559y(this.f300789d.f300776w.f300736b, true);
                } else {
                    C100616a l = C101941c.m134173q().mo141456l(this.f300789d.f300776w.f300735a - 1);
                    C100616a aVar = null;
                    if (l != null && l.mo140076b() == -3) {
                        l = null;
                    }
                    C100616a l2 = C101941c.m134173q().mo141456l(this.f300789d.f300776w.f300735a + 1);
                    if (l2 == null || l2.mo140076b() != -2) {
                        aVar = l2;
                    }
                    if (l != null) {
                        if (l.mo140076b() == 1) {
                            Spanned a2 = C101496a.m133260a(((C100628m) l).f294819s);
                            if (a2 == null) {
                                Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: spanned is null");
                                this.f300789d.mo141669r();
                                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                return;
                            }
                            C102132i iVar = this.f300789d;
                            iVar.mo141673v(iVar.f300776w.f300735a - 1, a2.length(), this.f300789d.f300776w.f300735a, 0);
                        } else {
                            C102132i iVar2 = this.f300789d;
                            int i2 = iVar2.f300776w.f300735a;
                            iVar2.mo141673v(i2 - 1, 0, i2, 0);
                        }
                    } else if (aVar == null) {
                        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: no neighbor");
                        this.f300789d.mo141669r();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (aVar.mo140076b() == 1) {
                        C102132i iVar3 = this.f300789d;
                        int i3 = iVar3.f300776w.f300735a;
                        iVar3.mo141673v(i3, 0, i3 + 1, 0);
                    } else {
                        C102132i iVar4 = this.f300789d;
                        int i4 = iVar4.f300776w.f300735a;
                        iVar4.mo141673v(i4, 0, i4 + 1, 1);
                    }
                    this.f300789d.mo141654b();
                    this.f300789d.mo141647A(true, true, 50);
                }
            } else if (a.f300733b == null || a.f300734c == null) {
                Log.m105920e("MicroMsg.Editor.EditorSelectManager", "select: rteInfo invalid");
                this.f300789d.mo141669r();
            } else {
                this.f300789d.mo141654b();
                C102132i iVar5 = this.f300789d;
                int i5 = iVar5.f300776w.f300735a;
                iVar5.mo141673v(i5, 0, i5, 1);
                this.f300789d.mo141647A(true, true, 50);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
