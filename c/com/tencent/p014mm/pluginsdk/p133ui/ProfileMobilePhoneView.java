package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import qo3.C77407n;
import vd3.C14438u;
import vd3.C14439v;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView */
public class ProfileMobilePhoneView extends ProfileItemView {

    /* renamed from: o */
    public static final /* synthetic */ int f24013o = 0;

    /* renamed from: e */
    public String f24014e;

    /* renamed from: f */
    public String f24015f;

    /* renamed from: g */
    public String[] f24016g;

    /* renamed from: h */
    public Context f24017h;

    /* renamed from: i */
    public TextView f24018i;

    /* renamed from: j */
    public LinearLayout f24019j;

    /* renamed from: n */
    public View.OnClickListener f24020n;

    /* renamed from: com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView$a */
    public class C6673a implements View.OnClickListener {
        public C6673a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProfileMobilePhoneView profileMobilePhoneView = ProfileMobilePhoneView.this;
            String charSequence = ((TextView) view).getText().toString();
            int i = ProfileMobilePhoneView.f24013o;
            C77407n nVar = new C77407n(profileMobilePhoneView.getContext(), false, 1);
            nVar.f225771i = new C14438u(profileMobilePhoneView);
            nVar.f225782p = new C14439v(profileMobilePhoneView, charSequence);
            nVar.mo107573q();
            ProfileMobilePhoneView.this.f24020n.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public ProfileMobilePhoneView(Context context, View.OnClickListener onClickListener) {
        super(context, (AttributeSet) null);
        this.f24020n = onClickListener;
        this.f24017h = context;
    }

    /* renamed from: a */
    public void mo5918a() {
        this.f24018i = (TextView) findViewById(C0966R.C0970id.huy);
        this.f24019j = (LinearLayout) findViewById(C0966R.C0970id.hux);
        for (int i = 0; i < 5; i++) {
            this.f24019j.getChildAt(i).setOnClickListener(new C6673a());
        }
    }

    /* renamed from: b */
    public boolean mo7594b() {
        int i;
        int i2;
        TextView textView = this.f24018i;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(getContext(), C0966R.dimen.f3815f9);
            this.f24018i.setLayoutParams(layoutParams);
        }
        if (this.f24019j == null) {
            return false;
        }
        if (Util.isNullOrNil(this.f24014e) || !Util.isPhoneNumber(this.f24014e).booleanValue()) {
            String str = this.f24014e;
            if (str != null && !Util.isPhoneNumber(str).booleanValue()) {
                Log.m105921e("MicroMsg.ProfileMobilePhoneView", "mobile format is error----%s", this.f24014e);
            }
            i2 = 0;
            i = 0;
        } else {
            View childAt = this.f24019j.getChildAt(0);
            if (childAt != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(childAt, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((TextView) childAt).setText(this.f24014e);
            }
            i2 = 1;
            i = 1;
        }
        if (!Util.isNullOrNil(this.f24015f)) {
            String[] d = C1233a.m1357d(this.f24012d, this.f24015f);
            this.f24016g = d;
            if (d != null) {
                setVisibility(0);
                while (i2 < this.f24016g.length + i) {
                    View childAt2 = this.f24019j.getChildAt(i2);
                    if (childAt2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        C117292a.m165358d(childAt2, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(childAt2, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ((TextView) childAt2).setText(this.f24016g[i2 - i]);
                    }
                    i2++;
                }
            }
        }
        while (i2 < 5) {
            View childAt3 = this.f24019j.getChildAt(i2);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view = childAt3;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i2++;
        }
        if (i != 1 && Util.isNullOrNil(this.f24015f)) {
            setVisibility(8);
        }
        return false;
    }

    public int getLayout() {
        return C0966R.C0971layout.bok;
    }

    public ProfileMobilePhoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileMobilePhoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24017h = context;
    }
}
