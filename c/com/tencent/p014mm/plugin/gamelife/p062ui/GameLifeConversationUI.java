package com.tencent.p014mm.plugin.gamelife.p062ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bz1.C0394d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GameLifeSessionStruct;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cz1.C7143c;
import di3.C86312j;
import dz1.C45500c;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hz1.C46161a;
import j20.C117292a;
import jz1.C46595b;
import jz1.C46605i;
import jz1.C46614p;
import jz1.C46615q;
import jz1.C46628v;
import jz1.C9545s;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import o40.C61926c;
import p192l4.C10462b;
import p739wi.C78597c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sw1.C48478n;
import xy1.C15912f;
import xy1.C15913g;
import yj3.C79123a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI;", "Lcom/tencent/mm/plugin/gamelife/ui/GameLifeChattingCompatUI;", "Ljz1/v;", "<init>", "()V", "plugin-gamelife_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI */
public class GameLifeConversationUI extends GameLifeChattingCompatUI implements C46628v {

    /* renamed from: o */
    public static final /* synthetic */ int f114695o = 0;

    /* renamed from: e */
    public final C46595b f114696e;

    /* renamed from: f */
    public final C46615q f114697f;

    /* renamed from: g */
    public final C13601g f114698g = C36568h.m40985a(new C42401d(this));

    /* renamed from: h */
    public boolean f114699h = true;

    /* renamed from: i */
    public GameLifeLoadingCoverView f114700i;

    /* renamed from: j */
    public GameLifeEmptyCoverView f114701j;

    /* renamed from: n */
    public final C13601g f114702n = C36568h.m40985a(new C42400b(this));

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$a */
    public static final class C4573a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GameLifeConversationUI f19329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4573a(GameLifeConversationUI gameLifeConversationUI) {
            super(0);
            this.f19329d = gameLifeConversationUI;
        }

