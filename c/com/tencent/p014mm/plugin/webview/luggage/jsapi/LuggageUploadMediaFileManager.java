package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C24290l2;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import nj3.C76879j;
import p158gt.C98201k;
import qo3.C77398g;
import qo3.C89779i0;
import y83.C53505a;
import y83.C53507c;
import y83.C53508d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager */
public class LuggageUploadMediaFileManager {

    /* renamed from: g */
    public static ProgressDialog f69723g;

    /* renamed from: a */
    public MMActivity f69724a;

    /* renamed from: b */
    public C43658n f69725b;

    /* renamed from: c */
    public String f69726c;

    /* renamed from: d */
    public String f69727d;

    /* renamed from: e */
    public boolean f69728e;

    /* renamed from: f */
    public C19421d f69729f;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$d */
    public interface C19421d {
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask */
    public static class UploadMediaFileTask extends MainProcessTask {
        public static final Parcelable.Creator<UploadMediaFileTask> CREATOR = new C24284b();

        /* renamed from: f */
        public C24287c f69730f;

        /* renamed from: g */
        public String f69731g;

        /* renamed from: h */
        public String f69732h;

        /* renamed from: i */
        public String f69733i;

        /* renamed from: j */
        public String f69734j;

        /* renamed from: n */
        public boolean f69735n;

        /* renamed from: o */
        public Runnable f69736o;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask$a */
        public class C24283a implements C24287c {
            public C24283a() {
            }

