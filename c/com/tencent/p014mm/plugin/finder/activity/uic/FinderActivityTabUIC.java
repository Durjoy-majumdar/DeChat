package com.tencent.p014mm.plugin.finder.activity.uic;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import er1.C7808i;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60216z4;
import i31.C117134d;
import java.util.LinkedList;
import jt1.C9517a;
import jt1.C9519c;
import kotlin.ResultKt;
import nd1.C11149a;
import ob0.C89132b;
import od1.C11403f;
import od1.C11405h;
import pd1.C11887a;
import rx3.C13598b0;
import te3.C51130rn1;
import te3.C51270sn1;
import te3.C51722vp0;
import te3.C52271zj0;
import te3.bi4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC */
public class FinderActivityTabUIC extends C11403f<C51270sn1> {

    /* renamed from: v */
    public C51270sn1 f12509v;

    /* renamed from: w */
    public final FinderActivityTabUIC$finderTopicInfoListener$1 f12510w = new FinderActivityTabUIC$finderTopicInfoListener$1(this, C40008f.f107254d);

    /* renamed from: x */
    public boolean f12511x;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$request$1", mo125469f = "FinderActivityTabUIC.kt", mo125470l = {90}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$a */
    public static final class C2310a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f12512d;

        /* renamed from: e */
        public int f12513e;

        /* renamed from: f */
        public /* synthetic */ Object f12514f;

        /* renamed from: g */
        public final /* synthetic */ FinderActivityTabUIC f12515g;

        /* renamed from: h */
        public final /* synthetic */ long f12516h;

        /* renamed from: i */
        public final /* synthetic */ String f12517i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$request$1$1", mo125469f = "FinderActivityTabUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$a$a */
        public static final class C2311a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C89132b.C89134c<C51722vp0> f12518d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f12519e;

