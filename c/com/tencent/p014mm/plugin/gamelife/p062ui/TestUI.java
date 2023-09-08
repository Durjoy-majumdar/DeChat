package com.tencent.p014mm.plugin.gamelife.p062ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import cz1.C45230i;
import cz1.C7143c;
import di3.C7335d;
import di3.C86312j;
import dz1.C7569a;
import f40.C86709a0;
import f40.C86723g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import kotlin.Metadata;
import p192l4.C10462b;
import p215oo.C11586g;
import pe3.C89349b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C64197v;
import wy1.C53224d;
import xy1.C53472h;
import zy1.C16410a;
import zy1.C16411b;
import zy1.C16412c;
import zy1.C16413d;
import zy1.C16414e;
import zy1.C16415f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/TestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-gamelife_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI */
public final class TestUI extends MMActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f19335h = 0;

    /* renamed from: d */
    public String f19336d = "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife";

    /* renamed from: e */
    public String f19337e = "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife";

    /* renamed from: f */
    public boolean f19338f = true;

    /* renamed from: g */
    public final C13601g f19339g = C36568h.m40985a(new C4576a(this));

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$a */
    public static final class C4576a extends C87413o implements C32224a<C7569a> {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4576a(TestUI testUI) {
            super(0);
            this.f19340d = testUI;
        }

        public Object invoke() {
            View findViewById = this.f19340d.findViewById(C0966R.C0970id.mdg);
            int i = C0966R.C0970id.f357607aq1;
            Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.f357607aq1);
            if (button != null) {
                i = C0966R.C0970id.bdc;
                Button button2 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.bdc);
                if (button2 != null) {
                    i = C0966R.C0970id.bta;
                    Button button3 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.bta);
                    if (button3 != null) {
                        i = C0966R.C0970id.c1b;
                        Button button4 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.c1b);
                        if (button4 != null) {
                            i = C0966R.C0970id.c8r;
                            Button button5 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.c8r);
                            if (button5 != null) {
                                i = C0966R.C0970id.d2l;
                                Button button6 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.d2l);
                                if (button6 != null) {
                                    i = C0966R.C0970id.f358353em0;
                                    MMEditText mMEditText = (MMEditText) C10462b.m10395a(findViewById, C0966R.C0970id.f358353em0);
                                    if (mMEditText != null) {
                                        ScrollView scrollView = (ScrollView) findViewById;
                                        i = C0966R.C0970id.f358367ep2;
                                        Button button7 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.f358367ep2);
                                        if (button7 != null) {
                                            i = C0966R.C0970id.f358368ep3;
                                            Button button8 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.f358368ep3);
                                            if (button8 != null) {
                                                i = C0966R.C0970id.ep4;
                                                Button button9 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.ep4);
                                                if (button9 != null) {
                                                    i = C0966R.C0970id.ep_;
                                                    Button button10 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.ep_);
                                                    if (button10 != null) {
                                                        i = C0966R.C0970id.jbw;
                                                        Button button11 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.jbw);
                                                        if (button11 != null) {
                                                            i = C0966R.C0970id.jcr;
                                                            Button button12 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.jcr);
                                                            if (button12 != null) {
                                                                i = C0966R.C0970id.jcs;
                                                                Button button13 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.jcs);
                                                                if (button13 != null) {
                                                                    i = C0966R.C0970id.jcw;
                                                                    Button button14 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.jcw);
                                                                    if (button14 != null) {
                                                                        i = C0966R.C0970id.k0d;
                                                                        Button button15 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.k0d);
                                                                        if (button15 != null) {
                                                                            i = C0966R.C0970id.kzn;
                                                                            Button button16 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.kzn);
                                                                            if (button16 != null) {
                                                                                return new C7569a(scrollView, button, button2, button3, button4, button5, button6, mMEditText, scrollView, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$b */
    public static final class C4577b implements View.OnClickListener {

        /* renamed from: d */
        public static final C4577b f19341d = new C4577b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = TestUI.f19335h;
            Log.m105924i("MicroMsg.CgiTest", "setChatSessionData, sessionId = " + "S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess" + ", mask = " + 2 + ", switch = " + false);
            new C16415f("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", 2, false).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$c */
    public static final class C4578c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19342d;

        public C4578c(TestUI testUI) {
            this.f19342d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C11586g.class);
            C87412m.m108593f(c, "getService(ICgiBypService::class.java)");
            int i = TestUI.f19335h;
            TestUI testUI = this.f19342d;
            C86723g.this.f251779b.mo123460f(((C11586g) c).ht0(3, "S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", testUI.f19337e, testUI.f19336d, "this is the first gamelife text", -1));
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$d */
    public static final class C4579d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19343d;

        public C4579d(TestUI testUI) {
            this.f19343d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TestUI testUI = this.f19343d;
            Intent intent = new Intent(this.f19343d, GameLifeConversationUI.class);
            intent.putExtra("TEST", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            TestUI testUI2 = testUI;
            C117292a.m165358d(testUI2, aVar.mo10232b(), "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            testUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(testUI2, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$e */
    public static final class C4580e implements View.OnClickListener {

        /* renamed from: d */
        public static final C4580e f19344d = new C4580e();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C53224d) C86312j.m106911c(C53224d.class)).wx0();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$f */
    public static final class C4581f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19345d;

        public C4581f(TestUI testUI) {
            this.f19345d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C45230i zx02 = ((C53224d) C86312j.m106911c(C53224d.class)).zx0();
            for (int i = 0; i < 51; i++) {
                C7143c cVar = new C7143c();
                TestUI testUI = this.f19345d;
                cVar.field_sessionId = APMidasPayAPI.ENV_TEST + i;
                cVar.field_digest = "digest" + i;
                cVar.field_updateTime = System.currentTimeMillis();
                cVar.field_talker = "talker" + i;
                cVar.field_selfUserName = testUI.f19337e;
                zx02.insert(cVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$g */
    public static final class C4582g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19346d;

        public C4582g(TestUI testUI) {
            this.f19346d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TestUI testUI = this.f19346d;
            ((C53224d) C86312j.m106911c(C53224d.class)).mo73895WQ(testUI, testUI.f19337e, testUI.f19336d, 0, (C89349b) null, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$h */
    public static final class C4583h implements View.OnClickListener {

        /* renamed from: d */
        public static final C4583h f19347d = new C4583h();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C53472h) C86312j.m106911c(C53472h.class)).d50(((C7143c) ((LinkedList) ((C53224d) C86312j.m106911c(C53224d.class)).zx0().mo70734Xs(0, 1)).get(0)).field_sessionId);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$i */
    public static final class C4584i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19348d;

        public C4584i(TestUI testUI) {
            this.f19348d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TestUI testUI = this.f19348d;
            String str = testUI.f19337e;
            String str2 = testUI.f19336d;
            C87412m.m108594g(str, "fromUserName");
            C87412m.m108594g(str2, "toUserName");
            Log.m105924i("MicroMsg.CgiTest", "getChatSessionId, fromUsrName = " + str + " , toUserName = " + str2);
            new C16412c(str, str2, 0, (C89349b) null).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$j */
    public static final class C4585j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19349d;

        public C4585j(TestUI testUI) {
            this.f19349d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TestUI testUI = this.f19349d;
            LinkedList linkedList = new LinkedList(C64197v.m75537f(testUI.f19337e, testUI.f19336d));
            Log.m105924i("MicroMsg.CgiTest", "getChatUserInfo, userNameList = " + linkedList);
            new C16413d(linkedList).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$k */
    public static final class C4586k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19350d;

        public C4586k(TestUI testUI) {
            this.f19350d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = this.f19350d.f19336d;
            C87412m.m108594g(str, "userName");
            Log.m105924i("MicroMsg.CgiTest", "getBlackList, userName = " + str);
            new C16410a(str).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$l */
    public static final class C4587l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19351d;

        public C4587l(TestUI testUI) {
            this.f19351d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TestUI testUI = this.f19351d;
            String str = testUI.f19336d;
            boolean z = testUI.f19338f;
            C87412m.m108594g(str, "userName");
            Log.m105924i("MicroMsg.CgiTest", "setBlackList, userName = " + str + ", swith = " + z + ", associateWxGameAccount = " + false);
            new C16414e(str, z, false).mo9225i();
            TestUI testUI2 = this.f19351d;
            testUI2.f19338f = testUI2.f19338f ^ true;
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$m */
    public static final class C4588m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TestUI f19352d;

        public C4588m(TestUI testUI) {
            this.f19352d = testUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TestUI testUI = this.f19352d;
            String str = testUI.f19336d;
            boolean z = testUI.f19338f;
            C87412m.m108594g(str, "userName");
            Log.m105924i("MicroMsg.CgiTest", "setBlackList, userName = " + str + ", swith = " + z + ", associateWxGameAccount = " + true);
            new C16414e(str, z, true).mo9225i();
            TestUI testUI2 = this.f19352d;
            testUI2.f19338f = testUI2.f19338f ^ true;
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$n */
    public static final class C4589n implements View.OnClickListener {

        /* renamed from: d */
        public static final C4589n f19353d = new C4589n();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = TestUI.f19335h;
            LinkedList linkedList = new LinkedList(C26236u.m33719b("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess"));
            Log.m105924i("MicroMsg.CgiTest", "getSessionData, sesseionIdList = " + linkedList);
            new C16411b(linkedList).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$o */
    public static final class C4590o implements View.OnClickListener {

        /* renamed from: d */
        public static final C4590o f19354d = new C4590o();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = TestUI.f19335h;
            Log.m105924i("MicroMsg.CgiTest", "setChatSessionData, sessionId = " + "S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess" + ", mask = " + 1 + ", switch = " + true);
            new C16415f("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", 1, true).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$p */
    public static final class C4591p implements View.OnClickListener {

        /* renamed from: d */
        public static final C4591p f19355d = new C4591p();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = TestUI.f19335h;
            Log.m105924i("MicroMsg.CgiTest", "setChatSessionData, sessionId = " + "S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess" + ", mask = " + 1 + ", switch = " + false);
            new C16415f("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", 1, false).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelife.ui.TestUI$q */
    public static final class C4592q implements View.OnClickListener {

        /* renamed from: d */
        public static final C4592q f19356d = new C4592q();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = TestUI.f19335h;
            Log.m105924i("MicroMsg.CgiTest", "setChatSessionData, sessionId = " + "S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess" + ", mask = " + 2 + ", switch = " + true);
            new C16415f("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", 2, true).mo9225i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final C7569a mo5436H7() {
        return (C7569a) ((C36570n) this.f19339g).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ay6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String i = C86709a0.m107523b().mo121111i();
        if (C87412m.m108589b(i, "3193176932")) {
            this.f19337e = "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife";
            this.f19336d = "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife";
        } else if (C87412m.m108589b(i, "3191137690")) {
            this.f19337e = "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife";
            this.f19336d = "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife";
        }
        ((Button) findViewById(C0966R.C0970id.ep_)).setOnClickListener(new C4584i(this));
        ((Button) findViewById(C0966R.C0970id.ep4)).setOnClickListener(new C4585j(this));
        ((Button) findViewById(C0966R.C0970id.f358367ep2)).setOnClickListener(new C4586k(this));
        ((Button) findViewById(C0966R.C0970id.jcr)).setOnClickListener(new C4587l(this));
        ((Button) findViewById(C0966R.C0970id.jcs)).setOnClickListener(new C4588m(this));
        ((Button) findViewById(C0966R.C0970id.f358368ep3)).setOnClickListener(C4589n.f19353d);
        ((Button) findViewById(C0966R.C0970id.jcw)).setOnClickListener(C4590o.f19354d);
        ((Button) findViewById(C0966R.C0970id.kzn)).setOnClickListener(C4591p.f19355d);
        ((Button) findViewById(C0966R.C0970id.c8r)).setOnClickListener(C4592q.f19356d);
        ((Button) findViewById(C0966R.C0970id.f357607aq1)).setOnClickListener(C4577b.f19341d);
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.f358353em0);
        ((Button) findViewById(C0966R.C0970id.jbw)).setOnClickListener(new C4578c(this));
        mo5436H7().f25839b.setOnClickListener(new C4579d(this));
        mo5436H7().f25838a.setOnClickListener(C4580e.f19344d);
        mo5436H7().f25841d.setOnClickListener(new C4581f(this));
        mo5436H7().f25842e.setOnClickListener(new C4582g(this));
        mo5436H7().f25840c.setOnClickListener(C4583h.f19347d);
    }
}
