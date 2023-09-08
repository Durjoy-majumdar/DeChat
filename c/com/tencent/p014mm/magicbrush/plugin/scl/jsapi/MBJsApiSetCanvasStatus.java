package com.tencent.p014mm.magicbrush.plugin.scl.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C7596h;
import e42.C86430i;
import g70.C8239c;
import g70.C8240k;
import g70.C87164i;
import gy3.C87412m;
import h70.C87459d;
import i70.C87666b;
import i70.C87667c;
import java.util.HashSet;
import kotlin.Metadata;
import q20.C89449a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus */
public final class MBJsApiSetCanvasStatus extends C86430i<C8239c> {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/MBJsApiSetCanvasStatus$IPCData;", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData */
    public static final class IPCData implements Parcelable {
        public static final Parcelable.Creator<IPCData> CREATOR = new C1275a();

        /* renamed from: d */
        public final String f10364d;

        /* renamed from: e */
        public final int f10365e;

        /* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData$a */
        public static final class C1275a implements Parcelable.Creator<IPCData> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new IPCData(parcel.readString(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new IPCData[i];
            }
        }

        public IPCData(String str, int i) {
            C87412m.m108594g(str, "frameSetId");
            this.f10364d = str;
            this.f10365e = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IPCData)) {
                return false;
            }
            IPCData iPCData = (IPCData) obj;
            return C87412m.m108589b(this.f10364d, iPCData.f10364d) && this.f10365e == iPCData.f10365e;
        }

        public int hashCode() {
            return (this.f10364d.hashCode() * 31) + this.f10365e;
        }

        public String toString() {
            return "IPCData(frameSetId=" + this.f10364d + ", canvasId=" + this.f10365e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f10364d);
            parcel.writeInt(this.f10365e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/MBJsApiSetCanvasStatus$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/MBJsApiSetCanvasStatus$IPCData;", "Lrx3/b0;", "<init>", "()V", "mb-plugin-scl-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$a */
    public static final class C1276a implements C80883e<IPCData, C13598b0> {
        public void invoke(Object obj, C1256g gVar) {
            C13598b0 b0Var;
            IPCData iPCData = (IPCData) obj;
            if (iPCData != null) {
                C87164i uo = ((C87459d) C86312j.m106911c(C87459d.class)).mo58574uo(iPCData.f10364d);
                if (uo != null) {
                    int i = iPCData.f10365e;
                    Log.m105924i("MicroMsg.MagicSclFrameSet", "bindWithCanvasId " + uo + ' ' + i);
                    uo.f252789e.add(Integer.valueOf(i));
                    C87667c<?, ?>.a aVar = uo.f252787c;
                    if (aVar != null) {
                        HashSet<Integer> hashSet = uo.f252789e;
                        String p0 = aVar.f253932g.mo122096p0();
                        Log.m105924i(p0, "notifyCanvasAndFrameSet " + uo + " ids:" + C8240k.m8315a(hashSet) + " canvasViews size:" + aVar.f253932g.f253920g.f253937a.size());
                        CommonKt.uiThread(new C87666b(hashSet, aVar.f253932g, uo));
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    Log.m105928w("MBJsApiSetCanvasStatus", "frameSet not found!");
                }
            }
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "setCanvasStatus";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        String str;
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("bizName");
        String optString2 = hVar.optString("frameSetId");
        int optInt = hVar.optInt("canvasId");
        Log.m105924i("MBJsApiSetCanvasStatus", "canvasId:" + optInt + ",frameSetId:" + optString2);
        if (!(optString2 == null || optString2.length() == 0)) {
            C8239c cVar = (C8239c) this.f251227a;
            C13598b0 b0Var = null;
            if (cVar != null) {
                C87412m.m108593f(optString, "bizName");
                str = cVar.mo9281f0(optInt, optString);
            } else {
                str = null;
            }
            if (str != null) {
                C87412m.m108593f(optString2, "frameSetId");
                XIPCInvoker.m98748a(str, new IPCData(optString2, optInt), C1276a.class, (C1256g) null);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105928w("MBJsApiSetCanvasStatus", "processName invalid");
            }
        }
        mo120840p().invoke(mo120844i());
    }
}
