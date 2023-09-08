package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import a14.C0000n0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import androidx.compose.p002ui.platform.C103691v;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import androidx.paging.compose.C54222c;
import androidx.paging.compose.C54225d;
import androidx.viewpager.widget.ViewPager;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiDesignerIPInfoUI;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiStoreDesignerPackList;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45252f;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import i61.C8860l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import n61.C100080c;
import ob0.C89132b;
import p1165z.C112527l;
import p1165z.C112528m;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60667k2;
import p175j0.C60686v;
import p175j0.C60690y0;
import p246u1.C111072h;
import p247u3.C65081m1;
import p267x.C111885b;
import p267x.C111897d1;
import p267x.C111907e1;
import p267x.C111909f1;
import p267x.C111912g1;
import p267x.C111916h1;
import p267x.C111929l;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103203t0;
import p435a0.C103206u0;
import p435a0.C103214y0;
import p436a1.C103264s0;
import p436a1.C103266t0;
import p436a1.C103274x;
import p441aq.C92054g;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104021p;
import p451b2.C104022q;
import p486d2.C106974e;
import p502e0.C107073f;
import p502e0.C107074g;
import p543h0.C107927c0;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32656a;
import p544h2.C32659e;
import p544h2.C32661i;
import p560i2.C108322d;
import p560i2.C33181m;
import p560i2.C33183o;
import p585kl.C99146d;
import p61.C100643e;
import p61.C35378f;
import p631o1.C109836f;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C111299g;
import p721v0.C65503j;
import p735w1.C111687d;
import p735w1.C111691f;
import p735w1.C111693h;
import p735w1.C111699r;
import p735w1.C111703v;
import p735w1.C111705z;
import p735w1.C37958a;
import p835c1.C104231f;
import p835c1.C104233g;
import p835c1.C54601d;
import p868x0.C111979d;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C48374j0;
import sx3.C22415w0;
import sx3.C26236u;
import sx3.C48501y0;
import ta0.C110954a;
import te3.C101787i40;
import te3.C101824o80;
import te3.C49103d62;
import ua0.C65256e;
import wa0.C111786c;
import wc3.C78541w;
import wh3.C38145t;
import wh3.C38146u;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2DesignerUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "f", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI */
public final class EmojiStoreV2DesignerUI extends MMComposeActivity {

    /* renamed from: w */
    public static final /* synthetic */ int f312432w = 0;

    /* renamed from: d */
    public final String f312433d = "MicroMsg.EmojiStoreV3DesignerUI";

    /* renamed from: e */
    public final C13601g f312434e = C36568h.m40985a(new C105203g(this));

    /* renamed from: f */
    public final C13601g f312435f = C36568h.m40985a(new C105205o(this));

    /* renamed from: g */
    public final C13601g f312436g = C36568h.m40985a(new C105206p(this));

    /* renamed from: h */
    public int f312437h;

    /* renamed from: i */
    public String f312438i = "";

    /* renamed from: j */
    public String f312439j = "";

    /* renamed from: n */
    public int f312440n;

    /* renamed from: o */
    public String f312441o;

    /* renamed from: p */
    public List<String> f312442p = C26236u.m33719b("");

    /* renamed from: q */
    public C60690y0<C49103d62> f312443q = C108500f2.m146996c(new C49103d62(), (C108497e2) null, 2, (Object) null);

    /* renamed from: r */
    public final C60690y0<List<C101787i40>> f312444r = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: s */
    public final C60690y0<C45252f<C65081m1<C101787i40>>> f312445s = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: t */
    public final C100643e f312446t = new C100643e();

    /* renamed from: u */
    public byte[] f312447u;

    /* renamed from: v */
    public String f312448v = "";

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$i */
    public static final class C55623i extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f158323d;

        /* renamed from: e */
        public final /* synthetic */ C101787i40 f158324e;

