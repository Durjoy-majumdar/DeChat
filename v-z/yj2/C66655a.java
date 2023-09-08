package yj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.ResultKt;
import mp3.C88819d;
import q40.C62580c;
import q40.C89456b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49335eu3;
import ve3.C52862x0;
import ve3.C52864y0;
import ve3.C65679e0;
import ve3.C65680f;
import ve3.C65684l0;
import vj2.C52942l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: yj2.a */
public final class C66655a {

    /* renamed from: a */
    public static final C66655a f191654a = new C66655a();

    /* renamed from: yj2.a$a */
    public static final class C66656a {

        /* renamed from: a */
        public final FinderObject f191655a;

        /* renamed from: b */
        public final boolean f191656b;

        public C66656a(FinderObject finderObject, boolean z) {
            this.f191655a = finderObject;
            this.f191656b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C66656a)) {
                return false;
            }
            C66656a aVar = (C66656a) obj;
            return C87412m.m108589b(this.f191655a, aVar.f191655a) && this.f191656b == aVar.f191656b;
        }

        public int hashCode() {
            FinderObject finderObject = this.f191655a;
            int hashCode = (finderObject == null ? 0 : finderObject.hashCode()) * 31;
            boolean z = this.f191656b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "FinderObjectDesc(finderObject=" + this.f191655a + ", unAvailable=" + this.f191656b + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.ringtone.RingtoneSettingHelper$getRingBackFromFinder$2", mo125469f = "RingtoneSettingHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: yj2.a$b */
    public static final class C66657b extends C91594j implements C32227p<C0000n0, C15601d<? super C66656a>, Object> {

        /* renamed from: d */
        public final /* synthetic */ long f191657d;

        /* renamed from: e */
        public final /* synthetic */ String f191658e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66657b(long j, String str, C15601d<? super C66657b> dVar) {
            super(2, dVar);
            this.f191657d = j;
            this.f191658e = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66657b(this.f191657d, this.f191658e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66657b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (this.f191657d == 0) {
                return null;
            }
            C13604l<Boolean, Object> w4 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83798w4(this.f191657d, this.f191658e, 2);
            Boolean bool = (Boolean) w4.f38555d;
            C87412m.m108593f(bool, "first");
            return new C66656a((FinderObject) w4.f38556e, bool.booleanValue());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.ringtone.RingtoneSettingHelper$saveRingtoneCommon$2", mo125469f = "RingtoneSettingHelper.kt", mo125470l = {222}, mo125471m = "invokeSuspend")
    /* renamed from: yj2.a$c */
    public static final class C66658c extends C91594j implements C32227p<C0000n0, C15601d<? super C62580c<C52864y0>>, Object> {

        /* renamed from: d */
        public int f191659d;

        /* renamed from: e */
        public final /* synthetic */ int f191660e;

        /* renamed from: f */
        public final /* synthetic */ int f191661f;

        /* renamed from: g */
        public final /* synthetic */ long f191662g;

        /* renamed from: h */
        public final /* synthetic */ String f191663h;

        /* renamed from: i */
        public final /* synthetic */ int f191664i;

        /* renamed from: j */
        public final /* synthetic */ int f191665j;

        /* renamed from: n */
        public final /* synthetic */ String f191666n;

        /* renamed from: o */
        public final /* synthetic */ int f191667o;

        /* renamed from: p */
        public final /* synthetic */ int f191668p;

        /* renamed from: q */
        public final /* synthetic */ String f191669q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66658c(int i, int i2, long j, String str, int i3, int i4, String str2, int i5, int i6, String str3, C15601d<? super C66658c> dVar) {
            super(2, dVar);
            this.f191660e = i;
            this.f191661f = i2;
            this.f191662g = j;
            this.f191663h = str;
            this.f191664i = i3;
            this.f191665j = i4;
            this.f191666n = str2;
            this.f191667o = i5;
            this.f191668p = i6;
            this.f191669q = str3;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66658c(this.f191660e, this.f191661f, this.f191662g, this.f191663h, this.f191664i, this.f191665j, this.f191666n, this.f191667o, this.f191668p, this.f191669q, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66658c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f191659d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.RingtoneSettingHelper", "saveExclusiveRingtone: opType=" + this.f191660e + " ,useRingtone=" + this.f191661f + ", objectId=" + this.f191662g + ", nonceId=" + this.f191663h + ", start=" + this.f191664i + ", end=" + this.f191665j + ", username=" + this.f191666n + ",musicUrl = " + this.f191667o + ", extBusinessScene:" + this.f191668p);
                C52862x0 x0Var = new C52862x0();
                x0Var.f147650g = this.f191660e;
                x0Var.f147647d = this.f191661f;
                C65684l0 l0Var = new C65684l0();
                int i2 = this.f191665j;
                int i3 = this.f191664i;
                int i4 = this.f191667o;
                String str = this.f191663h;
                long j = this.f191662g;
                l0Var.f189017f = i2;
                l0Var.f189016e = i3;
                if (i4 == 0) {
                    l0Var.f189015d = 2;
                } else {
                    l0Var.f189015d = 1;
                }
                C65680f fVar = new C65680f();
                fVar.f188984e = str;
                fVar.f188983d = j;
                l0Var.f189019h = fVar;
                C65679e0 e0Var = new C65679e0();
                e0Var.f188982d = i4;
                l0Var.f189018g = e0Var;
                x0Var.f147648e = l0Var;
                x0Var.f147649f = this.f191666n;
                x0Var.f147652i = this.f191668p;
                x0Var.f147653j = this.f191669q;
                C52942l lVar = new C52942l(x0Var);
                this.f191659d = 1;
                obj = C89456b.m111831a(lVar, 0, (C88819d) null, this, 3, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.RingtoneSettingHelper", "error happened in save ringtone ");
                    return new C62580c(false, (C49335eu3) null, 2, (C8480h) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return new C62580c(true, (C52864y0) obj);
        }
    }

    /* renamed from: a */
    public static final Object m78639a(long j, String str, C15601d<? super C66656a> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C66657b(j, str, (C15601d<? super C66657b>) null), dVar);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m78640c(C66655a aVar, int i, int i2, long j, String str, int i3, int i4, String str2, int i5, String str3, C15601d dVar, int i6, Object obj) {
        int i7 = i6;
        return aVar.mo90707b(i, i2, j, str, i3, i4, str2, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) != 0 ? "" : str3, dVar);
    }

    /* renamed from: b */
    public final Object mo90707b(int i, int i2, long j, String str, int i3, int i4, String str2, int i5, String str3, C15601d<? super C62580c<C52864y0>> dVar) {
        Log.m105924i("MicroMsg.RingtoneSettingHelper", "saveExclusiveRingtone: useRingtone=" + i2 + ", objectId=" + j + ", nonceId=" + str + ", start=" + i3 + ", end=" + i4 + ", username=" + str2 + ",musicUrl =" + i5);
        return mo90709e(i, i2, j, str, i3, i4, str2, i5, 0, str3, dVar);
    }

    /* renamed from: d */
    public final Object mo90708d(int i, int i2, int i3, long j, String str, int i4, int i5, int i6, String str2, C15601d<? super C62580c<C52864y0>> dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("saveNormalPersonalityRingtone: useRingtone=");
        sb.append(i2);
        sb.append(", objectId=");
        long j2 = j;
        sb.append(j2);
        sb.append(", nonceId=");
        String str3 = str;
        sb.append(str3);
        sb.append(", start=");
        int i7 = i4;
        sb.append(i7);
        sb.append(", end=");
        int i8 = i5;
        sb.append(i8);
        sb.append(",musicUrl=");
        int i9 = i3;
        sb.append(i9);
        sb.append(", extBusinessScene:");
        int i15 = i6;
        sb.append(i15);
        Log.m105924i("MicroMsg.RingtoneSettingHelper", sb.toString());
        return mo90709e(i, i2, j2, str3, i7, i8, (String) null, i9, i15, str2, dVar);
    }

    /* renamed from: e */
    public final Object mo90709e(int i, int i2, long j, String str, int i3, int i4, String str2, int i5, int i6, String str3, C15601d<? super C62580c<C52864y0>> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C66658c(i, i2, j, str, i3, i4, str2, i5, i6, str3, (C15601d<? super C66658c>) null), dVar);
    }
}
