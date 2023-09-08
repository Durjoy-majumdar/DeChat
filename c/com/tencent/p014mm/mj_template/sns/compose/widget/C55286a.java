package com.tencent.p014mm.mj_template.sns.compose.widget;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p175j0.C108504h;
import p415q0.C110261c;
import p721v0.C65503j;
import rx3.C13598b0;
import va0.C111497b;
import va0.C111503f;
import va0.C14422e;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.a */
public final class C55286a {

    /* renamed from: a */
    public static C32228q<C103941f, C108504h, Integer, C13598b0> f157483a = C110261c.m149879c(437226025, false, C55287a.f157487d);

    /* renamed from: b */
    public static C32228q<C103941f, C108504h, Integer, C13598b0> f157484b = C110261c.m149879c(1069906834, false, C55288b.f157488d);

    /* renamed from: c */
    public static C32228q<C103941f, C108504h, Integer, C13598b0> f157485c = C110261c.m149879c(38445617, false, C55289c.f157489d);

    /* renamed from: d */
    public static C32228q<C103941f, C108504h, Integer, C13598b0> f157486d = C110261c.m149879c(2125264608, false, C55290d.f157490d);

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.a$a */
    public static final class C55287a extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C55287a f157487d = new C55287a();

        public C55287a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g((C103941f) obj, "$this$item");
            if ((intValue & 81) != 16 || !hVar.mo51575a()) {
                C104671n.m140295d(hVar, 0);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.a$b */
    public static final class C55288b extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C55288b f157488d = new C55288b();

        public C55288b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g((C103941f) obj, "$this$item");
            if ((intValue & 81) != 16 || !hVar.mo51575a()) {
                String string = MMApplicationContext.getString(C0966R.string.f361415mu0);
                C87412m.m108593f(string, "story_editor_audio_search_retry.str");
                C104671n.m140294c(string, hVar, 0);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.a$c */
    public static final class C55289c extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C55289c f157489d = new C55289c();

        public C55289c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g((C103941f) obj, "$this$item");
            if ((intValue & 81) != 16 || !hVar.mo51575a()) {
                String string = MMApplicationContext.getString(C0966R.string.jpu);
                C87412m.m108593f(string, "story_editor_audio_search_no_result.str");
                C104671n.m140294c(string, hVar, 0);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.a$d */
    public static final class C55290d extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C55290d f157490d = new C55290d();

        public C55290d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g((C103941f) obj, "$this$item");
            if ((intValue & 81) != 16 || !hVar.mo51575a()) {
                C111497b.m152004a((C65503j) null, C111503f.Small, (C14422e) null, hVar, 48, 5);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }
}
