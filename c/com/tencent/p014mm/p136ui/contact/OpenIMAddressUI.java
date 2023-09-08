package com.tencent.p014mm.p136ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import eo3.C75635b;
import eo3.C75643c;
import eo3.C75644d;
import f40.C86709a0;
import go3.C45940u;
import he0.C76158j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je0.C33548p;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import lj3.C46863b;
import nj3.C11184p0;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import te3.C49947j52;
import vd3.C78399i;

/* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI */
public class OpenIMAddressUI extends MMActivity {

    /* renamed from: d */
    public MMFragment f218692d;

    /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment */
    public static class OpenIMAddressUIFragment extends MMFragment implements C11385n {

        /* renamed from: v */
        public static final /* synthetic */ int f218693v = 0;

        /* renamed from: d */
        public String f218694d = "";

        /* renamed from: e */
        public ListView f218695e;

        /* renamed from: f */
        public C44884w2 f218696f;

        /* renamed from: g */
        public C75635b f218697g;

        /* renamed from: h */
        public String f218698h = "";

        /* renamed from: i */
        public C45940u f218699i;

        /* renamed from: j */
        public int f218700j;

        /* renamed from: n */
        public int f218701n;

        /* renamed from: o */
        public boolean f218702o;

        /* renamed from: p */
        public boolean f218703p = true;

        /* renamed from: q */
        public Runnable f218704q = new C6856g();

        /* renamed from: r */
        public C11184p0 f218705r = new C6854a();

        /* renamed from: s */
        public C78399i f218706s = new C78399i(new C6855b(this));

        /* renamed from: t */
        public List<String> f218707t = new LinkedList();

        /* renamed from: u */
        public List<String> f218708u = new LinkedList();

