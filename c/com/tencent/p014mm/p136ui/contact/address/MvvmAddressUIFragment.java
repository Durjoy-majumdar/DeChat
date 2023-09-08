package com.tencent.p014mm.p136ui.contact.address;

import ac2.C39534d;
import ac2.C39535k;
import ac2.C53998c;
import ac2.C54000f;
import ac2.C91988j;
import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.RecyclerView;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.base.AlphabetScrollBar;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.contact.BizContactEntranceView;
import com.tencent.p014mm.p136ui.contact.C6935t;
import com.tencent.p014mm.p136ui.contact.C74562t0;
import com.tencent.p014mm.p136ui.contact.C74585x0;
import com.tencent.p014mm.p136ui.contact.C74599y2;
import com.tencent.p014mm.p136ui.contact.ContactCountView;
import com.tencent.p014mm.p136ui.contact.ContactRemarkInfoModUI;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75743h;
import fl3.C59246a;
import fl3.C59248b;
import fl3.C59252d;
import fl3.C75775i;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C11184p0;
import o40.C61926c;
import p606mm.C47080g;
import p629ny.C76979h;
import rb0.C47976j;
import rb0.C48009v0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import sx3.C64197v;
import tf3.C101874h;
import uo3.C78253a;
import zb2.C103009m;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/ui/contact/address/MvvmAddressUIFragment;", "Lcom/tencent/mm/ui/contact/address/BaseAddressUIFragment;", "<init>", "()V", "a", "b", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment */
public final class MvvmAddressUIFragment extends BaseAddressUIFragment {

    /* renamed from: P */
    public static final /* synthetic */ int f218930P = 0;

    /* renamed from: A */
    public C78253a f218931A;

    /* renamed from: B */
    public int f218932B;

    /* renamed from: C */
    public int f218933C;

    /* renamed from: D */
    public final C13601g f218934D = C36568h.m40985a(C57819d.f165442d);

    /* renamed from: E */
    public final C13601g f218935E = C36568h.m40985a(C57820e.f165443d);

    /* renamed from: F */
    public final C13601g f218936F = C36568h.m40985a(new C57821f(this));

    /* renamed from: G */
    public final C13601g f218937G = C36568h.m40985a(new C57822h(this));

    /* renamed from: H */
    public final RecyclerView.C16623q f218938H;

    /* renamed from: I */
    public WxLinearLayoutManager f218939I;

    /* renamed from: J */
    public final C13601g f218940J;

    /* renamed from: K */
    public Animation f218941K;

    /* renamed from: L */
    public Animation f218942L;

    /* renamed from: M */
    public final C13601g f218943M;

    /* renamed from: N */
    public final Runnable f218944N;

    /* renamed from: o */
    public final C13601g f218945o = C36568h.m40985a(C74462l.f218964d);

    /* renamed from: p */
    public WxRecyclerView f218946p;

    /* renamed from: q */
    public C74585x0 f218947q;

    /* renamed from: r */
    public BizContactEntranceView f218948r;

    /* renamed from: s */
    public C6935t f218949s;

    /* renamed from: t */
    public C6935t f218950t;

    /* renamed from: u */
    public C6935t f218951u;

    /* renamed from: v */
    public C6935t f218952v;

    /* renamed from: w */
    public ContactCountView f218953w;

    /* renamed from: x */
    public C74599y2 f218954x;

    /* renamed from: y */
    public C74562t0 f218955y;

    /* renamed from: z */
    public AlphabetScrollBar f218956z;

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$c */
    public static final class C57818c extends C87413o implements C32224a<C103009m<C59252d>> {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f165441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57818c(MvvmAddressUIFragment mvvmAddressUIFragment) {
            super(0);
            this.f165441d = mvvmAddressUIFragment;
        }

