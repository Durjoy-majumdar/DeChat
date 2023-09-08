package u42;

import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import e42.C7596h;
import gy3.C87412m;
import kotlin.Metadata;
import nd3.C47223a;
import p237sp.C13749o;
import p237sp.C48456t;
import p749xh.C53352w2;
import s42.C90126a;
import s42.C90130d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lu42/c;", "Ls42/d;", "<init>", "()V", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90126a(name = "installDownloadTask")
/* renamed from: u42.c */
public final class C52446c extends C90130d {

    /* renamed from: u42.c$a */
    public static final class C52447a implements C47223a {

        /* renamed from: a */
        public final /* synthetic */ C52446c f146563a;

        public C52447a(C52446c cVar) {
            this.f146563a = cVar;
        }

        /* renamed from: a */
        public final void mo6947a(boolean z) {
            C52446c cVar = this.f146563a;
            cVar.mo124393a(z ? cVar.mo124396e() : cVar.mo124395d(-1, "install failed"));
        }
    }

    /* renamed from: c */
    public void mo73403c(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(hVar.optLong("downloadId", -1));
        if (nh != null && nh.field_status == 3 && C86013q1.m106450k(nh.field_filePath)) {
            ((C13749o) C86312j.m106911c(C13749o.class)).gt0(nh.field_downloadId, false, new C52447a(this));
        }
    }
}
