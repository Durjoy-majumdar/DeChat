package com.tencent.p014mm.plugin.emoji.p040ui;

import a61.C39496m;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.emoji.model.C93115l;
import com.tencent.p014mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.p014mm.plugin.emoji.sync.C41060a;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C93123b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Vector;
import k20.C60958c;
import k20.C9556a;
import p441aq.C92054g;
import p490dl.C97491p;
import p595ll.C46875a;
import p595ll.C46878j;
import p629ny.C76979h;
import qo3.C101218e0;
import sx3.C64197v;
import t61.C101729e;
import t61.C101736j;
import t61.C13832c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineUI */
public class EmojiMineUI extends MMActivity implements View.OnClickListener, MStorage.IOnStorageChange {

    /* renamed from: u */
    public static final /* synthetic */ int f268499u = 0;

    /* renamed from: d */
    public RecyclerView f268500d;

    /* renamed from: e */
    public C101736j f268501e;

    /* renamed from: f */
    public C93115l f268502f;

    /* renamed from: g */
    public View f268503g;

    /* renamed from: h */
    public TextView f268504h;

    /* renamed from: i */
    public View f268505i;

    /* renamed from: j */
    public View f268506j;

    /* renamed from: n */
    public ViewGroup f268507n;

    /* renamed from: o */
    public ViewGroup f268508o;

    /* renamed from: p */
    public ViewGroup f268509p;

    /* renamed from: q */
    public ViewGroup f268510q;

    /* renamed from: r */
    public ViewGroup f268511r;

    /* renamed from: s */
    public TextView f268512s;

    /* renamed from: t */
    public C46875a f268513t = new EmojiMineUI$$e(this);

    /* renamed from: H7 */
    public void mo127723H7() {
        if (this.f268511r == null) {
            return;
        }
        if (!this.f268502f.f268256b.isEmpty()) {
            this.f268512s.setVisibility(0);
        } else {
            this.f268512s.setVisibility(8);
        }
    }

