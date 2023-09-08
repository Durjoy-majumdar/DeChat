package fw2;

import android.graphics.drawable.ColorDrawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.loader.cache.memory.DefaultBitmapMemoryCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import k60.C60979d;
import k60.C99101e;
import n60.C100070a;
import n60.C100071b;
import n60.C100075f;
import p60.C100632a;
import zv2.C103105a;

/* renamed from: fw2.d */
public final class C98060d {

    /* renamed from: a */
    public C60979d<C98059c> f287508a;

    /* renamed from: b */
    public final C100075f f287509b;

    public C98060d() {
        C100632a aVar = new C100632a();
        C100075f.C100076a aVar2 = new C100075f.C100076a();
        aVar2.f293176b = true;
        aVar2.f293175a = true;
        C100075f a = aVar2.mo139398a();
        C100075f.C100076a aVar3 = new C100075f.C100076a();
        aVar3.f293176b = true;
        aVar3.f293175a = true;
        aVar3.f293184j = new ColorDrawable(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2930d));
        C103105a aVar4 = C103105a.f304209b;
        aVar3.f293181g = ((C103105a.C103106a) aVar4.mo138761d()).f304212c;
        aVar3.f293180f = ((C103105a.C103106a) aVar4.mo138761d()).f304213d;
        this.f287509b = aVar3.mo139398a();
        C100070a aVar5 = new C100070a();
        aVar5.f293145c = new C98056a();
        aVar5.f293146d = new C98057b();
        aVar5.f293147e = aVar;
        aVar5.f293144b = new DefaultBitmapMemoryCache();
        aVar5.f293143a = a;
        this.f287508a = C99101e.f290570a.mo138480b(new C100071b(aVar5));
    }
}
