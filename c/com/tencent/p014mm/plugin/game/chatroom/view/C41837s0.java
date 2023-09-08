package com.tencent.p014mm.plugin.game.chatroom.view;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BackgroundInfo;
import uy1.C52645f;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.s0 */
public final class C41837s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BackgroundInfo f112778d;

    /* renamed from: e */
    public final /* synthetic */ JoinRoomExternalConfirmView f112779e;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.s0$a */
    public static final class C41838a implements C52645f.C52652e {

        /* renamed from: a */
        public final /* synthetic */ JoinRoomExternalConfirmView f112780a;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.s0$a$a */
        public static final class C41839a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ JoinRoomExternalConfirmView f112781d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f112782e;

            public C41839a(JoinRoomExternalConfirmView joinRoomExternalConfirmView, Bitmap bitmap) {
                this.f112781d = joinRoomExternalConfirmView;
                this.f112782e = bitmap;
            }

            public final void run() {
                this.f112781d.f112590f.f123136a.getLayoutParams().width = this.f112781d.getWidth();
                this.f112781d.f112590f.f123136a.getLayoutParams().height = this.f112781d.getHeight();
                this.f112781d.f112590f.f123136a.requestLayout();
                Bitmap bitmap = this.f112782e;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f112781d.f112590f.f123136a.setImageBitmap(this.f112782e);
                }
            }
        }

        public C41838a(JoinRoomExternalConfirmView joinRoomExternalConfirmView) {
            this.f112780a = joinRoomExternalConfirmView;
        }

        /* renamed from: a */
        public void mo65432a(View view, Bitmap bitmap) {
            if (bitmap != null) {
                JoinRoomExternalConfirmView joinRoomExternalConfirmView = this.f112780a;
                joinRoomExternalConfirmView.f112590f.f123136a.post(new C41839a(joinRoomExternalConfirmView, bitmap));
            }
        }

        /* renamed from: b */
        public void mo65433b(String str, View view) {
        }
    }

    public C41837s0(BackgroundInfo backgroundInfo, JoinRoomExternalConfirmView joinRoomExternalConfirmView) {
        this.f112778d = backgroundInfo;
        this.f112779e = joinRoomExternalConfirmView;
    }

    public final void run() {
        C52645f.m59023a().mo73595e((ImageView) null, this.f112778d.background_url, (C52645f.C52650d) null, new C41838a(this.f112779e));
    }
}
