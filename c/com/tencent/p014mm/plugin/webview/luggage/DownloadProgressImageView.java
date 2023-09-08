package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.downloader_app.api.DownloadWidgetTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45547h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p237sp.C36768q;

/* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView */
public class DownloadProgressImageView extends AppCompatImageView {

    /* renamed from: f */
    public Paint f54827f;

    /* renamed from: g */
    public C36768q.C36770b f54828g;

    /* renamed from: h */
    public List<DownloadTaskInfo> f54829h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public DownloadTaskInfo f54830i;

    /* renamed from: j */
    public boolean f54831j = false;

    /* renamed from: n */
    public int f54832n = 1;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView$DownloadTaskInfo */
    public static class DownloadTaskInfo implements Parcelable {
        public static final Parcelable.Creator<DownloadTaskInfo> CREATOR = new C19413a();

        /* renamed from: d */
        public String f54833d;

        /* renamed from: e */
        public int f54834e;

        /* renamed from: f */
        public int f54835f;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView$DownloadTaskInfo$a */
        public class C19413a implements Parcelable.Creator<DownloadTaskInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new DownloadTaskInfo(parcel, (C19418c) null);
            }

            public Object[] newArray(int i) {
                return new DownloadTaskInfo[i];
            }
        }

        public DownloadTaskInfo() {
        }

        public DownloadTaskInfo(Parcel parcel, C19418c cVar) {
            this.f54833d = parcel.readString();
            this.f54834e = parcel.readInt();
            this.f54835f = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return obj != null && (obj instanceof DownloadTaskInfo) && ((DownloadTaskInfo) obj).f54833d.equals(this.f54833d);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f54833d);
            parcel.writeInt(this.f54834e);
            parcel.writeInt(this.f54835f);
        }
    }

    public DownloadProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.m105924i("MicroMsg.DownloadProgressImageView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f54831j = C85875k4.m106211z();
        Paint paint = new Paint();
        this.f54827f = paint;
        paint.setAntiAlias(true);
        this.f54827f.setStyle(Paint.Style.STROKE);
        this.f54828g = new C19418c(this);
        GetDownloadWidgeInfoTask getDownloadWidgeInfoTask = new GetDownloadWidgeInfoTask();
        getDownloadWidgeInfoTask.f54837g = new C19420d(this, getDownloadWidgeInfoTask);
        getDownloadWidgeInfoTask.mo114395c();
        setOnClickListener(new C5873e(this));
    }

    /* renamed from: p */
    public static void m20711p(DownloadProgressImageView downloadProgressImageView) {
        downloadProgressImageView.getClass();
        Log.m105924i("MicroMsg.DownloadProgressImageView", "updateDownloadState");
        downloadProgressImageView.f54830i = null;
        if (!Util.isNullOrNil((List) downloadProgressImageView.f54829h)) {
            Iterator<DownloadTaskInfo> it = downloadProgressImageView.f54829h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DownloadTaskInfo next = it.next();
                if (next.f54834e == 1) {
                    downloadProgressImageView.f54830i = next;
                    break;
                }
            }
            if (downloadProgressImageView.f54830i != null) {
                downloadProgressImageView.setImageDrawableWrapper(1);
            } else if (downloadProgressImageView.f54829h.get(0).f54834e == 3) {
                downloadProgressImageView.setImageDrawableWrapper(3);
            } else {
                downloadProgressImageView.setImageDrawableWrapper(2);
            }
        } else {
            downloadProgressImageView.setImageDrawableWrapper(1);
        }
    }

    private void setImageDrawableWrapper(int i) {
        this.f54832n = i;
        mo25124q();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C36768q) C86312j.m106911c(C36768q.class)).A20(this.f54828g);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((C36768q) C86312j.m106911c(C36768q.class)).Cf0(this.f54828g);
    }

    /* renamed from: q */
    public final void mo25124q() {
        int i = this.f54832n;
        int i2 = i != 1 ? i != 2 ? i != 3 ? 0 : this.f54831j ? C0966R.raw.download_install_dark : C0966R.raw.download_install : this.f54831j ? C0966R.raw.download_pause_dark : C0966R.raw.download_pause : this.f54831j ? C0966R.raw.download_default_dark : C0966R.raw.download_default;
        if (i2 != 0) {
            setImageResource(i2);
        }
    }

    public void setDarkMode(boolean z) {
        this.f54831j = z;
        mo25124q();
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView$GetDownloadWidgeInfoTask */
    public static class GetDownloadWidgeInfoTask extends MainProcessTask {
        public static final Parcelable.Creator<GetDownloadWidgeInfoTask> CREATOR = new C19414a();

        /* renamed from: f */
        public ArrayList<DownloadTaskInfo> f54836f = new ArrayList<>();

        /* renamed from: g */
        public Runnable f54837g;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView$GetDownloadWidgeInfoTask$a */
        public class C19414a implements Parcelable.Creator<GetDownloadWidgeInfoTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetDownloadWidgeInfoTask(parcel, (C19418c) null);
            }

            public Object[] newArray(int i) {
                return new GetDownloadWidgeInfoTask[i];
            }
        }

        public GetDownloadWidgeInfoTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f54836f = parcel.readArrayList(DownloadTaskInfo.class.getClassLoader());
        }

        /* renamed from: i */
        public void mo1552i() {
            Runnable runnable = this.f54837g;
            if (runnable != null) {
                ((C19420d) runnable).run();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C45547h.class;
            if (C86312j.m106911c(cls) != null) {
                LinkedList<DownloadWidgetTaskInfo> Se = ((C45547h) C86312j.m106911c(cls)).mo70791Se();
                if (Util.isNullOrNil((List) Se)) {
                    mo114394b();
                    return;
                }
                Iterator<DownloadWidgetTaskInfo> it = Se.iterator();
                while (it.hasNext()) {
                    DownloadWidgetTaskInfo next = it.next();
                    DownloadTaskInfo downloadTaskInfo = new DownloadTaskInfo();
                    downloadTaskInfo.f54833d = next.f110282d;
                    downloadTaskInfo.f54834e = next.f110288j;
                    downloadTaskInfo.f54835f = next.f110285g;
                    this.f54836f.add(downloadTaskInfo);
                }
                mo114394b();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeList(this.f54836f);
        }

        public GetDownloadWidgeInfoTask(Parcel parcel, C19418c cVar) {
            mo1551g(parcel);
        }
    }
}
