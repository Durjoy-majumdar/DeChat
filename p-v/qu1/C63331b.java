package qu1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import c03.C54600b;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import d03.C58010a;
import di3.C86312j;
import fy3.C32227p;
import ht1.C60200t1;
import java.util.LinkedList;
import kotlin.ResultKt;
import l10.C61183b;
import p1081gi.C98127h;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qu1.b */
public final class C63331b implements C63333c {

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.thumbplayer.player.cdn.FinderCdnTaskFactory$parse$2", mo125469f = "FinderCdnTaskFactory.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qu1.b$a */
    public static final class C63332a extends C91594j implements C32227p<C0000n0, C15601d<? super C98127h>, Object> {

        /* renamed from: d */
        public final /* synthetic */ byte[] f179700d;

        /* renamed from: e */
        public final /* synthetic */ C63331b f179701e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63332a(byte[] bArr, C63331b bVar, C15601d<? super C63332a> dVar) {
            super(2, dVar);
            this.f179700d = bArr;
            this.f179701e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63332a(this.f179700d, this.f179701e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63332a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            C58010a uQ;
            Class cls = C60200t1.class;
            ResultKt.throwOnFailure(obj);
            try {
                C61183b bVar = new C61183b();
                bVar.parseFrom(this.f179700d);
                B b = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83798w4(bVar.f174166e, bVar.f174167f, 2).f38556e;
                FinderObject finderObject = b instanceof FinderObject ? (FinderObject) b : null;
                if (finderObject == null) {
                    return null;
                }
                C63331b bVar2 = this.f179701e;
                FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                if (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || (uQ = ((C60200t1) C86312j.m106911c(cls)).mo76884uQ(finderMedia, finderObject.f164794id, true)) == null) {
                    return null;
                }
                C54600b bVar3 = C54600b.f153106a;
                String str = uQ.f165947s;
                if (str == null) {
                    str = "";
                }
                String str2 = uQ.f165949u;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = uQ.f165948t;
                if (str3 == null) {
                    str3 = "";
                }
                int i = uQ.f165929a;
                String str4 = uQ.f165930b;
                if (str4 == null) {
                    str4 = "xV2";
                }
                String str5 = uQ.f165931c;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = uQ.f165932d;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = uQ.f165946r;
                String str8 = str7 == null ? "" : str7;
                bVar2.getClass();
                return bVar3.mo75507b(str, str2, str3, i, str4, str5, str6, str8, (C98127h.C98128a) null, "MicroMsg.FinderCdnTaskFactory");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public Object mo88234a(byte[] bArr, C15601d<? super C98127h> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C63332a(bArr, this, (C15601d<? super C63332a>) null), dVar);
    }
}
