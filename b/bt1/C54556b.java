package bt1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import r60.C101350i;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import t60.C64207e;
import te3.C64726td1;
import x60.C102564a;

/* renamed from: bt1.b */
public abstract class C54556b implements C54562d {

    /* renamed from: a */
    public final Context f152933a;

    /* renamed from: b */
    public Bundle f152934b;

    /* renamed from: c */
    public C64726td1 f152935c;

    /* renamed from: d */
    public final C13601g f152936d;

    /* renamed from: bt1.b$a */
    public static final class C54557a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C54556b f152937a;

        public C54557a(C54556b bVar) {
            this.f152937a = bVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C61926c.m72668M(new C54555a(this.f152937a, bitmap));
            }
        }
    }

    /* renamed from: bt1.b$b */
    public static final class C54558b extends C87413o implements C32224a<C54563e> {

        /* renamed from: d */
        public final /* synthetic */ Context f152938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54558b(Context context) {
            super(0);
            this.f152938d = context;
        }

        public Object invoke() {
            return ((PostMainUIC) C39818r.f106831a.mo62443b(this.f152938d).mo75002a(PostMainUIC.class)).mo78410F3();
        }
    }

    public C54556b(Context context) {
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f152933a = context;
        this.f152936d = C36568h.m40985a(new C54558b(context));
    }

    /* renamed from: c */
    public abstract boolean mo75439c();

    /* renamed from: d */
    public void mo75440d() {
    }

    /* renamed from: e */
    public final C54563e mo75441e() {
        return (C54563e) ((C36570n) this.f152936d).getValue();
    }

    /* renamed from: f */
    public abstract C13604l<Integer, Integer> mo75442f();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v13, types: [pl1.b0] */
    /* JADX WARNING: type inference failed for: r0v14, types: [pl1.o0] */
    /* JADX WARNING: type inference failed for: r0v15, types: [pl1.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75443g(te3.C64689rq2 r11) {
        /*
            r10 = this;
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            up1.y r2 = up1.C27696y.THUMB_IMAGE
            java.lang.String r0 = "mediaObj"
            gy3.C87412m.m108594g(r11, r0)
            int r0 = r11.f185268f
            r3 = 4
            if (r0 != r3) goto L_0x0032
            java.lang.String r0 = r11.f185283w
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0025
            pl1.b0 r9 = new pl1.b0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x003e
        L_0x0025:
            pl1.o0 r9 = new pl1.o0
            up1.y r2 = up1.C27696y.RAW_IMAGE
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x003e
        L_0x0032:
            pl1.b0 r9 = new pl1.b0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x003e:
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62446e(r8)
            bl3.c r0 = r0.mo62447c(r7)
            pl1.s0 r0 = (pl1.C11990s0) r0
            k60.d r0 = r0.mo11871f2()
            l60.b r0 = r0.mo85955a(r9)
            pl1.e0$a r1 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r1 = r2.mo11867O2(r1)
            r0.mo138758f(r1)
            bt1.b$a r1 = new bt1.b$a
            r1.<init>(r10)
            r0.f291320d = r1
            r0.mo85953c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54556b.mo75443g(te3.rq2):void");
    }

    /* renamed from: h */
    public void mo75444h() {
        Log.m105924i("PostMediaWidget", "refresh thumbLocalUrl");
    }

    /* renamed from: i */
    public void mo75445i(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "thumb");
    }
}
