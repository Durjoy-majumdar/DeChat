package com.tencent.p014mm.plugin.readerapp.p092ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.readerapp.p092ui.ReaderAppUI;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.readerapp.ui.a */
public class C70416a implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ boolean f203464a;

    /* renamed from: b */
    public final /* synthetic */ ReaderAppUI.C70411l.C70413b f203465b;

    /* renamed from: c */
    public final /* synthetic */ ReaderAppUI.C70411l f203466c;

    public C70416a(ReaderAppUI.C70411l lVar, boolean z, ReaderAppUI.C70411l.C70413b bVar) {
        this.f203466c = lVar;
        this.f203464a = z;
        this.f203465b = bVar;
    }

    public void onFinish() {
        if (!this.f203464a) {
            this.f203465b.f203447i.setTextColor(ReaderAppUI.this.getContext().getResources().getColor(C0966R.color.al_));
            this.f203465b.f203447i.setBackgroundResource(C0966R.C0969drawable.f4573ge);
        }
        this.f203465b.f203448j.setVisibility(0);
    }

    public void onStart() {
    }
}
