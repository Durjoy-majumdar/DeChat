package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86737h0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kv1.C99260q;
import ov1.C100558d;

@C86737h0
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI */
public class FTSWXPayNotifyUI extends FTSBaseUI {

    /* renamed from: t */
    public static final /* synthetic */ int f52830t = 0;

    /* renamed from: o */
    public String f52831o;

    /* renamed from: p */
    public int f52832p;

    /* renamed from: q */
    public View f52833q;

    /* renamed from: r */
    public TextView f52834r;

    /* renamed from: s */
    public C18844c0 f52835s;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI$a */
    public class C4408a implements View.OnClickListener {
        public C4408a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSWXPayNotifyUI fTSWXPayNotifyUI = FTSWXPayNotifyUI.this;
            int i = FTSWXPayNotifyUI.f52830t;
            fTSWXPayNotifyUI.getClass();
            Log.m105924i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchDateDetail");
            Intent intent = new Intent();
            intent.putExtra("detail_username", "gh_3dfda90e39d6");
            C88144b.m109801s(fTSWXPayNotifyUI, "com.tencent.mm.chatroom.ui.SelectDateUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(27229, 1, 3, "", 0, 0, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI$b */
    public class C18841b implements Runnable {
        public C18841b() {
        }

        public void run() {
            if (!FTSWXPayNotifyUI.this.isFinishing() && !FTSWXPayNotifyUI.this.isDestroyed()) {
                FTSWXPayNotifyUI.this.f52754h.getFtsEditText().mo70355k();
                FTSWXPayNotifyUI.this.f52754h.getFtsEditText().mo70361q();
            }
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52835s == null) {
            this.f52835s = new C18844c0(qVar, this.f52831o, this.f52832p);
        }
        return this.f52835s;
    }

    /* renamed from: I7 */
    public void mo23780I7(String str) {
        super.mo23780I7(str);
    }

    /* renamed from: K7 */
    public void mo23782K7() {
        this.f52831o = getIntent().getStringExtra("detail_username");
        this.f52832p = getIntent().getIntExtra("Search_Scene", 5);
        getIntent().getStringExtra("Search_Str");
        Log.m105925i("MicroMsg.FTS.FTSServiceNotifyUI", "initSearchData conversation=%s", this.f52831o);
    }

    /* renamed from: M7 */
    public void mo23783M7() {
        super.mo23783M7();
        if (this.f52832p == 5) {
            View view = this.f52833q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: N7 */
    public void mo23784N7() {
        super.mo23784N7();
        View view = this.f52833q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: O7 */
    public void mo23785O7() {
        super.mo23785O7();
        View view = this.f52833q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: P7 */
    public void mo23786P7() {
        super.mo23786P7();
        View view = this.f52833q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asu;
    }

    public void initView() {
        super.initView();
        hideActionbarLine();
        this.f52833q = findViewById(C0966R.C0970id.npg);
        TextView textView = (TextView) findViewById(C0966R.C0970id.npf);
        this.f52834r = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        if (this.f52832p == 5) {
            View view = this.f52833q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f52834r.setOnClickListener(new C4408a());
            return;
        }
        View view3 = this.f52833q;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C100558d Ta = ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta();
        if (Ta != null) {
            ((C93829e) Ta).mo128779g();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f52835s.mo23815g();
        C100558d Ta = ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta();
        if (Ta != null) {
            ((C93829e) Ta).mo128780h();
        }
    }

    public void onResume() {
        super.onResume();
        this.f52833q.postDelayed(new C18841b(), 128);
    }
}
