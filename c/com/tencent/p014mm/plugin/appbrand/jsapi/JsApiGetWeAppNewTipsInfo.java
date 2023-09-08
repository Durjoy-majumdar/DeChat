package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import q20.C89449a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo */
public final class JsApiGetWeAppNewTipsInfo extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1159;
    public static final String NAME = "getWeAppNewTipsInfo";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGetWeAppNewTipsInfo$NewTipInfo;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo */
    public static final class NewTipInfo implements Parcelable {
        public static final Parcelable.Creator<NewTipInfo> CREATOR = new C1547a();

        /* renamed from: d */
        public final int f10930d;

        /* renamed from: e */
        public final String f10931e;

        /* renamed from: f */
        public final String f10932f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo$a */
        public static final class C1547a implements Parcelable.Creator<NewTipInfo> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new NewTipInfo(parcel.readInt(), parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new NewTipInfo[i];
            }
        }

        public NewTipInfo(int i, String str, String str2) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "iconUrl");
            this.f10930d = i;
            this.f10931e = str;
            this.f10932f = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewTipInfo)) {
                return false;
            }
            NewTipInfo newTipInfo = (NewTipInfo) obj;
            return this.f10930d == newTipInfo.f10930d && C87412m.m108589b(this.f10931e, newTipInfo.f10931e) && C87412m.m108589b(this.f10932f, newTipInfo.f10932f);
        }

        public int hashCode() {
            return (((this.f10930d * 31) + this.f10931e.hashCode()) * 31) + this.f10932f.hashCode();
        }

        public String toString() {
            return "NewTipInfo(showType=" + this.f10930d + ", title=" + this.f10931e + ", iconUrl=" + this.f10932f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f10930d);
            parcel.writeString(this.f10931e);
            parcel.writeString(this.f10932f);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGetWeAppNewTipsInfo$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGetWeAppNewTipsInfo$NewTipInfo;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$a */
    public static final class C1548a implements C80883e<IPCString, NewTipInfo> {
        /* JADX WARNING: type inference failed for: r1v2, types: [com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r6, com.tencent.p014mm.ipcinvoker.C1256g r7) {
            /*
                r5 = this;
                com.tencent.mm.ipcinvoker.type.IPCString r6 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r6
                java.lang.Class<nv.g> r0 = p626nv.C109759g.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                nv.g r0 = (p626nv.C109759g) r0
                nv.e r0 = r0.V40()
                jc2.c r1 = new jc2.c
                r2 = 0
                if (r6 == 0) goto L_0x0016
                java.lang.String r6 = r6.f10315d
                goto L_0x0017
            L_0x0016:
                r6 = r2
            L_0x0017:
                r1.<init>((java.lang.String) r6)
                com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
                android.util.Pair r6 = r0.mo175764c(r1)
                java.lang.Object r0 = r6.second
                te3.tg4 r0 = (te3.tg4) r0
                if (r0 != 0) goto L_0x002c
                if (r7 == 0) goto L_0x005f
                r7.mo894a(r2)
                goto L_0x005f
            L_0x002c:
                java.lang.Object r6 = r6.first
                com.tencent.mm.plugin.newtips.model.n r6 = (com.tencent.p014mm.plugin.newtips.model.C115631n) r6
                com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_NONE
                if (r6 == r1) goto L_0x005a
                if (r0 != 0) goto L_0x0037
                goto L_0x005a
            L_0x0037:
                if (r7 == 0) goto L_0x005f
                if (r6 == 0) goto L_0x0056
                int r6 = r6.f346868e
                com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo r1 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo
                if (r0 == 0) goto L_0x0044
                java.lang.String r3 = r0.f354436e
                goto L_0x0045
            L_0x0044:
                r3 = r2
            L_0x0045:
                java.lang.String r4 = ""
                if (r3 != 0) goto L_0x004a
                r3 = r4
            L_0x004a:
                if (r0 == 0) goto L_0x004e
                java.lang.String r2 = r0.f354437f
            L_0x004e:
                if (r2 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r4 = r2
            L_0x0052:
                r1.<init>(r6, r3, r4)
                r2 = r1
            L_0x0056:
                r7.mo894a(r2)
                goto L_0x005f
            L_0x005a:
                if (r7 == 0) goto L_0x005f
                r7.mo894a(r2)
            L_0x005f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo.C1548a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && i2Var.getContext() != null && jSONObject != null) {
            String optString = jSONObject.optString("pathKey");
            if (optString == null) {
                optString = "";
            }
            if (!C112551y.m153819s(optString, "weapp_internal_", false)) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                i2Var.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject2));
                return;
            }
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(optString), C1548a.class, new C1698h3(i2Var, i, this));
        }
    }
}
