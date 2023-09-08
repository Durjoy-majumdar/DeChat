package com.tencent.p014mm.plugin.downloader.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WebView;
import di3.C86312j;
import e51.C45543b;
import e51.C45547h;
import f40.C86709a0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob0.C47350c;
import ob0.C89144l0;
import p248ug.C52570c0;
import p539gs.C32513c;
import p733vy.C37873b;
import u41.C52436p;
import u41.C52437q;
import v41.C52758q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.downloader.model.DownloadChecker */
public class DownloadChecker {

    /* renamed from: com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean */
    public static class DownloadInterceptBean implements Parcelable {
        public static final Parcelable.Creator<DownloadInterceptBean> CREATOR = new C29842a();

        /* renamed from: d */
        public boolean f80875d;

        /* renamed from: e */
        public int f80876e;

        /* renamed from: f */
        public String f80877f;

        /* renamed from: g */
        public String f80878g;

        /* renamed from: h */
        public String f80879h;

        /* renamed from: i */
        public String f80880i;

        /* renamed from: j */
        public String f80881j;

        /* renamed from: n */
        public String f80882n;

        /* renamed from: o */
        public long f80883o;

        /* renamed from: p */
        public String f80884p;

        /* renamed from: q */
        public String f80885q;

        /* renamed from: r */
        public int f80886r;

        /* renamed from: s */
        public boolean f80887s;

        /* renamed from: t */
        public int f80888t;

        /* renamed from: u */
        public C52758q f80889u;

        /* renamed from: com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean$a */
        public class C29842a implements Parcelable.Creator<DownloadInterceptBean> {
            public Object createFromParcel(Parcel parcel) {
                return new DownloadInterceptBean(parcel, (C29843a) null);
            }

            public Object[] newArray(int i) {
                return new DownloadInterceptBean[i];
            }
        }

