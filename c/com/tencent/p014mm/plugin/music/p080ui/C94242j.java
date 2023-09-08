package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ma2.C99808k;
import p447aw.C103918d;
import qc0.C101093a;
import qc0.C101106m;
import xd3.C78802b;

/* renamed from: com.tencent.mm.plugin.music.ui.j */
public class C94242j extends C78802b {

    /* renamed from: h */
    public TextView f272269h;

    /* renamed from: i */
    public IListener f272270i;

    /* renamed from: j */
    public View f272271j;

    /* renamed from: n */
    public View f272272n;

    /* renamed from: o */
    public C101106m f272273o = null;

    public C94242j(Context context) {
        super(context);
        View view = this.f230569f;
        if (view != null) {
            this.f272269h = (TextView) view.findViewById(C0966R.C0970id.h5q);
            this.f272272n = this.f230569f.findViewById(C0966R.C0970id.h5r);
            this.f272271j = this.f230569f.findViewById(C0966R.C0970id.a7i);
            this.f272269h.setTextSize(0, (float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3881hq));
            this.f230569f.setOnClickListener(new C4916k(this));
        }
        MusicBanner$2 musicBanner$2 = new MusicBanner$2(this, C40008f.f107254d);
        this.f272270i = musicBanner$2;
        musicBanner$2.alive();
    }

    /* renamed from: a */
    public void mo7968a() {
        this.f272270i.dead();
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.bid;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 1;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        return mo129565h();
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        View view = this.f230569f;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.h5r);
            if (i != 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), 23) || !((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.OVERLAY, C113177k.C113178a.MUSICPLAYER)) {
                Log.m105920e("MicroMsg.MusicBanner", "isFloatWindowOpAllowed return false");
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                View view3 = findViewById;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                Log.m105920e("MicroMsg.MusicBanner", "isFloatWindowOpAllowed return true");
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (C101093a.m132481c()) {
                    C101106m mVar = this.f272273o;
                    if (mVar == null || !mVar.f295953N) {
                        Log.m105924i("MicroMsg.MusicBanner", "resume music to float ball can ");
                        C99808k.m130281e(mVar);
                        return;
                    }
                    boolean z = !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76751F();
                    Log.m105924i("MicroMsg.MusicBanner", "resume music to float ball can enter: " + z);
                    if (z) {
                        findViewById.post(new j$$a(mVar));
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo129565h() {
        boolean z = this.f230567d;
        if (z && this.f230568e) {
            this.f272272n.setBackgroundResource(C0966R.C0969drawable.axp);
            this.f272269h.setBackground((Drawable) null);
        } else if (z) {
            this.f272271j.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f272272n.setBackgroundResource(C0966R.C0969drawable.c4w);
            this.f272269h.setBackgroundResource(C0966R.C0969drawable.bcr);
        } else if (this.f230568e) {
            this.f272271j.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f272272n.setBackgroundResource(C0966R.C0969drawable.bcr);
            this.f272269h.setBackground((Drawable) null);
        } else {
            this.f272271j.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f272272n.setBackground((Drawable) null);
            this.f272269h.setBackgroundResource(C0966R.C0969drawable.bcr);
        }
        int i = 8;
        if (C101093a.m132481c()) {
            C101106m b = C101093a.m132480b();
            this.f272273o = b;
            String str = MMApplicationContext.getContext().getString(C0966R.string.h1t) + MMApplicationContext.getContext().getString(C0966R.string.h1u) + b.f295962g;
            TextView textView = this.f272269h;
            if (textView != null) {
                textView.setText(str);
            }
            if (!b.f295941B) {
                i = 0;
            }
            mo7975g(i);
            this.f272273o = null;
            return !b.f295941B;
        }
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        musicActionEvent.f264920d.f264922a = 10;
        musicActionEvent.publish();
        if (musicActionEvent.f264921e.f264931b) {
            mo7975g(0);
            return true;
        }
        mo7975g(8);
        return false;
    }
}
