package il1;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fi1.C59098d;
import fy3.C32227p;
import gy3.C8480h;
import java.util.Set;
import kotlin.ResultKt;
import org.libpag.PAGFile;
import pl1.C11977d0;
import rx3.C13598b0;
import te3.C50767p11;
import te3.C51765w03;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansModifyGiftWidget$playGift$1$1", mo125469f = "FinderLiveFansModifyGiftWidget.kt", mo125470l = {374}, mo125471m = "invokeSuspend")
/* renamed from: il1.n3 */
public final class C9073n3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f28628d;

    /* renamed from: e */
    public int f28629e;

    /* renamed from: f */
    public final /* synthetic */ C9048l3 f28630f;

    /* renamed from: g */
    public final /* synthetic */ C50767p11 f28631g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9073n3(C9048l3 l3Var, C50767p11 p112, C15601d<? super C9073n3> dVar) {
        super(2, dVar);
        this.f28630f = l3Var;
        this.f28631g = p112;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9073n3(this.f28630f, this.f28631g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9073n3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f28629e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("Finder.FinderLiveFansModifyGiftWidget", "startjob");
            C9048l3 l3Var = this.f28630f;
            C50767p11 p112 = this.f28631g;
            Set<Integer> set = C9048l3.f28561G;
            l3Var.getClass();
            C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
            String str2 = p112.f139511h;
            String str3 = str2 == null ? "" : str2;
            String str4 = p112.f139507d;
            String str5 = str4 == null ? "" : str4;
            String str6 = p112.f139515o;
            String MT = p1Var.mo76670MT(new C11977d0(str3, str5, str6 == null ? "" : str6, false, false, (C51765w03) null, 48, (C8480h) null));
            C59098d dVar = C59098d.f169061a;
            String str7 = this.f28631g.f139511h;
            if (str7 == null) {
                str7 = "";
            }
            this.f28628d = MT;
            this.f28629e = 1;
            obj2 = dVar.mo84292a(str7, MT, this);
            if (obj2 == aVar) {
                return aVar;
            }
            str = MT;
        } else if (i == 1) {
            str = (String) this.f28628d;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C59098d.C59099a aVar2 = (C59098d.C59099a) obj2;
        Log.m105924i("Finder.FinderLiveFansModifyGiftWidget", "loadpag result:" + aVar2);
        if (aVar2 instanceof C59098d.C59099a.C59101b) {
            this.f28630f.f28573j.setScaleMode(1);
            this.f28630f.f28573j.setComposition(PAGFile.Load(str));
            this.f28630f.f28573j.setRepeatCount(-1);
            this.f28630f.f28573j.play();
            C9048l3.m8795c(this.f28630f);
            this.f28630f.f28573j.setVisibility(0);
            Log.m105924i("Finder.FinderLiveFansModifyGiftWidget", "playpag visibility:" + this.f28630f.f28573j.getVisibility() + " path:" + str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("load pag error, errCode:");
            Integer num = null;
            C59098d.C59099a.C59100a aVar3 = aVar2 instanceof C59098d.C59099a.C59100a ? (C59098d.C59099a.C59100a) aVar2 : null;
            if (aVar3 != null) {
                num = new Integer(aVar3.f169062a);
            }
            sb.append(num);
            Log.m105920e("Finder.FinderLiveFansModifyGiftWidget", sb.toString());
        }
        return C13598b0.f38549a;
    }
}