        public DownloadInterceptBean() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f80875d ? (byte) 1 : 0);
            parcel.writeInt(this.f80876e);
            parcel.writeString(this.f80877f);
            parcel.writeString(this.f80878g);
            parcel.writeString(this.f80879h);
            parcel.writeString(this.f80880i);
            parcel.writeString(this.f80881j);
            parcel.writeString(this.f80882n);
            parcel.writeLong(this.f80883o);
            parcel.writeString(this.f80884p);
            parcel.writeString(this.f80885q);
            parcel.writeInt(this.f80886r);
            parcel.writeInt(this.f80887s ? 1 : 0);
            try {
                C52758q qVar = this.f80889u;
                if (qVar != null) {
                    parcel.writeInt(qVar.toByteArray().length);
                    parcel.writeByteArray(this.f80889u.toByteArray());
                }
            } catch (IOException unused) {
            }
        }

        public DownloadInterceptBean(Parcel parcel, C29843a aVar) {
            boolean z = false;
            this.f80875d = parcel.readByte() != 0;
            this.f80876e = parcel.readInt();
            this.f80877f = parcel.readString();
            this.f80878g = parcel.readString();
            this.f80879h = parcel.readString();
            this.f80880i = parcel.readString();
            this.f80881j = parcel.readString();
            this.f80882n = parcel.readString();
            this.f80883o = parcel.readLong();
            this.f80884p = parcel.readString();
            this.f80885q = parcel.readString();
            this.f80886r = parcel.readInt();
            this.f80887s = parcel.readInt() == 1 ? true : z;
            this.f80888t = parcel.readInt();
            this.f80889u = new C52758q();
            try {
                byte[] bArr = new byte[this.f80888t];
                parcel.readByteArray(bArr);
                this.f80889u.parseFrom(bArr);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.DownloadChecker$a */
    public class C29843a implements C1256g<DownloadInterceptBean> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f80890d;

        /* renamed from: e */
        public final /* synthetic */ String f80891e;

        public C29843a(WeakReference weakReference, String str) {
            this.f80890d = weakReference;
            this.f80891e = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            ((C119157j) C119157j.f356862d).mo183895z(new C29847b(this, (DownloadInterceptBean) obj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.DownloadChecker$c */
    public static class C29844c implements C80883e<Bundle, DownloadInterceptBean> {
        private C29844c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            DownloadInterceptBean downloadInterceptBean = new DownloadInterceptBean();
            if (bundle == null) {
                downloadInterceptBean.f80875d = false;
                if (gVar != null) {
                    gVar.mo894a(downloadInterceptBean);
                    return;
                }
                return;
            }
            String string = bundle.getString("download_url");
            String string2 = bundle.getString("main_url");
            String string3 = bundle.getString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (!Util.isNullOrNil(string)) {
                C52436p pVar = new C52436p();
                pVar.f146535d = string;
                pVar.f146536e = string2;
                pVar.f146537f = string3;
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = pVar;
                bVar.f127067b = new C52437q();
                bVar.f127068c = "/cgi-bin/mmgame-bin/getdownloadinterceptinfo";
                bVar.f127069d = 2884;
                C89144l0.m111429e(bVar.mo72403a(), new C40915d(string, string2, string3, gVar), false);
                return;
            }
            downloadInterceptBean.f80875d = false;
            if (gVar != null) {
                gVar.mo894a(downloadInterceptBean);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.DownloadChecker$b */
    public static class C29845b implements C80883e<DownloadInterceptBean, IPCLong> {
        private C29845b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            DownloadInterceptBean downloadInterceptBean = (DownloadInterceptBean) obj;
            IPCLong iPCLong = new IPCLong();
            iPCLong.f10314d = -1;
            if (downloadInterceptBean != null) {
                if (downloadInterceptBean.f80887s) {
                    C40979a aVar = new C40979a();
                    aVar.f110289a = downloadInterceptBean.f80881j;
                    aVar.f110290b = downloadInterceptBean.f80882n;
                    aVar.f110292d = downloadInterceptBean.f80878g;
                    aVar.f110291c = downloadInterceptBean.f80879h;
                    aVar.f110294f = downloadInterceptBean.f80884p;
                    aVar.f110295g = downloadInterceptBean.f80883o;
                    aVar.f110296h = downloadInterceptBean.f80885q;
                    aVar.f110302n = 1;
                    aVar.f110299k = 8070;
                    aVar.f110297i = downloadInterceptBean.f80886r;
                    aVar.f110308t = downloadInterceptBean.f80889u.f147428d;
                    iPCLong.f10314d = ((C45547h) C86312j.m106911c(C45547h.class)).mo70789R7(aVar, (C45543b) null);
                } else {
                    C40939n nVar = new C40939n((C40939n.C2206a) null);
                    nVar.f110176a = downloadInterceptBean.f80881j;
                    nVar.f110177b = downloadInterceptBean.f80882n;
                    nVar.f110182g = downloadInterceptBean.f80878g;
                    nVar.f110178c = downloadInterceptBean.f80883o;
                    nVar.f110183h = downloadInterceptBean.f80884p;
                    nVar.f110179d = C44565l.m48993m(MMApplicationContext.getContext(), C44565l.m48987g(downloadInterceptBean.f80878g), (String) null);
                    nVar.f110180e = downloadInterceptBean.f80885q;
                    nVar.f110184i = true;
                    nVar.f110185j = true;
                    nVar.f110181f = 1;
                    nVar.f110187l = 8070;
                    nVar.f110198w = downloadInterceptBean.f80889u.f147428d;
                    if (downloadInterceptBean.f80886r == 1) {
                        iPCLong.f10314d = C40935l.m44326g().mo63957c(nVar);
                    } else {
                        iPCLong.f10314d = C40935l.m44326g().mo63956b(nVar);
                    }
                }
                Log.m105925i("MicroMsg.DownloadChecker", " add download task result:[%d], appid[%s]，downloaerType[%d]", Long.valueOf(iPCLong.f10314d), downloadInterceptBean.f80878g, Integer.valueOf(downloadInterceptBean.f80886r));
                if (gVar != null) {
                    gVar.mo894a(iPCLong);
                }
            } else if (gVar != null) {
                gVar.mo894a(iPCLong);
            }
        }
    }

    /* renamed from: a */
    public static boolean m38886a(String str, String str2, WebView webView) {
        if (Util.isNullOrNil(str) || ChannelUtil.isGPVersion()) {
            return false;
        }
        String str3 = null;
        try {
            List<String> IP = ((C32513c) C86312j.m106911c(C32513c.class)).mo58667IP();
            if (Util.isNullOrNil((List) IP)) {
                Log.m105925i("MicroMsg.DownloadChecker", "raw check url: [ %s ], no regex to intercept", str);
                return false;
            }
            Log.m105925i("MicroMsg.DownloadChecker", "raw check url: [ %s ], have (%d) regexes to intercept", str, Integer.valueOf(IP.size()));
            Iterator<String> it = IP.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Matcher matcher = Pattern.compile(next).matcher(str.trim());
                if (matcher.find()) {
                    str3 = matcher.group();
                    Log.m105925i("MicroMsg.DownloadChecker", "match the regex: %s", next);
                    break;
                }
            }
            if (Util.isNullOrNil(str3)) {
                return false;
            }
            if (((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e()) {
                Log.m105925i("MicroMsg.DownloadChecker", "checkDownload isTeenMode and ignore downloadUrl: %s", str3);
                if (!(webView == null || webView.getContext() == null)) {
                    ((C37873b) C86312j.m106911c(C37873b.class)).mo61225m4(webView.getContext());
                }
                return true;
            }
            WeakReference weakReference = new WeakReference(webView);
            Bundle bundle = new Bundle();
            bundle.putString("download_url", str3);
            bundle.putString("main_url", webView.getUrl());
            bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2);
            C80907o.m98781d(MainProcessIPCService.f108404e, bundle, C29844c.class, new C29843a(weakReference, str));
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.DownloadChecker", "err: %s", e.getMessage());
        }
    }
}
