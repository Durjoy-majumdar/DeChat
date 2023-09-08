package vf1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveCreateVisitorModeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qg1.C12233y;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C50368m81;
import te3.C64373fs0;

/* renamed from: vf1.y1 */
public final class C14849y1 implements C12233y.C12234a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveCreateVisitorModeUI f40861a;

    /* renamed from: vf1.y1$a */
    public static final class C14850a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCreateVisitorModeUI f40862d;

        /* renamed from: e */
        public final /* synthetic */ int f40863e;

        /* renamed from: f */
        public final /* synthetic */ String f40864f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14850a(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI, int i, String str) {
            super(0);
            this.f40862d = finderLiveCreateVisitorModeUI;
            this.f40863e = i;
            this.f40864f = str;
        }

        public Object invoke() {
            FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f40862d;
            int i = FinderLiveCreateVisitorModeUI.f14487I;
            boolean z = true;
            finderLiveCreateVisitorModeUI.mo3015O7(true);
            if (this.f40863e == -200066) {
                String str = this.f40864f;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dk_);
                }
                FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI2 = this.f40862d;
                C77426q qVar = new C77426q(finderLiveCreateVisitorModeUI2.getContext());
                qVar.mo107595g(str);
                String string = finderLiveCreateVisitorModeUI2.getContext().getResources().getString(C0966R.string.f360528df1);
                C87412m.m108593f(string, "context.resources.getStr…ive_alert_dialog_btn_txt)");
                qVar.mo107602n(string);
                qVar.mo107600l(new C14745d2(finderLiveCreateVisitorModeUI2));
                qVar.mo107603o();
            } else {
                C76912y0.makeText((Context) this.f40862d, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.dk_), 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vf1.y1$b */
    public static final class C14851b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCreateVisitorModeUI f40865d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14851b(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
            super(0);
            this.f40865d = finderLiveCreateVisitorModeUI;
        }

        public Object invoke() {
            C62042e.f176370a.mo87021L0(this.f40865d);
            return C13598b0.f38549a;
        }
    }

    public C14849y1(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f40861a = finderLiveCreateVisitorModeUI;
    }

    /* renamed from: a */
    public void mo11958a(int i, int i2, String str) {
        C61926c.m72668M(new C14850a(this.f40861a, i2, str));
    }

    /* renamed from: b */
    public void mo11959b(C50368m81 m812) {
        String str;
        String str2;
        String str3;
        C87412m.m108594g(m812, "resp");
        String str4 = this.f40861a.f14496o;
        Log.m105924i(str4, "save alias nickName:" + this.f40861a.f14492E + ",avatar:" + this.f40861a.f14490C);
        FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f40861a;
        Intent intent = new Intent();
        FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI2 = this.f40861a;
        C64373fs0 fs02 = m812.f137904d;
        if (fs02 == null || (str = fs02.f183213d) == null) {
            str = finderLiveCreateVisitorModeUI2.f14492E;
        }
        intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", str);
        C64373fs0 fs03 = m812.f137904d;
        if (fs03 == null || (str2 = fs03.f183214e) == null) {
            str2 = finderLiveCreateVisitorModeUI2.f14490C;
        }
        intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", str2);
        C64373fs0 fs04 = m812.f137904d;
        if (fs04 == null || (str3 = fs04.f183216g) == null) {
            str3 = finderLiveCreateVisitorModeUI2.f14490C;
        }
        intent.putExtra("KEY_ALIAS_VISITOR_USERNAME", str3);
        C13598b0 b0Var = C13598b0.f38549a;
        finderLiveCreateVisitorModeUI.setResult(-1, intent);
        C61926c.m72668M(new C14851b(this.f40861a));
        this.f40861a.finish();
    }
}
