package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import j83.C9286a;
import p232rw.C77574q;
import p232rw.C77575r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.h */
public class C6175h implements C15601d<C77575r> {

    /* renamed from: d */
    public final /* synthetic */ OpenFileChooserUI f22641d;

    public C6175h(OpenFileChooserUI openFileChooserUI) {
        this.f22641d = openFileChooserUI;
    }

    public C66212f getContext() {
        return C66217g.f190253d;
    }

    public void resumeWith(Object obj) {
        Log.m105924i("MicroMsg.OpenFileChooserUI", "optRecord finish");
        if (obj instanceof C77575r) {
            C77575r rVar = (C77575r) obj;
            if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                C77574q qVar = rVar.f226149d;
                if (qVar.mo107739a()) {
                    String str = qVar.f226143b;
                    Intent intent = new Intent();
                    if (Util.isNullOrNil(str)) {
                        Log.m105921e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str);
                        intent.putExtra("key_pick_local_pic_fail_reason", "can't get the image's filePath!");
                        this.f22641d.setResult(1, intent);
                        this.f22641d.finish();
                        return;
                    } else if (!new C86009m1(str).mo119967g()) {
                        Log.m105921e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str);
                        intent.putExtra("key_pick_local_pic_fail_reason", "can't have access to the image!");
                        this.f22641d.setResult(1, intent);
                        this.f22641d.finish();
                        return;
                    } else {
                        C9286a.m8929a(new h$$a(this, str, intent, rVar));
                        return;
                    }
                } else {
                    OpenFileChooserUI openFileChooserUI = this.f22641d;
                    String str2 = qVar.f226143b;
                    openFileChooserUI.f22508n = str2;
                    Log.m105925i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str2);
                    OpenFileChooserUI openFileChooserUI2 = this.f22641d;
                    if (!openFileChooserUI2.mo7084N7(openFileChooserUI2.f22509o) && this.f22641d.mo7084N7(qVar.f226144c)) {
                        this.f22641d.f22509o = qVar.f226144c;
                    }
                    C86009m1 m1Var = null;
                    if (!TextUtils.isEmpty(this.f22641d.f22508n)) {
                        m1Var = new C86009m1(this.f22641d.f22508n);
                    }
                    if (m1Var == null || !m1Var.mo119967g()) {
                        Log.m105921e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", this.f22641d.f22508n);
                    } else {
                        Log.m105921e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", this.f22641d.f22508n);
                        OpenFileChooserUI openFileChooserUI3 = this.f22641d;
                        openFileChooserUI3.mo7080J7(openFileChooserUI3.f22508n);
                        return;
                    }
                }
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("key_pick_local_media_show_memory_warning", this.f22641d.f22513s);
                this.f22641d.setResult(rVar.f226147b, intent2);
                this.f22641d.finish();
                return;
            }
        }
        Intent intent3 = new Intent();
        intent3.putExtra("key_pick_local_media_show_memory_warning", this.f22641d.f22513s);
        this.f22641d.setResult(1, intent3);
        this.f22641d.finish();
    }
}
