package qu1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import c03.C54600b;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import l10.C61187k;
import p1081gi.C98127h;
import p773yy.C66707f;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qu1.e */
public final class C63336e implements C63333c {

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.thumbplayer.player.cdn.TextStatusCdnTaskFactory$parse$2", mo125469f = "TextStatusCdnTaskFactory.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qu1.e$a */
    public static final class C63337a extends C91594j implements C32227p<C0000n0, C15601d<? super C98127h>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63336e f179704d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f179705e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63337a(C63336e eVar, byte[] bArr, C15601d<? super C63337a> dVar) {
            super(2, dVar);
            this.f179704d = eVar;
            this.f179705e = bArr;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63337a(this.f179704d, this.f179705e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63337a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            try {
                C61187k kVar = new C61187k();
                kVar.parseFrom(this.f179705e);
                String mD5String = MD5Util.getMD5String(kVar.f174190n);
                C87412m.m108593f(mD5String, "mediaId");
                String kW = ((C66707f) C86312j.m106911c(C66707f.class)).mo90737kW(mD5String);
                C54600b bVar = C54600b.f153106a;
                String str = kVar.f174190n;
                C87412m.m108593f(str, "textStatus.mediaUrl");
                this.f179704d.getClass();
                return bVar.mo75507b(mD5String, str, kW, 0, "xV2", "", "", "", (C98127h.C98128a) null, "MicroMsg.TextStatusCdnTaskFactory");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public Object mo88234a(byte[] bArr, C15601d<? super C98127h> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C63337a(this, bArr, (C15601d<? super C63337a>) null), dVar);
    }
}
