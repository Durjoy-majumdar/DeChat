package com.tencent.p014mm.plugin.game.p061ui.tab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.game.model.C42114u;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.model.GameTabData;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import kg3.C76577a;
import qy1.C12934a;
import sw1.C48483p;
import sy1.C48505a;
import sy1.C48506b;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWidget */
public class GameTabWidget extends LinearLayout {

    /* renamed from: f */
    public static int f114683f;

    /* renamed from: d */
    public Activity f114684d;

    /* renamed from: e */
    public C48505a f114685e;

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWidget$b */
    public static class C30115b implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (gVar != null) {
                gVar.mo894a(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWidget$a */
    public class C42394a extends DataSetObserver {
        public C42394a() {
        }

        public void onChanged() {
            GameTabWidget.m46062a(GameTabWidget.this);
        }

        public void onInvalidated() {
            GameTabWidget.m46062a(GameTabWidget.this);
        }
    }

    public GameTabWidget(Context context) {
        super(context);
        mo66462b(context);
    }

    /* renamed from: a */
    public static void m46062a(GameTabWidget gameTabWidget) {
        int count = gameTabWidget.f114685e.getCount();
        if (count != 0) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92145A(gameTabWidget.f114684d) / count, -1);
            for (int i = 0; i < count; i++) {
                View view = gameTabWidget.f114685e.getView(i, (View) null, gameTabWidget);
                view.setOnClickListener(new C48506b(gameTabWidget));
                view.setLayoutParams(layoutParams);
                gameTabWidget.addView(view);
            }
        }
    }

