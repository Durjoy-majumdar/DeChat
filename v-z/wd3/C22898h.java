package wd3;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;
import ic0.C21067a;
import java.io.InputStream;
import jc0.C21210b;

/* renamed from: wd3.h */
public final class C22898h implements C21067a {

    /* renamed from: a */
    public long f65826a;

    /* renamed from: b */
    public long f65827b;

    /* renamed from: c */
    public String f65828c;

    /* renamed from: d */
    public int f65829d;

    /* renamed from: e */
    public int f65830e;

    /* renamed from: f */
    public String f65831f;

    /* renamed from: g */
    public String f65832g;

    public C22898h() {
        this(0);
    }

    /* renamed from: a */
    public void mo32785a(String str) {
        this.f65832g = str;
        System.currentTimeMillis();
        if (C118762j.f355306a.mo183489b(this.f65830e)) {
            Log.m105927v("MicroMsg.BizImageDecodeListener", "alvinluo onReadLocalFileStart id: %s, %d", this.f65831f, Long.valueOf(System.currentTimeMillis()));
            C19449k.f54939a.mo25210c(5, str, 0);
        }
    }

    /* renamed from: b */
    public void mo32786b(InputStream inputStream) {
        System.currentTimeMillis();
        if (C118762j.f355306a.mo183489b(this.f65830e)) {
            Log.m105927v("MicroMsg.BizImageDecodeListener", "alvinluo onReadLocalFileEnd id: %s, %d", this.f65831f, Long.valueOf(System.currentTimeMillis()));
            C19449k.m20803a(C19449k.f54939a, 5, this.f65832g, 0, 4, (Object) null);
        }
    }

    /* renamed from: c */
    public void mo32787c(String str, C21210b bVar) {
        String str2 = str;
        C21210b bVar2 = bVar;
        this.f65828c = bVar2 != null ? bVar2.f59989e : null;
        this.f65829d = bVar2 != null ? bVar2.f59986b : -1;
        this.f65826a = System.currentTimeMillis();
        C118762j jVar = C118762j.f355306a;
        if (jVar.mo183489b(this.f65830e)) {
            Log.m105927v("MicroMsg.BizImageDecodeListener", "alvinluo onDecodeStart id: %s, %d", this.f65831f, Long.valueOf(System.currentTimeMillis()));
            C19449k.f54939a.mo25210c(6, str2, 0);
        }
        if (this.f65829d == 2 && jVar.mo183488a(this.f65830e)) {
            Log.m105919d("MicroMsg.BizImageDecodeListener", "alvinluo BizImage onDecodeStart id: %s, contentType: %s, url: %s", this.f65831f, this.f65828c, str2);
            String str3 = this.f65828c;
            int c = jVar.mo183490c(str3);
            Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportRequestImageDecode contentType: %s, imageType: %d", str3, Integer.valueOf(c));
            if (c == 0) {
                C115669n.INSTANCE.mo175913w(1111, 47, 1);
            } else if (c == 1) {
                C115669n.INSTANCE.mo175913w(1111, 11, 1);
            } else if (c == 2) {
                C115669n.INSTANCE.mo175913w(1111, 43, 1);
            }
        }
    }

    /* renamed from: d */
    public void mo32788d(Bitmap bitmap) {
        this.f65827b = System.currentTimeMillis();
        C118762j jVar = C118762j.f355306a;
        if (jVar.mo183489b(this.f65830e)) {
            C19449k.m20803a(C19449k.f54939a, 6, this.f65832g, 0, 4, (Object) null);
        }
        if (this.f65829d == 2 && jVar.mo183488a(this.f65830e)) {
            Object[] objArr = new Object[4];
            objArr[0] = this.f65831f;
            objArr[1] = Long.valueOf(this.f65827b - this.f65826a);
            objArr[2] = Boolean.valueOf(bitmap == null);
            objArr[3] = bitmap != null ? Boolean.valueOf(bitmap.isRecycled()) : null;
            Log.m105919d("MicroMsg.BizImageDecodeListener", "alvinluo BizImage onDecodeEnd id: %s, decode cost: %d ms, bitmap == null: %b, recycled: %s", objArr);
            boolean z = bitmap != null && !bitmap.isRecycled();
            C22899i iVar = C22899i.f65833a;
            iVar.mo36072b(this.f65828c, z);
            String str = this.f65828c;
            long j = this.f65827b - this.f65826a;
            if (j >= 0) {
                int c = jVar.mo183490c(str);
                Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportImageDecodeTime contentType: %s, imageType: %d, decodeTime: %d", str, Integer.valueOf(c), Long.valueOf(j));
                if (c == 0) {
                    C115669n.INSTANCE.mo175913w(1111, 50, j);
                } else if (c == 1) {
                    C115669n.INSTANCE.mo175913w(1111, 21, j);
                } else if (c == 2) {
                    C115669n.INSTANCE.mo175913w(1111, 46, j);
                }
            }
            if (jVar.mo183491d(this.f65828c) && !z) {
                iVar.mo36076f(this.f65832g, 2, 2, this.f65830e);
            }
        }
    }

    public C22898h(int i) {
        this.f65829d = -1;
        this.f65831f = "";
        this.f65832g = "";
        this.f65830e = i;
        this.f65831f = String.valueOf(hashCode());
    }
}
