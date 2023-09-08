package p927ab;

import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import p1045ud.C90639a;
import p284zb.C91635f;
import p673r6.C89881d;
import p930bb.C79677a;
import p930bb.C79678b;
import p930bb.C79679c;
import p930bb.C79680d;
import p958eb.C86474e;

/* renamed from: ab.e */
public class C79480e {

    /* renamed from: a */
    public static final C79480e f233041a = new C79480e();

    /* renamed from: ab.e$b */
    public static class C79482b implements C79680d.C79682b, C79680d.C79683c, C79680d.C79684d {

        /* renamed from: a */
        public final WeakReference<AppBrandRuntime> f233042a;

        public C79482b(AppBrandRuntime appBrandRuntime, C79481a aVar) {
            this.f233042a = new WeakReference<>(appBrandRuntime);
        }

        /* renamed from: a */
        public String mo109477a() {
            return this.f233042a.get() != null ? this.f233042a.get().f238147j : "";
        }
    }

    /* renamed from: ab.e$c */
    public static final class C79483c implements C89881d {
        public C79483c(int i) {
        }
    }

    /* renamed from: a */
    public void mo109476a(MBRuntime mBRuntime, AppBrandRuntime appBrandRuntime, boolean z) {
        Log.m105924i("MicroMsg.MBImageHandlerRegistry", "dl: MBImageHandlerRegistry register ");
        new WeakReference((!z || appBrandRuntime == null || !(appBrandRuntime.mo113047b0() instanceof C91635f)) ? null : (C86474e) ((C91635f) appBrandRuntime.mo113047b0()).mo125517G0(C86474e.class));
        BaseImageDecodeService baseImageDecodeService = mBRuntime.f235055d;
        C79482b bVar = new C79482b(appBrandRuntime, (C79481a) null);
        baseImageDecodeService.addImageStreamFetcher(new C79677a(bVar), true);
        baseImageDecodeService.addImageStreamFetcher(new C79678b(bVar), false);
        baseImageDecodeService.addImageStreamFetcher(new C79679c(bVar), false);
        baseImageDecodeService.setKvReportDelegate(new C79483c(14883));
        C90639a aVar = new C90639a();
        aVar.f256771a = 8192;
        aVar.f256772b = 8192;
        baseImageDecodeService.setBitmapDecodeSlave(aVar);
    }
}
