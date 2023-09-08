package com.tencent.p014mm.plugin.subapp.p109ui.friend;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.MobileFriendUI;
import com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.AddMoreFriendsUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72979k3;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import fd0.C75742g;
import fd0.C75743h;
import hg0.C76186t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import mg0.C76755c;
import nj3.C11184p0;
import o31.C11345b;
import o31.C76986a;
import p255vr.C65873e;
import p286zl.C79396l;
import p629ny.C76979h;
import sf0.C13658a;
import uo3.C78253a;
import yw2.C79153a;
import yw2.C79154b;

/* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI */
public class FMessageConversationUI extends MMActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f21295p = 0;

    /* renamed from: d */
    public ListView f21296d;

    /* renamed from: e */
    public C79154b f21297e;

    /* renamed from: f */
    public View f21298f;

    /* renamed from: g */
    public View f21299g;

    /* renamed from: h */
    public int f21300h = 0;

    /* renamed from: i */
    public int f21301i = 0;

    /* renamed from: j */
    public long f21302j;

    /* renamed from: n */
    public String f21303n;

    /* renamed from: o */
    public C11184p0 f21304o = new C5497h();

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$a */
    public class C5490a implements C6975i1.C6977b {
        public C5490a() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            FMessageConversationUI fMessageConversationUI = FMessageConversationUI.this;
            int i = FMessageConversationUI.f21295p;
            fMessageConversationUI.mo6528H7();
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$b */
    public class C5491b implements View.OnClickListener {
        public C5491b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C65873e) C86312j.m106911c(C65873e.class)).mo89919mw(FMessageConversationUI.this.getContext(), ".ui.FTSAddFriendUI", new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0), ActivityOptions.makeSceneTransitionAnimation(FMessageConversationUI.this, new Pair[0]).toBundle());
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$c */
    public class C5492c implements View.OnClickListener {
        public C5492c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C76186t.m91534b() != C79396l.SUCC) {
                Intent intent = new Intent(FMessageConversationUI.this.getContext(), BindMContactIntroUI.class);
                intent.putExtra("key_upload_scene", 5);
                MMWizardActivity.m7017L7(FMessageConversationUI.this.getContext(), intent);
            } else {
                FMessageConversationUI fMessageConversationUI = FMessageConversationUI.this;
                Intent intent2 = new Intent(FMessageConversationUI.this.getContext(), MobileFriendUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                FMessageConversationUI fMessageConversationUI2 = fMessageConversationUI;
                C117292a.m165358d(fMessageConversationUI2, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                fMessageConversationUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(fMessageConversationUI2, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$d */
    public class C5493d implements View.OnTouchListener {
        public C5493d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                FMessageConversationUI.this.f21300h = (int) motionEvent.getRawX();
                FMessageConversationUI.this.f21301i = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$e */
    public class C5494e implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C78253a f21309d;

        public C5494e(C78253a aVar) {
            this.f21309d = aVar;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < FMessageConversationUI.this.f21296d.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.FMessageConversationUI", "on header view long click, ignore");
                return true;
            }
            C78253a aVar = this.f21309d;
            FMessageConversationUI fMessageConversationUI = FMessageConversationUI.this;
            aVar.mo108272g(view, i - FMessageConversationUI.this.f21296d.getHeaderViewsCount(), j, fMessageConversationUI, fMessageConversationUI.f21304o, fMessageConversationUI.f21300h, fMessageConversationUI.f21301i);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$f */
    public class C5495f implements MenuItem.OnMenuItemClickListener {
        public C5495f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent(FMessageConversationUI.this, AddMoreFriendsUI.class);
            intent.putExtra("invite_friend_scene", 3);
            FMessageConversationUI fMessageConversationUI = FMessageConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            FMessageConversationUI fMessageConversationUI2 = fMessageConversationUI;
            C117292a.m165358d(fMessageConversationUI2, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$6", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            fMessageConversationUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(fMessageConversationUI2, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$6", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$g */
    public class C5496g implements MenuItem.OnMenuItemClickListener {
        public C5496g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FMessageConversationUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI$h */
    public class C5497h implements C11184p0 {
        public C5497h() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            FMessageConversationUI fMessageConversationUI = FMessageConversationUI.this;
            C75742g.m91009a(fMessageConversationUI.f21302j, fMessageConversationUI.f21303n);
        }
    }

    /* renamed from: H7 */
    public final void mo6528H7() {
        if (this.f21297e.getCount() > 0) {
            View findViewById = this.f21298f.findViewById(C0966R.C0970id.j75);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = this.f21299g.findViewById(C0966R.C0970id.f5589j7);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(0, true);
            return;
        }
        View findViewById3 = this.f21298f.findViewById(C0966R.C0970id.j75);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view3 = findViewById3;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = this.f21299g.findViewById(C0966R.C0970id.f5589j7);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view4 = findViewById4;
        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        enableOptionMenu(0, false);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359792as0;
    }

    public void initView() {
        this.f21297e = new C79154b(getContext());
        C75743h.vx0().add(this.f21297e);
        this.f21297e.f24699h = new C5490a();
        this.f21296d = (ListView) findViewById(C0966R.C0970id.eb_);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.as4, (ViewGroup) null);
        this.f21298f = inflate;
        inflate.findViewById(C0966R.C0970id.j75).setOnClickListener(new C5491b());
        this.f21296d.addHeaderView(this.f21298f);
        View inflate2 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359793as1, (ViewGroup) null);
        this.f21299g = inflate2;
        inflate2.findViewById(C0966R.C0970id.f5587j5).setOnClickListener(new C5492c());
        this.f21296d.addHeaderView(this.f21299g);
        this.f21296d.setAdapter(this.f21297e);
        mo6528H7();
        this.f21296d.setOnTouchListener(new C5493d());
        this.f21296d.setOnItemLongClickListener(new C5494e(new C78253a(this)));
        this.f21296d.setOnItemClickListener(new C79153a(getContext(), this.f21297e, this.f21296d.getHeaderViewsCount() > 0));
        addTextOptionMenu(0, getString(C0966R.string.grn), new C5495f());
        setBackBtn(new C5496g());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.exp);
        hideActionbarLine();
        try {
            ((MMNotification) C97625j3.m125816f()).mo93209g();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FMessageConversationUI", e, "try cancel notification fail", new Object[0]);
        }
        if (!C97625j3.m125811a()) {
            finish();
            return;
        }
        initView();
        if (C86709a0.m107522a() && C76186t.m91533a() && !C76186t.m91539g()) {
            HashSet<C76755c> hashSet = C13658a.f38695a;
            if (MultiProcessMMKV.getDefault().getInt("ADDRBOOK_HAD_UPDATE_KEY", 0) != 1) {
                boolean z = (C75592q0.m90787q() & 256) == 0;
                Log.m105925i("MicroMsg.FMessageConversationUI", "mark addr book had update. %b", Boolean.valueOf(z));
                if (z) {
                    C13658a.m12959a(C13658a.f38696b);
                }
            }
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FMessageConversationUI).mo86179qs(this, C76986a.NewFriends);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        C72979k3 k3Var = (C72979k3) this.f21297e.getItem(adapterContextMenuInfo.position);
        if (k3Var == null) {
            Log.m105920e("MicroMsg.FMessageConversationUI", "onItemLongClick, item is null, pos = " + adapterContextMenuInfo.position);
            return;
        }
        if (!Util.isNullOrNil(k3Var.field_displayName)) {
            contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, k3Var.field_displayName));
        }
        contextMenu.add(0, 0, 0, C0966R.string.f7944x1);
        this.f21302j = k3Var.field_fmsgSysRowId;
        this.f21303n = k3Var.field_talker;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f21297e != null) {
            C75743h.vx0().remove(this.f21297e);
        }
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105928w("MicroMsg.FMessageConversationUI", "account not init.");
        } else {
            C75743h.vx0().mo101172jo();
        }
    }

    public void onPause() {
        super.onPause();
        C97625j3.m125812b().mo105906u().mo119676J(143618, 0);
    }

    public void onResume() {
        super.onResume();
        if (!C97625j3.m125811a()) {
            finish();
        }
    }
}
