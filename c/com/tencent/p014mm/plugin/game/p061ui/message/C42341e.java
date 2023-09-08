package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import py1.C47614k3;
import py1.C47668s1;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;
import sw1.C48484q;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.message.e */
public class C42341e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameMsgCenterUI f114554d;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.e$a */
    public class C42342a implements C11182m0 {
        public C42342a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (C42341e.this.f114554d.f114486q == 0) {
                e0Var.mo107125a(0, C0966R.string.f360839f80);
                return;
            }
            e0Var.mo107125a(1, C0966R.string.fb5);
            e0Var.mo107125a(2, C0966R.string.f360841f82);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.e$b */
    public class C42343b implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.game.ui.message.e$b$a */
        public class C42344a implements DialogInterface.OnClickListener {
            public C42344a(C42343b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.message.e$b$b */
        public class C42345b implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ HashMap f114557d;

            public C42345b(HashMap hashMap) {
                this.f114557d = hashMap;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f114557d.put("tab", "1");
                this.f114557d.put("actionstatus", "1");
                C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 2, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(this.f114557d));
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.message.e$b$c */
        public class C42346c implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ HashMap f114559d;

            public C42346c(HashMap hashMap) {
                this.f114559d = hashMap;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66011qq(1);
                C42340c cVar = C42341e.this.f114554d.f114482j;
                if (cVar != null) {
                    cVar.mo66417a();
                }
                this.f114559d.put("tab", "1");
                this.f114559d.put("actionstatus", "2");
                C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 2, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(this.f114559d));
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.message.e$b$d */
        public class C42347d implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ HashMap f114561d;

            public C42347d(HashMap hashMap) {
                this.f114561d = hashMap;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f114561d.put("tab", "2");
                this.f114561d.put("actionstatus", "1");
                C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 2, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(this.f114561d));
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.message.e$b$e */
        public class C42348e implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ HashMap f114563d;

            public C42348e(HashMap hashMap) {
                this.f114563d = hashMap;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66011qq(2);
                C42353j jVar = C42341e.this.f114554d.f114483n;
                if (jVar != null) {
                    jVar.mo66427a();
                }
                this.f114563d.put("tab", "2");
                this.f114563d.put("actionstatus", "2");
                C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 2, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(this.f114563d));
            }
        }

        public C42343b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C47668s1 s1Var;
            String str;
            Log.m105925i("MicroMsg.GameMsgCenterUI", "bottomSheet itemId:%d", Integer.valueOf(menuItem.getItemId()));
            C77398g.C77402i iVar = new C77398g.C77402i(C42341e.this.f114554d.getContext());
            iVar.f225714b.f225668y = false;
            iVar.mo107551d(C0966R.string.f7926wf);
            iVar.f225714b.f225621D = new C42344a(this);
            HashMap hashMap = new HashMap();
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                iVar.mo107550c(C0966R.string.f360840f81);
                iVar.mo107552e(C0966R.string.f7930wk);
                C42346c cVar = new C42346c(hashMap);
                C77389a aVar = iVar.f225714b;
                aVar.f225620C = cVar;
                aVar.f225622E = new C42345b(hashMap);
                iVar.mo107548a().show();
                hashMap.put("tab", "1");
                hashMap.put("actionstatus", "2");
                C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 1, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(hashMap));
            } else if (itemId == 1) {
                if (C41853c.m45371e() != null) {
                    s1Var = C41853c.f112797a.GeneralJumpInfo;
                } else {
                    C41853c.m45381o();
                    s1Var = null;
                }
                if (s1Var != null && !Util.isNullOrNil((List) s1Var.f127993d)) {
                    Iterator<C47614k3> it = s1Var.f127993d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C47614k3 next = it.next();
                        if (next.f127835d == 1 && !Util.isNullOrNil(next.f127837f)) {
                            str = next.f127837f;
                            break;
                        }
                    }
                    C52642c.m59001s(C42341e.this.f114554d.getContext(), str);
                    hashMap.put("tab", "2");
                    hashMap.put("actionstatus", "1");
                    C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 1, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(hashMap));
                }
                str = "https://game.weixin.qq.com/cgi-bin/h5/static/gamecenter/subscription_list.html?wechat_pkgid=gamecenter_subscription_list&ssid=5";
                C52642c.m59001s(C42341e.this.f114554d.getContext(), str);
                hashMap.put("tab", "2");
                hashMap.put("actionstatus", "1");
                C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 1, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(hashMap));
            } else if (itemId == 2) {
                iVar.mo107550c(C0966R.string.f360842f83);
                iVar.mo107552e(C0966R.string.f7930wk);
                C42348e eVar = new C42348e(hashMap);
                C77389a aVar2 = iVar.f225714b;
                aVar2.f225620C = eVar;
                aVar2.f225622E = new C42347d(hashMap);
                iVar.mo107548a().show();
                hashMap.put("tab", "2");
                hashMap.put("actionstatus", "2");
                C40314g.m43484c(C42341e.this.f114554d.getContext(), 13, 1306, 1, 2, C42341e.this.f114554d.f114476d, C40314g.m43483b(hashMap));
            }
        }
    }

    public C42341e(GameMsgCenterUI gameMsgCenterUI) {
        this.f114554d = gameMsgCenterUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = new C77407n((Context) this.f114554d.getContext(), 1, false);
        nVar.f225771i = new C42342a();
        nVar.f225782p = new C42343b();
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
