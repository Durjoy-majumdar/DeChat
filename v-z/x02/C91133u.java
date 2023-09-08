package x02;

import a12.C27734k;
import android.content.Context;
import android.content.DialogInterface;
import b12.C79645d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.C90430p93;
import te3.C90439s93;
import te3.C90441u93;
import te3.C90448yt3;
import tw0.C37285a;
import tw0.C90584e;
import y02.C91359c;
import y02.C91361e;
import y02.C91363f;
import yc3.C38992a;
import zw3.C91941a;

/* renamed from: x02.u */
public class C91133u implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        String[] strArr2 = strArr;
        if (strArr2.length < 2) {
            Log.m105918d("MicroMsg.Tinker.TinkerBootsCommand", "no args input.");
            return false;
        }
        String str2 = strArr2[1];
        String str3 = "";
        if (CrashReportFactory.hasDebuger()) {
            str2.getClass();
            char c = 65535;
            switch (str2.hashCode()) {
                case -838846263:
                    if (str2.equals("update")) {
                        c = 0;
                        break;
                    }
                    break;
                case -309518737:
                    if (str2.equals("process")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3477:
                    if (str2.equals("mb")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3510:
                    if (str2.equals("nd")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3083269:
                    if (str2.equals("diff")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3089570:
                    if (str2.equals("down")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3529469:
                    if (str2.equals("show")) {
                        c = 6;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2067292548:
                    if (str2.equals("showall")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Log.m105918d("MicroMsg.Tinker.TinkerBootsCommand", "command checkout update.");
                    new LinkedList();
                    LinkedList<C90430p93> b = C91363f.m114614b();
                    StringBuilder sb = new StringBuilder();
                    Iterator<C90430p93> it = b.iterator();
                    while (it.hasNext()) {
                        C90430p93 next = it.next();
                        sb.append(next.f259737d);
                        sb.append(XVFSFile.PATH_SEPARATOR);
                        sb.append(next.f259738e);
                        sb.append("\n");
                    }
                    Log.m105919d("MicroMsg.Tinker.TinkerBootsCommand", "BaseID:%s PatchID:%s %s", "tinker_id_2468c5efe7670b901f7738f7a699d3843acc3651_arm64-v8a", str3, sb.toString());
                    C86709a0.m107524d().mo123460f(new C91361e("tinker_id_2468c5efe7670b901f7738f7a699d3843acc3651_arm64-v8a", str3, b, true));
                    return true;
                case 1:
                    C90441u93 u932 = new C90441u93();
                    u932.f259858j = 1000;
                    u932.f259855g = 3;
                    u932.f259856h = 2;
                    u932.f259853e = 2;
                    u932.f259852d = "android_tinker_id_123123131231231";
                    C90448yt3 yt32 = new C90448yt3();
                    yt32.f259943d = "3ba62fdbd98df2bdf5da7d726010d867";
                    yt32.f259950n = 33338711;
                    yt32.f259945f = HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.flj) + "/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
                    u932.f259857i = yt32;
                    C90439s93 s932 = new C90439s93();
                    s932.f259833d = ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION;
                    s932.f259834e = "0x26060510";
                    u932.f259859n.add(s932);
                    C90439s93 s933 = new C90439s93();
                    s933.f259833d = "alphaTitle";
                    s933.f259834e = "叫你更新你就更新";
                    u932.f259859n.add(s933);
                    C90439s93 s934 = new C90439s93();
                    s934.f259833d = "alphaContent";
                    s934.f259834e = "这个包可以抢到的红包最大，抢红包速度最快。";
                    u932.f259859n.add(s934);
                    C90439s93 s935 = new C90439s93();
                    s935.f259833d = "alphaUrl";
                    s935.f259834e = "www.qq.com";
                    u932.f259859n.add(s935);
                    new C91124n(new TinkerSyncResponse(u932)).mo125187f(true);
                    return true;
                case 2:
                    Log.m105918d("MicroMsg.Tinker.TinkerBootsCommand", "command checkout mb update.");
                    String str4 = (strArr2.length < 3 || Util.isNullOrNil(strArr2[2])) ? "default" : strArr2[2];
                    if (strArr2.length >= 4 && !Util.isNullOrNil(strArr2[3])) {
                        str3 = strArr2[3];
                    }
                    String str5 = str3;
                    Log.m105919d("MicroMsg.Tinker.TinkerBootsCommand", "BaseID:%s PatchID:%s", str4, str5);
                    C86709a0.m107524d().mo123460f(new C91359c("magicemo", str4, str5, true, new C91129r(this)));
                    return true;
                case 3:
                    if (strArr2.length >= 6) {
                        String str6 = strArr2[2];
                        String str7 = strArr2[3];
                        String str8 = strArr2[4];
                        Util.safeParseLong(strArr2[5]);
                    }
                    return true;
                case 4:
                    C86709a0.m107525e().postToWorker(new C91130s(this, strArr2));
                    return true;
                case 5:
                    C90441u93 u933 = new C90441u93();
                    u933.f259858j = 1000;
                    u933.f259855g = 2;
                    u933.f259856h = 2;
                    u933.f259853e = 2;
                    u933.f259852d = "android_tinker_id_123123131231231";
                    C90448yt3 yt33 = new C90448yt3();
                    yt33.f259943d = "c3282ad2467fad9561227bc9b5b6712c";
                    yt33.f259950n = 118617;
                    yt33.f259945f = HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.flj) + "/weixin/checkresupdate/0x2605136d.3144f5.0x26051334.bf52fb_1510754399.apk";
                    u933.f259855g = 3;
                    yt33.f259943d = "3ba62fdbd98df2bdf5da7d726010d867";
                    yt33.f259950n = 33338711;
                    yt33.f259945f = HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.flj) + "/weixin/checkresupdate/0x26051363.6cc887.0x26051087.a44d04_1510750804.apk";
                    u933.f259857i = yt33;
                    new C91124n(new TinkerSyncResponse(u933)).mo125187f(false);
                    return true;
                case 6:
                    C78762x.m95149a(MMApplicationContext.getContext().getString(C0966R.string.f0j), MMApplicationContext.getContext().getString(C0966R.string.f0j), MMApplicationContext.getContext().getString(C0966R.string.frd), new C38437q(this), MMApplicationContext.getContext().getString(C0966R.string.k6v), (DialogInterface.OnClickListener) null);
                    return true;
                case 7:
                    MMApplicationContext.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", str3).apply();
                    C27734k.m37983b(MMApplicationContext.getContext(), str3);
                    C27734k.m37984c(MMApplicationContext.getContext(), 0);
                    C79645d.m96730f(MMApplicationContext.getContext());
                    return true;
                case 8:
                    List<C37285a> c102 = ((C90584e) C86312j.m106911c(C90584e.class)).c10();
                    if (!c102.isEmpty()) {
                        Log.m105920e("MicroMsg.Tinker.TinkerBootsCommand", "start day active keys");
                        for (C37285a next2 : c102) {
                            Log.m105925i("MicroMsg.Tinker.TinkerBootsCommand", "key:%s active:%d", Integer.toHexString(next2.field_key), Integer.valueOf(next2.field_dau));
                        }
                    }
                    return true;
                default:
                    Log.m105919d("MicroMsg.Tinker.TinkerBootsCommand", "%s i not a debugger command.", str2);
                    break;
            }
        }
        str2.getClass();
        if (!str2.equals("check")) {
            Log.m105919d("MicroMsg.Tinker.TinkerBootsCommand", "%s is not a release command.", str2);
            return false;
        }
        try {
            C91941a.m115469d().mo125791a(true);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Tinker.TinkerBootsCommand", e, str3, new Object[0]);
        }
        return true;
    }
}
