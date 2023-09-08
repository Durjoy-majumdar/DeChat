package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import ky2.C10432i;
import l31.C61212e;
import lc3.C10485b;
import o31.C11345b;
import o31.C76986a;
import org.json.JSONObject;
import rs1.C13442s8;
import ts1.C14080d;
import up1.C37521f;
import vf1.C14748d5;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI */
public final class FinderTeenModeLimitUI extends MMFinderUI {

    /* renamed from: q */
    public static final /* synthetic */ int f14832q = 0;

    /* renamed from: o */
    public View f14833o;

    /* renamed from: p */
    public boolean f14834p;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI$a */
    public static final class C3057a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTeenModeLimitUI f14835d;

        public C3057a(FinderTeenModeLimitUI finderTeenModeLimitUI) {
            this.f14835d = finderTeenModeLimitUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderTeenModeLimitUI finderTeenModeLimitUI = this.f14835d;
            int i = FinderTeenModeLimitUI.f14832q;
            finderTeenModeLimitUI.getClass();
            Log.m105924i("FinderHotWordTimelineUI", "exitFinder");
            finderTeenModeLimitUI.setResult(11112);
            if (!finderTeenModeLimitUI.isFinishing() && !finderTeenModeLimitUI.isDestroyed()) {
                finderTeenModeLimitUI.finish();
            }
            finderTeenModeLimitUI.mo3113N7("teenagemode_timelock_exit", 0, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI$b */
    public static final class C3058b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTeenModeLimitUI f14836d;

        public C3058b(FinderTeenModeLimitUI finderTeenModeLimitUI) {
            this.f14836d = finderTeenModeLimitUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderTeenModeLimitUI finderTeenModeLimitUI = this.f14836d;
            int i = FinderTeenModeLimitUI.f14832q;
            finderTeenModeLimitUI.getClass();
            Log.m105924i("FinderHotWordTimelineUI", "doVerifyPassword");
            ((C10432i) C86312j.m106911c(C10432i.class)).Wg0(finderTeenModeLimitUI, 12222);
            finderTeenModeLimitUI.mo3113N7("teenagemode_timelock_pwdvalidation", 0, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeLimitUI$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 127;
    }

    /* renamed from: N7 */
    public final void mo3113N7(String str, int i, boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (this.f14834p) {
            jSONObject.put("limit_type", "1");
        } else {
            jSONObject.put("limit_type", "2");
        }
        if (z) {
            jSONObject.put("valid_result", i);
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C13442s8 f = aVar.mo12873f(context);
        y0Var.Cx0(1, str, n, f != null ? f.mo12861q3() : null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aq7;
    }

    public void initView() {
        String str;
        View findViewById = findViewById(C0966R.C0970id.cmv);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C3057a(this));
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.knn);
        if (textView != null) {
            if (this.f14834p) {
                C14080d dVar = C14080d.f39488a;
                str = textView.getResources().getString(C0966R.string.ern, new Object[]{Integer.valueOf(dVar.mo13495b()), Integer.valueOf(dVar.mo13494a())});
            } else {
                C37521f.f99374d.getClass();
                str = textView.getResources().getString(C0966R.string.ero, new Object[]{Integer.valueOf((C37521f.f99434j6.mo60266n().intValue() == 1 ? 10 : ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderAntiAddictInterval", 2400)) / 60)});
            }
            textView.setText(str);
        }
        View findViewById2 = findViewById(C0966R.C0970id.fl8);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C3058b(this));
        }
        View findViewById3 = findViewById(C0966R.C0970id.fl9);
        C87412m.m108593f(findViewById3, "findViewById(R.id.layout_teen_limit_action_two)");
        this.f14833o = findViewById3;
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C14748d5(this, (C15601d<? super C14748d5>) null), 3, (Object) null);
    }

    public boolean isSupportNavigationSwipeBack() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 12222) {
            return;
        }
        if (i2 == -1) {
            ((FinderTeenModeLimitVM) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderTeenModeLimitVM.class)).mo5193e3(this.f14834p);
            setResult(-1);
            if (!isFinishing() && !isDestroyed()) {
                finish();
            }
            mo3113N7("teenagemode_timelock_pwdvalidation_result", 1, true);
        } else if (i2 == 0) {
            mo3113N7("teenagemode_timelock_pwdvalidation_result", 0, true);
        }
    }

    public void onBackPressed() {
        setResult(11112);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        getController().mo177059O0(this, getResources().getColor(C0966R.color.al6));
        this.f14834p = getIntent().getBooleanExtra("key_is_curfew", false);
        JSONObject jSONObject = new JSONObject();
        if (this.f14834p) {
            jSONObject.put("limit_type", "1");
        } else {
            jSONObject.put("limit_type", "2");
        }
        getIntent().putExtra("key_udf_kv", jSONObject.toString());
        ((FinderTeenModeLimitVM) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderTeenModeLimitVM.class)).f18821g = false;
        initView();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderTeenModeLimitUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        ((FinderTeenModeLimitVM) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderTeenModeLimitVM.class)).f18821g = true;
    }
}
