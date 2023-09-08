package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.webview.stub.C6107m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper */
public class WebViewStubCallbackWrapper implements Parcelable {
    public static final Parcelable.Creator<WebViewStubCallbackWrapper> CREATOR = new C43810a();

    /* renamed from: d */
    public C6107m f118438d;

    /* renamed from: e */
    public int f118439e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper$a */
    public class C43810a implements Parcelable.Creator<WebViewStubCallbackWrapper> {
        public Object createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new WebViewStubCallbackWrapper(readStrongBinder, (C43810a) null);
            }
            return null;
        }

        public Object[] newArray(int i) {
            return new WebViewStubCallbackWrapper[i];
        }
    }

    public WebViewStubCallbackWrapper(C6107m mVar, int i) {
        this.f118438d = mVar;
        this.f118439e = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof WebViewStubCallbackWrapper) && ((WebViewStubCallbackWrapper) obj).f118439e == this.f118439e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f118438d.asBinder());
    }

    public WebViewStubCallbackWrapper(IBinder iBinder, C43810a aVar) {
        C6107m mVar;
        int i = C6107m.C6108a.f22477d;
        if (iBinder == null) {
            mVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C6107m)) {
                mVar = new C6107m.C6108a.C6109a(iBinder);
            } else {
                mVar = (C6107m) queryLocalInterface;
            }
        }
        this.f118438d = mVar;
    }
}
