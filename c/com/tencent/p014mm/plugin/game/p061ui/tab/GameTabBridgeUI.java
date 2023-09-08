package com.tencent.p014mm.plugin.game.p061ui.tab;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.plugin.game.C4443h;
import com.tencent.p014mm.plugin.game.model.GameTabData;
import com.tencent.p014mm.plugin.game.p061ui.GameCenterActivity;
import com.tencent.p014mm.plugin.game.p061ui.tab.GameTabWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke3.C88144b;
import nj3.C88989a;
import sy1.C48505a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI */
public class GameTabBridgeUI extends GameCenterActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f114666i = 0;

    /* renamed from: h */
    public BroadcastReceiver f114667h = new C42389c();

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI$a */
    public class C42387a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ long f114668d;

        /* renamed from: e */
        public final /* synthetic */ Intent f114669e;

        public C42387a(long j, Intent intent) {
            this.f114668d = j;
            this.f114669e = intent;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            MMHandlerThread.postToMainThread(new C42395a(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI$b */
    public class C42388b implements MenuItem.OnMenuItemClickListener {
        public C42388b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameTabBridgeUI gameTabBridgeUI = GameTabBridgeUI.this;
            int i = GameTabBridgeUI.f114666i;
            gameTabBridgeUI.mo66453N7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI$c */
    public class C42389c extends BroadcastReceiver {
        public C42389c() {
        }

        public void onReceive(Context context, Intent intent) {
            GameTabBridgeUI gameTabBridgeUI;
            if (intent != null && "com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) && (gameTabBridgeUI = GameTabBridgeUI.this) != null && !gameTabBridgeUI.isFinishing()) {
                Log.m105924i("MicroMsg.GameTabBridgeUI", "GameTabBridgeUI exit!");
                GameTabBridgeUI.this.finish();
            }
        }
    }

    /* renamed from: H7 */
    public String mo66117H7() {
        return null;
    }

    /* renamed from: I7 */
    public String mo66118I7() {
        return null;
    }

    /* renamed from: J7 */
    public int mo66119J7() {
        return 0;
    }

    /* renamed from: K7 */
    public int mo66120K7() {
        return 0;
    }

    /* renamed from: L7 */
    public int mo66121L7() {
        return 0;
    }

    /* renamed from: M7 */
    public boolean mo66122M7() {
        return false;
    }

    /* renamed from: N7 */
    public final void mo66453N7() {
        Log.m105924i("MicroMsg.GameTabBridgeUI", "GameTabHomeUI goBack!");
        if (Util.nullAsNil(getIntent().getStringExtra("jump_find_more_friends")).equals("jump_find_more_friends")) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 2);
            C88144b.m109801s(this, ".ui.LauncherUI", intent, (Bundle) null);
            finish();
            overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
            Log.m105924i("MicroMsg.GameTabBridgeUI", "back to FindMoreFriendsUI");
        }
        sendBroadcast(new Intent("com.tencent.mm.game.ACTION_EXIT"), C4443h.f19181a);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aug;
    }

    public void initView() {
        setBackBtn(new C42388b());
        setMMTitle((int) C0966R.string.fcu);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.GameTabBridgeUI", "%s create", getClass().getSimpleName());
        GameTabWidget.f114683f = hashCode();
        initView();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        registerReceiver(this.f114667h, intentFilter, C4443h.f19181a, (Handler) null);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("tab_key");
        C48505a aVar = new C48505a(this);
        ((GameTabWidget) findViewById(C0966R.C0970id.kda)).setAdapter(aVar);
        aVar.f129728e = (GameTabData) intent.getParcelableExtra("tab_data");
        aVar.f129729f = stringExtra;
        aVar.notifyDataSetChanged();
        intent.setComponent((ComponentName) intent.getParcelableExtra("next_tab_component"));
        ((C40327m) C86312j.m106911c(C40327m.class)).X80(null, GameTabWidget.C30115b.class, new C42387a(System.currentTimeMillis(), intent));
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f114667h);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo66453N7();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }
}