        public Object invoke() {
            GameLifeLoadingCoverView gameLifeLoadingCoverView = this.f19329d.f114700i;
            if (gameLifeLoadingCoverView != null) {
                gameLifeLoadingCoverView.setVisibility(8);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("loadingCoverView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$c */
    public static final class C4574c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GameLifeConversationUI f19330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4574c(GameLifeConversationUI gameLifeConversationUI) {
            super(0);
            this.f19330d = gameLifeConversationUI;
        }

        public Object invoke() {
            GameLifeLoadingCoverView gameLifeLoadingCoverView = this.f19330d.f114700i;
            if (gameLifeLoadingCoverView != null) {
                View view = gameLifeLoadingCoverView.f19331d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = gameLifeLoadingCoverView.f19332e;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/gamelife/ui/GameLifeLoadingCoverView", "loadFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return C13598b0.f38549a;
            }
            C87412m.m108603p("loadingCoverView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$b */
    public static final class C42400b extends C87413o implements C32224a<C45500c> {

        /* renamed from: d */
        public final /* synthetic */ GameLifeConversationUI f114703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42400b(GameLifeConversationUI gameLifeConversationUI) {
            super(0);
            this.f114703d = gameLifeConversationUI;
        }

        public Object invoke() {
            View findViewById = this.f114703d.findViewById(C0966R.C0970id.f357785br0);
            TouchableLayout touchableLayout = (TouchableLayout) findViewById;
            int i = C0966R.C0970id.btd;
            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.btd);
            if (frameLayout != null) {
                i = C0966R.C0970id.btj;
                RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.btj);
                if (recyclerView != null) {
                    i = C0966R.C0970id.ivb;
                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                    if (refreshLoadMoreLayout != null) {
                        return new C45500c(touchableLayout, touchableLayout, frameLayout, recyclerView, refreshLoadMoreLayout);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$d */
    public static final class C42401d extends C87413o implements C32224a<LinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ GameLifeConversationUI f114704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42401d(GameLifeConversationUI gameLifeConversationUI) {
            super(0);
            this.f114704d = gameLifeConversationUI;
        }

        public Object invoke() {
            return new LinearLayoutManager(this.f114704d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$e */
    public static final class C42402e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GameLifeConversationUI f114705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42402e(GameLifeConversationUI gameLifeConversationUI) {
            super(0);
            this.f114705d = gameLifeConversationUI;
        }

        public Object invoke() {
            View findViewById;
            GameLifeConversationUI gameLifeConversationUI = this.f114705d;
            int i = GameLifeConversationUI.f114695o;
            View loadMoreFooter = gameLifeConversationUI.mo66481H7().f123160d.getLoadMoreFooter();
            View findViewById2 = loadMoreFooter != null ? loadMoreFooter.findViewById(C0966R.C0970id.g2z) : null;
            if (findViewById2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById2, aVar.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View loadMoreFooter2 = this.f114705d.mo66481H7().f123160d.getLoadMoreFooter();
            if (!(loadMoreFooter2 == null || (findViewById = loadMoreFooter2.findViewById(C0966R.C0970id.g3_)) == null)) {
                GameLifeConversationUI gameLifeConversationUI2 = this.f114705d;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI$loadMoreFailed$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setOnClickListener(new C42406a(gameLifeConversationUI2));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$f */
    public static final class C42403f extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ GameLifeConversationUI f114706a;

        public C42403f(GameLifeConversationUI gameLifeConversationUI) {
            this.f114706a = gameLifeConversationUI;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            this.f114706a.f114697f.mo71897b();
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            GameLifeConversationUI gameLifeConversationUI = this.f114706a;
            int i = GameLifeConversationUI.f114695o;
            gameLifeConversationUI.mo66481H7().f123160d.setEnableLoadMore(this.f114706a.f114699h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$g */
    public static final class C42404g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GameLifeConversationUI f114707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42404g(GameLifeConversationUI gameLifeConversationUI) {
            super(0);
            this.f114707d = gameLifeConversationUI;
        }

        public Object invoke() {
            this.f114707d.f114697f.mo71896a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI$h */
    public static final class C42405h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GameLifeConversationUI f114708d;

        /* renamed from: e */
        public final /* synthetic */ boolean f114709e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42405h(GameLifeConversationUI gameLifeConversationUI, boolean z) {
            super(0);
            this.f114708d = gameLifeConversationUI;
            this.f114709e = z;
        }

        public Object invoke() {
            GameLifeEmptyCoverView gameLifeEmptyCoverView = this.f114708d.f114701j;
            if (gameLifeEmptyCoverView != null) {
                gameLifeEmptyCoverView.setVisibility(this.f114709e ? 0 : 8);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("emptyCoverView");
            throw null;
        }
    }

    public GameLifeConversationUI() {
        C46595b bVar = new C46595b();
        this.f114696e = bVar;
        this.f114697f = new C46615q(this, bVar);
    }

    /* renamed from: D2 */
    public void mo66478D2(boolean z) {
        this.f114699h = false;
        if (z) {
            mo66481H7().f123160d.setEnableLoadMore(false);
        }
    }

    /* renamed from: D5 */
    public void mo66479D5() {
        C61926c.m72668M(new C4574c(this));
    }

    /* renamed from: H6 */
    public boolean mo66480H6() {
        C78597c cVar = this.f198376d;
        if (cVar != null) {
            return ((C79123a) cVar).f232357n;
        }
        return true;
    }

    /* renamed from: H7 */
    public final C45500c mo66481H7() {
        return (C45500c) ((C36570n) this.f114702n).getValue();
    }

    /* renamed from: L4 */
    public void mo66482L4(int i) {
        mo66481H7().f123160d.mo82440F(i);
    }

    /* renamed from: M4 */
    public void mo66483M4(String str, String str2, String str3) {
        Class cls = C15913g.class;
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "selfUsername");
        C87412m.m108594g(str3, "talker");
        Intent intent = new Intent();
        intent.putExtra("Chat_Self", str2);
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        C88144b.m109801s(getContext(), ".ui.chatting.ChattingUI", intent, (Bundle) null);
        ((C15913g) C86312j.m106911c(cls)).mo438Tx(str3);
        ((C15913g) C86312j.m106911c(cls)).mo438Tx(str2);
    }

    /* renamed from: N5 */
    public void mo66484N5() {
        C61926c.m72668M(new C4573a(this));
    }

    /* renamed from: O2 */
    public void mo66485O2() {
        C61926c.m72668M(new C42402e(this));
    }

    /* renamed from: P3 */
    public C13604l<Integer, Integer> mo66486P3() {
        Integer valueOf = Integer.valueOf(((LinearLayoutManager) ((C36570n) this.f114698g).getValue()).mo16957C());
        Integer valueOf2 = Integer.valueOf(((LinearLayoutManager) ((C36570n) this.f114698g).getValue()).mo16959E());
        C13604l<Integer, Integer> lVar = new C13604l<>(valueOf, valueOf2);
        Log.m105918d("GameLife.ConversationUI", "range " + valueOf.intValue() + " - " + valueOf2.intValue());
        return lVar;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ay9;
    }

    /* renamed from: h */
    public void mo66487h(boolean z) {
        C61926c.m72668M(new C42405h(this, z));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.n3x);
        RecyclerView recyclerView = mo66481H7().f123159c;
        recyclerView.setLayoutManager((LinearLayoutManager) ((C36570n) this.f114698g).getValue());
        recyclerView.setAdapter(this.f114696e);
        recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        mo66481H7().f123160d.setActionCallback(new C42403f(this));
        GameLifeLoadingCoverView gameLifeLoadingCoverView = new GameLifeLoadingCoverView(this, (AttributeSet) null, 0, 6, (C8480h) null);
        gameLifeLoadingCoverView.setOnClickListener(new C42404g(this));
        this.f114700i = gameLifeLoadingCoverView;
        GameLifeEmptyCoverView gameLifeEmptyCoverView = new GameLifeEmptyCoverView(this, (AttributeSet) null, 0, 6, (C8480h) null);
        gameLifeEmptyCoverView.setVisibility(8);
        this.f114701j = gameLifeEmptyCoverView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = mo66481H7().f123158b;
        GameLifeEmptyCoverView gameLifeEmptyCoverView2 = this.f114701j;
        if (gameLifeEmptyCoverView2 != null) {
            frameLayout.addView(gameLifeEmptyCoverView2, layoutParams);
            C46161a.f124440a = (long) getIntent().getIntExtra("game_report_from_scene", 0);
            C46615q qVar = this.f114697f;
            C46595b bVar = qVar.f125549b;
            bVar.f125501d.f125544b = qVar.f125553f;
            bVar.f125501d.f125545c = new C46605i(C9545s.f29740d);
            qVar.f125551d.mo70729i(qVar.f125554g);
            ((C15913g) C86312j.m106911c(C15913g.class)).mo442i(qVar.f125555h);
            qVar.mo71896a();
            return;
        }
        C87412m.m108603p("emptyCoverView");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C46615q qVar = this.f114697f;
        qVar.f125548a = null;
        qVar.f125551d.mo70728g(qVar.f125554g);
        ((C15913g) C86312j.m106911c(C15913g.class)).mo441g(qVar.f125555h);
    }

    public void onFinish() {
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            C46161a.f124440a = (long) intent.getIntExtra("game_report_from_scene", 0);
        }
    }

    public void onResume() {
        int intValue;
        int intValue2;
        super.onResume();
        C46615q qVar = this.f114697f;
        qVar.getClass();
        long j = C46161a.f124440a;
        GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
        gameLifeSessionStruct.f107922d = 2;
        gameLifeSessionStruct.f107923e = 0;
        gameLifeSessionStruct.f107924f = 0;
        gameLifeSessionStruct.f107925g = 1;
        gameLifeSessionStruct.f107926h = j;
        gameLifeSessionStruct.mo86054n();
        GameLifeSessionStruct gameLifeSessionStruct2 = new GameLifeSessionStruct();
        gameLifeSessionStruct2.f107922d = 2;
        gameLifeSessionStruct2.f107923e = 201;
        gameLifeSessionStruct2.f107924f = 0;
        gameLifeSessionStruct2.f107925g = 1;
        gameLifeSessionStruct2.f107926h = j;
        gameLifeSessionStruct2.mo86054n();
        boolean z = false;
        if (qVar.f125550c) {
            qVar.f125550c = false;
            return;
        }
        C46161a.f124440a = 301;
        Log.m105924i("GameLife.ConversationPresenter", "checkHistoryConversation");
        ((C48478n) C86312j.m106911c(C48478n.class)).mo65694tC(new C46614p(qVar));
        C46595b bVar = qVar.f125549b;
        bVar.f125502e.getClass();
        bVar.f125503f.getClass();
        C46628v vVar = qVar.f125548a;
        if (vVar != null && vVar.mo66480H6()) {
            z = true;
        }
        if (z) {
            C46628v vVar2 = qVar.f125548a;
            C13604l<Integer, Integer> P3 = vVar2 != null ? vVar2.mo66486P3() : null;
            if (P3 != null && (intValue = ((Number) P3.f38555d).intValue()) <= (intValue2 = ((Number) P3.f38556e).intValue())) {
                while (true) {
                    C7143c item = qVar.f125549b.getItem(intValue);
                    if (!item.mo8334m2()) {
                        C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(item.field_selfUserName);
                        if (X3 != null) {
                            int w2 = qVar.f125549b.mo71886w2();
                            String str = item.field_sessionId;
                            C87412m.m108593f(str, "item.field_sessionId");
                            long D0 = (long) X3.mo422D0();
                            String str2 = item.field_selfUserName;
                            String str3 = str2;
                            C87412m.m108593f(str2, "item.field_selfUserName");
                            C0394d dVar = item.f25115F;
                            C87412m.m108591d(dVar);
                            long j2 = (long) dVar.field_accountType;
                            String str4 = item.field_talker;
                            C87412m.m108593f(str4, "item.field_talker");
                            C40306c.C40307a.m43452g(C40306c.f108374a, intValue + 1, 1, w2, str, D0, str3, j2, str4, item.mo8333l2(), C46161a.f124440a, (String) null, 1024, (Object) null);
                        }
                    } else {
                        int w25 = qVar.f125549b.mo71886w2();
                        String str5 = item.field_sessionId;
                        C87412m.m108593f(str5, "item.field_sessionId");
                        C40306c.C40307a.m43452g(C40306c.f108374a, intValue + 1, 1, w25, str5, 0, "", 0, "", item.mo8333l2(), C46161a.f124440a, (String) null, 1024, (Object) null);
                    }
                    if (intValue != intValue2) {
                        intValue++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
