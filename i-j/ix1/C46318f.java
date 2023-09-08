package ix1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgImage;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import dx1.C45487c;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kx1.C46787a;
import p158gt.C98201k;
import p192l4.C10462b;
import rx3.C13598b0;
import yw1.C53601h;

/* renamed from: ix1.f */
public final class C46318f extends C46337n {

    /* renamed from: k1 */
    public static final /* synthetic */ int f124790k1 = 0;

    /* renamed from: g1 */
    public C45487c f124791g1;

    /* renamed from: h1 */
    public ChatroomMsgImage f124792h1;

    /* renamed from: i1 */
    public String f124793i1;

    /* renamed from: j1 */
    public boolean f124794j1 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46318f(View view, int i) {
        super(view, i);
        C87412m.m108594g(view, "itemView");
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgImage chatroomMsgImage;
        float f;
        int i;
        ChatroomMsgPack chatroomMsgPack2 = chatroomMsgPack;
        if (chatroomMsgPack2 != null && (msgContent = chatroomMsgPack2.msg_content) != null && (chatroomMsgImage = msgContent.chatroom_image) != null) {
            this.f124792h1 = chatroomMsgImage;
            int i2 = chatroomMsgImage.thumb_width;
            int i3 = chatroomMsgImage.thumb_height;
            String str = chatroomMsgImage.url;
            String str2 = chatroomMsgImage.aeskey;
            String str3 = chatroomMsgImage.md5;
            C45487c cVar = this.f124791g1;
            if (cVar != null) {
                ImageView imageView = cVar.f123124a;
                C87412m.m108593f(imageView, "binding.chatroomContentIv");
                C45487c cVar2 = this.f124791g1;
                if (cVar2 != null) {
                    LinearLayout linearLayout = cVar2.f123125b;
                    if (!Util.isNullOrNil(str)) {
                        imageView.setBackgroundResource(C0966R.C0969drawable.f4730l9);
                        imageView.setImageDrawable((Drawable) null);
                        float g = C76577a.m92156g(this.f124838D);
                        int i4 = 120;
                        int i5 = 75;
                        if (i2 >= 160 || i3 >= 160) {
                            float f2 = 160.0f / (i3 > i2 ? (float) i3 : (float) i2);
                            int i6 = (int) (((float) i2) * f2);
                            int i7 = (int) (((float) i3) * f2);
                            if (i6 > 0) {
                                i4 = i6;
                            }
                            i = (int) (((float) i4) * g);
                            if (i7 > 0) {
                                i5 = i7;
                            }
                            f = ((float) i5) * g;
                        } else {
                            if (i2 <= 0) {
                                i2 = 120;
                            }
                            i = (int) (((float) i2) * g * 1.25f);
                            if (i3 <= 0) {
                                i3 = 75;
                            }
                            f = ((float) i3) * g * 1.25f;
                        }
                        int i8 = (int) f;
                        float f3 = ((float) 60) * g;
                        if (((float) i) < f3) {
                            Log.m105919d("MicroMsg.GameChatItemImgVH", "pic to small width is %d ", Integer.valueOf(i));
                            i = (int) f3;
                        }
                        if (((float) i8) < f3) {
                            Log.m105919d("MicroMsg.GameChatItemImgVH", "pic to small height is %d ", Integer.valueOf(i8));
                            i8 = (int) f3;
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i8);
                        imageView.setLayoutParams(layoutParams);
                        if (linearLayout != null) {
                            linearLayout.setLayoutParams(layoutParams);
                        }
                        String n = C53601h.m60135n(str, true);
                        if (Util.isNullOrNil(n) || !C86013q1.m106450k(n)) {
                            C46787a.m52077a(true, str, str2, str3, new C46315e(this, linearLayout, imageView));
                            if (this.f124794j1 && linearLayout != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                LinearLayout linearLayout2 = linearLayout;
                                C117292a.m165358d(linearLayout2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                linearLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(linearLayout2, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            return;
                        }
                        if (linearLayout != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            LinearLayout linearLayout3 = linearLayout;
                            C117292a.m165358d(linearLayout3, aVar2.mo10232b(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            linearLayout.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(linearLayout3, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C87412m.m108593f(n, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                        mo71719Q(imageView, n);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("binding");
                throw null;
            }
            C87412m.m108603p("binding");
            throw null;
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.cp9, (ViewGroup) null, false);
        int i = C0966R.C0970id.f357649mb0;
        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.f357649mb0);
        if (imageView != null) {
            i = C0966R.C0970id.f359466l14;
            ProgressBar progressBar = (ProgressBar) C10462b.m10395a(inflate, C0966R.C0970id.f359466l14);
            if (progressBar != null) {
                i = C0966R.C0970id.l15;
                TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.l15);
                if (textView != null) {
                    i = C0966R.C0970id.l16;
                    LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.l16);
                    if (linearLayout != null) {
                        FrameLayout frameLayout = (FrameLayout) inflate;
                        this.f124791g1 = new C45487c(frameLayout, imageView, progressBar, textView, linearLayout);
                        C87412m.m108593f(frameLayout, "binding!!.root");
                        return frameLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: K */
    public void mo71707K(View view) {
        ChatroomMsgImage chatroomMsgImage = this.f124792h1;
        if (chatroomMsgImage != null) {
            Context context = this.f124838D;
            Intent intent = new Intent();
            intent.putExtra("img_aeskey", chatroomMsgImage.aeskey);
            intent.putExtra("img_url", chatroomMsgImage.url);
            intent.putExtra("img_md5", chatroomMsgImage.md5);
            intent.putExtra("img_thumb", this.f124793i1);
            C13598b0 b0Var = C13598b0.f38549a;
            C88144b.m109791i(context, "game", ".chatroom.ui.GameImagePreviewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: Q */
    public final void mo71719Q(ImageView imageView, String str) {
        this.f124793i1 = str;
        Bitmap b = C53601h.f150629a.mo139556b(str);
        if (b == null) {
            Log.m105918d("MicroMsg.GameChatItemImgVH", "load bitmap from file. filePath:" + str);
            b = MMBitmapFactory.m98734c(str);
        } else {
            Log.m105918d("MicroMsg.GameChatItemImgVH", "load bitmap from memory");
        }
        if (b != null && !b.isRecycled()) {
            C53601h.f150629a.put(str, b);
            imageView.setBackgroundDrawable((Drawable) null);
            ((C98201k) C86312j.m106911c(C98201k.class)).pp0(b, imageView);
            boolean z = true;
            boolean z2 = ((double) b.getWidth()) >= ((double) b.getHeight()) * 2.5d;
            if (((double) b.getHeight()) < ((double) b.getWidth()) * 2.5d) {
                z = false;
            }
            if (z2 || z) {
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }
        }
    }
}
