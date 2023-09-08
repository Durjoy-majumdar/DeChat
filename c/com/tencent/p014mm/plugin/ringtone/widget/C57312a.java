package com.tencent.p014mm.plugin.ringtone.widget;

import a14.C0000n0;
import android.content.Context;
import android.content.DialogInterface;
import ck2.C54881c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75592q0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import nj2.C61759g;
import nj2.C61768p;
import nj3.C76912y0;
import org.json.JSONObject;
import qo3.C101218e0;
import qo3.C89779i0;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import xj2.C66286a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$onClickSetting$1$1", mo125469f = "RingtoneHalfBottomDialog.kt", mo125470l = {86}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.ringtone.widget.a */
public final class C57312a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f164164d;

    /* renamed from: e */
    public int f164165e;

    /* renamed from: f */
    public boolean f164166f;

    /* renamed from: g */
    public Object f164167g;

    /* renamed from: h */
    public int f164168h;

    /* renamed from: i */
    public final /* synthetic */ String f164169i;

    /* renamed from: j */
    public final /* synthetic */ Context f164170j;

    /* renamed from: n */
    public final /* synthetic */ C66132f f164171n;

    /* renamed from: o */
    public final /* synthetic */ boolean f164172o;

    /* renamed from: p */
    public final /* synthetic */ C101218e0 f164173p;

    /* renamed from: q */
    public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f164174q;

    /* renamed from: r */
    public final /* synthetic */ long f164175r;

    /* renamed from: s */
    public final /* synthetic */ int f164176s;

    /* renamed from: t */
    public final /* synthetic */ C54881c0 f164177t;

    /* renamed from: u */
    public final /* synthetic */ String f164178u;

    /* renamed from: v */
    public final /* synthetic */ boolean f164179v;

    /* renamed from: w */
    public final /* synthetic */ int f164180w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57312a(String str, Context context, C66132f fVar, boolean z, C101218e0 e0Var, C32227p<? super Boolean, ? super Integer, C13598b0> pVar, long j, int i, C54881c0 c0Var, String str2, boolean z2, int i2, C15601d<? super C57312a> dVar) {
        super(2, dVar);
        this.f164169i = str;
        this.f164170j = context;
        this.f164171n = fVar;
        this.f164172o = z;
        this.f164173p = e0Var;
        this.f164174q = pVar;
        this.f164175r = j;
        this.f164176s = i;
        this.f164177t = c0Var;
        this.f164178u = str2;
        this.f164179v = z2;
        this.f164180w = i2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C57312a(this.f164169i, this.f164170j, this.f164171n, this.f164172o, this.f164173p, this.f164174q, this.f164175r, this.f164176s, this.f164177t, this.f164178u, this.f164179v, this.f164180w, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57312a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        C89779i0 i0Var;
        int i2;
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i3 = this.f164168h;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int i4 = C87412m.m108589b(this.f164169i, C75592q0.m90789s()) ? 1 : 2;
            boolean b = C87412m.m108589b(this.f164169i, C75592q0.m90789s());
            i = C61768p.m72481i(this.f164169i) != null ? 1 : 0;
            Context context = this.f164170j;
            C89779i0 e = C89779i0.m112248e(context, context.getResources().getString(C0966R.string.in7), false, 3, (DialogInterface.OnCancelListener) null);
            e.show();
            JSONObject jSONObject = new JSONObject();
            int i5 = this.f164176s;
            long j = this.f164175r;
            int i6 = this.f164180w;
            String str = this.f164178u;
            boolean z2 = this.f164179v;
            jSONObject.put("type", i == 0 ? 1 : 2);
            jSONObject.put("channel", i5);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, j);
            jSONObject.put("choose_scene", i6);
            jSONObject.put("rec_request_id", str);
            jSONObject.put("is_video_stream", z2 ? 2 : 1);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            C61759g.C61760a aVar2 = C61759g.f175551f;
            C66132f fVar = this.f164171n;
            String str2 = this.f164169i;
            boolean z3 = i4 == 1 ? this.f164172o : false;
            this.f164167g = e;
            this.f164164d = i4;
            this.f164166f = b;
            this.f164165e = i;
            this.f164168h = 1;
            obj2 = aVar2.mo86682f(fVar, str2, z3, n, this);
            if (obj2 == aVar) {
                return aVar;
            }
            i2 = i4;
            z = b;
            i0Var = e;
        } else if (i3 == 1) {
            int i7 = this.f164165e;
            boolean z4 = this.f164166f;
            i2 = this.f164164d;
            i0Var = (C89779i0) this.f164167g;
            ResultKt.throwOnFailure(obj);
            i = i7;
            z = z4;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj2).booleanValue()) {
            this.f164173p.mo140680z();
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C76912y0.m92768g(MMApplicationContext.getContext(), this.f164170j.getResources().getString((i2 != 1 || !this.f164172o) ? C0966R.string.i59 : C0966R.string.f361207m70));
            C32227p<Boolean, Integer, C13598b0> pVar = this.f164174q;
            if (pVar != null) {
                pVar.invoke(Boolean.TRUE, new Integer(i2));
            }
        } else {
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C76912y0.m92767f(MMApplicationContext.getContext(), this.f164170j.getResources().getString(C0966R.string.inu));
            C32227p<Boolean, Integer, C13598b0> pVar2 = this.f164174q;
            if (pVar2 != null) {
                pVar2.invoke(Boolean.FALSE, new Integer(i2));
            }
        }
        String d = this.f164171n.mo90173d();
        long c = this.f164171n.mo90172c();
        long j2 = this.f164175r;
        int i8 = this.f164176s;
        String str3 = this.f164169i;
        boolean z5 = this.f164172o;
        boolean z6 = i != 0;
        C54881c0 c0Var = this.f164177t;
        C66286a.m78217d(d, c, j2, 2, i8, str3, z, z5, str3, z6, c0Var != null ? c0Var.f153830b.f179987s : false, this.f164178u, this.f164179v);
        return C13598b0.f38549a;
    }
}
