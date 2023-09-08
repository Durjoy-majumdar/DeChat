package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Base64;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import p206nj.C76861g;
import p500dy.C97560f;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$l */
public class RecordMsgFileUI$$l implements C96875r0.C96876a {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgFileUI f272617d;

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$l$a */
    public class C5041a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f20376d;

        /* renamed from: e */
        public final /* synthetic */ String f20377e;

        public C5041a(Bitmap bitmap, String str) {
            this.f20376d = bitmap;
            this.f20377e = str;
        }

        public void run() {
            ImageView imageView = (ImageView) RecordMsgFileUI$$l.this.f272617d.findViewById(C0966R.C0970id.f359495l82);
            imageView.setImageBitmap(this.f20376d);
            imageView.setVisibility(0);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType((Context) RecordMsgFileUI$$l.this.f272617d.getContext(), intent, new C86009m1(this.f20377e), "video/*", false);
            try {
                RecordMsgFileUI recordMsgFileUI = RecordMsgFileUI$$l.this.f272617d;
                Intent createChooser = Intent.createChooser(intent, recordMsgFileUI.getString(C0966R.string.cs8));
                C9556a aVar = new C9556a();
                aVar.mo10233c(createChooser);
                C117292a.m165358d(recordMsgFileUI, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$7$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                recordMsgFileUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(recordMsgFileUI, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$7$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.RecordMsgFileUI", "startActivity fail, activity not found");
                C76879j.m92738i(RecordMsgFileUI$$l.this.f272617d.getContext(), C0966R.string.cpc, C0966R.string.cpd);
            }
        }
    }

    public RecordMsgFileUI$$l(RecordMsgFileUI recordMsgFileUI) {
        this.f272617d = recordMsgFileUI;
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    public void onCompletion() {
    }

    public void onError(int i, int i2) {
        this.f272617d.f272592q.stop();
        RecordMsgFileUI recordMsgFileUI = this.f272617d;
        if (!recordMsgFileUI.f272600y) {
            recordMsgFileUI.f272600y = true;
            Bitmap h = recordMsgFileUI.f272599x.mo140592h(recordMsgFileUI.f272596u, recordMsgFileUI.f272594s);
            String videoPath = this.f272617d.f272592q.getVideoPath();
            CrashReportFactory.reportRawMessage(Base64.encodeToString((((C97560f) C86312j.m106911c(C97560f.class)).mo136822Ww() + "[RecordMsgFileUI] on play sight error, what=" + i + ", extra=" + i2 + ", path=" + Util.nullAs(videoPath, "")).getBytes(), 2), "FullScreenPlaySight");
            MMHandlerThread.postToMainThread(new C5041a(h, videoPath));
        }
    }

    public void onPrepared() {
        Log.m105918d("MicroMsg.RecordMsgFileUI", C76861g.m92659b() + " onPrepared");
        this.f272617d.f272592q.setLoop(true);
        this.f272617d.f272592q.start();
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }
}