        /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment$a */
        public class C6854a implements C11184p0 {
            public C6854a() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 1 || itemId == 2) {
                    OpenIMAddressUIFragment openIMAddressUIFragment = OpenIMAddressUIFragment.this;
                    OpenIMAddressUIFragment.m88910K(openIMAddressUIFragment, openIMAddressUIFragment.f218698h, true);
                } else if (itemId == 7) {
                    OpenIMAddressUIFragment openIMAddressUIFragment2 = OpenIMAddressUIFragment.this;
                    String str = openIMAddressUIFragment2.f218698h;
                    openIMAddressUIFragment2.getClass();
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                    if (z1Var.mo62927s3()) {
                        Intent intent = new Intent();
                        intent.setClass(openIMAddressUIFragment2.getContext(), ContactRemarkInfoModUI.class);
                        intent.putExtra("Contact_User", z1Var.getUsername());
                        intent.putExtra("view_mode", true);
                        Activity context = openIMAddressUIFragment2.getContext();
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Activity activity = context;
                        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "viewRemarkInfo", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "viewRemarkInfo", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment$b */
        public class C6855b implements AbsListView.OnScrollListener {
            public C6855b(OpenIMAddressUIFragment openIMAddressUIFragment) {
            }

            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(i2));
                arrayList.add(Integer.valueOf(i3));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
                Log.m105925i("MicroMsg.OpenIMAddressUI", "[onScroll] firstVisibleItem:%s", Integer.valueOf(i));
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
                Log.m105925i("MicroMsg.OpenIMAddressUI", "[onScrollStateChanged] scrollState:%s", Integer.valueOf(i));
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment$g */
        public class C6856g implements Runnable {
            public C6856g() {
            }

            public void run() {
                OpenIMAddressUIFragment openIMAddressUIFragment = OpenIMAddressUIFragment.this;
                ListView listView = openIMAddressUIFragment.f218695e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(listView);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                new MMHandler().postDelayed(new C6891l2(openIMAddressUIFragment), 300);
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment$c */
        public class C74404c implements Runnable {
            public C74404c() {
            }

            public void run() {
                Log.m105924i("MicroMsg.OpenIMAddressUI", "post to first init finish");
                View findViewById = OpenIMAddressUIFragment.this.findViewById(C0966R.C0970id.g3q);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.startAnimation(AnimationUtils.loadAnimation(OpenIMAddressUIFragment.this.getContext(), C0966R.C0968anim.f2394bx));
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment$d */
        public class C74405d implements Runnable {
            public C74405d() {
            }

            public void run() {
                Process.setThreadPriority(10);
                OpenIMAddressUIFragment openIMAddressUIFragment = OpenIMAddressUIFragment.this;
                int i = OpenIMAddressUIFragment.f218693v;
                openIMAddressUIFragment.mo103412M();
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment$e */
        public class C74406e implements Runnable {
            public C74406e() {
            }

            public void run() {
                C44884w2 w2Var = OpenIMAddressUIFragment.this.f218696f;
                Log.m105924i(w2Var.f220756d, "newcursor resume ");
                w2Var.f220757e = true;
                w2Var.mo104606a("resume", true);
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment$f */
        public class C74407f implements Runnable {
            public C74407f() {
            }

            public void run() {
                OpenIMAddressUIFragment.this.f218696f.mo103503H();
            }
        }

        public OpenIMAddressUIFragment() {
            super(true);
        }

        /* renamed from: K */
        public static void m88910K(OpenIMAddressUIFragment openIMAddressUIFragment, String str, boolean z) {
            openIMAddressUIFragment.getClass();
            C97625j3.m125812b().mo105907v().remove(openIMAddressUIFragment.f218696f);
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            z1Var.mo62935u4();
            C45628s0.m50761Z(z1Var, true);
            C97625j3.m125812b().mo105907v().mo69719p3(str, z1Var);
            C44884w2 w2Var = openIMAddressUIFragment.f218696f;
            w2Var.f218911T.add(str);
            w2Var.mo104618q(str, 5);
            C97625j3.m125812b().mo105907v().add(openIMAddressUIFragment.f218696f);
        }

        /* renamed from: L */
        public final void mo103411L() {
            this.f218707t = new LinkedList();
            this.f218708u = new LinkedList();
            ((LinkedList) this.f218707t).add("tmessage");
            ((LinkedList) this.f218708u).addAll(this.f218707t);
            if (!((LinkedList) this.f218707t).contains("officialaccounts")) {
                ((LinkedList) this.f218707t).add("officialaccounts");
            }
            ((LinkedList) this.f218707t).add("helper_entry");
            C44884w2 w2Var = this.f218696f;
            if (w2Var != null) {
                w2Var.mo103505J(this.f218707t);
            }
            C75635b bVar = this.f218697g;
            if (bVar != null) {
                bVar.mo105988x(new C75643c(bVar, this.f218708u));
            }
        }

        /* renamed from: M */
        public final synchronized void mo103412M() {
            long currentTimeMillis = System.currentTimeMillis();
            mo103411L();
            Log.m105924i("MicroMsg.OpenIMAddressUI", "KEVIN updateBlockList() LAST" + (System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.f218696f != null) {
                Log.m105926v("MicroMsg.OpenIMAddressUI", "post to do refresh");
                MMHandlerThread.postToMainThread(new C74527m2(this));
            }
            if (this.f218697g != null) {
                MMHandlerThread.postToMainThread(new C74529n2(this));
            }
            Log.m105924i("MicroMsg.OpenIMAddressUI", "KEVIN doRefresh() LAST" + (System.currentTimeMillis() - currentTimeMillis2));
        }

        public int getLayoutId() {
            return C0966R.C0971layout.blz;
        }

        public View getLayoutView() {
            return LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.blz, (ViewGroup) null);
        }

        public void onActivityCreated(Bundle bundle) {
            super.onActivityCreated(bundle);
            Log.m105926v("MicroMsg.OpenIMAddressUI", "on address ui create");
            C97625j3.m125815e().mo123455a(138, this);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123455a(453, this);
            this.f218694d = getStringExtra("key_openim_acctype_id");
            setMMTitle(((C76158j) C86312j.m106911c(C76158j.class)).mo106369nc(this.f218694d, "openim_acct_type_title", C76158j.C8510a.TYPE_WORDING));
            setBackBtn(new C74537o2(this));
            setTitleBarDoubleClickListener(this.f218704q);
            Log.m105927v("MicroMsg.OpenIMAddressUI", "on address ui init view, %s", getResources().getDisplayMetrics());
            ListView listView = (ListView) findViewById(C0966R.C0970id.f5610jr);
            this.f218695e = listView;
            listView.setScrollingCacheEnabled(false);
            C44884w2 w2Var = new C44884w2(getContext(), "@openim.contact", (String) null, 2, true, this.f218694d);
            this.f218696f = w2Var;
            w2Var.f220761i = new C74540p2(this);
            w2Var.f218904L = true;
            w2Var.f121751W = this;
            w2Var.f218897E = new C74552q2(this);
            w2Var.f218896D = new C74556r2(this);
            new C6934s2(this);
            C75635b bVar = new C75635b(getContext(), 1);
            this.f218697g = bVar;
            bVar.mo105988x(new C75644d(bVar, true));
            this.f218699i = new C45940u(getContext());
            this.f218695e.setOnItemClickListener(new C74566t2(this));
            this.f218695e.setOnItemLongClickListener(new C74570u2(this));
            this.f218695e.setOnTouchListener(new C74574v2(this));
            this.f218695e.setOnScrollListener(this.f218706s);
            this.f218695e.setDrawingCacheEnabled(false);
            C97625j3.m125812b().mo105907v().add(this.f218696f);
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            Log.m105925i("MicroMsg.OpenIMAddressUI", "onAcvityResult requestCode: %d", Integer.valueOf(i));
            if (i == 6 && i2 == -1) {
                setResult(-1);
                finish();
            } else if (i2 == -1 && i == 4) {
                setResult(-1, intent);
                finish();
            }
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Class cls = C76979h.class;
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f218698h);
            if (z1Var == null) {
                Log.m105920e("MicroMsg.OpenIMAddressUI", "onCreateContextMenu, contact is null, username = " + this.f218698h);
            } else if (!C75592q0.m90789s().equals(z1Var.getUsername())) {
                if (C45628s0.m50743H(this.f218698h)) {
                    contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(cls)).mo107057T1(view.getContext(), z1Var.mo62898f()));
                    contextMenu.add(adapterContextMenuInfo.position, 2, 0, C0966R.string.f7452gn);
                } else if (!C72996z1.m85793A5(this.f218698h) && !C72996z1.m85816S4(this.f218698h)) {
                    contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(cls)).mo107057T1(view.getContext(), z1Var.mo62898f()));
                    if (z1Var.mo62927s3() && z1Var.mo73975s2() != 1) {
                        contextMenu.add(adapterContextMenuInfo.position, 7, 0, C0966R.string.bod);
                    }
                }
            }
        }

        public void onDestroy() {
            super.onDestroy();
            Log.m105926v("MicroMsg.OpenIMAddressUI", "onDestory");
            C97625j3.m125815e().mo123470p(138, this);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(453, this);
            C44884w2 w2Var = this.f218696f;
            if (w2Var != null) {
                w2Var.mo104608d(true);
                this.f218696f.getClass();
                this.f218696f.f220761i = null;
            }
            C75635b bVar = this.f218697g;
            if (bVar != null) {
                C46863b bVar2 = bVar.f222215z;
                if (bVar2 != null) {
                    bVar2.mo72071a();
                    bVar.f222215z = null;
                }
                this.f218697g.mo5580b();
            }
            if (C97625j3.m125811a() && this.f218696f != null) {
                C97625j3.m125812b().mo105907v().remove(this.f218696f);
            }
        }

        public void onPause() {
            super.onPause();
            Log.m105924i("MicroMsg.OpenIMAddressUI", "AddressUI on Pause");
            C75635b bVar = this.f218697g;
            if (bVar != null) {
                C97625j3.m125815e().mo123470p(106, bVar);
            }
            this.f218696f.f218898F.mo97958c();
            MMHandlerThread.postToMainThread(new C74407f());
        }

        public void onResume() {
            super.onResume();
            Log.m105926v("MicroMsg.OpenIMAddressUI", "address ui on resume");
            if (this.f218703p) {
                this.f218703p = false;
                this.f218702o = false;
                mo103411L();
                this.f218695e.setAdapter(this.f218696f);
                this.f218695e.post(new C74404c());
                this.f218697g.mo105989z(false);
            } else if (this.f218702o) {
                this.f218702o = false;
                ThreadPool.post((Runnable) new C74405d(), "AddressUI_updateUIData", 4);
            }
            C75635b bVar = this.f218697g;
            if (bVar != null) {
                C97625j3.m125815e().mo123455a(106, bVar);
            }
            this.f218696f.f220764o = false;
            MMHandlerThread.postToMainThread(new C74406e());
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar.getType() == 453) {
                if (i == 0 && i2 == 0 && !((C49947j52) ((C33548p) yVar).f90826e.f127056b.f127083a).f135876f.isEmpty()) {
                    mo103412M();
                }
            } else if (Util.isTopActivity(getContext())) {
                C74785j2.C6981a.m7247a(getContext(), i, i2, str, 4);
            }
        }

        public boolean supportNavigationSwipeBack() {
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.blv;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(16908290) == null) {
            OpenIMAddressUIFragment openIMAddressUIFragment = new OpenIMAddressUIFragment();
            this.f218692d = openIMAddressUIFragment;
            openIMAddressUIFragment.setArguments(getIntent().getExtras());
            C112919c0 beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.mo165167i(C0966R.C0970id.f7a, this.f218692d, (String) null, 1);
            beginTransaction.mo165162d();
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.OpenIMAddressUI).mo86179qs(this, C76986a.WorkWxContacts);
    }
}
