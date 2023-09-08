package com.tencent.p014mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader;
import com.tencent.p014mm.plugin.wepkg.model.C44509m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask */
public class WepkgDownloadProcessTask extends BaseWepkgProcessTask {
    public static final Parcelable.Creator<WepkgDownloadProcessTask> CREATOR = new C44485b();

    /* renamed from: h */
    public int f120626h;

    /* renamed from: i */
    public String f120627i;

    /* renamed from: j */
    public String f120628j;

    /* renamed from: n */
    public String f120629n;

    /* renamed from: o */
    public long f120630o;

    /* renamed from: p */
    public String f120631p;

    /* renamed from: q */
    public String f120632q;

    /* renamed from: r */
    public int f120633r;

    /* renamed from: s */
    public String f120634s;

    /* renamed from: t */
    public WePkgDownloader.IWepkgUpdateCallback.RetCode f120635t;

    /* renamed from: u */
    public Runnable f120636u;

    /* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask$a */
    public class C44484a implements WePkgDownloader.IWepkgUpdateCallback {
        public C44484a() {
        }

        /* renamed from: a */
        public void mo69236a(String str, String str2, WePkgDownloader.IWepkgUpdateCallback.RetCode retCode) {
            Log.m105925i("MicroMsg.Wepkg.WepkgDownloadProcessTask", "onPkgUpdatingCallback errCode:%s", retCode);
            WepkgDownloadProcessTask wepkgDownloadProcessTask = WepkgDownloadProcessTask.this;
            wepkgDownloadProcessTask.f120627i = str;
            wepkgDownloadProcessTask.f120634s = str2;
            wepkgDownloadProcessTask.f120635t = retCode;
            wepkgDownloadProcessTask.mo114397h();
            WepkgDownloadProcessTask.this.mo114394b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask$b */
    public class C44485b implements Parcelable.Creator<WepkgDownloadProcessTask> {
        public Object createFromParcel(Parcel parcel) {
            return new WepkgDownloadProcessTask(parcel, (C44484a) null);
        }

        public Object[] newArray(int i) {
            return new WepkgDownloadProcessTask[i];
        }
    }

    public WepkgDownloadProcessTask() {
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f120636u;
        if (runnable != null) {
            ((C44509m.C44512b) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        C44484a aVar = new C44484a();
        if (this.f120626h == 1) {
            WePkgDownloader.m48821a().mo69232c(this.f120627i, aVar);
        } else {
            WePkgDownloader.m48821a().mo69235f(this.f120626h, Util.nullAsNil(this.f120627i), "", Util.nullAsNil(this.f120628j), Util.nullAsNil(this.f120629n), this.f120630o, Util.nullAsNil(this.f120631p), "", Util.nullAsNil(this.f120632q), this.f120633r, aVar);
        }
    }

    /* renamed from: q */
    public void mo69252q(Parcel parcel) {
        this.f120626h = parcel.readInt();
        this.f120627i = parcel.readString();
        this.f120628j = parcel.readString();
        this.f120629n = parcel.readString();
        this.f120630o = parcel.readLong();
        this.f120631p = parcel.readString();
        this.f120632q = parcel.readString();
        this.f120633r = parcel.readInt();
        this.f120634s = parcel.readString();
        this.f120635t = (WePkgDownloader.IWepkgUpdateCallback.RetCode) parcel.readParcelable(WePkgDownloader.IWepkgUpdateCallback.RetCode.class.getClassLoader());
    }

    /* renamed from: t */
    public void mo69253t(Parcel parcel, int i) {
        parcel.writeInt(this.f120626h);
        parcel.writeString(this.f120627i);
        parcel.writeString(this.f120628j);
        parcel.writeString(this.f120629n);
        parcel.writeLong(this.f120630o);
        parcel.writeString(this.f120631p);
        parcel.writeString(this.f120632q);
        parcel.writeInt(this.f120633r);
        parcel.writeString(this.f120634s);
        parcel.writeParcelable(this.f120635t, i);
    }

    public WepkgDownloadProcessTask(Parcel parcel, C44484a aVar) {
        mo1551g(parcel);
    }
}
