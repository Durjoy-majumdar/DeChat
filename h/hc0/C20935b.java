package hc0;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.p014mm.modelimage.loader.impr.C114733a;
import com.tencent.p014mm.modelimage.loader.impr.C114734d;
import com.tencent.p014mm.modelimage.loader.impr.C17792c;
import com.tencent.p014mm.modelimage.loader.impr.C17794h;
import com.tencent.p014mm.modelimage.loader.impr.C81000b;
import com.tencent.p014mm.modelimage.loader.impr.C81002e;
import com.tencent.p014mm.modelimage.loader.impr.C92838f;
import com.tencent.p014mm.modelimage.loader.impr.DefaultImageMemoryCacheListener;
import hc0.C20937c;
import ic0.C117152b;
import ic0.C117153g;
import ic0.C21068c;
import ic0.C21069f;
import ic0.C21071j;
import ic0.C21072l;
import ic0.C21074o;
import ic0.C87693m;
import ic0.C98662p;
import java.util.concurrent.Executor;
import zt3.C119157j;

/* renamed from: hc0.b */
public class C20935b {

    /* renamed from: o */
    public static final int f59285o = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public final String f59286a;

    /* renamed from: b */
    public final Resources f59287b;

    /* renamed from: c */
    public final int f59288c;

    /* renamed from: d */
    public final int f59289d;

    /* renamed from: e */
    public final C20937c f59290e;

    /* renamed from: f */
    public final C21074o f59291f;

    /* renamed from: g */
    public final C117152b f59292g;

    /* renamed from: h */
    public final C21068c f59293h;

    /* renamed from: i */
    public final C117153g f59294i;

    /* renamed from: j */
    public final C21072l f59295j;

    /* renamed from: k */
    public final C87693m f59296k;

    /* renamed from: l */
    public final C21071j f59297l;

    /* renamed from: m */
    public final Executor f59298m;

    /* renamed from: n */
    public final C98662p f59299n;

    /* renamed from: hc0.b$a */
    public static class C20936a {

        /* renamed from: a */
        public int f59300a = C20935b.f59285o;

        /* renamed from: b */
        public int f59301b = 5;

        /* renamed from: c */
        public Context f59302c;

        /* renamed from: d */
        public C20937c f59303d = null;

        /* renamed from: e */
        public C21074o f59304e = null;

        /* renamed from: f */
        public C117152b f59305f = null;

        /* renamed from: g */
        public C21068c f59306g = null;

        /* renamed from: h */
        public C117153g f59307h = null;

        /* renamed from: i */
        public C21072l f59308i = null;

        /* renamed from: j */
        public C87693m f59309j = null;

        /* renamed from: k */
        public C21069f f59310k = null;

        /* renamed from: l */
        public C98662p f59311l = null;

        /* renamed from: m */
        public C21071j f59312m = null;

        /* renamed from: n */
        public Executor f59313n;

        public C20936a(Context context) {
            this.f59302c = context.getApplicationContext();
        }

        /* renamed from: a */
        public C20935b mo32665a() {
            if (this.f59303d == null) {
                this.f59303d = new C20937c.C20939b().mo32666a();
            }
            if (this.f59304e == null) {
                this.f59304e = new DefaultImageMemoryCacheListener();
            }
            if (this.f59305f == null) {
                this.f59305f = new C114733a();
            }
            if (this.f59306g == null) {
                this.f59306g = new C81000b();
            }
            if (this.f59307h == null) {
                this.f59307h = new C114734d();
            }
            if (this.f59308i == null) {
                this.f59308i = new C17794h();
            }
            if (this.f59312m == null) {
                this.f59312m = C98334a.m127117a(this.f59300a, this.f59301b);
            }
            if (this.f59313n == null) {
                this.f59313n = ((C119157j) C119157j.f356862d).mo183883n("image_loader_ImageTempFile");
            }
            if (this.f59309j == null) {
                this.f59309j = new C81002e();
            }
            if (this.f59310k == null) {
                this.f59310k = new C17792c();
            }
            if (this.f59311l == null) {
                this.f59311l = new C92838f();
            }
            return new C20935b(this);
        }
    }

    public C20935b(C20936a aVar) {
        this.f59286a = aVar.f59302c.getPackageName();
        this.f59287b = aVar.f59302c.getResources();
        this.f59288c = aVar.f59300a;
        this.f59289d = aVar.f59301b;
        this.f59290e = aVar.f59303d;
        this.f59291f = aVar.f59304e;
        this.f59292g = aVar.f59305f;
        this.f59293h = aVar.f59306g;
        this.f59294i = aVar.f59307h;
        this.f59295j = aVar.f59308i;
        this.f59297l = aVar.f59312m;
        this.f59298m = aVar.f59313n;
        this.f59296k = aVar.f59309j;
        C21069f fVar = aVar.f59310k;
        this.f59299n = aVar.f59311l;
    }
}
