package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58358d0;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60204t3;
import ht1.C8809w2;
import java.util.Set;
import jq3.C60905o;
import ke3.C88144b;
import kj2.C117407d;
import kotlin.Metadata;
import o40.C61926c;
import os1.C11739f;
import p182kk.C61104a;
import p50.C62193a;
import pf1.C11920q;
import pf1.C62262d0;
import ph1.C62293i;
import rs1.C13194da;
import rs1.C13211e2;
import rs1.C13261h6;
import rs1.C13340n6;
import rs1.C13367pa;
import rs1.C13392r4;
import rs1.C13421r8;
import rs1.C13442s8;
import rs1.C13466ta;
import rs1.C13502w6;
import rs1.C13521w7;
import rs1.C13539y3;
import rs1.C13553ya;
import rs1.C13554z;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63555gb;
import rs1.C63575n3;
import rs1.C63648v;
import rx3.C13598b0;
import sx3.C110826x0;
import tf0.C13887q1;
import ts1.C14078c;
import up1.C37521f;
import vq1.C14967t;
import wc1.C15102p;
import wc1.C15124t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeUI */
public class FinderHomeUI extends MMFinderFeedDetailUI {

    /* renamed from: o */
    public boolean f16895o;

    /* renamed from: p */
    public boolean f16896p;

    /* renamed from: q */
    public boolean f16897q;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeUI$a */
    public static final class C3671a extends C87413o implements C32226l<FinderJumpInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUI f16898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3671a(FinderHomeUI finderHomeUI) {
            super(1);
            this.f16898d = finderHomeUI;
        }

        public Object invoke(Object obj) {
            FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
            C87412m.m108594g(finderJumpInfo, LocaleUtil.ITALIAN);
            C62262d0 d0Var = C62262d0.f176978a;
            AppCompatActivity context = this.f16898d.getContext();
            C87412m.m108593f(context, "context");
            C62262d0.m73168c(d0Var, context, new C11920q(finderJumpInfo), 0, (C60905o) null, 12, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeUI$b */
    public static final class C3672b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUI f16899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3672b(FinderHomeUI finderHomeUI) {
            super(0);
            this.f16899d = finderHomeUI;
        }

        public Object invoke() {
            FinderHomeUI.super.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeUI$c */
    public static final class C3673c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUIC f16900d;

        public C3673c(FinderHomeUIC finderHomeUIC) {
            this.f16900d = finderHomeUIC;
        }

        public final void run() {
            ((C14967t) C86312j.m106911c(C14967t.class)).mo14012JY(this.f16900d.mo5130f3());
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83328dc(((FinderHomeUIC) C39818r.f106831a.mo62444c(this).mo75002a(FinderHomeUIC.class)).mo5128d3());
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 1;
    }

    /* renamed from: O7 */
    public void mo4040O7() {
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("preferred_tab", 2);
        C88144b.m109801s(this, ".ui.LauncherUI", intent, (Bundle) null);
        overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
    }

    /* renamed from: P7 */
    public void mo4041P7() {
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        C88144b.m109801s(this, ".ui.LauncherUI", intent, (Bundle) null);
        overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
    }

    /* renamed from: Q7 */
    public final void mo4054Q7(Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", false) : false;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", booleanExtra);
        }
        if (booleanExtra) {
            C39818r rVar = C39818r.f106831a;
            FinderVideoRecycler finderVideoRecycler = (FinderVideoRecycler) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class);
            finderVideoRecycler.getClass();
            C61926c.m72668M(new C13553ya(finderVideoRecycler));
            C39622i0 a = rVar.mo62444c(this).mo75002a(FinderHomeUIC.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…inderHomeUIC::class.java)");
            Bundle bundle = new Bundle();
            bundle.putInt("Source", 0);
            C13598b0 b0Var = C13598b0.f38549a;
            ((FinderHomeUIC) a).mo5135k3(3, bundle);
        }
    }

