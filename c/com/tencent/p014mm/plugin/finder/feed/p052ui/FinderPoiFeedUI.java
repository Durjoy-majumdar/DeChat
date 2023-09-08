package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.MenuItem;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C98522w3;
import java.util.HashSet;
import kf1.C9827k6;
import kf1.C9840l6;
import kotlin.Metadata;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.m74;
import wc1.C15101o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI */
public final class FinderPoiFeedUI extends MMFinderUI {

    /* renamed from: t */
    public static final /* synthetic */ int f14655t = 0;

    /* renamed from: o */
    public final C13601g f14656o = C36568h.m40985a(new C3008d(this));

    /* renamed from: p */
    public final C13601g f14657p = C36568h.m40985a(new C3009e(this));

    /* renamed from: q */
    public final C13601g f14658q = C36568h.m40985a(new C3006b(this));

    /* renamed from: r */
    public long f14659r;

    /* renamed from: s */
    public String f14660s;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$a */
    public enum C3005a {
        ACTION_ENTER_POI_FEED_UI,
        ACTION_GO_TO_MAP,
        ACTION_CLICK_PHONE,
        ACTION_SHARE_TO_CHAT,
        ACTION_LEAVE_POI_FEED_UI,
        ACTION_SHARE_TO_TIMELINE
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$b */
    public static final class C3006b extends C87413o implements C32224a<FinderPoiFeedLoader> {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiFeedUI f14668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3006b(FinderPoiFeedUI finderPoiFeedUI) {
            super(0);
            this.f14668d = finderPoiFeedUI;
        }

        public Object invoke() {
            return new FinderPoiFeedLoader(((C13442s8) C39818r.f106831a.mo62444c(this.f14668d).mo75002a(C13442s8.class)).mo12861q3());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$c */
    public static final class C3007c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiFeedUI f14669d;

        public C3007c(FinderPoiFeedUI finderPoiFeedUI) {
            this.f14669d = finderPoiFeedUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderPoiFeedUI finderPoiFeedUI = this.f14669d;
            int i = FinderPoiFeedUI.f14655t;
            finderPoiFeedUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$d */
    public static final class C3008d extends C87413o implements C32224a<C9827k6> {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiFeedUI f14670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3008d(FinderPoiFeedUI finderPoiFeedUI) {
            super(0);
            this.f14670d = finderPoiFeedUI;
        }

        public Object invoke() {
            FinderPoiFeedUI finderPoiFeedUI = this.f14670d;
            return new C9827k6(finderPoiFeedUI, 2, finderPoiFeedUI.mo2194I7(), this.f14670d.mo3075N7());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$e */
    public static final class C3009e extends C87413o implements C32224a<C9840l6> {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiFeedUI f14671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3009e(FinderPoiFeedUI finderPoiFeedUI) {
            super(0);
            this.f14671d = finderPoiFeedUI;
        }

        public Object invoke() {
            FinderPoiFeedUI finderPoiFeedUI = this.f14671d;
            return new C9840l6(finderPoiFeedUI, 2, finderPoiFeedUI.mo2194I7(), false, 8, (C8480h) null);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        Intent intent = getIntent();
        C98522w3.C8810a aVar = null;
        Object serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        if (serializableExtra instanceof C98522w3.C8810a) {
            aVar = (C98522w3.C8810a) serializableExtra;
        }
        return aVar == C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS ? 81 : 26;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    /* renamed from: N7 */
    public final FinderPoiFeedLoader mo3075N7() {
        return (FinderPoiFeedLoader) ((C36570n) this.f14658q).getValue();
    }

    /* renamed from: O7 */
    public final C9827k6 mo3076O7() {
        return (C9827k6) ((C36570n) this.f14656o).getValue();
    }

    /* renamed from: P7 */
    public final String mo3077P7() {
        String str = this.f14660s;
        return str == null ? C75592q0.m90789s() : str;
    }

    /* renamed from: Q7 */
    public final C9840l6 mo3078Q7() {
        return (C9840l6) ((C36570n) this.f14657p).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359775an2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$c r6 = new com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI$c
            r6.<init>(r5)
            r5.setBackBtn(r6)
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2131099650(0x7f060002, float:1.781166E38)
            int r6 = r6.getColor(r0)
            r5.setActionbarColor(r6)
            java.lang.String r6 = ""
            r5.setMMTitle((java.lang.String) r6)
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r0 = r5.mo3075N7()
            te3.m74 r1 = new te3.m74
            r1.<init>()
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r3 = "key_location"
            byte[] r2 = r2.getByteArrayExtra(r3)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0037
        L_0x0035:
            r1 = r4
            goto L_0x0048
        L_0x0037:
            r1.parseFrom(r2)     // Catch:{ Exception -> 0x003b }
            goto L_0x0048
        L_0x003b:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r1
            java.lang.String r1 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r6, r2)
            goto L_0x0035
        L_0x0048:
            r0.f13766e = r1
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo3075N7()
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "key_from_type"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            boolean r1 = r0 instanceof ht1.C98522w3.C8810a
            if (r1 == 0) goto L_0x005f
            r4 = r0
            ht1.w3$a r4 = (ht1.C98522w3.C8810a) r4
        L_0x005f:
            r6.f13768g = r4
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "key_from_scene"
            boolean r6 = r6.hasExtra(r0)
            if (r6 == 0) goto L_0x007f
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r6 = r5.mo3075N7()
            android.content.Intent r1 = r5.getIntent()
            int r0 = r1.getIntExtra(r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.f13769h = r0
        L_0x007f:
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "key_sns_feed_id"
            java.lang.String r6 = r6.getStringExtra(r0)
            r5.f14660s = r6
            kf1.l6 r6 = r5.mo3078Q7()
            kf1.k6 r0 = r5.mo3076O7()
            r6.mo10355Y0(r0)
            kf1.k6 r6 = r5.mo3076O7()
            kf1.l6 r0 = r5.mo3078Q7()
            r6.mo2525t(r0)
            java.lang.Class<l31.e> r6 = l31.C61212e.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            l31.e r6 = (l31.C61212e) r6
            o31.b r0 = o31.C11345b.FinderPoiFeedUI
            l31.e r6 = r6.mo86178qr(r5, r0)
            o31.a r0 = o31.C76986a.Finder
            r6.mo86179qs(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        mo3076O7().onDetach();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        mo3076O7().mo2526x();
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        C3005a aVar = C3005a.ACTION_LEAVE_POI_FEED_UI;
        long j = mo3078Q7().f30413y;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this);
        String str = null;
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        m74 m74 = mo3075N7().f13766e;
        if (m74 != null) {
            str = m74.f184224i;
        }
        y0Var.Cy0(aVar, j, q3, str, mo3078Q7().f30414z, mo3077P7(), C31543z5.m39453c() - this.f14659r);
    }

    public void onResume() {
        super.onResume();
        this.f14659r = C31543z5.m39453c();
        mo3076O7().mo2514G();
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var = (C58417y0) c;
        C3005a aVar = C3005a.ACTION_ENTER_POI_FEED_UI;
        long j = mo3078Q7().f30413y;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        m74 m74 = mo3075N7().f13766e;
        C58417y0.Dy0(y0Var, aVar, j, q3, m74 != null ? m74.f184224i : null, mo3078Q7().f30414z, mo3077P7(), 0, 64, (Object) null);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C15101o.class);
    }
}
