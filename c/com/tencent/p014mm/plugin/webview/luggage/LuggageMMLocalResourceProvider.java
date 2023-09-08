package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceResponse;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import p826uc.C52512c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider */
public class LuggageMMLocalResourceProvider implements C52512c {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask */
    public static class GetLocalResourceInfoTask extends MainProcessTask {
        public static final Parcelable.Creator<GetLocalResourceInfoTask> CREATOR = new C19415a();

        /* renamed from: f */
        public String f54838f;

        /* renamed from: g */
        public int f54839g;

        /* renamed from: h */
        public String f54840h;

        /* renamed from: i */
        public Runnable f54841i;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask$a */
        public class C19415a implements Parcelable.Creator<GetLocalResourceInfoTask> {
            public Object createFromParcel(Parcel parcel) {
                GetLocalResourceInfoTask getLocalResourceInfoTask = new GetLocalResourceInfoTask((C19416a) null);
                getLocalResourceInfoTask.mo1551g(parcel);
                return getLocalResourceInfoTask;
            }

            public Object[] newArray(int i) {
                return new GetLocalResourceInfoTask[i];
            }
        }

        public GetLocalResourceInfoTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f54838f = parcel.readString();
            this.f54839g = parcel.readInt();
            this.f54840h = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            Runnable runnable = this.f54841i;
            if (runnable != null) {
                ((C19416a) runnable).run();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            int i = this.f54839g;
            if (i == 1) {
                this.f54840h = C43702g2.m47532e(this.f54838f);
            } else if (i == 2) {
                this.f54840h = C43702g2.m47531d(this.f54838f);
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f54838f);
            parcel.writeInt(this.f54839g);
            parcel.writeString(this.f54840h);
        }

        public GetLocalResourceInfoTask(C19416a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$a */
    public class C19416a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GetLocalResourceInfoTask f54842d;

        /* renamed from: e */
        public final /* synthetic */ PipedOutputStream f54843e;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$a$a */
        public class C19417a implements Runnable {
            public C19417a() {
            }

            public void run() {
                C19416a aVar;
                InputStream inputStream = null;
                try {
                    inputStream = C86013q1.m106423E(C19416a.this.f54842d.f54840h);
                    PipedOutputStream pipedOutputStream = C19416a.this.f54843e;
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            try {
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        } else {
                            pipedOutputStream.write(bArr, 0, read);
                        }
                    }
                    inputStream.close();
                    aVar = C19416a.this;
                } catch (Exception unused2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    aVar = C19416a.this;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused3) {
                            throw th;
                        }
                    }
                    C19416a.this.f54843e.close();
                    throw th;
                }
                aVar.f54843e.close();
            }
        }

        public C19416a(LuggageMMLocalResourceProvider luggageMMLocalResourceProvider, GetLocalResourceInfoTask getLocalResourceInfoTask, PipedOutputStream pipedOutputStream) {
            this.f54842d = getLocalResourceInfoTask;
            this.f54843e = pipedOutputStream;
        }

        public void run() {
            ((C119157j) C119157j.f356862d).mo183875f(new C19417a());
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo25133a(String str) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            GetLocalResourceInfoTask getLocalResourceInfoTask = new GetLocalResourceInfoTask((C19416a) null);
            getLocalResourceInfoTask.f54838f = str;
            getLocalResourceInfoTask.f54839g = 1;
            getLocalResourceInfoTask.f54841i = new C19416a(this, getLocalResourceInfoTask, pipedOutputStream);
            getLocalResourceInfoTask.mo114395c();
            return new WebResourceResponse("image/*", "utf-8", pipedInputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo25134b() {
        return "weixin://resourceid/.*";
    }
}
