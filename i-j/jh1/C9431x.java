package jh1;

import a14.C0000n0;
import android.view.View;
import android.widget.TextView;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C55006x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51452tv0;
import te3.C52172yv;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneVoteWidget$voteRequest$$inlined$success$default$1", mo125469f = "MileStoneVoteWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: jh1.x */
public final class C9431x extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f29438d;

    /* renamed from: e */
    public final /* synthetic */ C9421t f29439e;

    /* renamed from: f */
    public final /* synthetic */ String f29440f;

    /* renamed from: g */
    public final /* synthetic */ C9433z f29441g;

    /* renamed from: h */
    public final /* synthetic */ String f29442h;

    /* renamed from: i */
    public final /* synthetic */ TextView f29443i;

    /* renamed from: j */
    public final /* synthetic */ View f29444j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9431x(C0287e eVar, C15601d dVar, C9421t tVar, String str, C9433z zVar, String str2, TextView textView, View view) {
        super(2, dVar);
        this.f29438d = eVar;
        this.f29439e = tVar;
        this.f29440f = str;
        this.f29441g = zVar;
        this.f29442h = str2;
        this.f29443i = textView;
        this.f29444j = view;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9431x(this.f29438d, dVar, this.f29439e, this.f29440f, this.f29441g, this.f29442h, this.f29443i, this.f29444j);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9431x) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C51452tv0 tv02 = (C51452tv0) ((C0288f) this.f29438d).f855b;
        C52172yv i3 = ((C55006x0) this.f29439e.f29390b.business(C55006x0.class)).mo76056i3(this.f29440f, new Integer(this.f29441g.f29454d.f145527d));
        C52172yv yvVar = this.f29441g.f29454d;
        yvVar.f145529f = 1;
        if (i3 != null) {
            yvVar.f145530g = i3.f145530g;
        } else {
            yvVar.f145530g++;
        }
        Log.m105924i(this.f29439e.f29391c, "vote " + this.f29441g.f29458h + ", " + this.f29441g.f29454d.f145527d + ", voteId:" + this.f29442h + ", succ");
        this.f29439e.mo10141d(this.f29440f, this.f29443i, this.f29444j, this.f29442h, true);
        return C13598b0.f38549a;
    }
}
