package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import er1.C58777u0;
import er1.C58782w0;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import it1.C60628i;
import j20.C117292a;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kotlin.Metadata;
import ks3.C10408g;
import mk1.C10906h;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import sx3.C110826x0;
import te3.C64284cg;
import tf0.C64916p1;
import up1.C27696y;
import vo3.C90852c;
import wx3.C15601d;
import wx3.C66212f;
import xk1.C15716b;
import xk1.C15726e;
import xk1.C15728e1;
import xk1.C15732f;
import xk1.C15737h;
import xk1.C15738i;
import xk1.C66309g;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveAuthUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "Lob0/n;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI */
public final class FinderGameLiveAuthUI extends FinderGameLiveBaseUI implements C11385n {

    /* renamed from: p */
    public final String f14398p = "Finder.FinderGameLiveAuthUI";

    /* renamed from: q */
    public int f14399q;

    /* renamed from: r */
    public boolean f14400r;

    /* renamed from: s */
    public boolean f14401s;

    /* renamed from: t */
    public boolean f14402t;

    /* renamed from: u */
    public C10906h f14403u;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI$a */
    public static final class C2926a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLiveAuthUI f14404d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2926a(FinderGameLiveAuthUI finderGameLiveAuthUI) {
            super(0);
            this.f14404d = finderGameLiveAuthUI;
        }

