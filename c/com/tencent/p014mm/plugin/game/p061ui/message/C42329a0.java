package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.model.C42143x;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.aff.ting.TingClientProto;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C11184p0;
import nj3.C76912y0;
import qo3.C47883u;
import qo3.C77426q;
import sw1.C48484q;
import uo3.C78253a;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.message.a0 */
public class C42329a0 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: d */
    public int f114532d;

    /* renamed from: e */
    public C42335d f114533e;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.a0$a */
    public class C42330a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C42334c f114534d;

        public C42330a(C42329a0 a0Var, C42334c cVar) {
            this.f114534d = cVar;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            if (!Util.isNullOrNil(this.f114534d.f114539a.f113463X1.f113573q)) {
                if (C52642c.m58995m(this.f114534d.f114539a.f113463X1.f113573q)) {
                    contextMenu.add(0, 13, 0, C0966R.string.f360847fb2);
                } else {
                    contextMenu.add(0, 12, 0, C0966R.string.fb4);
                }
            }
            contextMenu.add(0, 11, 0, C0966R.string.f89);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.a0$b */
    public class C42331b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C42334c f114535d;

        /* renamed from: e */
        public final /* synthetic */ View f114536e;

        /* renamed from: com.tencent.mm.plugin.game.ui.message.a0$b$a */
        public class C42332a implements DialogInterface.OnDismissListener {
            public C42332a(C42331b bVar) {
            }

            public void onDismiss(DialogInterface dialogInterface) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.message.a0$b$b */
        public class C42333b implements C47883u {
            public C42333b() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                if (z) {
                    C52642c.m59007y(C42331b.this.f114535d.f114539a.f113463X1.f113573q, true);
                }
            }
        }

        public C42331b(C42334c cVar, View view) {
            this.f114535d = cVar;
            this.f114536e = view;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 11) {
                ((C48484q) C86312j.m106911c(C48484q.class)).xi0().delete(this.f114535d.f114539a, new String[0]);
                C42335d dVar = C42329a0.this.f114533e;
                if (dVar != null) {
                    dVar.mo66403a();
                }
            } else if (menuItem.getItemId() == 12) {
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(MMApplicationContext.getResources().getString(C0966R.string.f360848fb3));
                qVar.mo107601m(C0966R.string.fb4);
                qVar.mo107589a(true);
                qVar.mo107590b(new C42333b());
                qVar.mo107593e(new C42332a(this));
                qVar.mo107603o();
            } else if (menuItem.getItemId() == 13) {
                C52642c.m59007y(this.f114535d.f114539a.f113463X1.f113573q, false);
                C76912y0.m92768g(this.f114536e.getContext(), MMApplicationContext.getResources().getString(C0966R.string.fbt));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.a0$c */
    public static class C42334c {

        /* renamed from: a */
        public C42119w f114539a;

        /* renamed from: b */
        public C42119w.C42131l f114540b;

        /* renamed from: c */
        public int f114541c;

        /* renamed from: d */
        public boolean f114542d;

        public C42334c(C42119w wVar, C42119w.C42131l lVar, int i) {
            this.f114539a = wVar;
            this.f114540b = lVar;
            this.f114541c = i;
            this.f114542d = !wVar.field_isRead;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.a0$d */
    public interface C42335d {
        /* renamed from: a */
        void mo66403a();
    }

    public C42329a0(int i, C42335d dVar) {
        this.f114532d = i;
        this.f114533e = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof C42334c)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42334c cVar = (C42334c) view.getTag();
        if (cVar.f114539a == null || cVar.f114540b == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Context context = view.getContext();
        C42119w wVar = cVar.f114539a;
        int a = C42143x.m45831a(context, wVar, cVar.f114540b, wVar.field_appId, this.f114532d);
        HashMap hashMap = new HashMap();
        String str = "2";
        hashMap.put("tab", str);
        if (cVar.f114542d) {
            str = "1";
        }
        hashMap.put("isnew", str);
        hashMap.put("fold", String.valueOf(cVar.f114539a.field_hasMergedCount));
        hashMap.put("ext_data", cVar.f114539a.f113474g2);
        Context context2 = MMApplicationContext.getContext();
        int i = cVar.f114541c;
        C42119w wVar2 = cVar.f114539a;
        String str2 = wVar2.field_appId;
        int i2 = this.f114532d;
        int i3 = wVar2.f113470e2;
        String str3 = wVar2.field_gameMsgId;
        C40314g.m43485d(context2, 13, TingClientProto.TingScene.TingScene_ChatHistory_VALUE, i, a, 0, str2, i2, i3, str3, wVar2.f113472f2, C40314g.m43483b(hashMap));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (!(view.getTag() instanceof C42334c)) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        C42334c cVar = (C42334c) view.getTag();
        if (cVar.f114539a == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        C78253a aVar = new C78253a(view.getContext(), view);
        aVar.f229249r = new C42330a(this, cVar);
        aVar.f229251t = new C42331b(cVar, view);
        aVar.mo70679m();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/game/ui/message/OnMsgClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
