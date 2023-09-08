package com.tencent.p014mm.plugin.sns.p106ui.improve;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveEventUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86737h0;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.Set;
import kg3.C76577a;
import kotlin.Metadata;
import m31.C117521b;
import nj3.C88989a;
import rt2.C63677a;
import sx3.C110826x0;
import ut2.C102087b;
import ut2.C102088c;
import ut2.C102101q;
import ut2.C102105s;
import ut2.C102106t;
import ut2.C102107v;
import ut2.C52616u;
import vo3.C90852c;
import vt2.C102279c;
import yt2.C53578f;

@C117521b(scene = 1)
@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/ImproveSnsTimelineUI;", "Lcom/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI */
public final class ImproveSnsTimelineUI extends ImproveSnsJankUI {
    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        return C0966R.C0971layout.d_9;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        Set<Class<? extends UIComponent>> e = C110826x0.m151017e(C102087b.class, C102105s.class, C102279c.class, ImproveMainUIC.class, C53578f.class, ImproveHeaderUIC.class, ImproveInputUIC.class, C102107v.class, C102101q.class, ImproveUnreadUIC.class, C102106t.class, C102088c.class, C52616u.class, C63677a.class, ImproveEventUIC.class);
        SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        return e;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        Log.m105924i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onCreate");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("setupStatusBarTransparent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.ahf));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        SnsMethodCalculate.markEndTimeMs("setupStatusBarTransparent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        SnsMethodCalculate.markStartTimeMs("bugfix", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        SnsMethodCalculate.markStartTimeMs("fixSoftInputBug", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        boolean z = false;
        if (defaultPreference != null) {
            z = defaultPreference.getBoolean("Main_need_read_top_margin", false);
        }
        C74779i.m89536a(this, z);
        SnsMethodCalculate.markEndTimeMs("fixSoftInputBug", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        SnsMethodCalculate.markStartTimeMs("fixToolBarLayoutBug", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.f358454of3);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int p = C85875k4.m106200p(this);
        layoutParams2.topMargin = p;
        viewGroup.setLayoutParams(layoutParams2);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C0966R.C0970id.kqs);
        ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = p - C76577a.m92157h(getContext(), C0966R.dimen.aop);
        Log.m105924i("MicroMsg.Improve.SnsTimelineUI", "fixToolBarLayoutBug: content topMargin:" + layoutParams2.topMargin + ", toolbar topMargin:" + layoutParams4.topMargin);
        viewGroup2.setLayoutParams(layoutParams4);
        SnsMethodCalculate.markEndTimeMs("fixToolBarLayoutBug", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        SnsMethodCalculate.markEndTimeMs("bugfix", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.onDestroy();
        Log.m105924i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onDestroy");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    public void onNewIntent(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        Log.m105924i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onNewIntent");
        super.onNewIntent(intent);
        if (intent == null) {
            SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("key_finder_bundle_info");
        if (bundleExtra != null) {
            Intent intent2 = new Intent();
            String string = bundleExtra.getString("key_context_id");
            long j = bundleExtra.getLong("key_finder_post_local_id");
            intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", true);
            intent2.putExtra("key_finder_post_local_id", j);
            intent2.putExtra("KEY_POST_DIRECTLY_FROM_SNS", true);
            if (!Util.isNullOrNil(string)) {
                intent2.putExtra("key_context_id", string);
            }
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Hm0(context, intent2);
            finish();
        }
        SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.onPause();
        Log.m105924i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onPause");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        super.onResume();
        Log.m105924i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onResume");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        Log.m105924i("MicroMsg.Improve.SnsTimelineUI", "hash:" + hashCode() + " onStop");
        super.onStop();
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
    }
}
