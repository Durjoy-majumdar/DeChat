package kl1;

import android.content.Context;
import cj1.C0581o5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import o40.C11348f;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64175a0;

/* renamed from: kl1.t */
public final class C10344t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10333o f31508d;

    /* renamed from: e */
    public final /* synthetic */ List<C0581o5> f31509e;

    /* renamed from: f */
    public final /* synthetic */ boolean f31510f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10344t(C10333o oVar, List<C0581o5> list, boolean z) {
        super(0);
        this.f31508d = oVar;
        this.f31509e = list;
        this.f31510f = z;
    }

    public Object invoke() {
        C10333o oVar = this.f31508d;
        List<C0581o5> list = this.f31509e;
        oVar.getClass();
        if (list.size() > 0) {
            Log.m105924i("Finder.LiveCommentPlugin_BulletNew", "before merge local size:" + oVar.f31495l.size() + ",remote size:" + list.size() + ",max length:" + oVar.f31486c);
            oVar.f31495l.addAll(list);
            oVar.mo10635g("ken-after merge", oVar.f31495l);
            ArrayList<C0581o5> arrayList = new ArrayList<>(C110818d0.m150943o0(oVar.f31495l, new C10340p(oVar)));
            oVar.f31495l = arrayList;
            oVar.mo10635g("ken-after sorted", arrayList);
            if (oVar.f31486c > 0) {
                while (oVar.f31495l.size() > oVar.f31486c) {
                    C0581o5 o5Var = (C0581o5) C64175a0.m75516x(oVar.f31495l);
                    if (o5Var != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("drop msg:");
                        sb.append(o5Var.mo573g() + XVFSFile.PATH_SEPARATOR_CHAR + o5Var.getContent());
                        Log.m105924i("Finder.LiveCommentPlugin_BulletNew", sb.toString());
                    }
                }
            }
        }
        C61926c.m72700y(this.f31509e, C10343s.f31507d);
        boolean z = true;
        if (this.f31510f) {
            C10333o oVar2 = this.f31508d;
            if (!oVar2.f31494k) {
                C61926c.m72668M(new C10342r(oVar2, true, 1));
                return C13598b0.f38549a;
            }
        }
        long currentTimeMillis = this.f31508d.mo10630b().f31413f != 0 ? System.currentTimeMillis() - this.f31508d.mo10630b().f31413f : 0;
        if (currentTimeMillis > 8000 && this.f31508d.f31495l.size() > 0) {
            C10333o oVar3 = this.f31508d;
            oVar3.mo10630b().f31413f = 0;
            oVar3.mo10634f(5);
            C11348f.C11349a.m11178b(C59319a.f169618b, "bulletAnimSliceTooMuchTime", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            C62042e eVar = C62042e.f176370a;
            Context context = this.f31508d.f31484a.getContext();
            C87412m.m108593f(context, "bullet.context");
            eVar.mo87041S1(context, "DEBUG 进场消息状态错误!");
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("updateBulletComment setVisible:");
        sb4.append(this.f31510f);
        sb4.append(",bullet:");
        sb4.append(this.f31508d.f31484a.hashCode());
        sb4.append(",bulletInvisible:");
        if (this.f31508d.f31484a.getVisibility() == 0) {
            z = false;
        }
        sb4.append(z);
        sb4.append(",animationHelper:");
        sb4.append(this.f31508d.mo10630b().hashCode());
        sb4.append(",lastAnimPassTime:");
        sb4.append(currentTimeMillis);
        sb4.append('!');
        Log.m105924i("Finder.LiveCommentPlugin_BulletNew", sb4.toString());
        return C13598b0.f38549a;
    }
}
