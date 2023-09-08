package cb3;

import ab3.C91983a;
import android.text.Spanned;
import android.view.View;
import bb3.C92231j;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gb3.C98096c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import xa3.C102587c;
import xa3.C102593i;
import za3.C102990c;

/* renamed from: cb3.h */
public class C92397h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264407d;

    public C92397h(C92400k kVar) {
        this.f264407d = kVar;
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
        C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("NoteSelectManager", "paste");
        if (C92400k.f264411N) {
            C92400k kVar = this.f264407d;
            if (kVar.f264424a) {
                if (C92400k.m116190a(kVar)) {
                    C91983a aVar = this.f264407d.f264445v;
                    if (aVar != null) {
                        ((NoteEditorUI) aVar).mo134933b8();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                this.f264407d.mo126389p();
                ArrayList<C102587c> arrayList2 = null;
                int c = C92231j.m115955c(MMApplicationContext.getContext());
                String str2 = "";
                boolean z = false;
                if (c == 2) {
                    if (this.f264407d.f264445v == null || !C92231j.m115956d(MMApplicationContext.getContext())) {
                        try {
                            CharSequence text = ClipboardHelper.getText();
                            if (text instanceof Spanned) {
                                str = C102990c.m136185a((Spanned) text);
                            } else {
                                String charSequence = text.toString();
                                StringBuilder sb = new StringBuilder();
                                C102990c.m136187c(charSequence, sb, 0, charSequence.length());
                                str = sb.toString();
                            }
                            if (!Util.isNullOrNil(str)) {
                                str2 = str;
                            }
                            C92231j.m115953a();
                        } catch (Exception e) {
                            Log.m105921e("NoteSelectManager", "get clipboard data error : ", e);
                            this.f264407d.mo126392s();
                            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    } else {
                        ((NoteEditorUI) this.f264407d.f264445v).mo134932a8();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                } else if (c == 3) {
                    ArrayList<C102587c> b = C92231j.m115954b();
                    if (b.size() <= 0) {
                        Log.m105920e("NoteSelectManager", "paste: tempDataList is null or empty");
                        this.f264407d.mo126392s();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (b.size() == 1 && b.get(0) != null && b.get(0).mo142212c() == 1) {
                        str2 = ((C102593i) b.get(0)).f302126s;
                    } else {
                        arrayList2 = b;
                    }
                } else {
                    Log.m105920e("NoteSelectManager", "paste: no data");
                    this.f264407d.mo126392s();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (!Util.isNullOrNil(str2) || !(arrayList2 == null || arrayList2.size() == 0)) {
                    C92400k kVar2 = this.f264407d;
                    if (kVar2.f264445v != null) {
                        int m = kVar2.mo126386m();
                        if (m != 0) {
                            StringBuilder sb4 = new StringBuilder(str2);
                            if (arrayList2 != null) {
                                Iterator<C102587c> it = arrayList2.iterator();
                                i = 0;
                                while (it.hasNext()) {
                                    C102587c next = it.next();
                                    if (next != null) {
                                        if (next.mo142212c() != 1) {
                                            i++;
                                        } else {
                                            sb4.append(((C102593i) next).f302126s);
                                        }
                                    }
                                }
                            } else {
                                i = 0;
                            }
                            int d = C98096c.m126709d(sb4.toString());
                            if (m == 2 || m == 3) {
                                for (int i4 = kVar2.f264446w.f264399a; i4 <= kVar2.f264446w.f264401c; i4++) {
                                    C102587c k = ((NoteEditorUI) kVar2.f264445v).f283238X0.mo126201k(i4);
                                    if (k != null) {
                                        if (k.mo142212c() == 1) {
                                            C92393d dVar = kVar2.f264446w;
                                            int i5 = dVar.f264399a;
                                            if (i4 == i5 && i4 == dVar.f264401c) {
                                                String str3 = ((C102593i) k).f302126s;
                                                int i6 = dVar.f264400b;
                                                int i7 = dVar.f264402d;
                                                i2 = 0;
                                                i3 = C98096c.m126710e(str3, i6, i7, false);
                                            } else if (i4 == i5) {
                                                i3 = C98096c.m126710e(((C102593i) k).f302126s, dVar.f264400b, -1, true);
                                                i2 = 0;
                                            } else if (i4 == dVar.f264401c) {
                                                String str4 = ((C102593i) k).f302126s;
                                                int i8 = dVar.f264402d;
                                                i2 = 0;
                                                i3 = C98096c.m126710e(str4, 0, i8, false);
                                            } else {
                                                i2 = 0;
                                                i3 = C98096c.m126709d(((C102593i) k).f302126s);
                                            }
                                            d -= i3 + i2;
                                        } else if (k.mo142212c() != 1) {
                                            i--;
                                        }
                                    }
                                }
                            }
                            z = ((NoteEditorUI) kVar2.f264445v).f283238X0.mo126195e(d, i);
                        }
                        if (z) {
                            ((NoteEditorUI) this.f264407d.f264445v).mo134932a8();
                            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                    int m2 = this.f264407d.mo126386m();
                    if (m2 == 1 || m2 == 2) {
                        this.f264407d.mo126380f(true, arrayList2, str2);
                    } else if (m2 == 3) {
                        this.f264407d.mo126379e(true, arrayList2, str2);
                    } else {
                        Log.m105920e("NoteSelectManager", "paste: invalid selection");
                        this.f264407d.mo126392s();
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Log.m105920e("NoteSelectManager", "paste: no useful data");
                this.f264407d.mo126392s();
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        Log.m105920e("NoteSelectManager", "paste: not init or not editable");
        this.f264407d.mo126389p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
