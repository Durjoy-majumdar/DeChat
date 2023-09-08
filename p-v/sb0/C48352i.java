package sb0;

import bd2.C79690d;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import rb0.C48009v0;

/* renamed from: sb0.i */
public class C48352i {
    /* renamed from: a */
    public final void mo73071a(String str, String str2, int i) {
        Class cls = C79690d.class;
        Class cls2 = C75700k0.class;
        long h = C48340e.m53667h(str);
        if (h == -1) {
            Log.m105925i("MicroMsg.BizChatStatusNotifyService", "qy_status_notify bizLocalId == -1,%s", str);
            return;
        }
        int i2 = C48009v0.Dx0().mo73024Yt(h).field_newUnReadCount;
        C48009v0.Dx0().mo73019DN(h);
        C48334c a0 = C48009v0.Ax0().mo73042a0(h);
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69771j(str2);
        if (j == null) {
            Log.m105929w("MicroMsg.BizChatStatusNotifyService", "qy_status_notify cvs == null:%s", str2);
        } else if (a0.mo73033l2(1)) {
            if (j.mo108788I2() <= i2) {
                j.mo108817i3(0);
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69773k0(j, str2);
                ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93211h(str2);
                return;
            }
            j.mo108817i3(j.mo108788I2() - i2);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69773k0(j, str2);
        } else if (j.mo108786G2() <= i2) {
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69778p0(str2);
            ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93211h(str2);
        } else {
            j.mo108789J2(0);
            j.mo108812g3(j.mo108786G2() - i2);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69773k0(j, str2);
        }
    }

    /* renamed from: b */
    public void mo73072b(int i, String str, String str2) {
        if ("EnterpriseChatStatus".equals(str)) {
            String[] split = str2.split(";");
            String str3 = split[0];
            String str4 = split[1];
            int i2 = Util.getInt(split[2], 0);
            if (i == 7) {
                mo73071a(str4, str3, i2);
            } else if (i == 8) {
                mo73071a(str4, str3, i2);
            } else if (i == 9) {
                mo73071a(str4, str3, i2);
            }
        }
    }
}
