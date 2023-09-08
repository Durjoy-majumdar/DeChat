package ah3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import p813fl.C97937v0;
import pe3.C47465a;
import sx3.C36907w;
import te3.C50572no3;
import te3.C52147yo3;
import u61.C101964h;
import wg3.C102443b;
import z51.C39315g;
import zg3.C103031b;
import zt3.C119157j;

/* renamed from: ah3.d */
public final class C92005d implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C92003c f263397d;

    /* renamed from: e */
    public final /* synthetic */ SimilarEmojiQueryModel f263398e;

    /* renamed from: ah3.d$a */
    public static final class C92006a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92003c f263399d;

        /* renamed from: e */
        public final /* synthetic */ List<C50572no3> f263400e;

        /* renamed from: f */
        public final /* synthetic */ SimilarEmojiQueryModel f263401f;

        public C92006a(C92003c cVar, List<? extends C50572no3> list, SimilarEmojiQueryModel similarEmojiQueryModel) {
            this.f263399d = cVar;
            this.f263400e = list;
            this.f263401f = similarEmojiQueryModel;
        }

        public final void run() {
            this.f263399d.f263392f.mo125853t3(this.f263400e);
            if (this.f263401f.mo135501a()) {
                EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(this.f263401f.f283911e);
                C92001a aVar = this.f263399d.f263392f;
                C87412m.m108593f(G, "head");
                aVar.mo125854u2(G);
            } else {
                C92001a aVar2 = this.f263399d.f263392f;
                aVar2.getClass();
                aVar2.mo125855y(new EmojiInfo());
            }
            this.f263399d.f263392f.f263381g = !this.f263400e.isEmpty();
            if (this.f263400e.isEmpty()) {
                this.f263399d.f263392f.mo125852j3();
            }
            C92003c cVar = this.f263399d;
            if (cVar.f263394h) {
                C92001a aVar3 = cVar.f263392f;
                new EmojiInfo();
                aVar3.getClass();
                aVar3.mo138123F4(aVar3.getItemCount(), new C97937v0(101));
            }
            this.f263399d.f263392f.notifyDataSetChanged();
            ArrayList arrayList = new ArrayList();
            List<C50572no3> list = this.f263400e;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
            for (C50572no3 no32 : list) {
                EmojiInfo emojiInfo = new EmojiInfo();
                C101964h.m134219a(no32.f138703d, emojiInfo);
                int i = no32.f138705f;
                int i2 = i & 1;
                if (i2 == 0) {
                    emojiInfo.f284128T1 = 1;
                }
                if (i2 == 0 && (i & 16) == 0) {
                    emojiInfo.f284127S1 = 1;
                }
                emojiInfo.field_catalog = 65;
                emojiInfo.field_groupId = no32.f138703d.f298592j;
                arrayList2.add(emojiInfo);
            }
            int i3 = 8;
            if (arrayList2.size() < 8) {
                i3 = arrayList2.size();
            }
            arrayList.addAll(arrayList2.subList(0, i3));
            ((C119157j) C119157j.f356862d).mo183875f(new C103031b((long) i3, arrayList));
        }
    }

    public C92005d(C92003c cVar, SimilarEmojiQueryModel similarEmojiQueryModel) {
        this.f263397d = cVar;
        this.f263398e = similarEmojiQueryModel;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if ((yVar instanceof C102443b) && i == 0 && i2 == 0) {
            C47465a aVar = ((C102443b) yVar).f301692d.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RecommendPanelEmojiResponse");
            LinkedList<C50572no3> linkedList = ((C52147yo3) aVar).f145438d;
            C87412m.m108593f(linkedList, "rr.responseProtoBuf as R…PanelEmojiResponse).Emoji");
            Log.m105924i("MicroMsg.SimilarEmoji", "get response success: " + linkedList.size());
            MMHandlerThread.postToMainThread(new C92006a(this.f263397d, linkedList, this.f263398e));
            return;
        }
        Log.m105921e("MicroMsg.SimilarEmoji", "get response fail. errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f263397d.f263392f.mo125853t3(new ArrayList());
        if (this.f263398e.mo135501a()) {
            EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(this.f263398e.f283911e);
            C92001a aVar2 = this.f263397d.f263392f;
            C87412m.m108593f(G, "head");
            aVar2.mo125854u2(G);
        } else {
            C92001a aVar3 = this.f263397d.f263392f;
            aVar3.getClass();
            aVar3.mo125855y(new EmojiInfo());
        }
        this.f263397d.f263392f.mo125852j3();
        C92003c cVar = this.f263397d;
        if (cVar.f263394h) {
            C92001a aVar4 = cVar.f263392f;
            new EmojiInfo();
            aVar4.getClass();
            aVar4.mo138123F4(aVar4.getItemCount(), new C97937v0(101));
        }
        this.f263397d.f263392f.notifyDataSetChanged();
    }
}
