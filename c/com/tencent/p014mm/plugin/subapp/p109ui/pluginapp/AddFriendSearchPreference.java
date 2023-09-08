package com.tencent.p014mm.plugin.subapp.p109ui.pluginapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference */
public class AddFriendSearchPreference extends Preference {

    /* renamed from: J */
    public Context f21324J;

    /* renamed from: K */
    public String f21325K;

    /* renamed from: L */
    public View.OnClickListener f21326L;

    /* renamed from: M */
    public TextView f21327M;

    /* renamed from: N */
    public View f21328N;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference$a */
    public class C5503a implements View.OnTouchListener {
        public C5503a(AddFriendSearchPreference addFriendSearchPreference) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendSearchPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendSearchPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference$b */
    public class C5504b implements View.OnClickListener {
        public C5504b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendSearchPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AddFriendSearchPreference.this.f21326L.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddFriendSearchPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public AddFriendSearchPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        view.setOnTouchListener(new C5503a(this));
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.jcd);
        this.f21327M = textView;
        textView.setText(this.f21325K);
        this.f21327M.setContentDescription(this.f21325K);
        View findViewById = view.findViewById(C0966R.C0970id.j69);
        this.f21328N = findViewById;
        if (this.f21326L != null) {
            findViewById.setOnClickListener(new C5504b());
        }
        mo69921C(8);
    }

    public AddFriendSearchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddFriendSearchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21325K = "";
        this.f21326L = null;
        this.f21327M = null;
        this.f21328N = null;
        this.f21324J = context;
        this.f121271G = C0966R.C0971layout.bdb;
    }
}
