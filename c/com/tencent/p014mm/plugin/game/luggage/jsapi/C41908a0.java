package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p1072al.C92043g;
import rd3.C48020a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.a0 */
public final class C41908a0 implements C92043g.C92044a<Bitmap> {

    /* renamed from: a */
    public final /* synthetic */ C43620m2.C5947b f112911a;

    /* renamed from: b */
    public final /* synthetic */ C41909b0 f112912b;

    /* renamed from: c */
    public final /* synthetic */ Context f112913c;

    public C41908a0(C43620m2.C5947b bVar, C41909b0 b0Var, Context context) {
        this.f112911a = bVar;
        this.f112912b = b0Var;
        this.f112913c = context;
    }

    /* renamed from: a */
    public void mo65752a(int i, IEmojiInfo iEmojiInfo, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        if (i == -1) {
            this.f112911a.mo6945a("emoji load failed", (JSONObject) null);
        } else if (i == 1) {
            this.f112912b.getClass();
            Log.m105924i("getStoreEmoticonImage", "EmojiLoader.loadCover StateSuccess cover path = " + iEmojiInfo.getCoverPath());
            C41909b0 b0Var = this.f112912b;
            Context context = this.f112913c;
            C43620m2.C5947b bVar = this.f112911a;
            b0Var.getClass();
            if (C48020a.m53385b(iEmojiInfo.getCoverPath())) {
                b0Var.mo65753f(iEmojiInfo, bVar);
                return;
            }
            iEmojiInfo.mo62698y(context);
            b0Var.mo65753f(iEmojiInfo, bVar);
        }
    }
}
