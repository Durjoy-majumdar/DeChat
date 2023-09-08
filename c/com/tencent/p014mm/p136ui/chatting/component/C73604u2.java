package com.tencent.p014mm.p136ui.chatting.component;

import a11.C39479c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContainer;
import ck3.C67391b;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.modelstat.ChattingOperationUitl;
import com.tencent.p014mm.p136ui.AppBrandNotifySettingsUI;
import com.tencent.p014mm.p136ui.C116183y1;
import com.tencent.p014mm.p136ui.C44701a2;
import com.tencent.p014mm.p136ui.C73247c;
import com.tencent.p014mm.p136ui.C74751d;
import com.tencent.p014mm.p136ui.C74753e;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.SingleChatInfoUI;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.conversation.banner.C74666h;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115624i;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import d62.C75339i;
import de3.C75370s;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75597w2;
import eb0.C97625j3;
import f40.C86709a0;
import gb0.C75896b;
import gb0.C75899c;
import gb0.C75900d;
import gb0.C75901e;
import gc2.C116945b;
import gc2.C75902d;
import go3.C76004e;
import gy3.C87412m;
import h81.C32735h;
import he0.C76158j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76626j0;
import ne0.C47224a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import p011cm.C39989b;
import p196ln.C10579k;
import p196ln.C76706g;
import p206nj.C76860a;
import p255vr.C65873e;
import p270xi.C91212b;
import p287zz.C79445i;
import p626nv.C109759g;
import p629ny.C76979h;
import p740wo.C53193b;
import p773yy.C79168k;
import qo3.C77407n;
import qy2.C47902u;
import qy2.C63347a;
import rb0.C47984k;
import te3.C51866wq2;
import te3.tg4;
import wd3.C78543a;
import wy1.C53224d;
import xd3.C78801a;
import xy1.C53474j;
import xy1.C53475k;
import yi3.C112467b;
import zj3.C79336a;
import zj3.C79343c0;
import zj3.C79348e;
import zj3.C79349e0;
import zj3.C79357g;
import zj3.C79361h0;
import zj3.C79363i;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79375p;
import zj3.C79376p0;
import zj3.C79377q;
import zj3.C79383u;
import zj3.C79384u0;
import zj3.C79387w;

