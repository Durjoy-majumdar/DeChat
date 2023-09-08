package qg3;

import android.app.Application;
import com.tencent.p014mm.app.C0987b0;
import com.tencent.p014mm.ipcinvoker.C80910p;
import com.tencent.p014mm.ipcinvoker.extension.C28949d;
import com.tencent.p014mm.ipcinvoker.extension.C80892b;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import com.tencent.p014mm.ipcinvoker.extension.C80897g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C80931e;
import com.tencent.p014mm.ipcinvoker.wx_extension.C80933n;
import com.tencent.p014mm.ipcinvoker.wx_extension.C80934o;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.Appbrand0IPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.Appbrand1IPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.Appbrand2IPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.Appbrand3IPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.Appbrand4IPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.ExdeviceIPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.PushProcessIPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.SupportProcessIPCService;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import o20.C89107a;
import o20.C89109c;
import o20.C89110d;
import o20.C89111e;
import v20.C90741c;

/* renamed from: qg3.g */
public class C89652g implements C80910p.C80914d {

    /* renamed from: a */
    public final /* synthetic */ Application f257882a;

    /* renamed from: qg3.g$a */
    public class C89653a extends C89107a {
        public C89653a(C89652g gVar) {
        }

        /* renamed from: a */
        public void mo123982a(C89111e eVar) {
            C28949d dVar = new C28949d();
            C80910p.C80912b bVar = (C80910p.C80912b) eVar;
            bVar.getClass();
            C80893c.m98760a(dVar);
            C80893c.m98760a(new C80892b());
            C80893c.m98760a(new C80897g());
            MultiProcessMMKV.init();
            C80933n nVar = new C80933n();
            bVar.getClass();
            C80893c.m98760a(nVar);
            C80893c.m98760a(new C80931e());
            C80893c.m98760a(new C80934o());
        }

        /* renamed from: b */
        public void mo123983b(C89110d dVar) {
            C80910p.C80911a aVar = (C80910p.C80911a) dVar;
            aVar.mo112706a(MainProcessIPCService.f108404e, MainProcessIPCService.class);
            aVar.mo112706a(ToolsProcessIPCService.f108406e, ToolsProcessIPCService.class);
            aVar.mo112706a(SupportProcessIPCService.f237796e, SupportProcessIPCService.class);
            aVar.mo112706a(Appbrand0IPCService.f237787e, Appbrand0IPCService.class);
            aVar.mo112706a(Appbrand1IPCService.f237788e, Appbrand1IPCService.class);
            aVar.mo112706a(Appbrand2IPCService.f237789e, Appbrand2IPCService.class);
            aVar.mo112706a(Appbrand3IPCService.f237790e, Appbrand3IPCService.class);
            aVar.mo112706a(Appbrand4IPCService.f237791e, Appbrand4IPCService.class);
            aVar.mo112706a(PushProcessIPCService.f108405e, PushProcessIPCService.class);
            aVar.mo112706a(ExdeviceIPCService.f108403e, ExdeviceIPCService.class);
        }

        /* renamed from: c */
        public void mo123984c(C89110d dVar) {
            C0987b0 b0Var = C0987b0.INSTANCE;
            ((C80910p.C80911a) dVar).getClass();
            C90741c.f260625a = b0Var;
        }
    }

    public C89652g(C89655j jVar, Application application) {
        this.f257882a = application;
    }

    /* renamed from: a */
    public Application mo123980a() {
        return this.f257882a;
    }

    /* renamed from: b */
    public C89109c mo123981b() {
        return new C89653a(this);
    }
}
