package com.tencent.p014mm.p136ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsShowStoryHeadViewEvent;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.base.AlphabetScrollBar;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.contact.C6935t;
import com.tencent.p014mm.p136ui.contact.address.BaseAddressUIFragment;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import eo3.C75635b;
import eo3.C75643c;
import eo3.C75644d;
import f40.C86709a0;
import fd0.C75743h;
import fl3.C75775i;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kj2.C117407d;
import lj3.C46863b;
import nj3.C11184p0;
import p629ny.C76979h;
import rb0.C47976j;
import rb0.C48009v0;
import uo3.C78253a;
import vd3.C78399i;
import xv2.C102775d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.AddressUI */
public class AddressUI extends FragmentActivity {

    /* renamed from: d */
    public MMFragment f218409d;

    /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment */
    public static class AddressUIFragment extends BaseAddressUIFragment {

        /* renamed from: Y */
        public static final /* synthetic */ int f218410Y = 0;

        /* renamed from: A */
        public C6935t f218411A;

        /* renamed from: B */
        public C6935t f218412B;

        /* renamed from: C */
        public C6935t f218413C;

        /* renamed from: D */
        public C6935t f218414D;

        /* renamed from: E */
        public ContactCountView f218415E;

        /* renamed from: F */
        public C74599y2 f218416F;

        /* renamed from: G */
        public C74562t0 f218417G;

        /* renamed from: H */
        public C78253a f218418H;

        /* renamed from: I */
        public int f218419I;

        /* renamed from: J */
        public int f218420J;

        /* renamed from: K */
        public boolean f218421K;

        /* renamed from: L */
        public boolean f218422L = true;

        /* renamed from: M */
        public LinearLayout f218423M;

        /* renamed from: N */
        public final C75775i f218424N = new C75775i();

        /* renamed from: P */
        public IListener f218425P = new IListener<SnsShowStoryHeadViewEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1693113157;
            }