        public Object invoke() {
            MvvmAddressUIFragment mvvmAddressUIFragment = this.f165441d;
            int i = MvvmAddressUIFragment.f218930P;
            AddressLiveList Y = mvvmAddressUIFragment.mo103520Y();
            this.f165441d.getClass();
            C103009m mVar = new C103009m(Y, new MvvmAddressUIFragment$buildItemConvertFactory$1(), false, 4, (C8480h) null);
            mVar.setHasStableIds(true);
            return mVar;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$d */
    public static final class C57819d extends C87413o implements C32224a<C59246a> {

        /* renamed from: d */
        public static final C57819d f165442d = new C57819d();

        public C57819d() {
            super(0);
        }

        public Object invoke() {
            return new C59246a();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$e */
    public static final class C57820e extends C87413o implements C32224a<C59248b> {

        /* renamed from: d */
        public static final C57820e f165443d = new C57820e();

        public C57820e() {
            super(0);
        }

        public Object invoke() {
            return new C59248b();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$f */
    public static final class C57821f extends C87413o implements C32224a<C54000f<C59252d, C53998c<C59252d>, C39534d<C59252d>>> {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f165444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57821f(MvvmAddressUIFragment mvvmAddressUIFragment) {
            super(0);
            this.f165444d = mvvmAddressUIFragment;
        }

        public Object invoke() {
            MvvmAddressUIFragment mvvmAddressUIFragment = this.f165444d;
            int i = MvvmAddressUIFragment.f218930P;
            return ((C59246a) ((C36570n) mvvmAddressUIFragment.f218934D).getValue()).mo74666a((C59248b) ((C36570n) this.f165444d.f218935E).getValue());
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$h */
    public static final class C57822h extends C87413o implements C32224a<AddressLiveList> {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f165445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57822h(MvvmAddressUIFragment mvvmAddressUIFragment) {
            super(0);
            this.f165445d = mvvmAddressUIFragment;
        }

        public Object invoke() {
            return new AddressLiveList((C54000f) ((C36570n) this.f165445d.f218936F).getValue(), new C53769h(), this.f165445d);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$j */
    public static final class C57823j implements VerticalScrollBar.C6756b {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f165446d;

        public C57823j(MvvmAddressUIFragment mvvmAddressUIFragment) {
            this.f165446d = mvvmAddressUIFragment;
        }

        /* renamed from: S0 */
        public final void mo5638S0(String str) {
            System.currentTimeMillis();
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 35) {
                    if (hashCode != 8593) {
                        if (hashCode == 9734 && str.equals("☆")) {
                            this.f165446d.mo103521Z(32);
                            return;
                        }
                    } else if (str.equals("↑")) {
                        WxLinearLayoutManager wxLinearLayoutManager = this.f165446d.f218939I;
                        if (wxLinearLayoutManager != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            aVar.mo10233c(0);
                            WxLinearLayoutManager wxLinearLayoutManager2 = wxLinearLayoutManager;
                            C117292a.m165358d(wxLinearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment$onTabCreate$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            wxLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                            C117292a.m165359e(wxLinearLayoutManager2, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment$onTabCreate$2", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            return;
                        }
                        return;
                    }
                } else if (str.equals("#")) {
                    this.f165446d.mo103521Z(123);
                    return;
                }
            }
            C87412m.m108593f(str, LocaleUtil.ITALIAN);
            char[] charArray = str.toCharArray();
            C87412m.m108593f(charArray, "this as java.lang.String).toCharArray()");
            Character F = C110823p.m150980F(charArray, 0);
            if (F != null) {
                this.f165446d.mo103521Z(F.charValue());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$k */
    public static final class C57824k implements C0120a0<C91988j<C59252d>> {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f165447d;

        public C57824k(MvvmAddressUIFragment mvvmAddressUIFragment) {
            this.f165447d = mvvmAddressUIFragment;
        }

        public void onChanged(Object obj) {
            C91988j jVar = (C91988j) obj;
            if ((jVar != null ? jVar.f263327a : null) == C39535k.UIRefresh) {
                MvvmAddressUIFragment mvvmAddressUIFragment = this.f165447d;
                int i = MvvmAddressUIFragment.f218930P;
                ((C75775i) ((C36570n) mvvmAddressUIFragment.f218945o).getValue()).mo106086a();
                C57825b bVar = new C57825b(this.f165447d);
                Pattern pattern = C61926c.f176038a;
                MMHandlerThread.postToMainThreadDelayed(bVar, 100);
                this.f165447d.mo103520Y().f272358t.removeObserver(this);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$a */
    public final class C74458a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final C59252d f218957d;

        /* renamed from: e */
        public final int f218958e;

        /* renamed from: f */
        public final /* synthetic */ MvvmAddressUIFragment f218959f;

        public C74458a(MvvmAddressUIFragment mvvmAddressUIFragment, C59252d dVar, int i) {
            C87412m.m108594g(dVar, "dataItem");
            this.f218959f = mvvmAddressUIFragment;
            this.f218957d = dVar;
            this.f218958e = i;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Class cls = C76979h.class;
            if (contextMenuInfo instanceof AdapterView.AdapterContextMenuInfo) {
                C59252d dVar = this.f218957d;
                if (dVar instanceof C59252d) {
                    C72996z1 z1Var = dVar.f169416d;
                    if (C45628s0.m50743H(z1Var.getUsername())) {
                        if (contextMenu != null) {
                            contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f218959f.getContext(), z1Var.mo62898f()));
                        }
                        if (contextMenu != null) {
                            contextMenu.add(this.f218958e, 2, 0, C0966R.string.f7452gn);
                        }
                    } else if (!C72996z1.m85793A5(z1Var.getUsername()) && !C72996z1.m85816S4(z1Var.getUsername())) {
                        if (contextMenu != null) {
                            contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f218959f.getContext(), z1Var.mo62898f()));
                        }
                        if (!(!z1Var.mo62927s3() || z1Var.mo73975s2() == 1 || contextMenu == null)) {
                            contextMenu.add(this.f218958e, 7, 0, C0966R.string.bod);
                        }
                        if (C79758p.f233760a.mo109883f(new C101874h()) == 1 && contextMenu != null) {
                            contextMenu.add(this.f218958e, 8, 0, "Debug");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$b */
    public final class C74459b implements C11184p0 {

        /* renamed from: d */
        public final C59252d f218960d;

        /* renamed from: e */
        public final /* synthetic */ MvvmAddressUIFragment f218961e;

        public C74459b(MvvmAddressUIFragment mvvmAddressUIFragment, C59252d dVar, int i) {
            C87412m.m108594g(dVar, "dataItem");
            this.f218961e = mvvmAddressUIFragment;
            this.f218960d = dVar;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem != null) {
                MvvmAddressUIFragment mvvmAddressUIFragment = this.f218961e;
                int itemId = menuItem.getItemId();
                if (itemId == 1 || itemId == 2) {
                    C72996z1 z1Var = this.f218960d.f169416d;
                    int i2 = MvvmAddressUIFragment.f218930P;
                    mvvmAddressUIFragment.getClass();
                    Class cls = C75700k0.class;
                    C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
                    z1Var2.mo62935u4();
                    C45628s0.m50761Z(z1Var2, true);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var2.getUsername(), z1Var2);
                } else if (itemId == 7) {
                    C72996z1 z1Var3 = this.f218960d.f169416d;
                    int i3 = MvvmAddressUIFragment.f218930P;
                    Activity context = mvvmAddressUIFragment.getContext();
                    if (context != null && z1Var3.mo62927s3()) {
                        Intent intent = new Intent();
                        intent.setClass(context, ContactRemarkInfoModUI.class);
                        intent.putExtra("Contact_User", z1Var3.getUsername());
                        intent.putExtra("view_mode", true);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Activity activity = context;
                        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "viewRemarkInfo", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "viewRemarkInfo", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                } else if (itemId == 8) {
                    ((C47080g) C86312j.m106911c(C47080g.class)).mo72228UH(Util.secPrint(this.f218960d.f169416d.getUsername()) + '-' + C72715f.m85111d("yyyy-MM-dd_HH:mm:ss", (long) C31543z5.m39455e()) + ".txt", this.f218960d.f169416d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$g */
    public static final class C74460g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f218962d;

        public C74460g(MvvmAddressUIFragment mvvmAddressUIFragment) {
            this.f218962d = mvvmAddressUIFragment;
        }

        public final void run() {
            this.f218962d.mo103310T();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$i */
    public static final class C74461i extends C87413o implements C32224a<C74463a> {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f218963d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74461i(MvvmAddressUIFragment mvvmAddressUIFragment) {
            super(0);
            this.f218963d = mvvmAddressUIFragment;
        }

        public Object invoke() {
            return new C74463a(this.f218963d);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$l */
    public static final class C74462l extends C87413o implements C32224a<C75775i> {

        /* renamed from: d */
        public static final C74462l f218964d = new C74462l();

        public C74462l() {
            super(0);
        }

        public Object invoke() {
            return new C75775i();
        }
    }

    public MvvmAddressUIFragment() {
        RecyclerView.C16623q qVar = new RecyclerView.C16623q();
        qVar.mo17336e(2, 30);
        qVar.mo17336e(1, 10);
        this.f218938H = qVar;
        this.f218940J = C36568h.m40985a(new C57818c(this));
        this.f218943M = C36568h.m40985a(new C74461i(this));
        this.f218944N = new C74460g(this);
    }

    /* JADX WARNING: type inference failed for: r10v57, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo101235K(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r10 = "MicroMsg.Mvvm.MvvmAddressUIFragment"
            java.lang.String r0 = "onTabCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            rx3.g r10 = r9.f218945o
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            fl3.i r10 = (fl3.C75775i) r10
            r10.getClass()
            long r0 = eb0.C31543z5.m39453c()
            r10.f222374a = r0
            java.lang.String r0 = "MvvmAddressUI"
            r10.f222375b = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r0, r1)
            r10.f222376c = r0
            r9.mo103517V()
            android.view.View r10 = r9.getView()
            r0 = 0
            if (r10 == 0) goto L_0x0041
            r1 = 2131296703(0x7f0901bf, float:1.821133E38)
            android.view.View r10 = r10.findViewById(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerView r10 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r10
            goto L_0x0042
        L_0x0041:
            r10 = r0
        L_0x0042:
            r9.f218946p = r10
            r1 = 1
            if (r10 == 0) goto L_0x004a
            r10.setHasFixedSize(r1)
        L_0x004a:
            com.tencent.mm.view.recyclerview.WxRecyclerView r10 = r9.f218946p
            if (r10 == 0) goto L_0x0053
            r2 = 30
            r10.setItemViewCacheSize(r2)
        L_0x0053:
            com.tencent.mm.view.recyclerview.WxRecyclerView r10 = r9.f218946p
            if (r10 == 0) goto L_0x005c
            androidx.recyclerview.widget.RecyclerView$q r2 = r9.f218938H
            r10.setRecycledViewPool(r2)
        L_0x005c:
            com.tencent.mm.view.recyclerview.WxRecyclerView r10 = r9.f218946p
            if (r10 != 0) goto L_0x0061
            goto L_0x0068
        L_0x0061:
            zb2.m r2 = r9.mo103519X()
            r10.setAdapter(r2)
        L_0x0068:
            android.app.Activity r10 = r9.getContext()
            if (r10 == 0) goto L_0x0081
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r2 = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager
            r2.<init>(r10)
            r9.f218939I = r2
            r10 = 20
            r2.f44689u = r10
            com.tencent.mm.view.recyclerview.WxRecyclerView r10 = r9.f218946p
            if (r10 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r10.setLayoutManager(r2)
        L_0x0081:
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.app.Activity r10 = r9.getContext()
            r4.<init>(r10)
            r4.setOrientation(r1)
            com.tencent.mm.ui.contact.t r10 = new com.tencent.mm.ui.contact.t
            android.app.Activity r2 = r9.getContext()
            com.tencent.mm.ui.contact.t$a r3 = com.tencent.p014mm.p136ui.contact.C6935t.C6936a.ContactIpCall
            r10.<init>(r2, r3)
            r9.f218950t = r10
            r4.addView(r10)
            com.tencent.mm.ui.contact.t r10 = r9.f218950t
            r2 = 0
            if (r10 == 0) goto L_0x00a5
            r10.setVisible(r2)
        L_0x00a5:
            com.tencent.mm.ui.contact.x0 r10 = new com.tencent.mm.ui.contact.x0
            android.app.Activity r3 = r9.getContext()
            r10.<init>(r3)
            r9.f218947q = r10
            r4.addView(r10)
            com.tencent.mm.ui.contact.t r10 = new com.tencent.mm.ui.contact.t
            android.app.Activity r3 = r9.getContext()
            com.tencent.mm.ui.contact.t$a r5 = com.tencent.p014mm.p136ui.contact.C6935t.C6936a.OnlyChat
            r10.<init>(r3, r5)
            r9.f218952v = r10
            r4.addView(r10)
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CHATONLY_ENTRANCE_BOOLEAN
            boolean r10 = r10.mo119686g(r3, r2)
            if (r10 != 0) goto L_0x00df
            zt3.t r3 = zt3.C119157j.f356862d
            fl3.e r5 = new fl3.e
            r5.<init>(r9)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183884o(r5)
        L_0x00df:
            com.tencent.mm.ui.contact.t r3 = r9.f218952v
            if (r3 == 0) goto L_0x00e6
            r3.setVisible(r10)
        L_0x00e6:
            com.tencent.mm.ui.contact.t r10 = new com.tencent.mm.ui.contact.t
            android.app.Activity r3 = r9.getContext()
            com.tencent.mm.ui.contact.t$a r5 = com.tencent.p014mm.p136ui.contact.C6935t.C6936a.Chatromm
            r10.<init>(r3, r5)
            r9.f218949s = r10
            r4.addView(r10)
            com.tencent.mm.ui.contact.t r10 = r9.f218949s
            if (r10 == 0) goto L_0x00fd
            r10.setVisible(r1)
        L_0x00fd:
            com.tencent.mm.ui.contact.t r10 = new com.tencent.mm.ui.contact.t
            android.app.Activity r3 = r9.getContext()
            com.tencent.mm.ui.contact.t$a r5 = com.tencent.p014mm.p136ui.contact.C6935t.C6936a.ContactLabel
            r10.<init>(r3, r5)
            r9.f218951u = r10
            r4.addView(r10)
            com.tencent.mm.ui.contact.t r10 = r9.f218951u
            if (r10 == 0) goto L_0x0114
            r10.setVisible(r1)
        L_0x0114:
            java.lang.String r10 = "brandservice"
            ke3.C88144b.m109788f(r10)
            com.tencent.mm.ui.contact.BizContactEntranceView r10 = new com.tencent.mm.ui.contact.BizContactEntranceView
            android.app.Activity r3 = r9.getContext()
            r10.<init>(r3)
            r9.f218948r = r10
            r4.addView(r10)
            com.tencent.mm.ui.contact.BizContactEntranceView r10 = r9.f218948r
            if (r10 == 0) goto L_0x012e
            r10.setVisible(r1)
        L_0x012e:
            fl3.h r10 = new fl3.h
            r10.<init>(r9)
            com.tencent.mm.ui.contact.y2 r3 = new com.tencent.mm.ui.contact.y2
            android.app.Activity r5 = r9.getContext()
            fl3.f r6 = new fl3.f
            r6.<init>(r9)
            r3.<init>(r5, r6)
            r9.f218954x = r3
            r3.setOnVisibilityChangeListener(r10)
            com.tencent.mm.ui.contact.y2 r3 = r9.f218954x
            if (r3 == 0) goto L_0x014f
            int r3 = r3.getOpenIMCount()
            goto L_0x0150
        L_0x014f:
            r3 = 0
        L_0x0150:
            r5 = 8
            if (r3 > 0) goto L_0x0160
            r10.mo103592a(r2)
            com.tencent.mm.ui.contact.y2 r10 = r9.f218954x
            if (r10 != 0) goto L_0x015c
            goto L_0x0163
        L_0x015c:
            r10.setVisibility(r5)
            goto L_0x0163
        L_0x0160:
            r10.mo103592a(r1)
        L_0x0163:
            com.tencent.mm.ui.contact.y2 r10 = r9.f218954x
            r4.addView(r10)
            com.tencent.mm.ui.contact.t0 r10 = new com.tencent.mm.ui.contact.t0
            android.app.Activity r1 = r9.getContext()
            fl3.g r2 = new fl3.g
            r2.<init>(r9)
            r10.<init>(r1, r2)
            r9.f218955y = r10
            int r10 = r10.getEnterpriseFriendCount()
            if (r10 > 0) goto L_0x0186
            com.tencent.mm.ui.contact.t0 r10 = r9.f218955y
            if (r10 != 0) goto L_0x0183
            goto L_0x0186
        L_0x0183:
            r10.setVisibility(r5)
        L_0x0186:
            rb0.j r10 = rb0.C48009v0.Fx0()
            com.tencent.mm.ui.contact.t0 r1 = r9.f218955y
            com.tencent.mm.sdk.storage.MStorageEvent<rb0.j$b, rb0.j$b$b> r10 = r10.f128685d
            r10.add(r1, (android.os.Looper) r0)
            com.tencent.mm.ui.contact.t0 r10 = r9.f218955y
            r4.addView(r10)
            zb2.m r3 = r9.mo103519X()
            int r5 = r4.hashCode()
            r6 = 0
            r7 = 4
            r8 = 0
            jq3.C60898l.m71329W5(r3, r4, r5, r6, r7, r8)
            zb2.m r10 = r9.mo103519X()
            rx3.g r1 = r9.f218943M
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.ui.contact.address.a r1 = (com.tencent.p014mm.p136ui.contact.address.C74463a) r1
            r10.f165746y = r1
            android.view.View r10 = r9.getView()
            if (r10 == 0) goto L_0x01c4
            r0 = 2131296720(0x7f0901d0, float:1.8211365E38)
            android.view.View r10 = r10.findViewById(r0)
            r0 = r10
            com.tencent.mm.ui.base.AlphabetScrollBar r0 = (com.tencent.p014mm.p136ui.base.AlphabetScrollBar) r0
        L_0x01c4:
            r9.f218956z = r0
            if (r0 == 0) goto L_0x01d0
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$j r10 = new com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$j
            r10.<init>(r9)
            r0.setOnScrollBarTouchListener(r10)
        L_0x01d0:
            uo3.a r10 = new uo3.a
            android.app.Activity r0 = r9.getContext()
            r10.<init>(r0)
            r9.f218931A = r10
            rx3.g r10 = r9.f218934D
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            fl3.a r10 = (fl3.C59246a) r10
            com.tencent.mm.ui.contact.address.AddressLiveList r0 = r9.mo103520Y()
            r10.f169403f = r0
            rx3.g r10 = r9.f218935E
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            fl3.b r10 = (fl3.C59248b) r10
            com.tencent.mm.ui.contact.address.AddressLiveList r0 = r9.mo103520Y()
            r10.f169407f = r0
            rx3.g r10 = r9.f218934D
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            fl3.a r10 = (fl3.C59246a) r10
            com.tencent.mm.sdk.storage.observer.StorageObserverOwner<xh.k1> r0 = p749xh.C53339k1.f149473Q1
            r0.observe(r9, r10)
            rx3.g r10 = r9.f218935E
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            fl3.b r10 = (fl3.C59248b) r10
            r0.observe(r9, r10)
            com.tencent.mm.ui.contact.address.AddressLiveList r10 = r9.mo103520Y()
            androidx.lifecycle.LiveData<ac2.j<T>> r10 = r10.f272358t
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$k r0 = new com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$k
            r0.<init>(r9)
            r10.observe(r9, r0)
            vo3.f r10 = r9.getBounceView()
            if (r10 == 0) goto L_0x0239
            android.content.res.Resources r0 = r9.getResources()
            r1 = 2131099650(0x7f060002, float:1.781166E38)
            int r0 = r0.getColor(r1)
            r10.setEnd2StartBgColor(r0)
        L_0x0239:
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 1728(0x6c0, double:8.537E-321)
            r4 = 0
            r6 = 1
            r8 = 0
            r1.idkeyStat(r2, r4, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.address.MvvmAddressUIFragment.mo101235K(android.os.Bundle):void");
    }

    /* renamed from: L */
    public void mo101236L() {
        C74562t0 t0Var = this.f218955y;
        if (t0Var != null) {
            MStorageEvent<C47976j.C47978b, C47976j.C47978b.C47980b> mStorageEvent = C48009v0.Fx0().f128685d;
            if (mStorageEvent != null) {
                mStorageEvent.remove(t0Var);
            }
            this.f218955y = null;
        }
        C74585x0 x0Var = this.f218947q;
        if (x0Var != null) {
            if (C97625j3.m125811a()) {
                C75743h.vx0().remove(x0Var.f219242i);
            }
            this.f218947q = null;
        }
        if (this.f218948r != null) {
            this.f218948r = null;
        }
        if (this.f218949s != null) {
            this.f218949s = null;
        }
        if (this.f218952v != null) {
            this.f218952v = null;
        }
        if (this.f218951u != null) {
            this.f218951u = null;
        }
        if (this.f218955y != null) {
            this.f218955y = null;
        }
        AlphabetScrollBar alphabetScrollBar = this.f218956z;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.f348311q = null;
        }
    }

    /* renamed from: M */
    public void mo101237M() {
        HomeUI homeUI;
        Activity context = getContext();
        LauncherUI launcherUI = context instanceof LauncherUI ? (LauncherUI) context : null;
        if (!(launcherUI == null || (homeUI = launcherUI.getHomeUI()) == null)) {
            homeUI.f214270P.remove(this.f218944N);
        }
        C97625j3.m125812b().mo105906u().mo119676J(340226, Long.valueOf(System.currentTimeMillis()));
        C78253a aVar = this.f218931A;
        if (aVar != null) {
            aVar.mo108266a();
        }
        C74585x0 x0Var = this.f218947q;
        if (x0Var != null) {
            x0Var.setFrontGround(false);
        }
    }

    /* renamed from: N */
    public void mo101238N() {
        HomeUI homeUI;
        Activity context = getContext();
        LauncherUI launcherUI = context instanceof LauncherUI ? (LauncherUI) context : null;
        if (!(launcherUI == null || (homeUI = launcherUI.getHomeUI()) == null)) {
            Runnable runnable = this.f218944N;
            if (!homeUI.f214270P.contains(runnable)) {
                homeUI.f214270P.add(runnable);
            }
        }
        if (System.currentTimeMillis() - C97625j3.m125812b().mo105906u().mo119672F(340226, 0) >= ApkDownloadManager.INTERVAL) {
            mo103310T();
        }
        C74585x0 x0Var = this.f218947q;
        if (x0Var != null) {
            x0Var.setFrontGround(true);
        }
        C74585x0 x0Var2 = this.f218947q;
        if (x0Var2 != null) {
            x0Var2.mo103637b();
        }
        C74562t0 t0Var = this.f218955y;
        if (t0Var != null) {
            if (t0Var.getEnterpriseFriendCount() <= 0) {
                t0Var.setVisibility(8);
            } else {
                t0Var.setVisibility(0);
            }
        }
        BizContactEntranceView bizContactEntranceView = this.f218948r;
        if (bizContactEntranceView != null) {
            bizContactEntranceView.mo103320c();
            bizContactEntranceView.setVisible(true);
        }
        ContactCountView contactCountView = this.f218953w;
        if (contactCountView != null) {
            contactCountView.mo7802a();
        }
    }

    /* renamed from: Q */
    public void mo101241Q() {
        mo103310T();
    }

    /* renamed from: R */
    public String mo103309R() {
        return "MicroMsg.Mvvm.MvvmAddressUIFragment";
    }

    /* renamed from: T */
    public void mo103310T() {
        WxLinearLayoutManager wxLinearLayoutManager = this.f218939I;
        if (wxLinearLayoutManager != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(0);
            C117292a.m165358d(wxLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "moveToTop", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            wxLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(wxLinearLayoutManager, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "moveToTop", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    /* renamed from: U */
    public void mo103311U(boolean z) {
        if (this.f218956z != null) {
            if (this.f218941K == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2387bo);
                this.f218941K = loadAnimation;
                if (loadAnimation != null) {
                    loadAnimation.setDuration(200);
                }
            }
            if (this.f218942L == null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2387bo);
                this.f218942L = loadAnimation2;
                if (loadAnimation2 != null) {
                    loadAnimation2.setDuration(200);
                }
            }
            boolean z2 = true;
            if (z) {
                AlphabetScrollBar alphabetScrollBar = this.f218956z;
                if (alphabetScrollBar == null || alphabetScrollBar.getVisibility() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    AlphabetScrollBar alphabetScrollBar2 = this.f218956z;
                    if (alphabetScrollBar2 != null) {
                        alphabetScrollBar2.setVisibility(0);
                    }
                    AlphabetScrollBar alphabetScrollBar3 = this.f218956z;
                    if (alphabetScrollBar3 != null) {
                        alphabetScrollBar3.startAnimation(this.f218941K);
                        return;
                    }
                    return;
                }
                return;
            }
            AlphabetScrollBar alphabetScrollBar4 = this.f218956z;
            if (alphabetScrollBar4 == null || 4 != alphabetScrollBar4.getVisibility()) {
                z2 = false;
            }
            if (!z2) {
                AlphabetScrollBar alphabetScrollBar5 = this.f218956z;
                if (alphabetScrollBar5 != null) {
                    alphabetScrollBar5.setVisibility(8);
                }
                AlphabetScrollBar alphabetScrollBar6 = this.f218956z;
                if (alphabetScrollBar6 != null) {
                    alphabetScrollBar6.startAnimation(this.f218942L);
                }
            }
        }
    }

    /* renamed from: X */
    public final C103009m<C59252d> mo103519X() {
        return (C103009m) ((C36570n) this.f218940J).getValue();
    }

    /* renamed from: Y */
    public final AddressLiveList mo103520Y() {
        return (AddressLiveList) ((C36570n) this.f218937G).getValue();
    }

    /* renamed from: Z */
    public final void mo103521Z(int i) {
        int i2 = 0;
        for (T next : mo103520Y().f272353o) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C59252d dVar = (C59252d) next;
                if (dVar.f169418f != i || !dVar.f169419g) {
                    i2 = i3;
                } else {
                    WxRecyclerView wxRecyclerView = this.f218946p;
                    if (wxRecyclerView != null) {
                        wxRecyclerView.mo17155w1();
                    }
                    WxLinearLayoutManager wxLinearLayoutManager = this.f218939I;
                    if (wxLinearLayoutManager != null) {
                        int c6 = i2 + mo103519X().mo85796c6();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        aVar.mo10233c(Integer.valueOf(c6));
                        WxLinearLayoutManager wxLinearLayoutManager2 = wxLinearLayoutManager;
                        C117292a.m165358d(wxLinearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "scrollToShowHead", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        wxLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                        C117292a.m165359e(wxLinearLayoutManager2, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "scrollToShowHead", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        return;
                    }
                    return;
                }
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: d */
    public void mo25899d() {
        C74585x0 x0Var = this.f218947q;
        if (x0Var != null) {
            x0Var.mo103637b();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6366cv;
    }

    public View getLayoutView() {
        return LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6366cv, (ViewGroup) null);
    }

    /* renamed from: t */
    public void mo25922t() {
        BizContactEntranceView bizContactEntranceView = this.f218948r;
        if (bizContactEntranceView != null) {
            bizContactEntranceView.destroyDrawingCache();
        }
        C6935t tVar = this.f218949s;
        if (tVar != null) {
            tVar.destroyDrawingCache();
        }
        C6935t tVar2 = this.f218951u;
        if (tVar2 != null) {
            tVar2.destroyDrawingCache();
        }
        C6935t tVar3 = this.f218952v;
        if (tVar3 != null) {
            tVar3.destroyDrawingCache();
        }
        ContactCountView contactCountView = this.f218953w;
        if (contactCountView != null) {
            contactCountView.destroyDrawingCache();
        }
        C74585x0 x0Var = this.f218947q;
        if (x0Var != null) {
            x0Var.destroyDrawingCache();
        }
    }
}
