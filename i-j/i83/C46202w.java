package i83;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: i83.w */
public final class C46202w implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C46198u f124544d;

    /* renamed from: e */
    public final /* synthetic */ String f124545e;

    public C46202w(C46198u uVar, String str) {
        this.f124544d = uVar;
        this.f124545e = str;
    }

    public final boolean onTimerExpired() {
        C46198u uVar = this.f124544d;
        uVar.f124537t++;
        String str = this.f124545e;
        uVar.f124524d.evaluateJavascript(str, new C46201v(uVar, str));
        return false;
    }
}
