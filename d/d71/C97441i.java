package d71;

import b71.C92190b;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiVideoPlayTextureView;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d71.i */
public final class C97441i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C97434g f286018d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97441i(C97434g gVar) {
        super(0);
        this.f286018d = gVar;
    }

    public Object invoke() {
        C97434g gVar = this.f286018d;
        if (gVar.f285995h && gVar.f285996i) {
            EmojiVideoPlayTextureView videoPlayView = gVar.f285989b.getVideoPlayView();
            if (videoPlayView != null) {
                videoPlayView.setRemoveBackground(this.f286018d.f285998k);
            }
            EmojiVideoPlayTextureView videoPlayView2 = this.f286018d.f285989b.getVideoPlayView();
            if (videoPlayView2 != null) {
                videoPlayView2.setSticker(this.f286018d.f286001n.f263865e);
            }
            this.f286018d.f285989b.mo128092a();
            this.f286018d.f285990c.mo127987b();
            C97434g gVar2 = this.f286018d;
            C97434g.m125460g(gVar2, gVar2.f285993f, gVar2.f285994g, true);
            C97434g gVar3 = this.f286018d;
            C92190b bVar = gVar3.f286001n;
            EmojiInfo emojiInfo = bVar.f263869i;
            if (emojiInfo != null) {
                gVar3.mo136698c(emojiInfo, bVar.f263870j);
            }
            C97434g gVar4 = this.f286018d;
            gVar4.f285996i = false;
            gVar4.f285995h = false;
        }
        return C13598b0.f38549a;
    }
}
