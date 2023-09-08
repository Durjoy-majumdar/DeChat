package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import nj3.C76879j;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.b */
public class C93556b implements C96875r0.C96876a {

    /* renamed from: d */
    public final /* synthetic */ FavoriteFileDetailUI f270207d;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.b$a */
    public class C93557a implements Runnable {
        public C93557a() {
        }

        public void run() {
            C76879j.m92738i(C93556b.this.f270207d.getContext(), C0966R.string.kae, C0966R.string.f361492kb2);
            FavoriteFileDetailUI favoriteFileDetailUI = C93556b.this.f270207d;
            Bitmap i = FavoriteImageServer.m118080i(favoriteFileDetailUI.f270042C, favoriteFileDetailUI.f270041B);
            ImageView imageView = (ImageView) C93556b.this.f270207d.findViewById(C0966R.C0970id.f359495l82);
            if (imageView != null) {
                imageView.setImageBitmap(i);
                imageView.setVisibility(0);
            }
        }
    }

    public C93556b(FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f270207d = favoriteFileDetailUI;
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    public void onCompletion() {
    }

    public void onError(int i, int i2) {
        this.f270207d.f270072w.stop();
        FavoriteFileDetailUI favoriteFileDetailUI = this.f270207d;
        if (!favoriteFileDetailUI.f270044E) {
            favoriteFileDetailUI.f270044E = true;
            MMHandlerThread.postToMainThread(new C93557a());
        }
    }

    public void onPrepared() {
        Log.m105918d("MicroMsg.FavoriteFileDetailUI", C76861g.m92659b() + " onPrepared");
        this.f270207d.f270072w.setLoop(true);
        this.f270207d.f270072w.start();
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }
}
