package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main;

import android.content.Context;
import android.content.Intent;
import cn1.C0807a1;
import cn1.C0810b0;
import cn1.C0814c;
import cn1.C0821e;
import cn1.C0827e1;
import cn1.C0843i0;
import cn1.C0859p;
import cn1.C0870s0;
import cn1.C0885y;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58684b;
import er1.C7865r3;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import jq3.C60896i;
import kotlin.Metadata;
import ns3.C11266d;
import rm1.C13087a;
import rx3.C13598b0;
import te3.C49712hj1;
import xm1.C15828e;
import xm1.C15829e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0015¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "Landroid/content/Context;", "context", "", "feedId", "", "username", "", "commentScene", "Lrx3/b0;", "jumpProfile", "type", "Ljq3/i;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/MMActivity;", "", "isForceNightMode", "Z", "isLocalCityPage", "I", "Lte3/hj1;", "contextObj", "Lte3/hj1;", "Lxm1/e;", "outsideOperator", "Lxm1/e;", "Lxm1/e0;", "autoPlayChecker", "Lxm1/e0;", "screenWidth", "leftRightMargin", "livingWidth", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ZZILte3/hj1;Lxm1/e;Lxm1/e0;)V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory */
public final class NewEntranceItemConvertFactory extends BaseFactory {
    private final C15829e0 autoPlayChecker;
    /* access modifiers changed from: private */
    public final int commentScene;
    /* access modifiers changed from: private */
    public final MMActivity context;
    private final C49712hj1 contextObj;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    private final int leftRightMargin;
    private final int livingWidth;
    private final C15828e outsideOperator;
    private final int screenWidth;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory$a */
    public static final class C3323a extends C87413o implements C32227p<Long, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NewEntranceItemConvertFactory f15748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3323a(NewEntranceItemConvertFactory newEntranceItemConvertFactory) {
            super(2);
            this.f15748d = newEntranceItemConvertFactory;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "username");
            NewEntranceItemConvertFactory newEntranceItemConvertFactory = this.f15748d;
            newEntranceItemConvertFactory.jumpProfile(newEntranceItemConvertFactory.context, longValue, str, this.f15748d.commentScene);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory$b */
    public static final class C3324b extends C87413o implements C32227p<Long, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NewEntranceItemConvertFactory f15749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3324b(NewEntranceItemConvertFactory newEntranceItemConvertFactory) {
            super(2);
            this.f15749d = newEntranceItemConvertFactory;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "username");
            NewEntranceItemConvertFactory newEntranceItemConvertFactory = this.f15749d;
            newEntranceItemConvertFactory.jumpProfile(newEntranceItemConvertFactory.context, longValue, str, this.f15749d.commentScene);
            return C13598b0.f38549a;
        }
    }

    public NewEntranceItemConvertFactory(MMActivity mMActivity, boolean z, boolean z2, int i, C49712hj1 hj12, C15828e eVar, C15829e0 e0Var) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(eVar, "outsideOperator");
        C87412m.m108594g(e0Var, "autoPlayChecker");
        this.context = mMActivity;
        this.isForceNightMode = z;
        this.isLocalCityPage = z2;
        this.commentScene = i;
        this.contextObj = hj12;
        this.outsideOperator = eVar;
        this.autoPlayChecker = e0Var;
        int c = C7865r3.f26468a.mo8970c();
        this.screenWidth = c;
        int a = C74942w4.m89784a(MMApplicationContext.getContext(), 0);
        this.leftRightMargin = a;
        this.livingWidth = (c - (a * 3)) / 2;
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
        if (i == -5000) {
            return new C0843i0(this.outsideOperator);
        }
        switch (i) {
            case 1:
                return new C0859p(this.autoPlayChecker, this.outsideOperator);
            case 2:
                return new C0821e(this.autoPlayChecker, this.outsideOperator);
            case 3:
                return new C0827e1(this.autoPlayChecker, this.outsideOperator, this.contextObj);
            case 4:
                return new C0810b0(true, this.livingWidth, 0.0f, this.outsideOperator, new C3323a(this), 4, (C8480h) null);
            case 5:
                return new C0814c(this.autoPlayChecker, this.outsideOperator);
            case 6:
                return new C0807a1(true, this.livingWidth, 0.0f, this.outsideOperator, new C3324b(this), 4, (C8480h) null);
            case 7:
                return new C0870s0(this.autoPlayChecker, this.outsideOperator);
            case 8:
                return new C0885y(this.autoPlayChecker, this.outsideOperator);
            default:
                return createFinderEmptyConvert();
        }
    }
}
