package a43;

import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import java.util.concurrent.CountDownLatch;

/* renamed from: a43.d */
public class C103305d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f304587d;

    /* renamed from: e */
    public final /* synthetic */ OpenGlRender f304588e;

    public C103305d(OpenGlRender openGlRender, CountDownLatch countDownLatch) {
        this.f304588e = openGlRender;
        this.f304587d = countDownLatch;
    }

    public void run() {
        OpenGlRender openGlRender = this.f304588e;
        int i = openGlRender.f318139p;
        int i2 = openGlRender.f318140q;
        byte[] bArr = new byte[(i * i2 * 2)];
        openGlRender.f318138o = bArr;
        openGlRender.f318137n.mo143226E(bArr, i, i2, bArr, 5, 0);
        this.f304587d.countDown();
    }
}
