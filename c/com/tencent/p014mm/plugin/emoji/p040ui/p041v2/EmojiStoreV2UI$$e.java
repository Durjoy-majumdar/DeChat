package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.view.View;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p626nv.C47300f;
import te3.tg4;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI$$e */
public class EmojiStoreV2UI$$e implements C115619a {

    /* renamed from: d */
    public int f110645d;

    /* renamed from: e */
    public String f110646e;

    /* renamed from: f */
    public View f110647f = new View(MMApplicationContext.getContext());

    /* renamed from: g */
    public final /* synthetic */ EmojiStoreV2UI f110648g;

    public EmojiStoreV2UI$$e(EmojiStoreV2UI emojiStoreV2UI, int i, String str) {
        this.f110648g = emojiStoreV2UI;
        this.f110645d = i;
        this.f110646e = str;
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f110647f;
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        this.f110648g.getController().mo177057M0(this.f110645d, z);
        return true;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        return false;
    }

    public String getPath() {
        return this.f110646e;
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
        ((C47300f) C86312j.m106911c(C47300f.class)).mo72342m2(this, nVar, z);
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return ((C47300f) C86312j.m106911c(C47300f.class)).mo72340I0(z, this);
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
    }
}
