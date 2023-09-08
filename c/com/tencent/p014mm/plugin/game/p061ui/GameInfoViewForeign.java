package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.ChatRoomTabUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import sw1.C48484q;
import uy1.C52642c;
import v10.C52735e;
import wq3.C111847h;
import y10.C15928a;

/* renamed from: com.tencent.mm.plugin.game.ui.GameInfoViewForeign */
public class GameInfoViewForeign extends RelativeLayout implements C111847h {

    /* renamed from: d */
    public Context f113970d;

    /* renamed from: e */
    public TextView f113971e;

    /* renamed from: f */
    public int f113972f = 0;

    /* renamed from: g */
    public int f113973g = 0;

    /* renamed from: h */
    public int f113974h = 2;

    /* renamed from: i */
    public View.OnClickListener f113975i = new C42202a();

    /* renamed from: com.tencent.mm.plugin.game.ui.GameInfoViewForeign$a */
    public class C42202a implements View.OnClickListener {
        public C42202a() {
        }

        public void onClick(View view) {
            int i;
            String d;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() == null || !(view.getTag() instanceof String)) {
                Intent intent = new Intent();
                boolean z = true;
                if (((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_open_message_center_v2, 1) != 1) {
                    z = false;
                }
                if (z) {
                    intent.setClass(GameInfoViewForeign.this.f113970d, ChatRoomTabUI.class);
                } else {
                    intent.setClass(GameInfoViewForeign.this.f113970d, GameMessageUI.class);
                }
                intent.putExtra("game_report_from_scene", 1001);
                Context context = GameInfoViewForeign.this.f113970d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                i = 6;
            } else {
                i = C52642c.m59002t(GameInfoViewForeign.this.f113970d, (String) view.getTag(), "game_center_msgcenter");
            }
            String valueOf = String.valueOf(5);
            if (valueOf == null) {
                d = null;
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("function_type", "resource");
                    jSONObject.put("function_value", valueOf);
                } catch (JSONException unused) {
                }
                d = C15928a.m14857d(jSONObject.toString());
            }
            String str = d;
            GameInfoViewForeign gameInfoViewForeign = GameInfoViewForeign.this;
            C40314g.m43485d(gameInfoViewForeign.f113970d, 10, 1001, gameInfoViewForeign.f113974h, i, 0, (String) null, gameInfoViewForeign.f113972f, 0, (String) null, (String) null, str);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameInfoViewForeign$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public GameInfoViewForeign(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113970d = context;
    }

    /* renamed from: a */
    public void mo66215a() {
        int kD = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66008kD();
        this.f113973g = kD;
        if (kD > 0 && kD <= 99) {
            this.f113971e.setVisibility(0);
            TextView textView = this.f113971e;
            textView.setText("" + this.f113973g);
        } else if (kD > 99) {
            this.f113971e.setVisibility(0);
            this.f113971e.setText("99+");
            this.f113971e.setTextSize(1, 9.0f);
        } else {
            this.f113971e.setVisibility(4);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this.f113975i);
        this.f113971e = (TextView) findViewById(C0966R.C0970id.emp);
        mo66215a();
        Log.m105924i("MicroMsg.GameInfoViewForeign", "initView finished");
    }

    public void setSourceScene(int i) {
        this.f113972f = i;
    }
}
