package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import a14.C53916l;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.EmojiFetcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import kotlin.Result;
import p1072al.C92042f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.d */
public final class C29549d implements C92042f {

    /* renamed from: a */
    public final /* synthetic */ EmojiFetcher.EmojiArgs f80461a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<IEmojiInfo> f80462b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<IEmojiInfo> f80463c;

    public C29549d(EmojiFetcher.EmojiArgs emojiArgs, C53916l<? super IEmojiInfo> lVar, C8479f0<IEmojiInfo> f0Var) {
        this.f80461a = emojiArgs;
        this.f80462b = lVar;
        this.f80463c = f0Var;
    }

    /* renamed from: a */
    public void mo55799a(boolean z) {
        Log.m105924i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + this.f80461a + ", async load success:" + z);
        if (z) {
            C53916l<IEmojiInfo> lVar = this.f80462b;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(this.f80463c.f27484d));
            return;
        }
        this.f80462b.resumeWith(Result.m168114constructorimpl((Object) null));
    }
}