            /* renamed from: f */
            public final /* synthetic */ FinderActivityTabUIC f12520f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2311a(C89132b.C89134c<C51722vp0> cVar, C8477a0 a0Var, FinderActivityTabUIC finderActivityTabUIC, C15601d<? super C2311a> dVar) {
                super(2, dVar);
                this.f12518d = cVar;
                this.f12519e = a0Var;
                this.f12520f = finderActivityTabUIC;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C2311a(this.f12518d, this.f12519e, this.f12520f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C2311a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C51722vp0 vp02;
                T t;
                ResultKt.throwOnFailure(obj);
                C89132b.C89134c<C51722vp0> cVar = this.f12518d;
                if (cVar.f256793a == 0 && cVar.f256794b == 0 && (vp02 = (C51722vp0) cVar.f256796d) != null && (t = vp02.f143613d) != null) {
                    FinderActivityTabUIC finderActivityTabUIC = this.f12520f;
                    C8477a0 a0Var = this.f12519e;
                    finderActivityTabUIC.f33558t = t;
                    finderActivityTabUIC.mo321j4(t);
                    a0Var.f27482d = finderActivityTabUIC.mo325p4(t);
                }
                if (!this.f12519e.f27482d) {
                    FinderActivityTabUIC finderActivityTabUIC2 = this.f12520f;
                    C89132b.C89134c<C51722vp0> cVar2 = this.f12518d;
                    finderActivityTabUIC2.mo11415h4(cVar2.f256794b, cVar2.f256795c);
                }
                FinderActivityTabUIC finderActivityTabUIC3 = this.f12520f;
                int i = this.f12518d.f256794b;
                if (!finderActivityTabUIC3.f12511x) {
                    finderActivityTabUIC3.f12511x = true;
                    int i2 = i == 0 ? 200 : 400;
                    C7808i iVar = C7808i.f26328b;
                    Intent intent = finderActivityTabUIC3.getIntent();
                    iVar.getClass();
                    C87412m.m108594g(intent, "intent");
                    String stringExtra = intent.getStringExtra("async_callback_param");
                    C60216z4.C8821a aVar = null;
                    CALLBACK remove = stringExtra != null ? iVar.f26323a.remove(stringExtra) : null;
                    if (remove instanceof C60216z4.C8821a) {
                        aVar = (C60216z4.C8821a) remove;
                    }
                    if (aVar != null) {
                        aVar.mo6382a(Integer.valueOf(i2));
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$a$b */
        public static final class C2312b extends C87413o implements C32224a<C9519c<String, C51722vp0>> {

            /* renamed from: d */
            public final /* synthetic */ long f12521d;

            /* renamed from: e */
            public final /* synthetic */ String f12522e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2312b(long j, String str) {
                super(0);
                this.f12521d = j;
                this.f12522e = str;
            }

            public Object invoke() {
                return new C11887a(this.f12521d, this.f12522e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2310a(FinderActivityTabUIC finderActivityTabUIC, long j, String str, C15601d<? super C2310a> dVar) {
            super(2, dVar);
            this.f12515g = finderActivityTabUIC;
            this.f12516h = j;
            this.f12517i = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C2310a aVar = new C2310a(this.f12515g, this.f12516h, this.f12517i, dVar);
            aVar.f12514f = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C2310a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C8477a0 a0Var;
            long j;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f12513e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8477a0 a0Var2 = new C8477a0();
                Log.m105924i("FinderActivityTabUIC", "CgiFutureTask");
                long c = C31543z5.m39453c();
                C2312b bVar = new C2312b(this.f12516h, this.f12517i);
                C66212f coroutineContext = ((C0000n0) this.f12514f).getCoroutineContext();
                int i2 = C53973z1.f151221b0;
                C9517a aVar2 = new C9517a(bVar, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null, 4, (C8480h) null);
                this.f12514f = a0Var2;
                this.f12512d = c;
                this.f12513e = 1;
                obj = C117134d.m165173h(aVar2, false, this, 1, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
                a0Var = a0Var2;
                j = c;
            } else if (i == 1) {
                j = this.f12512d;
                a0Var = (C8477a0) this.f12514f;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long c2 = C31543z5.m39453c();
            Log.m105924i("FinderActivityTabUIC", "CgiFutureTask:" + (c2 - j));
            C53895h.m60466d(this.f12515g.getMainScope(), (C66212f) null, (C53934p0) null, new C2311a((C89132b.C89134c) obj, a0Var, this.f12515g, (C15601d<? super C2311a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderActivityTabUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: d4 */
    public int mo2227d4() {
        return C0966R.C0971layout.a8p;
    }

    /* renamed from: f4 */
    public void mo2228f4() {
        getIntent().getStringExtra("key_cover_url");
    }

    /* renamed from: g4 */
    public boolean mo2229g4(int i) {
        return i == -4063 || i == -4058 || i == -4056;
    }

    /* renamed from: m4 */
    public void mo323m4() {
        long longExtra = getIntent().getLongExtra("key_activity_id", 0);
        String stringExtra = getIntent().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = stringExtra;
        if (longExtra == 0) {
            if (str.length() == 0) {
                Log.m105920e("FinderActivityTabUIC", "topicId is zero");
                getContext().finish();
            }
        }
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C2310a(this, longExtra, str, (C15601d<? super C2310a>) null), 3, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12510w.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12510w.dead();
    }

    /* renamed from: p4 */
    public boolean mo325p4(C51270sn1 sn12) {
        C87412m.m108594g(sn12, "topicInfo");
        this.f12509v = sn12;
        getIntent().putExtra("key_has_cover", C11405h.C11406a.m11253a(this));
        C52271zj0 zj02 = sn12.f141633w;
        if (zj02 != null) {
            mo324n4();
            C51130rn1 rn12 = zj02.f146021w;
            if (rn12 != null) {
                LinkedList<bi4> linkedList = rn12.f141044d;
                C87412m.m108593f(linkedList, "list");
                boolean z = !Util.isNullOrNil(getCoverImgUrl());
                for (bi4 bi4 : linkedList) {
                    String str = bi4.f131135d;
                    String str2 = "";
                    C11149a aVar = new C11149a(-1, str == null ? str2 : str, z, 7, 0, 16, (C8480h) null);
                    FinderActivityFragment finderActivityFragment = new FinderActivityFragment();
                    finderActivityFragment.f17334o = bi4.f131136e - 1;
                    String str3 = bi4.f131135d;
                    finderActivityFragment.f12469q = bi4.f131137f;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    finderActivityFragment.f12470r = str2;
                    C13598b0 b0Var = C13598b0.f38549a;
                    FinderTabUIC.m65395f3(this, aVar, finderActivityFragment, false, 4, (Object) null);
                }
                mo80049Y3();
                return true;
            }
        }
        return false;
    }
}
