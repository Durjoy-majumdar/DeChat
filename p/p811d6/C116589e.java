package p811d6;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.util.Locale;
import p811d6.C116598k;
import p957e6.C86444b;

/* renamed from: d6.e */
public class C116589e extends C116598k {

    /* renamed from: i */
    public final C116595h f349619i;

    /* renamed from: j */
    public final C86444b f349620j;

    /* renamed from: k */
    public C116588b f349621k;

    public C116589e(C116595h hVar, C86444b bVar) {
        super(hVar, bVar);
        this.f349620j = bVar;
        this.f349619i = hVar;
    }

    /* renamed from: c */
    public void mo180566c(int i) {
        C116588b bVar = this.f349621k;
        if (bVar != null) {
            bVar.mo180565a(this.f349620j.f251237b, this.f349619i.f349642c.f349658a, i);
        }
    }

    /* renamed from: d */
    public void mo180567d(C45267d dVar, Socket socket) {
        String str;
        C45267d dVar2 = dVar;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        C116595h hVar = this.f349619i;
        synchronized (hVar) {
            if (TextUtils.isEmpty(hVar.f349642c.f349660c)) {
                hVar.mo180578b();
            }
            str = hVar.f349642c.f349660c;
        }
        boolean z = !TextUtils.isEmpty(str);
        long available = this.f349620j.mo120867c() ? this.f349620j.available() : this.f349619i.length();
        boolean z2 = available >= 0;
        boolean z3 = dVar2.f122623c;
        long j = z3 ? available - dVar2.f122622b : available;
        boolean z4 = z2 && z3;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar2.f122623c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? String.format(Locale.US, "Content-Length: %d\n", new Object[]{Long.valueOf(j)}) : "");
        sb.append(z4 ? String.format(Locale.US, "Content-Range: bytes %d-%d/%d\n", new Object[]{Long.valueOf(dVar2.f122622b), Long.valueOf(available - 1), Long.valueOf(available)}) : "");
        sb.append(z ? String.format(Locale.US, "Content-Type: %s\n", new Object[]{str}) : "");
        sb.append("\n");
        bufferedOutputStream.write(sb.toString().getBytes("UTF-8"));
        long j2 = dVar2.f122622b;
        long length = this.f349619i.length();
        if (!((length > 0 ? 1 : (length == 0 ? 0 : -1)) > 0) || !dVar2.f122623c || ((float) dVar2.f122622b) <= ((float) this.f349620j.available()) + (((float) length) * 0.2f)) {
            byte[] bArr = new byte[8192];
            while (true) {
                if (j2 >= 0) {
                    while (!this.f349650b.mo120867c() && this.f349650b.available() < ((long) 8192) + j2 && !this.f349655g) {
                        synchronized (this) {
                            boolean z5 = (this.f349654f == null || this.f349654f.getState() == Thread.State.TERMINATED) ? false : true;
                            if (!this.f349655g && !this.f349650b.mo120867c() && !z5) {
                                this.f349654f = new Thread(new C116598k.C116600b((C116598k.C116599a) null), "Source reader for " + this.f349649a);
                                this.f349654f.start();
                            }
                        }
                        synchronized (this.f349651c) {
                            try {
                                this.f349651c.wait(1000);
                            } catch (InterruptedException e) {
                                throw new C86197l("Waiting source data is interrupted!", e);
                            }
                        }
                        int i = this.f349653e.get();
                        if (i >= 1) {
                            this.f349653e.set(0);
                            throw new C86197l("Error reading source " + i + " times");
                        }
                    }
                    int d = this.f349650b.mo120869d(bArr, j2, 8192);
                    if (this.f349650b.mo120867c() && this.f349656h != 100) {
                        this.f349656h = 100;
                        mo180566c(100);
                    }
                    if (d != -1) {
                        bufferedOutputStream.write(bArr, 0, d);
                        j2 += (long) d;
                    } else {
                        bufferedOutputStream.flush();
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("Data offset must be positive!");
                }
            }
        } else {
            C116595h hVar2 = new C116595h(this.f349619i);
            try {
                hVar2.mo180577a((long) ((int) j2));
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int read = hVar2.read(bArr2);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr2, 0, read);
                    } else {
                        bufferedOutputStream.flush();
                        return;
                    }
                }
            } finally {
                hVar2.close();
            }
        }
    }
}
