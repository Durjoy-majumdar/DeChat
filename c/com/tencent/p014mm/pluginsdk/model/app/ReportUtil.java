package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.pluginsdk.model.app.ReportUtil */
public class ReportUtil {

    /* renamed from: com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs */
    public static class ReportArgs implements Parcelable {
        public static final Parcelable.Creator<ReportArgs> CREATOR = new C72679a();

        /* renamed from: d */
        public String f211474d;

        /* renamed from: e */
        public int f211475e;

        /* renamed from: f */
        public String f211476f;

        /* renamed from: g */
        public String f211477g;

        /* renamed from: h */
        public int f211478h;

        /* renamed from: com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs$a */
        public class C72679a implements Parcelable.Creator<ReportArgs> {
            public Object createFromParcel(Parcel parcel) {
                return new ReportArgs(parcel, (C72680a) null);
            }

            public Object[] newArray(int i) {
                return new ReportArgs[i];
            }
        }

        public ReportArgs() {
        }

        public ReportArgs(Parcel parcel, C72680a aVar) {
            this.f211474d = parcel.readString();
            this.f211475e = parcel.readInt();
            this.f211476f = parcel.readString();
            this.f211477g = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f211474d);
            parcel.writeInt(this.f211475e);
            parcel.writeString(this.f211476f);
            parcel.writeString(this.f211477g);
        }
    }

    /* renamed from: a */
    public static ReportArgs m84995a(Bundle bundle, int i) {
        String string;
        String string2 = bundle.getString("SendAppMessageWrapper_AppId");
        if (string2 == null && (string = bundle.getString(ConstantsAPI.CONTENT)) != null) {
            string2 = Uri.parse(string).getQueryParameter("appid");
        }
        if (string2 == null && (string2 = IntentUtil.getString(bundle, "_wxapi_payreq_appid")) == null) {
            return null;
        }
        C44561j jVar = new C44561j();
        jVar.field_appId = string2;
        if (!C97625j3.m125820j() || !C97625j3.m125811a()) {
            jVar.field_packageName = bundle.getString(ConstantsAPI.APP_PACKAGE);
        } else {
            C72709y1.yx0().get(jVar, new String[0]);
            if (Util.isNullOrNil(jVar.field_packageName)) {
                jVar.field_packageName = bundle.getString(ConstantsAPI.APP_PACKAGE);
            }
        }
        ReportArgs reportArgs = new ReportArgs();
        reportArgs.f211474d = jVar.field_packageName;
        reportArgs.f211475e = i;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.fromBundle(bundle);
        reportArgs.f211476f = req.transaction;
        reportArgs.f211477g = jVar.field_openId;
        reportArgs.f211478h = bundle.getInt("_wxapi_command_type");
        return reportArgs;
    }

    /* renamed from: b */
    public static void m84996b(Context context, ReportArgs reportArgs) {
        if (reportArgs.f211478h == 1) {
            SendAuth.Resp resp = new SendAuth.Resp();
            resp.transaction = reportArgs.f211476f;
            resp.errCode = reportArgs.f211475e;
            resp.openId = reportArgs.f211477g;
            Bundle bundle = new Bundle();
            resp.toBundle(bundle);
            C72688j0.m85021g(bundle);
            MMessageActV2.Args args = new MMessageActV2.Args();
            args.targetPkgName = reportArgs.f211474d;
            args.bundle = bundle;
            C72688j0.m85024j(args);
            MMessageActV2.send(context, args);
            return;
        }
        SendMessageToWX.Resp resp2 = new SendMessageToWX.Resp();
        resp2.errCode = reportArgs.f211475e;
        resp2.transaction = reportArgs.f211476f;
        resp2.openId = reportArgs.f211477g;
        Bundle bundle2 = new Bundle();
        resp2.toBundle(bundle2);
        C72688j0.m85021g(bundle2);
        MMessageActV2.Args args2 = new MMessageActV2.Args();
        args2.targetPkgName = reportArgs.f211474d;
        args2.bundle = bundle2;
        C72688j0.m85024j(args2);
        MMessageActV2.send(context, args2);
    }

    /* renamed from: c */
    public static void m84997c(Context context, ReportArgs reportArgs, boolean z, boolean z2) {
        if (reportArgs != null) {
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c("kWXEntryActivity_data_center_session_id", true);
            boolean z3 = false;
            if (c != null) {
                z3 = c.mo120957d("kWXEntryActivity_data_center_can_return_cancel", false);
            }
            if (z) {
                m84998d(z2, reportArgs.f211475e);
            }
            if (z3 && z2) {
                reportArgs.f211475e = -2;
            }
            m84996b(context, reportArgs);
        }
    }

    /* renamed from: d */
    public static void m84998d(boolean z, int i) {
        C86493v0.C86495c c = C86493v0.m107224d().mo120947c("kWXEntryActivity_data_center_session_id", true);
        if (c != null) {
            String f = c.mo120959f("kWXEntryActivity_data_center_app_id", "");
            boolean d = c.mo120957d("kWXEntryActivity_data_center_can_return_cancel", false);
            int e = c.mo120958e("kWXEntryActivity_data_center_msg_type", 0);
            int e2 = c.mo120958e("kWXEntryActivity_data_center_scene", 0);
            if (z) {
                i = -2;
            }
            C115669n.INSTANCE.mo160131h(15632, f, Integer.valueOf(e), Integer.valueOf(e2), Integer.valueOf(i), Integer.valueOf(d ? 0 : -1));
        }
    }
}