            /* renamed from: a */
            public void mo41057a(boolean z, String str, String str2) {
                Log.m105925i("MicroMsg.UploadMediaTask", "success = %b, mediaId = %s, mediaUrl = %s", Boolean.valueOf(z), str, str2);
                UploadMediaFileTask uploadMediaFileTask = UploadMediaFileTask.this;
                uploadMediaFileTask.f69735n = z;
                uploadMediaFileTask.f69733i = str;
                uploadMediaFileTask.f69734j = str2;
                uploadMediaFileTask.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask$b */
        public class C24284b implements Parcelable.Creator<UploadMediaFileTask> {
            public Object createFromParcel(Parcel parcel) {
                return new UploadMediaFileTask(parcel, (C24292p2) null);
            }

            public Object[] newArray(int i) {
                return new UploadMediaFileTask[i];
            }
        }

        public UploadMediaFileTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f69731g = parcel.readString();
            this.f69732h = parcel.readString();
            this.f69733i = parcel.readString();
            this.f69734j = parcel.readString();
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f69735n = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            Runnable runnable = this.f69736o;
            if (runnable != null) {
                ((C24286b) runnable).run();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.UploadMediaTask", "runInMainProcess");
            if (this.f69730f == null) {
                this.f69730f = new C24283a();
            }
            WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(this.f69731g);
            if (b == null) {
                mo114394b();
                return;
            }
            int i = b.f283028n;
            if (i == 1) {
                LuggageUploadMediaFileManager.m30416a(MMApplicationContext.getContext(), b, this.f69732h, this.f69731g, 20301, 202, 2, false, this.f69730f);
            } else if (i != 4) {
                LuggageUploadMediaFileManager.m30417b(MMApplicationContext.getContext(), this.f69732h, this.f69731g, CdnLogic.kMediaTypeAppVideo, 202, 2, false, this.f69730f);
            } else {
                LuggageUploadMediaFileManager.m30417b(MMApplicationContext.getContext(), this.f69732h, this.f69731g, CdnLogic.kMediaTypeAppVideo, 202, 2, false, this.f69730f);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f69731g);
            parcel.writeString(this.f69732h);
            parcel.writeString(this.f69733i);
            parcel.writeString(this.f69734j);
            parcel.writeByte(this.f69735n ? (byte) 1 : 0);
        }

        public UploadMediaFileTask(Parcel parcel, C24292p2 p2Var) {
            mo1551g(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$a */
    public class C24285a implements C53505a {
        public C24285a() {
        }

        /* renamed from: a */
        public void mo41060a(Bundle bundle) {
        }

        public void onCallback(Bundle bundle) {
            if (bundle != null) {
                HashMap hashMap = new HashMap();
                String string = bundle.getString("media_id");
                String string2 = bundle.getString("media_url");
                hashMap.put("serverId", Util.nullAsNil(string));
                hashMap.put("mediaUrl", Util.nullAsNil(string2));
                ((C24290l2.C24291a) LuggageUploadMediaFileManager.this.f69729f).mo41064a(true, hashMap);
                return;
            }
            ((C24290l2.C24291a) LuggageUploadMediaFileManager.this.f69729f).mo41064a(false, (HashMap<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$b */
    public class C24286b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ UploadMediaFileTask f69739d;

        public C24286b(UploadMediaFileTask uploadMediaFileTask) {
            this.f69739d = uploadMediaFileTask;
        }

        public void run() {
            this.f69739d.mo114397h();
            LuggageUploadMediaFileManager luggageUploadMediaFileManager = LuggageUploadMediaFileManager.this;
            C43661n0 n0Var = luggageUploadMediaFileManager.f69725b.f117951u;
            if (n0Var != null) {
                C77398g gVar = n0Var.f118005u;
                if (gVar != null) {
                    gVar.dismiss();
                    n0Var.f118005u = null;
                }
                luggageUploadMediaFileManager.f69725b.f117951u.setCloseWindowConfirmInfo((Bundle) null);
            }
            if (this.f69739d.f69735n) {
                HashMap hashMap = new HashMap();
                hashMap.put("serverId", Util.nullAsNil(this.f69739d.f69733i));
                hashMap.put("mediaUrl", Util.nullAsNil(this.f69739d.f69734j));
                ((C24290l2.C24291a) LuggageUploadMediaFileManager.this.f69729f).mo41064a(true, hashMap);
                return;
            }
            ((C24290l2.C24291a) LuggageUploadMediaFileManager.this.f69729f).mo41064a(false, (HashMap<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$c */
    public interface C24287c {
        /* renamed from: a */
        void mo41057a(boolean z, String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$e */
    public static class C24288e implements C53508d {

        /* renamed from: a */
        public C24287c f69741a = new C24289a();

        /* renamed from: b */
        public C53505a f69742b;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$e$a */
        public class C24289a implements C24287c {
            public C24289a() {
            }

            /* renamed from: a */
            public void mo41057a(boolean z, String str, String str2) {
                C53505a aVar = C24288e.this.f69742b;
                if (aVar == null) {
                    return;
                }
                if (z) {
                    Bundle bundle = new Bundle();
                    bundle.putString("media_id", str);
                    bundle.putString("media_url", str2);
                    C24288e.this.f69742b.onCallback(bundle);
                    return;
                }
                aVar.onCallback((Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo41063a(Context context, Bundle bundle, C53505a aVar) {
            this.f69742b = aVar;
            String string = bundle.getString("local_id");
            String string2 = bundle.getString("app_id");
            boolean z = bundle.getBoolean("show_progress_tips");
            WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(string);
            if (b == null) {
                aVar.onCallback((Bundle) null);
                return;
            }
            int i = b.f283028n;
            if (i == 1) {
                LuggageUploadMediaFileManager.m30416a(context, b, string2, string, 20301, 202, 2, z, this.f69741a);
            } else if (i != 4) {
                LuggageUploadMediaFileManager.m30417b(context, string2, string, CdnLogic.kMediaTypeAppVideo, 202, 2, z, this.f69741a);
            } else {
                LuggageUploadMediaFileManager.m30417b(context, string2, string, CdnLogic.kMediaTypeAppVideo, 202, 2, z, this.f69741a);
            }
        }
    }

    /* renamed from: a */
    public static void m30416a(Context context, WebViewJSSDKFileItem webViewJSSDKFileItem, String str, String str2, int i, int i2, int i3, boolean z, C24287c cVar) {
        Context context2 = context;
        WebViewJSSDKFileItem webViewJSSDKFileItem2 = webViewJSSDKFileItem;
        String str3 = str2;
        C24287c cVar2 = cVar;
        Class cls = C98201k.class;
        C24294r2 r2Var = new C24294r2(str3, cVar2);
        boolean z2 = !webViewJSSDKFileItem2.f283034t;
        C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).xs0("", webViewJSSDKFileItem2.f283024g, z2 ? 1 : 0, 0, 0, new PString(), new PInt(), new PInt())));
        String str4 = webViewJSSDKFileItem2.f283024g;
        String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(nP.f267378e, "", "", true);
        webViewJSSDKFileItem2.f283024g = TY;
        Log.m105925i("MicroMsg.UploadMediaFileHelp", "Image Inserted: %s", TY);
        boolean c = C6080m.Cx0().mo134803c(str, str2, i, i2, i3, r2Var);
        Log.m105925i("MicroMsg.UploadMediaFileHelp", "add cdn upload task result : %b", Boolean.valueOf(c));
        webViewJSSDKFileItem2.f283024g = str4;
        if (!c) {
            cVar2.mo41057a(false, "", "");
        } else if (z) {
            f69723g = C76879j.m92723Q(context, context2.getString(C0966R.string.a3h), context2.getString(C0966R.string.lmu), true, true, new C24295s2(r2Var, str3, cVar2));
        }
    }

    /* renamed from: b */
    public static void m30417b(Context context, String str, String str2, int i, int i2, int i3, boolean z, C24287c cVar) {
        C24296t2 t2Var = new C24296t2(str2, cVar);
        boolean c = C6080m.Cx0().mo134803c(str, str2, i, i2, i3, t2Var);
        Log.m105925i("MicroMsg.UploadMediaFileHelp", "add cdn upload task result : %b", Boolean.valueOf(c));
        if (!c) {
            cVar.mo41057a(false, "", "");
        } else if (z) {
            C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.lmu), true, true, new C24297u2(t2Var, str2, cVar));
            f69723g = Q;
            Q.setOnKeyListener(new C19422v2(context));
        }
    }

    /* renamed from: c */
    public final void mo41055c() {
        if (this.f69728e) {
            Bundle bundle = new Bundle();
            bundle.putString("local_id", this.f69727d);
            bundle.putString("app_id", this.f69726c);
            bundle.putBoolean("show_progress_tips", this.f69728e);
            C53507c.m60047a(this.f69724a, bundle, C24288e.class, new C24285a());
            return;
        }
        UploadMediaFileTask uploadMediaFileTask = new UploadMediaFileTask();
        uploadMediaFileTask.f69731g = this.f69727d;
        uploadMediaFileTask.f69732h = this.f69726c;
        uploadMediaFileTask.f69736o = new C24286b(uploadMediaFileTask);
        uploadMediaFileTask.mo114395c();
    }

    /* renamed from: d */
    public final void mo41056d() {
        if (this.f69725b.f117951u != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("close_window_confirm_dialog_switch", true);
            bundle.putString("close_window_confirm_dialog_title_cn", this.f69724a.getString(C0966R.string.lg_));
            bundle.putString("close_window_confirm_dialog_title_eng", this.f69724a.getString(C0966R.string.lg_));
            bundle.putString("close_window_confirm_dialog_ok_cn", this.f69724a.getString(C0966R.string.lg6));
            bundle.putString("close_window_confirm_dialog_ok_eng", this.f69724a.getString(C0966R.string.lg6));
            bundle.putString("close_window_confirm_dialog_cancel_cn", this.f69724a.getString(C0966R.string.lg7));
            bundle.putString("close_window_confirm_dialog_cancel_eng", this.f69724a.getString(C0966R.string.lg7));
            this.f69725b.f117951u.setCloseWindowConfirmInfo(bundle);
        }
        mo41055c();
    }
}
