package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.model.C42143x;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.ChatRoomTabUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C9556a;
import sw1.C48483p;
import sw1.C48484q;
import uy1.C52642c;
import v10.C52735e;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameMessageBubbleView */
public class GameMessageBubbleView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public Context f114060d;

    /* renamed from: e */
    public View f114061e;

    /* renamed from: f */
    public TextView f114062f;

    /* renamed from: g */
    public ImageView f114063g;

    /* renamed from: h */
    public C42119w f114064h;

    /* renamed from: i */
    public boolean f114065i = false;

    /* renamed from: j */
    public long f114066j = 0;

    public GameMessageBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114060d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r0.f113494t1.containsKey(r0.f113493s1.f113526c) == false) goto L_0x005b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66241a() {
        /*
            r5 = this;
            java.lang.Class<sw1.p> r0 = sw1.C48483p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sw1.p r0 = (sw1.C48483p) r0
            com.tencent.mm.plugin.game.model.a0 r0 = r0.mo66079ar()
            com.tencent.mm.plugin.game.model.w r0 = r0.mo65978g()
            r5.f114064h = r0
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r5.f114061e
            r0.setOnClickListener(r2)
            r5.setVisibility(r1)
            goto L_0x008e
        L_0x0020:
            r0.mo66075l2()
            com.tencent.mm.plugin.game.model.w r0 = r5.f114064h
            int r3 = r0.field_msgType
            r4 = 100
            if (r3 != r4) goto L_0x006b
            com.tencent.mm.plugin.game.model.w$j r0 = r0.f113493s1
            java.lang.String r0 = r0.f113525b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x005b
            com.tencent.mm.plugin.game.model.w r0 = r5.f114064h
            com.tencent.mm.plugin.game.model.w$j r0 = r0.f113493s1
            java.lang.String r0 = r0.f113524a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x005b
            com.tencent.mm.plugin.game.model.w r0 = r5.f114064h
            com.tencent.mm.plugin.game.model.w$j r0 = r0.f113493s1
            java.lang.String r0 = r0.f113526c
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x005b
            com.tencent.mm.plugin.game.model.w r0 = r5.f114064h
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.game.model.w$l> r3 = r0.f113494t1
            com.tencent.mm.plugin.game.model.w$j r0 = r0.f113493s1
            java.lang.String r0 = r0.f113526c
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x006b
        L_0x005b:
            java.lang.String r0 = "MicroMsg.GameMessageHeaderView"
            java.lang.String r3 = "bubble is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            android.view.View r0 = r5.f114061e
            r0.setOnClickListener(r2)
            r5.setVisibility(r1)
            return
        L_0x006b:
            android.widget.TextView r0 = r5.f114062f
            com.tencent.mm.plugin.game.model.w r1 = r5.f114064h
            com.tencent.mm.plugin.game.model.w$j r1 = r1.f113493s1
            java.lang.String r1 = r1.f113525b
            r0.setText(r1)
            gc0.a r0 = gc0.C20828a.m22825b()
            com.tencent.mm.plugin.game.model.w r1 = r5.f114064h
            com.tencent.mm.plugin.game.model.w$j r1 = r1.f113493s1
            java.lang.String r1 = r1.f113524a
            android.widget.ImageView r2 = r5.f114063g
            r0.mo32518g(r1, r2)
            android.view.View r0 = r5.f114061e
            r0.setOnClickListener(r5)
            r0 = 0
            r5.setVisibility(r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameMessageBubbleView.mo66241a():void");
    }

    public void onClick(View view) {
        int i;
        int i2;
        Class cls = C48484q.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (System.currentTimeMillis() - this.f114066j <= 500) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (this.f114064h == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar().mo65974c();
            C42119w wVar = this.f114064h;
            boolean z = true;
            if (wVar.field_msgType == 100) {
                if (Util.isNullOrNil(wVar.f113493s1.f113526c)) {
                    this.f114066j = System.currentTimeMillis();
                } else {
                    C42119w wVar2 = this.f114064h;
                    C42119w.C42131l lVar = wVar2.f113494t1.get(wVar2.f113493s1.f113526c);
                    if (lVar != null) {
                        Context context = this.f114060d;
                        C42119w wVar3 = this.f114064h;
                        int a = C42143x.m45831a(context, wVar3, lVar, wVar3.field_appId, 1007);
                        if (a != 0) {
                            Context context2 = this.f114060d;
                            C42119w wVar4 = this.f114064h;
                            String str = wVar4.field_appId;
                            int i3 = wVar4.f113470e2;
                            String str2 = wVar4.field_gameMsgId;
                            C40314g.m43485d(context2, 10, 1007, 1, a, 0, str, 0, i3, str2, wVar4.f113472f2, C40314g.m43482a((String) null, (String) null, wVar4.f113474g2, (Map) null));
                        }
                        if (lVar.f113535d != 4) {
                            this.f114064h.field_isRead = true;
                            ((C48484q) C86312j.m106911c(cls)).xi0().update(this.f114064h, new String[0]);
                        }
                    }
                    this.f114066j = System.currentTimeMillis();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!(wVar == null || wVar.f113496v1 == 3)) {
                wVar.field_isRead = true;
                ((C48484q) C86312j.m106911c(cls)).xi0().update(this.f114064h, new String[0]);
            }
            C42119w wVar5 = this.f114064h;
            int i4 = wVar5.f113496v1;
            if (i4 == 1) {
                String str3 = wVar5.f113479j1;
                if (!Util.isNullOrNil(str3)) {
                    i2 = C52642c.m59002t(this.f114060d, str3, "game_center_bubble");
                }
                i = 0;
                Context context3 = this.f114060d;
                C42119w wVar6 = this.f114064h;
                String str4 = wVar6.field_appId;
                int i5 = wVar6.field_msgType;
                String str5 = wVar6.field_gameMsgId;
                C40314g.m43485d(context3, 10, 1007, 1, i, 0, str4, 0, i5, str5, wVar6.f113472f2, C40314g.m43482a((String) null, (String) null, wVar6.f113474g2, (Map) null));
                this.f114066j = System.currentTimeMillis();
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (i4 != 2) {
                if (i4 != 3) {
                    Log.m105920e("MicroMsg.GameMessageHeaderView", "unknown bubble_action = " + this.f114064h.f113496v1);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Intent intent = new Intent();
                if (((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_open_message_center_v2, 1) != 1) {
                    z = false;
                }
                if (z) {
                    intent.setClass(this.f114060d, ChatRoomTabUI.class);
                } else {
                    intent.setClass(this.f114060d, GameMessageUI.class);
                }
                intent.putExtra("game_report_from_scene", 1007);
                Context context4 = this.f114060d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context5 = context4;
                C117292a.m165358d(context5, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context4.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context5, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                i = 6;
                Context context32 = this.f114060d;
                C42119w wVar62 = this.f114064h;
                String str42 = wVar62.field_appId;
                int i54 = wVar62.field_msgType;
                String str52 = wVar62.field_gameMsgId;
                C40314g.m43485d(context32, 10, 1007, 1, i, 0, str42, 0, i54, str52, wVar62.f113472f2, C40314g.m43482a((String) null, (String) null, wVar62.f113474g2, (Map) null));
                this.f114066j = System.currentTimeMillis();
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!Util.isNullOrNil(wVar5.field_appId)) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("game_app_id", this.f114064h.field_appId);
                bundle.putInt("game_report_from_scene", 1007);
                i2 = C52642c.m58996n(this.f114060d, this.f114064h.field_appId, (String) null, bundle, 0);
            } else {
                Log.m105920e("MicroMsg.GameMessageHeaderView", "message type : " + this.f114064h.field_msgType + " ,message.field_appId is null.");
                i = 0;
                Context context322 = this.f114060d;
                C42119w wVar622 = this.f114064h;
                String str422 = wVar622.field_appId;
                int i542 = wVar622.field_msgType;
                String str522 = wVar622.field_gameMsgId;
                C40314g.m43485d(context322, 10, 1007, 1, i, 0, str422, 0, i542, str522, wVar622.f113472f2, C40314g.m43482a((String) null, (String) null, wVar622.f113474g2, (Map) null));
                this.f114066j = System.currentTimeMillis();
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
            i = i2;
            Context context3222 = this.f114060d;
            C42119w wVar6222 = this.f114064h;
            String str4222 = wVar6222.field_appId;
            int i5422 = wVar6222.field_msgType;
            String str5222 = wVar6222.field_gameMsgId;
            C40314g.m43485d(context3222, 10, 1007, 1, i, 0, str4222, 0, i5422, str5222, wVar6222.f113472f2, C40314g.m43482a((String) null, (String) null, wVar6222.f113474g2, (Map) null));
            this.f114066j = System.currentTimeMillis();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageBubbleView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (!this.f114065i) {
            this.f114063g = (ImageView) findViewById(C0966R.C0970id.emj);
            this.f114062f = (TextView) findViewById(C0966R.C0970id.emi);
            this.f114061e = findViewById(C0966R.C0970id.emk);
            setVisibility(8);
            this.f114065i = true;
        }
    }
}
