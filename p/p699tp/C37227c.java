package p699tp;

import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.plugin.downloader.api.C29841c;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;

/* renamed from: tp.c */
public class C37227c implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                ((C29841c) C86312j.m106911c(C29841c.class)).mo56946mp(false);
            }
        }
    }

    public void onAppForeground(String str) {
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                ((C29841c) C86312j.m106911c(C29841c.class)).mo56946mp(true);
            }
        }
    }
}
