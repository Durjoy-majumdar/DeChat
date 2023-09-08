package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19641z0;
import fy0.C59335a;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64522lg;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o3 */
public final class C18418o3 {

    /* renamed from: a */
    public static final C18418o3 f51098a = new C18418o3();

    /* renamed from: b */
    public static final C13601g f51099b = C36568h.m40985a(C18422c.f51106d);

    /* renamed from: c */
    public static final C13601g f51100c = C36568h.m40985a(C18420b.f51104d);

    /* renamed from: d */
    public static final C13601g f51101d = C36568h.m40985a(C18421d.f51105d);

    /* renamed from: e */
    public static final C13601g f51102e = C36568h.m40985a(C18419a.f51103d);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o3$a */
    public static final class C18419a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C18419a f51103d = new C18419a();

        public C18419a() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if ((C18418o3.f51098a.mo22997b().decodeInt("ReSortBizMsgFlag", 0) & 3) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o3$b */
    public static final class C18420b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C18420b f51104d = new C18420b();

        public C18420b() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if ((C18418o3.f51098a.mo22997b().decodeInt("ReSortBizMsgFlag", 0) & 1) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o3$d */
    public static final class C18421d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C18421d f51105d = new C18421d();

        public C18421d() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if ((C18418o3.f51098a.mo22997b().decodeInt("ReSortBizMsgFlag", 0) & 2) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o3$c */
    public static final class C18422c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C18422c f51106d = new C18422c();

        public C18422c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: a */
    public static final C64522lg m19037a(C18418o3 o3Var, int i, List list, C18412m3.C18415c cVar, int i2, int i3) {
        MultiProcessMMKV b = o3Var.mo22997b();
        int decodeInt = b.decodeInt("ReSortBizMsgContextMsgLimit-" + i3, 5);
        if (decodeInt < 1) {
            decodeInt = 1;
        }
        if (decodeInt > 50) {
            decodeInt = 50;
        }
        C64522lg lgVar = new C64522lg();
        int i4 = 0 - decodeInt;
        if (i4 <= decodeInt) {
            while (true) {
                int i5 = i + i4;
                C19623o0 o0Var = (i5 < 0 || i5 >= list.size()) ? null : (C19623o0) list.get(i5);
                if (o0Var != null) {
                    lgVar.f184089d.addAll(C59335a.m69245a(o0Var, cVar, i2, i4 == 0));
                }
                if (i4 == decodeInt) {
                    break;
                }
                i4++;
            }
        }
        C19641z0.f55648d = C19641z0.f55647c;
        Log.m105918d("MicroMsg.BizTimeLineResortHelper", "getResortContext item size=" + lgVar.f184089d.size());
        return lgVar;
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo22997b() {
        return (MultiProcessMMKV) ((C36570n) f51099b).getValue();
    }
}
