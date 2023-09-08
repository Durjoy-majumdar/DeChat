package f02;

import android.os.Bundle;
import c02.C28462d;
import c02.C92331c;
import com.tencent.mapsdk.internal.C0939el;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.config.GetOnLineInfoInfoResult;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86301e;
import ei3.C86522b;
import f02.C31862o;
import g02.C32290b;
import g02.C32291d;
import g02.C32293e;
import g02.C32294f;
import g02.C8225c;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;

@C86522b(creator = C31862o.C31863a.class, dependencies = {C28462d.class}, onProcess = {C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI})
/* renamed from: f02.n */
public final class C31822n extends C86301e implements C92331c {

    /* renamed from: d */
    public static final C31822n f84892d = new C31822n();

    /* renamed from: e */
    public static GetOnLineInfoInfoResult f84893e;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$a */
    public static final class C31823a implements C80883e<BallInfo, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            BallInfo ballInfo = (BallInfo) obj;
            C87412m.m108594g(ballInfo, "ballInfo");
            C31790e eVar = C31790e.f84852d;
            eVar.getClass();
            HandOff xx02 = C31790e.xx0(ballInfo);
            if (xx02 != null) {
                xx02.setHandOffType(1);
                int i = ballInfo.f311686d;
                int i2 = 2;
                if (i == 1) {
                    i2 = 3;
                } else if (i != 2) {
                    i2 = 1;
                }
                xx02.setKey(HandOff.Companion.mo57158a(i2, 1));
                eVar.Gg0(xx02);
            }
        }
    }

    /* renamed from: f02.n$a0 */
    public static final class C31824a0<T> implements C1256g {

        /* renamed from: d */
        public static final C31824a0<T> f84894d = new C31824a0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$b */
    public static final class C31825b implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.wx0(handOff);
        }
    }

    /* renamed from: f02.n$b0 */
    public static final class C31826b0<T> implements C1256g {

        /* renamed from: d */
        public static final C31826b0<T> f84895d = new C31826b0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$c;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$c */
    public static final class C31827c implements C80883e<BallInfo, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            BallInfo ballInfo = (BallInfo) obj;
            C87412m.m108594g(ballInfo, "ballInfo");
            C31790e.f84852d.Ll0(ballInfo);
        }
    }

    /* renamed from: f02.n$c0 */
    public static final class C31828c0<T> implements C1256g {

        /* renamed from: d */
        public static final C31828c0<T> f84896d = new C31828c0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lf02/n$d;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$d */
    public static final class C31829d implements C80883e<IPCVoid, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C31790e.f84852d.m50();
        }
    }

    /* renamed from: f02.n$d0 */
    public static final class C31830d0<T> implements C1256g {

        /* renamed from: d */
        public static final C31830d0<T> f84897d = new C31830d0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$e;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$e */
    public static final class C31831e implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "id");
            C87412m.m108594g(gVar, "callback");
            C31790e eVar = C31790e.f84852d;
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "id.value");
            eVar.oq0(str);
        }
    }

    /* renamed from: f02.n$e0 */
    public static final class C31832e0<T> implements C1256g {

        /* renamed from: d */
        public static final C31832e0<T> f84898d = new C31832e0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lf02/n$f;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$f */
    public static final class C31833f implements C80883e<IPCVoid, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C31790e.f84852d.Bx0(C31814i.f84883d);
        }
    }

    /* renamed from: f02.n$f0 */
    public static final class C31834f0<T> implements C1256g {

        /* renamed from: d */
        public static final C31834f0<T> f84899d = new C31834f0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$g;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$g */
    public static final class C31835g implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "key");
            C31790e eVar = C31790e.f84852d;
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "key.value");
            eVar.mo58349Bn(str);
        }
    }

    /* renamed from: f02.n$g0 */
    public static final class C31836g0<T> implements C1256g {

        /* renamed from: d */
        public static final C31836g0<T> f84900d = new C31836g0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lf02/n$h;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$h */
    public static final class C31837h implements C80883e<IPCVoid, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C31790e.f84852d.mo58353Fi();
        }
    }

    /* renamed from: f02.n$h0 */
    public static final class C31838h0<T> implements C1256g {

        /* renamed from: d */
        public static final C31838h0<T> f84901d = new C31838h0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$i;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$i */
    public static final class C31839i implements C80916r<IPCVoid, HandOff> {
        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C31790e.f84852d.getClass();
            return C31790e.f84853e;
        }
    }

    /* renamed from: f02.n$i0 */
    public static final class C31840i0<T> implements C1256g {

        /* renamed from: d */
        public static final C31840i0<T> f84902d = new C31840i0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$j;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$j */
    public static final class C31841j implements C80916r<IPCString, HandOff> {
        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "id");
            C31790e eVar = C31790e.f84852d;
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "id.value");
            return eVar.mo58364cv(str);
        }
    }

    /* renamed from: f02.n$j0 */
    public static final class C31842j0<T> implements C1256g {

        /* renamed from: d */
        public static final C31842j0<T> f84903d = new C31842j0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$k;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$k */
    public static final class C31843k implements C80916r<IPCString, HandOff> {
        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "key");
            C31790e eVar = C31790e.f84852d;
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "key.value");
            return eVar.lt0(str);
        }
    }

    /* renamed from: f02.n$k0 */
    public static final class C31844k0<T> implements C1256g {

        /* renamed from: d */
        public static final C31844k0<T> f84904d = new C31844k0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$l;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$l */
    public static final class C31845l implements C80883e<BallInfo, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            BallInfo ballInfo = (BallInfo) obj;
            C87412m.m108594g(ballInfo, "ballInfo");
            C31790e eVar = C31790e.f84852d;
            eVar.getClass();
            HandOff xx02 = C31790e.xx0(ballInfo);
            if (xx02 != null) {
                eVar.Ax0(xx02);
            }
        }
    }

    /* renamed from: f02.n$l0 */
    public static final class C31846l0<T> implements C1256g {

        /* renamed from: d */
        public static final C31846l0<T> f84905d = new C31846l0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$m;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$m */
    public static final class C31847m implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.Ax0(handOff);
        }
    }

    /* renamed from: f02.n$m0 */
    public static final class C31848m0<T> implements C1256g {

        /* renamed from: d */
        public static final C31848m0<T> f84906d = new C31848m0<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$n;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$n */
    public static final class C31849n implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.mo58377tt(handOff);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$o;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$o */
    public static final class C31850o implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.A70(handOff);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$p;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$p */
    public static final class C31851p implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.mo58361Xv(handOff);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$q;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$q */
    public static final class C31852q implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.co0(handOff);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$r;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$r */
    public static final class C31853r implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.k00(handOff);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$s;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$s */
    public static final class C31854s implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            C31790e.f84852d.mo58375rt((HandOff) obj);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$t;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$t */
    public static final class C31855t implements C80883e<Bundle, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            String string = bundle.getString("id");
            C87412m.m108591d(string);
            String string2 = bundle.getString("arg");
            C87412m.m108591d(string2);
            C31790e.f84852d.zw0(string, string2);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$u;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$u */
    public static final class C31856u implements C80883e<Bundle, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            String string = bundle.getString("id");
            C87412m.m108591d(string);
            String string2 = bundle.getString("cdnURL");
            C87412m.m108591d(string2);
            String string3 = bundle.getString("aesKey");
            C87412m.m108591d(string3);
            C31790e.f84852d.Eq0(string, string2, string3);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$v;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$v */
    public static final class C31857v implements C80883e<Bundle, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            String string = bundle.getString("id");
            C87412m.m108591d(string);
            String string2 = bundle.getString("appId");
            C87412m.m108591d(string2);
            int i = bundle.getInt(C0939el.f2175e);
            String string3 = bundle.getString("mediaId");
            C87412m.m108591d(string3);
            C31790e.f84852d.x20(string, string2, i, string3);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$w;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$w */
    public static final class C31858w implements C80916r<Bundle, IPCBoolean> {
        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            String string = bundle.getString("id");
            C87412m.m108591d(string);
            return new IPCBoolean(C31790e.f84852d.sc0(string, bundle.getLong("uploadedSize")));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/n$x;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.n$x */
    public static final class C31859x implements C80883e<HandOff, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            HandOff handOff = (HandOff) obj;
            C87412m.m108594g(handOff, "handOff");
            C31790e.f84852d.Gg0(handOff);
        }
    }

    /* renamed from: f02.n$y */
    public static final class C31860y<T> implements C1256g {

        /* renamed from: d */
        public static final C31860y<T> f84907d = new C31860y<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: f02.n$z */
    public static final class C31861z<T> implements C1256g {

        /* renamed from: d */
        public static final C31861z<T> f84908d = new C31861z<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    static {
        GetOnLineInfoInfoResult getOnLineInfoInfoResult = new GetOnLineInfoInfoResult();
        C32294f.f85763a.mo58559a(getOnLineInfoInfoResult);
        f84893e = getOnLineInfoInfoResult;
    }

    public void A70(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, handOff, C31850o.class, C31834f0.f84899d);
    }

    /* renamed from: Bn */
    public void mo58349Bn(String str) {
        C87412m.m108594g(str, "key");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(str), C31835g.class, C31828c0.f84896d);
    }

    public void Cd0(String str) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
    }

    public void Eq0(String str, String str2, String str3) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "cdnURL");
        C87412m.m108594g(str3, "aesKey");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, C32291d.m39668a(C32291d.m39669b("id", str), C32291d.m39669b("cdnURL", str2), C32291d.m39669b("aesKey", str3)), C31856u.class, C31844k0.f84904d);
    }

    /* renamed from: Fi */
    public void mo58353Fi() {
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C31837h.class, C31830d0.f84897d);
    }

    public void Gg0(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, handOff, C31859x.class, C31848m0.f84906d);
    }

    /* renamed from: Hk */
    public void mo58355Hk(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
    }

    public void I10(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
    }

    /* renamed from: LH */
    public boolean mo58357LH() {
        C32294f.f85763a.mo58559a(f84893e);
        GetOnLineInfoInfoResult getOnLineInfoInfoResult = f84893e;
        if (getOnLineInfoInfoResult.f80325f) {
            int i = getOnLineInfoInfoResult.f80323d;
            if ((i == 1) && getOnLineInfoInfoResult.f80324e >= 1661009920) {
                return true;
            }
            return (i == 2) && getOnLineInfoInfoResult.f80324e >= 318898176;
        }
    }

    public void Ll0(BallInfo ballInfo) {
        C87412m.m108594g(ballInfo, "ballInfo");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, ballInfo, C31827c.class, C31860y.f84907d);
    }

    /* renamed from: Ls */
    public void mo58359Ls(String str) {
        C87412m.m108594g(str, "key");
    }

    public void V70(List<? extends BallInfo> list) {
        C87412m.m108594g(list, "ballInfoList");
    }

    /* renamed from: Xv */
    public void mo58361Xv(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, handOff, C31851p.class, C31836g0.f84900d);
    }

    /* renamed from: bE */
    public void mo58362bE(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
    }

    public void co0(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, handOff, C31852q.class, C31838h0.f84901d);
    }

    /* renamed from: cv */
    public HandOff mo58364cv(String str) {
        C87412m.m108594g(str, "id");
        return (HandOff) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(str), C31841j.class);
    }

    public boolean f70(String str, C72683d dVar) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(dVar, "info");
        Log.m105928w("HandOffServiceProxy", "uploadStart should only be called in MM process!");
        return false;
    }

    /* renamed from: gP */
    public boolean mo58366gP(BallInfo ballInfo, boolean z) {
        C87412m.m108594g(ballInfo, "ballInfo");
        return false;
    }

    /* renamed from: jO */
    public HandOff mo58367jO() {
        return (HandOff) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C31839i.class);
    }

    public void k00(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, handOff, C31853r.class, C31840i0.f84902d);
    }

    public HandOff lt0(String str) {
        C87412m.m108594g(str, "key");
        return (HandOff) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(str), C31843k.class);
    }

    public void m50() {
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C31829d.class, C31861z.f84908d);
    }

    public void nd0(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
    }

    public void oq0(String str) {
        C87412m.m108594g(str, "id");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(str), C31831e.class, C31826b0.f84895d);
    }

    public void pi0(List<? extends MultiTaskInfo> list) {
        C87412m.m108594g(list, "multiTaskInfoList");
    }

    /* renamed from: qN */
    public void mo58374qN(GetOnLineInfoInfoResult getOnLineInfoInfoResult) {
        C87412m.m108594g(getOnLineInfoInfoResult, "onlineInfo");
        Log.m105924i("HandOffServiceProxy", "notifyUserStatusChange: " + getOnLineInfoInfoResult);
        f84893e = getOnLineInfoInfoResult;
    }

    /* renamed from: rt */
    public void mo58375rt(HandOff handOff) {
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, handOff, C31854s.class, C31824a0.f84894d);
    }

    public boolean sc0(String str, long j) {
        C87412m.m108594g(str, "id");
        return ((IPCBoolean) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, C32291d.m39668a(C32291d.m39669b("id", str), new C32293e(new C8225c("uploadedSize", j))), C31858w.class)).f10312d;
    }

    /* renamed from: tt */
    public void mo58377tt(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, handOff, C31849n.class, C31832e0.f84898d);
    }

    /* renamed from: uG */
    public void mo58378uG(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
    }

    public void x20(String str, String str2, int i, String str3) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(str3, "mediaId");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, C32291d.m39668a(C32291d.m39669b("id", str), C32291d.m39669b("appId", str2), new C32293e(new C32290b(C0939el.f2175e, i)), C32291d.m39669b("mediaId", str3)), C31857v.class, C31846l0.f84905d);
    }

    public void zw0(String str, String str2) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "arg");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, C32291d.m39668a(C32291d.m39669b("id", str), C32291d.m39669b("arg", str2)), C31855t.class, C31842j0.f84903d);
    }
}
