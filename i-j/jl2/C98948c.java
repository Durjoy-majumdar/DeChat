package jl2;

import com.tencent.qbar.C19931a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p200lx.C99712h0;

/* renamed from: jl2.c */
public class C98948c implements C99712h0.C99713a {

    /* renamed from: a */
    public final /* synthetic */ String[][] f290044a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f290045b;

    public C98948c(C98949d dVar, String[][] strArr, CountDownLatch countDownLatch) {
        this.f290044a = strArr;
        this.f290045b = countDownLatch;
    }

    /* renamed from: a */
    public void mo24342a(long j, C99712h0.C99715c cVar) {
        List<C19931a.C19932a> list = cVar.f292251a;
        if (list != null) {
            String[] strArr = new String[list.size()];
            int i = 0;
            for (C19931a.C19932a aVar : cVar.f292251a) {
                strArr[i] = aVar.f56829f;
                i++;
            }
            synchronized (this.f290044a) {
                this.f290044a[0] = strArr;
            }
        }
        this.f290045b.countDown();
    }
}
