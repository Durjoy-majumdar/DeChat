package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandOpenWeRunSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import g40.C87134f;
import l71.C34192f;
import org.json.JSONObject;
import p225rc.C89916g;
import p225rc.g$$e;
import tv2.C52366c;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting */
public class JsApiOpenWeRunSetting extends C82268c {
    public static final int CTRL_INDEX = 228;
    public static final String NAME = "openWeRunSetting";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        boolean z = true;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("checkSupport", true);
        }
        new OpenWeRunSetting(this, fVar, i, z).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting */
    public static class OpenWeRunSetting extends MainProcessTask {
        public static final Parcelable.Creator<OpenWeRunSetting> CREATOR = new C81996d();

        /* renamed from: f */
        public C82870p f240428f;

        /* renamed from: g */
        public C82381f f240429g;

        /* renamed from: h */
        public int f240430h;

        /* renamed from: i */
        public boolean f240431i = false;

        /* renamed from: j */
        public boolean f240432j = false;

        /* renamed from: n */
        public boolean f240433n;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting$a */
        public class C81992a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting$a$a */
            public class C81993a implements C34192f.C34193a {
                public C81993a() {
                }

                /* renamed from: a */
                public void mo114443a(boolean z, boolean z2) {
                    OpenWeRunSetting.this.f240431i = z && z2;
                    Log.m105925i("MicroMsg.JsApiOpenWeRunSetting", "After getUserState requestOk %b, hasStep %b", Boolean.valueOf(z), Boolean.valueOf(z2));
                    OpenWeRunSetting.m100699q(OpenWeRunSetting.this);
                }
            }

            public C81992a() {
            }

            public void run() {
                OpenWeRunSetting.this.f240431i = ((C52366c) C86312j.m106911c(C52366c.class)).mo73380Wi(MMApplicationContext.getContext());
                OpenWeRunSetting openWeRunSetting = OpenWeRunSetting.this;
                if (!openWeRunSetting.f240433n || openWeRunSetting.f240431i) {
                    OpenWeRunSetting.m100699q(openWeRunSetting);
                } else {
                    ((C34192f) C86312j.m106911c(C34192f.class)).Am0(new C81993a());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting$b */
        public class C81994b implements C87134f {

            /* renamed from: d */
            public final /* synthetic */ Runnable f240436d;

            public C81994b(OpenWeRunSetting openWeRunSetting, Runnable runnable) {
                this.f240436d = runnable;
            }

            /* renamed from: e */
            public void mo1180e() {
                this.f240436d.run();
            }

            /* renamed from: g */
            public void mo1181g(boolean z) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting$c */
        public class C81995c implements g$$e {
            public C81995c() {
            }

            /* renamed from: a */
            public void mo1626a(int i, Intent intent) {
                if (i == -1) {
                    OpenWeRunSetting openWeRunSetting = OpenWeRunSetting.this;
                    openWeRunSetting.f240429g.mo109647a(openWeRunSetting.f240430h, openWeRunSetting.f240428f.mo115109j("ok"));
                    OpenWeRunSetting.this.mo114397h();
                } else if (i == 0) {
                    OpenWeRunSetting openWeRunSetting2 = OpenWeRunSetting.this;
                    openWeRunSetting2.f240429g.mo109647a(openWeRunSetting2.f240430h, openWeRunSetting2.f240428f.mo115109j("cancel"));
                    OpenWeRunSetting.this.mo114397h();
                } else {
                    OpenWeRunSetting openWeRunSetting3 = OpenWeRunSetting.this;
                    openWeRunSetting3.f240429g.mo109647a(openWeRunSetting3.f240430h, openWeRunSetting3.f240428f.mo115109j("fail"));
                    OpenWeRunSetting.this.mo114397h();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting$d */
        public class C81996d implements Parcelable.Creator<OpenWeRunSetting> {
            public Object createFromParcel(Parcel parcel) {
                return new OpenWeRunSetting(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenWeRunSetting[i];
            }
        }

        public OpenWeRunSetting(C82870p pVar, C82381f fVar, int i, boolean z) {
            Log.m105924i("MicroMsg.JsApiOpenWeRunSetting", "OpenWeRunSetting");
            this.f240428f = pVar;
            this.f240429g = fVar;
            this.f240430h = i;
            this.f240433n = z;
        }

        /* renamed from: q */
        public static void m100699q(OpenWeRunSetting openWeRunSetting) {
            Class cls = C52366c.class;
            if (!openWeRunSetting.f240433n || openWeRunSetting.f240431i) {
                boolean Rw = ((C52366c) C86312j.m106911c(cls)).mo73378Rw();
                openWeRunSetting.f240432j = Rw;
                if (openWeRunSetting.f240433n && Rw) {
                    ((C52366c) C86312j.m106911c(cls)).mo73377BH();
                }
            }
            openWeRunSetting.mo114394b();
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            boolean z = true;
            this.f240431i = parcel.readByte() != 0;
            this.f240432j = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f240433n = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f240433n && !this.f240431i) {
                this.f240429g.mo109647a(this.f240430h, this.f240428f.mo115109j("fail device not support"));
                mo114397h();
            } else if (this.f240432j) {
                this.f240429g.mo109647a(this.f240430h, this.f240428f.mo115109j("ok"));
                mo114397h();
            } else {
                Context context = this.f240429g.getContext();
                if (context == null) {
                    this.f240429g.mo109647a(this.f240430h, this.f240428f.mo115109j("fail:internal error invalid android context"));
                    mo114397h();
                    return;
                }
                C90988l lVar = (C90988l) this.f240429g.mo109671p(C90988l.class);
                if (lVar == null || Util.isNullOrNil(lVar.f261061d)) {
                    this.f240429g.mo109647a(this.f240430h, this.f240428f.mo115109j("fail"));
                    mo114397h();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("OpenWeRunSettingName", lVar.f261061d);
                intent.setClass(context, AppBrandOpenWeRunSettingUI.class);
                C89916g.m112446a(context).mo124236j(intent, new C81995c());
                mo114397h();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            C81992a aVar = new C81992a();
            if (C86709a0.m107528h().f251724a.f251792d) {
                aVar.run();
            } else {
                C86709a0.m107528h().mo121097c(new C81994b(this, aVar));
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f240431i ? (byte) 1 : 0);
            parcel.writeByte(this.f240432j ? (byte) 1 : 0);
            parcel.writeByte(this.f240433n ? (byte) 1 : 0);
        }

        public OpenWeRunSetting(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