    /* renamed from: c */
    public static void m46063c(Activity activity, GameTabData.TabItem tabItem, boolean z, boolean z2, boolean z3) {
        boolean z4;
        String str;
        GameTabData.StatusBar statusBar;
        Activity activity2 = activity;
        GameTabData.TabItem tabItem2 = tabItem;
        boolean z5 = z3;
        if (activity2 != null && tabItem2 != null && !C52642c.m58985c(activity2, tabItem2.f113195f)) {
            String stringExtra = activity.getIntent().getStringExtra("tab_key");
            if (!Util.nullAsNil(tabItem2.f113193d).equals(stringExtra)) {
                Log.m105925i("MicroMsg.GameTabWidget", "current_page:%s, next_page:%s, hasAnimation:%b", activity.getClass().getSimpleName(), tabItem2.f113202p, Boolean.valueOf(z));
                Intent intent = new Intent();
                intent.setClassName(activity2, tabItem2.f113202p);
                Bundle extras = activity.getIntent().getExtras();
                if (extras != null) {
                    intent.putExtras(extras);
                } else {
                    extras = new Bundle();
                }
                Bundle bundle = new Bundle();
                bundle.putString("tab_key", tabItem2.f113193d);
                GameTabData gameTabData = (GameTabData) extras.getParcelable("tab_data");
                if (gameTabData != null) {
                    GameTabData.TabItem tabItem3 = gameTabData.f113189d.get(Util.nullAsNil(stringExtra));
                    if (tabItem3 != null) {
                        tabItem3.f113203q = true;
                    }
                    GameTabData.TabItem tabItem4 = gameTabData.f113189d.get(tabItem2.f113193d);
                    boolean z6 = tabItem4 != null ? tabItem4.f113203q : false;
                    bundle.putParcelable("tab_data", gameTabData);
                    z4 = z6;
                } else {
                    z4 = false;
                }
                if (!z5) {
                    str = "game_report_from_scene";
                    C40314g.m43487f(activity, 18, tabItem2.f113204r, tabItem2.f113205s, 2, (String) null, activity.getIntent().getIntExtra("game_report_from_scene", 0), C12934a.m12382d(tabItem2.f113206t));
                } else {
                    str = "game_report_from_scene";
                }
                if (!tabItem2.f113197h) {
                    bundle.putString("rawUrl", tabItem2.f113195f);
                    bundle.putBoolean("KRightBtn", true);
                    bundle.putBoolean("isWebwx", true);
                    bundle.putBoolean("show_bottom", false);
                    bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, activity2.getString(C0966R.string.fcu));
                    bundle.putBoolean("forceHideShare", true);
                    bundle.putBoolean("disable_swipe_back", true);
                    bundle.putBoolean("show_native_web_view", true);
                    bundle.putBoolean("disable_progress_bar", true);
                    bundle.putBoolean("disable_bounce_scroll", true);
                    bundle.putInt("screen_orientation", 1);
                    bundle.putString("KPublisherId", "game_center_entrance");
                    bundle.putInt("geta8key_scene", 32);
                    if (!(gameTabData == null || (statusBar = gameTabData.f113190e) == null)) {
                        bundle.putString("status_bar_style", statusBar.f113191d);
                        bundle.putInt("customize_status_bar_color", gameTabData.f113190e.f113192e);
                    }
                    bundle.putBoolean("game_check_float", z5);
                    String string = bundle.getString("rawUrl");
                    if (!Util.isNullOrNil(string)) {
                        if (z5) {
                            boolean booleanExtra = intent.getBooleanExtra("from_find_more_friend", false);
                            int intExtra = intent.getIntExtra(str, 0);
                            if (booleanExtra) {
                                C42119w h = ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar().mo65979h();
                                bundle.putString("rawUrl", C42114u.m45824a(string, h, (Intent) null, true));
                                if (h != null) {
                                    h.mo66075l2();
                                    C42119w.C42121b bVar = h.f113442C1;
                                    if (bVar.f113506d) {
                                        bundle.putString("game_transparent_float_url", bVar.f113503a);
                                    }
                                    bundle.putInt("game_sourceScene", intExtra);
                                }
                            }
                        } else {
                            bundle.remove("game_transparent_float_url");
                            bundle.remove("game_sourceScene");
                        }
                    }
                }
                intent.putExtras(bundle);
                m46064d(activity, intent, z, z2, z4, tabItem2.f113197h);
            }
        }
    }

    /* renamed from: d */
    public static void m46064d(Activity activity, Intent intent, boolean z, boolean z2, boolean z3, boolean z4) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        Object[] objArr = new Object[5];
        objArr[0] = intent.getComponent() == null ? "" : intent.getComponent().getClassName();
        objArr[1] = Boolean.valueOf(z3);
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = Boolean.valueOf(z2);
        objArr[4] = Boolean.valueOf(z4);
        Log.m105925i("MicroMsg.GameTabWidget", "(%s isActivityExist):%b, hasAnimation:%b, forceFinish:%b, isNative:%b", objArr);
        Log.m105924i("MicroMsg.GameTabWidget", (z3 || z4) ? "straight to jump" : "jump to bridge");
        if (!z3 && z4) {
            ((C40327m) C86312j.m106911c(C40327m.class)).X80(null, C30115b.class, (C1256g) null);
        }
        if (z3 || z4) {
            f114683f = 0;
            intent.addFlags(131072);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            Intent intent3 = new Intent(activity, GameTabBridgeUI.class);
            intent3.putExtras(intent.getExtras());
            intent3.putExtra("next_tab_component", intent.getComponent());
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent3);
            C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (z2 && !activity.isDestroyed() && !activity.isFinishing()) {
            activity.finish();
        }
        if (z) {
            activity.overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
        } else {
            activity.overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
        }
    }

    /* renamed from: b */
    public final void mo66462b(Context context) {
        this.f114684d = (Activity) context;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundResource(C0966R.color.f3518w2);
        setOrientation(0);
    }

    public void setAdapter(C48505a aVar) {
        this.f114685e = aVar;
        aVar.registerDataSetObserver(new C42394a());
        aVar.notifyDataSetChanged();
    }

    public GameTabWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66462b(context);
    }

    public GameTabWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66462b(context);
    }
}
