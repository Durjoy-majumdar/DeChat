package com.tencent.p014mm.plugin.ball.service;

import android.animation.AnimatorListenerAdapter;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import aw0.C103925l;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import xv0.C112181e;
import xv0.C112184g;
import xv0.C112185h;
import xv0.C112186j;
import xv0.C112187l;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy */
public class FloatBallServiceProxy implements C112181e {

    /* renamed from: a */
    public static FloatBallServiceProxy f311736a;

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$SetFloatBallAlphaParcel */
    public static class SetFloatBallAlphaParcel implements Parcelable {
        public static final Parcelable.Creator<SetFloatBallAlphaParcel> CREATOR = new C104955a();

        /* renamed from: d */
        public float f311744d;

        /* renamed from: e */
        public BallInfo f311745e;

        /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$SetFloatBallAlphaParcel$a */
        public class C104955a implements Parcelable.Creator<SetFloatBallAlphaParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new SetFloatBallAlphaParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new SetFloatBallAlphaParcel[i];
            }
        }

        public SetFloatBallAlphaParcel(Parcel parcel) {
            this.f311744d = parcel.readFloat();
            this.f311745e = (BallInfo) parcel.readParcelable(BallInfo.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f311744d);
            parcel.writeParcelable(this.f311745e, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$a */
    public class C104957a implements C1256g<IPCVoid> {
        public C104957a(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$a0 */
    public class C104958a0 implements C1256g<IPCVoid> {
        public C104958a0(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$a1 */
    public static final class C104959a1 implements C80916r<IPCVoid, IPCBoolean> {
        private C104959a1() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCBoolean(C105035c.m140879r0().mo149128j0());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$b */
    public class C104960b implements C1256g<IPCVoid> {
        public C104960b(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$b0 */
    public class C104961b0 implements C1256g<IPCVoid> {
        public C104961b0(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$b1 */
    public static final class C104962b1 implements C80916r<IPCVoid, IPCBoolean> {
        private C104962b1() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCBoolean(C105035c.m140879r0().f311760j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$c */
    public class C104963c implements C1256g<IPCVoid> {
        public C104963c(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$c0 */
    public class C104964c0 implements C1256g<IPCVoid> {
        public C104964c0(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$c1 */
    public static final class C104965c1 implements C80916r<IPCVoid, IPCBoolean> {
        private C104965c1() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCBoolean(C105035c.m140879r0().f311762l);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$d */
    public class C104966d implements C1256g<BallInfoListParcel> {

        /* renamed from: d */
        public final /* synthetic */ C112187l f311748d;

        public C104966d(FloatBallServiceProxy floatBallServiceProxy, C112187l lVar) {
            this.f311748d = lVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            List<BallInfo> list;
            BallInfoListParcel ballInfoListParcel = (BallInfoListParcel) obj;
            if (ballInfoListParcel == null || (list = ballInfoListParcel.f311737d) == null || list.isEmpty()) {
                C112187l lVar = this.f311748d;
                if (lVar != null) {
                    lVar.mo61051a(new ArrayList());
                    return;
                }
                return;
            }
            C112187l lVar2 = this.f311748d;
            if (lVar2 != null) {
                lVar2.mo61051a(ballInfoListParcel.f311737d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$d0 */
    public class C104967d0 implements C1256g<IPCVoid> {
        public C104967d0(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$d1 */
    public static final class C104968d1 implements C80883e<BallInfo, IPCVoid> {
        private C104968d1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149147w((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$e */
    public class C104969e implements C1256g<IPCVoid> {
        public C104969e(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$e0 */
    public class C104970e0 implements C1256g<IPCVoid> {
        public C104970e0(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$e1 */
    public static final class C104971e1 implements C80883e<IPCBoolean, IPCVoid> {
        private C104971e1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149105X(((IPCBoolean) obj).f10312d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$f */
    public class C104972f implements C1256g<IPCVoid> {
        public C104972f(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$f0 */
    public class C104973f0 implements C1256g<IPCVoid> {
        public C104973f0(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$f1 */
    public static final class C104974f1 implements C80883e<IPCBoolean, IPCVoid> {
        private C104974f1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149136n0(((IPCBoolean) obj).f10312d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$g */
    public class C104975g implements C1256g<IPCVoid> {
        public C104975g(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$g0 */
    public class C104976g0 implements C1256g<IPCVoid> {
        public C104976g0(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$g1 */
    public static final class C104977g1 implements C80916r<IPCVoid, IPCBoolean> {
        private C104977g1() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCBoolean(C105035c.m140879r0().mo149128j0());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$h */
    public class C104978h implements C1256g<IPCVoid> {
        public C104978h(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$h0 */
    public static final class C104979h0 implements C80883e<BallInfo, IPCVoid> {
        private C104979h0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149095M((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$h1 */
    public static final class C104980h1 implements C80883e<IPCVoid, IPCVoid> {
        private C104980h1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C105035c.m140879r0().mo149146v();
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$i */
    public class C104981i implements C1256g<IPCVoid> {
        public C104981i(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$i0 */
    public static final class C104982i0 implements C80883e<BallInfo, IPCVoid> {
        private C104982i0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            BallInfo ballInfo = (BallInfo) obj;
            if (ballInfo != null) {
                C105034a.m140875a(ballInfo, C105035c.m140879r0().f311751a);
            }
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$i1 */
    public static final class C104983i1 implements C80883e<IPCVoid, IPCVoid> {
        private C104983i1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C105035c.m140879r0().mo149131l();
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$j */
    public class C104984j implements C1256g<IPCVoid> {
        public C104984j(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$j0 */
    public static final class C104985j0 implements C80883e<IPCLong, IPCInteger> {
        private C104985j0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149127j(((IPCLong) obj).f10314d, new C105049q(this, gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$j1 */
    public static final class C104986j1 implements C80883e<IPCVoid, IPCVoid> {
        private C104986j1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C105035c.m140879r0().mo149107Y1();
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$k */
    public class C104987k implements C1256g<IPCInteger> {

        /* renamed from: d */
        public final /* synthetic */ C112181e.C112182a f311749d;

        public C104987k(FloatBallServiceProxy floatBallServiceProxy, C112181e.C112182a aVar) {
            this.f311749d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            C112181e.C112182a aVar = this.f311749d;
            if (aVar != null) {
                aVar.mo57750a(iPCInteger.f10313d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$k0 */
    public static final class C104988k0 implements C80916r<BallInfo, IPCBoolean> {
        private C104988k0() {
        }

        public Object invoke(Object obj) {
            return new IPCBoolean(C105035c.m140879r0().mo149124h0((BallInfo) obj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$k1 */
    public static final class C104989k1 implements C80883e<FloatBallInfoEventReceiverParcel, IPCVoid> {
        private C104989k1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            FloatBallInfoEventReceiverParcel floatBallInfoEventReceiverParcel = (FloatBallInfoEventReceiverParcel) obj;
            C105035c.m140879r0().mo149111b(floatBallInfoEventReceiverParcel.f311738d, floatBallInfoEventReceiverParcel.f311739e);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$l */
    public class C104990l implements C1256g<IPCVoid> {
        public C104990l(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$l0 */
    public static final class C104991l0 implements C80883e<IPCVoid, IPCVoid> {
        private C104991l0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C105035c.m140879r0().mo149139p();
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$l1 */
    public static final class C104992l1 implements C80883e<BallInfo, IPCVoid> {
        private C104992l1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149108Z((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$m */
    public class C104993m implements C1256g<IPCVoid> {
        public C104993m(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$m0 */
    public static final class C104994m0 implements C80883e<BallInfo, IPCVoid> {
        private C104994m0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149083A((BallInfo) obj, true);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$m1 */
    public static final class C104995m1 implements C80883e<BallInfo, IPCVoid> {
        private C104995m1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149119f((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$n */
    public class C104996n implements C1256g<IPCVoid> {
        public C104996n(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$n0 */
    public static final class C104997n0 implements C80883e<BallInfo, IPCVoid> {
        private C104997n0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149172B0((BallInfo) obj, true);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$n1 */
    public static final class C104998n1 implements C80883e<IPCInteger, IPCVoid> {
        private C104998n1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149135n(((IPCInteger) obj).f10313d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$o */
    public class C104999o implements C1256g<IPCVoid> {
        public C104999o(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$o0 */
    public static final class C105000o0 implements C80883e<BallInfo, IPCVoid> {
        private C105000o0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149172B0((BallInfo) obj, false);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$o1 */
    public static final class C105001o1 implements C80883e<IPCBoolean, IPCVoid> {
        private C105001o1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149115d(((IPCBoolean) obj).f10312d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$p */
    public class C105002p implements C1256g<IPCVoid> {
        public C105002p(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$p0 */
    public static final class C105003p0 implements C80883e<BallInfo, IPCVoid> {
        private C105003p0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149088F((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$p1 */
    public static final class C105004p1 implements C80883e<IPCBoolean, IPCVoid> {
        private C105004p1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149097O(((IPCBoolean) obj).f10312d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$q */
    public class C105005q implements C1256g<IPCVoid> {
        public C105005q(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$q0 */
    public static final class C105006q0 implements C80883e<BallInfo, IPCVoid> {
        private C105006q0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149140p0((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$q1 */
    public static final class C105007q1 implements C80883e<IPCInteger, IPCVoid> {
        private C105007q1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().f311768r = ((IPCInteger) obj).f10313d;
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$r */
    public class C105008r implements C1256g<IPCVoid> {
        public C105008r(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$r0 */
    public static final class C105009r0 implements C80883e<IPCVoid, IPCVoid> {
        private C105009r0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C105035c.m140879r0().mo149118e0();
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$r1 */
    public static final class C105010r1 implements C80883e<IPCBoolean, IPCVoid> {
        private C105010r1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149149y(((IPCBoolean) obj).f10312d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$s */
    public class C105011s implements C1256g<IPCVoid> {
        public C105011s(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$s0 */
    public static final class C105012s0 implements C80883e<IPCVoid, BallInfoListParcel> {
        private C105012s0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C105035c r0 = C105035c.m140879r0();
            if (C103925l.m138627a(r0.f311751a)) {
                ArrayList arrayList = new ArrayList(r0.f311751a);
                if (gVar != null) {
                    gVar.mo894a(new BallInfoListParcel((List<BallInfo>) arrayList));
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            if (gVar != null) {
                gVar.mo894a(new BallInfoListParcel((List<BallInfo>) arrayList2));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$s1 */
    public static final class C105013s1 implements C80883e<SetFloatBallAlphaParcel, IPCVoid> {
        private C105013s1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            SetFloatBallAlphaParcel setFloatBallAlphaParcel = (SetFloatBallAlphaParcel) obj;
            C105035c.m140879r0().mo149176F0(setFloatBallAlphaParcel.f311745e, setFloatBallAlphaParcel.f311744d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$t */
    public class C105014t implements C1256g<IPCVoid> {
        public C105014t(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$t0 */
    public static final class C105015t0 implements C80916r<BallInfo, BallInfo> {
        private C105015t0() {
        }

        public Object invoke(Object obj) {
            return C105035c.m140879r0().mo149134m0((BallInfo) obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$t1 */
    public static final class C105016t1 implements C80883e<ResultReceiver, IPCVoid> {
        private C105016t1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149093K((ResultReceiver) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$u */
    public class C105017u implements C1256g<IPCVoid> {
        public C105017u(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$u0 */
    public static final class C105018u0 implements C80916r<IPCVoid, Point> {
        private C105018u0() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return C105035c.m140879r0().mo149129k();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$u1 */
    public static final class C105019u1 implements C80883e<BallInfo, IPCVoid> {
        private C105019u1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149109a((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$v */
    public class C105020v implements C1256g<IPCVoid> {
        public C105020v(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$v0 */
    public static final class C105021v0 implements C80883e<IPCBoolean, IPCVoid> {
        private C105021v0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149181t0(((IPCBoolean) obj).f10312d, (AnimatorListenerAdapter) null);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$v1 */
    public static final class C105022v1 implements C80883e<BallInfo, IPCVoid> {
        private C105022v1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149110a0((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$w */
    public class C105023w implements C1256g<IPCVoid> {
        public C105023w(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$w0 */
    public static final class C105024w0 implements C80883e<IPCBoolean, IPCVoid> {
        private C105024w0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149086D(((IPCBoolean) obj).f10312d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$w1 */
    public static final class C105025w1 implements C80883e<UpdateBallVisibilityParcel, IPCVoid> {
        private C105025w1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            UpdateBallVisibilityParcel updateBallVisibilityParcel = (UpdateBallVisibilityParcel) obj;
            C105035c.m140879r0().mo149103V(updateBallVisibilityParcel.f311747e, updateBallVisibilityParcel.f311746d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$x */
    public class C105026x implements C1256g<IPCVoid> {
        public C105026x(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$x0 */
    public static final class C105027x0 implements C80883e<IPCBoolean, IPCVoid> {
        private C105027x0() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149121g(((IPCBoolean) obj).f10312d);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$x1 */
    public static final class C105028x1 implements C80883e<IPCKeyBoardChangedInfo, IPCVoid> {
        private C105028x1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCKeyBoardChangedInfo iPCKeyBoardChangedInfo = (IPCKeyBoardChangedInfo) obj;
            C105035c.m140879r0().mo149094L(iPCKeyBoardChangedInfo.f311740d, iPCKeyBoardChangedInfo.f311741e, iPCKeyBoardChangedInfo.f311742f, iPCKeyBoardChangedInfo.f311743g);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$y */
    public class C105029y implements C1256g<IPCVoid> {
        public C105029y(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$y0 */
    public static final class C105030y0 implements C80916r<IPCInteger, IPCBoolean> {
        private C105030y0() {
        }

        public Object invoke(Object obj) {
            boolean z;
            C105035c r0 = C105035c.m140879r0();
            int i = ((IPCInteger) obj).f10313d;
            if (C103925l.m138627a(r0.f311751a)) {
                Iterator it = ((CopyOnWriteArrayList) r0.f311751a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BallInfo ballInfo = (BallInfo) it.next();
                    if (ballInfo.f311686d == i && !ballInfo.f311681F) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            return new IPCBoolean(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$y1 */
    public static final class C105031y1 implements C80883e<BallInfo, IPCVoid> {
        private C105031y1() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C105035c.m140879r0().mo149178H0((BallInfo) obj);
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$z */
    public class C105032z implements C1256g<IPCVoid> {
        public C105032z(FloatBallServiceProxy floatBallServiceProxy) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$z0 */
    public static final class C105033z0 implements C80916r<IPCVoid, IPCBoolean> {
        private C105033z0() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCBoolean(C105035c.m140879r0().f311761k);
        }
    }

    /* renamed from: A */
    public void mo149083A(BallInfo ballInfo, boolean z) {
    }

    /* renamed from: B */
    public boolean mo149084B() {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C104962b1.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    /* renamed from: C */
    public void mo149085C(BallInfo ballInfo) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "updateBallBlurInfo not implemented in non-MM process");
    }

    /* renamed from: D */
    public void mo149086D(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C105024w0.class, new C104961b0(this));
    }

    /* renamed from: E */
    public void mo149087E(BallInfo ballInfo) {
        if (ballInfo != null) {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C104982i0.class, new C105020v(this));
        }
    }

    /* renamed from: F */
    public void mo149088F(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C105003p0.class, new C105005q(this));
    }

    /* renamed from: G */
    public void mo149089G(int i, C112185h hVar) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "removeFloatBallInfoEventListener not implemented in non-MM process");
    }

    /* renamed from: H */
    public boolean mo149090H() {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C104965c1.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    /* renamed from: I */
    public List<BallInfo> mo149091I() {
        return null;
    }

    /* renamed from: J */
    public void mo149092J(C112184g gVar) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "addFloatBallInfoChangedListener not implemented in non-MM process");
    }

    /* renamed from: K */
    public void mo149093K(ResultReceiver resultReceiver) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, resultReceiver, C105016t1.class, new C105017u(this));
    }

    /* renamed from: L */
    public void mo149094L(int i, int i2, boolean z, long j) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCKeyBoardChangedInfo(i, i2, z, j), C105028x1.class, new C104960b(this));
    }

    /* renamed from: M */
    public void mo149095M(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C104979h0.class, new C104969e(this));
    }

    /* renamed from: N */
    public boolean mo149096N(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "updateBallVisibilityByPosition not implemented in non-MM process");
        return false;
    }

    /* renamed from: O */
    public void mo149097O(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C105004p1.class, new C104964c0(this));
    }

    /* renamed from: Q */
    public void mo149098Q(View view) {
    }

    /* renamed from: R */
    public void mo149099R(long j) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "markEnterChattingUI not implemented in non-MM process");
    }

    /* renamed from: S */
    public void mo149100S(BallInfo ballInfo, AnimatorListenerAdapter animatorListenerAdapter) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "switchVoipVoice not implemented in non-MM process");
    }

    /* renamed from: T */
    public void mo149101T(int i, C112185h hVar) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "addFloatBallInfoEventListener not implemented in non-MM process");
    }

    /* renamed from: U */
    public void mo149102U(C112184g gVar) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "removeFloatBallInfoChangedListener not implemented in non-MM process");
    }

    /* renamed from: V */
    public void mo149103V(BallInfo ballInfo, boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new UpdateBallVisibilityParcel(z, ballInfo), C105025w1.class, new C105023w(this));
    }

    /* renamed from: W */
    public void mo149104W(boolean z) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "markNeedProcessFloatViewLayoutParamsFlag not implemented in non-MM process");
    }

    /* renamed from: X */
    public void mo149105X(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C104971e1.class, new C104976g0(this));
    }

    /* renamed from: Y */
    public Point mo149106Y(int i, Point point) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "getFloatBallPositionForAnimation not implemented in non-MM process");
        return null;
    }

    /* renamed from: Y1 */
    public void mo149107Y1() {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C104986j1.class, new C104963c(this));
    }

    /* renamed from: Z */
    public void mo149108Z(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C104992l1.class, new C104975g(this));
    }

    /* renamed from: a */
    public void mo149109a(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C105019u1.class, new C105026x(this));
    }

    /* renamed from: a0 */
    public void mo149110a0(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C105022v1.class, new C104972f(this));
    }

    /* renamed from: b */
    public void mo149111b(BallInfo ballInfo, ResultReceiver resultReceiver) {
        Boolean bool = C103925l.f307288a;
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new FloatBallInfoEventReceiverParcel(ballInfo, (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain)), C104989k1.class, new C105008r(this));
    }

    /* renamed from: b0 */
    public void mo149112b0(float f) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "updateFloatBallViewAlpha not implemented in non-MM process");
    }

    /* renamed from: c */
    public void mo149113c(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C105021v0.class, new C105014t(this));
    }

    /* renamed from: c0 */
    public void mo149114c0(C112187l lVar) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C105012s0.class, new C104966d(this, lVar));
    }

    /* renamed from: d */
    public void mo149115d(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C105001o1.class, new C104958a0(this));
    }

    /* renamed from: d0 */
    public void mo149116d0(C112186j jVar) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "addFloatBallViewListener not implemented in non-MM process");
    }

    /* renamed from: e */
    public void mo149117e(int i) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCInteger(i), C105007q1.class, new C105032z(this));
    }

    /* renamed from: e0 */
    public void mo149118e0() {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C105009r0.class, new C104957a(this));
    }

    /* renamed from: f */
    public void mo149119f(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C104995m1.class, new C105011s(this));
    }

    /* renamed from: f0 */
    public boolean mo149120f0() {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C105033z0.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    /* renamed from: g */
    public void mo149121g(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C105027x0.class, new C104967d0(this));
    }

    /* renamed from: g0 */
    public void mo149122g0(boolean z) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "setAnimatingPageAnimation not implemented in non-MM process");
    }

    /* renamed from: h */
    public void mo149123h(boolean z) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "showCustomBallView not implemented in non-MM process");
    }

    /* renamed from: h0 */
    public boolean mo149124h0(BallInfo ballInfo) {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, ballInfo, C104988k0.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    /* renamed from: i */
    public void mo149125i(int i) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "removeFloatBallViewLayoutParamsFlag not implemented in non-MM process");
    }

    /* renamed from: i0 */
    public void mo149126i0(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C105000o0.class, new C105002p(this));
    }

    /* renamed from: j */
    public void mo149127j(long j, C112181e.C112182a aVar) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCLong(j), C104985j0.class, new C104987k(this, aVar));
    }

    /* renamed from: j0 */
    public boolean mo149128j0() {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C104977g1.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    /* renamed from: k */
    public Point mo149129k() {
        return (Point) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C105018u0.class);
    }

    /* renamed from: k0 */
    public void mo149130k0() {
    }

    /* renamed from: l */
    public void mo149131l() {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C104983i1.class, new C104973f0(this));
    }

    /* renamed from: l0 */
    public void mo149132l0() {
    }

    /* renamed from: m */
    public long mo149133m() {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "getEnterChattingUITimestamp not implemented in non-MM process");
        return 0;
    }

    /* renamed from: m0 */
    public BallInfo mo149134m0(BallInfo ballInfo) {
        return (BallInfo) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, ballInfo, C105015t0.class);
    }

    /* renamed from: n */
    public void mo149135n(int i) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCInteger(i), C104998n1.class, new C104990l(this));
    }

    /* renamed from: n0 */
    public void mo149136n0(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C104974f1.class, new C104984j(this));
    }

    /* renamed from: o */
    public Point mo149137o() {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "getCurrentCustomBallSize not implemented in non-MM process");
        return null;
    }

    /* renamed from: o0 */
    public Set<C112186j> mo149138o0() {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "getFloatBallViewListeners not implemented in non-MM process");
        return null;
    }

    /* renamed from: p */
    public void mo149139p() {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C104991l0.class, new C104981i(this));
    }

    /* renamed from: p0 */
    public void mo149140p0(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C105006q0.class, new C104996n(this));
    }

    /* renamed from: q */
    public void mo149141q(boolean z) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "markForceHideAllFloatBall not implemented in non-MM process");
    }

    /* renamed from: r */
    public void mo149142r(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C104994m0.class, new C104993m(this));
    }

    /* renamed from: s */
    public void mo149143s(int i) {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "addFloatBallViewLayoutParamsFlag not implemented in non-MM process");
    }

    /* renamed from: t */
    public void mo149144t() {
    }

    /* renamed from: u */
    public boolean mo149145u() {
        Log.m105928w("MicroMsg.FloatBallServiceProxy", "isFloatBallViewDockLeft not implemented in non-MM process");
        return false;
    }

    /* renamed from: v */
    public void mo149146v() {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C104980h1.class, new C104970e0(this));
    }

    /* renamed from: w */
    public void mo149147w(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C104968d1.class, new C104978h(this));
    }

    /* renamed from: x */
    public List<BallInfo> mo149148x() {
        return null;
    }

    /* renamed from: y */
    public void mo149149y(boolean z) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCBoolean(z), C105010r1.class, new C105029y(this));
    }

    /* renamed from: z */
    public void mo149150z(BallInfo ballInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, ballInfo, C104997n0.class, new C104999o(this));
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel */
    public static class BallInfoListParcel implements Parcelable {
        public static final Parcelable.Creator<BallInfoListParcel> CREATOR = new C104952a();

        /* renamed from: d */
        public List<BallInfo> f311737d;

        /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel$a */
        public class C104952a implements Parcelable.Creator<BallInfoListParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new BallInfoListParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new BallInfoListParcel[i];
            }
        }

        public BallInfoListParcel(List<BallInfo> list) {
            this.f311737d = list;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f311737d);
        }

        public BallInfoListParcel(Parcel parcel) {
            this.f311737d = parcel.createTypedArrayList(BallInfo.CREATOR);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$FloatBallInfoEventReceiverParcel */
    public static final class FloatBallInfoEventReceiverParcel implements Parcelable {
        public static final Parcelable.Creator<FloatBallInfoEventReceiverParcel> CREATOR = new C104953a();

        /* renamed from: d */
        public BallInfo f311738d;

        /* renamed from: e */
        public ResultReceiver f311739e;

        /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$FloatBallInfoEventReceiverParcel$a */
        public class C104953a implements Parcelable.Creator<FloatBallInfoEventReceiverParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new FloatBallInfoEventReceiverParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new FloatBallInfoEventReceiverParcel[i];
            }
        }

        public FloatBallInfoEventReceiverParcel(BallInfo ballInfo, ResultReceiver resultReceiver) {
            this.f311738d = ballInfo;
            this.f311739e = resultReceiver;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f311738d, i);
            parcel.writeParcelable(this.f311739e, i);
        }

        public FloatBallInfoEventReceiverParcel(Parcel parcel) {
            this.f311738d = (BallInfo) parcel.readParcelable(BallInfo.class.getClassLoader());
            this.f311739e = (ResultReceiver) parcel.readParcelable(ResultReceiver.class.getClassLoader());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$UpdateBallVisibilityParcel */
    public static class UpdateBallVisibilityParcel implements Parcelable {
        public static final Parcelable.Creator<UpdateBallVisibilityParcel> CREATOR = new C104956a();

        /* renamed from: d */
        public boolean f311746d;

        /* renamed from: e */
        public BallInfo f311747e;

        /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$UpdateBallVisibilityParcel$a */
        public class C104956a implements Parcelable.Creator<UpdateBallVisibilityParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new UpdateBallVisibilityParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new UpdateBallVisibilityParcel[i];
            }
        }

        public UpdateBallVisibilityParcel(boolean z, BallInfo ballInfo) {
            this.f311746d = z;
            this.f311747e = ballInfo;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f311746d ? (byte) 1 : 0);
            parcel.writeParcelable(this.f311747e, i);
        }

        public UpdateBallVisibilityParcel(Parcel parcel) {
            this.f311746d = parcel.readByte() != 0;
            this.f311747e = (BallInfo) parcel.readParcelable(BallInfo.class.getClassLoader());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$IPCKeyBoardChangedInfo */
    public static class IPCKeyBoardChangedInfo implements Parcelable {
        public static final Parcelable.Creator<IPCKeyBoardChangedInfo> CREATOR = new C104954a();

        /* renamed from: d */
        public int f311740d;

        /* renamed from: e */
        public int f311741e;

        /* renamed from: f */
        public boolean f311742f;

        /* renamed from: g */
        public long f311743g;

        /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$IPCKeyBoardChangedInfo$a */
        public class C104954a implements Parcelable.Creator<IPCKeyBoardChangedInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCKeyBoardChangedInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCKeyBoardChangedInfo[i];
            }
        }

        public IPCKeyBoardChangedInfo(int i, int i2, boolean z, long j) {
            this.f311740d = i;
            this.f311741e = i2;
            this.f311742f = z;
            this.f311743g = j;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f311740d);
            parcel.writeInt(this.f311741e);
            parcel.writeByte(this.f311742f ? (byte) 1 : 0);
            parcel.writeLong(this.f311743g);
        }

        public IPCKeyBoardChangedInfo(Parcel parcel) {
            this.f311740d = parcel.readInt();
            this.f311741e = parcel.readInt();
            this.f311742f = parcel.readByte() != 0;
            this.f311743g = parcel.readLong();
        }
    }
}
