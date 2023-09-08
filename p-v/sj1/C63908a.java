package sj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import f14.C58901s;
import fi1.C59098d;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import rx3.C13598b0;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.view.convert.PromoteBannerNormalConvert$onBindViewHolder$1", mo125469f = "PromoteBannerNormalConvert.kt", mo125470l = {154, 160, 166}, mo125471m = "invokeSuspend")
/* renamed from: sj1.a */
public final class C63908a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f181147d;

    /* renamed from: e */
    public int f181148e;

    /* renamed from: f */
    public final /* synthetic */ String f181149f;

    /* renamed from: g */
    public final /* synthetic */ PAGView f181150g;

    /* renamed from: h */
    public final /* synthetic */ MMRoundCornerImageView f181151h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.view.convert.PromoteBannerNormalConvert$onBindViewHolder$1$1", mo125469f = "PromoteBannerNormalConvert.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sj1.a$a */
    public static final class C63909a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ PAGView f181152d;

        /* renamed from: e */
        public final /* synthetic */ MMRoundCornerImageView f181153e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63909a(PAGView pAGView, MMRoundCornerImageView mMRoundCornerImageView, C15601d<? super C63909a> dVar) {
            super(2, dVar);
            this.f181152d = pAGView;
            this.f181153e = mMRoundCornerImageView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63909a(this.f181152d, this.f181153e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63909a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f181152d.play();
            this.f181152d.setVisibility(0);
            this.f181153e.setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.view.convert.PromoteBannerNormalConvert$onBindViewHolder$1$2", mo125469f = "PromoteBannerNormalConvert.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sj1.a$b */
    public static final class C63910b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MMRoundCornerImageView f181154d;

        /* renamed from: e */
        public final /* synthetic */ PAGView f181155e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63910b(MMRoundCornerImageView mMRoundCornerImageView, PAGView pAGView, C15601d<? super C63910b> dVar) {
            super(2, dVar);
            this.f181154d = mMRoundCornerImageView;
            this.f181155e = pAGView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63910b(this.f181154d, this.f181155e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63910b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f181154d.setVisibility(0);
            this.f181155e.setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63908a(String str, PAGView pAGView, MMRoundCornerImageView mMRoundCornerImageView, C15601d<? super C63908a> dVar) {
        super(2, dVar);
        this.f181149f = str;
        this.f181150g = pAGView;
        this.f181151h = mMRoundCornerImageView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63908a(this.f181149f, this.f181150g, this.f181151h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63908a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181148e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String mD5String = MD5Util.getMD5String(this.f181149f);
            C87412m.m108593f(mD5String, "getMD5String(bgUrl)");
            str = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76726wa("banner_pag_dir", mD5String);
            C59098d dVar = C59098d.f169061a;
            String str2 = this.f181149f;
            this.f181147d = str;
            this.f181148e = 1;
            obj = dVar.mo84292a(str2, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            str = (String) this.f181147d;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2 || i == 3) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((C59098d.C59099a) obj) instanceof C59098d.C59099a.C59101b) {
            this.f181150g.stop();
            this.f181150g.setComposition(PAGFile.Load(str));
            this.f181150g.flush();
            this.f181150g.setRepeatCount(-1);
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C63909a aVar2 = new C63909a(this.f181150g, this.f181151h, (C15601d<? super C63909a>) null);
            this.f181147d = null;
            this.f181148e = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            C53896h0 h0Var2 = C53872d1.f151117a;
            C53915k2 k2Var2 = C58901s.f168555a;
            C63910b bVar = new C63910b(this.f181151h, this.f181150g, (C15601d<? super C63910b>) null);
            this.f181147d = null;
            this.f181148e = 3;
            if (C53895h.m60469g(k2Var2, bVar, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
