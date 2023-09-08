package com.tencent.p014mm.plugin.game.p061ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42066i0;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C86493v0;
import f40.C86709a0;
import p763ym.C79138l;
import ry1.C48152r;
import ry1.C48154s;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankUI */
public class GameDetailRankUI extends MMActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f113751h = 0;

    /* renamed from: d */
    public ListView f113752d;

    /* renamed from: e */
    public GameRankHeadView f113753e;

    /* renamed from: f */
    public C48154s f113754f;

    /* renamed from: g */
    public String f113755g;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankUI$a */
    public class C42169a implements Runnable {
        public C42169a() {
        }

        public void run() {
            C42066i0 i0Var = new C42066i0(GameDetailRankUI.this.f113755g);
            C48154s sVar = GameDetailRankUI.this.f113754f;
            sVar.f129079f = i0Var;
            MMHandlerThread.postToMainThread(new C48152r(sVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankUI$b */
    public class C42170b implements MenuItem.OnMenuItemClickListener {
        public C42170b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameDetailRankUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankUI$c */
    public static class C42171c {

        /* renamed from: a */
        public String f113758a;

        /* renamed from: b */
        public String f113759b;

        /* renamed from: c */
        public C42039b f113760c;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.avo;
    }

    public void initView() {
        setMMTitle(((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(getContext(), this.f113755g));
        setBackBtn(new C42170b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86493v0.C86495c e = C86493v0.m107224d().mo120948e(getIntent().getStringExtra("extra_session_id"));
        if (e == null) {
            finish();
            return;
        }
        C42171c cVar = (C42171c) e.mo120955b("gameDetailRankDataKey");
        this.f113752d = (ListView) findViewById(C0966R.C0970id.ejy);
        if (!Util.isNullOrNil(cVar.f113758a) && !Util.isNullOrNil(cVar.f113759b)) {
            View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0966R.C0971layout.avv, this.f113752d, false);
            this.f113753e = (GameRankHeadView) inflate.findViewById(C0966R.C0970id.en8);
            this.f113752d.addHeaderView(inflate);
            this.f113753e.setData(cVar);
        }
        C48154s sVar = new C48154s(this);
        this.f113754f = sVar;
        sVar.f129078e = C0966R.C0971layout.avp;
        this.f113752d.setAdapter(sVar);
        String str = cVar.f113760c.field_appId;
        this.f113755g = str;
        if (Util.isNullOrNil(str)) {
            finish();
            return;
        }
        initView();
        C41864d.m45384a(this);
        C86709a0.m107525e().postToWorker(new C42169a());
    }

    public void onDestroy() {
        super.onDestroy();
        C41864d.m45388e(this);
        C42091s.m45785e(this.f113753e.f114124d);
    }

    public void onResume() {
        super.onResume();
    }
}
