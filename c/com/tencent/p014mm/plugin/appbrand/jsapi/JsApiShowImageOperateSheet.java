package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashSet;
import java.util.Set;
import js0.C88020k;
import js0.C9514m;
import ke3.C88144b;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p008bq.C67309t0;
import p200lx.C34408q;
import p200lx.C46896e0;
import p200lx.C46900z;
import p225rc.C89917h;
import p645pj.C77092c;
import pb1.C100714h1;
import q20.C89449a;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet */
public class JsApiShowImageOperateSheet extends C82268c<C83928t1> {
    public static final int CTRL_INDEX = 626;
    public static final String NAME = "showImageOperateSheet";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper */
    public static class BottomSheetLogicHelper {

        /* renamed from: h */
        public static Set<Integer> f240448h;

        /* renamed from: a */
        public IPCQRCodeRecognizeResult f240449a;

        /* renamed from: b */
        public C77407n f240450b;

        /* renamed from: c */
        public final C83928t1 f240451c;

        /* renamed from: d */
        public final String f240452d;

        /* renamed from: e */
        public final String f240453e;

        /* renamed from: f */
        public final Rect f240454f;

        /* renamed from: g */
        public C46900z f240455g;

        @C89449a
        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$c */
        public static final class C1572c implements C1255d<IPCString, IPCInteger> {
            private C1572c() {
            }

            public void invoke(Object obj, C1256g gVar) {
                IPCString iPCString = (IPCString) obj;
                if (iPCString == null) {
                    Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "IPCFav data null");
                    return;
                }
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 1, iPCString.f10315d);
                doFavoriteEvent.f264674d.f264688m = 32;
                doFavoriteEvent.publish();
                if (gVar != null) {
                    gVar.mo894a(new IPCInteger(doFavoriteEvent.f264675e.f9046a));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest */
        public static final class IPCProcessQRCodeResultRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
            public static final Parcelable.Creator<IPCProcessQRCodeResultRequest> CREATOR = new C82003a();

            /* renamed from: d */
            public IPCQRCodeRecognizeResult f240456d;

            /* renamed from: e */
            public String f240457e;

            /* renamed from: f */
            public String f240458f;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest$a */
            public class C82003a implements Parcelable.Creator<IPCProcessQRCodeResultRequest> {
                public Object createFromParcel(Parcel parcel) {
                    return new IPCProcessQRCodeResultRequest(parcel);
                }

                public Object[] newArray(int i) {
                    return new IPCProcessQRCodeResultRequest[i];
                }
            }

            public IPCProcessQRCodeResultRequest() {
            }

            public int describeContents() {
                return 0;
            }

            public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
                return C82012d.class;
            }

            public boolean oneShotForeground() {
                return true;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f240456d, i);
                parcel.writeString(this.f240457e);
                parcel.writeString(this.f240458f);
            }

            public IPCProcessQRCodeResultRequest(Parcel parcel) {
                this.f240456d = (IPCQRCodeRecognizeResult) parcel.readParcelable(IPCProcessQRCodeResultRequest.class.getClassLoader());
                this.f240457e = parcel.readString();
                this.f240458f = parcel.readString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam */
        public static final class IPCQRCodeRecognizeParam implements Parcelable {
            public static final Parcelable.Creator<IPCQRCodeRecognizeParam> CREATOR = new C82004a();

            /* renamed from: d */
            public String f240459d;

            /* renamed from: e */
            public String f240460e;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam$a */
            public class C82004a implements Parcelable.Creator<IPCQRCodeRecognizeParam> {
                public Object createFromParcel(Parcel parcel) {
                    return new IPCQRCodeRecognizeParam(parcel);
                }

                public Object[] newArray(int i) {
                    return new IPCQRCodeRecognizeParam[i];
                }
            }

            public IPCQRCodeRecognizeParam() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f240459d);
                parcel.writeString(this.f240460e);
            }

