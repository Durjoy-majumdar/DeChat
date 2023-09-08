package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderGamePostEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import er1.C58782w0;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import sx3.C22415w0;
import xk1.C15716b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveFinishUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveFinishUI */
public final class FinderGameLiveFinishUI extends MMFinderUI {

    /* renamed from: o */
    public boolean f14408o = true;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveFinishUI$a */
    public static final class C2929a implements Runnable {

        /* renamed from: d */
        public static final C2929a f14409d = new C2929a();

        public final void run() {
            FinderGamePostEvent finderGamePostEvent = new FinderGamePostEvent();
            finderGamePostEvent.f154773d.f154774a = true;
            finderGamePostEvent.publish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.acl;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C15716b.class);
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        C58782w0.f168290a.mo83842a(findViewById(C0966R.C0970id.ekh));
    }

    public void onResume() {
        super.onResume();
        if (this.f14408o) {
            boolean booleanExtra = getIntent().getBooleanExtra("SUCC", false);
            String stringExtra = getIntent().getStringExtra("TITLE");
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            String stringExtra2 = getIntent().getStringExtra("DESC");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
            boolean booleanExtra2 = getIntent().getBooleanExtra("IS_MINI_GAME", false);
            C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C15716b.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…ameFinishUIC::class.java)");
            C15716b bVar = (C15716b) a;
            bVar.mo14439e3(booleanExtra, stringExtra, str);
            bVar.mo14440f3();
            if (!booleanExtra) {
                View findViewById = bVar.mo14437c3().findViewById(C0966R.C0970id.e9u);
                C87412m.m108593f(findViewById, "root.findViewById(R.id.finish_desc_tv)");
                C58782w0 w0Var = C58782w0.f168290a;
                AppCompatActivity context = getContext();
                C87412m.m108593f(context, "context");
                ((TextView) findViewById).setText(w0Var.mo83848g(context, C0966R.string.le6, booleanExtra2));
            }
            getContentView().postDelayed(C2929a.f14409d, 500);
            this.f14408o = false;
        }
    }
}
