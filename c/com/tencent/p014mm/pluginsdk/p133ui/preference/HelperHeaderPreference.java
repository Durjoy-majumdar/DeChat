package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C7018q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kg3.C76577a;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference */
public class HelperHeaderPreference extends Preference {

    /* renamed from: J */
    public C6678b f24028J = new C6678b();

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference$a */
    public class C6677a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ View f24029d;

        public C6677a(View view) {
            this.f24029d = view;
        }

        public boolean onPreDraw() {
            this.f24029d.getViewTreeObserver().removeOnPreDrawListener(this);
            int[] iArr = new int[2];
            this.f24029d.getLocationOnScreen(iArr);
            int i = iArr[1];
            int b = C76577a.m92151b(HelperHeaderPreference.this.f121274d, 60);
            int f = C75044y4.m89994f(HelperHeaderPreference.this.f121274d);
            int a = C75044y4.m89989a(HelperHeaderPreference.this.f121274d);
            Log.m105925i("MicroMsg.HelperHeaderPreference", "actionBarHeight=%s ,statusBarHeight=%s , rootTop:%s", Integer.valueOf(a), Integer.valueOf(f), Integer.valueOf(i));
            if (f > 0 && a > 0) {
                b = a + C76577a.m92155f(HelperHeaderPreference.this.f121274d, C0966R.dimen.f3736cp);
            }
            if (i == 0) {
                b += f;
            }
            if (b == this.f24029d.getPaddingTop()) {
                return true;
            }
            View view = this.f24029d;
            view.setPadding(view.getPaddingLeft(), b, this.f24029d.getPaddingRight(), this.f24029d.getPaddingBottom());
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference$b */
    public static class C6678b {

        /* renamed from: a */
        public String f24031a;

        /* renamed from: b */
        public String f24032b;

        /* renamed from: c */
        public String f24033c;

        /* renamed from: d */
        public int f24034d;
    }

    public HelperHeaderPreference(Context context) {
        super(context);
    }

    /* renamed from: I */
    public void mo7600I(String str, String str2, String str3) {
        C6678b bVar = this.f24028J;
        bVar.f24032b = str;
        bVar.f24031a = str2;
        bVar.f24033c = str3;
        Preference.C6763a aVar = this.f121275e;
        if (aVar != null) {
            aVar.mo7744a(this, (Object) null);
        }
    }

    /* renamed from: J */
    public void mo7601J(int i) {
        this.f24028J.f24034d = i;
        Preference.C6763a aVar = this.f121275e;
        if (aVar != null) {
            aVar.mo7744a(this, (Object) null);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.a27);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.k1g);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.hg4);
        TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.ewc);
        View findViewById = view.findViewById(C0966R.C0970id.i6w);
        ((TextView) view.findViewById(C0966R.C0970id.f357997cy2)).setText(C0966R.string.csk);
        if (imageView != null) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, this.f24028J.f24032b);
        }
        if (textView != null) {
            int i = this.f24028J.f24034d;
            if (i == 0) {
                textView.setVisibility(0);
                textView.setTextColor(C7018q1.m7263a(this.f121274d));
                textView.setText(C0966R.string.f361322ix1);
            } else if (i == 1) {
                textView.setVisibility(0);
                textView.setTextColor(C7018q1.m7264b(this.f121274d));
                textView.setText(C0966R.string.iwu);
            } else if (i == 2) {
                textView.setVisibility(8);
            }
        }
        if (textView2 != null) {
            textView2.setText(this.f24028J.f24031a);
        }
        if (textView3 != null) {
            textView3.setText(this.f24028J.f24033c);
        }
        super.mo1086w(view);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new C6677a(findViewById));
    }

    public HelperHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HelperHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
