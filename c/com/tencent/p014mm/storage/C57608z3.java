package com.tencent.p014mm.storage;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import ig3.C60280b;
import ig3.C60283e;
import java.util.ArrayList;
import kotlin.ResultKt;
import p157gk.C59477b;
import p157gk.C59479c;
import p157gk.C59481e;
import p157gk.C59491j;
import p157gk.C59503r;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.storage.ImageQueryStorage$initDBWithData$2", mo125469f = "ImageQueryStorage.kt", mo125470l = {59}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.storage.z3 */
public final class C57608z3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f164927d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<QueryImageData> f164928e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<QueryImageData> f164929f;

    @C91590f(mo125468c = "com.tencent.mm.storage.ImageQueryStorage$initDBWithData$2$2", mo125469f = "ImageQueryStorage.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.storage.z3$a */
    public static final class C57609a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<QueryImageData> f164930d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<QueryImageData> f164931e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57609a(ArrayList<QueryImageData> arrayList, ArrayList<QueryImageData> arrayList2, C15601d<? super C57609a> dVar) {
            super(2, dVar);
            this.f164930d = arrayList;
            this.f164931e = arrayList2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57609a(this.f164930d, this.f164931e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57609a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f164930d.addAll(this.f164931e);
            Log.m105924i("MicroMsg.ImageQueryStorage", "init after to start identify all data size: " + this.f164930d.size());
            C59481e eVar = C59491j.f169998c;
            if (eVar == null) {
                return null;
            }
            ArrayList<QueryImageData> arrayList = this.f164930d;
            C87412m.m108594g(arrayList, "list");
            if (eVar.f169965e) {
                Log.m105924i("MicroMsg.ImageDataManager", "startIdentify >> isDoingWork");
            } else {
                eVar.f169965e = true;
                Log.m105924i("MicroMsg.ImageDataManager", "initToStartIdentify >> data size: " + arrayList.size());
                long currentTimeMillis = System.currentTimeMillis();
                C60283e eVar2 = C60283e.f171878a;
                C60283e.f171879b = currentTimeMillis;
                Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "setStartTimeStamp >> " + currentTimeMillis);
                C60280b.f171845b = currentTimeMillis;
                C60283e.f171885h = (long) arrayList.size();
                C60283e.f171894q = (long) 1;
                if (true ^ arrayList.isEmpty()) {
                    eVar.f169961a = C59477b.NEW;
                    C59503r.f170040a.mo84588i(arrayList);
                    eVar.f169967g.postValue(C59479c.RUNNING);
                } else {
                    Log.m105924i("MicroMsg.ImageDataManager", "initToStartIdentify image list is empty");
                    eVar.f169961a = C59477b.ALL_OLD;
                    eVar.f169967g.postValue(C59479c.STOP);
                    eVar2.mo85270a(6, 0, 0);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57608z3(ArrayList<QueryImageData> arrayList, ArrayList<QueryImageData> arrayList2, C15601d<? super C57608z3> dVar) {
        super(2, dVar);
        this.f164928e = arrayList;
        this.f164929f = arrayList2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C57608z3(this.f164928e, this.f164929f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57608z3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f164927d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQueryStorage", "initDBWithData");
            Log.m105924i("MicroMsg.ImageQueryStorage", "init after to insert data >> dataList: " + this.f164928e.size() + ", oldNoRecData: " + this.f164929f.size());
            C60283e.f171883f = (long) this.f164928e.size();
            C60283e.f171884g = (long) this.f164929f.size();
            for (QueryImageData c : this.f164928e) {
                C57593a4.f164912a.mo81938c(c, C59491j.f169997b);
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C57609a aVar2 = new C57609a(this.f164928e, this.f164929f, (C15601d<? super C57609a>) null);
            this.f164927d = 1;
            obj = C53895h.m60469g(k2Var, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
