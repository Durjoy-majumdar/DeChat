package com.tencent.p014mm.pluginsdk.model.file;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.lan_cs.SmartServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import f40.C86718e;
import gy3.C87412m;
import h81.C32735h;
import kj2.C117407d;

/* renamed from: com.tencent.mm.pluginsdk.model.file.FileSmartServerMgr */
public final class FileSmartServerMgr implements SmartServer.C68054a {

    /* renamed from: a */
    public static final FileSmartServerMgr f211575a = new FileSmartServerMgr();

    /* renamed from: b */
    public static boolean f211576b = false;

    /* renamed from: c */
    public static String f211577c = "";

    static {
        new FileSmartServerMgr$logoutListener$1(C40008f.f107254d).alive();
    }

    /* renamed from: a */
    public void mo93529a(String str, int i) {
        Log.m105928w("MicroMsg.FileSmartServerMgr", "onSendFail " + str + ", " + i);
        C117407d.INSTANCE.idkeyStat(1680, 4, 1, false);
    }

    /* renamed from: b */
    public void mo93530b(String str, long j, long j2) {
        Log.m105928w("MicroMsg.FileSmartServerMgr", "onSendProgressChange " + str + ' ' + j + ' ' + j2);
    }

    /* renamed from: c */
    public void mo93531c(String str) {
        Log.m105928w("MicroMsg.FileSmartServerMgr", "onSendSucc " + str);
        C117407d.INSTANCE.idkeyStat(1680, 3, 1, false);
    }

    /* renamed from: d */
    public final String mo100180d(C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msgInfo");
        if (!f211576b) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/lan_");
        sb.append(f4Var.mo108768t());
        sb.append('_');
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("system_config_prefs");
        sb.append(!mmkv.decodeBool("has_uin_timely", false) ? C86718e.m107549h() : mmkv.decodeInt("default_uin_timely", 0));
        sb.append('_');
        sb.append(f4Var.getMsgId());
        sb.append('_');
        sb.append(f4Var.getCreateTime());
        return sb.toString();
    }

    /* renamed from: e */
    public final long mo100181e() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_file_lan_send_idle_timeout_ms, 60000);
    }
}
