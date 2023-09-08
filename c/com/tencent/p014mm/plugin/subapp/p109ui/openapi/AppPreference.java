package com.tencent.p014mm.plugin.subapp.p109ui.openapi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMGridView;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import j20.C117292a;
import java.util.ArrayList;
import zw2.C53826d;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppPreference */
public class AppPreference extends Preference {

    /* renamed from: J */
    public Context f116799J;

    /* renamed from: K */
    public C53826d f116800K;

    /* renamed from: L */
    public AdapterView.OnItemClickListener f116801L;

    /* renamed from: M */
    public AdapterView.OnItemClickListener f116802M;

    /* renamed from: N */
    public int f116803N;

    /* renamed from: P */
    public int f116804P;

    /* renamed from: Q */
    public boolean f116805Q;

    /* renamed from: R */
    public int f116806R;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppPreference$a */
    public class C43175a implements AdapterView.OnItemClickListener {
        public C43175a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            AdapterView<?> adapterView2 = adapterView;
            arrayList.add(adapterView);
            View view2 = view;
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (AppPreference.this.f116800K.mo74441b(i)) {
                C53826d dVar = AppPreference.this.f116800K;
                dVar.f151045e = false;
                dVar.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            AppPreference appPreference = AppPreference.this;
            if (appPreference.f116800K.f151045e) {
                AdapterView.OnItemClickListener onItemClickListener = appPreference.f116802M;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(adapterView, view, i, j);
                }
            } else {
                AdapterView.OnItemClickListener onItemClickListener2 = appPreference.f116801L;
                if (onItemClickListener2 != null) {
                    onItemClickListener2.onItemClick(adapterView, view, i, j);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppPreference$b */
    public class C43176b implements AdapterView.OnItemLongClickListener {
        public C43176b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C53826d dVar = AppPreference.this.f116800K;
            if (dVar != null) {
                dVar.f151045e = !dVar.f151045e;
                dVar.notifyDataSetChanged();
            }
            return true;
        }
    }

    public AppPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public C44561j mo67400I(int i) {
        if (i < 0 || i >= this.f116800K.getCount()) {
            return null;
        }
        return (C44561j) this.f116800K.getItem(i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        MMGridView mMGridView = (MMGridView) view.findViewById(C0966R.C0970id.eqy);
        C53826d dVar = new C53826d(this.f116799J, this.f116803N);
        this.f116800K = dVar;
        mMGridView.setAdapter(dVar);
        mMGridView.setOnItemClickListener(new C43175a());
        if (this.f116805Q) {
            mMGridView.setOnItemLongClickListener(new C43176b());
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.cjf);
        if (this.f116800K.getCount() == 0) {
            textView.setVisibility(0);
            textView.setText(this.f116806R);
            mMGridView.setVisibility(8);
        } else {
            textView.setVisibility(8);
            mMGridView.setVisibility(0);
        }
        Button button = (Button) view.findViewById(C0966R.C0970id.f357579al0);
        button.setVisibility(this.f116804P);
        button.setOnClickListener((View.OnClickListener) null);
    }

    public AppPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116801L = null;
        this.f116802M = null;
        this.f116803N = 0;
        this.f116805Q = false;
        this.f116806R = 0;
        this.f116799J = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0966R.C0967a.f2313b);
        this.f116804P = obtainStyledAttributes.getInt(0, 8);
        this.f116805Q = obtainStyledAttributes.getBoolean(1, false);
        this.f116806R = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
    }
}
