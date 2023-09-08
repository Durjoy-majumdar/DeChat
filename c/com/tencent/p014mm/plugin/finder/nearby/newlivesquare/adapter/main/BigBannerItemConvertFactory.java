package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main;

import android.content.Context;
import android.content.Intent;
import cn1.C0810b0;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58684b;
import er1.C7865r3;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import jq3.C60896i;
import kotlin.Metadata;
import ns3.C11266d;
import rm1.C13087a;
import rx3.C13598b0;
import xm1.C15828e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\b8BX\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BigBannerItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "Landroid/content/Context;", "context", "", "feedId", "", "username", "", "commentScene", "Lrx3/b0;", "jumpProfile", "type", "Ljq3/i;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/MMActivity;", "", "isForceNightMode", "Z", "isLocalCityPage", "I", "Lxm1/e;", "outsideOperator", "Lxm1/e;", "screenWidth", "getScreenWidth", "()I", "leftRightMargin", "livingWidth", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ZZILxm1/e;)V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BigBannerItemConvertFactory */
public final class BigBannerItemConvertFactory extends BaseFactory {
    /* access modifiers changed from: private */
    public final int commentScene;
    /* access modifiers changed from: private */
    public final MMActivity context;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    private final int leftRightMargin;
    private final int livingWidth;
    private final C15828e outsideOperator;
    private final int screenWidth = C7865r3.f26468a.mo8970c();

    /* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BigBannerItemConvertFactory$a */
    public static final class C3322a extends C87413o implements C32227p<Long, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BigBannerItemConvertFactory f15747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3322a(BigBannerItemConvertFactory bigBannerItemConvertFactory) {
            super(2);
            this.f15747d = bigBannerItemConvertFactory;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "username");
            BigBannerItemConvertFactory bigBannerItemConvertFactory = this.f15747d;
            bigBannerItemConvertFactory.jumpProfile(bigBannerItemConvertFactory.context, longValue, str, this.f15747d.commentScene);
            return C13598b0.f38549a;
        }
    }

    public BigBannerItemConvertFactory(MMActivity mMActivity, boolean z, boolean z2, int i, C15828e eVar) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(eVar, "outsideOperator");
        this.context = mMActivity;
        this.isForceNightMode = z;
        this.isLocalCityPage = z2;
        this.commentScene = i;
        this.outsideOperator = eVar;
        int a = C74942w4.m89784a(MMApplicationContext.getContext(), 0);
        this.leftRightMargin = a;
        this.livingWidth = getScreenWidth() - (a * 2);
    }

    private final int getScreenWidth() {
        if (!C85875k4.m106157N()) {
            return this.screenWidth;
        }
        Context context2 = MMApplicationContext.getContext();
        return C74942w4.m89784a(context2, context2.getResources().getConfiguration().screenWidthDp);
    }

    /* access modifiers changed from: private */
    public final void jumpProfile(Context context2, long j, String str, int i) {
        Class cls = C11266d.class;
        Intent intent = new Intent();
        intent.putExtra("key_click_tab_context_id", ((C11266d) C86312j.m106911c(cls)).mo9187Uy().mo10844b());
        intent.putExtra("finder_username", str);
        intent.putExtra("key_from_comment_scene", i);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(((C11266d) C86312j.m106911c(cls)).mo9187Uy().getContextId(), intent);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
        Log.m105924i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
        C13087a.f37257d = "page_profile";
    }

    public C60896i<?> getItemConvert(int i) {
        return i == 2 ? new C0810b0(true, this.livingWidth, 1.0f, this.outsideOperator, new C3322a(this)) : createFinderEmptyConvert();
    }
}
