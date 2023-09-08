package vl2;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75592q0;
import gy3.C87412m;
import nj3.C76879j;
import nj3.C76912y0;
import qs3.C22126b;
import yc3.C38992a;

/* renamed from: vl2.p */
public final class C37762p implements C38992a {

    /* renamed from: vl2.p$a */
    public static final class C37763a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f100027d;

        /* renamed from: e */
        public final /* synthetic */ String f100028e;

        public C37763a(Context context, String str) {
            this.f100027d = context;
            this.f100028e = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Context context = this.f100027d;
            String str = this.f100028e;
            ClipboardHelper.setText(context, str, str);
        }
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        String str2;
        boolean z = false;
        if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("showDebug", strArr[1]) && strArr.length > 2) {
            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            if (Util.getInt(strArr[2], 0) == 1) {
                z = true;
            }
            singleMMKV.putBoolean("scan_debug_show_debug_view", z);
            singleMMKV.apply();
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("clearSearch", strArr[1]) && strArr.length > 1) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(C75592q0.m90789s() + "__image_gallery_search_preview_slot_mmkv_key__");
            if (mmkv != null) {
                mmkv.clearAll();
            }
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("clearConfig", strArr[1]) && strArr.length > 1) {
            MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV(C75592q0.m90789s() + "_scan_config_mmkv");
            if (mmkv2 != null) {
                mmkv2.clearAll();
            }
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("wordDetect", strArr[1]) && strArr.length > 1) {
            if (Util.getInt(strArr[2], 1) == 0) {
                z = true;
            }
            C30391y.f81989a = Boolean.valueOf(z);
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("loadLocalSo", strArr[1]) && strArr.length > 2) {
            MultiProcessMMKV singleMMKV2 = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            singleMMKV2.putBoolean("loadSoFromSDCard", Util.getInt(strArr[2], 0) == 1);
            C76912y0.makeText(context, (CharSequence) "success", 0).show();
            singleMMKV2.apply();
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("loadLocalConfig", strArr[1]) && strArr.length > 2) {
            MultiProcessMMKV singleMMKV3 = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            if (C87412m.m108589b(strArr[2], "null")) {
                singleMMKV3.putString("debugFFEngineConfig", "");
                C76912y0.makeText(context, (CharSequence) "cancel success", 0).show();
                return true;
            } else if (C86013q1.m106450k(strArr[2])) {
                singleMMKV3.putString("debugFFEngineConfig", C86013q1.m106432N(strArr[2]));
                C76912y0.makeText(context, (CharSequence) "success", 0).show();
                return true;
            } else {
                C76912y0.makeText(context, (CharSequence) "config file not exist", 0).show();
                singleMMKV3.apply();
                return false;
            }
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("skipFrame", strArr[1]) && strArr.length >= 2) {
            MultiProcessMMKV singleMMKV4 = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            singleMMKV4.putInt("skipFrame", Util.getInt(strArr[2], -1));
            C76912y0.makeText(context, (CharSequence) "success", 0).show();
            singleMMKV4.apply();
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("serverDetect", strArr[1]) && strArr.length >= 2) {
            MultiProcessMMKV singleMMKV5 = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            singleMMKV5.putBoolean("serverDetect", Util.getInt(strArr[2], 0) == 1);
            C76912y0.makeText(context, (CharSequence) "success", 0).show();
            singleMMKV5.apply();
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("localDetect", strArr[1]) && strArr.length >= 2) {
            MultiProcessMMKV singleMMKV6 = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            singleMMKV6.putBoolean("localDetect", Util.getInt(strArr[2], 1) == 1);
            C76912y0.makeText(context, (CharSequence) "success", 0).show();
            singleMMKV6.apply();
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("disableMerge", strArr[1]) && strArr.length >= 2) {
            MultiProcessMMKV singleMMKV7 = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            singleMMKV7.putBoolean("disableMerge", Util.getInt(strArr[2], 0) == 1);
            C76912y0.makeText(context, (CharSequence) "success", 0).show();
            singleMMKV7.apply();
            return true;
        } else if (strArr != null && C87412m.m108589b("//scan", strArr[0]) && C87412m.m108589b("xnet", strArr[1]) && strArr.length >= 2) {
            MultiProcessMMKV singleMMKV8 = MultiProcessMMKV.getSingleMMKV("ScanDebug");
            singleMMKV8.putBoolean("useXNet", Util.getInt(strArr[2], 0) == 1);
            C76912y0.makeText(context, (CharSequence) "success", 0).show();
            singleMMKV8.apply();
            return true;
        } else if (strArr == null || !C87412m.m108589b("//scan", strArr[0]) || strArr.length < 2 || !C87412m.m108589b("dump", strArr[1])) {
            return false;
        } else {
            C22126b bVar = C22126b.f62576D;
            String str3 = "扫码\n" + C22126b.f62576D.mo35210d() + "\n\n图片识别\n" + C22126b.f62577E.mo35210d();
            if (context == null || (str2 = context.getString(C0966R.string.f7936wt)) == null) {
                str2 = "";
            }
            C76879j.m92754y(context, str3, "", str2, new C37763a(context, str3));
            return true;
        }
    }
}