        public Object invoke() {
            this.f14404d.mo2988N7();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI$b */
    public static final class C2927b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLiveAuthUI f14405d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2927b(FinderGameLiveAuthUI finderGameLiveAuthUI) {
            super(0);
            this.f14405d = finderGameLiveAuthUI;
        }

        public Object invoke() {
            Class cls = C15728e1.class;
            C39818r rVar = C39818r.f106831a;
            ((C15728e1) rVar.mo62444c(this.f14405d).mo75002a(cls)).mo14456c3();
            FinderGameLiveAuthUI finderGameLiveAuthUI = this.f14405d;
            finderGameLiveAuthUI.f14401s = true;
            AppCompatActivity context = finderGameLiveAuthUI.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            C10906h hVar = new C10906h((MMFragmentActivity) context, 0, 0, 6, (C8480h) null);
            hVar.f32539f = false;
            finderGameLiveAuthUI.f14403u = hVar;
            C39622i0 a = rVar.mo62444c(this.f14405d).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(this).get…eProtocolUIC::class.java)");
            C0317e.launchUI$default((C0317e) a, (C66212f) null, (C53934p0) null, new C3108g(this.f14405d, (C15601d<? super C3108g>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI$c */
    public static final class C2928c extends C87413o implements C32226l<C60628i, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLiveAuthUI f14406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2928c(FinderGameLiveAuthUI finderGameLiveAuthUI) {
            super(1);
            this.f14406d = finderGameLiveAuthUI;
        }

        public Object invoke(Object obj) {
            C60628i iVar = (C60628i) obj;
            C87412m.m108594g(iVar, "prepareScene");
            AppCompatActivity context = this.f14406d.getContext();
            C87412m.m108593f(context, "context");
            iVar.mo85584j1(context, this.f14406d.getResources().getString(C0966R.string.ett), 500);
            return C13598b0.f38549a;
        }
    }

    public FinderGameLiveAuthUI() {
        int i = C10408g.f31631a;
        this.f14399q = 1;
        this.f14402t = true;
    }

    /* renamed from: N7 */
    public final void mo2988N7() {
        Class cls;
        TextView textView;
        String str;
        FinderAuthInfo finderAuthInfo;
        String str2;
        FinderAuthInfo finderAuthInfo2;
        Class cls2 = C15716b.class;
        Class cls3 = C15738i.class;
        Class cls4 = C66309g.class;
        Class cls5 = C15728e1.class;
        String str3 = this.f14398p;
        StringBuilder sb = new StringBuilder();
        sb.append("checkShow, mode:");
        sb.append(this.f14399q);
        sb.append(", account:");
        C58739j4 j4Var = C58739j4.f168176a;
        sb.append(j4Var.mo83679H());
        sb.append(", checkingPost:");
        sb.append(this.f14401s);
        Log.m105924i(str3, sb.toString());
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_PROTOCOL_SHOW_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f).booleanValue();
        if (this.f14399q == 1 && !booleanValue) {
            C39818r rVar = C39818r.f106831a;
            ((C15728e1) rVar.mo62444c(this).mo75002a(cls5)).mo14457d3();
            ((C15728e1) rVar.mo62444c(this).mo75002a(cls5)).f42441o = new C2926a(this);
            ((C66309g) rVar.mo62444c(this).mo75002a(cls4)).mo90427d3();
            ((C15738i) rVar.mo62444c(this).mo75002a(cls3)).mo14463c3();
            ((C15716b) rVar.mo62444c(this).mo75002a(cls2)).mo14438d3();
        } else if (!j4Var.mo83679H()) {
            Class cls6 = cls5;
            Class cls7 = cls2;
            C39818r rVar2 = C39818r.f106831a;
            ((C66309g) rVar2.mo62444c(this).mo75002a(cls4)).mo90427d3();
            C15738i iVar = (C15738i) rVar2.mo62444c(this).mo75002a(cls3);
            C58777u0 u0Var = C58777u0.f168283a;
            if (C58777u0.f168284b == 19) {
                View view = iVar.f42456d;
                if (view == null) {
                    C87412m.m108603p("root");
                    throw null;
                } else if (view.getVisibility() == 8) {
                    u0Var.mo83833b(3);
                }
            }
            View view2 = iVar.f42456d;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((C15716b) rVar2.mo62444c(this).mo75002a(cls7)).mo14438d3();
                ((C15728e1) rVar2.mo62444c(this).mo75002a(cls6)).mo14456c3();
                this.f14400r = true;
                return;
            }
            C87412m.m108603p("root");
            throw null;
        } else if (this.f14399q == 1) {
            C39818r rVar3 = C39818r.f106831a;
            C66309g gVar = (C66309g) rVar3.mo62444c(this).mo75002a(cls4);
            Class cls8 = C11990s0.class;
            Class<C60200t1> cls9 = C60200t1.class;
            View view3 = gVar.f190891e;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ImageView imageView = (ImageView) gVar.findViewById(C0966R.C0970id.f5349cp);
                TextView textView2 = (TextView) gVar.findViewById(C0966R.C0970id.f5360d2);
                ImageView imageView2 = (ImageView) gVar.findViewById(C0966R.C0970id.a0h);
                TextView textView3 = (TextView) gVar.findViewById(C0966R.C0970id.f5353cu);
                View findViewById = gVar.findViewById(C0966R.C0970id.f5361d3);
                View findViewById2 = gVar.findViewById(C0966R.C0970id.f5363d5);
                C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
                C60979d<C100810g0> i2 = ((C11990s0) rVar3.mo62446e(cls9).mo62447c(cls8)).mo11872i2();
                View view5 = findViewById;
                Class cls10 = cls5;
                String str4 = "";
                if (b != null) {
                    cls = cls2;
                    textView = textView3;
                    str = b.getAvatarUrl();
                } else {
                    cls = cls2;
                    textView = textView3;
                    str = str4;
                }
                Class cls11 = cls3;
                C62345f fVar = new C62345f(str, (C27696y) null, 2, (C8480h) null);
                C87412m.m108593f(imageView, "avatarIv");
                i2.mo85957c(fVar, imageView, ((C11990s0) rVar3.mo62446e(cls9).mo62447c(cls8)).mo11867O2(C11978e0.C11979a.AVATAR));
                textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(gVar.getContext(), b != null ? b.getNickname() : str4));
                int i = (b == null || (finderAuthInfo2 = b.field_authInfo) == null) ? 0 : finderAuthInfo2.authIconType;
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C64916p1 p1Var = (C64916p1) c;
                C87412m.m108593f(imageView2, "iconIv");
                View view6 = view5;
                TextView textView4 = textView;
                C64916p1.C64917a.m76444k(p1Var, imageView2, b != null ? b.field_authInfo : null, 0, (C64284cg) null, 12, (Object) null);
                if (i == 1) {
                    imageView2.setVisibility(0);
                    if (!(b == null || (finderAuthInfo = b.field_authInfo) == null || (str2 = finderAuthInfo.authProfession) == null)) {
                        str4 = str2;
                    }
                    textView4.setText(str4);
                } else if (i != 2) {
                    imageView2.setVisibility(8);
                    textView4.setText(str4);
                } else {
                    imageView2.setVisibility(0);
                    textView4.setText(str4);
                }
                CharSequence text = textView4.getText();
                if (text == null || text.length() == 0) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setVisibility(0);
                }
                view6.setOnClickListener(new C15726e(gVar));
                findViewById2.setOnClickListener(new C15732f(gVar));
                ((C15738i) rVar3.mo62444c(this).mo75002a(cls11)).mo14463c3();
                ((C15716b) rVar3.mo62444c(this).mo75002a(cls)).mo14438d3();
                ((C15728e1) rVar3.mo62444c(this).mo75002a(cls10)).mo14456c3();
                return;
            }
            C87412m.m108603p("root");
            throw null;
        } else {
            Class cls12 = cls5;
            Class cls13 = cls2;
            if (!this.f14401s) {
                C39818r rVar4 = C39818r.f106831a;
                ((C15728e1) rVar4.mo62444c(this).mo75002a(cls12)).mo14457d3();
                ((C15728e1) rVar4.mo62444c(this).mo75002a(cls12)).f42441o = new C2927b(this);
                ((C66309g) rVar4.mo62444c(this).mo75002a(cls4)).mo90427d3();
                ((C15738i) rVar4.mo62444c(this).mo75002a(cls3)).mo14463c3();
                ((C15716b) rVar4.mo62444c(this).mo75002a(cls13)).mo14438d3();
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ack;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C66309g.class, C15738i.class, C15716b.class, C15728e1.class, C15737h.class);
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
        C58782w0.f168290a.mo83842a(findViewById(C0966R.C0970id.f358341ei2));
        Intent intent = getIntent();
        int i = C10408g.f31631a;
        this.f14399q = intent.getIntExtra("KEY_AUTH_MODE", 1);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(7289, this);
    }

    public void onResume() {
        super.onResume();
        if (this.f14402t) {
            if (C58739j4.f168176a.mo83679H()) {
                mo2988N7();
            } else {
                C86709a0.m107524d().mo123455a(7289, this);
                ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76658FS(8, new C2928c(this));
            }
            this.f14402t = false;
        } else if (this.f14400r) {
            mo2988N7();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            mo2988N7();
        } else {
            C76912y0.makeText((Context) getContext(), (int) C0966R.string.dnr, 0).show();
        }
    }
}
