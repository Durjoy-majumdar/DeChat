package com.tencent.p014mm.plugin.game.p061ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import ob0.C89144l0;
import p196ln.C76705f;
import p629ny.C76979h;
import py1.C47602i5;
import py1.C47627m2;
import py1.C47634n2;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI */
public class GameDetailRankLikedUI extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f113741g = 0;

    /* renamed from: d */
    public ListView f113742d;

    /* renamed from: e */
    public C42167b f113743e;

    /* renamed from: f */
    public Dialog f113744f;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI$a */
    public class C42166a implements MenuItem.OnMenuItemClickListener {
        public C42166a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameDetailRankLikedUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI$b */
    public static class C42167b extends BaseAdapter {

        /* renamed from: d */
        public Context f113746d;

        /* renamed from: e */
        public List<C47602i5> f113747e = new LinkedList();

        /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI$b$a */
        public static class C42168a {

            /* renamed from: a */
            public ImageView f113748a;

            /* renamed from: b */
            public TextView f113749b;

            /* renamed from: c */
            public TextView f113750c;
        }

        public C42167b(Context context) {
            this.f113746d = context;
        }

        public int getCount() {
            return ((LinkedList) this.f113747e).size();
        }

        public Object getItem(int i) {
            return (C47602i5) ((LinkedList) this.f113747e).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C42168a aVar;
            if (view == null) {
                view = LayoutInflater.from(this.f113746d).inflate(C0966R.C0971layout.avt, viewGroup, false);
                aVar = new C42168a();
                aVar.f113748a = (ImageView) view.findViewById(C0966R.C0970id.eju);
                aVar.f113749b = (TextView) view.findViewById(C0966R.C0970id.ejv);
                aVar.f113750c = (TextView) view.findViewById(C0966R.C0970id.ejw);
                view.setTag(aVar);
            } else {
                aVar = (C42168a) view.getTag();
            }
            C47602i5 i5Var = (C47602i5) ((LinkedList) this.f113747e).get(i);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar.f113748a, i5Var.f127796d, 0.5f);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(i5Var.f127796d);
            if (z1Var != null) {
                aVar.f113749b.setText(new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f113746d, z1Var.mo62898f(), aVar.f113749b.getTextSize())));
            } else {
                aVar.f113749b.setText("");
            }
            aVar.f113750c.setText(i5Var.f127797e);
            return view;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.avs;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f8j);
        setBackBtn(new C42166a());
        this.f113742d = (ListView) findViewById(C0966R.C0970id.ejx);
        C42167b bVar = new C42167b(this);
        this.f113743e = bVar;
        this.f113742d.setAdapter(bVar);
        Dialog d = C52642c.m58986d(getContext());
        this.f113744f = d;
        d.show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C41864d.m45384a(this);
        String stringExtra = getIntent().getStringExtra("extra_appdi");
        if (Util.isNullOrNil(stringExtra)) {
            finish();
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47627m2();
        bVar.f127067b = new C47634n2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getuplist";
        bVar.f127069d = 1331;
        C47350c a = bVar.mo72403a();
        ((C47627m2) a.f127055a.f127080a).f127869d = stringExtra;
        C89144l0.m111429e(a, new C42240b(this), false);
    }

    public void onDestroy() {
        super.onDestroy();
        C41864d.m45388e(this);
    }
}
