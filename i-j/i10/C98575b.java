package i10;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.sns.SnsDataSource$getImageFile$2", mo125469f = "SnsDataSource.kt", mo125470l = {226}, mo125471m = "invokeSuspend")
/* renamed from: i10.b */
public final class C98575b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public Object f289025d;

    /* renamed from: e */
    public Object f289026e;

    /* renamed from: f */
    public Object f289027f;

    /* renamed from: g */
    public int f289028g;

    /* renamed from: h */
    public final /* synthetic */ String f289029h;

    /* renamed from: i */
    public final /* synthetic */ String f289030i;

    /* renamed from: j */
    public final /* synthetic */ String f289031j;

    /* renamed from: n */
    public final /* synthetic */ boolean f289032n;

    /* renamed from: i10.b$a */
    public static final class C98576a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C94853e f289033d;

        /* renamed from: e */
        public final /* synthetic */ C98577b f289034e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98576a(C94853e eVar, C98577b bVar) {
            super(1);
            this.f289033d = eVar;
            this.f289034e = bVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f289033d.mo130997v(this.f289034e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i10.b$b */
    public static final class C98577b implements C94853e.C94861h {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f289035d;

        /* renamed from: e */
        public final /* synthetic */ String f289036e;

        /* renamed from: f */
        public final /* synthetic */ C94853e f289037f;

        /* renamed from: g */
        public final /* synthetic */ C53916l<String> f289038g;

        public C98577b(C101804kv2 kv22, String str, C94853e eVar, C53916l<? super String> lVar) {
            this.f289035d = kv22;
            this.f289036e = str;
            this.f289037f = eVar;
            this.f289038g = lVar;
        }

        public void onImageFinish(String str, boolean z) {
            Log.m105924i("MicroMsg.SnsDataSource", "onImageFinish: mediaId=" + str + ", isOk=" + z);
            if (C87412m.m108589b(str, this.f289035d.f298689d)) {
                this.f289037f.mo130997v(this);
                C53916l<String> lVar = this.f289038g;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(this.f289036e));
            }
        }

        public void onSetbg() {
        }

        public void onSightFinish(String str, boolean z) {
            Log.m105924i("MicroMsg.SnsDataSource", "onSightFinish: " + str);
        }

        public void onThumbFinish(String str) {
            C87412m.m108594g(str, "mediaId");
            Log.m105924i("MicroMsg.SnsDataSource", "onThumbFinish:" + str);
            if (C87412m.m108589b(str, this.f289035d.f298689d)) {
                Log.m105924i("MicroMsg.SnsDataSource", "onThumbFinish: " + this.f289036e);
                this.f289037f.mo130997v(this);
                C53916l<String> lVar = this.f289038g;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(this.f289036e));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98575b(String str, String str2, String str3, boolean z, C15601d<? super C98575b> dVar) {
        super(2, dVar);
        this.f289029h = str;
        this.f289030i = str2;
        this.f289031j = str3;
        this.f289032n = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C98575b(this.f289029h, this.f289030i, this.f289031j, this.f289032n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C98575b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C101804kv2 kv22;
        int i;
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        T t;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i2 = this.f289028g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.SnsDataSource", "getImageFile(" + this.f289029h + ", " + this.f289030i + ", " + this.f289031j + "), requestThumb:" + this.f289032n);
            SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f289029h);
            if (DN == null) {
                Log.m105920e("MicroMsg.SnsDataSource", "Couldn't find SnsInfo, localId=" + this.f289029h);
                return null;
            }
            TimeLineObject timeLine = DN.getTimeLine();
            if (timeLine == null || (j002 = timeLine.ContentObj) == null || (linkedList = j002.f298427h) == null) {
                kv22 = null;
            } else {
                String str = this.f289031j;
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C101804kv2) t).f298689d, str)) {
                        break;
                    }
                }
                kv22 = (C101804kv2) t;
            }
            if (kv22 == null) {
                Log.m105920e("MicroMsg.SnsDataSource", "Couldn't find media, localId=" + this.f289029h + ", mediaId=" + this.f289031j);
                return null;
            }
            String i3 = C86013q1.m106448i(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + (this.f289032n ? C102236a0.m134729X(kv22) : C102236a0.m134717L(kv22)), false);
            if (!C86013q1.m106450k(i3) || !C102236a0.m134740e(C102236a0.m134760o(i3))) {
                C102268v vVar = new C102268v(kv22);
                if (this.f289032n) {
                    vVar.mo141832d(1);
                    i = kv22.f298690e == 6 ? 5 : 1;
                } else {
                    vVar.mo141832d(3);
                    i = 2;
                }
                vVar.mo141833e(kv22.f298689d);
                C94853e Vx0 = C94866e1.Vx0();
                Log.m105924i("MicroMsg.SnsDataSource", "start downloading mediaId=" + kv22.f298689d + ", snsId=" + this.f289030i);
                Vx0.mo130979d(kv22, i, vVar, C96983o3.f284135g);
                this.f289025d = kv22;
                this.f289026e = i3;
                this.f289027f = Vx0;
                this.f289028g = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                C98577b bVar = new C98577b(kv22, i3, Vx0, mVar);
                Vx0.mo130978c(bVar);
                mVar.mo74599v(new C98576a(Vx0, bVar));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                Log.m105924i("MicroMsg.SnsDataSource", "photo has already been downloaded: " + i3);
                return i3;
            }
        } else if (i2 == 1) {
            C94853e eVar = (C94853e) this.f289027f;
            String str2 = (String) this.f289026e;
            C101804kv2 kv23 = (C101804kv2) this.f289025d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
