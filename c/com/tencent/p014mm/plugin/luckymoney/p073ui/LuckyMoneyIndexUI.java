package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b73.C28273c;
import b73.C67213b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69271w1;
import com.tencent.p014mm.plugin.luckymoney.model.C69272x1;
import com.tencent.p014mm.plugin.luckymoney.model.C69273y;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import f40.C86709a0;
import g32.C75846b;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI */
public class LuckyMoneyIndexUI extends LuckyMoneyBaseUI {

    /* renamed from: g */
    public LinearLayout f200007g;

    /* renamed from: h */
    public LinearLayout f200008h;

    /* renamed from: i */
    public LinearLayout f200009i;

    /* renamed from: j */
    public int f200010j;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI$a */
    public class C4843a implements MenuItem.OnMenuItemClickListener {
        public C4843a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LuckyMoneyIndexUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI$b */
    public class C4844b extends C7089c0 {
        public C4844b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C115669n.INSTANCE.mo160131h(11701, 3, 0, 0, 0, 3);
            LuckyMoneyIndexUI.m81794J7(LuckyMoneyIndexUI.this, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI$c */
    public class C4845c extends C7089c0 {
        public C4845c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C115669n.INSTANCE.mo160131h(11701, 3, 0, 0, 0, 2);
            LuckyMoneyIndexUI.m81794J7(LuckyMoneyIndexUI.this, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI$d */
    public class C4846d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI$d$a */
        public class C4847a implements C76879j.C76888o {
            public C4847a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                int i3 = 2;
                if (i2 != 1) {
                    C115669n.INSTANCE.mo160131h(11701, 3, 0, 0, 0, 5);
                } else {
                    C115669n.INSTANCE.mo160131h(11701, 3, 0, 0, 0, 6);
                    i3 = 1;
                }
                Intent intent = new Intent();
                intent.setClass(LuckyMoneyIndexUI.this.getContext(), LuckyMoneyMyRecordUI.class);
                intent.putExtra("key_username", LuckyMoneyIndexUI.this.getIntent().getStringExtra("key_username"));
                intent.putExtra("key_type", i3);
                LuckyMoneyIndexUI luckyMoneyIndexUI = LuckyMoneyIndexUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                LuckyMoneyIndexUI luckyMoneyIndexUI2 = luckyMoneyIndexUI;
                C117292a.m165358d(luckyMoneyIndexUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI$4$1", "onClick", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                luckyMoneyIndexUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(luckyMoneyIndexUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI$4$1", "onClick", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public C4846d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C115669n.INSTANCE.mo160131h(11701, 3, 0, 0, 0, 4);
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.add(LuckyMoneyIndexUI.this.getString(C0966R.string.ghd));
            linkedList2.add(0);
            linkedList.add(LuckyMoneyIndexUI.this.getString(C0966R.string.ghf));
            linkedList2.add(1);
            C76879j.m92733d(LuckyMoneyIndexUI.this.getContext(), "", linkedList, linkedList2, "", false, new C4847a());
            return true;
        }
    }

    /* renamed from: J7 */
    public static void m81794J7(LuckyMoneyIndexUI luckyMoneyIndexUI, int i) {
        luckyMoneyIndexUI.getClass();
        Intent intent = new Intent();
        intent.setClass(luckyMoneyIndexUI.getContext(), LuckyMoneyPrepareUI.class);
        intent.putExtra("key_way", 3);
        intent.putExtra("key_type", i);
        intent.putExtra("pay_channel", luckyMoneyIndexUI.f200010j);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(luckyMoneyIndexUI, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI", "goPrepareLuckmoney", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyIndexUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(luckyMoneyIndexUI, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI", "goPrepareLuckmoney", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: K7 */
    public final void mo95585K7() {
        C69273y a = C69242l1.m81609o(getIntent().getStringExtra("key_username")) ? C75846b.zx0().yx0().mo95393a() : C75846b.zx0().vx0().mo95413a();
        if (a != null) {
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.gfq);
            if ((a.f199378n & 1) == 1) {
                Log.m105924i("MicroMsg.LuckyMoneyIndexUI", "initView: topBg use money bg");
                imageView.setImageResource(C0966R.C0969drawable.c7_);
                return;
            }
            imageView.setImageResource(C0966R.C0969drawable.c7a);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9x;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.gjj);
        setBackBtn(new C4843a());
        this.f200007g = (LinearLayout) findViewById(C0966R.C0970id.gfp);
        this.f200008h = (LinearLayout) findViewById(C0966R.C0970id.gfn);
        this.f200009i = (LinearLayout) findViewById(C0966R.C0970id.gfk);
        ((Button) findViewById(C0966R.C0970id.gfo)).setOnClickListener(new C4844b());
        ((Button) findViewById(C0966R.C0970id.gfm)).setOnClickListener(new C4845c());
        addTextOptionMenu(0, getString(C0966R.string.gh5), new C4846d(), (View.OnLongClickListener) null, MMActivityController.C73075r.TRANSPARENT_GOLD_TEXT);
        mo95585K7();
    }

    public void onCreate(Bundle bundle) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC;
        super.onCreate(bundle);
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91354h(this, (C67213b.C67214b) null);
        initView();
        String stringExtra = getIntent().getStringExtra("key_username");
        if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
            doSceneProgress(new C69272x1("v1.0", ((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0)).intValue(), stringExtra), false);
        } else {
            doSceneProgress(new C69271w1(C72996z1.m85820U5(stringExtra) ? 0 : 25, "v1.0", ((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0)).intValue(), stringExtra), false);
        }
        this.f200010j = getIntent().getIntExtra("pay_channel", -1);
        C115669n.INSTANCE.mo160131h(11701, 3, 0, 0, 0, 1);
    }

    public void onResume() {
        super.onResume();
        C67213b Jf = ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf();
        Jf.mo91357j(this, Jf.mo91358k(), (C67213b.C67215a) null);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C69271w1)) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            return true;
        }
        C69271w1 w1Var = (C69271w1) yVar;
        C69558a3.C69561c cVar = new C69558a3.C69561c();
        cVar.f200852a = getResources().getColor(C0966R.color.a39);
        cVar.f200855d = 101;
        C69558a3.m81996b(this, this.f200007g, w1Var.f199364u, cVar, "Text");
        C69558a3.C69561c cVar2 = new C69558a3.C69561c();
        cVar2.f200852a = getResources().getColor(C0966R.color.a39);
        cVar2.f200855d = 100;
        C69558a3.m81996b(this, this.f200008h, w1Var.f199366w, cVar2, "Text");
        C69558a3.C69561c cVar3 = new C69558a3.C69561c();
        cVar3.f200855d = 102;
        C69558a3.m81996b(this, this.f200009i, w1Var.f199363t, cVar3, "Pic");
        mo95585K7();
        return true;
    }
}
