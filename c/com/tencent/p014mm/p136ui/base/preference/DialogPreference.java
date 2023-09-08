package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import pj3.C77098d;
import pj3.C77099e;
import qo3.C77389a;
import qo3.C77398g;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.preference.DialogPreference */
public final class DialogPreference extends Preference {

    /* renamed from: J */
    public final C77099e f215037J;

    /* renamed from: K */
    public Preference.C6763a f215038K;

    /* renamed from: L */
    public C73227b f215039L;

    /* renamed from: M */
    public C77398g f215040M;

    /* renamed from: com.tencent.mm.ui.base.preference.DialogPreference$a */
    public class C73226a implements AdapterView.OnItemClickListener {
        public C73226a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/preference/DialogPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C77398g gVar = DialogPreference.this.f215040M;
            if (gVar != null) {
                gVar.dismiss();
            }
            DialogPreference dialogPreference = DialogPreference.this;
            C77099e eVar = dialogPreference.f215037J;
            String str = (String) eVar.f225198g[i];
            eVar.f225199h = str;
            if (eVar.f225200i.get(str) == null) {
                dialogPreference.f215037J.getClass();
            } else {
                dialogPreference.f215037J.getClass();
            }
            C73227b bVar = DialogPreference.this.f215039L;
            if (bVar != null) {
                bVar.mo101923a(true);
            }
            DialogPreference dialogPreference2 = DialogPreference.this;
            Preference.C6763a aVar = dialogPreference2.f215038K;
            if (aVar != null) {
                aVar.mo7744a(dialogPreference2, dialogPreference2.f215037J.f225199h);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/preference/DialogPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.DialogPreference$b */
    public interface C73227b {
        /* renamed from: a */
        void mo101923a(boolean z);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    public void mo69920B(Preference.C6763a aVar) {
        this.f215038K = aVar;
    }

    /* renamed from: I */
    public void mo101921I() {
        ListViewInScrollView listViewInScrollView = (ListViewInScrollView) View.inflate(this.f121274d, C0966R.C0971layout.bcq, (ViewGroup) null);
        listViewInScrollView.setOnItemClickListener(new C73226a());
        listViewInScrollView.setAdapter(this.f215037J);
        Context context = this.f121274d;
        C77389a aVar = new C77389a();
        aVar.f225644a = this.f121279i.toString();
        aVar.f225627J = listViewInScrollView;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        this.f215040M = gVar;
        gVar.show();
        C76879j.m92730a(this.f121274d, this.f215040M);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        C77099e eVar = this.f215037J;
        C77098d dVar = eVar.f225200i.get(eVar.f225199h);
        if (dVar != null) {
            mo7741E(dVar.f225194a);
        }
        super.mo1086w(view);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C77099e eVar = new C77099e(context, 1);
        this.f215037J = eVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226859e, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            eVar.f225197f = context.getResources().getStringArray(resourceId);
        }
        eVar.f225198g = obtainStyledAttributes.getTextArray(1);
        obtainStyledAttributes.recycle();
        eVar.mo107413a();
    }
}
