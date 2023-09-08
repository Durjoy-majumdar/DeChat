package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a11.C39479c;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74572v;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.remittance.model.C42841g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75199e0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cr3.C75281f;
import cr3.C75296i;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gy3.C87412m;
import h81.C32735h;
import he0.C76158j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nj3.C76879j;
import ob0.C117747y;
import p240sx.C77810t;
import te3.C49885ir;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI */
public class LuckyMoneyExclusiveSelectContactUI extends MMBaseSelectContactUI implements C75281f {

    /* renamed from: J */
    public static final /* synthetic */ int f199955J = 0;

    /* renamed from: C */
    public String f199956C;

    /* renamed from: D */
    public String f199957D;

    /* renamed from: E */
    public List<String> f199958E = new ArrayList();

    /* renamed from: F */
    public List<String> f199959F = new ArrayList();

    /* renamed from: G */
    public int f199960G;

    /* renamed from: H */
    public C75296i f199961H = null;

    /* renamed from: I */
    public String[] f199962I = null;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI$a */
    public class C69395a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C75922b f199963d;

        public C69395a(C75922b bVar) {
            this.f199963d = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LuckyMoneyExclusiveSelectContactUI luckyMoneyExclusiveSelectContactUI = LuckyMoneyExclusiveSelectContactUI.this;
            String str = this.f199963d.f222621r;
            int i2 = LuckyMoneyExclusiveSelectContactUI.f199955J;
            luckyMoneyExclusiveSelectContactUI.mo95575g8(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI$b */
    public class C69396b implements DialogInterface.OnClickListener {
        public C69396b(LuckyMoneyExclusiveSelectContactUI luckyMoneyExclusiveSelectContactUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_wcpay_select_optime, 0) == 1;
        Log.m105925i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "user WalletSelectContactAdapter:%s", Boolean.valueOf(z));
        if (z) {
            C75199e0.C75200a aVar = new C75199e0.C75200a();
            String listToString = Util.listToString(this.f199959F, ",");
            C87412m.m108594g(listToString, "<set-?>");
            aVar.f221242b = listToString;
            String str = this.f199956C;
            C87412m.m108594g(str, "<set-?>");
            aVar.f221243c = str;
            aVar.f221241a = true;
            return new C75199e0(this, this.f199958E, true, false, aVar);
        }
        C74572v vVar = new C74572v();
        vVar.f219218o = Util.listToString(this.f199959F, ",");
        vVar.f219219p = this.f199956C;
        vVar.f219211h = true;
        return ((C77810t) C86312j.m106911c(C77810t.class)).Nv0(this, this.f199958E, true, false, vVar);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return ((C77810t) C86312j.m106911c(C77810t.class)).Jr0(this, this.f199956C, 11, false, new HashSet(this.f199958E));
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        String stringExtra = getIntent().getStringExtra("key_title");
        return !Util.isNullOrNil(stringExtra) ? stringExtra : getString(C0966R.string.ghb);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        Class cls = C76158j.class;
        boolean z = true;
        Log.m105925i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "handleItemClick: %s", Integer.valueOf(i));
        C75922b j2 = mo103379N7().getItem(i - this.f218605d.getHeaderViewsCount());
        if (j2 != null && (str = j2.f222621r) != null) {
            Log.m105925i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "ClickUser=%s", str);
            String str2 = j2.f222621r;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
            if (C72996z1.m85843n5(str2) && Util.isNullOrNil(((C76158j) C86312j.m106911c(cls)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2()))) {
                ((C76158j) C86312j.m106911c(cls)).mo106372vO(str2, this.f199956C, "");
            }
            String str3 = j2.f222621r;
            Class cls2 = C75339i.class;
            String pb = ((C75339i) C86312j.m106911c(cls2)).mo62519pb(str3, this.f199956C);
            Iterator<String> it = this.f199959F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (!next.equals(str3) && pb.equals(((C75339i) C86312j.m106911c(cls2)).mo62519pb(next, this.f199956C))) {
                    Log.m105925i("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "find same display name: %s", pb);
                    break;
                }
            }
            if (z) {
                String stringExtra = getIntent().getStringExtra("key_same_name_tips");
                if (Util.isNullOrNil(stringExtra)) {
                    stringExtra = getString(C0966R.string.gg6);
                }
                C76879j.m92714H(getContext(), stringExtra, "", false, new C69395a(j2), new C69396b(this));
                return;
            }
            mo95575g8(j2.f222621r);
        }
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return true;
    }

    /* renamed from: g8 */
    public final void mo95575g8(String str) {
        Log.m105919d("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "do union before union transfer:%s", str);
        this.f199957D = str;
        if (!C72996z1.m85843n5(str) || this.f199960G != 31) {
            mo95576i8();
            return;
        }
        this.f199961H.mo105625d(new C42841g(str, this.f199956C), true);
    }

    /* renamed from: i8 */
    public final void mo95576i8() {
        if (Util.isNullOrNil(this.f199957D)) {
            Log.m105920e("MicroMsg.LuckyMoneyExclusiveSelectContactUI", "selectedUsername is null");
        }
        Intent intent = new Intent();
        intent.putExtra("Select_Contact", this.f199957D);
        setResult(-1, intent);
        finish();
    }

    public void initView() {
        super.initView();
        String[] strArr = this.f199962I;
        if (strArr != null && strArr.length > 0) {
            this.f218606e.setAlphabet(strArr);
        }
    }

    public void onCreate(Bundle bundle) {
        C75296i iVar = new C75296i(this, this);
        this.f199961H = iVar;
        iVar.mo105624c(4465);
        this.f199956C = getIntent().getStringExtra("chatroomName");
        this.f199960G = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        ((ArrayList) this.f199958E).add(C75592q0.m90789s());
        List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(this.f199956C);
        this.f199959F = bD;
        if (bD != null) {
            bD.remove(C75592q0.m90789s());
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f199961H.mo105630i(4465);
    }

    public void onResume() {
        super.onResume();
        UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f9570d.f9571a = 0;
        updateSearchIndexAtOnceEvent.publish();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar, boolean z) {
        if ((yVar instanceof C42841g) && i == 0 && i2 == 0) {
            C49885ir irVar = ((C42841g) yVar).f116019r;
            if (irVar.f135596d == 268492929) {
                String str2 = irVar.f135597e;
                if (TextUtils.isEmpty(str2)) {
                    str2 = getString(C0966R.string.l_3);
                }
                C76879j.m92713G(this, str2, (String) null, false, new C69687t0(this));
                return;
            }
        }
        mo95576i8();
    }
}
