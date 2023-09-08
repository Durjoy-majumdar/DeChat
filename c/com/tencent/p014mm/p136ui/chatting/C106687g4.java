package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C106703g3;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.XFileSdk;
import gy3.C87412m;
import java.util.HashMap;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.ui.chatting.g4 */
public final class C106687g4 implements XFileSdk.ActionCallback {

    /* renamed from: a */
    public final /* synthetic */ C106690i4 f318940a;

    public C106687g4(C106690i4 i4Var) {
        this.f318940a = i4Var;
    }

    public void onDoubleTap(MotionEvent motionEvent) {
    }

    public void onGeneralCallback(String str, HashMap<String, Object> hashMap) {
    }

    public void onPageChange(int i, int i2, int i3) {
        Log.m105924i("MicroMsg.ScreenProfileReadyUI", "xfile onPageChange " + i + " and pageWidth " + i2 + " and pageHeight " + i3);
        C106703g3 profilePluginUi = this.f318940a.getProfilePluginUi();
        if (profilePluginUi != null) {
            profilePluginUi.f319014h = i;
        }
        C106703g3 profilePluginUi2 = this.f318940a.getProfilePluginUi();
        if (profilePluginUi2 != null) {
            profilePluginUi2.mo153677b();
        }
        C106690i4 i4Var = this.f318940a;
        if (!i4Var.f318949j) {
            i4Var.getClass();
            if (((float) i2) / ((float) i3) >= 1.3333334f) {
                FileSelectorUI.C72909b bVar = FileSelectorUI.f283702y;
                Context context = this.f318940a.getContext();
                C87412m.m108593f(context, "context");
                if (bVar.mo100786a(context) != 0) {
                    Context context2 = this.f318940a.getContext();
                    C87412m.m108593f(context2, "context");
                    if (bVar.mo100786a(context2) != 180) {
                        return;
                    }
                }
                C106690i4 i4Var2 = this.f318940a;
                i4Var2.f318949j = true;
                C106703g3 g3Var = i4Var2.f318948i;
                if (g3Var != null) {
                    Context context3 = g3Var.f319007a;
                    g3Var.f319017k = C76912y0.m92765d(context3, context3.getResources().getString(C0966R.string.h0k), C0966R.C0969drawable.ba9);
                }
            }
        }
    }

    public void onPageCountUpdate(int i) {
        Log.m105924i("MicroMsg.ScreenProfileReadyUI", "xfile onPageCountUpdate " + i);
        C106703g3 profilePluginUi = this.f318940a.getProfilePluginUi();
        if (profilePluginUi != null) {
            profilePluginUi.f319016j = i;
        }
        C106703g3 profilePluginUi2 = this.f318940a.getProfilePluginUi();
        if (profilePluginUi2 != null) {
            profilePluginUi2.mo153677b();
        }
    }

    public void onReachEnd() {
    }

    public void onSingleTap(MotionEvent motionEvent) {
    }

    public void onThumbnailLoad(int i, Bitmap bitmap) {
        C87412m.m108594g(bitmap, AssetExtension.SCENE_THUMBNAIL);
        Log.m105924i("MicroMsg.ScreenProfileReadyUI", "xfile onThumbnailLoad " + i);
    }

    public void onUserCancel() {
        Log.m105924i("MicroMsg.ScreenProfileReadyUI", "xfile on user cancel finish");
    }

    public void onUserOperated() {
    }

    public void onViewStatusChange(int i, float f, int i2, int i3, int i4, int i5) {
    }
}
