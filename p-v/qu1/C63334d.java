package qu1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import hd0.C98408n0;
import kotlin.ResultKt;
import l10.C46830i;
import p1081gi.C98127h;
import p682rz.C101487r;
import rx3.C13598b0;
import te3.C101804kv2;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qu1.d */
public final class C63334d implements C63333c {

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.thumbplayer.player.cdn.SnsCdnTaskFactory$parse$2", mo125469f = "SnsCdnTaskFactory.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qu1.d$a */
    public static final class C63335a extends C91594j implements C32227p<C0000n0, C15601d<? super C98127h>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63334d f179702d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f179703e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63335a(C63334d dVar, byte[] bArr, C15601d<? super C63335a> dVar2) {
            super(2, dVar2);
            this.f179702d = dVar;
            this.f179703e = bArr;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63335a(this.f179702d, this.f179703e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63335a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            try {
                C46830i iVar = new C46830i();
                iVar.parseFrom(this.f179703e);
                String str = iVar.f125966i;
                SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
                C87412m.m108591d(DN);
                C101804kv2 first = DN.getTimeLine().ContentObj.f298427h.getFirst();
                boolean v = C86013q1.m106461v(C94867e2.m120293l(first.f298689d));
                String n = C94867e2.m120295n(first);
                C98408n0 i = C94867e2.m120290i(str, first.f298689d);
                if (i == null) {
                    C94867e2.m120299r(str, first.f298689d, 30);
                } else {
                    C94867e2.m120303v(i, first.f298689d, 30);
                }
                this.f179702d.getClass();
                Object[] objArr = new Object[2];
                boolean z = false;
                objArr[0] = n;
                if (v) {
                    z = true;
                }
                objArr[1] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.SnsCdnTaskFactory", "prepare stream download sns video %s mkDir %b", objArr);
                C96983o3 b = C96983o3.m124650b();
                b.f284145b = DN.getCreateTime();
                return ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126987k(b, first.f298692g, n, C94867e2.m120284c(str), 1, false, first.f298689d, first.f298671D, first.f298672E, first.f298687U);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public Object mo88234a(byte[] bArr, C15601d<? super C98127h> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C63335a(this, bArr, (C15601d<? super C63335a>) null), dVar);
    }
}
