package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.tg4;

/* renamed from: com.tencent.mm.ui.chatting.t4 */
public class C73850t4 implements C115619a {

    /* renamed from: d */
    public String f216727d;

    /* renamed from: e */
    public Context f216728e;

    /* renamed from: f */
    public LinearLayout f216729f = new LinearLayout(this.f216728e);

    /* renamed from: g */
    public C73851a f216730g;

    /* renamed from: com.tencent.mm.ui.chatting.t4$a */
    public interface C73851a {
        /* renamed from: a */
        void mo102818a(boolean z, String str);
    }

    public C73850t4(Context context, String str, C73851a aVar) {
        this.f216727d = str;
        this.f216728e = context;
        this.f216730g = aVar;
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f216729f;
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        Log.m105925i("MicroMsg.ShowRedDotCompoent", "menuKey:%s，show：%s", this.f216727d, Boolean.valueOf(z));
        this.f216730g.mo102818a(z, this.f216727d);
        return true;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        return false;
    }

    public String getPath() {
        return this.f216727d;
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        return false;
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: j */
    public boolean mo64135j(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: k */
    public void mo64136k(C115631n nVar, boolean z) {
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return true;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return false;
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
    }
}
