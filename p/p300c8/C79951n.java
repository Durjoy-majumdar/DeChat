package p300c8;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import p333e8.C20528a;
import p333e8.C20551y;

/* renamed from: c8.n */
public final class C79951n implements C79946g {

    /* renamed from: a */
    public final Context f234188a;

    /* renamed from: b */
    public final C79967x<? super C79946g> f234189b;

    /* renamed from: c */
    public final C79946g f234190c;

    /* renamed from: d */
    public C79946g f234191d;

    /* renamed from: e */
    public C79946g f234192e;

    /* renamed from: f */
    public C79946g f234193f;

    /* renamed from: g */
    public C79946g f234194g;

    /* renamed from: h */
    public C79946g f234195h;

    public C79951n(Context context, C79967x<? super C79946g> xVar, C79946g gVar) {
        this.f234188a = context.getApplicationContext();
        this.f234189b = xVar;
        gVar.getClass();
        this.f234190c = gVar;
    }

    /* renamed from: b */
    public long mo110126b(C79950j jVar) {
        boolean z = true;
        C20528a.m22240d(this.f234195h == null);
        String scheme = jVar.f234181a.getScheme();
        Uri uri = jVar.f234181a;
        int i = C20551y.f57835a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !scheme2.equals("file")) {
            z = false;
        }
        if (z) {
            if (jVar.f234181a.getPath().startsWith("/android_asset/")) {
                if (this.f234192e == null) {
                    this.f234192e = new C79940c(this.f234188a, this.f234189b);
                }
                this.f234195h = this.f234192e;
            } else {
                if (this.f234191d == null) {
                    this.f234191d = new C79955r(this.f234189b);
                }
                this.f234195h = this.f234191d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f234192e == null) {
                this.f234192e = new C79940c(this.f234188a, this.f234189b);
            }
            this.f234195h = this.f234192e;
        } else if ("content".equals(scheme)) {
            if (this.f234193f == null) {
                this.f234193f = new C79942e(this.f234188a, this.f234189b);
            }
            this.f234195h = this.f234193f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f234194g == null) {
                try {
                    this.f234194g = (C79946g) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
                if (this.f234194g == null) {
                    this.f234194g = this.f234190c;
                }
            }
            this.f234195h = this.f234194g;
        } else {
            this.f234195h = this.f234190c;
        }
        return this.f234195h.mo110126b(jVar);
    }

    /* renamed from: c */
    public int mo110127c(byte[] bArr, int i, int i2) {
        return this.f234195h.mo110127c(bArr, i, i2);
    }

    public void close() {
        C79946g gVar = this.f234195h;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f234195h = null;
            }
        }
    }

    public Uri getUri() {
        C79946g gVar = this.f234195h;
        if (gVar == null) {
            return null;
        }
        return gVar.getUri();
    }
}
