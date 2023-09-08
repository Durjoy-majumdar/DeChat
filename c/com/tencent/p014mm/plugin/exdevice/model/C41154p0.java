package com.tencent.p014mm.plugin.exdevice.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import nj3.C76879j;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.p0 */
public enum C41154p0 {
    INSTANCE;
    

    /* renamed from: d */
    public ProgressDialog f110873d;

    /* renamed from: e */
    public boolean f110874e;

    /* renamed from: f */
    public boolean f110875f;

    /* renamed from: g */
    public WeakReference<C41156b> f110876g;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.p0$a */
    public class C41155a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C41176x0 f110877d;

        /* renamed from: e */
        public final /* synthetic */ C41156b f110878e;

        public C41155a(C41176x0 x0Var, C41156b bVar) {
            this.f110877d = x0Var;
            this.f110878e = bVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107529k().f251779b.mo123458d(this.f110877d);
            ProgressDialog progressDialog = C41154p0.this.f110873d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            C41154p0.this.f110874e = false;
            C41156b bVar = this.f110878e;
            if (bVar != null) {
                bVar.mo64221a(false);
            }
            C41154p0.this.f110873d = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.p0$b */
    public interface C41156b {
        /* renamed from: a */
        void mo64221a(boolean z);
    }

    /* renamed from: a */
    public static void m44593a(C41154p0 p0Var, C53753b bVar) {
        String str;
        p0Var.getClass();
        if (bVar != null && (str = bVar.field_connProto) != null) {
            if (str.contains("1") || bVar.field_connProto.contains("3")) {
                Log.m105919d("MicroMsg.exdevice.GetBoundDeviceLogic", "disconnect deviceId %s, deviceType %s ", bVar.field_deviceID, bVar.field_deviceType);
                C41166r1.xx0().mo64204b(bVar.field_mac);
            }
        }
    }

    /* renamed from: b */
    public boolean mo64215b(boolean z) {
        if (this.f110874e) {
            Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound device now, just leave");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0);
        long j = sharedPreferences.getLong(C86709a0.m107523b().mo121110g() + "", 0);
        if (z || currentTimeMillis - j >= 86400000) {
            return true;
        }
        Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardDevices not now pp");
        return false;
    }

    /* renamed from: c */
    public boolean mo64216c(boolean z) {
        if (this.f110875f) {
            Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound iotDevice now, just leave");
            return false;
        } else if (z) {
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("exdevice_kv");
            if (currentTimeMillis - mmkv.getLong(C86709a0.m107523b().mo121110g() + "_iot", 0) >= 86400000) {
                return true;
            }
            Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardIotDevices not now");
            return false;
        }
    }

    /* renamed from: e */
    public void mo64217e(Context context, C41156b bVar) {
        Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetBoundHardDevices");
        if (this.f110874e) {
            if (this.f110876g == null) {
                this.f110876g = new WeakReference<>(bVar);
            }
            Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting bound device now, just leave");
            return;
        }
        C41176x0 x0Var = new C41176x0(1);
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            ProgressDialog progressDialog = this.f110873d;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f110873d.dismiss();
                this.f110873d = null;
            }
            boolean z = false;
            Class<LauncherUI> cls = LauncherUI.class;
            try {
                ArrayList<LauncherUI> arrayList = LauncherUI.f214332A;
                if (!cls.isInstance(context)) {
                    int i = ChattingUI.f215276r;
                    if (!ChattingUI.class.isInstance(context)) {
                        String str = BaseConversationUI.TAG;
                        if (!BaseConversationUI.class.isInstance(context)) {
                            z = true;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.exdevice.GetBoundDeviceLogic", th, "", new Object[0]);
            }
            if (z) {
                this.f110873d = C76879j.m92724R(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.f361235id1), true, true, new C41155a(x0Var, bVar));
            }
        }
        this.f110876g = new WeakReference<>(bVar);
        C86709a0.m107529k().f251779b.mo123460f(x0Var);
        this.f110874e = true;
    }

    /* renamed from: f */
    public void mo64218f() {
        if (this.f110875f) {
            Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting iot device now, just leave");
            return;
        }
        Log.m105924i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetUserBindIotDevices");
        C86709a0.m107529k().f251779b.mo123457c(6693);
        C86709a0.m107529k().f251779b.mo123460f(new C41120a1());
        this.f110875f = true;
    }

    /* renamed from: g */
    public void mo64219g(long j) {
        Log.m105925i("MicroMsg.exdevice.GetBoundDeviceLogic", "update get bound hard device time : %d", Long.valueOf(j));
        SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("exdevice_pref", 0).edit();
        edit.putLong(C86709a0.m107523b().mo121110g() + "", j).commit();
    }
}
