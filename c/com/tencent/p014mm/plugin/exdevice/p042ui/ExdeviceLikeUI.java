package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import java.util.ArrayList;
import junit.framework.Assert;
import p196ln.C76705f;
import p629ny.C76979h;
import t71.C36965a;
import v71.C37690e;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI */
public class ExdeviceLikeUI extends MMActivity {

    /* renamed from: d */
    public ArrayList<C37690e> f111127d;

    /* renamed from: e */
    public String f111128e;

    /* renamed from: f */
    public boolean f111129f;

    /* renamed from: g */
    public ListView f111130g;

    /* renamed from: h */
    public C41267a f111131h;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI$a */
    public class C41267a extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI$a$a */
        public class C41268a {

            /* renamed from: a */
            public ImageView f111133a;

            /* renamed from: b */
            public NoMeasuredTextView f111134b;

            /* renamed from: c */
            public TextView f111135c;

            /* renamed from: d */
            public TextView f111136d;

            public C41268a(C41267a aVar) {
            }
        }

        public C41267a() {
        }

        public int getCount() {
            ArrayList<C37690e> arrayList = ExdeviceLikeUI.this.f111127d;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        public Object getItem(int i) {
            return ExdeviceLikeUI.this.f111127d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C41268a aVar;
            TextView textView;
            C37690e eVar = ExdeviceLikeUI.this.f111127d.get(i);
            if (view == null) {
                ExdeviceLikeUI exdeviceLikeUI = ExdeviceLikeUI.this;
                view = exdeviceLikeUI.f111129f ? LayoutInflater.from(exdeviceLikeUI).inflate(C0966R.C0971layout.a4d, viewGroup, false) : LayoutInflater.from(exdeviceLikeUI).inflate(C0966R.C0971layout.a4c, viewGroup, false);
                aVar = new C41268a(this);
                aVar.f111133a = (ImageView) view.findViewById(C0966R.C0970id.f357945cm2);
                aVar.f111134b = (NoMeasuredTextView) view.findViewById(C0966R.C0970id.cmt);
                aVar.f111135c = (TextView) view.findViewById(C0966R.C0970id.cmn);
                aVar.f111136d = (TextView) view.findViewById(C0966R.C0970id.cmm);
                aVar.f111134b.mo153549i(0, ExdeviceLikeUI.this.getResources().getDimension(C0966R.dimen.f3927j7));
                aVar.f111134b.setTextColor(ExdeviceLikeUI.this.getResources().getColor(C0966R.color.a7f));
                aVar.f111134b.setSingleLine(true);
                aVar.f111134b.setShouldEllipsize(true);
                view.setTag(aVar);
            } else {
                aVar = (C41268a) view.getTag();
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106831cr(aVar.f111133a, eVar.field_username);
            aVar.f111134b.setText((CharSequence) ((C76979h) C86312j.m106911c(C76979h.class)).yp0(ExdeviceLikeUI.this, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(eVar.field_username), aVar.f111134b.getTextSize()));
            if (Util.isNullOrNil(eVar.field_liketips) || (textView = aVar.f111135c) == null) {
                TextView textView2 = aVar.f111135c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                textView.setVisibility(0);
                aVar.f111135c.setText(eVar.field_liketips);
            }
            int i2 = eVar.field_timestamp;
            int currentTimeMillis = (int) ((((System.currentTimeMillis() / 1000) - ((long) i2)) / 60) + 1);
            if (currentTimeMillis <= 30) {
                aVar.f111136d.setText(ExdeviceLikeUI.this.getString(C0966R.string.ce4, new Object[]{Integer.valueOf(currentTimeMillis)}));
            } else {
                aVar.f111136d.setText(C72715f.m85112e(ExdeviceLikeUI.this, ((long) i2) * 1000, true));
            }
            return view;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a4e;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f111128e = getIntent().getStringExtra("app_username");
        String stringExtra = getIntent().getStringExtra("key_rank_info");
        String stringExtra2 = getIntent().getStringExtra("key_rank_semi");
        this.f111129f = getIntent().getBooleanExtra("key_is_like_read_only", false);
        if (!Util.isNullOrNil(stringExtra)) {
            this.f111127d = C36965a.m41110a(this.f111128e, stringExtra, stringExtra2);
        } else {
            String stringExtra3 = getIntent().getStringExtra("rank_id");
            Assert.assertTrue(!Util.isNullOrNil(stringExtra3));
            this.f111127d = C41166r1.Fx0().mo61493Lo(stringExtra3);
        }
        ListView listView = (ListView) findViewById(C0966R.C0970id.cmc);
        this.f111130g = listView;
        listView.setEmptyView(findViewById(C0966R.C0970id.cig));
        C41267a aVar = new C41267a();
        this.f111131h = aVar;
        this.f111130g.setAdapter(aVar);
        if (!this.f111129f) {
            this.f111130g.setOnItemClickListener(new C41365r(this));
        }
        this.f111130g.setOnItemClickListener(new C41367s(this));
        setMMTitle((int) C0966R.string.ce5);
        if (!this.f111129f) {
            addTextOptionMenu(0, getString(C0966R.string.f360393ce3), new C2254p(this));
        }
        setBackBtn(new C2255q(this));
    }
}
