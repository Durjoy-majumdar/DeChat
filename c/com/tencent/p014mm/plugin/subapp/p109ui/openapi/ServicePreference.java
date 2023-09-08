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
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import zw2.C53828f;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference */
public class ServicePreference extends Preference {

    /* renamed from: J */
    public Context f116826J;

    /* renamed from: K */
    public C53828f f116827K;

    /* renamed from: L */
    public List<C44561j> f116828L;

    /* renamed from: M */
    public AdapterView.OnItemClickListener f116829M;

    /* renamed from: N */
    public int f116830N;

    /* renamed from: P */
    public boolean f116831P;

    /* renamed from: Q */
    public int f116832Q;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference$a */
    public class C43180a implements AdapterView.OnItemClickListener {
        public C43180a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener;
            ArrayList arrayList = new ArrayList();
            AdapterView<?> adapterView2 = adapterView;
            arrayList.add(adapterView);
            View view2 = view;
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/openapi/ServicePreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (ServicePreference.this.f116827K.mo74446a(i)) {
                C53828f fVar = ServicePreference.this.f116827K;
                fVar.f151050e = false;
                fVar.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServicePreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            ServicePreference servicePreference = ServicePreference.this;
            if (!servicePreference.f116827K.f151050e && (onItemClickListener = servicePreference.f116829M) != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServicePreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference$b */
    public class C43181b implements AdapterView.OnItemLongClickListener {
        public C43181b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C53828f fVar = ServicePreference.this.f116827K;
            if (fVar != null) {
                fVar.f151050e = !fVar.f151050e;
                fVar.notifyDataSetChanged();
            }
            return true;
        }
    }

    public ServicePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        MMGridView mMGridView = (MMGridView) view.findViewById(C0966R.C0970id.eqy);
        if (mMGridView != null) {
            this.f116827K = new C53828f(this.f116826J, this.f116828L);
            C72709y1.yx0().remove(this.f116827K);
            C72709y1.yx0().add(this.f116827K);
            mMGridView.setAdapter(this.f116827K);
            mMGridView.setOnItemClickListener(new C43180a());
            if (this.f116831P) {
                mMGridView.setOnItemLongClickListener(new C43181b());
            }
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.cjf);
            if (this.f116827K.getCount() == 0) {
                textView.setVisibility(0);
                textView.setText(this.f116832Q);
                mMGridView.setVisibility(8);
            } else {
                textView.setVisibility(8);
                mMGridView.setVisibility(0);
            }
            Button button = (Button) view.findViewById(C0966R.C0970id.f357579al0);
            button.setVisibility(this.f116830N);
            button.setOnClickListener((View.OnClickListener) null);
        }
    }

    public ServicePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116829M = null;
        this.f116831P = false;
        this.f116832Q = 0;
        this.f116826J = context;
        this.f121271G = C0966R.C0971layout.f6499gh;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0966R.C0967a.f2313b);
        this.f116830N = obtainStyledAttributes.getInt(0, 8);
        this.f116831P = obtainStyledAttributes.getBoolean(1, false);
        this.f116832Q = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
    }
}
