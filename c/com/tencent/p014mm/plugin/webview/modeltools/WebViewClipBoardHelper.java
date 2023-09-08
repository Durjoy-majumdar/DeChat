package com.tencent.p014mm.plugin.webview.modeltools;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.lang.ref.WeakReference;
import jm2.C46562a;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper */
public class WebViewClipBoardHelper {

    /* renamed from: a */
    public WeakReference<WebViewUI> f118205a;

    /* renamed from: b */
    public long f118206b = 0;

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper */
    public static final class ClipBoardDataWrapper implements Parcelable {
        public static final Parcelable.Creator<ClipBoardDataWrapper> CREATOR = new C43738a();

        /* renamed from: d */
        public String f118207d;

        /* renamed from: e */
        public int f118208e;

        /* renamed from: f */
        public int f118209f;

        /* renamed from: g */
        public String f118210g;

        /* renamed from: com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper$a */
        public class C43738a implements Parcelable.Creator<ClipBoardDataWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ClipBoardDataWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new ClipBoardDataWrapper[i];
            }
        }

        public ClipBoardDataWrapper() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f118207d);
            parcel.writeInt(this.f118208e);
            parcel.writeInt(this.f118209f);
            parcel.writeString(this.f118210g);
        }

        public ClipBoardDataWrapper(Parcel parcel) {
            this.f118207d = parcel.readString();
            this.f118208e = parcel.readInt();
            this.f118209f = parcel.readInt();
            this.f118210g = parcel.readString();
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$a */
    public static final class C43739a implements C80883e<ClipBoardDataWrapper, Object> {
        private C43739a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            ClipBoardDataWrapper clipBoardDataWrapper = (ClipBoardDataWrapper) obj;
            if (clipBoardDataWrapper != null) {
                C46562a.INSTANCE.mo71685Ko(3, clipBoardDataWrapper.f118207d, clipBoardDataWrapper.f118208e, clipBoardDataWrapper.f118209f, clipBoardDataWrapper.f118210g);
            } else {
                Log.m105920e("MicroMsg.WebViewClipBoardHelper", "InvokeTask, mm received invalid data");
            }
        }
    }

    public WebViewClipBoardHelper(WebViewUI webViewUI) {
        this.f118205a = new WeakReference<>(webViewUI);
    }

    /* renamed from: a */
    public void mo68043a(String str) {
        if (this.f118205a.get() != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f118206b >= 200) {
                this.f118206b = currentTimeMillis;
                ClipBoardDataWrapper clipBoardDataWrapper = new ClipBoardDataWrapper();
                clipBoardDataWrapper.f118207d = this.f118205a.get().getCurrentURL();
                clipBoardDataWrapper.f118208e = str != null ? str.length() : 0;
                clipBoardDataWrapper.f118209f = this.f118205a.get().getIntent().getIntExtra("from_scence", 0);
                clipBoardDataWrapper.f118210g = this.f118205a.get().getIntent().getStringExtra("geta8key_username");
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, clipBoardDataWrapper, C43739a.class, (C1256g) null);
            }
        }
    }
}
