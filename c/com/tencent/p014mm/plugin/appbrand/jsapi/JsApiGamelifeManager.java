package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import il0.C8929e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import p205ms.C11082c;
import p205ms.C11084e;
import p749xh.C53338i4;
import q20.C89449a;
import sx3.C36907w;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager */
public final class JsApiGamelifeManager extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "gamelifeManager";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGamelifeManager$GetGameLifeRedCountData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData */
    public static final class GetGameLifeRedCountData implements Parcelable {
        public static final Parcelable.Creator<GetGameLifeRedCountData> CREATOR = new C1544a();

        /* renamed from: d */
        public final int f10926d;

        /* renamed from: e */
        public final String f10927e;

        /* renamed from: f */
        public final boolean f10928f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData$a */
        public static final class C1544a implements Parcelable.Creator<GetGameLifeRedCountData> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new GetGameLifeRedCountData(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            }

            public Object[] newArray(int i) {
                return new GetGameLifeRedCountData[i];
            }
        }

        public GetGameLifeRedCountData(int i, String str, boolean z) {
            C87412m.m108594g(str, "errmsg");
            this.f10926d = i;
            this.f10927e = str;
            this.f10928f = z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f10926d);
            parcel.writeString(this.f10927e);
            parcel.writeInt(this.f10928f ? 1 : 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGamelifeManager$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGamelifeManager$GetGameLifeRedCountData;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$a */
    public static final class C1545a implements C80883e<IPCVoid, GetGameLifeRedCountData> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Cursor all = ((C11082c) C86312j.m106911c(C11082c.class)).mo10901y2().getAll();
            ArrayList arrayList = new ArrayList();
            all.moveToFirst();
            while (!all.isAfterLast()) {
                C53338i4 i4Var = new C53338i4();
                i4Var.convertFrom(all);
                HashMap hashMap = new HashMap();
                String str = i4Var.field_sessionId;
                C87412m.m108593f(str, "conversation.field_sessionId");
                hashMap.put("sessionId", str);
                hashMap.put("unreadCount", Integer.valueOf(i4Var.field_unReadCount));
                arrayList.add(hashMap);
                all.moveToNext();
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj2 = ((Map) it.next()).get("sessionId");
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                arrayList2.add((String) obj2);
            }
            ((C11084e) C86312j.m106911c(C11084e.class)).Q90(new LinkedList(arrayList2)).mo9225i().mo123419C(new C1875t2(arrayList, gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$b */
    public /* synthetic */ class C1546b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10929a;

        static {
            int[] iArr = new int[C8929e.values().length];
            iArr[0] = 1;
            f10929a = iArr;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C8929e eVar;
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && jSONObject != null) {
            int i2 = -1;
            int optInt = jSONObject.optInt("functionType", -1);
            C8929e[] values = C8929e.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    eVar = null;
                    break;
                }
                eVar = values[i3];
                if (eVar.f28236d == optInt) {
                    break;
                }
                i3++;
            }
            if (eVar != null) {
                i2 = C1546b.f10929a[eVar.ordinal()];
            }
            if (i2 == 1) {
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C1545a.class, new C1880u2(i2Var, i, this));
            } else {
                i2Var.mo109647a(i, "fail wrong functiontype");
            }
        }
    }
}