        /* renamed from: f */
        public final /* synthetic */ int f158325f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55623i(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C101787i40 i402, int i) {
            super(2);
            this.f158323d = emojiStoreV2DesignerUI;
            this.f158324e = i402;
            this.f158325f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f158323d.mo149518N7(this.f158324e, (C108504h) obj, this.f158325f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$k */
    public static final class C55624k implements TabLayout.C104470c<TabLayout.C55061f> {

        /* renamed from: a */
        public final /* synthetic */ EmojiStoreV2DesignerUI f158326a;

        public C55624k(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
            this.f158326a = emojiStoreV2DesignerUI;
        }

        /* renamed from: a */
        public void mo9213a(TabLayout.C55061f fVar) {
            C87412m.m108594g(fVar, "tab");
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f158326a;
            int i = EmojiStoreV2DesignerUI.f312432w;
            View childAt = emojiStoreV2DesignerUI.mo149517M7().getChildAt(0);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) childAt).getChildAt(fVar.f154604e);
            C87412m.m108592e(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
            View childAt3 = ((LinearLayout) childAt2).getChildAt(1);
            C87412m.m108592e(childAt3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt3).setTypeface(Typeface.DEFAULT);
        }

        /* renamed from: b */
        public void mo9214b(TabLayout.C55061f fVar) {
            C87412m.m108594g(fVar, "tab");
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f158326a;
            int i = EmojiStoreV2DesignerUI.f312432w;
            View childAt = emojiStoreV2DesignerUI.mo149517M7().getChildAt(0);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) childAt).getChildAt(fVar.f154604e);
            C87412m.m108592e(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
            View childAt3 = ((LinearLayout) childAt2).getChildAt(1);
            C87412m.m108592e(childAt3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt3).setTypeface(Typeface.DEFAULT_BOLD);
        }

        /* renamed from: c */
        public void mo9215c(TabLayout.C55061f fVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$m */
    public static final class C55625m implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f158327d;

        public C55625m(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
            this.f158327d = emojiStoreV2DesignerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f158327d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$n */
    public static final class C55626n implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f158328d;

        public C55626n(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
            this.f158328d = emojiStoreV2DesignerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i(this.f158328d.f312433d, "on shard click.");
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f158328d;
            C77407n nVar = new C77407n((Context) emojiStoreV2DesignerUI.getContext(), 1, false);
            nVar.f225771i = new C55634p(emojiStoreV2DesignerUI);
            nVar.f225782p = new C93250q(emojiStoreV2DesignerUI);
            nVar.mo107573q();
            C115669n.INSTANCE.mo160131h(13224, 3, 0, "", Integer.valueOf(emojiStoreV2DesignerUI.f312437h));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$h */
    public static final class C93224h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f268817d;

        /* renamed from: e */
        public final /* synthetic */ C101787i40 f268818e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93224h(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C101787i40 i402) {
            super(0);
            this.f268817d = emojiStoreV2DesignerUI;
            this.f268818e = i402;
        }

        public Object invoke() {
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f268817d;
            int i = EmojiStoreV2DesignerUI.f312432w;
            emojiStoreV2DesignerUI.mo149516L7().f154997h = this.f268817d.mo149516L7().f154997h + 1;
            Intent intent = new Intent(this.f268817d, EmojiDesignerIPInfoUI.class);
            intent.putExtra("uin", this.f268817d.f312437h);
            intent.putExtra("EXTRA_SESSION_ID", this.f268817d.f312448v);
            intent.putExtra("extra_ip_set_key", this.f268818e.f298382d);
            intent.putExtra("EXTRA_IP_SET_NAME", this.f268818e.f298384f);
            intent.putExtra("EXTRA_IP_SET_DESC", this.f268818e.f298385g);
            intent.putExtra("EXTRA_IP_SET_URL", this.f268818e.f298383e);
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI2 = this.f268817d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI3 = emojiStoreV2DesignerUI2;
            C117292a.m165358d(emojiStoreV2DesignerUI3, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2DesignerUI$itemView$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            emojiStoreV2DesignerUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(emojiStoreV2DesignerUI3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2DesignerUI$itemView$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$onCreate$3", mo125469f = "EmojiStoreV2DesignerUI.kt", mo125470l = {208, 243}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l */
    public static final class C93225l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f268819d;

        /* renamed from: e */
        public int f268820e;

        /* renamed from: f */
        public final /* synthetic */ EmojiStoreV2DesignerUI f268821f;

        /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l$a */
        public static final class C93226a<T> implements C0120a0 {

            /* renamed from: d */
            public final /* synthetic */ C100080c f268822d;

            /* renamed from: e */
            public final /* synthetic */ EmojiStoreV2DesignerUI f268823e;

            public C93226a(C100080c cVar, EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
                this.f268822d = cVar;
                this.f268823e = emojiStoreV2DesignerUI;
            }

            public void onChanged(Object obj) {
                C49103d62 d622 = (C49103d62) obj;
                this.f268822d.notifyDataSetChanged();
                if (this.f268822d.getCount() > 1) {
                    EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f268823e;
                    int i = EmojiStoreV2DesignerUI.f312432w;
                    emojiStoreV2DesignerUI.mo149517M7().setVisibility(0);
                    return;
                }
                EmojiStoreV2DesignerUI emojiStoreV2DesignerUI2 = this.f268823e;
                int i2 = EmojiStoreV2DesignerUI.f312432w;
                emojiStoreV2DesignerUI2.mo149517M7().setVisibility(8);
            }
        }

        /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l$b */
        public static final class C93227b<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ EmojiStoreV2DesignerUI f268824a;

            /* renamed from: b */
            public final /* synthetic */ C15601d<C49103d62> f268825b;

            public C93227b(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C15601d<? super C49103d62> dVar) {
                this.f268824a = emojiStoreV2DesignerUI;
                this.f268825b = dVar;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                String str = this.f268824a.f312433d;
                StringBuilder sb = new StringBuilder();
                sb.append("load: ");
                sb.append(cVar.f256793a);
                sb.append(", ");
                sb.append(cVar.f256794b);
                sb.append(", ");
                sb.append(((C49103d62) cVar.f256796d).f132145e);
                sb.append(", ");
                LinkedList<C101787i40> linkedList = ((C49103d62) cVar.f256796d).f132153p;
                sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
                Log.m105924i(str, sb.toString());
                int i = cVar.f256793a;
                if (i == 0 || i == 4) {
                    ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                    C38146u g = C30790w2.m39221h().mo57720g();
                    String valueOf = String.valueOf(this.f268824a.f312437h);
                    C49103d62 d622 = (C49103d62) cVar.f256796d;
                    g.getClass();
                    if (d622 != null) {
                        try {
                            g.mo61546jo(valueOf);
                            g.insert(new C38145t(valueOf, d622.toByteArray()));
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.emoji.Storage", "exception:%s", Util.stackTraceToString(e));
                        }
                    }
                    int i2 = cVar.f256794b;
                    if (i2 == 0) {
                        this.f268824a.f312447u = null;
                    } else if (i2 == 2) {
                        this.f268824a.f312447u = C48374j0.m53715d(((C49103d62) cVar.f256796d).f132150j);
                    }
                }
                C15601d<C49103d62> dVar = this.f268825b;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(cVar.f256796d));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93225l(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C15601d<? super C93225l> dVar) {
            super(2, dVar);
            this.f268821f = emojiStoreV2DesignerUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C93225l(this.f268821f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C93225l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: qo3.i0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01b7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01c8  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01fe  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r1.f268820e
                r3 = 1
                r4 = 0
                r5 = 2
                r6 = 0
                if (r0 == 0) goto L_0x0032
                if (r0 == r3) goto L_0x0023
                if (r0 != r5) goto L_0x001b
                java.lang.Object r0 = r1.f268819d
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r0 = (com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI) r0
                kotlin.ResultKt.throwOnFailure(r17)
                r0 = r17
                goto L_0x01b8
            L_0x001b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0023:
                java.lang.Object r0 = r1.f268819d
                r7 = r0
                qo3.i0 r7 = (qo3.C89779i0) r7
                kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ c0 -> 0x002f }
                r0 = r17
                goto L_0x00c7
            L_0x002f:
                r0 = move-exception
                goto L_0x00e4
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r17)
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r0 = r1.f268821f
                java.lang.String r7 = r0.f312438i
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x0097
                java.lang.Class<aq.g> r7 = p441aq.C92054g.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                aq.g r7 = (p441aq.C92054g) r7
                r7.getClass()
                com.tencent.mm.storage.w2 r7 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.m r7 = r7.mo57718e()
                java.lang.String r8 = r0.f312438i
                te3.zy1 r7 = r7.mo61536jo(r8)
                if (r7 == 0) goto L_0x005d
                te3.jd3 r8 = r7.f146279d
                goto L_0x005e
            L_0x005d:
                r8 = r6
            L_0x005e:
                if (r8 == 0) goto L_0x0095
                te3.jd3 r8 = r7.f146279d
                int r9 = r8.f136019d
                if (r9 == 0) goto L_0x0095
                java.lang.String r8 = r8.f136020e
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 != 0) goto L_0x0095
                te3.jd3 r7 = r7.f146279d
                int r8 = r7.f136019d
                r0.f312437h = r8
                java.lang.String r7 = r7.f136020e
                java.lang.String r8 = "sampleInfo.Designer.Name"
                gy3.C87412m.m108593f(r7, r8)
                r0.f312439j = r7
                java.lang.String r7 = r0.f312433d
                java.lang.Object[] r8 = new java.lang.Object[r5]
                int r9 = r0.f312437h
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r8[r4] = r9
                java.lang.String r0 = r0.f312439j
                r8[r3] = r0
                java.lang.String r0 = "uin:%s name:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r8)
                goto L_0x0097
            L_0x0095:
                r0 = 1
                goto L_0x0098
            L_0x0097:
                r0 = 0
            L_0x0098:
                if (r0 == 0) goto L_0x0111
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r7 = r1.f268821f
                r0 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r8 = r7.getString(r0)
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r0 = r1.f268821f
                r9 = 2131821739(0x7f1104ab, float:1.927623E38)
                java.lang.String r9 = r0.getString(r9)
                r10 = 1
                r11 = 1
                r12 = 0
                qo3.i0 r7 = nj3.C76879j.m92723Q(r7, r8, r9, r10, r11, r12)
                j61.l r0 = new j61.l     // Catch:{ c0 -> 0x002f }
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r8 = r1.f268821f     // Catch:{ c0 -> 0x002f }
                java.lang.String r8 = r8.f312438i     // Catch:{ c0 -> 0x002f }
                r0.<init>(r8)     // Catch:{ c0 -> 0x002f }
                r1.f268819d = r7     // Catch:{ c0 -> 0x002f }
                r1.f268820e = r3     // Catch:{ c0 -> 0x002f }
                java.lang.Object r0 = p61.C35375d0.m40668a(r0, r1)     // Catch:{ c0 -> 0x002f }
                if (r0 != r2) goto L_0x00c7
                return r2
            L_0x00c7:
                j61.l r0 = (j61.C33521l) r0     // Catch:{ c0 -> 0x002f }
                te3.zy1 r0 = r0.mo59185j1()     // Catch:{ c0 -> 0x002f }
                te3.jd3 r0 = r0.f146279d     // Catch:{ c0 -> 0x002f }
                if (r0 == 0) goto L_0x00e0
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r8 = r1.f268821f     // Catch:{ c0 -> 0x002f }
                int r9 = r0.f136019d     // Catch:{ c0 -> 0x002f }
                r8.f312437h = r9     // Catch:{ c0 -> 0x002f }
                java.lang.String r0 = r0.f136020e     // Catch:{ c0 -> 0x002f }
                java.lang.String r9 = "designer.Name"
                gy3.C87412m.m108593f(r0, r9)     // Catch:{ c0 -> 0x002f }
                r8.f312439j = r0     // Catch:{ c0 -> 0x002f }
            L_0x00e0:
                r7.dismiss()     // Catch:{ c0 -> 0x002f }
                goto L_0x0111
            L_0x00e4:
                r7.dismiss()
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r7 = r1.f268821f
                java.lang.String r7 = r7.f312433d
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "NetSceneGetDesignerSimpleInfo error: "
                r8.append(r9)
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r0 = r1.f268821f
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r7 = r1.f268821f
                r8 = 2131824905(0x7f111109, float:1.9282651E38)
                java.lang.String r7 = r7.getString(r8)
                nj3.C76879j.m92712F(r0, r7, r6, r3)
            L_0x0111:
                n61.c r0 = new n61.c
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r9 = r1.f268821f
                androidx.fragment.app.FragmentManager r10 = r9.getSupportFragmentManager()
                java.lang.String r7 = "supportFragmentManager"
                gy3.C87412m.m108593f(r10, r7)
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r7 = r1.f268821f
                int r11 = r7.f312437h
                p61.e r7 = r7.f312446t
                androidx.lifecycle.z<te3.d62> r12 = r7.f294838d
                androidx.lifecycle.z<com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreDesignerPackList> r13 = r7.f294839e
                androidx.lifecycle.z<p61.f> r14 = r7.f294840f
                r8 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14)
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r7 = r1.f268821f
                rx3.g r7 = r7.f312436g
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                androidx.viewpager.widget.ViewPager r7 = (androidx.viewpager.widget.ViewPager) r7
                r7.setAdapter(r0)
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r7 = r1.f268821f
                p61.e r8 = r7.f312446t
                androidx.lifecycle.z<te3.d62> r8 = r8.f294838d
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l$a r9 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l$a
                r9.<init>(r0, r7)
                r8.observe(r7, r9)
                com.tencent.mm.storage.q2$a r0 = com.tencent.p014mm.storage.C30769q2.C30770a.f82743a
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r7 = r1.f268821f
                int r7 = r7.f312437h
                com.tencent.mm.storage.q2 r0 = r0.mo57693a(r7)
                boolean r7 = r0.mo57692a()
                if (r7 == 0) goto L_0x018a
                java.util.LinkedList<wh3.a> r7 = r0.f82742c
                java.util.Iterator r7 = r7.iterator()
            L_0x0162:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0171
                java.lang.Object r8 = r7.next()
                wh3.a r8 = (wh3.C38128a) r8
                r8.field_syncTime = r4
                goto L_0x0162
            L_0x0171:
                com.tencent.mm.storage.w2 r7 = com.tencent.p014mm.storage.C30790w2.m39221h()
                boolean[] r8 = r7.f82769a
                monitor-enter(r8)
                wh3.b r7 = r7.f82784p     // Catch:{ all -> 0x0187 }
                monitor-exit(r8)     // Catch:{ all -> 0x0187 }
                r7.mo61528jo(r0)
                com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r0 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent
                r0.<init>()
                r0.publish()
                goto L_0x018a
            L_0x0187:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0187 }
                throw r0
            L_0x018a:
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r0 = r1.f268821f
                r1.f268819d = r0
                r1.f268820e = r5
                wx3.h r5 = new wx3.h
                wx3.d r7 = xx3.C66447b.m78392b(r16)
                r5.<init>(r7)
                dl.f r7 = new dl.f
                int r8 = r0.f312437h
                byte[] r9 = r0.f312447u
                r7.<init>(r8, r9)
                nr3.e r7 = r7.mo9225i()
                r7.mo11397F(r0)
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l$b r8 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l$b
                r8.<init>(r0, r5)
                r7.mo123420E(r8)
                java.lang.Object r0 = r5.mo90314b()
                if (r0 != r2) goto L_0x01b8
                return r2
            L_0x01b8:
                te3.d62 r0 = (te3.C49103d62) r0
                java.util.LinkedList<te3.i40> r2 = r0.f132153p
                if (r2 == 0) goto L_0x01c6
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x01c5
                goto L_0x01c6
            L_0x01c5:
                r3 = 0
            L_0x01c6:
                if (r3 != 0) goto L_0x01fe
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r2 = r1.f268821f
                j0.y0<d14.f<u3.m1<te3.i40>>> r3 = r2.f312445s
                int r2 = r2.f312437h
                u3.l1 r5 = new u3.l1
                r8 = 4
                r9 = 4
                r10 = 0
                r11 = 4
                r12 = 0
                r13 = 0
                r14 = 52
                r15 = 0
                r7 = r5
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
                p61.c r7 = new p61.c
                r7.<init>(r2, r0)
                u3.o0 r2 = new u3.o0
                boolean r8 = r7 instanceof p247u3.C14111b2
                if (r8 == 0) goto L_0x01ee
                u3.j1 r8 = new u3.j1
                r8.<init>(r7)
                goto L_0x01f3
            L_0x01ee:
                u3.k1 r8 = new u3.k1
                r8.<init>(r7, r6)
            L_0x01f3:
                r2.<init>(r8, r6, r5, r6)
                d14.f<u3.m1<Value>> r2 = r2.f187369c
                j0.d2 r3 = (p175j0.C108494d2) r3
                r3.setValue(r2)
                goto L_0x0207
            L_0x01fe:
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r2 = r1.f268821f
                j0.y0<java.util.List<te3.i40>> r2 = r2.f312444r
                j0.d2 r2 = (p175j0.C108494d2) r2
                r2.setValue(r6)
            L_0x0207:
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI r2 = r1.f268821f
                byte[] r3 = r2.f312447u
                r2.mo149519O7(r0, r3, r4)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI.C93225l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$ExpandableText$1", mo125469f = "EmojiStoreV2DesignerUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$a */
    public static final class C105196a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ int f312449d;

        /* renamed from: e */
        public final /* synthetic */ C111703v f312450e;

        /* renamed from: f */
        public final /* synthetic */ C33181m f312451f;

        /* renamed from: g */
        public final /* synthetic */ C60690y0<Boolean> f312452g;

        /* renamed from: h */
        public final /* synthetic */ C60690y0<Boolean> f312453h;

        /* renamed from: i */
        public final /* synthetic */ C60690y0<C37958a> f312454i;

        /* renamed from: j */
        public final /* synthetic */ String f312455j;

        /* renamed from: n */
        public final /* synthetic */ long f312456n;

        /* renamed from: o */
        public final /* synthetic */ C8479f0<String> f312457o;

        /* renamed from: p */
        public final /* synthetic */ C60690y0<C37958a> f312458p;

        /* renamed from: q */
        public final /* synthetic */ String f312459q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105196a(int i, C111703v vVar, C33181m mVar, C60690y0<Boolean> y0Var, C60690y0<Boolean> y0Var2, C60690y0<C37958a> y0Var3, String str, long j, C8479f0<String> f0Var, C60690y0<C37958a> y0Var4, String str2, C15601d<? super C105196a> dVar) {
            super(2, dVar);
            this.f312449d = i;
            this.f312450e = vVar;
            this.f312451f = mVar;
            this.f312452g = y0Var;
            this.f312453h = y0Var2;
            this.f312454i = y0Var3;
            this.f312455j = str;
            this.f312456n = j;
            this.f312457o = f0Var;
            this.f312458p = y0Var4;
            this.f312459q = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105196a(this.f312449d, this.f312450e, this.f312451f, this.f312452g, this.f312453h, this.f312454i, this.f312455j, this.f312456n, this.f312457o, this.f312458p, this.f312459q, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105196a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            ResultKt.throwOnFailure(obj);
            int i = this.f312449d - 1;
            if (this.f312450e != null) {
                C60690y0<Boolean> y0Var = this.f312452g;
                int i2 = EmojiStoreV2DesignerUI.f312432w;
                if (y0Var.getValue() == null) {
                    C60690y0<Boolean> y0Var2 = this.f312452g;
                    C111687d dVar = this.f312450e.f334372b;
                    if (dVar.f334319f >= this.f312449d) {
                        dVar.mo163345d(i);
                        if (((C111693h) ((ArrayList) dVar.f334321h).get(C111691f.m152223b(dVar.f334321h, i))).f334329a.mo157579r(i)) {
                            z = true;
                            y0Var2.setValue(Boolean.valueOf(z));
                        }
                    }
                    z = false;
                    y0Var2.setValue(Boolean.valueOf(z));
                }
                Boolean value = this.f312452g.getValue();
                C87412m.m108591d(value);
                if (!value.booleanValue()) {
                    return C13598b0.f38549a;
                }
                if (EmojiStoreV2DesignerUI.m141273I7(this.f312453h)) {
                    if (this.f312454i.getValue() == null) {
                        C60690y0<C37958a> y0Var3 = this.f312454i;
                        String str = this.f312455j;
                        long j = this.f312456n;
                        C8479f0<String> f0Var = this.f312457o;
                        C37958a.C37959a aVar = new C37958a.C37959a(0, 1, (C8480h) null);
                        aVar.mo61449b(str);
                        aVar.mo61449b(" ");
                        C37958a.C37959a aVar2 = aVar;
                        aVar2.mo61452e(new C111699r(j, 0, (C104022q) null, (C104020o) null, (C104021p) null, (C104014i) null, (String) null, 0, (C32656a) null, (C32661i) null, (C106974e) null, 0, (C108014f) null, (C103264s0) null, 16382, (C8480h) null));
                        aVar2.mo61449b((String) f0Var.f27484d);
                        y0Var3.setValue(aVar2.mo61453f());
                    }
                } else if (this.f312451f != null && i + 1 == this.f312450e.f334372b.f334319f && this.f312458p.getValue() == null) {
                    int e = this.f312450e.mo163367e(i, true) + 1;
                    do {
                        e--;
                    } while (this.f312450e.mo163365c(e).f336963c > ((float) (((int) (this.f312450e.f334373c >> 32)) - ((int) (this.f312451f.f90057a >> 32)))));
                    C60690y0<C37958a> y0Var4 = this.f312458p;
                    String str2 = this.f312455j;
                    long j2 = this.f312456n;
                    String str3 = this.f312459q;
                    C37958a.C37959a aVar3 = new C37958a.C37959a(0, 1, (C8480h) null);
                    String substring = str2.substring(0, e - 1);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    aVar3.mo61449b(substring);
                    aVar3.mo61449b(" ... ");
                    C37958a.C37959a aVar4 = aVar3;
                    aVar4.mo61452e(new C111699r(j2, 0, (C104022q) null, (C104020o) null, (C104021p) null, (C104014i) null, (String) null, 0, (C32656a) null, (C32661i) null, (C106974e) null, 0, (C108014f) null, (C103264s0) null, 16382, (C8480h) null));
                    aVar4.mo61449b(str3);
                    y0Var4.setValue(aVar4.mo61453f());
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$b */
    public static final class C105197b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Boolean> f312460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105197b(C60690y0<Boolean> y0Var) {
            super(0);
            this.f312460d = y0Var;
        }

        public Object invoke() {
            C60690y0<Boolean> y0Var = this.f312460d;
            y0Var.setValue(Boolean.valueOf(!EmojiStoreV2DesignerUI.m141273I7(y0Var)));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$c */
    public static final class C105198c extends C87413o implements C32226l<C111703v, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<C111703v> f312461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105198c(C60690y0<C111703v> y0Var) {
            super(1);
            this.f312461d = y0Var;
        }

        public Object invoke(Object obj) {
            C111703v vVar = (C111703v) obj;
            C87412m.m108594g(vVar, LocaleUtil.ITALIAN);
            this.f312461d.setValue(vVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$d */
    public static final class C105199d extends C87413o implements C32226l<C111703v, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<C33181m> f312462d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<C33181m> f312463e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<Boolean> f312464f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105199d(C60690y0<C33181m> y0Var, C60690y0<C33181m> y0Var2, C60690y0<Boolean> y0Var3) {
            super(1);
            this.f312462d = y0Var;
            this.f312463e = y0Var2;
            this.f312464f = y0Var3;
        }

        public Object invoke(Object obj) {
            C111703v vVar = (C111703v) obj;
            C87412m.m108594g(vVar, LocaleUtil.ITALIAN);
            if (EmojiStoreV2DesignerUI.m141273I7(this.f312464f)) {
                this.f312462d.setValue(new C33181m(vVar.f334373c));
            } else {
                this.f312463e.setValue(new C33181m(vVar.f334373c));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$e */
    public static final class C105200e extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f312465d;

        /* renamed from: e */
        public final /* synthetic */ String f312466e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f312467f;

        /* renamed from: g */
        public final /* synthetic */ String f312468g;

        /* renamed from: h */
        public final /* synthetic */ String f312469h;

        /* renamed from: i */
        public final /* synthetic */ long f312470i;

        /* renamed from: j */
        public final /* synthetic */ long f312471j;

        /* renamed from: n */
        public final /* synthetic */ long f312472n;

        /* renamed from: o */
        public final /* synthetic */ C104020o f312473o;

        /* renamed from: p */
        public final /* synthetic */ C104022q f312474p;

        /* renamed from: q */
        public final /* synthetic */ int f312475q;

        /* renamed from: r */
        public final /* synthetic */ int f312476r;

        /* renamed from: s */
        public final /* synthetic */ int f312477s;

        /* renamed from: t */
        public final /* synthetic */ int f312478t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105200e(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, String str, C65503j jVar, String str2, String str3, long j, long j2, long j3, C104020o oVar, C104022q qVar, int i, int i2, int i3, int i4) {
            super(2);
            this.f312465d = emojiStoreV2DesignerUI;
            this.f312466e = str;
            this.f312467f = jVar;
            this.f312468g = str2;
            this.f312469h = str3;
            this.f312470i = j;
            this.f312471j = j2;
            this.f312472n = j3;
            this.f312473o = oVar;
            this.f312474p = qVar;
            this.f312475q = i;
            this.f312476r = i2;
            this.f312477s = i3;
            this.f312478t = i4;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f312465d;
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI2 = emojiStoreV2DesignerUI;
            emojiStoreV2DesignerUI2.mo149515H7(this.f312466e, this.f312467f, this.f312468g, this.f312469h, this.f312470i, this.f312471j, this.f312472n, this.f312473o, this.f312474p, this.f312475q, (C108504h) obj, this.f312476r | 1, this.f312477s, this.f312478t);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$f */
    public static final class C105201f implements C111907e1 {

        /* renamed from: a */
        public static final C105201f f312479a = new C105201f();

        /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$f$a */
        public static final class C105202a implements C111909f1 {

            /* renamed from: d */
            public final C60667k2<Boolean> f312480d;

            /* renamed from: e */
            public final long f312481e;

            public C105202a(C60667k2 k2Var, long j, C8480h hVar) {
                this.f312480d = k2Var;
                this.f312481e = j;
            }

            /* renamed from: a */
            public void mo149521a(C54601d dVar) {
                C87412m.m108594g(dVar, "<this>");
                if (this.f312480d.getValue().booleanValue()) {
                    C104231f.C104232a.m139087f(dVar, this.f312481e, 0, dVar.mo145819e(), 0.0f, (C104233g) null, (C103274x) null, 0, 122, (Object) null);
                }
                dVar.mo75508h0();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
            if (r2 == p175j0.C108504h.C60656a.f172772a) goto L_0x0037;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p267x.C111909f1 mo149520a(p1165z.C112526k r4, p175j0.C108504h r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "interactionSource"
                gy3.C87412m.m108594g(r4, r0)
                r0 = 1618099164(0x60723bdc, float:6.9819147E19)
                r5.mo51557H(r0)
                r6 = r6 & 14
                j0.k2 r6 = p1165z.C112532q.m153726a(r4, r5, r6)
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r1 = "getContext()"
                gy3.C87412m.m108593f(r0, r1)
                r1 = 2131099808(0x7f0600a0, float:1.781198E38)
                long r0 = ta0.C110954a.m151254b(r1, r0)
                r2 = 1157296644(0x44faf204, float:2007.563)
                r5.mo51557H(r2)
                boolean r4 = r5.mo51619x(r4)
                java.lang.Object r2 = r5.mo51606q()
                if (r4 != 0) goto L_0x0037
                int r4 = p175j0.C108504h.f324828a
                java.lang.Object r4 = p175j0.C108504h.C60656a.f172772a
                if (r2 != r4) goto L_0x0040
            L_0x0037:
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$f$a r2 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$f$a
                r4 = 0
                r2.<init>(r6, r0, r4)
                r5.mo51553F(r2)
            L_0x0040:
                r5.mo51565P()
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$f$a r2 = (com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI.C105201f.C105202a) r2
                r5.mo51565P()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI.C105201f.mo149520a(z.k, j0.h, int):x.f1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$g */
    public static final class C105203g extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f312482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105203g(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
            super(0);
            this.f312482d = emojiStoreV2DesignerUI;
        }

        public Object invoke() {
            return (FrameLayout) this.f312482d.findViewById(C0966R.C0970id.cxc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$j */
    public static final class C105204j extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f312483d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105204j(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
            super(2);
            this.f312483d = emojiStoreV2DesignerUI;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                EmojiStoreV2DesignerUI.m141275K7(this.f312483d, hVar, 8);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$o */
    public static final class C105205o extends C87413o implements C32224a<TabLayout> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f312484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105205o(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
            super(0);
            this.f312484d = emojiStoreV2DesignerUI;
        }

        public Object invoke() {
            return (TabLayout) this.f312484d.findViewById(C0966R.C0970id.cya);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$p */
    public static final class C105206p extends C87413o implements C32224a<ViewPager> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV2DesignerUI f312485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105206p(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
            super(0);
            this.f312485d = emojiStoreV2DesignerUI;
        }

        public Object invoke() {
            return (ViewPager) this.f312485d.findViewById(C0966R.C0970id.cvw);
        }
    }

    /* renamed from: I7 */
    public static final boolean m141273I7(C60690y0<Boolean> y0Var) {
        return y0Var.getValue().booleanValue();
    }

    /* renamed from: J7 */
    public static final void m141274J7(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C72996z1 z1Var, C108504h hVar, int i) {
        EmojiStoreV2DesignerUI emojiStoreV2DesignerUI2 = emojiStoreV2DesignerUI;
        emojiStoreV2DesignerUI.getClass();
        C108504h z = hVar.mo51623z(983423319);
        C111294a.C37634c cVar = C111294a.C111295a.f333227i;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        float f = (float) 8;
        C65503j d = C111940o.m152651d(C103166l0.m136523g(aVar, 0.0f, f, 0.0f, f, 5, (Object) null), false, (String) null, (C111072h) null, new C55628f(emojiStoreV2DesignerUI2), 7, (Object) null);
        z.mo51557H(693286680);
        C109895y a = C103199s0.m136579a(C103111a.f304235b, cVar, z, 48);
        z.mo51557H(-1323940314);
        C60686v vVar = C103645l0.f306124e;
        C108322d dVar = (C108322d) z.mo51598m(vVar);
        C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
        C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
        C110269a.f329831D0.getClass();
        C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(d);
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar2);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
            C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
            C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
            C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
            z.mo51590i();
            ((C35747b) a2).invoke(new C33489x1(z), z, 0);
            z.mo51557H(2058660585);
            z.mo51557H(-678309503);
            C103206u0 u0Var = C103206u0.f304394a;
            String username = z1Var.getUsername();
            C65503j j = C103214y0.m136594j(aVar, (float) 48);
            C87412m.m108593f(username, "username");
            C111786c.m152406a(username, j, false, "", 0.0f, z, 3120, 20);
            String j3 = z1Var.mo62909j3();
            if (j3 == null) {
                j3 = z1Var.getUsername();
            }
            if (j3 == null) {
                j3 = "";
            }
            C60686v vVar2 = vVar;
            C65503j g = C103166l0.m136523g(C103203t0.C103204a.m136583a(u0Var, aVar, 1.0f, false, 2, (Object) null), f, 0.0f, f, 0.0f, 10, (Object) null);
            long F = ((C108322d) z.mo51598m(vVar2)).mo143031F((float) 12);
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C107944f0.m146242c(j3, g, C110954a.m151254b(C0966R.color.a7f, context), F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 1, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, LVBuffer.MAX_STRING_LENGTH, 3120, 55280);
            z.mo51598m(C103691v.f306267a);
            Resources resources = ((Context) z.mo51598m(C103691v.f306268b)).getResources();
            C87412m.m108593f(resources, "LocalContext.current.resources");
            String string = resources.getString(C0966R.string.c_d);
            C87412m.m108593f(string, "resources.getString(id)");
            long F2 = ((C108322d) z.mo51598m(vVar2)).mo143031F((float) 14);
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            C107944f0.m146242c(string, (C65503j) null, C110954a.m151254b(C0966R.color.f3288ma, context2), F2, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 1, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, LVBuffer.MAX_STRING_LENGTH, LVBuffer.MAX_STRING_LENGTH, 57330);
            C111897d1.m152617a(C110954a.m151256d(C0966R.raw.emoji_arrow, z, 0), "", (C65503j) null, (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, z, 56, 124);
            z.mo51565P();
            z.mo51565P();
            z.mo51610s();
            z.mo51565P();
            z.mo51565P();
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C105207g(emojiStoreV2DesignerUI2, z1Var, i));
                return;
            }
            return;
        }
        C108501g.m147000a();
        throw null;
    }

    /* renamed from: K7 */
    public static final void m141275K7(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C108504h hVar, int i) {
        EmojiStoreV2DesignerUI emojiStoreV2DesignerUI2 = emojiStoreV2DesignerUI;
        emojiStoreV2DesignerUI.getClass();
        C108504h z = hVar.mo51623z(461967834);
        C60690y0<C49103d62> y0Var = emojiStoreV2DesignerUI2.f312443q;
        List list = (List) ((C108494d2) emojiStoreV2DesignerUI2.f312444r).getValue();
        C45252f fVar = (C45252f) ((C108494d2) emojiStoreV2DesignerUI2.f312445s).getValue();
        z.mo51557H(-426598261);
        C54222c a = fVar == null ? null : C54225d.m60913a(fVar, z, 8);
        z.mo51565P();
        int i2 = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C107927c0.m146232a(C111885b.m152607c(aVar, C110954a.m151254b(C0966R.color.f2929c, context), (C103266t0) null, 2, (Object) null), (C103266t0) null, 0, 0, (C111929l) null, 0.0f, C110261c.m149878b(z, 2015852318, true, new C105208n(emojiStoreV2DesignerUI2, a, list, y0Var)), z, 1572864, 62);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C105209o(emojiStoreV2DesignerUI2, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: j0.y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: v0.j$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012a  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo149515H7(java.lang.String r61, p721v0.C65503j r62, java.lang.String r63, java.lang.String r64, long r65, long r67, long r69, p451b2.C104020o r71, p451b2.C104022q r72, int r73, p175j0.C108504h r74, int r75, int r76, int r77) {
        /*
            r60 = this;
            r14 = r61
            r15 = r75
            r13 = r77
            java.lang.String r0 = "text"
            gy3.C87412m.m108594g(r14, r0)
            r0 = -41527603(0xfffffffffd8656cd, float:-2.2320906E37)
            r1 = r74
            j0.h r12 = r1.mo51623z(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001c
            r0 = r15 | 6
            goto L_0x002c
        L_0x001c:
            r0 = r15 & 14
            if (r0 != 0) goto L_0x002b
            boolean r0 = r12.mo51619x(r14)
            if (r0 == 0) goto L_0x0028
            r0 = 4
            goto L_0x0029
        L_0x0028:
            r0 = 2
        L_0x0029:
            r0 = r0 | r15
            goto L_0x002c
        L_0x002b:
            r0 = r15
        L_0x002c:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x0033
            r0 = r0 | 48
            goto L_0x0046
        L_0x0033:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0046
            r4 = r62
            boolean r5 = r12.mo51619x(r4)
            if (r5 == 0) goto L_0x0042
            r5 = 32
            goto L_0x0044
        L_0x0042:
            r5 = 16
        L_0x0044:
            r0 = r0 | r5
            goto L_0x0048
        L_0x0046:
            r4 = r62
        L_0x0048:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004f
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x004f:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0062
            r6 = r63
            boolean r7 = r12.mo51619x(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r0 = r0 | r7
            goto L_0x0064
        L_0x0062:
            r6 = r63
        L_0x0064:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x006b
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007e
            r8 = r64
            boolean r9 = r12.mo51619x(r8)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r0 = r0 | r9
            goto L_0x0080
        L_0x007e:
            r8 = r64
        L_0x0080:
            r9 = r13 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008a
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008a:
            r10 = r15 & r16
            if (r10 != 0) goto L_0x009e
            r10 = r65
            boolean r17 = r12.mo51594k(r10)
            if (r17 == 0) goto L_0x0099
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r0 = r0 | r17
            goto L_0x00a0
        L_0x009e:
            r10 = r65
        L_0x00a0:
            r17 = r13 & 32
            r18 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00ad
            r19 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r19
            r1 = r67
            goto L_0x00c0
        L_0x00ad:
            r19 = r15 & r18
            r1 = r67
            if (r19 != 0) goto L_0x00c0
            boolean r20 = r12.mo51594k(r1)
            if (r20 == 0) goto L_0x00bc
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r0 = r0 | r20
        L_0x00c0:
            r20 = r13 & 64
            if (r20 == 0) goto L_0x00cb
            r21 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r21
            r1 = r69
            goto L_0x00e0
        L_0x00cb:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r15 & r21
            r1 = r69
            if (r21 != 0) goto L_0x00e0
            boolean r21 = r12.mo51594k(r1)
            if (r21 == 0) goto L_0x00dc
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r0 = r0 | r21
        L_0x00e0:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e8
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r2
            goto L_0x00fd
        L_0x00e8:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r15
            if (r2 != 0) goto L_0x00fd
            r2 = r71
            boolean r21 = r12.mo51619x(r2)
            if (r21 == 0) goto L_0x00f8
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r0 = r0 | r21
            goto L_0x00ff
        L_0x00fd:
            r2 = r71
        L_0x00ff:
            r2 = r13 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x010a
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r21
            r4 = r72
            goto L_0x011f
        L_0x010a:
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            r21 = r15 & r21
            r4 = r72
            if (r21 != 0) goto L_0x011f
            boolean r21 = r12.mo51619x(r4)
            if (r21 == 0) goto L_0x011b
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r0 = r0 | r21
        L_0x011f:
            r4 = r13 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x012a
            r21 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r21
            r6 = r73
            goto L_0x013f
        L_0x012a:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r15 & r21
            r6 = r73
            if (r21 != 0) goto L_0x013f
            boolean r21 = r12.mo51592j(r6)
            if (r21 == 0) goto L_0x013b
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013d
        L_0x013b:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013d:
            r0 = r0 | r21
        L_0x013f:
            r21 = r0
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r21 & r0
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r6) goto L_0x016c
            r0 = r76 & 1
            if (r0 != 0) goto L_0x016c
            boolean r0 = r12.mo51575a()
            if (r0 != 0) goto L_0x0156
            goto L_0x016c
        L_0x0156:
            r12.mo51581d()
            r3 = r62
            r4 = r63
            r13 = r72
            r52 = r73
            r5 = r8
            r6 = r10
            r14 = r12
            r8 = r67
            r10 = r69
            r12 = r71
            goto L_0x04e6
        L_0x016c:
            if (r3 == 0) goto L_0x0173
            v0.j$a r0 = p721v0.C65503j.C65504a.f188490d
            r41 = r0
            goto L_0x0175
        L_0x0173:
            r41 = r62
        L_0x0175:
            if (r5 == 0) goto L_0x017c
            java.lang.String r0 = "More"
            r42 = r0
            goto L_0x017e
        L_0x017c:
            r42 = r63
        L_0x017e:
            if (r7 == 0) goto L_0x0185
            java.lang.String r0 = "Less"
            r43 = r0
            goto L_0x0187
        L_0x0185:
            r43 = r8
        L_0x0187:
            if (r9 == 0) goto L_0x018e
            long r5 = p436a1.C103272w.f304515g
            r44 = r5
            goto L_0x0190
        L_0x018e:
            r44 = r10
        L_0x0190:
            if (r17 == 0) goto L_0x0197
            long r5 = p436a1.C103272w.f304513e
            r46 = r5
            goto L_0x0199
        L_0x0197:
            r46 = r67
        L_0x0199:
            if (r20 == 0) goto L_0x01a0
            long r5 = p560i2.C33184p.f90062c
            r48 = r5
            goto L_0x01a2
        L_0x01a0:
            r48 = r69
        L_0x01a2:
            r11 = 0
            if (r1 == 0) goto L_0x01a8
            r50 = r11
            goto L_0x01aa
        L_0x01a8:
            r50 = r71
        L_0x01aa:
            if (r2 == 0) goto L_0x01af
            r51 = r11
            goto L_0x01b1
        L_0x01af:
            r51 = r72
        L_0x01b1:
            r0 = 1
            if (r4 == 0) goto L_0x01b7
            r52 = 1
            goto L_0x01b9
        L_0x01b7:
            r52 = r73
        L_0x01b9:
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            r1 = 0
            r2 = 4
            r3 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = "‍"
            r62 = r43
            r63 = r4
            r64 = r5
            r65 = r1
            r66 = r2
            r67 = r3
            java.lang.String r1 = z04.C112551y.m153816p(r62, r63, r64, r65, r66, r67)
            r10.f27484d = r1
            w1.a$a r1 = new w1.a$a
            r8 = 0
            r1.<init>(r8, r0, r11)
            r1.mo61449b(r14)
            w1.a r17 = r1.mo61453f()
            r9 = 1157296644(0x44faf204, float:2007.563)
            r12.mo51557H(r9)
            boolean r1 = r12.mo51619x(r14)
            java.lang.Object r2 = r12.mo51606q()
            if (r1 != 0) goto L_0x01f9
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r1) goto L_0x0201
        L_0x01f9:
            r1 = 2
            j0.y0 r2 = p175j0.C108500f2.m146996c(r11, r11, r1, r11)
            r12.mo51553F(r2)
        L_0x0201:
            r12.mo51565P()
            r20 = r2
            j0.y0 r20 = (p175j0.C60690y0) r20
            r12.mo51557H(r9)
            boolean r1 = r12.mo51619x(r14)
            java.lang.Object r2 = r12.mo51606q()
            if (r1 != 0) goto L_0x021c
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r1) goto L_0x021a
            goto L_0x021c
        L_0x021a:
            r1 = 2
            goto L_0x0224
        L_0x021c:
            r1 = 2
            j0.y0 r2 = p175j0.C108500f2.m146996c(r11, r11, r1, r11)
            r12.mo51553F(r2)
        L_0x0224:
            r12.mo51565P()
            r22 = r2
            j0.y0 r22 = (p175j0.C60690y0) r22
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo51557H(r7)
            java.lang.Object r2 = r12.mo51606q()
            java.lang.Object r6 = p175j0.C108504h.C60656a.f172772a
            if (r2 != r6) goto L_0x0242
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            j0.y0 r2 = p175j0.C108500f2.m146996c(r2, r11, r1, r11)
            r12.mo51553F(r2)
        L_0x0242:
            r12.mo51565P()
            r5 = r2
            j0.y0 r5 = (p175j0.C60690y0) r5
            r12.mo51557H(r7)
            java.lang.Object r2 = r12.mo51606q()
            if (r2 != r6) goto L_0x0258
            j0.y0 r2 = p175j0.C108500f2.m146996c(r11, r11, r1, r11)
            r12.mo51553F(r2)
        L_0x0258:
            r12.mo51565P()
            r4 = r2
            j0.y0 r4 = (p175j0.C60690y0) r4
            r12.mo51557H(r7)
            java.lang.Object r2 = r12.mo51606q()
            if (r2 != r6) goto L_0x026e
            j0.y0 r2 = p175j0.C108500f2.m146996c(r11, r11, r1, r11)
            r12.mo51553F(r2)
        L_0x026e:
            r12.mo51565P()
            r3 = r2
            j0.y0 r3 = (p175j0.C60690y0) r3
            r12.mo51557H(r7)
            java.lang.Object r2 = r12.mo51606q()
            if (r2 != r6) goto L_0x0284
            j0.y0 r2 = p175j0.C108500f2.m146996c(r11, r11, r1, r11)
            r12.mo51553F(r2)
        L_0x0284:
            r12.mo51565P()
            j0.y0 r2 = (p175j0.C60690y0) r2
            r12.mo51557H(r7)
            java.lang.Object r7 = r12.mo51606q()
            if (r7 != r6) goto L_0x0299
            j0.y0 r7 = p175j0.C108500f2.m146996c(r11, r11, r1, r11)
            r12.mo51553F(r7)
        L_0x0299:
            r12.mo51565P()
            j0.y0 r7 = (p175j0.C60690y0) r7
            java.lang.Object r1 = r3.getValue()
            r23 = r1
            w1.v r23 = (p735w1.C111703v) r23
            java.lang.Object r1 = r2.getValue()
            r24 = r1
            i2.m r24 = (p560i2.C33181m) r24
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r14
            boolean r25 = m141273I7(r5)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r25)
            r1[r0] = r25
            r0 = 2
            r1[r0] = r23
            r0 = 3
            r1[r0] = r24
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$a r0 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$a
            r19 = 0
            r63 = r0
            r53 = r1
            r1 = r52
            r54 = r2
            r2 = r23
            r55 = r3
            r3 = r24
            r71 = r5
            r56 = r6
            r6 = r20
            r57 = r7
            r7 = r61
            r8 = r46
            r72 = r10
            r23 = r11
            r11 = r22
            r14 = r12
            r12 = r42
            r13 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            r0 = 72
            r2 = r63
            r1 = r53
            p175j0.C60655g0.m70935f(r1, r2, r14, r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo51557H(r0)
            java.lang.Object r0 = r14.mo51606q()
            r1 = r56
            if (r0 != r1) goto L_0x030e
            z.m r0 = new z.m
            r0.<init>()
            r14.mo51553F(r0)
        L_0x030e:
            r14.mo51565P()
            z.l r0 = (p1165z.C112527l) r0
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$f r2 = com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI.C105201f.f312479a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1157296644(0x44faf204, float:2007.563)
            r14.mo51557H(r6)
            r7 = r71
            boolean r8 = r14.mo51619x(r7)
            java.lang.Object r9 = r14.mo51606q()
            if (r8 != 0) goto L_0x032c
            if (r9 != r1) goto L_0x0334
        L_0x032c:
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$b r9 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$b
            r9.<init>(r7)
            r14.mo51553F(r9)
        L_0x0334:
            r14.mo51565P()
            r8 = r9
            fy3.a r8 = (fy3.C32224a) r8
            r9 = 28
            r10 = 0
            r62 = r41
            r63 = r0
            r64 = r2
            r65 = r3
            r66 = r4
            r67 = r5
            r68 = r8
            r69 = r9
            r70 = r10
            v0.j r0 = p267x.C111940o.m152650c(r62, r63, r64, r65, r66, r67, r68, r69, r70)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r14.mo51557H(r2)
            v0.a r2 = p721v0.C111294a.C111295a.f333219a
            r3 = 0
            o1.y r2 = p435a0.C103141f.m136472c(r2, r3, r14, r3)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo51557H(r4)
            j0.f1<i2.d> r4 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r4 = r14.mo51598m(r4)
            i2.d r4 = (p560i2.C108322d) r4
            j0.f1<i2.o> r5 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r5 = r14.mo51598m(r5)
            i2.o r5 = (p560i2.C33183o) r5
            j0.f1<androidx.compose.ui.platform.i2> r8 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r8 = r14.mo51598m(r8)
            androidx.compose.ui.platform.i2 r8 = (androidx.compose.p002ui.platform.C103633i2) r8
            q1.a$a r9 = p658q1.C110269a.f329831D0
            r9.getClass()
            fy3.a<q1.a> r9 = p658q1.C110269a.C110270a.f329833b
            fy3.q r0 = p631o1.C109863q.m149330a(r0)
            j0.d r10 = r14.mo51543A()
            boolean r10 = r10 instanceof p175j0.C24665d
            if (r10 == 0) goto L_0x050b
            r14.mo51615v()
            boolean r10 = r14.mo51621y()
            if (r10 == 0) goto L_0x039e
            r14.mo51612t(r9)
            goto L_0x03a1
        L_0x039e:
            r14.mo51579c()
        L_0x03a1:
            r14.mo51561L()
            fy3.p<q1.a, o1.y, rx3.b0> r9 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r14, r2, r9)
            fy3.p<q1.a, i2.d, rx3.b0> r2 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r14, r4, r2)
            fy3.p<q1.a, i2.o, rx3.b0> r2 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r14, r5, r2)
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r2 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r14, r8, r2)
            r14.mo51590i()
            j0.x1 r2 = new j0.x1
            r2.<init>(r14)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            q0.b r0 = (p415q0.C35747b) r0
            r0.invoke(r2, r14, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo51557H(r0)
            r0 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r14.mo51557H(r0)
            boolean r0 = m141273I7(r7)
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r0 = r20.getValue()
            w1.a r0 = (p735w1.C37958a) r0
            if (r0 != 0) goto L_0x03ee
            goto L_0x03ec
        L_0x03e4:
            java.lang.Object r0 = r22.getValue()
            w1.a r0 = (p735w1.C37958a) r0
            if (r0 != 0) goto L_0x03ee
        L_0x03ec:
            r0 = r17
        L_0x03ee:
            boolean r2 = m141273I7(r7)
            if (r2 == 0) goto L_0x03fb
            r2 = 2147483647(0x7fffffff, float:NaN)
            r33 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x03fd
        L_0x03fb:
            r33 = r52
        L_0x03fd:
            r31 = 2
            r17 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r32 = 0
            r34 = 0
            r14.mo51557H(r6)
            r2 = r55
            boolean r3 = r14.mo51619x(r2)
            java.lang.Object r4 = r14.mo51606q()
            if (r3 != 0) goto L_0x0420
            if (r4 != r1) goto L_0x0428
        L_0x0420:
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$c r4 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$c
            r4.<init>(r2)
            r14.mo51553F(r4)
        L_0x0428:
            r14.mo51565P()
            r35 = r4
            fy3.l r35 = (fy3.C32226l) r35
            r36 = 0
            int r2 = r21 >> 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            int r3 = r21 >> 9
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r5 = r2 | r4
            r6 = r3 & r16
            r5 = r5 | r6
            r3 = r3 & r18
            r38 = r5 | r3
            r39 = 48
            r40 = 88002(0x157c2, float:1.23317E-40)
            r16 = r0
            r18 = r44
            r20 = r48
            r22 = r50
            r23 = r51
            r37 = r14
            p543h0.C107944f0.m146241b(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r0 = m141273I7(r7)
            if (r0 == 0) goto L_0x0465
            r0 = r72
            T r0 = r0.f27484d
            java.lang.String r0 = (java.lang.String) r0
            r16 = r0
            goto L_0x0467
        L_0x0465:
            r16 = r42
        L_0x0467:
            v0.j$a r0 = p721v0.C65503j.C65504a.f188490d
            r5 = 0
            v0.j r17 = p868x0.C111976a.m152678a(r0, r5)
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            r14.mo51557H(r0)
            boolean r0 = r14.mo51619x(r7)
            r5 = r57
            boolean r8 = r14.mo51619x(r5)
            r0 = r0 | r8
            r8 = r54
            boolean r9 = r14.mo51619x(r8)
            r0 = r0 | r9
            java.lang.Object r9 = r14.mo51606q()
            if (r0 != 0) goto L_0x049e
            if (r9 != r1) goto L_0x04a6
        L_0x049e:
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$d r9 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$d
            r9.<init>(r5, r8, r7)
            r14.mo51553F(r9)
        L_0x04a6:
            r14.mo51565P()
            r34 = r9
            fy3.l r34 = (fy3.C32226l) r34
            r35 = 0
            r0 = r2 | 48
            r0 = r0 | r4
            r0 = r0 | r6
            r37 = r0 | r3
            r38 = 0
            r39 = 49088(0xbfc0, float:6.8787E-41)
            r18 = r44
            r20 = r48
            r22 = r50
            r23 = r51
            r36 = r14
            p543h0.C107944f0.m146242c(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r14.mo51565P()
            r14.mo51565P()
            r14.mo51610s()
            r14.mo51565P()
            r14.mo51565P()
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r8 = r46
            r10 = r48
            r12 = r50
            r13 = r51
        L_0x04e6:
            j0.v1 r14 = r14.mo51596l()
            if (r14 != 0) goto L_0x04ed
            goto L_0x050a
        L_0x04ed:
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$e r2 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$e
            r0 = r2
            r1 = r60
            r58 = r2
            r2 = r61
            r59 = r14
            r14 = r52
            r15 = r75
            r16 = r76
            r17 = r77
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r16, r17)
            r1 = r58
            r0 = r59
            r0.mo51650a(r1)
        L_0x050a:
            return
        L_0x050b:
            p175j0.C108501g.m147000a()
            throw r23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI.mo149515H7(java.lang.String, v0.j, java.lang.String, java.lang.String, long, long, long, b2.o, b2.q, int, j0.h, int, int, int):void");
    }

    /* renamed from: L7 */
    public final EmoticonDesignerProfileIPExposeNewStruct mo149516L7() {
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        return ((C55627a) rVar.mo62444c(context).mo75002a(C55627a.class)).f158330e;
    }

    /* renamed from: M7 */
    public final TabLayout mo149517M7() {
        return (TabLayout) ((C36570n) this.f312435f).getValue();
    }

    /* renamed from: N7 */
    public final void mo149518N7(C101787i40 i402, C108504h hVar, int i) {
        C101787i40 i403 = i402;
        C87412m.m108594g(i403, "ipSet");
        C108504h z = hVar.mo51623z(1869509161);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        if (q == C108504h.C60656a.f172772a) {
            q = new C112528m();
            z.mo51553F(q);
        }
        z.mo51565P();
        C112527l lVar = (C112527l) q;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        float f = (float) 72;
        C65503j c = C111940o.m152650c(C103214y0.m136596l(aVar, f), lVar, (C111907e1) null, false, (String) null, (C111072h) null, new C93224h(this, i403), 28, (Object) null);
        C111294a.C37633b bVar = C111294a.C111295a.f333229k;
        z.mo51557H(-483455358);
        C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
        z.mo51557H(-1323940314);
        C60686v vVar = C103645l0.f306124e;
        C108322d dVar = (C108322d) z.mo51598m(vVar);
        C60686v vVar2 = C103645l0.f306130k;
        C33183o oVar = (C33183o) z.mo51598m(vVar2);
        C60686v vVar3 = C103645l0.f306134o;
        C103633i2 i2Var = (C103633i2) z.mo51598m(vVar3);
        C110269a.f329831D0.getClass();
        C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(c);
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar2);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
            C108508o2.m147049a(z, a, pVar);
            C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
            C108508o2.m147049a(z, dVar, pVar2);
            C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
            C108508o2.m147049a(z, oVar, pVar3);
            C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
            C108508o2.m147049a(z, i2Var, pVar4);
            z.mo51590i();
            ((C35747b) a2).invoke(new C33489x1(z), z, 0);
            z.mo51557H(2058660585);
            z.mo51557H(-1163856341);
            C65503j j = C103214y0.m136594j(aVar, f);
            C107073f fVar = C107074g.f320494a;
            C65503j a3 = C111979d.m152690a(j, fVar);
            C87412m.m108594g(a3, "<this>");
            C87412m.m108594g(lVar, "interactionSource");
            C65503j a4 = C111299g.m151786a(a3, C103612c1.f306063a, new C111916h1((C111907e1) z.mo51598m(C111912g1.f335027a), lVar));
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C65503j c2 = C111885b.m152607c(a4, C110954a.m151254b(C0966R.color.BW_97, context), (C103266t0) null, 2, (Object) null);
            C111294a aVar3 = C111294a.C111295a.f333222d;
            z.mo51557H(733328855);
            C109895y c3 = C103141f.m136472c(aVar3, false, z, 6);
            z.mo51557H(-1323940314);
            C108322d dVar2 = (C108322d) z.mo51598m(vVar);
            C33183o oVar2 = (C33183o) z.mo51598m(vVar2);
            C103633i2 i2Var2 = (C103633i2) z.mo51598m(vVar3);
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a5 = C109863q.m149330a(c2);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar2);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                C108508o2.m147049a(z, c3, pVar);
                C108508o2.m147049a(z, dVar2, pVar2);
                C108508o2.m147049a(z, oVar2, pVar3);
                C108508o2.m147049a(z, i2Var2, pVar4);
                z.mo51590i();
                ((C35747b) a5).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-2137368960);
                C101787i40 i404 = i402;
                String str = i404.f298383e;
                if (str == null) {
                    str = "";
                }
                C111897d1.m152617a(C65256e.m76829a(str, z, 0), "", C111979d.m152690a(C103214y0.m136594j(aVar, (float) 60), fVar), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, z, 56, 120);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
                StringBuilder sb = new StringBuilder();
                String str2 = i404.f298384f;
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(10);
                String sb4 = sb.toString();
                C65503j g = C103166l0.m136523g(aVar, 0.0f, (float) 8, 0.0f, 0.0f, 13, (Object) null);
                long F = ((C108322d) z.mo51598m(vVar)).mo143031F((float) 12);
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                C107944f0.m146242c(sb4, g, C110954a.m151254b(C0966R.color.FG_0_5, context2), F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, z, 3120, 3120, 55280);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
                C33487v1 l = z.mo51596l();
                if (l == null) {
                } else {
                    l.mo51650a(new C55623i(this, i404, i));
                }
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            C108501g.m147000a();
            throw null;
        }
    }

    /* renamed from: O7 */
    public final void mo149519O7(C49103d62 d622, byte[] bArr, boolean z) {
        if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            C54219z<EmojiStoreDesignerPackList> zVar = this.f312446t.f294839e;
            LinkedList<C101824o80> linkedList = d622.f132149i;
            C87412m.m108593f(linkedList, "designerData.EmotionList");
            zVar.setValue(new EmojiStoreDesignerPackList(linkedList, bArr));
            this.f312446t.f294840f.setValue(new C35378f(d622.f132151n, z));
            this.f312446t.f294838d.setValue(d622);
        } else {
            C54219z<EmojiStoreDesignerPackList> zVar2 = this.f312446t.f294839e;
            LinkedList<C101824o80> linkedList2 = d622.f132149i;
            C87412m.m108593f(linkedList2, "designerData.EmotionList");
            zVar2.postValue(new EmojiStoreDesignerPackList(linkedList2, bArr));
            this.f312446t.f294840f.postValue(new C35378f(d622.f132151n, z));
            this.f312446t.f294838d.postValue(d622);
        }
        ((C108494d2) this.f312443q).setValue(d622);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aj_;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> a = C22415w0.m26092a(C55627a.class);
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        return importUIComponents == null ? a : C48501y0.m53872g(a, importUIComponents);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2002 && i2 == -1) {
            C49103d62 value = this.f312446t.f294838d.getValue();
            C87412m.m108591d(intent);
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (Util.isNullOrNil(stringExtra) || value == null) {
                Log.m105924i(this.f312433d, "member or data is null.");
                return;
            }
            String str = this.f312433d;
            Log.m105918d(str, ".." + stringExtra);
            String str2 = this.f312439j;
            String str3 = value.f132146f;
            int i3 = this.f312437h;
            String str4 = this.f312441o;
            String str5 = value.f132147g;
            String string = getResources().getString(C0966R.string.f7947x4);
            ((C78541w) C86312j.m106911c(C78541w.class)).mo108483Em(this, stringExtra, string + str2, getString(C0966R.string.a2s), getString(C0966R.string.bja), str5, new C8860l(stringExtra, str2, str3, i3, str4, str2, str5, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            super.onCreate(r18)
            rx3.g r0 = r7.f312434e
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            androidx.compose.ui.platform.ComposeView r8 = new androidx.compose.ui.platform.ComposeView
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            r2 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$j r1 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$j
            r1.<init>(r7)
            r2 = -2001643122(0xffffffff88b1598e, float:-1.0673854E-33)
            r3 = 1
            q0.a r1 = p415q0.C110261c.m149879c(r2, r3, r1)
            r8.setContent(r1)
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r2 = -1
            r4 = -2
            r1.<init>(r2, r4)
            r0.addView(r8, r1)
            com.google.android.material.tabs.TabLayout r0 = r17.mo149517M7()
            rx3.g r1 = r7.f312436g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            r0.setupWithViewPager(r1)
            com.google.android.material.tabs.TabLayout r0 = r17.mo149517M7()
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$k r1 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$k
            r1.<init>(r7)
            r0.mo146882a(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.e r1 = f40.C86709a0.m107523b()
            java.lang.String r1 = r1.mo121111i()
            r0.append(r1)
            r1 = 95
            r0.append(r1)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f312448v = r0
            android.content.Intent r0 = r17.getIntent()
            r1 = 0
            java.lang.String r2 = "uin"
            int r0 = r0.getIntExtra(r2, r1)
            r7.f312437h = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = r7.f312438i
        L_0x0090:
            r7.f312438i = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "name"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = r7.f312439j
        L_0x00a0:
            r7.f312439j = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "rediret_url"
            java.lang.String r0 = r0.getStringExtra(r2)
            r7.f312441o = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "extra_scence"
            int r0 = r0.getIntExtra(r2, r1)
            r7.f312440n = r0
            android.content.Intent r0 = r17.getIntent()
            r4 = 0
            java.lang.String r2 = "searchID"
            r0.getLongExtra(r2, r4)
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r2 = "docID"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r2 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)
            java.lang.String r4 = "nullAs(intent.getStringE…UI.EXTRA_FTS_DOC_ID), \"\")"
            gy3.C87412m.m108593f(r0, r4)
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r4 = "sns_object_data"
            java.lang.String r0 = r0.getStringExtra(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0104
            int r5 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117474e(r0)
            r7.f312437h = r5
            java.lang.String r5 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117472c(r0)
            java.lang.String r6 = "getDesignerNameBySnsObjData(snsOjbectData)"
            gy3.C87412m.m108593f(r5, r6)
            r7.f312439j = r5
            java.lang.String r0 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117473d(r0)
            r7.f312441o = r0
        L_0x0104:
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r0 = r0.getStringExtra(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x012c
            int r4 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117474e(r0)
            r7.f312437h = r4
            java.lang.String r4 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117472c(r0)
            java.lang.String r5 = "getDesignerNameBySnsObjData(snsObjectData)"
            gy3.C87412m.m108593f(r4, r5)
            r7.f312439j = r4
            java.lang.String r0 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117473d(r0)
            java.lang.String r4 = "getDesignerRediretctUrlBySnsObjData(snsObjectData)"
            gy3.C87412m.m108593f(r0, r4)
        L_0x012c:
            a14.n0 r8 = com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt.getLifecycleScope((androidx.appcompat.app.AppCompatActivity) r17)
            r9 = 0
            r10 = 0
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l r11 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$l
            r4 = 0
            r11.<init>(r7, r4)
            r12 = 3
            r13 = 0
            a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
            r0 = 2131825011(0x7f111173, float:1.9282866E38)
            r7.setMMTitle((int) r0)
            android.content.res.Resources r0 = r17.getResources()
            r5 = 2131101833(0x7f060889, float:1.7816087E38)
            int r0 = r0.getColor(r5)
            r7.setActionbarColor(r0)
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$m r0 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$m
            r0.<init>(r7)
            r7.setBackBtn(r0)
            r0 = 2131756448(0x7f1005a0, float:1.9143804E38)
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$n r5 = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI$n
            r5.<init>(r7)
            r7.addIconOptionMenu(r1, r0, r5)
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.u r0 = r0.mo57720g()
            int r5 = r7.f312437h
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "MicroMsg.emoji.Storage"
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r0.f100795d
            java.lang.String[] r12 = new java.lang.String[r3]
            r12[r1] = r5
            r14 = 0
            r15 = 0
            r16 = 2
            java.lang.String r9 = "GetEmotionListCache"
            java.lang.String r11 = "reqType=?"
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r8 == 0) goto L_0x01c2
            boolean r0 = r8.moveToFirst()
            if (r0 == 0) goto L_0x01c2
            wh3.t r0 = new wh3.t
            r0.<init>(r8)
            te3.d62 r9 = new te3.d62     // Catch:{ IOException -> 0x01b4 }
            r9.<init>()     // Catch:{ IOException -> 0x01b4 }
            byte[] r0 = r0.field_cache     // Catch:{ IOException -> 0x01b4 }
            r9.parseFrom(r0)     // Catch:{ IOException -> 0x01b4 }
            java.lang.String r0 = "succed get designerID cache: %s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01b4 }
            r10[r1] = r5     // Catch:{ IOException -> 0x01b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r10)     // Catch:{ IOException -> 0x01b4 }
            goto L_0x01c3
        L_0x01b4:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5[r1] = r0
            java.lang.String r0 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r5)
        L_0x01c2:
            r9 = r4
        L_0x01c3:
            if (r8 == 0) goto L_0x01c8
            r8.close()
        L_0x01c8:
            if (r9 == 0) goto L_0x01d9
            r9.f132154q = r4
            j0.y0<java.util.List<te3.i40>> r0 = r7.f312444r
            java.util.LinkedList<te3.i40> r5 = r9.f132153p
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r5)
            r7.mo149519O7(r9, r4, r3)
            goto L_0x01e5
        L_0x01d9:
            te3.d62 r0 = new te3.d62
            r0.<init>()
            java.lang.String r5 = r7.f312439j
            r0.f132145e = r5
            r7.mo149519O7(r0, r4, r3)
        L_0x01e5:
            com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct r0 = r17.mo149516L7()
            java.lang.String r4 = r7.f312448v
            java.lang.String r5 = "sessionid"
            java.lang.String r4 = r0.mo86045b(r5, r4, r3)
            r0.f154993d = r4
            com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct r0 = r17.mo149516L7()
            int r4 = r7.f312437h
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "desUin"
            java.lang.String r4 = r0.mo86045b(r5, r4, r3)
            r0.f154996g = r4
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 12067(0x2f23, float:1.691E-41)
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r6[r1] = r8
            r6[r3] = r2
            r8 = 2
            r6[r8] = r2
            r9 = 3
            r6[r9] = r2
            r10 = 4
            r6[r10] = r2
            r0.mo160131h(r4, r6)
            r4 = 12740(0x31c4, float:1.7853E-41)
            r6 = 6
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r11[r1] = r12
            int r1 = r7.f312437h
            java.lang.String r1 = p823sg.C77710q.m93738a(r1)
            r11[r3] = r1
            r11[r8] = r2
            r11[r9] = r2
            int r1 = r7.f312440n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r11[r5] = r1
            r0.mo160131h(r4, r11)
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.EmojiStoreV2DesignerUI
            l31.e r0 = r0.mo86178qr(r7, r1)
            o31.a r1 = o31.C76986a.StickerGallery
            r0.mo86179qs(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C99146d dVar = C99146d.f290701a;
        C99146d.f290702b.mo126612s("");
        dVar.mo138515a(5);
    }
}
