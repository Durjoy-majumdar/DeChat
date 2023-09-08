package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C19636w0;
import di3.C86312j;
import l31.C61212e;

/* renamed from: com.tencent.mm.ui.LiveBizSessionTipsBar */
public class LiveBizSessionTipsBar extends LinearLayout {

    /* renamed from: d */
    public RelativeLayout f121178d;

    /* renamed from: e */
    public C67391b f121179e;

    /* renamed from: f */
    public Context f121180f;

    /* renamed from: g */
    public String f121181g = null;

    public LiveBizSessionTipsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121180f = context;
        mo69866a();
    }

    /* renamed from: a */
    public final void mo69866a() {
        View.inflate(getContext(), C0966R.C0971layout.b6h, this);
        this.f121178d = (RelativeLayout) findViewById(C0966R.C0970id.aag);
        ((TextView) findViewById(C0966R.C0970id.aai)).setText(MMApplicationContext.getContext().getString(C0966R.string.aok));
    }

    public void setChattingContext(C67391b bVar) {
        this.f121179e = bVar;
        this.f121181g = bVar.mo91577r();
        Class cls = C61212e.class;
        int intExtra = this.f121179e.f193286j.getIntExtra("specific_chat_from_scene", 0);
        C19428d dVar = C19428d.f54856a;
        String f = dVar.mo25172f(this.f121181g);
        int h = dVar.mo25174h(this.f121181g);
        int i = C19636w0.f55626c;
        C115669n.INSTANCE.mo160131h(23044, 1, this.f121181g, Integer.valueOf(intExtra), Integer.valueOf(i), f, Integer.valueOf(h), 0, "");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f121178d, "chatting_title_bar");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f121178d, 40, 26236);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("live_id", "");
        arrayMap.put("finder_username", "");
        arrayMap.put("feed_id", "");
        arrayMap.put("comment_scene", "");
        arrayMap.put("finder_feed_export_id", f);
        arrayMap.put("wx_username", this.f121181g);
        ((C61212e) C86312j.m106911c(cls)).mo86149PM(this.f121178d, arrayMap);
        ((C61212e) C86312j.m106911c(cls)).E60(this.f121178d, new C6767c1(this));
        this.f121178d.setOnClickListener(new C45023d1(this, intExtra));
    }

    public LiveBizSessionTipsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121180f = context;
        mo69866a();
    }
}
