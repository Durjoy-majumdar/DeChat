package com.tencent.p014mm.plugin.record.p094ui;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d62.C7250m;
import d62.C97425j;
import java.util.List;
import pc0.C100765f;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$e */
public class RecordMsgImageUI$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f272655d;

    /* renamed from: e */
    public final /* synthetic */ String f272656e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f272657f;

    /* renamed from: g */
    public final /* synthetic */ RecordMsgImageUI f272658g;

    public RecordMsgImageUI$$e(RecordMsgImageUI recordMsgImageUI, List list, String str, Runnable runnable) {
        this.f272658g = recordMsgImageUI;
        this.f272655d = list;
        this.f272656e = str;
        this.f272657f = runnable;
    }

    public void run() {
        String str;
        for (String str2 : this.f272655d) {
            C97425j a = C7250m.m7431a();
            AppCompatActivity context = this.f272658g.getContext();
            RecordMsgImageUI recordMsgImageUI = this.f272658g;
            String str3 = recordMsgImageUI.f272639o;
            C100765f fVar = new C100765f();
            int selectedItemPosition = recordMsgImageUI.f272635h.getSelectedItemPosition();
            if (-1 == selectedItemPosition) {
                Log.m105928w("MicroMsg.ShowImageUI", "error position");
                str = null;
            } else {
                str = recordMsgImageUI.f272636i.getItem(selectedItemPosition).mo128534t();
            }
            fVar.f295216d = str;
            fVar.f295214b = this.f272658g.f272638n;
            a.mo136256TG(context, str2, str3, 0, "", "", fVar);
            C7250m.m7431a().mo136252Ar(this.f272656e, str2);
        }
        MMHandlerThread.postToMainThread(this.f272657f);
    }

    public String toString() {
        return super.toString() + "|onActivityResult";
    }
}