    /* renamed from: R7 */
    public final void mo4055R7(Intent intent, boolean z) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB", false) : false;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB", booleanExtra);
        }
        if (booleanExtra) {
            C39818r rVar = C39818r.f106831a;
            FinderVideoRecycler finderVideoRecycler = (FinderVideoRecycler) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class);
            finderVideoRecycler.getClass();
            C61926c.m72668M(new C13553ya(finderVideoRecycler));
            C39622i0 a = rVar.mo62444c(this).mo75002a(FinderHomeUIC.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…inderHomeUIC::class.java)");
            Bundle bundle = new Bundle();
            bundle.putInt("Source", 0);
            C13598b0 b0Var = C13598b0.f38549a;
            ((FinderHomeUIC) a).mo5135k3(1, bundle);
        }
    }

    /* renamed from: S7 */
    public final void mo4056S7(Intent intent) {
        int i = 0;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", false) : false;
        boolean booleanExtra2 = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB_WITH_ANIM", true) : false;
        if (intent != null) {
            i = intent.getIntExtra("Source", 0);
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", booleanExtra);
        }
        if (booleanExtra) {
            C39818r rVar = C39818r.f106831a;
            FinderVideoRecycler finderVideoRecycler = (FinderVideoRecycler) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class);
            finderVideoRecycler.getClass();
            C61926c.m72668M(new C13553ya(finderVideoRecycler));
            C39622i0 a = rVar.mo62444c(this).mo75002a(FinderHomeUIC.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…inderHomeUIC::class.java)");
            Bundle bundle = new Bundle();
            bundle.putInt("Source", i);
            C13598b0 b0Var = C13598b0.f38549a;
            ((FinderHomeUIC) a).mo5136l3(4, booleanExtra2, bundle);
        }
    }

    /* renamed from: T7 */
    public final void mo4057T7(Intent intent) {
        Intent intent2 = intent;
        String stringExtra = intent2 != null ? intent2.getStringExtra("KEY_ROUTE_TO_PAGE") : null;
        boolean booleanExtra = intent2 != null ? intent2.getBooleanExtra("KEY_ROUTE_TO_TOPIC", false) : false;
        Log.m105924i("Finder.HomeUI", "checkRoute " + stringExtra + ' ' + booleanExtra);
        if (C87412m.m108589b(C24560g0.m30725a(FinderSelfUI.class).mo51264h(), stringExtra)) {
            Log.m105924i("Finder.HomeUI", "jumpFinderPersonCenter");
            Intent intent3 = new Intent();
            intent3.putExtra("RED_DOT_EXIST_ON_ENTER", true);
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this, intent3, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).Yx0(this, intent3);
        }
        if (booleanExtra) {
            C62262d0.f176978a.mo87312a(intent2, new C3671a(this));
        }
    }

    /* renamed from: U7 */
    public void mo4042U7(boolean z) {
    }

    public boolean enableLazyInitUIC() {
        C37521f.f99374d.getClass();
        return C37521f.f99398f6.mo60266n().intValue() == 1;
    }

    public void finish() {
        Class cls = C63575n3.class;
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(this).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(this).get…allNormalUIC::class.java)");
        if (!((C63575n3) a).mo88421d3(false)) {
            int intExtra = getIntent().getIntExtra("FROM_SCENE_KEY", 0);
            boolean booleanExtra = getContext().getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false);
            boolean booleanExtra2 = getContext().getIntent().getBooleanExtra("KEY_FROM_SNS_SYNC_POST", false);
            if (intExtra == 5) {
                if (!getContext().getIntent().getBooleanExtra("KEY_PUSH_FAIL_RETURN_READY", false)) {
                    mo4040O7();
                    return;
                }
                String stringExtra = getIntent().getStringExtra("KEY_TASK_ID");
                C115669n.INSTANCE.mo160131h(23669, stringExtra, "fail_return_to", Long.valueOf(System.currentTimeMillis()), "", 1, 1);
                int intExtra2 = getIntent().getIntExtra("KEY_PUSH_RETURN_TO", -1);
                if (intExtra2 == 4) {
                    mo4041P7();
                } else if (intExtra2 == 5) {
                    mo4040O7();
                } else {
                    super.finish();
                    return;
                }
            } else if (booleanExtra || booleanExtra2) {
                mo4042U7(false);
            } else if (getIntent().getBooleanExtra("KEY_FROM_SHARE_REL", false) || intExtra == 4 || this.f16897q) {
                mo4040O7();
            } else if (!((C63575n3) rVar.mo62444c(this).mo75002a(cls)).f180278d && !this.f16895o && intExtra != 6 && this.f16896p) {
                mo4040O7();
            } else if (!this.f16895o) {
                mo4042U7(false);
            }
            C61926c.m72666K(0, new C3672b(this));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359695ad0;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(FinderHomeUIC.class, C13392r4.class, C63545b1.class, C48085q4.class, C13211e2.class, C13340n6.class, MediaPreloadCore.class, C13442s8.class, C13521w7.class, FinderLikeGuideUIC.class, C13466ta.class, C13421r8.class, C13194da.class, C56711j.class, C14078c.class, C13367pa.class, C15124t.class, C63648v.class, C63575n3.class, C0324s.m265a(C24560g0.m30725a(C8809w2.class)), C13502w6.class, C63555gb.class, C13539y3.class, C63513a1.class, C15102p.class, C13554z.class, C13261h6.class);
    }

    public boolean isHideStatusBar() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C117407d.INSTANCE.idkeyStat(1279, 41, 1, false);
        boolean z = false;
        if (getIntent().getBooleanExtra("key_form_sns", false)) {
            Intent intent = new Intent();
            intent.putExtra("key_from_sns_post", true);
            C13598b0 b0Var = C13598b0.f38549a;
            ((C58684b) C86312j.m106911c(C58684b.class)).Yx0(this, intent);
        }
        mo4054Q7(getIntent());
        mo4055R7(getIntent(), false);
        mo4056S7(getIntent());
        mo4057T7(getIntent());
        Intent intent2 = getIntent();
        boolean b = C87412m.m108589b(intent2 != null ? intent2.getStringExtra("KEY_FROM_PATH") : null, "appPush");
        if (((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11600c3(4).f34377j && !b) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this);
            if (f == null || (str = f.f38098n) == null) {
                str = "";
            }
            v0Var.getClass();
            C58413v0.f167347b = str;
        }
        if (b) {
            overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        }
        if (!C37521f.f99374d.mo61188n()) {
            Log.m105924i("Finder.HomeUI", "onCreate: multi task is close, clear all finder task");
            C7335d c = C86312j.m106911c(C60204t3.class);
            C87412m.m108593f(c, "getService(IFinderMultiTaskService::class.java)");
            C60204t3.C8805a.m8622a((C60204t3) c, false, 1, (Object) null);
        }
        getIntent().putExtra("is_report_feed_immediate", true);
        if (getIntent().getLongExtra("key_finder_post_local_id", -1) != -1 && getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", false)) {
            z = true;
        }
        this.f16897q = z;
    }

    public void onDestroy() {
        super.onDestroy();
        if (!C61104a.m71656l((Context) null, false)) {
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13364y6(true, true);
            C62193a.f176816k1.mo87260a();
        }
        C58358d0.f167118d = null;
        C58358d0.f167116b = 0;
        C58358d0.f167117c = 0;
        C58358d0.f167119e = false;
        C58358d0.f167121g = true;
        C62293i.f177081a.mo87361f();
    }

    public void onNewIntent(Intent intent) {
        C13442s8 f;
        super.onNewIntent(intent);
        if ((intent != null && intent.getBooleanExtra("key_need_change_reporter", false)) && (f = C13442s8.f38060Q0.mo12873f(this)) != null) {
            String stringExtra = intent.getStringExtra("key_context_id");
            String str = null;
            if (stringExtra != null) {
                if (!(!(stringExtra.length() == 0))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    f.f38098n = stringExtra;
                    getIntent().putExtra("key_context_id", stringExtra);
                }
            }
            String stringExtra2 = intent.getStringExtra("key_extra_info");
            if (stringExtra2 != null) {
                if (!(stringExtra2.length() == 0)) {
                    str = stringExtra2;
                }
                if (str != null) {
                    f.f38107v = str;
                    getIntent().putExtra("key_extra_info", str);
                }
            }
        }
        mo4054Q7(intent);
        mo4055R7(intent, true);
        mo4056S7(intent);
        mo4057T7(intent);
        if (intent != null) {
            getIntent().putExtra("KEY_POST_DIRECTLY_FROM_SNS", intent.getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false));
            getIntent().putExtra("key_finder_post_local_id", intent.getLongExtra("key_finder_post_local_id", -1));
            getIntent().putExtra("KEY_PUSH_RETURN_TO", intent.getIntExtra("KEY_PUSH_RETURN_TO", -1));
            getIntent().putExtra("KEY_TASK_ID", intent.getStringExtra("KEY_TASK_ID"));
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) C39818r.f106831a.mo62444c(this).mo75002a(FinderHomeUIC.class);
        finderHomeUIC.getRootView().post(new C3673c(finderHomeUIC));
    }

    public void onSwipeBack() {
        this.f16895o = true;
        super.onSwipeBack();
    }
}
