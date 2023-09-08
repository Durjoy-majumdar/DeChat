package il1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58777u0;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: il1.k */
public final class C60444k {

    /* renamed from: a */
    public final MMActivity f172333a;

    /* renamed from: b */
    public final ViewGroup f172334b;

    /* renamed from: c */
    public final String f172335c;

    /* renamed from: d */
    public final int f172336d;

    /* renamed from: e */
    public final C32227p<String, Boolean, C13598b0> f172337e;

    /* renamed from: f */
    public final String f172338f = "Finder.FinderGameLivePostStickerWidget";

    /* renamed from: g */
    public final TextView f172339g;

    /* renamed from: h */
    public boolean f172340h;

    /* renamed from: il1.k$a */
    public static final class C60445a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60444k f172341d;

        /* renamed from: e */
        public final /* synthetic */ String f172342e;

        public C60445a(C60444k kVar, String str) {
            this.f172341d = kVar;
            this.f172342e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderGameLivePostStickerWidget$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58777u0 u0Var = C58777u0.f168283a;
            u0Var.mo83835d(10, "{\"gameappid\":\"" + this.f172341d.f172335c + "\"}");
            String str = this.f172342e;
            if (str == null || str.length() == 0) {
                String str2 = this.f172341d.f172338f;
                Log.m105924i(str2, "url empty:" + this.f172342e);
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f172342e);
                C88144b.m109791i(this.f172341d.f172333a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                this.f172341d.f172340h = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderGameLivePostStickerWidget$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60444k(MMActivity mMActivity, ViewGroup viewGroup, String str, int i, C32227p<? super String, ? super Boolean, C13598b0> pVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "stickerLayout");
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(pVar, "refreshCallback");
        this.f172333a = mMActivity;
        this.f172334b = viewGroup;
        this.f172335c = str;
        this.f172336d = i;
        this.f172337e = pVar;
        this.f172339g = (TextView) viewGroup.findViewById(C0966R.C0970id.eo5);
    }

    /* renamed from: a */
    public final void mo85411a(String str, boolean z) {
        this.f172337e.invoke(str, Boolean.valueOf(z));
        TextView textView = this.f172339g;
        if (textView != null) {
            textView.setText(this.f172333a.getResources().getText(z ? C0966R.string.dak : C0966R.string.daj));
        }
        this.f172334b.setOnClickListener(new C60445a(this, str));
    }
}
