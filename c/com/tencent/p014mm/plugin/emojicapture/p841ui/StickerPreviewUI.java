package com.tencent.p014mm.plugin.emojicapture.p841ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emojicapture.p841ui.preview.StickerPreviewView;
import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e71.C97609f;
import f90.C107509b;
import fy3.C32226l;
import i72.C108388k;
import in3.C87773e;
import kotlin.Metadata;
import nj3.C88989a;
import p447aw.C103918d;
import sh3.C101624e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/StickerPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI */
public final class StickerPreviewUI extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f269212g = 0;

    /* renamed from: d */
    public final String f269213d = "MicroMsg.StickerPreviewUI";

    /* renamed from: e */
    public String f269214e;

    /* renamed from: f */
    public StickerPreviewView f269215f;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI$a */
    public static final class C93295a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ StickerPreviewUI f269216d;

        public C93295a(StickerPreviewUI stickerPreviewUI) {
            this.f269216d = stickerPreviewUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f269216d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI$b */
    public static final class C93296b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StickerPreviewUI f269217d;

        public C93296b(StickerPreviewUI stickerPreviewUI) {
            this.f269217d = stickerPreviewUI;
        }

        public final void run() {
            StickerPreviewUI stickerPreviewUI = this.f269217d;
            int i = StickerPreviewUI.f269212g;
            Class cls = C103918d.class;
            StickerPreviewView stickerPreviewView = (StickerPreviewView) stickerPreviewUI.findViewById(C0966R.C0970id.k1y);
            stickerPreviewUI.f269215f = stickerPreviewView;
            String str = stickerPreviewUI.f269214e;
            if (!(str == null || stickerPreviewView == null)) {
                stickerPreviewView.setStickerUrl(str);
            }
            if (((C103918d) C86312j.m106911c(cls)).Gd0(stickerPreviewUI, "android.permission.CAMERA")) {
                StickerPreviewView stickerPreviewView2 = stickerPreviewUI.f269215f;
                if (stickerPreviewView2 != null) {
                    C107509b.m145625i(stickerPreviewView2.f269378D, stickerPreviewView2.f269383I, (Float) null, (C32226l) null, 6, (Object) null);
                    return;
                }
                return;
            }
            Log.m105924i(stickerPreviewUI.f269213d, "initOnCreateAfterConnected: no permission");
            ((C103918d) C86312j.m106911c(cls)).eu0(1001, new C97609f(stickerPreviewUI), "android.permission.CAMERA");
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(-1, C0966R.C0968anim.f2331s);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5q;
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0966R.C0968anim.f2330r, -1);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(134217728);
        }
        setActionbarColor(0);
        updateBackBtn(getDrawable(C0966R.raw.actionbar_icon_light_close));
        C87773e.m109211d(getWindow());
        setBackBtn(new C93295a(this));
        setMMTitle((int) C0966R.string.f361408jn3);
        this.f269214e = getIntent().getStringExtra("sticker_url");
        C108388k.m146839e();
        EmojiCaptureProxy.f269148h.mo127970a();
        C96905d serverProxy = EmojiCaptureProxy.f269149i.getServerProxy();
        if (serverProxy != null) {
            serverProxy.mo135257a(new C93296b(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        StickerPreviewView stickerPreviewView = this.f269215f;
        if (stickerPreviewView != null) {
            C101624e.f297484a.mo141089f(stickerPreviewView.f269385K);
        }
    }

    public void onPause() {
        super.onPause();
        StickerPreviewView stickerPreviewView = this.f269215f;
        if (stickerPreviewView != null) {
            stickerPreviewView.f269378D.mo157937k();
        }
    }

    public void onResume() {
        super.onResume();
        StickerPreviewView stickerPreviewView = this.f269215f;
        if (stickerPreviewView != null) {
            C107509b.m145625i(stickerPreviewView.f269378D, stickerPreviewView.f269383I, (Float) null, (C32226l) null, 6, (Object) null);
        }
    }
}
