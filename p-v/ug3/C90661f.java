package ug3;

import com.tencent.p014mm.sdk.platformtools.MMHandler;
import mp3.C88819d;

/* renamed from: ug3.f */
public class C90661f extends C88819d {

    /* renamed from: a */
    public MMHandler f260479a;

    /* renamed from: b */
    public String f260480b;

    public C90661f(String str) {
        MMHandler mMHandler = new MMHandler(str);
        this.f260479a = mMHandler;
        this.f260480b = mMHandler.getSerialTag();
    }

    public void arrange(Runnable runnable) {
        this.f260479a.post(runnable);
    }

    public void arrangeInterval(Runnable runnable, long j) {
        this.f260479a.postDelayed(runnable, j);
    }

    public void cancel() {
        this.f260479a.removeCallbacksAndMessages((Object) null);
    }

    public String getType() {
        return this.f260480b;
    }
}
