package d33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import android.content.ContentValues;
import b33.C92169a;
import b33.C92172b;
import b33.C92175c;
import b33.C92176d;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86301e;
import di3.C86312j;
import e33.C97603a;
import ei2.C97651f;
import ei3.C86522b;
import f14.C58901s;
import f33.C97823a;
import f33.C97824b;
import f33.C97826d;
import fh2.C97882i;
import fy3.C32227p;
import g33.C98080a;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import hf3.C98448b;
import hf3.C98449c;
import i40.C60247c;
import if3.C98670a;
import java.util.HashMap;
import kotlin.ResultKt;
import p1169a5.C112758b;
import p1206p4.C117979k;
import p1222y4.C118917b;
import p166hy.C98568t0;
import p749xh.C102651h0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zt3.C119157j;

@C86522b
/* renamed from: d33.c */
public final class C97407c extends C86301e implements C98449c {

    /* renamed from: d */
    public final String f285917d = "MicroMsg.RemuxApiImpl";

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$deleteTimeLineFeedFakeVideo$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {127}, mo125471m = "invokeSuspend")
    /* renamed from: d33.c$a */
    public static final class C97408a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285918d;

        /* renamed from: e */
        public final /* synthetic */ int f285919e;

        /* renamed from: f */
        public final /* synthetic */ int f285920f;

        /* renamed from: g */
        public final /* synthetic */ C97407c f285921g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$deleteTimeLineFeedFakeVideo$1$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$a$a */
        public static final class C97409a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C102651h0 f285922d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97409a(C102651h0 h0Var, C15601d<? super C97409a> dVar) {
                super(2, dVar);
                this.f285922d = h0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97409a(this.f285922d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97409a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C97603a aVar = C97603a.f286333a;
                String str = this.f285922d.field_work_id;
                C87412m.m108593f(str, "info.field_work_id");
                aVar.mo136866a(11, str, this.f285922d.field_work_type, 4010);
                String str2 = this.f285922d.field_post_session_id;
                C87412m.m108593f(str2, "info.field_post_session_id");
                ((C98568t0) C86312j.m106911c(C98568t0.class)).r00(5, str2, 0, 0);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97408a(int i, int i2, C97407c cVar, C15601d<? super C97408a> dVar) {
            super(2, dVar);
            this.f285919e = i;
            this.f285920f = i2;
            this.f285921g = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97408a(this.f285919e, this.f285920f, this.f285921g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97408a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285918d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C97826d dVar = C97826d.f286974a;
                C102651h0 c = dVar.mo137160c(this.f285919e, this.f285920f);
                if (c == null) {
                    String str = this.f285921g.f285917d;
                    Log.m105920e(str, "deleteTimeLineFeedFakeVideo get info is null " + this.f285919e);
                    return C13598b0.f38549a;
                }
                String str2 = this.f285921g.f285917d;
                Log.m105924i(str2, "deleteTimeLineFeedFakeVideo >> workType: " + c.field_work_type);
                if (c.field_work_type != 4007) {
                    String str3 = c.field_work_id;
                    C87412m.m108593f(str3, "info.field_work_id");
                    dVar.mo137163f(str3, 4010);
                }
                C98080a.f287548a.mo137372a(c.field_work_id);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C97409a aVar2 = new C97409a(c, (C15601d<? super C97409a>) null);
                this.f285918d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$deleteWork$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {107}, mo125471m = "invokeSuspend")
    /* renamed from: d33.c$b */
    public static final class C97410b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285923d;

        /* renamed from: e */
        public final /* synthetic */ String f285924e;

        /* renamed from: f */
        public final /* synthetic */ C97407c f285925f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$deleteWork$1$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$b$a */
        public static final class C97411a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ String f285926d;

            /* renamed from: e */
            public final /* synthetic */ C102651h0 f285927e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97411a(String str, C102651h0 h0Var, C15601d<? super C97411a> dVar) {
                super(2, dVar);
                this.f285926d = str;
                this.f285927e = h0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97411a(this.f285926d, this.f285927e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97411a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C97603a.f286333a.mo136866a(8, this.f285926d, this.f285927e.field_work_type, 4002);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97410b(String str, C97407c cVar, C15601d<? super C97410b> dVar) {
            super(2, dVar);
            this.f285924e = str;
            this.f285925f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97410b(this.f285924e, this.f285925f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97410b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285923d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C97826d dVar = C97826d.f286974a;
                C102651h0 d = dVar.mo137161d(this.f285924e);
                if (d == null) {
                    String str = this.f285925f.f285917d;
                    Log.m105920e(str, "deleteWork get info is null " + this.f285924e);
                    return C13598b0.f38549a;
                }
                C117979k b = C117979k.m166386b(MMApplicationContext.getContext());
                String str2 = this.f285924e;
                b.getClass();
                ((C112758b) b.f352607d).mo164514a(new C118917b(b, str2));
                C98080a.f287548a.mo137372a(d.field_work_id);
                dVar.mo137163f(this.f285924e, 4002);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C97411a aVar2 = new C97411a(this.f285924e, d, (C15601d<? super C97411a>) null);
                this.f285923d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$getBackgroundVideoBasicInfo$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {42, 49}, mo125471m = "invokeSuspend")
    /* renamed from: d33.c$c */
    public static final class C97412c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285928d;

        /* renamed from: e */
        public final /* synthetic */ String f285929e;

        /* renamed from: f */
        public final /* synthetic */ C97407c f285930f;

        /* renamed from: g */
        public final /* synthetic */ C98448b f285931g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$getBackgroundVideoBasicInfo$1$1$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$c$a */
        public static final class C97413a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C98448b f285932d;

            /* renamed from: e */
            public final /* synthetic */ C98670a f285933e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97413a(C98448b bVar, C98670a aVar, C15601d<? super C97413a> dVar) {
                super(2, dVar);
                this.f285932d = bVar;
                this.f285933e = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97413a(this.f285932d, this.f285933e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97413a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f285932d.mo131296a(this.f285933e);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$getBackgroundVideoBasicInfo$1$2", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$c$b */
        public static final class C97414b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C98448b f285934d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97414b(C98448b bVar, C15601d<? super C97414b> dVar) {
                super(2, dVar);
                this.f285934d = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97414b(this.f285934d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97414b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f285934d.mo131296a((C98670a) null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97412c(String str, C97407c cVar, C98448b bVar, C15601d<? super C97412c> dVar) {
            super(2, dVar);
            this.f285929e = str;
            this.f285930f = cVar;
            this.f285931g = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97412c(this.f285929e, this.f285930f, this.f285931g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97412c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285928d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C102651h0 d = C97826d.f286974a.mo137161d(this.f285929e);
                if (d != null) {
                    C97407c cVar = this.f285930f;
                    String str = this.f285929e;
                    C98448b bVar = this.f285931g;
                    String str2 = cVar.f285917d;
                    Log.m105924i(str2, "getBackgroundVideoBasicInfo >> workTagId: " + str + ", is find");
                    int i2 = d.field_work_type;
                    String str3 = d.field_work_id;
                    C87412m.m108593f(str3, "it.field_work_id");
                    long j = d.field_confirm_remux_time_stamp;
                    String str4 = d.field_output_video_path;
                    C87412m.m108593f(str4, "it.field_output_video_path");
                    String str5 = d.field_output_thumb_path;
                    C87412m.m108593f(str5, "it.field_output_thumb_path");
                    C98670a aVar2 = new C98670a(i2, str3, j, str4, str5, 0, 0, (byte[]) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (C8480h) null);
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C97413a aVar3 = new C97413a(bVar, aVar2, (C15601d<? super C97413a>) null);
                    this.f285928d = 1;
                    if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    String str6 = this.f285930f.f285917d;
                    Log.m105920e(str6, "getBackgroundVideoBasicInfo >> workTagId: " + this.f285929e + ", is not find");
                    C53896h0 h0Var2 = C53872d1.f151117a;
                    C53915k2 k2Var2 = C58901s.f168555a;
                    C97414b bVar2 = new C97414b(this.f285931g, (C15601d<? super C97414b>) null);
                    this.f285928d = 2;
                    if (C53895h.m60469g(k2Var2, bVar2, this) == aVar) {
                        return aVar;
                    }
                    return C13598b0.f38549a;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$getBackgroundVideoBasicInfoBySnsLocalId$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {83, 90}, mo125471m = "invokeSuspend")
    /* renamed from: d33.c$d */
    public static final class C97415d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285935d;

        /* renamed from: e */
        public final /* synthetic */ int f285936e;

        /* renamed from: f */
        public final /* synthetic */ int f285937f;

        /* renamed from: g */
        public final /* synthetic */ C97407c f285938g;

        /* renamed from: h */
        public final /* synthetic */ C98448b f285939h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$getBackgroundVideoBasicInfoBySnsLocalId$1$1$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$d$a */
        public static final class C97416a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C98448b f285940d;

            /* renamed from: e */
            public final /* synthetic */ C98670a f285941e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97416a(C98448b bVar, C98670a aVar, C15601d<? super C97416a> dVar) {
                super(2, dVar);
                this.f285940d = bVar;
                this.f285941e = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97416a(this.f285940d, this.f285941e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97416a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f285940d.mo131296a(this.f285941e);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$getBackgroundVideoBasicInfoBySnsLocalId$1$2", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$d$b */
        public static final class C97417b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C98448b f285942d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97417b(C98448b bVar, C15601d<? super C97417b> dVar) {
                super(2, dVar);
                this.f285942d = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97417b(this.f285942d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97417b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f285942d.mo131296a((C98670a) null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97415d(int i, int i2, C97407c cVar, C98448b bVar, C15601d<? super C97415d> dVar) {
            super(2, dVar);
            this.f285936e = i;
            this.f285937f = i2;
            this.f285938g = cVar;
            this.f285939h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97415d(this.f285936e, this.f285937f, this.f285938g, this.f285939h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97415d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285935d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C102651h0 c = C97826d.f286974a.mo137160c(this.f285936e, this.f285937f);
                if (c != null) {
                    C97407c cVar = this.f285938g;
                    int i2 = this.f285936e;
                    int i3 = this.f285937f;
                    C98448b bVar = this.f285939h;
                    String str = cVar.f285917d;
                    Log.m105924i(str, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + i2 + ", createTime: " + i3 + ",  is find");
                    int i4 = c.field_work_type;
                    String str2 = c.field_work_id;
                    C87412m.m108593f(str2, "it.field_work_id");
                    long j = c.field_confirm_remux_time_stamp;
                    String str3 = c.field_output_video_path;
                    C87412m.m108593f(str3, "it.field_output_video_path");
                    String str4 = c.field_output_thumb_path;
                    C87412m.m108593f(str4, "it.field_output_thumb_path");
                    C98670a aVar2 = new C98670a(i4, str2, j, str3, str4, c.field_work_code, c.field_remux_success_time_stamp, c.field_sns_ext_info);
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C97416a aVar3 = new C97416a(bVar, aVar2, (C15601d<? super C97416a>) null);
                    this.f285935d = 1;
                    if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    String str5 = this.f285938g.f285917d;
                    Log.m105920e(str5, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + this.f285936e + ", createTime: " + this.f285937f + ", is not find");
                    C53896h0 h0Var2 = C53872d1.f151117a;
                    C53915k2 k2Var2 = C58901s.f168555a;
                    C97417b bVar2 = new C97417b(this.f285939h, (C15601d<? super C97417b>) null);
                    this.f285935d = 2;
                    if (C53895h.m60469g(k2Var2, bVar2, this) == aVar) {
                        return aVar;
                    }
                    return C13598b0.f38549a;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$updateWorkTimeOut$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {165}, mo125471m = "invokeSuspend")
    /* renamed from: d33.c$e */
    public static final class C97418e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285943d;

        /* renamed from: e */
        public final /* synthetic */ int f285944e;

        /* renamed from: f */
        public final /* synthetic */ int f285945f;

        /* renamed from: g */
        public final /* synthetic */ C97407c f285946g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$updateWorkTimeOut$1$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$e$a */
        public static final class C97419a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C102651h0 f285947d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97419a(C102651h0 h0Var, C15601d<? super C97419a> dVar) {
                super(2, dVar);
                this.f285947d = h0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97419a(this.f285947d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97419a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis();
                C102651h0 h0Var = this.f285947d;
                C87412m.m108594g(h0Var, "info");
                Log.m105924i("MicroMsg.FakeVideoTecReporter", "reportWorkTimeOut, " + currentTimeMillis);
                SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
                snsFakeVideoLogStruct.f266021d = 4;
                snsFakeVideoLogStruct.f266026i = h0Var.field_confirm_remux_time_stamp;
                snsFakeVideoLogStruct.f266027j = h0Var.field_confirm_publish_video_time_stamp;
                snsFakeVideoLogStruct.f266028k = h0Var.field_start_remux_time_stamp;
                snsFakeVideoLogStruct.f266029l = h0Var.field_remux_success_time_stamp;
                int i = h0Var.field_encode_target_width;
                int i2 = h0Var.field_encode_target_height;
                int i3 = h0Var.field_encode_video_bitrate;
                int i4 = h0Var.field_encode_qp_switch;
                snsFakeVideoLogStruct.f266031n = snsFakeVideoLogStruct.mo86045b("EncodeConfig", C112551y.m153816p(new C97882i.C97883a(i, i2, i3, 0, h0Var.field_encode_frame_rate, h0Var.field_source_video_rotate, 0, 0, false, false, 0, 0, i4, 4040, (C8480h) null).toString(), ",", ";", false, 4, (Object) null), true);
                snsFakeVideoLogStruct.f266032o = h0Var.field_is_sns_double_check;
                snsFakeVideoLogStruct.f266034q = h0Var.field_is_killed_process_restart;
                snsFakeVideoLogStruct.f266023f = h0Var.field_work_code;
                snsFakeVideoLogStruct.f266035r = h0Var.field_tec_enter_scene;
                snsFakeVideoLogStruct.mo86054n();
                Log.m105924i("MicroMsg.FakeVideoTecReporter", "reportWorkTimeOut >> " + snsFakeVideoLogStruct.f266026i + ", " + snsFakeVideoLogStruct.f266027j + ", " + snsFakeVideoLogStruct.f266028k + ", " + snsFakeVideoLogStruct.f266029l);
                String str = this.f285947d.field_post_session_id;
                C87412m.m108593f(str, "info.field_post_session_id");
                ((C98568t0) C86312j.m106911c(C98568t0.class)).r00(6, str, 0, 0);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97418e(int i, int i2, C97407c cVar, C15601d<? super C97418e> dVar) {
            super(2, dVar);
            this.f285944e = i;
            this.f285945f = i2;
            this.f285946g = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97418e(this.f285944e, this.f285945f, this.f285946g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97418e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285943d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C97826d dVar = C97826d.f286974a;
                C102651h0 c = dVar.mo137160c(this.f285944e, this.f285945f);
                if (c == null) {
                    String str = this.f285946g.f285917d;
                    Log.m105924i(str, "updateWorkTimeOut get info is null, " + this.f285944e);
                    return C13598b0.f38549a;
                }
                C117979k b = C117979k.m166386b(MMApplicationContext.getContext());
                String str2 = c.field_work_id;
                b.getClass();
                ((C112758b) b.f352607d).mo164514a(new C118917b(b, str2));
                C98080a.f287548a.mo137372a(c.field_work_id);
                int i2 = this.f285944e;
                ISQLiteDatabase a = dVar.mo137158a();
                SingleTable singleTable = C102651h0.f302391Q;
                ContentValues contentValues = new ContentValues();
                contentValues.put("work_type", Integer.valueOf(WearableStatusCodes.DATA_ITEM_TOO_LARGE));
                int run = C102651h0.f302391Q.update(contentValues).where(C102651h0.f302399U.equal((Number) Integer.valueOf(i2))).build().run(a);
                Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkTypeBySnsLocalId >> workType: " + WearableStatusCodes.DATA_ITEM_TOO_LARGE + ", result: " + run);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C97419a aVar2 = new C97419a(c, (C15601d<? super C97419a>) null);
                this.f285943d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d33.c$f */
    public static final class C97420f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f285948d;

        /* renamed from: e */
        public final /* synthetic */ int f285949e;

        /* renamed from: f */
        public final /* synthetic */ int f285950f;

        public C97420f(String str, int i, int i2) {
            this.f285948d = str;
            this.f285949e = i;
            this.f285950f = i2;
        }

        public final void run() {
            C97603a.f286333a.mo136866a(7, this.f285948d, this.f285949e, this.f285950f);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$updateWorkTypeAndReportByUploadAction$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {201}, mo125471m = "invokeSuspend")
    /* renamed from: d33.c$g */
    public static final class C97421g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285951d;

        /* renamed from: e */
        public final /* synthetic */ String f285952e;

        /* renamed from: f */
        public final /* synthetic */ C97407c f285953f;

        /* renamed from: g */
        public final /* synthetic */ int f285954g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.api_Impl.RemuxApiImpl$updateWorkTypeAndReportByUploadAction$1$1", mo125469f = "RemuxApiImpl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: d33.c$g$a */
        public static final class C97422a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ int f285955d;

            /* renamed from: e */
            public final /* synthetic */ String f285956e;

            /* renamed from: f */
            public final /* synthetic */ int f285957f;

            /* renamed from: g */
            public final /* synthetic */ C8478d0 f285958g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97422a(int i, String str, int i2, C8478d0 d0Var, C15601d<? super C97422a> dVar) {
                super(2, dVar);
                this.f285955d = i;
                this.f285956e = str;
                this.f285957f = i2;
                this.f285958g = d0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97422a(this.f285955d, this.f285956e, this.f285957f, this.f285958g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97422a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C97603a.f286333a.mo136866a(this.f285955d, this.f285956e, this.f285957f, this.f285958g.f27483d);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97421g(String str, C97407c cVar, int i, C15601d<? super C97421g> dVar) {
            super(2, dVar);
            this.f285952e = str;
            this.f285953f = cVar;
            this.f285954g = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97421g(this.f285952e, this.f285953f, this.f285954g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97421g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285951d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C97826d dVar = C97826d.f286974a;
                C102651h0 d = dVar.mo137161d(this.f285952e);
                if (d == null) {
                    String str = this.f285953f.f285917d;
                    Log.m105920e(str, "updateWorkTypeAndReportByUploadAction get info is null " + this.f285952e);
                    return C13598b0.f38549a;
                }
                int i2 = d.field_work_type;
                C8478d0 d0Var = new C8478d0();
                String str2 = this.f285953f.f285917d;
                Log.m105924i(str2, "lastWorkType: " + i2 + ", " + this.f285952e);
                int i3 = this.f285954g;
                if (i3 == 5) {
                    C117979k b = C117979k.m166386b(MMApplicationContext.getContext());
                    String str3 = this.f285952e;
                    b.getClass();
                    ((C112758b) b.f352607d).mo164514a(new C118917b(b, str3));
                    C98080a.f287548a.mo137372a(d.field_work_id);
                    d0Var.f27483d = WearableStatusCodes.INVALID_TARGET_NODE;
                } else if (i3 == 6) {
                    d0Var.f27483d = i2 == 4001 ? WearableStatusCodes.ASSET_UNAVAILABLE : i2;
                } else if (i3 == 9) {
                    d0Var.f27483d = 4009;
                }
                String str4 = this.f285953f.f285917d;
                Log.m105924i(str4, "currentWorkType: " + d0Var.f27483d + ", " + this.f285952e);
                dVar.mo137163f(this.f285952e, d0Var.f27483d);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C97422a aVar2 = new C97422a(this.f285954g, this.f285952e, i2, d0Var, (C15601d<? super C97422a>) null);
                this.f285951d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public void Fw0(int i, int i2) {
        String str = this.f285917d;
        Log.m105924i(str, "updateWorkTimeOut >> snsLocalId: " + i + ", createTime: " + i2);
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C97418e(i, i2, this, (C15601d<? super C97418e>) null), 2, (Object) null);
    }

    /* renamed from: PD */
    public void mo136674PD(String str, C98448b bVar) {
        C87412m.m108594g(str, "workTagId");
        C87412m.m108594g(bVar, "callback");
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C97412c(str, this, bVar, (C15601d<? super C97412c>) null), 2, (Object) null);
    }

    /* renamed from: Q7 */
    public void mo136675Q7(String str, long j, long j2, int i) {
        C87412m.m108594g(str, "workTageId");
        String str2 = this.f285917d;
        Log.m105924i(str2, "reportTimeLineCheckToUpload >> workTagId: " + str + ", muxResult: " + i + ", confirmRemuxTime: " + j + " muxFinishTime: " + j2);
        StringBuilder sb = new StringBuilder();
        sb.append("reportTimelineCheckUpload >> workTagId: ");
        sb.append(str);
        sb.append(", muxResult: ");
        sb.append(i);
        Log.m105924i("MicroMsg.FakeVideoTecReporter", sb.toString());
        SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.f266021d = 12;
        snsFakeVideoLogStruct.f266022e = snsFakeVideoLogStruct.mo86045b("WorkId", str, true);
        snsFakeVideoLogStruct.f266023f = i;
        snsFakeVideoLogStruct.f266026i = j;
        snsFakeVideoLogStruct.f266029l = j2;
        snsFakeVideoLogStruct.mo86054n();
    }

    /* renamed from: Sa */
    public Object mo136676Sa(int i, VideoCompositionPlayView videoCompositionPlayView, boolean z, int i2, C15601d<? super Long> dVar) {
        C92175c cVar = C92175c.f263819a;
        return C53895h.m60469g(C53872d1.f151119c, new C92169a(i, z, i2, videoCompositionPlayView, (C15601d<? super C92169a>) null), dVar);
    }

    public Object Wr0(String str, VideoCompositionPlayView videoCompositionPlayView, C15601d<? super Long> dVar) {
        C92175c cVar = C92175c.f263819a;
        return C53895h.m60469g(C53872d1.f151119c, new C92172b(str, videoCompositionPlayView, (C15601d<? super C92172b>) null), dVar);
    }

    /* renamed from: hj */
    public void mo136678hj(int i, int i2) {
        String str = this.f285917d;
        Log.m105924i(str, "deleteTimeLineFeedFakeVideo >> snsLocalId: " + i + ", createTime: " + i2);
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C97408a(i, i2, this, (C15601d<? super C97408a>) null), 2, (Object) null);
    }

    /* renamed from: iz */
    public C98670a mo136679iz(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "workTagId");
        C102651h0 d = C97826d.f286974a.mo137161d(str2);
        if (d != null) {
            String str3 = this.f285917d;
            Log.m105924i(str3, "getBackgroundVideoBasicInfo >> workTagId: " + str2 + ", is find");
            int i = d.field_work_type;
            String str4 = d.field_work_id;
            C87412m.m108593f(str4, "it.field_work_id");
            long j = d.field_confirm_remux_time_stamp;
            String str5 = d.field_output_video_path;
            C87412m.m108593f(str5, "it.field_output_video_path");
            String str6 = d.field_output_thumb_path;
            C87412m.m108593f(str6, "it.field_output_thumb_path");
            return new C98670a(i, str4, j, str5, str6, 0, 0, (byte[]) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (C8480h) null);
        }
        String str7 = this.f285917d;
        Log.m105920e(str7, "getBackgroundVideoBasicInfo >> workTagId: " + str2 + ", is not find");
        return null;
    }

    /* renamed from: ji */
    public void mo136680ji() {
        Class cls = C97824b.class;
        C60247c.C60248a aVar = C60247c.f171775g;
        if (((C97824b) aVar.mo85234a(cls)).getDB() != null) {
            Log.m105924i(this.f285917d, "exist old db need to create new db");
            ((C97824b) aVar.mo85234a(cls)).onCleared();
            C97826d.f286974a.mo137159b();
        }
    }

    public void lp0(String str, int i) {
        C87412m.m108594g(str, "workTagId");
        String str2 = this.f285917d;
        Log.m105924i(str2, "updateWorkTypeByUploadAction >> workTagId: " + str + ", action: " + i);
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C97421g(str, this, i, (C15601d<? super C97421g>) null), 2, (Object) null);
    }

    /* renamed from: mD */
    public void mo136682mD(String str, int i, int i2, byte[] bArr, String str2, int i3) {
        C87412m.m108594g(str, "workTagId");
        C87412m.m108594g(bArr, "extInfo");
        C87412m.m108594g(str2, "postSessionId");
        String str3 = this.f285917d;
        Log.m105924i(str3, "updateWorkToPublish >> workTagId: " + str + ", workType: " + i + ", snsLocalId: " + i2 + ", postSessionId: " + str2 + ", snsCreateTime: " + i3);
        C97826d dVar = C97826d.f286974a;
        C102651h0 d = dVar.mo137161d(str);
        if (d == null) {
            String str4 = this.f285917d;
            Log.m105920e(str4, "updateWorkToPublish get info is null " + str);
            return;
        }
        int i4 = d.field_work_type;
        String str5 = this.f285917d;
        Log.m105924i(str5, "updateWorkToPublish >> lastWorkType >> " + i4);
        long currentTimeMillis = System.currentTimeMillis();
        ISQLiteDatabase a = dVar.mo137158a();
        SingleTable singleTable = C102651h0.f302391Q;
        ContentValues contentValues = new ContentValues();
        contentValues.put("work_type", Integer.valueOf(i));
        contentValues.put("sns_local_id", Integer.valueOf(i2));
        contentValues.put("sns_ext_info", bArr);
        contentValues.put("confirm_publish_video_time_stamp", Long.valueOf(currentTimeMillis));
        contentValues.put("post_session_id", str2);
        contentValues.put("sns_create_time", Integer.valueOf(i3));
        int run = C102651h0.f302391Q.update(contentValues).where(C102651h0.f302393R.equal(str)).build().run(a);
        Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkToPublish >> workType: " + i + ", snsLocalId: " + i2 + ", workTagId: " + str + ", confirmPublishTimeStamp: " + currentTimeMillis + ", snsCreateTime: " + i3 + ", result: " + run);
        ((C119157j) C119157j.f356862d).mo183895z(new C97420f(str, i4, i));
    }

    public void md0(long j) {
        ((C119157j) C119157j.f356862d).mo183876g(new C97823a(j), "Background_video_storage_clear");
    }

    /* renamed from: od */
    public void mo136684od(int i, int i2, C98448b bVar) {
        C87412m.m108594g(bVar, "callback");
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C97415d(i, i2, this, bVar, (C15601d<? super C97415d>) null), 2, (Object) null);
    }

    /* renamed from: sw */
    public void mo136685sw(String str) {
        C87412m.m108594g(str, "workTagId");
        String str2 = this.f285917d;
        Log.m105924i(str2, "deleteWork >> workTagId: " + str);
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C97410b(str, this, (C15601d<? super C97410b>) null), 2, (Object) null);
    }

    /* renamed from: yH */
    public void mo136686yH(long j) {
        C92175c cVar = C92175c.f263819a;
        Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "destroy: " + j);
        HashMap<Long, C92176d> hashMap = C92175c.f263820b;
        C92176d dVar = hashMap.get(Long.valueOf(j));
        if (dVar != null) {
            ((C97651f) dVar.f263822b).destroy();
            dVar.f263823c.mo154931k();
        }
        hashMap.remove(Long.valueOf(j));
    }
}
