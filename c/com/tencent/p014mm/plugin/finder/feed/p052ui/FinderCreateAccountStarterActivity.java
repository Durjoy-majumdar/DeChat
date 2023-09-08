package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderCreateAccountResultEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import kotlin.Metadata;
import vf1.C14798n;
import vf1.C14804o;
import vf1.C14808p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderCreateAccountStarterActivity;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCreateAccountStarterActivity */
public final class FinderCreateAccountStarterActivity extends MMFinderUI {

    /* renamed from: o */
    public String f14260o = "";

    /* renamed from: p */
    public String f14261p = "";

    /* renamed from: q */
    public String f14262q = "";

    /* renamed from: r */
    public String f14263r = "";

    /* renamed from: s */
    public int f14264s = 15;

    /* renamed from: t */
    public C4191v0 f14265t;

    /* renamed from: u */
    public boolean f14266u;

    /* renamed from: N7 */
    public static final void m2730N7(FinderCreateAccountStarterActivity finderCreateAccountStarterActivity, int i) {
        finderCreateAccountStarterActivity.getClass();
        Log.m105924i("OccupyFinderUI24", "sendEvent :" + i);
        finderCreateAccountStarterActivity.f14266u = true;
        FinderCreateAccountResultEvent finderCreateAccountResultEvent = new FinderCreateAccountResultEvent();
        finderCreateAccountResultEvent.f9191d.f9192a = i;
        finderCreateAccountResultEvent.publish();
    }

    /* renamed from: O7 */
    public final void mo2966O7(Context context, C104289g gVar) {
        Log.m105924i("OccupyFinderUI24", "showCreateContactDialog");
        if (gVar != null) {
            C104289g m = gVar.optJSONObject("tipsWording");
            if (m == null) {
                String optString = gVar.optString("tipsWording");
                if (!Util.isNullOrNil(optString)) {
                    m = new C104289g(optString);
                }
            }
            if (m != null) {
                String optString2 = m.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                C87412m.m108593f(optString2, "optString(\"title\")");
                this.f14260o = optString2;
                String optString3 = m.optString("tip");
                C87412m.m108593f(optString3, "optString(\"tip\")");
                this.f14261p = optString3;
                String optString4 = m.optString("cancelWording");
                C87412m.m108593f(optString4, "optString(\"cancelWording\")");
                this.f14262q = optString4;
                String optString5 = m.optString("confirmWording");
                C87412m.m108593f(optString5, "optString(\"confirmWording\")");
                this.f14263r = optString5;
            }
            this.f14264s = gVar.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        }
        boolean z = true;
        if (this.f14261p.length() == 0) {
            String string = context.getResources().getString(C0966R.string.d4y);
            C87412m.m108593f(string, "context.resources.getStr…ount_dialog_default_tips)");
            this.f14261p = string;
        }
        if (this.f14262q.length() == 0) {
            String string2 = context.getResources().getString(C0966R.string.d4w);
            C87412m.m108593f(string2, "context.resources.getStr…te_account_dialog_cancel)");
            this.f14262q = string2;
        }
        if (this.f14263r.length() == 0) {
            String string3 = context.getResources().getString(C0966R.string.d4x);
            C87412m.m108593f(string3, "context.resources.getStr…e_account_dialog_confirm)");
            this.f14263r = string3;
        }
        C4191v0 v0Var = this.f14265t;
        if (v0Var == null) {
            C4191v0 v0Var2 = new C4191v0(context);
            this.f14265t = v0Var2;
            v0Var2.mo5070e(C0966R.C0971layout.ad9);
            TextView textView = (TextView) v0Var2.f18463f.findViewById(C0966R.C0970id.d64);
            if (textView != null) {
                if (this.f14260o.length() <= 0) {
                    z = false;
                }
                if (z) {
                    textView.setText(this.f14260o);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            TextView textView2 = (TextView) v0Var2.f18463f.findViewById(C0966R.C0970id.d5y);
            if (textView2 != null) {
                textView2.setText(this.f14261p);
                C85875k4.m106189j0(textView2.getPaint(), 0.8f);
            }
            TextView textView3 = (TextView) v0Var2.f18463f.findViewById(C0966R.C0970id.da4);
            if (textView3 != null) {
                textView3.setText(this.f14262q);
                C85875k4.m106189j0(textView3.getPaint(), 0.8f);
                textView3.setOnClickListener(new C14798n(v0Var2));
            }
            TextView textView4 = (TextView) v0Var2.f18463f.findViewById(C0966R.C0970id.da5);
            if (textView4 != null) {
                textView4.setText(this.f14263r);
                C85875k4.m106189j0(textView4.getPaint(), 0.8f);
            }
            if (textView4 != null) {
                textView4.setOnClickListener(new C14804o(this, context, v0Var2));
            }
            v0Var2.f18472r = new C14808p(this);
            C4191v0 v0Var3 = this.f14265t;
            if (v0Var3 != null) {
                v0Var3.mo5073h();
            }
        } else if (!v0Var.mo5069d()) {
            v0Var.mo5073h();
        }
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bow;
    }

    public void initActivityCloseAnimation() {
    }

    public boolean isSupportNavigationSwipeBack() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        String stringExtra = getIntent().getStringExtra("param_extra_info");
        mo2966O7(this, (stringExtra == null || Util.isNullOrNil(stringExtra)) ? null : new C104289g(stringExtra));
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (C85875k4.m106211z()) {
            setTheme(C0966R.style.f8629pa);
        } else {
            setTheme(C0966R.style.f8630pb);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = getIntent().getStringExtra("param_extra_info");
        mo2966O7(this, (stringExtra == null || Util.isNullOrNil(stringExtra)) ? null : new C104289g(stringExtra));
    }
}
