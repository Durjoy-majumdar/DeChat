package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GameLifeSessionStruct;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di0.C86299o;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jx1.C46577a;
import k20.C9556a;
import kg3.C76577a;
import kr0.C76630x0;
import org.json.JSONObject;
import p823sg.C90193h;
import q20.C89449a;
import sw1.C48484q;
import uy1.C52642c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 */
public class GameTabWidget2 extends LinearLayout {

    /* renamed from: o */
    public static final String f114292o;

    /* renamed from: d */
    public Activity f114293d;

    /* renamed from: e */
    public C42265b f114294e;

    /* renamed from: f */
    public boolean f114295f = true;

    /* renamed from: g */
    public boolean f114296g = false;

    /* renamed from: h */
    public boolean f114297h = true;

    /* renamed from: i */
    public GameTabData2.TabItem f114298i;

    /* renamed from: j */
    public boolean f114299j = false;

    /* renamed from: n */
    public List<View> f114300n = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$a */
    public class C42264a extends DataSetObserver {
        public C42264a() {
        }

        public void onChanged() {
            GameTabWidget2.m45945a(GameTabWidget2.this);
        }

        public void onInvalidated() {
            GameTabWidget2.m45945a(GameTabWidget2.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b */
    public class C42265b extends BaseAdapter {

        /* renamed from: d */
        public Context f114302d;

        /* renamed from: e */
        public GameTabData2 f114303e;

        /* renamed from: f */
        public String f114304f;

        /* renamed from: g */
        public String f114305g;

        /* renamed from: h */
        public Map<String, C42267b> f114306h = new HashMap();

        /* renamed from: i */
        public int f114307i = 0;

        /* renamed from: j */
        public boolean f114308j = false;

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b$a */
        public class C42266a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f114310d;

            public C42266a(boolean z) {
                this.f114310d = z;
            }

            public void run() {
                C42265b bVar = C42265b.this;
                bVar.mo66346g(bVar.f114307i, this.f114310d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$b$b */
        public class C42267b {

            /* renamed from: a */
            public TextView f114312a;

            /* renamed from: b */
            public ImageView f114313b;

            /* renamed from: c */
            public ImageView f114314c;

            /* renamed from: d */
            public TextView f114315d;

            public C42267b(C42265b bVar, View view) {
                this.f114312a = (TextView) view.findViewById(C0966R.C0970id.ahw);
                this.f114313b = (ImageView) view.findViewById(C0966R.C0970id.aht);
                this.f114314c = (ImageView) view.findViewById(C0966R.C0970id.itx);
                this.f114315d = (TextView) view.findViewById(C0966R.C0970id.ahv);
            }
        }

        public C42265b(Context context) {
            this.f114302d = context;
        }

        /* renamed from: a */
        public final void mo66342a(String str, ImageView imageView) {
            if (!Util.isNullOrNil(str) && imageView != null && !Util.isNullOrNil(str)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59346b = true;
                bVar.f59350f = GameTabWidget2.f114292o + C90193h.m112878f(str.getBytes());
                C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
            }
        }

        /* renamed from: b */
        public final int mo66343b(String str, boolean z) {
            int w = C52642c.m59005w(str);
            return w == 0 ? z ? GameTabWidget2.this.getResources().getColor(C0966R.color.f3536x0) : GameTabWidget2.this.getResources().getColor(C0966R.color.f3499ve) : w;
        }

        /* renamed from: d */
        public final void mo66344d(C42267b bVar, GameTabData2.TabItem tabItem, boolean z, String str) {
            bVar.f114314c.setVisibility(8);
            if (Util.nullAsNil(tabItem.f114267d).equalsIgnoreCase(str)) {
                bVar.f114314c.setVisibility(0);
            }
            if (C85875k4.m106211z()) {
                int b = mo66343b(tabItem.f114271h, z);
                int b2 = mo66343b(tabItem.f114272i, z);
                String str2 = tabItem.f114275o;
                String str3 = tabItem.f114276p;
                if (Util.isNullOrNil(str3)) {
                    str3 = str2;
                }
                if (Util.isNullOrNil(str2)) {
                    str2 = tabItem.f114273j;
                    str3 = tabItem.f114274n;
                }
                if (z) {
                    mo66342a(str3, bVar.f114313b);
                    bVar.f114312a.setTextColor(b2);
                    return;
                }
                mo66342a(str2, bVar.f114313b);
                bVar.f114312a.setTextColor(b);
                return;
            }
            int b3 = mo66343b(tabItem.f114269f, z);
            int b4 = mo66343b(tabItem.f114270g, z);
            String str4 = tabItem.f114273j;
            String str5 = tabItem.f114274n;
            if (Util.isNullOrNil(str5)) {
                str5 = str4;
            }
            if (z) {
                mo66342a(str5, bVar.f114313b);
                bVar.f114312a.setTextColor(b4);
                return;
            }
            mo66342a(str4, bVar.f114313b);
            bVar.f114312a.setTextColor(b3);
        }

        /* renamed from: f */
        public void mo66345f(boolean z) {
            GameTabData2 gameTabData2 = this.f114303e;
            if (gameTabData2 != null) {
                C42267b bVar = (C42267b) ((HashMap) this.f114306h).get(gameTabData2.mo66310b());
                if (bVar == null) {
                    return;
                }
                if (z) {
                    bVar.f114315d.setVisibility(4);
                    bVar.f114314c.setVisibility(0);
                    return;
                }
                bVar.f114315d.setVisibility(4);
                bVar.f114314c.setVisibility(8);
            }
        }

        /* renamed from: g */
        public void mo66346g(int i, boolean z) {
            this.f114307i = i;
            this.f114308j = z;
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                ((C119157j) C119157j.f356862d).mo183895z(new C42266a(z));
                return;
            }
            GameTabData2 gameTabData2 = this.f114303e;
            if (gameTabData2 != null) {
                C42267b bVar = (C42267b) ((HashMap) this.f114306h).get(gameTabData2.mo66310b());
                if (bVar == null) {
                    return;
                }
                if (i > 0 || z) {
                    bVar.f114315d.setVisibility(4);
                    bVar.f114314c.setVisibility(0);
                    return;
                }
                bVar.f114315d.setVisibility(4);
                bVar.f114314c.setVisibility(8);
            }
        }

        public int getCount() {
            GameTabData2 gameTabData2 = this.f114303e;
            if (gameTabData2 == null) {
                return 0;
            }
            return ((ArrayList) gameTabData2.mo66309a()).size();
        }

        public Object getItem(int i) {
            return (GameTabData2.TabItem) ((ArrayList) this.f114303e.mo66309a()).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(this.f114302d).inflate(C0966R.C0971layout.avf, viewGroup, false);
            C42267b bVar = new C42267b(this, inflate);
            if (C76577a.m92147C(GameTabWidget2.this.getContext())) {
                bVar.f114312a.setTextSize(0, ((float) C76577a.m92155f(GameTabWidget2.this.getContext(), C0966R.dimen.f3836g9)) * C76577a.m92161l(GameTabWidget2.this.getContext()));
                bVar.f114315d.setTextSize(0, ((float) C76577a.m92155f(GameTabWidget2.this.getContext(), C0966R.dimen.f3836g9)) * C76577a.m92161l(GameTabWidget2.this.getContext()));
            }
            GameTabData2.TabItem tabItem = (GameTabData2.TabItem) ((ArrayList) this.f114303e.mo66309a()).get(i);
            if (tabItem != null) {
                bVar.f114312a.setText(tabItem.f114268e);
                mo66344d(bVar, tabItem, Util.nullAsNil(this.f114304f).equalsIgnoreCase(tabItem.f114267d), this.f114305g);
                ((HashMap) this.f114306h).put(tabItem.f114267d, bVar);
            }
            inflate.setTag(tabItem);
            return inflate;
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$c */
    public static class C42268c implements C80883e<IPCString, IPCVoid> {
        private C42268c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null) {
                C42040b0 xi02 = ((C48484q) C86312j.m106911c(C48484q.class)).xi0();
                String str = iPCString.f10315d;
                xi02.getClass();
                if (!Util.isNullOrNil(str)) {
                    C42119w bD = xi02.mo66004bD(str);
                    if (bD != null) {
                        bD.field_redDotExpireTime = 0;
                        xi02.update(bD, new String[0]);
                    }
                    Log.m105925i("MicroMsg.GameMessageStorage", "removeTabRedDot gameMsgId:%s", str);
                }
            }
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$d */
    public static class C42269d implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C46577a.f125473d.mo71881a(iPCString != null ? iPCString.f10315d : "");
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$e */
    public static class C42270e implements C80883e<IPCVoid, IPCVoid> {
        private C42270e() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C46577a.f125473d.mo71882b();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = C41872f.f112815a;
        sb.append(C41872f.f112815a + "PERMANENT" + "/");
        sb.append("tabnav/");
        f114292o = sb.toString();
    }

    public GameTabWidget2(Context context) {
        super(context);
        mo66332c(context);
    }

    /* renamed from: a */
    public static void m45945a(GameTabWidget2 gameTabWidget2) {
        gameTabWidget2.removeAllViews();
        ((ArrayList) gameTabWidget2.f114300n).clear();
        int count = gameTabWidget2.f114294e.getCount();
        if (count != 0) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92145A(gameTabWidget2.f114293d) / count, -1);
            for (int i = 0; i < count; i++) {
                View view = gameTabWidget2.f114294e.getView(i, (View) null, gameTabWidget2);
                ((ArrayList) gameTabWidget2.f114300n).add(view);
                view.setOnClickListener(new C42301n(gameTabWidget2));
                view.setLayoutParams(layoutParams);
                gameTabWidget2.addView(view);
            }
            Log.m105924i("MicroMsg.GameTabWidget2", "bindLayout");
            C42265b bVar = gameTabWidget2.f114294e;
            bVar.mo66346g(bVar.f114307i, bVar.f114308j);
        }
    }

    /* renamed from: d */
    public static void m45946d(Activity activity, GameTabData2.TabItem tabItem, boolean z) {
        Intent intent;
        GameTabData2.TabItem tabItem2 = tabItem;
        if (activity != null && tabItem2 != null && (intent = activity.getIntent()) != null) {
            if (Util.nullAsNil(tabItem2.f114267d).equalsIgnoreCase(Util.nullAsNil(intent.getStringExtra("game_red_dot_tab_key")))) {
                intent.putExtra("game_red_dot_tab_key", "");
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(Util.nullAsNil(intent.getStringExtra("game_tab_red_dot_msgid"))), C42268c.class, (C1256g) null);
            }
            int intExtra = intent.getIntExtra("game_report_from_scene", 0);
            if (!z) {
                int i = tabItem2.f114277q == 1 ? 6 : 0;
                int i2 = tabItem2.f114284x;
                int i3 = tabItem2.f114285y;
                String str = tabItem2.f114267d;
                C87412m.m108594g(str, "tabKey");
                GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
                gameLifeSessionStruct.f107922d = 1;
                gameLifeSessionStruct.f107923e = 101;
                gameLifeSessionStruct.f107924f = (long) i2;
                gameLifeSessionStruct.f107925g = 2;
                gameLifeSessionStruct.f107926h = (long) intExtra;
                gameLifeSessionStruct.f107933o = (long) i3;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("red_dot", i);
                jSONObject.put("tab_key", str);
                gameLifeSessionStruct.mo62729s(URLEncoder.encode(jSONObject.toString()));
                gameLifeSessionStruct.mo86054n();
                intent = intent;
                intent.putExtra("game_from_detail_back", false);
            } else {
                intent.putExtra("disable_minimize", true);
            }
            if (tabItem2.f114277q == 3) {
                int i4 = tabItem2.f114284x;
                String str2 = tabItem2.f114267d;
                C87412m.m108594g(str2, "tabKey");
                long j = (long) i4;
                GameLifeSessionStruct gameLifeSessionStruct2 = new GameLifeSessionStruct();
                gameLifeSessionStruct2.f107922d = 1;
                gameLifeSessionStruct2.f107923e = 101;
                gameLifeSessionStruct2.f107924f = j;
                gameLifeSessionStruct2.f107925g = 71;
                gameLifeSessionStruct2.f107926h = (long) intExtra;
                gameLifeSessionStruct2.f107933o = (long) 0;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("red_dot", 0);
                jSONObject2.put("tab_key", str2);
                gameLifeSessionStruct2.mo62729s(URLEncoder.encode(jSONObject2.toString()));
                gameLifeSessionStruct2.mo86054n();
                GameTabData2.TabItemWeapp tabItemWeapp = tabItem2.f114279s;
                String str3 = tabItemWeapp.f114290d;
                String str4 = tabItemWeapp.f114291e;
                MMHandler mMHandler = C52642c.f146980a;
                C86299o oVar = new C86299o();
                oVar.f250930b = str3;
                oVar.f250934f = str4;
                oVar.f250931c = 0;
                oVar.f250939k = 1079;
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(activity, oVar);
                return;
            }
            Activity activity2 = activity;
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            String string = extras.getString("from_source_activity");
            if (!Util.isNullOrNil(string)) {
                Log.m105925i("MicroMsg.GameTabWidget2", "fromSourceActivity: %s", string);
                Intent intent2 = new Intent();
                intent2.addFlags(65536);
                intent2.addFlags(131072);
                intent2.setClassName(activity2, string);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2", "jumpToTab", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/game/ui/chat_tab/GameTabData2$TabItem;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2", "jumpToTab", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/game/ui/chat_tab/GameTabData2$TabItem;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity2.overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
            }
            Intent intent3 = new Intent();
            intent3.putExtras(extras);
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_game_tab", true);
            bundle.putString("game_tab_key", tabItem2.f114267d);
            bundle.putInt("game_tab_type", tabItem2.f114277q);
            bundle.putLong("turn_page_time", System.currentTimeMillis());
            bundle.putString("rawUrl", tabItem2.f114278r);
            bundle.putBoolean("from_find_more_friend", true);
            intent3.putExtras(bundle);
            intent3.putExtra("game_need_bottom_tab", true);
            intent3.setClassName(activity2, tabItem2.f114283w);
            intent3.addFlags(65536);
            intent3.addFlags(131072);
            try {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent3);
                C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2", "jumpToTab", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/game/ui/chat_tab/GameTabData2$TabItem;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/game/ui/chat_tab/GameTabWidget2", "jumpToTab", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/game/ui/chat_tab/GameTabData2$TabItem;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                if (z) {
                    activity2.overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
                } else {
                    activity2.overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.GameTabWidget2", e, "className:[%s]", tabItem2.f114283w);
            }
        }
    }

    private String getTopChatRoomName() {
        return Util.nullAsNil(this.f114293d.getIntent().getStringExtra("game_msg_top_chatroom_name"));
    }

    private void setAdapter(C42265b bVar) {
        this.f114294e = bVar;
        bVar.registerDataSetObserver(new C42264a());
        bVar.notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo66331b(GameTabData2 gameTabData2, String str) {
        int i;
        boolean z;
        if (gameTabData2 != null) {
            Iterator it = gameTabData2.f114262d.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                GameTabData2.TabItem tabItem = (GameTabData2.TabItem) it.next();
                if (tabItem.f114277q == 1 && tabItem.f114286z) {
                    z = true;
                    break;
                }
            }
            if (z) {
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(getTopChatRoomName()), C42269d.class, (C1256g) null);
            }
            C42265b bVar = new C42265b(getContext());
            setAdapter(bVar);
            String stringExtra = this.f114293d.getIntent().getStringExtra("game_red_dot_tab_key");
            bVar.f114303e = gameTabData2;
            bVar.f114304f = str;
            bVar.f114305g = stringExtra;
            bVar.notifyDataSetChanged();
            int w = C52642c.m59005w(gameTabData2.f114264f);
            int w2 = C52642c.m59005w(gameTabData2.f114265g);
            if (C85875k4.m106211z()) {
                if (w2 != 0) {
                    setBackgroundColor(w2);
                }
            } else if (w != 0) {
                setBackgroundColor(w);
            }
            if (this.f114293d.getIntent().getBooleanExtra("game_tab_exposure", true)) {
                this.f114293d.getIntent().putExtra("game_tab_exposure", false);
                String stringExtra2 = this.f114293d.getIntent().getStringExtra("game_tab_key");
                long intExtra = (long) this.f114293d.getIntent().getIntExtra("game_report_from_scene", 0);
                C87412m.m108594g(stringExtra2, "defaultTab");
                GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
                gameLifeSessionStruct.f107922d = 1;
                gameLifeSessionStruct.f107923e = 101;
                gameLifeSessionStruct.f107924f = 0;
                gameLifeSessionStruct.f107925g = 1;
                gameLifeSessionStruct.f107926h = intExtra;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("default_tab", stringExtra2);
                gameLifeSessionStruct.mo62729s(URLEncoder.encode(jSONObject.toString()));
                gameLifeSessionStruct.mo86054n();
                for (Map.Entry value : gameTabData2.f114262d.entrySet()) {
                    GameTabData2.TabItem tabItem2 = (GameTabData2.TabItem) value.getValue();
                    if (tabItem2 != null) {
                        i++;
                        if (tabItem2.f114267d.equals(gameTabData2.mo66310b())) {
                            this.f114298i = tabItem2;
                            this.f114299j = true;
                        } else {
                            C40306c.f108374a.mo62990h(i, 0, tabItem2.f114267d, 0, intExtra);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo66332c(Context context) {
        this.f114293d = (Activity) context;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundResource(C0966R.color.f3518w2);
        setOrientation(0);
    }

    /* renamed from: e */
    public void mo66333e(String str, String str2) {
        C42265b bVar = this.f114294e;
        if (bVar != null) {
            bVar.f114305g = str2;
            for (Map.Entry entry : ((HashMap) bVar.f114306h).entrySet()) {
                String str3 = (String) entry.getKey();
                C42265b.C42267b bVar2 = (C42265b.C42267b) entry.getValue();
                GameTabData2.TabItem tabItem = (GameTabData2.TabItem) bVar.f114303e.f114262d.get(str3);
                if (!(bVar2 == null || tabItem == null)) {
                    bVar.mo66344d(bVar2, tabItem, Util.nullAsNil(str).equalsIgnoreCase(str3), bVar.f114305g);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo66334f(int i, boolean z) {
        if (this.f114299j && this.f114298i != null) {
            this.f114299j = false;
            int intExtra = this.f114293d.getIntent().getIntExtra("game_report_from_scene", 0);
            C40306c.C40307a aVar = C40306c.f108374a;
            GameTabData2.TabItem tabItem = this.f114298i;
            aVar.mo62990h(tabItem.f114284x, i, tabItem.f114267d, 6, (long) intExtra);
        }
        C42265b bVar = this.f114294e;
        if (bVar != null) {
            bVar.mo66345f(z);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        GameTabData2.TabItem tabItem = this.f114298i;
        if (tabItem != null && tabItem.f114286z) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(getTopChatRoomName()), C42269d.class, (C1256g) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, null, C42270e.class, (C1256g) null);
    }

    public void setChatMsgUnreadRedDot(boolean z) {
        this.f114294e.mo66345f(z);
    }

    public void setPageChanging(boolean z) {
        this.f114296g = z;
    }

    public void setTabSwitchEnable(boolean z) {
        this.f114295f = z;
    }

    public GameTabWidget2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66332c(context);
    }

    public GameTabWidget2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66332c(context);
    }
}
