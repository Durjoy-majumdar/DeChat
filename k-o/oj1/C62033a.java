package oj1;

import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import gy3.C87412m;
import jq3.C9493c;
import te3.C64890zp2;

/* renamed from: oj1.a */
public final class C62033a implements C9493c {

    /* renamed from: d */
    public final String f176351d;

    /* renamed from: e */
    public final String f176352e;

    /* renamed from: f */
    public final C64890zp2 f176353f;

    public C62033a(String str, String str2, C64890zp2 zp22) {
        C87412m.m108594g(str, "coverUrl");
        C87412m.m108594g(str2, V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL);
        this.f176351d = str;
        this.f176352e = str2;
        this.f176353f = zp22;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
