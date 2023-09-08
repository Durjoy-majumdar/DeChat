package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import bb3.C92238l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import wa3.C102368h;
import xa3.C102602r;
import xd3.C78802b;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.q */
public class C96740q extends C78802b {

    /* renamed from: h */
    public TextView f283383h = null;

    /* renamed from: i */
    public View f283384i;

    /* renamed from: j */
    public View f283385j;

    public C96740q(Context context) {
        super(context);
        View view = this.f230569f;
        if (view != null) {
            this.f283383h = (TextView) view.findViewById(C0966R.C0970id.lp4);
            this.f283385j = this.f230569f.findViewById(C0966R.C0970id.lp5);
            this.f283384i = this.f230569f.findViewById(C0966R.C0970id.a7i);
            TextView textView = this.f283383h;
            textView.setTextSize(0, (float) C76577a.m92157h(textView.getContext(), C0966R.dimen.f3881hq));
            this.f230569f.setOnClickListener(new C96739p(this));
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.cik;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        try {
            if (C92238l.m115958b().mo126233a() != null) {
                long currentTimeMillis = System.currentTimeMillis();
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WENOTE_KEEP_TOP_DATA_LAST_REPORT_TIME_LONG_SYNC;
                if (currentTimeMillis - ((Long) u.mo119685f(aVar, 0L)).longValue() > 86400000) {
                    C115669n.INSTANCE.mo160131h(18728, 1);
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Long.valueOf(currentTimeMillis));
                }
            }
        } catch (Throwable unused) {
        }
        C102602r a = C92238l.m115958b().mo126233a();
        boolean z = this.f230567d;
        if (z && this.f230568e) {
            this.f283385j.setBackgroundResource(C0966R.C0969drawable.axp);
            this.f283383h.setBackground((Drawable) null);
        } else if (z) {
            this.f283384i.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f283385j.setBackgroundResource(C0966R.C0969drawable.c4w);
            this.f283383h.setBackgroundResource(C0966R.C0969drawable.bcr);
        } else if (this.f230568e) {
            this.f283384i.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f283385j.setBackgroundResource(C0966R.C0969drawable.bcr);
            this.f283383h.setBackground((Drawable) null);
        } else {
            this.f283384i.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f283385j.setBackground((Drawable) null);
            this.f283383h.setBackgroundResource(C0966R.C0969drawable.bcr);
        }
        if ((a != null && a.f302105d && a.f302107f > 0 && !Util.isNullOrNil(a.f302110i)) || !(a == null || a.f302105d || C102368h.m135070a(a.f302106e) == null)) {
            String str = a.f302109h;
            TextView textView = this.f283383h;
            if (textView != null) {
                textView.setText(str);
            }
            mo7975g(0);
            return true;
        }
        if (a != null) {
            C92238l.m115958b().mo126234c((C102602r) null);
        }
        mo7975g(8);
        return false;
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        View view = this.f230569f;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.lp5);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
