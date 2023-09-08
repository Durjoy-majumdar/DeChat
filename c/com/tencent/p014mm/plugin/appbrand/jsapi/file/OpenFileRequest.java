package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.ValueCallback;
import aw0.C79635e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandTaskProxyUI;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.XFileSdk;
import d92.C45293c;
import di3.C86312j;
import j20.C117292a;
import java.io.IOException;
import java.util.HashMap;
import k20.C9556a;
import p910lj.C76701a;
import pb1.C100714h1;
import q20.C89449a;
import qo3.C77407n;
import qp0.C89783a;
import s00.C110692d;
import s00.C110693e;
import s00.C110694g;
import te3.C101828pe0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest */
public final class OpenFileRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
    public static final Parcelable.Creator<OpenFileRequest> CREATOR = new C82405a();

    /* renamed from: d */
    public String f241474d;

    /* renamed from: e */
    public String f241475e;

    /* renamed from: f */
    public String f241476f;

    /* renamed from: g */
    public boolean f241477g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$b */
    public static final class C17886b extends AppBrandProxyUIProcessTask {

        /* renamed from: o */
        public static final int f49333o = (C17886b.class.hashCode() & 65535);

        /* renamed from: d */
        public String f49334d = "";

        /* renamed from: e */
        public String f49335e = "";

        /* renamed from: f */
        public String f49336f = "";

        /* renamed from: g */
        public String f49337g = "";

        /* renamed from: h */
        public String f49338h = "";

        /* renamed from: i */
        public boolean f49339i;

        /* renamed from: j */
        public C110694g<Integer> f49340j = null;

        /* renamed from: n */
        public ValueCallback<String> f49341n = new C17889c();

        @C89449a
        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$b$d */
        public static final class C1683d implements C1255d<IPCString, IPCInteger> {
            private C1683d() {
            }

            public void invoke(Object obj, C1256g gVar) {
                IPCString iPCString = (IPCString) obj;
                if (iPCString == null) {
                    Log.m105920e("MicroMsg.AppBrand.OpenFileRequest", "IPCFav data null");
                    return;
                }
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
                ((C100714h1) C86312j.m106911c(C100714h1.class)).Gh0(doFavoriteEvent2, 13, iPCString.f10315d, C86013q1.m106457r(iPCString.f10315d) + "." + C86013q1.m106454o(iPCString.f10315d), "");
                doFavoriteEvent.publish();
                if (gVar != null) {
                    gVar.mo894a(new IPCInteger(doFavoriteEvent.f264675e.f9046a));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$b$a */
        public class C17887a implements Runnable {
            public C17887a(C17886b bVar) {
            }

            public void run() {
                C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f7734pq, 0).show();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$b$b */
        public class C17888b extends C110694g<Integer> {
            public C17888b() {
            }

            public void onReceiveValue(Object obj) {
                Integer num = (Integer) obj;
                if (this.f331114a) {
                    Log.m105925i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, ignore ret = %d", num);
                    return;
                }
                Log.m105925i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, ret = %d", num);
                if (num.intValue() == -102) {
                    try {
                        C17886b bVar = C17886b.this;
                        bVar.mo22153b(bVar.f49335e, bVar.f49337g);
                        return;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.AppBrand.OpenFileRequest", e, " openOuterAppDirectly exp = %s ", e);
                    }
                }
                OpenResult openResult = new OpenResult();
                int intValue = num.intValue();
                openResult.f241478d = intValue;
                if (-102 == intValue) {
                    C17886b.this.finishProcess(openResult);
                } else if (num.intValue() == 0) {
                    MMActivity activityContext = C17886b.this.getActivityContext();
                    C17886b bVar2 = C17886b.this;
                    ((C110692d) C86312j.m106911c(C110692d.class)).S90(activityContext, bVar2.f49335e, bVar2.f49337g, openResult.f241478d);
                    C17886b.this.sendResult(openResult);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$b$c */
        public class C17889c implements ValueCallback<String> {
            public C17889c() {
            }

            public void onReceiveValue(Object obj) {
                String str = (String) obj;
                Log.m105925i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, receiveValue = %s", str);
                if ("query for feature_wx_float_window successfully".equals(str)) {
                    if (C17886b.this.getAppBrandTaskProxyUI() != null) {
                        C17886b.this.getAppBrandTaskProxyUI().f49255x = true;
                        boolean e = C17886b.this.getAppBrandTaskProxyUI().f49247p.mo160080e();
                        MMActivity activityContext = C17886b.this.getActivityContext();
                        C17886b bVar = C17886b.this;
                        String str2 = bVar.f49335e;
                        String str3 = bVar.f49336f;
                        String str4 = bVar.f49337g;
                        String str5 = bVar.f49338h;
                        ValueCallback<String> valueCallback = bVar.f49341n;
                        C110694g<Integer> a = bVar.mo22152a(true);
                        C17886b bVar2 = C17886b.this;
                        ((C110693e) C86312j.m106911c(C110693e.class)).mo161957jy(e, false, false, true, activityContext, str2, str3, str4, str5, 10, valueCallback, a, true, bVar2.f49334d, bVar2.f49339i);
                    }
                } else if ("xwebFileReaderReachEnd".equals(str)) {
                    Log.m105918d("MicroMsg.AppBrand.OpenFileRequest", "xweb file reader reach end");
                } else if ("xwebFileReaderUserOperated".equals(str)) {
                    Log.m105918d("MicroMsg.AppBrand.OpenFileRequest", "xweb file reader user operated");
                } else if (!"fileReaderClosed".equals(str) || C17886b.this.isProcessTerminated()) {
                    if ("fileReaderMenuClicked".equals(str)) {
                        C77407n nVar = new C77407n((Context) C17886b.this.getActivityContext(), 1, false);
                        nVar.f225771i = new C17890g1(this);
                        nVar.f225782p = new C17891h1(this);
                        nVar.mo107573q();
                    }
                } else if (C17886b.this.getAppBrandTaskProxyUI() == null) {
                    C17886b.this.finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
                } else if (C17886b.this.getAppBrandTaskProxyUI().f49254w) {
                    C17886b.this.finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
                } else {
                    Log.m105925i("MicroMsg.AppBrand.OpenFileRequest", "opCallback isFinishCurPage:%s", Boolean.valueOf(C17886b.this.getAppBrandTaskProxyUI().f49254w));
                    C17886b.this.getAppBrandTaskProxyUI().f49254w = true;
                }
            }
        }

        /* renamed from: a */
        public final C110694g<Integer> mo22152a(boolean z) {
            C110694g<Integer> gVar;
            if (!z && (gVar = this.f49340j) != null) {
                return gVar;
            }
            C110694g<Integer> gVar2 = this.f49340j;
            if (gVar2 != null) {
                gVar2.f331114a = true;
            }
            this.f49340j = new C17888b();
            if (getAppBrandTaskProxyUI() != null) {
                getAppBrandTaskProxyUI().f49256y = this.f49340j;
            }
            return this.f49340j;
        }

        /* renamed from: b */
        public final void mo22153b(String str, String str2) {
            String mimeTypeByFileExt = MimeTypeUtil.getMimeTypeByFileExt(str2);
            OpenResult openResult = new OpenResult();
            try {
                Intent intent = new Intent();
                intent.setPackage((String) null);
                intent.setAction("android.intent.action.VIEW");
                FileProviderHelper.setIntentDataAndType((Context) getActivityContext(), intent, new C86009m1(str), mimeTypeByFileExt, false);
                intent.addFlags(268435456);
                intent.addFlags(524288);
                MMActivity activityContext = getActivityContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activityContext, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/file/OpenFileRequest$OpenLogic", "openOuterAppDirectly", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityContext.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activityContext, "com/tencent/mm/plugin/appbrand/jsapi/file/OpenFileRequest$OpenLogic", "openOuterAppDirectly", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                openResult.f241478d = 0;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.OpenFileRequest", "start outer view with mime(%s), e = %s", mimeTypeByFileExt, e);
                openResult.f241478d = 2147483646;
                MMHandlerThread.postToMainThread(new C17887a(this));
            }
            finishProcess(openResult);
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            String str;
            OpenFileRequest openFileRequest = (OpenFileRequest) processRequest;
            this.f49334d = openFileRequest.f241476f;
            this.f49335e = openFileRequest.f241474d;
            this.f49337g = openFileRequest.f241475e;
            this.f49339i = openFileRequest.f241477g;
            this.f49338h = Integer.toString(getActivityContext().hashCode());
            if (ChannelUtil.isGPVersion()) {
                mo22153b(this.f49335e, this.f49337g);
                return;
            }
            try {
                int lastIndexOf = this.f49335e.lastIndexOf(47) + 1;
                if (lastIndexOf < 0 || lastIndexOf == this.f49335e.length()) {
                    lastIndexOf = 0;
                }
                String str2 = this.f49335e;
                str = str2.substring(lastIndexOf, str2.length());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.OpenFileRequest", "get file name error " + e.getMessage());
                str = "";
            }
            this.f49336f = str;
            Class cls = C110692d.class;
            ((C110692d) C86312j.m106911c(cls)).mo35327q9((C110692d.C22288a) null);
            if (getAppBrandTaskProxyUI() != null) {
                getAppBrandTaskProxyUI().f49248q = this.f49334d;
                AppBrandTaskProxyUI appBrandTaskProxyUI = getAppBrandTaskProxyUI();
                String str3 = this.f49335e;
                String str4 = this.f49337g;
                String str5 = this.f49338h;
                String str6 = this.f49336f;
                boolean z = this.f49339i;
                appBrandTaskProxyUI.f49249r = str3;
                appBrandTaskProxyUI.f49250s = str4;
                appBrandTaskProxyUI.f49251t = str5;
                appBrandTaskProxyUI.f49252u = str6;
                appBrandTaskProxyUI.f49253v = z;
                getAppBrandTaskProxyUI().f49257z = this.f49341n;
                AppBrandTaskProxyUI appBrandTaskProxyUI2 = getAppBrandTaskProxyUI();
                appBrandTaskProxyUI2.getClass();
                Log.m105925i("MicroMsg.AppBrandTaskProxyUI", "creatFilesFloatball() processName:%s", MMApplicationContext.getProcessName());
                C89783a aVar = new C89783a(new C45293c(appBrandTaskProxyUI2.getContext()));
                appBrandTaskProxyUI2.f49247p = aVar;
                String str7 = appBrandTaskProxyUI2.f49249r;
                String str8 = appBrandTaskProxyUI2.f49250s;
                String str9 = appBrandTaskProxyUI2.f49248q;
                String processName = MMApplicationContext.getProcessName();
                boolean z2 = appBrandTaskProxyUI2.f49253v;
                Log.m105925i("MicroMsg.AppBrandFilesMultiTaskHelper", "onCreate, filePath:%s fileExt:%s ", str7, str8);
                aVar.f258163v = appBrandTaskProxyUI2;
                aVar.mo35809D(4, C79635e.m96715c(str7));
                C101828pe0 pe02 = aVar.f258162u;
                pe02.f299160d = false;
                pe02.f299161e = str7;
                pe02.f299162f = str8;
                pe02.f299163g = str9;
                pe02.f299164h = processName;
                pe02.f299166j = z2;
                pe02.f299165i = 0;
                try {
                    aVar.f326418a.field_data = pe02.toByteArray();
                } catch (IOException e2) {
                    Log.m105921e("MicroMsg.AppBrandFilesMultiTaskHelper", "handleMultiTaskInfoClicked", e2);
                }
                aVar.mo160075M();
                C89783a aVar2 = appBrandTaskProxyUI2.f49247p;
                String str10 = appBrandTaskProxyUI2.f49250s;
                String str11 = appBrandTaskProxyUI2.f49252u;
                MultiTaskInfo multiTaskInfo = aVar2.f326418a;
                multiTaskInfo.mo80305m2().f183752e = str11;
                multiTaskInfo.mo80305m2().f183755h = str10;
                aVar2.mo160075M();
                MMToClientEvent.m100655q(appBrandTaskProxyUI2.f49248q, appBrandTaskProxyUI2.f49246B);
                ((C110693e) C86312j.m106911c(C110693e.class)).Jj0(getAppBrandTaskProxyUI().f49247p.mo160080e(), false, false, getActivityContext(), this.f49335e, this.f49336f, this.f49337g, this.f49338h, 10, this.f49341n, mo22152a(true), true, this.f49334d, this.f49339i);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(XFileSdk.PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE, String.valueOf(10));
            MMActivity activityContext = getActivityContext();
            String str12 = this.f49335e;
            String str13 = this.f49336f;
            String str14 = this.f49337g;
            String str15 = this.f49338h;
            ((C110692d) C86312j.m106911c(cls)).gb0(activityContext, str12, str13, str14, str15, false, hashMap, this.f49341n, mo22152a(true), this.f49339i);
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (f49333o == i) {
                OpenResult openResult = new OpenResult();
                if (-1 == i2) {
                    openResult.f241478d = 0;
                } else {
                    openResult.f241478d = Integer.MAX_VALUE;
                }
                finishProcess(openResult);
                return;
            }
            finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
        }

        public void onProcessInterrupted() {
            super.onProcessInterrupted();
            getActivityContext().getWindow().setBackgroundDrawableResource(C0966R.color.ahf);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$OpenResult */
    public static final class OpenResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<OpenResult> CREATOR = new C82404a();

        /* renamed from: d */
        public int f241478d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$OpenResult$a */
        public class C82404a implements Parcelable.Creator<OpenResult> {
            public Object createFromParcel(Parcel parcel) {
                return new OpenResult(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenResult[i];
            }
        }

        public OpenResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
            this.f241478d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f241478d);
        }

        public OpenResult(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$a */
    public class C82405a implements Parcelable.Creator<OpenFileRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new OpenFileRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new OpenFileRequest[i];
        }
    }

    public OpenFileRequest() {
    }

    public int describeContents() {
        return 0;
    }

    public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
        return C17886b.class;
    }

    public String getUIAlias() {
        return "QbDocumentReader";
    }

    public void readParcel(Parcel parcel) {
        super.readParcel(parcel);
        this.f241474d = parcel.readString();
        this.f241475e = parcel.readString();
        this.f241476f = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f241477g = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f241474d);
        parcel.writeString(this.f241475e);
        parcel.writeString(this.f241476f);
        parcel.writeInt(this.f241477g ? 1 : 0);
    }

    public OpenFileRequest(Parcel parcel) {
        super(parcel);
    }
}