    /* renamed from: I7 */
    public final boolean mo127724I7(int i) {
        Intent intent = new Intent();
        intent.setClass(this, EmojiCustomUI.class);
        intent.putExtra("key_emoji_panel_type", i);
        intent.putExtra("key_from_settings_mine", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiCustom", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiCustom", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    /* renamed from: J7 */
    public final void mo127725J7() {
        Class cls = C92054g.class;
        if (!((C92054g) C86312j.m106911c(cls)).wx0().f268269a.f110547c) {
            Vector<C41062e<?>> vector = ((C92054g) C86312j.m106911c(cls)).wx0().f268269a.f110552h;
            if ((vector != null ? vector.size() : 0) <= 0) {
                View view = this.f268503g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        View view3 = this.f268503g;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((C92054g) C86312j.m106911c(cls)).wx0().f268269a.getClass();
        if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            this.f268504h.setText(C0966R.string.c_o);
            View view5 = this.f268505i;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f268506j;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (((C92054g) C86312j.m106911c(cls)).wx0().f268269a.f110545a) {
            View view9 = this.f268505i;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = this.f268506j;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268504h.setText(C0966R.string.c6d);
        } else {
            View view13 = this.f268505i;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view15 = this.f268506j;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view16 = view15;
            C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268504h.setText(C0966R.string.f360369c70);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a2k;
    }

    public void initView() {
        Class cls = C92054g.class;
        setMMTitle((int) C0966R.string.irn);
        super.initView();
        this.f268500d = (RecyclerView) findViewById(C0966R.C0970id.o6b);
        this.f268501e = new C101736j(new C101729e(this, 24, 7));
        this.f268500d.setLayoutManager(new LinearLayoutManager(this));
        this.f268500d.setAdapter(this.f268501e);
        this.f268500d.mo17085h0(new C13832c(this, 1));
        C93115l lVar = new C93115l(C97491p.f286143a.mo136775d());
        this.f268502f = lVar;
        this.f268501e.f297815t.addAll(lVar.f268256b);
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.a1q, (ViewGroup) null);
        this.f268511r = viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.f359392ko3);
        this.f268512s = textView;
        textView.setText(C0966R.string.irp);
        this.f268512s.setVisibility(8);
        this.f268501e.mo85794V5(this.f268511r, -1, true);
        this.f268507n = (ViewGroup) from.inflate(C0966R.C0971layout.a1n, this.f268500d, false);
        this.f268508o = (ViewGroup) this.f268511r.findViewById(C0966R.C0970id.gtr);
        this.f268509p = (ViewGroup) this.f268511r.findViewById(C0966R.C0970id.cg5);
        this.f268510q = (ViewGroup) this.f268507n.findViewById(C0966R.C0970id.gts);
        ((TextView) this.f268508o.findViewById(16908310)).setText(C0966R.string.c5k);
        ((TextView) this.f268510q.findViewById(16908310)).setText(C0966R.string.c6r);
        ((TextView) this.f268509p.findViewById(C0966R.C0970id.cg7)).setText(C0966R.string.c5_);
        this.f268510q.findViewById(C0966R.C0970id.br8).setBackgroundResource(0);
        this.f268508o.setOnClickListener(this);
        this.f268510q.setOnClickListener(this);
        this.f268509p.setOnClickListener(this);
        this.f268501e.mo85792R5(this.f268507n, -2, true);
        boolean booleanExtra = getIntent().getBooleanExtra("from_store", false);
        C30777t2 t2Var = C30777t2.f82756d;
        if (t2Var.vx0() && (booleanExtra || !t2Var.Cx0())) {
            View findViewById = this.f268511r.findViewById(C0966R.C0970id.o5x);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = this.f268511r.findViewById(C0966R.C0970id.o5w);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "preSetAdapter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268511r.findViewById(C0966R.C0970id.f357818o60).setOnClickListener(new EmojiMineUI$$a());
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) this.f268511r.findViewById(C0966R.C0970id.o5y);
            mMSwitchBtn.setCheck(t2Var.xx0());
            mMSwitchBtn.setSwitchListener(new EmojiMineUI$$b(t2Var));
            if (t2Var.Cx0()) {
                mMSwitchBtn.setCheck(false);
                EmojiMineUI$$c emojiMineUI$$c = new EmojiMineUI$$c(mMSwitchBtn);
                EmojiMineUI$$d emojiMineUI$$d = new EmojiMineUI$$d(mMSwitchBtn);
                C101218e0 e0Var = new C101218e0(this, 0, 0, false);
                e0Var.mo140664k(LayoutInflater.from(this).inflate(C0966R.C0971layout.d7k, (ViewGroup) null, false), 0, 0);
                e0Var.f296384g.findViewById(C0966R.C0970id.mgu).setOnClickListener(new C2213d1(e0Var, emojiMineUI$$d));
                e0Var.f296384g.findViewById(C0966R.C0970id.f357444hl3).setOnClickListener(new C2214e1(e0Var, emojiMineUI$$c));
                try {
                    ViewParent parent = e0Var.f296384g.getParent().getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).findViewById(C0966R.C0970id.f359415kt1).setOnClickListener(C2215f1.f12252d);
                } catch (Throwable unused) {
                    Log.m105924i("MicroMsg.EmotionRecommendPrivacy", "Unable to disable windowCloseOnTouchOutside");
                }
                TextView textView2 = (TextView) e0Var.f296384g.findViewById(C0966R.C0970id.mgr);
                ArrayList arrayList = new ArrayList();
                if (C87412m.m108589b("zh_CN", LocaleUtil.getCurrentLanguage(this))) {
                    String string = getResources().getString(C0966R.string.ip4);
                    C87412m.m108593f(string, "context.resources.getStr…at_privary_guide_link_zh)");
                    arrayList.add(string);
                } else {
                    String string2 = getResources().getString(C0966R.string.f361288ip3);
                    C87412m.m108593f(string2, "context.resources.getStr…echat_privary_guide_link)");
                    arrayList.add(string2);
                }
                ((C76979h) C86312j.m106911c(C76979h.class)).mo107047GG(this, arrayList, textView2.getText().toString(), C64197v.m75539h(textView2.getText().toString()), textView2);
                e0Var.mo140655A();
            }
        }
        View findViewById3 = findViewById(C0966R.C0970id.kbh);
        this.f268503g = findViewById3;
        TextView textView3 = (TextView) findViewById3.findViewById(C0966R.C0970id.kbg);
        this.f268504h = textView3;
        textView3.setText(C0966R.string.c_o);
        this.f268505i = this.f268503g.findViewById(C0966R.C0970id.cg9);
        this.f268506j = this.f268503g.findViewById(C0966R.C0970id.cg_);
        C93123b<C41062e> wx02 = ((C92054g) C86312j.m106911c(cls)).wx0();
        ((C119157j) C119157j.f356862d).mo183875f(new C41060a(wx02));
        mo127725J7();
        this.f268505i.setOnClickListener(this);
        ((C92054g) C86312j.m106911c(cls)).wx0().mo127637a(this.f268513t);
        ((C92054g) C86312j.m106911c(cls)).getClass();
        C30790w2.m39221h().mo57715b().add(this);
        mo127723H7();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f268508o) {
            mo127724I7(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (view == this.f268510q) {
            Intent intent = new Intent();
            intent.setClass(this, EmojiPaidUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "startEmojiPaid", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (view == this.f268509p) {
            mo127724I7(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (view == this.f268505i) {
                BKGLoaderManager bKGLoaderManager = ((C92054g) C86312j.m106911c(C92054g.class)).wx0().f268269a;
                bKGLoaderManager.f110545a = true;
                bKGLoaderManager.mo64097f();
                mo127725J7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void onCreate(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        initView();
        int intExtra = getIntent().getIntExtra(String.valueOf(10931), 0);
        C115669n nVar = C115669n.INSTANCE;
        nVar.kvStat(10931, String.valueOf(intExtra));
        Log.m105925i("MicroMsg.emoji.EmojiMineUI", "jacks statistics enter Emoji Setting UI:%d", Integer.valueOf(intExtra));
        setBackBtn(new C93172f0(this));
        addTextOptionMenu(0, getString(C0966R.string.c7r), new C93187g0(this));
        if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN, Boolean.FALSE)).booleanValue()) {
            C39496m.m42136q(true);
        }
        C115669n nVar2 = nVar;
        nVar2.idkeyStat(406, 3, 1, false);
        nVar2.idkeyStat(406, 5, System.currentTimeMillis() - currentTimeMillis, false);
        nVar.mo160131h(12740, 4, "", "", "", 24, 24);
        C46878j.f126071a.mo72084a();
    }

    public void onDestroy() {
        Class cls = C92054g.class;
        super.onDestroy();
        ((C92054g) C86312j.m106911c(cls)).wx0().mo127638b(this.f268513t);
        ((C92054g) C86312j.m106911c(cls)).getClass();
        C30790w2.m39221h().mo57715b().remove(this);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if ("event_update_group".equals(str)) {
            this.f268502f.reset();
            this.f268501e.f297815t.clear();
            this.f268501e.f297815t.addAll(this.f268502f.f268256b);
            this.f268501e.notifyDataSetChanged();
            mo127723H7();
        }
    }
}
