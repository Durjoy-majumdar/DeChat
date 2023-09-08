package p930bb;

import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.nio.ByteBuffer;
import js0.C9514m;
import p1030s6.C90132b;
import p225rc.C89912a;
import p927ab.C79480e;
import p930bb.C79680d;

/* renamed from: bb.a */
public class C79677a extends C79680d<C79680d.C79682b> {

    /* renamed from: a */
    public final C81415h0 f233587a;

    /* renamed from: b */
    public final String f233588b;

    public C79677a(C79680d.C79682b bVar) {
        super(bVar);
        C79480e.C79482b bVar2 = (C79480e.C79482b) bVar;
        this.f233588b = bVar2.mo109477a();
        this.f233587a = bVar2.f233042a.get() != null ? bVar2.f233042a.get().mo113034V() : null;
    }

    /* renamed from: a */
    public String mo109801a() {
        return "appbrand_file";
    }

    public boolean accept(Object obj) {
        return true;
    }

    /* renamed from: b */
    public C90132b.C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig) {
        C90132b.C90133a aVar = new C90132b.C90133a();
        String str = (String) obj;
        if (this.f233587a == null) {
            Log.m105921e("MicroMsg.AppBrandFileSystemImageStreamFetcher", "fetch %s, appId[%s] fs NULL", str, this.f233588b);
            aVar.f258829b = MMApplicationContext.getContext().getString(C0966R.string.a5t);
            return aVar;
        }
        C9514m mVar = new C9514m();
        C81410b0 readFile = this.f233587a.readFile(str, mVar);
        if (readFile != C81410b0.OK || mVar.f29691a == null) {
            Log.m105921e("MicroMsg.AppBrandFileSystemImageStreamFetcher", "fetch %s, ret %s, appId[%s]", str, readFile.name(), this.f233588b);
            aVar.f258829b = String.format(MMApplicationContext.getContext().getString(C0966R.string.a5s), new Object[]{readFile.name()});
        } else {
            aVar.f258828a = new C89912a((ByteBuffer) mVar.f29691a);
        }
        return aVar;
    }
}
