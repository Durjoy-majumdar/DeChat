package com.tencent.p014mm.plugin.finder.feed.p052ui;

import al1.C54129i;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import kr0.C76630x0;
import nj3.C88990b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveMiniProProxyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveMiniProProxyUI */
public class FinderLiveMiniProProxyUI extends MMFinderUI {

    /* renamed from: o */
    public final String f159009o = "FinderLive.MiniProProxyUI";

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveMiniProProxyUI$a */
    public static final class C29951a implements C88990b.C61771c {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveMiniProProxyUI f81106a;

        public C29951a(FinderLiveMiniProProxyUI finderLiveMiniProProxyUI) {
            this.f81106a = finderLiveMiniProProxyUI;
        }

        public final void onComplete(boolean z) {
            String str = this.f81106a.f159009o;
            Log.m105924i(str, "convertActivityToTranslucent complete:" + z);
        }
    }

    /* renamed from: N7 */
    public final void mo77433N7() {
        Intent intent = getIntent();
        Integer num = null;
        boolean z = false;
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("ACTIVITY_PURPOSE", 0)) : null;
        String str = this.f159009o;
        Log.m105924i(str, "[checkIntentState] purpose = " + valueOf);
        if (valueOf != null && valueOf.intValue() == 1) {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                num = Integer.valueOf(intent2.getIntExtra("LUANCH_KEY", 0));
            }
            HashMap<Integer, C86299o> hashMap = C54129i.f151984l;
            C86299o oVar = (C86299o) C24564k0.m30739c(C54129i.f151984l).remove(num);
            String str2 = this.f159009o;
            StringBuilder sb = new StringBuilder();
            sb.append("[LUANCH_MINI_PROGRAM] key = ");
            sb.append(num);
            sb.append(",bundle is null:");
            if (oVar == null) {
                z = true;
            }
            sb.append(z);
            Log.m105924i(str2, sb.toString());
            if (oVar != null) {
                String str3 = this.f159009o;
                Log.m105924i(str3, "launchMiniProgram appid:" + oVar.f250930b + ", path:" + oVar.f250934f);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this, oVar);
                return;
            }
            finish();
        } else if (valueOf != null && valueOf.intValue() == 2) {
            finish();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            moveTaskToBack(true);
            finish();
        } else {
            finish();
        }
    }

    public boolean enableActivityAnimation() {
        Intent intent = getIntent();
        boolean z = true;
        if (intent == null || intent.getIntExtra("ACTIVITY_PURPOSE", 0) != 1) {
            z = false;
        }
        if (z) {
            return false;
        }
        return super.enableActivityAnimation();
    }

    public void finish() {
        Log.m105924i(this.f159009o, "finish");
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aiq;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        String str = this.f159009o;
        Log.m105924i(str, "onConfigurationChanged orientation:" + Integer.valueOf(configuration.orientation));
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i(this.f159009o, "onCreate");
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        C88990b.m111194c(this, new C29951a(this));
    }

    public void onDestroy() {
        Log.m105924i(this.f159009o, "onDestroy");
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i(this.f159009o, "onNewIntent");
        super.onNewIntent(intent);
        mo77433N7();
    }

    public void onPause() {
        Log.m105924i(this.f159009o, "onPause");
        super.onPause();
    }

    public void onResume() {
        Log.m105924i(this.f159009o, "onResume");
        super.onResume();
        mo77433N7();
    }

    public void onStart() {
        Log.m105924i(this.f159009o, "onStart");
        super.onStart();
    }

    public void onStop() {
        Log.m105924i(this.f159009o, "onStop");
        super.onStop();
    }
}
