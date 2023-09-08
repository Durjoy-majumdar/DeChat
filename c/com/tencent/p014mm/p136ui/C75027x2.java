package com.tencent.p014mm.p136ui;

import android.content.Intent;
import android.os.Handler;
import ck3.C67397f;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C34861g1;

/* renamed from: com.tencent.mm.ui.x2 */
public class C75027x2 implements C67397f {

    /* renamed from: d */
    public final /* synthetic */ NewChattingTabUI f220753d;

    /* renamed from: com.tencent.mm.ui.x2$a */
    public class C75028a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Exception f220754d;

        public C75028a(C75027x2 x2Var, Exception exc) {
            this.f220754d = exc;
        }

        public void run() {
            throw new RuntimeException(this.f220754d);
        }
    }

    public C75027x2(NewChattingTabUI newChattingTabUI) {
        this.f220753d = newChattingTabUI;
    }

    public boolean queueIdle() {
        try {
            boolean z = true;
            if (!this.f220753d.f214574a.isFinishing()) {
                if (!this.f220753d.f214574a.isDestroyed()) {
                    Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic start");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.f220753d.f214577d == null) {
                        NewChattingTabUI.m86091d(this.f220753d, new Intent().putExtra("Chat_User", ""), true);
                        this.f220753d.f214577d.setVisibility(8);
                        MainUI mainUI = (MainUI) ((HomeUI) this.f220753d.f214575b).f214291t.f214445o.get(0);
                        if (mainUI != null) {
                            C74720p pVar = mainUI.f219483v;
                            if (pVar != null) {
                                pVar.mo103888O();
                            }
                            mainUI.mo103817S();
                        }
                        Intent intent = new Intent();
                        C34861g1.m40517a(true, intent.putExtra("classname", LauncherUI.class.getName() + ""));
                    }
                    Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI logic use %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    return false;
                }
            }
            Object[] objArr = new Object[1];
            if (!this.f220753d.f214574a.isDestroyed()) {
                if (!this.f220753d.f214574a.isFinishing()) {
                    z = false;
                }
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "prepare chattingUI but activity finished isDestroyed[%b]", objArr);
            return false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LauncherUI.NewChattingTabUI", e, "", new Object[0]);
            new Handler().post(new C75028a(this, e));
        }
    }
}
