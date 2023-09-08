package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl */
public final class WxaCommLibV8SnapshotClientImpl implements C84867u {

    /* renamed from: d */
    public static final WxaCommLibV8SnapshotClientImpl f247258d = new WxaCommLibV8SnapshotClientImpl();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams */
    public static final class QuerySnapshotInfoParams implements Parcelable {
        public static final Parcelable.Creator<QuerySnapshotInfoParams> CREATOR = new C84821a();

        /* renamed from: d */
        public final ICommLibReader f247259d;

        /* renamed from: e */
        public final C84872v0 f247260e;

        /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams$a */
        public static final class C84821a implements Parcelable.Creator<QuerySnapshotInfoParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                ICommLibReader iCommLibReader = (ICommLibReader) parcel.readParcelable(QuerySnapshotInfoParams.class.getClassLoader());
                String readString = parcel.readString();
                return new QuerySnapshotInfoParams(iCommLibReader, readString != null ? C84872v0.f247376f.mo117626a(readString) : null);
            }

            public Object[] newArray(int i) {
                return new QuerySnapshotInfoParams[i];
            }
        }

        public QuerySnapshotInfoParams(ICommLibReader iCommLibReader, C84872v0 v0Var) {
            C87412m.m108594g(iCommLibReader, "reader");
            C87412m.m108594g(v0Var, "category");
            this.f247259d = iCommLibReader;
            this.f247260e = v0Var;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeParcelable(this.f247259d, i);
            C84872v0 v0Var = this.f247260e;
            parcel.writeString(v0Var != null ? v0Var.f247381d : null);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", "kotlin.jvm.PlatformType", "snapshotInfo", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;)Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$a */
    public static final class C84822a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C84822a<InputType, ResultType> f247261a = new C84822a<>();

        public Object invoke(Object obj) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) obj;
            C84871v vVar = (C84871v) C86312j.m106911c(C84871v.class);
            if (vVar == null) {
                return null;
            }
            C87412m.m108593f(wxaPkgV8SnapshotInfo, "snapshotInfo");
            vVar.U00(wxaPkgV8SnapshotInfo);
            return C13598b0.f38549a;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", "kotlin.jvm.PlatformType", "snapshotInfo", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;)Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$b */
    public static final class C84823b<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C84823b<InputType, ResultType> f247262a = new C84823b<>();

        public Object invoke(Object obj) {
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) obj;
            C84871v vVar = (C84871v) C86312j.m106911c(C84871v.class);
            if (vVar == null) {
                return null;
            }
            C87412m.m108593f(wxaPkgV8SnapshotInfo, "snapshotInfo");
            vVar.mo117585hf(wxaPkgV8SnapshotInfo);
            return C13598b0.f38549a;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$c */
    public static final class C84824c<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C84824c<InputType, ResultType> f247263a = new C84824c<>();

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C84871v vVar = (C84871v) C86312j.m106911c(C84871v.class);
            if (vVar != null) {
                return vVar.mo117587mZ();
            }
            return null;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", "params", "Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams;", "kotlin.jvm.PlatformType", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$d */
    public static final class C84825d<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C84825d<InputType, ResultType> f247264a = new C84825d<>();

        public Object invoke(Object obj) {
            QuerySnapshotInfoParams querySnapshotInfoParams = (QuerySnapshotInfoParams) obj;
            C84871v vVar = (C84871v) C86312j.m106911c(C84871v.class);
            if (vVar != null) {
                return vVar.mo117588nX(querySnapshotInfoParams.f247259d, querySnapshotInfoParams.f247260e);
            }
            return null;
        }
    }

    /* renamed from: KI */
    public WxaPkgV8SnapshotInfo mo117543KI(ICommLibReader iCommLibReader, C84872v0 v0Var) {
        C87412m.m108594g(iCommLibReader, "reader");
        C87412m.m108594g(v0Var, "category");
        C84840f0 f0Var = C84840f0.f247297a;
        f0Var.getClass();
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = null;
        if (C84840f0.f247299c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!f0Var.mo117576h(iCommLibReader, v0Var)) {
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableSnapshotInfo, ban by config");
                return null;
            }
            try {
                WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = (WxaPkgV8SnapshotInfo) C15618a.m14628d(new QuerySnapshotInfoParams(iCommLibReader, v0Var), C84825d.f247264a);
                if (wxaPkgV8SnapshotInfo2 != null) {
                    if (!wxaPkgV8SnapshotInfo2.mo117551a(iCommLibReader, f0Var.mo117577i(iCommLibReader, v0Var))) {
                        wxaPkgV8SnapshotInfo2 = null;
                    }
                    if (wxaPkgV8SnapshotInfo2 != null) {
                        C84876x xVar = C84876x.f247386a;
                        f0Var.getClass();
                        xVar.mo117628a(C84840f0.f247315s);
                        wxaPkgV8SnapshotInfo = wxaPkgV8SnapshotInfo2;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e, "queryUsableSnapshotInfo failure", new Object[0]);
            }
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotCommons", "queryUsableSnapshotInfo" + " cost " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            return wxaPkgV8SnapshotInfo;
        } else if (!f0Var.mo117576h(iCommLibReader, v0Var)) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableSnapshotInfo, ban by config");
            return null;
        } else {
            try {
                WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo3 = (WxaPkgV8SnapshotInfo) C15618a.m14628d(new QuerySnapshotInfoParams(iCommLibReader, v0Var), C84825d.f247264a);
                if (wxaPkgV8SnapshotInfo3 == null) {
                    return null;
                }
                if (!wxaPkgV8SnapshotInfo3.mo117551a(iCommLibReader, f0Var.mo117577i(iCommLibReader, v0Var))) {
                    wxaPkgV8SnapshotInfo3 = null;
                }
                if (wxaPkgV8SnapshotInfo3 == null) {
                    return null;
                }
                C84876x xVar2 = C84876x.f247386a;
                f0Var.getClass();
                xVar2.mo117628a(C84840f0.f247315s);
                return wxaPkgV8SnapshotInfo3;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e2, "queryUsableSnapshotInfo failure", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: Tf */
    public WxaPkgV8SnapshotInfo mo117544Tf() {
        C84840f0 f0Var = C84840f0.f247297a;
        f0Var.getClass();
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = null;
        if (!C84840f0.f247299c) {
            NodeFakeCommLibReader nodeFakeCommLibReader = new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null);
            if (!f0Var.mo117577i(nodeFakeCommLibReader, C84872v0.NODE)) {
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableNodeOnlySnapshotInfo, ban by config");
                return null;
            }
            try {
                WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = (WxaPkgV8SnapshotInfo) C15618a.m14628d(IPCVoid.f10316d, C84824c.f247263a);
                if (wxaPkgV8SnapshotInfo2 == null) {
                    return null;
                }
                if (!wxaPkgV8SnapshotInfo2.mo117551a(nodeFakeCommLibReader, true)) {
                    wxaPkgV8SnapshotInfo2 = null;
                }
                if (wxaPkgV8SnapshotInfo2 == null) {
                    return null;
                }
                C84876x xVar = C84876x.f247386a;
                f0Var.getClass();
                xVar.mo117628a(C84840f0.f247315s);
                return wxaPkgV8SnapshotInfo2;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e, "queryUsableNodeOnlySnapshotInfo failure", new Object[0]);
                return null;
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            NodeFakeCommLibReader nodeFakeCommLibReader2 = new NodeFakeCommLibReader((IPkgInfo) null, 1, (C8480h) null);
            if (!f0Var.mo117577i(nodeFakeCommLibReader2, C84872v0.NODE)) {
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableNodeOnlySnapshotInfo, ban by config");
                return null;
            }
            try {
                WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo3 = (WxaPkgV8SnapshotInfo) C15618a.m14628d(IPCVoid.f10316d, C84824c.f247263a);
                if (wxaPkgV8SnapshotInfo3 != null) {
                    if (!wxaPkgV8SnapshotInfo3.mo117551a(nodeFakeCommLibReader2, true)) {
                        wxaPkgV8SnapshotInfo3 = null;
                    }
                    if (wxaPkgV8SnapshotInfo3 != null) {
                        C84876x xVar2 = C84876x.f247386a;
                        f0Var.getClass();
                        xVar2.mo117628a(C84840f0.f247315s);
                        wxaPkgV8SnapshotInfo = wxaPkgV8SnapshotInfo3;
                    }
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e2, "queryUsableNodeOnlySnapshotInfo failure", new Object[0]);
            }
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotCommons", "queryUsableNodeOnlySnapshotInfo" + " cost " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            return wxaPkgV8SnapshotInfo;
        }
    }

    public void i30(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C15618a.m14628d(wxaPkgV8SnapshotInfo, C84823b.f247262a);
    }

    public void rj0(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        C15618a.m14628d(wxaPkgV8SnapshotInfo, C84822a.f247261a);
    }
}
