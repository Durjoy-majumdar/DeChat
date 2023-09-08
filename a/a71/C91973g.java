package a71;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sticker.loader.StickerLoadInfo;
import gy3.C87412m;
import p008bq.C92282j0;
import qo3.C77426q;
import qo3.C89779i0;
import sh3.C101624e;
import sh3.C101630j;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import v61.C37682c;

/* renamed from: a71.g */
public final class C91973g {

    /* renamed from: a */
    public final Context f263313a;

    /* renamed from: b */
    public final String f263314b;

    /* renamed from: c */
    public final C92282j0.C92283a f263315c;

    /* renamed from: d */
    public final String f263316d = "MicroMsg.CheckStickerDownload";

    /* renamed from: e */
    public boolean f263317e;

    /* renamed from: f */
    public final C89779i0 f263318f;

    /* renamed from: g */
    public final C91974a f263319g;

    /* renamed from: a71.g$a */
    public static final class C91974a implements C65231j<C101630j> {

        /* renamed from: a */
        public final /* synthetic */ C91973g f263320a;

        public C91974a(C91973g gVar) {
            this.f263320a = gVar;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C101630j jVar = (C101630j) dVar;
            C87412m.m108594g(jVar, "task");
            C87412m.m108594g(nVar, "status");
            if (C87412m.m108589b(jVar.f297495f.f284105i, this.f263320a.f263314b)) {
                String str = this.f263320a.f263316d;
                Log.m105924i(str, "onLoaderFin: " + nVar + ' ' + this.f263320a.f263317e);
                C91973g gVar = this.f263320a;
                if (!gVar.f263317e) {
                    if (nVar == C65234n.OK) {
                        gVar.f263315c.mo126268a(false);
                        gVar.f263318f.dismiss();
                        C37682c.m41478a(gVar.f263313a);
                        C101624e.f297484a.mo141089f(gVar.f263319g);
                        return;
                    }
                    C77426q qVar = new C77426q(gVar.f263313a);
                    int i = jVar.f297495f.f284106j;
                    if (i == 1 || i == 2) {
                        qVar.mo107595g(this.f263320a.f263313a.getResources().getString(C0966R.string.jmy));
                        qVar.mo107601m(C0966R.string.a2k);
                        qVar.mo107598j(this.f263320a.f263313a.getString(C0966R.string.f7926wf));
                        qVar.mo107600l(new C91969c(this.f263320a));
                        qVar.mo107597i(new C91970d(this.f263320a));
                    } else if (i == 4) {
                        qVar.mo107595g(this.f263320a.f263313a.getResources().getString(C0966R.string.f361405jn0));
                        qVar.mo107601m(C0966R.string.a18);
                        qVar.mo107600l(new C91971e(this.f263320a));
                    } else if (i == 5) {
                        qVar.mo107595g(this.f263320a.f263313a.getResources().getString(C0966R.string.jmz));
                        qVar.mo107601m(C0966R.string.a18);
                        qVar.mo107600l(new C91972f(this.f263320a));
                    }
                    qVar.mo107603o();
                }
            }
        }
    }

    /* renamed from: a71.g$b */
    public static final class C91975b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C91973g f263321d;

        public C91975b(C91973g gVar) {
            this.f263321d = gVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Log.m105924i(this.f263321d.f263316d, "startStickerPreview: cancel loading");
            C91973g gVar = this.f263321d;
            gVar.f263317e = true;
            gVar.mo125820a(false);
        }
    }

    public C91973g(Context context, String str, C92282j0.C92283a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(aVar, "onResult");
        this.f263313a = context;
        this.f263314b = str;
        this.f263315c = aVar;
        String string = context.getResources().getString(C0966R.string.f7955xd);
        C87412m.m108593f(string, "context.resources.getStr…R.string.app_downloading)");
        this.f263318f = C89779i0.m112248e(context, string, true, 0, new C91975b(this));
        C91974a aVar2 = new C91974a(this);
        this.f263319g = aVar2;
        C101624e eVar = C101624e.f297484a;
        eVar.mo141088e(aVar2);
        StickerLoadInfo stickerLoadInfo = new StickerLoadInfo(1);
        stickerLoadInfo.f284105i = str;
        eVar.mo141087d(stickerLoadInfo);
    }

    /* renamed from: a */
    public final void mo125820a(boolean z) {
        this.f263318f.dismiss();
        C101624e.f297484a.mo141089f(this.f263319g);
        this.f263315c.mo126268a(z);
    }
}