            public boolean callback(IEvent iEvent) {
                SnsShowStoryHeadViewEvent snsShowStoryHeadViewEvent = (SnsShowStoryHeadViewEvent) iEvent;
                if (AddressUIFragment.this.getContext() == null || AddressUIFragment.this.getContext().isFinishing()) {
                    return false;
                }
                snsShowStoryHeadViewEvent.f154880d.getClass();
                if (AddressUIFragment.this.f218436q == null) {
                    return false;
                }
                ((C102775d) C86312j.m106911c(C102775d.class)).mo134166TA().mo105641a();
                AddressUIFragment.this.f218436q.notifyDataSetChanged();
                return false;
            }
        };

        /* renamed from: Q */
        public Animation f218426Q;

        /* renamed from: R */
        public Animation f218427R;

        /* renamed from: S */
        public C11184p0 f218428S = new C6812a();

        /* renamed from: T */
        public VerticalScrollBar.C6756b f218429T = new C74357b();

        /* renamed from: U */
        public C78399i f218430U = new C78399i(new C6813c());

        /* renamed from: V */
        public List<String> f218431V = new LinkedList();

        /* renamed from: W */
        public List<String> f218432W = new LinkedList();

        /* renamed from: X */
        public Runnable f218433X = new C74362g();

        /* renamed from: o */
        public ListView f218434o;

        /* renamed from: p */
        public TextView f218435p;

        /* renamed from: q */
        public C74452a f218436q;

        /* renamed from: r */
        public C75635b f218437r;

        /* renamed from: s */
        public String f218438s;

        /* renamed from: t */
        public String f218439t;

        /* renamed from: u */
        public String f218440u = "";

        /* renamed from: v */
        public int f218441v;

        /* renamed from: w */
        public AlphabetScrollBar f218442w;

        /* renamed from: x */
        public boolean f218443x = false;

        /* renamed from: y */
        public C74585x0 f218444y;

        /* renamed from: z */
        public BizContactEntranceView f218445z;

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$a */
        public class C6812a implements C11184p0 {
            public C6812a() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 1 || itemId == 2) {
                    AddressUIFragment addressUIFragment = AddressUIFragment.this;
                    AddressUIFragment.m88795X(addressUIFragment, addressUIFragment.f218440u, true);
                } else if (itemId == 7) {
                    AddressUIFragment addressUIFragment2 = AddressUIFragment.this;
                    String str = addressUIFragment2.f218440u;
                    addressUIFragment2.getClass();
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                    if (z1Var.mo62927s3()) {
                        Intent intent = new Intent();
                        intent.setClass(addressUIFragment2.getContext(), ContactRemarkInfoModUI.class);
                        intent.putExtra("Contact_User", z1Var.getUsername());
                        intent.putExtra("view_mode", true);
                        Activity context = addressUIFragment2.getContext();
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Activity activity = context;
                        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "viewRemarkInfo", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "viewRemarkInfo", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$c */
        public class C6813c implements AbsListView.OnScrollListener {
            public C6813c() {
            }

            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(i2));
                arrayList.add(Integer.valueOf(i3));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
                if (i < 2) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                    return;
                }
                AddressUIFragment addressUIFragment = AddressUIFragment.this;
                if (!addressUIFragment.f218443x) {
                    addressUIFragment.f218443x = true;
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$18", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$b */
        public class C74357b implements VerticalScrollBar.C6756b {
            public C74357b() {
            }

            /* renamed from: S0 */
            public void mo5638S0(String str) {
                String str2;
                int i = 0;
                if (AddressUIFragment.this.getString(C0966R.string.ifx).equals(str)) {
                    AddressUIFragment.this.f218434o.setSelection(0);
                    return;
                }
                C74452a aVar = AddressUIFragment.this.f218436q;
                aVar.getClass();
                Log.m105926v("MicroMsg.AddressAdapter", "getSections");
                String[] strArr = aVar.f218895C;
                if (strArr != null) {
                    if ("↑".equals(str)) {
                        AddressUIFragment.this.f218434o.setSelection(0);
                    } else if ("☆".equals(str)) {
                        ListView listView = AddressUIFragment.this.f218434o;
                        listView.setSelection(listView.getHeaderViewsCount());
                    } else {
                        while (i < strArr.length && (str2 = strArr[i]) != null) {
                            if (str2.equals(str)) {
                                AddressUIFragment addressUIFragment = AddressUIFragment.this;
                                C74452a aVar2 = addressUIFragment.f218436q;
                                int[] iArr = aVar2.f218894B;
                                if (iArr != null && i >= 0 && i < iArr.length) {
                                    i = iArr[i];
                                }
                                ListView listView2 = addressUIFragment.f218434o;
                                listView2.setSelection(i + aVar2.f218901I + listView2.getHeaderViewsCount());
                                return;
                            }
                            i++;
                        }
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$d */
        public class C74358d implements Runnable {

            /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$d$a */
            public class C74359a implements Runnable {
                public C74359a() {
                }

                public void run() {
                    AddressUIFragment addressUIFragment = AddressUIFragment.this;
                    addressUIFragment.f218434o.setAdapter(addressUIFragment.f218436q);
                    Log.m105924i("MicroMsg.AddressUI", "post to first init finish");
                    View findViewById = AddressUIFragment.this.findViewById(C0966R.C0970id.g3q);
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.startAnimation(AnimationUtils.loadAnimation(AddressUIFragment.this.getContext(), C0966R.C0968anim.f2394bx));
                        AddressUIFragment.this.f218424N.mo106086a();
                    }
                }
            }

            public C74358d() {
            }

            public void run() {
                Log.m105925i("MicroMsg.AddressUI", "rcontact db init select count: %d", Integer.valueOf(AddressUIFragment.this.f218436q.getCount()));
                AddressUIFragment.this.f218434o.post(new C74359a());
                AddressUIFragment.this.f218437r.mo105989z(false);
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$e */
        public class C74360e implements Runnable {
            public C74360e() {
            }

            public void run() {
                Process.setThreadPriority(10);
                AddressUIFragment addressUIFragment = AddressUIFragment.this;
                int i = AddressUIFragment.f218410Y;
                synchronized (addressUIFragment) {
                    long currentTimeMillis = System.currentTimeMillis();
                    addressUIFragment.mo103312Y();
                    Log.m105924i("MicroMsg.AddressUI", "KEVIN updateBlockList() LAST" + (System.currentTimeMillis() - currentTimeMillis));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (addressUIFragment.f218436q != null) {
                        Log.m105926v("MicroMsg.AddressUI", "post to do refresh");
                        MMHandlerThread.postToMainThread(new C74496h(addressUIFragment));
                    }
                    if (addressUIFragment.f218437r != null) {
                        MMHandlerThread.postToMainThread(new C74501i(addressUIFragment));
                    }
                    Log.m105924i("MicroMsg.AddressUI", "KEVIN doRefresh() LAST" + (System.currentTimeMillis() - currentTimeMillis2));
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$f */
        public class C74361f implements Runnable {
            public C74361f() {
            }

            public void run() {
                C74452a aVar = AddressUIFragment.this.f218436q;
                Log.m105924i(aVar.f220756d, "newcursor resume ");
                aVar.f220757e = true;
                aVar.mo104606a("resume", true);
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$g */
        public class C74362g implements Runnable {
            public C74362g() {
            }

            public void run() {
                AddressUIFragment addressUIFragment = AddressUIFragment.this;
                int i = AddressUIFragment.f218410Y;
                LauncherUI launcherUI = (LauncherUI) addressUIFragment.getContext();
                if (launcherUI == null || launcherUI.mo101375O7().f214435e == 1) {
                    ListView listView = addressUIFragment.f218434o;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(listView);
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                    BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
                    C117292a.m165359e(obj, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                    new MMHandler().postDelayed(new C74491g(addressUIFragment), 300);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.AddressUI$AddressUIFragment$h */
        public class C74363h implements Runnable {
            public C74363h() {
            }

            public void run() {
                AddressUIFragment.this.f218436q.mo103503H();
            }
        }

        /* renamed from: X */
        public static void m88795X(AddressUIFragment addressUIFragment, String str, boolean z) {
            addressUIFragment.getClass();
            C97625j3.m125812b().mo105907v().remove(addressUIFragment.f218436q);
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            z1Var.mo62935u4();
            C45628s0.m50761Z(z1Var, true);
            if (C72996z1.m85820U5(str)) {
                C97625j3.m125812b().mo105907v().mo69688c(str);
                ((C44662n1) C97625j3.m125812b().mo105902q()).mo69807jo(str);
            } else {
                C97625j3.m125812b().mo105907v().mo69719p3(str, z1Var);
            }
            C74452a aVar = addressUIFragment.f218436q;
            aVar.f218911T.add(str);
            aVar.mo104618q(str, 5);
            C97625j3.m125812b().mo105907v().add(addressUIFragment.f218436q);
        }

        /* renamed from: K */
        public void mo101235K(Bundle bundle) {
            Log.m105926v("MicroMsg.AddressUI", "address ui on create");
            C75775i iVar = this.f218424N;
            iVar.getClass();
            iVar.f222374a = C31543z5.m39453c();
            iVar.f222375b = "MvvmAddressUI";
            String uuid = UUID.randomUUID().toString();
            C87412m.m108593f(uuid, "randomUUID().toString()");
            iVar.f222376c = uuid;
            Log.m105926v("MicroMsg.AddressUI", "on address ui create");
            this.f218443x = false;
            this.f218439t = null;
            this.f218438s = "@all.contact.without.chatroom.without.openim";
            this.f218439t = getStringExtra("Contact_GroupFilter_Str");
            getString(C0966R.string.fgc);
            this.f218441v = getIntExtra("List_Type", 2);
            mo103517V();
            Log.m105927v("MicroMsg.AddressUI", "on address ui init view, %s", getResources().getDisplayMetrics());
            ListView listView = this.f218434o;
            if (listView != null) {
                C74585x0 x0Var = this.f218444y;
                if (x0Var != null) {
                    listView.removeHeaderView(x0Var);
                }
                BizContactEntranceView bizContactEntranceView = this.f218445z;
                if (bizContactEntranceView != null) {
                    this.f218434o.removeHeaderView(bizContactEntranceView);
                }
                C6935t tVar = this.f218411A;
                if (tVar != null) {
                    this.f218434o.removeHeaderView(tVar);
                }
                C6935t tVar2 = this.f218414D;
                if (tVar2 != null) {
                    this.f218434o.removeHeaderView(tVar2);
                }
                C6935t tVar3 = this.f218413C;
                if (tVar3 != null) {
                    this.f218434o.removeHeaderView(tVar3);
                }
            }
            ListView listView2 = (ListView) findViewById(C0966R.C0970id.f5610jr);
            this.f218434o = listView2;
            listView2.setScrollingCacheEnabled(false);
            TextView textView = (TextView) findViewById(C0966R.C0970id.cil);
            this.f218435p = textView;
            textView.setText(C0966R.string.f7455gq);
            ((TextView) findViewById(C0966R.C0970id.cjj)).setText(C0966R.string.f7457gs);
            ((TextView) findViewById(C0966R.C0970id.ck8)).setOnClickListener(new C6887j(this));
            this.f218436q = new C74452a(getContext(), this.f218438s, this.f218439t, this.f218441v, true);
            this.f218434o.setAdapter((ListAdapter) null);
            C74452a aVar = this.f218436q;
            aVar.f220761i = new C74516k(this);
            aVar.f218904L = true;
            aVar.f218899G = this;
            aVar.f218897E = new C74519l(this);
            aVar.f218896D = new C74523m(this);
            new C6893n(this);
            aVar.getClass();
            C75635b bVar = new C75635b(getContext(), 1);
            this.f218437r = bVar;
            bVar.mo105988x(new C75644d(bVar, true));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f218423M = linearLayout;
            linearLayout.setOrientation(1);
            this.f218434o.addHeaderView(this.f218423M);
            C6935t tVar4 = new C6935t(getContext(), C6935t.C6936a.ContactIpCall);
            this.f218412B = tVar4;
            this.f218423M.addView(tVar4);
            ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, Boolean.FALSE)).booleanValue();
            this.f218412B.setVisible(false);
            C74585x0 x0Var2 = new C74585x0(getContext());
            this.f218444y = x0Var2;
            this.f218423M.addView(x0Var2);
            C6935t tVar5 = new C6935t(getContext(), C6935t.C6936a.OnlyChat);
            this.f218414D = tVar5;
            this.f218423M.addView(tVar5);
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, false);
            if (!g) {
                ((C119157j) C119157j.f356862d).mo183884o(new C74533o(this));
            }
            this.f218414D.setVisible(g);
            C6935t tVar6 = new C6935t(getContext(), C6935t.C6936a.Chatromm);
            this.f218411A = tVar6;
            this.f218423M.addView(tVar6);
            this.f218411A.setVisible(true);
            C6935t tVar7 = new C6935t(getContext(), C6935t.C6936a.ContactLabel);
            this.f218413C = tVar7;
            this.f218423M.addView(tVar7);
            this.f218413C.setVisible(true);
            ListView listView3 = this.f218434o;
            ContactCountView contactCountView = new ContactCountView(getContext());
            this.f218415E = contactCountView;
            listView3.addFooterView(contactCountView, (Object) null, false);
            C88144b.m109788f("brandservice");
            BizContactEntranceView bizContactEntranceView2 = new BizContactEntranceView(getContext());
            this.f218445z = bizContactEntranceView2;
            this.f218423M.addView(bizContactEntranceView2);
            this.f218445z.setVisible(true);
            C74538p pVar = new C74538p(this);
            C74599y2 y2Var = new C74599y2(getContext(), new C74550q(this));
            this.f218416F = y2Var;
            y2Var.setOnVisibilityChangeListener(pVar);
            if (this.f218416F.getOpenIMCount() <= 0) {
                pVar.mo103592a(false);
                this.f218416F.setVisibility(8);
            } else {
                pVar.mo103592a(true);
            }
            this.f218423M.addView(this.f218416F);
            C74562t0 t0Var = new C74562t0(getContext(), new C74467c(this));
            this.f218417G = t0Var;
            if (t0Var.getEnterpriseFriendCount() <= 0) {
                this.f218417G.setVisibility(8);
            }
            this.f218423M.addView(this.f218417G);
            this.f218418H = new C78253a(getContext());
            this.f218436q.getClass();
            this.f218434o.setOnItemClickListener(new C74472d(this));
            this.f218434o.setOnItemLongClickListener(new C74477e(this));
            this.f218434o.setOnTouchListener(new C74485f(this));
            this.f218434o.setOnScrollListener(this.f218430U);
            this.f218434o.setDrawingCacheEnabled(false);
            AlphabetScrollBar alphabetScrollBar = (AlphabetScrollBar) findViewById(C0966R.C0970id.f5628k9);
            this.f218442w = alphabetScrollBar;
            alphabetScrollBar.setOnScrollBarTouchListener(this.f218429T);
            C97625j3.m125812b().mo105907v().add(this.f218436q);
            if (this.f218417G != null) {
                C47976j Fx0 = C48009v0.Fx0();
                Fx0.f128685d.add(this.f218417G, (Looper) null);
            }
        }

        /* renamed from: L */
        public void mo101236L() {
            Log.m105926v("MicroMsg.AddressUI", "onDestory");
            AlphabetScrollBar alphabetScrollBar = this.f218442w;
            if (alphabetScrollBar != null) {
                alphabetScrollBar.f348311q = null;
            }
            C74452a aVar = this.f218436q;
            if (aVar != null) {
                aVar.mo104608d(true);
                this.f218436q.getClass();
                this.f218436q.f220761i = null;
            }
            C75635b bVar = this.f218437r;
            if (bVar != null) {
                C46863b bVar2 = bVar.f222215z;
                if (bVar2 != null) {
                    bVar2.mo72071a();
                    bVar.f222215z = null;
                }
                this.f218437r.mo5580b();
            }
            if (C97625j3.m125811a() && this.f218436q != null) {
                C97625j3.m125812b().mo105907v().remove(this.f218436q);
            }
            if (C97625j3.m125811a() && this.f218417G != null) {
                C47976j Fx0 = C48009v0.Fx0();
                C74562t0 t0Var = this.f218417G;
                MStorageEvent<C47976j.C47978b, C47976j.C47978b.C47980b> mStorageEvent = Fx0.f128685d;
                if (mStorageEvent != null) {
                    mStorageEvent.remove(t0Var);
                }
            }
            C74585x0 x0Var = this.f218444y;
            if (x0Var != null) {
                if (C97625j3.m125811a()) {
                    C75743h.vx0().remove(x0Var.f219242i);
                }
                this.f218444y = null;
            }
            if (this.f218445z != null) {
                this.f218445z = null;
            }
            if (this.f218411A != null) {
                this.f218411A = null;
            }
            if (this.f218414D != null) {
                this.f218414D = null;
            }
            if (this.f218413C != null) {
                this.f218413C = null;
            }
            if (this.f218417G != null) {
                this.f218417G = null;
            }
        }

        /* renamed from: M */
        public void mo101237M() {
            Log.m105924i("MicroMsg.AddressUI", "AddressUI on Pause");
            C97625j3.m125812b().mo105906u().mo119676J(340226, Long.valueOf(System.currentTimeMillis()));
            C97625j3.m125812b().mo105906u().mo119676J(12296, Boolean.valueOf(this.f218443x));
            C75635b bVar = this.f218437r;
            if (bVar != null) {
                C97625j3.m125815e().mo123470p(106, bVar);
            }
            this.f218436q.f218898F.mo97958c();
            MMHandlerThread.postToMainThread(new C74363h());
            C74585x0 x0Var = this.f218444y;
            if (x0Var != null) {
                x0Var.setFrontGround(false);
            }
            LauncherUI launcherUI = (LauncherUI) getContext();
            if (launcherUI != null) {
                HomeUI homeUI = launcherUI.getHomeUI();
                homeUI.f214270P.remove(this.f218433X);
            }
        }

        /* renamed from: N */
        public void mo101238N() {
            C72996z1 z1Var;
            Log.m105926v("MicroMsg.AddressUI", "address ui on resume");
            if (System.currentTimeMillis() - Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119684e(340226, (Object) null), 0) >= ApkDownloadManager.INTERVAL) {
                mo103310T();
            }
            if (this.f218422L) {
                this.f218422L = false;
                this.f218421K = false;
                mo103312Y();
                ((C119157j) C119157j.f356862d).mo183875f(new C74358d());
            } else if (this.f218421K) {
                this.f218421K = false;
                ThreadPool.post((Runnable) new C74360e(), "AddressUI_updateUIData", 4);
                this.f218415E.mo7802a();
            }
            BizContactEntranceView bizContactEntranceView = this.f218445z;
            if (bizContactEntranceView != null) {
                bizContactEntranceView.mo103320c();
                bizContactEntranceView.setVisible(true);
            }
            C74562t0 t0Var = this.f218417G;
            if (t0Var != null) {
                if (t0Var.getEnterpriseFriendCount() <= 0) {
                    this.f218417G.setVisibility(8);
                } else {
                    this.f218417G.setVisibility(0);
                }
            }
            this.f218443x = ((Boolean) C97625j3.m125812b().mo105906u().mo119684e(12296, Boolean.FALSE)).booleanValue();
            if (this.f218441v == 2 && (z1Var = C97625j3.m125812b().mo105907v().get(C75592q0.m90789s())) != null && (!z1Var.mo62927s3() || !Util.isNullOrNil(z1Var.mo73969n2()) || !Util.isNullOrNil(z1Var.mo73970o2()) || !Util.isNullOrNil(z1Var.mo73971p2()))) {
                z1Var.mo62868O3();
                z1Var.mo62860K2("");
                z1Var.mo62862L2("");
                z1Var.mo62864M2("");
                C97625j3.m125812b().mo105907v().mo69719p3(C75592q0.m90789s(), z1Var);
            }
            C75635b bVar = this.f218437r;
            if (bVar != null) {
                C97625j3.m125815e().mo123455a(106, bVar);
            }
            this.f218436q.f220764o = false;
            MMHandlerThread.postToMainThread(new C74361f());
            C74585x0 x0Var = this.f218444y;
            if (x0Var != null) {
                x0Var.setFrontGround(true);
                this.f218444y.mo103637b();
            }
            LauncherUI launcherUI = (LauncherUI) getContext();
            if (launcherUI != null) {
                HomeUI homeUI = launcherUI.getHomeUI();
                Runnable runnable = this.f218433X;
                if (!homeUI.f214270P.contains(runnable)) {
                    homeUI.f214270P.add(runnable);
                }
            }
        }

        /* renamed from: O */
        public void mo101239O() {
        }

        /* renamed from: P */
        public void mo101240P() {
        }

        /* renamed from: Q */
        public void mo101241Q() {
            Log.m105926v("MicroMsg.AddressUI", "request to top");
            ListView listView = this.f218434o;
            if (listView != null) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(listView);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "requestToTop", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "requestToTop", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            }
        }

        /* renamed from: R */
        public String mo103309R() {
            return "MicroMsg.AddressUI";
        }

        /* renamed from: T */
        public void mo103310T() {
            ListView listView = this.f218434o;
            if (listView != null) {
                listView.setSelection(0);
            }
        }

        /* renamed from: U */
        public void mo103311U(boolean z) {
            if (this.f218442w != null) {
                if (this.f218426Q == null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2387bo);
                    this.f218426Q = loadAnimation;
                    loadAnimation.setDuration(200);
                }
                if (this.f218427R == null) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2387bo);
                    this.f218427R = loadAnimation2;
                    loadAnimation2.setDuration(200);
                }
                if (z) {
                    if (this.f218442w.getVisibility() != 0) {
                        this.f218442w.setVisibility(0);
                        this.f218442w.startAnimation(this.f218426Q);
                    }
                } else if (4 != this.f218442w.getVisibility()) {
                    this.f218442w.setVisibility(8);
                    this.f218442w.startAnimation(this.f218427R);
                }
            }
        }

        /* renamed from: Y */
        public final void mo103312Y() {
            this.f218431V = new LinkedList();
            this.f218432W = new LinkedList();
            ((LinkedList) this.f218431V).add("tmessage");
            ((LinkedList) this.f218432W).addAll(this.f218431V);
            if (!((LinkedList) this.f218431V).contains("officialaccounts")) {
                ((LinkedList) this.f218431V).add("officialaccounts");
            }
            ((LinkedList) this.f218431V).add("helper_entry");
            C74452a aVar = this.f218436q;
            if (aVar != null) {
                aVar.mo103505J(this.f218431V);
            }
            C75635b bVar = this.f218437r;
            if (bVar != null) {
                bVar.mo105988x(new C75643c(bVar, this.f218432W));
            }
        }

        /* renamed from: d */
        public void mo25899d() {
            C74585x0 x0Var = this.f218444y;
            if (x0Var != null) {
                x0Var.mo103637b();
            }
        }

        /* renamed from: g */
        public void mo25903g() {
        }

        public int getLayoutId() {
            return C0966R.C0971layout.f6362cr;
        }

        public View getLayoutView() {
            return LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6362cr, (ViewGroup) null);
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            Log.m105925i("MicroMsg.AddressUI", "onAcvityResult requestCode: %d", Integer.valueOf(i));
            if (i == 6 && i2 == -1) {
                setResult(-1);
                finish();
            } else if (i2 == -1 && i == 4) {
                setResult(-1, intent);
                finish();
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.f218425P.alive();
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Class cls = C76979h.class;
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f218440u);
            if (z1Var == null) {
                Log.m105920e("MicroMsg.AddressUI", "onCreateContextMenu, contact is null, username = " + this.f218440u);
            } else if (!C75592q0.m90789s().equals(z1Var.getUsername())) {
                if (C45628s0.m50743H(this.f218440u)) {
                    contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(cls)).mo107057T1(view.getContext(), z1Var.mo62898f()));
                    contextMenu.add(adapterContextMenuInfo.position, 2, 0, C0966R.string.f7452gn);
                } else if (!C72996z1.m85793A5(this.f218440u) && !C72996z1.m85816S4(this.f218440u)) {
                    contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(cls)).mo107057T1(view.getContext(), z1Var.mo62898f()));
                    if (z1Var.mo62927s3() && z1Var.mo73975s2() != 1) {
                        contextMenu.add(adapterContextMenuInfo.position, 7, 0, C0966R.string.bod);
                    }
                }
            }
        }

        public void onDestroy() {
            super.onDestroy();
            this.f218425P.dead();
        }

        /* renamed from: r */
        public void mo25918r() {
            Log.m105926v("MicroMsg.INIT", "KEVIN Address turnTofg");
        }

        /* renamed from: t */
        public void mo25922t() {
            C74452a aVar = this.f218436q;
            if (aVar != null) {
                aVar.f218908Q.clear();
                aVar.f218906N.clear();
                aVar.f218907P = false;
            }
            Log.m105924i("MicroMsg.INIT", "KEVIN Address turnTobg");
            BizContactEntranceView bizContactEntranceView = this.f218445z;
            if (bizContactEntranceView != null) {
                bizContactEntranceView.destroyDrawingCache();
            }
            C6935t tVar = this.f218411A;
            if (tVar != null) {
                tVar.destroyDrawingCache();
            }
            C6935t tVar2 = this.f218413C;
            if (tVar2 != null) {
                tVar2.destroyDrawingCache();
            }
            C6935t tVar3 = this.f218414D;
            if (tVar3 != null) {
                tVar3.destroyDrawingCache();
            }
            ContactCountView contactCountView = this.f218415E;
            if (contactCountView != null) {
                contactCountView.destroyDrawingCache();
            }
            C74585x0 x0Var = this.f218444y;
            if (x0Var != null) {
                x0Var.destroyDrawingCache();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(16908290) == null) {
            AddressUIFragment addressUIFragment = new AddressUIFragment();
            this.f218409d = addressUIFragment;
            addressUIFragment.setArguments(getIntent().getExtras());
            C112919c0 beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.mo165167i(16908290, this.f218409d, (String) null, 1);
            beginTransaction.mo165162d();
        }
        C117407d.INSTANCE.idkeyStat(1728, 2, 1, false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
