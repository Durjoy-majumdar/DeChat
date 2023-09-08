package com.tencent.p014mm.pluginsdk.p133ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.applet.ContactListCustomPreference */
public class ContactListCustomPreference extends Preference {

    /* renamed from: J */
    public int f24022J = -1;

    /* renamed from: K */
    public final View.OnTouchListener f24023K = new C6674a(this);

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.ContactListCustomPreference$a */
    public class C6674a implements View.OnTouchListener {
        public C6674a(ContactListCustomPreference contactListCustomPreference) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ContactListCustomPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/applet/ContactListCustomPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    public ContactListCustomPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121271G = C0966R.C0971layout.bd9;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        int i = this.f24022J;
        if (i >= 0) {
            view.setBackgroundResource(i);
        }
    }

    public ContactListCustomPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bd9;
    }
}