@C91212b(exportInterface = C79343c0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.u2 */
public class C73604u2 extends C73412a implements C79343c0 {

    /* renamed from: A */
    public C75901e f216141A = new C73623j();

    /* renamed from: B */
    public final View.OnClickListener f216142B = new C44842k();

    /* renamed from: C */
    public final View.OnClickListener f216143C = new C44843l();

    /* renamed from: D */
    public MenuItem.OnMenuItemClickListener f216144D = new C73625m();

    /* renamed from: E */
    public View f216145E = null;

    /* renamed from: e */
    public LinearLayout f216146e;

    /* renamed from: f */
    public LinearLayout f216147f;

    /* renamed from: g */
    public LinearLayout f216148g;

    /* renamed from: h */
    public List<String> f216149h = new LinkedList();

    /* renamed from: i */
    public String f216150i;

    /* renamed from: j */
    public int f216151j = 0;

    /* renamed from: n */
    public ActionBarContainer f216152n = null;

    /* renamed from: o */
    public C116183y1 f216153o = null;

    /* renamed from: p */
    public C74753e f216154p;

    /* renamed from: q */
    public View f216155q;

    /* renamed from: r */
    public C73626n f216156r;

    /* renamed from: s */
    public boolean f216157s = false;

    /* renamed from: t */
    public boolean f216158t = false;

    /* renamed from: u */
    public final C44701a2 f216159u = new C73627o();

    /* renamed from: v */
    public C75896b.C75897a f216160v = new C73616f();

    /* renamed from: w */
    public Runnable f216161w = null;

    /* renamed from: x */
    public final C10579k.C10580a f216162x = new C73618g();

    /* renamed from: y */
    public final MStorage.IOnStorageChange f216163y = new C73620h();

    /* renamed from: z */
    public C75901e f216164z = new C73621i();

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$k */
    public class C44842k implements View.OnClickListener {
        public C44842k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/HeaderComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C72996z1.m85846q5(C73604u2.this.f215752d.mo91577r())) {
                Intent intent = new Intent();
                intent.putExtra("Contact_User", C73604u2.this.f215752d.mo91577r());
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 2);
                C88144b.m109795m(C73604u2.this.f215752d.mo91565f(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
                C47224a.m52531b(C73604u2.this.f215752d.mo91577r(), 4, 0);
            } else if (C72996z1.m85799F5(C73604u2.this.f215752d.mo91577r())) {
                ((C47902u) C86312j.m106911c(C47902u.class)).A80(C73604u2.this.f215752d.mo91565f(), C73604u2.this.f215752d.mo91577r());
            } else {
                C73604u2.m87048Z5(C73604u2.this);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$l */
    public class C44843l implements View.OnClickListener {
        public C44843l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/HeaderComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((C79168k) C86312j.m106911c(C79168k.class)).mo74105BS(C73604u2.this.f215752d.mo91574o().getUsername())) {
                C73604u2.m87048Z5(C73604u2.this);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$a */
    public class C73605a extends C44701a2 {

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$a$a */
        public class C73606a implements C11182m0 {
            public C73606a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                C73605a.this.getClass();
                e0Var.mo107142f(1, C73604u2.this.f215752d.mo91565f().getString(C0966R.string.b7n));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$a$b */
        public class C73607b implements C11184p0 {
            public C73607b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                C73605a.this.getClass();
                if (itemId == 1) {
                    Intent intent = new Intent();
                    intent.putExtra("k_username", C73604u2.this.f215752d.mo91577r());
                    intent.putExtra("showShare", false);
                    intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{36}));
                    C88144b.m109791i(C73604u2.this.f215752d.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }

        public C73605a() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) C73604u2.this.f215752d.mo91565f(), 1, true);
            nVar.f225771i = new C73606a();
            nVar.f225782p = new C73607b();
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$b */
    public class C73608b implements View.OnClickListener {
        public C73608b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/HeaderComponent$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C73604u2.m87047Y5(C73604u2.this);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$c */
    public class C73609c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f216169d;

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$c$a */
        public class C73610a implements C39989b.C0705b {
            public C73610a() {
            }

            /* renamed from: a */
            public void mo677a(boolean z, boolean z2, String str, String str2) {
                if (z) {
                    C45628s0.m50775g0(C73604u2.this.f215752d.mo91574o());
                    C73609c.this.f216169d.setVisibility(8);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$c$b */
        public class C73611b implements C75597w2.C31525a {

            /* renamed from: a */
            public final /* synthetic */ String f216172a;

            /* renamed from: com.tencent.mm.ui.chatting.component.u2$c$b$a */
            public class C73612a implements C39989b.C0705b {
                public C73612a() {
                }

                /* renamed from: a */
                public void mo677a(boolean z, boolean z2, String str, String str2) {
                    if (z) {
                        C45628s0.m50775g0(C73604u2.this.f215752d.mo91574o());
                        C73609c.this.f216169d.setVisibility(8);
                    }
                }
            }

            public C73611b(String str) {
                this.f216172a = str;
            }

            /* renamed from: a */
            public void mo1109a(String str, boolean z) {
                C78543a aVar = new C78543a(C73604u2.this.f215752d.mo91565f(), new C73612a());
                LinkedList linkedList = new LinkedList();
                linkedList.add(3);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(C73604u2.this.f216150i);
                String str2 = "";
                if (z1Var != null) {
                    str2 = Util.nullAs(z1Var.f149527Z0, str2);
                }
                aVar.mo108509l(str2);
                aVar.f230054z = true;
                aVar.mo108500a(C73604u2.this.f216150i, this.f216172a, linkedList);
            }
        }

        public C73609c(LinearLayout linearLayout) {
            this.f216169d = linearLayout;
        }

        public void onClick(View view) {
            Class cls = C79349e0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/HeaderComponent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((C79349e0) C73604u2.this.f215752d.f193278b.mo102812a(cls)).mo102241i1()) {
                ((C79349e0) C73604u2.this.f215752d.f193278b.mo102812a(cls)).mo102239Y1(C73604u2.this.f216151j);
            } else {
                if (((int) C73604u2.this.f215752d.mo91574o().f108320R1) == 0 && C97625j3.m125812b().mo105907v().mo69707j3(C73604u2.this.f215752d.mo91574o()) != -1) {
                    Log.m105921e("MicroMsg.ChattingUI.HeaderComponent", "[insertRetId] successfully! username:%s", C73604u2.this.f215752d.mo91574o());
                }
                String str = "";
                String username = C72996z1.m85820U5(C73604u2.this.f215752d.mo91574o().getUsername()) ? C73604u2.this.f215752d.mo91574o().getUsername() : str;
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(C73604u2.this.f216150i);
                if (z1Var != null) {
                    str = Util.nullAs(z1Var.f149527Z0, str);
                }
                Log.m105925i("MicroMsg.ChattingUI.HeaderComponent", "dkverify banner add:%s chat:%s ticket", C73604u2.this.f216150i, username, str);
                if ((TextUtils.isEmpty(username) || !TextUtils.isEmpty(str)) && !C72996z1.m85843n5(z1Var.getUsername())) {
                    C78543a aVar = new C78543a(C73604u2.this.f215752d.mo91565f(), new C73610a());
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(3);
                    aVar.mo108509l(str);
                    aVar.f230054z = true;
                    aVar.mo108500a(C73604u2.this.f216150i, username, linkedList);
                } else {
                    C31519v2.m39436a().mo55988e(C73604u2.this.f216150i, username, new C73611b(username));
                }
                C115669n.INSTANCE.mo160131h(11004, C73604u2.this.f216150i, 3);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$d */
    public class C73613d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MenuItem.OnMenuItemClickListener f216175d;

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$d$a */
        public class C73614a implements Runnable {
            public C73614a() {
            }

            public void run() {
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = C73613d.this.f216175d;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick((MenuItem) null);
                }
            }
        }

        public C73613d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f216175d = onMenuItemClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/HeaderComponent$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C73604u2.this.f215752d.f193286j.isScreenEnable()) {
                Log.m105928w("MicroMsg.ChattingUI.HeaderComponent", "Actionbar customView onclick screen not enable");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            view.setSelected(false);
            view.setPressed(false);
            view.clearFocus();
            view.invalidate();
            view.post(new C73614a());
            ((C79376p0) C73604u2.this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102690P();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$e */
    public class C73615e implements C75902d.C75903a {
        public C73615e() {
        }

        /* renamed from: a */
        public void mo102635a() {
            Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "onCallback");
            C73604u2.this.mo102628n3();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$f */
    public class C73616f implements C75896b.C75897a {

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$f$a */
        public class C73617a implements Runnable {
            public C73617a() {
            }

            public void run() {
                if (C97625j3.m125812b().mo105903r().mo106165d(C75896b.C75898b.Chatting)) {
                    C73604u2.this.mo102612a6();
                } else {
                    C73604u2.this.mo102619f6();
                }
            }
        }

        public C73616f() {
        }

        /* renamed from: a */
        public void mo102636a() {
            C73604u2.this.f215752d.mo91571l().post(new C73617a());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$g */
    public class C73618g implements C10579k.C10580a {

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$g$a */
        public class C73619a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f216182d;

            public C73619a(String str) {
                this.f216182d = str;
            }

            public void run() {
                if (!Util.isNullOrNil(C73604u2.this.f216150i) && !Util.isNullOrNil(this.f216182d) && this.f216182d.equals(C73604u2.this.f216150i)) {
                    C73604u2.this.mo102623k3(false);
                }
            }
        }

        public C73618g() {
        }

        /* renamed from: X */
        public void mo1428X(String str) {
            C73604u2.this.f215752d.mo91571l().removeCallbacks(C73604u2.this.f216161w);
            MMHandler l = C73604u2.this.f215752d.mo91571l();
            C73604u2 u2Var = C73604u2.this;
            C73619a aVar = new C73619a(str);
            u2Var.f216161w = aVar;
            l.postDelayed(aVar, 1000);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$h */
    public class C73620h implements MStorage.IOnStorageChange {
        public C73620h() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105926v("MicroMsg.ChattingUI.HeaderComponent", "roommember watcher notify " + str);
            if (C73604u2.this.f215752d.mo91583x() && !Util.isNullOrNil(str) && str.equals(C73604u2.this.f215752d.mo91577r())) {
                C73604u2.this.mo102611a();
                C73604u2.this.mo102628n3();
                C73604u2.this.getClass();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$i */
    public class C73621i implements C75901e {

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$i$a */
        public class C73622a implements Runnable {
            public C73622a() {
            }

            public void run() {
                C73604u2.this.mo102614b6();
            }
        }

        public C73621i() {
        }

        /* renamed from: a */
        public void mo102639a(boolean z) {
            C73604u2.this.f215752d.mo91571l().post(new C73622a());
        }

        /* renamed from: b */
        public void mo102640b() {
            C73604u2.this.mo102617d6();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$j */
    public class C73623j implements C75901e {

        /* renamed from: com.tencent.mm.ui.chatting.component.u2$j$a */
        public class C73624a implements Runnable {
            public C73624a() {
            }

            public void run() {
                C73604u2.this.getClass();
            }
        }

        public C73623j() {
        }

        /* renamed from: a */
        public void mo102639a(boolean z) {
            C73604u2.this.f215752d.mo91571l().post(new C73624a());
        }

        /* renamed from: b */
        public void mo102640b() {
            ViewGroup viewGroup = (ViewGroup) C73604u2.this.f215752d.mo91565f().findViewById(C0966R.C0970id.b49);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$m */
    public class C73625m implements MenuItem.OnMenuItemClickListener {
        public C73625m() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C73604u2.this.f215752d.f193280d.mo102427O5();
            return C73604u2.this.f215752d.mo91563d();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$n */
    public class C73626n implements C115619a {

        /* renamed from: d */
        public View f216190d;

        /* renamed from: e */
        public boolean f216191e = false;

        /* renamed from: f */
        public int f216192f;

        /* renamed from: g */
        public String f216193g;

        public C73626n(int i, String str, MMActivityController.C116044q qVar) {
            this.f216190d = new View(C73604u2.this.f215752d.mo91565f());
            this.f216192f = i;
            this.f216193g = str;
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f216190d;
        }

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            this.f216191e = z;
            C73604u2.this.f215752d.f193286j.updateOptionMenuRedDot(this.f216192f, z);
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            return false;
        }

        public String getPath() {
            return this.f216193g;
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            return false;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
            C115624i.m162566b(this, nVar, z);
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return C115624i.m162576l(z, this);
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u2$o */
    public class C73627o extends C44701a2 {
        public C73627o() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            String str;
            if (C73604u2.this.f215752d.f193286j.getBooleanExtra("KIsHalfScreen", false).booleanValue()) {
                C73604u2 u2Var = C73604u2.this;
                u2Var.f216157s = true;
                String r = u2Var.f215752d.mo91577r();
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69768h0(r);
                ChattingOperationUitl.f48963f.mo21924g(true, r, true);
                C40359h0.m43530l1(r, 13);
                C73604u2.this.f215752d.f193280d.mo102428P5();
                C73604u2.this.f215752d.mo91563d();
                C76912y0.m92769h(C73604u2.this.f215752d.mo91565f(), C73604u2.this.f215752d.mo91572m().getString(C0966R.string.n0n), C0966R.raw.icons_outlined_done);
                return;
            }
            if (!((C79376p0) C73604u2.this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102691S()) {
                if (C72996z1.m85847r5(C73604u2.this.f215752d.mo91577r())) {
                    OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new OpenIMChatRoomLogStruct();
                    openIMChatRoomLogStruct.mo93194s(C73604u2.this.f215752d.mo91577r());
                    openIMChatRoomLogStruct.f194303e = 4;
                    openIMChatRoomLogStruct.mo86054n();
                }
                C73626n nVar = C73604u2.this.f216156r;
                if (nVar != null && nVar.f216191e) {
                    ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(25);
                }
                if (C72996z1.m85824W5(C73604u2.this.f215752d.mo91577r())) {
                    C115669n.INSTANCE.mo160131h(19540, 2);
                }
                C73604u2.this.f215752d.mo91578s();
                if (C72996z1.m85806K4(C73604u2.this.f215752d.mo91577r())) {
                    Intent intent = new Intent(C73604u2.this.f215752d.mo91565f(), AppBrandNotifySettingsUI.class);
                    C76626j0 j0Var = (C76626j0) C86312j.m106911c(C76626j0.class);
                    if (j0Var != null) {
                        str = j0Var.hk0();
                        intent.putExtra("report_session_id", str);
                    } else {
                        str = null;
                    }
                    Activity f = C73604u2.this.f215752d.mo91565f();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Activity activity = f;
                    C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/HeaderComponent$OptionListener", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    f.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/component/HeaderComponent$OptionListener", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C115669n.INSTANCE.mo160131h(19724, 1, 6, 0, 0, 0, null, 0, 0, 0, null, null, null, null, 0, null, null, 0, null, null, str);
                } else if (C45628s0.m50741F(C73604u2.this.f215752d.mo91577r())) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", C73604u2.this.f215752d.mo91577r());
                    C88144b.m109791i(C73604u2.this.f215752d.mo91565f(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                } else {
                    if (((C79349e0) C73604u2.this.f215752d.f193278b.mo102812a(C79349e0.class)).mo102241i1()) {
                        C73604u2.m87047Y5(C73604u2.this);
                    } else if (!C72996z1.m85822V5(C73604u2.this.f215752d.mo91577r()) || menuItem.getItemId() != 4) {
                        if (!((C79348e) C73604u2.this.f215752d.f193278b.mo102812a(C79348e.class)).mo70050F1()) {
                            if (((C79366k) C73604u2.this.f215752d.f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                                C53224d dVar = (C53224d) C86312j.m106911c(C53224d.class);
                                String r2 = C73604u2.this.f215752d.mo91577r();
                                dVar.getClass();
                                if (r2 == null || r2.length() == 0) {
                                    Log.m105920e("GameLife.PluginGameLife", "jumpToGameLifeSingleChatInfoUI sessionId null!");
                                } else {
                                    C53474j G2 = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(r2);
                                    String t = G2.mo59157t();
                                    String t1 = G2.mo59158t1();
                                    C87412m.m108593f(t1, "selfUserName");
                                    dVar.Dx0(1, 6, t1, r2, t, (String) null);
                                }
                            }
                            if (((C79377q) C73604u2.this.f215752d.f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                                ((C47902u) C86312j.m106911c(C47902u.class)).mo72655dS(C73604u2.this.f215752d.mo91577r(), 153);
                            }
                            if (C72996z1.m85846q5(C73604u2.this.f215752d.mo91577r())) {
                                C47224a.m52531b(C73604u2.this.f215752d.mo91577r(), 5, 0);
                            }
                            Intent intent3 = new Intent();
                            intent3.setClass(C73604u2.this.f215752d.mo91565f(), SingleChatInfoUI.class);
                            intent3.putExtra("Single_Chat_Talker", C73604u2.this.f215752d.mo91577r());
                            intent3.putExtra("fromChatting", true);
                            BaseChattingUIFragment baseChattingUIFragment = C73604u2.this.f215752d.f193286j;
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent3);
                            BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
                            C117292a.m165358d(baseChattingUIFragment2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/HeaderComponent$OptionListener", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            baseChattingUIFragment.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/HeaderComponent$OptionListener", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    } else if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_open_wxpay_search, false)) {
                        Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "clicfg_android_open_wxpay_search is open3");
                        ((C79445i) C86312j.m106911c(C79445i.class)).mo109191mN(3, 1, C73604u2.this.f215752d.f193286j.getString(C0966R.string.k3j), "");
                        Intent intent4 = new Intent();
                        intent4.putExtra("detail_username", C73604u2.this.f215752d.mo91577r());
                        intent4.putExtra("Search_Scene", 5);
                        ((C65873e) C86312j.m106911c(C65873e.class)).mo89915LO(C73604u2.this.f215752d.mo91565f(), ".ui.FTSWXPayNotifyUI", intent4);
                        C115669n.INSTANCE.mo160131h(27229, 1, 2, "", 0, 0, 0);
                    }
                }
            }
        }
    }

    /* renamed from: Y5 */
    public static void m87047Y5(C73604u2 u2Var) {
        Class cls = C79349e0.class;
        String username = Util.isNullOrNil(u2Var.f216150i) ? u2Var.f215752d.mo91574o().getUsername() : u2Var.f216150i;
        if (username != null && !username.equals("")) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", username);
            intent.putExtra("Contact_Encryptusername", true);
            int i = 2;
            if (!((C79349e0) u2Var.f215752d.f193278b.mo102812a(cls)).mo102241i1()) {
                C115669n.INSTANCE.mo160131h(11004, u2Var.f216150i, 2);
            } else {
                ((C79349e0) u2Var.f215752d.f193278b.mo102812a(cls)).mo102238U3(intent);
            }
            if (u2Var.f215752d.mo91583x()) {
                i = 3;
            }
            intent.putExtra("CONTACT_INFO_UI_SOURCE", i);
            C88144b.m109791i(u2Var.f215752d.mo91565f(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: Z5 */
    public static void m87048Z5(C73604u2 u2Var) {
        u2Var.getClass();
        Class cls = C79168k.class;
        ((C79168k) C86312j.m106911c(cls)).mo74114Mg(u2Var.f215752d.mo91565f(), u2Var.f215752d.mo91574o().getUsername());
        C67391b bVar = u2Var.f215752d;
        if (!(bVar != null && bVar.mo91583x())) {
            ((C79168k) C86312j.m106911c(cls)).mo74109HD(u2Var.f215752d.mo91574o().getUsername(), 2);
        }
    }

    /* renamed from: A4 */
    public void mo102599A4() {
        if (!this.f215752d.f193286j.hasDestory) {
            if (this.f216146e != null) {
                mo102617d6();
            }
            if (!(this.f215752d.mo91564e() == null || this.f215752d.mo91572m() == null)) {
                this.f215752d.mo91564e().mo177081j0(this.f215752d.mo91572m().getColor(C0966R.color.f2929c));
            }
            ActionBar supportActionBar = ((AppCompatActivity) this.f215752d.mo91565f()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo91089G(0.0f);
            }
            if (this.f216148g == null) {
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.l96);
                this.f216148g = (LinearLayout) this.f215752d.mo91565f().findViewById(C0966R.C0970id.e_l);
            }
            this.f216148g.removeAllViews();
            LinearLayout linearLayout = (LinearLayout) this.f215752d.mo91565f().getLayoutInflater().inflate(C0966R.C0971layout.f6979ty, (ViewGroup) null);
            this.f216148g.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
            this.f216148g.setVisibility(0);
            linearLayout.setVisibility(0);
            ((C79375p) this.f215752d.f193278b.mo102812a(C79375p.class)).mo70124x3(this.f216148g);
        }
    }

    /* renamed from: B1 */
    public void mo102600B1() {
        ActionBar actionBar;
        Class cls = C79365j.class;
        BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
        if (baseChattingUIFragment.isCurrentActivity || !baseChattingUIFragment.isSupportNavigationSwipeBack()) {
            actionBar = C76004e.m91288N(((AppCompatActivity) this.f215752d.mo91565f()).getSupportActionBar());
            View e6 = mo102618e6((ViewGroup) null);
            actionBar.mo91114y(e6);
            if (((C79365j) this.f215752d.f193278b.mo102812a(cls)).mo70105e4()) {
                this.f215752d.mo91564e().mo177084l0(this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3813z3), true);
                View findViewById = e6.findViewById(C0966R.C0970id.k9n);
                int dimensionPixelSize = this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3766df);
                findViewById.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            this.f216154p = new C74753e(e6);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f216152n.findViewById(C0966R.C0970id.f5380dl);
            Log.m105925i("MicroMsg.ChattingUI.HeaderComponent", "mActionBarContainer %s", this.f216152n);
            Log.m105925i("MicroMsg.ChattingUI.HeaderComponent", "ctxView %s", this.f216152n.findViewById(C0966R.C0970id.f5400e4));
            viewGroup.setVisibility(0);
            actionBar = C76004e.m91288N(this.f216153o.mo177037B());
            View e64 = mo102618e6(viewGroup);
            actionBar.mo91114y(e64);
            this.f216154p = new C74753e(e64);
            int l = actionBar.mo91101l();
            if (l == 0) {
                DisplayMetrics displayMetrics = this.f215752d.mo91572m().getDisplayMetrics();
                l = displayMetrics.widthPixels > displayMetrics.heightPixels ? this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3678b8) : this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3679b9);
            }
            View findViewById2 = e64.findViewById(C0966R.C0970id.k9n);
            if (findViewById2 != null) {
                if (((C79365j) this.f215752d.f193278b.mo102812a(cls)).mo70105e4()) {
                    l = this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3813z3);
                    int dimensionPixelSize2 = this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3766df);
                    findViewById2.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                    viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                } else {
                    findViewById2.setPadding(0, 0, 0, 0);
                    viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3679b9)));
                }
            }
            e64.setMinimumHeight(l);
            ViewGroup.LayoutParams layoutParams = e64.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            layoutParams.height = l;
            layoutParams.width = -1;
            e64.setLayoutParams(layoutParams);
        }
        boolean z = C85875k4.m106211z();
        if (actionBar.mo91099j() != null) {
            ImageView imageView = (ImageView) actionBar.mo91099j().findViewById(C0966R.C0970id.f6148yn);
            if (imageView != null && z) {
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                } else {
                    imageView.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                }
            }
            TextView textView = (TextView) actionBar.mo91099j().findViewById(C0966R.C0970id.ko4);
            if (textView != null) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                if (z) {
                    textView.setTextColor(this.f215752d.mo91572m().getColor(C0966R.color.f3022ch));
                }
            }
            TextView textView2 = (TextView) actionBar.mo91099j().findViewById(C0966R.C0970id.k9n);
            if (textView2 != null && z) {
                textView2.setTextColor(this.f215752d.mo91572m().getColor(C0966R.color.f3022ch));
            }
            ImageView imageView2 = (ImageView) actionBar.mo91099j().findViewById(C0966R.C0970id.h7k);
            if (imageView2 != null && z) {
                if (imageView2.getDrawable() != null) {
                    imageView2.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                } else {
                    imageView2.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                }
            }
            ImageView imageView3 = (ImageView) actionBar.mo91099j().findViewById(C0966R.C0970id.huv);
            if (imageView3 != null && z) {
                if (imageView3.getDrawable() != null) {
                    imageView3.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                } else {
                    imageView3.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                }
            }
        }
        this.f216154p.f219812n.setVisibility(8);
        actionBar.mo91085C((actionBar.mo91100k() | 16) & -5 & -3 & -9);
        ((LinkedList) this.f216149h).clear();
        ((LinkedList) this.f216149h).add(this.f215752d.f193286j.getStringExtra("Chat_User"));
        mo102610S3(this.f216144D);
    }

    /* renamed from: E4 */
    public void mo102601E4() {
        int j;
        Class cls = C79376p0.class;
        if (this.f215752d.mo91568i() > 0) {
            this.f216146e = (LinearLayout) this.f215752d.mo91570k().mo81291N(C0966R.C0970id.fp7);
        } else {
            LinearLayout linearLayout = (LinearLayout) this.f215752d.mo91565f().getLayoutInflater().inflate(C0966R.C0971layout.f6978tx, (ViewGroup) null);
            this.f216146e = linearLayout;
            ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().addHeaderView(linearLayout);
        }
        if (((C79376p0) this.f215752d.f193278b.mo102812a(cls)).mo102698q2() && this.f215752d.mo91570k().getFooterViewsCount() == 0) {
            this.f216147f = (LinearLayout) this.f215752d.mo91565f().getLayoutInflater().inflate(C0966R.C0971layout.f6975tu, (ViewGroup) null);
            this.f215752d.mo91570k().addFooterView(this.f216147f);
            if (((C79376p0) this.f215752d.f193278b.mo102812a(cls)).mo102689I2() && (j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SELECT_RECORD_FOOT_VIEW_HEIGHT_INT_SYNC, 0)) != 0) {
                View N = this.f215752d.mo91570k().mo81291N(C0966R.C0970id.fp6);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) N.getLayoutParams();
                layoutParams.height = j;
                N.setLayoutParams(layoutParams);
            }
        }
        mo102617d6();
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C97625j3.m125812b().mo105904s().mo106155a(this.f216164z);
        C97625j3.m125812b().mo105905t().mo106155a(this.f216141A);
        C75896b r = C97625j3.m125812b().mo105903r();
        C75896b.C75897a aVar = this.f216160v;
        r.getClass();
        synchronized (C75896b.class) {
            r.f222574a.add(aVar);
        }
        if (!this.f216158t) {
            mo102616c6();
        }
        this.f216158t = false;
    }

    /* renamed from: F5 */
    public void mo102602F5() {
        Class cls = C79349e0.class;
        if (!this.f215752d.f193286j.hasDestory) {
            mo102617d6();
            if (this.f216148g == null) {
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.l96);
                this.f216148g = (LinearLayout) this.f215752d.mo91565f().findViewById(C0966R.C0970id.e_l);
            }
            this.f216148g.removeAllViews();
            LinearLayout linearLayout = (LinearLayout) this.f215752d.mo91565f().getLayoutInflater().inflate(C0966R.C0971layout.f6976tv, (ViewGroup) null);
            this.f216148g.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
            this.f216148g.setVisibility(0);
            linearLayout.setVisibility(0);
            if (Util.isNullOrNil(this.f216150i)) {
                this.f215752d.mo91574o().getClass();
            }
            Button button = (Button) linearLayout.findViewById(C0966R.C0970id.b1j);
            if (((C79349e0) this.f215752d.f193278b.mo102812a(cls)).mo102241i1()) {
                ((C79349e0) this.f215752d.f193278b.mo102812a(cls)).mo102240a0(button, linearLayout, this.f216148g);
            }
            linearLayout.setOnClickListener(new C73608b());
            button.setOnClickListener(new C73609c(linearLayout));
            C115669n.INSTANCE.mo160131h(11004, this.f216150i, 1);
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (C86709a0.m107523b().mo121114l()) {
            C75899c s = C97625j3.m125812b().mo105904s();
            ((ArrayList) s.f222571a).remove(this.f216164z);
            C75900d t = C97625j3.m125812b().mo105905t();
            ((ArrayList) t.f222571a).remove(this.f216141A);
            C75896b r = C97625j3.m125812b().mo105903r();
            C75896b.C75897a aVar = this.f216160v;
            r.getClass();
            synchronized (C75896b.class) {
                r.f222574a.remove(aVar);
            }
        }
    }

    /* renamed from: I0 */
    public void mo102603I0(int i) {
        mo102629o0(this.f215752d.mo91572m().getString(i));
    }

    /* renamed from: I1 */
    public void mo102604I1(SpannableString spannableString) {
        this.f216154p.mo103919b(spannableString);
    }

    /* renamed from: J0 */
    public ImageView mo102605J0() {
        return this.f216154p.f219814p;
    }

    /* renamed from: J3 */
    public void mo102606J3(View view) {
        Log.m105918d("MicroMsg.ChattingUI.HeaderComponent", "dealContentView");
        if (this.f215752d.f193286j.isSupportNavigationSwipeBack()) {
            if (this.f216152n == null) {
                this.f216152n = (ActionBarContainer) ((ViewStub) view.findViewById(C0966R.C0970id.b4h)).inflate();
            }
            this.f216153o.f348690u0.f336740i = (ViewGroup) view;
        }
    }

    /* renamed from: J4 */
    public void mo102607J4(int i) {
        int i2 = 8;
        if (C72996z1.m85840k5(this.f215752d.mo91577r()) || C72996z1.m85806K4(this.f215752d.mo91577r())) {
            this.f216154p.f219809k.setVisibility(8);
            return;
        }
        C74753e eVar = this.f216154p;
        boolean z = i == 0;
        ImageView imageView = eVar.f219809k;
        if (z) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    /* renamed from: N1 */
    public int mo102608N1() {
        ActionBar actionBar;
        BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
        if (baseChattingUIFragment.isCurrentActivity || !baseChattingUIFragment.isSupportNavigationSwipeBack()) {
            ((AppCompatActivity) this.f215752d.mo91565f()).getSupportActionBar().mo91115z(mo102618e6((ViewGroup) null), new ActionBar.LayoutParams(-1, -1));
            actionBar = ((AppCompatActivity) this.f215752d.mo91565f()).getSupportActionBar();
        } else {
            actionBar = this.f216153o.mo177037B();
        }
        if (actionBar == null || actionBar.mo91099j() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        actionBar.mo91099j().getLocationOnScreen(iArr);
        return actionBar.mo91101l() + iArr[1] + mo102630x();
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f216151j = this.f215752d.f193286j.getIntExtra("add_scene", 0);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this.f216162x);
        C97625j3.m125812b().mo105902q().add(this.f216163y);
        mo102610S3(this.f216144D);
        mo102616c6();
        mo102611a();
        mo102628n3();
        mo102617d6();
        this.f216158t = true;
        String r = this.f215752d.mo91577r();
        C73615e eVar = new C73615e();
        if (!C45612m0.m50704u() || Util.isNullOrNil(r)) {
            return;
        }
        if (MultiProcessMMKV.getMMKV("room_upgrade_to_wework").getBoolean(r, false)) {
            Log.m105921e("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom %s member isHandle", r);
            return;
        }
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(r);
        if (Lo == null) {
            Log.m105921e("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom %s member is null", r);
            return;
        }
        C45612m0.m50701r(r, Lo.field_roomowner, Lo.field_memberCount, Lo.field_chatroomStatus, eVar);
    }

    /* renamed from: P2 */
    public void mo102609P2(boolean z, View.OnClickListener onClickListener, String str) {
        C74753e eVar = this.f216154p;
        if (onClickListener == null) {
            eVar.getClass();
            Log.m105928w("MicroMsg.ActionBarCustomArea", "setMMTitleGotoBtn, onClickListener is null");
            return;
        }
        if (!z) {
            eVar.f219805g.setVisibility(0);
            eVar.f219805g.setIconColor(eVar.f219802d.getCurrentTextColor());
            eVar.f219805g.setContentDescription(str);
            eVar.f219804f.setOnClickListener(onClickListener);
            C7007c1.m7256a(eVar.f219804f);
            eVar.f219808j.setVisibility(8);
            eVar.f219807i.setOnClickListener((View.OnClickListener) null);
            eVar.f219807i.setClickable(false);
            eVar.f219807i.setFocusable(true);
            ViewGroup viewGroup = eVar.f219807i;
            if (viewGroup != null) {
                viewGroup.setOnTouchListener((View.OnTouchListener) null);
            }
        } else {
            eVar.f219808j.setVisibility(0);
            eVar.f219808j.setIconColor(eVar.f219806h.getCurrentTextColor());
            eVar.f219808j.setContentDescription(str);
            eVar.f219807i.setOnClickListener(onClickListener);
            C7007c1.m7256a(eVar.f219807i);
            eVar.f219805g.setVisibility(8);
            eVar.f219804f.setOnClickListener((View.OnClickListener) null);
            eVar.f219804f.setClickable(false);
            eVar.f219804f.setFocusable(true);
            ViewGroup viewGroup2 = eVar.f219804f;
            if (viewGroup2 != null) {
                viewGroup2.setOnTouchListener((View.OnTouchListener) null);
            }
        }
        Log.m105918d("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, forSubTitle: " + z);
        if (!z) {
            eVar.f219802d.post(new C73247c(eVar));
        } else {
            eVar.f219802d.post(new C74751d(eVar));
        }
    }

    /* renamed from: R5 */
    public void mo70146R5(Configuration configuration) {
        Log.m105918d("MicroMsg.ChattingUI.HeaderComponent", "getConfiguration().orientation = " + this.f215752d.mo91572m().getConfiguration().orientation + ", newConfig.orientation = " + configuration.orientation);
        this.f215752d.mo91572m().getConfiguration().orientation = configuration.orientation;
        boolean z = true;
        Log.m105925i("MicroMsg.ChatFooter", "[dealOrientationChange] %s", ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1().getContext().getResources().getConfiguration());
        boolean z2 = this.f216152n != null;
        if (this.f216155q == null) {
            z = false;
        }
        if (z2 && z) {
            int c = C76860a.m92657c(this.f215752d.mo91565f());
            this.f216155q.setMinimumHeight(c);
            ViewGroup.LayoutParams layoutParams = this.f216155q.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            layoutParams.height = c;
            this.f216155q.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.f216152n.getLayoutParams();
            layoutParams2.height = c;
            this.f216152n.setLayoutParams(layoutParams2);
        }
        C116183y1 y1Var = this.f216153o;
        if (y1Var != null) {
            y1Var.f348690u0.f336734e.mo91107r(configuration);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r4 = r3.f216154p;
     */
    /* renamed from: S3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102610S3(android.view.MenuItem.OnMenuItemClickListener r4) {
        /*
            r3 = this;
            com.tencent.mm.ui.e r0 = r3.f216154p
            com.tencent.mm.ui.chatting.component.u2$d r1 = new com.tencent.mm.ui.chatting.component.u2$d
            r1.<init>(r4)
            android.view.View r4 = r0.f219799a
            r4.setOnClickListener(r1)
            ck3.b r4 = r3.f215752d
            java.lang.Class<zj3.i> r0 = zj3.C79363i.class
            com.tencent.mm.ui.chatting.manager.a r4 = r4.f193278b
            xi.d r4 = r4.mo102812a(r0)
            zj3.i r4 = (zj3.C79363i) r4
            int r4 = r4.mo102360c5()
            r0 = 2131099800(0x7f060098, float:1.7811963E38)
            r1 = 2131755023(0x7f10000f, float:1.9140914E38)
            if (r4 <= 0) goto L_0x0035
            com.tencent.mm.ui.e r2 = r3.f216154p
            if (r4 != 0) goto L_0x002b
            r4 = 2131755023(0x7f10000f, float:1.9140914E38)
        L_0x002b:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r2.f219800b
            if (r1 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            r1.mo104518r(r4, r0)
            goto L_0x003e
        L_0x0035:
            com.tencent.mm.ui.e r4 = r3.f216154p
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f219800b
            if (r4 == 0) goto L_0x003e
            r4.mo104518r(r1, r0)
        L_0x003e:
            ck3.b r4 = r3.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r4 = r4.f193286j
            java.lang.String r0 = "KIsHalfScreen"
            r1 = 0
            java.lang.Boolean r4 = r4.getBooleanExtra(r0, r1)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0067
            com.tencent.mm.ui.e r4 = r3.f216154p
            r0 = 2131821435(0x7f11037b, float:1.9275613E38)
            android.widget.TextView r2 = r4.f219801c
            if (r2 == 0) goto L_0x0067
            r2.setText(r0)
            android.widget.TextView r0 = r4.f219801c
            r0.setVisibility(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f219800b
            r0 = 8
            r4.setVisibility(r0)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73604u2.mo102610S3(android.view.MenuItem$OnMenuItemClickListener):void");
    }

    /* renamed from: a */
    public void mo102611a() {
        String str;
        Class cls = C79365j.class;
        Class cls2 = C76979h.class;
        Class cls3 = C79366k.class;
        Class cls4 = C79336a.class;
        Class cls5 = C53193b.class;
        Class cls6 = C79168k.class;
        this.f215752d.mo91558S();
        Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "resetUserLevelTitle!");
        this.f216154p.f219803e.setText("");
        Log.m105924i("MicroMsg.ActionBarCustomArea", "resetUserLevel!");
        this.f215752d.f193286j.setMMSubTitle((String) null);
        if (!((C79363i) this.f215752d.f193278b.mo102812a(C79363i.class)).mo102357a()) {
            if (((C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102698q2()) {
                mo102629o0("");
            } else if (C72996z1.m85795C5(this.f215752d.mo91577r())) {
                mo102629o0(this.f215752d.mo91574o().mo62909j3());
            } else {
                if (((C79384u0) this.f215752d.f193278b.mo102812a(C79384u0.class)).mo102509Y()) {
                    mo102603I0(C0966R.string.ig9);
                } else if (C72996z1.m85798E5(this.f215752d.mo91577r())) {
                    ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1().setWordCountLimit(140);
                    mo102629o0(this.f215752d.mo91574o().mo62898f());
                } else if (C72996z1.m85855z5(this.f215752d.mo91577r())) {
                    if (((C79375p) this.f215752d.f193278b.mo102812a(C79375p.class)).mo70122s3()) {
                        mo102629o0(this.f215752d.mo91565f().getString(C0966R.string.hdt));
                    } else {
                        mo102629o0(this.f215752d.mo91574o().mo62909j3());
                    }
                } else {
                    int i = 0;
                    if (C72996z1.m85811N4(this.f215752d.mo91577r())) {
                        Activity f = this.f215752d.mo91565f();
                        Object[] objArr = new Object[1];
                        C72996z1 o = this.f215752d.mo91574o();
                        Class cls7 = C75339i.class;
                        if (o == null) {
                            str = this.f215752d.mo91565f().getString(C0966R.string.f360202at1);
                        } else if (RegionCodeDecoder.m124565r(o.mo101229G4())) {
                            String str2 = o.f149520W;
                            if (!Util.isNullOrNil(str2)) {
                                str = str2;
                            } else {
                                String K90 = ((C75339i) C86312j.m106911c(cls7)).K90(o.f149518V);
                                str = !Util.isNullOrNil(K90) ? K90 : RegionCodeDecoder.m124563k().mo135576l(o.mo101229G4());
                            }
                        } else {
                            str = ((C75339i) C86312j.m106911c(cls7)).K90(o.f149518V);
                            if (Util.isNullOrNil(str)) {
                                str = this.f215752d.mo91565f().getString(C0966R.string.f360202at1);
                            }
                        }
                        objArr[0] = str;
                        mo102629o0(f.getString(C0966R.string.as9, objArr).trim());
                    } else if (C72996z1.m85804J4(this.f215752d.mo91577r())) {
                        if (this.f215752d.f193278b.mo102812a(cls4) != null) {
                            ((C79336a) this.f215752d.f193278b.mo102812a(cls4)).mo102371a();
                        }
                    } else if (this.f215752d.mo91582w()) {
                        boolean U1 = ((C79357g) this.f215752d.f193278b.mo102812a(C79357g.class)).mo102152U1();
                        String n2 = this.f215752d.mo91574o().mo73969n2();
                        if (Util.isNullOrNil(n2)) {
                            n2 = this.f215752d.mo91574o().getNickname();
                        } else {
                            String q = this.f215752d.mo91576q();
                            C76979h hVar = (C76979h) C86312j.m106911c(cls2);
                            Activity f2 = this.f215752d.mo91565f();
                            if (Util.isNullOrNil(q)) {
                                q = this.f215752d.mo91565f().getString(C0966R.string.bba);
                            }
                            mo102604I1(hVar.mo107057T1(f2, q));
                        }
                        boolean z = C72996z1.m85820U5(this.f215752d.mo91577r()) && ((C39479c) C86709a0.m107533q(C39479c.class)).mo62086r1(this.f215752d.mo91577r());
                        Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "isChatroomDismiss = " + z);
                        CharSequence string = Util.isNullOrNil(n2) ? ((C53193b) C86312j.m106911c(cls5)).mo73729p1(this.f215752d.mo91577r()) == 0 ? this.f215752d.mo91565f().getString(C0966R.string.bba) : z ? this.f215752d.mo91565f().getString(C0966R.string.bba) : this.f215752d.mo91565f().getString(C0966R.string.eyf, new Object[]{this.f215752d.mo91565f().getString(C0966R.string.bba), Integer.valueOf(((C53193b) C86312j.m106911c(cls5)).mo73729p1(this.f215752d.mo91577r()))}) : z ? this.f215752d.mo91574o().mo62898f() : this.f215752d.mo91565f().getString(C0966R.string.eyf, new Object[]{this.f215752d.mo91574o().mo62898f(), Integer.valueOf(((C53193b) C86312j.m106911c(cls5)).mo73729p1(this.f215752d.mo91577r()))});
                        if (C72996z1.m85847r5(this.f215752d.mo91577r()) || U1) {
                            string = C75370s.m90375a(this.f215752d.mo91565f(), ((C76979h) C86312j.m106911c(cls2)).op0(this.f215752d.mo91565f(), string + " ", C76577a.m92157h(this.f215752d.mo91565f(), C0966R.dimen.f3628l)), C0966R.raw.open_im_title_logo);
                        }
                        mo102629o0(string);
                    } else {
                        if (!((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70078x1()) {
                            if (((C79366k) this.f215752d.f193278b.mo102812a(cls3)).mo70129g1()) {
                                ((C79366k) this.f215752d.f193278b.mo102812a(cls3)).mo70128a();
                            } else if (((C79365j) this.f215752d.f193278b.mo102812a(cls)).mo70105e4()) {
                                ((C79365j) this.f215752d.f193278b.mo102812a(cls)).mo70104a();
                                this.f216154p.f219802d.setEllipsize(TextUtils.TruncateAt.END);
                            } else {
                                this.f216154p.f219812n.setVisibility(C72996z1.m85848s5(this.f215752d.mo91577r()) ? 0 : 8);
                                if (C72996z1.m85846q5(this.f215752d.mo91577r())) {
                                    mo102629o0(this.f215752d.mo91574o().mo62898f());
                                    this.f216154p.mo103918a(false, true);
                                } else {
                                    this.f216154p.mo103918a(false, false);
                                    C67391b bVar = this.f215752d;
                                    bVar.f193286j.setMMTitle(bVar.mo91574o().mo62898f());
                                    if (((C79168k) C86312j.m106911c(cls6)).mo74105BS(this.f215752d.mo91574o().getUsername())) {
                                        if (((C79168k) C86312j.m106911c(cls6)).mo74121V7() || ((C79168k) C86312j.m106911c(cls6)).s50()) {
                                            this.f216154p.f219802d.setText(this.f215752d.mo91574o().mo62898f());
                                            ((C79168k) C86312j.m106911c(cls6)).mo74128nC(this.f216154p.f219802d, this.f215752d.mo91574o().getUsername(), C63347a.C47892c.CONVERSATION_LIST);
                                        } else {
                                            C67391b bVar2 = this.f215752d;
                                            bVar2.f193286j.setMMSubTitle(bVar2.mo91574o().mo62898f());
                                        }
                                    }
                                }
                                C74753e eVar = this.f216154p;
                                boolean s5 = C72996z1.m85848s5(this.f215752d.mo91577r());
                                ImageView imageView = eVar.f219812n;
                                if (!s5) {
                                    i = 8;
                                }
                                imageView.setVisibility(i);
                                if (C72996z1.m85843n5(this.f215752d.mo91577r()) || C72996z1.m85846q5(this.f215752d.mo91577r())) {
                                    this.f215752d.f193286j.setMMSubTitle(((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(this.f215752d.mo91574o().mo73980x2(), this.f215752d.mo91574o().mo73976t2()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a6 */
    public final void mo102612a6() {
        if (this.f215752d.mo91565f() == null) {
            Log.m105928w("MicroMsg.ChattingUI.HeaderComponent", "getActivity is null");
            return;
        }
        mo102619f6();
        ViewGroup viewGroup = (ViewGroup) this.f215752d.mo91565f().findViewById(C0966R.C0970id.b3z);
        C78801a a = C74666h.m89417a(this.f215752d.mo91565f(), C74666h.C74667a.CHATTING_MONITORED_HINT, new Object[]{C75896b.C75898b.Chatting});
        if (viewGroup != null && a != null && a.getView() != null && this.f216145E == null) {
            View view = a.getView();
            this.f216145E = view;
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
    }

    /* renamed from: b4 */
    public void mo102613b4(int i) {
        C74753e eVar = this.f216154p;
        int i2 = 0;
        boolean z = i == 0;
        ImageView imageView = eVar.f219810l;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    /* renamed from: b6 */
    public final void mo102614b6() {
        C78801a aVar;
        if (this.f215752d.mo91583x() || this.f216146e == null) {
            mo102617d6();
            return;
        }
        mo102617d6();
        if (this.f216146e.getTag() == null) {
            aVar = C74666h.m89417a(this.f215752d.mo91565f(), C74666h.C74667a.CHATTING_RECOMMEND_BANNER, new Object[]{this.f215752d.mo91577r(), this.f215752d.mo91576q()});
            if (!(aVar == null || aVar.getView() == null)) {
                this.f216146e.addView(aVar.getView(), new ViewGroup.LayoutParams(-1, -2));
            }
        } else {
            aVar = (C78801a) this.f216146e.getTag();
        }
        if (aVar != null) {
            this.f216146e.setVisibility(0);
            this.f216146e.setTag(aVar);
        }
        C115669n.INSTANCE.mo160131h(11003, this.f215752d.mo91577r(), 1, 0);
    }

    /* renamed from: c0 */
    public C116183y1 mo102615c0() {
        return this.f216153o;
    }

    /* renamed from: c6 */
    public final void mo102616c6() {
        Class cls = C32735h.class;
        if (C72996z1.m85822V5(this.f215752d.mo91577r())) {
            Boolean valueOf = Boolean.valueOf(C116945b.wx0().mo175755d(3));
            if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_android_open_wxpay_search, false)) {
                Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "clicfg_android_open_wxpay_search is open");
                mo102621h6(4, C0966R.string.k3j, C0966R.raw.actionbar_icon_dark_search, this.f216159u);
            }
            this.f215752d.f193286j.addIconOptionMenu(0, (int) C0966R.string.f7375ef, (int) C0966R.raw.actionbar_setting_icon, valueOf.booleanValue(), (MenuItem.OnMenuItemClickListener) this.f216159u);
        } else if (C72996z1.m85795C5(this.f215752d.mo91577r()) || C72996z1.m85826X5(this.f215752d.mo91577r()) || (1 == ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_minishop_plugin_enabled, 1) && C45628s0.m50744I(this.f215752d.mo91577r()))) {
            this.f215752d.f193286j.addIconOptionMenu(0, (int) C0966R.string.f7375ef, (int) C0966R.raw.actionbar_setting_icon, Boolean.valueOf(C116945b.wx0().mo175755d(3)).booleanValue(), (MenuItem.OnMenuItemClickListener) this.f216159u);
        }
    }

    /* renamed from: d6 */
    public final void mo102617d6() {
        this.f216146e.setVisibility(8);
        LinearLayout linearLayout = this.f216148g;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void mo70065e() {
        mo102600B1();
    }

    /* renamed from: e6 */
    public final View mo102618e6(ViewGroup viewGroup) {
        View view = this.f216155q;
        if (view == null) {
            if (viewGroup == null) {
                this.f216155q = C85868k2.m106137b(this.f215752d.mo91565f()).inflate(C0966R.C0971layout.f6301b3, (ViewGroup) null);
            } else {
                this.f216155q = C85868k2.m106137b(this.f215752d.mo91565f()).inflate(C0966R.C0971layout.f6301b3, viewGroup, false);
            }
            return this.f216155q;
        } else if (view.getParent() == null) {
            return this.f216155q;
        } else {
            if (this.f216155q.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f216155q.getParent()).removeView(this.f216155q);
                return this.f216155q;
            }
            if (viewGroup == null) {
                this.f216155q = C85868k2.m106137b(this.f215752d.mo91565f()).inflate(C0966R.C0971layout.f6301b3, (ViewGroup) null);
            } else {
                this.f216155q = C85868k2.m106137b(this.f215752d.mo91565f()).inflate(C0966R.C0971layout.f6301b3, viewGroup, false);
            }
            return this.f216155q;
        }
    }

    /* renamed from: f6 */
    public final void mo102619f6() {
        View view;
        ViewGroup viewGroup = (ViewGroup) this.f215752d.mo91565f().findViewById(C0966R.C0970id.b3z);
        if (viewGroup != null && (view = this.f216145E) != null) {
            viewGroup.removeView(view);
            this.f216145E = null;
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        mo102623k3(true);
        Class cls = C47902u.class;
        if (((C79377q) this.f215752d.f193278b.mo102812a(C79377q.class)).mo70131k2()) {
            mo102611a();
            ((C47902u) C86312j.m106911c(cls)).mo72655dS(this.f215752d.mo91577r(), 5);
            ((C47902u) C86312j.m106911c(cls)).e70(this.f215752d.mo91565f(), this.f215752d.mo91577r());
        }
    }

    /* renamed from: g6 */
    public final void mo102620g6() {
        if (C86709a0.m107523b().mo121114l()) {
            ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this.f216162x);
            C97625j3.m125812b().mo105902q().remove(this.f216163y);
        }
        this.f215752d.mo91571l().removeCallbacks(this.f216161w);
        C51866wq2 wq22 = C45612m0.f123381a;
        C75902d.f222578a.remove("30001001_1");
        if (this.f216156r != null) {
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175776r(this.f216156r);
        }
    }

    /* renamed from: h6 */
    public final void mo102621h6(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        mo102622i6(i, i2, i3, "", onMenuItemClickListener);
    }

    /* renamed from: i6 */
    public final void mo102622i6(int i, int i2, int i3, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MMActivityController.C116044q findMenuInfo = this.f215752d.f193286j.findMenuInfo(i);
        if (!Util.isNullOrNil(str)) {
            if (findMenuInfo == null) {
                this.f215752d.f193286j.addIconOptionMenu(i, i2, i3, onMenuItemClickListener);
                findMenuInfo = this.f215752d.f193286j.findMenuInfo(i);
            } else {
                this.f215752d.f193286j.updateOptionMenu(i, i2, i3, onMenuItemClickListener);
            }
            if (findMenuInfo == null) {
                Log.m105920e("MicroMsg.ChattingUI.HeaderComponent", "updateMenuInfo menuInfo == null");
                return;
            }
            this.f216156r = new C73626n(i, str, findMenuInfo);
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f216156r);
            C115624i.m162565a(this.f216156r);
            if (findMenuInfo.f348151l) {
                C73626n nVar = this.f216156r;
                C115631n nVar2 = C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT;
                nVar.getClass();
                C115624i.m162566b(nVar, nVar2, true);
            }
        } else if (findMenuInfo == null) {
            this.f215752d.f193286j.addIconOptionMenu(i, i2, i3, onMenuItemClickListener);
        } else {
            this.f215752d.f193286j.updateOptionMenu(i, i2, i3, onMenuItemClickListener);
        }
    }

    /* renamed from: k3 */
    public void mo102623k3(boolean z) {
        C67391b bVar = this.f215752d;
        if (bVar == null) {
            Log.m105920e("MicroMsg.ChattingUI.HeaderComponent", "[updateBannerStatus] mChattingContext == null!");
            return;
        }
        if (!bVar.mo91583x()) {
            if (!C45628s0.m50742G(this.f215752d.mo91577r()) && C73521l0.m86928e(this.f215752d.mo91577r())) {
                if (!((C79361h0) this.f215752d.f193278b.mo102812a(C79361h0.class)).mo102468o1() && !this.f215752d.mo91574o().mo62916m3()) {
                    this.f216150i = this.f215752d.mo91577r();
                    mo102602F5();
                }
            }
            if (!((C79349e0) this.f215752d.f193278b.mo102812a(C79349e0.class)).mo102242o()) {
                if (!((C79375p) this.f215752d.f193278b.mo102812a(C79375p.class)).mo70121o()) {
                    mo102614b6();
                }
            }
        } else {
            mo102617d6();
        }
        if (z) {
            mo102612a6();
        }
    }

    /* renamed from: k4 */
    public void mo102624k4(int i) {
        C74753e eVar = this.f216154p;
        int i2 = 0;
        boolean z = i == 0;
        ImageView imageView = eVar.f219811m;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        mo102620g6();
    }

    /* renamed from: l4 */
    public boolean mo102625l4() {
        return this.f216157s;
    }

    /* renamed from: l5 */
    public void mo102626l5(int i) {
        C74753e eVar = this.f216154p;
        if (i == 0) {
            eVar.f219813o.setImageResource(C85875k4.m106211z() ? C0966R.raw.chat_reject_title_icon : C0966R.raw.chat_reject_icon);
            eVar.f219813o.setVisibility(0);
            return;
        }
        eVar.f219813o.setVisibility(8);
    }

    /* renamed from: m1 */
    public void mo102627m1(String str) {
        Class cls = C79168k.class;
        this.f216154p.mo103919b(((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f215752d.mo91565f(), str, C76577a.m92157h(this.f215752d.mo91565f(), C0966R.dimen.f3881hq)));
        if (((C79168k) C86312j.m106911c(cls)).mo74105BS(this.f215752d.mo91574o().getUsername()) && !C72996z1.m85820U5(this.f215752d.mo91577r())) {
            ((C79168k) C86312j.m106911c(cls)).mo74104AK(this.f216154p.f219806h, this.f215752d.mo91577r(), C76577a.m92151b(this.f215752d.mo91565f(), 14), C63347a.C47892c.CONVERSATION_LIST, C63347a.C47893d.OUTLINED);
            this.f216154p.f219806h.requestLayout();
            View findViewById = this.f215752d.f193286j.findViewById(C0966R.C0970id.k9p);
            if (findViewById != null) {
                findViewById.setOnClickListener(this.f216143C);
            }
        }
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        LinearLayout linearLayout;
        if (this.f215752d.mo91583x() && (linearLayout = this.f216148g) != null && linearLayout.getVisibility() == 0) {
            C45612m0.m50676C(this.f215752d.mo91574o().getUsername());
        }
        if (C72996z1.m85822V5(this.f215752d.mo91577r()) && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_open_wxpay_search, false)) {
            this.f215752d.f193286j.removeOptionMenu(4);
        }
    }

    /* renamed from: n3 */
    public void mo102628n3() {
        Class cls = C79336a.class;
        Class cls2 = C32735h.class;
        Class cls3 = C79357g.class;
        if (this.f215752d.f193286j.getBooleanExtra("KIsHalfScreen", false).booleanValue()) {
            mo102621h6(0, C0966R.string.f361010gm2, 0, this.f216159u);
            return;
        }
        C79384u0 u0Var = (C79384u0) this.f215752d.f193278b.mo102812a(C79384u0.class);
        if (u0Var.mo102509Y() || u0Var.mo102513x2()) {
            this.f215752d.mo91554O(false);
            return;
        }
        if (((C79363i) this.f215752d.f193278b.mo102812a(C79363i.class)).mo102362t0()) {
            this.f215752d.mo91554O(false);
            return;
        }
        if (!((C79383u) this.f215752d.f193278b.mo102812a(C79383u.class)).mo102647Z1()) {
            if (C45628s0.m50742G(this.f215752d.mo91577r())) {
                this.f215752d.mo91554O(false);
                return;
            }
            if (((C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102698q2()) {
                String string = this.f215752d.mo91565f().getString(C0966R.string.f8014z_);
                C44701a2 a2Var = this.f216159u;
                MMActivityController.C73075r rVar = MMActivityController.C73075r.GREEN;
                MMActivityController.C116044q findMenuInfo = this.f215752d.f193286j.findMenuInfo(0);
                if (!(findMenuInfo == null || (findMenuInfo.f348141b == 0 && findMenuInfo.f348143d == null))) {
                    this.f215752d.f193286j.removeOptionMenu(0);
                    findMenuInfo = null;
                }
                if (findMenuInfo == null) {
                    this.f215752d.f193286j.addTextOptionMenu(0, string, a2Var, (View.OnLongClickListener) null, rVar);
                } else {
                    this.f215752d.f193286j.updateOptionMenuText(0, string);
                }
            } else if (C72996z1.m85822V5(this.f215752d.mo91577r())) {
                if (((C32735h) C86312j.m106911c(cls2)).mo58784wf(C32735h.C32737c.clicfg_android_open_wxpay_search, false)) {
                    Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "clicfg_android_open_wxpay_search is open2");
                    mo102621h6(4, C0966R.string.k3j, C0966R.raw.actionbar_icon_dark_search, this.f216159u);
                }
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
            } else if (C72996z1.m85826X5(this.f215752d.mo91577r())) {
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
            } else if (1 == ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_minishop_plugin_enabled, 1) && C45628s0.m50744I(this.f215752d.mo91577r())) {
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
            } else if (C72996z1.m85795C5(this.f215752d.mo91577r())) {
                this.f215752d.f193286j.addIconOptionMenu(0, (int) C0966R.string.f7375ef, (int) C0966R.raw.actionbar_setting_icon, Boolean.valueOf(C116945b.wx0().mo175755d(3)).booleanValue(), (MenuItem.OnMenuItemClickListener) this.f216159u);
            } else if (C45628s0.m50741F(this.f215752d.mo91577r())) {
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
            } else if (C72996z1.m85849t5(this.f215752d.mo91577r())) {
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
                C115669n.INSTANCE.kvStat(10071, "1");
            } else if (C72996z1.m85830a5(this.f215752d.mo91577r())) {
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
            } else if (C72996z1.m85840k5(this.f215752d.mo91577r())) {
                if (((C79375p) this.f215752d.f193278b.mo102812a(C79375p.class)).mo70119i()) {
                    return;
                }
            } else if (C72996z1.m85806K4(this.f215752d.mo91577r())) {
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
            } else if (C45628s0.m50812z(this.f215752d.mo91577r())) {
                if (C72996z1.m85837h5(this.f215752d.mo91577r())) {
                    this.f215752d.mo91554O(false);
                    return;
                }
                mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f216159u);
            } else if (C72996z1.m85798E5(this.f215752d.mo91577r()) || C72996z1.m85848s5(this.f215752d.mo91577r()) || C72996z1.m85811N4(this.f215752d.mo91577r())) {
                mo102621h6(0, C0966R.string.ban, C0966R.raw.actionbar_icon_dark_more, this.f216159u);
            } else if (!C72996z1.m85804J4(this.f215752d.mo91577r())) {
                if (((C79361h0) this.f215752d.f193278b.mo102812a(C79361h0.class)).mo102468o1() && C73521l0.m86928e(this.f215752d.mo91577r())) {
                    mo102621h6(0, C0966R.string.ban, C0966R.raw.icons_outlined_add_friends, this.f216159u);
                } else if (this.f215752d.mo91574o() == null || !this.f215752d.mo91574o().mo62916m3() || (!C47984k.m53340n(this.f215752d.mo91577r()) && !C47984k.m53341o(this.f215752d.mo91577r()))) {
                    ((C73666z2) this.f215752d.f193278b.mo102812a(C73666z2.class)).mo102704i();
                    C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(C79348e.class);
                    if (C72996z1.m85820U5(this.f215752d.mo91577r()) || eVar.mo70071q1()) {
                        boolean z = C72996z1.m85820U5(this.f215752d.mo91577r()) && ((C39479c) C86709a0.m107533q(C39479c.class)).mo62086r1(this.f215752d.mo91577r());
                        boolean z2 = C72996z1.m85820U5(this.f215752d.mo91577r()) && !((C53193b) C86312j.m106911c(C53193b.class)).i90(this.f215752d.mo91577r());
                        Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "isChatroomDismiss = " + z + ", inChatRoom = " + z2);
                        if (z || z2) {
                            mo102621h6(0, C0966R.string.ban, C0966R.raw.actionbar_icon_dark_more, this.f216159u);
                        } else if (((C79357g) this.f215752d.f193278b.mo102812a(cls3)).mo102150S1()) {
                            Log.m105924i("MicroMsg.ChattingUI.HeaderComponent", "cpan show chatroom right btn");
                            if (((C79357g) this.f215752d.f193278b.mo102812a(cls3)).mo102162w0() && ((C79357g) this.f215752d.f193278b.mo102812a(cls3)).mo102148E3()) {
                                C51866wq2 wq22 = C45612m0.f123381a;
                                if (MultiProcessMMKV.getMMKV("room_upgrade_to_wework").getBoolean("enter_show", false)) {
                                    mo102622i6(0, C0966R.string.ban, C0966R.raw.actionbar_icon_dark_more, "chatroom", this.f216159u);
                                    this.f215752d.mo91554O(true);
                                }
                            }
                            mo102621h6(0, C0966R.string.ban, C0966R.raw.actionbar_icon_dark_more, this.f216159u);
                            this.f215752d.mo91554O(true);
                        } else if (!eVar.mo70071q1() || eVar.mo70075s4()) {
                            this.f215752d.mo91554O(true);
                            mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.actionbar_icon_dark_more, new C73605a());
                            return;
                        } else {
                            mo102621h6(0, C0966R.string.ban, C0966R.raw.actionbar_particular_icon, this.f216159u);
                            this.f215752d.mo91554O(true);
                        }
                    } else {
                        mo102621h6(0, C0966R.string.ban, C0966R.raw.actionbar_icon_dark_more, this.f216159u);
                    }
                } else {
                    mo102621h6(0, C0966R.string.f7375ef, C0966R.raw.icons_outlined_me, this.f216159u);
                }
            } else if (this.f215752d.f193278b.mo102812a(cls) != null) {
                ((C79336a) this.f215752d.f193278b.mo102812a(cls)).mo102374u4();
            }
            if (C72996z1.m85811N4(this.f215752d.mo91577r())) {
                this.f215752d.mo91553N(2, true);
            } else {
                this.f215752d.mo91554O(true);
            }
        }
    }

    /* renamed from: o0 */
    public void mo102629o0(CharSequence charSequence) {
        View findViewById;
        if (!C72996z1.m85847r5(this.f215752d.mo91577r())) {
            if (!((C79357g) this.f215752d.f193278b.mo102812a(C79357g.class)).mo102152U1()) {
                if (C72996z1.m85843n5(this.f215752d.mo91574o().getUsername())) {
                    SpannableString D30 = ((C76158j) C86312j.m106911c(C76158j.class)).D30(MMApplicationContext.getContext(), charSequence.toString(), this.f215752d.mo91574o().mo73980x2(), C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3628l));
                    this.f216154p.mo103920c(D30);
                    C67391b bVar = this.f215752d;
                    bVar.f193286j.updateDescription(bVar.mo91565f().getString(C0966R.string.f360252b70, new Object[]{D30}));
                    return;
                }
                SpannableString op02 = ((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f215752d.mo91565f(), charSequence, C76577a.m92157h(this.f215752d.mo91565f(), C0966R.dimen.f3628l));
                this.f216154p.mo103920c(op02);
                if (!C72996z1.m85820U5(this.f215752d.mo91577r()) && (findViewById = this.f215752d.f193286j.findViewById(C0966R.C0970id.ko6)) != null) {
                    findViewById.setOnClickListener(this.f216142B);
                }
                C67391b bVar2 = this.f215752d;
                bVar2.f193286j.updateDescription(bVar2.mo91565f().getString(C0966R.string.f360252b70, new Object[]{op02}));
                return;
            }
        }
        this.f216154p.mo103920c(charSequence);
        C67391b bVar3 = this.f215752d;
        bVar3.f193286j.updateDescription(bVar3.mo91565f().getString(C0966R.string.f360252b70, new Object[]{charSequence}));
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        if (this.f215752d.f193286j.isSupportNavigationSwipeBack()) {
            C116183y1 y1Var = new C116183y1();
            this.f216153o = y1Var;
            BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
            y1Var.f348688s0 = baseChattingUIFragment;
            y1Var.f348690u0 = new C112467b(baseChattingUIFragment.thisActivity(), y1Var);
            this.f215752d.f193286j.setActivityController(this.f216153o);
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        mo102620g6();
        ViewGroup viewGroup = (ViewGroup) this.f215752d.mo91565f().findViewById(C0966R.C0970id.b49);
        mo102619f6();
    }

    /* renamed from: x */
    public int mo102630x() {
        LinearLayout linearLayout = this.f216146e;
        if (linearLayout == null || !linearLayout.isShown()) {
            return 0;
        }
        return 0 + this.f216146e.getHeight();
    }
}
