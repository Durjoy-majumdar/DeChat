package com.tencent.p014mm.plugin.game.p061ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42058g0;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.model.C42142w0;
import com.tencent.p014mm.plugin.game.p061ui.C42307d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import ry1.C48130k0;
import ry1.C48134m;
import ry1.C48135m0;
import ry1.C48137n;
import ry1.C48138n0;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameCategoryUI */
public class GameCategoryUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ListView f113664d;

    /* renamed from: e */
    public C42241c f113665e;

    /* renamed from: f */
    public View f113666f;

    /* renamed from: g */
    public Dialog f113667g;

    /* renamed from: h */
    public boolean f113668h = false;

    /* renamed from: i */
    public int f113669i = 0;

    /* renamed from: j */
    public boolean f113670j = false;

    /* renamed from: n */
    public int f113671n;

    /* renamed from: o */
    public int f113672o;

    /* renamed from: p */
    public String f113673p;

    /* renamed from: q */
    public int f113674q = 0;

    /* renamed from: r */
    public C48130k0 f113675r = new C48130k0();

    /* renamed from: s */
    public C42307d.C42311d f113676s = new C42157a();

    /* renamed from: t */
    public AbsListView.OnScrollListener f113677t = new C42158b();

    /* renamed from: com.tencent.mm.plugin.game.ui.GameCategoryUI$a */
    public class C42157a implements C42307d.C42311d {
        public C42157a() {
        }

        /* renamed from: a */
        public void mo66127a(int i) {
            int firstVisiblePosition = GameCategoryUI.this.f113664d.getFirstVisiblePosition();
            int lastVisiblePosition = GameCategoryUI.this.f113664d.getLastVisiblePosition();
            if (i >= firstVisiblePosition && i <= lastVisiblePosition) {
                GameCategoryUI.this.f113665e.mo66380l(GameCategoryUI.this.f113664d.getChildAt(i - firstVisiblePosition), i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameCategoryUI$b */
    public class C42158b implements AbsListView.OnScrollListener {
        public C42158b() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                GameCategoryUI gameCategoryUI = GameCategoryUI.this;
                if (!gameCategoryUI.f113670j || gameCategoryUI.f113668h) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                    return;
                }
                View view = gameCategoryUI.f113666f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                GameCategoryUI gameCategoryUI2 = GameCategoryUI.this;
                C86709a0.m107524d().mo123460f(new C42142w0(gameCategoryUI2.f113669i, 15, gameCategoryUI2.f113671n, gameCategoryUI2.f113672o));
                gameCategoryUI2.f113668h = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameCategoryUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameCategoryUI$c */
    public class C42159c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47465a f113680d;

        /* renamed from: com.tencent.mm.plugin.game.ui.GameCategoryUI$c$a */
        public class C42160a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C42058g0 f113682d;

            public C42160a(C42058g0 g0Var) {
                this.f113682d = g0Var;
            }

            public void run() {
                GameCategoryUI gameCategoryUI = GameCategoryUI.this;
                C42058g0 g0Var = this.f113682d;
                boolean z = gameCategoryUI.f113669i != 0;
                gameCategoryUI.f113670j = g0Var.f113315a.f127853e;
                if (!z) {
                    C42241c cVar = gameCategoryUI.f113665e;
                    LinkedList<C42039b> linkedList = g0Var.f113316b;
                    cVar.getClass();
                    if (linkedList != null) {
                        ThreadPool.post(new C48138n0(cVar, linkedList), "game_get_download_info");
                    }
                } else {
                    C42241c cVar2 = gameCategoryUI.f113665e;
                    LinkedList<C42039b> linkedList2 = g0Var.f113316b;
                    cVar2.getClass();
                    if (linkedList2 != null) {
                        C86709a0.m107525e().postToWorker(new C48135m0(cVar2, linkedList2));
                    }
                }
                GameCategoryUI gameCategoryUI2 = GameCategoryUI.this;
                gameCategoryUI2.f113668h = false;
                View view = gameCategoryUI2.f113666f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameCategoryUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                GameCategoryUI gameCategoryUI3 = GameCategoryUI.this;
                gameCategoryUI3.f113669i += 15;
                Dialog dialog = gameCategoryUI3.f113667g;
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }

        public C42159c(C47465a aVar) {
            this.f113680d = aVar;
        }

        public void run() {
            C47465a aVar = this.f113680d;
            GameCategoryUI gameCategoryUI = GameCategoryUI.this;
            MMHandlerThread.postToMainThread(new C42160a(new C42058g0(aVar, gameCategoryUI.f113671n, gameCategoryUI.f113669i)));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.auh;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C42112t tVar;
        C42112t tVar2;
        super.onActivityResult(i, i2, intent);
        int i3 = 0;
        Log.m105925i("MicroMsg.GameCategoryUI", "requestCode = %d, resultCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 1) {
            Log.m105920e("MicroMsg.GameCategoryUI", "error request code");
            return;
        }
        C42039b bVar = null;
        String stringExtra = intent != null ? intent.getStringExtra("game_app_id") : null;
        if (i2 != 2) {
            if (i2 == 3 && !Util.isNullOrNil(stringExtra)) {
                C42241c cVar = this.f113665e;
                cVar.getClass();
                if (!Util.isNullOrNil(stringExtra) && cVar.f114392r.containsKey(stringExtra) && (tVar2 = cVar.f114392r.get(stringExtra)) != null) {
                    tVar2.mo66073b();
                }
            }
        } else if (!Util.isNullOrNil(stringExtra)) {
            C42241c cVar2 = this.f113665e;
            cVar2.getClass();
            if (!Util.isNullOrNil(stringExtra) && cVar2.f114392r.containsKey(stringExtra) && (tVar = cVar2.f114392r.get(stringExtra)) != null) {
                tVar.f113425c = 1;
            }
            C42241c cVar3 = this.f113665e;
            while (true) {
                if (i3 >= cVar3.f128963e.size()) {
                    break;
                } else if (((C42039b) cVar3.f128963e.get(i3)).field_appId.equals(stringExtra)) {
                    bVar = (C42039b) cVar3.f128963e.get(i3);
                    break;
                } else {
                    i3++;
                }
            }
            if (bVar != null) {
                if (!cVar3.f114392r.containsKey(bVar.field_appId)) {
                    Log.m105920e("MicroMsg.GameListAdapter", "No DownloadInfo found");
                } else {
                    cVar3.f114394t.mo72863a(bVar, cVar3.f114392r.get(bVar.field_appId));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f113671n = getIntent().getIntExtra("extra_type", 0);
        this.f113672o = getIntent().getIntExtra("extra_category_id", 0);
        this.f113673p = getIntent().getStringExtra("extra_category_name");
        this.f113674q = getIntent().getIntExtra("game_report_from_scene", 0);
        C86709a0.m107524d().mo123455a(1220, this);
        setMMTitle(this.f113673p);
        setBackBtn(new C48134m(this));
        if (!Util.isNullOrNil("")) {
            addIconOptionMenu(0, (int) C0966R.string.k3j, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new C48137n(this));
        }
        ListView listView = (ListView) findViewById(C0966R.C0970id.ei7);
        this.f113664d = listView;
        listView.setOnItemClickListener(this.f113675r);
        this.f113675r.f129022d = this.f113674q;
        this.f113664d.setOnScrollListener(this.f113677t);
        C42241c cVar = new C42241c(this);
        this.f113665e = cVar;
        cVar.f114390p = this.f113674q;
        cVar.f114395u = this.f113676s;
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0966R.C0971layout.awy, this.f113664d, false);
        this.f113666f = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameCategoryUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameCategoryUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f113664d.addFooterView(this.f113666f);
        this.f113664d.setAdapter(this.f113665e);
        Dialog d = C52642c.m58986d(this);
        this.f113667g = d;
        d.show();
        C41864d.m45384a(this);
        C86709a0.m107524d().mo123460f(new C42142w0(this.f113669i, 15, this.f113671n, this.f113672o));
        this.f113668h = true;
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(1220, this);
        C41864d.m45388e(this);
        this.f113665e.mo66379i();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            C86709a0.m107525e().postToWorker(new C42159c(((C42142w0) yVar).f113588e.f127056b.f127083a));
            return;
        }
        Log.m105921e("MicroMsg.GameCategoryUI", "errType: %d, errCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
