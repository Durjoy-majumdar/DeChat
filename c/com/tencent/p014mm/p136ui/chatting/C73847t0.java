package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98429r0;
import java.util.Iterator;
import java.util.List;
import p158gt.C98201k;
import p682rz.C101491u;
import qg2.C101147j0;
import te3.C101834rc0;
import te3.C77915dp3;

/* renamed from: com.tencent.mm.ui.chatting.t0 */
public final class C73847t0 {

    /* renamed from: a */
    public static final C73847t0 f216715a = new C73847t0();

    /* renamed from: a */
    public final boolean mo102884a(List<? extends C72963f4> list, long j) {
        C68070l.C68072b u;
        C87412m.m108594g(list, "selectItems");
        for (C72963f4 f4Var : list) {
            if (f4Var.mo101020w3() && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null && u.f195582i == 6) {
                int i = u.f195594l;
                if (((long) i) > j) {
                    Log.m105929w("MicroMsg.ChattingEditModeRetransmitMsg", "file is too large, %s", Util.getSizeKB((long) i));
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo102885b(List<? extends C72963f4> list, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        C87412m.m108594g(list, "selectItems");
        Class cls = C101491u.class;
        long j2 = 0;
        for (C72963f4 f4Var : list) {
            C98408n0 n0Var = null;
            if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
                C98408n0 Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(f4Var.mo108765s2());
                if (Zd != null) {
                    i = Zd.f288559f;
                    if (C98429r0.m127830u()) {
                        n0Var = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
                    }
                } else {
                    i = 0;
                }
                j2 += (long) i;
                Log.m105919d("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, videoSize:%s", Integer.valueOf(i));
                if (n0Var != null) {
                    j2 += (long) n0Var.f288559f;
                    Log.m105919d("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, after add origin videoSize:%s", Long.valueOf(j2));
                }
            } else if (f4Var.mo100979R3()) {
                int i5 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2()).f267377d;
                j2 += (long) i5;
                Log.m105919d("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, imgSize:%s", Integer.valueOf(i5));
            } else if (f4Var.mo101020w3()) {
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                if (u != null && u.f195582i == 6) {
                    int i6 = u.f195594l;
                    j2 += (long) i6;
                    Log.m105919d("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, fileSize:%s", Integer.valueOf(i6));
                } else if (u != null && ((i2 = u.f195582i) == 24 || i2 == 19)) {
                    C77915dp3 x = C101147j0.m132643x(u.f195571f0);
                    if (x != null) {
                        Iterator<C101834rc0> it = x.f227155f.iterator();
                        i3 = 0;
                        while (it.hasNext()) {
                            C101834rc0 next = it.next();
                            if (next.f299258I == 17) {
                                C77915dp3 x2 = C101147j0.m132643x(next.f299326s1);
                                if (x2 != null) {
                                    Iterator<C101834rc0> it4 = x2.f227155f.iterator();
                                    i4 = 0;
                                    while (it4.hasNext()) {
                                        i4 += (int) it4.next().f299276R;
                                    }
                                } else {
                                    i4 = 0;
                                }
                            } else {
                                i4 = (int) next.f299276R;
                            }
                            i3 += i4;
                        }
                    } else {
                        i3 = 0;
                    }
                    j2 += (long) i3;
                    Log.m105919d("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, noteSize:%s", Integer.valueOf(i3));
                }
            }
        }
        Log.m105925i("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, totalSize:%s", Long.valueOf(j2));
        return j2 > j;
    }
}