            public IPCQRCodeRecognizeParam(Parcel parcel) {
                this.f240459d = parcel.readString();
                this.f240460e = parcel.readString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest */
        public static final class IPCSendToFriendEmojiRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
            public static final Parcelable.Creator<IPCSendToFriendEmojiRequest> CREATOR = new C82005a();

            /* renamed from: d */
            public String f240461d;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest$a */
            public class C82005a implements Parcelable.Creator<IPCSendToFriendEmojiRequest> {
                public Object createFromParcel(Parcel parcel) {
                    return new IPCSendToFriendEmojiRequest(parcel);
                }

                public Object[] newArray(int i) {
                    return new IPCSendToFriendEmojiRequest[i];
                }
            }

            public IPCSendToFriendEmojiRequest() {
            }

            public int describeContents() {
                return 0;
            }

            public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
                return C82008e.class;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f240461d);
            }

            public IPCSendToFriendEmojiRequest(Parcel parcel) {
                this.f240461d = parcel.readString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$a */
        public class C82006a implements C46900z.C46901a {
            public C82006a() {
            }

            /* renamed from: a */
            public void mo64788a() {
                C77407n nVar = BottomSheetLogicHelper.this.f240450b;
                if (nVar != null && nVar.mo107563h()) {
                    BottomSheetLogicHelper.this.mo114458d();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$b */
        public class C82007b implements Runnable {
            public C82007b() {
            }

            public void run() {
                BottomSheetLogicHelper bottomSheetLogicHelper = BottomSheetLogicHelper.this;
                Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "showBottomSheet imageUrl:%s", bottomSheetLogicHelper.f240452d);
                Context context = bottomSheetLogicHelper.f240451c.getContext();
                if (bottomSheetLogicHelper.f240450b == null) {
                    bottomSheetLogicHelper.f240450b = new C77407n(context, 1, false);
                }
                C77407n nVar = bottomSheetLogicHelper.f240450b;
                nVar.f225771i = new C82518g6(bottomSheetLogicHelper);
                nVar.f225782p = new C82529h6(bottomSheetLogicHelper);
                nVar.f225761d = new C82546i6(bottomSheetLogicHelper);
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    bottomSheetLogicHelper.f240450b.mo107573q();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$e */
        public static final class C82008e extends AppBrandProxyUIProcessTask {
            public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
                Class cls = C67309t0.class;
                if (!(processRequest instanceof IPCSendToFriendEmojiRequest)) {
                    Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "IPCSendToFriendEmojiRequest request instance not valid");
                    return;
                }
                String str = ((IPCSendToFriendEmojiRequest) processRequest).f240461d;
                IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(C86013q1.m106456q(str));
                if (Vs == null) {
                    Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(((C67309t0) C86312j.m106911c(cls)).mo91190WE(MMApplicationContext.getContext(), str));
                }
                long l = Vs == null ? 0 : C86013q1.m106451l(Vs.mo62640K1());
                boolean z = false;
                if (Vs != null) {
                    str = Vs.mo62640K1();
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if ((BitmapUtil.decodeFile(str, options) != null && options.outHeight > C77092c.m93041c()) || options.outWidth > C77092c.m93041c()) {
                    z = true;
                }
                String str2 = "";
                if (l > ((long) C77092c.m93039a()) || z) {
                    C76879j.m92754y(getActivityContext(), getString(C0966R.string.c5n), str2, getString(C0966R.string.fmz), (DialogInterface.OnClickListener) null);
                } else {
                    Intent intent = new Intent();
                    if (Vs != null) {
                        str2 = Vs.getMd5();
                    }
                    intent.putExtra("Retr_File_Name", str2);
                    intent.putExtra("Retr_Msg_Type", 5);
                    intent.putExtra("Retr_MsgImgScene", 1);
                    intent.putExtra("content_type_forward_to_wework", 14);
                    C88144b.m109801s(getActivityContext(), ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
                }
                finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
            }
        }

        @C89449a
        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognize */
        public static final class IPCQRCodeRecognize implements C1255d<IPCQRCodeRecognizeParam, IPCQRCodeRecognizeResult> {

            /* renamed from: d */
            public boolean f240464d = false;

            private IPCQRCodeRecognize() {
            }

            /* renamed from: a */
            public final void mo114468a(IPCQRCodeRecognizeParam iPCQRCodeRecognizeParam, C1256g<IPCQRCodeRecognizeResult> gVar, boolean z) {
                String str = z ? iPCQRCodeRecognizeParam.f240460e : iPCQRCodeRecognizeParam.f240459d;
                Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "doRecognizeLogic mIsBakPathUsed:%b useBak:%b path:%s", Boolean.valueOf(this.f240464d), Boolean.valueOf(z), str);
                this.f240464d = z;
                if (!Util.isNullOrNil(str)) {
                    C9514m mVar = new C9514m();
                    C9514m mVar2 = new C9514m();
                    C40008f fVar = C40008f.f107254d;
                    final C9514m mVar3 = mVar;
                    final C9514m mVar4 = mVar2;
                    final String str2 = str;
                    final C1256g<IPCQRCodeRecognizeResult> gVar2 = gVar;
                    C820091 r1 = new IListener<RecogQBarOfImageFileResultEvent>(this, fVar) {
                        {
                            this.__eventId = 812146647;
                        }

                        public boolean callback(IEvent iEvent) {
                            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                            Log.m105924i("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize callback");
                            if (mVar3.f29691a != null) {
                                ((IListener) mVar3.f29691a).dead();
                            }
                            if (mVar4.f29691a != null) {
                                ((IListener) mVar4.f29691a).dead();
                            }
                            if (!str2.equals(recogQBarOfImageFileResultEvent.f265015d.f265016a)) {
                                Log.m105929w("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize file path no same recognizeFilePath:%s filePath:%s", str2, recogQBarOfImageFileResultEvent.f265015d.f265016a);
                            } else {
                                C96874n1 n1Var = C96874n1.f283849a;
                                String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                                int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                                int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
                                Log.m105918d("MicroMsg.JsApiShowImageOperateSheet", "result: " + d);
                                if (gVar2 != null) {
                                    IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult = new IPCQRCodeRecognizeResult();
                                    iPCQRCodeRecognizeResult.f240475d = d;
                                    iPCQRCodeRecognizeResult.f240476e = recogQBarOfImageFileResultEvent.f265015d.f265016a;
                                    iPCQRCodeRecognizeResult.f240477f = b;
                                    iPCQRCodeRecognizeResult.f240478g = c;
                                    gVar2.mo894a(iPCQRCodeRecognizeResult);
                                }
                            }
                            return false;
                        }
                    };
                    mVar.f29691a = r1;
                    final IPCQRCodeRecognizeParam iPCQRCodeRecognizeParam2 = iPCQRCodeRecognizeParam;
                    final C1256g<IPCQRCodeRecognizeResult> gVar3 = gVar;
                    C820102 r15 = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
                        {
                            this.__eventId = 1700407223;
                        }

                        public boolean callback(IEvent iEvent) {
                            RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
                            Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize failed : mIsBakPathUsed:%b", Boolean.valueOf(IPCQRCodeRecognize.this.f240464d));
                            if (mVar3.f29691a != null) {
                                ((IListener) mVar3.f29691a).dead();
                            }
                            if (mVar4.f29691a != null) {
                                ((IListener) mVar4.f29691a).dead();
                            }
                            if (!str2.equals(recogQBarOfImageFileFailedEvent.f107738d.f107739a)) {
                                Log.m105929w("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize failed : file path no same recognizeFilePath:%s filePath:%s", str2, recogQBarOfImageFileFailedEvent.f107738d.f107739a);
                            } else {
                                IPCQRCodeRecognize iPCQRCodeRecognize = IPCQRCodeRecognize.this;
                                if (!iPCQRCodeRecognize.f240464d) {
                                    iPCQRCodeRecognize.mo114468a(iPCQRCodeRecognizeParam2, gVar3, true);
                                }
                            }
                            return false;
                        }
                    };
                    mVar2.f29691a = r15;
                    r1.alive();
                    r15.alive();
                    RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                    recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
                    RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
                    aVar.f107733b = str;
                    aVar.f107735d = BottomSheetLogicHelper.f240448h;
                    recogQBarOfImageFileEvent.publish();
                }
            }

            public void invoke(Object obj, C1256g gVar) {
                IPCQRCodeRecognizeParam iPCQRCodeRecognizeParam = (IPCQRCodeRecognizeParam) obj;
                if (iPCQRCodeRecognizeParam == null) {
                    Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize data null");
                } else {
                    mo114468a(iPCQRCodeRecognizeParam, gVar, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult */
        public static final class IPCQRCodeRecognizeResult implements Parcelable {
            public static final Parcelable.Creator<IPCQRCodeRecognizeResult> CREATOR = new C82011a();

            /* renamed from: d */
            public String f240475d;

            /* renamed from: e */
            public String f240476e;

            /* renamed from: f */
            public int f240477f;

            /* renamed from: g */
            public int f240478g;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult$a */
            public class C82011a implements Parcelable.Creator<IPCQRCodeRecognizeResult> {
                public Object createFromParcel(Parcel parcel) {
                    return new IPCQRCodeRecognizeResult(parcel);
                }

                public Object[] newArray(int i) {
                    return new IPCQRCodeRecognizeResult[i];
                }
            }

            public IPCQRCodeRecognizeResult() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f240475d);
                parcel.writeString(this.f240476e);
                parcel.writeInt(this.f240477f);
                parcel.writeInt(this.f240478g);
            }

            public IPCQRCodeRecognizeResult(Parcel parcel) {
                this.f240475d = parcel.readString();
                this.f240476e = parcel.readString();
                this.f240477f = parcel.readInt();
                this.f240478g = parcel.readInt();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$d */
        public static final class C82012d extends AppBrandProxyUIProcessTask {
            public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
                if (!(processRequest instanceof IPCProcessQRCodeResultRequest)) {
                    Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "IPCProcessQRCodeResultTask request instance not valid");
                    return;
                }
                IPCProcessQRCodeResultRequest iPCProcessQRCodeResultRequest = (IPCProcessQRCodeResultRequest) processRequest;
                DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
                dealQBarStrEvent.f264648d.f264650b = getActivityContext();
                DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
                IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult = iPCProcessQRCodeResultRequest.f240456d;
                aVar.f264649a = iPCQRCodeRecognizeResult.f240475d;
                aVar.f264651c = iPCQRCodeRecognizeResult.f240477f;
                aVar.f264652d = iPCQRCodeRecognizeResult.f240478g;
                aVar.f264657i = 44;
                Bundle bundle = new Bundle();
                bundle.putInt("stat_scene", 6);
                bundle.putString("stat_app_id", iPCProcessQRCodeResultRequest.f240457e);
                bundle.putString("stat_url", iPCProcessQRCodeResultRequest.f240458f);
                dealQBarStrEvent.f264648d.f264660l = bundle;
                dealQBarStrEvent.publish();
            }
        }

        static {
            HashSet hashSet = new HashSet();
            f240448h = hashSet;
            hashSet.add(3);
        }

        public BottomSheetLogicHelper(C83928t1 t1Var, String str, String str2, Rect rect) {
            this.f240451c = t1Var;
            this.f240452d = str;
            this.f240453e = str2;
            this.f240454f = rect;
            this.f240455g = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(t1Var.getContext(), new C82006a());
        }

        /* renamed from: a */
        public static void m100714a(BottomSheetLogicHelper bottomSheetLogicHelper) {
            bottomSheetLogicHelper.getClass();
            Log.m105924i("MicroMsg.JsApiShowImageOperateSheet", "processQRCodeResultLogic");
            IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult = bottomSheetLogicHelper.f240449a;
            if (iPCQRCodeRecognizeResult == null || Util.isNullOrNil(iPCQRCodeRecognizeResult.f240475d)) {
                Log.m105928w("MicroMsg.JsApiShowImageOperateSheet", "processQRCodeResultLogic result nil");
                return;
            }
            IPCProcessQRCodeResultRequest iPCProcessQRCodeResultRequest = new IPCProcessQRCodeResultRequest();
            iPCProcessQRCodeResultRequest.f240456d = bottomSheetLogicHelper.f240449a;
            iPCProcessQRCodeResultRequest.f240457e = bottomSheetLogicHelper.f240451c.getAppId();
            iPCProcessQRCodeResultRequest.f240458f = bottomSheetLogicHelper.f240451c.mo116162Q0();
            C81956c.m100675c(bottomSheetLogicHelper.f240451c.getContext(), iPCProcessQRCodeResultRequest, (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
            IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult2 = bottomSheetLogicHelper.f240449a;
            bottomSheetLogicHelper.mo114457c(iPCQRCodeRecognizeResult2.f240477f, iPCQRCodeRecognizeResult2.f240475d, true, true);
        }

        /* renamed from: b */
        public final void mo114456b(C84795y.C40572a aVar) {
            if (!Util.isNullOrNil(this.f240453e)) {
                C81415h0 fileSystem = this.f240451c.getFileSystem();
                C86009m1 allocTempFile = fileSystem.allocTempFile("showSheet_base64_" + System.currentTimeMillis());
                if (allocTempFile == null) {
                    Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "loadImage failed for allocTempFile");
                    return;
                }
                String i = allocTempFile.mo119971i();
                byte[] decode = Base64.decode(this.f240453e, 0);
                C86013q1.m106438T(i, decode, 0, decode.length);
                aVar.mo1966a(i);
                return;
            }
            C84795y.m104477c(this.f240451c, this.f240452d, (String) null, aVar);
        }

        /* renamed from: c */
        public final void mo114457c(int i, String str, boolean z, boolean z2) {
            AppBrandInitConfigWC M1;
            C83928t1 t1Var = this.f240451c;
            if (t1Var != null && t1Var.getRuntime() != null && (M1 = this.f240451c.getRuntime().mo113210l1()) != null) {
                String str2 = M1.f234837q;
                String appId = this.f240451c.getAppId();
                AppBrandStatObject appBrandStatObject = M1.f234834c1;
                ((C34408q) C86312j.m106911c(C34408q.class)).mo59434wz(str2, appBrandStatObject != null ? appBrandStatObject.f245533f : 0, appId, false, this.f240451c.mo116163R0(), i, str, z, z2, this.f240451c.mo116162Q0());
            }
        }

        /* renamed from: d */
        public void mo114458d() {
            MMHandlerThread.postToMainThreadDelayed(new C82007b(), (long) (C89917h.m112458a(this.f240451c.getContext()) ? 100 : 0));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83928t1 t1Var = (C83928t1) fVar;
        try {
            String string = jSONObject.getString("imageUrl");
            String string2 = jSONObject.getString("imageBase64");
            int d = C88020k.m109553d(jSONObject.getInt("elementLeft"));
            int d2 = C88020k.m109553d(jSONObject.getInt("elementTop"));
            new BottomSheetLogicHelper(t1Var, string, string2, new Rect(d, d2, C88020k.m109553d(jSONObject.getInt("elementWidth")) + d, C88020k.m109553d(jSONObject.getInt("elementHeight")) + d2)).mo114458d();
            t1Var.mo109647a(i, mo115109j("ok"));
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiShowImageOperateSheet", "fail exp:%s", e.getLocalizedMessage());
            t1Var.mo109647a(i, mo115109j("fail invalid params"));
        }
    }
}
