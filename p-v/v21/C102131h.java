package v21;

import android.text.Spanned;
import android.view.View;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import p21.C100616a;
import p21.C100628m;
import s21.C101498c;
import t21.C101712a;
import u21.C101940b;
import u21.C101941c;

/* renamed from: v21.h */
public class C102131h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300742d;

    public C102131h(C102132i iVar) {
        this.f300742d = iVar;
    }

    public void onClick(View view) {
        int i;
        int i2;
        int i3;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Editor.EditorSelectManager", "paste");
        if (C102132i.f300744K) {
            C102132i iVar = this.f300742d;
            if (iVar.f300754a) {
                if (C102132i.m134537a(iVar)) {
                    C101712a aVar = this.f300742d.f300775v;
                    if (aVar != null) {
                        ((EditorUI) aVar).mo127488W7();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                this.f300742d.mo141667p();
                ArrayList<C100616a> arrayList2 = null;
                int c = C101940b.m134170c(MMApplicationContext.getContext());
                String str2 = "";
                boolean z = false;
                if (c == 2) {
                    if (this.f300742d.f300775v == null || !C101940b.m134171d(MMApplicationContext.getContext())) {
                        try {
                            CharSequence text = ClipboardHelper.getText();
                            if (text instanceof Spanned) {
                                str = C101498c.m133261a((Spanned) text);
                            } else {
                                String charSequence = text.toString();
                                StringBuilder sb = new StringBuilder();
                                C101498c.m133263c(charSequence, sb, 0, charSequence.length());
                                str = sb.toString();
                            }
                            if (!Util.isNullOrNil(str)) {
                                str2 = str;
                            }
                            C101940b.m134168a();
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.Editor.EditorSelectManager", "get clipboard data error : ", e);
                            this.f300742d.mo141669r();
                            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    } else {
                        ((EditorUI) this.f300742d.f300775v).mo127486U7();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                } else if (c == 3) {
                    ArrayList<C100616a> b = C101940b.m134169b();
                    if (b.size() <= 0) {
                        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "paste: tempDataList is null or empty");
                        this.f300742d.mo141669r();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (b.size() == 1 && b.get(0) != null && b.get(0).mo140076b() == 1) {
                        str2 = ((C100628m) b.get(0)).f294819s;
                    } else {
                        arrayList2 = b;
                    }
                } else {
                    Log.m105920e("MicroMsg.Editor.EditorSelectManager", "paste: no data");
                    this.f300742d.mo141669r();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (!Util.isNullOrNil(str2) || !(arrayList2 == null || arrayList2.size() == 0)) {
                    C102132i iVar2 = this.f300742d;
                    if (iVar2.f300775v != null) {
                        int m = iVar2.mo141664m();
                        if (m != 0) {
                            StringBuilder sb4 = new StringBuilder(str2);
                            if (arrayList2 != null) {
                                Iterator<C100616a> it = arrayList2.iterator();
                                i = 0;
                                while (it.hasNext()) {
                                    C100616a next = it.next();
                                    if (next != null) {
                                        if (next.mo140076b() != 1) {
                                            i++;
                                        } else {
                                            sb4.append(((C100628m) next).f294819s);
                                        }
                                    }
                                }
                            } else {
                                i = 0;
                            }
                            int d = C93088r.m117434d(sb4.toString());
                            if (m == 2 || m == 3) {
                                for (int i4 = iVar2.f300776w.f300735a; i4 <= iVar2.f300776w.f300737c; i4++) {
                                    C100616a l = C101941c.m134173q().mo141456l(i4);
                                    if (l != null) {
                                        if (l.mo140076b() == 1) {
                                            C102127d dVar = iVar2.f300776w;
                                            int i5 = dVar.f300735a;
                                            if (i4 == i5 && i4 == dVar.f300737c) {
                                                String str3 = ((C100628m) l).f294819s;
                                                int i6 = dVar.f300736b;
                                                int i7 = dVar.f300738d;
                                                i2 = 0;
                                                i3 = C93088r.m117435e(str3, i6, i7, false);
                                            } else if (i4 == i5) {
                                                i3 = C93088r.m117435e(((C100628m) l).f294819s, dVar.f300736b, -1, true);
                                                i2 = 0;
                                            } else if (i4 == dVar.f300737c) {
                                                String str4 = ((C100628m) l).f294819s;
                                                int i8 = dVar.f300738d;
                                                i2 = 0;
                                                i3 = C93088r.m117435e(str4, 0, i8, false);
                                            } else {
                                                i2 = 0;
                                                i3 = C93088r.m117434d(((C100628m) l).f294819s);
                                            }
                                            d -= i3 + i2;
                                        } else if (l.mo140076b() != 1) {
                                            i--;
                                        }
                                    }
                                }
                            }
                            z = C101941c.m134173q().mo141450f(d, i);
                        }
                        if (z) {
                            ((EditorUI) this.f300742d.f300775v).mo127486U7();
                            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                    int m2 = this.f300742d.mo141664m();
                    if (m2 == 1 || m2 == 2) {
                        this.f300742d.mo141658f(true, arrayList2, str2);
                    } else if (m2 == 3) {
                        this.f300742d.mo141657e(true, arrayList2, str2);
                    } else {
                        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "paste: invalid selection");
                        this.f300742d.mo141669r();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Log.m105920e("MicroMsg.Editor.EditorSelectManager", "paste: no useful data");
                this.f300742d.mo141669r();
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        Log.m105920e("MicroMsg.Editor.EditorSelectManager", "paste: not init or not editable");
        this.f300742d.mo141667p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
