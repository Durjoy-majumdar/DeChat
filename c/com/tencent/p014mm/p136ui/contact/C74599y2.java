package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.List;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.y2 */
public class C74599y2 extends LinearLayout {

    /* renamed from: d */
    public Context f219261d;

    /* renamed from: e */
    public LinearLayout f219262e = null;

    /* renamed from: f */
    public List<String> f219263f;

    /* renamed from: g */
    public C74600a f219264g;

    /* renamed from: h */
    public C74601b f219265h;

    /* renamed from: com.tencent.mm.ui.contact.y2$a */
    public interface C74600a {
        /* renamed from: a */
        void mo103608a(int i);
    }

    /* renamed from: com.tencent.mm.ui.contact.y2$b */
    public interface C74601b {
        /* renamed from: a */
        void mo103592a(boolean z);
    }

    public C74599y2(Context context, C74600a aVar) {
        super(context);
        this.f219261d = context;
        this.f219264g = aVar;
        ((C119157j) C119157j.f356862d).mo183875f(new C74589x2(this));
    }

    public int getOpenIMCount() {
        List<String> list = this.f219263f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setOnVisibilityChangeListener(C74601b bVar) {
        this.f219265h = bVar;
    }

    public void setVisibility(int i) {
        if (!(this.f219265h == null || i == getVisibility())) {
            this.f219265h.mo103592a(i == 0);
        }
        super.setVisibility(i);
    }
}
