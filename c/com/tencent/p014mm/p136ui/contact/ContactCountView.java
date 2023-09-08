package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.ContactCountView */
public class ContactCountView extends FrameLayout {

    /* renamed from: d */
    public View f24372d;

    /* renamed from: e */
    public TextView f24373e;

    /* renamed from: f */
    public boolean f24374f = false;

    /* renamed from: g */
    public int f24375g = 0;

    /* renamed from: h */
    public boolean f24376h = true;

    /* renamed from: i */
    public int f24377i = 1;

    /* renamed from: com.tencent.mm.ui.contact.ContactCountView$a */
    public class C6817a implements Runnable {

        /* renamed from: com.tencent.mm.ui.contact.ContactCountView$a$a */
        public class C6818a implements Runnable {
            public C6818a() {
            }

            public void run() {
                ContactCountView contactCountView = ContactCountView.this;
                TextView textView = contactCountView.f24373e;
                if (textView != null) {
                    if (contactCountView.f24377i == 1) {
                        Resources resources = contactCountView.getContext().getResources();
                        int i = ContactCountView.this.f24375g;
                        textView.setText(resources.getQuantityString(C0966R.plurals.f7221b, i, new Object[]{Integer.valueOf(i)}));
                    } else {
                        Resources resources2 = contactCountView.getContext().getResources();
                        int i2 = ContactCountView.this.f24375g;
                        textView.setText(resources2.getQuantityString(C0966R.plurals.f7220a, i2, new Object[]{Integer.valueOf(i2)}));
                    }
                }
                ContactCountView contactCountView2 = ContactCountView.this;
                contactCountView2.setVisible(contactCountView2.f24376h);
            }
        }

        public C6817a() {
        }

        public void run() {
            ContactCountView contactCountView = ContactCountView.this;
            if (!contactCountView.f24374f) {
                String[] strArr = C45628s0.f123409o;
                if (contactCountView.f24377i == 1) {
                    contactCountView.f24375g = C97625j3.m125812b().mo105907v().mo69711l3(strArr, C75592q0.m90789s(), "weixin", "helper_entry", "filehelper");
                } else {
                    contactCountView.f24375g = C97625j3.m125812b().mo105907v().mo69729x3(strArr, C75592q0.m90789s(), "weixin", "helper_entry", "filehelper");
                }
            }
            Log.m105919d("MicroMsg.ContactCountView", "contact count %d", Integer.valueOf(ContactCountView.this.f24375g));
            ContactCountView.this.post(new C6818a());
        }
    }

    public ContactCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C0966R.C0971layout.f7050w7, this);
    }

    /* renamed from: a */
    public void mo7802a() {
        ((C119157j) C119157j.f356862d).mo183875f(new C6817a());
    }

    public void onMeasure(int i, int i2) {
        Log.m105918d("MicroMsg.ContactCountView", "onMeasure");
        if (this.f24372d == null) {
            this.f24372d = (FrameLayout) findViewById(C0966R.C0970id.bmn);
            this.f24373e = (TextView) findViewById(C0966R.C0970id.bmm);
        }
        mo7802a();
        super.onMeasure(i, i2);
    }

    public void setContactType(int i) {
        this.f24377i = i;
    }

    public void setFixedContactCount(int i) {
        this.f24374f = true;
        this.f24375g = i;
        mo7802a();
    }

    public void setVisible(boolean z) {
        this.f24376h = z;
        View view = this.f24372d;
        if (view != null) {
            int i = (!z || this.f24375g <= 0) ? 8 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactCountView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ContactCountView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public ContactCountView(Context context) {
        super(context);
        View.inflate(getContext(), C0966R.C0971layout.f7050w7, this);
    }
}
