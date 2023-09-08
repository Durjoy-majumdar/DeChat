package io1;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ye1.C15972e0;

/* renamed from: io1.a */
public final class C9228a {

    /* renamed from: a */
    public final ViewGroup f28966a;

    /* renamed from: b */
    public final C13601g f28967b = C36568h.m40985a(new C9230b(this));

    /* renamed from: c */
    public final int[] f28968c = {0, 0};

    /* renamed from: io1.a$a */
    public static final class C9229a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9228a f28969d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f28970e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f28971f;

        public C9229a(C9228a aVar, C8479f0<String> f0Var, C8479f0<String> f0Var2) {
            this.f28969d = aVar;
            this.f28970e = f0Var;
            this.f28971f = f0Var2;
        }

        public final void run() {
            C9228a aVar = this.f28969d;
            aVar.getClass();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Context context = aVar.f28966a.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            Log.m105924i(FinderBottomCustomDialogHelper.UserInfoHelper.TAG, "screen width :" + displayMetrics.widthPixels);
            int h = displayMetrics.widthPixels - C76577a.m92157h(aVar.f28966a.getContext(), C0966R.dimen.a6b);
            C9228a aVar2 = this.f28969d;
            int i = 0;
            if (aVar2.f28968c[0] == 0) {
                i = 0 + aVar2.mo10020c().f42933n0.getWidth() + C76577a.m92155f(aVar2.f28966a.getContext(), C0966R.dimen.f3766df);
            }
            if (aVar2.f28968c[1] == 0) {
                i += aVar2.mo10020c().f42883D.getWidth() + C76577a.m92155f(aVar2.f28966a.getContext(), C0966R.dimen.f3736cp);
            }
            int i2 = h - i;
            C9228a aVar3 = this.f28969d;
            String str = (String) this.f28970e.f27484d;
            float f = 0.0f;
            if (aVar3.mo10020c().f42943u.getVisibility() == 0) {
                f = 0.0f + ((float) C76577a.m92155f(aVar3.f28966a.getContext(), C0966R.dimen.f3738cr));
            }
            if (this.f28969d.mo10020c().f42895P.getPaint().measureText((String) this.f28970e.f27484d) + f > ((float) i2)) {
                C9228a.m8877a(this.f28969d, (String) this.f28970e.f27484d, h - C76577a.m92155f(this.f28969d.f28966a.getContext(), C0966R.dimen.f3736cp), (int) f);
            } else {
                C9228a.m8877a(this.f28969d, (String) this.f28970e.f27484d, i2, (int) f);
            }
            C9228a aVar4 = this.f28969d;
            aVar4.mo10020c().f42935o0.setMaxWidth(h - C76577a.m92155f(aVar4.f28966a.getContext(), C0966R.dimen.f3738cr));
            aVar4.mo10020c().f42935o0.setText((String) this.f28971f.f27484d);
        }
    }

    /* renamed from: io1.a$b */
    public static final class C9230b extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ C9228a f28972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9230b(C9228a aVar) {
            super(0);
            this.f28972d = aVar;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f28972d.f28966a);
        }
    }

    public C9228a(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "header");
        this.f28966a = viewGroup;
    }

    /* renamed from: a */
    public static final void m8877a(C9228a aVar, String str, int i, int i2) {
        int i3 = i - i2;
        if (aVar.mo10020c().f42946x.getVisibility() == 0) {
            i3 = i - C76577a.m92157h(aVar.f28966a.getContext(), C0966R.dimen.f3755d6);
        }
        aVar.mo10020c().f42895P.setMaxWidth(i3);
        aVar.mo10020c().f42895P.setText(str);
        aVar.mo10020c().f42930m.setMaxWidth(i3);
    }

    /* renamed from: b */
    public final void mo10019b(SpannableString spannableString, String str, boolean z) {
        C87412m.m108594g(str, "lltext");
        if (spannableString != null && !Util.isNullOrNil(spannableString.toString())) {
            C8479f0 f0Var = new C8479f0();
            T spannableString2 = spannableString.toString();
            C87412m.m108593f(spannableString2, "spannableStr.toString()");
            f0Var.f27484d = spannableString2;
            C8479f0 f0Var2 = new C8479f0();
            f0Var2.f27484d = str;
            if (((String) f0Var.f27484d) != null) {
                this.f28966a.post(new C9229a(this, f0Var, f0Var2));
            }
        }
    }

    /* renamed from: c */
    public final C15972e0 mo10020c() {
        return (C15972e0) ((C36570n) this.f28967b).getValue();
    }
}
