package a43;

import ac3.C103355g1;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import java.util.concurrent.CountDownLatch;

/* renamed from: a43.e */
public class C103306e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f304589d;

    /* renamed from: e */
    public final /* synthetic */ int f304590e;

    /* renamed from: f */
    public final /* synthetic */ int f304591f;

    /* renamed from: g */
    public final /* synthetic */ CountDownLatch f304592g;

    /* renamed from: h */
    public final /* synthetic */ OpenGlRender f304593h;

    public C103306e(OpenGlRender openGlRender, int i, int i2, int i3, CountDownLatch countDownLatch) {
        this.f304593h = openGlRender;
        this.f304589d = i;
        this.f304590e = i2;
        this.f304591f = i3;
        this.f304592g = countDownLatch;
    }

    public void run() {
        int i = this.f304589d;
        OpenGlRender openGlRender = this.f304593h;
        if (!(i == openGlRender.f318139p && this.f304590e == openGlRender.f318140q)) {
            openGlRender.f318137n.mo143224C(i, this.f304590e);
            OpenGlRender openGlRender2 = this.f304593h;
            openGlRender2.f318139p = this.f304589d;
            openGlRender2.f318140q = this.f304590e;
        }
        OpenGlRender openGlRender3 = this.f304593h;
        C103355g1 g1Var = openGlRender3.f318137n;
        byte[] bArr = openGlRender3.f318138o;
        g1Var.mo143226E(bArr, this.f304589d, this.f304590e, bArr, 5, this.f304591f);
        this.f304592g.countDown();
    }
}
