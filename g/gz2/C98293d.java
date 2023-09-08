package gz2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.loader.cache.memory.DefaultBitmapMemoryCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import k60.C60979d;
import k60.C99101e;
import n60.C100070a;
import n60.C100071b;
import n60.C100075f;
import o90.C100301b;
import p60.C100632a;
import p823sg.C101611g;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: gz2.d */
public final class C98293d {

    /* renamed from: a */
    public static final C60979d<C46003b> f288116a;

    /* renamed from: b */
    public static final C101611g<String, Bitmap> f288117b = new C100301b(30, C98293d.class);

    /* renamed from: c */
    public static final C13601g f288118c = C36568h.m40985a(C87415a.f253303d);

    /* renamed from: gz2.d$a */
    public static final class C87415a extends C87413o implements C32224a<Bitmap> {

        /* renamed from: d */
        public static final C87415a f253303d = new C87415a();

        public C87415a() {
            super(0);
        }

        public Object invoke() {
            return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.ckj, (BitmapFactory.Options) null);
        }
    }

    static {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        aVar.f293180f = 1080;
        aVar.f293181g = 1080;
        C100075f a = aVar.mo139398a();
        C100070a aVar2 = new C100070a();
        aVar2.f293145c = new C98291a();
        aVar2.f293146d = new C98292c();
        aVar2.f293147e = new C100632a();
        aVar2.f293144b = new DefaultBitmapMemoryCache();
        aVar2.f293143a = a;
        f288116a = C99101e.f290570a.mo138480b(new C100071b(aVar2));
    }
}
